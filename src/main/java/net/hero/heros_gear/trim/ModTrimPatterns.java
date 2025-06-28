package net.hero.heros_gear.trim;

import net.hero.heros_gear.HerosGear;
import net.hero.heros_gear.item.ModItems;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> SHOCK = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(HerosGear.MOD_ID, "shock"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context);
    }

    private static void register(Registerable<ArmorTrimPattern> context) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(ModTrimPatterns.SHOCK.getValue(), Registries.ITEM.getEntry(ModItems.SHOCK_SMITHING_TEMPLATE),
                Text.translatable(Util.createTranslationKey("trim_pattern", ModTrimPatterns.SHOCK.getValue())), false);

        context.register(ModTrimPatterns.SHOCK, trimPattern);
    }
}