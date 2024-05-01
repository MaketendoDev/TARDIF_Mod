package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class TARDISExteriorOnBlockHitByProjectileProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, TardifModModVariables.MapVariables.get(world).X_TARDIS, (TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1), TardifModModVariables.MapVariables.get(world).Z_TARDIS, 10, 3, 3, 3,
					1);
	}
}
