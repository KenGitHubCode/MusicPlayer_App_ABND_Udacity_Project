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

public class AlbumRibbons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_album_ribbons);

        // Find the View that shows the applicable category
        final ListView myCurrentListView = (ListView) findViewById(R.id.list);

        // tunes ArrayList initialize, using ArrayList for variable size array
        final ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune("Filmic","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Alchemy","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Northern Soul","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Naked","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Sahara Love","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Happiness Amplified","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Is It Love (1001)","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Cold Feet","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Tightrope","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Alright Now","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Bittersweet & Blue","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Always","Ribbons", R.drawable.ribbonsm));
        tunes.add(new Tune("Ribbons","Ribbons", R.drawable.ribbonsm));

        //initialize itemsAdapter using tunes ArrayList
        TuneAdapter itemsAdapter = new TuneAdapter (this, tunes, R.color.above_and_beyond);

        //Initialize listView as the list View from the applicable xml file
        ListView mylistView = (ListView) findViewById(R.id.list);

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
                        myIntent.putExtra("myTitle", tunes.get(0).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(0).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(0).getItemImage());
                        break;
                    case 1:
                        myIntent.putExtra("myTitle", tunes.get(1).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(1).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(1).getItemImage());
                        break;
                    case 2:
                        myIntent.putExtra("myTitle", tunes.get(2).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(2).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(2).getItemImage());
                        break;
                    case 3:
                        myIntent.putExtra("myTitle", tunes.get(3).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(3).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(3).getItemImage());
                        break;
                    case 4:
                        myIntent.putExtra("myTitle", tunes.get(4).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(4).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(4).getItemImage());
                        break;
                    case 5:
                        myIntent.putExtra("myTitle", tunes.get(5).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(5).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(5).getItemImage());
                        break;
                    case 6:
                        myIntent.putExtra("myTitle", tunes.get(6).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(6).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(6).getItemImage());
                        break;
                    case 7:
                        myIntent.putExtra("myTitle", tunes.get(7).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(7).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(7).getItemImage());
                        break;
                    case 8:
                        myIntent.putExtra("myTitle", tunes.get(8).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(8).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(8).getItemImage());
                        break;
                    case 9:
                        myIntent.putExtra("myTitle", tunes.get(9).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(9).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(9).getItemImage());
                        break;
                    case 10:
                        myIntent.putExtra("myTitle", tunes.get(10).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(10).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(10).getItemImage());
                        break;
                    case 11:
                        myIntent.putExtra("myTitle", tunes.get(11).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(11).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(11).getItemImage());
                        break;
                    case 12:
                        myIntent.putExtra("myTitle", tunes.get(12).getTuneTitle());
                        myIntent.putExtra("mySubTitle", tunes.get(12).getTuneSubTitle());
                        myIntent.putExtra("myImg", tunes.get(12).getItemImage());
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

        //TEST code that can be deleted.  Keep for now as it may be needed for songs...
               /*Object listItem = myListView.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(), "selected Item Name is "+
                    listItem.toString() + " postion " + i, Toast.LENGTH_LONG).show();*/

    }
}