package com.eclectusstudio.pantheonDemo.recipes;

import com.eclectusstudio.pantheonDemo.items.RubyLeggingsItem;
import com.eclectusstudio.pantheonDemo.items.RubyItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static com.eclectusstudio.pantheon.utils.LocationToNamespaceKey.toKey;

public class RubyLeggingsRecipe {
    public static final ShapedRecipe recipe;

    static {
        recipe = new ShapedRecipe(
                toKey(PantheonDemoItemLocations.RUBY_LEGGINGS_LOCATION),
                new RubyLeggingsItem().createStack()
        );

        recipe.shape(
                "AAA",
                "A A",
                "A A"
        );

        recipe.setIngredient(
                'A',
                new RecipeChoice.ExactChoice(new RubyItem().createStack())
        );
    }
}