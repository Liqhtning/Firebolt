package net.liqht.firebolt.item.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.firebolt.item.ModItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
    public AxeBase(ToolMaterial material) {
        super(material, -1, -2.0f, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS));
    }
}
