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

public class AlbumScarsTEST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_album_scars);



        //------------Listener block below--------------------------------------------------------------
                /* The below section sets onsetOnItemClickListener, steps:
            1. Finds the applicable text view and sets the onclick listener
            2. overrides onClick for the view to EXPLICIT intentto applicable class
            3. Starts Intent
         */
        // Find the View that shows the applicable category
        final ListView myListView = (ListView) findViewById(R.id.play_song_list);

        // Set a click listener on that View
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                 /*
                 //TEST code that can be deleted.  Keep for now as it may be needed for songs...
               Object listItem = myListView.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(), "selected Item Name is "+listItem.toString() + " postion " + i, Toast.LENGTH_LONG).show();
                */

                //Creating a Class variable to hold the destination activity depending on Switch below
                Class myActivityToIntent = PlaySong.class;

                // Create a new intent to open the {@link applicable activity}
                Intent myIntent = new Intent(getApplicationContext(), myActivityToIntent);

                //Switch based on position in ListView, hardcoded based on ArrayList addition order
                //e.g. first added to Tunes instance was "Common Ground" so position 0 leads to AlbumCommonGround.class
                switch (i) {
                    case 0:
                        //myActivityToIntent = PlaySong.class;
                        myIntent.putExtra("myTitle", "Case 000");
                        myIntent.putExtra("mySubTitle", "Case 000 sub");
                        //myActivityToIntent = new PlaySong("asdf","ewfwef");
                        break;
                    case 1:
                        myIntent.putExtra("myTitle", "Case 1");
                        myIntent.putExtra("mySubTitle", "Case 1 sub");
                        //myActivityToIntent = PlaySong.class;
                        break;
                    case 2:
                        myIntent.putExtra("myTitle", "Case 2");
                        myIntent.putExtra("mySubTitle", "Case 2 sub");
                        //myActivityToIntent = PlaySong.class;
                        break;
                    default:
                        myIntent.putExtra("myTitle", "Case default");
                        myIntent.putExtra("mySubTitle", "Case default sub");
                        //myActivityToIntent = PlaySong.class;
                }

                // Start the new activity
                startActivity(myIntent);
            }
        });








        //------------------------------end listener block-------------------------------------------------------------

        // tunes ArrayList initialize, using ArrayList for variable size array
        ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune("I Believe","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Let Me Know","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Northern Soul","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Naked","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Sahara Love","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Happiness Amplified","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Is It Love (1001)","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Cold Feet","Scars", R.drawable.scarssm));
        tunes.add(new Tune("Scars","Scars", R.drawable.scarssm));

        //initialize itemsAdapter using tunes ArrayList
        TuneAdapter itemsAdapter = new TuneAdapter (this, tunes, R.color.above_and_beyond);

        //Initialize listView as the list View from the applicable xml file
        ListView mylistView = (ListView) findViewById(R.id.list);

        //set the adapter for listView (which is "list" view in the applicable xml) to itemsView using tunes
        mylistView.setAdapter(itemsAdapter);

        //LOGCAT Loop for values recording
        for(int index = 0; index < tunes.size(); index++){
            Log.v("NumbersActivity","Value at index " + index + ": " + tunes.get(index));
        }



    }
}
