
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TelepathicUpgradeTemplateItem extends Item {
	public TelepathicUpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}
}
