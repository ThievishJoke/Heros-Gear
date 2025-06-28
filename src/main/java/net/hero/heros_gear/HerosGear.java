package net.hero.heros_gear;

import net.fabricmc.api.ModInitializer;
import net.hero.heros_gear.block.ModBlocks;
import net.hero.heros_gear.item.ModItemGroups;
import net.hero.heros_gear.item.ModItems;
import net.hero.heros_gear.util.ModAttributes;
import net.hero.heros_gear.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HerosGear implements ModInitializer {
    public static final String MOD_ID = "heros_gear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModAttributes.registerAttributes();

        ModWorldGeneration.generateModWorldGen();
    }

    private static void registerOxicizables() {
    }
}
