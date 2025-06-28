package net.hero.heros_gear.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hero.heros_gear.HerosGear;
import net.hero.heros_gear.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //public static final ItemGroup PEARLARIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
    //        new Identifier(HanasBlocks.MOD_ID, "pearlarium_group"),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pearlarium_group"))
    //        .icon(() -> new ItemStack(ModItems.RAW_PEARLARIUM)).entries((displayContext, entries) -> {
    //                entries.add(ModItems.RAW_PEARLARIUM);
    //
    //            }).build());
    //public static final ItemGroup BLAHAJ = Registry.register(Registries.ITEM_GROUP,
    //        Identifier.of(HanasBlocks.MOD_ID, "blahaj"),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blahaj"))
    //        .icon(() -> new ItemStack(ModItems.BLAHAJ)).entries((displayContext, entries) -> {
    //                entries.add(ModItems.PEARLARIUM_BLAHAJ);
    //                entries.add(ModItems.NIGRUM_PETRAMIUNIUM_BLAHAJ);
    //            }).build());

    public static final ItemGroup SHEET_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HerosGear.MOD_ID, "heros_gear_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.heros_stuff"))
                    .icon(() -> new ItemStack(ModItems.PEARLARIUM_ALLOY_SHEET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PEARLARIUM);
                        entries.add(ModItems.PEARLARIUM_ALLOY_INGOT);
                        entries.add(ModItems.PEARLARIUM_ALLOY_PLATE);
                        entries.add(ModItems.PEARLARIUM_ALLOY_SHEET);
                        entries.add(ModItems.PEARLARIUM_CRYSTAL);
                        entries.add(ModItems.CRUSHED_PEARLARIUM);

                        entries.add(ModItems.RAW_NIGRUM_PETRAMIUNIUM);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL);
                        entries.add(ModItems.CRUSHED_NIGRUM_PETRAMIUNIUM);

                        entries.add(ModItems.PEARLARIUM_HELMET);
                        entries.add(ModItems.PEARLARIUM_CHESTPLATE);
                        entries.add(ModItems.PEARLARIUM_LEGGINGS);
                        entries.add(ModItems.PEARLARIUM_BOOTS);
                        entries.add(ModItems.PEARLARIUM_PLATE_HELMET);
                        entries.add(ModItems.PEARLARIUM_PLATE_CHESTPLATE);
                        entries.add(ModItems.PEARLARIUM_PLATE_LEGGINGS);
                        entries.add(ModItems.PEARLARIUM_PLATE_BOOTS);

                        //entries.add(ModItems.PEARLARIUM_PLATED_SHIELD);

                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_HELMET);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_CHESTPLATE);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_LEGGINGS);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_BOOTS);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_HELMET);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_CHESTPLATE);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_LEGGINGS);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_BOOTS);

                        entries.add(ModItems.PEARLARIUM_ALLOY_SWORD);
                        entries.add(ModItems.PEARLARIUM_ALLOY_PLATE_SWORD);
                        entries.add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_SWORD);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SWORD);

                        entries.add(ModItems.PEARLARIUM_ALLOY_LONGSWORD);

                        entries.add(ModItems.PEARLARIUM_ALLOY_PICKAXE);
                        entries.add(ModItems.PEARLARIUM_ALLOY_PLATE_PICKAXE);
                        entries.add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_PICKAXE);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_PICKAXE);

                        entries.add(ModItems.PEARLARIUM_ALLOY_SHOVEL);
                        entries.add(ModItems.PEARLARIUM_ALLOY_PLATE_SHOVEL);
                        entries.add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_SHOVEL);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SHOVEL);

                        entries.add(ModItems.PEARLARIUM_ALLOY_AXE);
                        entries.add(ModItems.PEARLARIUM_ALLOY_PLATE_AXE);
                        entries.add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_AXE);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_AXE);

                        entries.add(ModItems.PEARLARIUM_ALLOY_HOE);
                        entries.add(ModItems.PEARLARIUM_ALLOY_PLATE_HOE);
                        entries.add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_HOE);
                        entries.add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_HOE);

                        entries.add(ModItems.PEARLARIUM_HORSE_ARMOR);

                        entries.add(ModItems.SHOCK_SMITHING_TEMPLATE);

                        entries.add(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE);
                        entries.add(ModBlocks.PEARLARIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PEARLARIUM_ORE);
                        entries.add(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
                        entries.add(ModBlocks.PEARLARIUM_BLOCK);
                        entries.add(ModBlocks.PEARLARIUM_SLAB);
                        entries.add(ModBlocks.PEARLARIUM_STAIRS);
                        entries.add(ModBlocks.PEARLARIUM_WALL);
                        entries.add(ModBlocks.PEARLARIUM_TRAPDOOR);

                        entries.add(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_TRAPDOOR);

                        entries.add(ModBlocks.PEARLARIUM_VERTICAL_SLAB);
                        entries.add(ModBlocks.NIGRUM_PETRAMIUNIUM_VERTICAL_SLAB);
                    }).build());


    public static void registerItemGroups() {
        HerosGear.LOGGER.info("Registering Item Groups for " + HerosGear.MOD_ID);
    }
}