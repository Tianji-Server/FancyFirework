package de.fanta.fancyfirework.fireworks.defaults;

import de.fanta.fancyfirework.FancyFirework;
import de.fanta.fancyfirework.utils.CustomFireworkHeads;
import java.util.UUID;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public class FireWorkFountainYellow extends FireWorkFountain {

    private static final FancyFirework plugin = FancyFirework.getPlugin();

    public FireWorkFountainYellow() {
        super(new NamespacedKey(FancyFirework.getPlugin(), "fountain_yellow"));
    }

    @Override
    protected ItemStack createItemStack() {
        ItemStack itemStack = CustomFireworkHeads.getCustomTextureHead(UUID.fromString("f561d139-2636-4cfb-a63f-e931080f8924"), "Firework Rocket (black / yellow)",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjM0ZWIzNTZiNTc1MjEyYTkyMWFiNzg2MTY4MzIxZmVhNDc2ZTRiYmQzYzFiNmE2N2Y1YTRiYTA5MTM1M2EifX19");
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(ChatColor.of("#ffeb14") + "黄色喷泉");
        meta.setLore(FancyFirework.getPlugin().getConfig().getStringList("itemlore"));
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    @Override
    public Color randomColor() {
        java.awt.Color color = java.awt.Color.getHSBColor(0.16f, random.nextFloat(0.8f, 1), random.nextFloat(0.3f, 1));
        return Color.fromRGB(color.getRed(), color.getGreen(), color.getBlue());
    }

}



