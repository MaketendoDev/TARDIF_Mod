
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.tardifmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.maketendo.tardifmod.TardifModMod;

public class TardifModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TardifModMod.MODID);
	public static final RegistryObject<SoundEvent> CLOISTER_BELL = REGISTRY.register("cloister_bell", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "cloister_bell")));
	public static final RegistryObject<SoundEvent> CREAKING_TARDIS = REGISTRY.register("creaking_tardis", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "creaking_tardis")));
	public static final RegistryObject<SoundEvent> INFLIGHT = REGISTRY.register("inflight", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "inflight")));
	public static final RegistryObject<SoundEvent> LANDING = REGISTRY.register("landing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "landing")));
	public static final RegistryObject<SoundEvent> TIME_THROTTLE = REGISTRY.register("time_throttle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "time_throttle")));
	public static final RegistryObject<SoundEvent> TAKE_OFF = REGISTRY.register("take_off", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "take_off")));
	public static final RegistryObject<SoundEvent> TARDIS_BEEP = REGISTRY.register("tardis_beep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_beep")));
	public static final RegistryObject<SoundEvent> TARDIS_LANDING_BEEP = REGISTRY.register("tardis_landing_beep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_landing_beep")));
	public static final RegistryObject<SoundEvent> TARDIS_POWER_ON = REGISTRY.register("tardis_power_on", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_power_on")));
	public static final RegistryObject<SoundEvent> TARDIS_SHUTDOWN = REGISTRY.register("tardis_shutdown", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_shutdown")));
	public static final RegistryObject<SoundEvent> TARDIS_STABILISERS = REGISTRY.register("tardis_stabilisers", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_stabilisers")));
	public static final RegistryObject<SoundEvent> INTERIOR_CREAK = REGISTRY.register("interior_creak", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "interior_creak")));
	public static final RegistryObject<SoundEvent> TARDIS_COPPER_HUM = REGISTRY.register("tardis_copper_hum", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_copper_hum")));
	public static final RegistryObject<SoundEvent> DOOR_LOCK = REGISTRY.register("door_lock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "door_lock")));
	public static final RegistryObject<SoundEvent> DOOR_UNLOCK = REGISTRY.register("door_unlock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "door_unlock")));
	public static final RegistryObject<SoundEvent> SONIC_SCREWDRIVER = REGISTRY.register("sonic_screwdriver", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "sonic_screwdriver")));
	public static final RegistryObject<SoundEvent> SKARO_AMBIENCE = REGISTRY.register("skaro_ambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "skaro_ambience")));
	public static final RegistryObject<SoundEvent> TENTH_MESSAGE = REGISTRY.register("tenth_message", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tenth_message")));
	public static final RegistryObject<SoundEvent> TARDIS_SFX_GROAN = REGISTRY.register("tardis_sfx_groan", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_sfx_groan")));
	public static final RegistryObject<SoundEvent> TARDIS_GROAN_SFX = REGISTRY.register("tardis_groan_sfx", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_groan_sfx")));
	public static final RegistryObject<SoundEvent> TARDIS_MSUIC_FOREVER = REGISTRY.register("tardis_msuic_forever", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tardif_mod", "tardis_msuic_forever")));
}
