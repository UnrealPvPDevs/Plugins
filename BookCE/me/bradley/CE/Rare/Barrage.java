package me.bradley.CE.Rare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Barrage implements Listener{
	
	@EventHandler
	public void onShoot(EntityShootBowEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getForce() == 1.0){
				Entity arrow = e.getProjectile();
				Random rand = new Random();
				int chance = rand.nextInt(5)+1;
				Location loc = arrow.getLocation();
				loc.add(1, 1, 0);
				Float speed = e.getForce();
				if(chance == 3){
					if(e.getBow().getItemMeta().getLore().contains("§b§lBarrage I")){
						for (int i = 0; i < 3; i++){
		                    arrow.getWorld().spawnArrow(loc, arrow.getVelocity(), speed, 12F);
		                }
					}
					if(e.getBow().getItemMeta().getLore().contains("§b§lBarrage II")){
						for (int i = 0; i < 6; i++){
		                    arrow.getWorld().spawnArrow(loc, arrow.getVelocity(), speed, 12F);
		                }
					}
					if(e.getBow().getItemMeta().getLore().contains("§b§lBarrage III")){
						for (int i = 0; i < 9; i++){
		                    arrow.getWorld().spawnArrow(loc, arrow.getVelocity(), speed, 12F);
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
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lBarrage III"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Barrage III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
