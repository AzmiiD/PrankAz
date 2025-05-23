package io.github.AzmiiD.prankAz.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ConfuseCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("§cUse: /confuse <player>");
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage("§cPlayer not found.");
            return true;
        }

        target.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 10, 1));
        target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 10, 1));
        sender.sendMessage("§asuccessfully sent effect to" +target.getName());
        return true;
    }
}
