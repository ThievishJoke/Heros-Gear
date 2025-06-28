package net.hero.heros_gear.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hero.heros_gear.block.ModBlocks;
import net.hero.heros_gear.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.WEAPON_EFFECIENT)
                .add(Blocks.COBWEB)
                //.addTag(BlockTags.SWORD_EFFICIENT)
                //.addTag(BlockTags.SAPLINGS)
                //.addTag(BlockTags.SMALL_FLOWERS)
                //.addTag(BlockTags.CROPS)
                .add(
                        Blocks.SHORT_GRASS,
                        Blocks.FERN,
                        Blocks.DEAD_BUSH,
                        Blocks.VINE,
                        Blocks.GLOW_LICHEN,
                        Blocks.SUNFLOWER,
                        Blocks.LILAC,
                        Blocks.ROSE_BUSH,
                        Blocks.PEONY,
                        Blocks.TALL_GRASS,
                        Blocks.LARGE_FERN,
                        Blocks.HANGING_ROOTS,
                        Blocks.PITCHER_PLANT
                )
                .add(
                        Blocks.BROWN_MUSHROOM,
                        Blocks.RED_MUSHROOM,
                        Blocks.SUGAR_CANE,
                        Blocks.PUMPKIN,
                        Blocks.CARVED_PUMPKIN,
                        Blocks.JACK_O_LANTERN,
                        Blocks.MELON,
                        Blocks.ATTACHED_PUMPKIN_STEM,
                        Blocks.ATTACHED_MELON_STEM,
                        Blocks.LILY_PAD,
                        Blocks.COCOA,
                        Blocks.PITCHER_CROP,
                        Blocks.SWEET_BERRY_BUSH,
                        Blocks.CAVE_VINES,
                        Blocks.CAVE_VINES_PLANT,
                        Blocks.SPORE_BLOSSOM,
                        Blocks.MOSS_CARPET,
                        Blocks.PINK_PETALS,
                        Blocks.BIG_DRIPLEAF,
                        Blocks.BIG_DRIPLEAF_STEM,
                        Blocks.SMALL_DRIPLEAF
                )
                .add(
                        Blocks.NETHER_WART,
                        Blocks.WARPED_FUNGUS,
                        Blocks.WARPED_ROOTS,
                        Blocks.NETHER_SPROUTS,
                        Blocks.CRIMSON_FUNGUS,
                        Blocks.WEEPING_VINES,
                        Blocks.WEEPING_VINES_PLANT,
                        Blocks.TWISTING_VINES,
                        Blocks.TWISTING_VINES_PLANT,
                        Blocks.CRIMSON_ROOTS
                )
                .add(
                        Blocks.CHORUS_PLANT,
                        Blocks.CHORUS_FLOWER);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE)
            .add(ModBlocks.PEARLARIUM_ORE)
            .add(ModBlocks.DEEPSLATE_PEARLARIUM_ORE)
            .add(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.PEARLARIUM_BLOCK)
            .add(ModBlocks.PEARLARIUM_SLAB)
            .add(ModBlocks.PEARLARIUM_STAIRS)
            .add(ModBlocks.PEARLARIUM_WALL)
            .add(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.PEARLARIUM_BLOCK)
            .add(ModBlocks.PEARLARIUM_SLAB)
            .add(ModBlocks.PEARLARIUM_STAIRS)
            .add(ModBlocks.PEARLARIUM_WALL)
            .add(ModBlocks.PEARLARIUM_TRAPDOOR)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4")))
            .add(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE)
            .add(ModBlocks.PEARLARIUM_ORE)
            .add(ModBlocks.DEEPSLATE_PEARLARIUM_ORE)
            .add(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE)
            .add(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlocks.PEARLARIUM_WALL)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);

        getOrCreateTagBuilder((BlockTags.TRAPDOORS))
            .add(ModBlocks.PEARLARIUM_TRAPDOOR)
            .add(ModBlocks.NIGRUM_PETRAMIUNIUM_TRAPDOOR);
    }
}
