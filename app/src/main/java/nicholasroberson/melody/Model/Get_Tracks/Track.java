package nicholasroberson.melody.Model.Get_Tracks;

/**
 * Created by nicholasroberson on 3/6/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Track implements Serializable {

    @SerializedName("track_id")
    @Expose
    private Integer track_id;

    @SerializedName("track_mbid")
    @Expose
    private String track_mbid;

    @SerializedName("track_isrc")
    @Expose
    private String track_isrc;

    @SerializedName("track_spotify_id")
    @Expose
    private String track_spotify_id;

    @SerializedName("track_soundcloud_id")
    @Expose
    private String track_soundcloud_id;

    @SerializedName("track_xboxmusic_id")
    @Expose
    private String track_xboxmusic_id;

    @SerializedName("track_name")
    @Expose
    private String track_name;

    @SerializedName("track_name_translation_list")
    @Expose
    private List<Object> track_name_translation_list = null;

    @SerializedName("track_rating")
    @Expose
    private Integer track_rating;

    @SerializedName("track_length")
    @Expose
    private Integer track_length;

    @SerializedName("commontrack_id")
    @Expose
    private Integer commontrack_id;

    @SerializedName("instrumental")
    @Expose
    private Integer instrumental;

    @SerializedName("explicit")
    @Expose
    private Integer explicit;

    @SerializedName("has_lyrics")
    @Expose
    private Integer has_lyrics;

    @SerializedName("has_subtitles")
    @Expose
    private Integer has_subtitles;

    @SerializedName("num_favourite")
    @Expose
    private Integer num_favourite;

    @SerializedName("lyrics_id")
    @Expose
    private Integer lyrics_id;

    @SerializedName("subtitle_id")
    @Expose
    private Integer subtitle_id;

    @SerializedName("album_id")
    @Expose
    private Integer album_id;

    @SerializedName("album_name")
    @Expose
    private String album_name;

    @SerializedName("artist_id")
    @Expose
    private Integer artist_id;

    @SerializedName("artist_mbid")
    @Expose
    private String artist_mbid;

    @SerializedName("artist_name")
    @Expose
    private String artist_name;

    @SerializedName("album_coverart_100x100")
    @Expose
    private String album_coverart_100x100;

    @SerializedName("album_coverart_350x350")
    @Expose
    private String album_coverart_350x350;

    @SerializedName("album_coverart_500x500")
    @Expose
    private String album_coverart_500x500;

    @SerializedName("album_coverart_800x800")
    @Expose
    private String album_coverart_800x800;

    @SerializedName("track_share_url")
    @Expose
    private String track_share_url;

    @SerializedName("track_edit_url")
    @Expose
    private String track_edit_url;

    @SerializedName("commontrack_vanity_id")
    @Expose
    private String commontrack_vanity_id;

    @SerializedName("restricted")
    @Expose
    private Integer restricted;

    @SerializedName("first_release_date")
    @Expose
    private String first_release_date;

    @SerializedName("updated_time")
    @Expose
    private String updated_time;

    @SerializedName("secondary_genres")
    @Expose
    private SecondaryGenres secondary_genres;

    @SerializedName("primary_genres")
    @Expose
    private PrimaryGenres primary_genres;

    public void setPrimary_genres(PrimaryGenres primary_genres) {
        this.primary_genres = primary_genres;
    }

    public void setTrack_id(Integer track_id) {
        this.track_id = track_id;
    }

    public void setTrack_mbid(String track_mbid) {
        this.track_mbid = track_mbid;
    }

    public void setTrack_isrc(String track_isrc) {
        this.track_isrc = track_isrc;
    }

    public void setTrack_spotify_id(String track_spotify_id) {
        this.track_spotify_id = track_spotify_id;
    }

    public void setTrack_soundcloud_id(String track_soundcloud_id) {
        this.track_soundcloud_id = track_soundcloud_id;
    }

    public void setTrack_xboxmusic_id(String track_xboxmusic_id) {
        this.track_xboxmusic_id = track_xboxmusic_id;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public void setTrack_name_translation_list(List<Object> track_name_translation_list) {
        this.track_name_translation_list = track_name_translation_list;
    }

    public void setTrack_rating(Integer track_rating) {
        this.track_rating = track_rating;
    }

    public void setTrack_length(Integer track_length) {
        this.track_length = track_length;
    }

    public void setCommontrack_id(Integer commontrack_id) {
        this.commontrack_id = commontrack_id;
    }

    public void setInstrumental(Integer instrumental) {
        this.instrumental = instrumental;
    }

    public void setExplicit(Integer explicit) {
        this.explicit = explicit;
    }

    public void setHas_lyrics(Integer has_lyrics) {
        this.has_lyrics = has_lyrics;
    }

    public void setHas_subtitles(Integer has_subtitles) {
        this.has_subtitles = has_subtitles;
    }

    public void setNum_favourite(Integer num_favourite) {
        this.num_favourite = num_favourite;
    }

    public void setLyrics_id(Integer lyrics_id) {
        this.lyrics_id = lyrics_id;
    }

    public void setSubtitle_id(Integer subtitle_id) {
        this.subtitle_id = subtitle_id;
    }

    public void setAlbum_id(Integer album_id) {
        this.album_id = album_id;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public void setArtist_id(Integer artist_id) {
        this.artist_id = artist_id;
    }

    public void setArtist_mbid(String artist_mbid) {
        this.artist_mbid = artist_mbid;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public void setAlbum_coverart_100x100(String album_coverart_100x100) {
        this.album_coverart_100x100 = album_coverart_100x100;
    }

    public void setAlbum_coverart_350x350(String album_coverart_350x350) {
        this.album_coverart_350x350 = album_coverart_350x350;
    }

    public void setAlbum_coverart_500x500(String album_coverart_500x500) {
        this.album_coverart_500x500 = album_coverart_500x500;
    }

    public void setAlbum_coverart_800x800(String album_coverart_800x800) {
        this.album_coverart_800x800 = album_coverart_800x800;
    }

    public void setTrack_share_url(String track_share_url) {
        this.track_share_url = track_share_url;
    }

    public void setTrack_edit_url(String track_edit_url) {
        this.track_edit_url = track_edit_url;
    }

    public void setCommontrack_vanity_id(String commontrack_vanity_id) {
        this.commontrack_vanity_id = commontrack_vanity_id;
    }

    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    public void setFirst_release_date(String first_release_date) {
        this.first_release_date = first_release_date;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public void setSecondary_genres(SecondaryGenres secondary_genres) {
        this.secondary_genres = secondary_genres;
    }

    public SecondaryGenres getSecondary_genres() {
        return secondary_genres;
    }

    public Integer getTrack_id() {
        return track_id;
    }

    public String getTrack_mbid() {
        return track_mbid;
    }

    public String getTrack_isrc() {
        return track_isrc;
    }

    public String getTrack_spotify_id() {
        return track_spotify_id;
    }

    public String getTrack_soundcloud_id() {
        return track_soundcloud_id;
    }

    public String getTrack_xboxmusic_id() {
        return track_xboxmusic_id;
    }

    public String getTrack_name() {
        return track_name;
    }

    public List<Object> getTrack_name_translation_list() {
        return track_name_translation_list;
    }

    public Integer getTrack_rating() {
        return track_rating;
    }

    public Integer getTrack_length() {
        return track_length;
    }

    public Integer getCommontrack_id() {
        return commontrack_id;
    }

    public Integer getInstrumental() {
        return instrumental;
    }

    public Integer getExplicit() {
        return explicit;
    }

    public Integer getHas_lyrics() {
        return has_lyrics;
    }

    public Integer getHas_subtitles() {
        return has_subtitles;
    }

    public Integer getNum_favourite() {
        return num_favourite;
    }

    public Integer getLyrics_id() {
        return lyrics_id;
    }

    public Integer getSubtitle_id() {
        return subtitle_id;
    }

    public Integer getAlbum_id() {
        return album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public Integer getArtist_id() {
        return artist_id;
    }

    public String getArtist_mbid() {
        return artist_mbid;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public String getAlbum_coverart_100x100() {
        return album_coverart_100x100;
    }

    public String getAlbum_coverart_350x350() {
        return album_coverart_350x350;
    }

    public String getAlbum_coverart_500x500() {
        return album_coverart_500x500;
    }

    public String getAlbum_coverart_800x800() {
        return album_coverart_800x800;
    }

    public String getTrack_share_url() {
        return track_share_url;
    }

    public String getTrack_edit_url() {
        return track_edit_url;
    }

    public String getCommontrack_vanity_id() {
        return commontrack_vanity_id;
    }

    public Integer getRestricted() {
        return restricted;
    }

    public String getFirst_release_date() {
        return first_release_date;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public PrimaryGenres getPrimary_genres() {
        return primary_genres;
    }

}