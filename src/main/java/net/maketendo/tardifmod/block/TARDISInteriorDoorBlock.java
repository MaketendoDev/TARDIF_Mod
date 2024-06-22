
package net.maketendo.tardifmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.procedures.TARDISInteriorDoorUpdateTickProcedure;
import net.maketendo.tardifmod.procedures.TARDISInteriorDoorOnTickUpdateProcedure;
import net.maketendo.tardifmod.procedures.TARDISInteriorDoorOnBlockRightClickedProcedure;
import net.maketendo.tardifmod.procedures.TARDISInteriorDoorBlockAddedProcedure;

public class TARDISInteriorDoorBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 8);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TARDISInteriorDoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2.15f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				if (s.getValue(BLOCKSTATE) == 7)
					return 0;
				if (s.getValue(BLOCKSTATE) == 8)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0.6f, 0.6f, 0.6f};
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, -16, 15, 16, 16, 16), box(13.5, 2, 16, 14.5, 4, 17), box(13.5, 2, 14, 14.5, 4, 15), box(-0.5, -16, 14.5, 1.5, 16, 16.5), box(14.5, -16, 14.5, 16.5, 16, 16.5), box(0, 18, 15, 16, 20, 16),
						box(-0.5, 16, 14.5, 16.5, 18, 16.5), box(-0.5, 20, 14.5, 16.5, 26, 16.5));
				case NORTH -> Shapes.or(box(0, -16, 0, 16, 16, 1), box(1.5, 2, -1, 2.5, 4, 0), box(1.5, 2, 1, 2.5, 4, 2), box(14.5, -16, -0.5, 16.5, 16, 1.5), box(-0.5, -16, -0.5, 1.5, 16, 1.5), box(0, 18, 0, 16, 20, 1),
						box(-0.5, 16, -0.5, 16.5, 18, 1.5), box(-0.5, 20, -0.5, 16.5, 26, 1.5));
				case EAST -> Shapes.or(box(15, -16, 0, 16, 16, 16), box(16, 2, 1.5, 17, 4, 2.5), box(14, 2, 1.5, 15, 4, 2.5), box(14.5, -16, 14.5, 16.5, 16, 16.5), box(14.5, -16, -0.5, 16.5, 16, 1.5), box(15, 18, 0, 16, 20, 16),
						box(14.5, 16, -0.5, 16.5, 18, 16.5), box(14.5, 20, -0.5, 16.5, 26, 16.5));
				case WEST -> Shapes.or(box(0, -16, 0, 1, 16, 16), box(-1, 2, 13.5, 0, 4, 14.5), box(1, 2, 13.5, 2, 4, 14.5), box(-0.5, -16, -0.5, 1.5, 16, 1.5), box(-0.5, -16, 14.5, 1.5, 16, 16.5), box(0, 18, 0, 1, 20, 16),
						box(-0.5, 16, -0.5, 1.5, 18, 16.5), box(-0.5, 20, -0.5, 1.5, 26, 16.5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 19, 15, 16, 21, 16), box(0, -15, 15, 16, 17, 16), box(-0.5, -16, 14.5, 16.5, -15, 16.5), box(-0.5, 17, 14.5, 16.5, 19, 16.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5));
				case NORTH -> Shapes.or(box(0, 19, 0, 16, 21, 1), box(0, -15, 0, 16, 17, 1), box(-0.5, -16, -0.5, 16.5, -15, 1.5), box(-0.5, 17, -0.5, 16.5, 19, 1.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5));
				case EAST -> Shapes.or(box(15, 19, 0, 16, 21, 16), box(15, -15, 0, 16, 17, 16), box(14.5, -16, -0.5, 16.5, -15, 16.5), box(14.5, 17, -0.5, 16.5, 19, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5));
				case WEST -> Shapes.or(box(0, 19, 0, 1, 21, 16), box(0, -15, 0, 1, 17, 16), box(-0.5, -16, -0.5, 1.5, -15, 16.5), box(-0.5, 17, -0.5, 1.5, 19, 16.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(1, 1, 14, 6, 7, 16), box(-2, 17, 16, 18, 22, 18), box(-1, 17, 18, 17, 22, 19), box(-2, 22, 16, 0, 24, 18), box(9, 3, 16, 10, 6, 17), box(9, 3, 15, 10, 6, 16), box(16, 22, 16, 18, 24, 18),
						box(-2, -16, 16, 0, 17, 18), box(16, -16, 16, 18, 17, 18), box(5, 3, 16, 6, 5, 17));
				case NORTH -> Shapes.or(box(10, 1, 0, 15, 7, 2), box(-2, 17, -2, 18, 22, 0), box(-1, 17, -3, 17, 22, -2), box(16, 22, -2, 18, 24, 0), box(6, 3, -1, 7, 6, 0), box(6, 3, 0, 7, 6, 1), box(-2, 22, -2, 0, 24, 0),
						box(16, -16, -2, 18, 17, 0), box(-2, -16, -2, 0, 17, 0), box(10, 3, -1, 11, 5, 0));
				case EAST -> Shapes.or(box(14, 1, 10, 16, 7, 15), box(16, 17, -2, 18, 22, 18), box(18, 17, -1, 19, 22, 17), box(16, 22, 16, 18, 24, 18), box(16, 3, 6, 17, 6, 7), box(15, 3, 6, 16, 6, 7), box(16, 22, -2, 18, 24, 0),
						box(16, -16, 16, 18, 17, 18), box(16, -16, -2, 18, 17, 0), box(16, 3, 10, 17, 5, 11));
				case WEST -> Shapes.or(box(0, 1, 1, 2, 7, 6), box(-2, 17, -2, 0, 22, 18), box(-3, 17, -1, -2, 22, 17), box(-2, 22, -2, 0, 24, 0), box(-1, 3, 9, 0, 6, 10), box(0, 3, 9, 1, 6, 10), box(-2, 22, 16, 0, 24, 18), box(-2, -16, -2, 0, 17, 0),
						box(-2, -16, 16, 0, 17, 18), box(-1, 3, 5, 0, 5, 6));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(16, -15, 14, 18, -6, 15), box(16, 2, 14, 18, 10, 15), box(16, -6, 14, 18, 2, 15), box(16, 10, 14, 18, 17, 15), box(16, -15, 8, 18, -6, 9), box(16, -6, 8, 18, 2, 9), box(16, 2, 8, 18, 10, 9),
						box(16, 10, 8, 18, 17, 9), box(16, -15, 9, 18, -14, 14), box(16, -8, 9, 18, -6, 14), box(16, 0, 9, 18, 2, 14), box(16, 8, 9, 18, 10, 14), box(16, 16, 9, 18, 17, 14), box(15, 4, 8, 16, 7, 9), box(7, -15, 14, 8, -6, 16),
						box(7, -6, 14, 8, 2, 16), box(7, 2, 14, 8, 10, 16), box(7, 10, 14, 8, 17, 16), box(1, -15, 15, 2, -6, 16), box(1, -6, 15, 2, 2, 16), box(1, 2, 15, 2, 10, 16), box(1, 10, 14, 2, 17, 16), box(2, -15, 14, 7, -14, 16),
						box(2, -8, 14, 7, -6, 16), box(2, 0, 14, 7, 2, 16), box(2, 8, 14, 7, 10, 16), box(2, 2, 11, 7, 8, 14), box(2, 8, 14, 7, 10, 16), box(2, 16, 14, 7, 17, 16), box(6, 4, 15, 7, 6, 16), box(1, -15, 14, 2, -6, 15),
						box(1, -6, 14, 2, 2, 15), box(1, 2, 14, 2, 10, 15), box(15, -15, 15, 17, 17, 17), box(-1, -15, 15, 1, 17, 17), box(-1, 17, 15, 17, 20, 17), box(-1, 20, 15, 1, 22, 17), box(15, 20, 15, 17, 22, 17));
				case NORTH -> Shapes.or(box(-2, -15, 1, 0, -6, 2), box(-2, 2, 1, 0, 10, 2), box(-2, -6, 1, 0, 2, 2), box(-2, 10, 1, 0, 17, 2), box(-2, -15, 7, 0, -6, 8), box(-2, -6, 7, 0, 2, 8), box(-2, 2, 7, 0, 10, 8), box(-2, 10, 7, 0, 17, 8),
						box(-2, -15, 2, 0, -14, 7), box(-2, -8, 2, 0, -6, 7), box(-2, 0, 2, 0, 2, 7), box(-2, 8, 2, 0, 10, 7), box(-2, 16, 2, 0, 17, 7), box(0, 4, 7, 1, 7, 8), box(8, -15, 0, 9, -6, 2), box(8, -6, 0, 9, 2, 2), box(8, 2, 0, 9, 10, 2),
						box(8, 10, 0, 9, 17, 2), box(14, -15, 0, 15, -6, 1), box(14, -6, 0, 15, 2, 1), box(14, 2, 0, 15, 10, 1), box(14, 10, 0, 15, 17, 2), box(9, -15, 0, 14, -14, 2), box(9, -8, 0, 14, -6, 2), box(9, 0, 0, 14, 2, 2),
						box(9, 8, 0, 14, 10, 2), box(9, 2, 2, 14, 8, 5), box(9, 8, 0, 14, 10, 2), box(9, 16, 0, 14, 17, 2), box(9, 4, 0, 10, 6, 1), box(14, -15, 1, 15, -6, 2), box(14, -6, 1, 15, 2, 2), box(14, 2, 1, 15, 10, 2),
						box(-1, -15, -1, 1, 17, 1), box(15, -15, -1, 17, 17, 1), box(-1, 17, -1, 17, 20, 1), box(15, 20, -1, 17, 22, 1), box(-1, 20, -1, 1, 22, 1));
				case EAST -> Shapes.or(box(14, -15, -2, 15, -6, 0), box(14, 2, -2, 15, 10, 0), box(14, -6, -2, 15, 2, 0), box(14, 10, -2, 15, 17, 0), box(8, -15, -2, 9, -6, 0), box(8, -6, -2, 9, 2, 0), box(8, 2, -2, 9, 10, 0),
						box(8, 10, -2, 9, 17, 0), box(9, -15, -2, 14, -14, 0), box(9, -8, -2, 14, -6, 0), box(9, 0, -2, 14, 2, 0), box(9, 8, -2, 14, 10, 0), box(9, 16, -2, 14, 17, 0), box(8, 4, 0, 9, 7, 1), box(14, -15, 8, 16, -6, 9),
						box(14, -6, 8, 16, 2, 9), box(14, 2, 8, 16, 10, 9), box(14, 10, 8, 16, 17, 9), box(15, -15, 14, 16, -6, 15), box(15, -6, 14, 16, 2, 15), box(15, 2, 14, 16, 10, 15), box(14, 10, 14, 16, 17, 15), box(14, -15, 9, 16, -14, 14),
						box(14, -8, 9, 16, -6, 14), box(14, 0, 9, 16, 2, 14), box(14, 8, 9, 16, 10, 14), box(11, 2, 9, 14, 8, 14), box(14, 8, 9, 16, 10, 14), box(14, 16, 9, 16, 17, 14), box(15, 4, 9, 16, 6, 10), box(14, -15, 14, 15, -6, 15),
						box(14, -6, 14, 15, 2, 15), box(14, 2, 14, 15, 10, 15), box(15, -15, -1, 17, 17, 1), box(15, -15, 15, 17, 17, 17), box(15, 17, -1, 17, 20, 17), box(15, 20, 15, 17, 22, 17), box(15, 20, -1, 17, 22, 1));
				case WEST -> Shapes.or(box(1, -15, 16, 2, -6, 18), box(1, 2, 16, 2, 10, 18), box(1, -6, 16, 2, 2, 18), box(1, 10, 16, 2, 17, 18), box(7, -15, 16, 8, -6, 18), box(7, -6, 16, 8, 2, 18), box(7, 2, 16, 8, 10, 18),
						box(7, 10, 16, 8, 17, 18), box(2, -15, 16, 7, -14, 18), box(2, -8, 16, 7, -6, 18), box(2, 0, 16, 7, 2, 18), box(2, 8, 16, 7, 10, 18), box(2, 16, 16, 7, 17, 18), box(7, 4, 15, 8, 7, 16), box(0, -15, 7, 2, -6, 8),
						box(0, -6, 7, 2, 2, 8), box(0, 2, 7, 2, 10, 8), box(0, 10, 7, 2, 17, 8), box(0, -15, 1, 1, -6, 2), box(0, -6, 1, 1, 2, 2), box(0, 2, 1, 1, 10, 2), box(0, 10, 1, 2, 17, 2), box(0, -15, 2, 2, -14, 7), box(0, -8, 2, 2, -6, 7),
						box(0, 0, 2, 2, 2, 7), box(0, 8, 2, 2, 10, 7), box(2, 2, 2, 5, 8, 7), box(0, 8, 2, 2, 10, 7), box(0, 16, 2, 2, 17, 7), box(0, 4, 6, 1, 6, 7), box(1, -15, 1, 2, -6, 2), box(1, -6, 1, 2, 2, 2), box(1, 2, 1, 2, 10, 2),
						box(-1, -15, 15, 1, 17, 17), box(-1, -15, -1, 1, 17, 1), box(-1, 17, -1, 1, 20, 17), box(-1, 20, -1, 1, 22, 1), box(-1, 20, 15, 1, 22, 17));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 1, 15, 16, 8, 16), box(0, -16, 15, 16, 1, 16));
				case NORTH -> Shapes.or(box(0, 1, 0, 16, 8, 1), box(0, -16, 0, 16, 1, 1));
				case EAST -> Shapes.or(box(15, 1, 0, 16, 8, 16), box(15, -16, 0, 16, 1, 16));
				case WEST -> Shapes.or(box(0, 1, 0, 1, 8, 16), box(0, -16, 0, 1, 1, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, -16, 15, 16, 1, 16), box(0, 1, 15, 16, 8, 16));
				case NORTH -> Shapes.or(box(0, -16, 0, 16, 1, 1), box(0, 1, 0, 16, 8, 1));
				case EAST -> Shapes.or(box(15, -16, 0, 16, 1, 16), box(15, 1, 0, 16, 8, 16));
				case WEST -> Shapes.or(box(0, -16, 0, 1, 1, 16), box(0, 1, 0, 1, 8, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> box(0, 16, 14, 16, 32, 16);
				case NORTH -> box(0, 16, 0, 16, 32, 2);
				case EAST -> box(14, 16, 0, 16, 32, 16);
				case WEST -> box(0, 16, 0, 2, 32, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> box(1, -16, 1, 16, 32, 16);
				case NORTH -> box(0, -16, 0, 15, 32, 15);
				case EAST -> box(1, -16, 0, 16, 32, 15);
				case WEST -> box(0, -16, 1, 15, 32, 16);
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0, 0, 0, 16, 16, 16);
			case NORTH -> box(0, 0, 0, 16, 16, 16);
			case EAST -> box(0, 0, 0, 16, 16, 16);
			case WEST -> box(0, 0, 0, 16, 16, 16);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
		TARDISInteriorDoorBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		TARDISInteriorDoorOnTickUpdateProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		TARDISInteriorDoorUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		TARDISInteriorDoorOnBlockRightClickedProcedure.execute(world, entity);
		return InteractionResult.SUCCESS;
	}
}
