package me.bradley.CE.Unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.codingforcookies.armorequip.ArmorEquipEvent;

public class Speed implements Listener{
	
	@EventHandler
	public void onWear(ArmorEquipEvent e){
		Player player = e.getPlayer();
		if(e.getNewArmorPiece()!=null && e.getNewArmorPiece().getItemMeta().getLore().contains("§a§lSpeed I")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 0));
			return;
		}else if(e.getNewArmorPiece()!=null && e.getNewArmorPiece().getItemMeta().getLore().contains("§a§lSpeed II")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1));
			return;
		}else if(e.getNewArmorPiece()!=null && e.getNewArmorPiece().getItemMeta().getLore().contains("§a§lSpeed III")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 2));
			return;
		}else if(e.getOldArmorPiece()!=null && e.getOldArmorPiece().getItemMeta().getLore().contains("§f§lSpeed I")
				|| e.getOldArmorPiece()!=null && e.getOldArmorPiece().getItemMeta().getLore().contains("§f§lSpeed II")
				|| e.getOldArmorPiece()!=null && e.getOldArmorPiece().getItemMeta().getLore().contains("§f§lSpeed III")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0), true);
			return;
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_BOOTS){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed I");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed I")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
			}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed III"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
						if(!e.getCurrentItem().getItemMeta().hasLore()){
							ItemStack iStack = e.getCurrentItem();
							ItemMeta iMeta = e.getCurrentItem().getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed II");
							iMeta.setLore(lore);
							iStack.setItemMeta(iMeta);
			                
							if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed II")){
								ItemStack air = new ItemStack(Material.AIR, 1);
								player.setItemOnCursor(air);
							}
						}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§a§lSpeed III"))){
					ItemStack iStack = e.getCurrentItem();
					ItemMeta iMeta = e.getCurrentItem().getItemMeta();
					List<String> lores = e.getCurrentItem().getItemMeta().getLore();
					lores.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed III");
					iMeta.setLore(lores);
					iStack.setItemMeta(iMeta);
					if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed III")){
						player.getInventory().remove(player.getItemOnCursor());
					}
					}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "" + ChatColor.BOLD + "Speed III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
	}
		}

}
