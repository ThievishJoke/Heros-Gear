package net.hero.heros_gear.util;

import net.hero.heros_gear.HerosGear;
import net.minecraft.block.Block;
//import net.minecraft.item.Item;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WEAPON_EFFECIENT =
                createTag("weapon_effecient");
        public static final TagKey<Block> NEEDS_PEARLARIUM_TOOL = createTag("needs_pearlarium_tool");
        public static final TagKey<Block> NEEDS_NIGRUM_PETRAMIUNIUM_TOOL = createTag("needs_nigrum_petramiunium_tool");

        public static final TagKey<Block> INCORRECT_FOR_PEARLARIUM_TOOL = createTag("incorrect_for_pearlarium_tool");
        public static final TagKey<Block> INCORRECT_FOR_PEARLARIUM_PLATE_TOOL = createTag("incorrect_for_pearlarium_plate_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIGRUM_PETRAMIUNIUM_TOOL = createTag("incorrect_for_nigrum_petramiunium_tool");
        public static final TagKey<Block> INCORRECT_FOR_NIGRUM_PETRAMIUNIUM_PLATE_TOOL = createTag("incorrect_for_nigrum_petramiunium_plate_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HerosGear.MOD_ID, name));
        }
    }

    public static class Items {


        public static final TagKey<Item> MATERIAL_DUST =
                createTag("material_dust");
        public static final TagKey<Item> ALLOY_MATERIAL =
                createTag("alloy_material");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HerosGear.MOD_ID, name));
        }
    }

}
