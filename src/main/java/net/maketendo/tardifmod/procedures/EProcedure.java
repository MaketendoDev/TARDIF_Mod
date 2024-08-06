package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class EProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(((new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).X_TARDIS) + " ") + ""
							+ (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Y_TARDIS) + " ") + (new java.text.DecimalFormat("##").format(TardifModModVariables.MapVariables.get(world).Z_TARDIS) + " "))),
							false);
	}
}
