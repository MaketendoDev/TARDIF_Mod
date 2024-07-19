
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.maketendo.tardifmod.TardifModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TardifModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TardifModMod.MODID);
	public static final RegistryObject<CreativeModeTab> TARDIF_ITEMS = REGISTRY.register("tardif_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tardif_mod.tardif_items")).icon(() -> new ItemStack(TardifModModItems.COPPER_SCREWDRIVER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TardifModModItems.COPPER_SCREWDRIVER.get());
				tabData.accept(TardifModModItems.PSYCHIC_PAPER.get());
				tabData.accept(TardifModModItems.LASER_ITEM.get());
				tabData.accept(TardifModModBlocks.THE_MOMENT.get().asItem());
				tabData.accept(TardifModModItems.CRUMPLED_TELEPORTATION_DEVICE.get());
				tabData.accept(TardifModModItems.DEV_ITEM_LIGHT_LEVEL.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> TARDIS_ITEMS = REGISTRY.register("tardis_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tardif_mod.tardis_items")).icon(() -> new ItemStack(TardifModModItems.TARDIS_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TardifModModItems.TARDIS_ITEM.get());
				tabData.accept(TardifModModBlocks.TARDIS_INTERIOR_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.TARDIS_EXIT_VOID.get().asItem());
				tabData.accept(TardifModModItems.TARDIS_KEY.get());
				tabData.accept(TardifModModBlocks.MONITOR.get().asItem());
				tabData.accept(TardifModModBlocks.FOOD_CUBE_MACHINE.get().asItem());
				tabData.accept(TardifModModBlocks.TARDIS_MAINTENANCE_ENGINE.get().asItem());
				tabData.accept(TardifModModItems.TELEPATHIC_UPGRADE_TEMPLATE.get());
				tabData.accept(TardifModModItems.TIME_EXTENDER_UPGRADE_TEMPLATE.get());
				tabData.accept(TardifModModItems.ARS_UPGRADE_TEMPLATE.get());
				tabData.accept(TardifModModItems.COMMUNICATION_UPGRADE_TEMPLATE.get());
				tabData.accept(TardifModModItems.DEMATERIALISATION_CIRCUIT.get());
				tabData.accept(TardifModModBlocks.DEMATERIALISATION_CARPET_CONTROL.get().asItem());
				tabData.accept(TardifModModBlocks.TIME_MOVEMENT_CARPET_CONTROL.get().asItem());
				tabData.accept(TardifModModBlocks.DIMENSIONAL_SELECTOR_CARPET_CONTROL.get().asItem());
				tabData.accept(TardifModModBlocks.COORDINATE_TRAVEL_CARPET_CONTROL.get().asItem());
				tabData.accept(TardifModModBlocks.TELAPATHIC_CARPET_CONTROL.get().asItem());
				tabData.accept(TardifModModBlocks.CORRIDORS_VOID.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> CRATES = REGISTRY.register("crates",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tardif_mod.crates")).icon(() -> new ItemStack(TardifModModItems.TIER_1_ITEM_CRATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TardifModModItems.TIER_1_ITEM_CRATE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> TARDIF_DECORATION = REGISTRY.register("tardif_decoration",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tardif_mod.tardif_decoration")).icon(() -> new ItemStack(TardifModModBlocks.ROUNDEL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TardifModModBlocks.ROUNDEL.get().asItem());
				tabData.accept(TardifModModBlocks.MINT_ROUNDEL.get().asItem());
				tabData.accept(TardifModModBlocks.WALLPAPER_ROUNDEL.get().asItem());
				tabData.accept(TardifModModBlocks.HEXAGON_ROUNDEL.get().asItem());
				tabData.accept(TardifModModBlocks.COG_ROUNDEL.get().asItem());
				tabData.accept(TardifModModBlocks.ROUNDEL_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.MINT_ROUNDEL_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.WALLPAPER_ROUNDEL_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.TALL_ROUNDEL_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.TALL_MINT_ROUNDEL_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.TALL_WALLPAPER_ROUNDEL_DOOR.get().asItem());
				tabData.accept(TardifModModBlocks.MINT_WALLPAPER.get().asItem());
				tabData.accept(TardifModModBlocks.WHITE_WALLPAPER.get().asItem());
				tabData.accept(TardifModModBlocks.PLAIN_WALLPAPER.get().asItem());
				tabData.accept(TardifModModBlocks.WHITE_WALLPAPER_SLAB.get().asItem());
				tabData.accept(TardifModModBlocks.MINT_WALLPAPER_SLAB.get().asItem());
				tabData.accept(TardifModModBlocks.PLAIN_WALLPAPER_SLAB.get().asItem());
				tabData.accept(TardifModModBlocks.WHITE_WALLPAPER_STAIRS.get().asItem());
				tabData.accept(TardifModModBlocks.MINT_WALLPAPER_STAIRS.get().asItem());
				tabData.accept(TardifModModBlocks.PLAIN_WALLPAPER_STAIR.get().asItem());
				tabData.accept(TardifModModBlocks.ROTOR.get().asItem());
				tabData.accept(TardifModModItems.PHONEBOX_ITEM.get());
				tabData.accept(TardifModModBlocks.HEXAGONAL_FRAME_CENTERED.get().asItem());
				tabData.accept(TardifModModBlocks.HEXAGONAL_FRAME_OFFSET.get().asItem());
				tabData.accept(TardifModModBlocks.FOURTEENTH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.TWELVETH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.ELEVENTH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.ELEVENTH_TOYOTA_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.TENTH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.EIGHTH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.FIFTH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.FOURTH_ROTOR.get().asItem());
				tabData.accept(TardifModModBlocks.REGULAR_ROUNDEL_VERTICAL_OFFSET.get().asItem());
				tabData.accept(TardifModModBlocks.REGULAR_ROUNDEL_HORIZONTAL_OFFSET.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> TIME_BLOCKS = REGISTRY.register("time_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tardif_mod.time_blocks")).icon(() -> new ItemStack(TardifModModBlocks.CLASSICGRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TardifModModBlocks.CLASSICGRASS.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_STONE.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_SAND.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_LEAVES.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_LOG.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_DIRT.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_NETHERACK.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_WHITE_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_LIGHT_GRAY_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_GRAY_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_YELLOW_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_BLUE_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_AQUA_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_CYAN_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_GREEN_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_LIME_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_TEAL_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_PURPLE_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_INDIGO_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_MAGENTA_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_RED_WOOL.get().asItem());
				tabData.accept(TardifModModBlocks.CLASSIC_ORANGE_WOOL.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TardifModModBlocks.PLASTIC_ORE.get().asItem());
			tabData.accept(TardifModModBlocks.SOLDER_ORE.get().asItem());
			tabData.accept(TardifModModBlocks.ZYTON_7_BLOCK.get().asItem());
			tabData.accept(TardifModModBlocks.DRAINED_ZYTON_7_BLOCK.get().asItem());
			tabData.accept(TardifModModBlocks.ZYTON_ORE.get().asItem());
			tabData.accept(TardifModModBlocks.MELART_BLOCK.get().asItem());
			tabData.accept(TardifModModBlocks.DALEKIUM_BLOCK.get().asItem());
			tabData.accept(TardifModModBlocks.DRY_STONE_PLANKS.get().asItem());
			tabData.accept(TardifModModBlocks.WEAK_DRYSTONE_PLANKS.get().asItem());
			tabData.accept(TardifModModBlocks.PETRIFIED_COBBLESTONE.get().asItem());
			tabData.accept(TardifModModBlocks.PRESSURISER.get().asItem());
			tabData.accept(TardifModModBlocks.GLOWING_PILLAR.get().asItem());
			tabData.accept(TardifModModBlocks.SHIP_WINDOW.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(TardifModModBlocks.DALEKIUM_REFINERY.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(TardifModModBlocks.NITRO_9.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TardifModModItems.MELART_SWORD.get());
			tabData.accept(TardifModModItems.MELART_ARMOR_HELMET.get());
			tabData.accept(TardifModModItems.MELART_ARMOR_CHESTPLATE.get());
			tabData.accept(TardifModModItems.MELART_ARMOR_LEGGINGS.get());
			tabData.accept(TardifModModItems.MELART_ARMOR_BOOTS.get());
			tabData.accept(TardifModModItems.DALEKIUM_ARMOR_HELMET.get());
			tabData.accept(TardifModModItems.DALEKIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(TardifModModItems.DALEKIUM_ARMOR_LEGGINGS.get());
			tabData.accept(TardifModModItems.DALEKIUM_ARMOR_BOOTS.get());
			tabData.accept(TardifModModItems.SPACE_SUIT_ARMOR_HELMET.get());
			tabData.accept(TardifModModItems.SPACE_SUIT_ARMOR_CHESTPLATE.get());
			tabData.accept(TardifModModItems.SPACE_SUIT_ARMOR_LEGGINGS.get());
			tabData.accept(TardifModModItems.SPACE_SUIT_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TardifModModItems.TENTH_CYBERMAN_SPAWN_EGG.get());
			tabData.accept(TardifModModItems.DALEK_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TardifModModItems.PLASTIC.get());
			tabData.accept(TardifModModItems.SOLDER.get());
			tabData.accept(TardifModModItems.CIRCUIT_BOARD.get());
			tabData.accept(TardifModModItems.MELART_SHARD.get());
			tabData.accept(TardifModModItems.ZYTON_7.get());
			tabData.accept(TardifModModItems.DRAINED_ZYTON_7.get());
			tabData.accept(TardifModModItems.DALEKIUM_INGOT.get());
			tabData.accept(TardifModModItems.RAW_DALEKIUM.get());
			tabData.accept(TardifModModItems.MELART_INGOT.get());
			tabData.accept(TardifModModItems.EMPTY_BAG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TardifModModItems.TENTH_RECORDED_MESSAGE.get());
			tabData.accept(TardifModModItems.MELART_AXE.get());
			tabData.accept(TardifModModItems.MELART_PICKAXE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TardifModModItems.JELLYBABIES.get());
			tabData.accept(TardifModModItems.FISH_FINGERAND_CUSTARD.get());
			tabData.accept(TardifModModItems.FOOD_CUBE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TardifModModBlocks.DALEKIUM_ORE.get().asItem());
			tabData.accept(TardifModModBlocks.RAW_DALEKIUM_BLOCK.get().asItem());
			tabData.accept(TardifModModBlocks.DRYSTONELOG.get().asItem());
			tabData.accept(TardifModModBlocks.DRYSTONEWOOD.get().asItem());
			tabData.accept(TardifModModBlocks.PETRIFIED_DIRT.get().asItem());
			tabData.accept(TardifModModBlocks.PETRIFIED_GRASS_BLOCK.get().asItem());
			tabData.accept(TardifModModBlocks.PETRIFIED_GRASS.get().asItem());
			tabData.accept(TardifModModBlocks.RAIDIATED_SAND.get().asItem());
			tabData.accept(TardifModModBlocks.PETRIFIED_STONE.get().asItem());
			tabData.accept(TardifModModBlocks.SPACE_ROCK.get().asItem());
		}
	}
}
