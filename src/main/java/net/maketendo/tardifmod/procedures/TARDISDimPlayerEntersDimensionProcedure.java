package net.maketendo.tardifmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.network.TardifModModVariables;
import net.maketendo.tardifmod.TardifModMod;

public class TARDISDimPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (TardifModModVariables.MapVariables.get(world).InteriorLoad == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tardif_mod", "overgrown_canvas_interior"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(0, 10, 0), new BlockPos(0, 10, 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute in tardif_mod:tardis_dim run forceload add 0 0");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute in tardif_mod:tardis_dim run forceload add 1 0");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute in tardif_mod:tardis_dim run forceload add 0 1");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute in tardif_mod:tardis_dim run forceload add 0 -1");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"execute in tardif_mod:tardis_dim run forceload add -1 0");
			TardifModModVariables.MapVariables.get(world).InteriorLoad = true;
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModModVariables.MapVariables.get(world).Desktop = "Grown Interior";
			TardifModModVariables.MapVariables.get(world).syncData(world);
			TardifModMod.queueServerWork(40, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(9, 13, 15), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tardis_msuic_forever")), SoundSource.MUSIC, 2, 1);
					} else {
						_level.playLocalSound(9, 13, 15, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tardis_msuic_forever")), SoundSource.MUSIC, 2, 1, false);
					}
				}
			});
		}
	}
}
