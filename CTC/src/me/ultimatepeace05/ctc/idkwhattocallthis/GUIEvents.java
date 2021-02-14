package me.ultimatepeace05.ctc.idkwhattocallthis;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;



public class GUIEvents implements Listener {

Events_0 event = new Events_0();



@EventHandler
    public void OnClick(InventoryClickEvent e){
    if(e.getClickedInventory() == null) {return;}
    if(e.getClickedInventory().getHolder() instanceof GUIStuff){
        e.setCancelled(true);
    Player player = (Player) e.getWhoClicked();
    if(e.getCurrentItem() == null) {return;}
    if(e.getSlot() == 12){
        event.TeamChosen(player,"green");
        player.sendMessage(ChatColor.GREEN + "You've chosen lime team.");
        player.playSound(player.getLocation(),Sound.BLOCK_NOTE_BELL,1.0f,1.0f);
         }
    if(e.getSlot() == 14){
        event.TeamChosen(player,"not_chosen");
        player.sendMessage(ChatColor.GOLD + "You've chosen a random team.");
        player.playSound(player.getLocation(),Sound.BLOCK_NOTE_XYLOPHONE,1.0f,1.0f);
    }
    if(e.getSlot() == 16){
        event.TeamChosen(player,"yellow");
        player.sendMessage(ChatColor.YELLOW + "You've chosen yellow team.");
        player.playSound(player.getLocation(),Sound.BLOCK_NOTE_BELL,1.0f,1.0f);

    }
    }

}




}
