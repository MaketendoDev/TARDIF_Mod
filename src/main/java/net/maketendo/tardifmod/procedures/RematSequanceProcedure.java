package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.init.TardifModModBlocks;
import net.maketendo.tardifmod.TardifModMod;

import java.util.Map;

public class RematSequanceProcedure {
	public static void execute(LevelAccessor world) {
		boolean take_off = false;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level,
					BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS + 2, TardifModModVariables.MapVariables.get(world).Z_TARDIS), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:landing")), SoundSource.AMBIENT, 1, 1);
			} else {
				_level.playLocalSound(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS,
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:landing")), SoundSource.AMBIENT, 1, 1, false);
			}
		}
		{
			BlockPos _bp = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
			BlockState _bs = TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		{
			BlockPos _bp = BlockPos.containing(TardifModModVariables.MapVariables.get(world).X_TARDIS, TardifModModVariables.MapVariables.get(world).Y_TARDIS, TardifModModVariables.MapVariables.get(world).Z_TARDIS);
			BlockState _bs = TardifModModBlocks.TARDIS_EXTERIOR.get().defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		while (true) {
			TardifModMod.queueServerWork(20, () -> {
				ExteriorSelectorProcedure.execute(world);
			});
			break;
		}
	}
}
