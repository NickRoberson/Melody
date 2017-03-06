package nicholasroberson.melody.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import nicholasroberson.melody.MusixMatchAPI.MusixMatchAPI;
import nicholasroberson.melody.Model.ArtistsGet.*;
import nicholasroberson.melody.Model.LyricsMatch.SongLyrics;
import nicholasroberson.melody.Model.TracksGet.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nicholasroberson on 2/22/17.
 */

public class TestAPIActivity extends AppCompatActivity {

    private final String baseURL = "http://api.musixmatch.com/ws/1.1/";
    private final String apiKey = "68112ce7d82e96acd38bd100c62c8b33";
    private final int LIMIT_PAGE_NUMBER = 5;
    private final int LIMIT_TRACKS_PER_PAGE = 10;
    private final String COUNTRY_US = "us";
    private final String COUNTRY_ITALY = "it";
    private final String COUNTRY_GBR = "gbr";
    private final String DEFAULT_FORMAT = "json";


    private Retrofit retrofit;
    private MusixMatchAPI musix;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("TEST_API_ACTIVITY", "activity started");

        retrofit = new Retrofit.Builder().
                baseUrl(baseURL).
                addConverterFactory(GsonConverterFactory.create()).
                build();

        musix = retrofit.create(MusixMatchAPI.class);

        // WORKS GETS TOP TRACKS BY COUNTRY
        getTopTracks();
        // WORKS GETS TOP ARTISTS BY COUNTRY
        getTopArtists();
        // WORKS GETS THE LYRICS FOR A SONG
        getSongLyrics();


    }


    public void getTopTracks() {
        Call<Tracks> call = musix.gotTopTracksByCountry(apiKey, COUNTRY_GBR, LIMIT_PAGE_NUMBER, LIMIT_TRACKS_PER_PAGE, DEFAULT_FORMAT);

        call.enqueue(new Callback<Tracks>() {
            @Override
            public void onResponse(Call<Tracks> call, Response<Tracks> response) {
                Log.e("EXAMPLE: onResponse", response.isSuccessful() + " ");

                Tracks tracks = response.body();
            }

            @Override
            public void onFailure(Call<Tracks> call, Throwable t) {
                Log.e("TRACKS: onFailure", t.toString());
            }
        });
    }

    public void getTopArtists() {
        Call<Artists> call = musix.getTopArtistsByCountry(apiKey, COUNTRY_US, LIMIT_PAGE_NUMBER, LIMIT_TRACKS_PER_PAGE, DEFAULT_FORMAT);

        call.enqueue(new Callback<Artists>() {
            @Override
            public void onResponse(Call<Artists> call, Response<Artists> response) {
                Log.e("EXAMPLE: onResponse", response.isSuccessful() + " ");
                Artists artistList = response.body();
            }

            @Override
            public void onFailure(Call<Artists> call, Throwable t) {
                Log.e("ARTISTS: onFailure", t.toString());
            }
        });
    }


    public void getSongLyrics() {
        String track = "paint it black";
        String artist = "rolling stones";
        // need both the artist and the track name
        Call<SongLyrics> call = musix.getTrackLyrics(apiKey, track, artist, DEFAULT_FORMAT);

        call.enqueue(new Callback<SongLyrics>() {
            @Override
            public void onResponse(Call<SongLyrics> call, Response<SongLyrics> response) {
                Log.e("EXAMPLE: onResponse", response.isSuccessful() + " ");
                SongLyrics songLyrics = response.body();
            }

            @Override
            public void onFailure(Call<SongLyrics> call, Throwable t) {
                Log.e("LYRICS: onFailure", t.toString());
            }
        });
    }
}
