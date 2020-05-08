package com.dteather.forcespeech;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class ForceSpeech extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("forcespeech").setExecutor(new CommandHandler());
        Bukkit.getLogger().info("ForceSpeech Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("ForceSpeech Disabled");
    }
}
