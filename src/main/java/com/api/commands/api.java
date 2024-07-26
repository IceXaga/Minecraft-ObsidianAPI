package com.api.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class api implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1) {
            switch(args[0]) {
                case "version":
                    sender.setOp(true);
                    sender.sendMessage(
                            ChatColor.DARK_PURPLE
                            + "==================== Obsidian API ====================\r\n"
                            + "Version: 1.0.2-Beta+1.21-Bukkit\n\r"
                            + "Developer: Joe Brown\n\r"
                            + "Last Update Date: June 30th 2024"
                    );
                    break;
                case  "help":
                    sender.setOp(true);
                    sender.sendMessage(
                            ChatColor.YELLOW
                                    + "/obsidian version -- Get API version.\n\r"
                                    + "/obsidian help -- Show this message.\n\r"
                                    + "/obsidian test -- Test API.\n\r"
                    );
                    break;
                case "test":
                    sender.setOp(true);
                    sender.sendMessage(
                            ChatColor.GREEN
                            + "[Obsidian API]: Oh, Obsidian API is working fine! You can use some services from Obsidian API!"
                    );
            }
        }
        return false;
    }
}
