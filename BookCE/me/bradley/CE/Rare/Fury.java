package me.bradley.CE.Rare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Fury implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			final Arrow arrow = (Arrow) e.getDamager();
			if(arrow.getShooter() instanceof Player){
				Player shooter = (Player) arrow.getShooter();
				if(e.getEntity() instanceof Player){
					Player hit = (Player) e.getEntity();
			if(shooter.getInventory().getItemInHand().getItemMeta().getLore().contains(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I")){
				Random rand = new Random();
				int chance = rand.nextInt(10)+1;
				if(chance == 5){
					hit.setFireTicks(20);
					hit.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 2));
					for(Player online : Bukkit.getOnlinePlayers()){
						online.playEffect(hit.getLocation(), Effect.MOBSPAWNER_FLAMES, 10);
					}
				}
			}
			if(shooter.getInventory().getItemInHand().getItemMeta().getLore().contains(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II")){
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				if(chance == 3){
					hit.setFireTicks(40);
					hit.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 80, 4));
					for(Player online : Bukkit.getOnlinePlayers()){
						online.playEffect(hit.getLocation(), Effect.MOBSPAWNER_FLAMES, 10);
					}
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
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lFury I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lFury II"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lFury I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lFury II"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Fury II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
		}
		}

}
