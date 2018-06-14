package com.example.android.musicplayerstructurep4bykm;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by redne on 6/7/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    //set class-global variables
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();
    private int viewBGColor;

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param Songs   A List of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> Songs, int myBGColor) {
        // Initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Songs);
        viewBGColor = myBGColor;
    }

    /** Provides a view for an AdapterView (ListView, GridView, etc.)
     *     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }



        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        /*  Title Song ***********************************/
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.listItemTitle);
        // Get the version name from the current Song object and set this text on the name TextView
        titleTextView.setText(currentSong.getSongTitle());


        /* SUB Title Song ***********************************/
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView subtitleTextView = (TextView) listItemView.findViewById(R.id.listItemSubTitle);
        // Get the version number from the current Song object and set this text on the number TextView
        subtitleTextView.setText(currentSong.getSongSubTitle());


        /* IMAGE FOR ITEM ***********************************/
        // Find the imageview in list_item.xml
        ImageView myImageView = (ImageView) listItemView.findViewById(R.id.myImage);
        if (currentSong.hasImage()) {
            // Get the image resource and set it to the image view
            myImageView.setImageResource(currentSong.getItemImage());
        } else {
            //if there is no valid image ID
            myImageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView


        //background
        View textContainer = listItemView.findViewById(R.id.tunesplayerlayout);
        //find the value of the color through below single line
        int color = ContextCompat.getColor(getContext(), viewBGColor);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}