package net.redchujelly.cluttered.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.StandingSignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.redchujelly.cluttered.setup.EntityTypeRegistration;
import net.redchujelly.cluttered.setup.TileEntityRegistration;

public class ClutteredClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRenderers.register(EntityTypeRegistration.CHAIR_ENTITY.get(), ChairEntityRenderer::new);
        BlockEntityRenderers.register(TileEntityRegistration.CLUTTERED_SIGN_BE.get(), StandingSignRenderer::new);
        BlockEntityRenderers.register(TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), HangingSignRenderer::new);
    }
}
