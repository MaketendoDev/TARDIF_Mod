
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.maketendo.tardifmod.world.inventory.RefinaryGUIMenu;
import net.maketendo.tardifmod.world.inventory.MonitorGUIMenu;
import net.maketendo.tardifmod.world.inventory.EngineGUIMenu;
import net.maketendo.tardifmod.world.inventory.DimentionSelectionGuiMenu;
import net.maketendo.tardifmod.world.inventory.CoordinateSelectGUIMenu;
import net.maketendo.tardifmod.world.inventory.ChangeLightLevelMenu;
import net.maketendo.tardifmod.TardifModMod;

public class TardifModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TardifModMod.MODID);
	public static final RegistryObject<MenuType<CoordinateSelectGUIMenu>> COORDINATE_SELECT_GUI = REGISTRY.register("coordinate_select_gui", () -> IForgeMenuType.create(CoordinateSelectGUIMenu::new));
	public static final RegistryObject<MenuType<DimentionSelectionGuiMenu>> DIMENTION_SELECTION_GUI = REGISTRY.register("dimention_selection_gui", () -> IForgeMenuType.create(DimentionSelectionGuiMenu::new));
	public static final RegistryObject<MenuType<MonitorGUIMenu>> MONITOR_GUI = REGISTRY.register("monitor_gui", () -> IForgeMenuType.create(MonitorGUIMenu::new));
	public static final RegistryObject<MenuType<RefinaryGUIMenu>> REFINARY_GUI = REGISTRY.register("refinary_gui", () -> IForgeMenuType.create(RefinaryGUIMenu::new));
	public static final RegistryObject<MenuType<EngineGUIMenu>> ENGINE_GUI = REGISTRY.register("engine_gui", () -> IForgeMenuType.create(EngineGUIMenu::new));
	public static final RegistryObject<MenuType<ChangeLightLevelMenu>> CHANGE_LIGHT_LEVEL = REGISTRY.register("change_light_level", () -> IForgeMenuType.create(ChangeLightLevelMenu::new));
}
