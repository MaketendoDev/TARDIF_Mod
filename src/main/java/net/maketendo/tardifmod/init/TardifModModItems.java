
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.maketendo.tardifmod.item.Zyton7Item;
import net.maketendo.tardifmod.item.TimeExtenderUpgradeTemplateItem;
import net.maketendo.tardifmod.item.TenthRecordedMessageItem;
import net.maketendo.tardifmod.item.TelepathicUpgradeTemplateItem;
import net.maketendo.tardifmod.item.TARDISKeyItem;
import net.maketendo.tardifmod.item.TARDISItemItem;
import net.maketendo.tardifmod.item.SolderItem;
import net.maketendo.tardifmod.item.RawDalekiumItem;
import net.maketendo.tardifmod.item.PsychicPaperItem;
import net.maketendo.tardifmod.item.PlasticItem;
import net.maketendo.tardifmod.item.PhoneboxItemItem;
import net.maketendo.tardifmod.item.MelartSwordItem;
import net.maketendo.tardifmod.item.MelartShardItem;
import net.maketendo.tardifmod.item.MelartPickaxeItem;
import net.maketendo.tardifmod.item.MelartIngotItem;
import net.maketendo.tardifmod.item.MelartAxeItem;
import net.maketendo.tardifmod.item.MelartArmorItem;
import net.maketendo.tardifmod.item.LaserItemItem;
import net.maketendo.tardifmod.item.JellybabiesItem;
import net.maketendo.tardifmod.item.FoodCubeItem;
import net.maketendo.tardifmod.item.FishFingerandCustardItem;
import net.maketendo.tardifmod.item.EmptyBagItem;
import net.maketendo.tardifmod.item.DrainedZyton7Item;
import net.maketendo.tardifmod.item.DematerialisationCircuitItem;
import net.maketendo.tardifmod.item.DalekiumIngotItem;
import net.maketendo.tardifmod.item.DalekiumArmorItem;
import net.maketendo.tardifmod.item.CrumpledTeleportationDeviceItem;
import net.maketendo.tardifmod.item.CopperScrewdriverItem;
import net.maketendo.tardifmod.item.CommunicationUpgradeTemplateItem;
import net.maketendo.tardifmod.item.CircuitBoardItem;
import net.maketendo.tardifmod.item.ARSUpgradeTemplateItem;
import net.maketendo.tardifmod.TardifModMod;

