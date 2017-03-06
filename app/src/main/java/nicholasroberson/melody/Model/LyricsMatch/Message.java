package nicholasroberson.melody.Model.LyricsMatch;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message implements Serializable {

    @SerializedName("header")
    @Expose
    private Header header;
    @SerializedName("body")
    @Expose
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}


