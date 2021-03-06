package com.boyboy0710.event;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
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
    public boolean BlockIgniteEvent = true;

    public boolean EnchantItemEvent = true;

    public boolean LightningStrikeEvent = true;

    public boolean CreatureSpawnEvent = true;

    public boolean BrewEvent = true;
    public boolean CraftItemEvent = true;
    public boolean FurnaceBurnEvent = true;
    public boolean FurnaceExtractEvent = true;
    public boolean InventoryClickEvent = true;
    public boolean InventoryCreativeEvent = true;
    public boolean InventoryDragEvent = true;
    public boolean InventoryEvent = true;
    public boolean InventoryInteractEvent = true;

    @EventHandler
    public void onBrewEvent(BrewEvent e){
        if(e.getBlock().getType() != Material.AIR) {
            e.setCancelled(BrewEvent);

        }

    }

    @EventHandler
    public void onBlockEvent(BlockBreakEvent e){
        Player p = e.getPlayer();
            if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockBreakEvent);
                p.sendMessage(ChatColor.RED + "BlockBreakEvent가 false 로 설정되어있습니다");
            }

    }

    @EventHandler
    public void onBlockEvent(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if(e.getBlock().getType() != Material.AIR){
                e.setCancelled(BlockPlaceEvent);
                p.sendMessage(ChatColor.RED + "BlockPlaceEvent가 false 로 설정되어있습니다");
        }
    }

    @EventHandler
    public void onBlockEvent(BlockBurnEvent e){
        if (e.getBlock().getType() != Material.AIR){
                e.setCancelled(BlockBurnEvent);
        }
    }

    @EventHandler
    public void onBlockEvent(BlockDamageEvent e) {
        Player p = e.getPlayer();
        if(e.getBlock().getType() != Material.AIR){
                e.setCancelled(BlockDamageEvent);
                p.sendMessage(ChatColor.RED + "BlockDamageEvent가 false 로 설정되어있습니다");
        }
    }

    @EventHandler
    public void onBlockEvent(BlockDispenseEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockDispenseEvent);
        }
    }

    @EventHandler
    public void onBlockEvent(BlockGrowEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockGrowEvent);
        }
    }
    @EventHandler
    public void onBlockEvent(SignChangeEvent e){
        Player p = e.getPlayer();
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(SignChangeEvent);
                p.sendMessage(ChatColor.RED + "SignChangeEvent가 false 로 설정되어있습니다");
        }
    }
    @EventHandler
    public void onBlockEvent(BlockPistonEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockPistonEvent);
        }
    }
    @EventHandler
    public void onBlockEvent(BlockPistonExtendEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockPistonExtendEvent);
        }
    }

    @EventHandler
    public void onBlockEvent(BlockPistonRetractEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockPistonRetractEvent);
        }
    }
    @EventHandler
    public void onBlockEvent(NotePlayEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(NotePlayEvent);
        }
    }

    @EventHandler
    public void onBlockEvent(BlockSpreadEvent e){
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockSpreadEvent);
        }
    }

    @EventHandler
    public void onBlockEvent(BlockIgniteEvent e){
        Player p = e.getPlayer();
        if(e.getBlock().getType() != Material.AIR) {
                e.setCancelled(BlockIgniteEvent);
                p.sendMessage(ChatColor.RED + "BlockIgniteEvent가 false 로 설정되어있습니다");
        }
    }
    @EventHandler
    public void onEnchantEvent(EnchantItemEvent e){
        if(e.getItem().getType() != Material.AIR) {
                e.setCancelled(EnchantItemEvent);
        }
    }

    @EventHandler
    public void onLightningStrikeEvent(LightningStrikeEvent e){
        if(e.getWorld().getTime() != 1) {
                e.setCancelled(LightningStrikeEvent);
        }
    }

    @EventHandler
    public void onCreatureSpawnEvent(CreatureSpawnEvent e){
        if(e.getEntity().getType() != EntityType.ENDER_DRAGON) {
                e.setCancelled(CreatureSpawnEvent);
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
            if(args[0].equalsIgnoreCase("BlockIgniteEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    BlockIgniteEvent = true;
                    p.sendMessage(ChatColor.GREEN + "BlockIgniteEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    BlockIgniteEvent = false;
                    p.sendMessage(ChatColor.GREEN + "BlockIgniteEvent를 false로 설정하였습니다");
                }
            }
            if(args[0].equalsIgnoreCase("EnchantItemEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    EnchantItemEvent = true;
                    p.sendMessage(ChatColor.GREEN + "EnchantItemEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    EnchantItemEvent = false;
                    p.sendMessage(ChatColor.GREEN + "EnchantItemEvent를 false로 설정하였습니다");
                }
            }
            if(args[0].equalsIgnoreCase("LightningStrikeEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    LightningStrikeEvent = true;
                    p.sendMessage(ChatColor.GREEN + "LightningStrikeEvent를 true로 설정하였습니다");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    LightningStrikeEvent = false;
                    p.sendMessage(ChatColor.GREEN + "LightningStrikeEvent를 false로 설정하였습니다");
                }
            }
            if(args[0].equalsIgnoreCase("CreatureSpawnEvent")) {

                if(args[1].equalsIgnoreCase("true"))  {
                    CreatureSpawnEvent = true;
                    p.sendMessage(ChatColor.GREEN + "CreatureSpawnEvent를 true로 설정하였습니다(앤더드래곤 미포함)");
                }
                else if(args[1].equalsIgnoreCase("false")){
                    CreatureSpawnEvent = false;
                    p.sendMessage(ChatColor.GREEN + "CreatureSpawnEvent를 false로 설정하였습니다");
                }
            }

        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("event")) {
            if (args.length == 1) {
                return Arrays.asList("BlockBreakEvent","BlockPlaceEvent","BlockBurnEvent","BlockIgniteEvent",
                        "BlockDamageEvent","BlockDispenseEvent","BlockGrowEvent","SignChangeEvent","BlockSpreadEvent",
                        "BlockPistonEvent","BlockPistonExtendEvent","BlockPistonRetractEvent","NotePlayEvent",
                        "EnchantItemEvent","LightningStrikeEvent","CreatureSpawnEvent");
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
                else if(args[0].equals("BlockIgniteEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("EnchantItemEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("LightningStrikeEvent")) {
                    return Arrays.asList("true","false");
                }
                else if(args[0].equals("CreatureSpawnEvent")) {
                    return Arrays.asList("true","false");
                }
            }
        }
        return null;
    }
}
