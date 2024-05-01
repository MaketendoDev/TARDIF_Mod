package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.TardifModMod;

public class TARDISExteriorOnBlockHitByProjectileProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, TardifModModVariables.MapVariables.get(world).X_TARDIS, (TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1), TardifModModVariables.MapVariables.get(world).Z_TARDIS, 10, 3, 3, 3,
					1);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("you absalute menace to society you just decreased your flipping tardis moods... time to self destruct in 3"), false);
		TardifModMod.queueServerWork(20, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("3"), false);
			TardifModMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("2"), false);
				TardifModMod.queueServerWork(20, () -> {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("1"), false);
					TardifModMod.queueServerWork(20, () -> {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("0"), false);
						TardifModMod.queueServerWork(20, () -> {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("good bye you absalute loser"), false);
							TardifModMod.queueServerWork(100, () -> {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS, 20,
											Level.ExplosionInteraction.MOB);
							});
						});
					});
				});
			});
		});
	}
}
