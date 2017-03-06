package nicholasroberson.melody.Model.TracksGet;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


@Generated("org.jsonschema2pojo")
public class Body implements Serializable {

    @SerializedName("track_list")
    @Expose
    private List<TrackList> trackList;

    public List<TrackList> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<TrackList> trackList) {
        this.trackList = trackList;
    }

}