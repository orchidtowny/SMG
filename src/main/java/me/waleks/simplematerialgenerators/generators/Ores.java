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

public class Ores {

    public static void setup(@NotNull SimpleMaterialGenerators plugin) {

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_REDSTONE_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_SAND, new ItemStack(Material.REDSTONE), SMGItems.SMG_GENERATOR_GRAVEL,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_REDSTONE_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, new ItemStack(Material.REDSTONE_ORE), SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
            }, 24)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_REDSTONE, "SUPREME_CORE_REDSTONE", "SUPREME_CORE_STONE", "SUPREME_CORE_REDSTONE"),
            24, 8)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_DEEPSLATE_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, new ItemStack(Material.DEEPSLATE_REDSTONE_ORE), SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
            }, 24)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_DEEPSLATE_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_DEEPSLATE_REDSTONE, "SUPREME_CORE_REDSTONE", "SUPREME_CORE_STONE", "SUPREME_CORE_REDSTONE"),
            24, 8)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_LAPIS_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_SAND, new ItemStack(Material.LAPIS_LAZULI), SMGItems.SMG_GENERATOR_GRAVEL,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_LAPIS_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_LAPIS,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_LAPIS_BROKEN, new ItemStack(Material.LAPIS_ORE), SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                SMGItems.SMG_GENERATOR_LAPIS_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
            }, 24)
            .setItem(Material.LAPIS_LAZULI)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_LAPIS,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_LAPIS, "SUPREME_CORE_LAPIS", "SUPREME_CORE_STONE", "SUPREME_CORE_LAPIS"),
            24, 8)
            .setItem(Material.LAPIS_LAZULI)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_DEEPSLATE_LAPIS,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_LAPIS_BROKEN, new ItemStack(Material.DEEPSLATE_LAPIS_ORE), SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                SMGItems.SMG_GENERATOR_LAPIS_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
            }, 24)
            .setItem(Material.LAPIS_LAZULI)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_DEEPSLATE_LAPIS,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_DEEPSLATE_LAPIS, "SUPREME_CORE_LAPIS", "SUPREME_CORE_STONE", "SUPREME_CORE_LAPIS"),
            24, 8)
            .setItem(Material.LAPIS_LAZULI)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_COAL_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_STONE, null, SMGItems.SMG_GENERATOR_NETHERRACK,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_COAL_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COAL_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COAL_BROKEN, new ItemStack(Material.COAL_ORE), SMGItems.SMG_GENERATOR_COAL_BROKEN,
                SMGItems.SMG_GENERATOR_COAL_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_COAL_BROKEN,
                SlimefunItems.COMPRESSED_CARBON, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.COMPRESSED_CARBON
            }, 24)
            .setItem(Material.COAL)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_COAL, "SUPREME_CORE_COAL", "SUPREME_CORE_STONE", "SUPREME_CORE_COAL"),
            24, 8)
            .setItem(Material.COAL)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_DEEPSLATE_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COAL_BROKEN, new ItemStack(Material.DEEPSLATE_COAL_ORE), SMGItems.SMG_GENERATOR_COAL_BROKEN,
                SMGItems.SMG_GENERATOR_COAL_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_COAL_BROKEN,
                SlimefunItems.COMPRESSED_CARBON, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.COMPRESSED_CARBON
            }, 24)
            .setItem(Material.COAL)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_DEEPSLATE_COAL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_DEEPSLATE_COAL, "SUPREME_CORE_COAL", "SUPREME_CORE_STONE", "SUPREME_CORE_COAL"),
            24, 8)
            .setItem(Material.COAL)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_BASIC_CATEGORY,
            SMGItems.SMG_GENERATOR_AMETHYST,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_OBSIDIAN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_GLASS,
                null, null, null,
                null, null, null
            }, 18)
            .setItem(Material.AMETHYST_BLOCK)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
            SMGItems.SMG_GENERATOR_ADVANCED_AMETHYST,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_AMETHYST, "SUPREME_CORE_QUARTZ", "SUPREME_CORE_DIAMOND", "SUPREME_CORE_QUARTZ"),
            18, 8)
            .setItem(Material.AMETHYST_BLOCK)
            .register(plugin);

        // todo: quartz
    }
}
