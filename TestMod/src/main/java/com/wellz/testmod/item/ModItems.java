package com.wellz.testmod.item;

import com.wellz.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //Creating ITEMS map
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    //Adding items area

    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ASH_INGOT = ITEMS.register("ash_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ASH_PILE = ITEMS.register("ash_pile",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));


    //---------------------------------------------------------//

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
