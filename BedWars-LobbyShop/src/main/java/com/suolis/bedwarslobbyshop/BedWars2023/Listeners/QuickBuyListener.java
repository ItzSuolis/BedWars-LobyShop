package com.suolis.bedwarslobbyshop.BedWars2023.Listeners;

import com.tomkeuper.bedwars.api.BedWars;
import com.suolis.bedwarslobbyshop.BedWars2023.Utils.CustomShop;
import com.tomkeuper.bedwars.api.database.IDatabase;
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
        HashMap<Integer, String> dbMap = new HashMap<>();
        IDatabase db = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getRemoteDatabase();

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
                dbMap.put(e.getSlot() + 9, "");
                db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
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
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.wool");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 11:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.clay"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.clay");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 12:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.glass"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.glass");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 13:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.stone"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.stone");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 14:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.ladder"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.ladder");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 15:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.wood"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.wood");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 16:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("blocks-category.category-content.obsidian"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "blocks-category.category-content.obsidian");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 19:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.stone-sword"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.stone-sword");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 20:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.iron-sword"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.iron-sword");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 21:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.diamond-sword"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.diamond-sword");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 22:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("melee-category.category-content.stick"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "melee-category.category-content.stick");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 23:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("armor-category.category-content.chainmail"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "armor-category.category-content.chainmail");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 24:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("armor-category.category-content.iron-armor"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "armor-category.category-content.iron-armor");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 25:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("armor-category.category-content.diamond-armor"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "armor-category.category-content.diamond-armor");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 28:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("tools-category.category-content.pickaxe"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "tools-category.category-content.pickaxe");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 29:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("tools-category.category-content.axe"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "tools-category.category-content.axe");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 30:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("tools-category.category-content.shears"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "tools-category.category-content.shears");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 31:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.arrow"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.arrow");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 32:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.bow1"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.bow1");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 33:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.bow2"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.bow2");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 34:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("ranged-category.category-content.bow3"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "ranged-category.category-content.bow3");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
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
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "potions-category.category-content.speed-potion");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 11:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("potions-category.category-content.jump-potion"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "potions-category.category-content.jump-potion");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 12:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("potions-category.category-content.invisibility"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "potions-category.category-content.invisibility");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 13:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.golden-apple"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.golden-apple");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 14:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.bedbug"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.bedbug");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 15:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.dream-defender"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.dream-defender");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 16:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.fireball"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.fireball");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 19:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.tnt"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.tnt");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 20:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.ender-pearl"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.ender-pearl");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 21:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.water-bucket"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.water-bucket");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 22:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.bridge-egg"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.bridge-egg");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 23:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.magic-milk"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.magic-milk");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 24:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.sponge"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.sponge");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
                    CustomShop.firstPage(p);
                    break;
                case 25:
                    for (int i = 19; i < 44; i++) {
                        if (i == 26 || i == 27 || i == 35 || i == 36)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i) == null)
                            continue;

                        if (db.getQuickBuySlots(p.getUniqueId(), i).equalsIgnoreCase("utility-category.category-content.tower"))
                            dbMap.put(i, "");
                    }

                    dbMap.put(slotMap.get(p.getUniqueId()) + 9, "utility-category.category-content.tower");
                    db.pushQuickBuyChanges(dbMap, p.getUniqueId(), Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getShopUtil().getPlayerQuickBuyCache().getElements());
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
