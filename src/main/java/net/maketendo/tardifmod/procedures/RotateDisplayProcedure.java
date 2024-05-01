package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class RotateDisplayProcedure {
	public static String execute(LevelAccessor world) {
		return TardifModModVariables.MapVariables.get(world).Facing;
	}
}
