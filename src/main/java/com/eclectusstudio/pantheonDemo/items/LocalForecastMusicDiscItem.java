package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.musicdisc.TexturedMusicDiscItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemRarity;
import org.bukkit.inventory.ItemStack;

public class LocalForecastMusicDiscItem extends TexturedMusicDiscItem {
    public LocalForecastMusicDiscItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Music Disc"));
        stack.setData(DataComponentTypes.RARITY, ItemRarity.RARE);

        super(PantheonDemoItemLocations.LOCAL_FORECAST_MUSIC_DISC, stack, PantheonDemoItemLocations.LOCAL_FORECAST_MUSIC_DISC);
    }
}
