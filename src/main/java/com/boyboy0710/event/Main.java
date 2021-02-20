package com.boyboy0710.event;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public void onEnable() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("            Event 를러그인을 성공적으로 불러왔습니다");
        System.out.println("               플러그인 제작자ㅣ:booyboy0710");
        System.out.println("----------------------------------------------------------------------");

        getCommand("event").setExecutor(new Commands()); //Executor을 등록하는 매소드
        getCommand("event").setTabCompleter(new Commands()); //TabCompleter을 등록하는 매소드

        getConfig().options().copyDefaults(true);
        saveConfig();
    }
    @Override
    public void onDisable() {
        System.out.println("Event 플러그인이 비활성화 되었습니다");
    }
    public boolean BlockBreakEvent = getConfig().getBoolean("BlockBreakEvent");
}
