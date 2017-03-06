package nicholasroberson.melody.Model.Matcher_Track;

/**
 * Created by nicholasroberson on 3/6/17.
 */


import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import nicholasroberson.melody.Model.Get_Tracks.Track;

public class Body implements Serializable
{

    @SerializedName("track")
    @Expose
    private Track track;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}