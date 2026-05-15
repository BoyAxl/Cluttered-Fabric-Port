package net.redchujelly.cluttered.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.StandingSignRenderer;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.redchujelly.cluttered.setup.EntityTypeRegistration;
import net.redchujelly.cluttered.setup.TileEntityRegistration;

public class ClutteredClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityTypeRegistration.CHAIR_ENTITY.get(), ChairEntityRenderer::new);
        BlockEntityRendererRegistry.register((BlockEntityType) TileEntityRegistration.CLUTTERED_SIGN_BE.get(), StandingSignRenderer::new);
        BlockEntityRendererRegistry.register((BlockEntityType) TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), HangingSignRenderer::new);
    }
}
