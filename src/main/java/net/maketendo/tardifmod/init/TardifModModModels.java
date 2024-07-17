
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.tardifmod.client.model.Modelmondasian_cybervillager;
import net.maketendo.tardifmod.client.model.Modellaser;
import net.maketendo.tardifmod.client.model.Modeldalek;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TardifModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldalek.LAYER_LOCATION, Modeldalek::createBodyLayer);
		event.registerLayerDefinition(Modellaser.LAYER_LOCATION, Modellaser::createBodyLayer);
		event.registerLayerDefinition(Modelmondasian_cybervillager.LAYER_LOCATION, Modelmondasian_cybervillager::createBodyLayer);
	}
}
