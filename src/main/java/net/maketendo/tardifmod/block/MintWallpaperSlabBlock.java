
package net.maketendo.tardifmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MintWallpaperSlabBlock extends SlabBlock {
	public MintWallpaperSlabBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1.05f, 10f).dynamicShape());
	}
}
