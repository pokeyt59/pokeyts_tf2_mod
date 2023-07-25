package net.mcreator.pokeystfmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pokeystfmod.entity.MedicEntity;

public class MedicModel extends GeoModel<MedicEntity> {
	@Override
	public ResourceLocation getAnimationResource(MedicEntity entity) {
		return new ResourceLocation("pokeys_tf_mod", "animations/medic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MedicEntity entity) {
		return new ResourceLocation("pokeys_tf_mod", "geo/medic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MedicEntity entity) {
		return new ResourceLocation("pokeys_tf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
