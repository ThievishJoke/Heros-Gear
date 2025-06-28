package net.hero.heros_gear.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hero.heros_gear.HerosGear;
import net.hero.heros_gear.item.custom.LongSwordItem;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    //metal blahaj
    public static final Item PEARLARIUM_BLAHAJ = registerItem("pearlarium_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item NIGRUM_PETRAMIUNIUM_BLAHAJ = registerItem("nigrum_petramiunium_blahaj", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));


    public static final Item RAW_PEARLARIUM = registerItem("raw_pearlarium", new Item(new Item.Settings().maxCount(64).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_ALLOY_INGOT = registerItem("pearlarium_alloy_ingot", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_ALLOY_PLATE = registerItem("pearlarium_alloy_plate", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_ALLOY_SHEET = registerItem("pearlarium_alloy_sheet", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item PEARLARIUM_CRYSTAL = registerItem("pearlarium_crystal", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item CRUSHED_PEARLARIUM = registerItem("crushed_pearlarium", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));

    public static final Item RAW_NIGRUM_PETRAMIUNIUM = registerItem("raw_nigrum_petramiunium", new Item(new Item.Settings().maxCount(64).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_INGOT = registerItem("nigrum_petramiunium_alloy_ingot", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE = registerItem("nigrum_petramiunium_alloy_plate", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_SHEET = registerItem("nigrum_petramiunium_alloy_sheet", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item NIGRUM_PETRAMIUNIUM_CRYSTAL = registerItem("nigrum_petramiunium_crystal", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));
    public static final Item CRUSHED_NIGRUM_PETRAMIUNIUM = registerItem("crushed_nigrum_petramiunium", new Item(new Item.Settings().maxCount(32).rarity(Rarity.RARE)));


    public static final Item PEARLARIUM_ALLOY_SWORD = registerItem("pearlarium_alloy_sword",
            new SwordItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 8, -2.4f))));
    public static final Item PEARLARIUM_ALLOY_PICKAXE = registerItem("pearlarium_alloy_pickaxe",
            new PickaxeItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 1, -2.8F))));
    public static final Item PEARLARIUM_ALLOY_SHOVEL = registerItem("pearlarium_alloy_shovel",
            new ShovelItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 1.5f, -3.0f))));
    public static final Item PEARLARIUM_ALLOY_AXE = registerItem("pearlarium_alloy_axe",
            new AxeItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 10, -3.0F))));
    public static final Item PEARLARIUM_ALLOY_HOE = registerItem("pearlarium_alloy_hoe",
            new HoeItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, 0, 0.0F))));

    public static final Item PEARLARIUM_ALLOY_LONGSWORD = registerItem("pearlarium_alloy_longsword",
            new LongSwordItem(ModToolMaterials.PEARLARIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(LongSwordItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_INGOT,
                            7,
                            -2.7f,
                            1.5F))));

    public static final Item PEARLARIUM_ALLOY_PLATE_SWORD = registerItem("pearlarium_alloy_plate_sword",
            new SwordItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 10, -2.8f))));
    public static final Item PEARLARIUM_ALLOY_PLATE_PICKAXE = registerItem("pearlarium_alloy_plate_pickaxe",
            new PickaxeItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 1, -2.8F))));
    public static final Item PEARLARIUM_ALLOY_PLATE_SHOVEL = registerItem("pearlarium_alloy_plate_shovel",
            new ShovelItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 1.5f, -3.0f))));
    public static final Item PEARLARIUM_ALLOY_PLATE_AXE = registerItem("pearlarium_alloy_plate_axe",
            new AxeItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 12, -3.3F))));
    public static final Item PEARLARIUM_ALLOY_PLATE_HOE = registerItem("pearlarium_alloy_plate_hoe",
            new HoeItem(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PEARLARIUM_ALLOY_PLATE, 0, 0.0F))));

    public static final Item AIGRUM_PETRAMIUNIUM_ALLOY_SWORD = registerItem("pinka_garnet_sword",
            new SwordItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 3, -2.4f))));
    public static final Item AIGRUM_PETRAMIUNIUM_ALLOY_PICKAXE = registerItem("pinka_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 1, -2.8f))));
    public static final Item AIGRUM_PETRAMIUNIUM_ALLOY_SHOVEL = registerItem("pinka_garnet_shovel",
            new ShovelItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 1.5f, -3.0f))));
    public static final Item AIGRUM_PETRAMIUNIUM_ALLOY_AXE = registerItem("pinka_garnet_axe",
            new AxeItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 6, -3.2f))));
    public static final Item AIGRUM_PETRAMIUNIUM_ALLOY_HOE = registerItem("pinka_garnet_hoe",
            new HoeItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, 0, -3f))));

    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 3, -2.4f))));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 1, -2.8f))));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 1.5f, -3.0f))));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 6, -3.2f))));
    public static final Item NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, 0, -3f))));


    // animal armor
    public static final Item PEARLARIUM_HORSE_ARMOR = registerItem("pearlarium_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PEARLARIUM_SET, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    //trims
    public static final Item SHOCK_SMITHING_TEMPLATE = registerItem("shock_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(HerosGear.MOD_ID, "shock"), FeatureFlags.VANILLA));

    //armor
    public static final Item PEARLARIUM_PLATE_HELMET = registerItem("pearlarium_plate_helmet",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_PLATE_SET, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item PEARLARIUM_PLATE_CHESTPLATE = registerItem("pearlarium_plate_chestplate",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_PLATE_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item PEARLARIUM_PLATE_LEGGINGS = registerItem("pearlarium_plate_leggings",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_PLATE_SET, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item PEARLARIUM_PLATE_BOOTS = registerItem("pearlarium_plate_boots",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_PLATE_SET, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));

    public static final Item NIGRUM_PETRAMIUNIUM_PLATE_HELMET = registerItem("nigrum_petraminium_plate_helmet",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item NIGRUM_PETRAMIUNIUM_PLATE_CHESTPLATE = registerItem("nigrum_petraminium_plate_chestplate",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));
    public static final Item NIGRUM_PETRAMIUNIUM_PLATE_LEGGINGS = registerItem("nigrum_petraminium_plate_leggings",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));
    public static final Item NIGRUM_PETRAMIUNIUM_PLATE_BOOTS = registerItem("nigrum_petraminium_plate_boots",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_PLATE_SET, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));

    public static final Item PEARLARIUM_HELMET = registerItem("pearlarium_helmet",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item PEARLARIUM_CHESTPLATE = registerItem("pearlarium_chestplate",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item PEARLARIUM_LEGGINGS = registerItem("pearlarium_leggings",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item PEARLARIUM_BOOTS = registerItem("pearlarium_boots",
            new ArmorItem(ModArmorMaterials.PEARLARIUM_SET, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item NIGRUM_PETRAMIUNIUM_HELMET = registerItem("nigrum_petramiunium_helmet",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item NIGRUM_PETRAMIUNIUM_CHESTPLATE = registerItem("nigrum_petramiunium_chestplate",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item NIGRUM_PETRAMIUNIUM_LEGGINGS = registerItem("nigrum_petramiunium_leggings",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item NIGRUM_PETRAMIUNIUM_BOOTS = registerItem("nigrum_petramiunium_boots",
            new ArmorItem(ModArmorMaterials.NIGRUM_PETRAMIUNIUM_SET, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    //ShieldItem
    //public static final Item PEARLARIUM_PLATED_SHIELD = registerItem("pearlarium_plated_shield",
    //        new ShieldItem(new Item.Settings().maxCount(1).maxDamage(1008).component(DataComponentTypes.BANNER_PATTERNS, BannerPatternsComponent.DEFAULT)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_PEARLARIUM);
        entries.add(RAW_NIGRUM_PETRAMIUNIUM);
        entries.add(PEARLARIUM_ALLOY_INGOT);
        entries.add(PEARLARIUM_ALLOY_PLATE);
        entries.add(PEARLARIUM_ALLOY_SHEET);
        entries.add(NIGRUM_PETRAMIUNIUM_ALLOY_INGOT);
        entries.add(NIGRUM_PETRAMIUNIUM_ALLOY_PLATE);
        entries.add(NIGRUM_PETRAMIUNIUM_ALLOY_SHEET);

        //entries.add(SHOCK_ARMOR_TRIM_SMITHING_TEMPLATE);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(PEARLARIUM_HELMET);
        entries.add(PEARLARIUM_CHESTPLATE);
        entries.add(PEARLARIUM_LEGGINGS);
        entries.add(PEARLARIUM_BOOTS);
        entries.add(NIGRUM_PETRAMIUNIUM_HELMET);
        entries.add(NIGRUM_PETRAMIUNIUM_CHESTPLATE);
        entries.add(NIGRUM_PETRAMIUNIUM_LEGGINGS);
        entries.add(NIGRUM_PETRAMIUNIUM_BOOTS);

        entries.add(PEARLARIUM_ALLOY_SWORD);
        entries.add(PEARLARIUM_ALLOY_AXE);
    }

    private static void addItemsToInventoryItemGroup(FabricItemGroupEntries entries) {
        entries.add(PEARLARIUM_BLAHAJ);
        entries.add(NIGRUM_PETRAMIUNIUM_BLAHAJ);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HerosGear.MOD_ID, name), item);
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(HerosGear.MOD_ID, path), blockItem);
    }

    public static void registerModItems() {
        HerosGear.LOGGER.info("Registering Mod Items for " + HerosGear.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemsToInventoryItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
