package com.example.android.musicalstructure;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class currentSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);

        /*Get information on the song*/
        Bundle extras = getIntent().getExtras();

        /*Get extras on song and artist name and find the view ID of the Views where this info
        should be displayed*/
        String currentSongName = extras.getString("songName");
        TextView songView = (TextView) findViewById(R.id.song_name);

        String currentArtistName = extras.getString("artistName");
        TextView artistView = (TextView) findViewById(R.id.artist_name);

        /*Insert the text I got from extras to the particular Views*/
        songView.setText(currentSongName);
        artistView.setText(currentArtistName);

        /* Find the Back button*/
        ImageView backButton = (ImageView) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}