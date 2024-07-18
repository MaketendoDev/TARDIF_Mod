package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class RotateButtonProcedure {
	public static void execute(LevelAccessor world) {
		double cycler = 0;
		TardifModModVariables.MapVariables.get(world).FacingRotator = TardifModModVariables.MapVariables.get(world).FacingRotator + 1;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if (TardifModModVariables.MapVariables.get(world).FacingRotator == 0) {
			TardifModModVariables.MapVariables.get(world).Facing = "North";
			TardifModModVariables.MapVariables.get(world).syncData(world);
		} else {
			if (TardifModModVariables.MapVariables.get(world).FacingRotator == 1) {
				TardifModModVariables.MapVariables.get(world).Facing = "East";
				TardifModModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (TardifModModVariables.MapVariables.get(world).FacingRotator == 2) {
					TardifModModVariables.MapVariables.get(world).Facing = "South";
					TardifModModVariables.MapVariables.get(world).syncData(world);
				} else {
					if (TardifModModVariables.MapVariables.get(world).FacingRotator == 3) {
						TardifModModVariables.MapVariables.get(world).Facing = "West";
						TardifModModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (TardifModModVariables.MapVariables.get(world).FacingRotator == 4) {
							TardifModModVariables.MapVariables.get(world).Facing = "North";
							TardifModModVariables.MapVariables.get(world).syncData(world);
							TardifModModVariables.MapVariables.get(world).FacingRotator = 1;
							TardifModModVariables.MapVariables.get(world).syncData(world);
						} else {
							TardifModModVariables.MapVariables.get(world).FacingRotator = 1;
							TardifModModVariables.MapVariables.get(world).syncData(world);
							TardifModModVariables.MapVariables.get(world).Facing = "North";
							TardifModModVariables.MapVariables.get(world).syncData(world);
						}
					}
				}
			}
		}
	}
}
