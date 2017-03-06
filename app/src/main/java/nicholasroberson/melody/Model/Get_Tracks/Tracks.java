package nicholasroberson.melody.Model.Get_Tracks;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;


@Generated("org.jsonschema2pojo")
public class Tracks implements Serializable {

    @SerializedName("message")
    @Expose
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Tracks withMessage(Message message) {
        this.message = message;
        return this;
    }

}