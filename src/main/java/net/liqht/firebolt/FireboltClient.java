package net.liqht.firebolt;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.liqht.firebolt.entity.ModEntities;
import net.liqht.firebolt.entity.client.MinionRenderer;

public class FireboltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MINION, MinionRenderer::new);
    }
}
