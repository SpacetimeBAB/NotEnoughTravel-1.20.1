package com.flowingss.notenoughtravel.entity.client;

import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.custom.BikeEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class BikeModel extends DefaultedEntityGeoModel<BikeEntity> {
    public BikeModel() {
        super(new ResourceLocation(NotEnoughTravel.MOD_ID, "bike"));
    }

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

    @Override
    public RenderType getRenderType(BikeEntity animatable, ResourceLocation texture) {
        return RenderType.entityTranslucent(getTextureResource(animatable));
    }
}
