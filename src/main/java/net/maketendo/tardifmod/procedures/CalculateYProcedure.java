package net.maketendo.tardifmod.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class CalculateYProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
			_tf.setValue("Why life is hard");
	}
}
