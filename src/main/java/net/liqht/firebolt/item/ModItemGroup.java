package net.liqht.firebolt.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.liqht.firebolt.Firebolt;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CUSTOM_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(Firebolt.MOD_ID, "custom_items"), () -> new ItemStack(ModItems.BANANA));
}
