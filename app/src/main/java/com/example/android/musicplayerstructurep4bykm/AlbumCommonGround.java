package com.example.android.musicplayerstructurep4bykm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class AlbumCommonGround extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_album_common_ground);

        // Find the View that shows the applicable category
        final ListView myCurrentListView = findViewById(R.id.list);

        // tunes ArrayList initialize, using ArrayList for variable size array
        final ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune("The Inconsistency Principle","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("My Own Hymn","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Northern Soul","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Naked","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Sahara Love","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Happiness Amplified","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Is It Love (1001)","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Cold Feet","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Tightrope","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Alright Now","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Bittersweet & Blue","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Always","Common Ground", R.drawable.commonsm));
        tunes.add(new Tune("Common Ground","Common Ground", R.drawable.commonsm));

        //initialize itemsAdapter using tunes ArrayList
        TuneAdapter itemsAdapter = new TuneAdapter (this, tunes, R.color.above_and_beyond);

        //Initialize listView as the list View from the applicable xml file
        ListView mylistView = findViewById(R.id.list);

        //set the adapter for listView (which is "list" view in the applicable xml) to itemsView using tunes
        mylistView.setAdapter(itemsAdapter);

        //------------Listener block below--------------------------------------------------------------
        /* The below section sets onsetOnItemClickListener, steps:
        1. Finds the applicable text view and sets the onclick listener
        2. overrides onClick for the view to EXPLICIT intentto applicable class
        3. Starts Intent */
        // Set a click listener on that View
        myCurrentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Creating a Class variable to hold the destination activity depending on Switch below
                Class myActivityToIntent = PlaySong.class;

                // Create a new intent to open the {@link applicable activity}
                Intent myIntent = new Intent(getApplicationContext(), myActivityToIntent);

                //Switch based on position in ListView, hardcoded based on ArrayList addition order
                //e.g. first added to Tunes instance was "Common Ground" so position 0 leads to AlbumCommonGround.class
                switch (i) {
                    case 0:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 1:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 2:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 3:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 4:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 5:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 6:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 7:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 8:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 9:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 10:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 11:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    case 12:
                        myIntent.putExtra("myTitle", tunes.get(i).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(i).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(i).getItemImage());
                        break;
                    default:
                        myIntent.putExtra("myTitle", "Song is missing.");
                        myIntent.putExtra("mySubTitle", tunes.get(3).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(0).getItemImage());
                        break;
                } // End Switch
                // Start the new activity
                startActivity(myIntent);
            }
        });

        //------------------------------end listener block-------------------------------------------------------------

        //LOGCAT Loop for values recording
        for(int index = 0; index < tunes.size(); index++){
            Log.v("NumbersActivity","Value at index " + index + ": " + tunes.get(index));
        }

    }
}