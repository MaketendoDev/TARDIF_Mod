package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class DematSequanceProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		boolean take_off = false;
		if (TardifModModVariables.MapVariables.get(world).GlobalTimer == 0) {
			if (TardifModModVariables.MapVariables.get(world).GlobalTimer == 0) {
				itemstack.setCount(64);
			}
		}
	}
}
