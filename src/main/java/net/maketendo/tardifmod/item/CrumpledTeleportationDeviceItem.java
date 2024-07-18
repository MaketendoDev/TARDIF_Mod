
package net.maketendo.tardifmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.maketendo.tardifmod.procedures.CrumpledTeleportationDeviceRightclickedProcedure;

import java.util.List;

public class CrumpledTeleportationDeviceItem extends Item {
	public CrumpledTeleportationDeviceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A78where will it take me..."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CrumpledTeleportationDeviceRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}
