package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.init.TardifModModBlocks;
import net.maketendo.tardifmod.TardifModMod;

import java.util.List;
import java.util.Comparator;

public class TARDISExteriorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Phonebox")) {
			TardifModMod.queueServerWork(1, () -> {
				if (TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
					if ((TardifModModVariables.MapVariables.get(world).Facing).equals("North")) {
						world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with((new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 3)), Direction.NORTH)), 3);
					} else {
						if ((TardifModModVariables.MapVariables.get(world).Facing).equals("East")) {
							world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
									(new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((new Object() {
										public BlockState with(BlockState _bs, String _property, int _newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
											return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
										}
									}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 3)), Direction.EAST)), 3);
						} else {
							if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
								world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
										(new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with((new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 3)), Direction.SOUTH)), 3);
							} else {
								if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
									world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
											(new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with((new Object() {
												public BlockState with(BlockState _bs, String _property, int _newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
													return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
												}
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 3)), Direction.WEST)), 3);
								}
							}
						}
					}
				} else {
					if ((TardifModModVariables.MapVariables.get(world).Facing).equals("North")) {
						world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with((new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 4)), Direction.NORTH)), 3);
					} else {
						if ((TardifModModVariables.MapVariables.get(world).Facing).equals("East")) {
							world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
									(new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((new Object() {
										public BlockState with(BlockState _bs, String _property, int _newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
											return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
										}
									}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 4)), Direction.EAST)), 3);
						} else {
							if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
								world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
										(new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with((new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 4)), Direction.SOUTH)), 3);
							} else {
								if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
									world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
											(new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with((new Object() {
												public BlockState with(BlockState _bs, String _property, int _newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
													return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
												}
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 4)), Direction.WEST)), 3);
								}
							}
						}
					}
				}
			});
		} else {
			if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Default Capsule")) {
				TardifModMod.queueServerWork(1, () -> {
					if (TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
						if ((TardifModModVariables.MapVariables.get(world).Facing).equals("North")) {
							world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
									(new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((new Object() {
										public BlockState with(BlockState _bs, String _property, int _newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
											return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
										}
									}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 1)), Direction.NORTH)), 3);
						} else {
							if ((TardifModModVariables.MapVariables.get(world).Facing).equals("East")) {
								world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
										(new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with((new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 1)), Direction.EAST)), 3);
							} else {
								if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
									world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
											(new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with((new Object() {
												public BlockState with(BlockState _bs, String _property, int _newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
													return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
												}
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 1)), Direction.SOUTH)), 3);
								} else {
									if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
										world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
												(new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with((new Object() {
													public BlockState with(BlockState _bs, String _property, int _newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
														return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
													}
												}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 1)), Direction.WEST)), 3);
									}
								}
							}
						}
					} else {
						if ((TardifModModVariables.MapVariables.get(world).Facing).equals("North")) {
							world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
									(new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((new Object() {
										public BlockState with(BlockState _bs, String _property, int _newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
											return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
										}
									}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 2)), Direction.NORTH)), 3);
						} else {
							if ((TardifModModVariables.MapVariables.get(world).Facing).equals("East")) {
								world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
										(new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with((new Object() {
											public BlockState with(BlockState _bs, String _property, int _newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
												return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
											}
										}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 2)), Direction.EAST)), 3);
							} else {
								if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
									world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
											(new Object() {
												public BlockState with(BlockState _bs, Direction newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
													if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
														return _bs.setValue(_dp, newValue);
													_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
													return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
												}
											}.with((new Object() {
												public BlockState with(BlockState _bs, String _property, int _newValue) {
													Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
													return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
												}
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 2)), Direction.SOUTH)), 3);
								} else {
									if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
										world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
												(new Object() {
													public BlockState with(BlockState _bs, Direction newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
														if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
															return _bs.setValue(_dp, newValue);
														_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
														return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
													}
												}.with((new Object() {
													public BlockState with(BlockState _bs, String _property, int _newValue) {
														Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
														return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
													}
												}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 2)), Direction.WEST)), 3);
									}
								}
							}
						}
					}
				});
			}
		}
		if (TardifModModVariables.MapVariables.get(world).DoorOpen == true) {
			{
				final Vec3 _center = new Vec3(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
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
							Entity _ent = entityiterator;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/stopsound @a");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/effect give @s minecraft:blindness 2 20 true");
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
