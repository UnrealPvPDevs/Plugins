package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.codingforcookies.armorequip.ArmorEquipEvent;

public class Hardened implements Listener{
	
	@EventHandler
	public void onWear(ArmorEquipEvent e){
		Player player = e.getPlayer();
		if(e.getNewArmorPiece()!=null){
			if(e.getNewArmorPiece().getType()==Material.DIAMOND_BOOTS || e.getNewArmorPiece().getType()==Material.DIAMOND_HELMET){
				if(e.getNewArmorPiece().getItemMeta().getLore().contains("§a§lHardened I")){
					short helm = e.getNewArmorPiece().getDurability();
					short boots = e.getNewArmorPiece().getDurability();
					player.getInventory().getHelmet().setDurability((short) (helm*2));
					player.getInventory().getBoots().setDurability((short) (boots*2));
				}
				if(e.getNewArmorPiece().getItemMeta().getLore().contains("§a§lHardened II")){
					short helm = e.getNewArmorPiece().getDurability();
					short boots = e.getNewArmorPiece().getDurability();
					player.getInventory().getHelmet().setDurability((short) (helm*3));
					player.getInventory().getBoots().setDurability((short) (boots*3));
				}
				if(e.getNewArmorPiece().getItemMeta().getLore().contains("§a§lHardened III")){
					short helm = e.getNewArmorPiece().getDurability();
					short boots = e.getNewArmorPiece().getDurability();
					player.getInventory().getHelmet().setDurability((short) (helm*4));
					player.getInventory().getBoots().setDurability((short) (boots*4));
				}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_HELMET || e.getCurrentItem().getType()==Material.DIAMOND_BOOTS){
			if(e.isCancelled()){ return; }
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened I");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened II");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lHardened III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened III");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Hardened III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
			}
	}

}
