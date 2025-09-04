package me.waleks.simplematerialgenerators.generators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Misc {

    public static void setup(@NotNull SimpleMaterialGenerators plugin) {

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL_BROKEN,
            RecipeType.GRIND_STONE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS),
                SlimefunItems.BILLON_INGOT, SMGItems.SMG_GENERATOR_GRAVEL_BROKEN, SlimefunItems.BILLON_INGOT,
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS)
            }, 6)
            .setItem(Material.GRAVEL)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_GRAVEL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_GRAVEL, "SUPREME_CORE_GRAVEL", "SUPREME_CORE_GRAVEL", "SUPREME_CORE_GRAVEL"),
            6, 8)
            .setItem(Material.GRAVEL)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_GRAVEL, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE),
                SlimefunItems.DURALUMIN_INGOT, SMGItems.SMG_GENERATOR_SAND_BROKEN, SlimefunItems.DURALUMIN_INGOT,
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE)
            }, 8)
            .setItem(Material.SAND)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_SAND, "SUPREME_CORE_SAND", "SUPREME_CORE_SAND", "SUPREME_CORE_SAND"),
            8, 8)
            .setItem(Material.SAND)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_GLASS,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SlimefunItems.BRONZE_INGOT, SlimefunItems.GOLD_8K, SlimefunItems.BRONZE_INGOT,
                SlimefunItems.BRASS_INGOT, SMGItems.SMG_GENERATOR_SAND, SlimefunItems.BRASS_INGOT,
                null, null, null
            }, 12)
            .setItem(Material.GLASS)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_GLASS,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_GLASS, "SUPREME_CORE_SAND", "SUPREME_CORE_COAL", "SUPREME_CORE_SAND"),
            12, 8)
            .setItem(Material.GLASS)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_NETHERRACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_STONE,
                SMGItems.SMG_GENERATOR_STONE, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_STONE
            }, 6)
            .setItem(Material.NETHERRACK)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_NETHERRACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_NETHERRACK, "SUPREME_CORE_STONE", "SUPREME_CORE_CRIMSON_STEM", "SUPREME_CORE_STONE"),
            6, 8)
            .setItem(Material.NETHERRACK)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_SOUL_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.STEEL_INGOT, new ItemStack(Material.SPIDER_EYE), SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BONE),
                SMGItems.SMG_GENERATOR_SAND, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_SAND
            }, 8)
            .setItem(Material.SOUL_SAND)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_SOUL_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_SOUL_SAND, "SUPREME_CORE_SAND", "SUPREME_CORE_TEAR", "SUPREME_CORE_SAND"),
            8, 8)
            .setItem(Material.SOUL_SAND)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_DIRT,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                new ItemStack(Material.IRON_SHOVEL), SMGItems.SMG_GENERATOR_GRAVEL, new ItemStack(Material.IRON_SHOVEL),
                null, null, null,
                null, null, null
            }, 4)
            .setItem(Material.DIRT)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_DIRT,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_DIRT, "SUPREME_CORE_POTATO", "SUPREME_CORE_CARROT", "SUPREME_CORE_POTATO"),
            4, 8)
            .setItem(Material.DIRT)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_CLAY_BROKEN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_SAND, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_SAND,
                SMGItems.SMG_GENERATOR_GRAVEL, new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_GRAVEL,
                SMGItems.SMG_GENERATOR_SAND, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_SAND
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_CLAY, RecipeType.SMELTERY,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_CLAY_BROKEN, null, null,
                null, null, null,
                null, null, null
            }, 8)
            .setItem(Material.CLAY)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_CLAY,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_CLAY, "SUPREME_CORE_CLAY", "SUPREME_CORE_REDSTONE", "SUPREME_CORE_CLAY"),
            8, 8)
            .setItem(Material.CLAY)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_TERRACOTTA,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_CLAY, new ItemStack(Material.TERRACOTTA), SMGItems.SMG_GENERATOR_CLAY,
                new ItemStack(Material.TERRACOTTA), new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.TERRACOTTA),
                SMGItems.SMG_GENERATOR_CLAY, new ItemStack(Material.TERRACOTTA), SMGItems.SMG_GENERATOR_CLAY
            }, 4)
            .setItem(Material.TERRACOTTA)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_TERRACOTTA,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_TERRACOTTA, "SUPREME_CORE_CLAY", "SUPREME_CORE_COAL", "SUPREME_CORE_CLAY"),
            4, 8)
            .setItem(Material.TERRACOTTA)
            .register(plugin);

        // todo: concrete

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, SMGItems.SMG_GENERATOR_STONE,
                null, SlimefunItems.COBALT_PICKAXE, null,
                SMGItems.SMG_GENERATOR_SMOOTH_STONE, null, SMGItems.SMG_GENERATOR_NETHERRACK
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.WATER_BUCKET), SlimefunItems.REINFORCED_ALLOY_INGOT,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN
            }, 128)
            .setItem(Material.OBSIDIAN)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_OBSIDIAN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_OBSIDIAN, "SUPREME_CORE_BLACK", "SUPREME_CORE_COAL", "SUPREME_CORE_STONE"),
            128, 8)
            .setItem(Material.OBSIDIAN)
            .register(plugin);

    }

}
