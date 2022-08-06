package net.liqht.firebolt.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.liqht.firebolt.Firebolt;
import net.liqht.firebolt.entity.custom.MinionEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<MinionEntity> MINION = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Firebolt.MOD_ID, "minion"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MinionEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

}
