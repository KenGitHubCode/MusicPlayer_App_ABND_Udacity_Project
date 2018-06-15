package com.example.android.musicplayerstructurep4bykm;

/**
 * Created by redne on 6/7/2018.
 */

/**
 * {@link Song} Class to handle "Song" which can only be songs as it links to the xml to play a song.
 * Provides contructors and get / set methods
 * Song holds two variables that can be Album/Song or Artist/Album.  To be of use to both situations,
 *  the variable names Title and SubTitle were used.
 * A third variable is the image, this will only be used for the albums at this time
 */
public class Song {
    private String songTitle;
    private String songSubTitle;
    private int imageResourceID=-1;

    //constructor with two elemnets
    public Song(String songTitleInput, String songSubTitleInput){
        songTitle = songTitleInput;
        songSubTitle = songSubTitleInput;
    }

    //constructor with THREE elemnets
    public Song(String songTitleInput, String songSubTitleInput, int itemImageInput){
        songTitle = songTitleInput;
        songSubTitle = songSubTitleInput;
        imageResourceID = itemImageInput;
    }

    //Sets the title Song
    public void setsongTitle(String songTitleInput){
        songTitle = songTitleInput;
    }
    //Sets the sub title Song
    public void setSong(String songSubTitleInput){
        songSubTitle = songSubTitleInput;
    }
    //sets the image
    public void setItemImage(int itemImageInput) { imageResourceID = itemImageInput; }

    //Gets the title Song
    public String getSongTitle(){
        return songTitle;
    }
    //Gets the sub title Song
    public String getSongSubTitle(){
        return songSubTitle;
    }
    //get image
    public int getItemImage(){return imageResourceID; }
    //checks if there is an image passed in or not
    public boolean hasImage() {
        if (imageResourceID == -1)
            return false;
        else
            return true;
    }

}
