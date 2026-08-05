package com.eclectusstudio.pantheonDemo.recipe;

import com.eclectusstudio.pantheonDemo.items.RubyChestplateItem;
import com.eclectusstudio.pantheonDemo.items.RubyItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static com.eclectusstudio.pantheon.utils.LocationToNamespaceKey.toKey;

public class RubyChestplateRecipe {
    public static final ShapedRecipe recipe;

    static {
        recipe = new ShapedRecipe(
                toKey(PantheonDemoItemLocations.RUBY_CHESTPLATE_LOCATION),
                new RubyChestplateItem().createStack()
        );

        recipe.shape(
                "A A",
                "AAA",
                "AAA"
        );

        recipe.setIngredient(
                'A',
                new RecipeChoice.ExactChoice(new RubyItem().createStack())
        );
    }
}