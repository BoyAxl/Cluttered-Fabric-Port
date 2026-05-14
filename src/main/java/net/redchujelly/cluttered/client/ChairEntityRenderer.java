package net.redchujelly.cluttered.client;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.world.entity.Entity;

public class ChairEntityRenderer extends EntityRenderer<Entity, EntityRenderState> {
    public ChairEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }
}
