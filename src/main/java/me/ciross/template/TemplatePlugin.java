package me.ciross.template;

import org.bukkit.plugin.java.JavaPlugin;

public class TemplatePlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        this.getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Plugin disabled!");
    }

}
