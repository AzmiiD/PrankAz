package io.github.AzmiiD.prankAz;

import io.github.AzmiiD.prankAz.commands.FakeLeaveCommand;
import io.github.AzmiiD.prankAz.commands.ExplodeCommand;
import io.github.AzmiiD.prankAz.commands.ConfuseCommand;
import io.github.AzmiiD.prankAz.commands.CreeperCommand;
import io.github.AzmiiD.prankAz.commands.FreezeCommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class PrankAz extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin PrankAz Active");

        getCommand("fakeleave").setExecutor(new FakeLeaveCommand());
        getCommand("explode").setExecutor(new ExplodeCommand());
        getCommand("confuse").setExecutor(new ConfuseCommand());
        getCommand("creeper").setExecutor(new CreeperCommand());
        getCommand("freeze").setExecutor(new FreezeCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin PrankAz Disable");
    }
}
