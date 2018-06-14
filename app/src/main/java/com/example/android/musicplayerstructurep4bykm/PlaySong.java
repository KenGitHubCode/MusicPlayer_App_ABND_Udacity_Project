package com.example.android.musicplayerstructurep4bykm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class PlaySong extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_play_song);

        Toast toast = Toast.makeText(this, "PlaySong class called here", Toast.LENGTH_LONG);
        toast.show();

        String newString;
        String newStringForSub;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
                newStringForSub= null;
            } else {
                newString= extras.getString("myTitle");
                newStringForSub= extras.getString("mySubTitle");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");
            newStringForSub= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }


        // tunes ArrayList initialize, using ArrayList for variable size array
        ArrayList<Tune> tunes = new ArrayList<Tune>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Tune(newString,newStringForSub, R.drawable.scars));

        //initialize itemsAdapter using tunes ArrayList
        TuneAdapter itemsAdapter = new TuneAdapter (this, tunes, R.color.above_and_beyond);

        //Initialize listView as the list View from the applicable xml file
        ListView mylistView = (ListView) findViewById(R.id.play_item_list);

        //set the adapter for listView (which is "list" view in the applicable xml) to itemsView using tunes
        mylistView.setAdapter(itemsAdapter);

        //LOGCAT Loop for values recording
        for(int index = 0; index < tunes.size(); index++){
            Log.v("PlaySong ","Value at index " + index + ": " + tunes.get(index));
        }

    }

}
