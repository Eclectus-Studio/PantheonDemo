package com.eclectusstudio.pantheonDemo.recipes;

import com.eclectusstudio.pantheonDemo.items.RubyHorseArmorItem;
import com.eclectusstudio.pantheonDemo.items.RubyItem;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static com.eclectusstudio.pantheon.utils.LocationToNamespaceKey.toKey;

public class RubyHorseArmorRecipe {
    public static final ShapedRecipe recipe;

    static {
        recipe = new ShapedRecipe(
                toKey(PantheonDemoItemLocations.RUBY_HORSE_ARMOR_LOCATION),
                new RubyHorseArmorItem().createStack()
        );

        recipe.shape(
                "A A",
                "AAA",
                "A A"
        );

        recipe.setIngredient(
                'A',
                new RecipeChoice.ExactChoice(new RubyItem().createStack())
        );
    }
}