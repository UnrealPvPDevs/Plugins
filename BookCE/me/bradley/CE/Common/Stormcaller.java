package me.bradley.CE.Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Stormcaller implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getDamager() instanceof Player){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				Player hit = (Player) e.getEntity();
				Player attacker = (Player) e.getDamager();
				if(e.isCancelled()){ return; }
				if(attacker.getInventory().getLeggings().getItemMeta().getLore().contains("§f§lStormcaller I")){
					if(chance == 1){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					return;
					}
				}
				if(attacker.getInventory().getLeggings().getItemMeta().getLore().contains("§f§lStormcaller II")){
					if(chance == 1){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					return;
					}
				}
				if(attacker.getInventory().getLeggings().getItemMeta().getLore().contains("§f§lStormcaller III")){
					if(chance == 1){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					return;
					}
				}
				if(attacker.getInventory().getLeggings().getItemMeta().getLore().contains("§f§lStormcaller IV")){
					if(chance == 1){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					return;
					}
				}
				if(attacker.getInventory().getLeggings().getItemMeta().getLore().contains("§f§lStormcaller V")){
					if(chance == 1){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lightning " + hit.getName());
					return;
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_LEGGINGS){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller I")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller II")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller III")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller IV")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller I")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller II")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller III")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller IV")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller III");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller III");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller III")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller IV")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller I")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller II")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller III")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller IV")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller IV");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller IV");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller IV")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller V")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller I")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller II")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller III")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller IV")
							|| e.getCurrentItem().getItemMeta().getLore().contains("§f§lStormcaller V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller V");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller V")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller V");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Stormcaller V")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
		}
		}

}
