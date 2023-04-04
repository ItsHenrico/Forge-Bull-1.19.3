package net.henrico.bull.item;

import net.henrico.bull.Bull;
import net.henrico.bull.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bull.MOD_ID);

    public static final RegistryObject<Item> BULL_SPAWN_EGG = ITEMS.register("bull_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BULL, 0x00ff00, 0xff0000,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
