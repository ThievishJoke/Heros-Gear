package net.hero.heros_gear.block;

import net.hero.heros_gear.HerosGear;
import net.hero.heros_gear.block.custom.ModLampBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    // Pearlarium
    public static final Block LOW_QUALITY_PEARLARIUM_ORE = registerBlock("low_quality_pearlarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 7), AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2.75f, 5.0f).requiresTool()));
    public static final Block PEARLARIUM_ORE = registerBlock("pearlarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(7, 14), AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(2.75f, 5.0f).requiresTool()));
    public static final Block DEEPSLATE_PEARLARIUM_ORE = registerBlock("deepslate_pearlarium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 20), AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.75f, 5.0f).requiresTool()));
    public static final Block RAW_PEARLARIUM_BLOCK = registerBlock("raw_pearlarium_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.75f, 5.0f).requiresTool()));
    public static final Block PEARLARIUM_CRYSTAL_BLOCK = registerBlock("pearlarium_crystal_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.75f, 5.0f).requiresTool()));
    public static final Block PEARLARIUM_ALLOY_SHEET_BLOCK = registerBlock("pearlarium_alloy_sheet_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.75f, 5.0f).requiresTool()));
    public static final Block PEARLARIUM_BLOCK = registerBlock("pearlarium_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.75f, 5.0f).requiresTool()));
    public static final Block PEARLARIUM_SLAB = registerBlock("pearlarium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PEARLARIUM_BLOCK)));
    public static final Block PEARLARIUM_STAIRS = registerBlock("pearlarium_stairs",
            new StairsBlock(PEARLARIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(PEARLARIUM_BLOCK)));
    public static final Block PEARLARIUM_WALL = registerBlock("pearlarium_wall",
            new WallBlock(AbstractBlock.Settings.copy(PEARLARIUM_BLOCK).solid()));
    public static final Block PEARLARIUM_TRAPDOOR = registerBlock("pearlarium_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block PEARLARIUM_LAMP = registerBlock("pearlarium_lamp",
            new net.hero.heros_gear.block.custom.ModLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().luminance(state -> state.get(ModLampBlock.CLICKED) ? 15 : 0)));

    //Nigrum Petramiunium
    public static final Block LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE = registerBlock("low_quality_nigrum_petramiunium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 10), AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).requiresTool()));
    public static final Block NIGRUM_PETRAMIUNIUM_ORE = registerBlock("nigrum_petramiunium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 20), AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).requiresTool()));
    public static final Block DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE = registerBlock("deepslate_nigrum_petramiunium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(15, 25), AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4.0f, 6.0f).requiresTool()));
    public static final Block RAW_NIGRUM_PETRAMIUNIUM_BLOCK = registerBlock("raw_nigrum_petramiunium_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.75f, 5.0f).requiresTool()));
    public static final Block NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK = registerBlock("nigrum_petramiunium_crystal_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f, 5.0f).requiresTool()));
    public static final Block NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK = registerBlock("nigrum_petramiunium_alloy_sheet_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 5.0f).requiresTool()));
    public static final Block NIGRUM_PETRAMIUNIUM_BLOCK = registerBlock("nigrum_petramiunium_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 5.0f).requiresTool()));
    public static final Block NIGRUM_PETRAMIUNIUM_SLAB = registerBlock("nigrum_petramiunium_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NIGRUM_PETRAMIUNIUM_BLOCK)));
    public static final Block NIGRUM_PETRAMIUNIUM_STAIRS = registerBlock("nigrum_petramiunium_stairs",
            new StairsBlock(NIGRUM_PETRAMIUNIUM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(NIGRUM_PETRAMIUNIUM_BLOCK)));
    public static final Block NIGRUM_PETRAMIUNIUM_WALL = registerBlock("nigrum_petramiunium_wall",
            new WallBlock(AbstractBlock.Settings.copy(NIGRUM_PETRAMIUNIUM_BLOCK).solid()));
    public static final Block NIGRUM_PETRAMIUNIUM_TRAPDOOR = registerBlock("nigrum_petramiunium_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block NIGRUM_PETRAMIUNIUM_LAMP = registerBlock("nigrum_petramiunium_lamp",
            new net.hero.heros_gear.block.custom.ModLampBlock(AbstractBlock.Settings.create()
                    .strength(1f).requiresTool().luminance(state -> state.get(ModLampBlock.CLICKED) ? 15 : 0)));

    public static final Block PEARLARIUM_VERTICAL_SLAB = registerBlock("pearlarium_vertical_slab",
            new net.hero.heros_gear.block.custom.ModVerticalSlabBlock(AbstractBlock.Settings.copy(PEARLARIUM_SLAB).nonOpaque()));
    public static final Block NIGRUM_PETRAMIUNIUM_VERTICAL_SLAB = registerBlock("nigrum_petramiunium_vertical_slab",
            new net.hero.heros_gear.block.custom.ModVerticalSlabBlock(AbstractBlock.Settings.copy(NIGRUM_PETRAMIUNIUM_SLAB).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HerosGear.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HerosGear.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        HerosGear.LOGGER.info("Registering ModBlocks for " + HerosGear.MOD_ID);
    }
}
