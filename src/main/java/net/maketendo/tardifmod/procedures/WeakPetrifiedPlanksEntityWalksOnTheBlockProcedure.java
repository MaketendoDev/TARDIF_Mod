package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WeakPetrifiedPlanksEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean beingbroken = false;
		if (beingbroken == false) {
			beingbroken = true;
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.OAK_PLANKS.defaultBlockState()));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}
