package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedLeggingsItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyLeggingsItem extends TexturedLeggingsItem {
    public RubyLeggingsItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Leggings"));
        super(
                PantheonDemoItemLocations.RUBY_LEGGINGS_LOCATION,
                stack,
                255,
                new RubyItem().createStack(),
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                5.5,
                0,
                10);
    }
}
