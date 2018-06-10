package com.example.android.musicplayerstructurep4bykm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class AlbumScars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_album_scars);

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
