package net.hero.heros_gear.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.hero.heros_gear.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PEARLARIUM_ORE_PLACED_KEY);

        //BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
        //        GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NIGRUM_PETRAMIUNIUM_ORE_PLACED_KEY);
    }
}