package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Smelting implements Listener{
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		Player player = e.getPlayer();
			if(player.getItemInHand().getType()==Material.DIAMOND_PICKAXE){
				if(player.getItemInHand().getItemMeta().getLore().contains("§a§lSmelting I")){
					if(e.getBlock().getType()==Material.IRON_ORE){
						e.setCancelled(true);
						e.getBlock().setType(Material.AIR);
						ItemStack drops = new ItemStack(Material.IRON_INGOT, 1);
						World world = e.getBlock().getWorld();
						world.dropItem(e.getBlock().getLocation(), drops);
					}
					if(e.getBlock().getType()==Material.GOLD_ORE){
						e.setCancelled(true);
						e.getBlock().setType(Material.AIR);
						ItemStack drops = new ItemStack(Material.GOLD_INGOT, 1);
						World world = e.getBlock().getWorld();
						world.dropItem(e.getBlock().getLocation(), drops);
					}
				}
			}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_PICKAXE){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Smelting I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSmelting I"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Smelting I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Smelting I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Smelting I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Smelting I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
		}
		}

}
