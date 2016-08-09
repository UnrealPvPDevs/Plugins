package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Explosive implements Listener{
	
	public HashMap<String, Boolean> suppressDamage = new HashMap<String, Boolean>();
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		Player player = e.getPlayer();
		if(player.getItemInHand().getType()==Material.DIAMOND_PICKAXE){
			if(e.isCancelled()){ return; }
			if(player.getItemInHand().getItemMeta().getLore().contains("§a§lExplosive I")){
				suppressDamage.put(player.getName(), true);
				Location loc = e.getBlock().getLocation();
				World world = loc.getWorld();
				world.createExplosion(loc, 4.0F);
			}
			if(player.getItemInHand().getItemMeta().getLore().contains("§a§lExplosive II")){
				suppressDamage.put(player.getName(), true);
				Location loc = e.getBlock().getLocation();
				World world = loc.getWorld();
				world.createExplosion(loc, 8.0F);
			}
			if(player.getItemInHand().getItemMeta().getLore().contains("§a§lExplosive III")){
				suppressDamage.put(player.getName(), true);
				Location loc = e.getBlock().getLocation();
				World world = loc.getWorld();
				world.createExplosion(loc, 4.0F);
			}
		}
	}
	
	@EventHandler
	public void onTnTBlow(EntityDamageByBlockEvent e){
		if(e.getCause().equals(DamageCause.BLOCK_EXPLOSION)){
			if(suppressDamage.containsKey(e.getEntity().getName())){
				e.setCancelled(true);
				suppressDamage.remove(e.getEntity().getName(), true);
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_PICKAXE){
			if(e.isCancelled()){ return; }
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive I");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive II");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lExplosive III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive III");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Explosive III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
			}
	}

}
