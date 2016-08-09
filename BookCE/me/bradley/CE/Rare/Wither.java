package me.bradley.CE.Rare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Wither implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getDamager() instanceof Player){
				Player hit = (Player) e.getDamager();
				Player victim = (Player) e.getEntity();
				Random rand = new Random();
				int chance = rand.nextInt(2)+1;
				if(victim.getInventory().getBoots().getItemMeta().getLore().contains("§b§lWither I")){
					if(chance == 1){
					hit.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 0));
					hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit with wither§c!");
					}
				}
				if(victim.getInventory().getBoots().getItemMeta().getLore().contains("§b§lWither II")){
					if(chance==1){
					hit.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 1));
					hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit with wither§c!");
					}
				}
				if(victim.getInventory().getBoots().getItemMeta().getLore().contains("§b§lWither III")){
					if(chance==1){
					hit.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 2));
					hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit with wither§c!");
					}
				}
				if(victim.getInventory().getBoots().getItemMeta().getLore().contains("§b§lWither IV")){
					if(chance==1){
					hit.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 80, 3));
					hit.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been hit with wither§c!");
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_BOOTS){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither IV"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither I");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither IV"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither II");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither IV"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither III");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither IV")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lWither IV"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither IV");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither IV");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Wither IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
