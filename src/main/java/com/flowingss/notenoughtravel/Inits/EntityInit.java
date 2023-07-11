package com.flowingss.notenoughtravel.Inits;

import com.flowingss.notenoughtravel.NotEnoughTravel;
import com.flowingss.notenoughtravel.entity.custom.BikeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NotEnoughTravel.MOD_ID);

    public static final RegistryObject<EntityType<BikeEntity>> BIKE =
            registerMob("bike", BikeEntity::new, 0.8f,0.87f,0xD3E3E6, 0xE9F1F5);





    public static <T extends Mob> RegistryObject<EntityType<T>> registerMob(String name, EntityType.EntityFactory<T> entity,
                                                                            float width, float height, int primaryEggColor, int secondaryEggColor) {
        RegistryObject<EntityType<T>> entityType = ENTITY_TYPES.register(name,
                () -> EntityType.Builder.of(entity, MobCategory.CREATURE).sized(width, height).build(name));

        return entityType;
    }


}
