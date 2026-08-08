package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.data.jukebox_song.JukeboxSong;
import com.eclectusstudio.pantheonDemo.jukeboxsongs.LocalForecastJukeboxSong;

import java.util.ArrayList;
import java.util.List;

public class PantheonDemoJukeboxSongs {
    public static List<JukeboxSong> songs = new ArrayList<>();

    public static final JukeboxSong LOCAL_FORECAST_JUKEBOX_SONG = new LocalForecastJukeboxSong();

    static {
        songs.add(LOCAL_FORECAST_JUKEBOX_SONG);
    }
}
