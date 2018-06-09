package com.example.android.musicplayerstructurep4bykm;

/**
 * Created by redne on 6/7/2018.
 */

/**
 * {@link Tune} Class to handle "Tune" which can be songs or albums.  Provides contructors and get / set methods
 * Tune holds two variables that can be Album/Song or Artist/Album.  To be of use to both situations,
 *  the variable names Title and SubTitle were used.
 * A third variable is the image, this will only be used for the albums at this time
 */
public class Tune {
    private String tuneTitle;
    private String tuneSubTitle;
    private int imageResourceID=-1;

    //constructor with two elemnets
    public Tune(String tuneTitleInput, String tuneSubTitleInput){
        tuneTitle = tuneTitleInput;
        tuneSubTitle = tuneSubTitleInput;
    }

    //constructor with THREE elemnets
    public Tune(String tuneTitleInput, String tuneSubTitleInput, int itemImageInput){
        tuneTitle = tuneTitleInput;
        tuneSubTitle = tuneSubTitleInput;
        imageResourceID = itemImageInput;
    }

    //Sets the title Tune
    public void settuneTitle(String tuneTitleInput){
        tuneTitle = tuneTitleInput;
    }
    //Sets the sub title Tune
    public void setTune(String tuneSubTitleInput){
        tuneSubTitle = tuneSubTitleInput;
    }
    //sets the image
    public void setItemImage(int itemImageInput) { imageResourceID = itemImageInput; }

    //Gets the title Tune
    public String getTuneTitle(){
        return tuneTitle;
    }
    //Gets the sub title Tune
    public String getTuneSubTitle(){
        return tuneSubTitle;
    }
    //get image
    public int getItemImage(){return imageResourceID; }

    public boolean hasImage() {
        if (imageResourceID == -1)
            return false;
        else
            return true;
    }

}
