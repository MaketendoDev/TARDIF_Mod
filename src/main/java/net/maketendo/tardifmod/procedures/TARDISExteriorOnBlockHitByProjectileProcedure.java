package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class TARDISExteriorOnBlockHitByProjectileProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, TardifModModVariables.MapVariables.get(world).X_TARDIS, (TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1), TardifModModVariables.MapVariables.get(world).Z_TARDIS, 10, 3, 3, 3,
					1);
		TardifModModVariables.MapVariables.get(world).TardisMood = TardifModModVariables.MapVariables.get(world).TardisMood - 10;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tardis_groan_sfx")), SoundSource.HOSTILE, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tardis_groan_sfx")), SoundSource.HOSTILE, 1, 1, false);
			}
		}
	}
}
