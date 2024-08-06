package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.TardifModMod;

public class DimensionalPannelOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:tardis_dim")))) {
			TardifModMod.LOGGER.info("No TARDIS Detected.");
		} else {
			if (TardifModModVariables.MapVariables.get(world).Dematerialised == true) {
				if (entity.isShiftKeyDown()) {
					TardifModModVariables.MapVariables.get(world).DimensionIndex = TardifModModVariables.MapVariables.get(world).DimensionIndex - 1;
					TardifModModVariables.MapVariables.get(world).syncData(world);
					DimensionListProcedure.execute(world, entity);
				} else {
					TardifModModVariables.MapVariables.get(world).DimensionIndex = TardifModModVariables.MapVariables.get(world).DimensionIndex + 1;
					TardifModModVariables.MapVariables.get(world).syncData(world);
					DimensionListProcedure.execute(world, entity);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You can't set your TARDIS Space Time Coordinates while not in flight."), true);
			}
		}
	}
}
