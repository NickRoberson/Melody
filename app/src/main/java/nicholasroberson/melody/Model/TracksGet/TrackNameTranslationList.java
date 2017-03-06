package nicholasroberson.melody.Model.TracksGet;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TrackNameTranslationList implements Serializable {

    @SerializedName("track_name_translation")
    @Expose
    private TrackNameTranslation trackNameTranslation;

    public TrackNameTranslation getTrackNameTranslation() {
        return trackNameTranslation;
    }

    public void setTrackNameTranslation(TrackNameTranslation trackNameTranslation) {
        this.trackNameTranslation = trackNameTranslation;
    }

}