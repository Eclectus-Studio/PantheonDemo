package com.eclectusstudio.pantheonDemo.sounds;

import com.eclectusstudio.pantheon.common.api.sounds.MusicDiscSound;
import com.eclectusstudio.pantheonDemo.PantheonDemo;

public class LocalForecastDiscSound extends MusicDiscSound {
    public LocalForecastDiscSound() {
        super(PantheonDemo.NAMESPACE, "local_forecast");
    }
}
