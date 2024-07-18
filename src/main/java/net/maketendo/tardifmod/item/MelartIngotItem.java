
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MelartIngotItem extends Item {
	public MelartIngotItem() {
		super(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
