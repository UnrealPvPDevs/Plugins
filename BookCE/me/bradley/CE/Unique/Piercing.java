package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

public class Piercing implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			final Arrow arrow = (Arrow) e.getDamager();
			if(arrow.getShooter() instanceof Player){
				Player shooter = (Player) arrow.getShooter();
				Player hit = (Player) e.getEntity();
				Random rand = new Random();
				int chance = rand.nextInt(2)+1;
				if(shooter.getItemInHand().getItemMeta().getLore().contains("§a§lPiercing I")){
					if(chance==1){
						double damage = hit.getLastDamage();
						hit.setLastDamage(damage*2);
						hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit by piercing§c!");
						return;
					}
				}
				if(shooter.getItemInHand().getItemMeta().getLore().contains("§a§lPiercing II")){
					if(chance==1){
						double damage = hit.getLastDamage();
						hit.setLastDamage(damage*3);
						hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit by piercing§c!");
						return;
					}
				}
				if(shooter.getItemInHand().getItemMeta().getLore().contains("§a§lPiercing III")){
					if(chance==1){
						double damage = hit.getLastDamage();
						hit.setLastDamage(damage*4);
						hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit by piercing§c!");
						return;
					}
				}
				if(shooter.getItemInHand().getItemMeta().getLore().contains("§a§lPiercing IV")){
					if(chance==1){
						double damage = hit.getLastDamage();
						hit.setLastDamage(damage*5);
						hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit by piercing§c!");
						return;
					}
				}
				if(shooter.getItemInHand().getItemMeta().getLore().contains("§a§lPiercing V")){
					if(chance==1){
						double damage = hit.getLastDamage();
						hit.setLastDamage(damage*6);
						hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit by piercing§c!");
						return;
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.BOW){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing V"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing IV")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing V"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing IV");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing IV")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing IV");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing V")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lPiercing V"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing V");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing V")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing V");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Piercing V")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
