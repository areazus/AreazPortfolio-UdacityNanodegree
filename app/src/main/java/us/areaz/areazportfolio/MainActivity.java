package us.areaz.areazportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        String appLaunchMessage = "This button will launch %s app";
        String appName;
        switch (view.getId()) {
            case R.id.spotifyStreamerButton:
                appName = "Spotify Streamer";
                break;
            case R.id.footballScoresButton:
                appName = "Football Score";
                break;
            case R.id.footballLibraryButton:
                appName = "Football Library";
                break;
            case R.id.buildItBiggerButton:
                appName = "Build It Bigger";
                break;
            case R.id.XYZReaderButton:
                appName = "XYZ Reader";
                break;
            case R.id.capstoneButton:
                appName = "Capstone Project";
                break;
            default:
                appName = "Who knows what";
                break;
        }


        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, String.format(appLaunchMessage, appName), duration);
        toast.show();
    }
}
