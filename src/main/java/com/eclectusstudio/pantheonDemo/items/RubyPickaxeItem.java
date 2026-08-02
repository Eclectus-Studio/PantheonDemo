package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.tools.TexturedPickaxeItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;

public class RubyPickaxeItem extends TexturedPickaxeItem {
    public RubyPickaxeItem() {
        ItemStack stack = new ItemStack(Material.IRON_PICKAXE);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Pickaxe"));
        super(PantheonDemoItemLocations.RUBY_PICKAXE_LOCATION,
                stack,
                500,
                new RubyItem().createStack(),
                Tag.INCORRECT_FOR_IRON_TOOL,
                5f);
    }
}
