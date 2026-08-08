package com.eclectusstudio.pantheonDemo.recipes;

import com.eclectusstudio.pantheonDemo.items.RubyHoeItem;
import com.eclectusstudio.pantheonDemo.items.RubyItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import org.bukkit.Material;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static com.eclectusstudio.pantheon.utils.LocationToNamespaceKey.toKey;

public class RubyHoeRecipe {
    public static final ShapedRecipe recipe;

    static {
        recipe = new ShapedRecipe(
                toKey(PantheonDemoItemLocations.RUBY_HOE_LOCATION),
                new RubyHoeItem().createStack()
        );

        recipe.shape(
                "AA ",
                " B ",
                " B "
        );

        recipe.setIngredient(
                'A',
                new RecipeChoice.ExactChoice(new RubyItem().createStack())
        );

        recipe.setIngredient('B', Material.STICK);
    }
}