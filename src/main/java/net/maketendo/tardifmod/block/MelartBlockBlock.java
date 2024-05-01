
package net.maketendo.tardifmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class MelartBlockBlock extends Block {
	public MelartBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.2f, 12.5f).friction(0.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
