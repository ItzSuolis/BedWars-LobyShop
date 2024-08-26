/*
 * BedWars1058 - A bed wars mini-game.
 * Copyright (C) 2021 Andrei Dascălu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Contact e-mail: andrew.dascalu@gmail.com
 */

package com.suolis.bedwarslobbyshop.BedWars1058.Listeners;

import com.andrei1058.bedwars.api.BedWars;
import com.suolis.bedwarslobbyshop.BedWars1058.Utils.CustomShop;
import com.suolis.bedwarslobbyshop.BedWars1058.Utils.Database;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class QuickBuyListener implements Listener {
    private final Map<UUID, Integer> slotMap;
    
    public QuickBuyListener() {
        slotMap = new HashMap<>();
    }

    @EventHandler
    public void onLobbyShop(InventoryClickEvent e) {
        if (!(e.getWhoClicked() instanceof Player))
            return;

        Player p = (Player) e.getWhoClicked();
        Database db = new Database();

        if (Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getArenaUtil().getArenaByPlayer(p) != null)
            return;

        if (e.getInventory().getName().equalsIgnoreCase("Edit Quick Buy")) {
            if (e.getCurrentItem() == null)
                return;

            if (e.getCurrentItem().getType() == Material.AIR)
                return;

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lClose")) {
                p.closeInventory();
                return;
            }

            if (e.isRightClick()) {
                db.pushQuickBuyChanges(e.getSlot() + 9, "", p.getUniqueId());
                
                CustomShop.firstPage(p);
            }

            if (e.isLeftClick()) {
                slotMap.put(p.getUniqueId(), e.getSlot());
                CustomShop.secondPage(p);
            }
        } else if (e.getInventory().getName().equalsIgnoreCase("(1/2) Adding to Quick Buy...")) {
            switch (e.getSlot()) {
                case 10:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.wool"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.wool", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 11:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.clay"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.clay", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 12:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.glass"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.glass", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 13:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.stone"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.stone", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 14:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.ladder"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.ladder", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 15:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.wood"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.wood", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 16:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.obsidian"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.obsidian", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 19:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.stone-sword"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.stone-sword", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 20:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.iron-sword"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.iron-sword", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 21:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.diamond-sword"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.diamond-sword", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 22:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.stick"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.stick", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 23:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("armor-category.category-content.chainmail"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "armor-category.category-content.chainmail", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 24:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("armor-category.category-content.iron-armor"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "armor-category.category-content.iron-armor", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 25:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("armor-category.category-content.diamond-armor"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "armor-category.category-content.diamond-armor", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 28:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("tools-category.category-content.pickaxe"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "tools-category.category-content.pickaxe", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 29:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("tools-category.category-content.axe"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "tools-category.category-content.axe", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 30:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("tools-category.category-content.shears"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "tools-category.category-content.shears", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 31:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.arrow"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.arrow", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 32:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.bow1"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.bow1", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 33:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.bow2"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.bow2", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 34:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.bow3"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.bow3", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 49:
                    CustomShop.firstPage(p);
                    break;
                case 53:
                    CustomShop.thirdPage(p);
                    break;
            }
        } else if (e.getInventory().getName().equalsIgnoreCase("(2/2) Adding to Quick Buy...")) {
            switch (e.getSlot()) {
                case 10:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("potions-category.category-content.speed-potion"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "potions-category.category-content.speed-potion", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 11:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("potions-category.category-content.jump-potion"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "potions-category.category-content.jump-potion", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 12:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("potions-category.category-content.invisibility"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "potions-category.category-content.invisibility", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 13:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.golden-apple"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.golden-apple", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 14:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.bedbug"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.bedbug", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 15:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.dream-defender"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.dream-defender", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 16:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.fireball"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.fireball", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 19:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.tnt"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.tnt", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 20:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.ender-pearl"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.ender-pearl", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 21:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.water-bucket"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.water-bucket", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 22:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.bridge-egg"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.bridge-egg", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 23:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.magic-milk"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.magic-milk", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 24:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.sponge"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.sponge", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 25:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.tower"))
                            db.pushQuickBuyChanges(i, "", p.getUniqueId());
                    }

                    db.pushQuickBuyChanges(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.tower", p.getUniqueId());
                    
                    CustomShop.firstPage(p);
                    break;
                case 45:
                    CustomShop.secondPage(p);
                    break;
                case 49:
                    CustomShop.firstPage(p);
                    break;
            }
        }

        e.setCancelled(true);
    }

    @EventHandler
    public void onInvClose(InventoryCloseEvent e) {
        if (e.getInventory().getName().equalsIgnoreCase("(1/2) Adding to Quick Buy...") ||
                e.getInventory().getName().equalsIgnoreCase("(2/2) Adding to Quick Buy...") ||
                e.getInventory().getName().equalsIgnoreCase("Edit Quick Buy"))
            slotMap.remove(e.getPlayer().getUniqueId());
    }

}
