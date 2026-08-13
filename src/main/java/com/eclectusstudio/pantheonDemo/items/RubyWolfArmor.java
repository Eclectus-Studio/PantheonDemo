package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedWolfArmorItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyWolfArmor extends TexturedWolfArmorItem {
    public RubyWolfArmor() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Wolf Armor"));
        super(
                PantheonDemoItemLocations.RUBY_WOLF_ARMOR_LOCATION,
                stack,
                200,
                new RubyItem().createStack(),
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT
        );
    }
}
