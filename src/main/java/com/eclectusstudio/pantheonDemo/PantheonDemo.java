package com.eclectusstudio.pantheonDemo;

import com.eclectusstudio.pantheonDemo.events.CopyAssetsHandler;
import com.eclectusstudio.pantheonDemo.events.SubmitItemHandler;
import com.eclectusstudio.pantheonDemo.events.SubmitResourcePackHandler;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoRecipes;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class PantheonDemo extends JavaPlugin {
    public static String NAMESPACE = "pantheondemo";
    public static Logger logger;

    @Override
    public void onEnable() {
        // Event Handlers
        logger = getLogger();
        Bukkit.getPluginManager().registerEvents(new CopyAssetsHandler(), this);
        Bukkit.getPluginManager().registerEvents(new SubmitResourcePackHandler(), this);
        Bukkit.getPluginManager().registerEvents(new SubmitItemHandler(), this);

        //Recipes
        PantheonDemoRecipes.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
