package me.waleks.simplematerialgenerators;

import me.waleks.simplematerialgenerators.generators.*;
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

        Copper.setup(plugin);
        Misc.setup(plugin);
        Mud.setup(plugin);
        Stones.setup(plugin);
        Ores.setup(plugin);
        Quartz.setup(plugin);
    }
}
