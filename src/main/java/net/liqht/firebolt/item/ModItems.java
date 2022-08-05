package net.liqht.firebolt.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.firebolt.Firebolt;
import net.liqht.firebolt.item.custom.BananaItem;
import net.liqht.firebolt.item.custom.BananaTreeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BANANA = registerItems("banana",
            new BananaItem(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(6).saturationModifier(6f).build()).group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item BANANATREE = registerItems("bananatree",
            new BananaTreeItem(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(1)));

    public static final Item MINION = registerItems("minion",
            new ArmorItem(ModArmorMaterials.MINION, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(1)));





    private static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Firebolt.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Firebolt.LOGGER.debug("Registering Mod Items for " + Firebolt.MOD_ID);
    }
}
