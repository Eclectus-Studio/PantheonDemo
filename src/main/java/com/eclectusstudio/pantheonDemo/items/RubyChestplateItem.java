package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedChestplateItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyChestplateItem extends TexturedChestplateItem {
    public RubyChestplateItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Chestplate"));
        super(
                PantheonDemoItemLocations.RUBY_CHESTPLATE_LOCATION,
                stack,
                275,
                new RubyItem().createStack(),
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                6.5,
                0,
                10);
    }
}
