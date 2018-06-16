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

public class IlanBluestone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_ilan_bluestone);

        // ------------------REPEATABLE CODE SECTION PER NUMBER OF OPTIONS
        /* The below section performs the following fuctions:
            1. Finds the applicable text view and sets the onclick listener
            2. overrides onClick for the view to EXPLICIT intent from Main Activity Class to applicable class
            3. Starts Intent
         */
        // Find the View that shows the applicable category
        ListView ilanBluestoneTextView = findViewById(R.id.list);

        // Set a click listener on that View
        ilanBluestoneTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Create a new intent to open the {@link applicable activity}
                Intent scarsIntent = new Intent(getApplicationContext(), AlbumScars.class);
                // Start the new activity
                startActivity(scarsIntent);
            }
        });
        // -----------------END REPEATABLE CODE SECTION PER NUMBER OF OPTIONS

        // tunes ArrayList initialize, using ArrayList for variable size array
        // "Tune.class" is basically a template class with get/set methods
        ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune("Ilan Bluestone","Scars", R.drawable.scars));


        //initialize itemsAdapter using tunes
        // TuneAdapter creates, sets the values into based on Tunes arraylist,
             // and returns a listItemView based on list_item.xml format
            // it does not get called until setAdapter below...
        TuneAdapter itemsAdapter = new TuneAdapter (this, tunes, R.color.ilan_bluestone);

        //Initialize myListView as the list View from the applicable xml file
        // R.id.list is just the xml id associated with the selection e.g. aboveandbeyond.xml
        ListView mylistView = findViewById(R.id.list);

        //set the adapter for myListView (which is "list" view in the applicable xml) to itemsView using tunes
            // Basically, it combines the top two lines, the
        mylistView.setAdapter(itemsAdapter);

                //-------------------------------------------------------

        //LOGCAT Loop for values recording
        for(int index = 0; index < tunes.size(); index++){
            Log.v("NumbersActivity","Value at index " + index + ": " + tunes.get(index));
        }







    }
}
