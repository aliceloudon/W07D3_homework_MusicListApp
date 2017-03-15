package com.codeclan.musiclistapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/03/2017.
 */

public class TopSongsTest {

    @Test
    public void getListTest() {
        TopSongs topSongs = new TopSongs();
        assertEquals(14, topSongs.getList().size());
    }
    
}
