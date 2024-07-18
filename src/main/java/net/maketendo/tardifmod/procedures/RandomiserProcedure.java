package net.maketendo.tardifmod.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class RandomiserProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:X_Coord") instanceof EditBox _tf)
			_tf.setValue((new java.text.DecimalFormat("##.##").format(Math.floor(Math.random() * (100000 - (-100000) + 1) + -100000))));
		if (guistate.get("text:Y_Coord") instanceof EditBox _tf)
			_tf.setValue((new java.text.DecimalFormat("##.##").format(Math.floor(Math.random() * (100 - 0 + 1) + 0))));
		if (guistate.get("text:Z_Coord") instanceof EditBox _tf)
			_tf.setValue((new java.text.DecimalFormat("##.##").format(Math.floor(Math.random() * (100000 - (-100000) + 1) + -100000))));
	}
}
