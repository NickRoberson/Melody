package nicholasroberson.melody.Model.TracksGet;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import javax.annotation.Generated;


@Generated("org.jsonschema2pojo")
public class Header implements Serializable{

    @SerializedName("status_code")
    @Expose
    private int statusCode;
    @SerializedName("execute_time")
    @Expose
    private double executeTime;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Header withStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public double getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(double executeTime) {
        this.executeTime = executeTime;
    }

    public Header withExecuteTime(double executeTime) {
        this.executeTime = executeTime;
        return this;
    }

}