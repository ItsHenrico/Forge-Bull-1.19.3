package net.henrico.bull.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.henrico.bull.Bull;
import net.henrico.bull.entity.custom.BullEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BullRenderer extends GeoEntityRenderer<BullEntity> {
    public BullRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BullModel());
    }

    @Override
    public ResourceLocation getTextureLocation(BullEntity animatable) {
        return new ResourceLocation(Bull.MOD_ID, "textures/entity/bull.png");
    }

    @Override
    public void render(BullEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
