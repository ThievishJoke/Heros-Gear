package net.hero.heros_gear.item;

import net.hero.heros_gear.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    PEARLARIUM_ALLOY_INGOT(2569, 9.0F, 4.0F, ModTags.Blocks.INCORRECT_FOR_PEARLARIUM_TOOL,  20, () -> Ingredient.ofItems(ModItems.PEARLARIUM_ALLOY_INGOT)),
    PEARLARIUM_ALLOY_PLATE(2569, 9.0F, 4.0F, ModTags.Blocks.INCORRECT_FOR_PEARLARIUM_TOOL,  20, () -> Ingredient.ofItems(ModItems.PEARLARIUM_ALLOY_INGOT)),

    NIGRUM_PETRAMIUNIUM_ALLOY_INGOT(2000, 10.0F, 5.0F, ModTags.Blocks.INCORRECT_FOR_NIGRUM_PETRAMIUNIUM_TOOL,  20, () -> Ingredient.ofItems(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT)),
    NIGRUM_PETRAMIUNIUM_ALLOY_PLATE(2000, 10.0F, 5.0F, ModTags.Blocks.INCORRECT_FOR_NIGRUM_PETRAMIUNIUM_TOOL,  20, () -> Ingredient.ofItems(ModItems.NIGRUM_PETRAMIUNIUM_ALLOY_INGOT));

    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
