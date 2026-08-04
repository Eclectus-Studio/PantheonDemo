package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedNautilusArmorItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyNautilusArmorItem extends TexturedNautilusArmorItem {
    public RubyNautilusArmorItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Nautilus Armor"));
        super(
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                stack,
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                5.5,
                0);
    }
}
