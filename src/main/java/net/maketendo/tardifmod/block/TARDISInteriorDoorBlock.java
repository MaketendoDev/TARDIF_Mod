
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
				default -> Shapes.or(box(0, -16, 15, 16, 16, 16), box(-0.5, -16, 14.5, 1.5, 16, 16.5), box(14.5, -16, 14.5, 16.5, 16, 16.5), box(0, 18, 15, 16, 20, 16), box(-0.5, 16, 14.5, 16.5, 18, 16.5), box(-0.5, 20, 14.5, 16.5, 26, 16.5));
				case NORTH -> Shapes.or(box(0, -16, 0, 16, 16, 1), box(14.5, -16, -0.5, 16.5, 16, 1.5), box(-0.5, -16, -0.5, 1.5, 16, 1.5), box(0, 18, 0, 16, 20, 1), box(-0.5, 16, -0.5, 16.5, 18, 1.5), box(-0.5, 20, -0.5, 16.5, 26, 1.5));
				case EAST -> Shapes.or(box(15, -16, 0, 16, 16, 16), box(14.5, -16, 14.5, 16.5, 16, 16.5), box(14.5, -16, -0.5, 16.5, 16, 1.5), box(15, 18, 0, 16, 20, 16), box(14.5, 16, -0.5, 16.5, 18, 16.5), box(14.5, 20, -0.5, 16.5, 26, 16.5));
				case WEST -> Shapes.or(box(0, -16, 0, 1, 16, 16), box(-0.5, -16, -0.5, 1.5, 16, 1.5), box(-0.5, -16, 14.5, 1.5, 16, 16.5), box(0, 18, 0, 1, 20, 16), box(-0.5, 16, -0.5, 1.5, 18, 16.5), box(-0.5, 20, -0.5, 1.5, 26, 16.5));
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
				default -> Shapes.or(box(15, -16, 6, 16, 17, 14), box(-1, 1, 10, 1, 7, 15), box(0, -16, 8, 1, 17, 16), box(1, 3, 10, 2, 5, 11), box(-2, 17, 14, 18, 22, 16), box(-1, 17, 16, 17, 22, 17), box(-1, -16, 16, 17, 17, 17),
						box(-2, 22, 14, 0, 24, 16), box(14, 3, 7, 15, 6, 8), box(16, 3, 7, 17, 6, 8), box(16, 22, 14, 18, 24, 16), box(-2, -16, 14, 0, 17, 16), box(16, -16, 14, 18, 17, 16));
				case NORTH -> Shapes.or(box(0, -16, 2, 1, 17, 10), box(15, 1, 1, 17, 7, 6), box(15, -16, 0, 16, 17, 8), box(14, 3, 5, 15, 5, 6), box(-2, 17, 0, 18, 22, 2), box(-1, 17, -1, 17, 22, 0), box(-1, -16, -1, 17, 17, 0),
						box(16, 22, 0, 18, 24, 2), box(1, 3, 8, 2, 6, 9), box(-1, 3, 8, 0, 6, 9), box(-2, 22, 0, 0, 24, 2), box(16, -16, 0, 18, 17, 2), box(-2, -16, 0, 0, 17, 2));
				case EAST -> Shapes.or(box(6, -16, 0, 14, 17, 1), box(10, 1, 15, 15, 7, 17), box(8, -16, 15, 16, 17, 16), box(10, 3, 14, 11, 5, 15), box(14, 17, -2, 16, 22, 18), box(16, 17, -1, 17, 22, 17), box(16, -16, -1, 17, 17, 17),
						box(14, 22, 16, 16, 24, 18), box(7, 3, 1, 8, 6, 2), box(7, 3, -1, 8, 6, 0), box(14, 22, -2, 16, 24, 0), box(14, -16, 16, 16, 17, 18), box(14, -16, -2, 16, 17, 0));
				case WEST -> Shapes.or(box(2, -16, 15, 10, 17, 16), box(1, 1, -1, 6, 7, 1), box(0, -16, 0, 8, 17, 1), box(5, 3, 1, 6, 5, 2), box(0, 17, -2, 2, 22, 18), box(-1, 17, -1, 0, 22, 17), box(-1, -16, -1, 0, 17, 17), box(0, 22, -2, 2, 24, 0),
						box(8, 3, 14, 9, 6, 15), box(8, 3, 16, 9, 6, 17), box(0, 22, 16, 2, 24, 18), box(0, -16, -2, 2, 17, 0), box(0, -16, 16, 2, 17, 18));
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
				default -> Shapes.or(box(0, 1, 15, 16, 8, 16), box(0, -16, 15, 1, 1, 31));
				case NORTH -> Shapes.or(box(0, 1, 0, 16, 8, 1), box(15, -16, -15, 16, 1, 1));
				case EAST -> Shapes.or(box(15, 1, 0, 16, 8, 16), box(15, -16, 15, 31, 1, 16));
				case WEST -> Shapes.or(box(0, 1, 0, 1, 8, 16), box(-15, -16, 0, 1, 1, 1));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> box(14, 16, 0, 16, 32, 16);
				case NORTH -> box(0, 16, 0, 2, 32, 16);
				case EAST -> box(0, 16, 0, 16, 32, 2);
				case WEST -> box(0, 16, 14, 16, 32, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> box(14, 16, 0, 16, 32, 16);
				case NORTH -> box(0, 16, 0, 2, 32, 16);
				case EAST -> box(0, 16, 0, 16, 32, 2);
				case WEST -> box(0, 16, 14, 16, 32, 16);
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
		TARDISInteriorDoorUpdateTickProcedure.execute(world, entity);
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
