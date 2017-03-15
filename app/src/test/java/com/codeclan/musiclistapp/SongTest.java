package com.codeclan.musiclistapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/03/2017.
 */

public class SongTest {

    Song song;

    @Before
    public void before() {
        song = new Song(100, "Dreamer", "Jenn Grant");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)100, song.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Dreamer", song.getTitle());

    }

    @Test
    public void getYearTest() {
        assertEquals("Jenn Grant", song.getArtist());

    }

}
