package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class DirtHouseDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Dirt House")) {
			return true;
		}
		return false;
	}
}
