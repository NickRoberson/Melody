package nicholasroberson.melody.MusixMatchAPI;

import nicholasroberson.melody.Model.Get_Artists.*;
import nicholasroberson.melody.Model.Matcher_Lyrics.SongLyrics;
import nicholasroberson.melody.Model.Get_Tracks.Tracks;
import nicholasroberson.melody.Model.Matcher_Track.MatchedTrack;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by nicholasroberson on 2/21/17.
 */

public interface MusixMatchAPI {

    @Headers({"Content-Type: application/json"})
    @GET("chart.artists.get")
    Call<Artists> getTopArtistsByCountry(@Query("apikey") String apikey,
                                         @Query("country") String country,
                                         @Query("page") Integer page,
                                         @Query("page_size") Integer page_size,
                                         @Query("format") String format);


    @Headers({"Content-Type: application/json"})
    @GET("chart.tracks.get")
    Call<Tracks> gotTopTracksByCountry(@Query("apikey") String apikey,
                                       @Query("country") String country,
                                       @Query("page") Integer page,
                                       @Query("page_size") Integer page_size,
                                       @Query("format") String format);

    @Headers({"Content-Type: application/json"})
    @GET("matcher.lyrics.get")
    Call<SongLyrics> getTrackLyrics(@Query("apikey") String apikey,
                                    @Query("q_track") String q_track,
                                    @Query("q_artist") String q_artist,
                                    @Query("format") String format);

    @Headers({"Content-Type: application/json"})
    @GET("matcher.track.get")
    Call<MatchedTrack> getTrackInfo(@Query("apikey") String apikey,
                                    @Query("q_track") String q_track,
                                    @Query("q_artist") String q_artist,
                                    @Query("q_album") String q_album,
                                    @Query("format") String format,
                                    @Query("f_has_lyrics") Integer f_has_lyrics);

}
