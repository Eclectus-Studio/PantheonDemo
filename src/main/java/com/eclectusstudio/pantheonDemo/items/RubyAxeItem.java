package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.tools.TexturedAxeItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;

public class RubyAxeItem extends TexturedAxeItem {
    public RubyAxeItem() {
        ItemStack stack = new ItemStack(Material.IRON_AXE);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Axe"));
        super(PantheonDemoItemLocations.RUBY_AXE_LOCATION,
                stack,
                510,
                new RubyItem().createStack(),
                Tag.INCORRECT_FOR_IRON_TOOL,
                5f);
    }
}
