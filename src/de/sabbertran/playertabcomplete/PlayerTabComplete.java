package de.sabbertran.playertabcomplete;

import net.md_5.bungee.api.plugin.Plugin;

public class PlayerTabComplete extends Plugin {

    @Override
    public void onDisable() {
        System.out.println("PlayerTabComplete disabled");
    }

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new Events(this));

        System.out.println("PlayerTabComplete enabled");
    }
}
