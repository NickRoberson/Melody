package nicholasroberson.melody.Model.MusixMatch;

/**
 * Created by nicholasroberson on 2/21/17.
 */

public class MusicGenre {

    private int musicGenreId;
    private int musicGenreParentId;
    private String musicGenreName;
    private String musicGenreNameExtended;
    private String musicGenreVanity;

    public int getMusicGenreId() {
        return musicGenreId;
    }

    public void setMusicGenreId(int musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    public int getMusicGenreParentId() {
        return musicGenreParentId;
    }

    public void setMusicGenreParentId(int musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    public String getMusicGenreName() {
        return musicGenreName;
    }

    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }

}
