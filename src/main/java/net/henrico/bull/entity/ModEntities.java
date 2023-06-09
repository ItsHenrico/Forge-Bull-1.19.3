package net.henrico.bull.entity;

import net.henrico.bull.Bull;
import net.henrico.bull.entity.custom.BullEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.w3c.dom.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Bull.MOD_ID);

    public static final RegistryObject<EntityType<BullEntity>> BULL =
        ENTITY_TYPES.register("bull",
                () -> EntityType.Builder.of(BullEntity::new, MobCategory.CREATURE)
                        .sized(1.5f, 1.75f)
                        .build(new ResourceLocation(Bull.MOD_ID, "bull").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
