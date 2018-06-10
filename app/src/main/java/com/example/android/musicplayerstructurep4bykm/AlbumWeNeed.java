package com.example.android.musicplayerstructurep4bykm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class AlbumWeNeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_album_we_need);

        // tunes ArrayList initialize, using ArrayList for variable size array
        ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune("Quieter Is Louder","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("My Own Hymn","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Blue Sky Action","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Naked","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Sahara Love","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Happiness Amplified","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Is It Love (1001)","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Cold Feet","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Tightrope","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Alright Now","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Bittersweet & Blue","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("Always","We're all we need", R.drawable.needsm));
        tunes.add(new Tune("We're all we need","We're all we need", R.drawable.needsm));

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
