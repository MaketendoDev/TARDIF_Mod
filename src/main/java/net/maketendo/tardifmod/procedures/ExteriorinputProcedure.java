package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class ExteriorinputProcedure {
	public static String execute(LevelAccessor world) {
		return TardifModModVariables.MapVariables.get(world).Exterior;
	}
}
