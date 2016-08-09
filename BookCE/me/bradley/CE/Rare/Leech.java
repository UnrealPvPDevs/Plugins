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

public class Leech implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		Random rand = new Random();
		int chance = rand.nextInt(5)+1;
		if(e.getEntity() instanceof Player){
			if(e.getDamager() instanceof Player){
				Player victim = (Player) e.getEntity();
				Player hitter = (Player) e.getDamager();
				if(hitter.getItemInHand().getType()==Material.DIAMOND_SWORD){
					if(hitter.getItemInHand().getItemMeta().getLore().contains("§b§lLeech I")){
						if(chance==3){
						int helm = victim.getInventory().getHelmet().getDurability();
						int chest = victim.getInventory().getChestplate().getDurability();
						int legs = victim.getInventory().getLeggings().getDurability();
						int boots = victim.getInventory().getBoots().getDurability();
						victim.getInventory().getHelmet().setDurability((short) (helm-1));
						victim.getInventory().getChestplate().setDurability((short) (chest-1));
						victim.getInventory().getLeggings().setDurability((short) (legs-1));
						victim.getInventory().getBoots().setDurability((short) (boots-1));
						}
					}
					if(hitter.getItemInHand().getItemMeta().getLore().contains("§b§lLeech II")){
						if(chance==3){
						int helm = victim.getInventory().getHelmet().getDurability();
						int chest = victim.getInventory().getChestplate().getDurability();
						int legs = victim.getInventory().getLeggings().getDurability();
						int boots = victim.getInventory().getBoots().getDurability();
						victim.getInventory().getHelmet().setDurability((short) (helm-2));
						victim.getInventory().getChestplate().setDurability((short) (chest-2));
						victim.getInventory().getLeggings().setDurability((short) (legs-2));
						victim.getInventory().getBoots().setDurability((short) (boots-2));
						}
					}
					if(hitter.getItemInHand().getItemMeta().getLore().contains("§b§lLeech III")){
						if(chance==3){
						int helm = victim.getInventory().getHelmet().getDurability();
						int chest = victim.getInventory().getChestplate().getDurability();
						int legs = victim.getInventory().getLeggings().getDurability();
						int boots = victim.getInventory().getBoots().getDurability();
						victim.getInventory().getHelmet().setDurability((short) (helm-3));
						victim.getInventory().getChestplate().setDurability((short) (chest-3));
						victim.getInventory().getLeggings().setDurability((short) (legs-3));
						victim.getInventory().getBoots().setDurability((short) (boots-3));
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_SWORD){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!(e.getCurrentItem().getItemMeta().hasLore())){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!(e.getCurrentItem().getItemMeta().hasLore())){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lLeech III"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!(e.getCurrentItem().getItemMeta().hasLore())){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Leech III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
