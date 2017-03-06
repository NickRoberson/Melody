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
public class Body implements Serializable {

    @SerializedName("artist_list")
    @Expose
    private List<ArtistList> artistList;

    public List<ArtistList> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<ArtistList> artistList) {
        this.artistList = artistList;
    }

}