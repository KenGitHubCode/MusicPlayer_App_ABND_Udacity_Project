package com.example.android.musicplayerstructurep4bykm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class AboveBeyond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_above_beyond);


        /* The below section sets onsetOnItemClickListener, steps:
            1. Finds the applicable text view and sets the onclick listener
            2. overrides onClick for the view to EXPLICIT intentto applicable class
            3. Starts Intent
         */
        // Find the View that shows the applicable category
       final ListView myListView = (ListView) findViewById(R.id.list);

        // Set a click listener on that View
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //TEST code that can be deleted.  Keep for now as it may be needed for songs...
                /* Object listItem = myListView.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(), "selected Item Name is "+listItem.toString() + " postion " + i, Toast.LENGTH_LONG).show();
                */

                //Creating a Class variable to hold the destination activity depending on Switch below
                Class myActivityToIntent;

                //Switch based on position in ListView, hardcoded based on ArrayList addition order
                    //e.g. first added to Tunes instance was "Common Ground" so position 0 leads to AlbumCommonGround.class
                switch (i) {
                    case 0:
                         myActivityToIntent = AlbumCommonGround.class;
                         break;
                    case 1:
                         myActivityToIntent = AlbumWeNeed.class;
                         break;
                    case 2:
                        myActivityToIntent = AlbumRibbons.class;
                        break;
                    default:
                        myActivityToIntent = AlbumWeNeed.class;
                }
                // Create a new intent to open the {@link applicable activity}
                Intent myIntent = new Intent(getApplicationContext(), myActivityToIntent);
                // Start the new activity
                startActivity(myIntent);
            }
        });


        // tunes ArrayList initialize, using ArrayList for variable size array
        // "Tune.class" is basically a template class with get/set methods
        ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune("Above and Beyond","Common Ground", R.drawable.common));
        tunes.add(new Tune("Above and Beyond","We're all we need", R.drawable.need));
        tunes.add(new Tune("Above and Beyond","Ribbons", R.drawable.ribbon));


        //initialize itemsAdapter using tunes
        // TuneAdapter creates, sets the values into based on Tunes arraylist,
             // and returns a listItemView based on list_item.xml format
            // it does not get called until setAdapter below...
        TuneAdapter itemsAdapter = new TuneAdapter (this, tunes, R.color.above_and_beyond);

        //Initialize myListView as the list View from the applicable xml file
        // R.id.list is just the xml id associated with the selection e.g. aboveandbeyond.xml
        ListView mylistView = (ListView) findViewById(R.id.list);

        //set the adapter for myListView (which is "list" view in the applicable xml) to itemsView using tunes
            // Basically, it combines the top two lines, the
        mylistView.setAdapter(itemsAdapter);

                //-------------------------------------------------------

        //LOGCAT Loop for values recording
        for(int index = 0; index < tunes.size(); index++){
            Log.v("Activity","Value at index " + index + ": " + tunes.get(index));
        }

    }
}
