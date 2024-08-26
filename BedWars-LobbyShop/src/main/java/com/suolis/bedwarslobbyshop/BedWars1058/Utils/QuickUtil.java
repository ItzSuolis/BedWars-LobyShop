package com.suolis.bedwarslobbyshop.BedWars1058.Utils;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.configuration.ConfigManager;
import com.andrei1058.bedwars.api.language.Language;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class QuickUtil {
    private static final ConfigManager shopConfig = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getConfigs().getShopConfig();
    private static final Language langConfig = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getDefaultLang();

    public static ItemStack getItemForQuickBuy(String itemName) {
        switch (itemName) {
            case "armor-category.category-content.diamond-armor":
                ItemStack diamond_armor = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta = diamond_armor.getItemMeta();
                meta.setDisplayName(clr(langConfig.getString("shop-items-messages.armor-category.content-item-diamond-armor-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.armor-category.content-item-diamond-armor-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta.addEnchant(Enchantment.DURABILITY, 5, false);

                lore.add("");
                lore.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore.add(clr("&eRight Click &7to remove this item slot."));

                meta.setLore(lore);
                diamond_armor.setItemMeta(meta);
                diamond_armor.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return diamond_armor;
            case "armor-category.category-content.iron-armor":
                ItemStack iron_armor = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta1 = iron_armor.getItemMeta();
                meta1.setDisplayName(clr(langConfig.getString("shop-items-messages.armor-category.content-item-iron-armor-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore1 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.armor-category.content-item-iron-armor-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore1.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta1.addEnchant(Enchantment.DURABILITY, 5, false);

                lore1.add("");
                lore1.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore1.add(clr("&eRight Click &7to remove this item slot."));

                meta1.setLore(lore1);
                iron_armor.setItemMeta(meta1);
                iron_armor.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return iron_armor;
            case "armor-category.category-content.chainmail":
                ItemStack chainmail = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta2 = chainmail.getItemMeta();
                meta2.setDisplayName(clr(langConfig.getString("shop-items-messages.armor-category.content-item-chainmail-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore2 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.armor-category.content-item-chainmail-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore2.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta2.addEnchant(Enchantment.DURABILITY, 5, false);

                lore2.add("");
                lore2.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore2.add(clr("&eRight Click &7to remove this item slot."));

                meta2.setLore(lore2);
                chainmail.setItemMeta(meta2);
                chainmail.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return chainmail;
            case "blocks-category.category-content.wool":
                ItemStack wool = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta3 = wool.getItemMeta();
                meta3.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-wool-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore3 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-wool-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore3.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta3.addEnchant(Enchantment.DURABILITY, 5, false);

                lore3.add("");
                lore3.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore3.add(clr("&eRight Click &7to remove this item slot."));

                meta3.setLore(lore3);
                wool.setItemMeta(meta3);
                wool.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return wool;
            case "blocks-category.category-content.clay":
                ItemStack clay = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta4 = clay.getItemMeta();
                meta4.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-clay-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore4 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-clay-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore4.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta4.addEnchant(Enchantment.DURABILITY, 5, false);

                lore4.add("");
                lore4.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore4.add(clr("&eRight Click &7to remove this item slot."));

                meta4.setLore(lore4);
                clay.setItemMeta(meta4);
                clay.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return clay;
            case "blocks-category.category-content.glass":
                ItemStack glass = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta5 = glass.getItemMeta();
                meta5.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-glass-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore5 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-glass-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore5.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta5.addEnchant(Enchantment.DURABILITY, 5, false);

                lore5.add("");
                lore5.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore5.add(clr("&eRight Click &7to remove this item slot."));

                meta5.setLore(lore5);
                glass.setItemMeta(meta5);
                glass.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return glass;
            case "blocks-category.category-content.stone":
                ItemStack stone = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta6 = stone.getItemMeta();
                meta6.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-stone-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore6 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-stone-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore6.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta6.addEnchant(Enchantment.DURABILITY, 5, false);

                lore6.add("");
                lore6.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore6.add(clr("&eRight Click &7to remove this item slot."));

                meta6.setLore(lore6);
                stone.setItemMeta(meta6);
                stone.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return stone;
            case "blocks-category.category-content.ladder":
                ItemStack ladder = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta7 = ladder.getItemMeta();
                meta7.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-ladder-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore7 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-ladder-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore7.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta7.addEnchant(Enchantment.DURABILITY, 5, false);

                lore7.add("");
                lore7.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore7.add(clr("&eRight Click &7to remove this item slot."));

                meta7.setLore(lore7);
                ladder.setItemMeta(meta7);
                ladder.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return ladder;
            case "blocks-category.category-content.wood":
                ItemStack wood = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta8 = wood.getItemMeta();
                meta8.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-wood-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore8 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-wood-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore8.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta8.addEnchant(Enchantment.DURABILITY, 5, false);

                lore8.add("");
                lore8.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore8.add(clr("&eRight Click &7to remove this item slot."));

                meta8.setLore(lore8);
                wood.setItemMeta(meta8);
                wood.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return wood;
            case "blocks-category.category-content.obsidian":
                ItemStack obsidian = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta9 = obsidian.getItemMeta();
                meta9.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-obsidian-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore9 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-obsidian-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore9.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta9.addEnchant(Enchantment.DURABILITY, 5, false);

                lore9.add("");
                lore9.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore9.add(clr("&eRight Click &7to remove this item slot."));

                meta9.setLore(lore9);
                obsidian.setItemMeta(meta9);
                obsidian.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return obsidian;
            case "melee-category.category-content.stone-sword":
                ItemStack stone_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta10 = stone_sword.getItemMeta();
                meta10.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-stone-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore10 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-stone-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore10.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta10.addEnchant(Enchantment.DURABILITY, 5, false);

                lore10.add("");
                lore10.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore10.add(clr("&eRight Click &7to remove this item slot."));

                meta10.setLore(lore10);
                stone_sword.setItemMeta(meta10);
                stone_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return stone_sword;
            case "melee-category.category-content.iron-sword":
                ItemStack iron_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta11 = iron_sword.getItemMeta();
                meta11.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-iron-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore11 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-iron-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore11.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta11.addEnchant(Enchantment.DURABILITY, 5, false);

                lore11.add("");
                lore11.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore11.add(clr("&eRight Click &7to remove this item slot."));

                meta11.setLore(lore11);
                iron_sword.setItemMeta(meta11);
                iron_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return iron_sword;
            case "melee-category.category-content.stick":
                ItemStack stick = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta12 = stick.getItemMeta();
                meta12.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-stick-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore12 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-stick-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore12.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta12.addEnchant(Enchantment.DURABILITY, 5, false);

                lore12.add("");
                lore12.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore12.add(clr("&eRight Click &7to remove this item slot."));

                meta12.setLore(lore12);
                stick.setItemMeta(meta12);
                stick.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return stick;
            case "melee-category.category-content.gold-sword":
                ItemStack gold_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta13 = gold_sword.getItemMeta();
                meta13.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-gold-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore13 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-gold-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore13.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta13.addEnchant(Enchantment.DURABILITY, 5, false);

                lore13.add("");
                lore13.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore13.add(clr("&eRight Click &7to remove this item slot."));

                meta13.setLore(lore13);
                gold_sword.setItemMeta(meta13);
                gold_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return gold_sword;
            case "melee-category.category-content.diamond-sword":
                ItemStack diamond_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta14 = diamond_sword.getItemMeta();
                meta14.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-diamond-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore14 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-diamond-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore14.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta14.addEnchant(Enchantment.DURABILITY, 5, false);

                lore14.add("");
                lore14.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore14.add(clr("&eRight Click &7to remove this item slot."));

                meta14.setLore(lore14);
                diamond_sword.setItemMeta(meta14);
                diamond_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return diamond_sword;
            case "tools-category.category-content.shears":
                ItemStack shears = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta15 = shears.getItemMeta();
                meta15.setDisplayName(clr(langConfig.getString("shop-items-messages.tools-category.content-item-shears-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore15 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.tools-category.content-item-shears-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore15.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta15.addEnchant(Enchantment.DURABILITY, 5, false);

                lore15.add("");
                lore15.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore15.add(clr("&eRight Click &7to remove this item slot."));

                meta15.setLore(lore15);
                shears.setItemMeta(meta15);
                shears.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return shears;
            case "tools-category.category-content.pickaxe":
                ItemStack pickaxe = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta16 = pickaxe.getItemMeta();
                meta16.setDisplayName(clr(langConfig.getString("shop-items-messages.tools-category.content-item-pickaxe-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))
                        .replace("{tier}", "(Efficiency I)")));

                ArrayList<String> lore16 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.tools-category.content-item-pickaxe-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}")
                            || loreList.contains("Tier"))
                        continue;

                    if (!loreList.contains("upgradable") && !loreList.contains("upon") && !loreList.contains("death"))
                        continue;

                    lore16.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta16.addEnchant(Enchantment.DURABILITY, 5, false);

                lore16.add("");
                lore16.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore16.add(clr("&eRight Click &7to remove this item slot."));

                meta16.setLore(lore16);
                pickaxe.setItemMeta(meta16);
                pickaxe.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return pickaxe;
            case "tools-category.category-content.axe":
                ItemStack axe = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta17 = axe.getItemMeta();
                meta17.setDisplayName(clr(langConfig.getString("shop-items-messages.tools-category.content-item-axe-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))
                        .replace("{tier}", "(Efficiency I)")));

                ArrayList<String> lore17 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.tools-category.content-item-axe-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}")
                    || loreList.contains("Tier"))
                        continue;

                    if (!loreList.contains("upgradable") && !loreList.contains("upon") && !loreList.contains("death"))
                        continue;

                    lore17.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta17.addEnchant(Enchantment.DURABILITY, 5, false);

                lore17.add("");
                lore17.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore17.add(clr("&eRight Click &7to remove this item slot."));

                meta17.setLore(lore17);
                axe.setItemMeta(meta17);
                axe.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return axe;
            case "ranged-category.category-content.bow1":
                ItemStack bow1 = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta18 = bow1.getItemMeta();
                meta18.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-bow1-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore18 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-bow1-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore18.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta18.addEnchant(Enchantment.DURABILITY, 5, false);

                lore18.add("");
                lore18.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore18.add(clr("&eRight Click &7to remove this item slot."));

                meta18.setLore(lore18);
                bow1.setItemMeta(meta18);
                bow1.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bow1;
            case "ranged-category.category-content.bow2":
                ItemStack bow2 = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta19 = bow2.getItemMeta();
                meta19.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-bow2-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore19 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-bow2-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore19.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta19.addEnchant(Enchantment.DURABILITY, 5, false);

                lore19.add("");
                lore19.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore19.add(clr("&eRight Click &7to remove this item slot."));

                meta19.setLore(lore19);
                bow2.setItemMeta(meta19);
                bow2.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bow2;
            case "ranged-category.category-content.bow3":
                ItemStack bow3 = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta20 = bow3.getItemMeta();
                meta20.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-bow3-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore20 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-bow3-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore20.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta20.addEnchant(Enchantment.DURABILITY, 5, false);

                lore20.add("");
                lore20.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore20.add(clr("&eRight Click &7to remove this item slot."));

                meta20.setLore(lore20);
                bow3.setItemMeta(meta20);
                bow3.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bow3;
            case "ranged-category.category-content.arrow":
                ItemStack arrow = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta21 = arrow.getItemMeta();
                meta21.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-arrow-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore21 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-arrow-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore21.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta21.addEnchant(Enchantment.DURABILITY, 5, false);

                lore21.add("");
                lore21.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore21.add(clr("&eRight Click &7to remove this item slot."));

                meta21.setLore(lore21);
                arrow.setItemMeta(meta21);
                arrow.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return arrow;
            case "potions-category.category-content.speed-potion":
                ItemStack speed_potion = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta22 = speed_potion.getItemMeta();
                meta22.setDisplayName(clr(langConfig.getString("shop-items-messages.potions-category.content-item-speed-potion-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore22 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.potions-category.content-item-speed-potion-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore22.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta22.addEnchant(Enchantment.DURABILITY, 5, false);
                
                lore22.add("");
                lore22.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore22.add(clr("&eRight Click &7to remove this item slot."));

                meta22.setLore(lore22);
                speed_potion.setItemMeta(meta22);
                speed_potion.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return speed_potion;
            case "potions-category.category-content.jump-potion":
                ItemStack jump_potion = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta23 = jump_potion.getItemMeta();
                meta23.setDisplayName(clr(langConfig.getString("shop-items-messages.potions-category.content-item-jump-potion-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore23 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.potions-category.content-item-jump-potion-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore23.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta23.addEnchant(Enchantment.DURABILITY, 5, false);

                lore23.add("");
                lore23.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore23.add(clr("&eRight Click &7to remove this item slot."));

                meta23.setLore(lore23);
                jump_potion.setItemMeta(meta23);
                jump_potion.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return jump_potion;
            case "potions-category.category-content.invisibility":
                ItemStack invisibility = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta24 = invisibility.getItemMeta();
                meta24.setDisplayName(clr(langConfig.getString("shop-items-messages.potions-category.content-item-invisibility-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore24 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.potions-category.content-item-invisibility-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore24.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta24.addEnchant(Enchantment.DURABILITY, 5, false);

                lore24.add("");
                lore24.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore24.add(clr("&eRight Click &7to remove this item slot."));

                meta24.setLore(lore24);
                invisibility.setItemMeta(meta24);
                invisibility.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return invisibility;
            case "utility-category.category-content.golden-apple":
                ItemStack golden_apple = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta25 = golden_apple.getItemMeta();
                meta25.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-golden-apple-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore25 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-golden-apple-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore25.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta25.addEnchant(Enchantment.DURABILITY, 5, false);

                lore25.add("");
                lore25.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore25.add(clr("&eRight Click &7to remove this item slot."));

                meta25.setLore(lore25);
                golden_apple.setItemMeta(meta25);
                golden_apple.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return golden_apple;
            case "utility-category.category-content.bedbug":
                ItemStack bedbug = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta26 = bedbug.getItemMeta();
                meta26.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-bedbug-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore26 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-bedbug-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore26.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta26.addEnchant(Enchantment.DURABILITY, 5, false);

                lore26.add("");
                lore26.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore26.add(clr("&eRight Click &7to remove this item slot."));

                meta26.setLore(lore26);
                bedbug.setItemMeta(meta26);
                bedbug.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bedbug;
            case "utility-category.category-content.dream-defender":
                ItemStack dream_defender = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta27 = dream_defender.getItemMeta();
                meta27.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-dream-defender-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore27 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-dream-defender-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore27.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta27.addEnchant(Enchantment.DURABILITY, 5, false);

                lore27.add("");
                lore27.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore27.add(clr("&eRight Click &7to remove this item slot."));

                meta27.setLore(lore27);
                dream_defender.setItemMeta(meta27);
                dream_defender.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return dream_defender;
            case "utility-category.category-content.fireball":
                ItemStack fireball = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta28 = fireball.getItemMeta();
                meta28.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-fireball-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore28 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-fireball-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore28.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta28.addEnchant(Enchantment.DURABILITY, 5, false);

                lore28.add("");
                lore28.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore28.add(clr("&eRight Click &7to remove this item slot."));

                meta28.setLore(lore28);
                fireball.setItemMeta(meta28);
                fireball.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return fireball;
            case "utility-category.category-content.tnt":
                ItemStack tnt = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta29 = tnt.getItemMeta();
                meta29.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-tnt-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore29 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-tnt-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore29.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta29.addEnchant(Enchantment.DURABILITY, 5, false);

                lore29.add("");
                lore29.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore29.add(clr("&eRight Click &7to remove this item slot."));

                meta29.setLore(lore29);
                tnt.setItemMeta(meta29);
                tnt.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return tnt;
            case "utility-category.category-content.ender-pearl":
                ItemStack ender_pearl = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta30 = ender_pearl.getItemMeta();
                meta30.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-ender-pearl-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore30 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-ender-pearl-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore30.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta30.addEnchant(Enchantment.DURABILITY, 5, false);

                lore30.add("");
                lore30.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore30.add(clr("&eRight Click &7to remove this item slot."));

                meta30.setLore(lore30);
                ender_pearl.setItemMeta(meta30);
                ender_pearl.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return ender_pearl;
            case "utility-category.category-content.water-bucket":
                ItemStack water_bucket = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta31 = water_bucket.getItemMeta();
                meta31.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-water-bucket-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore31 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-water-bucket-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore31.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta31.addEnchant(Enchantment.DURABILITY, 5, false);

                lore31.add("");
                lore31.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore31.add(clr("&eRight Click &7to remove this item slot."));

                meta31.setLore(lore31);
                water_bucket.setItemMeta(meta31);
                water_bucket.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return water_bucket;
            case "utility-category.category-content.bridge-egg":
                ItemStack bridge_Egg = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta32 = bridge_Egg.getItemMeta();
                meta32.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-bridge-egg-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore32 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-bridge-egg-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore32.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta32.addEnchant(Enchantment.DURABILITY, 5, false);

                lore32.add("");
                lore32.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore32.add(clr("&eRight Click &7to remove this item slot."));

                meta32.setLore(lore32);
                bridge_Egg.setItemMeta(meta32);
                bridge_Egg.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bridge_Egg;
            case "utility-category.category-content.magic-milk":
                ItemStack magic_milk = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta33 = magic_milk.getItemMeta();
                meta33.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-magic-milk-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore33 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-magic-milk-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore33.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta33.addEnchant(Enchantment.DURABILITY, 5, false);

                lore33.add("");
                lore33.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore33.add(clr("&eRight Click &7to remove this item slot."));

                meta33.setLore(lore33);
                magic_milk.setItemMeta(meta33);
                magic_milk.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return magic_milk;
            case "utility-category.category-content.sponge":
                ItemStack sponge = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta34 = sponge.getItemMeta();
                meta34.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-sponge-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore34 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-sponge-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore34.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta34.addEnchant(Enchantment.DURABILITY, 5, false);

                lore34.add("");
                lore34.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore34.add(clr("&eRight Click &7to remove this item slot."));

                meta34.setLore(lore34);
                sponge.setItemMeta(meta34);
                sponge.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return sponge;
            case "utility-category.category-content.tower":
                ItemStack tower = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta35 = tower.getItemMeta();
                meta35.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-Compact Pop-up Tower-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore35 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-Compact Pop-up Tower-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore35.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta35.addEnchant(Enchantment.DURABILITY, 5, false);

                lore35.add("");
                lore35.add(clr("&eLeft Click &7to replace the item in this slot."));
                lore35.add(clr("&eRight Click &7to remove this item slot."));

                meta35.setLore(lore35);
                tower.setItemMeta(meta35);
                tower.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return tower;
            default:
                ItemStack empty = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get("shop-settings.quick-buy-empty-item.material"))));
                ItemMeta emptyMeta = empty.getItemMeta();
                emptyMeta.setDisplayName(clr(langConfig.getString("shop-items-messages.quick-buy-empty-item-name")));

                ArrayList<String> emptyLore = new ArrayList<>();

                emptyLore.add(clr("&7This is a Quick Buy Slot!"));
                emptyLore.add(clr(""));
                emptyLore.add(clr("&eLeft Click &7to set an item in this slot."));

                emptyMeta.setLore(emptyLore);
                empty.setItemMeta(emptyMeta);
                empty.setDurability((short) shopConfig.getInt("shop-settings.quick-buy-empty-item.data"));

                return empty;
        }
    }

    public static ItemStack getItem(String itemName) {
        switch (itemName) {
            case "armor-category.category-content.diamond-armor":
                ItemStack diamond_armor = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta = diamond_armor.getItemMeta();
                meta.setDisplayName(clr(langConfig.getString("shop-items-messages.armor-category.content-item-diamond-armor-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.armor-category.content-item-diamond-armor-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta.addEnchant(Enchantment.DURABILITY, 5, false);

                lore.add("");
                lore.add(clr("&eClick to add this item to your Quick Buy!"));

                meta.setLore(lore);
                diamond_armor.setItemMeta(meta);
                diamond_armor.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return diamond_armor;
            case "armor-category.category-content.iron-armor":
                ItemStack iron_armor = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta1 = iron_armor.getItemMeta();
                meta1.setDisplayName(clr(langConfig.getString("shop-items-messages.armor-category.content-item-iron-armor-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore1 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.armor-category.content-item-iron-armor-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore1.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta1.addEnchant(Enchantment.DURABILITY, 5, false);

                lore1.add("");
                lore1.add(clr("&eClick to add this item to your Quick Buy!"));

                meta1.setLore(lore1);
                iron_armor.setItemMeta(meta1);
                iron_armor.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return iron_armor;
            case "armor-category.category-content.chainmail":
                ItemStack chainmail = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta2 = chainmail.getItemMeta();
                meta2.setDisplayName(clr(langConfig.getString("shop-items-messages.armor-category.content-item-chainmail-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore2 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.armor-category.content-item-chainmail-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore2.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta2.addEnchant(Enchantment.DURABILITY, 5, false);

                lore2.add("");
                lore2.add(clr("&eClick to add this item to your Quick Buy!"));

                meta2.setLore(lore2);
                chainmail.setItemMeta(meta2);
                chainmail.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return chainmail;
            case "blocks-category.category-content.wool":
                ItemStack wool = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta3 = wool.getItemMeta();
                meta3.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-wool-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore3 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-wool-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore3.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta3.addEnchant(Enchantment.DURABILITY, 5, false);

                lore3.add("");
                lore3.add(clr("&eClick to add this item to your Quick Buy!"));

                meta3.setLore(lore3);
                wool.setItemMeta(meta3);
                wool.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return wool;
            case "blocks-category.category-content.clay":
                ItemStack clay = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta4 = clay.getItemMeta();
                meta4.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-clay-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore4 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-clay-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore4.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta4.addEnchant(Enchantment.DURABILITY, 5, false);

                lore4.add("");
                lore4.add(clr("&eClick to add this item to your Quick Buy!"));

                meta4.setLore(lore4);
                clay.setItemMeta(meta4);
                clay.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return clay;
            case "blocks-category.category-content.glass":
                ItemStack glass = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta5 = glass.getItemMeta();
                meta5.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-glass-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore5 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-glass-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore5.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta5.addEnchant(Enchantment.DURABILITY, 5, false);

                lore5.add("");
                lore5.add(clr("&eClick to add this item to your Quick Buy!"));

                meta5.setLore(lore5);
                glass.setItemMeta(meta5);
                glass.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return glass;
            case "blocks-category.category-content.stone":
                ItemStack stone = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta6 = stone.getItemMeta();
                meta6.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-stone-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore6 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-stone-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore6.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta6.addEnchant(Enchantment.DURABILITY, 5, false);

                lore6.add("");
                lore6.add(clr("&eClick to add this item to your Quick Buy!"));

                meta6.setLore(lore6);
                stone.setItemMeta(meta6);
                stone.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return stone;
            case "blocks-category.category-content.ladder":
                ItemStack ladder = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta7 = ladder.getItemMeta();
                meta7.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-ladder-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore7 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-ladder-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore7.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta7.addEnchant(Enchantment.DURABILITY, 5, false);

                lore7.add("");
                lore7.add(clr("&eClick to add this item to your Quick Buy!"));

                meta7.setLore(lore7);
                ladder.setItemMeta(meta7);
                ladder.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return ladder;
            case "blocks-category.category-content.wood":
                ItemStack wood = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta8 = wood.getItemMeta();
                meta8.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-wood-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore8 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-wood-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore8.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta8.addEnchant(Enchantment.DURABILITY, 5, false);

                lore8.add("");
                lore8.add(clr("&eClick to add this item to your Quick Buy!"));

                meta8.setLore(lore8);
                wood.setItemMeta(meta8);
                wood.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return wood;
            case "blocks-category.category-content.obsidian":
                ItemStack obsidian = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta9 = obsidian.getItemMeta();
                meta9.setDisplayName(clr(langConfig.getString("shop-items-messages.blocks-category.content-item-obsidian-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) + " x"
                        + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore9 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.blocks-category.content-item-obsidian-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore9.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta9.addEnchant(Enchantment.DURABILITY, 5, false);

                lore9.add("");
                lore9.add(clr("&eClick to add this item to your Quick Buy!"));

                meta9.setLore(lore9);
                obsidian.setItemMeta(meta9);
                obsidian.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return obsidian;
            case "melee-category.category-content.stone-sword":
                ItemStack stone_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta10 = stone_sword.getItemMeta();
                meta10.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-stone-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore10 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-stone-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore10.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta10.addEnchant(Enchantment.DURABILITY, 5, false);

                lore10.add("");
                lore10.add(clr("&eClick to add this item to your Quick Buy!"));

                meta10.setLore(lore10);
                stone_sword.setItemMeta(meta10);
                stone_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return stone_sword;
            case "melee-category.category-content.iron-sword":
                ItemStack iron_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta11 = iron_sword.getItemMeta();
                meta11.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-iron-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore11 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-iron-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore11.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta11.addEnchant(Enchantment.DURABILITY, 5, false);

                lore11.add("");
                lore11.add(clr("&eClick to add this item to your Quick Buy!"));

                meta11.setLore(lore11);
                iron_sword.setItemMeta(meta11);
                iron_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return iron_sword;
            case "melee-category.category-content.stick":
                ItemStack stick = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta12 = stick.getItemMeta();
                meta12.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-stick-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore12 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-stick-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore12.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta12.addEnchant(Enchantment.DURABILITY, 5, false);

                lore12.add("");
                lore12.add(clr("&eClick to add this item to your Quick Buy!"));

                meta12.setLore(lore12);
                stick.setItemMeta(meta12);
                stick.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return stick;
            case "melee-category.category-content.gold-sword":
                ItemStack gold_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta13 = gold_sword.getItemMeta();
                meta13.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-gold-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore13 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-gold-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore13.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta13.addEnchant(Enchantment.DURABILITY, 5, false);

                lore13.add("");
                lore13.add(clr("&eClick to add this item to your Quick Buy!"));

                meta13.setLore(lore13);
                gold_sword.setItemMeta(meta13);
                gold_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return gold_sword;
            case "melee-category.category-content.diamond-sword":
                ItemStack diamond_sword = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta14 = diamond_sword.getItemMeta();
                meta14.setDisplayName(clr(langConfig.getString("shop-items-messages.melee-category.content-item-diamond-sword-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore14 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.melee-category.content-item-diamond-sword-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore14.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta14.addEnchant(Enchantment.DURABILITY, 5, false);

                lore14.add("");
                lore14.add(clr("&eClick to add this item to your Quick Buy!"));

                meta14.setLore(lore14);
                diamond_sword.setItemMeta(meta14);
                diamond_sword.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return diamond_sword;
            case "tools-category.category-content.shears":
                ItemStack shears = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta15 = shears.getItemMeta();
                meta15.setDisplayName(clr(langConfig.getString("shop-items-messages.tools-category.content-item-shears-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore15 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.tools-category.content-item-shears-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore15.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta15.addEnchant(Enchantment.DURABILITY, 5, false);

                lore15.add("");
                lore15.add(clr("&eClick to add this item to your Quick Buy!"));

                meta15.setLore(lore15);
                shears.setItemMeta(meta15);
                shears.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return shears;
            case "tools-category.category-content.pickaxe":
                ItemStack pickaxe = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta16 = pickaxe.getItemMeta();
                meta16.setDisplayName(clr(langConfig.getString("shop-items-messages.tools-category.content-item-pickaxe-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))
                        .replace("{tier}", "(Efficiency I)")));

                ArrayList<String> lore16 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.tools-category.content-item-pickaxe-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}")
                            || loreList.contains("Tier"))
                        continue;

                    if (!loreList.contains("upgradable") && !loreList.contains("upon") && !loreList.contains("death"))
                        continue;

                    lore16.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta16.addEnchant(Enchantment.DURABILITY, 5, false);

                lore16.add("");
                lore16.add(clr("&eClick to add this item to your Quick Buy!"));

                meta16.setLore(lore16);
                pickaxe.setItemMeta(meta16);
                pickaxe.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return pickaxe;
            case "tools-category.category-content.axe":
                ItemStack axe = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta17 = axe.getItemMeta();
                meta17.setDisplayName(clr(langConfig.getString("shop-items-messages.tools-category.content-item-axe-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))
                        .replace("{tier}", "(Efficiency I)")));

                ArrayList<String> lore17 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.tools-category.content-item-axe-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}")
                            || loreList.contains("Tier"))
                        continue;

                    if (!loreList.contains("upgradable") && !loreList.contains("upon") && !loreList.contains("death"))
                        continue;

                    lore17.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta17.addEnchant(Enchantment.DURABILITY, 5, false);

                lore17.add("");
                lore17.add(clr("&eClick to add this item to your Quick Buy!"));

                meta17.setLore(lore17);
                axe.setItemMeta(meta17);
                axe.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return axe;
            case "ranged-category.category-content.bow1":
                ItemStack bow1 = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta18 = bow1.getItemMeta();
                meta18.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-bow1-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore18 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-bow1-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore18.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta18.addEnchant(Enchantment.DURABILITY, 5, false);

                lore18.add("");
                lore18.add(clr("&eClick to add this item to your Quick Buy!"));

                meta18.setLore(lore18);
                bow1.setItemMeta(meta18);
                bow1.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bow1;
            case "ranged-category.category-content.bow2":
                ItemStack bow2 = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta19 = bow2.getItemMeta();
                meta19.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-bow2-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore19 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-bow2-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore19.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta19.addEnchant(Enchantment.DURABILITY, 5, false);

                lore19.add("");
                lore19.add(clr("&eClick to add this item to your Quick Buy!"));

                meta19.setLore(lore19);
                bow2.setItemMeta(meta19);
                bow2.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bow2;
            case "ranged-category.category-content.bow3":
                ItemStack bow3 = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta20 = bow3.getItemMeta();
                meta20.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-bow3-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore20 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-bow3-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore20.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta20.addEnchant(Enchantment.DURABILITY, 5, false);

                lore20.add("");
                lore20.add(clr("&eClick to add this item to your Quick Buy!"));

                meta20.setLore(lore20);
                bow3.setItemMeta(meta20);
                bow3.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bow3;
            case "ranged-category.category-content.arrow":
                ItemStack arrow = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta21 = arrow.getItemMeta();
                meta21.setDisplayName(clr(langConfig.getString("shop-items-messages.ranged-category.content-item-arrow-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore21 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.ranged-category.content-item-arrow-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore21.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta21.addEnchant(Enchantment.DURABILITY, 5, false);

                lore21.add("");
                lore21.add(clr("&eClick to add this item to your Quick Buy!"));

                meta21.setLore(lore21);
                arrow.setItemMeta(meta21);
                arrow.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return arrow;
            case "potions-category.category-content.speed-potion":
                ItemStack speed_potion = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta22 = speed_potion.getItemMeta();
                meta22.setDisplayName(clr(langConfig.getString("shop-items-messages.potions-category.content-item-speed-potion-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore22 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.potions-category.content-item-speed-potion-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore22.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta22.addEnchant(Enchantment.DURABILITY, 5, false);

                lore22.add("");
                lore22.add(clr("&eClick to add this item to your Quick Buy!"));

                meta22.setLore(lore22);
                speed_potion.setItemMeta(meta22);
                speed_potion.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return speed_potion;
            case "potions-category.category-content.jump-potion":
                ItemStack jump_potion = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta23 = jump_potion.getItemMeta();
                meta23.setDisplayName(clr(langConfig.getString("shop-items-messages.potions-category.content-item-jump-potion-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore23 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.potions-category.content-item-jump-potion-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore23.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta23.addEnchant(Enchantment.DURABILITY, 5, false);

                lore23.add("");
                lore23.add(clr("&eClick to add this item to your Quick Buy!"));

                meta23.setLore(lore23);
                jump_potion.setItemMeta(meta23);
                jump_potion.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return jump_potion;
            case "potions-category.category-content.invisibility":
                ItemStack invisibility = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta24 = invisibility.getItemMeta();
                meta24.setDisplayName(clr(langConfig.getString("shop-items-messages.potions-category.content-item-invisibility-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore24 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.potions-category.content-item-invisibility-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore24.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta24.addEnchant(Enchantment.DURABILITY, 5, false);

                lore24.add("");
                lore24.add(clr("&eClick to add this item to your Quick Buy!"));

                meta24.setLore(lore24);
                invisibility.setItemMeta(meta24);
                invisibility.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return invisibility;
            case "utility-category.category-content.golden-apple":
                ItemStack golden_apple = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta25 = golden_apple.getItemMeta();
                meta25.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-golden-apple-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore25 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-golden-apple-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore25.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta25.addEnchant(Enchantment.DURABILITY, 5, false);

                lore25.add("");
                lore25.add(clr("&eClick to add this item to your Quick Buy!"));

                meta25.setLore(lore25);
                golden_apple.setItemMeta(meta25);
                golden_apple.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return golden_apple;
            case "utility-category.category-content.bedbug":
                ItemStack bedbug = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta26 = bedbug.getItemMeta();
                meta26.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-bedbug-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore26 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-bedbug-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore26.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta26.addEnchant(Enchantment.DURABILITY, 5, false);

                lore26.add("");
                lore26.add(clr("&eClick to add this item to your Quick Buy!"));

                meta26.setLore(lore26);
                bedbug.setItemMeta(meta26);
                bedbug.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bedbug;
            case "utility-category.category-content.dream-defender":
                ItemStack dream_defender = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta27 = dream_defender.getItemMeta();
                meta27.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-dream-defender-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore27 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-dream-defender-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore27.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta27.addEnchant(Enchantment.DURABILITY, 5, false);

                lore27.add("");
                lore27.add(clr("&eClick to add this item to your Quick Buy!"));

                meta27.setLore(lore27);
                dream_defender.setItemMeta(meta27);
                dream_defender.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return dream_defender;
            case "utility-category.category-content.fireball":
                ItemStack fireball = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta28 = fireball.getItemMeta();
                meta28.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-fireball-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore28 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-fireball-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore28.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta28.addEnchant(Enchantment.DURABILITY, 5, false);

                lore28.add("");
                lore28.add(clr("&eClick to add this item to your Quick Buy!"));

                meta28.setLore(lore28);
                fireball.setItemMeta(meta28);
                fireball.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return fireball;
            case "utility-category.category-content.tnt":
                ItemStack tnt = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta29 = tnt.getItemMeta();
                meta29.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-tnt-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore29 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-tnt-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore29.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta29.addEnchant(Enchantment.DURABILITY, 5, false);

                lore29.add("");
                lore29.add(clr("&eClick to add this item to your Quick Buy!"));

                meta29.setLore(lore29);
                tnt.setItemMeta(meta29);
                tnt.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return tnt;
            case "utility-category.category-content.ender-pearl":
                ItemStack ender_pearl = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta30 = ender_pearl.getItemMeta();
                meta30.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-ender-pearl-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore30 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-ender-pearl-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore30.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta30.addEnchant(Enchantment.DURABILITY, 5, false);

                lore30.add("");
                lore30.add(clr("&eClick to add this item to your Quick Buy!"));

                meta30.setLore(lore30);
                ender_pearl.setItemMeta(meta30);
                ender_pearl.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return ender_pearl;
            case "utility-category.category-content.water-bucket":
                ItemStack water_bucket = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta31 = water_bucket.getItemMeta();
                meta31.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-water-bucket-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore31 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-water-bucket-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore31.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta31.addEnchant(Enchantment.DURABILITY, 5, false);

                lore31.add("");
                lore31.add(clr("&eClick to add this item to your Quick Buy!"));

                meta31.setLore(lore31);
                water_bucket.setItemMeta(meta31);
                water_bucket.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return water_bucket;
            case "utility-category.category-content.bridge-egg":
                ItemStack bridge_Egg = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta32 = bridge_Egg.getItemMeta();
                meta32.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-bridge-egg-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore32 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-bridge-egg-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore32.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta32.addEnchant(Enchantment.DURABILITY, 5, false);

                lore32.add("");
                lore32.add(clr("&eClick to add this item to your Quick Buy!"));

                meta32.setLore(lore32);
                bridge_Egg.setItemMeta(meta32);
                bridge_Egg.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return bridge_Egg;
            case "utility-category.category-content.magic-milk":
                ItemStack magic_milk = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta33 = magic_milk.getItemMeta();
                meta33.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-magic-milk-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore33 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-magic-milk-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore33.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta33.addEnchant(Enchantment.DURABILITY, 5, false);

                lore33.add("");
                lore33.add(clr("&eClick to add this item to your Quick Buy!"));

                meta33.setLore(lore33);
                magic_milk.setItemMeta(meta33);
                magic_milk.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return magic_milk;
            case "utility-category.category-content.sponge":
                ItemStack sponge = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta34 = sponge.getItemMeta();
                meta34.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-sponge-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color")) +
                        " x" + shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount")));

                ArrayList<String> lore34 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-sponge-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore34.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta34.addEnchant(Enchantment.DURABILITY, 5, false);

                lore34.add("");
                lore34.add(clr("&eClick to add this item to your Quick Buy!"));

                meta34.setLore(lore34);
                sponge.setItemMeta(meta34);
                sponge.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return sponge;
            case "utility-category.category-content.tower":
                ItemStack tower = new ItemStack(Material.valueOf(String.valueOf(shopConfig.getYml().get(itemName + ".content-tiers" +
                        ".tier1.tier-item.material"))), shopConfig.getInt(itemName + ".content-tiers.tier1.tier-item.amount"));
                ItemMeta meta35 = tower.getItemMeta();
                meta35.setDisplayName(clr(langConfig.getString("shop-items-messages.utility-category.content-item-Compact Pop-up Tower-name")
                        .replace("{color}", langConfig.getString("shop-items-messages.can-buy-color"))));

                ArrayList<String> lore35 = new ArrayList<>();

                for (String loreList : langConfig.getYml().getStringList("shop-items-messages.utility-category.content-item-Compact Pop-up Tower-lore")) {
                    if (loreList.isEmpty() || loreList.contains("Cost") || loreList.contains("{buy_status}") || loreList.contains("{quick_buy}"))
                        continue;

                    lore35.add(clr(loreList));
                }

                if (shopConfig.getBoolean(itemName + ".content-tiers.tier1.tier-item.enchanted"))
                    meta35.addEnchant(Enchantment.DURABILITY, 3, false);

                lore35.add("");
                lore35.add(clr("&eClick to add this item to your Quick Buy!"));

                meta35.setLore(lore35);
                tower.setItemMeta(meta35);
                tower.setDurability((short) shopConfig.getInt(itemName + ".content-tiers.tier1" +
                        ".tier-item.data"));

                return tower;
            default:
                ItemStack empty = new ItemStack(Material.AIR);
                ItemMeta emptyMeta = empty.getItemMeta();
                emptyMeta.setDisplayName("");
                empty.setItemMeta(emptyMeta);

                return empty;
        }
    }

    private static String clr(String txt) {
        return ChatColor.translateAlternateColorCodes('&', txt);
    }

}
