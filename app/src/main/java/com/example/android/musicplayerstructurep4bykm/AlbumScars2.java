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

public class AlbumScars2 extends AppCompatActivity {
    // Creates keys for ListView item data
    public static final String KEY_SONG = "KEY_SONG";
    public static final String KEY_ARTIST = "KEY_ARTIST";
    public static final String KEY_ALBUM = "KEY_ALBUM";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_item);
        //------------------------------end listener block-------------------------------------------------------------

        // tunes ArrayList initialize, using ArrayList for variable size array
        ArrayList<Song> tunes = new ArrayList<Song>();

        //Add values to the ArrayList Tune for each
        tunes.add(new Song("I Believe","Scars", R.drawable.scarssm));
        tunes.add(new Song("Let Me Know","Scars", R.drawable.scarssm));
        tunes.add(new Song("Northern Soul","Scars", R.drawable.scarssm));
        tunes.add(new Song("Naked","Scars", R.drawable.scarssm));
        tunes.add(new Song("Sahara Love","Scars", R.drawable.scarssm));
        tunes.add(new Song("Happiness Amplified","Scars", R.drawable.scarssm));
        tunes.add(new Song("Is It Love (1001)","Scars", R.drawable.scarssm));
        tunes.add(new Song("Cold Feet","Scars", R.drawable.scarssm));
        tunes.add(new Song("Scars","Scars", R.drawable.scarssm));

            final SongAdapter adapter = new SongAdapter(this, tunes, R.color.above_and_beyond);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter); //CRASHES AT THIS LINE

            // When listView item is clicked, item data is sent to new activity
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Song item = (Song) adapter.getItem(position);
                    Intent nowPlaying = new Intent(getApplicationContext(), PlaySong.class);
                    nowPlaying.putExtra(KEY_SONG, item.getSongTitle());
                    nowPlaying.putExtra(KEY_ALBUM, item.getSongSubTitle());
                    //nowPlaying.putExtra(KEY_ARTIST, item.get());
                    startActivity(nowPlaying);
                }
            });
        }
}