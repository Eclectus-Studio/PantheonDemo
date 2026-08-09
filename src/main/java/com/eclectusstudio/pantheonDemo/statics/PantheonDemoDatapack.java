package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.Datapack;
import com.eclectusstudio.pantheon.common.data.jukebox_song.JukeboxSong;
import com.eclectusstudio.pantheonDemo.cats.RedCatVariant;

public class PantheonDemoDatapack {
    public static Datapack PANTHEON_DATAPACK = new Datapack();

    static {
        for(JukeboxSong song : PantheonDemoJukeboxSongs.songs) {
            PANTHEON_DATAPACK.addJukeboxSong(song);
        }

        PANTHEON_DATAPACK.addCatVariant(new RedCatVariant());
    }
}
