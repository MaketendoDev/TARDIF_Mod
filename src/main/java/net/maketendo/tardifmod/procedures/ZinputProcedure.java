package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class ZinputProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##.##").format(TardifModModVariables.MapVariables.get(world).Z_TARDIS);
	}
}
