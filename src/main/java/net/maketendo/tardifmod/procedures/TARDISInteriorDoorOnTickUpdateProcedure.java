package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TARDISInteriorDoorOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DoorDisplayUpdateProcedure.execute(world, x, y, z);
	}
}
