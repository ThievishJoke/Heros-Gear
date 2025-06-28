package net.hero.heros_gear.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hero.heros_gear.block.ModBlocks;
import net.hero.heros_gear.block.custom.ModLampBlock;
import net.hero.heros_gear.block.enums.VerticalSlabType;
import net.hero.heros_gear.item.ModItems;
import net.hero.heros_gear.property.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEARLARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PEARLARIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PEARLARIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool pearlarium_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEARLARIUM_BLOCK);
        pearlarium_Pool.slab(ModBlocks.PEARLARIUM_SLAB);
        pearlarium_Pool.stairs(ModBlocks.PEARLARIUM_STAIRS);
        pearlarium_Pool.wall(ModBlocks.PEARLARIUM_WALL);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PEARLARIUM_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.NIGRUM_PETRAMIUNIUM_TRAPDOOR);

        Identifier pearllampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PEARLARIUM_LAMP, blockStateModelGenerator.modelCollector);
        Identifier pearllampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PEARLARIUM_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PEARLARIUM_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(ModLampBlock.CLICKED, pearllampOnIdentifier, pearllampOffIdentifier)));

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NIGRUM_PETRAMIUNIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool nigrum_petramiumium_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        nigrum_petramiumium_Pool.slab(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB);
        nigrum_petramiumium_Pool.stairs(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS);
        nigrum_petramiumium_Pool.wall(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);

        Identifier nigrumpetraminiumlampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.NIGRUM_PETRAMIUNIUM_LAMP, blockStateModelGenerator.modelCollector);
        Identifier nigrumpetraminiumlampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.NIGRUM_PETRAMIUNIUM_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.NIGRUM_PETRAMIUNIUM_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(ModLampBlock.CLICKED, nigrumpetraminiumlampOnIdentifier, nigrumpetraminiumlampOffIdentifier)));

        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.PEARLARIUM_BLOCK, ModBlocks.PEARLARIUM_VERTICAL_SLAB);
        generateVerticalSlabBlockModel(blockStateModelGenerator, ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK, ModBlocks.NIGRUM_PETRAMIUNIUM_VERTICAL_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_PEARLARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLARIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_PEARLARIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_NIGRUM_PETRAMIUNIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRUSHED_NIGRUM_PETRAMIUNIUM, Models.GENERATED);

        //itemModelGenerator.register(ModItems.PEARLARIUM_PLATED_SHIELD, Models.GENERATED);

        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_LONGSWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PEARLARIUM_ALLOY_PLATE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PEARLARIUM_PLATE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_PLATE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_PLATE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_PLATE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NIGRUM_PETRAMIUNIUM_PLATE_BOOTS));

        itemModelGenerator.register(ModItems.PEARLARIUM_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHOCK_SMITHING_TEMPLATE, Models.GENERATED);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, TextureMap textureMap, Block fullBlock, Block block) {
        Identifier modelId = ModModels.VERTICAL_SLAB.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier leftModelId = ModModels.VERTICAL_SLAB_LEFT.upload(block, "_left", textureMap, blockStateModelGenerator.modelCollector);
        Identifier rightModelId = ModModels.VERTICAL_SLAB_RIGHT.upload(block, "_right", textureMap, blockStateModelGenerator.modelCollector);
        Identifier backModelId = ModModels.VERTICAL_SLAB_BACK.upload(block, "_back", textureMap, blockStateModelGenerator.modelCollector);

        blockStateModelGenerator.blockStateCollector.accept(createVerticalSlabBlockState(block, modelId, leftModelId, rightModelId, backModelId, TextureMap.getId(fullBlock)));
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, textureBlock, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String suffix, Block block) {
        generateVerticalSlabBlockModel(blockStateModelGenerator, textureBlock, fullBlock, suffix, suffix, suffix, block);
    }

    private void generateVerticalSlabBlockModel(BlockStateModelGenerator blockStateModelGenerator, Block textureBlock, Block fullBlock, String topSuffix, String sideSuffix, String bottomSuffix, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.TOP, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix))
                .put(TextureKey.SIDE, TextureMap.getId(textureBlock).withSuffixedPath(sideSuffix))
                .put(TextureKey.BOTTOM, TextureMap.getId(textureBlock).withSuffixedPath(bottomSuffix))
                .put(TextureKey.PARTICLE, TextureMap.getId(textureBlock).withSuffixedPath(topSuffix));

        generateVerticalSlabBlockModel(blockStateModelGenerator, textureMap, fullBlock, block);
    }

    public static BlockStateSupplier createVerticalSlabBlockState(Block verticalSlabBlock, Identifier modelId,
                                                                  Identifier leftModelId, Identifier rightModelId, Identifier backModelId, Identifier fullModelId) {
        return VariantsBlockStateSupplier.create(verticalSlabBlock)
                .coordinate(
                        BlockStateVariantMap.create(ModProperties.VERTICAL_SLAB_TYPE)
                                .register(VerticalSlabType.FRONT, BlockStateVariant.create().put(VariantSettings.MODEL, modelId))
                                .register(VerticalSlabType.LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, leftModelId))
                                .register(VerticalSlabType.RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, rightModelId))
                                .register(VerticalSlabType.BACK, BlockStateVariant.create().put(VariantSettings.MODEL, backModelId))
                                .register(VerticalSlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, fullModelId))
                );
    }

}
