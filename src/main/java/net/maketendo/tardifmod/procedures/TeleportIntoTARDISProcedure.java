package net.maketendo.tardifmod.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries; 
import net.minecraft.network.chat.Component;
import net.minecraft.Util;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import java.util.UUID;

public class TeleportIntoTARDISProcedure {

    public static void execute(ServerPlayer player, String tardisID) {
        String MODID = "tardif_mod"; 
        ResourceLocation dimensionLocation = new ResourceLocation(MODID, "tardis_" + tardisID);
        ResourceKey<Level> dimensionKey = ResourceKey.create(Registries.DIMENSION, dimensionLocation);
        ServerLevel tardisLevel = player.server.getLevel(dimensionKey);

        if (tardisLevel != null) {
            player.teleportTo(tardisLevel, tardisLevel.getSharedSpawnPos().getX(), tardisLevel.getSharedSpawnPos().getY(), tardisLevel.getSharedSpawnPos().getZ(), player.getYRot(), player.getXRot());
        } else {
            player.sendSystemMessage(Component.literal("Failed to find TARDIS dimension"), false);
        }
    }
}
