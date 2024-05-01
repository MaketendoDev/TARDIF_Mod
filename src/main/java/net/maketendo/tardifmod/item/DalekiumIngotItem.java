
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DalekiumIngotItem extends Item {
	public DalekiumIngotItem() {
		super(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
