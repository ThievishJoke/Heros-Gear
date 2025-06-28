package net.hero.heros_gear.item;

import net.hero.heros_gear.HerosGear;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> PEARLARIUM_SET;
    public static final RegistryEntry<ArmorMaterial> PEARLARIUM_PLATE_SET;
    public static final RegistryEntry<ArmorMaterial> NIGRUM_PETRAMIUNIUM_SET;
    public static final RegistryEntry<ArmorMaterial> NIGRUM_PETRAMIUNIUM_PLATE_SET;

    private static EnumMap<ArmorItem.Type, Integer> createArmorValuesMap(int boots, int leggings, int chestplate, int helmet, int body) {
        EnumMap<ArmorItem.Type, Integer> map = new EnumMap<>(ArmorItem.Type.class);
        map.put(ArmorItem.Type.BOOTS, boots);
        map.put(ArmorItem.Type.LEGGINGS, leggings);
        map.put(ArmorItem.Type.CHESTPLATE, chestplate);
        map.put(ArmorItem.Type.HELMET, helmet);
        map.put(ArmorItem.Type.BODY, body);
        return map;
    }

    static {
        PEARLARIUM_SET = register("pearlarium_set", createArmorValuesMap(3, 8, 9, 2, 11), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5F, 0.2F,
                () -> Ingredient.ofItems(ModItems.PEARLARIUM_ALLOY_INGOT),
                List.of(new ArmorMaterial.Layer(Identifier.of(HerosGear.MOD_ID, "pearlarium"), "", true)));
        PEARLARIUM_PLATE_SET = register("pearlarium_plate_set", createArmorValuesMap(5, 10, 12, 4, 20), 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5F, 0.2F,
                () -> Ingredient.ofItems(ModItems.PEARLARIUM_ALLOY_PLATE),
                List.of(new ArmorMaterial.Layer(Identifier.of(HerosGear.MOD_ID, "pearlarium_plate"), "", true)));
        NIGRUM_PETRAMIUNIUM_SET = register("nigrum_petraminium_set", createArmorValuesMap(1, 8, 9, 4, 11), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5F, 0.2F,
                () -> Ingredient.ofItems(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT),
                List.of(new ArmorMaterial.Layer(Identifier.of(HerosGear.MOD_ID, "nigrum_petramiunium"), "", true)));
        NIGRUM_PETRAMIUNIUM_PLATE_SET = register("nigrum_petraminium_plate_set", createArmorValuesMap(5, 10, 12, 4, 20), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5F, 0.2F,
                () -> Ingredient.ofItems(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE),
                List.of(new ArmorMaterial.Layer(Identifier.of(HerosGear.MOD_ID, "nigrum_petramiunium_plate"), "", true)));

    }

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enumMap.put(armoritem$type, defense.get(armoritem$type));
        }

        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(HerosGear.MOD_ID, id), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));

    }

}
