
package net.maketendo.tardifmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.procedures.TARDISRightClickedOnEntityProcedure;
import net.maketendo.tardifmod.procedures.TARDISExteriorUpdateTickProcedure;
import net.maketendo.tardifmod.procedures.TARDISExteriorOnBlockHitByProjectileProcedure;
import net.maketendo.tardifmod.init.TardifModModItems;
import net.maketendo.tardifmod.block.entity.TARDISExteriorBlockEntity;

public class TARDISExteriorBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 8);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TARDISExteriorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(-1, 3600000).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 1;
				if (s.getValue(BLOCKSTATE) == 2)
					return 1;
				if (s.getValue(BLOCKSTATE) == 3)
					return 1;
				if (s.getValue(BLOCKSTATE) == 4)
					return 1;
				if (s.getValue(BLOCKSTATE) == 5)
					return 1;
				if (s.getValue(BLOCKSTATE) == 6)
					return 1;
				if (s.getValue(BLOCKSTATE) == 7)
					return 15;
				if (s.getValue(BLOCKSTATE) == 8)
					return 15;
				return 10;
			}
		}.getLightLevel())).noOcclusion().pushReaction(PushReaction.IGNORE).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
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
				default -> box(0, -20, 0, 16, 28, 16);
				case NORTH -> box(0, -20, 0, 16, 28, 16);
				case EAST -> box(0, -20, 0, 16, 28, 16);
				case WEST -> box(0, -20, 0, 16, 28, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> box(0, -20, 0, 16, 28, 16);
				case NORTH -> box(0, -20, 0, 16, 28, 16);
				case EAST -> box(0, -20, 0, 16, 28, 16);
				case WEST -> box(0, -20, 0, 16, 28, 16);
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(13.5, 3, 16, 14.5, 5, 17), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5),
						box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
				case NORTH -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(1.5, 3, -1, 2.5, 5, 0), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5),
						box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
				case EAST -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(16, 3, 1.5, 17, 5, 2.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5),
						box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
				case WEST -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(-1, 3, 13.5, 0, 5, 14.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5),
						box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(1.5, -15, 15, 2.5, 17, 30), box(0.5, 3, 28, 1.5, 5, 29), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5),
						box(14.5, -15, 14.5, 16.5, 17, 16.5), box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
				case NORTH -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(13.5, -15, -14, 14.5, 17, 1), box(14.5, 3, -13, 15.5, 5, -12), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5),
						box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
				case EAST -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(15, -15, 13.5, 30, 17, 14.5), box(28, 3, 14.5, 29, 5, 15.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5),
						box(14.5, -15, -0.5, 16.5, 17, 1.5), box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
				case WEST -> Shapes.or(box(0, -15, 0, 16, 17, 16), box(-14, -15, 1.5, 1, 17, 2.5), box(-13, 3, 0.5, -12, 5, 1.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5),
						box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(0, 19, 0, 16, 21, 16), box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5), box(-0.5, 21, -0.5, 16.5, 27, 16.5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 5) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2, -16, 15, 14, 1, 16), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
				case NORTH -> Shapes.or(box(2, -16, 0, 14, 1, 1), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
				case EAST -> Shapes.or(box(15, -16, 2, 16, 1, 14), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
				case WEST -> Shapes.or(box(0, -16, 2, 1, 1, 14), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 6) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(14, -14, 16, 15, 1, 28), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
				case NORTH -> Shapes.or(box(1, -14, -12, 2, 1, 0), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
				case EAST -> Shapes.or(box(16, -14, 1, 28, 1, 2), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
				case WEST -> Shapes.or(box(-12, -14, 14, 0, 1, 15), box(0, -16, 0, 16, 1, 16), box(0, 1, 0, 16, 8, 16));
			};
		}
		if (state.getValue(BLOCKSTATE) == 7) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(-1, 18, 18, 17, 23, 19), box(18, 18, -1, 19, 23, 17), box(-3, 18, -1, -2, 23, 17), box(-1, 18, -3, 17, 23, -2), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(16, 23, -2, 18, 25, 0), box(-2, -16, -2, 18, -15, 18), box(-2, 23, 16, 0, 25, 18), box(9, 4, 16, 10, 7, 17), box(16, 23, 16, 18, 25, 18),
						box(-2, -15, 16, 0, 18, 18), box(16, -15, 16, 18, 18, 18), box(16, -15, -2, 18, 18, 0), box(-2, -15, -2, 0, 18, 0), box(-2, 23, -2, 0, 25, 0), box(5, 4, 16, 6, 6, 17));
				case NORTH -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(-1, 18, -3, 17, 23, -2), box(-3, 18, -1, -2, 23, 17), box(18, 18, -1, 19, 23, 17), box(-1, 18, 18, 17, 23, 19), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(-2, 23, 16, 0, 25, 18), box(-2, -16, -2, 18, -15, 18), box(16, 23, -2, 18, 25, 0), box(6, 4, -1, 7, 7, 0), box(-2, 23, -2, 0, 25, 0),
						box(16, -15, -2, 18, 18, 0), box(-2, -15, -2, 0, 18, 0), box(-2, -15, 16, 0, 18, 18), box(16, -15, 16, 18, 18, 18), box(16, 23, 16, 18, 25, 18), box(10, 4, -1, 11, 6, 0));
				case EAST -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(18, 18, -1, 19, 23, 17), box(-1, 18, -3, 17, 23, -2), box(-1, 18, 18, 17, 23, 19), box(-3, 18, -1, -2, 23, 17), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(-2, 23, -2, 0, 25, 0), box(-2, -16, -2, 18, -15, 18), box(16, 23, 16, 18, 25, 18), box(16, 4, 6, 17, 7, 7), box(16, 23, -2, 18, 25, 0),
						box(16, -15, 16, 18, 18, 18), box(16, -15, -2, 18, 18, 0), box(-2, -15, -2, 0, 18, 0), box(-2, -15, 16, 0, 18, 18), box(-2, 23, 16, 0, 25, 18), box(16, 4, 10, 17, 6, 11));
				case WEST -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(-3, 18, -1, -2, 23, 17), box(-1, 18, 18, 17, 23, 19), box(-1, 18, -3, 17, 23, -2), box(18, 18, -1, 19, 23, 17), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(16, 23, 16, 18, 25, 18), box(-2, -16, -2, 18, -15, 18), box(-2, 23, -2, 0, 25, 0), box(-1, 4, 9, 0, 7, 10), box(-2, 23, 16, 0, 25, 18),
						box(-2, -15, -2, 0, 18, 0), box(-2, -15, 16, 0, 18, 18), box(16, -15, 16, 18, 18, 18), box(16, -15, -2, 18, 18, 0), box(16, 23, -2, 18, 25, 0), box(-1, 4, 5, 0, 6, 6));
			};
		}
		if (state.getValue(BLOCKSTATE) == 8) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(-1, 18, 18, 17, 23, 19), box(18, 18, -1, 19, 23, 17), box(-3, 18, -1, -2, 23, 17), box(-1, 18, -3, 17, 23, -2), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(16, 23, -2, 18, 25, 0), box(-2, -16, -2, 18, -15, 18), box(-2, 23, 16, 0, 25, 18), box(16, 23, 16, 18, 25, 18), box(-2, -15, 16, 0, 18, 18),
						box(16, -15, 16, 18, 18, 18), box(16, -15, -2, 18, 18, 0), box(-2, -15, -2, 0, 18, 0), box(-2, 23, -2, 0, 25, 0));
				case NORTH -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(-1, 18, -3, 17, 23, -2), box(-3, 18, -1, -2, 23, 17), box(18, 18, -1, 19, 23, 17), box(-1, 18, 18, 17, 23, 19), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(-2, 23, 16, 0, 25, 18), box(-2, -16, -2, 18, -15, 18), box(16, 23, -2, 18, 25, 0), box(-2, 23, -2, 0, 25, 0), box(16, -15, -2, 18, 18, 0),
						box(-2, -15, -2, 0, 18, 0), box(-2, -15, 16, 0, 18, 18), box(16, -15, 16, 18, 18, 18), box(16, 23, 16, 18, 25, 18));
				case EAST -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(18, 18, -1, 19, 23, 17), box(-1, 18, -3, 17, 23, -2), box(-1, 18, 18, 17, 23, 19), box(-3, 18, -1, -2, 23, 17), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(-2, 23, -2, 0, 25, 0), box(-2, -16, -2, 18, -15, 18), box(16, 23, 16, 18, 25, 18), box(16, 23, -2, 18, 25, 0), box(16, -15, 16, 18, 18, 18),
						box(16, -15, -2, 18, 18, 0), box(-2, -15, -2, 0, 18, 0), box(-2, -15, 16, 0, 18, 18), box(-2, 23, 16, 0, 25, 18));
				case WEST -> Shapes.or(box(0, -15, 0, 16, 18, 16), box(-2, 18, -2, 18, 23, 18), box(-3, 18, -1, -2, 23, 17), box(-1, 18, 18, 17, 23, 19), box(-1, 18, -3, 17, 23, -2), box(18, 18, -1, 19, 23, 17), box(-1, 23, -1, 17, 25, 17),
						box(6, 29, 6, 10, 30, 10), box(-2, 25, -2, 18, 26, 18), box(7, 26, 7, 9, 29, 9), box(16, 23, 16, 18, 25, 18), box(-2, -16, -2, 18, -15, 18), box(-2, 23, -2, 0, 25, 0), box(-2, 23, 16, 0, 25, 18), box(-2, -15, -2, 0, 18, 0),
						box(-2, -15, 16, 0, 18, 18), box(16, -15, 16, 18, 18, 18), box(16, -15, -2, 18, 18, 0), box(16, 23, -2, 18, 25, 0));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0, -16, 0, 16, 32, 16);
			case NORTH -> box(0, -16, 0, 16, 32, 16);
			case EAST -> box(0, -16, 0, 16, 32, 16);
			case WEST -> box(0, -16, 0, 16, 32, 16);
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
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 15;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(TardifModModItems.TARDIS_ITEM.get());
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.BLOCKED;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		TARDISExteriorUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
		TARDISExteriorOnBlockHitByProjectileProcedure.execute(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ());
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
		TARDISRightClickedOnEntityProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new TARDISExteriorBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof TARDISExteriorBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof TARDISExteriorBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
