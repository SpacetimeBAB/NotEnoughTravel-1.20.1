package com.flowingss.notenoughtravel.Inits;

import com.flowingss.notenoughtravel.NotEnoughTravel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NotEnoughTravel.MOD_ID);

    public static final RegistryObject<Item> BIKE_SPAWN_EGG = ITEMS.register("bike_spawn_egg", ()
    -> new ForgeSpawnEggItem(EntityInit.BIKE,0xDFCC8F, 0x2D2611, new Item.Properties()));

    public static final RegistryObject<Item> WHEELS = ITEMS.register("wheels", ()
            -> new Item(new Item.Properties()));









    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




}
