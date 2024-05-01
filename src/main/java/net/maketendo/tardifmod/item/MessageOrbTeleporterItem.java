
package net.maketendo.tardifmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.maketendo.tardifmod.procedures.MessageOrbTeleporterRightclickedProcedure;

public class MessageOrbTeleporterItem extends Item {
	public MessageOrbTeleporterItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		MessageOrbTeleporterRightclickedProcedure.execute(world, entity);
		return ar;
	}
}
