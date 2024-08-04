package net.maketendo.tardifmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlobalTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level());
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (TardifModModVariables.MapVariables.get(world).GlobalTimer == 0) {
			TardifModModVariables.MapVariables.get(world).GlobalTimer = 200;
			TardifModModVariables.MapVariables.get(world).syncData(world);
		} else {
			TardifModModVariables.MapVariables.get(world).GlobalTimer = TardifModModVariables.MapVariables.get(world).GlobalTimer - 1;
			TardifModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
