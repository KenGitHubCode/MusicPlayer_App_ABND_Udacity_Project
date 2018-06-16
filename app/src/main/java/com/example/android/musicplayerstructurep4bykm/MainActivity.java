package com.example.android.musicplayerstructurep4bykm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the applicable category
        TextView aboveBeyondTextView = findViewById(R.id.above_beyond);
        // Set a click listener on that View
        aboveBeyondTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the applicable category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link applicable activity}
                Intent aboveBeyondIntent = new Intent(MainActivity.this, AboveBeyond.class);
                // Start the new activity
                startActivity(aboveBeyondIntent);
            }
        });
        // -----------------END REPEATABLE CODE SECTION PER NUMBER OF OPTIONS

        // ------------------REPEATABLE CODE SECTION PER NUMBER OF OPTIONS
        /* The below section performs the following fuctions:
            1. Finds the applicable text view and sets the onclick listener
            2. overrides onClick for the view to EXPLICIT intent from Main Activity Class to applicable class
            3. Starts Intent
         */
        // Find the View that shows the applicable category
        TextView ilanBluestoneTextView = findViewById(R.id.ilan_bluestone);
        // Set a click listener on that View
        ilanBluestoneTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the applicable category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link applicable activity}
                Intent ilanBluestoneIntent = new Intent(MainActivity.this, IlanBluestone.class);
                // Start the new activity
                startActivity(ilanBluestoneIntent);
            }
        });
        // -----------------END REPEATABLE CODE SECTION PER NUMBER OF OPTIONS



    }
}
