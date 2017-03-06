package nicholasroberson.melody.Model.Get_Artists;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Artist implements Serializable {

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public void setArtist_mbid(String artist_mbid) {
        this.artist_mbid = artist_mbid;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public void setArtist_alias_list(List<Object> artist_alias_list) {
        this.artist_alias_list = artist_alias_list;
    }

    public void setArtist_rating(int artist_rating) {
        this.artist_rating = artist_rating;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    @SerializedName("artist_id")
    @Expose
    private int artist_id;
    @SerializedName("artist_mbid")
    @Expose
    private String artist_mbid;
    @SerializedName("artist_name")
    @Expose
    private String artist_name;
    @SerializedName("artist_alias_list")
    @Expose
    private List<Object> artist_alias_list = null;
    @SerializedName("artist_rating")
    @Expose
    private int artist_rating;
    @SerializedName("updated_time")
    @Expose
    private String updated_time;

    public int getArtist_id() {
        return artist_id;
    }

    public String getArtist_mbid() {
        return artist_mbid;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public List<Object> getArtist_alias_list() {
        return artist_alias_list;
    }

    public int getArtist_rating() {
        return artist_rating;
    }

    public String getUpdated_time() {
        return updated_time;
    }
}
