package net.hero.heros_gear.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hero.heros_gear.item.ModItems;
import net.hero.heros_gear.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.MATERIAL_DUST)
                    .add(ModItems.CRUSHED_PEARLARIUM.asItem())
                .add(ModItems.CRUSHED_NIGRUM_PETRAMIUNIUM.asItem())
        ;

        getOrCreateTagBuilder(ModTags.Items.ALLOY_MATERIAL)
                    .add(Items.IRON_INGOT.asItem());
        ;

        getOrCreateTagBuilder(ItemTags.SWORDS)
                    .add(ModItems.PEARLARIUM_ALLOY_SWORD)
                    .add(ModItems.PEARLARIUM_ALLOY_PLATE_SWORD)
                    .add(ModItems.PEARLARIUM_ALLOY_LONGSWORD)
                    .add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_SWORD)
                    .add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SWORD)
        ;
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                    .add(ModItems.PEARLARIUM_ALLOY_PICKAXE)
                    .add(ModItems.PEARLARIUM_ALLOY_PLATE_PICKAXE)
                    .add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_PICKAXE)
                    .add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_PICKAXE)
        ;
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                    .add(ModItems.PEARLARIUM_ALLOY_SHOVEL)
                    .add(ModItems.PEARLARIUM_ALLOY_PLATE_SHOVEL)
                    .add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_SHOVEL)
                    .add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_SHOVEL)
        ;
        getOrCreateTagBuilder(ItemTags.AXES)
                    .add(ModItems.PEARLARIUM_ALLOY_AXE)
                    .add(ModItems.PEARLARIUM_ALLOY_PLATE_AXE)
                    .add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_AXE)
                    .add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_AXE)
        ;
        getOrCreateTagBuilder(ItemTags.HOES)
                    .add(ModItems.PEARLARIUM_ALLOY_HOE)
                    .add(ModItems.PEARLARIUM_ALLOY_PLATE_HOE)
                    .add(ModItems.AIGRUM_PETRAMIUNIUM_ALLOY_HOE)
                    .add(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_PLATE_HOE)
        ;

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                     .add(ModItems.PEARLARIUM_HELMET)
                     .add(ModItems.PEARLARIUM_CHESTPLATE)
                     .add(ModItems.PEARLARIUM_LEGGINGS)
                     .add(ModItems.PEARLARIUM_BOOTS)
                     .add(ModItems.PEARLARIUM_PLATE_HELMET)
                     .add(ModItems.PEARLARIUM_PLATE_CHESTPLATE)
                     .add(ModItems.PEARLARIUM_PLATE_LEGGINGS)
                     .add(ModItems.PEARLARIUM_PLATE_BOOTS)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_HELMET)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_CHESTPLATE)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_LEGGINGS)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_BOOTS)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_HELMET)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_CHESTPLATE)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_LEGGINGS)
                     .add(ModItems.NIGRUM_PETRAMIUNIUM_PLATE_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                     .add(ModItems.PEARLARIUM_ALLOY_INGOT);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                     .add(ModItems.SHOCK_SMITHING_TEMPLATE);
    }
}
