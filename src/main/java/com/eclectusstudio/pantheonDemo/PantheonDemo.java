package com.eclectusstudio.pantheonDemo;

import com.eclectusstudio.pantheonDemo.events.CopyAssetsHandler;
import com.eclectusstudio.pantheonDemo.events.SubmitItemHandler;
import com.eclectusstudio.pantheonDemo.events.SubmitResourcePackHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PantheonDemo extends JavaPlugin {
    public static String NAMESPACE = "pantheondemo";

    @Override
    public void onEnable() {
        // Event Handlers
        Bukkit.getPluginManager().registerEvents(new CopyAssetsHandler(), this);
        Bukkit.getPluginManager().registerEvents(new SubmitResourcePackHandler(), this);
        Bukkit.getPluginManager().registerEvents(new SubmitItemHandler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
