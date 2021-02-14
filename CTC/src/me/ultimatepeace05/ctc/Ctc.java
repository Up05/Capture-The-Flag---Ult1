package me.ultimatepeace05.ctc;

import me.ultimatepeace05.ctc.idkwhattocallthis.Events_0;
import me.ultimatepeace05.ctc.idkwhattocallthis.PlayerWeaponsArmorUtils;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Ctc extends JavaPlugin {

    @Override
    public void onEnable(){
getServer().getPluginManager().registerEvents(new Events_0(),this);
        PlayerWeaponsArmorUtils.setup(); // for the weapons and oh yea, i wrote it in the name...



getServer().getConsoleSender().sendMessage("Ayy - Ult1's plugin thing");

    }

    //also add admin utils and stuff of that kind

    public void onDisable(){



    }
}
