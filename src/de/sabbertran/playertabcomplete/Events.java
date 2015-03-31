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
        String partialPlayerName = ev.getCursor().toLowerCase();

        int lastSpaceIndex = partialPlayerName.lastIndexOf(' ');
        if (lastSpaceIndex >= 0)
        {
            partialPlayerName = partialPlayerName.substring(lastSpaceIndex + 1);
        }

        for (ProxiedPlayer p : main.getProxy().getPlayers())
        {
            if (p.getName().toLowerCase().startsWith(partialPlayerName))
            {
                ev.getSuggestions().add(p.getName());
            }
        }
    }
}
