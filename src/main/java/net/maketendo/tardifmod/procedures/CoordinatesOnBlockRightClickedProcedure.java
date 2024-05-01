package net.maketendo.tardifmod.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.world.inventory.CoordinateSelectGUIMenu;
import net.maketendo.tardifmod.network.TardifModModVariables;

import java.util.List;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class CoordinatesOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (TardifModModVariables.MapVariables.get(world).Dematerialised == true) {
					if (!(entityiterator instanceof Player _plr0 && _plr0.containerMenu instanceof CoordinateSelectGUIMenu) && !entityiterator.isShiftKeyDown()) {
						if (entityiterator instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("CoordinateSelectGUI");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new CoordinateSelectGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
					} else if (!(entityiterator instanceof Player _plr3 && _plr3.containerMenu instanceof CoordinateSelectGUIMenu) && entityiterator.isShiftKeyDown()) {
						TardifModModVariables.MapVariables.get(world).DoorPosX = TardifModModVariables.MapVariables.get(world).PreviousX;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						TardifModModVariables.MapVariables.get(world).DoorPosX = TardifModModVariables.MapVariables.get(world).PreviousY;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						TardifModModVariables.MapVariables.get(world).DoorPosX = TardifModModVariables.MapVariables.get(world).PreviousZ;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						TardifModModVariables.MapVariables.get(world).TargetDimension = TardifModModVariables.MapVariables.get(world).PreviousDimension;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7aTARDIS landed to previous position..."), true);
					}
				} else {
					if (entityiterator instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A74You need to be in flight to go to your destination!"), true);
				}
			}
		}
	}
}
