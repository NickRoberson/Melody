package nicholasroberson.melody.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import nicholasroberson.melody.Activities.MainActivity;

/**
 * Created by nicholasroberson on 2/20/17.
 */

public class SplashActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        Log.e("ACTIVITY_STARTED", "Started SplashActivity");
        Intent result = new Intent(this,MainActivity.class);
        startActivity(result);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
