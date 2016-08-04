package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SOS implements Listener{
	
	@EventHandler
	public void applyDefenseEffect(EntityDamageEvent e){
		if(e.getEntity() instanceof Player){
		Player player = (Player) e.getEntity();
		if(player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I")){
			if(player.getHealth()==2){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 3));
					player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10, 1));
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 2));
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 5, 1));
				}
			}
		}
		if(player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II")){
			if(player.getHealth()==2){
				Random rand = new Random();
				int chance = rand.nextInt(4)+1;
				if(chance == 2){
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20, 6));
					player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20, 2));
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 20, 4));
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 2));
				}
			}
		}
		if(player.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III")){
			if(player.getHealth()==2){
				Random rand = new Random();
				int chance = rand.nextInt(3)+1;
				if(chance == 2){
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 30, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 30, 3));
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 30, 6));
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 15, 3));
				}
			}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_BOOTS){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSOS III"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "SOS III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
	}
}
