package com.flowingss.notenoughtravel.entity.client;

import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.custom.BikeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BikeRenderer extends GeoEntityRenderer<BikeEntity> {
    public BikeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BikeModel());
    }

    @Override
    public ResourceLocation getTextureLocation(BikeEntity animatable) {
        return new ResourceLocation(NotEnoughTravel.MOD_ID, "textures/entity/tiger.png");
    }

    @Override
    public void render(BikeEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
