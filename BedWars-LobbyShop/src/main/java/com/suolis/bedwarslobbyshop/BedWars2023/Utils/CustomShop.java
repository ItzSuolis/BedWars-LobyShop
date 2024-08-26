package com.suolis.bedwarslobbyshop.BedWars2023.Utils;

import com.tomkeuper.bedwars.api.BedWars;
import com.tomkeuper.bedwars.api.database.IDatabase;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class CustomShop {
    public static void firstPage(Player p) {
        Inventory shop = p.getServer().createInventory(p, 54, "Edit Quick Buy");
        IDatabase db = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getRemoteDatabase();

        for (int i = 19; i < 44; i++) {
            if (i == 26 || i == 27 || i == 35 || i == 36)
                continue;

            if (db.getQuickBuySlots(p.getUniqueId(), i) == null) {
                shop.setItem(i - 9, QuickUtil.getItemForQuickBuy(""));
                continue;
            }

            shop.setItem(i - 9, QuickUtil.getItemForQuickBuy(db.getQuickBuySlots(p.getUniqueId(), i)));
        }

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta closeMeta = close.getItemMeta();

        closeMeta.setDisplayName(clr("&c&lClose"));
        close.setItemMeta(closeMeta);

        shop.setItem(49, close);

        p.openInventory(shop);
    }

    public static void secondPage(Player p) {
        Inventory shop = p.getServer().createInventory(p, 54, "(1/2) Adding to Quick Buy...");

        shop.setItem(10, QuickUtil.getItem("blocks-category.category-content.wool"));
        shop.setItem(11, QuickUtil.getItem("blocks-category.category-content.clay"));
        shop.setItem(12, QuickUtil.getItem("blocks-category.category-content.glass"));
        shop.setItem(13, QuickUtil.getItem("blocks-category.category-content.stone"));
        shop.setItem(14, QuickUtil.getItem("blocks-category.category-content.ladder"));
        shop.setItem(15, QuickUtil.getItem("blocks-category.category-content.wood"));
        shop.setItem(16, QuickUtil.getItem("blocks-category.category-content.obsidian"));
        shop.setItem(19, QuickUtil.getItem("melee-category.category-content.stone-sword"));
        shop.setItem(20, QuickUtil.getItem("melee-category.category-content.iron-sword"));
        shop.setItem(21, QuickUtil.getItem("melee-category.category-content.diamond-sword"));
        shop.setItem(22, QuickUtil.getItem("melee-category.category-content.stick"));
        shop.setItem(23, QuickUtil.getItem("armor-category.category-content.chainmail"));
        shop.setItem(24, QuickUtil.getItem("armor-category.category-content.iron-armor"));
        shop.setItem(25, QuickUtil.getItem("armor-category.category-content.diamond-armor"));
        shop.setItem(28, QuickUtil.getItem("tools-category.category-content.pickaxe"));
        shop.setItem(29, QuickUtil.getItem("tools-category.category-content.axe"));
        shop.setItem(30, QuickUtil.getItem("tools-category.category-content.shears"));
        shop.setItem(31, QuickUtil.getItem("ranged-category.category-content.arrow"));
        shop.setItem(32, QuickUtil.getItem("ranged-category.category-content.bow1"));
        shop.setItem(33, QuickUtil.getItem("ranged-category.category-content.bow2"));
        shop.setItem(34, QuickUtil.getItem("ranged-category.category-content.bow3"));

        ItemStack next = new ItemStack(Material.ARROW);
        ItemStack back = new ItemStack(Material.ARROW);
        ItemMeta nextMeta = back.getItemMeta();
        ItemMeta backMeta = back.getItemMeta();

        nextMeta.setDisplayName(clr("&6&lNext Page"));
        nextMeta.setLore(Collections.singletonList(clr("&ePage 2")));
        backMeta.setDisplayName(clr("&e&lGo Back"));
        backMeta.setLore(Collections.singletonList(clr("&7To edit Quick Buy")));

        next.setItemMeta(nextMeta);
        back.setItemMeta(backMeta);

        shop.setItem(53, next);
        shop.setItem(49, back);

        p.openInventory(shop);
    }

    public static void thirdPage(Player p) {
        Inventory shop = p.getServer().createInventory(p, 54, "(2/2) Adding to Quick Buy...");

        shop.setItem(10, QuickUtil.getItem("potions-category.category-content.speed-potion"));
        shop.setItem(11, QuickUtil.getItem("potions-category.category-content.jump-potion"));
        shop.setItem(12, QuickUtil.getItem("potions-category.category-content.invisibility"));
        shop.setItem(13, QuickUtil.getItem("utility-category.category-content.golden-apple"));
        shop.setItem(14, QuickUtil.getItem("utility-category.category-content.bedbug"));
        shop.setItem(15, QuickUtil.getItem("utility-category.category-content.dream-defender"));
        shop.setItem(16, QuickUtil.getItem("utility-category.category-content.fireball"));
        shop.setItem(19, QuickUtil.getItem("utility-category.category-content.tnt"));
        shop.setItem(20, QuickUtil.getItem("utility-category.category-content.ender-pearl"));
        shop.setItem(21, QuickUtil.getItem("utility-category.category-content.water-bucket"));
        shop.setItem(22, QuickUtil.getItem("utility-category.category-content.bridge-egg"));
        shop.setItem(23, QuickUtil.getItem("utility-category.category-content.magic-milk"));
        shop.setItem(24, QuickUtil.getItem("utility-category.category-content.sponge"));

        ItemStack previous = new ItemStack(Material.ARROW);
        ItemStack back = new ItemStack(Material.ARROW);
        ItemMeta nextMeta = back.getItemMeta();
        ItemMeta backMeta = back.getItemMeta();

        nextMeta.setDisplayName(clr("&6&lPrevious Page"));
        nextMeta.setLore(Collections.singletonList(clr("&ePage 1")));
        backMeta.setDisplayName(clr("&e&lGo Back"));
        backMeta.setLore(Collections.singletonList(clr("&7To edit Quick Buy")));

        previous.setItemMeta(nextMeta);
        back.setItemMeta(backMeta);

        shop.setItem(45, previous);
        shop.setItem(49, back);

        p.openInventory(shop);
    }

    public static String clr(String txt) {
        return ChatColor.translateAlternateColorCodes('&', txt);
    }

}
