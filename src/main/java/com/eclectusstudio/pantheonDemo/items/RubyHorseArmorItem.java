package com.eclectusstudio.pantheonDemo.items;

import com.eclectusstudio.pantheon.item.armor.TexturedHorseArmorItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoEquipmentLocation;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RubyHorseArmorItem extends TexturedHorseArmorItem {
    public RubyHorseArmorItem() {
        ItemStack stack = new ItemStack(Material.PAPER);

        stack.setData(DataComponentTypes.CUSTOM_NAME, Component.text("Ruby Horse Armor"));

        super(
                PantheonDemoItemLocations.RUBY_HORSE_ARMOR_LOCATION,
                stack,
                PantheonDemoEquipmentLocation.RUBY_EQUIPMENT,
                6,
                0);
    }
}
