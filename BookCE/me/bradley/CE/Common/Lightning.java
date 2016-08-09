package me.bradley.CE.Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Lightning implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			final Arrow arrow = (Arrow) e.getDamager();
			if(arrow.getShooter() instanceof Player){
				Player shooter = (Player) arrow.getShooter();
				if(e.getEntity() instanceof Player){
					Player hit = (Player) e.getEntity();
					if(e.isCancelled()){ return; }
			if(shooter.getItemInHand().getItemMeta().getLore().contains(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I")){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
				}
			}
			if(shooter.getItemInHand().getItemMeta().getLore().contains(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II")){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
				}
			}
			if(shooter.getItemInHand().getItemMeta().getLore().contains(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III")){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
				}
			}
			if(shooter.getItemInHand().getItemMeta().getLore().contains(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV")){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){				
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
				}
			}
			if(shooter.getItemInHand().getItemMeta().getLore().contains(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V")){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "smite " + hit.getName());
				}
			}
			}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.BOW){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning V"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning V"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§f§lLightning V"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "Lightning V")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
