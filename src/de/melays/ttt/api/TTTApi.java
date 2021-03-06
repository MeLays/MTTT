package de.melays.ttt.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import de.melays.ttt.Arena;
import de.melays.ttt.main;

public class TTTApi {
	
	public static TTTApi getInstance() {
		return ((main) Bukkit.getPluginManager().getPlugin("MTTT")).getAPI();
	}
	
	main plugin;
	public TTTApi (main m){
		plugin = m;
	}
	
	public Arena getArena (String s){
		return plugin.m.get(s);
	}
	
	public Arena getArena (Player p){
		return plugin.m.searchPlayer(p);
	}
	
	public TTTPlayer getPlayer (Player p){
		return new TTTPlayer (plugin , p);
	}
	
}
