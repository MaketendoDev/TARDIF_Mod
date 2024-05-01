
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.maketendo.tardifmod.entity.TenthCybermanEntityProjectile;
import net.maketendo.tardifmod.entity.TenthCybermanEntity;
import net.maketendo.tardifmod.entity.LaserEntity;
import net.maketendo.tardifmod.entity.ExteriorDoorEntity;
import net.maketendo.tardifmod.TardifModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TardifModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TardifModMod.MODID);
	public static final RegistryObject<EntityType<TenthCybermanEntity>> TENTH_CYBERMAN = register("tenth_cyberman", EntityType.Builder.<TenthCybermanEntity>of(TenthCybermanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TenthCybermanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TenthCybermanEntityProjectile>> TENTH_CYBERMAN_PROJECTILE = register("projectile_tenth_cyberman",
			EntityType.Builder.<TenthCybermanEntityProjectile>of(TenthCybermanEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(TenthCybermanEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LaserEntity>> LASER = register("laser",
			EntityType.Builder.<LaserEntity>of(LaserEntity::new, MobCategory.MISC).setCustomClientFactory(LaserEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExteriorDoorEntity>> EXTERIOR_DOOR = register("exterior_door", EntityType.Builder.<ExteriorDoorEntity>of(ExteriorDoorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExteriorDoorEntity::new).fireImmune().sized(1.1f, 1.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TenthCybermanEntity.init();
			ExteriorDoorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TENTH_CYBERMAN.get(), TenthCybermanEntity.createAttributes().build());
		event.put(EXTERIOR_DOOR.get(), ExteriorDoorEntity.createAttributes().build());
	}
}
