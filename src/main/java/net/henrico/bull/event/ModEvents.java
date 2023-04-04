package net.henrico.bull.event;

import net.henrico.bull.Bull;
import net.henrico.bull.entity.ModEntities;
import net.henrico.bull.entity.custom.BullEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bull.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntities.BULL.get(), BullEntity.setAttributes());
    }
}
