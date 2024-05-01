
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ARSUpgradeTemplateItem extends Item {
	public ARSUpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}
}
