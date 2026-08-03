package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.tools.TexturedHoeItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyHoeItem extends TexturedHoeItem {
    public RubyHoeItem() {
        ItemStack stack = new ItemStack(Material.IRON_HOE);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Hoe"));
        super(PantheonDemoItemLocations.RUBY_HOE_LOCATION, stack, 475, new RubyItem().createStack());
    }
}
