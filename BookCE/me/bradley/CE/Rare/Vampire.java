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

public class Vampire implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getDamager() instanceof Player){
				Player victim = (Player) e.getEntity();
				Player hit = (Player) e.getDamager();
				Random rand = new Random();
				int chance = rand.nextInt(3)+1;
				if(chance == 2){
				if(hit.getItemInHand().getType()==Material.DIAMOND_AXE){
					if(hit.getItemInHand().getItemMeta().getLore().contains("§b§lVampier I")){
						int health = (int) (hit.getHealth() + 2);
						if (health > hit.getMaxHealth()) health = (int) hit.getMaxHealth();
						hit.setHealth(health);
						victim.setHealth(victim.getHealth() - 2);
					}
					if(hit.getItemInHand().getItemMeta().getLore().contains("§b§lVampier II")){
						int health = (int) (hit.getHealth() + 4);
						if (health > hit.getMaxHealth()) health = (int) hit.getMaxHealth();
						hit.setHealth(health);
						victim.setHealth(victim.getHealth() - 4);
					}
					if(hit.getItemInHand().getItemMeta().getLore().contains("§b§lVampier III")){
						int health = (int) (hit.getHealth() + 6);
						if (health > hit.getMaxHealth()) health = (int) hit.getMaxHealth();
						hit.setHealth(health);
						victim.setHealth(victim.getHealth() - 6);
					}
				}
				}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_AXE){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!(e.getCurrentItem().getItemMeta().hasLore())){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!(e.getCurrentItem().getItemMeta().hasLore())){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lVampire III"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!(e.getCurrentItem().getItemMeta().hasLore())){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Vampire III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
