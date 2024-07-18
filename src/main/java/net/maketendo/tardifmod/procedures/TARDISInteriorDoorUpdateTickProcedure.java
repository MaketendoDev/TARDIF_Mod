package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.TardifModMod;

public class TARDISInteriorDoorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TardifModModVariables.MapVariables.get(world).DoorOpen == true) {
			if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Overworld")) {
				{
					Entity _ent = entity;
					_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS, _ent.getYRot(),
								_ent.getXRot());
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/execute in overworld run tp @s ~ ~ ~");
					}
				}
			} else {
				if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Nether")) {
					{
						Entity _ent = entity;
						_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS, _ent.getYRot(),
									_ent.getXRot());
					}
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/execute in the_nether run tp @s ~ ~ ~");
						}
					}
				} else {
					if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("End")) {
						{
							Entity _ent = entity;
							_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS, _ent.getYRot(),
										_ent.getXRot());
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/execute in the_end run tp @s ~ ~ ~");
							}
						}
					} else {
						if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Skaro")) {
							{
								Entity _ent = entity;
								_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
											_ent.getYRot(), _ent.getXRot());
							}
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/execute in tardif_mod:skaro run tp @s ~ ~ ~");
								}
							}
						} else {
							if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Classic Skaro")) {
								{
									Entity _ent = entity;
									_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
												_ent.getYRot(), _ent.getXRot());
								}
								{
									Entity _ent = entity;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/execute in the_end run tp @s ~ ~ ~");
									}
								}
							} else {
								if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("TARDIS Dimension")) {
									{
										Entity _ent = entity;
										_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
													_ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"/execute in tardif_mod:tardis_dim tp @s ~ ~ ~");
										}
									}
								} else {
									if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Classic Overworld")) {
										{
											Entity _ent = entity;
											_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
														_ent.getYRot(), _ent.getXRot());
										}
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"/execute in tardif_mod:classic_overworld tp @s ~ ~ ~");
											}
										}
									} else {
										if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Classic Nether")) {
											{
												Entity _ent = entity;
												_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS,
															TardifModModVariables.MapVariables.get(world).Z_TARDIS, _ent.getYRot(), _ent.getXRot());
											}
											{
												Entity _ent = entity;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"/execute in tardif_mod:classic_nether tp @s ~ ~ ~");
												}
											}
										} else {
											if ((TardifModModVariables.MapVariables.get(world).TargetDimension).equals("Space")) {
												{
													Entity _ent = entity;
													_ent.teleportTo(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS,
																TardifModModVariables.MapVariables.get(world).Z_TARDIS, _ent.getYRot(), _ent.getXRot());
												}
												{
													Entity _ent = entity;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"/execute in tardif_mod:space tp @s ~ ~ ~");
													}
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("\u00A74ERROR!!!!!"), false);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			TardifModModVariables.MapVariables.get(world).DoorOpen = false;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModMod.queueServerWork(1, () -> {
				if ((TardifModModVariables.MapVariables.get(world).Facing).equals("North")) {
					{
						Entity _ent = entity;
						_ent.setYRot(180);
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
						Entity _ent = entity;
						_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS - 0.5));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS - 0.5),
									_ent.getYRot(), _ent.getXRot());
					}
				} else {
					if ((TardifModModVariables.MapVariables.get(world).Facing).equals("East")) {
						{
							Entity _ent = entity;
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
							Entity _ent = entity;
							_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5),
										_ent.getYRot(), _ent.getXRot());
						}
					} else {
						if ((TardifModModVariables.MapVariables.get(world).Facing).equals("Eouth")) {
							{
								Entity _ent = entity;
								_ent.setYRot(0);
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
								Entity _ent = entity;
								_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS,
											(TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5), _ent.getYRot(), _ent.getXRot());
							}
						} else {
							{
								Entity _ent = entity;
								_ent.setYRot(90);
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
								Entity _ent = entity;
								_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS - 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS - 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS,
											(TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5), _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
				TardifModModVariables.MapVariables.get(world).DoorOpen = false;
				TardifModModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute in minecraft:overworld run forceload remove all");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute in minecraft:the_nether run forceload remove all");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute in minecraft:the_end run forceload remove all");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "forceload add ~4 ~4 ~-4 ~-4");
					}
				}
				TardifModModVariables.MapVariables.get(world).DoorOpen = false;
				TardifModModVariables.MapVariables.get(world).syncData(world);
			});
			TardifModMod.queueServerWork(10, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.open")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.open")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				TardifModMod.queueServerWork(10, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.close")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.close")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				});
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/effect give @s minecraft:blindness 2 20 true");
					}
				}
			});
		}
	}
}
