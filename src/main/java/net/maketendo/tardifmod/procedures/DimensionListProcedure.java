package net.maketendo.tardifmod.procedures;

import net.minecraftforge.fml.ModList;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class DimensionListProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ModList.get().isLoaded("teabs_doctor_who_mod")) {
			if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Galifray"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:gallifrey";
				TardifModModVariables.MapVariables.get(world).syncData(world);
				TardifModModVariables.MapVariables.get(world).DimensionIndex = 11;
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Overworld"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:overworld";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Nether"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:the_nether";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 3) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("End"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:the_nether";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 4) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Space"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "tardif_mod:space";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 5) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Skaro"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "tardif_mod:skaro";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 6) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Parallel: Skaro"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:skaro";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 7) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("The Moon"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:the_moon";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 8) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mars"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:mars";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 9) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mondas"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:mondas";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 10) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Trenzalore"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:trenzalore";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 11) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Galifray"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "teabs_doctor_who_mod:gallifrey";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 12) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Overworld"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:overworld";
				TardifModModVariables.MapVariables.get(world).syncData(world);
				TardifModModVariables.MapVariables.get(world).DimensionIndex = 1;
				TardifModModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Skaro"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "tardif_mod:skaro";
				TardifModModVariables.MapVariables.get(world).syncData(world);
				TardifModModVariables.MapVariables.get(world).DimensionIndex = 5;
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Overworld"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:overworld";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Nether"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:the_nether";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 3) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("End"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:the_nether";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 4) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Space"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "tardif_mod:space";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 5) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Skaro"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "tardif_mod:skaro";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else if (TardifModModVariables.MapVariables.get(world).DimensionIndex == 6) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Overworld"), false);
				TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension = "minecraft:overworld";
				TardifModModVariables.MapVariables.get(world).syncData(world);
				TardifModModVariables.MapVariables.get(world).DimensionIndex = 1;
				TardifModModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
