
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.maketendo.tardifmod.block.entity.TARDISExteriorBlockEntity;
import net.maketendo.tardifmod.block.entity.ShipWindowBlockEntity;
import net.maketendo.tardifmod.TardifModMod;

public class TardifModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TardifModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TARDIS_EXTERIOR = register("tardis_exterior", TardifModModBlocks.TARDIS_EXTERIOR, TARDISExteriorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SHIP_WINDOW = register("ship_window", TardifModModBlocks.SHIP_WINDOW, ShipWindowBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
