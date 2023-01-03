package de.ugur.nexusnight.nexusnight.listener;

import de.ugur.nexusnight.nexusnight.Nexusnight;
import de.ugur.nexusnight.nexusnight.adminshop.Inventories;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class AdminShopListener implements Listener {

    @EventHandler
    public void onMainInv(InventoryClickEvent event) {
        if (event.getCurrentItem() == null) return;
        if (event.getView().getTitle().equalsIgnoreCase("§f§lNexusnight §r»§8 AdminShop")) {
            if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                Player p = (Player) event.getWhoClicked();
                event.setCancelled(true);
                switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
                    case "woodmainitem":
                        p.openInventory(Inventories.holz);
                        break;
                    case "oaklog":
                        p.openInventory(Inventories.buyoak);
                        break;
                    case "buyoneoaklog":
                        if (Nexusnight.economy.has(p, 15)) {
                            Nexusnight.economy.withdrawPlayer(p, 15);
                            p.getInventory().addItem(new ItemStack(Material.OAK_LOG));
                        }
                        break;
                    case "buy32oaklog":
                        ItemStack oaklog32 = new ItemStack(Material.OAK_LOG);
                        oaklog32.setAmount(32);
                        if (Nexusnight.economy.has(p, 480)) {
                            Nexusnight.economy.withdrawPlayer(p, 480);
                            p.getInventory().addItem(oaklog32);
                        }
                        break;
                    case "buy64oaklog":
                        ItemStack oaklog64 = new ItemStack(Material.OAK_LOG);
                        oaklog64.setAmount(64);
                        if (Nexusnight.economy.has(p, 960)) {
                            Nexusnight.economy.withdrawPlayer(p, 960);
                            p.getInventory().addItem(oaklog64);
                        }
                        break;
                }
                }
        }
    }
}
