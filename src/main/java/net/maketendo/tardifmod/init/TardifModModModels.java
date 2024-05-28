
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.tardifmod.client.model.Modelweeping_angel_two;
import net.maketendo.tardifmod.client.model.Modelweeping_angel_three;
import net.maketendo.tardifmod.client.model.Modelweeping_angel_one;
import net.maketendo.tardifmod.client.model.Modeltenth_cyberman;
import net.maketendo.tardifmod.client.model.Modelpolicebox_fourteen;
import net.maketendo.tardifmod.client.model.Modelmondasian_cybervillager;
import net.maketendo.tardifmod.client.model.Modellaser;
import net.maketendo.tardifmod.client.model.Modelhartnell_console;
import net.maketendo.tardifmod.client.model.Modelcybermantenth;
import net.maketendo.tardifmod.client.model.Modelcopper_console;
import net.maketendo.tardifmod.client.model.Modelclassix_box;
import net.maketendo.tardifmod.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TardifModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellaser.LAYER_LOCATION, Modellaser::createBodyLayer);
		event.registerLayerDefinition(Modelweeping_angel_two.LAYER_LOCATION, Modelweeping_angel_two::createBodyLayer);
		event.registerLayerDefinition(Modelclassix_box.LAYER_LOCATION, Modelclassix_box::createBodyLayer);
		event.registerLayerDefinition(Modelmondasian_cybervillager.LAYER_LOCATION, Modelmondasian_cybervillager::createBodyLayer);
		event.registerLayerDefinition(Modelpolicebox_fourteen.LAYER_LOCATION, Modelpolicebox_fourteen::createBodyLayer);
		event.registerLayerDefinition(Modelweeping_angel_one.LAYER_LOCATION, Modelweeping_angel_one::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_console.LAYER_LOCATION, Modelcopper_console::createBodyLayer);
		event.registerLayerDefinition(Modelcybermantenth.LAYER_LOCATION, Modelcybermantenth::createBodyLayer);
		event.registerLayerDefinition(Modeltenth_cyberman.LAYER_LOCATION, Modeltenth_cyberman::createBodyLayer);
		event.registerLayerDefinition(Modelweeping_angel_three.LAYER_LOCATION, Modelweeping_angel_three::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelhartnell_console.LAYER_LOCATION, Modelhartnell_console::createBodyLayer);
	}
}
