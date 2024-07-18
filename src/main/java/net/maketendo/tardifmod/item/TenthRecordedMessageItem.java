
package net.maketendo.tardifmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TenthRecordedMessageItem extends RecordItem {
	public TenthRecordedMessageItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tenth_message")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6560);
	}
}
