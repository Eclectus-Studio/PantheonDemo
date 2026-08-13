package com.eclectusstudio.pantheonDemo.paintings;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.data.painting_variant.PaintingVariant;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

public class PigPainting extends PaintingVariant {
    public PigPainting() {
        super(
                new ResourceLocation(PantheonDemo.NAMESPACE, "pig"),
                1,
                1,
                "Pig",
                "Minetrio1256 & Mojang");
    }
}
