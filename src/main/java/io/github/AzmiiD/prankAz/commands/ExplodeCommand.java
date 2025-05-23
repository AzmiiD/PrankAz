package io.github.AzmiiD.prankAz.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExplodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("§cUse; /explode <player>");
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage("§cPlayer not found");
            return true;
        }

        Location loc = target.getLocation();
        World world = loc.getWorld();

        world.createExplosion(loc, 0.0f, false, false);
        world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1f);
        sender.sendMessage("§aBoom send to " + target.getName() + "!");
        return true;
    }
}
