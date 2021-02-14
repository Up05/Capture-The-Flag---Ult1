package me.ultimatepeace05.ctc.idkwhattocallthis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class Events_0 implements Listener {

    public int roundTime = 0;
    public byte playerClass = 0;
        Player player;
        Bukkit bukkit;

    Team yellow = null;
    Team green = null;


    @EventHandler
    public void OnPlayerJoin(PlayerJoinEvent startOfMatch) {
        createScoreboard(startOfMatch.getPlayer());

        //start timer
        //choose random class                                       ###DONE
        //open gui with team selection                              ###DONE
        //when team picked send message with team + give sound      ###IMMAWORKONTHAT
        //assing teams and stuff                                    ###DONE?
        //spawn in right location
        //get lot of locations so no same spot                      ###Eh...\
        //implement some modifiers and stuff
        //also spawn an emerald at the flag spot and make it persistent...



        //I guess make an array for this or something... idk...


        for(int i = 1; i <= bukkit.getOnlinePlayers().size(); i ++)     //it's been buggin' me to remove curly braces... now it wants them back! Damn you a java development kit!

            if (!player.getInventory().contains(Material.NETHER_STAR)) {
                player.getPlayer().getInventory().addItem(PlayerWeaponsArmorUtils.teamSelector);
            } //they killed the "!" :( // nvm, they didn't, phew!

    }
//gotta move this probs
    public void createScoreboard(Player player) {
        ScoreboardManager scoreboardmanager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardmanager.getNewScoreboard();
        Objective objective = new scoreboard.registerNewObjective("Statistics", "Dummy"); //idfk why this doesn't work...
        objective.setDisplayName("IdkYet");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        yellow = scoreboard.registerNewTeam("Yellow");
        green = scoreboard.registerNewTeam("Green");

        yellow.setColor(ChatColor.YELLOW);
        green.setColor(ChatColor.GREEN);
        yellow.setNameTagVisibility(NameTagVisibility.HIDE_FOR_OTHER_TEAMS);
        green.setNameTagVisibility(NameTagVisibility.HIDE_FOR_OTHER_TEAMS);

         //

    Score space = objective.getScore("");
    }


    public void TeamChosen(Player player, String team){
        switch(team){
            case "yellow":
                yellow.addPlayer(player);
                break;
            case "green":
                green.addPlayer(player);
                break;

            case "not_chosen":
                if(Math.random() <= 0.5 && yellow.getPlayers().size() < 3 && green.getPlayers().size() < 3){
                    yellow.addPlayer(player);
                } else if(Math.random() >= 0.5 && yellow.getPlayers().size() < 3 && green.getPlayers().size() < 3) {
                    green.addPlayer(player);
                } else if(yellow.getPlayers().size() < 3) { yellow.addPlayer(player);
                } else {green.addPlayer(player);}
                break;
            //if "1" and team player size <= 2 add player to yellow... if 2 and ... add player to green. If one of the teams is full, see which and add player there
        }

    }


}
