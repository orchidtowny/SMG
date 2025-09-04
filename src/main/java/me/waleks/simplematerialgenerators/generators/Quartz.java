package me.waleks.simplematerialgenerators.generators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Quartz {

    public static void setup(@NotNull SimpleMaterialGenerators plugin) {

        new MaterialGenerator(
                SMGItems.SMG_ITEM_BASIC_CATEGORY,
                SMGItems.SMG_GENERATOR_QUARTZ,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_NETHERRACK, new ItemStack(Material.QUARTZ), SMGItems.SMG_GENERATOR_NETHERRACK,
                        new ItemStack(Material.QUARTZ), new ItemStack(Material.DIAMOND), new ItemStack(Material.QUARTZ),
                        SMGItems.SMG_GENERATOR_NETHERRACK, new ItemStack(Material.QUARTZ), SMGItems.SMG_GENERATOR_NETHERRACK,
                }, 8)
                .setItem(Material.QUARTZ)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
                SMGItems.SMG_GENERATOR_ADVANCED_QUARTZ,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_QUARTZ, "SUPREME_CORE_QUARTZ", "SUPREME_CORE_DIAMOND", "SUPREME_CORE_QUARTZ"),
                18, 8)
                .setItem(Material.QUARTZ)
                .register(plugin);

    }

}
