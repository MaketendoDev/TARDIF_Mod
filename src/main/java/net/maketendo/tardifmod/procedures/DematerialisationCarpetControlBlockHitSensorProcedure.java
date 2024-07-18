package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

public class DematerialisationCarpetControlBlockHitSensorProcedure {
	public static void execute(LevelAccessor world, double x, double y, Direction direction, double hitX, double hitY) {
		if (direction == null)
			return;
		if (!world.isClientSide()) {
			if (direction == Direction.UP) {
				if (hitX > x + 0.5 && hitX <= x + 1 && hitY > y + 0 && hitY <= y + 0.5) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("hello there"), false);
				}
			}
		}
	}
}
