package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.TardifModMod;

public class ChamelionUpProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		TardifModModVariables.MapVariables.get(world).ChamelionRotation = TardifModModVariables.MapVariables.get(world).ChamelionRotation + 1;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if (TardifModModVariables.MapVariables.get(world).ChamelionRotation == 1) {
			TardifModModVariables.MapVariables.get(world).Exterior = "Phonebox";
			TardifModModVariables.MapVariables.get(world).syncData(world);
		} else {
			if (TardifModModVariables.MapVariables.get(world).ChamelionRotation == 2) {
				TardifModModVariables.MapVariables.get(world).Exterior = "Default Capsule";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (TardifModModVariables.MapVariables.get(world).ChamelionRotation == 3) {
					TardifModModVariables.MapVariables.get(world).Exterior = "Public Bin";
					TardifModModVariables.MapVariables.get(world).syncData(world);
				} else {
					if (TardifModModVariables.MapVariables.get(world).ChamelionRotation == 4) {
						TardifModModVariables.MapVariables.get(world).Exterior = "Police Box";
						TardifModModVariables.MapVariables.get(world).syncData(world);
					} else {
						TardifModModVariables.MapVariables.get(world).ChamelionRotation = 1;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						TardifModModVariables.MapVariables.get(world).Exterior = "Phonebox";
						TardifModModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
		DematSequanceProcedure.execute(world, itemstack);
		TardifModMod.queueServerWork(20, () -> {
			RematSequanceProcedure.execute();
		});
	}
}
