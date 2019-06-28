package com.irfansyed.VAS.VASMonitring.Core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import com.irfansyed.VAS.VASMonitring.R;

import java.util.Locale;

import io.fabric.sdk.android.Fabric;
import utils.MyPreferences;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        //Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        change_langua();

        // Clear Old Data Irfan


        final MyPreferences preferences = new MyPreferences(this);
        //    if (preferences.getReq1() == null) {
        //  preferences.setReq1("http://43.245.131.159/umeed/Monitoring");


        //preferences.setReq1("http://10.199.26.250/sm/Welcome/collect_upload_data");
        //preferences.setReq1("http://10.199.2.137/sm/Welcome/collect_upload_data");


        //   preferences.setReqLogin("http://10.198.96.124:61259/Testing/check_user_id");

        //    preferences.setReq1("http://43.245.131.159/umeed/Testing/Monitoring");
        //preferences.setReqLogin("http://10.198.97.189:61259///Testing/check_user_id");

        //   }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */

// show login or main page
                Intent mainIntent;
                if (preferences.getUserId() == -1) {
                    //mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                } else {
                    //  mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
                }
                mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                //  mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);

                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, 1000);
    }


    void change_langua() {

        final MyPreferences preferences = new MyPreferences(this);

        String lang = preferences.getlanguage();

//create a string for country
        String country = preferences.getcountry();
//use constructor with country


        if (lang == null) {
            lang = "ur";
            country = "PK";

        }
        Locale locale = new Locale(lang, country);


        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        this.getResources().updateConfiguration(config,
                this.getResources().getDisplayMetrics());

    }


}
