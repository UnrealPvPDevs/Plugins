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

public class Tank implements Listener{
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
				Player victim = (Player) e.getEntity();
				if(e.isCancelled()){ return; }
				Random rand = new Random();
				if(victim.getInventory().getLeggings().getItemMeta().getLore().contains("§b§lTank I")){
					int chance = rand.nextInt(10)+1;
					if(chance==5){
						e.setCancelled(true);
						victim.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been protected by your tank enchantment§c!");
					}
				}
				if(victim.getInventory().getLeggings().getItemMeta().getLore().contains("§b§lTank II")){
					int chance = rand.nextInt(8)+1;
					if(chance==4){
						e.setCancelled(true);
						victim.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been protected by your tank enchantment§c!");
					}
				}
				if(victim.getInventory().getLeggings().getItemMeta().getLore().contains("§b§lTank III")){
					int chance = rand.nextInt(6)+1;
					if(chance==3){
						e.setCancelled(true);
						victim.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been protected by your tank enchantment§c!");
					}
				}
				if(victim.getInventory().getLeggings().getItemMeta().getLore().contains("§b§lTank IV")){
					int chance = rand.nextInt(5)+1;
					if(chance==3){
						e.setCancelled(true);
						victim.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been protected by your tank enchantment§c!");
					}
				}
				if(victim.getInventory().getLeggings().getItemMeta().getLore().contains("§b§lTank V")){
					int chance = rand.nextInt(4)+1;
					if(chance==2){
						e.setCancelled(true);
						victim.sendMessage("§8[§7§lUn§c§lReal§8] §7You have been protected by your tank enchantment§c!");
					}
				}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player player = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getType()==Material.DIAMOND_LEGGINGS){
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank I")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank I");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank I");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank I")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank II")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank II");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank II");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank II")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank III")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank III");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank III");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank III")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank IV")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank IV");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank IV");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank IV")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
				if(player.getItemOnCursor()!=null && player.getItemOnCursor().getType()==Material.BOOK && player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank V")){
					if(e.getCurrentItem().getItemMeta().hasLore() && !(e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank I")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank II")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank III")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank IV")
							&& e.getCurrentItem().getItemMeta().getLore().contains("§b§lTank V"))){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lores = e.getCurrentItem().getItemMeta().getLore();
						lores.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank V");
						iMeta.setLore(lores);
						iStack.setItemMeta(iMeta);
						
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank V")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
						}
					if(!e.getCurrentItem().getItemMeta().hasLore()){
						ItemStack iStack = e.getCurrentItem();
						ItemMeta iMeta = e.getCurrentItem().getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank V");
						iMeta.setLore(lore);
						iStack.setItemMeta(iMeta);
		                
						if(player.getItemOnCursor().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Tank V")){
							ItemStack air = new ItemStack(Material.AIR, 1);
							player.setItemOnCursor(air);
						}
					}
				}
		}
		}

}
