
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TARDISKeyItem extends Item {
	public TARDISKeyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
