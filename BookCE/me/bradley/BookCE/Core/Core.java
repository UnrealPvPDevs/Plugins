package me.bradley.BookCE.Core;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.bradley.CE.Common.Demon;
import me.bradley.CE.Common.Jump;
import me.bradley.CE.Common.Light;
import me.bradley.CE.Common.Lightning;
import me.bradley.CE.Common.SeaMonster;
import me.bradley.CE.Common.Stormcaller;
import me.bradley.CE.Common.Trolling;
import me.bradley.CE.Rare.Barrage;
import me.bradley.CE.Rare.Brawn;
import me.bradley.CE.Rare.Fury;
import me.bradley.CE.Rare.HealthBoost;
import me.bradley.CE.Rare.Lavamob;
import me.bradley.CE.Rare.Leech;
import me.bradley.CE.Rare.Tank;
import me.bradley.CE.Rare.Vampire;
import me.bradley.CE.Rare.Wither;
import me.bradley.CE.Rare.Wizdom;
import me.bradley.CE.Unique.Agile;
import me.bradley.CE.Unique.Explosive;
import me.bradley.CE.Unique.Hardened;
import me.bradley.CE.Unique.Piercing;
import me.bradley.CE.Unique.SOS;
import me.bradley.CE.Unique.Smelting;
import me.bradley.CE.Unique.Speed;
import me.bradley.CE.Unique.Trap;

public class Core extends JavaPlugin implements Listener{
	
	private HashMap<String, String> claimed = new HashMap<String, String>();
	
	private static Core p;

	public Core() {
		p = this;
	}
	
	public void onEnable(){
		
		saveDefaultConfig();
		List<String> t = getConfig().getStringList("claimed");
		for(String str : t){
			String[] words = str.split(":");
			String done = words[1];
			claimed.put(words[0].toString(), done);
		}
		
		getCommand("Enchanter").setExecutor(new GUI());
		getServer().getPluginManager().registerEvents(new GUI(), this);
		getServer().getPluginManager().registerEvents(this, this);
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
		getServer().getPluginManager().registerEvents(new Leech(), this);
		getServer().getPluginManager().registerEvents(new Tank(), this);
		getServer().getPluginManager().registerEvents(new Hardened(), this);
		getServer().getPluginManager().registerEvents(new Wither(), this);
		getServer().getPluginManager().registerEvents(new Demon(), this);
		getServer().getPluginManager().registerEvents(new Explosive(), this);
		getServer().getPluginManager().registerEvents(new Barrage(), this);
		getServer().getPluginManager().registerEvents(new Vampire(), this);
		getServer().getPluginManager().registerEvents(new Smelting(), this);
	}

	public static Core getInstance() {
		return p;
	}

	public static void log(Level level, String message) {
		p.getLogger().log(level, message);
	}
	
	public void onDisable(){
		List<String> t = getConfig().getStringList("claimed");
		for(String p : claimed.keySet()){
			t.add(p + ":" + claimed.get(p));
		}
		getConfig().set("claimed", t);
		saveConfig();
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		Player player = e.getPlayer();
		Block block = e.getClickedBlock();
		if(block.getState() instanceof Sign){
			Sign sign = (Sign) block.getState();
			String[] lines = sign.getLines();
			if(lines[0].equalsIgnoreCase("Reward")){
				if(!claimed.containsKey(player.getName())){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco give " + player.getName() + " 15000");
				player.sendMessage("§8[§7§lUn§c§lReal§8] §7You have recieved 15k for completing the parkour§c! §7Well done§c!");
				claimed.put(player.getName(), "done");
			}else{
				player.sendMessage("§8[§7§lUn§c§lReal§8] §7You have already claimed your reward§c!");
			}
			}
		}
	}
	
}