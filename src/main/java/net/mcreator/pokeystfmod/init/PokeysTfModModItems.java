
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pokeystfmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pokeystfmod.item.SyrengeammoItem;
import net.mcreator.pokeystfmod.item.HwgammoItem;
import net.mcreator.pokeystfmod.item.Heavytf2minigunItem;
import net.mcreator.pokeystfmod.PokeysTfModMod;

public class PokeysTfModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PokeysTfModMod.MODID);
	public static final RegistryObject<Item> SYRENGEAMMO = REGISTRY.register("syrengeammo", () -> new SyrengeammoItem());
	public static final RegistryObject<Item> MEDIC_SPAWN_EGG = REGISTRY.register("medic_spawn_egg", () -> new ForgeSpawnEggItem(PokeysTfModModEntities.MEDIC, -3407872, -1, new Item.Properties()));
	public static final RegistryObject<Item> HWGAMMO = REGISTRY.register("hwgammo", () -> new HwgammoItem());
	public static final RegistryObject<Item> HEAVYTF_2MINIGUN = REGISTRY.register("heavytf_2minigun", () -> new Heavytf2minigunItem());
}
