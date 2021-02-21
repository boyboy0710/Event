package com.boyboy0710.event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
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
    public boolean BlockBurnEvent = true;
    public boolean BlockDamageEvent = true;
    public boolean BlockDispenseEvent = true;
    public boolean BlockGrowEvent = true;
    public boolean SignChangeEvent = true;
    public boolean BlockPistonEvent = true;
    public boolean BlockPistonExtendEvent = true;
    public boolean BlockPistonRetractEvent = true;
    public boolean NotePlayEvent = true;
    public boolean BlockSpreadEvent = true;

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
            if(BlockPlaceEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockBurnEvent e){
        if (e.getBlock().getType() != Material.AIR){
            if(BlockBurnEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockDamageEvent e) {
        if(e.getBlock().getType() != Material.AIR){
            if (BlockDamageEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockDispenseEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockDispenseEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockGrowEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockGrowEvent = false){
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onInteract(SignChangeEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(SignChangeEvent = false){
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onInteract(BlockPistonEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockPistonEvent = false){
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onInteract(BlockPistonExtendEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockPistonExtendEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockPistonRetractEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockPistonRetractEvent = false){
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onInteract(NotePlayEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(NotePlayEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInteract(BlockSpreadEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            if(BlockSpreadEvent = false){
                e.setCancelled(true);
            }
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("event")) {
            Player p = (Player) sender;

            if(args[0].equalsIgnoreCase("BlockBreakEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockBreakEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockBreakEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockBreakEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockBreakEvent를 false로 설정하였습니다");
                }
            }
            if (args[0].equalsIgnoreCase("BlockPlaceEvent")){

                if(args[1].equalsIgnoreCase("true")) {
                    BlockPlaceEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockPlaceEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")) {
                    BlockPlaceEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockPlaceEvent를 false로 설정하였습니다");
                }
            }
            if(args[0].equalsIgnoreCase("BlockBurnEvent")){

                if (args[1].equalsIgnoreCase("true")){
                    BlockBurnEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockBurnEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockBurnEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockBurnEvent를 false로 설정하였습니다");
                }

            }
            if (args[0].equalsIgnoreCase("BlockDamageEvent")){
                if (args[1].equalsIgnoreCase("true")){
                    BlockDamageEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockDamageEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")) {
                    BlockDamageEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockDamageEvent를 false로 설정하였습니다");
                }
            }

            if(args[0].equalsIgnoreCase("BlockDispenseEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockDispenseEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockDispenseEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockDispenseEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockDispenseEvent를 false로 설정하였습니다");
                }
            }

            if(args[0].equalsIgnoreCase("BlockGrowEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockGrowEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockGrowEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockGrowEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockGrowEvent를 false로 설정하였습니다");
                }
            }

            if(args[0].equalsIgnoreCase("SignChangeEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    SignChangeEvent = true;
                    p.sendMessage(ChatColor.GREEN + "SignChangeEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    SignChangeEvent = false;
                    p.sendMessage(ChatColor.GREEN + "SignChangeEvent를 false로 설정하였습니다");
                }
            }

            if(args[0].equalsIgnoreCase("BlockPistonEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockPistonEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockPistonEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockPistonEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockPistonEvent를 false로 설정하였습니다");
                }
            }

            if(args[0].equalsIgnoreCase("BlockPistonExtendEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockPistonExtendEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockPistonExtendEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockPistonExtendEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockPistonExtendEvent를 false로 설정하였습니다");
                }
            }

            if(args[0].equalsIgnoreCase("BlockPistonRetractEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockPistonRetractEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockPistonRetractEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockPistonRetractEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockPistonRetractEvent를 false로 설정하였습니다");
                }
            }
            if(args[0].equalsIgnoreCase("NotePlayEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    NotePlayEvent = true;
                    p.sendMessage(ChatColor.GREEN + "NotePlayEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    NotePlayEvent = false;
                    p.sendMessage(ChatColor.GREEN + "NotePlayEvent를 false로 설정하였습니다");
                }
            }
            if(args[0].equalsIgnoreCase("BlockSpreadEventt")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockSpreadEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockSpreadEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockSpreadEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockSpreadEvent를 false로 설정하였습니다");
                }
            }

        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("event")) {
            if (args.length == 1) {
                return Arrays.asList("BlockBreakEvent","BlockPlaceEvent","BlockBurnEvent",
                        "BlockDamageEvent","BlockDispenseEvent","BlockGrowEvent","SignChangeEvent","BlockSpreadEvent",
                        "BlockPistonEvent","BlockPistonExtendEvent","BlockPistonRetractEvent","NotePlayEvent");
            }
            else if(args.length == 2) {
                if (args[0].equals("BlockBreakEvent")){
                    return  Arrays.asList("false","true");
                }
                else if(args[0].equals("BlockPlaceEvent")) {
                    return Arrays.asList("true" , "false");
                }
                else if(args[0].equals("BlockBurnEvent")){
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockDamageEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockDispenseEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockGrowEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("SignChangeEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockPistonEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockPistonExtendEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockPistonRetractEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("NotePlayEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("BlockSpreadEvent")) {
                    return Arrays.asList("true","false");
                }
            }
        }
        return null;
    }
}
