package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class SetNetherProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TardifModModVariables.MapVariables.get(world).TargetDimension = "Nether";
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7aWorld set to The Nether! "), true);
	}
}
