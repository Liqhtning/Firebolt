package net.liqht.firebolt.entity.client;

import net.liqht.firebolt.Firebolt;
import net.liqht.firebolt.entity.custom.MinionEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class MinionModel extends AnimatedGeoModel<MinionEntity> {
    @Override
    public Identifier getModelResource(MinionEntity object) {
        return new Identifier(Firebolt.MOD_ID, "geo/minion.geo.json");
    }

    @Override
    public Identifier getTextureResource(MinionEntity object) {
        return new Identifier(Firebolt.MOD_ID, "textures/entity/minion/minion.png");
    }

    @Override
    public Identifier getAnimationResource(MinionEntity animatable) {
        return new Identifier(Firebolt.MOD_ID, "animations/minion.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(MinionEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
