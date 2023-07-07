package com.flowingss.notenoughtravel.events;

import com.flowingss.notenoughtravel.Inits.EntityInit;
import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.client.BikeRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NotEnoughTravel.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void clientSetup(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.BIKE.get(), BikeRenderer::new);
       }
}
