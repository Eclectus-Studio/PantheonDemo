package com.eclectusstudio.pantheonDemo.recipes;

import com.eclectusstudio.pantheonDemo.items.RubyAxeItem;
import com.eclectusstudio.pantheonDemo.items.RubyItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import org.bukkit.Material;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static com.eclectusstudio.pantheon.utils.LocationToNamespaceKey.toKey;

public class RubyAxeRecipe {
    public static final ShapedRecipe recipe;

    static{
        recipe = new ShapedRecipe(toKey(PantheonDemoItemLocations.RUBY_AXE_LOCATION), new RubyAxeItem().createStack());

        recipe.shape(
                "AA ",
                "AB ",
                " B "
        );

        recipe.setIngredient('A',
                new RecipeChoice.ExactChoice(new RubyItem().createStack())
                );

        recipe.setIngredient('B', Material.STICK);
    }
}
