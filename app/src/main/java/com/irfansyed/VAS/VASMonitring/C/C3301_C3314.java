package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class C3301_C3314 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_C3301,
            ll_C3302_1,
            ll_C3302_2,
            ll_C3302_3,
            ll_C3302_4,
            ll_C3302_5,
            ll_C3302_6,
            ll_C3302_7,
            ll_C3303,
            ll_C3304,
            ll_C3305,
            ll_C3306_1check,
            ll_C3306_1,
            ll_C3306_2check,
            ll_C3306_2,
            ll_C3307,
            ll_C3308,
            ll_C3309,
            ll_C3310_1,
            ll_C3310_2,
            ll_C3310_3,
            ll_C3310_4,
            ll_C3310_5,
            ll_C3310_6,
            ll_C3310_7,
            ll_C3310_8,
            ll_C3310_9,
            ll_C3310_10,
            ll_C3310_11,
            ll_C3311,
            ll_C3312,
            ll_C3313,
            ll_C3314;

    RadioButton
            rb_C3301_1,
            rb_C3301_2,
            rb_C3301_DK,
            rb_C3301_RA,
            rb_C3302_1_1,
            rb_C3302_1_2,
            rb_C3302_1_DK,
            rb_C3302_1_RA,
            rb_C3302_2_1,
            rb_C3302_2_2,
            rb_C3302_2_DK,
            rb_C3302_2_RA,
            rb_C3302_3_1,
            rb_C3302_3_2,
            rb_C3302_3_DK,
            rb_C3302_3_RA,
            rb_C3302_4_1,
            rb_C3302_4_2,
            rb_C3302_4_DK,
            rb_C3302_4_RA,
            rb_C3302_5_1,
            rb_C3302_5_2,
            rb_C3302_5_DK,
            rb_C3302_5_RA,
            rb_C3302_6_1,
            rb_C3302_6_2,
            rb_C3302_6_DK,
            rb_C3302_6_RA,
            rb_C3302_7_1,
            rb_C3302_7_2,
            rb_C3302_7_DK,
            rb_C3302_7_RA,
            rb_C3303_1,
            rb_C3303_2,
            rb_C3303_DK,
            rb_C3303_RA,
            rb_C3304_1,
            rb_C3304_2,
            rb_C3304_DK,
            rb_C3304_RA,
            rb_C3305_1,
            rb_C3305_2,
            rb_C3306_1check_1,
            rb_C3306_1check_2,
            rb_C3306_2check_1,
            rb_C3306_2check_2,
            rb_C3310_1_1,
            rb_C3310_1_2,
            rb_C3310_1_DK,
            rb_C3310_1_RA,
            rb_C3310_2_1,
            rb_C3310_2_2,
            rb_C3310_2_DK,
            rb_C3310_2_RA,
            rb_C3310_3_1,
            rb_C3310_3_2,
            rb_C3310_3_DK,
            rb_C3310_3_RA,
            rb_C3310_4_1,
            rb_C3310_4_2,
            rb_C3310_4_DK,
            rb_C3310_4_RA,
            rb_C3310_5_1,
            rb_C3310_5_2,
            rb_C3310_5_DK,
            rb_C3310_5_RA,
            rb_C3310_6_1,
            rb_C3310_6_2,
            rb_C3310_6_DK,
            rb_C3310_6_RA,
            rb_C3310_7_1,
            rb_C3310_7_2,
            rb_C3310_7_DK,
            rb_C3310_7_RA,
            rb_C3310_8_1,
            rb_C3310_8_2,
            rb_C3310_8_DK,
            rb_C3310_8_RA,
            rb_C3310_9_1,
            rb_C3310_9_2,
            rb_C3310_9_DK,
            rb_C3310_9_RA,
            rb_C3310_10_1,
            rb_C3310_10_2,
            rb_C3310_10_DK,
            rb_C3310_10_RA,
            rb_C3310_11_1,
            rb_C3310_11_2,
            rb_C3310_11_DK,
            rb_C3310_11_RA,
            rb_C3311_1,
            rb_C3311_2,
            rb_C3311_DK,
            rb_C3311_RA,
            rb_C3312_1,
            rb_C3312_2,
            rb_C3312_DK,
            rb_C3312_RA,
            rb_C3313_1,
            rb_C3313_2,
            rb_C3313_DK,
            rb_C3313_RA;

    //CheckBox

    EditText
            ed_C3306_1,
            ed_C3306_2,
            ed_C3307,
            ed_C3308,
            ed_C3309,
            ed_C3314;

    String
            study_id,
            C3301,
            C3302_1,
            C3302_2,
            C3302_3,
            C3302_4,
            C3302_5,
            C3302_6,
            C3302_7,
            C3303,
            C3304,
            C3305,
            C3306_1check,
            C3306_1,
            C3306_2check,
            C3306_2,
            C3307,
            C3308,
            C3309,
            C3310_1,
            C3310_2,
            C3310_3,
            C3310_4,
            C3310_5,
            C3310_6,
            C3310_7,
            C3310_8,
            C3310_9,
            C3310_10,
            C3310_11,
            C3311,
            C3312,
            C3313,
            C3314,
            STATUS;


    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3301_c3314);

        Initialization();
        events_call();

        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(this, C3351_C3364.class);

        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = (Button) findViewById(R.id.btn_next);

        // Layouts

        ll_C3301 = (LinearLayout) findViewById(R.id.ll_C3301);
        ll_C3302_1 = (LinearLayout) findViewById(R.id.ll_C3302_1);
        ll_C3302_2 = (LinearLayout) findViewById(R.id.ll_C3302_2);
        ll_C3302_3 = (LinearLayout) findViewById(R.id.ll_C3302_3);
        ll_C3302_4 = (LinearLayout) findViewById(R.id.ll_C3302_4);
        ll_C3302_5 = (LinearLayout) findViewById(R.id.ll_C3302_5);
        ll_C3302_6 = (LinearLayout) findViewById(R.id.ll_C3302_6);
        ll_C3302_7 = (LinearLayout) findViewById(R.id.ll_C3302_7);
        ll_C3303 = (LinearLayout) findViewById(R.id.ll_C3303);
        ll_C3304 = (LinearLayout) findViewById(R.id.ll_C3304);
        ll_C3305 = (LinearLayout) findViewById(R.id.ll_C3305);
        ll_C3306_1check = (LinearLayout) findViewById(R.id.ll_C3306_1check);
        ll_C3306_1 = (LinearLayout) findViewById(R.id.ll_C3306_1);
        ll_C3306_2check = (LinearLayout) findViewById(R.id.ll_C3306_2check);
        ll_C3306_2 = (LinearLayout) findViewById(R.id.ll_C3306_2);
        ll_C3307 = (LinearLayout) findViewById(R.id.ll_C3307);
        ll_C3308 = (LinearLayout) findViewById(R.id.ll_C3308);
        ll_C3309 = (LinearLayout) findViewById(R.id.ll_C3309);
        ll_C3310_1 = (LinearLayout) findViewById(R.id.ll_C3310_1);
        ll_C3310_2 = (LinearLayout) findViewById(R.id.ll_C3310_2);
        ll_C3310_3 = (LinearLayout) findViewById(R.id.ll_C3310_3);
        ll_C3310_4 = (LinearLayout) findViewById(R.id.ll_C3310_4);
        ll_C3310_5 = (LinearLayout) findViewById(R.id.ll_C3310_5);
        ll_C3310_6 = (LinearLayout) findViewById(R.id.ll_C3310_6);
        ll_C3310_7 = (LinearLayout) findViewById(R.id.ll_C3310_7);
        ll_C3310_8 = (LinearLayout) findViewById(R.id.ll_C3310_8);
        ll_C3310_9 = (LinearLayout) findViewById(R.id.ll_C3310_9);
        ll_C3310_10 = (LinearLayout) findViewById(R.id.ll_C3310_10);
        ll_C3310_11 = (LinearLayout) findViewById(R.id.ll_C3310_11);
        ll_C3311 = (LinearLayout) findViewById(R.id.ll_C3311);
        ll_C3312 = (LinearLayout) findViewById(R.id.ll_C3312);
        ll_C3313 = (LinearLayout) findViewById(R.id.ll_C3313);
        ll_C3314 = (LinearLayout) findViewById(R.id.ll_C3314);


        // Radio Buttons

        rb_C3301_1 = (RadioButton) findViewById(R.id.rb_C3301_1);
        rb_C3301_2 = (RadioButton) findViewById(R.id.rb_C3301_2);
        rb_C3301_DK = (RadioButton) findViewById(R.id.rb_C3301_DK);
        rb_C3301_RA = (RadioButton) findViewById(R.id.rb_C3301_RA);
        rb_C3302_1_1 = (RadioButton) findViewById(R.id.rb_C3302_1_1);
        rb_C3302_1_2 = (RadioButton) findViewById(R.id.rb_C3302_1_2);
        rb_C3302_1_DK = (RadioButton) findViewById(R.id.rb_C3302_1_DK);
        rb_C3302_1_RA = (RadioButton) findViewById(R.id.rb_C3302_1_RA);
        rb_C3302_2_1 = (RadioButton) findViewById(R.id.rb_C3302_2_1);
        rb_C3302_2_2 = (RadioButton) findViewById(R.id.rb_C3302_2_2);
        rb_C3302_2_DK = (RadioButton) findViewById(R.id.rb_C3302_2_DK);
        rb_C3302_2_RA = (RadioButton) findViewById(R.id.rb_C3302_2_RA);
        rb_C3302_3_1 = (RadioButton) findViewById(R.id.rb_C3302_3_1);
        rb_C3302_3_2 = (RadioButton) findViewById(R.id.rb_C3302_3_2);
        rb_C3302_3_DK = (RadioButton) findViewById(R.id.rb_C3302_3_DK);
        rb_C3302_3_RA = (RadioButton) findViewById(R.id.rb_C3302_3_RA);
        rb_C3302_4_1 = (RadioButton) findViewById(R.id.rb_C3302_4_1);
        rb_C3302_4_2 = (RadioButton) findViewById(R.id.rb_C3302_4_2);
        rb_C3302_4_DK = (RadioButton) findViewById(R.id.rb_C3302_4_DK);
        rb_C3302_4_RA = (RadioButton) findViewById(R.id.rb_C3302_4_RA);
        rb_C3302_5_1 = (RadioButton) findViewById(R.id.rb_C3302_5_1);
        rb_C3302_5_2 = (RadioButton) findViewById(R.id.rb_C3302_5_2);
        rb_C3302_5_DK = (RadioButton) findViewById(R.id.rb_C3302_5_DK);
        rb_C3302_5_RA = (RadioButton) findViewById(R.id.rb_C3302_5_RA);
        rb_C3302_6_1 = (RadioButton) findViewById(R.id.rb_C3302_6_1);
        rb_C3302_6_2 = (RadioButton) findViewById(R.id.rb_C3302_6_2);
        rb_C3302_6_DK = (RadioButton) findViewById(R.id.rb_C3302_6_DK);
        rb_C3302_6_RA = (RadioButton) findViewById(R.id.rb_C3302_6_RA);
        rb_C3302_7_1 = (RadioButton) findViewById(R.id.rb_C3302_7_1);
        rb_C3302_7_2 = (RadioButton) findViewById(R.id.rb_C3302_7_2);
        rb_C3302_7_DK = (RadioButton) findViewById(R.id.rb_C3302_7_DK);
        rb_C3302_7_RA = (RadioButton) findViewById(R.id.rb_C3302_7_RA);
        rb_C3303_1 = (RadioButton) findViewById(R.id.rb_C3303_1);
        rb_C3303_2 = (RadioButton) findViewById(R.id.rb_C3303_2);
        rb_C3303_DK = (RadioButton) findViewById(R.id.rb_C3303_DK);
        rb_C3303_RA = (RadioButton) findViewById(R.id.rb_C3303_RA);
        rb_C3304_1 = (RadioButton) findViewById(R.id.rb_C3304_1);
        rb_C3304_2 = (RadioButton) findViewById(R.id.rb_C3304_2);
        rb_C3304_DK = (RadioButton) findViewById(R.id.rb_C3304_DK);
        rb_C3304_RA = (RadioButton) findViewById(R.id.rb_C3304_RA);
        rb_C3305_1 = (RadioButton) findViewById(R.id.rb_C3305_1);
        rb_C3305_2 = (RadioButton) findViewById(R.id.rb_C3305_2);
        rb_C3306_1check_1 = (RadioButton) findViewById(R.id.rb_C3306_1check_1);
        rb_C3306_1check_2 = (RadioButton) findViewById(R.id.rb_C3306_1check_2);
        rb_C3306_2check_1 = (RadioButton) findViewById(R.id.rb_C3306_2check_1);
        rb_C3306_2check_2 = (RadioButton) findViewById(R.id.rb_C3306_2check_2);
        rb_C3310_1_1 = (RadioButton) findViewById(R.id.rb_C3310_1_1);
        rb_C3310_1_2 = (RadioButton) findViewById(R.id.rb_C3310_1_2);
        rb_C3310_1_DK = (RadioButton) findViewById(R.id.rb_C3310_1_DK);
        rb_C3310_1_RA = (RadioButton) findViewById(R.id.rb_C3310_1_RA);
        rb_C3310_2_1 = (RadioButton) findViewById(R.id.rb_C3310_2_1);
        rb_C3310_2_2 = (RadioButton) findViewById(R.id.rb_C3310_2_2);
        rb_C3310_2_DK = (RadioButton) findViewById(R.id.rb_C3310_2_DK);
        rb_C3310_2_RA = (RadioButton) findViewById(R.id.rb_C3310_2_RA);
        rb_C3310_3_1 = (RadioButton) findViewById(R.id.rb_C3310_3_1);
        rb_C3310_3_2 = (RadioButton) findViewById(R.id.rb_C3310_3_2);
        rb_C3310_3_DK = (RadioButton) findViewById(R.id.rb_C3310_3_DK);
        rb_C3310_3_RA = (RadioButton) findViewById(R.id.rb_C3310_3_RA);
        rb_C3310_4_1 = (RadioButton) findViewById(R.id.rb_C3310_4_1);
        rb_C3310_4_2 = (RadioButton) findViewById(R.id.rb_C3310_4_2);
        rb_C3310_4_DK = (RadioButton) findViewById(R.id.rb_C3310_4_DK);
        rb_C3310_4_RA = (RadioButton) findViewById(R.id.rb_C3310_4_RA);
        rb_C3310_5_1 = (RadioButton) findViewById(R.id.rb_C3310_5_1);
        rb_C3310_5_2 = (RadioButton) findViewById(R.id.rb_C3310_5_2);
        rb_C3310_5_DK = (RadioButton) findViewById(R.id.rb_C3310_5_DK);
        rb_C3310_5_RA = (RadioButton) findViewById(R.id.rb_C3310_5_RA);
        rb_C3310_6_1 = (RadioButton) findViewById(R.id.rb_C3310_6_1);
        rb_C3310_6_2 = (RadioButton) findViewById(R.id.rb_C3310_6_2);
        rb_C3310_6_DK = (RadioButton) findViewById(R.id.rb_C3310_6_DK);
        rb_C3310_6_RA = (RadioButton) findViewById(R.id.rb_C3310_6_RA);
        rb_C3310_7_1 = (RadioButton) findViewById(R.id.rb_C3310_7_1);
        rb_C3310_7_2 = (RadioButton) findViewById(R.id.rb_C3310_7_2);
        rb_C3310_7_DK = (RadioButton) findViewById(R.id.rb_C3310_7_DK);
        rb_C3310_7_RA = (RadioButton) findViewById(R.id.rb_C3310_7_RA);
        rb_C3310_8_1 = (RadioButton) findViewById(R.id.rb_C3310_8_1);
        rb_C3310_8_2 = (RadioButton) findViewById(R.id.rb_C3310_8_2);
        rb_C3310_8_DK = (RadioButton) findViewById(R.id.rb_C3310_8_DK);
        rb_C3310_8_RA = (RadioButton) findViewById(R.id.rb_C3310_8_RA);
        rb_C3310_9_1 = (RadioButton) findViewById(R.id.rb_C3310_9_1);
        rb_C3310_9_2 = (RadioButton) findViewById(R.id.rb_C3310_9_2);
        rb_C3310_9_DK = (RadioButton) findViewById(R.id.rb_C3310_9_DK);
        rb_C3310_9_RA = (RadioButton) findViewById(R.id.rb_C3310_9_RA);
        rb_C3310_10_1 = (RadioButton) findViewById(R.id.rb_C3310_10_1);
        rb_C3310_10_2 = (RadioButton) findViewById(R.id.rb_C3310_10_2);
        rb_C3310_10_DK = (RadioButton) findViewById(R.id.rb_C3310_10_DK);
        rb_C3310_10_RA = (RadioButton) findViewById(R.id.rb_C3310_10_RA);
        rb_C3310_11_1 = (RadioButton) findViewById(R.id.rb_C3310_11_1);
        rb_C3310_11_2 = (RadioButton) findViewById(R.id.rb_C3310_11_2);
        rb_C3310_11_DK = (RadioButton) findViewById(R.id.rb_C3310_11_DK);
        rb_C3310_11_RA = (RadioButton) findViewById(R.id.rb_C3310_11_RA);
        rb_C3311_1 = (RadioButton) findViewById(R.id.rb_C3311_1);
        rb_C3311_2 = (RadioButton) findViewById(R.id.rb_C3311_2);
        rb_C3311_DK = (RadioButton) findViewById(R.id.rb_C3311_DK);
        rb_C3311_RA = (RadioButton) findViewById(R.id.rb_C3311_RA);
        rb_C3312_1 = (RadioButton) findViewById(R.id.rb_C3312_1);
        rb_C3312_2 = (RadioButton) findViewById(R.id.rb_C3312_2);
        rb_C3312_DK = (RadioButton) findViewById(R.id.rb_C3312_DK);
        rb_C3312_RA = (RadioButton) findViewById(R.id.rb_C3312_RA);
        rb_C3313_1 = (RadioButton) findViewById(R.id.rb_C3313_1);
        rb_C3313_2 = (RadioButton) findViewById(R.id.rb_C3313_2);
        rb_C3313_DK = (RadioButton) findViewById(R.id.rb_C3313_DK);
        rb_C3313_RA = (RadioButton) findViewById(R.id.rb_C3313_RA);


        // Edittexts

        ed_C3306_1 = (EditText) findViewById(R.id.ed_C3306_1);
        ed_C3306_2 = (EditText) findViewById(R.id.ed_C3306_2);
        ed_C3307 = (EditText) findViewById(R.id.ed_C3307);
        ed_C3308 = (EditText) findViewById(R.id.ed_C3308);
        ed_C3309 = (EditText) findViewById(R.id.ed_C3309);
        ed_C3314 = (EditText) findViewById(R.id.ed_C3314);

    }

    void events_call() {

        rb_C3301_1.setOnCheckedChangeListener(this);
        rb_C3301_2.setOnCheckedChangeListener(this);
        rb_C3301_DK.setOnCheckedChangeListener(this);
        rb_C3301_RA.setOnCheckedChangeListener(this);
        rb_C3302_1_1.setOnCheckedChangeListener(this);
        rb_C3302_1_2.setOnCheckedChangeListener(this);
        rb_C3302_1_DK.setOnCheckedChangeListener(this);
        rb_C3302_1_RA.setOnCheckedChangeListener(this);
        rb_C3302_2_1.setOnCheckedChangeListener(this);
        rb_C3302_2_2.setOnCheckedChangeListener(this);
        rb_C3302_2_DK.setOnCheckedChangeListener(this);
        rb_C3302_2_RA.setOnCheckedChangeListener(this);
        rb_C3302_3_1.setOnCheckedChangeListener(this);
        rb_C3302_3_2.setOnCheckedChangeListener(this);
        rb_C3302_3_DK.setOnCheckedChangeListener(this);
        rb_C3302_3_RA.setOnCheckedChangeListener(this);
        rb_C3302_4_1.setOnCheckedChangeListener(this);
        rb_C3302_4_2.setOnCheckedChangeListener(this);
        rb_C3302_4_DK.setOnCheckedChangeListener(this);
        rb_C3302_4_RA.setOnCheckedChangeListener(this);
        rb_C3302_5_1.setOnCheckedChangeListener(this);
        rb_C3302_5_2.setOnCheckedChangeListener(this);
        rb_C3302_5_DK.setOnCheckedChangeListener(this);
        rb_C3302_5_RA.setOnCheckedChangeListener(this);
        rb_C3302_6_1.setOnCheckedChangeListener(this);
        rb_C3302_6_2.setOnCheckedChangeListener(this);
        rb_C3302_6_DK.setOnCheckedChangeListener(this);
        rb_C3302_6_RA.setOnCheckedChangeListener(this);
        rb_C3302_7_1.setOnCheckedChangeListener(this);
        rb_C3302_7_2.setOnCheckedChangeListener(this);
        rb_C3302_7_DK.setOnCheckedChangeListener(this);
        rb_C3302_7_RA.setOnCheckedChangeListener(this);
        rb_C3303_1.setOnCheckedChangeListener(this);
        rb_C3303_2.setOnCheckedChangeListener(this);
        rb_C3303_DK.setOnCheckedChangeListener(this);
        rb_C3303_RA.setOnCheckedChangeListener(this);
        rb_C3304_1.setOnCheckedChangeListener(this);
        rb_C3304_2.setOnCheckedChangeListener(this);
        rb_C3304_DK.setOnCheckedChangeListener(this);
        rb_C3304_RA.setOnCheckedChangeListener(this);
        rb_C3305_1.setOnCheckedChangeListener(this);
        rb_C3305_2.setOnCheckedChangeListener(this);
        rb_C3306_1check_1.setOnCheckedChangeListener(this);
        rb_C3306_1check_2.setOnCheckedChangeListener(this);
        rb_C3306_2check_1.setOnCheckedChangeListener(this);
        rb_C3306_2check_2.setOnCheckedChangeListener(this);
        rb_C3310_1_1.setOnCheckedChangeListener(this);
        rb_C3310_1_2.setOnCheckedChangeListener(this);
        rb_C3310_1_DK.setOnCheckedChangeListener(this);
        rb_C3310_1_RA.setOnCheckedChangeListener(this);
        rb_C3310_2_1.setOnCheckedChangeListener(this);
        rb_C3310_2_2.setOnCheckedChangeListener(this);
        rb_C3310_2_DK.setOnCheckedChangeListener(this);
        rb_C3310_2_RA.setOnCheckedChangeListener(this);
        rb_C3310_3_1.setOnCheckedChangeListener(this);
        rb_C3310_3_2.setOnCheckedChangeListener(this);
        rb_C3310_3_DK.setOnCheckedChangeListener(this);
        rb_C3310_3_RA.setOnCheckedChangeListener(this);
        rb_C3310_4_1.setOnCheckedChangeListener(this);
        rb_C3310_4_2.setOnCheckedChangeListener(this);
        rb_C3310_4_DK.setOnCheckedChangeListener(this);
        rb_C3310_4_RA.setOnCheckedChangeListener(this);
        rb_C3310_5_1.setOnCheckedChangeListener(this);
        rb_C3310_5_2.setOnCheckedChangeListener(this);
        rb_C3310_5_DK.setOnCheckedChangeListener(this);
        rb_C3310_5_RA.setOnCheckedChangeListener(this);
        rb_C3310_6_1.setOnCheckedChangeListener(this);
        rb_C3310_6_2.setOnCheckedChangeListener(this);
        rb_C3310_6_DK.setOnCheckedChangeListener(this);
        rb_C3310_6_RA.setOnCheckedChangeListener(this);
        rb_C3310_7_1.setOnCheckedChangeListener(this);
        rb_C3310_7_2.setOnCheckedChangeListener(this);
        rb_C3310_7_DK.setOnCheckedChangeListener(this);
        rb_C3310_7_RA.setOnCheckedChangeListener(this);
        rb_C3310_8_1.setOnCheckedChangeListener(this);
        rb_C3310_8_2.setOnCheckedChangeListener(this);
        rb_C3310_8_DK.setOnCheckedChangeListener(this);
        rb_C3310_8_RA.setOnCheckedChangeListener(this);
        rb_C3310_9_1.setOnCheckedChangeListener(this);
        rb_C3310_9_2.setOnCheckedChangeListener(this);
        rb_C3310_9_DK.setOnCheckedChangeListener(this);
        rb_C3310_9_RA.setOnCheckedChangeListener(this);
        rb_C3310_10_1.setOnCheckedChangeListener(this);
        rb_C3310_10_2.setOnCheckedChangeListener(this);
        rb_C3310_10_DK.setOnCheckedChangeListener(this);
        rb_C3310_10_RA.setOnCheckedChangeListener(this);
        rb_C3310_11_1.setOnCheckedChangeListener(this);
        rb_C3310_11_2.setOnCheckedChangeListener(this);
        rb_C3310_11_DK.setOnCheckedChangeListener(this);
        rb_C3310_11_RA.setOnCheckedChangeListener(this);
        rb_C3311_1.setOnCheckedChangeListener(this);
        rb_C3311_2.setOnCheckedChangeListener(this);
        rb_C3311_DK.setOnCheckedChangeListener(this);
        rb_C3311_RA.setOnCheckedChangeListener(this);
        rb_C3312_1.setOnCheckedChangeListener(this);
        rb_C3312_2.setOnCheckedChangeListener(this);
        rb_C3312_DK.setOnCheckedChangeListener(this);
        rb_C3312_RA.setOnCheckedChangeListener(this);
        rb_C3313_1.setOnCheckedChangeListener(this);
        rb_C3313_2.setOnCheckedChangeListener(this);
        rb_C3313_DK.setOnCheckedChangeListener(this);
        rb_C3313_RA.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3301_1
                || compoundButton.getId() == R.id.rb_C3301_2
                || compoundButton.getId() == R.id.rb_C3301_DK
                || compoundButton.getId() == R.id.rb_C3301_RA) {

            ClearAllcontrol.ClearAll(ll_C3302_1);
            ClearAllcontrol.ClearAll(ll_C3302_2);
            ClearAllcontrol.ClearAll(ll_C3302_3);
            ClearAllcontrol.ClearAll(ll_C3302_4);
            ClearAllcontrol.ClearAll(ll_C3302_5);
            ClearAllcontrol.ClearAll(ll_C3302_6);
            ClearAllcontrol.ClearAll(ll_C3302_7);
            ClearAllcontrol.ClearAll(ll_C3303);

            ll_C3302_1.setVisibility(View.GONE);
            ll_C3302_2.setVisibility(View.GONE);
            ll_C3302_3.setVisibility(View.GONE);
            ll_C3302_4.setVisibility(View.GONE);
            ll_C3302_5.setVisibility(View.GONE);
            ll_C3302_6.setVisibility(View.GONE);
            ll_C3302_7.setVisibility(View.GONE);
            ll_C3303.setVisibility(View.GONE);

            if (rb_C3301_1.isChecked()) {

                ll_C3302_1.setVisibility(View.VISIBLE);
                ll_C3302_2.setVisibility(View.VISIBLE);
                ll_C3302_3.setVisibility(View.VISIBLE);
                ll_C3302_4.setVisibility(View.VISIBLE);
                ll_C3302_5.setVisibility(View.VISIBLE);
                ll_C3302_6.setVisibility(View.VISIBLE);
                ll_C3302_7.setVisibility(View.VISIBLE);
                ll_C3303.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3302_1);
                ClearAllcontrol.ClearAll(ll_C3302_2);
                ClearAllcontrol.ClearAll(ll_C3302_3);
                ClearAllcontrol.ClearAll(ll_C3302_4);
                ClearAllcontrol.ClearAll(ll_C3302_5);
                ClearAllcontrol.ClearAll(ll_C3302_6);
                ClearAllcontrol.ClearAll(ll_C3302_7);
                ClearAllcontrol.ClearAll(ll_C3303);

                ll_C3302_1.setVisibility(View.GONE);
                ll_C3302_2.setVisibility(View.GONE);
                ll_C3302_3.setVisibility(View.GONE);
                ll_C3302_4.setVisibility(View.GONE);
                ll_C3302_5.setVisibility(View.GONE);
                ll_C3302_6.setVisibility(View.GONE);
                ll_C3302_7.setVisibility(View.GONE);
                ll_C3303.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3302_7_1
                || compoundButton.getId() == R.id.rb_C3302_7_2
                || compoundButton.getId() == R.id.rb_C3302_7_DK
                || compoundButton.getId() == R.id.rb_C3302_7_RA) {

            ClearAllcontrol.ClearAll(ll_C3303);
            ll_C3303.setVisibility(View.GONE);

            if (rb_C3302_7_1.isChecked()) {

                ll_C3303.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3303);
                ll_C3303.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3304_1
                || compoundButton.getId() == R.id.rb_C3304_2
                || compoundButton.getId() == R.id.rb_C3304_DK
                || compoundButton.getId() == R.id.rb_C3304_RA) {

            ClearAllcontrol.ClearAll(ll_C3305);
            ClearAllcontrol.ClearAll(ll_C3306_1check);
            ClearAllcontrol.ClearAll(ll_C3306_1);
            ClearAllcontrol.ClearAll(ll_C3306_2check);
            ClearAllcontrol.ClearAll(ll_C3306_2);
            ClearAllcontrol.ClearAll(ll_C3307);
            ClearAllcontrol.ClearAll(ll_C3308);
            ClearAllcontrol.ClearAll(ll_C3309);

            ll_C3305.setVisibility(View.GONE);
            ll_C3306_1check.setVisibility(View.GONE);
            ll_C3306_1.setVisibility(View.GONE);
            ll_C3306_2check.setVisibility(View.GONE);
            ll_C3306_2.setVisibility(View.GONE);
            ll_C3307.setVisibility(View.GONE);
            ll_C3308.setVisibility(View.GONE);
            ll_C3309.setVisibility(View.GONE);

            if (rb_C3304_1.isChecked()) {

                ll_C3305.setVisibility(View.VISIBLE);
                ll_C3306_1check.setVisibility(View.VISIBLE);
                ll_C3306_1.setVisibility(View.VISIBLE);
                ll_C3306_2check.setVisibility(View.VISIBLE);
                ll_C3306_2.setVisibility(View.VISIBLE);
                ll_C3307.setVisibility(View.VISIBLE);
                ll_C3308.setVisibility(View.VISIBLE);
                ll_C3309.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3305);
                ClearAllcontrol.ClearAll(ll_C3306_1check);
                ClearAllcontrol.ClearAll(ll_C3306_1);
                ClearAllcontrol.ClearAll(ll_C3306_2check);
                ClearAllcontrol.ClearAll(ll_C3306_2);
                ClearAllcontrol.ClearAll(ll_C3307);
                ClearAllcontrol.ClearAll(ll_C3308);
                ClearAllcontrol.ClearAll(ll_C3309);

                ll_C3305.setVisibility(View.GONE);
                ll_C3306_1check.setVisibility(View.GONE);
                ll_C3306_1.setVisibility(View.GONE);
                ll_C3306_2check.setVisibility(View.GONE);
                ll_C3306_2.setVisibility(View.GONE);
                ll_C3307.setVisibility(View.GONE);
                ll_C3308.setVisibility(View.GONE);
                ll_C3309.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3305_1
                || compoundButton.getId() == R.id.rb_C3305_2) {

            ClearAllcontrol.ClearAll(ll_C3306_1check);
            ClearAllcontrol.ClearAll(ll_C3306_1);
            ClearAllcontrol.ClearAll(ll_C3306_2check);
            ClearAllcontrol.ClearAll(ll_C3306_2);
            ClearAllcontrol.ClearAll(ll_C3307);
            ClearAllcontrol.ClearAll(ll_C3308);
            ClearAllcontrol.ClearAll(ll_C3309);

            ll_C3306_1check.setVisibility(View.GONE);
            ll_C3306_1.setVisibility(View.GONE);
            ll_C3306_2check.setVisibility(View.GONE);
            ll_C3306_2.setVisibility(View.GONE);
            ll_C3307.setVisibility(View.GONE);
            ll_C3308.setVisibility(View.GONE);
            ll_C3309.setVisibility(View.GONE);

            if (rb_C3305_1.isChecked()) {

                ll_C3306_1check.setVisibility(View.VISIBLE);
                ll_C3306_1.setVisibility(View.VISIBLE);
                ll_C3306_2check.setVisibility(View.VISIBLE);
                ll_C3306_2.setVisibility(View.VISIBLE);
                ll_C3307.setVisibility(View.VISIBLE);
                ll_C3308.setVisibility(View.VISIBLE);
                ll_C3309.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3306_1check);
                ClearAllcontrol.ClearAll(ll_C3306_1);
                ClearAllcontrol.ClearAll(ll_C3306_2check);
                ClearAllcontrol.ClearAll(ll_C3306_2);
                ClearAllcontrol.ClearAll(ll_C3307);
                ClearAllcontrol.ClearAll(ll_C3308);
                ClearAllcontrol.ClearAll(ll_C3309);

                ll_C3306_1check.setVisibility(View.GONE);
                ll_C3306_1.setVisibility(View.GONE);
                ll_C3306_2check.setVisibility(View.GONE);
                ll_C3306_2.setVisibility(View.GONE);
                ll_C3307.setVisibility(View.GONE);
                ll_C3308.setVisibility(View.GONE);
                ll_C3309.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3306_1check_1
                || compoundButton.getId() == R.id.rb_C3306_1check_2) {

            ClearAllcontrol.ClearAll(ll_C3306_1);
            ll_C3306_1.setVisibility(View.GONE);

            if (rb_C3306_1check_1.isChecked()) {

                ll_C3306_1.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3306_1);
                ll_C3306_1.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3306_2check_1
                || compoundButton.getId() == R.id.rb_C3306_2check_2) {

            ClearAllcontrol.ClearAll(ll_C3306_2);
            ll_C3306_2.setVisibility(View.GONE);

            if (rb_C3306_2check_1.isChecked()) {

                ll_C3306_2.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3306_2);
                ll_C3306_2.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3313_1
                || compoundButton.getId() == R.id.rb_C3313_2
                || compoundButton.getId() == R.id.rb_C3313_DK
                || compoundButton.getId() == R.id.rb_C3313_RA) {

            ClearAllcontrol.ClearAll(ll_C3314);
            ll_C3314.setVisibility(View.GONE);

            if (rb_C3313_1.isChecked()) {

                ll_C3314.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3314);
                ll_C3314.setVisibility(View.GONE);
            }
        }
    }

    void value_assignment() {

        study_id = "0";

        C3301 = "000";
        C3302_1 = "000";
        C3302_2 = "000";
        C3302_3 = "000";
        C3302_4 = "000";
        C3302_5 = "000";
        C3302_6 = "000";
        C3302_7 = "000";
        C3303 = "000";
        C3304 = "000";
        C3305 = "000";
        C3306_1check = "000";
        C3306_1 = "000";
        C3306_2check = "000";
        C3306_2 = "000";
        C3307 = "000";
        C3308 = "000";
        C3309 = "000";
        C3310_1 = "000";
        C3310_2 = "000";
        C3310_3 = "000";
        C3310_4 = "000";
        C3310_5 = "000";
        C3310_6 = "000";
        C3310_7 = "000";
        C3310_8 = "000";
        C3310_9 = "000";
        C3310_10 = "000";
        C3310_11 = "000";
        C3311 = "000";
        C3312 = "000";
        C3313 = "000";
        C3314 = "000";
        STATUS = "0";

        if (rb_C3301_1.isChecked()) {
            C3301 = "1";
        } else if (rb_C3301_2.isChecked()) {
            C3301 = "2";
        } else if (rb_C3301_DK.isChecked()) {
            C3301 = "9";
        } else if (rb_C3301_RA.isChecked()) {
            C3301 = "8";
        }

        if (rb_C3302_1_1.isChecked()) {
            C3302_1 = "1";
        } else if (rb_C3302_1_2.isChecked()) {
            C3302_1 = "2";
        } else if (rb_C3302_1_DK.isChecked()) {
            C3302_1 = "9";
        } else if (rb_C3302_1_RA.isChecked()) {
            C3302_1 = "8";
        }

        if (rb_C3302_2_1.isChecked()) {
            C3302_2 = "1";
        } else if (rb_C3302_2_2.isChecked()) {
            C3302_2 = "2";
        } else if (rb_C3302_2_DK.isChecked()) {
            C3302_2 = "9";
        } else if (rb_C3302_2_RA.isChecked()) {
            C3302_2 = "8";
        }

        if (rb_C3302_3_1.isChecked()) {
            C3302_3 = "1";
        } else if (rb_C3302_3_2.isChecked()) {
            C3302_3 = "2";
        } else if (rb_C3302_3_DK.isChecked()) {
            C3302_3 = "9";
        } else if (rb_C3302_3_RA.isChecked()) {
            C3302_3 = "8";
        }

        if (rb_C3302_4_1.isChecked()) {
            C3302_4 = "1";
        } else if (rb_C3302_4_2.isChecked()) {
            C3302_4 = "2";
        } else if (rb_C3302_4_DK.isChecked()) {
            C3302_4 = "9";
        } else if (rb_C3302_4_RA.isChecked()) {
            C3302_4 = "8";
        }

        if (rb_C3302_5_1.isChecked()) {
            C3302_5 = "1";
        } else if (rb_C3302_5_2.isChecked()) {
            C3302_5 = "2";
        } else if (rb_C3302_5_DK.isChecked()) {
            C3302_5 = "9";
        } else if (rb_C3302_5_RA.isChecked()) {
            C3302_5 = "8";
        }

        if (rb_C3302_6_1.isChecked()) {
            C3302_6 = "1";
        } else if (rb_C3302_6_2.isChecked()) {
            C3302_6 = "2";
        } else if (rb_C3302_6_DK.isChecked()) {
            C3302_6 = "9";
        } else if (rb_C3302_6_RA.isChecked()) {
            C3302_6 = "8";
        }

        if (rb_C3302_7_1.isChecked()) {
            C3302_7 = "1";
        } else if (rb_C3302_7_2.isChecked()) {
            C3302_7 = "2";
        } else if (rb_C3302_7_DK.isChecked()) {
            C3302_7 = "9";
        } else if (rb_C3302_7_RA.isChecked()) {
            C3302_7 = "8";
        }

        if (rb_C3303_1.isChecked()) {
            C3303 = "1";
        } else if (rb_C3303_2.isChecked()) {
            C3303 = "2";
        } else if (rb_C3303_DK.isChecked()) {
            C3303 = "9";
        } else if (rb_C3303_RA.isChecked()) {
            C3303 = "8";
        }

        if (rb_C3304_1.isChecked()) {
            C3304 = "1";
        } else if (rb_C3304_2.isChecked()) {
            C3304 = "2";
        } else if (rb_C3304_DK.isChecked()) {
            C3304 = "9";
        } else if (rb_C3304_RA.isChecked()) {
            C3304 = "8";
        }

        if (rb_C3305_1.isChecked()) {
            C3305 = "1";
        } else if (rb_C3305_2.isChecked()) {
            C3305 = "2";
        }

        if (rb_C3306_1check_1.isChecked()) {
            C3306_1check = "1";
        } else if (rb_C3306_1check_2.isChecked()) {
            C3306_1check = "2";
        }

        if (ed_C3306_1.getText().toString().trim().length() > 0) {
            C3306_1 = ed_C3306_1.getText().toString().trim();
        }

        if (rb_C3306_2check_1.isChecked()) {
            C3306_2check = "1";
        } else if (rb_C3306_2check_2.isChecked()) {
            C3306_2check = "2";
        }

        if (ed_C3306_2.getText().toString().trim().length() > 0) {
            C3306_2 = ed_C3306_2.getText().toString().trim();
        }

        if (ed_C3307.getText().toString().trim().length() > 0) {
            C3307 = ed_C3307.getText().toString().trim();
        }

        if (ed_C3308.getText().toString().trim().length() > 0) {
            C3308 = ed_C3308.getText().toString().trim();
        }

        if (ed_C3309.getText().toString().trim().length() > 0) {
            C3309 = ed_C3309.getText().toString().trim();
        }

        if (rb_C3310_1_1.isChecked()) {
            C3310_1 = "1";
        } else if (rb_C3310_1_2.isChecked()) {
            C3310_1 = "2";
        } else if (rb_C3310_1_DK.isChecked()) {
            C3310_1 = "9";
        } else if (rb_C3310_1_RA.isChecked()) {
            C3310_1 = "8";
        }

        if (rb_C3310_2_1.isChecked()) {
            C3310_2 = "1";
        } else if (rb_C3310_2_2.isChecked()) {
            C3310_2 = "2";
        } else if (rb_C3310_2_DK.isChecked()) {
            C3310_2 = "9";
        } else if (rb_C3310_2_RA.isChecked()) {
            C3310_2 = "8";
        }

        if (rb_C3310_3_1.isChecked()) {
            C3310_3 = "1";
        } else if (rb_C3310_3_2.isChecked()) {
            C3310_3 = "2";
        } else if (rb_C3310_3_DK.isChecked()) {
            C3310_3 = "9";
        } else if (rb_C3310_3_RA.isChecked()) {
            C3310_3 = "8";
        }

        if (rb_C3310_4_1.isChecked()) {
            C3310_4 = "1";
        } else if (rb_C3310_4_2.isChecked()) {
            C3310_4 = "2";
        } else if (rb_C3310_4_DK.isChecked()) {
            C3310_4 = "9";
        } else if (rb_C3310_4_RA.isChecked()) {
            C3310_4 = "8";
        }

        if (rb_C3310_5_1.isChecked()) {
            C3310_5 = "1";
        } else if (rb_C3310_5_2.isChecked()) {
            C3310_5 = "2";
        } else if (rb_C3310_5_DK.isChecked()) {
            C3310_5 = "9";
        } else if (rb_C3310_5_RA.isChecked()) {
            C3310_5 = "8";
        }

        if (rb_C3310_6_1.isChecked()) {
            C3310_6 = "1";
        } else if (rb_C3310_6_2.isChecked()) {
            C3310_6 = "2";
        } else if (rb_C3310_6_DK.isChecked()) {
            C3310_6 = "9";
        } else if (rb_C3310_6_RA.isChecked()) {
            C3310_6 = "8";
        }

        if (rb_C3310_7_1.isChecked()) {
            C3310_7 = "1";
        } else if (rb_C3310_7_2.isChecked()) {
            C3310_7 = "2";
        } else if (rb_C3310_7_DK.isChecked()) {
            C3310_7 = "9";
        } else if (rb_C3310_7_RA.isChecked()) {
            C3310_7 = "8";
        }

        if (rb_C3310_8_1.isChecked()) {
            C3310_8 = "1";
        } else if (rb_C3310_8_2.isChecked()) {
            C3310_8 = "2";
        } else if (rb_C3310_8_DK.isChecked()) {
            C3310_8 = "9";
        } else if (rb_C3310_8_RA.isChecked()) {
            C3310_8 = "8";
        }

        if (rb_C3310_9_1.isChecked()) {
            C3310_9 = "1";
        } else if (rb_C3310_9_2.isChecked()) {
            C3310_9 = "2";
        } else if (rb_C3310_9_DK.isChecked()) {
            C3310_9 = "9";
        } else if (rb_C3310_9_RA.isChecked()) {
            C3310_9 = "8";
        }

        if (rb_C3310_10_1.isChecked()) {
            C3310_10 = "1";
        } else if (rb_C3310_10_2.isChecked()) {
            C3310_10 = "2";
        } else if (rb_C3310_10_DK.isChecked()) {
            C3310_10 = "9";
        } else if (rb_C3310_10_RA.isChecked()) {
            C3310_10 = "8";
        }

        if (rb_C3310_11_1.isChecked()) {
            C3310_11 = "1";
        } else if (rb_C3310_11_2.isChecked()) {
            C3310_11 = "2";
        } else if (rb_C3310_11_DK.isChecked()) {
            C3310_11 = "9";
        } else if (rb_C3310_11_RA.isChecked()) {
            C3310_11 = "8";
        }

        if (rb_C3311_1.isChecked()) {
            C3311 = "1";
        } else if (rb_C3311_2.isChecked()) {
            C3311 = "2";
        } else if (rb_C3311_DK.isChecked()) {
            C3311 = "9";
        } else if (rb_C3311_RA.isChecked()) {
            C3311 = "8";
        }

        if (rb_C3312_1.isChecked()) {
            C3312 = "1";
        } else if (rb_C3312_2.isChecked()) {
            C3312 = "2";
        } else if (rb_C3312_DK.isChecked()) {
            C3312 = "9";
        } else if (rb_C3312_RA.isChecked()) {
            C3312 = "8";
        }

        if (rb_C3313_1.isChecked()) {
            C3313 = "1";
        } else if (rb_C3313_2.isChecked()) {
            C3313 = "2";
        } else if (rb_C3313_DK.isChecked()) {
            C3313 = "9";
        } else if (rb_C3313_RA.isChecked()) {
            C3313 = "8";
        }

        if (ed_C3314.getText().toString().trim().length() > 0) {
            C3314 = ed_C3314.getText().toString().trim();
        }


    }

    void insert_data() {

        String query = "insert into C3301_C3314("

                + global.C.C.C3001_C3011.study_id + ","
                + global.C.C.C3301_C3314.C3301 + ","
                + global.C.C.C3301_C3314.C3302_1 + ","
                + global.C.C.C3301_C3314.C3302_2 + ","
                + global.C.C.C3301_C3314.C3302_3 + ","
                + global.C.C.C3301_C3314.C3302_4 + ","
                + global.C.C.C3301_C3314.C3302_5 + ","
                + global.C.C.C3301_C3314.C3302_6 + ","
                + global.C.C.C3301_C3314.C3302_7 + ","
                + global.C.C.C3301_C3314.C3303 + ","
                + global.C.C.C3301_C3314.C3304 + ","
                + global.C.C.C3301_C3314.C3305 + ","
                + global.C.C.C3301_C3314.C3306_1check + ","
                + global.C.C.C3301_C3314.C3306_1 + ","
                + global.C.C.C3301_C3314.C3306_2check + ","
                + global.C.C.C3301_C3314.C3306_2 + ","
                + global.C.C.C3301_C3314.C3307 + ","
                + global.C.C.C3301_C3314.C3308 + ","
                + global.C.C.C3301_C3314.C3309 + ","
                + global.C.C.C3301_C3314.C3310_1 + ","
                + global.C.C.C3301_C3314.C3310_2 + ","
                + global.C.C.C3301_C3314.C3310_3 + ","
                + global.C.C.C3301_C3314.C3310_4 + ","
                + global.C.C.C3301_C3314.C3310_5 + ","
                + global.C.C.C3301_C3314.C3310_6 + ","
                + global.C.C.C3301_C3314.C3310_7 + ","
                + global.C.C.C3301_C3314.C3310_8 + ","
                + global.C.C.C3301_C3314.C3310_9 + ","
                + global.C.C.C3301_C3314.C3310_10 + ","
                + global.C.C.C3301_C3314.C3310_11 + ","
                + global.C.C.C3301_C3314.C3311 + ","
                + global.C.C.C3301_C3314.C3312 + ","
                + global.C.C.C3301_C3314.C3313 + ","
                + global.C.C.C3301_C3314.C3314 + ","
                + global.C.C.C3001_C3011.STATUS + ") values ('" +

                study_id + "','" +
                C3301 + "','" +
                C3302_1 + "','" +
                C3302_2 + "','" +
                C3302_3 + "','" +
                C3302_4 + "','" +
                C3302_5 + "','" +
                C3302_6 + "','" +
                C3302_7 + "','" +
                C3303 + "','" +
                C3304 + "','" +
                C3305 + "','" +
                C3306_1check + "','" +
                C3306_1 + "','" +
                C3306_2check + "','" +
                C3306_2 + "','" +
                C3307 + "','" +
                C3308 + "','" +
                C3309 + "','" +
                C3310_1 + "','" +
                C3310_2 + "','" +
                C3310_3 + "','" +
                C3310_4 + "','" +
                C3310_5 + "','" +
                C3310_6 + "','" +
                C3310_7 + "','" +
                C3310_8 + "','" +
                C3310_9 + "','" +
                C3310_10 + "','" +
                C3310_11 + "','" +
                C3311 + "','" +
                C3312 + "','" +
                C3313 + "','" +
                C3314 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 11: Treatment received during fatal illness", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_C3301) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3302_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3303) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3304) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3305) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3306_1check) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3306_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3306_2check) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3306_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3307) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3308) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3309) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3310_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3311) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3312) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3313) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_C3314) != false;
    }

}
