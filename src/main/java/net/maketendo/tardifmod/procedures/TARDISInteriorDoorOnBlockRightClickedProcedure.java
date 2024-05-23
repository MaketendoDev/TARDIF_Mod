package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class TARDISInteriorDoorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (TardifModModVariables.MapVariables.get(world).Dematerialised == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74The TARDIS is in Flight..."), true);
		} else {
			if (TardifModModVariables.MapVariables.get(world).Locked == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("TARDIS is Locked..."), true);
			} else {
				if (TardifModModVariables.MapVariables.get(world).DoorOpen == true) {
					TardifModModVariables.MapVariables.get(world).DoorOpen = false;
					TardifModModVariables.MapVariables.get(world).syncData(world);
				} else {
					TardifModModVariables.MapVariables.get(world).DoorOpen = true;
					TardifModModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
