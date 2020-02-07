package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;


public class C3051_C3099 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_C3051,
            ll_C3052,
            ll_C3053,
            ll_C3053a,
            ll_C3054,
            ll_C3055,
            ll_C3056,
            ll_C3057,
            ll_C3058,
            ll_C3059,
            ll_C3060,
            ll_C3061,
            ll_C3062,
            ll_C3063,
            ll_C3064,
            ll_C3065,
            ll_C3066,
            ll_C3067,
            ll_C3068,
            ll_C3068_OT,
            ll_C3069,
            ll_C3070,
            ll_C3071,
            ll_C3072,
            ll_C3073_1,
            ll_C3073_2,
            ll_C3073_3,
            ll_C3074,
            ll_C3075,
            ll_C3076,
            ll_C3077,
            ll_C3078,
            ll_C3079,
            ll_C3079_OT,
            ll_C3080,
            ll_C3081,
            ll_C3082,
            ll_C3083,
            ll_C3084,
            ll_C3085,
            ll_C3086,
            ll_C3087,
            ll_C3088,
            ll_C3089,
            ll_C3090,
            ll_C3091,
            ll_C3092,
            ll_C3093,
            ll_C3094,
            ll_C3095,
            ll_C3096,
            ll_C3097,
            ll_C3098,
            ll_C3099;


    RadioButton
            rb_C3051_1,
            rb_C3051_2,
            rb_C3051_DK,
            rb_C3051_RA,
            rb_C3053_1,
            rb_C3053_2,
            rb_C3053_DK,
            rb_C3053_RA,
            rb_C3053a_1,
            rb_C3053a_2,
            rb_C3053a_DK,
            rb_C3053a_RA,
            rb_C3054_1,
            rb_C3054_2,
            rb_C3054_DK,
            rb_C3054_RA,
            rb_C3055_1,
            rb_C3055_2,
            rb_C3055_DK,
            rb_C3055_RA,
            rb_C3056_1,
            rb_C3056_2,
            rb_C3056_DK,
            rb_C3056_RA,
            rb_C3057_1,
            rb_C3057_2,
            rb_C3057_DK,
            rb_C3057_RA,
            rb_C3058_1,
            rb_C3058_2,
            rb_C3058_DK,
            rb_C3059_1,
            rb_C3059_2,
            rb_C3059_DK,
            rb_C3059_RA,
            rb_C3060_1,
            rb_C3060_2,
            rb_C3060_DK,
            rb_C3061_1,
            rb_C3061_2,
            rb_C3061_DK,
            rb_C3063_1,
            rb_C3063_2,
            rb_C3063_DK,
            rb_C3064_1,
            rb_C3064_2,
            rb_C3064_DK,
            rb_C3066_1,
            rb_C3066_2,
            rb_C3066_DK,
            rb_C3068_1,
            rb_C3068_2,
            rb_C3068_3,
            rb_C3068_4,
            rb_C3068_5,
            rb_C3068_6,
            rb_C3068_7,
            rb_C3068_8,
            rb_C3068_9,
            rb_C3068_10,
            rb_C3068_DK,
            rb_C3069_1,
            rb_C3069_2,
            rb_C3069_DK,
            rb_C3070_1,
            rb_C3070_2,
            rb_C3070_DK,
            rb_C3071_1,
            rb_C3071_2,
            rb_C3071_DK,
            rb_C3071_RA,
            rb_C3072_1,
            rb_C3072_2,
            rb_C3072_DK,
            rb_C3072_RA,
            rb_C3073_1_1,
            rb_C3073_1_2,
            rb_C3073_1_DK,
            rb_C3073_1_RA,
            rb_C3073_2_1,
            rb_C3073_2_2,
            rb_C3073_2_DK,
            rb_C3073_2_RA,
            rb_C3073_3_1,
            rb_C3073_3_2,
            rb_C3073_3_DK,
            rb_C3073_3_RA,
            rb_C3074_1,
            rb_C3074_2,
            rb_C3074_DK,
            rb_C3074_RA,
            rb_C3075_1,
            rb_C3075_2,
            rb_C3075_DK,
            rb_C3075_RA,
            rb_C3076_1,
            rb_C3076_2,
            rb_C3076_3,
            rb_C3076_4,
            rb_C3076_DK,
            rb_C3076_RA,
            rb_C3077_1,
            rb_C3077_2,
            rb_C3077_DK,
            rb_C3078_1,
            rb_C3078_2,
            rb_C3078_DK,
            rb_C3079_1,
            rb_C3079_2,
            rb_C3079_3,
            rb_C3079_DK,
            rb_C3080_1,
            rb_C3080_2,
            rb_C3080_DK,
            rb_C3083_1,
            rb_C3083_2,
            rb_C3083_3,
            rb_C3083_4,
            rb_C3083_DK,
            rb_C3084_1,
            rb_C3084_2,
            rb_C3084_DK,
            rb_C3084_RA,
            rb_C3085_1,
            rb_C3085_2,
            rb_C3085_DK,
            rb_C3085_RA,
            rb_C3086_1,
            rb_C3086_2,
            rb_C3086_DK,
            rb_C3086_RA,
            rb_C3088_1,
            rb_C3088_2,
            rb_C3088_DK,
            rb_C3088_RA,
            rb_C3089_1,
            rb_C3089_2,
            rb_C3089_DK,
            rb_C3089_RA,
            rb_C3091_1,
            rb_C3091_2,
            rb_C3091_DK,
            rb_C3091_RA,
            rb_C3092_1,
            rb_C3092_2,
            rb_C3092_DK,
            rb_C3092_RA,
            rb_C3093_1,
            rb_C3093_2,
            rb_C3093_DK,
            rb_C3093_RA,
            rb_C3094_1,
            rb_C3094_2,
            rb_C3094_DK,
            rb_C3094_RA,
            rb_C3095_1,
            rb_C3095_2,
            rb_C3095_DK,
            rb_C3095_RA,
            rb_C3096_1,
            rb_C3096_2,
            rb_C3096_DK,
            rb_C3096_RA,
            rb_C3097_1,
            rb_C3097_2,
            rb_C3097_DK,
            rb_C3097_RA,
            rb_C3098_1,
            rb_C3098_2,
            rb_C3098_DK,
            rb_C3098_RA,
            rb_C3099_1,
            rb_C3099_2,
            rb_C3099_DK,
            rb_C3099_RA;


    CheckBox
            cb_C3065_1,
            cb_C3065_2,
            cb_C3065_3,
            cb_C3065_4,
            cb_C3065_5,
            cb_C3065_6,
            cb_C3065_7,
            cb_C3065_DK,
            cb_C3067_1,
            cb_C3067_2,
            cb_C3067_3,
            cb_C3067_4,
            cb_C3067_5,
            cb_C3067_6,
            cb_C3067_7,
            cb_C3067_DK;

    EditText
            ed_study_id,
            ed_C3052,
            ed_C3062,
            ed_C3065_OT,
            ed_C3067_OT,
            ed_C3068_OT,
            ed_C3079,
            ed_C3081,
            ed_C3082,
            ed_C3087,
            ed_C3090_1,
            ed_C3090_2;

    String
            C3051,
            C3052,
            C3053,
            C3053a,
            C3054,
            C3055,
            C3056,
            C3057,
            C3058,
            C3059,
            C3060,
            C3061,
            C3062,
            C3063,
            C3064,
            C3065_1,
            C3065_2,
            C3065_3,
            C3065_4,
            C3065_5,
            C3065_6,
            C3065_7,
            C3065_OT,
            C3065_DK,
            C3066,
            C3067_1,
            C3067_2,
            C3067_3,
            C3067_4,
            C3067_5,
            C3067_6,
            C3067_7,
            C3067_OT,
            C3067_DK,
            C3068,
            C3068_OT,
            C3069,
            C3070,
            C3071,
            C3072,
            C3073_1,
            C3073_2,
            C3073_3,
            C3074,
            C3075,
            C3076,
            C3077,
            C3078,
            C3079,
            C3079_OT,
            C3080,
            C3081,
            C3082,
            C3083,
            C3084,
            C3085,
            C3086,
            C3087,
            C3088,
            C3089,
            C3090_1,
            C3090_2,
            C3091,
            C3092,
            C3093,
            C3094,
            C3095,
            C3096,
            C3097,
            C3098,
            C3099,
            STATUS,
            study_id;

    int ageInDays;
    int C3006,
            currentSection;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3051_c3099);

        this.setTitle(getString(R.string.h_c_sec_6));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);


        /*Cursor Q1101_Q1610 = db.getData("Q1101_Q1610", study_id);

        if (Q1101_Q1610.getCount() > 0) {

            Q1101_Q1610.moveToFirst();

            String dob = Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1603"));
            String dod = Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1606"));

            ageInDays = numOfDays(dob, dod);
        }*/

        Initialization();

        ed_C3065_OT.setVisibility(View.GONE);
        ed_C3067_OT.setVisibility(View.GONE);

        ll_C3068_OT.setVisibility(View.GONE);
        ll_C3079_OT.setVisibility(View.GONE);

        DBHelper db = new DBHelper(this);
        Cursor C3001_C3011 = db.getData("C3001_C3011", study_id);

        if (C3001_C3011.getCount() > 0) {

            C3001_C3011.moveToFirst();

            C3006 = Integer.valueOf(C3001_C3011.getString(C3001_C3011.getColumnIndex("C3006")));
        }

        events_call();

        btn_next.setOnClickListener(this);
    }

    public int numOfDays(String dob, String dod) {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd/mm/yyyy");

        int numOfDays = 0;

        try {

            Date date1 = myFormat.parse(dob);
            Date date2 = myFormat.parse(dod);
            long diff = date2.getTime() - date1.getTime();

            numOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return numOfDays;
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(this, C3101_C3112.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts
        ll_C3051 = findViewById(R.id.ll_C3051);
        ll_C3052 = findViewById(R.id.ll_C3052);
        ll_C3053 = findViewById(R.id.ll_C3053);
        ll_C3053a = findViewById(R.id.ll_C3053a);
        ll_C3054 = findViewById(R.id.ll_C3054);
        ll_C3055 = findViewById(R.id.ll_C3055);
        ll_C3056 = findViewById(R.id.ll_C3056);
        ll_C3057 = findViewById(R.id.ll_C3057);
        ll_C3058 = findViewById(R.id.ll_C3058);
        ll_C3059 = findViewById(R.id.ll_C3059);
        ll_C3060 = findViewById(R.id.ll_C3060);
        ll_C3061 = findViewById(R.id.ll_C3061);
        ll_C3062 = findViewById(R.id.ll_C3062);
        ll_C3063 = findViewById(R.id.ll_C3063);
        ll_C3064 = findViewById(R.id.ll_C3064);
        ll_C3065 = findViewById(R.id.ll_C3065);
        ll_C3066 = findViewById(R.id.ll_C3066);
        ll_C3067 = findViewById(R.id.ll_C3067);
        ll_C3068 = findViewById(R.id.ll_C3068);
        ll_C3068_OT = findViewById(R.id.ll_C3068_OT);
        ll_C3069 = findViewById(R.id.ll_C3069);
        ll_C3070 = findViewById(R.id.ll_C3070);
        ll_C3071 = findViewById(R.id.ll_C3071);
        ll_C3072 = findViewById(R.id.ll_C3072);
        ll_C3073_1 = findViewById(R.id.ll_C3073_1);
        ll_C3073_2 = findViewById(R.id.ll_C3073_2);
        ll_C3073_3 = findViewById(R.id.ll_C3073_3);
        ll_C3074 = findViewById(R.id.ll_C3074);
        ll_C3075 = findViewById(R.id.ll_C3075);
        ll_C3076 = findViewById(R.id.ll_C3076);
        ll_C3077 = findViewById(R.id.ll_C3077);
        ll_C3078 = findViewById(R.id.ll_C3078);
        ll_C3079 = findViewById(R.id.ll_C3079);
        ll_C3079_OT = findViewById(R.id.ll_C3079_OT);
        ll_C3080 = findViewById(R.id.ll_C3080);
        ll_C3081 = findViewById(R.id.ll_C3081);
        ll_C3082 = findViewById(R.id.ll_C3082);
        ll_C3083 = findViewById(R.id.ll_C3083);
        ll_C3084 = findViewById(R.id.ll_C3084);
        ll_C3085 = findViewById(R.id.ll_C3085);
        ll_C3086 = findViewById(R.id.ll_C3086);
        ll_C3087 = findViewById(R.id.ll_C3087);
        ll_C3088 = findViewById(R.id.ll_C3088);
        ll_C3089 = findViewById(R.id.ll_C3089);
        ll_C3090 = findViewById(R.id.ll_C3090);
        ll_C3091 = findViewById(R.id.ll_C3091);
        ll_C3092 = findViewById(R.id.ll_C3092);
        ll_C3093 = findViewById(R.id.ll_C3093);
        ll_C3094 = findViewById(R.id.ll_C3094);
        ll_C3095 = findViewById(R.id.ll_C3095);
        ll_C3096 = findViewById(R.id.ll_C3096);
        ll_C3097 = findViewById(R.id.ll_C3097);
        ll_C3098 = findViewById(R.id.ll_C3098);
        ll_C3099 = findViewById(R.id.ll_C3099);

        // Radio Buttons

        rb_C3051_1 = findViewById(R.id.rb_C3051_1);
        rb_C3051_2 = findViewById(R.id.rb_C3051_2);
        rb_C3051_DK = findViewById(R.id.rb_C3051_DK);
        rb_C3051_RA = findViewById(R.id.rb_C3051_RA);

        rb_C3053_1 = findViewById(R.id.rb_C3053_1);
        rb_C3053_2 = findViewById(R.id.rb_C3053_2);
        rb_C3053_DK = findViewById(R.id.rb_C3053_DK);
        rb_C3053_RA = findViewById(R.id.rb_C3053_RA);

        rb_C3053a_1 = findViewById(R.id.rb_C3053a_1);
        rb_C3053a_2 = findViewById(R.id.rb_C3053a_2);
        rb_C3053a_DK = findViewById(R.id.rb_C3053a_DK);
        rb_C3053a_RA = findViewById(R.id.rb_C3053a_RA);

        rb_C3054_1 = findViewById(R.id.rb_C3054_1);
        rb_C3054_2 = findViewById(R.id.rb_C3054_2);
        rb_C3054_DK = findViewById(R.id.rb_C3054_DK);
        rb_C3054_RA = findViewById(R.id.rb_C3054_RA);

        rb_C3055_1 = findViewById(R.id.rb_C3055_1);
        rb_C3055_2 = findViewById(R.id.rb_C3055_2);
        rb_C3055_DK = findViewById(R.id.rb_C3055_DK);
        rb_C3055_RA = findViewById(R.id.rb_C3055_RA);

        rb_C3056_1 = findViewById(R.id.rb_C3056_1);
        rb_C3056_2 = findViewById(R.id.rb_C3056_2);
        rb_C3056_DK = findViewById(R.id.rb_C3056_DK);
        rb_C3056_RA = findViewById(R.id.rb_C3056_RA);

        rb_C3057_1 = findViewById(R.id.rb_C3057_1);
        rb_C3057_2 = findViewById(R.id.rb_C3057_2);
        rb_C3057_DK = findViewById(R.id.rb_C3057_DK);
        rb_C3057_RA = findViewById(R.id.rb_C3057_RA);

        rb_C3058_1 = findViewById(R.id.rb_C3058_1);
        rb_C3058_2 = findViewById(R.id.rb_C3058_2);
        rb_C3058_DK = findViewById(R.id.rb_C3058_DK);

        rb_C3059_1 = findViewById(R.id.rb_C3059_1);
        rb_C3059_2 = findViewById(R.id.rb_C3059_2);
        rb_C3059_DK = findViewById(R.id.rb_C3059_DK);
        rb_C3059_RA = findViewById(R.id.rb_C3059_RA);

        rb_C3060_1 = findViewById(R.id.rb_C3060_1);
        rb_C3060_2 = findViewById(R.id.rb_C3060_2);
        rb_C3060_DK = findViewById(R.id.rb_C3060_DK);

        rb_C3061_1 = findViewById(R.id.rb_C3061_1);
        rb_C3061_2 = findViewById(R.id.rb_C3061_2);
        rb_C3061_DK = findViewById(R.id.rb_C3061_DK);

        rb_C3063_1 = findViewById(R.id.rb_C3063_1);
        rb_C3063_2 = findViewById(R.id.rb_C3063_2);
        rb_C3063_DK = findViewById(R.id.rb_C3063_DK);

        rb_C3064_1 = findViewById(R.id.rb_C3064_1);
        rb_C3064_2 = findViewById(R.id.rb_C3064_2);
        rb_C3064_DK = findViewById(R.id.rb_C3064_DK);

        cb_C3065_1 = findViewById(R.id.cb_C3065_1);
        cb_C3065_2 = findViewById(R.id.cb_C3065_2);
        cb_C3065_3 = findViewById(R.id.cb_C3065_3);
        cb_C3065_4 = findViewById(R.id.cb_C3065_4);
        cb_C3065_5 = findViewById(R.id.cb_C3065_5);
        cb_C3065_6 = findViewById(R.id.cb_C3065_6);
        cb_C3065_7 = findViewById(R.id.cb_C3065_7);
        cb_C3065_DK = findViewById(R.id.cb_C3065_DK);

        rb_C3066_1 = findViewById(R.id.rb_C3066_1);
        rb_C3066_2 = findViewById(R.id.rb_C3066_2);
        rb_C3066_DK = findViewById(R.id.rb_C3066_DK);

        cb_C3067_1 = findViewById(R.id.cb_C3067_1);
        cb_C3067_2 = findViewById(R.id.cb_C3067_2);
        cb_C3067_3 = findViewById(R.id.cb_C3067_3);
        cb_C3067_4 = findViewById(R.id.cb_C3067_4);
        cb_C3067_5 = findViewById(R.id.cb_C3067_5);
        cb_C3067_6 = findViewById(R.id.cb_C3067_6);
        cb_C3067_7 = findViewById(R.id.cb_C3067_7);
        cb_C3067_DK = findViewById(R.id.cb_C3067_DK);

        rb_C3068_1 = findViewById(R.id.rb_C3068_1);
        rb_C3068_2 = findViewById(R.id.rb_C3068_2);
        rb_C3068_3 = findViewById(R.id.rb_C3068_3);
        rb_C3068_4 = findViewById(R.id.rb_C3068_4);
        rb_C3068_5 = findViewById(R.id.rb_C3068_5);
        rb_C3068_6 = findViewById(R.id.rb_C3068_6);
        rb_C3068_7 = findViewById(R.id.rb_C3068_7);
        rb_C3068_8 = findViewById(R.id.rb_C3068_8);
        rb_C3068_9 = findViewById(R.id.rb_C3068_9);
        rb_C3068_10 = findViewById(R.id.rb_C3068_10);
        rb_C3068_DK = findViewById(R.id.rb_C3068_DK);

        rb_C3069_1 = findViewById(R.id.rb_C3069_1);
        rb_C3069_2 = findViewById(R.id.rb_C3069_2);
        rb_C3069_DK = findViewById(R.id.rb_C3069_DK);

        rb_C3070_1 = findViewById(R.id.rb_C3070_1);
        rb_C3070_2 = findViewById(R.id.rb_C3070_2);
        rb_C3070_DK = findViewById(R.id.rb_C3070_DK);

        rb_C3071_1 = findViewById(R.id.rb_C3071_1);
        rb_C3071_2 = findViewById(R.id.rb_C3071_2);
        rb_C3071_DK = findViewById(R.id.rb_C3071_DK);
        rb_C3071_RA = findViewById(R.id.rb_C3071_RA);

        rb_C3072_1 = findViewById(R.id.rb_C3072_1);
        rb_C3072_2 = findViewById(R.id.rb_C3072_2);
        rb_C3072_DK = findViewById(R.id.rb_C3072_DK);
        rb_C3072_RA = findViewById(R.id.rb_C3072_RA);

        rb_C3073_1_1 = findViewById(R.id.rb_C3073_1_1);
        rb_C3073_1_2 = findViewById(R.id.rb_C3073_1_2);
        rb_C3073_1_DK = findViewById(R.id.rb_C3073_1_DK);
        rb_C3073_1_RA = findViewById(R.id.rb_C3073_1_RA);

        rb_C3073_2_1 = findViewById(R.id.rb_C3073_2_1);
        rb_C3073_2_2 = findViewById(R.id.rb_C3073_2_2);
        rb_C3073_2_DK = findViewById(R.id.rb_C3073_2_DK);
        rb_C3073_2_RA = findViewById(R.id.rb_C3073_2_RA);

        rb_C3073_3_1 = findViewById(R.id.rb_C3073_3_1);
        rb_C3073_3_2 = findViewById(R.id.rb_C3073_3_2);
        rb_C3073_3_DK = findViewById(R.id.rb_C3073_3_DK);
        rb_C3073_3_RA = findViewById(R.id.rb_C3073_3_RA);

        rb_C3074_1 = findViewById(R.id.rb_C3074_1);
        rb_C3074_2 = findViewById(R.id.rb_C3074_2);
        rb_C3074_DK = findViewById(R.id.rb_C3074_DK);
        rb_C3074_RA = findViewById(R.id.rb_C3074_RA);

        rb_C3075_1 = findViewById(R.id.rb_C3075_1);
        rb_C3075_2 = findViewById(R.id.rb_C3075_2);
        rb_C3075_DK = findViewById(R.id.rb_C3075_DK);
        rb_C3075_RA = findViewById(R.id.rb_C3075_RA);

        rb_C3076_1 = findViewById(R.id.rb_C3076_1);
        rb_C3076_2 = findViewById(R.id.rb_C3076_2);
        rb_C3076_3 = findViewById(R.id.rb_C3076_3);
        rb_C3076_4 = findViewById(R.id.rb_C3076_4);
        rb_C3076_DK = findViewById(R.id.rb_C3076_DK);
        rb_C3076_RA = findViewById(R.id.rb_C3076_RA);

        rb_C3077_1 = findViewById(R.id.rb_C3077_1);
        rb_C3077_2 = findViewById(R.id.rb_C3077_2);
        rb_C3077_DK = findViewById(R.id.rb_C3077_DK);

        rb_C3078_1 = findViewById(R.id.rb_C3078_1);
        rb_C3078_2 = findViewById(R.id.rb_C3078_2);
        rb_C3078_DK = findViewById(R.id.rb_C3078_DK);

        rb_C3079_1 = findViewById(R.id.rb_C3079_1);
        rb_C3079_2 = findViewById(R.id.rb_C3079_2);
        rb_C3079_3 = findViewById(R.id.rb_C3079_3);
        rb_C3079_DK = findViewById(R.id.rb_C3079_DK);

        rb_C3080_1 = findViewById(R.id.rb_C3080_1);
        rb_C3080_2 = findViewById(R.id.rb_C3080_2);
        rb_C3080_DK = findViewById(R.id.rb_C3080_DK);

        rb_C3083_1 = findViewById(R.id.rb_C3083_1);
        rb_C3083_2 = findViewById(R.id.rb_C3083_2);
        rb_C3083_3 = findViewById(R.id.rb_C3083_3);
        rb_C3083_4 = findViewById(R.id.rb_C3083_4);
        rb_C3083_DK = findViewById(R.id.rb_C3083_DK);

        rb_C3084_1 = findViewById(R.id.rb_C3084_1);
        rb_C3084_2 = findViewById(R.id.rb_C3084_2);
        rb_C3084_DK = findViewById(R.id.rb_C3084_DK);
        rb_C3084_RA = findViewById(R.id.rb_C3084_RA);

        rb_C3085_1 = findViewById(R.id.rb_C3085_1);
        rb_C3085_2 = findViewById(R.id.rb_C3085_2);
        rb_C3085_DK = findViewById(R.id.rb_C3085_DK);
        rb_C3085_RA = findViewById(R.id.rb_C3085_RA);

        rb_C3086_1 = findViewById(R.id.rb_C3086_1);
        rb_C3086_2 = findViewById(R.id.rb_C3086_2);
        rb_C3086_DK = findViewById(R.id.rb_C3086_DK);
        rb_C3086_RA = findViewById(R.id.rb_C3086_RA);

        rb_C3088_1 = findViewById(R.id.rb_C3088_1);
        rb_C3088_2 = findViewById(R.id.rb_C3088_2);
        rb_C3088_DK = findViewById(R.id.rb_C3088_DK);
        rb_C3088_RA = findViewById(R.id.rb_C3088_RA);

        rb_C3089_1 = findViewById(R.id.rb_C3089_1);
        rb_C3089_2 = findViewById(R.id.rb_C3089_2);
        rb_C3089_DK = findViewById(R.id.rb_C3089_DK);
        rb_C3089_RA = findViewById(R.id.rb_C3089_RA);

        rb_C3091_1 = findViewById(R.id.rb_C3091_1);
        rb_C3091_2 = findViewById(R.id.rb_C3091_2);
        rb_C3091_DK = findViewById(R.id.rb_C3091_DK);
        rb_C3091_RA = findViewById(R.id.rb_C3091_RA);

        rb_C3092_1 = findViewById(R.id.rb_C3092_1);
        rb_C3092_2 = findViewById(R.id.rb_C3092_2);
        rb_C3092_DK = findViewById(R.id.rb_C3092_DK);
        rb_C3092_RA = findViewById(R.id.rb_C3092_RA);

        rb_C3093_1 = findViewById(R.id.rb_C3093_1);
        rb_C3093_2 = findViewById(R.id.rb_C3093_2);
        rb_C3093_DK = findViewById(R.id.rb_C3093_DK);
        rb_C3093_RA = findViewById(R.id.rb_C3093_RA);

        rb_C3094_1 = findViewById(R.id.rb_C3094_1);
        rb_C3094_2 = findViewById(R.id.rb_C3094_2);
        rb_C3094_DK = findViewById(R.id.rb_C3094_DK);
        rb_C3094_RA = findViewById(R.id.rb_C3094_RA);

        rb_C3095_1 = findViewById(R.id.rb_C3095_1);
        rb_C3095_2 = findViewById(R.id.rb_C3095_2);
        rb_C3095_DK = findViewById(R.id.rb_C3095_DK);
        rb_C3095_RA = findViewById(R.id.rb_C3095_RA);

        rb_C3096_1 = findViewById(R.id.rb_C3096_1);
        rb_C3096_2 = findViewById(R.id.rb_C3096_2);
        rb_C3096_DK = findViewById(R.id.rb_C3096_DK);
        rb_C3096_RA = findViewById(R.id.rb_C3096_RA);

        rb_C3097_1 = findViewById(R.id.rb_C3097_1);
        rb_C3097_2 = findViewById(R.id.rb_C3097_2);
        rb_C3097_DK = findViewById(R.id.rb_C3097_DK);
        rb_C3097_RA = findViewById(R.id.rb_C3097_RA);

        rb_C3098_1 = findViewById(R.id.rb_C3098_1);
        rb_C3098_2 = findViewById(R.id.rb_C3098_2);
        rb_C3098_DK = findViewById(R.id.rb_C3098_DK);
        rb_C3098_RA = findViewById(R.id.rb_C3098_RA);

        rb_C3099_1 = findViewById(R.id.rb_C3099_1);
        rb_C3099_2 = findViewById(R.id.rb_C3099_2);
        rb_C3099_DK = findViewById(R.id.rb_C3099_DK);
        rb_C3099_RA = findViewById(R.id.rb_C3099_RA);


        // Edittexts
        ed_C3052 = findViewById(R.id.ed_C3052);
        ed_C3062 = findViewById(R.id.ed_C3062);
        ed_C3065_OT = findViewById(R.id.ed_C3065_OT);
        ed_C3067_OT = findViewById(R.id.ed_C3067_OT);
        ed_C3068_OT = findViewById(R.id.ed_C3068_OT);
        ed_C3079 = findViewById(R.id.ed_C3079_OT);
        ed_C3081 = findViewById(R.id.ed_C3081);
        ed_C3082 = findViewById(R.id.ed_C3082);
        ed_C3087 = findViewById(R.id.ed_C3087);
        ed_C3090_1 = findViewById(R.id.ed_C3090_1);
        ed_C3090_2 = findViewById(R.id.ed_C3090_2);

    }

    void events_call() {

        rb_C3057_1.setOnCheckedChangeListener(this);
        rb_C3057_2.setOnCheckedChangeListener(this);
        rb_C3057_DK.setOnCheckedChangeListener(this);
        rb_C3057_RA.setOnCheckedChangeListener(this);

        rb_C3059_1.setOnCheckedChangeListener(this);
        rb_C3059_2.setOnCheckedChangeListener(this);
        rb_C3059_DK.setOnCheckedChangeListener(this);
        rb_C3059_RA.setOnCheckedChangeListener(this);

        rb_C3063_1.setOnCheckedChangeListener(this);
        rb_C3063_2.setOnCheckedChangeListener(this);
        rb_C3063_DK.setOnCheckedChangeListener(this);

        rb_C3064_1.setOnCheckedChangeListener(this);
        rb_C3064_2.setOnCheckedChangeListener(this);
        rb_C3064_DK.setOnCheckedChangeListener(this);

        cb_C3065_1.setOnCheckedChangeListener(this);
        cb_C3065_2.setOnCheckedChangeListener(this);
        cb_C3065_3.setOnCheckedChangeListener(this);
        cb_C3065_4.setOnCheckedChangeListener(this);
        cb_C3065_5.setOnCheckedChangeListener(this);
        cb_C3065_6.setOnCheckedChangeListener(this);
        cb_C3065_7.setOnCheckedChangeListener(this);
        cb_C3065_DK.setOnCheckedChangeListener(this);

        rb_C3066_1.setOnCheckedChangeListener(this);
        rb_C3066_2.setOnCheckedChangeListener(this);
        rb_C3066_DK.setOnCheckedChangeListener(this);

        cb_C3067_1.setOnCheckedChangeListener(this);
        cb_C3067_2.setOnCheckedChangeListener(this);
        cb_C3067_3.setOnCheckedChangeListener(this);
        cb_C3067_4.setOnCheckedChangeListener(this);
        cb_C3067_5.setOnCheckedChangeListener(this);
        cb_C3067_6.setOnCheckedChangeListener(this);
        cb_C3067_7.setOnCheckedChangeListener(this);
        cb_C3067_DK.setOnCheckedChangeListener(this);

        rb_C3072_1.setOnCheckedChangeListener(this);
        rb_C3072_2.setOnCheckedChangeListener(this);
        rb_C3072_DK.setOnCheckedChangeListener(this);
        rb_C3072_RA.setOnCheckedChangeListener(this);

        rb_C3073_2_1.setOnCheckedChangeListener(this);
        rb_C3073_2_2.setOnCheckedChangeListener(this);
        rb_C3073_2_DK.setOnCheckedChangeListener(this);
        rb_C3073_2_RA.setOnCheckedChangeListener(this);

        rb_C3075_1.setOnCheckedChangeListener(this);
        rb_C3075_2.setOnCheckedChangeListener(this);
        rb_C3075_DK.setOnCheckedChangeListener(this);
        rb_C3075_RA.setOnCheckedChangeListener(this);

        rb_C3078_1.setOnCheckedChangeListener(this);
        rb_C3078_2.setOnCheckedChangeListener(this);
        rb_C3078_DK.setOnCheckedChangeListener(this);

        rb_C3084_1.setOnCheckedChangeListener(this);
        rb_C3084_2.setOnCheckedChangeListener(this);
        rb_C3084_DK.setOnCheckedChangeListener(this);
        rb_C3084_RA.setOnCheckedChangeListener(this);

        rb_C3085_1.setOnCheckedChangeListener(this);
        rb_C3085_2.setOnCheckedChangeListener(this);
        rb_C3085_DK.setOnCheckedChangeListener(this);
        rb_C3085_RA.setOnCheckedChangeListener(this);

        rb_C3086_1.setOnCheckedChangeListener(this);
        rb_C3086_2.setOnCheckedChangeListener(this);
        rb_C3086_DK.setOnCheckedChangeListener(this);
        rb_C3086_RA.setOnCheckedChangeListener(this);

        rb_C3091_1.setOnCheckedChangeListener(this);
        rb_C3091_2.setOnCheckedChangeListener(this);
        rb_C3091_DK.setOnCheckedChangeListener(this);
        rb_C3091_RA.setOnCheckedChangeListener(this);

        rb_C3097_1.setOnCheckedChangeListener(this);
        rb_C3097_2.setOnCheckedChangeListener(this);
        rb_C3097_DK.setOnCheckedChangeListener(this);
        rb_C3097_RA.setOnCheckedChangeListener(this);

        rb_C3098_1.setOnCheckedChangeListener(this);
        rb_C3098_2.setOnCheckedChangeListener(this);
        rb_C3098_DK.setOnCheckedChangeListener(this);
        rb_C3098_RA.setOnCheckedChangeListener(this);

        ed_C3079.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        ed_C3090_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        ed_C3090_2.setFilters(new InputFilter[]{new InputFilterMinMax(0, 11, 99, 99)});
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3057_1
                || compoundButton.getId() == R.id.rb_C3057_2
                || compoundButton.getId() == R.id.rb_C3057_DK
                || compoundButton.getId() == R.id.rb_C3057_RA) {

            if (rb_C3057_1.isChecked()) {

                ll_C3058.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3058);
                ll_C3058.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3059_1
                || compoundButton.getId() == R.id.rb_C3059_2
                || compoundButton.getId() == R.id.rb_C3059_DK
                || compoundButton.getId() == R.id.rb_C3059_RA) {

            if (rb_C3059_1.isChecked()) {

                ll_C3060.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3060);
                ll_C3060.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3063_1
                || compoundButton.getId() == R.id.rb_C3063_2
                || compoundButton.getId() == R.id.rb_C3063_DK) {

            if ((rb_C3054_1.isChecked() && rb_C3055_1.isChecked() && rb_C3056_1.isChecked()) &&
                    (rb_C3057_1.isChecked() || rb_C3058_1.isChecked()) &&
                    (rb_C3059_1.isChecked() || rb_C3060_1.isChecked())) {

                ll_C3064.setVisibility(View.VISIBLE);
                ll_C3065.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3064);
                ClearAllcontrol.ClearAll(ll_C3065);

                ll_C3064.setVisibility(View.GONE);
                ll_C3065.setVisibility(View.GONE);
            }

            if ((rb_C3051_1.isChecked() && (Integer.valueOf(ed_C3052.getText().toString()) == 9 || Integer.valueOf(ed_C3052.getText().toString()) == 10)) &&
                    (rb_C3057_1.isChecked() || rb_C3058_2.isChecked()) &&
                    (rb_C3059_1.isChecked() || rb_C3060_2.isChecked()) &&
                    rb_C3061_1.isChecked() && Integer.valueOf(ed_C3062.getText().toString()) < 12 &&
                    rb_C3063_1.isChecked()) {

                ll_C3066.setVisibility(View.VISIBLE);
                ll_C3067.setVisibility(View.VISIBLE);
                ll_C3068.setVisibility(View.VISIBLE);
                ll_C3069.setVisibility(View.VISIBLE);
                ll_C3070.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3066);
                ClearAllcontrol.ClearAll(ll_C3067);
                ClearAllcontrol.ClearAll(ll_C3068);
                ClearAllcontrol.ClearAll(ll_C3069);
                ClearAllcontrol.ClearAll(ll_C3070);

                ll_C3066.setVisibility(View.GONE);
                ll_C3067.setVisibility(View.GONE);
                ll_C3068.setVisibility(View.GONE);
                ll_C3069.setVisibility(View.GONE);
                ll_C3070.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3064_1
                || compoundButton.getId() == R.id.rb_C3064_2
                || compoundButton.getId() == R.id.rb_C3064_DK) {

            if (rb_C3064_1.isChecked()) {

                ll_C3065.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3065);
                ll_C3065.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.cb_C3065_1
                || compoundButton.getId() == R.id.cb_C3065_2
                || compoundButton.getId() == R.id.cb_C3065_3
                || compoundButton.getId() == R.id.cb_C3065_4
                || compoundButton.getId() == R.id.cb_C3065_5
                || compoundButton.getId() == R.id.cb_C3065_6
                || compoundButton.getId() == R.id.cb_C3065_7
                || compoundButton.getId() == R.id.cb_C3065_DK) {

            if (rb_C3064_1.isChecked()) {

                ll_C3065.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3065);
                ll_C3065.setVisibility(View.GONE);
            }


            if (cb_C3065_DK.isChecked()) {

                ed_C3065_OT.setText("");

                cb_C3065_1.setChecked(false);
                cb_C3065_2.setChecked(false);
                cb_C3065_3.setChecked(false);
                cb_C3065_4.setChecked(false);
                cb_C3065_5.setChecked(false);
                cb_C3065_6.setChecked(false);
                cb_C3065_7.setChecked(false);
            }

            if (cb_C3065_7.isChecked()) {

                ed_C3065_OT.setVisibility(View.VISIBLE);
            } else {

                ed_C3065_OT.setText("");
                ed_C3065_OT.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3066_1
                || compoundButton.getId() == R.id.rb_C3066_2
                || compoundButton.getId() == R.id.rb_C3066_DK) {

            if (rb_C3066_2.isChecked() || rb_C3066_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3067);
                ClearAllcontrol.ClearAll(ll_C3068);
                ClearAllcontrol.ClearAll(ll_C3069);
                ClearAllcontrol.ClearAll(ll_C3070);

                ll_C3067.setVisibility(View.GONE);
                ll_C3068.setVisibility(View.GONE);
                ll_C3069.setVisibility(View.GONE);
                ll_C3070.setVisibility(View.GONE);

            } else {

                ll_C3067.setVisibility(View.VISIBLE);
                ll_C3068.setVisibility(View.VISIBLE);
                ll_C3069.setVisibility(View.VISIBLE);
                ll_C3070.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.cb_C3067_1
                || compoundButton.getId() == R.id.cb_C3067_2
                || compoundButton.getId() == R.id.cb_C3067_3
                || compoundButton.getId() == R.id.cb_C3067_4
                || compoundButton.getId() == R.id.cb_C3067_5
                || compoundButton.getId() == R.id.cb_C3067_6
                || compoundButton.getId() == R.id.cb_C3067_7
                || compoundButton.getId() == R.id.cb_C3067_DK) {


            if (cb_C3067_DK.isChecked()) {

                ed_C3067_OT.setText("");

                cb_C3067_1.setChecked(false);
                cb_C3067_2.setChecked(false);
                cb_C3067_3.setChecked(false);
                cb_C3067_4.setChecked(false);
                cb_C3067_5.setChecked(false);
                cb_C3067_6.setChecked(false);
                cb_C3067_7.setChecked(false);
            }

            if (cb_C3067_7.isChecked()) {

                ed_C3067_OT.setVisibility(View.VISIBLE);

            } else {

                ed_C3067_OT.setText("");
                ed_C3067_OT.setVisibility(View.GONE);
            }

            if (cb_C3067_5.isChecked() || cb_C3067_6.isChecked() || cb_C3067_7.isChecked() || cb_C3067_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3068);
                ClearAllcontrol.ClearAll(ll_C3068_OT);
                ClearAllcontrol.ClearAll(ll_C3069);
                ClearAllcontrol.ClearAll(ll_C3070);

                ll_C3068.setVisibility(View.GONE);
                ll_C3068_OT.setVisibility(View.GONE);
                ll_C3069.setVisibility(View.GONE);
                ll_C3070.setVisibility(View.GONE);

            } else {

                ll_C3068.setVisibility(View.VISIBLE);
                ll_C3068_OT.setVisibility(View.VISIBLE);
                ll_C3069.setVisibility(View.VISIBLE);
                ll_C3070.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3068_1
                || compoundButton.getId() == R.id.rb_C3068_2
                || compoundButton.getId() == R.id.rb_C3068_3
                || compoundButton.getId() == R.id.rb_C3068_4
                || compoundButton.getId() == R.id.rb_C3068_5
                || compoundButton.getId() == R.id.rb_C3068_6
                || compoundButton.getId() == R.id.rb_C3068_7
                || compoundButton.getId() == R.id.rb_C3068_8
                || compoundButton.getId() == R.id.rb_C3068_9
                || compoundButton.getId() == R.id.rb_C3068_10
                || compoundButton.getId() == R.id.rb_C3068_DK) {

            if (rb_C3068_6.isChecked() || rb_C3068_10.isChecked()) {

                ll_C3068_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3068_OT);
                ll_C3068_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3072_1
                || compoundButton.getId() == R.id.rb_C3072_2
                || compoundButton.getId() == R.id.rb_C3072_DK
                || compoundButton.getId() == R.id.rb_C3072_RA) {

            if (rb_C3072_2.isChecked() || rb_C3072_DK.isChecked() || rb_C3072_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3073_1);
                ClearAllcontrol.ClearAll(ll_C3073_2);
                ClearAllcontrol.ClearAll(ll_C3073_3);

                ll_C3073_1.setVisibility(View.GONE);
                ll_C3073_2.setVisibility(View.GONE);
                ll_C3073_3.setVisibility(View.GONE);

            } else {

                ll_C3073_1.setVisibility(View.VISIBLE);
                ll_C3073_2.setVisibility(View.VISIBLE);
                ll_C3073_3.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3073_2_1
                || compoundButton.getId() == R.id.rb_C3073_2_2
                || compoundButton.getId() == R.id.rb_C3073_2_DK
                || compoundButton.getId() == R.id.rb_C3073_2_RA) {

            if (rb_C3073_1_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3073_3);
                ll_C3073_3.setVisibility(View.GONE);

            } else {

                ll_C3073_3.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3075_1
                || compoundButton.getId() == R.id.rb_C3075_2
                || compoundButton.getId() == R.id.rb_C3075_DK
                || compoundButton.getId() == R.id.rb_C3075_RA) {


            if (rb_C3075_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3076);

                ll_C3076.setVisibility(View.GONE);
            } else {
                ll_C3076.setVisibility(View.VISIBLE);
            }

            if ((!rb_C3051_1.isChecked() &&
                    (Integer.valueOf(ed_C3052.getText().toString()) == 9
                            || Integer.valueOf(ed_C3052.getText().toString()) == 10)) ||
                    (C3006 == 1 || C3006 == 2 || C3006 == 11 || C3006 == 12 || C3006 == 99)) {

                ClearAllcontrol.ClearAll(ll_C3077);
                ClearAllcontrol.ClearAll(ll_C3081);
                ClearAllcontrol.ClearAll(ll_C3082);

                ll_C3077.setVisibility(View.GONE);
                ll_C3081.setVisibility(View.GONE);
                ll_C3082.setVisibility(View.GONE);

            } else {

                ll_C3077.setVisibility(View.VISIBLE);
                ll_C3081.setVisibility(View.VISIBLE);
                ll_C3082.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3078_1
                || compoundButton.getId() == R.id.rb_C3078_2
                || compoundButton.getId() == R.id.rb_C3078_DK) {

            if (rb_C3078_2.isChecked() || rb_C3078_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3079);
                ClearAllcontrol.ClearAll(ll_C3080);
                ClearAllcontrol.ClearAll(ll_C3081);
                ClearAllcontrol.ClearAll(ll_C3082);

                ll_C3079.setVisibility(View.GONE);
                ll_C3080.setVisibility(View.GONE);
                ll_C3081.setVisibility(View.GONE);
                ll_C3082.setVisibility(View.GONE);

            } else {

                ll_C3079.setVisibility(View.VISIBLE);
                ll_C3080.setVisibility(View.VISIBLE);
                ll_C3081.setVisibility(View.VISIBLE);
                ll_C3082.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3079_1
                || compoundButton.getId() == R.id.rb_C3079_2
                || compoundButton.getId() == R.id.rb_C3079_3
                || compoundButton.getId() == R.id.rb_C3079_DK) {

            if (rb_C3079_3.isChecked()) {

                ll_C3079_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3079_OT);
                ll_C3079_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3084_1
                || compoundButton.getId() == R.id.rb_C3084_2
                || compoundButton.getId() == R.id.rb_C3084_DK
                || compoundButton.getId() == R.id.rb_C3084_RA) {

            if (rb_C3084_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3085);
                ll_C3085.setVisibility(View.GONE);

            } else {

                ll_C3085.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3085_1
                || compoundButton.getId() == R.id.rb_C3085_2
                || compoundButton.getId() == R.id.rb_C3085_DK
                || compoundButton.getId() == R.id.rb_C3085_RA) {

            if (rb_C3085_2.isChecked() || rb_C3085_DK.isChecked() || rb_C3085_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3086);
                ClearAllcontrol.ClearAll(ll_C3087);
                ClearAllcontrol.ClearAll(ll_C3088);
                ClearAllcontrol.ClearAll(ll_C3089);
                ClearAllcontrol.ClearAll(ll_C3090);

                ll_C3086.setVisibility(View.GONE);
                ll_C3087.setVisibility(View.GONE);
                ll_C3088.setVisibility(View.GONE);
                ll_C3089.setVisibility(View.GONE);
                ll_C3090.setVisibility(View.GONE);

            } else {

                ll_C3086.setVisibility(View.VISIBLE);
                ll_C3087.setVisibility(View.VISIBLE);
                ll_C3088.setVisibility(View.VISIBLE);
                ll_C3089.setVisibility(View.VISIBLE);
                ll_C3090.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3086_1
                || compoundButton.getId() == R.id.rb_C3086_2
                || compoundButton.getId() == R.id.rb_C3086_DK
                || compoundButton.getId() == R.id.rb_C3086_RA) {

            if (rb_C3086_2.isChecked() || rb_C3086_DK.isChecked() || rb_C3086_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3087);
                ClearAllcontrol.ClearAll(ll_C3088);
                ClearAllcontrol.ClearAll(ll_C3089);
                ClearAllcontrol.ClearAll(ll_C3090);

                ll_C3087.setVisibility(View.GONE);
                ll_C3088.setVisibility(View.GONE);
                ll_C3089.setVisibility(View.GONE);
                ll_C3090.setVisibility(View.GONE);

            } else {

                ll_C3087.setVisibility(View.VISIBLE);
                ll_C3088.setVisibility(View.VISIBLE);
                ll_C3089.setVisibility(View.VISIBLE);
                ll_C3090.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3089_1
                || compoundButton.getId() == R.id.rb_C3089_2
                || compoundButton.getId() == R.id.rb_C3089_DK
                || compoundButton.getId() == R.id.rb_C3089_RA) {

            if (rb_C3089_2.isChecked() || rb_C3089_DK.isChecked() || rb_C3089_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3090);
                ll_C3090.setVisibility(View.GONE);

            } else {

                ll_C3090.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3091_1
                || compoundButton.getId() == R.id.rb_C3091_2
                || compoundButton.getId() == R.id.rb_C3091_DK
                || compoundButton.getId() == R.id.rb_C3091_RA) {

            if (rb_C3091_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3092);

                ll_C3092.setVisibility(View.GONE);

            } else {

                ll_C3092.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3097_1
                || compoundButton.getId() == R.id.rb_C3097_2
                || compoundButton.getId() == R.id.rb_C3097_DK
                || compoundButton.getId() == R.id.rb_C3097_RA) {

            if (rb_C3097_2.isChecked() || rb_C3097_DK.isChecked() || rb_C3097_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3098);
                ClearAllcontrol.ClearAll(ll_C3099);

                ll_C3098.setVisibility(View.GONE);
                ll_C3099.setVisibility(View.GONE);

            } else {

                ll_C3098.setVisibility(View.VISIBLE);
                ll_C3099.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3098_1
                || compoundButton.getId() == R.id.rb_C3098_2
                || compoundButton.getId() == R.id.rb_C3098_DK
                || compoundButton.getId() == R.id.rb_C3098_RA) {

            if (rb_C3098_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3099);
                ll_C3099.setVisibility(View.GONE);

            } else {

                ll_C3099.setVisibility(View.VISIBLE);
            }
        }
    }

    void value_assignment() {

        C3051 = "-1";
        C3052 = "-1";
        C3053 = "-1";
        C3053a = "-1";
        C3054 = "-1";
        C3055 = "-1";
        C3056 = "-1";
        C3057 = "-1";
        C3058 = "-1";
        C3059 = "-1";
        C3060 = "-1";
        C3061 = "-1";
        C3062 = "-1";
        C3063 = "-1";
        C3064 = "-1";
        C3065_1 = "-1";
        C3065_2 = "-1";
        C3065_3 = "-1";
        C3065_4 = "-1";
        C3065_5 = "-1";
        C3065_6 = "-1";
        C3065_7 = "-1";
        C3065_OT = "-1";
        C3065_DK = "-1";
        C3067_1 = "-1";
        C3067_2 = "-1";
        C3067_3 = "-1";
        C3067_4 = "-1";
        C3067_5 = "-1";
        C3067_6 = "-1";
        C3067_7 = "-1";
        C3067_OT = "-1";
        C3067_DK = "-1";
        C3066 = "-1";
        C3068 = "-1";
        C3068_OT = "-1";
        C3069 = "-1";
        C3070 = "-1";
        C3071 = "-1";
        C3072 = "-1";
        C3073_1 = "-1";
        C3073_2 = "-1";
        C3073_3 = "-1";
        C3074 = "-1";
        C3075 = "-1";
        C3076 = "-1";
        C3077 = "-1";
        C3078 = "-1";
        C3079 = "-1";
        C3079_OT = "-1";
        C3080 = "-1";
        C3081 = "-1";
        C3082 = "-1";
        C3083 = "-1";
        C3084 = "-1";
        C3085 = "-1";
        C3086 = "-1";
        C3087 = "-1";
        C3088 = "-1";
        C3089 = "-1";
        C3090_1 = "-1";
        C3090_2 = "-1";
        C3091 = "-1";
        C3092 = "-1";
        C3093 = "-1";
        C3094 = "-1";
        C3095 = "-1";
        C3096 = "-1";
        C3097 = "-1";
        C3098 = "-1";
        C3099 = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        if (rb_C3051_1.isChecked()) {
            C3051 = "1";
        } else if (rb_C3051_2.isChecked()) {
            C3051 = "2";
        } else if (rb_C3051_DK.isChecked()) {
            C3051 = "9";
        } else if (rb_C3051_RA.isChecked()) {
            C3051 = "8";
        }

        if (ed_C3052.getText().toString().trim().length() > 0) {
            C3052 = ed_C3052.getText().toString().trim();
        }

        if (rb_C3053_1.isChecked()) {
            C3053 = "1";
        } else if (rb_C3053a_2.isChecked()) {
            C3053 = "2";
        } else if (rb_C3053_DK.isChecked()) {
            C3053 = "9";
        } else if (rb_C3053_RA.isChecked()) {
            C3053 = "8";
        }

        if (rb_C3053a_1.isChecked()) {
            C3053a = "1";
        } else if (rb_C3053a_2.isChecked()) {
            C3053a = "2";
        } else if (rb_C3053a_DK.isChecked()) {
            C3053a = "9";
        } else if (rb_C3053a_RA.isChecked()) {
            C3053a = "8";
        }

        if (rb_C3054_1.isChecked()) {
            C3054 = "1";
        } else if (rb_C3054_2.isChecked()) {
            C3054 = "2";
        } else if (rb_C3054_DK.isChecked()) {
            C3054 = "9";
        } else if (rb_C3054_RA.isChecked()) {
            C3054 = "8";
        }

        if (rb_C3055_1.isChecked()) {
            C3055 = "1";
        } else if (rb_C3055_2.isChecked()) {
            C3055 = "2";
        } else if (rb_C3055_DK.isChecked()) {
            C3055 = "9";
        } else if (rb_C3055_RA.isChecked()) {
            C3055 = "8";
        }

        if (rb_C3056_1.isChecked()) {
            C3056 = "1";
        } else if (rb_C3056_2.isChecked()) {
            C3056 = "2";
        } else if (rb_C3056_DK.isChecked()) {
            C3056 = "9";
        } else if (rb_C3056_RA.isChecked()) {
            C3056 = "8";
        }

        if (rb_C3057_1.isChecked()) {
            C3057 = "1";
        } else if (rb_C3057_2.isChecked()) {
            C3057 = "2";
        } else if (rb_C3057_DK.isChecked()) {
            C3057 = "9";
        } else if (rb_C3057_RA.isChecked()) {
            C3057 = "8";
        }

        if (rb_C3058_1.isChecked()) {
            C3058 = "1";
        } else if (rb_C3058_2.isChecked()) {
            C3058 = "2";
        } else if (rb_C3058_DK.isChecked()) {
            C3057 = "9";
        }

        if (rb_C3059_1.isChecked()) {
            C3059 = "1";
        } else if (rb_C3059_2.isChecked()) {
            C3059 = "2";
        } else if (rb_C3059_DK.isChecked()) {
            C3059 = "9";
        } else if (rb_C3059_RA.isChecked()) {
            C3059 = "8";
        }

        if (rb_C3060_1.isChecked()) {
            C3060 = "1";
        } else if (rb_C3060_2.isChecked()) {
            C3060 = "2";
        } else if (rb_C3060_DK.isChecked()) {
            C3060 = "9";
        }

        if (rb_C3061_1.isChecked()) {
            C3061 = "1";
        } else if (rb_C3061_2.isChecked()) {
            C3061 = "2";
        } else if (rb_C3061_DK.isChecked()) {
            C3061 = "9";
        }

        if (ed_C3062.getText().toString().trim().length() > 0) {
            C3062 = ed_C3062.getText().toString().trim();
        }

        if (rb_C3063_1.isChecked()) {
            C3063 = "1";
        } else if (rb_C3063_2.isChecked()) {
            C3063 = "2";
        } else if (rb_C3063_DK.isChecked()) {
            C3063 = "9";
        }

        if (rb_C3064_1.isChecked()) {
            C3064 = "1";
        } else if (rb_C3064_2.isChecked()) {
            C3064 = "2";
        } else if (rb_C3064_DK.isChecked()) {
            C3064 = "9";
        }

        if (cb_C3065_1.isChecked()) {
            C3065_1 = "1";
        }
        if (cb_C3065_2.isChecked()) {
            C3065_2 = "1";
        }
        if (cb_C3065_3.isChecked()) {
            C3065_3 = "1";
        }
        if (cb_C3065_4.isChecked()) {
            C3065_4 = "1";
        }
        if (cb_C3065_5.isChecked()) {
            C3065_5 = "1";
        }
        if (cb_C3065_6.isChecked()) {
            C3065_6 = "1";
        }
        if (cb_C3065_DK.isChecked()) {
            C3065_DK = "1";
        }
        if (cb_C3065_7.isChecked()) {
            C3065_7 = "1";
            C3065_OT = ed_C3065_OT.getText().toString().trim();
        }

        if (rb_C3066_1.isChecked()) {
            C3066 = "1";
        } else if (rb_C3066_2.isChecked()) {
            C3066 = "2";
        } else if (rb_C3066_DK.isChecked()) {
            C3066 = "9";
        }

        if (cb_C3067_1.isChecked()) {
            C3067_1 = "1";
        }
        if (cb_C3067_2.isChecked()) {
            C3067_2 = "1";
        }
        if (cb_C3067_3.isChecked()) {
            C3067_3 = "1";
        }
        if (cb_C3067_4.isChecked()) {
            C3067_4 = "1";
        }
        if (cb_C3067_5.isChecked()) {
            C3067_5 = "1";
        }
        if (cb_C3067_6.isChecked()) {
            C3067_6 = "1";
        }
        if (cb_C3065_7.isChecked()) {
            C3067_7 = "1";
            C3067_OT = ed_C3067_OT.getText().toString().trim();
        }
        if (cb_C3067_DK.isChecked()) {
            C3067_DK = "1";
        }

        if (rb_C3068_1.isChecked()) {
            C3068 = "1";
        } else if (rb_C3068_2.isChecked()) {
            C3068 = "2";
        } else if (rb_C3068_3.isChecked()) {
            C3068 = "3";
        } else if (rb_C3068_4.isChecked()) {
            C3068 = "4";
        } else if (rb_C3068_5.isChecked()) {
            C3068 = "5";
        } else if (rb_C3068_6.isChecked()) {
            C3068 = "6";
            C3068_OT = ed_C3068_OT.getText().toString().trim();
        } else if (rb_C3068_7.isChecked()) {
            C3068 = "7";
        } else if (rb_C3068_8.isChecked()) {
            C3068 = "8";
        } else if (rb_C3068_9.isChecked()) {
            C3068 = "9";
        } else if (rb_C3068_10.isChecked()) {
            C3068 = "10";
            C3068_OT = ed_C3068_OT.getText().toString().trim();
        } else if (rb_C3068_DK.isChecked()) {
            C3068 = "99";
        }

        if (rb_C3069_1.isChecked()) {
            C3069 = "1";
        } else if (rb_C3069_2.isChecked()) {
            C3069 = "2";
        } else if (rb_C3069_DK.isChecked()) {
            C3069 = "9";
        }

        if (rb_C3070_1.isChecked()) {
            C3070 = "1";
        } else if (rb_C3070_2.isChecked()) {
            C3070 = "2";
        } else if (rb_C3070_DK.isChecked()) {
            C3070 = "9";
        }

        if (rb_C3071_1.isChecked()) {
            C3071 = "1";
        } else if (rb_C3071_2.isChecked()) {
            C3071 = "2";
        } else if (rb_C3071_DK.isChecked()) {
            C3071 = "9";
        } else if (rb_C3071_RA.isChecked()) {
            C3071 = "8";
        }

        if (rb_C3072_1.isChecked()) {
            C3072 = "1";
        } else if (rb_C3072_2.isChecked()) {
            C3072 = "2";
        } else if (rb_C3072_DK.isChecked()) {
            C3072 = "9";
        } else if (rb_C3072_RA.isChecked()) {
            C3072 = "8";
        }

        if (rb_C3073_1_1.isChecked()) {
            C3073_1 = "1";
        } else if (rb_C3073_1_2.isChecked()) {
            C3073_1 = "2";
        } else if (rb_C3073_1_DK.isChecked()) {
            C3073_1 = "9";
        } else if (rb_C3073_1_RA.isChecked()) {
            C3073_1 = "8";
        }

        if (rb_C3073_2_1.isChecked()) {
            C3073_2 = "1";
        } else if (rb_C3073_2_2.isChecked()) {
            C3073_2 = "2";
        } else if (rb_C3073_2_DK.isChecked()) {
            C3073_2 = "9";
        } else if (rb_C3073_2_RA.isChecked()) {
            C3073_2 = "8";
        }

        if (rb_C3073_3_1.isChecked()) {
            C3073_3 = "1";
        } else if (rb_C3073_3_2.isChecked()) {
            C3073_3 = "2";
        } else if (rb_C3073_3_DK.isChecked()) {
            C3073_3 = "9";
        } else if (rb_C3073_3_RA.isChecked()) {
            C3073_3 = "8";
        }

        if (rb_C3074_1.isChecked()) {
            C3074 = "1";
        } else if (rb_C3074_2.isChecked()) {
            C3074 = "2";
        } else if (rb_C3074_DK.isChecked()) {
            C3074 = "9";
        } else if (rb_C3074_RA.isChecked()) {
            C3074 = "8";
        }

        if (rb_C3075_1.isChecked()) {
            C3075 = "1";
        } else if (rb_C3075_2.isChecked()) {
            C3075 = "2";
        } else if (rb_C3075_DK.isChecked()) {
            C3075 = "9";
        } else if (rb_C3075_RA.isChecked()) {
            C3075 = "8";
        }

        if (rb_C3076_1.isChecked()) {
            C3076 = "1";
        } else if (rb_C3076_2.isChecked()) {
            C3076 = "2";
        } else if (rb_C3076_3.isChecked()) {
            C3076 = "3";
        } else if (rb_C3076_4.isChecked()) {
            C3076 = "4";
        } else if (rb_C3076_DK.isChecked()) {
            C3076 = "9";
        } else if (rb_C3076_RA.isChecked()) {
            C3076 = "8";
        }

        if (rb_C3077_1.isChecked()) {
            C3077 = "1";
        } else if (rb_C3077_2.isChecked()) {
            C3077 = "2";
        } else if (rb_C3076_DK.isChecked()) {
            C3077 = "9";
        }

        if (rb_C3078_1.isChecked()) {
            C3078 = "1";
        } else if (rb_C3078_2.isChecked()) {
            C3078 = "2";
        } else if (rb_C3078_DK.isChecked()) {
            C3078 = "9";
        }

        if (rb_C3079_1.isChecked()) {
            C3079 = "1";
        } else if (rb_C3079_2.isChecked()) {
            C3079 = "2";
        } else if (rb_C3079_3.isChecked()) {
            C3079 = "3";
            C3079_OT = ed_C3079.getText().toString().trim();
        } else if (rb_C3079_DK.isChecked()) {
            C3079 = "9";
        }

        if (rb_C3080_1.isChecked()) {
            C3080 = "1";
        } else if (rb_C3080_2.isChecked()) {
            C3080 = "2";
        } else if (rb_C3080_DK.isChecked()) {
            C3080 = "9";
        }

        if (ed_C3081.getText().toString().trim().length() > 0) {
            C3081 = ed_C3081.getText().toString().trim();
        }

        if (ed_C3082.getText().toString().trim().length() > 0) {
            C3082 = ed_C3082.getText().toString().trim();
        }

        if (rb_C3083_1.isChecked()) {
            C3083 = "1";
        } else if (rb_C3083_2.isChecked()) {
            C3083 = "2";
        } else if (rb_C3083_3.isChecked()) {
            C3083 = "3";
        } else if (rb_C3083_4.isChecked()) {
            C3083 = "4";
        } else if (rb_C3083_DK.isChecked()) {
            C3083 = "9";
        }

        if (rb_C3084_1.isChecked()) {
            C3084 = "1";
        } else if (rb_C3084_2.isChecked()) {
            C3084 = "2";
        } else if (rb_C3084_DK.isChecked()) {
            C3084 = "9";
        } else if (rb_C3084_RA.isChecked()) {
            C3084 = "8";
        }

        if (rb_C3085_1.isChecked()) {
            C3085 = "1";
        } else if (rb_C3085_2.isChecked()) {
            C3085 = "2";
        } else if (rb_C3085_DK.isChecked()) {
            C3085 = "9";
        } else if (rb_C3085_RA.isChecked()) {
            C3085 = "8";
        }

        if (rb_C3086_1.isChecked()) {
            C3086 = "1";
        } else if (rb_C3086_2.isChecked()) {
            C3086 = "2";
        } else if (rb_C3086_DK.isChecked()) {
            C3086 = "9";
        } else if (rb_C3086_RA.isChecked()) {
            C3086 = "8";
        }

        if (ed_C3087.getText().toString().trim().length() > 0) {
            C3087 = ed_C3087.getText().toString().trim();
        }

        if (rb_C3088_1.isChecked()) {
            C3088 = "1";
        } else if (rb_C3088_2.isChecked()) {
            C3088 = "2";
        } else if (rb_C3088_DK.isChecked()) {
            C3088 = "9";
        } else if (rb_C3088_RA.isChecked()) {
            C3088 = "8";
        }

        if (rb_C3089_1.isChecked()) {
            C3089 = "1";
        } else if (rb_C3089_2.isChecked()) {
            C3089 = "2";
        } else if (rb_C3089_DK.isChecked()) {
            C3089 = "9";
        } else if (rb_C3089_RA.isChecked()) {
            C3089 = "8";
        }

        if (ed_C3090_1.getText().toString().trim().length() > 0) {
            C3090_1 = ed_C3090_1.getText().toString().trim();
        } else if (ed_C3090_2.getText().toString().trim().length() > 0) {
            C3090_2 = ed_C3090_2.getText().toString().trim();
        }

        if (rb_C3091_1.isChecked()) {
            C3091 = "1";
        } else if (rb_C3091_2.isChecked()) {
            C3091 = "2";
        } else if (rb_C3091_DK.isChecked()) {
            C3091 = "9";
        } else if (rb_C3091_RA.isChecked()) {
            C3091 = "8";
        }

        if (rb_C3092_1.isChecked()) {
            C3092 = "1";
        } else if (rb_C3092_2.isChecked()) {
            C3092 = "2";
        } else if (rb_C3092_DK.isChecked()) {
            C3092 = "9";
        } else if (rb_C3092_RA.isChecked()) {
            C3092 = "8";
        }

        if (rb_C3093_1.isChecked()) {
            C3093 = "1";
        } else if (rb_C3093_2.isChecked()) {
            C3093 = "2";
        } else if (rb_C3093_DK.isChecked()) {
            C3093 = "9";
        } else if (rb_C3093_RA.isChecked()) {
            C3093 = "8";
        }

        if (rb_C3094_1.isChecked()) {
            C3094 = "1";
        } else if (rb_C3094_2.isChecked()) {
            C3094 = "2";
        } else if (rb_C3094_DK.isChecked()) {
            C3094 = "9";
        } else if (rb_C3094_RA.isChecked()) {
            C3094 = "8";
        }

        if (rb_C3095_1.isChecked()) {
            C3095 = "1";
        } else if (rb_C3095_2.isChecked()) {
            C3095 = "2";
        } else if (rb_C3095_DK.isChecked()) {
            C3095 = "9";
        } else if (rb_C3095_RA.isChecked()) {
            C3095 = "8";
        }

        if (rb_C3096_1.isChecked()) {
            C3096 = "1";
        } else if (rb_C3096_2.isChecked()) {
            C3096 = "2";
        } else if (rb_C3096_DK.isChecked()) {
            C3096 = "9";
        } else if (rb_C3096_RA.isChecked()) {
            C3096 = "8";
        }

        if (rb_C3097_1.isChecked()) {
            C3097 = "1";
        } else if (rb_C3097_2.isChecked()) {
            C3097 = "2";
        } else if (rb_C3097_DK.isChecked()) {
            C3097 = "9";
        } else if (rb_C3097_RA.isChecked()) {
            C3097 = "8";
        }

        if (rb_C3098_1.isChecked()) {
            C3098 = "1";
        } else if (rb_C3098_2.isChecked()) {
            C3098 = "2";
        } else if (rb_C3098_DK.isChecked()) {
            C3098 = "9";
        } else if (rb_C3098_RA.isChecked()) {
            C3098 = "8";
        }

        if (rb_C3099_1.isChecked()) {
            C3099 = "1";
        } else if (rb_C3099_2.isChecked()) {
            C3099 = "2";
        } else if (rb_C3099_DK.isChecked()) {
            C3099 = "9";
        } else if (rb_C3099_RA.isChecked()) {
            C3099 = "8";
        }

    }

    void insert_data() {

        String query = "insert into   C3051_C3099("
                + Global.C.C3051_C3099.study_id + ","
                + Global.C.C3051_C3099.C3051 + ","
                + Global.C.C3051_C3099.C3052 + ","
                + Global.C.C3051_C3099.C3053 + ","
                + Global.C.C3051_C3099.C3053a + ","
                + Global.C.C3051_C3099.C3054 + ","
                + Global.C.C3051_C3099.C3055 + ","
                + Global.C.C3051_C3099.C3056 + ","
                + Global.C.C3051_C3099.C3057 + ","
                + Global.C.C3051_C3099.C3058 + ","
                + Global.C.C3051_C3099.C3059 + ","
                + Global.C.C3051_C3099.C3060 + ","
                + Global.C.C3051_C3099.C3061 + ","
                + Global.C.C3051_C3099.C3062 + ","
                + Global.C.C3051_C3099.C3063 + ","
                + Global.C.C3051_C3099.C3064 + ","
                + Global.C.C3051_C3099.C3065_1 + ","
                + Global.C.C3051_C3099.C3065_2 + ","
                + Global.C.C3051_C3099.C3065_3 + ","
                + Global.C.C3051_C3099.C3065_4 + ","
                + Global.C.C3051_C3099.C3065_5 + ","
                + Global.C.C3051_C3099.C3065_6 + ","
                + Global.C.C3051_C3099.C3065_7 + ","
                + Global.C.C3051_C3099.C3065_DK + ","
                + Global.C.C3051_C3099.C3065_OT + ","
                + Global.C.C3051_C3099.C3066 + ","
                + Global.C.C3051_C3099.C3067_1 + ","
                + Global.C.C3051_C3099.C3067_2 + ","
                + Global.C.C3051_C3099.C3067_3 + ","
                + Global.C.C3051_C3099.C3067_4 + ","
                + Global.C.C3051_C3099.C3067_5 + ","
                + Global.C.C3051_C3099.C3067_6 + ","
                + Global.C.C3051_C3099.C3067_7 + ","
                + Global.C.C3051_C3099.C3067_OT + ","
                + Global.C.C3051_C3099.C3067_DK + ","
                + Global.C.C3051_C3099.C3068 + ","
                + Global.C.C3051_C3099.C3068_OT + ","
                + Global.C.C3051_C3099.C3069 + ","
                + Global.C.C3051_C3099.C3070 + ","
                + Global.C.C3051_C3099.C3071 + ","
                + Global.C.C3051_C3099.C3072 + ","
                + Global.C.C3051_C3099.C3073_1 + ","
                + Global.C.C3051_C3099.C3073_2 + ","
                + Global.C.C3051_C3099.C3073_3 + ","
                + Global.C.C3051_C3099.C3074 + ","
                + Global.C.C3051_C3099.C3075 + ","
                + Global.C.C3051_C3099.C3076 + ","
                + Global.C.C3051_C3099.C3077 + ","
                + Global.C.C3051_C3099.C3078 + ","
                + Global.C.C3051_C3099.C3079 + ","
                + Global.C.C3051_C3099.C3079_OT + ","
                + Global.C.C3051_C3099.C3080 + ","
                + Global.C.C3051_C3099.C3081 + ","
                + Global.C.C3051_C3099.C3082 + ","
                + Global.C.C3051_C3099.C3083 + ","
                + Global.C.C3051_C3099.C3084 + ","
                + Global.C.C3051_C3099.C3085 + ","
                + Global.C.C3051_C3099.C3086 + ","
                + Global.C.C3051_C3099.C3087 + ","
                + Global.C.C3051_C3099.C3088 + ","
                + Global.C.C3051_C3099.C3089 + ","
                + Global.C.C3051_C3099.C3090_1 + ","
                + Global.C.C3051_C3099.C3090_2 + ","
                + Global.C.C3051_C3099.C3091 + ","
                + Global.C.C3051_C3099.C3092 + ","
                + Global.C.C3051_C3099.C3093 + ","
                + Global.C.C3051_C3099.C3094 + ","
                + Global.C.C3051_C3099.C3095 + ","
                + Global.C.C3051_C3099.C3096 + ","
                + Global.C.C3051_C3099.C3097 + ","
                + Global.C.C3051_C3099.C3098 + ","
                + Global.C.C3051_C3099.C3099 + ","
                + Global.C.C3051_C3099.STATUS + ") values ('" +

                study_id + "','" +
                C3051 + "','" +
                C3052 + "','" +
                C3053 + "','" +
                C3053a + "','" +
                C3054 + "','" +
                C3055 + "','" +
                C3056 + "','" +
                C3057 + "','" +
                C3058 + "','" +
                C3059 + "','" +
                C3060 + "','" +
                C3061 + "','" +
                C3062 + "','" +
                C3063 + "','" +
                C3064 + "','" +
                C3065_1 + "','" +
                C3065_2 + "','" +
                C3065_3 + "','" +
                C3065_4 + "','" +
                C3065_5 + "','" +
                C3065_6 + "','" +
                C3065_7 + "','" +
                C3065_DK + "','" +
                C3065_OT + "','" +
                C3066 + "','" +
                C3067_1 + "','" +
                C3067_2 + "','" +
                C3067_3 + "','" +
                C3067_4 + "','" +
                C3067_5 + "','" +
                C3067_6 + "','" +
                C3067_7 + "','" +
                C3067_OT + "','" +
                C3067_DK + "','" +
                C3068 + "','" +
                C3068_OT + "','" +
                C3069 + "','" +
                C3070 + "','" +
                C3071 + "','" +
                C3072 + "','" +
                C3073_1 + "','" +
                C3073_2 + "','" +
                C3073_3 + "','" +
                C3074 + "','" +
                C3075 + "','" +
                C3076 + "','" +
                C3077 + "','" +
                C3078 + "','" +
                C3079 + "','" +
                C3079_OT + "','" +
                C3080 + "','" +
                C3081 + "','" +
                C3082 + "','" +
                C3083 + "','" +
                C3084 + "','" +
                C3085 + "','" +
                C3086 + "','" +
                C3087 + "','" +
                C3088 + "','" +
                C3089 + "','" +
                C3090_1 + "','" +
                C3090_2 + "','" +
                C3091 + "','" +
                C3092 + "','" +
                C3093 + "','" +
                C3094 + "','" +
                C3095 + "','" +
                C3096 + "','" +
                C3097 + "','" +
                C3098 + "','" +
                C3099 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 6: Signs and symptoms associated with the fatal illness inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3051) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3052) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3053) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3053a) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3054) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3055) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3056) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3057) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3058) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3059) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3060) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3061) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3062) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3063) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3064) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3065) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3066) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3067) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3068) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3068_OT) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3069) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3070) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3071) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3072) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3073_1) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3073_2) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3073_3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3074) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3075) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3076) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3077) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3078) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3079) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3079_OT) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3080) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3081) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3082) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3083) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3084) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3085) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3086) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3087) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3088) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3089) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3090) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3091) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3092) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3093) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3094) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3095) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3096) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3097) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_C3098) == false) {
            return false;
        }
        return Gothrough.IamHiden(ll_C3099) != false;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 4);
    }

}
