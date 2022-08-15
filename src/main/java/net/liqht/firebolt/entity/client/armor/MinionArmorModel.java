package net.liqht.firebolt.entity.client.armor;

import net.liqht.firebolt.Firebolt;
import net.liqht.firebolt.item.custom.MinionArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MinionArmorModel extends AnimatedGeoModel<MinionArmorItem> {
    @Override
    public Identifier getModelResource(MinionArmorItem object) {
        return new Identifier(Firebolt.MOD_ID, "geo/minionarmor.geo.json");
    }

    @Override
    public Identifier getTextureResource(MinionArmorItem object) {
        return new Identifier(Firebolt.MOD_ID, "textures/models/armor/minionarmor.png");
    }

    @Override
    public Identifier getAnimationResource(MinionArmorItem animatable) {
        return new Identifier(Firebolt.MOD_ID, "animations/minionarmor.animation.json");
    }
}
