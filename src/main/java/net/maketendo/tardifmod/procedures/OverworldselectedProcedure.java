package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class OverworldselectedProcedure {
	public static void execute(LevelAccessor world) {
		TardifModModVariables.MapVariables.get(world).TargetDimension = "Overworld";
		TardifModModVariables.MapVariables.get(world).syncData(world);
	}
}
