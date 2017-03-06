package nicholasroberson.melody.Model.TracksGet;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MusicGenreList implements Serializable {

    @SerializedName("music_genre_list")
    @Expose
    private List<MusicGenre> musicGenre;

    public List<MusicGenre> getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(List<MusicGenre> musicGenre) {
        this.musicGenre = musicGenre;
    }

    public MusicGenreList withMusicGenre(List<MusicGenre> musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }

}