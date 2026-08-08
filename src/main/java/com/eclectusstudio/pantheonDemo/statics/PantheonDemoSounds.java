package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.ResourceLocation;
import com.eclectusstudio.pantheon.common.resource.sounds.SoundEvent;
import com.eclectusstudio.pantheon.common.resource.sounds.SoundsFile;
import com.eclectusstudio.pantheonDemo.PantheonDemo;
import com.eclectusstudio.pantheonDemo.sounds.LocalForecastDiscSound;

public final class PantheonDemoSounds {
    public static final SoundsFile sounds =
            new SoundsFile(new ResourceLocation(PantheonDemo.NAMESPACE, "sounds"));

    public static SoundEvent localForecastMusicDisc = new LocalForecastDiscSound();

    static {
        sounds.register(localForecastMusicDisc);
    }
}
