package de.ugur.nexusnight.nexusnight;

import de.ugur.nexusnight.nexusnight.adminshop.AdminShop;
import de.ugur.nexusnight.nexusnight.adminshop.Inventories;
import de.ugur.nexusnight.nexusnight.adminshop.Lores;
import de.ugur.nexusnight.nexusnight.listener.AdminShopListener;
import de.ugur.nexusnight.nexusnight.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;

public class Nexusnight extends JavaPlugin implements Listener {
    public static Economy economy;

    @Override
    public void onEnable() {
        if (!setupEconomy()) {
            getLogger().severe("Vault wurde nicht gefunden oder es gibt ein Problem mit der Economy-Integration!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        getServer().getPluginManager().registerEvents(new AdminShopListener(), this);
        getCommand("adminshop").setExecutor(new AdminShop(this));
        setHolz();
        setHolzBuy();
        setLores();
    }

    private void setHolzBuy() {
        int[] blankfield = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};
        for(int x : blankfield) {
            Inventories.buyoak.setItem(x, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("blankfield").build());
        }
        Inventories.buyoak.setItem(20, new ItemBuilder(Material.OAK_LOG).setLore(Lores.oakwoodlore1).setLocalizedName("buyoneoaklog").setLocalizedName("§bEichenholz").build());
        Inventories.buyoak.setItem(22, new ItemBuilder(Material.OAK_LOG).setLore(Lores.oakwoodlore32).setLocalizedName("buy32oaklog").setLocalizedName("§bEichenholz").build());
        Inventories.buyoak.setItem(24, new ItemBuilder(Material.OAK_LOG).setLore(Lores.oakwoodlore64).setLocalizedName("buy64oaklog").setLocalizedName("§bEichenholz").build());
    }

    private void setLores() {
        //Main Eichenholz
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Linksklick zum kaufen");
        //1
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Linksklick zum kaufen");
        //32
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Linksklick zum kaufen");
        //64
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Linksklick zum kaufen");
        //Main Eichenholz
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Linksklick zum kaufen");
        //1
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Linksklick zum kaufen");
        //32
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Linksklick zum kaufen");
        //64
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Linksklick zum kaufen");//Main Eichenholz
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Linksklick zum kaufen");
        //1
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Linksklick zum kaufen");
        //32
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Linksklick zum kaufen");
        //64
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Linksklick zum kaufen");//Main Eichenholz
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Linksklick zum kaufen");
        //1
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Linksklick zum kaufen");
        //32
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Linksklick zum kaufen");
        //64
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Linksklick zum kaufen");//Main Eichenholz
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodloremain.add("");
        Lores.oakwoodloremain.add("Linksklick zum kaufen");
        //1
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore1.add("");
        Lores.oakwoodlore1.add("Linksklick zum kaufen");
        //32
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore32.add("");
        Lores.oakwoodlore32.add("Linksklick zum kaufen");
        //64
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Kaufen für §b15§8$ pro Item");
        Lores.oakwoodlore64.add("");
        Lores.oakwoodlore64.add("Linksklick zum kaufen");
    }

    private void setHolz() {
        //Holz
        int[] blankfield = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};
        for(int x : blankfield) {
            Inventories.holz.setItem(x, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("blankfield").build());
        }
        Inventories.holz.setItem(10, new ItemBuilder(Material.OAK_LOG).setDisplayname("§bEichenstamm").setLocalizedName("oaklog").setLore(Lores.oakwoodloremain).build());
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        economy = getServer().getServicesManager().getRegistration(Economy.class).getProvider();
        return economy != null;
    }


}

