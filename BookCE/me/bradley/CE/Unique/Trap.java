package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.List;

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

public class Trap implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		if(e.getEntity() instanceof Player){
			Player target = (Player) e.getEntity();
			Player pu = (Player) e.getDamager();
			if(e.isCancelled()){ return; }
		if(pu.getItemInHand()!=null && pu.getItemInHand().getType()==Material.DIAMOND_SWORD && pu.getItemInHand().getItemMeta().getLore().contains(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I")){
			target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 5));
			return;
		}
		if(pu.getItemInHand()!=null && pu.getItemInHand().getType()==Material.DIAMOND_SWORD && pu.getItemInHand().getItemMeta().getLore().contains(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II")){
			target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20, 10));
			return;
		}
		if(pu.getItemInHand()!=null && pu.getItemInHand().getType()==Material.DIAMOND_SWORD && pu.getItemInHand().getItemMeta().getLore().contains(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III")){
			target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 30, 15));
			return;
		}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_SWORD){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lTrap III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Trap III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}
}
