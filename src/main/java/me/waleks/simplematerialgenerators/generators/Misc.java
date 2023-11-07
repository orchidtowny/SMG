package me.waleks.simplematerialgenerators.generators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class Misc {

    public static void setup(@Nonnull SimpleMaterialGenerators plugin) {

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
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
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_MUD,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_DIRT, new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_DIRT, new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_DIRT, new ItemStack(Material.WATER_BUCKET)
            }, 4).setItem(Material.MUD)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_CLAY_BROKEN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_SAND, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_SAND,
                SMGItems.SMG_GENERATOR_GRAVEL, new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_GRAVEL,
                SMGItems.SMG_GENERATOR_SAND, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_SAND
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_CLAY, RecipeType.SMELTERY,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_CLAY_BROKEN, null, null,
                null, null, null,
                null, null, null
            }, 8)
            .setItem(Material.CLAY)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_TERRACOTTA,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_CLAY, new ItemStack(Material.TERRACOTTA), SMGItems.SMG_GENERATOR_CLAY,
                new ItemStack(Material.TERRACOTTA), new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.TERRACOTTA),
                SMGItems.SMG_GENERATOR_CLAY, new ItemStack(Material.TERRACOTTA), SMGItems.SMG_GENERATOR_CLAY
            }, 10)
            .setItem(Material.TERRACOTTA)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, SMGItems.SMG_GENERATOR_STONE,
                null, SlimefunItems.COBALT_PICKAXE, null,
                SMGItems.SMG_GENERATOR_SMOOTH_STONE, null, SMGItems.SMG_GENERATOR_NETHERRACK
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.WATER_BUCKET), SlimefunItems.REINFORCED_ALLOY_INGOT,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN
            }, 128)
            .setItem(Material.OBSIDIAN)
            .register(plugin);

    }

}
