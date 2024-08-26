package com.suolis.bedwarslobbyshop;

import com.suolis.bedwarslobbyshop.BedWars1058.Commands.ShopCMD;
import com.suolis.bedwarslobbyshop.BedWars1058.Listeners.QuickBuyListener;
import com.suolis.bedwarslobbyshop.BedWars1058.Utils.Database;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyShop extends JavaPlugin {
    private static LobbyShop plugin;

    @Override
    public void onEnable() {
        plugin = this;

        if (getServer().getPluginManager().isPluginEnabled("BedWars1058")) {
            Database.connect();
            getCommand("shop").setExecutor(new ShopCMD());
            getServer().getPluginManager().registerEvents(new QuickBuyListener(), this);
        } else if (getServer().getPluginManager().isPluginEnabled("BedWars2023")) {
            getCommand("shop").setExecutor(new com.suolis.bedwarslobbyshop.BedWars2023.Commands.ShopCMD());
            getServer().getPluginManager().registerEvents(new com.suolis.bedwarslobbyshop.BedWars2023.Listeners.QuickBuyListener(), this);
        } else {
            getLogger().severe("BedWars2023/1058 not found! Disabling...");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        saveDefaultConfig();
        getLogger().info("BedWars-LobbyShop has been successfully loaded!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BedWars-LobbyShop has been unloaded!");
    }

    public static LobbyShop getInstance() {
        return plugin;
    }

}
