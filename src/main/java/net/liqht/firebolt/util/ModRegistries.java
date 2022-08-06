package net.liqht.firebolt.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.liqht.firebolt.entity.ModEntities;
import net.liqht.firebolt.entity.custom.MinionEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }



    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MINION, MinionEntity.setAttributes());
    }
}
