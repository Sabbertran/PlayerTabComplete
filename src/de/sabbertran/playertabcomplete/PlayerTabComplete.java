package de.sabbertran.playertabcomplete;

import java.util.logging.Logger;
import net.md_5.bungee.api.plugin.Plugin;

public class PlayerTabComplete extends Plugin
{

    public Logger log = getLogger();

    @Override
    public void onDisable()
    {
//        log.info("PlayerTabComplete disabled");
        System.out.println("PlayerTabComplete disabled");
    }

    @Override
    public void onEnable()
    {
        getProxy().getPluginManager().registerListener(this, new Events(this));

//        log.info("PlayerTabComplete enabled");
        System.out.println("PlayerTabComplete enabled");
    }

}
