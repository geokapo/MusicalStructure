package com.example.android.musicalstructure;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.android.musicalstructure.R;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the House Music category
        TextView houseMusic = (TextView) findViewById(R.id.houseMusic);

        // Set a click listener on that View
        houseMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the houseMusic category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HouseMusicActivity}
                Intent houseIntent = new Intent(MainActivity.this, HouseMusicActivity.class);

                // Start the new activity
                startActivity(houseIntent);
            }
        });


        // Find the View that shows the Electronic music category
        TextView electMusic = (TextView) findViewById(R.id.electMusic);

        // Set a click listener on that View
        electMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent electronicIntent = new Intent(MainActivity.this, ElectMusicActivity.class);

                // Start the new activity
                startActivity(electronicIntent);
            }
        });

        // Find the View that shows the Pop music category
        TextView popMusic = (TextView) findViewById(R.id.popMusic);

        // Set a click listener on that View
        popMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent popIntent = new Intent(MainActivity.this, PopMusicActivity.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

    }

}



