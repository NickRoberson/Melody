package nicholasroberson.melody.Model.Matcher_Lyrics;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body implements Serializable
{

    @SerializedName("lyrics")
    @Expose
    private Lyrics lyrics;
    private final static long serialVersionUID = -2839866749779727925L;

    public Lyrics getLyrics() {
        return lyrics;
    }

    public void setLyrics(Lyrics lyrics) {
        this.lyrics = lyrics;
    }

}