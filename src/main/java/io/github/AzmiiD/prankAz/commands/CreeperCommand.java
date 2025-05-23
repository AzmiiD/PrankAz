package io.github.AzmiiD.prankAz.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreeperCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("§cUse: /creeper <player>");
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage("§cPlayer not found");
            return true;
        }

        target.playSound(target.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1f,1f);

        Bukkit.getScheduler().runTaskLater(
                Bukkit.getPluginManager().getPlugin("PrankAz"),
            () -> target.playSound(target.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1f, 1f), 40L
        );

        sender.sendMessage("§aFake creeper send to " + target.getName());
        return true;
    }
}
