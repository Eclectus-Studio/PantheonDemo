package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheonDemo.recipe.RubyAxeRecipe;
import org.bukkit.Bukkit;

public class PantheonDemoRecipes {
    public static void init(){
        Bukkit.addRecipe(RubyAxeRecipe.recipe);
    }
}
