package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.item.Item;
import com.eclectusstudio.pantheonDemo.items.*;

import java.util.List;

public class PantheonDemoItems {
    public static List<Item> items = List.of(
            new RubyItem(),
            new RubyAxeItem(),
            new RubyChestplateItem(),
            new RubyHelmetItem(),
            new RubyHoeItem(),
            new RubyHorseArmorItem(),
            new RubyLeggingsItem(),
            new RubyPickaxeItem(),
            new RubyShovelItem(),
            new RubySwordItem()
    );
}
