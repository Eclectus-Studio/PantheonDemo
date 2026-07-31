package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.api.items.SimpleItemModels;
import com.eclectusstudio.pantheon.common.resource.items.ItemModels;

import java.util.List;

public class PantheonDemoItemModels {
    public static final ItemModels RUBY_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_LOCATION).createItemModels();

    public static final ItemModels RUBY_SWORD_ITEM_MODEL = SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_SWORD_LOCATION).createItemModels();
    public static final ItemModels RUBY_PICKAXE_ITEM_MODEL = SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_PICKAXE_LOCATION).createItemModels();
    public static final ItemModels RUBY_AXE_ITEM_MODEL = SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_AXE_LOCATION).createItemModels();
    public static final ItemModels RUBY_SHOVEL_ITEM_MODEL = SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_SHOVEL_LOCATION).createItemModels();
    public static final ItemModels RUBY_HOE_ITEM_MODEL = SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_HOE_LOCATION).createItemModels();

    public static final ItemModels RUBY_HELMET_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_HELMET_LOCATION).createItemModels();
    public static final ItemModels RUBY_CHESTPLATE_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_CHESTPLATE_LOCATION).createItemModels();
    public static final ItemModels RUBY_LEGGINGS_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_LEGGINGS_LOCATION).createItemModels();
    public static final ItemModels RUBY_BOOTS_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_BOOTS_LOCATION).createItemModels();

    public static final ItemModels RUBY_HORSE_ARMOR_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_HORSE_ARMOR_LOCATION).createItemModels();
    public static final ItemModels RUBY_DOG_ARMOR_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_DOG_ARMOR_LOCATION).createItemModels();
    public static final ItemModels RUBY_NAUTILUS_ARMOR_ITEM_MODEL = SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_NAUTILUS_ARMOR_LOCATION).createItemModels();

    public static List<ItemModels> itemModels = List.of(
            RUBY_ITEM_MODEL,
            RUBY_SWORD_ITEM_MODEL,
            RUBY_PICKAXE_ITEM_MODEL,
            RUBY_AXE_ITEM_MODEL,
            RUBY_SHOVEL_ITEM_MODEL,
            RUBY_HOE_ITEM_MODEL,
            RUBY_HELMET_ITEM_MODEL,
            RUBY_CHESTPLATE_ITEM_MODEL,
            RUBY_LEGGINGS_ITEM_MODEL,
            RUBY_BOOTS_ITEM_MODEL,
            RUBY_HORSE_ARMOR_ITEM_MODEL,
            RUBY_DOG_ARMOR_ITEM_MODEL,
            RUBY_NAUTILUS_ARMOR_ITEM_MODEL
    );
}