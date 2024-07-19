package net.maketendo.tardifmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import net.maketendo.tardifmod.network.TardifModModVariables;

import java.util.HashMap;

public class SetLevelProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		TardifModModVariables.WorldVariables.get(world).TARDISLightLevel = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:LightLevel") ? ((EditBox) guistate.get("text:LightLevel")).getValue() : "");
		TardifModModVariables.WorldVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
