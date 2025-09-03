package me.waleks.simplematerialgenerators.items;

import io.github.mooy1.infinitylib.machines.TickingMenuBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.blocks.BlockPosition;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.SimpleMaterialGenerators;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaterialGenerator extends TickingMenuBlock implements RecipeDisplayItem {

    private static final Map<BlockPosition, Integer> generatorProgress = new HashMap<>();
    private static final int[] OUTPUT_SLOTS = { 10, 11, 12, 13, 14, 15, 16 };

    private final int rate;
    private final int quantity;
    private Material material;

    @ParametersAreNonnullByDefault
    public MaterialGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int rate, int quantity) {
        super(itemGroup, item, recipeType, recipe);
        this.rate = rate;
        this.quantity = quantity;
    }

    @ParametersAreNonnullByDefault
    public MaterialGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int rate) {
        this(itemGroup, item, recipeType, recipe, rate, 1);
    }

    public final MaterialGenerator setItem(@NotNull Material material) {
        this.material = material;
        return this;
    }

    @Override
    protected void tick(Block b, BlockMenu inv) {
        ItemStack output = new ItemStack(this.material, this.quantity);

        if (!inv.fits(output, OUTPUT_SLOTS)) {
            return;
        }

        final BlockPosition pos = new BlockPosition(b);
        int progress = generatorProgress.getOrDefault(pos, 0);

        if (progress >= this.rate) {
            progress = 0;
            inv.pushItem(output, OUTPUT_SLOTS);
        } else {
            progress++;
        }

        generatorProgress.put(pos, progress);
    }

    @Override
    protected void onBreak(BlockBreakEvent e, BlockMenu menu) {
        generatorProgress.remove(new BlockPosition(e.getBlock().getLocation()));
        e.setDropItems(false);
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), this.getItem());

        if (SimpleMaterialGenerators.getInstance().getConfig().getBoolean("options.drop-contents-on-break")) {
            menu.dropItems(e.getBlock().getLocation(), OUTPUT_SLOTS);
        }
    }

    @Override
    protected void setup(@NotNull BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.drawBackground(new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            9, 17,
            18, 19, 20, 21, 22, 23, 24, 25, 26
        });
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return OUTPUT_SLOTS;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();
        items.add(null);
        items.add(new ItemStack(this.material, this.quantity));
        return items;
    }

    @NotNull
    @Override
    public String getLabelLocalPath() {
        return RecipeDisplayItem.super.getLabelLocalPath();
    }

    @NotNull
    @Override
    public String getRecipeSectionLabel(@NotNull Player p) {
        return "&7Generates";
    }
}

