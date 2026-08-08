package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheonDemo.recipes.*;
import org.bukkit.Bukkit;

public class PantheonDemoRecipes {
    public static void init(){
        Bukkit.addRecipe(RubyAxeRecipe.recipe);
        Bukkit.addRecipe(RubyBootsRecipe.recipe);
        Bukkit.addRecipe(RubyChestplateRecipe.recipe);
        Bukkit.addRecipe(RubyHelmetRecipe.recipe);
        Bukkit.addRecipe(RubyHoeRecipe.recipe);
        Bukkit.addRecipe(RubyHorseArmorRecipe.recipe);
        Bukkit.addRecipe(RubyLeggingsRecipe.recipe);
        Bukkit.addRecipe(RubyPickaxeRecipe.recipe);
        Bukkit.addRecipe(RubyShovelRecipe.recipe);
        Bukkit.addRecipe(RubySwordRecipe.recipe);
    }
}
