package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class TARDISInteriorDoorVoidBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String portalWorld = "";
		double portalX = 0;
		double portalY = 0;
		double portalZ = 0;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in " + TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension + " run tp @s " + (TardifModModVariables.MapVariables.get(world).X_TARDIS + " ")
								+ (TardifModModVariables.MapVariables.get(world).Y_TARDIS + " ") + TardifModModVariables.MapVariables.get(world).Z_TARDIS));
			}
		}
		TardifModModVariables.MapVariables.get(world).DoorOpen = false;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if ((TardifModModVariables.MapVariables.get(world).Facing).equals("North")) {
			{
				Entity _ent = entity;
				_ent.setYRot(180);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS - 0.5));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS - 0.5),
							_ent.getYRot(), _ent.getXRot());
			}
		} else {
			if ((TardifModModVariables.MapVariables.get(world).Facing).equals("East")) {
				{
					Entity _ent = entity;
					_ent.setYRot(-90);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5),
								_ent.getYRot(), _ent.getXRot());
				}
			} else {
				if ((TardifModModVariables.MapVariables.get(world).Facing).equals("South")) {
					{
						Entity _ent = entity;
						_ent.setYRot(0);
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS + 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5),
									_ent.getYRot(), _ent.getXRot());
					}
				} else {
					{
						Entity _ent = entity;
						_ent.setYRot(90);
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((TardifModModVariables.MapVariables.get(world).X_TARDIS - 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((TardifModModVariables.MapVariables.get(world).X_TARDIS - 0.5), TardifModModVariables.MapVariables.get(world).Y_TARDIS, (TardifModModVariables.MapVariables.get(world).Z_TARDIS + 0.5),
									_ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		TardifModModVariables.MapVariables.get(world).DoorOpen = false;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("execute in " + (TardifModModVariables.MapVariables.get(world).TARDIS_Current_Dimension + " run tp forceload remove all")));
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "forceload add ~4 ~4 ~-4 ~-4");
			}
		}
	}
}
