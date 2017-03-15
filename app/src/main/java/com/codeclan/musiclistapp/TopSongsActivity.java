package com.codeclan.musiclistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> list = topSongs.getList();

        TopSongsAdapter songsAdapter = new TopSongsAdapter(this,list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }

    public void titleClicked(View textView){
        TextView title = (TextView) textView;
        Log.d("Title clicked", title.getText().toString());

    }

    public void itemClicked(View item){
        Log.d("Item clicked", "Yay");
    }

}
