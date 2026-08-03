package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedHelmetItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyHelmetItem extends TexturedHelmetItem {
    public RubyHelmetItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Helmet"));
        super(
                PantheonDemoItemLocations.RUBY_HELMET_LOCATION,
                stack,
                200,
                new RubyItem().createStack(),
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                2.5,
                0,
                10);
    }
}
