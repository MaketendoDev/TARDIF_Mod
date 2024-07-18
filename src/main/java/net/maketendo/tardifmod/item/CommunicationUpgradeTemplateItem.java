
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CommunicationUpgradeTemplateItem extends Item {
	public CommunicationUpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}
}
