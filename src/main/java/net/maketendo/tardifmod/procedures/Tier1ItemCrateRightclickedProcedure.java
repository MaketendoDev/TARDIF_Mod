package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.maketendo.tardifmod.init.TardifModModItems;

public class Tier1ItemCrateRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 5; index0++) {
			if ((itemstack.getOrCreateTag().getString("CrateType")).equals("Medical")) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("tardif_mod:medical_crate_basic"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if ((itemstack.getOrCreateTag().getString("CrateType")).equals("Food")) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("tardif_mod:food_crate_basic"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:general_crate_basic"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(TardifModModItems.TIER_1_ITEM_CRATE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
