package me.ultimatepeace05.ctc.idkwhattocallthis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIStuff implements InventoryHolder {

    private Inventory teamSel;

    private void teamSelVoid(){
    teamSel = Bukkit.createInventory(this,27,"Team selection");
setup();

    }

    private void setup(){
        ItemStack item;
    item = MakeItem("§aLime team",Material.STAINED_GLASS_PANE,(short) 5);
    teamSel.setItem(12,item);
        item = MakeItem("§aRandom team",Material.STAINED_GLASS_PANE,(short) 7);
        teamSel.setItem(14,item);
        item = MakeItem("§6Yellow team",Material.STAINED_GLASS_PANE,(short) 4);
        teamSel.setItem(16,item);
    }

    private ItemStack MakeItem(String name, Material mat, short color){
        ItemStack item = new ItemStack(mat,1,color);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;

    }

    @Override
    public Inventory getInventory() {
        return teamSel;



    }
}
