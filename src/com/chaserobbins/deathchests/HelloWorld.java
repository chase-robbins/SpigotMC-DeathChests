//https://www.youtube.com/watch?v=7dyopdta7ZI&t=713s

package com.chaserobbins.deathchests;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.chaserobbins.deathchests.commands.Hello;

public class HelloWorld extends JavaPlugin {
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		getCommand("hello").setExecutor(new Hello());
		
		logger.info(pdfFile.getName() + " has been enabled for version " + pdfFile.getVersion());
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been disabled for version " + pdfFile.getVersion());
	}
}
 