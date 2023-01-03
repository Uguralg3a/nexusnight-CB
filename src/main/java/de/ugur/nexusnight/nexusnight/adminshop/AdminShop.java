package de.ugur.nexusnight.nexusnight.adminshop;

import de.ugur.nexusnight.nexusnight.Nexusnight;
import de.ugur.nexusnight.nexusnight.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class AdminShop implements CommandExecutor {
    private Nexusnight plugin;

    public AdminShop(Nexusnight plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;

        Inventory adminshop = Bukkit.createInventory(null, 6*9, "§f§lNexusnight §r»§8 AdminShop");
        int[] blankfield = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};
        for(int x : blankfield) {
            adminshop.setItem(x, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("blankfield").build());
        }
        adminshop.setItem(10, new ItemBuilder(Material.OAK_LOG).setDisplayname("§bHolz").setLocalizedName("woodmainitem").build());
        adminshop.setItem(11, new ItemBuilder(Material.STONE).setDisplayname("§bStein").setLocalizedName("stonemainitem").build());
        adminshop.setItem(12, new ItemBuilder(Material.DEEPSLATE_DIAMOND_ORE).setDisplayname("§bErze").setLocalizedName("oresmainitem").build());
        adminshop.setItem(13, new ItemBuilder(Material.ROTTEN_FLESH).setDisplayname("§bMob Loot").setLocalizedName("moblootmainitem").build());
        adminshop.setItem(14, new ItemBuilder(Material.GRASS_BLOCK).setDisplayname("§bNatur").setLocalizedName("nautremainitem").build());
        adminshop.setItem(15, new ItemBuilder(Material.COBBLED_DEEPSLATE).setDisplayname("§bDeep Dark").setLocalizedName("deepdarkmainitem").build());
        adminshop.setItem(16, new ItemBuilder(Material.NETHERRACK).setDisplayname("§bNether").setLocalizedName("nethermainitem").build());
        adminshop.setItem(19, new ItemBuilder(Material.END_STONE).setDisplayname("§bEnd").setLocalizedName("endmainitem").build());
        adminshop.setItem(20, new ItemBuilder(Material.SMALL_DRIPLEAF).setDisplayname("§bLush Cave").setLocalizedName("lushcavemainitem").build());
        adminshop.setItem(21, new ItemBuilder(Material.WHITE_WOOL).setDisplayname("§bWolle").setLocalizedName("woolmainitem").build());
        adminshop.setItem(22, new ItemBuilder(Material.WHITE_GLAZED_TERRACOTTA).setDisplayname("§bGlasierter Keramik").setLocalizedName("glazedterracottamainitem").build());
        adminshop.setItem(23, new ItemBuilder(Material.WHITE_TERRACOTTA).setDisplayname("§bKeramik").setLocalizedName("terracottamainitem").build());
        adminshop.setItem(24, new ItemBuilder(Material.WHITE_CONCRETE_POWDER).setDisplayname("§bTrocken Beton").setLocalizedName("concretepowdermainitem").build());
        adminshop.setItem(25, new ItemBuilder(Material.WHITE_CONCRETE).setDisplayname("§bBeton").setLocalizedName("concretemainitem").build());
        adminshop.setItem(28, new ItemBuilder(Material.WHITE_STAINED_GLASS).setDisplayname("§bGlas").setLocalizedName("glasmainitem").build());
        adminshop.setItem(29, new ItemBuilder(Material.GLOW_BERRIES).setDisplayname("§bEssen").setLocalizedName("foodmainitem").build());
        adminshop.setItem(30, new ItemBuilder(Material.ALLAY_SPAWN_EGG).setDisplayname("§bSpawn Eier").setLocalizedName("spawneggsmainitem").build());
        adminshop.setItem(31, new ItemBuilder(Material.SPAWNER).setDisplayname("§cAdmin Items").setLocalizedName("adminmainitem").build());
        player.openInventory(adminshop);
        return false;
    }
}
