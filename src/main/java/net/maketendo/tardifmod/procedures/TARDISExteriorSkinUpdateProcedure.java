package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class TARDISExteriorSkinUpdateProcedure {
	public static void execute(LevelAccessor world) {
		if (TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
			if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Phonebox")) {
				{
					int _value = 3;
					BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Default Capsule")) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Public Bin")) {
						{
							int _value = 5;
							BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else {
						if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Police Box")) {
							{
								int _value = 7;
								BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				}
			}
		} else {
			if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Phonebox")) {
				{
					int _value = 4;
					BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Default Capsule")) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Public Bin")) {
						{
							int _value = 6;
							BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else {
						if ((TardifModModVariables.MapVariables.get(world).Exterior).equals("Police Box")) {
							{
								int _value = 8;
								BlockPos _pos = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 1, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				}
			}
		}
	}
}
