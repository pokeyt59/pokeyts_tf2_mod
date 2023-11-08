
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pokeystfmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pokeystfmod.PokeysTfModMod;

public class PokeysTfModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PokeysTfModMod.MODID);
	public static final RegistryObject<SoundEvent> MEDIC_HURT_SOUNDS = REGISTRY.register("medic_hurt_sounds", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pokeys_tf_mod", "medic_hurt_sounds")));
	public static final RegistryObject<SoundEvent> MEDIC_DEATH_SOUNDS = REGISTRY.register("medic_death_sounds", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pokeys_tf_mod", "medic_death_sounds")));
	public static final RegistryObject<SoundEvent> MINIGUN_SHOOTING = REGISTRY.register("minigun_shooting", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pokeys_tf_mod", "minigun_shooting")));
}
