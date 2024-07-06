
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.maketendo.tardifmod.client.renderer.TenthCybermanRenderer;
import net.maketendo.tardifmod.client.renderer.LaserRenderer;
import net.maketendo.tardifmod.client.renderer.DalekRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TardifModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TardifModModEntities.TENTH_CYBERMAN.get(), TenthCybermanRenderer::new);
		event.registerEntityRenderer(TardifModModEntities.TENTH_CYBERMAN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TardifModModEntities.LASER.get(), LaserRenderer::new);
		event.registerEntityRenderer(TardifModModEntities.DALEK.get(), DalekRenderer::new);
	}
}
