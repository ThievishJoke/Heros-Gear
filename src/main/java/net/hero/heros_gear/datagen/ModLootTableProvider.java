package net.hero.heros_gear.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hero.heros_gear.block.ModBlocks;
import net.hero.heros_gear.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registeryLookup) {
        super(dataOutput, registeryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LOW_QUALITY_PEARLARIUM_ORE, PearlariumOreDrops(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.PEARLARIUM_ORE, PearlariumOreDrops(ModBlocks.PEARLARIUM_ORE));
        addDrop(ModBlocks.DEEPSLATE_PEARLARIUM_ORE, PearlariumOreDrops(ModBlocks.DEEPSLATE_PEARLARIUM_ORE));
        addDrop(ModBlocks.PEARLARIUM_CRYSTAL_BLOCK);
        addDrop(ModBlocks.PEARLARIUM_ALLOY_SHEET_BLOCK);
        addDrop(ModBlocks.PEARLARIUM_BLOCK);
        addDrop(ModBlocks.PEARLARIUM_SLAB, slabDrops(ModBlocks.PEARLARIUM_SLAB));
        addDrop(ModBlocks.PEARLARIUM_STAIRS);
        addDrop(ModBlocks.PEARLARIUM_WALL);

        addDrop(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE, NigrumPetramiuniumOreDrops(ModBlocks.LOW_QUALITY_NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE, NigrumPetramiuniumOreDrops(ModBlocks.NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE, NigrumPetramiuniumOreDrops(ModBlocks.DEEPSLATE_NIGRUM_PETRAMIUNIUM_ORE));
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_CRYSTAL_BLOCK);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_ALLOY_SHEET_BLOCK);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_BLOCK);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB, slabDrops(ModBlocks.NIGRUM_PETRAMIUNIUM_SLAB));
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_STAIRS);
        addDrop(ModBlocks.NIGRUM_PETRAMIUNIUM_WALL);

        //addDropwithSilkTouch(ModBlocks.<BlockName>);
    }

    public LootTable.Builder PearlariumOreDrops(Block drop) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(ModItems.RAW_PEARLARIUM)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

    public LootTable.Builder NigrumPetramiuniumOreDrops(Block drop) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(ModItems.RAW_NIGRUM_PETRAMIUNIUM)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
