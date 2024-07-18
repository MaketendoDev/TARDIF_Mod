package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class PoliceBoxDisplayProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Police Box")) {
			return true;
		}
		return false;
	}
}
