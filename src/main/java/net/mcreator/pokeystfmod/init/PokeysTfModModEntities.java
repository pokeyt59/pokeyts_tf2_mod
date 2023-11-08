
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pokeystfmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.pokeystfmod.entity.MedicEntity;
import net.mcreator.pokeystfmod.entity.Heavytf2minigunEntity;
import net.mcreator.pokeystfmod.PokeysTfModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeysTfModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PokeysTfModMod.MODID);
	public static final RegistryObject<EntityType<MedicEntity>> MEDIC = register("medic",
			EntityType.Builder.<MedicEntity>of(MedicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MedicEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Heavytf2minigunEntity>> HEAVYTF_2MINIGUN = register("projectile_heavytf_2minigun", EntityType.Builder.<Heavytf2minigunEntity>of(Heavytf2minigunEntity::new, MobCategory.MISC)
			.setCustomClientFactory(Heavytf2minigunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MedicEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MEDIC.get(), MedicEntity.createAttributes().build());
	}
}
