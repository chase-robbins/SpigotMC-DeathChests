package com.chaserobbins.deathchests.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Hello implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("hello")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "You must be a player to use this command.");
				return false;
			}
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.AQUA + "Command Preformed");
			player.damage(10);
			
			return true;
		}
		return false;
	}
}
