package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.init.TardifModModBlocks;

import java.util.Map;

public class PetrifiedGrassBlockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		boolean foundBlock = false;
		posX = x - 1;
		posY = y - 2;
		posZ = z - 1;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(posX, posY, posZ))).getBlock() == TardifModModBlocks.PETRIFIED_DIRT.get() && world.isEmptyBlock(BlockPos.containing(posX, posY + 1, posZ))
							&& world.getBlockState(BlockPos.containing(posX, posY, posZ)).getLightEmission(world, BlockPos.containing(posX, posY, posZ)) >= 9) {
						foundBlock = true;
						break;
					}
					posZ = posZ + 1;
				}
				if (foundBlock == true) {
					break;
				}
				posZ = z - 1;
				posX = posX + 1;
			}
			if (foundBlock == true) {
				break;
			}
			posX = x - 1;
			posY = posY + 1;
			posZ = z - 1;
		}
		if (foundBlock == true) {
			{
				BlockPos _bp = BlockPos.containing(posX, posY, posZ);
				BlockState _bs = TardifModModBlocks.PETRIFIED_GRASS_BLOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
