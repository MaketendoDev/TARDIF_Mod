
package net.maketendo.tardifmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.maketendo.tardifmod.procedures.ScrewdriverRightclickedOnBlockProcedure;

public class CopperScrewdriverItem extends Item {
	public CopperScrewdriverItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ScrewdriverRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