public class TardifModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TardifModMod.MODID);
	public static final RegistryObject<Item> TARDIS_ITEM = REGISTRY.register("tardis_item", () -> new TARDISItemItem());
	public static final RegistryObject<Item> TARDIS_KEY = REGISTRY.register("tardis_key", () -> new TARDISKeyItem());
	public static final RegistryObject<Item> ROUNDEL_DOOR = doubleBlock(TardifModModBlocks.ROUNDEL_DOOR);
	public static final RegistryObject<Item> ROUNDEL = block(TardifModModBlocks.ROUNDEL);
	public static final RegistryObject<Item> COPPER_SCREWDRIVER = REGISTRY.register("copper_screwdriver", () -> new CopperScrewdriverItem());
	public static final RegistryObject<Item> PSYCHIC_PAPER = REGISTRY.register("psychic_paper", () -> new PsychicPaperItem());
	public static final RegistryObject<Item> PLASTIC = REGISTRY.register("plastic", () -> new PlasticItem());
	public static final RegistryObject<Item> CLASSICGRASS = block(TardifModModBlocks.CLASSICGRASS);
	public static final RegistryObject<Item> CLASSIC_STONE = block(TardifModModBlocks.CLASSIC_STONE);
	public static final RegistryObject<Item> CLASSIC_SAND = block(TardifModModBlocks.CLASSIC_SAND);
	public static final RegistryObject<Item> CLASSIC_LEAVES = block(TardifModModBlocks.CLASSIC_LEAVES);
	public static final RegistryObject<Item> CLASSIC_LOG = block(TardifModModBlocks.CLASSIC_LOG);
	public static final RegistryObject<Item> CLASSIC_DIRT = block(TardifModModBlocks.CLASSIC_DIRT);
	public static final RegistryObject<Item> PLASTIC_ORE = block(TardifModModBlocks.PLASTIC_ORE);
	public static final RegistryObject<Item> CLASSIC_NETHERACK = block(TardifModModBlocks.CLASSIC_NETHERACK);
	public static final RegistryObject<Item> MONITOR = block(TardifModModBlocks.MONITOR);
	public static final RegistryObject<Item> MINT_ROUNDEL = block(TardifModModBlocks.MINT_ROUNDEL);
	public static final RegistryObject<Item> MINT_ROUNDEL_DOOR = doubleBlock(TardifModModBlocks.MINT_ROUNDEL_DOOR);
	public static final RegistryObject<Item> ROTOR = block(TardifModModBlocks.ROTOR);
	public static final RegistryObject<Item> CIRCUIT_BOARD = REGISTRY.register("circuit_board", () -> new CircuitBoardItem());
	public static final RegistryObject<Item> SOLDER = REGISTRY.register("solder", () -> new SolderItem());
	public static final RegistryObject<Item> SOLDER_ORE = block(TardifModModBlocks.SOLDER_ORE);
	public static final RegistryObject<Item> ZYTON_7 = REGISTRY.register("zyton_7", () -> new Zyton7Item());
	public static final RegistryObject<Item> DRAINED_ZYTON_7 = REGISTRY.register("drained_zyton_7", () -> new DrainedZyton7Item());
	public static final RegistryObject<Item> ZYTON_7_BLOCK = block(TardifModModBlocks.ZYTON_7_BLOCK);
	public static final RegistryObject<Item> DRAINED_ZYTON_7_BLOCK = block(TardifModModBlocks.DRAINED_ZYTON_7_BLOCK);
	public static final RegistryObject<Item> ZYTON_ORE = block(TardifModModBlocks.ZYTON_ORE);
	public static final RegistryObject<Item> JELLYBABIES = REGISTRY.register("jellybabies", () -> new JellybabiesItem());
	public static final RegistryObject<Item> EMPTY_BAG = REGISTRY.register("empty_bag", () -> new EmptyBagItem());
	public static final RegistryObject<Item> FISH_FINGERAND_CUSTARD = REGISTRY.register("fish_fingerand_custard", () -> new FishFingerandCustardItem());
	public static final RegistryObject<Item> CLASSIC_WHITE_WOOL = block(TardifModModBlocks.CLASSIC_WHITE_WOOL);
	public static final RegistryObject<Item> CLASSIC_LIGHT_GRAY_WOOL = block(TardifModModBlocks.CLASSIC_LIGHT_GRAY_WOOL);
	public static final RegistryObject<Item> FOOD_CUBE_MACHINE = block(TardifModModBlocks.FOOD_CUBE_MACHINE);
	public static final RegistryObject<Item> FOOD_CUBE = REGISTRY.register("food_cube", () -> new FoodCubeItem());
	public static final RegistryObject<Item> CLASSIC_GRAY_WOOL = block(TardifModModBlocks.CLASSIC_GRAY_WOOL);
	public static final RegistryObject<Item> CLASSIC_YELLOW_WOOL = block(TardifModModBlocks.CLASSIC_YELLOW_WOOL);
	public static final RegistryObject<Item> CLASSIC_BLUE_WOOL = block(TardifModModBlocks.CLASSIC_BLUE_WOOL);
	public static final RegistryObject<Item> CLASSIC_AQUA_WOOL = block(TardifModModBlocks.CLASSIC_AQUA_WOOL);
	public static final RegistryObject<Item> CLASSIC_CYAN_WOOL = block(TardifModModBlocks.CLASSIC_CYAN_WOOL);
	public static final RegistryObject<Item> CLASSIC_GREEN_WOOL = block(TardifModModBlocks.CLASSIC_GREEN_WOOL);
	public static final RegistryObject<Item> CLASSIC_LIME_WOOL = block(TardifModModBlocks.CLASSIC_LIME_WOOL);
	public static final RegistryObject<Item> CLASSIC_TEAL_WOOL = block(TardifModModBlocks.CLASSIC_TEAL_WOOL);
	public static final RegistryObject<Item> CLASSIC_PURPLE_WOOL = block(TardifModModBlocks.CLASSIC_PURPLE_WOOL);
	public static final RegistryObject<Item> CLASSIC_INDIGO_WOOL = block(TardifModModBlocks.CLASSIC_INDIGO_WOOL);
	public static final RegistryObject<Item> CLASSIC_MAGENTA_WOOL = block(TardifModModBlocks.CLASSIC_MAGENTA_WOOL);
	public static final RegistryObject<Item> CLASSIC_RED_WOOL = block(TardifModModBlocks.CLASSIC_RED_WOOL);
	public static final RegistryObject<Item> CLASSIC_ORANGE_WOOL = block(TardifModModBlocks.CLASSIC_ORANGE_WOOL);
	public static final RegistryObject<Item> TENTH_CYBERMAN_SPAWN_EGG = REGISTRY.register("tenth_cyberman_spawn_egg", () -> new ForgeSpawnEggItem(TardifModModEntities.TENTH_CYBERMAN, -7434610, -14606047, new Item.Properties()));
	public static final RegistryObject<Item> LASER_ITEM = REGISTRY.register("laser_item", () -> new LaserItemItem());
	public static final RegistryObject<Item> TARDIS_EXTERIOR = block(TardifModModBlocks.TARDIS_EXTERIOR);
	public static final RegistryObject<Item> THE_MOMENT = block(TardifModModBlocks.THE_MOMENT);
	public static final RegistryObject<Item> TARDIS_MAINTENANCE_ENGINE = block(TardifModModBlocks.TARDIS_MAINTENANCE_ENGINE);
	public static final RegistryObject<Item> TELEPATHIC_UPGRADE_TEMPLATE = REGISTRY.register("telepathic_upgrade_template", () -> new TelepathicUpgradeTemplateItem());
	public static final RegistryObject<Item> TIME_EXTENDER_UPGRADE_TEMPLATE = REGISTRY.register("time_extender_upgrade_template", () -> new TimeExtenderUpgradeTemplateItem());
	public static final RegistryObject<Item> ARS_UPGRADE_TEMPLATE = REGISTRY.register("ars_upgrade_template", () -> new ARSUpgradeTemplateItem());
	public static final RegistryObject<Item> COMMUNICATION_UPGRADE_TEMPLATE = REGISTRY.register("communication_upgrade_template", () -> new CommunicationUpgradeTemplateItem());
	public static final RegistryObject<Item> PHONEBOX_DECORATION = block(TardifModModBlocks.PHONEBOX_DECORATION);
	public static final RegistryObject<Item> PHONEBOX_ITEM = REGISTRY.register("phonebox_item", () -> new PhoneboxItemItem());
	public static final RegistryObject<Item> DALEKIUM_INGOT = REGISTRY.register("dalekium_ingot", () -> new DalekiumIngotItem());
	public static final RegistryObject<Item> DALEKIUM_ORE = block(TardifModModBlocks.DALEKIUM_ORE);
	public static final RegistryObject<Item> RAW_DALEKIUM = REGISTRY.register("raw_dalekium", () -> new RawDalekiumItem());
	public static final RegistryObject<Item> RAW_DALEKIUM_BLOCK = block(TardifModModBlocks.RAW_DALEKIUM_BLOCK);
	public static final RegistryObject<Item> MELART_BLOCK = block(TardifModModBlocks.MELART_BLOCK);
	public static final RegistryObject<Item> NITRO_9 = block(TardifModModBlocks.NITRO_9);
	public static final RegistryObject<Item> DALEKIUM_REFINERY = block(TardifModModBlocks.DALEKIUM_REFINERY);
	public static final RegistryObject<Item> MELART_INGOT = REGISTRY.register("melart_ingot", () -> new MelartIngotItem());
	public static final RegistryObject<Item> MELART_ARMOR_HELMET = REGISTRY.register("melart_armor_helmet", () -> new MelartArmorItem.Helmet());
	public static final RegistryObject<Item> MELART_ARMOR_CHESTPLATE = REGISTRY.register("melart_armor_chestplate", () -> new MelartArmorItem.Chestplate());
	public static final RegistryObject<Item> MELART_ARMOR_LEGGINGS = REGISTRY.register("melart_armor_leggings", () -> new MelartArmorItem.Leggings());
	public static final RegistryObject<Item> MELART_ARMOR_BOOTS = REGISTRY.register("melart_armor_boots", () -> new MelartArmorItem.Boots());
	public static final RegistryObject<Item> MELART_PICKAXE = REGISTRY.register("melart_pickaxe", () -> new MelartPickaxeItem());
	public static final RegistryObject<Item> MELART_AXE = REGISTRY.register("melart_axe", () -> new MelartAxeItem());
	public static final RegistryObject<Item> MELART_SWORD = REGISTRY.register("melart_sword", () -> new MelartSwordItem());
	public static final RegistryObject<Item> DALEKIUM_ARMOR_HELMET = REGISTRY.register("dalekium_armor_helmet", () -> new DalekiumArmorItem.Helmet());
	public static final RegistryObject<Item> DALEKIUM_ARMOR_CHESTPLATE = REGISTRY.register("dalekium_armor_chestplate", () -> new DalekiumArmorItem.Chestplate());
	public static final RegistryObject<Item> DALEKIUM_ARMOR_LEGGINGS = REGISTRY.register("dalekium_armor_leggings", () -> new DalekiumArmorItem.Leggings());
	public static final RegistryObject<Item> DALEKIUM_ARMOR_BOOTS = REGISTRY.register("dalekium_armor_boots", () -> new DalekiumArmorItem.Boots());
	public static final RegistryObject<Item> MELART_SHARD = REGISTRY.register("melart_shard", () -> new MelartShardItem());
	public static final RegistryObject<Item> DALEKIUM_BLOCK = block(TardifModModBlocks.DALEKIUM_BLOCK);
	public static final RegistryObject<Item> WALLPAPER_ROUNDEL = block(TardifModModBlocks.WALLPAPER_ROUNDEL);
	public static final RegistryObject<Item> WALLPAPER_ROUNDEL_DOOR = doubleBlock(TardifModModBlocks.WALLPAPER_ROUNDEL_DOOR);
	public static final RegistryObject<Item> PLAIN_WALLPAPER = block(TardifModModBlocks.PLAIN_WALLPAPER);
	public static final RegistryObject<Item> HEXAGON_ROUNDEL = block(TardifModModBlocks.HEXAGON_ROUNDEL);
	public static final RegistryObject<Item> MINT_WALLPAPER = block(TardifModModBlocks.MINT_WALLPAPER);
	public static final RegistryObject<Item> WHITE_WALLPAPER = block(TardifModModBlocks.WHITE_WALLPAPER);
	public static final RegistryObject<Item> PLAIN_WALLPAPER_SLAB = block(TardifModModBlocks.PLAIN_WALLPAPER_SLAB);
	public static final RegistryObject<Item> PLAIN_WALLPAPER_STAIR = block(TardifModModBlocks.PLAIN_WALLPAPER_STAIR);
	public static final RegistryObject<Item> WHITE_WALLPAPER_SLAB = block(TardifModModBlocks.WHITE_WALLPAPER_SLAB);
	public static final RegistryObject<Item> WHITE_WALLPAPER_STAIRS = block(TardifModModBlocks.WHITE_WALLPAPER_STAIRS);
	public static final RegistryObject<Item> MINT_WALLPAPER_SLAB = block(TardifModModBlocks.MINT_WALLPAPER_SLAB);
	public static final RegistryObject<Item> MINT_WALLPAPER_STAIRS = block(TardifModModBlocks.MINT_WALLPAPER_STAIRS);
	public static final RegistryObject<Item> TALL_ROUNDEL_DOOR = block(TardifModModBlocks.TALL_ROUNDEL_DOOR);
	public static final RegistryObject<Item> TALL_WALLPAPER_ROUNDEL_DOOR = block(TardifModModBlocks.TALL_WALLPAPER_ROUNDEL_DOOR);
	public static final RegistryObject<Item> TALL_MINT_ROUNDEL_DOOR = block(TardifModModBlocks.TALL_MINT_ROUNDEL_DOOR);
	public static final RegistryObject<Item> HEXAGONAL_FRAME_CENTERED = block(TardifModModBlocks.HEXAGONAL_FRAME_CENTERED);
	public static final RegistryObject<Item> HEXAGONAL_FRAME_OFFSET = block(TardifModModBlocks.HEXAGONAL_FRAME_OFFSET);
	public static final RegistryObject<Item> TARDIS_INTERIOR_DOOR = block(TardifModModBlocks.TARDIS_INTERIOR_DOOR);
	public static final RegistryObject<Item> DEMATERIALISATION_CARPET_CONTROL = block(TardifModModBlocks.DEMATERIALISATION_CARPET_CONTROL);
	public static final RegistryObject<Item> TIME_MOVEMENT_CARPET_CONTROL = block(TardifModModBlocks.TIME_MOVEMENT_CARPET_CONTROL);
	public static final RegistryObject<Item> DIMENSIONAL_SELECTOR_CARPET_CONTROL = block(TardifModModBlocks.DIMENSIONAL_SELECTOR_CARPET_CONTROL);
	public static final RegistryObject<Item> COORDINATE_TRAVEL_CARPET_CONTROL = block(TardifModModBlocks.COORDINATE_TRAVEL_CARPET_CONTROL);
	public static final RegistryObject<Item> TELAPATHIC_CARPET_CONTROL = block(TardifModModBlocks.TELAPATHIC_CARPET_CONTROL);
	public static final RegistryObject<Item> CRUMPLED_TELEPORTATION_DEVICE = REGISTRY.register("crumpled_teleportation_device", () -> new CrumpledTeleportationDeviceItem());
	public static final RegistryObject<Item> TENTH_RECORDED_MESSAGE = REGISTRY.register("tenth_recorded_message", () -> new TenthRecordedMessageItem());
	public static final RegistryObject<Item> DEMATERIALISATION_CIRCUIT = REGISTRY.register("dematerialisation_circuit", () -> new DematerialisationCircuitItem());
	public static final RegistryObject<Item> FOURTEENTH_ROTOR = block(TardifModModBlocks.FOURTEENTH_ROTOR);
	public static final RegistryObject<Item> TWELVETH_ROTOR = block(TardifModModBlocks.TWELVETH_ROTOR);
	public static final RegistryObject<Item> ELEVENTH_ROTOR = block(TardifModModBlocks.ELEVENTH_ROTOR);
	public static final RegistryObject<Item> ELEVENTH_TOYOTA_ROTOR = block(TardifModModBlocks.ELEVENTH_TOYOTA_ROTOR);
	public static final RegistryObject<Item> TENTH_ROTOR = block(TardifModModBlocks.TENTH_ROTOR);
	public static final RegistryObject<Item> EIGHTH_ROTOR = block(TardifModModBlocks.EIGHTH_ROTOR);
	public static final RegistryObject<Item> FIFTH_ROTOR = block(TardifModModBlocks.FIFTH_ROTOR);
	public static final RegistryObject<Item> FOURTH_ROTOR = block(TardifModModBlocks.FOURTH_ROTOR);
	public static final RegistryObject<Item> COG_ROUNDEL = block(TardifModModBlocks.COG_ROUNDEL);
	public static final RegistryObject<Item> DALEK_SPAWN_EGG = REGISTRY.register("dalek_spawn_egg", () -> new ForgeSpawnEggItem(TardifModModEntities.DALEK, -6724096, -6737152, new Item.Properties()));
	public static final RegistryObject<Item> DRYSTONELOG = block(TardifModModBlocks.DRYSTONELOG);
	public static final RegistryObject<Item> DRYSTONEWOOD = block(TardifModModBlocks.DRYSTONEWOOD);
	public static final RegistryObject<Item> PETRIFIED_DIRT = block(TardifModModBlocks.PETRIFIED_DIRT);
	public static final RegistryObject<Item> PETRIFIED_GRASS_BLOCK = block(TardifModModBlocks.PETRIFIED_GRASS_BLOCK);
	public static final RegistryObject<Item> PETRIFIED_GRASS = block(TardifModModBlocks.PETRIFIED_GRASS);
	public static final RegistryObject<Item> RAIDIATED_SAND = block(TardifModModBlocks.RAIDIATED_SAND);
	public static final RegistryObject<Item> DRY_STONE_PLANKS = block(TardifModModBlocks.DRY_STONE_PLANKS);
	public static final RegistryObject<Item> WEAK_DRYSTONE_PLANKS = block(TardifModModBlocks.WEAK_DRYSTONE_PLANKS);
	public static final RegistryObject<Item> PETRIFIED_STONE = block(TardifModModBlocks.PETRIFIED_STONE);
	public static final RegistryObject<Item> PETRIFIED_COBBLESTONE = block(TardifModModBlocks.PETRIFIED_COBBLESTONE);
	public static final RegistryObject<Item> TARDIS_EXIT_VOID = block(TardifModModBlocks.TARDIS_EXIT_VOID);
	public static final RegistryObject<Item> CORRIDORS_VOID = block(TardifModModBlocks.CORRIDORS_VOID);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
