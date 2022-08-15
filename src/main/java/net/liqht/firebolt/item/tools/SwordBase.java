package net.liqht.firebolt.item.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.firebolt.item.ModItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, -1, -1.6f, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS));
    }
}
