
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DematerialisationCircuitItem extends Item {
	public DematerialisationCircuitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
