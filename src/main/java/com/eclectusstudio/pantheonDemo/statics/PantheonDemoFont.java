package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.api.font.FontAPI;
import com.eclectusstudio.pantheon.common.api.font.RankTemplate;
import com.eclectusstudio.pantheon.common.resource.fonts.Font;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

public class PantheonDemoFont {
    private static final FontAPI fontAPI = FontAPI.create();

    public static final RankTemplate ParrotRank = new RankTemplate('\uE000',
            new ResourceLocation(PantheonDemo.NAMESPACE,"ranks/parrot.png"));

    public static Font font;

    static {
        fontAPI.rank(ParrotRank);

        font = fontAPI.build();
    }
}