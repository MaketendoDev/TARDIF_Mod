package net.maketendo.tardifmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.maketendo.tardifmod.network.TardifModModVariables;

public class CorridorsVoidOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:tardis_dim"))) {
			if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
				ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:tardis_coridoor_dim"));
				if (_player.level().dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
			if (TardifModModVariables.MapVariables.get(world).LoadedCorridors == false) {
				{
					Entity _ent = entity;
					_ent.teleportTo(0, 4, 0);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(0, 4, 0, _ent.getYRot(), _ent.getXRot());
				}
			} else {
				{
					Entity _ent = entity;
					_ent.teleportTo(118, 36, 3);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(118, 36, 3, _ent.getYRot(), _ent.getXRot());
				}
			}
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:tardis_coridoor_dim"))) {
			if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
				ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("tardif_mod:tardis_dim"));
				if (_player.level().dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(28, 13, 18);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(28, 13, 18, _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
