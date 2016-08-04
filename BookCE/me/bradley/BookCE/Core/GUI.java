package me.bradley.BookCE.Core;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI implements Listener, CommandExecutor{
	
	public ItemStack common = new ItemStack(Material.IRON_INGOT, 1);
	public ItemStack unique = new ItemStack(Material.GOLD_INGOT, 1);
	public ItemStack rare = new ItemStack(Material.DIAMOND, 1);
	public ItemStack cBook = new ItemStack(Material.BOOK, 1);
	public ItemStack uBook = new ItemStack(Material.BOOK, 1);
	public ItemStack rBook = new ItemStack(Material.BOOK, 1);
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		if(cmd.getName().equalsIgnoreCase("Enchanter")){
			if(sender instanceof Player){
				Player player = (Player) sender;
				Inventory inv = Bukkit.createInventory(null, 9, ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.UNDERLINE + "Enchanter");
				
				ItemMeta cMeta = common.getItemMeta();
				ItemMeta uMeta = unique.getItemMeta();
				ItemMeta rMeta = rare.getItemMeta();
				
				cMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant");
				uMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant");
				rMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant");
				
				List<String> cLore = new ArrayList<String>();
				List<String> uLore = new ArrayList<String>();
				List<String> rLore = new ArrayList<String>();
				
				cLore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "COST  " + ChatColor.WHITE + "30 EXP LEVELS");
				cMeta.setLore(cLore);
				common.setItemMeta(cMeta);
				uLore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "COST  " + ChatColor.WHITE + "50 EXP LEVELS");
				uMeta.setLore(uLore);
				unique.setItemMeta(uMeta);
				rLore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "COST  " + ChatColor.WHITE + "75 EXP LEVELS");
				rMeta.setLore(rLore);
				rare.setItemMeta(rMeta);
				
				inv.setItem(2, common);
				inv.setItem(4, unique);
				inv.setItem(6, rare);
				
				player.openInventory(inv);
				return true;
			}
		}
		return true;
	}
	
	@EventHandler
	public void onCick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.UNDERLINE + "Enchanter")){
			if(e.getCurrentItem().getType()==null||e.getCurrentItem().getType()==Material.AIR)return;
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant")){
				e.setCancelled(true);
				if (player.getLevel() >= 30){
				player.setLevel(player.getLevel() - 30);
				ItemMeta cBMeta = cBook.getItemMeta();
				cBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
				List<String> cBLore = new ArrayList<String>();
				cBLore.add(ChatColor.GRAY + "Right-Click to open!");
				cBMeta.setLore(cBLore);
				cBook.setItemMeta(cBMeta);
				
				player.getInventory().addItem(cBook);
				return;
				}
				player.sendMessage(ChatColor.RED + "You do not have enough XP to buy this book!");
				return;
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant")){
				e.setCancelled(true);
				if(player.getLevel()>=50){
				player.setLevel(player.getLevel() - 50);
				ItemMeta uBMeta = uBook.getItemMeta();
				uBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
				List<String> uBLore = new ArrayList<String>();
				uBLore.add(ChatColor.GRAY + "Right-Click to open!");
				uBMeta.setLore(uBLore);
				uBook.setItemMeta(uBMeta);
				
				player.getInventory().addItem(uBook);
				return;
				}
				player.sendMessage(ChatColor.RED + "You do not have enough XP to buy this book!");
				return;
			}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant")){
				e.setCancelled(true);
				if(player.getLevel()>=75){
				player.setLevel(player.getLevel() - 75);
				ItemMeta rBMeta = rBook.getItemMeta();
				rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
				List<String> rBLore = new ArrayList<String>();
				rBLore.add(ChatColor.GRAY + "Right-Click to open!");
				rBMeta.setLore(rBLore);
				rBook.setItemMeta(rBMeta);
				
				player.getInventory().addItem(rBook);
				return;
				}
				player.sendMessage(ChatColor.RED + "You do not have enough XP to buy this book!");
				return;
			}
		}
	}

}
