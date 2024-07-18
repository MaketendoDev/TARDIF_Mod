package net.maketendo.tardifmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import net.maketendo.tardifmod.network.TardifModModVariables;

import java.util.HashMap;

public class SaveCoordsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		TardifModModVariables.MapVariables.get(world).PreviousX = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(TardifModModVariables.MapVariables.get(world).X);
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).PreviousY = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(TardifModModVariables.MapVariables.get(world).Y);
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).PreviousZ = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(TardifModModVariables.MapVariables.get(world).Z);
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).PreviousDimension = TardifModModVariables.MapVariables.get(world).TargetDimension;
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).X = guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : "";
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).Y = guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "";
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).Z = guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "";
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).X_TARDIS = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:X_Coord") ? ((EditBox) guistate.get("text:X_Coord")).getValue() : "");
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).Y_TARDIS = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:Y_Coord") ? ((EditBox) guistate.get("text:Y_Coord")).getValue() : "");
		TardifModModVariables.MapVariables.get(world).syncData(world);
		TardifModModVariables.MapVariables.get(world).Z_TARDIS = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:Z_Coord") ? ((EditBox) guistate.get("text:Z_Coord")).getValue() : "");
		TardifModModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7aCoordinates set! "), true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tardis_beep")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tardif_mod:tardis_beep")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
