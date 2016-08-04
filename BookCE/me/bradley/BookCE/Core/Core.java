package me.bradley.BookCE.Core;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.bradley.CE.Common.Jump;
import me.bradley.CE.Common.Light;
import me.bradley.CE.Common.Lightning;
import me.bradley.CE.Common.SeaMonster;
import me.bradley.CE.Common.Stormcaller;
import me.bradley.CE.Common.Trolling;
import me.bradley.CE.Rare.Brawn;
import me.bradley.CE.Rare.Fury;
import me.bradley.CE.Rare.HealthBoost;
import me.bradley.CE.Rare.Lavamob;
import me.bradley.CE.Rare.Wizdom;
import me.bradley.CE.Unique.Agile;
import me.bradley.CE.Unique.Piercing;
import me.bradley.CE.Unique.SOS;
import me.bradley.CE.Unique.Speed;
import me.bradley.CE.Unique.Trap;

public class Core extends JavaPlugin implements Listener{
	
	public void onEnable(){
		getCommand("Enchanter").setExecutor(new GUI());
		getServer().getPluginManager().registerEvents(new GUI(), this);
		
		getServer().getPluginManager().registerEvents(new HealthBoost(), this);
		getServer().getPluginManager().registerEvents(new BooksRandom(), this);
		getServer().getPluginManager().registerEvents(new Trolling(), this);
		getServer().getPluginManager().registerEvents(new Agile(), this);
		getServer().getPluginManager().registerEvents(new Wizdom(), this);
		getServer().getPluginManager().registerEvents(new Trap(), this);
		getServer().getPluginManager().registerEvents(new Jump(), this);
		getServer().getPluginManager().registerEvents(new SOS(), this);
		getServer().getPluginManager().registerEvents(new Fury(), this);
		getServer().getPluginManager().registerEvents(new Lightning(), this);
		getServer().getPluginManager().registerEvents(new Piercing(), this);
		getServer().getPluginManager().registerEvents(new Speed(), this);
		getServer().getPluginManager().registerEvents(new Lavamob(), this);
		getServer().getPluginManager().registerEvents(new Stormcaller(), this);
		getServer().getPluginManager().registerEvents(new Brawn(), this);
		getServer().getPluginManager().registerEvents(new Light(), this);
		getServer().getPluginManager().registerEvents(new SeaMonster(), this);
	}
}
