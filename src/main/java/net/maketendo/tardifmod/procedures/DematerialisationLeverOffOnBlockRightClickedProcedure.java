package net.maketendo.tardifmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class DematerialisationLeverOffOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (TardifModModVariables.MapVariables.get(world).DoorOpen == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:denied_tardis_takeoff")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:denied_tardis_takeoff")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (TardifModModVariables.MapVariables.get(world).Dematerialised == true) {
					if (new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(TardifModModVariables.MapVariables.get(world).X) == 0 && new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(TardifModModVariables.MapVariables.get(world).Y) == 0 && new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(TardifModModVariables.MapVariables.get(world).Z) == 0) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74Coordinates are Invalid..."), false);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:time_throttle")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:time_throttle")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:cloister_bell")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:cloister_bell")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:time_throttle")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:time_throttle")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:landing")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:landing")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
						TardifModModVariables.MapVariables.get(world).TardisInVortex = false;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7aTARDIS is rematerialising..."), true);
						TardifModModVariables.MapVariables.get(world).Dematerialised = false;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("execute in " + TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension + " run setblock "
												+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).X_TARDIS) + " ")
												+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1) + " ")
												+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Z_TARDIS) + " tardif_mod:tardis_exterior")));
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("execute in " + TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension + " run setblock "
												+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).X_TARDIS) + " ")
												+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Y_TARDIS) + " ")
												+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Z_TARDIS) + " tardif_mod:tardis_bottom_exterior_piece replace")));
							}
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:time_throttle")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:time_throttle")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:take_off")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:take_off")), SoundSource.AMBIENT, 1, 1, false);
						}
					}
					TardifModModVariables.MapVariables.get(world).Dematerialised = true;
					TardifModModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7aTARDIS is dematerialising..."), true);
					TardifModModVariables.MapVariables.get(world).TardisInVortex = true;
					TardifModModVariables.MapVariables.get(world).syncData(world);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level().getServer(), _ent),
									("execute in " + TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension + " run fill " + (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).X_TARDIS) + " ")
											+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1) + " ")
											+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Z_TARDIS) + " ")
											+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).X_TARDIS) + " ")
											+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Y_TARDIS) + " ")
											+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Z_TARDIS) + " air replace")));
						}
					}
				}
			}
		}
	}
}
