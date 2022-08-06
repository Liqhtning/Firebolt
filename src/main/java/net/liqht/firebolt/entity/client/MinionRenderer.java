package net.liqht.firebolt.entity.client;

import net.liqht.firebolt.Firebolt;
import net.liqht.firebolt.entity.custom.MinionEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MinionRenderer extends GeoEntityRenderer<MinionEntity> {
    public MinionRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MinionModel());
    }

    @Override
    public Identifier getTexture(MinionEntity entity) {
        return new Identifier(Firebolt.MOD_ID, "textures/entity/minion/minion.png");
    }
}
