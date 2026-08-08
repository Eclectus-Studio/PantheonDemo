package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.api.items.SimpleItemModels;
import com.eclectusstudio.pantheon.common.resource.models.ItemModelDefinition;

import java.util.List;

public class PantheonDemoItemModelDefinitions {
    public static final ItemModelDefinition RUBY_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_SWORD_ITEM_MODEL_DEFINITION =
            SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_SWORD_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_PICKAXE_ITEM_MODEL_DEFINITION =
            SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_PICKAXE_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_AXE_ITEM_MODEL_DEFINITION =
            SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_AXE_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_SHOVEL_ITEM_MODEL_DEFINITION =
            SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_SHOVEL_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_HOE_ITEM_MODEL_DEFINITION =
            SimpleItemModels.handheld(PantheonDemoItemLocations.RUBY_HOE_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_HELMET_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_HELMET_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_CHESTPLATE_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_CHESTPLATE_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_LEGGINGS_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_LEGGINGS_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_BOOTS_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_BOOTS_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_HORSE_ARMOR_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_HORSE_ARMOR_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_DOG_ARMOR_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_DOG_ARMOR_LOCATION).createDefinition();

    public static final ItemModelDefinition RUBY_NAUTILUS_ARMOR_ITEM_MODEL_DEFINITION =
            SimpleItemModels.generated(PantheonDemoItemLocations.RUBY_NAUTILUS_ARMOR_LOCATION).createDefinition();

    public static final ItemModelDefinition LOCAL_FORECAST_MUSIC_DISC =
            SimpleItemModels.generated(PantheonDemoItemLocations.LOCAL_FORECAST_MUSIC_DISC).createDefinition();

    public static final List<ItemModelDefinition> itemModelDefinitions = List.of(
            RUBY_ITEM_MODEL_DEFINITION,
            RUBY_SWORD_ITEM_MODEL_DEFINITION,
            RUBY_PICKAXE_ITEM_MODEL_DEFINITION,
            RUBY_AXE_ITEM_MODEL_DEFINITION,
            RUBY_SHOVEL_ITEM_MODEL_DEFINITION,
            RUBY_HOE_ITEM_MODEL_DEFINITION,
            RUBY_HELMET_ITEM_MODEL_DEFINITION,
            RUBY_CHESTPLATE_ITEM_MODEL_DEFINITION,
            RUBY_LEGGINGS_ITEM_MODEL_DEFINITION,
            RUBY_BOOTS_ITEM_MODEL_DEFINITION,
            RUBY_HORSE_ARMOR_ITEM_MODEL_DEFINITION,
            RUBY_DOG_ARMOR_ITEM_MODEL_DEFINITION,
            RUBY_NAUTILUS_ARMOR_ITEM_MODEL_DEFINITION,
            LOCAL_FORECAST_MUSIC_DISC
    );
}