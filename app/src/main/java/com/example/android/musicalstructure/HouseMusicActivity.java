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


public class HouseMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Sunlight Denis First Club Remix", "Filatov & Karas"));
        songs.add(new Song("Real You", "Vanze & Balco"));
        songs.add(new Song("Obsession feat. Steven Aderinto & DuoViolins", "Consoul Trainin"));
        songs.add(new Song("Maria, Maria", "Mari Ferrari"));
        songs.add(new Song(" Crazy", "Lost Frequencies & Zonderling "));
        songs.add(new Song("Cola", "Camelphat & Elderbrook "));
        songs.add(new Song("Lost", "Roger Sanchez ft. Lisa Pur"));
        songs.add(new Song("Move On ft. Jabbar", "Deeperise"));
        songs.add(new Song("Thinking Of You", "Elias"));
        songs.add(new Song("Bang Bang", "Nancy Sinatra"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);

        /* Find the Home button*/
        Button homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton = new Intent(HouseMusicActivity.this, MainActivity.class);
                startActivity(homeButton);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song currentSong = (Song) adapterView.getItemAtPosition(position);
                // Add some code here
                Intent i = new Intent(HouseMusicActivity.this, currentSong.class);
                i.putExtra("songName", currentSong.getSongName());
                i.putExtra("artistName", currentSong.getArtistName());
                startActivity(i);
            }
        });


    }
}




