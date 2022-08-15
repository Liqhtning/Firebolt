package net.liqht.firebolt.item.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.firebolt.item.ModItemGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial material) {
        super(material, -1, -2.2f, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS));
    }
}
