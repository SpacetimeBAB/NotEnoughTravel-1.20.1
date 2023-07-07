package com.flowingss.notenoughtravel.Inits;

import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.custom.BikeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NotEnoughTravel.MOD_ID);

    public static final RegistryObject<EntityType<BikeEntity>> BIKE =
            ENTITY_TYPES.register("bike",
                    () -> EntityType.Builder.of(BikeEntity::new, MobCategory.MISC)
                            .sized(3f, 2f)
                            .build(new ResourceLocation(NotEnoughTravel.MOD_ID, "bike").toString()));





    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }



}
