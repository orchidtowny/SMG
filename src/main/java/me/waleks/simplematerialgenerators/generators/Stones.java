package me.waleks.simplematerialgenerators.generators;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class Stones {

    public static void setup(@Nonnull SimpleMaterialGenerators plugin) {

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_COBBLESTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE)
            }, 4)
            .setItem(Material.COBBLESTONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_COBBLESTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_COBBLESTONE, "SUPREME_CORE_STONE", "SUPREME_CORE_STONE", "SUPREME_CORE_STONE"),
            4, 8)
            .setItem(Material.COBBLESTONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE),
                SlimefunItems.SOLDER_INGOT, SMGItems.SMG_GENERATOR_STONE_BROKEN, SlimefunItems.SOLDER_INGOT,
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE)
            }, 8)
            .setItem(Material.STONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_STONE, "SUPREME_CORE_STONE", "SUPREME_CORE_COAL", "SUPREME_CORE_STONE"),
            4, 8)
            .setItem(Material.STONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_STONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE,
            RecipeType.SMELTERY,
            new ItemStack[]{
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.IRON_BARS), SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN, new ItemStack(Material.IRON_BARS),
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE)
            }, 12)
            .setItem(Material.SMOOTH_STONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_SMOOTH_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_SMOOTH_STONE, "SUPREME_CORE_STONE", "SUPREME_CORE_GRAY", "SUPREME_CORE_STONE"),
            4, 8)
            .setItem(Material.SMOOTH_STONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_DIORITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.DIORITE), null,
                null, null, null,
                null, null, null
            }, 4)
            .setItem(Material.DIORITE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_DIORITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_DIORITE, "SUPREME_CORE_DIORITE", "SUPREME_CORE_DIORITE", "SUPREME_CORE_DIORITE"),
            4, 8)
            .setItem(Material.DIORITE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_ANDESITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.ANDESITE), null,
                null, null, null,
                null, null, null
            }, 4)
            .setItem(Material.ANDESITE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_ANDESITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_ANDESITE, "SUPREME_CORE_ANDESITE", "SUPREME_CORE_ANDESITE", "SUPREME_CORE_ANDESITE"),
            4, 8)
            .setItem(Material.ANDESITE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_GRANITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.GRANITE), null,
                null, null, null,
                null, null, null
            }, 4)
            .setItem(Material.GRANITE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_GRANITE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_GRANITE, "SUPREME_CORE_GRANITE", "SUPREME_CORE_GRANITE", "SUPREME_CORE_GRANITE"),
            4, 8)
            .setItem(Material.GRANITE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_BLACKSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_NETHERRACK, new ItemStack(Material.BLACKSTONE), null,
                null, null, null,
                null, null, null
            }, 4)
            .setItem(Material.BLACKSTONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_BLACKSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_BLACKSTONE, "SUPREME_CORE_STONE", "SUPREME_CORE_BLACK", "SUPREME_CORE_STONE"),
            4, 8)
            .setItem(Material.BLACKSTONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_DEEPSLATE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.COBBLED_DEEPSLATE), null,
                null, null, null,
                null, null, null
            }, 4)
            .setItem(Material.COBBLED_DEEPSLATE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_DEEPSLATE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_DEEPSLATE, "SUPREME_CORE_STONE", "SUPREME_CORE_IRON", "SUPREME_CORE_STONE"),
            4, 8)
            .setItem(Material.COBBLED_DEEPSLATE)
            .register(plugin);

    }
}
