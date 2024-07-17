//package net.maketendo.tardifmod.procedures;

//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.core.Registry;
//import net.minecraft.server.MinecraftServer;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.dimension.DimensionType;
//import net.minecraft.world.level.dimension.LevelStem;
//import net.minecraftforge.server.ServerLifecycleHooks;
//import net.minecraftforge.event.server.ServerStartingEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.common.MinecraftForge;
//import net.minecraft.world.level.storage.LevelStorageSource.LevelStorageAccess;

//public class CreateTARDISDimensionsProcedure {

    //private static final String MODID = "tardif_mod";

    //public static void createNewTardisDimension(String tardisID) {
        //MinecraftServer server = ServerLifecycleHooks.getCurrentServer();
        //ResourceLocation dimensionLocation = new ResourceLocation(MODID, "tardis_" + tardisID);
        //ResourceKey<Level> dimensionKey = ResourceKey.create(Registry.DIMENSION_REGISTRY, dimensionLocation);
        ///ResourceKey<DimensionType> dimensionTypeKey = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(MODID, "tardis"));

        //LevelStem levelStem = new LevelStem(server.registryAccess().registry(Registry.DIMENSION_TYPE).get().get(dimensionTypeKey), null);

       // LevelStorageAccess storageAccess = server.getWorldData().getLevelStorage();
       // levelStem.updateWorldGenSettings(server.getWorldData().getGeneratorSettings(), storageAccess.getLevelPath(LevelResource.INSTANCE), storageAccess.getWorldDirectory());
  //  }

  //  public static void initialize() {
  //      MinecraftForge.EVENT_BUS.register(new Object() {
   //         @SubscribeEvent
   //         public void onServerStarting(ServerStartingEvent event) {
  //              createNewTardisDimension("example_tardis_id");
   //         }
  //      });
//    }
//}
///