package com.example.android.musicplayerstructurep4bykm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class PlaySong2 extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting the content view to the matching XML file created
        setContentView(R.layout.activity_play_song);

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

        TextView myTitle = findViewById(R.id.playerlistItemTitle2);
        TextView mySubTitle = findViewById(R.id.listItemSubTitle2);

        myTitle.setText(newString);
        mySubTitle.setText(newStringForSub);

       /* View             listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.player_list_item, parent, false);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.listItemTitle);
        // Get the version name from the current Song object and set this text on the name TextView
        titleTextView.setText(currentSong.getSongTitle());


        /*SUB Title Song **********************************         */
        // Find the TextView in the list_item.xml layout with the ID version_number
 /*         TextView subtitleTextView = (TextView) listItemView.findViewById(R.id.listItemSubTitle);
        // Get the version number from the current Song object and set this text on the number TextView
        subtitleTextView.setText(currentSong.getSongSubTitle());
*/
    }

}
