package de.sabbertran.playertabcomplete;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
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

        logStart();
        
//        log.info("PlayerTabComplete enabled");
        System.out.println("PlayerTabComplete enabled");
    }

    private void logStart()
    {

        try
        {
            InetAddress adr = InetAddress.getLocalHost();
            URL url = new URL("http://sabbertran.de/plugins/playertabcomplete/log.php?name=" + getProxy().getName() + "&ip=" + adr.getHostAddress() + "&port=bungee");
            url.openStream();
        } catch (UnknownHostException ex)
        {
            Logger.getLogger(PlayerTabComplete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(PlayerTabComplete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
