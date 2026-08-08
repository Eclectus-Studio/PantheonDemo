package com.eclectusstudio.pantheonDemo.jukeboxsongs;

import com.eclectusstudio.pantheon.common.data.jukebox_song.JukeboxSong;
import com.eclectusstudio.pantheonDemo.sounds.LocalForecastDiscSound;
import com.eclectusstudio.pantheonDemo.statics.PantheonDemoItemLocations;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

public class LocalForecastJukeboxSong extends JukeboxSong{
    public LocalForecastJukeboxSong() {
        super(
                PantheonDemoItemLocations.LOCAL_FORECAST_MUSIC_DISC,
                new LocalForecastDiscSound(),
                PlainTextComponentSerializer.plainText().serialize(Component.text("Local Forecast — Kevin MacLeod")),
                166,
                7);
    }
}
