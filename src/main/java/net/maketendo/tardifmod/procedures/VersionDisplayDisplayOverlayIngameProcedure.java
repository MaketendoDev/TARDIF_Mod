package net.maketendo.tardifmod.procedures;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class VersionDisplayDisplayOverlayIngameProcedure {
	public static boolean execute() {
		if (TardifModModVariables.BetaTesting == false) {
			return false;
		}
		return true;
	}
}
