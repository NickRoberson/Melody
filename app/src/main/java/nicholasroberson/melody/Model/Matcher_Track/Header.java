package nicholasroberson.melody.Model.Matcher_Track;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header implements Serializable {

    @SerializedName("status_code")
    @Expose
    private int statusCode;
    @SerializedName("execute_time")
    @Expose
    private double executeTime;
    @SerializedName("confidence")
    @Expose
    private int confidence;
    private final static long serialVersionUID = 1695058979617835588L;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public double getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(double executeTime) {
        this.executeTime = executeTime;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

}