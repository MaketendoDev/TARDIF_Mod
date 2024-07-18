
package net.maketendo.tardifmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PhoneboxDecorationBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PhoneboxDecorationBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> 10).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 17, -0.5, 16.5, 19, 16.5),
					box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5));
			case NORTH -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 17, -0.5, 16.5, 19, 16.5),
					box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5));
			case EAST -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 17, -0.5, 16.5, 19, 16.5),
					box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5));
			case WEST -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 17, -0.5, 16.5, 19, 16.5),
					box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
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
}
