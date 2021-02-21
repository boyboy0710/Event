package com.boyboy0710.event;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public final class Main extends JavaPlugin implements TabExecutor, Listener {

    public void onEnable() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("            Event 를러그인을 성공적으로 불러왔습니다");
        System.out.println("               플러그인 제작자ㅣ:booyboy0710");
        System.out.println("----------------------------------------------------------------------");

        getCommand("event").setExecutor(new Main()); //Executor을 등록하는 매소드
        getCommand("event").setTabCompleter(new Main()); //TabCompleter을 등록하는 매소드

    }

    @Override
    public void onDisable() {
        System.out.println("Event 플러그인이 비활성화 되었습니다");
    }

    public boolean BlockBreakEvent = true;
    public boolean BlockPlaceEvent = true;

    @EventHandler
    public void onInteract(BlockBreakEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockBreakEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockPlaceEvent e) {
        if(e.getBlock().getType() != Material.AIR){

        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("event")) {

            if(args[0].equalsIgnoreCase("BlockBreakEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockBreakEvent = true;
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockBreakEvent = false;
                }
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("event")) {
            if (args.length == 1) {
                return Arrays.asList("BlockBreakEvent");
            }
            else if(args.length == 2) {
                if (args[0].equals("BlockBreakEvent")){
                    return  Arrays.asList("false","true");
                }
            }
        }
        return null;
    }
}
