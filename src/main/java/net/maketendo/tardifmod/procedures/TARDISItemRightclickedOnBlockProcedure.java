package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.init.TardifModModBlocks;
import net.maketendo.tardifmod.TardifModMod;

public class TARDISItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean placed = false;
		String portalWorld = "";
		double portalX = 0;
		double portalY = 0;
		double portalZ = 0;
		if (TardifModModVariables.MapVariables.get(world).ExteriorSurplus == false) {
			world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
				public BlockState with(BlockState _bs, String _property, int _newValue) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
					return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
				}
			}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 1)), 3);
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y + 2, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			TardifModMod.LOGGER.info("TARDIS built");
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "forceload add ~4 ~4 ~-4 ~-4");
				}
			}
			TardifModModVariables.MapVariables.get(world).ExteriorSurplus = true;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Locked = false;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).DoorOpen = false;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = ("" + (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)))
					.replace("ResourceKey[minecraft:dimension / ", "");
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension.replace("]", "");
			TardifModModVariables.MapVariables.get(world).syncData(world);
			if ((entity.level().dimension()) == Level.OVERWORLD) {
				TardifModModVariables.MapVariables.get(world).TargetDimension = "Overworld";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else {
				if ((entity.level().dimension()) == Level.NETHER) {
					TardifModModVariables.MapVariables.get(world).TargetDimension = "Nether";
					TardifModModVariables.MapVariables.get(world).syncData(world);
				} else {
					if ((entity.level().dimension()) == Level.END) {
						TardifModModVariables.MapVariables.get(world).TargetDimension = "End";
						TardifModModVariables.MapVariables.get(world).syncData(world);
					} else {
						if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:skaro"))) {
							TardifModModVariables.MapVariables.get(world).TargetDimension = "Skaro";
							TardifModModVariables.MapVariables.get(world).syncData(world);
						} else {
							if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:classic_nether"))) {
								TardifModModVariables.MapVariables.get(world).TargetDimension = "Classic Nether";
								TardifModModVariables.MapVariables.get(world).syncData(world);
							} else {
								if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:classic_overworld"))) {
									TardifModModVariables.MapVariables.get(world).TargetDimension = "Classic Overworld";
									TardifModModVariables.MapVariables.get(world).syncData(world);
								} else {
									if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:space"))) {
										TardifModModVariables.MapVariables.get(world).TargetDimension = "Space";
										TardifModModVariables.MapVariables.get(world).syncData(world);
									}
								}
							}
						}
					}
				}
			}
			TardifModModVariables.MapVariables.get(world).Exterior = "Default Capsule";
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).X = new java.text.DecimalFormat("##.##").format(entity.getX());
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Y = new java.text.DecimalFormat("##.##").format(entity.getY());
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Z = new java.text.DecimalFormat("##.##").format(entity.getZ());
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Facing = "North";
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).X_TARDIS = x;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Y_TARDIS = y + 1;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Z_TARDIS = z;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			if (TardifModModVariables.MapVariables.get(world).InteriorLoad == false) {
				TardifModModVariables.MapVariables.get(world).DoorPosX = 9;
				TardifModModVariables.MapVariables.get(world).syncData(world);
				TardifModModVariables.MapVariables.get(world).DoorPosY = 13;
				TardifModModVariables.MapVariables.get(world).syncData(world);
				TardifModModVariables.MapVariables.get(world).DoorPosZ = 15;
				TardifModModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74Only one TARDIS is available..."), false);
			TardifModMod.LOGGER.error("TARDIS failed to build...");
		}
	}
}
