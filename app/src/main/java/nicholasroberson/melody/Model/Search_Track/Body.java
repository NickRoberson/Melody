package nicholasroberson.melody.Model.Search_Track;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import nicholasroberson.melody.Model.Get_Tracks.TrackList;

public class Body implements Serializable
{

    @SerializedName("track_list")
    @Expose
    private List<TrackList> trackList = null;
    private final static long serialVersionUID = 6245653611178692056L;

    public List<TrackList> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<TrackList> trackList) {
        this.trackList = trackList;
    }

}