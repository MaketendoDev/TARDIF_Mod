package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class ScrewdriverRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:sonic_screwdriver")), SoundSource.MASTER, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:sonic_screwdriver")), SoundSource.MASTER, 1, 1, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ICE) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			} else {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.TINTED_GLASS.defaultBlockState(), 3);
				} else {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS_PANE) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TINTED_GLASS) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.GLASS.defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.PUMPKIN) {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockState _bs = Blocks.CARVED_PUMPKIN.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
							} else {
								if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CARVED_PUMPKIN) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.JACK_O_LANTERN.defaultBlockState(), 3);
								} else {
									if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_LAMP) {
										world.setBlock(BlockPos.containing(x, y, z), Blocks.REDSTONE_LAMP.defaultBlockState(), 3);
									} else {
										if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REDSTONE_LAMP) {
											world.setBlock(BlockPos.containing(x, y, z), Blocks.REDSTONE_LAMP.defaultBlockState(), 3);
										} else {
											if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JACK_O_LANTERN) {
												world.setBlock(BlockPos.containing(x, y, z), Blocks.CARVED_PUMPKIN.defaultBlockState(), 3);
											} else {
												if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.IRON_DOOR) {
													if ((new Object() {
														public Direction getDirection(BlockPos pos) {
															BlockState _bs = world.getBlockState(pos);
															Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (property != null && _bs.getValue(property) instanceof Direction _dir)
																return _dir;
															else if (_bs.hasProperty(BlockStateProperties.AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
															else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
															return Direction.NORTH;
														}
													}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
														{
															Direction _dir = Direction.EAST;
															BlockPos _pos = BlockPos.containing(x, y, z);
															BlockState _bs = world.getBlockState(_pos);
															Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
																world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
															} else {
																_property = _bs.getBlock().getStateDefinition().getProperty("axis");
																if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
																	world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
															}
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.BLOCKS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.BLOCKS, 1, 1, false);
															}
														}
													} else if ((new Object() {
														public Direction getDirection(BlockPos pos) {
															BlockState _bs = world.getBlockState(pos);
															Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (property != null && _bs.getValue(property) instanceof Direction _dir)
																return _dir;
															else if (_bs.hasProperty(BlockStateProperties.AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
															else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
															return Direction.NORTH;
														}
													}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
														{
															Direction _dir = Direction.NORTH;
															BlockPos _pos = BlockPos.containing(x, y, z);
															BlockState _bs = world.getBlockState(_pos);
															Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
																world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
															} else {
																_property = _bs.getBlock().getStateDefinition().getProperty("axis");
																if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
																	world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
															}
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")), SoundSource.BLOCKS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")), SoundSource.BLOCKS, 1, 1, false);
															}
														}
													} else if ((new Object() {
														public Direction getDirection(BlockPos pos) {
															BlockState _bs = world.getBlockState(pos);
															Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (property != null && _bs.getValue(property) instanceof Direction _dir)
																return _dir;
															else if (_bs.hasProperty(BlockStateProperties.AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
															else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
															return Direction.NORTH;
														}
													}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
														{
															Direction _dir = Direction.WEST;
															BlockPos _pos = BlockPos.containing(x, y, z);
															BlockState _bs = world.getBlockState(_pos);
															Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
																world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
															} else {
																_property = _bs.getBlock().getStateDefinition().getProperty("axis");
																if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
																	world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
															}
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.BLOCKS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.BLOCKS, 1, 1, false);
															}
														}
													} else if ((new Object() {
														public Direction getDirection(BlockPos pos) {
															BlockState _bs = world.getBlockState(pos);
															Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (property != null && _bs.getValue(property) instanceof Direction _dir)
																return _dir;
															else if (_bs.hasProperty(BlockStateProperties.AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
															else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
																return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
															return Direction.NORTH;
														}
													}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
														{
															Direction _dir = Direction.SOUTH;
															BlockPos _pos = BlockPos.containing(x, y, z);
															BlockState _bs = world.getBlockState(_pos);
															Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
															if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
																world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
															} else {
																_property = _bs.getBlock().getStateDefinition().getProperty("axis");
																if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
																	world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
															}
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")), SoundSource.BLOCKS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")), SoundSource.BLOCKS, 1, 1, false);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
