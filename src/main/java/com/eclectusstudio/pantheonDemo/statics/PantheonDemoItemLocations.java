package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

import java.util.List;

public class PantheonDemoItemLocations {
    public static final ResourceLocation RUBY_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby");
    public static final ResourceLocation RUBY_SWORD_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_sword");
    public static final ResourceLocation RUBY_PICKAXE_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_pickaxe");
    public static final ResourceLocation RUBY_AXE_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_axe");
    public static final ResourceLocation RUBY_SHOVEL_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_shovel");
    public static final ResourceLocation RUBY_HOE_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_hoe");

    public static final ResourceLocation RUBY_HELMET_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_helmet");
    public static final ResourceLocation RUBY_CHESTPLATE_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_chestplate");
    public static final ResourceLocation RUBY_LEGGINGS_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_leggings");
    public static final ResourceLocation RUBY_BOOTS_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_boots");

    public static final ResourceLocation RUBY_HORSE_ARMOR_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_horse_armor");
    public static final ResourceLocation RUBY_DOG_ARMOR_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_dog_armor");
    public static final ResourceLocation RUBY_NAUTILUS_ARMOR_LOCATION = new ResourceLocation(PantheonDemo.NAMESPACE, "ruby_nautilus_armor");

    public static final ResourceLocation LOCAL_FORECAST_MUSIC_DISC = new ResourceLocation(PantheonDemo.NAMESPACE, "local_forecast_music_disc");
    
    public static final List<ResourceLocation> resourceLocations = List.of(
            RUBY_LOCATION,
            RUBY_SWORD_LOCATION,
            RUBY_PICKAXE_LOCATION,
            RUBY_AXE_LOCATION,
            RUBY_SHOVEL_LOCATION,
            RUBY_HOE_LOCATION,
            RUBY_HELMET_LOCATION,
            RUBY_CHESTPLATE_LOCATION,
            RUBY_LEGGINGS_LOCATION,
            RUBY_BOOTS_LOCATION,
            RUBY_HORSE_ARMOR_LOCATION,
            RUBY_DOG_ARMOR_LOCATION,
            RUBY_NAUTILUS_ARMOR_LOCATION,
            LOCAL_FORECAST_MUSIC_DISC
    );
}
