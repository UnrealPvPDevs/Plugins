package me.bradley.BookCE.Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BooksRandom implements Listener{
	
	@EventHandler
	public void onClick(PlayerInteractEvent e){
		Player player = e.getPlayer();
		if(e.getAction()==Action.RIGHT_CLICK_AIR||e.getAction()==Action.RIGHT_CLICK_BLOCK){
		     if(player.getItemInHand()!=null && player.getItemInHand().getType()==Material.BOOK && player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book")){
		    	 Random rand = new Random();
		    	 int book = rand.nextInt(16)+1;
		    	 if(book==1){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Trolling I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.GRAY + "Trolls your opponent!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==2){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Jump Boost I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Applies Jump Boost");
		    		 hbLore.add(ChatColor.GRAY + "Apply to boots");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==3){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Jump Boost II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Applies Jump Boost");
		    		 hbLore.add(ChatColor.GRAY + "Apply to boots");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==4){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Jump Boost III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Applies Jump Boost");
		    		 hbLore.add(ChatColor.GRAY + "Apply to boots");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==5){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance to smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a bow");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==6){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance to smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a bow");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==7){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance to smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a bow");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==8){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance to smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a bow");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==9){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance to smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a bow");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==10){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to leggings");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==11){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to leggings");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==12){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to leggings");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==13){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller IV");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to leggings");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==14){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller V");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Chance smite your enemy");
		    		 hbLore.add(ChatColor.GRAY + "Apply to leggings");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==15){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Light I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you night vision");
		    		 hbLore.add(ChatColor.GRAY + "Apply to helmet");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book==16){
		    		 ItemStack tr1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta tr1Meta = tr1.getItemMeta();
		    		 tr1Meta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Sea Monster I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you night vision");
		    		 hbLore.add(ChatColor.GRAY + "Apply to helmet");
		    		 tr1Meta.setLore(hbLore);
		    		 tr1.setItemMeta(tr1Meta); 
		    		 player.getInventory().addItem(tr1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.WHITE + "" + ChatColor.BOLD + "Common Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
			}
		     if(player.getItemInHand()!=null && player.getItemInHand().getType()==Material.BOOK && player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book")){
		    	 Random rand2 = new Random();
		    	 int book2 = rand2.nextInt(17)+1;
		    	 if(book2==1){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Agile I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you haste!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==2){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Agile II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you haste!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook); 
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==3){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Agile III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you haste!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==4){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Traps you enemy!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==5){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Traps you enemy!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==6){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Traps you enemy!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a sword");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==7){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you speed!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==8){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you speed!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==9){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you speed!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==10){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "SOS! Apply this enchantment to boots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to boots");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==11){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "SOS! Apply this enchantment to boots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to boots");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==12){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "SOS! Apply this enchantment to boots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to boots");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==13){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Has a chance to deal double damage on bow shots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to bow");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==14){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Has a chance to deal double damage on bow shots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to bow");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==15){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Has a chance to deal double damage on bow shots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to bow");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==16){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing IV");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Has a chance to deal double damage on bow shots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to bow");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book2==17){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing V");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Has a chance to deal double damage on bow shots!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to bow");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Unique Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
				}
		     if(player.getItemInHand()!=null && player.getItemInHand().getType()==Material.BOOK && player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book")){
		    	 Random rand3 = new Random();
		    	 int book3 = rand3.nextInt(13)+1;
		    	 if(book3==1){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Health Boost I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra hearts!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a chestplate");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==2){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Health Boost II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra hearts!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a chestplate");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==3){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Health Boost III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra hearts!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a chestplate");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==4){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Wizdom I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra EXP on mob kills!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==5){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Wizdom II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra EXP on mob kills!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==6){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Wizdom III");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra EXP on mob kills!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==7){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Wizdom IV");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you extra EXP on mob kills!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==8){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Adds fury to your bow shots!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==9){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Adds fury to your bow shots!");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta);
                     player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==10){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Lavamob I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you fire resistance!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a chestplate");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==11){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Brawn I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you strength and mining fatigue!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a helemt");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==12){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Brawn I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you strength and mining fatigue!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a helemt");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		    	 if(book3==13){
		    		 ItemStack hb1 = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta hb1Meta = hb1.getItemMeta();
		    		 hb1Meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Brawn I");
		    		 List<String> hbLore = new ArrayList<String>();
		    		 hbLore.add(ChatColor.WHITE + "Gives you strength and mining fatigue!");
		    		 hbLore.add(ChatColor.GRAY + "Apply to a helemt");
		    		 hb1Meta.setLore(hbLore);
		    		 hb1.setItemMeta(hb1Meta); 
		    		 player.getInventory().addItem(hb1);
		    		 
		    		 ItemStack rBook = new ItemStack(Material.BOOK, 1);
		    		 ItemMeta rBMeta = rBook.getItemMeta();
		    		 rBMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Rare Enchant Book");
		    		 List<String> lore = new ArrayList<String>();
		    		 lore.add(ChatColor.GRAY + "Right-Click to open!");
		    		 rBMeta.setLore(lore);
		    		 rBook.setItemMeta(rBMeta);
		    		 player.getInventory().remove(rBook);
		    		 player.getInventory().removeItem(rBook);
		    		 player.updateInventory();
		    	 }
		     }  
		}
	}
}