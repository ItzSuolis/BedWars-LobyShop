package com.suolis.bedwarslobbyshop.BedWars1058.Utils;

import com.suolis.bedwarslobbyshop.LobbyShop;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.sql.*;
import java.util.UUID;

public class Database {
    private static Connection con;

    public static void connect() {
        if (LobbyShop.getInstance().getConfig().getString("database-type").equalsIgnoreCase("mysql")) {
            try {
                FileConfiguration c = LobbyShop.getInstance().getConfig();
                con = DriverManager.getConnection("jdbc:mysql://" + c.getString("mysql-database-settings.ip") + ":"
                                + c.getLong("mysql-database-settings.port") + "/" + c.getString("mysql-database-settings.database"),
                        c.getString("mysql-database-settings.username"), c.getString("mysql-database-settings.password"));
                return;
            } catch (Exception ex) {
                Bukkit.getServer().getLogger().info("An exception occurred while trying to connect to the bw1058 database: " + ex);
                Bukkit.getServer().getLogger().info("Please make sure that you have provided the correct information for your database" +
                        " that the bw1058/2023 uses!");
            }
        }

        File db = new File("plugins/BedWars1058/Cache/shop.db");

        if (!db.exists()) {
            Bukkit.getServer().getLogger().severe("The database file of bw1058 doesn't exist!");
            Bukkit.getServer().getPluginManager().disablePlugin(LobbyShop.getInstance());
            return;
        }

        try {
            con = DriverManager.getConnection("jdbc:sqlite:" + db);
        } catch (Exception ex) {
            Bukkit.getServer().getLogger().info("An exception occurred while trying to connect to the bw1058 shop.db file: " + ex);
        }
    }

    public String getQuickBuySlots(UUID uuid, int i) {
        try (Statement st = con.createStatement()){
            ResultSet idExists = st.executeQuery("SELECT * FROM quick_buy_2 WHERE uuid= '" + uuid + "';");
            idExists.next();

            if (idExists.getString(1) == null) {
                st.execute("INSERT INTO quick_buy_2 (uuid) VALUES ('" + uuid + "')");
            } else if (idExists.getString(1).isEmpty()) {
                st.execute("INSERT INTO quick_buy_2 (uuid) VALUES ('" + uuid + "')");
            }

            ResultSet set = st.executeQuery("SELECT slot_" + i + " FROM quick_buy_2 WHERE uuid= '" + uuid + "';");
            set.next();

            return set.getString(1);
        } catch (SQLException ignored) {}

        return null;
    }

    public void pushQuickBuyChanges(int slot, String slotValue, UUID uuid) {
        try (Statement st = con.createStatement()){
            ResultSet idExists = st.executeQuery("SELECT * FROM quick_buy_2 WHERE uuid= '" + uuid + "';");
            idExists.next();

            if (idExists.getString(1) == null) {
                st.execute("INSERT INTO quick_buy_2 (uuid) VALUES ('" + uuid + "')");
            } else if (idExists.getString(1).isEmpty()) {
                st.execute("INSERT INTO quick_buy_2 (uuid) VALUES ('" + uuid + "')");
            }

            st.execute("UPDATE quick_buy_2 SET slot_" + slot + " = '"
                    + slotValue + "' WHERE uuid= '" + uuid.toString() + "';");
        } catch (SQLException ignored) {}
    }

}
