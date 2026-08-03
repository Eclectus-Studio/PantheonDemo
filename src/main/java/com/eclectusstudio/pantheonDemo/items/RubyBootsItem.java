package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedBootItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyBootsItem extends TexturedBootItem {
    public RubyBootsItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Boots"));
        super(PantheonDemoItemLocations.RUBY_BOOTS_LOCATION,
                stack,
                215,
                new RubyItem().createStack(),
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                2.5,
                0,
                10);
    }
}
