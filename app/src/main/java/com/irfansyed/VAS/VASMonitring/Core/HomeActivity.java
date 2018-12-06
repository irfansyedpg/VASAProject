package com.irfansyed.VAS.VASMonitring.Core;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.GS.Q1101_Q1610;
import com.irfansyed.VAS.VASMonitring.Pending.SurveyPendingActivity;
import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.Upload.SurveyCompletedActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import data.DBHelper;
import utils.BackgroundTask;
import utils.BackgroundTask2;
import utils.MyPreferences;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static String TAG = "HomeActivity";
    ProgressDialog bar;
    private double AppVersion = 1.1;

    TextView Profile_name;
    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*DBHelper db = new DBHelper(this);
        db.updateee();*/

        DBHelper db = new DBHelper(this);
        Cursor AllStudyIDs = db.getAllStudyIDs();
        AllStudyIDs.moveToFirst();

        for (int i = 0; i < AllStudyIDs.getCount(); i++) {

            String study_id = AllStudyIDs.getString(AllStudyIDs.getColumnIndex("study_id"));
            String method = "check_study_id";
            BackgroundTask backgroundTask = new BackgroundTask(this);
            backgroundTask.execute(method, study_id);
            AllStudyIDs.moveToNext();
        }

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


        /// setContentView(R.layout.activity_splash_screen);

        TextView heading = findViewById(R.id.heading);
        Button update_btn = findViewById(R.id.btn);

        heading.setText("Current Version: " + AppVersion);

        update_btn.setEnabled(false);

        String method2 = "check_app_update";
        BackgroundTask2 backgroundTask2 = new BackgroundTask2(this, update_btn, AppVersion);
        backgroundTask2.execute(method2);

        update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DownloadNewVersion().execute();

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        DBHelper db = new DBHelper(this);
        Cursor AllStudyIDs = db.getAllStudyIDs();
        AllStudyIDs.moveToFirst();

        for (int i = 0; i < AllStudyIDs.getCount(); i++) {

            String study_id = AllStudyIDs.getString(AllStudyIDs.getColumnIndex("study_id"));
            String method = "check_study_id";
            BackgroundTask backgroundTask = new BackgroundTask(this);
            backgroundTask.execute(method, study_id);
            AllStudyIDs.moveToNext();
        }


        Button update_btn = findViewById(R.id.btn);
        update_btn.setEnabled(false);

        String method2 = "check_app_update";
        BackgroundTask2 backgroundTask2 = new BackgroundTask2(this, update_btn, AppVersion);
        backgroundTask2.execute(method2);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
//            super.onBackPressed();
            if (exit) {
                finish(); // finish activity

                Intent ii = new Intent(this, LoginActivity.class);
                ii.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(ii);
                finish();

            } else {
                Toast.makeText(this, "Press Back again to Exit.",
                        Toast.LENGTH_SHORT).show();
                exit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        exit = false;
                    }
                }, 3 * 1000);

            }
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

            intent.putExtra("put_extra", put_extr);
            if (intent != null)
                startActivity(intent);
        }
        if (id == com.irfansyed.VAS.VASMonitring.R.id.stage_1) {


            //intent = new Intent(this, Q1101_Q1610.class);
            intent = new Intent(this, Q1101_Q1610.class);


            intent.putExtra("put_extra", put_extr);
            if (intent != null)
                startActivity(intent);
            // intent = new Intent(this, com.irfansyed.VAS.VASMonitring.RP.w204_w222.class);
            put_extr = 1;
        }/*

        if (id == R.id.stage_2) {
            intent = new Intent(this, N2001_N2011.class);
            put_extr = 1;
        }

        if (id == R.id.stage_3) {
            intent = new Intent(this, Genifno.class);
            put_extr = 1;

        }

        if (id == R.id.stage_4) {
            intent = new Intent(this, A4251_A4284.class);
            put_extr = 1;

        } else*/

        Random rand = new Random();
        int value = rand.nextInt(50);
        if (id == com.irfansyed.VAS.VASMonitring.R.id.nav_lang_e) {
            preferences.setlanguage("en", "US");

            Toast.makeText(this, "Application Language Changed to English", Toast.LENGTH_LONG).show();
            Intent mStartActivity = new Intent(this, SplashScreenActivity.class);
            int mPendingIntentId = value;
            PendingIntent mPendingIntent = PendingIntent.getActivity(this, mPendingIntentId, mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
            AlarmManager mgr = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
            mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
            System.exit(0);

        } else if (id == com.irfansyed.VAS.VASMonitring.R.id.nav_lang_u) {
            preferences.setlanguage("ur", "PK");

            Toast.makeText(this, "Application Language Changed to Urdu", Toast.LENGTH_LONG).show();

            Intent mStartActivity = new Intent(this, SplashScreenActivity.class);
            int mPendingIntentId = value;
            PendingIntent mPendingIntent = PendingIntent.getActivity(this, mPendingIntentId, mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
            AlarmManager mgr = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
            mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
            System.exit(0);
        }

        if (id == R.id.pending_interviews) {

            intent = new Intent(this, SurveyPendingActivity.class);
            startActivity(intent);
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void OpenNewVersion(String location) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(new File(location + "app-debug.apk")),
                "application/vnd.android.package-archive");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

    class DownloadNewVersion extends AsyncTask<String, Integer, Boolean> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            bar = new ProgressDialog(HomeActivity.this);
            bar.setCancelable(false);

            bar.setMessage("Downloading...");

            bar.setIndeterminate(true);
            bar.setCanceledOnTouchOutside(false);
            bar.show();

        }

        protected void onProgressUpdate(Integer... progress) {
            super.onProgressUpdate(progress);

            bar.setIndeterminate(false);
            bar.setMax(100);
            bar.setProgress(progress[0]);
            String msg = "";
            if (progress[0] > 99) {

                msg = "Finishing... ";

            } else {

                msg = "Downloading... " + progress[0] + "%";
            }
            bar.setMessage(msg);

        }

        @Override
        protected void onPostExecute(Boolean result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            bar.dismiss();

            if (result) {

                Toast.makeText(getApplicationContext(), "Update Done",
                        Toast.LENGTH_SHORT).show();

            } else {

                Toast.makeText(getApplicationContext(), "Error: Try Again (Check Internet Connection)",
                        Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        protected Boolean doInBackground(String... arg0) {

            Boolean flag = false;

            try {

                URL url = new URL("http://43.245.131.159:8080/uendashboard/vasaApp/app-debug.apk");

                HttpURLConnection c = (HttpURLConnection) url.openConnection();
                c.setRequestMethod("GET");
                c.setDoOutput(true);
                c.connect();

                String PATH = Environment.getExternalStorageDirectory() + "/Download/";
                File file = new File(PATH);
                file.mkdirs();

                File outputFile = new File(file, "app-debug.apk");

                if (outputFile.exists()) {
                    outputFile.delete();
                }

                InputStream is = c.getInputStream();

                int total_size = 14316922;//size of apk

                byte[] buffer = new byte[1024];
                int len1 = 0;
                int per = 0;
                int downloaded = 0;

                FileOutputStream fos = new FileOutputStream(outputFile);

                while ((len1 = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len1);
                    downloaded += len1;
                    per = downloaded * 100 / total_size;
                    publishProgress(per);
                }
                fos.close();
                is.close();

                OpenNewVersion(PATH);

                flag = true;
            } catch (Exception e) {
                Log.e(TAG, "Update Error: " + e.getMessage());
                flag = false;
            }
            return flag;


        }

    }
}