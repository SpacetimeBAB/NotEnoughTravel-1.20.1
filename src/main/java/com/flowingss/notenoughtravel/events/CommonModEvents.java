package com.flowingss.notenoughtravel.events;

import com.flowingss.notenoughtravel.Inits.EntityInit;
import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.custom.BikeEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.example.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = NotEnoughTravel.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        AttributeSupplier.Builder setAttributes = Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 4)
                .add(Attributes.MOVEMENT_SPEED,2);

        event.put(EntityInit.BIKE.get(), setAttributes.build());





    }


}
