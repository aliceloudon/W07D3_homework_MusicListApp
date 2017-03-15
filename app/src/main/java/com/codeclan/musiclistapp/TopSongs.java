package com.codeclan.musiclistapp;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class TopSongs {

    private ArrayList<Song> list;

    public TopSongs(){
        list = new ArrayList<Song>();
        list.add(new Song(1, "Steal the Light", "The Cat Empire"));
        list.add(new Song(2, "Hello", "The Cat Empire"));
        list.add(new Song(3, "Crave You", "Flight Facilities"));
        list.add(new Song(4, "Stay The Same", "Bonobo"));
        list.add(new Song(5, "Reasonable Man", "Tiny Ruins"));
        list.add(new Song(6, "Another World", "The Chemical Brothers"));
        list.add(new Song(7, "Hero", "Family of the Year"));
        list.add(new Song(8, "Skeleton Dance", "Teleman"));
        list.add(new Song(9, "Choir to the Wild", "Solomon Grey"));
        list.add(new Song(10, "Homesick", "Kings of Convenience"));
        list.add(new Song(11, "(Something Inside) So Strong", "Labi Siffre"));
        list.add(new Song(12, "To Believe", "The Cinematic Orchestra"));
        list.add(new Song(13, "Melody Day - Four Tet Remix", "Caribou"));
        list.add(new Song(14, "Human", "Rag'n'Bone Man"));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}
