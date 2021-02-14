package me.ultimatepeace05.ctc.idkwhattocallthis;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerWeaponsArmorUtils  {

    public static ItemStack aSword;
    public static ItemStack cPickaxe;
    public static ItemStack teamSelector;
public static void setup(){
create_aSword();
TeamSelectionItem();

}
//a - flagger  b - offense-person c - defense-person
    private static void create_aSword(){

    ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Scout's sword");
        meta.addEnchant(Enchantment.KNOCKBACK,1,false);
        item.setItemMeta(meta);
        aSword = item;
    }

    private static void create_cPickaxe(){

        ItemStack item = new ItemStack(Material.GOLD_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Defensive Pickaxe!");
        meta.addEnchant(Enchantment.DAMAGE_ALL,3,false);
        item.setItemMeta(meta);
        cPickaxe = item;
    }

    private static void create_bScythe(){

        ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Quick pick");
        meta.addEnchant(Enchantment.DAMAGE_ALL,7,false);
        item.setItemMeta(meta);
        cPickaxe = item;
    }

    private static void TeamSelectionItem(){

        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Team selection");
        item.setItemMeta(meta);
        teamSelector = item;



    }


}
