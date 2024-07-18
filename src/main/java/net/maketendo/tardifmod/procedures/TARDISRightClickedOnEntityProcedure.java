package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.init.TardifModModItems;

import java.util.List;
import java.util.Comparator;

public class TARDISRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TardifModModItems.TARDIS_KEY.get()) {
					if (TardifModModVariables.MapVariables.get(world).Locked == false && TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
						TardifModModVariables.MapVariables.get(world).Locked = true;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:door_lock")), SoundSource.BLOCKS, (float) 0.3, 1);
							} else {
								_level.playLocalSound(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:door_lock")), SoundSource.BLOCKS, (float) 0.3, 1, false);
							}
						}
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your TARDIS is locked"), true);
					} else if (TardifModModVariables.MapVariables.get(world).Locked == true && TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
						TardifModModVariables.MapVariables.get(world).Locked = false;
						TardifModModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:door_unlock")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:door_unlock")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Your TARDIS is unlocked"), true);
					}
				} else {
					if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEYCOMB) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.HONEYCOMB);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WAX_ON, x, y, z, 5, 1.5, 1.5, 1.5, 1);
					} else {
						if (TardifModModVariables.MapVariables.get(world).Locked == true) {
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("TARDIS is locked..."), true);
						} else {
							if (TardifModModVariables.MapVariables.get(world).DoorOpen == false) {
								TardifModModVariables.MapVariables.get(world).DoorOpen = true;
								TardifModModVariables.MapVariables.get(world).syncData(world);
							} else {
								TardifModModVariables.MapVariables.get(world).DoorOpen = false;
								TardifModModVariables.MapVariables.get(world).syncData(world);
							}
						}
					}
				}
			}
		}
	}
}
