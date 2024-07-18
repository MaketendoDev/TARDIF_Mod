
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
				default -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(1.5, -15, 15.5, 2.5, 17, 31.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5),
						box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5));
				case NORTH -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(13.5, -15, -15.5, 14.5, 17, 0.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5),
						box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5));
				case EAST -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(15.5, -15, 13.5, 31.5, 17, 14.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5),
						box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5));
				case WEST -> Shapes.or(box(0, 19, 0, 16, 21, 16), box(-0.5, 21, -0.5, 16.5, 27, 16.5), box(0, -15, 0, 16, 17, 16), box(-15.5, -15, 1.5, 0.5, 17, 2.5), box(14.5, -15, 14.5, 16.5, 17, 16.5), box(-0.5, -16, -0.5, 16.5, -15, 16.5),
						box(-0.5, 17, -0.5, 16.5, 19, 16.5), box(14.5, -15, -0.5, 16.5, 17, 1.5), box(-0.5, -15, -0.5, 1.5, 17, 1.5), box(-0.5, -15, 14.5, 1.5, 17, 16.5));
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
				default -> Shapes.or(box(0, -16, -1, 16, 16, 15), box(13, -15, 15, 15, -6, 16), box(13, 2, 15, 15, 10, 16), box(13, -6, 15, 15, 2, 16), box(13, 10, 15, 14, 17, 16), box(13, -15, 9, 14, -6, 10), box(13, -6, 9, 14, 2, 10),
						box(13, 2, 9, 14, 10, 10), box(13, 10, 9, 14, 17, 10), box(13, -15, 10, 15, -14, 15), box(13, -8, 10, 15, -6, 15), box(13, 0, 10, 15, 2, 15), box(13, 8, 10, 15, 10, 15), box(14, -15, 9, 15, 17, 16),
						box(13, 16, 10, 14, 17, 15), box(12, 4, 9, 13, 7, 10), box(7, -15, 14, 8, -6, 16), box(7, -6, 14, 8, 2, 16), box(7, 2, 14, 8, 10, 16), box(7, 10, 15, 8, 17, 16), box(1, -15, 15, 2, -6, 16), box(1, -6, 15, 2, 2, 16),
						box(1, 2, 15, 2, 10, 16), box(1, 10, 15, 2, 17, 16), box(2, -15, 14, 7, -14, 16), box(2, -8, 14, 7, -6, 16), box(2, 0, 14, 7, 2, 16), box(2, 8, 14, 7, 10, 16), box(1, -15, 14, 8, 17, 15), box(2, 16, 15, 7, 17, 16),
						box(6, 4, 14, 7, 6, 16), box(0, -15, 14, 2, -6, 15), box(0, -6, 14, 2, 2, 15), box(0, 2, 14, 2, 10, 15), box(0, 10, 14, 1, 17, 15), box(0, -15, 8, 1, -6, 9), box(0, -6, 8, 1, 2, 9), box(0, 2, 8, 1, 10, 9),
						box(0, 10, 8, 1, 17, 9), box(0, -15, 9, 2, -14, 14), box(0, -8, 9, 2, -6, 14), box(0, 0, 9, 2, 2, 14), box(0, 8, 9, 2, 10, 14), box(1, -15, 8, 2, 17, 15), box(0, 16, 9, 1, 17, 14), box(0, -15, 7, 2, -6, 8),
						box(0, -6, 7, 2, 2, 8), box(0, 2, 7, 2, 10, 8), box(0, 10, 7, 1, 17, 8), box(0, -15, 1, 1, -6, 2), box(0, -6, 1, 1, 2, 2), box(0, 2, 1, 1, 10, 2), box(0, 10, 1, 1, 17, 2), box(0, -15, 2, 2, -14, 7), box(0, -8, 2, 2, -6, 7),
						box(0, 0, 2, 2, 2, 7), box(0, 8, 2, 2, 10, 7), box(1, -15, 1, 2, 17, 8), box(0, 16, 2, 1, 17, 7), box(1, -15, 0, 2, -6, 2), box(1, -6, 0, 2, 2, 2), box(1, 2, 0, 2, 10, 2), box(1, 10, 0, 2, 17, 1), box(7, -15, 0, 8, -6, 1),
						box(7, -6, 0, 8, 2, 1), box(7, 2, 0, 8, 10, 1), box(7, 10, 0, 8, 17, 1), box(2, -15, 0, 7, -14, 2), box(2, -8, 0, 7, -6, 2), box(2, 0, 0, 7, 2, 2), box(2, 8, 0, 7, 10, 2), box(1, -15, 1, 8, 17, 2), box(2, 16, 0, 7, 17, 1),
						box(8, -15, 0, 9, -6, 2), box(8, -6, 0, 9, 2, 2), box(8, 2, 0, 9, 10, 2), box(8, 10, 0, 9, 17, 1), box(14, -15, 0, 15, -6, 1), box(14, -6, 0, 15, 2, 1), box(14, 2, 0, 15, 10, 1), box(14, 10, 0, 15, 17, 1),
						box(9, -15, 0, 14, -14, 2), box(9, -8, 0, 14, -6, 2), box(9, 0, 0, 14, 2, 2), box(9, 8, 0, 14, 10, 2), box(8, -15, 1, 15, 17, 2), box(9, 16, 0, 14, 17, 1), box(14, -15, 1, 16, -6, 2), box(14, -6, 1, 16, 2, 2),
						box(14, 2, 1, 16, 10, 2), box(15, 10, 1, 16, 17, 2), box(15, -15, 7, 16, -6, 8), box(15, -6, 7, 16, 2, 8), box(15, 2, 7, 16, 10, 8), box(15, 10, 7, 16, 17, 8), box(14, -15, 2, 16, -14, 7), box(14, -8, 2, 16, -6, 7),
						box(14, 0, 2, 16, 2, 7), box(14, 8, 2, 16, 10, 7), box(14, -15, 1, 15, 17, 8), box(15, 16, 2, 16, 17, 7), box(14, -15, 8, 16, -6, 9), box(14, -6, 8, 16, 2, 9), box(14, 2, 8, 16, 10, 9), box(15, 10, 8, 16, 17, 9),
						box(15, -15, 14, 16, -6, 15), box(15, -6, 14, 16, 2, 15), box(15, 2, 14, 16, 10, 15), box(15, 10, 14, 16, 17, 15), box(14, -15, 9, 16, -14, 14), box(14, -8, 9, 16, -6, 14), box(14, 0, 9, 16, 2, 14), box(14, 8, 9, 16, 10, 14),
						box(14, -15, 8, 15, 17, 15), box(15, 16, 9, 16, 17, 14), box(-2, -16, -2, 18, -15, 18), box(15, -15, 15, 17, 17, 17), box(15, -15, -1, 17, 17, 1), box(-1, -15, -1, 1, 17, 1), box(-1, -15, 15, 1, 17, 17),
						box(-1, 17, -1, 17, 20, 17), box(0, 20, 0, 16, 23, 16), box(-1, 20, 15, 1, 22, 17), box(-1, 20, -1, 1, 22, 1), box(15, 20, -1, 17, 22, 1), box(15, 20, 15, 17, 22, 17), box(7, 23, 7, 9, 26, 9), box(6, 26, 6, 10, 27, 10));
				case NORTH -> Shapes.or(box(0, -16, 1, 16, 16, 17), box(1, -15, 0, 3, -6, 1), box(1, 2, 0, 3, 10, 1), box(1, -6, 0, 3, 2, 1), box(2, 10, 0, 3, 17, 1), box(2, -15, 6, 3, -6, 7), box(2, -6, 6, 3, 2, 7), box(2, 2, 6, 3, 10, 7),
						box(2, 10, 6, 3, 17, 7), box(1, -15, 1, 3, -14, 6), box(1, -8, 1, 3, -6, 6), box(1, 0, 1, 3, 2, 6), box(1, 8, 1, 3, 10, 6), box(1, -15, 0, 2, 17, 7), box(2, 16, 1, 3, 17, 6), box(3, 4, 6, 4, 7, 7), box(8, -15, 0, 9, -6, 2),
						box(8, -6, 0, 9, 2, 2), box(8, 2, 0, 9, 10, 2), box(8, 10, 0, 9, 17, 1), box(14, -15, 0, 15, -6, 1), box(14, -6, 0, 15, 2, 1), box(14, 2, 0, 15, 10, 1), box(14, 10, 0, 15, 17, 1), box(9, -15, 0, 14, -14, 2),
						box(9, -8, 0, 14, -6, 2), box(9, 0, 0, 14, 2, 2), box(9, 8, 0, 14, 10, 2), box(8, -15, 1, 15, 17, 2), box(9, 16, 0, 14, 17, 1), box(9, 4, 0, 10, 6, 2), box(14, -15, 1, 16, -6, 2), box(14, -6, 1, 16, 2, 2),
						box(14, 2, 1, 16, 10, 2), box(15, 10, 1, 16, 17, 2), box(15, -15, 7, 16, -6, 8), box(15, -6, 7, 16, 2, 8), box(15, 2, 7, 16, 10, 8), box(15, 10, 7, 16, 17, 8), box(14, -15, 2, 16, -14, 7), box(14, -8, 2, 16, -6, 7),
						box(14, 0, 2, 16, 2, 7), box(14, 8, 2, 16, 10, 7), box(14, -15, 1, 15, 17, 8), box(15, 16, 2, 16, 17, 7), box(14, -15, 8, 16, -6, 9), box(14, -6, 8, 16, 2, 9), box(14, 2, 8, 16, 10, 9), box(15, 10, 8, 16, 17, 9),
						box(15, -15, 14, 16, -6, 15), box(15, -6, 14, 16, 2, 15), box(15, 2, 14, 16, 10, 15), box(15, 10, 14, 16, 17, 15), box(14, -15, 9, 16, -14, 14), box(14, -8, 9, 16, -6, 14), box(14, 0, 9, 16, 2, 14), box(14, 8, 9, 16, 10, 14),
						box(14, -15, 8, 15, 17, 15), box(15, 16, 9, 16, 17, 14), box(14, -15, 14, 15, -6, 16), box(14, -6, 14, 15, 2, 16), box(14, 2, 14, 15, 10, 16), box(14, 10, 15, 15, 17, 16), box(8, -15, 15, 9, -6, 16), box(8, -6, 15, 9, 2, 16),
						box(8, 2, 15, 9, 10, 16), box(8, 10, 15, 9, 17, 16), box(9, -15, 14, 14, -14, 16), box(9, -8, 14, 14, -6, 16), box(9, 0, 14, 14, 2, 16), box(9, 8, 14, 14, 10, 16), box(8, -15, 14, 15, 17, 15), box(9, 16, 15, 14, 17, 16),
						box(7, -15, 14, 8, -6, 16), box(7, -6, 14, 8, 2, 16), box(7, 2, 14, 8, 10, 16), box(7, 10, 15, 8, 17, 16), box(1, -15, 15, 2, -6, 16), box(1, -6, 15, 2, 2, 16), box(1, 2, 15, 2, 10, 16), box(1, 10, 15, 2, 17, 16),
						box(2, -15, 14, 7, -14, 16), box(2, -8, 14, 7, -6, 16), box(2, 0, 14, 7, 2, 16), box(2, 8, 14, 7, 10, 16), box(1, -15, 14, 8, 17, 15), box(2, 16, 15, 7, 17, 16), box(0, -15, 14, 2, -6, 15), box(0, -6, 14, 2, 2, 15),
						box(0, 2, 14, 2, 10, 15), box(0, 10, 14, 1, 17, 15), box(0, -15, 8, 1, -6, 9), box(0, -6, 8, 1, 2, 9), box(0, 2, 8, 1, 10, 9), box(0, 10, 8, 1, 17, 9), box(0, -15, 9, 2, -14, 14), box(0, -8, 9, 2, -6, 14),
						box(0, 0, 9, 2, 2, 14), box(0, 8, 9, 2, 10, 14), box(1, -15, 8, 2, 17, 15), box(0, 16, 9, 1, 17, 14), box(0, -15, 7, 2, -6, 8), box(0, -6, 7, 2, 2, 8), box(0, 2, 7, 2, 10, 8), box(0, 10, 7, 1, 17, 8), box(0, -15, 1, 1, -6, 2),
						box(0, -6, 1, 1, 2, 2), box(0, 2, 1, 1, 10, 2), box(0, 10, 1, 1, 17, 2), box(0, -15, 2, 2, -14, 7), box(0, -8, 2, 2, -6, 7), box(0, 0, 2, 2, 2, 7), box(0, 8, 2, 2, 10, 7), box(1, -15, 1, 2, 17, 8), box(0, 16, 2, 1, 17, 7),
						box(-2, -16, -2, 18, -15, 18), box(-1, -15, -1, 1, 17, 1), box(-1, -15, 15, 1, 17, 17), box(15, -15, 15, 17, 17, 17), box(15, -15, -1, 17, 17, 1), box(-1, 17, -1, 17, 20, 17), box(0, 20, 0, 16, 23, 16),
						box(15, 20, -1, 17, 22, 1), box(15, 20, 15, 17, 22, 17), box(-1, 20, 15, 1, 22, 17), box(-1, 20, -1, 1, 22, 1), box(7, 23, 7, 9, 26, 9), box(6, 26, 6, 10, 27, 10));
				case EAST -> Shapes.or(box(-1, -16, 0, 15, 16, 16), box(15, -15, 1, 16, -6, 3), box(15, 2, 1, 16, 10, 3), box(15, -6, 1, 16, 2, 3), box(15, 10, 2, 16, 17, 3), box(9, -15, 2, 10, -6, 3), box(9, -6, 2, 10, 2, 3),
						box(9, 2, 2, 10, 10, 3), box(9, 10, 2, 10, 17, 3), box(10, -15, 1, 15, -14, 3), box(10, -8, 1, 15, -6, 3), box(10, 0, 1, 15, 2, 3), box(10, 8, 1, 15, 10, 3), box(9, -15, 1, 16, 17, 2), box(10, 16, 2, 15, 17, 3),
						box(9, 4, 3, 10, 7, 4), box(14, -15, 8, 16, -6, 9), box(14, -6, 8, 16, 2, 9), box(14, 2, 8, 16, 10, 9), box(15, 10, 8, 16, 17, 9), box(15, -15, 14, 16, -6, 15), box(15, -6, 14, 16, 2, 15), box(15, 2, 14, 16, 10, 15),
						box(15, 10, 14, 16, 17, 15), box(14, -15, 9, 16, -14, 14), box(14, -8, 9, 16, -6, 14), box(14, 0, 9, 16, 2, 14), box(14, 8, 9, 16, 10, 14), box(14, -15, 8, 15, 17, 15), box(15, 16, 9, 16, 17, 14), box(14, 4, 9, 16, 6, 10),
						box(14, -15, 14, 15, -6, 16), box(14, -6, 14, 15, 2, 16), box(14, 2, 14, 15, 10, 16), box(14, 10, 15, 15, 17, 16), box(8, -15, 15, 9, -6, 16), box(8, -6, 15, 9, 2, 16), box(8, 2, 15, 9, 10, 16), box(8, 10, 15, 9, 17, 16),
						box(9, -15, 14, 14, -14, 16), box(9, -8, 14, 14, -6, 16), box(9, 0, 14, 14, 2, 16), box(9, 8, 14, 14, 10, 16), box(8, -15, 14, 15, 17, 15), box(9, 16, 15, 14, 17, 16), box(7, -15, 14, 8, -6, 16), box(7, -6, 14, 8, 2, 16),
						box(7, 2, 14, 8, 10, 16), box(7, 10, 15, 8, 17, 16), box(1, -15, 15, 2, -6, 16), box(1, -6, 15, 2, 2, 16), box(1, 2, 15, 2, 10, 16), box(1, 10, 15, 2, 17, 16), box(2, -15, 14, 7, -14, 16), box(2, -8, 14, 7, -6, 16),
						box(2, 0, 14, 7, 2, 16), box(2, 8, 14, 7, 10, 16), box(1, -15, 14, 8, 17, 15), box(2, 16, 15, 7, 17, 16), box(0, -15, 14, 2, -6, 15), box(0, -6, 14, 2, 2, 15), box(0, 2, 14, 2, 10, 15), box(0, 10, 14, 1, 17, 15),
						box(0, -15, 8, 1, -6, 9), box(0, -6, 8, 1, 2, 9), box(0, 2, 8, 1, 10, 9), box(0, 10, 8, 1, 17, 9), box(0, -15, 9, 2, -14, 14), box(0, -8, 9, 2, -6, 14), box(0, 0, 9, 2, 2, 14), box(0, 8, 9, 2, 10, 14),
						box(1, -15, 8, 2, 17, 15), box(0, 16, 9, 1, 17, 14), box(0, -15, 7, 2, -6, 8), box(0, -6, 7, 2, 2, 8), box(0, 2, 7, 2, 10, 8), box(0, 10, 7, 1, 17, 8), box(0, -15, 1, 1, -6, 2), box(0, -6, 1, 1, 2, 2), box(0, 2, 1, 1, 10, 2),
						box(0, 10, 1, 1, 17, 2), box(0, -15, 2, 2, -14, 7), box(0, -8, 2, 2, -6, 7), box(0, 0, 2, 2, 2, 7), box(0, 8, 2, 2, 10, 7), box(1, -15, 1, 2, 17, 8), box(0, 16, 2, 1, 17, 7), box(1, -15, 0, 2, -6, 2), box(1, -6, 0, 2, 2, 2),
						box(1, 2, 0, 2, 10, 2), box(1, 10, 0, 2, 17, 1), box(7, -15, 0, 8, -6, 1), box(7, -6, 0, 8, 2, 1), box(7, 2, 0, 8, 10, 1), box(7, 10, 0, 8, 17, 1), box(2, -15, 0, 7, -14, 2), box(2, -8, 0, 7, -6, 2), box(2, 0, 0, 7, 2, 2),
						box(2, 8, 0, 7, 10, 2), box(1, -15, 1, 8, 17, 2), box(2, 16, 0, 7, 17, 1), box(8, -15, 0, 9, -6, 2), box(8, -6, 0, 9, 2, 2), box(8, 2, 0, 9, 10, 2), box(8, 10, 0, 9, 17, 1), box(14, -15, 0, 15, -6, 1),
						box(14, -6, 0, 15, 2, 1), box(14, 2, 0, 15, 10, 1), box(14, 10, 0, 15, 17, 1), box(9, -15, 0, 14, -14, 2), box(9, -8, 0, 14, -6, 2), box(9, 0, 0, 14, 2, 2), box(9, 8, 0, 14, 10, 2), box(8, -15, 1, 15, 17, 2),
						box(9, 16, 0, 14, 17, 1), box(-2, -16, -2, 18, -15, 18), box(15, -15, -1, 17, 17, 1), box(-1, -15, -1, 1, 17, 1), box(-1, -15, 15, 1, 17, 17), box(15, -15, 15, 17, 17, 17), box(-1, 17, -1, 17, 20, 17),
						box(0, 20, 0, 16, 23, 16), box(15, 20, 15, 17, 22, 17), box(-1, 20, 15, 1, 22, 17), box(-1, 20, -1, 1, 22, 1), box(15, 20, -1, 17, 22, 1), box(7, 23, 7, 9, 26, 9), box(6, 26, 6, 10, 27, 10));
				case WEST -> Shapes.or(box(1, -16, 0, 17, 16, 16), box(0, -15, 13, 1, -6, 15), box(0, 2, 13, 1, 10, 15), box(0, -6, 13, 1, 2, 15), box(0, 10, 13, 1, 17, 14), box(6, -15, 13, 7, -6, 14), box(6, -6, 13, 7, 2, 14),
						box(6, 2, 13, 7, 10, 14), box(6, 10, 13, 7, 17, 14), box(1, -15, 13, 6, -14, 15), box(1, -8, 13, 6, -6, 15), box(1, 0, 13, 6, 2, 15), box(1, 8, 13, 6, 10, 15), box(0, -15, 14, 7, 17, 15), box(1, 16, 13, 6, 17, 14),
						box(6, 4, 12, 7, 7, 13), box(0, -15, 7, 2, -6, 8), box(0, -6, 7, 2, 2, 8), box(0, 2, 7, 2, 10, 8), box(0, 10, 7, 1, 17, 8), box(0, -15, 1, 1, -6, 2), box(0, -6, 1, 1, 2, 2), box(0, 2, 1, 1, 10, 2), box(0, 10, 1, 1, 17, 2),
						box(0, -15, 2, 2, -14, 7), box(0, -8, 2, 2, -6, 7), box(0, 0, 2, 2, 2, 7), box(0, 8, 2, 2, 10, 7), box(1, -15, 1, 2, 17, 8), box(0, 16, 2, 1, 17, 7), box(0, 4, 6, 2, 6, 7), box(1, -15, 0, 2, -6, 2), box(1, -6, 0, 2, 2, 2),
						box(1, 2, 0, 2, 10, 2), box(1, 10, 0, 2, 17, 1), box(7, -15, 0, 8, -6, 1), box(7, -6, 0, 8, 2, 1), box(7, 2, 0, 8, 10, 1), box(7, 10, 0, 8, 17, 1), box(2, -15, 0, 7, -14, 2), box(2, -8, 0, 7, -6, 2), box(2, 0, 0, 7, 2, 2),
						box(2, 8, 0, 7, 10, 2), box(1, -15, 1, 8, 17, 2), box(2, 16, 0, 7, 17, 1), box(8, -15, 0, 9, -6, 2), box(8, -6, 0, 9, 2, 2), box(8, 2, 0, 9, 10, 2), box(8, 10, 0, 9, 17, 1), box(14, -15, 0, 15, -6, 1),
						box(14, -6, 0, 15, 2, 1), box(14, 2, 0, 15, 10, 1), box(14, 10, 0, 15, 17, 1), box(9, -15, 0, 14, -14, 2), box(9, -8, 0, 14, -6, 2), box(9, 0, 0, 14, 2, 2), box(9, 8, 0, 14, 10, 2), box(8, -15, 1, 15, 17, 2),
						box(9, 16, 0, 14, 17, 1), box(14, -15, 1, 16, -6, 2), box(14, -6, 1, 16, 2, 2), box(14, 2, 1, 16, 10, 2), box(15, 10, 1, 16, 17, 2), box(15, -15, 7, 16, -6, 8), box(15, -6, 7, 16, 2, 8), box(15, 2, 7, 16, 10, 8),
						box(15, 10, 7, 16, 17, 8), box(14, -15, 2, 16, -14, 7), box(14, -8, 2, 16, -6, 7), box(14, 0, 2, 16, 2, 7), box(14, 8, 2, 16, 10, 7), box(14, -15, 1, 15, 17, 8), box(15, 16, 2, 16, 17, 7), box(14, -15, 8, 16, -6, 9),
						box(14, -6, 8, 16, 2, 9), box(14, 2, 8, 16, 10, 9), box(15, 10, 8, 16, 17, 9), box(15, -15, 14, 16, -6, 15), box(15, -6, 14, 16, 2, 15), box(15, 2, 14, 16, 10, 15), box(15, 10, 14, 16, 17, 15), box(14, -15, 9, 16, -14, 14),
						box(14, -8, 9, 16, -6, 14), box(14, 0, 9, 16, 2, 14), box(14, 8, 9, 16, 10, 14), box(14, -15, 8, 15, 17, 15), box(15, 16, 9, 16, 17, 14), box(14, -15, 14, 15, -6, 16), box(14, -6, 14, 15, 2, 16), box(14, 2, 14, 15, 10, 16),
						box(14, 10, 15, 15, 17, 16), box(8, -15, 15, 9, -6, 16), box(8, -6, 15, 9, 2, 16), box(8, 2, 15, 9, 10, 16), box(8, 10, 15, 9, 17, 16), box(9, -15, 14, 14, -14, 16), box(9, -8, 14, 14, -6, 16), box(9, 0, 14, 14, 2, 16),
						box(9, 8, 14, 14, 10, 16), box(8, -15, 14, 15, 17, 15), box(9, 16, 15, 14, 17, 16), box(7, -15, 14, 8, -6, 16), box(7, -6, 14, 8, 2, 16), box(7, 2, 14, 8, 10, 16), box(7, 10, 15, 8, 17, 16), box(1, -15, 15, 2, -6, 16),
						box(1, -6, 15, 2, 2, 16), box(1, 2, 15, 2, 10, 16), box(1, 10, 15, 2, 17, 16), box(2, -15, 14, 7, -14, 16), box(2, -8, 14, 7, -6, 16), box(2, 0, 14, 7, 2, 16), box(2, 8, 14, 7, 10, 16), box(1, -15, 14, 8, 17, 15),
						box(2, 16, 15, 7, 17, 16), box(-2, -16, -2, 18, -15, 18), box(-1, -15, 15, 1, 17, 17), box(15, -15, 15, 17, 17, 17), box(15, -15, -1, 17, 17, 1), box(-1, -15, -1, 1, 17, 1), box(-1, 17, -1, 17, 20, 17),
						box(0, 20, 0, 16, 23, 16), box(-1, 20, -1, 1, 22, 1), box(15, 20, -1, 17, 22, 1), box(15, 20, 15, 17, 22, 17), box(-1, 20, 15, 1, 22, 17), box(7, 23, 7, 9, 26, 9), box(6, 26, 6, 10, 27, 10));
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
