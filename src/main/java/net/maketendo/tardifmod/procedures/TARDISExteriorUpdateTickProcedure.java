package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.init.TardifModModBlocks;
import net.maketendo.tardifmod.TardifModMod;

public class TARDISExteriorUpdateTickProcedure {
	public static void execute(LevelAccessor world) {
		if (TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
			if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Phonebox")) {
				TardifModMod.queueServerWork(1, () -> {
					world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS), (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 4)), 3);
				});
			} else {
				if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Default Capsule")) {
					TardifModMod.queueServerWork(1, () -> {
						world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS), (new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 2)), 3);
					});
				}
			}
		} else {
			if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Phonebox")) {
				TardifModMod.queueServerWork(1, () -> {
					world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS), (new Object() {
						public BlockState with(BlockState _bs, String _property, int _newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
							return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
						}
					}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 3)), 3);
				});
			} else {
				if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Default Capsule")) {
					TardifModMod.queueServerWork(1, () -> {
						world.setBlock(BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS), (new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState(), "blockstate", 1)), 3);
					});
				}
			}
		}
	}
}
