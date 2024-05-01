package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class FlightdisplayProcedure {
	public static String execute(LevelAccessor world) {
		if (TardifModModVariables.MapVariables.get(world).Dematerialised == true) {
			return "True";
		} else {
			return "False";
		}
	}
}
