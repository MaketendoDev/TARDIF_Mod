package net.maketendo.tardifmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class FoodCubePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double EffectRandomiser = 0;
		EffectRandomiser = Mth.nextDouble(RandomSource.create(), 1, 10);
		if (EffectRandomiser == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 2, true, false));
		} else {
			if (EffectRandomiser == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120, 2));
			} else {
				if (EffectRandomiser == 3) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 2, true, false));
				} else {
					if (EffectRandomiser == 4) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 2, true, false));
					} else {
						if (EffectRandomiser == 5) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 120, 2, true, false));
						} else {
							if (EffectRandomiser == 6) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 120, 2, true, false));
							} else {
								if (EffectRandomiser == 7) {
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 120, 2, true, false));
								} else {
									if (EffectRandomiser == 8) {
										if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120, 2, true, false));
									} else {
										if (EffectRandomiser == 9) {
											if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120, 2, true, false));
										} else {
											if (EffectRandomiser == 10) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 120, 2, true, false));
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 2, true, false));
	}
}
