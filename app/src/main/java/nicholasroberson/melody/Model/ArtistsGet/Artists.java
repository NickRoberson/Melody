package nicholasroberson.melody.Model.ArtistsGet;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Artists implements Serializable {

    @SerializedName("message")
    @Expose
    private Message message;
    private final static long serialVersionUID = -4833836991187901405L;

    public Message getMessage() {
        return message;
    }

}
