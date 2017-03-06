package nicholasroberson.melody.Model.TracksGet;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TrackNameTranslation  implements Serializable{

    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("translation")
    @Expose
    private String translation;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

}
