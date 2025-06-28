package net.hero.heros_gear.world;

import net.hero.heros_gear.HerosGear;
import net.hero.heros_gear.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEARLARIUM_ORE_KEY = registerKey("pearlarium_ore");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> NIGRUM_PETRAMIUNIUM_ORE_KEY = registerKey("nigrum_petramiunium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldPearlOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.PEARLARIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.LOW_QUALITY_PEARLARIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_PEARLARIUM_ORE.getDefaultState()));

        //List<OreFeatureConfig.Target> overworldNigrumPetramiuniumOres =
        //        List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.NIGRUM_PETRAMIUNIUM_ORE.getDefaultState()),
        //                OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE.getDefaultState()),
        //                OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE.getDefaultState()));

        register(context, PEARLARIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPearlOres, 8));
        //register(context, NIGRUM_PETRAMIUNIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNigrumPetramiuniumOres, 8));

        DataPool.Builder<BlockState> builder = DataPool.builder();
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(HerosGear.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
        RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}