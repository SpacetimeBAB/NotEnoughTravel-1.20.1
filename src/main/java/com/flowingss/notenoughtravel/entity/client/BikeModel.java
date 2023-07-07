package com.flowingss.notenoughtravel.entity.client;

import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.custom.BikeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BikeModel extends GeoModel<BikeEntity> {
    @Override
    public ResourceLocation getModelResource(BikeEntity animatable) {
        return new ResourceLocation(NotEnoughTravel.MOD_ID, "geo/bike.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BikeEntity animatable) {
        return new ResourceLocation(NotEnoughTravel.MOD_ID, "textures/entity/bike/bike.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BikeEntity animatable) {
        return new ResourceLocation(NotEnoughTravel.MOD_ID, "animations/model.bike.json");
    }
}
