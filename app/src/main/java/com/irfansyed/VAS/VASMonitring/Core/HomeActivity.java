package com.irfansyed.VAS.VASMonitring.Core;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.A.A4251_A4284;
import com.irfansyed.VAS.VASMonitring.GS.Q1101_Q1610;
import com.irfansyed.VAS.VASMonitring.Pending.SurveyPendingActivity;
import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.Upload.SurveyCompletedActivity;

import utils.MyPreferences;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView Profile_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.irfansyed.VAS.VASMonitring.R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final MyPreferences preferences = new MyPreferences(this);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, com.irfansyed.VAS.VASMonitring.R.string.navigation_drawer_open, com.irfansyed.VAS.VASMonitring.R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        //DBHelper dbHelper = new DBHelper(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.irfansyed.VAS.VASMonitring.R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent = null;

        int put_extr = 0;
        final MyPreferences preferences = new MyPreferences(HomeActivity.this);

        if (id == com.irfansyed.VAS.VASMonitring.R.id.upload_date) {
            intent = new Intent(this, SurveyCompletedActivity.class);
        }

        if (id == R.id.pending_interviews) {
            intent = new Intent(this, SurveyPendingActivity.class);
        }

        if (id == com.irfansyed.VAS.VASMonitring.R.id.stage_1) {
            intent = new Intent(this, Q1101_Q1610.class);
            put_extr = 1;
        }

        /*if (id == R.id.stage_2) {
            intent = new Intent(this, N2001_N2011.class);
            put_extr = 1;
        }

        if (id == R.id.stage_3) {
            intent = new Intent(this, Genifno.class);
            put_extr = 1;

        }

        if (id == R.id.stage_4) {
            intent = new Intent(this, A4001_A4014.class);
            put_extr = 1;

        }*/
        if (id == com.irfansyed.VAS.VASMonitring.R.id.nav_lang_e) {
            preferences.setlanguage("en", "US");
            Toast.makeText(this, "Application Language Changed to English", Toast.LENGTH_LONG).show();

        }

        if (id == com.irfansyed.VAS.VASMonitring.R.id.nav_lang_u) {
            preferences.setlanguage("en", "GB");
            Toast.makeText(this, "Application Language Changed to Urdu", Toast.LENGTH_LONG).show();
        }


        intent.putExtra("put_extra", put_extr);
        if (intent != null)
            startActivity(intent);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}