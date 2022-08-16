package net.liqht.firebolt.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liqht.firebolt.Firebolt;
import net.liqht.firebolt.entity.ModEntities;
import net.liqht.firebolt.item.custom.BananaItem;
import net.liqht.firebolt.item.custom.BananaTreeItem;
import net.liqht.firebolt.item.custom.MinionArmorItem;
import net.liqht.firebolt.item.tools.*;
import net.liqht.firebolt.item.tools.materials.ToolMaterialUltimateBanana;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BANANA = registerItems("banana",
            new BananaItem(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(6).saturationModifier(6f).build()).group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item BUNDLEOFBANANAS = registerItems("bundleofbananas",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(16)));

    public static final Item CLUSTEROFBANANAS = registerItems("clusterofbananas",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(8)));

    public static final Item ULTIMATEBANANA = registerItems("ultimatebanana",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(1)));

    public static final Item BANANASWORD = registerItems("bananasword",
            new SwordBase(new ToolMaterialUltimateBanana()));

    public static final Item BANANAPICKAXE = registerItems("bananapickaxe",
            new PickaxeBase(new ToolMaterialUltimateBanana()));

    public static final Item BANANAAXE = registerItems("bananaaxe",
            new AxeBase(new ToolMaterialUltimateBanana()));

    public static final Item BANANASHOVEL = registerItems("bananashovel",
            new ShovelBase(new ToolMaterialUltimateBanana()));

    public static final Item BANANAHOE = registerItems("bananahoe",
            new HoeBase(new ToolMaterialUltimateBanana()));

    public static final Item BANANATREE = registerItems("bananatree",
            new BananaTreeItem(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(1)));

    public static final Item MINIONSPAWNEGG = registerItems("minionspawnegg",
            new SpawnEggItem(ModEntities.MINION,0xFFFF00, 0x000000,
                    new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS).maxCount(1)));

    public static final Item MINIONGOGGLES = registerItems("miniongoggles",
            new MinionArmorItem(ModArmorMaterials.MINION, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item OVERALLS = registerItems("overalls",
            new MinionArmorItem(ModArmorMaterials.MINION, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item MINIONLEGGINGS = registerItems("minionleggings",
            new MinionArmorItem(ModArmorMaterials.MINION, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item MINIONBOOTS = registerItems("minionboots",
            new MinionArmorItem(ModArmorMaterials.MINION, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item DENIMFRAGMENT = registerItems("denimfragment",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS)));

    public static final Item DENIM = registerItems("denim",
            new Item(new FabricItemSettings().group(ModItemGroup.CUSTOM_ITEMS)));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Firebolt.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Firebolt.LOGGER.debug("Registering Mod Items for " + Firebolt.MOD_ID);
    }
}
