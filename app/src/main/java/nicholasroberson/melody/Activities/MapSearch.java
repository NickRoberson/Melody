package nicholasroberson.melody.Activities;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;
import android.location.Address;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import nicholasroberson.melody.API.MusixMatchAPI;
import nicholasroberson.melody.Model.Get_Tracks.Tracks;
import nicholasroberson.melody.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapSearch extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    private final String baseURL = "http://api.musixmatch.com/ws/1.1/";
    private final String apiKey = "68112ce7d82e96acd38bd100c62c8b33";
    private final String COUNTRY_US = "us";
    private final String COUNTRY_ITALY = "it";
    private final String COUNTRY_GBR = "gbr";
    private final String DEFAULT_FORMAT = "json";

    private GoogleMap mMap;
    private GoogleMap.OnCameraMoveListener cameraMoveListener;
    private LocationManager locationManager;
    private Geocoder geocoder;
    private MusixMatchAPI musixMatchAPI;
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_search);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Log.d("MAP_SEARCH_STARTED","Started Map Search activity");
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Double checks to see whether or not we have persmission to access the location of the phone.
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED) {
            // scroll to the current location automatically
            mMap.setMyLocationEnabled(true);
        } else {
            Toast.makeText(this, "You do not have permission to use the map.", Toast.LENGTH_SHORT).show();
        }

        cameraMoveListener = new GoogleMap.OnCameraMoveListener() {
            @Override
            public void onCameraMove() {
                Log.d("CAM_MOVED", mMap.getCameraPosition().toString());

            }
        };

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, (android.location.LocationListener) this);

        geocoder = new Geocoder(this, Locale.getDefault());

        retrofit = new Retrofit.Builder().
                baseUrl(baseURL).
                addConverterFactory(GsonConverterFactory.create()).
                build();

        musixMatchAPI = retrofit.create(MusixMatchAPI.class);

        // Add a marker in Sydney and move the camera
    }


    @Override
    public void onLocationChanged(Location location) {
        List<Address> addresses;
        try {
            addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5

            String address = addresses.get(0).getAddressLine(0); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
            String city = addresses.get(0).getLocality();
            String state = addresses.get(0).getAdminArea();
            String country = addresses.get(0).getCountryName();
            Log.e("COUNTRY",country);
            String postalCode = addresses.get(0).getPostalCode();
            String knownName = addresses.get(0).getFeatureName(); // Only if available else return NULL

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void getTopTracks() {
        Call<Tracks> call = musixMatchAPI.gotTopTracksByCountry(apiKey, COUNTRY_GBR, 1, 10, DEFAULT_FORMAT);

        call.enqueue(new Callback<Tracks>() {
            @Override
            public void onResponse(Call<Tracks> call, Response<Tracks> response) {
                Log.e("TOP_TRACKS: onResponse", response.isSuccessful() + " ");
                Tracks tracks = response.body();
            }

            @Override
            public void onFailure(Call<Tracks> call, Throwable t) {
                Log.e("TOP_TRACKS: onFailure", t.toString());
            }
        });
    }
}
