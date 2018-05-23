package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


import com.example.android.musicalstructure.R;

import java.util.ArrayList;

public class PopMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("One Kiss", "Calvin Harris, Dua Lipa"));
        songs.add(new Song("In Common(Black Coffee Remix)", "Alicia Keys "));
        songs.add(new Song(" I'm Sorry ", "Arilena Ara"));
        songs.add(new Song("Wait", "Maroon 5 "));
        songs.add(new Song("Never Be the Same", "Camila Cabello"));
        songs.add(new Song("No Tears Left To Cry", "Ariana Grande"));
        songs.add(new Song("Thunder", "Imagine Dragons"));
        songs.add(new Song("How Long", "Charlie Puth"));
        songs.add(new Song("Wolves", "Selena Gomez, Marshmell"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(adapter);
        /* Find the Home button*/
        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton = new Intent(PopMusicActivity.this, MainActivity.class);
                startActivity(homeButton);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song currentSong = (Song) adapterView.getItemAtPosition(position);
                // Add some code here
                Intent i = new Intent(PopMusicActivity.this, currentSong.class);
                i.putExtra("songName", currentSong.getSongName());
                i.putExtra("artistName", currentSong.getArtistName());
                startActivity(i);
            }
        });


    }
}
