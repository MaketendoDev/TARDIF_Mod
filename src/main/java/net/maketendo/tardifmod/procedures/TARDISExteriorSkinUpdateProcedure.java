package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.init.TardifModModBlocks;
import net.maketendo.tardifmod.TardifModMod;

public class TARDISExteriorSkinUpdateProcedure {
	public static void execute(LevelAccessor world) {
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
			} else {
				if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Public Bin")) {
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
										}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 5)), Direction.NORTH)), 3);
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
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 5)), Direction.EAST)), 3);
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
												}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 5)), Direction.SOUTH)), 3);
									} else {
										if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
											world.setBlock(
													BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
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
													}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 5)), Direction.WEST)), 3);
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
										}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 6)), Direction.NORTH)), 3);
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
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 6)), Direction.EAST)), 3);
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
												}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 6)), Direction.SOUTH)), 3);
									} else {
										if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
											world.setBlock(
													BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
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
													}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 6)), Direction.WEST)), 3);
										}
									}
								}
							}
						}
					});
				} else {
					if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Police Box")) {
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
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 7)), Direction.NORTH)), 3);
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
												}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 7)), Direction.EAST)), 3);
									} else {
										if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
											world.setBlock(
													BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
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
													}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 7)), Direction.SOUTH)), 3);
										} else {
											if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
												world.setBlock(
														BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
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
														}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 7)), Direction.WEST)), 3);
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
											}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 8)), Direction.NORTH)), 3);
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
												}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 8)), Direction.EAST)), 3);
									} else {
										if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
											world.setBlock(
													BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
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
													}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 8)), Direction.SOUTH)), 3);
										} else {
											if ((TardifModModVariables.MapVariables.get(world).Facing).equals("West")) {
												world.setBlock(
														BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
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
														}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 8)), Direction.WEST)), 3);
											}
										}
									}
								}
							}
						});
					}
				}
			}
		}
	}
}
