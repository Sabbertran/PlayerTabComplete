package de.sabbertran.playertabcomplete;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.TabCompleteEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Events implements Listener
{

    private PlayerTabComplete main;

    public Events(PlayerTabComplete main)
    {
        this.main = main;
    }

    @EventHandler
    public void onTabComplete(TabCompleteEvent ev)
    {
        for (ProxiedPlayer p : main.getProxy().getPlayers())
        {
            if (p.getName().toLowerCase().startsWith(ev.getCursor().toLowerCase()))
            {
                ev.getSuggestions().add(p.getName());
            }
        }
    }
}
