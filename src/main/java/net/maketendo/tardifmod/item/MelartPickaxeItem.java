
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.maketendo.tardifmod.init.TardifModModItems;

public class MelartPickaxeItem extends PickaxeItem {
	public MelartPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TardifModModItems.MELART_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
