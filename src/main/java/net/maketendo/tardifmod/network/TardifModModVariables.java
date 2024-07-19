package net.maketendo.tardifmod.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.maketendo.tardifmod.TardifModMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TardifModModVariables {
	public static boolean BetaTesting = true;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		TardifModMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		TardifModMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.PlayerBeenInTARDISBefore = original.PlayerBeenInTARDISBefore;
			clone.PlayerMerchantRep = original.PlayerMerchantRep;
			if (!event.isWasDeath()) {
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					TardifModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					TardifModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					TardifModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "tardif_mod_worldvars";
		public double TARDISLightLevel = 0;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			TARDISLightLevel = nbt.getDouble("TARDISLightLevel");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("TARDISLightLevel", TARDISLightLevel);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				TardifModMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "tardif_mod_mapvars";
		public String Exterior = "\"\"";
		public boolean Dematerialised = false;
		public boolean Locked = false;
		public boolean InteriorLoad = false;
		public String X = "\"\"";
		public String Y = "\"\"";
		public String Z = "\"\"";
		public boolean ExteriorSurplus = false;
		public String TargetDimension = "\"\"";
		public double DoorPosX = 0;
		public double DoorPosY = 0;
		public double DoorPosZ = 0;
		public String Desktop = "\"\"";
		public String PreviousDimension = "\"\"";
		public String ConsoleSkin = "Copper";
		public boolean FlightMode = false;
		public String TARDISUser = "";
		public double ExtNum = 0;
		public double PreviousX = 0;
		public double PreviousY = 0;
		public double PreviousZ = 0;
		public double TimeMode = 0;
		public boolean DoorOpen = false;
		public double X_TARDIS = 0;
		public double Y_TARDIS = 0;
		public double Z_TARDIS = 0;
		public String Facing = "\"\"";
		public boolean SonicInsertedInTardis = false;
		public boolean TardisInVortex = false;
		public double FacingRotator = 0;
		public boolean TardisCrashed = false;
		public boolean handbreakon = false;
		public boolean SonicInsertedInConsole = false;
		public double ChamelionRotation = 0;
		public double TardisPower = 0;
		public double TardisHealth = 0;
		public double TardisMood = 0;
		public boolean LoadedLoneIsland = false;
		public String TARDIS_Current_Dimension = "\"\"";

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			Exterior = nbt.getString("Exterior");
			Dematerialised = nbt.getBoolean("Dematerialised");
			Locked = nbt.getBoolean("Locked");
			InteriorLoad = nbt.getBoolean("InteriorLoad");
			X = nbt.getString("X");
			Y = nbt.getString("Y");
			Z = nbt.getString("Z");
			ExteriorSurplus = nbt.getBoolean("ExteriorSurplus");
			TargetDimension = nbt.getString("TargetDimension");
			DoorPosX = nbt.getDouble("DoorPosX");
			DoorPosY = nbt.getDouble("DoorPosY");
			DoorPosZ = nbt.getDouble("DoorPosZ");
			Desktop = nbt.getString("Desktop");
			PreviousDimension = nbt.getString("PreviousDimension");
			ConsoleSkin = nbt.getString("ConsoleSkin");
			FlightMode = nbt.getBoolean("FlightMode");
			TARDISUser = nbt.getString("TARDISUser");
			ExtNum = nbt.getDouble("ExtNum");
			PreviousX = nbt.getDouble("PreviousX");
			PreviousY = nbt.getDouble("PreviousY");
			PreviousZ = nbt.getDouble("PreviousZ");
			TimeMode = nbt.getDouble("TimeMode");
			DoorOpen = nbt.getBoolean("DoorOpen");
			X_TARDIS = nbt.getDouble("X_TARDIS");
			Y_TARDIS = nbt.getDouble("Y_TARDIS");
			Z_TARDIS = nbt.getDouble("Z_TARDIS");
			Facing = nbt.getString("Facing");
			SonicInsertedInTardis = nbt.getBoolean("SonicInsertedInTardis");
			TardisInVortex = nbt.getBoolean("TardisInVortex");
			FacingRotator = nbt.getDouble("FacingRotator");
			TardisCrashed = nbt.getBoolean("TardisCrashed");
			handbreakon = nbt.getBoolean("handbreakon");
			SonicInsertedInConsole = nbt.getBoolean("SonicInsertedInConsole");
			ChamelionRotation = nbt.getDouble("ChamelionRotation");
			TardisPower = nbt.getDouble("TardisPower");
			TardisHealth = nbt.getDouble("TardisHealth");
			TardisMood = nbt.getDouble("TardisMood");
			LoadedLoneIsland = nbt.getBoolean("LoadedLoneIsland");
			TARDIS_Current_Dimension = nbt.getString("TARDIS_Current_Dimension");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("Exterior", Exterior);
			nbt.putBoolean("Dematerialised", Dematerialised);
			nbt.putBoolean("Locked", Locked);
			nbt.putBoolean("InteriorLoad", InteriorLoad);
			nbt.putString("X", X);
			nbt.putString("Y", Y);
			nbt.putString("Z", Z);
			nbt.putBoolean("ExteriorSurplus", ExteriorSurplus);
			nbt.putString("TargetDimension", TargetDimension);
			nbt.putDouble("DoorPosX", DoorPosX);
			nbt.putDouble("DoorPosY", DoorPosY);
			nbt.putDouble("DoorPosZ", DoorPosZ);
			nbt.putString("Desktop", Desktop);
			nbt.putString("PreviousDimension", PreviousDimension);
			nbt.putString("ConsoleSkin", ConsoleSkin);
			nbt.putBoolean("FlightMode", FlightMode);
			nbt.putString("TARDISUser", TARDISUser);
			nbt.putDouble("ExtNum", ExtNum);
			nbt.putDouble("PreviousX", PreviousX);
			nbt.putDouble("PreviousY", PreviousY);
			nbt.putDouble("PreviousZ", PreviousZ);
			nbt.putDouble("TimeMode", TimeMode);
			nbt.putBoolean("DoorOpen", DoorOpen);
			nbt.putDouble("X_TARDIS", X_TARDIS);
			nbt.putDouble("Y_TARDIS", Y_TARDIS);
			nbt.putDouble("Z_TARDIS", Z_TARDIS);
			nbt.putString("Facing", Facing);
			nbt.putBoolean("SonicInsertedInTardis", SonicInsertedInTardis);
			nbt.putBoolean("TardisInVortex", TardisInVortex);
			nbt.putDouble("FacingRotator", FacingRotator);
			nbt.putBoolean("TardisCrashed", TardisCrashed);
			nbt.putBoolean("handbreakon", handbreakon);
			nbt.putBoolean("SonicInsertedInConsole", SonicInsertedInConsole);
			nbt.putDouble("ChamelionRotation", ChamelionRotation);
			nbt.putDouble("TardisPower", TardisPower);
			nbt.putDouble("TardisHealth", TardisHealth);
			nbt.putDouble("TardisMood", TardisMood);
			nbt.putBoolean("LoadedLoneIsland", LoadedLoneIsland);
			nbt.putString("TARDIS_Current_Dimension", TARDIS_Current_Dimension);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				TardifModMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("tardif_mod", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean PlayerBeenInTARDISBefore = false;
		public double PlayerMerchantRep = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				TardifModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("PlayerBeenInTARDISBefore", PlayerBeenInTARDISBefore);
			nbt.putDouble("PlayerMerchantRep", PlayerMerchantRep);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			PlayerBeenInTARDISBefore = nbt.getBoolean("PlayerBeenInTARDISBefore");
			PlayerMerchantRep = nbt.getDouble("PlayerMerchantRep");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.PlayerBeenInTARDISBefore = message.data.PlayerBeenInTARDISBefore;
					variables.PlayerMerchantRep = message.data.PlayerMerchantRep;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
