package com.boyboy0710.event;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class Commands implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("event")){
            if(args[0].equalsIgnoreCase("BlockBreakEvent")) {
                if(args[1].equalsIgnoreCase("true")) {

                }
                else if(args[1].equalsIgnoreCase("false")) {

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
