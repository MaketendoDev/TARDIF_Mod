package net.maketendo.tardifmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;

import java.util.List;
import java.util.Comparator;

public class TARDISExteriorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		TARDISExteriorSkinUpdateProcedure.execute(world);
		TardifModModVariables.MapVariables.get(world).X_TARDIS = x;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).Y_TARDIS = y - 1;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).Z_TARDIS = z;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if (TardifModModVariables.MapVariables.get(world).DoorOpen == true) {
			{
				final Vec3 _center = new Vec3(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.001 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						if (entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:tardis_dim"));
							if (_player.level().dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance _effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(TardifModModVariables.MapVariables.get(world).DoorPosX, TardifModModVariables.MapVariables.get(world).DoorPosY, TardifModModVariables.MapVariables.get(world).DoorPosZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).DoorPosX, TardifModModVariables.MapVariables.get(world).DoorPosY, TardifModModVariables.MapVariables.get(world).DoorPosZ, _ent.getYRot(),
										_ent.getXRot());
						}
						{
							Entity _ent = entityiterator;
							_ent.setYRot(-90);
							_ent.setXRot(0);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/stopsound @a");
							}
						}
						entityiterator.getPersistentData().putBoolean("insideTARDIS", true);
						TardifModModVariables.MapVariables.get(world).DoorOpen = false;
						TardifModModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}
