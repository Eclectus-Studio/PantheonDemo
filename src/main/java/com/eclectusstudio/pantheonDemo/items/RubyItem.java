package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.TexturedItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyItem extends TexturedItem {
    protected RubyItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby"));

        super(PantheonDemoItemLocations.RUBY_LOCATION, stack);
    }
}
