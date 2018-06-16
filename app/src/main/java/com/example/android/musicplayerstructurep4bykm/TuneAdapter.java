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

public class TuneAdapter extends ArrayAdapter<Tune> {

    //set class-global variables
    private static final String LOG_TAG = TuneAdapter.class.getSimpleName();
    private int viewBGColor;

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param Tunes   A List of Tune objects to display in a list
     */
    public TuneAdapter(Activity context, ArrayList<Tune> Tunes, int myBGColor) {
        // Initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Tunes);
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

        // Get the {@link Tune} object located at this position in the list
        Tune currentTune = getItem(position);

        /*  Title Tune ***********************************/
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = listItemView.findViewById(R.id.listItemTitle);
        // Get the version name from the current Tune object and set this text on the name TextView
        titleTextView.setText(currentTune.getTuneTitle());


        /* SUB Title Tune ***********************************/
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView subtitleTextView = listItemView.findViewById(R.id.listItemSubTitle);
        // Get the version number from the current Tune object and set this text on the number TextView
        subtitleTextView.setText(currentTune.getTuneSubTitle());


        /* IMAGE FOR ITEM ***********************************/
        // Find the imageview in list_item.xml
        ImageView myImageView = listItemView.findViewById(R.id.myImage);
        if (currentTune.hasImage()) {
            // Get the image resource and set it to the image view
            myImageView.setImageResource(currentTune.getItemImage());
        } else {
            //if there is no valid image ID
            myImageView.setVisibility(View.GONE);
        }

        /* BACKGROUND FOR ITEM ***********************************/
        View textContainer = listItemView.findViewById(R.id.tunesLayout);
        //find the value of the color through below single line
        int color = ContextCompat.getColor(getContext(), viewBGColor);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}