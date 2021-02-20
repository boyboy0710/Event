package com.boyboy0710.event;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class Commands extends JavaPlugin implements TabExecutor {
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public boolean BlockBreakEvent = getConfig().getBoolean("BlockBreakEvent");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("event")){
            if(args[0].equalsIgnoreCase("BlockBreakEvent")) {
                if(args[1].equalsIgnoreCase("true")) {
                    BlockBreakEvent = true;
                    saveConfig();
                }
                else if(args[1].equalsIgnoreCase("false")) {
                    BlockBreakEvent = false;
                    saveConfig();
                }
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }

}
