package net.liqht.firebolt;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.liqht.firebolt.entity.ModEntities;
import net.liqht.firebolt.entity.client.MinionRenderer;
import net.liqht.firebolt.entity.client.armor.MinionArmorRenderer;
import net.liqht.firebolt.item.ModItems;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FireboltClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MINION, MinionRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(new MinionArmorRenderer(), ModItems.MINIONBOOTS,
                ModItems.MINIONLEGGINGS, ModItems.OVERALLS, ModItems.MINIONGOGGLES);
    }
}
