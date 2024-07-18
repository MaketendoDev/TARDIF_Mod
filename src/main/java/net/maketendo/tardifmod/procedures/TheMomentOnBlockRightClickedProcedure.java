package net.maketendo.tardifmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.tardifmod.TardifModMod;

public class TheMomentOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double momentconfirm = 0;
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
			entityToSpawn.setVisualOnly(true);
			_level.addFreshEntity(entityToSpawn);
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle dust 0.25 0.23 0.23 1.4 ~ ~1 ~ 0 0.33 0 0 3 normal");
		TardifModMod.queueServerWork(1200, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 50, Level.ExplosionInteraction.BLOCK);
		});
	}
}
