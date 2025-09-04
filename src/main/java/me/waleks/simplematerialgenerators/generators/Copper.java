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

public class Copper {

    public static void setup(@NotNull SimpleMaterialGenerators plugin) {
        new BrokenGenerator(
                SMGItems.SMG_ITEM_BASIC_CATEGORY,
                SMGItems.SMG_GENERATOR_COPPER_BADLY_FORMED,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_SAND, new ItemStack(Material.COPPER_INGOT), SMGItems.SMG_GENERATOR_GRAVEL,
                        null, null, null,
                        null, null, null
                })
                .register(plugin);

        new BrokenGenerator(
                SMGItems.SMG_ITEM_BASIC_CATEGORY,
                SMGItems.SMG_GENERATOR_COPPER_BROKEN,
                RecipeType.ORE_CRUSHER,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COPPER_BADLY_FORMED, null, null,
                        null, null, null,
                        null, null, null
                })
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_BASIC_CATEGORY,
                SMGItems.SMG_GENERATOR_COPPER,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COPPER_BROKEN, new ItemStack(Material.COPPER_ORE), SMGItems.SMG_GENERATOR_COPPER_BROKEN,
                        SMGItems.SMG_GENERATOR_COPPER_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_COPPER_BROKEN,
                        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
                }, 8)
                .setItem(Material.COPPER_INGOT)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_ADVANCED_CATEGORY,
                SMGItems.SMG_GENERATOR_ADVANCED_COPPER,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                SMGItems.getAdvancedRecipe(SMGItems.SMG_GENERATOR_COPPER, "SUPREME_CORE_IRON", "SUPREME_CORE_DIAMOND", "SUPREME_CORE_GOLD"),
                8, 8)
                .setItem(Material.COPPER_INGOT)
                .register(plugin);
    }

}
