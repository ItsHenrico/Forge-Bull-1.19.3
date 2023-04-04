package net.henrico.bull.entity.client;

import net.henrico.bull.Bull;
import net.henrico.bull.entity.custom.BullEntity;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animatable.model.CoreGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BullModel extends GeoModel<BullEntity> {
    @Override
    public ResourceLocation getModelResource(BullEntity animatable) {
        return new ResourceLocation(Bull.MOD_ID, "geo/bull.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BullEntity animatable) {
        return new ResourceLocation(Bull.MOD_ID, "textures/entity/bull.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BullEntity animatable) {
        return new ResourceLocation(Bull.MOD_ID, "animations/bull.animation.json");
    }

    @Override
    public void setCustomAnimations(BullEntity animatable, long instanceId, AnimationState<BullEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null){
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);

        }
    }
}
