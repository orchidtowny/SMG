package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class SMGItems {

    private SMGItems() {}

    public static final NestedItemGroup SMG_ITEM_CATEGORY = new NestedItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        new CustomItemStack(Material.SMOOTH_STONE, "&9Simple Material Generators")
    );

    public static final ItemGroup SMG_ITEM_BASIC_CATEGORY = new SubItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "basicsmg"),
        SMG_ITEM_CATEGORY,
        new CustomItemStack(Material.COBBLESTONE, "&9Basic SMG")
    );

    public static final ItemGroup SMG_ITEM_ADVANCED_CATEGORY = new SubItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "advancedsmg"),
        SMG_ITEM_CATEGORY,
        new CustomItemStack(Material.STONE, "&9Advanced SMG")
    );

	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6Rate: &e ticks",
		"",
		"&9&oSimpleMaterialGenerators"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        Material.COBBLESTONE,
        "&7Cobblestone Generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_COBBLESTONE",
        Material.COBBLESTONE,
        "&9Advanced &7Cobblestone Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DIRT = new SlimefunItemStack(
        "SMG_GENERATOR_DIRT",
        Material.DIRT,
        "&7Dirt generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_DIRT = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_DIRT",
        Material.DIRT,
        "&9Advanced &7Dirt Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_MUD = new SlimefunItemStack(
        "SMG_GENERATOR_MUD",
        Material.MUD,
        "&7Mud generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_MUD = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_MUD",
        Material.MUD,
        "&9Advanced &7Mud Gen",
        "&6Rate: &e8 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        Material.STONE,
        "&7Stone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        Material.STONE,
        "&7Stone generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_STONE",
        Material.STONE,
        "&9Advanced &7Stone Gen",
        "&6Rate: &e8 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        Material.SMOOTH_STONE,
        "&7Smooth stone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&7Smooth stone generator",
        "&6Rate: &e12 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&9Advanced &7Smooth Stone Gen",
        "&6Rate: &e8 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DIORITE = new SlimefunItemStack(
        "SMG_GENERATOR_DIORITE",
        Material.DIORITE,
        "&7Diorite generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_DIORITE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_DIORITE",
        Material.DIORITE,
        "&9Advanced &7Diorite Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ANDESITE = new SlimefunItemStack(
        "SMG_GENERATOR_ANDESITE",
        Material.ANDESITE,
        "&7Andesite generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_ANDESITE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_ANDESITE",
        Material.ANDESITE,
        "&9Advanced &7Andesite Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRANITE = new SlimefunItemStack(
        "SMG_GENERATOR_GRANITE",
        Material.GRANITE,
        "&7Granite generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_GRANITE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_GRANITE",
        Material.GRANITE,
        "&9Advanced &7Granite Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BLACKSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_BLACKSTONE",
        Material.BLACKSTONE,
        "&7Blackstone generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_BLACKSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_BLACKSTONE",
        Material.BLACKSTONE,
        "&9Advanced &7Blackstone Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE = new SlimefunItemStack(
        "SMG_GENERATOR_DEEPSLATE",
        Material.COBBLED_DEEPSLATE,
        "&7Cobbled deepslate generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_DEEPSLATE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_DEEPSLATE",
        Material.COBBLED_DEEPSLATE,
        "&9Advanced &7Cobbled Deepslate Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_CLAY_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_CLAY_BROKEN",
        Material.CLAY,
        "&7Clay generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_CLAY = new SlimefunItemStack(
        "SMG_GENERATOR_CLAY",
        Material.CLAY,
        "&7Clay generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_CLAY = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_CLAY",
        Material.CLAY,
        "&9Advanced &7Clay Gen",
        "&6Rate: &e8 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_TERRACOTTA = new SlimefunItemStack(
        "SMG_GENERATOR_TERRACOTTA",
        Material.TERRACOTTA,
        "&7Terracotta generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_TERRACOTTA = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_TERRACOTTA",
        Material.TERRACOTTA,
        "&9Advanced &7Terracotta Gen",
        "&6Rate: &e4 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        Material.GRAVEL,
        "&7Gravel generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        Material.ANDESITE,
        "&7Gravel generator",
        "&6Rate: &e6 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_GRAVEL",
        Material.GRAVEL,
        "&9Advanced &7Gravel Gen",
        "&6Rate: &e6 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        Material.SAND,
        "&eSand generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        Material.SANDSTONE,
        "&eSand generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_SAND",
        Material.SANDSTONE,
        "&9Advanced &eSand Gen",
        "&6Rate: &e8 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        Material.GLASS,
        "&fGlass generator",
        "&6Rate: &e12 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_GLASS",
        Material.GLASS,
        "&9Advanced &fGlass Gen",
        "&6Rate: &e12 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        Material.NETHERRACK,
        "&cNetherrack generator",
        "&6Rate: &e6 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_NETHERRACK",
        Material.NETHERRACK,
        "&9Advanced &cNetherrack Gen",
        "&6Rate: &e6 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        Material.SOUL_SAND,
        "&8Soul sand generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_SOUL_SAND",
        Material.SOUL_SAND,
        "&9Advanced &8Soul Sand Gen",
        "&6Rate: &e8 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BADLY_FORMED",
        Material.REDSTONE_BLOCK,
        "&cRedstone generator &8(Badly Formed)",
        "&8Needs to be reformed",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BROKEN",
        Material.REDSTONE_BLOCK,
        "&cRedstone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&cRedstone generator",
        "&6Rate: &e24 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&9Advanced &cRedstone Gen",
        "&6Rate: &e24 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_DEEPSLATE_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&cDeepslate redstone generator",
        "&6Rate: &e24 ticks",
        "&4Same as redstone generator but made with deepslate ore",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_DEEPSLATE_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_DEEPSLATE_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&9Advanced &cDeepslate Redstone Gen",
        "&6Rate: &e24 ticks",
        "&cQuantity: &e8",
        "&4Same as redstone generator but made with deepslate ore",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_LAPIS_BADLY_FORMED",
        Material.LAPIS_BLOCK,
        "&9Lapis generator &8(Badly formed)",
        "&8Needs to be reformed",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_LAPIS_BROKEN",
        Material.LAPIS_BLOCK,
        "&9Lapis generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS = new SlimefunItemStack(
        "SMG_GENERATOR_LAPIS",
        Material.LAPIS_BLOCK,
        "&9Lapis generator",
        "&6Rate: &e24 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_LAPIS = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_LAPIS",
        Material.LAPIS_BLOCK,
        "&9Advanced &9Lapis Gen",
        "&6Rate: &e24 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );


    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE_LAPIS = new SlimefunItemStack(
        "SMG_GENERATOR_DEEPSLATE_LAPIS",
        Material.LAPIS_BLOCK,
        "&9Deepslate lapis generator",
        "&6Rate: &e24 ticks",
        "&4Same as lapis generator but made with deepslate ore",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_DEEPSLATE_LAPIS = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_DEEPSLATE_LAPIS",
        Material.LAPIS_BLOCK,
        "&9Advanced Deepslate Lapis Gen",
        "&6Rate: &e24 ticks",
        "&cQuantity: &e8",
        "&4Same as lapis generator but made with deepslate ore",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_COAL_BADLY_FORMED",
        Material.COAL_BLOCK,
        "&8Coal generator (Badly formed)",
        "&8Needs to be reformed",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_COAL_BROKEN",
        Material.COAL_BLOCK,
        "&8Coal generator (Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL = new SlimefunItemStack(
        "SMG_GENERATOR_COAL",
        Material.COAL_BLOCK,
        "&8Coal generator",
        "&6Rate: &e24 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_COAL = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_COAL",
        Material.COAL_BLOCK,
        "&9Advanced &8Coal Gen",
        "&6Rate: &e24 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE_COAL = new SlimefunItemStack(
        "SMG_GENERATOR_DEEPSLATE_COAL",
        Material.COAL_BLOCK,
        "&8Deepslate coal generator",
        "&6Rate: &e24 ticks",
        "&4Same as coal generator but made with deepslate ore",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_DEEPSLATE_COAL = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_DEEPSLATE_COAL",
        Material.COAL_BLOCK,
        "&9Advanced &8Deepslate Coal Gen",
        "&6Rate: &e24 ticks",
        "&cQuantity: &e8",
        "&4Same as coal generator but made with deepslate ore",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_AMETHYST = new SlimefunItemStack(
        "SMG_GENERATOR_AMETHYST",
        Material.AMETHYST_BLOCK,
        "&dAmethyst generator",
        "&6Rate: &e18 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_AMETHYST = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_AMETHYST",
        Material.AMETHYST_BLOCK,
        "&9Advanced &dAmethyst Gen",
        "&6Rate: &e18 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_QUARTZ = new SlimefunItemStack(
            "SMG_GENERATOR_QUARTZ",
            Material.QUARTZ_BLOCK,
            "&fQuartz Gen",
            "&6Rate: &e8 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_QUARTZ = new SlimefunItemStack(
            "SMG_GENERATOR_ADVANCED_QUARTZ",
            Material.QUARTZ_BLOCK,
            "&9Advanced &fQuartz Gen",
            "&6Rate: &e8 ticks",
            "&cQuantity: &e8",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BADLY_FORMED",
        Material.OBSIDIAN,
        "&5Obsidian generator &8(Badly Formed)",
        "&8Needs to be reformed",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BROKEN",
        Material.OBSIDIAN,
        "&5Obsidian generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN",
        Material.OBSIDIAN,
        "&5Obsidian generator",
        "&6Rate: &e128 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ADVANCED_OBSIDIAN = new SlimefunItemStack(
        "SMG_GENERATOR_ADVANCED_OBSIDIAN",
        Material.OBSIDIAN,
        "&9Advanced &5Obsidian Gen",
        "&6Rate: &e128 ticks",
        "&cQuantity: &e8",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static ItemStack[] getAdvancedRecipe(SlimefunItemStack basic, String id1, String id2, String id3) {
        @NotNull String id4 = Objects.requireNonNull(SimpleMaterialGenerators.getInstance().getConfig().getString("crafting.advanced_recipe_custom_id"));

        SlimefunItem sfItem1 = SlimefunItem.getById(id1);
        ItemStack customItem1;
        SlimefunItem sfItem2 = SlimefunItem.getById(id2);
        ItemStack customItem2;
        SlimefunItem sfItem3 = SlimefunItem.getById(id3);
        ItemStack customItem3;
        SlimefunItem sfItem4 = SlimefunItem.getById(id4);
        ItemStack customItem4;

        if (sfItem1 == null)
            customItem1 = SlimefunItems.REDSTONE_ALLOY;
        else
            customItem1 = sfItem1.getItem();

        if (sfItem2 == null)
            customItem2 = SlimefunItems.HARDENED_METAL_INGOT;
        else
            customItem2 = sfItem2.getItem();

        if (sfItem3 == null)
            customItem3 = SlimefunItems.REDSTONE_ALLOY;
        else
            customItem3 = sfItem3.getItem();

        if (sfItem4 == null)
            customItem4 = SlimefunItems.REINFORCED_PLATE;
        else
            customItem4 = sfItem4.getItem();

        return new ItemStack[]{
            SlimefunItems.REINFORCED_PLATE, basic, SlimefunItems.REINFORCED_PLATE,
            customItem1, customItem2, customItem3,
            customItem4, basic, customItem4
        };
    }
}