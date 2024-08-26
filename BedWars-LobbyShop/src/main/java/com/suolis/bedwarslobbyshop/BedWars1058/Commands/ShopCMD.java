package com.suolis.bedwarslobbyshop.BedWars1058.Commands;

import com.andrei1058.bedwars.api.BedWars;
import com.suolis.bedwarslobbyshop.BedWars1058.Utils.Chat;
import com.suolis.bedwarslobbyshop.BedWars1058.Utils.CustomShop;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can execute this command!");
            return false;
        }

        if (Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getArenaUtil().getArenaByPlayer((Player) sender) != null) {
            sender.sendMessage(Chat.color("&cYou can't do that here!"));
            return false;
        }

        CustomShop.firstPage((Player) sender);

        return true;
    }
}
