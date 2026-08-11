package com.eclectusstudio.pantheonDemo.statics;

import com.eclectusstudio.pantheon.common.Datapack;
import com.eclectusstudio.pantheon.common.data.jukebox_song.JukeboxSong;
import com.eclectusstudio.pantheonDemo.cats.RedCatVariant;
import com.eclectusstudio.pantheonDemo.chicken.RedChickenVariant;
import com.eclectusstudio.pantheonDemo.cow.RedCowVariant;
import com.eclectusstudio.pantheonDemo.frog.RedFrogVariant;
import com.eclectusstudio.pantheonDemo.pig.RedPigVariant;

public class PantheonDemoDatapack {
    public static Datapack PANTHEON_DATAPACK = new Datapack();

    static {
        for(JukeboxSong song : PantheonDemoJukeboxSongs.songs) {
            PANTHEON_DATAPACK.addJukeboxSong(song);
        }

        PANTHEON_DATAPACK.addCatVariant(new RedCatVariant());

        PANTHEON_DATAPACK.addChickenVariant(new RedChickenVariant());

        PANTHEON_DATAPACK.addCowVariants(new RedCowVariant());

        PANTHEON_DATAPACK.addFrogVariant(new RedFrogVariant());

        PANTHEON_DATAPACK.addPigVariant(new RedPigVariant());
    }
}
