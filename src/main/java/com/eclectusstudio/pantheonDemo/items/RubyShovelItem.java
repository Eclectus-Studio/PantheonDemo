package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.tools.TexturedShovelItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;

public class RubyShovelItem extends TexturedShovelItem {
    public RubyShovelItem() {
        ItemStack stack = new ItemStack(Material.IRON_SHOVEL);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Shovel"));
        super(PantheonDemoItemLocations.RUBY_SHOVEL_LOCATION,
                stack,
                485,
                new RubyItem().createStack(),
                Tag.INCORRECT_FOR_IRON_TOOL,
                5f);
    }
}
