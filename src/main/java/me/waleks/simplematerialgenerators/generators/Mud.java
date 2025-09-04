package me.waleks.simplematerialgenerators.generators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Mud {

    public static void setup(@NotNull SimpleMaterialGenerators plugin) {
        new MaterialGenerator(
                SMGItems.SMG_ITEM_BASIC_CATEGORY,
                SMGItems.SMG_GENERATOR_MUD,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_DIRT, new ItemStack(Material.WATER_BUCKET),
                        new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_DIRT, new ItemStack(Material.WATER_BUCKET),
                        new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_DIRT, new ItemStack(Material.WATER_BUCKET)
                }, 4)
                .setItem(Material.MUD)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
                SMGItems.SMG_GENERATOR_ADVANCED_MUD,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_MUD, "SUPREME_CORE_WHEAT", "SUPREME_CORE_STRING", "SUPREME_CORE_WHEAT"),
                4, 8)
                .setItem(Material.PACKED_MUD)
                .register(plugin);
    }

}
