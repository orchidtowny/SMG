package me.waleks.simplematerialgenerators;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.File;

public class SimpleMaterialGenerators extends AbstractAddon {

    private static SimpleMaterialGenerators instance;
    private static Config config;

    public SimpleMaterialGenerators() {
        super("Royale-MC", "SMG", "master", "options.auto-update");
    }

    public SimpleMaterialGenerators(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
            "Royale-MC", "SMG", "master", "options.auto-update");
    }

    @Override
    protected void enable() {
        setInstance(this);

        SMGItemSetup.setup(this);
    }

    @Override
    protected void disable() {
        setInstance(null);
    }

    @Nonnull
    public static SimpleMaterialGenerators getInstance() {
        return instance;
    }

    private static void setInstance(@Nullable SimpleMaterialGenerators instance) {
        SimpleMaterialGenerators.instance = instance;
    }
}
