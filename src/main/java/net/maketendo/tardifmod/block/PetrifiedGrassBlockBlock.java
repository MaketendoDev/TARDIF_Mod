
package net.maketendo.tardifmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PetrifiedGrassBlockBlock extends Block {
	public PetrifiedGrassBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1.6f, 10.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
