package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;

public class DematerialisationCarpetControlBlockHitSensorProcedure {
	public static void execute(LevelAccessor world, double x, double z, Direction direction, Entity entity, double hitX, double hitZ) {
		if (direction == null || entity == null)
			return;
		if (!world.isClientSide()) {
			if (direction == Direction.UP) {
				if (hitX > x + 0.0625 && hitX <= x + 0.1875 && hitZ >= z + 0.875 && hitZ <= z + 0.5625) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Blue"), false);
				}
			}
		}
	}
}
