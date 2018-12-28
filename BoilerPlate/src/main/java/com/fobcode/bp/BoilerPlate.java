package com.fobcode.bp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.fobcode.bp.events.Events;

public class BoilerPlate extends JavaPlugin {
	private static BoilerPlate instance;
	public void onEnable() {
		instance = this;
		Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);
	}
	public void onDisable() {
		instance = null;
	}
	public static BoilerPlate getInstance() {
		return instance;
	}
}
