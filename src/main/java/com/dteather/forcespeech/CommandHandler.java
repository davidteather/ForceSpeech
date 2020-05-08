package com.dteather.forcespeech;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // now we need to compile the message
        // ex args: ["minecraft_username", "I", "love", "development"]
        String compiled = "";
        for (int i=1; i<args.length; i++) {
            if (i != args.length-1) {
                compiled += args[i] + " ";
            } else {
                compiled += args[i];
            }
        }

        Bukkit.broadcastMessage("<" + args[0] + "> " + compiled);

        return true;
    }
}
