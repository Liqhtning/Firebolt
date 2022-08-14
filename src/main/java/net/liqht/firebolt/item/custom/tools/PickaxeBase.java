package net.liqht.firebolt.item.custom.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.firebolt.item.ModItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -2.2f, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS));
    }
}
