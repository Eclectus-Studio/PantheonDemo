package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.weapons.TexturedSwordItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubySwordItem extends TexturedSwordItem {
    protected RubySwordItem() {

        ItemStack stack = new ItemStack(Material.IRON_SWORD);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Sword"));

        super(
                PantheonDemoItemLocations.RUBY_SWORD_LOCATION,
                stack,
                300,
                new RubyItem().createStack(),
                6.5,
                1.7);
    }
}
