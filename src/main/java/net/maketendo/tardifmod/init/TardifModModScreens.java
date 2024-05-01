
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.maketendo.tardifmod.client.gui.RefinaryGUIScreen;
import net.maketendo.tardifmod.client.gui.MonitorGUIScreen;
import net.maketendo.tardifmod.client.gui.EngineGUIScreen;
import net.maketendo.tardifmod.client.gui.DimentionSelectionGuiScreen;
import net.maketendo.tardifmod.client.gui.CoordinateSelectGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TardifModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TardifModModMenus.COORDINATE_SELECT_GUI.get(), CoordinateSelectGUIScreen::new);
			MenuScreens.register(TardifModModMenus.DIMENTION_SELECTION_GUI.get(), DimentionSelectionGuiScreen::new);
			MenuScreens.register(TardifModModMenus.MONITOR_GUI.get(), MonitorGUIScreen::new);
			MenuScreens.register(TardifModModMenus.REFINARY_GUI.get(), RefinaryGUIScreen::new);
			MenuScreens.register(TardifModModMenus.ENGINE_GUI.get(), EngineGUIScreen::new);
		});
	}
}
