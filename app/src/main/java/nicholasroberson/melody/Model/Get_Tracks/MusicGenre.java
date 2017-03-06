package nicholasroberson.melody.Model.Get_Tracks;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MusicGenre implements Serializable{

    @SerializedName("music_genre_id")
    @Expose
    private int musicGenreId;
    @SerializedName("music_genre_parent_id")
    @Expose
    private int musicGenreParentId;
    @SerializedName("music_genre_name")
    @Expose
    private String musicGenreName;
    @SerializedName("music_genre_name_extended")
    @Expose
    private String musicGenreNameExtended;
    @SerializedName("music_genre_vanity")
    @Expose
    private String musicGenreVanity;

    public int getMusicGenreId() {
        return musicGenreId;
    }

    public void setMusicGenreId(int musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    public MusicGenre withMusicGenreId(int musicGenreId) {
        this.musicGenreId = musicGenreId;
        return this;
    }

    public int getMusicGenreParentId() {
        return musicGenreParentId;
    }

    public void setMusicGenreParentId(int musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    public MusicGenre withMusicGenreParentId(int musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
        return this;
    }

    public String getMusicGenreName() {
        return musicGenreName;
    }

    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    public MusicGenre withMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
        return this;
    }

    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    public MusicGenre withMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
        return this;
    }

    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }

    public MusicGenre withMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
        return this;
    }

}