package me.waleks.simplematerialgenerators;

import me.waleks.simplematerialgenerators.generators.Misc;
import me.waleks.simplematerialgenerators.generators.Ores;
import me.waleks.simplematerialgenerators.generators.Stones;
import org.jetbrains.annotations.NotNull;

public final class SMGItemSetup {

    private SMGItemSetup() {
    }

    public static void setup(@NotNull SimpleMaterialGenerators plugin) {
		/*	Template for adding more items
		new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem(Material.)
		.setRate(1)
		.register(plugin);
		*/

        Stones.setup(plugin);
        Ores.setup(plugin);
        Misc.setup(plugin);
    }
}
