package nicholasroberson.melody.Model.MusixMatch;

/**
 * Created by nicholasroberson on 2/21/17.
 */

public class Header {

    private int statusCode;
    private float executeTime;
    private int available;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public float getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(float executeTime) {
        this.executeTime = executeTime;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

}