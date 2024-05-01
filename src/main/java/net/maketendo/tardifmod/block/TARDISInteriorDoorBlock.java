
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
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.procedures.TARDISInteriorDoorUpdateTickProcedure;
import net.maketendo.tardifmod.procedures.TARDISInteriorDoorOnBlockRightClickedProcedure;
import net.maketendo.tardifmod.procedures.TARDISInteriorDoorBlockAddedProcedure;

public class TARDISInteriorDoorBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TARDISInteriorDoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2.15f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				return 0;
			}
		}.getLightLevel())));
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, 19, 15, 16, 21, 16), box(0, -15, 15, 16, 17, 16), box(-0.5, -16, 14.5, 16.5, -15, 16.5), box(-0.5, 17, 14.5, 16.5, 19, 16.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5));
				case NORTH -> Shapes.or(box(0, 19, 0, 16, 21, 1), box(0, -15, 0, 16, 17, 1), box(-0.5, -16, -0.5, 16.5, -15, 1.5), box(-0.5, 17, -0.5, 16.5, 19, 1.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5));
				case EAST -> Shapes.or(box(15, 19, 0, 16, 21, 16), box(15, -15, 0, 16, 17, 16), box(14.5, -16, -0.5, 16.5, -15, 16.5), box(14.5, 17, -0.5, 16.5, 19, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5));
				case WEST -> Shapes.or(box(0, 19, 0, 1, 21, 16), box(0, -15, 0, 1, 17, 16), box(-0.5, -16, -0.5, 1.5, -15, 16.5), box(-0.5, 17, -0.5, 1.5, 19, 16.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5));
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
		TARDISInteriorDoorBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
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
		TARDISInteriorDoorOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
