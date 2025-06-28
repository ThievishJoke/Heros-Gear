package net.hero.heros_gear.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hero.heros_gear.HerosGear;
import net.hero.heros_gear.block.ModBlocks;
import net.hero.heros_gear.item.ModItems;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> PEARLARIUM_SMELTABLES = List.of(ModItems.RAW_PEARLARIUM,
            ModBlocks.PEARLARIUM_ORE, ModBlocks.DEEPSLATE_PEARLARIUM_ORE);
    private static final List<ItemConvertible> NIGRUM_PETRAMIUNIUM_SMELTABLES = List.of(ModItems.RAW_NIGRUM_PETRAMIUNIUM,
            ModBlocks.NIGRUM_PETRAMIUNIUM_ORE, ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static CraftingRecipeJsonBuilder createHerosStairsRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###");
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, PEARLARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PEARLARIUM_CRYSTAL,
                0.7f, 200, "pearlarium");
        offerBlasting(exporter, PEARLARIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PEARLARIUM_CRYSTAL,
                0.7f, 100, "pearlarium");
        offerSmelting(exporter, NIGRUM_PETRAMIUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL,
                0.7f, 200, "nigrum_petramiunium");
        offerBlasting(exporter, NIGRUM_PETRAMIUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL,
                0.7f, 100, "nigrum_petramiunium");

        offerSmithingTrimRecipe(exporter, ModItems.SHOCK_SMITHING_TEMPLATE, Identifier.of(HerosGear.MOD_ID, "heros_gear"));


        //PEARLARIUM

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEARLARIUM_CRYSTAL, RecipeCategory.DECORATIONS,
                ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEARLARIUM_ALLOY_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PEARLARIUM_ALLOY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PEARLARIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_PEARLARIUM, RecipeCategory.MISC,
                ModBlocks.RAW_PEARLARIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_SLAB, ModBlocks.PEARLARIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_STAIRS, ModBlocks.PEARLARIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_WALL, ModBlocks.PEARLARIUM_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_SLAB, ModBlocks.PEARLARIUM_BLOCK);
        createHerosStairsRecipe(ModBlocks.PEARLARIUM_STAIRS, Ingredient.ofItems(ModBlocks.PEARLARIUM_BLOCK)).criterion(hasItem(ModBlocks.PEARLARIUM_BLOCK),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.PEARLARIUM_BLOCK)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.PEARLARIUM_WALL, ModBlocks.PEARLARIUM_BLOCK);

        //NIGRUM PETRAMIUNIUM

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL, RecipeCategory.DECORATIONS,
                ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET, RecipeCategory.DECORATIONS,
                ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_NIGRUM_PETRAMIUNIUM, RecipeCategory.MISC,
                ModBlocks.RAW_NIGRUM_PETRAMIUNIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_WALL, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        createHerosStairsRecipe(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS, Ingredient.ofItems(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)).criterion(hasItem(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK)).offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.NIGRUM_PETRAMIUNIUM_WALL, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
    }
}
