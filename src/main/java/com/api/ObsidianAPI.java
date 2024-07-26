package com.api;

import com.api.commands.api;
import org.bukkit.plugin.java.JavaPlugin;

public final class ObsidianAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new GetOP(),this);
        getLogger().info("  _____   _            _      _  _                        ______   _____ ");
        getLogger().info(" / ___ \\ | |          (_)    | |(_)                 /\\   (_____ \\ (_____)");
        getLogger().info("| |   | || | _    ___  _   _ | | _   ____  ____    /  \\   _____) )   _   ");
        getLogger().info("| |   | || || \\  /___)| | / || || | / _  ||  _ \\  / /\\ \\ |  ____/   | |  ");
        getLogger().info("| |___| || |_) )|___ || |( (_| || |( ( | || | | || |__| || |       _| |_ ");
        getLogger().info(" \\_____/ |____/ (___/ |_| \\____||_| \\_||_||_| |_||______||_|      (_____)");

        getCommand("obsidian").setExecutor(new api());
    }

    @Override
    public void onDisable() {
        getLogger().info("obsidianapi disable");
    }
}
