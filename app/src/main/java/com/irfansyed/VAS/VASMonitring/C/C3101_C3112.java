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

import com.irfansyed.VAS.VASMonitring.Gothrough;
import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;
import utils.ClearAllcontrol;


public class C3101_C3112 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, View.OnFocusChangeListener {


    // Region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_C3101,
            ll_C3102,
            ll_C3103,
            ll_C3104,
            ll_C3105,
            ll_C3106,
            ll_C3107_1,
            ll_C3107_2,
            ll_C3107_3,
            ll_C3107_4,
            ll_C3107_5,
            ll_C3107_6,
            ll_C3107_6_OT,
            ll_C3107_7,
            ll_C3107_8,
            ll_C3107_9,
            ll_C3107_10,
            ll_C3107_11,
            ll_C3107_12,
            ll_C3107_13,
            ll_C3107_14,
            ll_C3107_15,
            ll_C3107_16,
            ll_C3107_17,
            ll_C3107_18,
            ll_C3107_19,
            ll_C3107_20,
            ll_C3107_21,
            ll_C3107_21_OT,
            ll_C3108,
            ll_C3109_1,
            ll_C3109_2,
            ll_C3109_3,
            ll_C3109_4,
            ll_C3109_5,
            ll_C3109_6,
            ll_C3109_7,
            ll_C3109_8,
            ll_C3109_9,
            ll_C3109_10,
            ll_C3109_11,
            ll_C3109_12,
            ll_C3109_13,
            ll_C3109_14,
            ll_C3110,
            ll_C3111,
            ll_C3111_1,
            ll_C3111_2,
            ll_C3111_3,
            ll_C3111_4,
            ll_C3111_5,
            ll_C3111_6,
            ll_C3111_7,
            ll_C3111_8,
            ll_C3111_9,
            ll_C3112;

    RadioButton
            rb_C3101_1,
            rb_C3101_2,
            rb_C3101_3,
            rb_C3101_DK,
            rb_C3102_1,
            rb_C3102_2,
            rb_C3102_3,
            rb_C3102_DK,
            rb_C3103_1,
            rb_C3103_2,
            rb_C3103_DK,
            rb_C3104_1,
            rb_C3104_2,
            rb_C3104_DK,
            rb_C3105_1,
            rb_C3105_2,
            rb_C3105_3,
            rb_C3105_4,
            rb_C3105_DK,
            rb_C3106_1,
            rb_C3106_2,
            rb_C3106_DK,
            rb_C3107_1_1,
            rb_C3107_1_2,
            rb_C3107_1_DK,
            rb_C3107_2_1,
            rb_C3107_2_2,
            rb_C3107_2_DK,
            rb_C3107_3_1,
            rb_C3107_3_2,
            rb_C3107_3_DK,
            rb_C3107_4_1,
            rb_C3107_4_2,
            rb_C3107_4_DK,
            rb_C3107_5_1,
            rb_C3107_5_2,
            rb_C3107_5_DK,
            rb_C3107_6_1,
            rb_C3107_6_2,
            rb_C3107_6_DK,
            rb_C3107_7_1,
            rb_C3107_7_2,
            rb_C3107_7_DK,
            rb_C3107_8_1,
            rb_C3107_8_2,
            rb_C3107_8_DK,
            rb_C3107_9_1,
            rb_C3107_9_2,
            rb_C3107_9_DK,
            rb_C3107_10_1,
            rb_C3107_10_2,
            rb_C3107_10_DK,
            rb_C3107_11_1,
            rb_C3107_11_2,
            rb_C3107_11_DK,
            rb_C3107_12_1,
            rb_C3107_12_2,
            rb_C3107_12_DK,
            rb_C3107_13_1,
            rb_C3107_13_2,
            rb_C3107_13_DK,
            rb_C3107_14_1,
            rb_C3107_14_2,
            rb_C3107_14_DK,
            rb_C3107_15_1,
            rb_C3107_15_2,
            rb_C3107_15_DK,
            rb_C3107_16_1,
            rb_C3107_16_2,
            rb_C3107_16_DK,
            rb_C3107_17_1,
            rb_C3107_17_2,
            rb_C3107_17_DK,
            rb_C3107_18_1,
            rb_C3107_18_2,
            rb_C3107_18_DK,
            rb_C3107_19_1,
            rb_C3107_19_2,
            rb_C3107_19_DK,
            rb_C3107_20_1,
            rb_C3107_20_2,
            rb_C3107_20_DK,
            rb_C3107_21_1,
            rb_C3107_21_2,
            rb_C3107_21_DK,
            rb_C3108_1,
            rb_C3108_2,
            rb_C3108_3,
            rb_C3109_1_1,
            rb_C3109_1_2,
            rb_C3109_1_DK,
            rb_C3109_1_NR,
            rb_C3109_2_1,
            rb_C3109_2_2,
            rb_C3109_2_DK,
            rb_C3109_2_NR,
            rb_C3109_3_1,
            rb_C3109_3_2,
            rb_C3109_3_DK,
            rb_C3109_3_NR,
            rb_C3109_4_1,
            rb_C3109_4_2,
            rb_C3109_4_DK,
            rb_C3109_4_NR,
            rb_C3109_5_1,
            rb_C3109_5_2,
            rb_C3109_5_DK,
            rb_C3109_5_NR,
            rb_C3109_6_1,
            rb_C3109_6_2,
            rb_C3109_6_DK,
            rb_C3109_6_NR,
            rb_C3109_7_1,
            rb_C3109_7_2,
            rb_C3109_7_DK,
            rb_C3109_7_NR,
            rb_C3109_8_1,
            rb_C3109_8_2,
            rb_C3109_8_DK,
            rb_C3109_8_NR,
            rb_C3109_9_1,
            rb_C3109_9_2,
            rb_C3109_9_DK,
            rb_C3109_9_NR,
            rb_C3109_10_1,
            rb_C3109_10_2,
            rb_C3109_10_DK,
            rb_C3109_10_NR,
            rb_C3109_11_1,
            rb_C3109_11_2,
            rb_C3109_11_DK,
            rb_C3109_11_NR,
            rb_C3109_12_1,
            rb_C3109_12_2,
            rb_C3109_12_DK,
            rb_C3109_12_NR,
            rb_C3109_13_1,
            rb_C3109_13_2,
            rb_C3109_13_DK,
            rb_C3109_13_NR,
            rb_C3109_14_1,
            rb_C3109_14_2,
            rb_C3109_14_DK,
            rb_C3109_14_NR,
            rb_C3110_1,
            rb_C3110_2,
            rb_C3110_DK,
            rb_C3111_1,
            rb_C3111_2,
            rb_C3111_DK,
            rb_C3111_1_1,
            rb_C3111_1_2,
            rb_C3111_1_DK,
            rb_C3111_3_1,
            rb_C3111_3_2,
            rb_C3111_3_DK,
            rb_C3111_5_1,
            rb_C3111_5_2,
            rb_C3111_5_DK,
            rb_C3111_7_1,
            rb_C3111_7_2,
            rb_C3111_7_DK,
            rb_C3111_8_1,
            rb_C3111_8_2,
            rb_C3111_8_DK,
            rb_C3112_1,
            rb_C3112_2,
            rb_C3112_DK;


    EditText
            ed_study_id,
            ed_C3107_6_OT,
            ed_C3107_21_OT,
            ed_C3111_2,
            ed_C3111_4,
            ed_C3111_6,
            ed_C3111_9;


    String
            C3101,
            C3102,
            C3103,
            C3104,
            C3105,
            C3106,
            C3107_1,
            C3107_2,
            C3107_3,
            C3107_4,
            C3107_5,
            C3107_6,
            C3107_6_OT,
            C3107_7,
            C3107_8,
            C3107_9,
            C3107_10,
            C3107_11,
            C3107_12,
            C3107_13,
            C3107_14,
            C3107_15,
            C3107_16,
            C3107_17,
            C3107_18,
            C3107_19,
            C3107_20,
            C3107_21,
            C3107_21_OT,
            C3108,
            C3109_1,
            C3109_2,
            C3109_3,
            C3109_4,
            C3109_5,
            C3109_6,
            C3109_7,
            C3109_8,
            C3109_9,
            C3109_10,
            C3109_11,
            C3109_12,
            C3109_13,
            C3109_14,
            C3110,
            C3111,
            C3111_1,
            C3111_2,
            C3111_3,
            C3111_4,
            C3111_5,
            C3111_6,
            C3111_7,
            C3111_8,
            C3111_9,
            C3112,
            STATUS,
            study_id;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3101_c3112);

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

        //Toast.makeText(this, "Section 4 Inserted Successfully...", Toast.LENGTH_LONG).show();

        Intent c = new Intent(this, C3121_C3228.class);

        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = (Button) findViewById(R.id.btn_next);

        // Layouts
        ll_C3101 = (LinearLayout) findViewById(R.id.ll_C3101);
        ll_C3102 = (LinearLayout) findViewById(R.id.ll_C3102);
        ll_C3103 = (LinearLayout) findViewById(R.id.ll_C3103);
        ll_C3104 = (LinearLayout) findViewById(R.id.ll_C3104);
        ll_C3105 = (LinearLayout) findViewById(R.id.ll_C3105);
        ll_C3106 = (LinearLayout) findViewById(R.id.ll_C3106);
        ll_C3107_1 = (LinearLayout) findViewById(R.id.ll_C3107_1);
        ll_C3107_2 = (LinearLayout) findViewById(R.id.ll_C3107_2);
        ll_C3107_3 = (LinearLayout) findViewById(R.id.ll_C3107_3);
        ll_C3107_4 = (LinearLayout) findViewById(R.id.ll_C3107_4);
        ll_C3107_5 = (LinearLayout) findViewById(R.id.ll_C3107_5);
        ll_C3107_6 = (LinearLayout) findViewById(R.id.ll_C3107_6);
        ll_C3107_6_OT = (LinearLayout) findViewById(R.id.ll_C3107_6_OT);
        ll_C3107_7 = (LinearLayout) findViewById(R.id.ll_C3107_7);
        ll_C3107_8 = (LinearLayout) findViewById(R.id.ll_C3107_8);
        ll_C3107_9 = (LinearLayout) findViewById(R.id.ll_C3107_9);
        ll_C3107_10 = (LinearLayout) findViewById(R.id.ll_C3107_10);
        ll_C3107_11 = (LinearLayout) findViewById(R.id.ll_C3107_11);
        ll_C3107_12 = (LinearLayout) findViewById(R.id.ll_C3107_12);
        ll_C3107_13 = (LinearLayout) findViewById(R.id.ll_C3107_13);
        ll_C3107_14 = (LinearLayout) findViewById(R.id.ll_C3107_14);
        ll_C3107_15 = (LinearLayout) findViewById(R.id.ll_C3107_15);
        ll_C3107_16 = (LinearLayout) findViewById(R.id.ll_C3107_16);
        ll_C3107_17 = (LinearLayout) findViewById(R.id.ll_C3107_17);
        ll_C3107_18 = (LinearLayout) findViewById(R.id.ll_C3107_18);
        ll_C3107_19 = (LinearLayout) findViewById(R.id.ll_C3107_19);
        ll_C3107_20 = (LinearLayout) findViewById(R.id.ll_C3107_20);
        ll_C3107_21 = (LinearLayout) findViewById(R.id.ll_C3107_21);
        ll_C3107_21_OT = (LinearLayout) findViewById(R.id.ll_C3107_21_OT);
        ll_C3108 = (LinearLayout) findViewById(R.id.ll_C3108);
        ll_C3109_1 = (LinearLayout) findViewById(R.id.ll_C3109_1);
        ll_C3109_2 = (LinearLayout) findViewById(R.id.ll_C3109_2);
        ll_C3109_3 = (LinearLayout) findViewById(R.id.ll_C3109_3);
        ll_C3109_4 = (LinearLayout) findViewById(R.id.ll_C3109_4);
        ll_C3109_5 = (LinearLayout) findViewById(R.id.ll_C3109_5);
        ll_C3109_6 = (LinearLayout) findViewById(R.id.ll_C3109_6);
        ll_C3109_7 = (LinearLayout) findViewById(R.id.ll_C3109_7);
        ll_C3109_8 = (LinearLayout) findViewById(R.id.ll_C3109_8);
        ll_C3109_9 = (LinearLayout) findViewById(R.id.ll_C3109_9);
        ll_C3109_10 = (LinearLayout) findViewById(R.id.ll_C3109_10);
        ll_C3109_11 = (LinearLayout) findViewById(R.id.ll_C3109_11);
        ll_C3109_12 = (LinearLayout) findViewById(R.id.ll_C3109_12);
        ll_C3109_13 = (LinearLayout) findViewById(R.id.ll_C3109_13);
        ll_C3109_14 = (LinearLayout) findViewById(R.id.ll_C3109_14);
        ll_C3110 = (LinearLayout) findViewById(R.id.ll_C3110);
        ll_C3111 = (LinearLayout) findViewById(R.id.ll_C3111);
        ll_C3111_1 = (LinearLayout) findViewById(R.id.ll_C3111_1);
        ll_C3111_2 = (LinearLayout) findViewById(R.id.ll_C3111_2);
        ll_C3111_3 = (LinearLayout) findViewById(R.id.ll_C3111_3);
        ll_C3111_4 = (LinearLayout) findViewById(R.id.ll_C3111_4);
        ll_C3111_5 = (LinearLayout) findViewById(R.id.ll_C3111_5);
        ll_C3111_6 = (LinearLayout) findViewById(R.id.ll_C3111_6);
        ll_C3111_7 = (LinearLayout) findViewById(R.id.ll_C3111_7);
        ll_C3111_8 = (LinearLayout) findViewById(R.id.ll_C3111_8);
        ll_C3111_9 = (LinearLayout) findViewById(R.id.ll_C3111_9);
        ll_C3112 = (LinearLayout) findViewById(R.id.ll_C3112);


        // Radio Buttons
        rb_C3101_1 = (RadioButton) findViewById(R.id.rb_C3101_1);
        rb_C3101_2 = (RadioButton) findViewById(R.id.rb_C3101_2);
        rb_C3101_3 = (RadioButton) findViewById(R.id.rb_C3101_3);
        rb_C3101_DK = (RadioButton) findViewById(R.id.rb_C3101_DK);


        rb_C3102_1 = (RadioButton) findViewById(R.id.rb_C3102_1);
        rb_C3102_2 = (RadioButton) findViewById(R.id.rb_C3102_2);
        rb_C3102_3 = (RadioButton) findViewById(R.id.rb_C3102_3);
        rb_C3102_DK = (RadioButton) findViewById(R.id.rb_C3102_DK);


        rb_C3103_1 = (RadioButton) findViewById(R.id.rb_C3103_1);
        rb_C3103_2 = (RadioButton) findViewById(R.id.rb_C3103_2);
        rb_C3103_DK = (RadioButton) findViewById(R.id.rb_C3103_DK);


        rb_C3104_1 = (RadioButton) findViewById(R.id.rb_C3104_1);
        rb_C3104_2 = (RadioButton) findViewById(R.id.rb_C3104_2);
        rb_C3104_DK = (RadioButton) findViewById(R.id.rb_C3104_DK);


        rb_C3105_1 = (RadioButton) findViewById(R.id.rb_C3105_1);
        rb_C3105_2 = (RadioButton) findViewById(R.id.rb_C3105_2);
        rb_C3105_3 = (RadioButton) findViewById(R.id.rb_C3105_3);
        rb_C3105_4 = (RadioButton) findViewById(R.id.rb_C3105_4);
        rb_C3105_DK = (RadioButton) findViewById(R.id.rb_C3105_DK);


        rb_C3106_1 = (RadioButton) findViewById(R.id.rb_C3106_1);
        rb_C3106_2 = (RadioButton) findViewById(R.id.rb_C3106_2);
        rb_C3106_DK = (RadioButton) findViewById(R.id.rb_C3106_DK);


        rb_C3107_1_1 = (RadioButton) findViewById(R.id.rb_C3107_1_1);
        rb_C3107_1_2 = (RadioButton) findViewById(R.id.rb_C3107_1_2);
        rb_C3107_1_DK = (RadioButton) findViewById(R.id.rb_C3107_1_DK);

        rb_C3107_2_1 = (RadioButton) findViewById(R.id.rb_C3107_2_1);
        rb_C3107_2_2 = (RadioButton) findViewById(R.id.rb_C3107_2_2);
        rb_C3107_2_DK = (RadioButton) findViewById(R.id.rb_C3107_2_DK);

        rb_C3107_3_1 = (RadioButton) findViewById(R.id.rb_C3107_3_1);
        rb_C3107_3_2 = (RadioButton) findViewById(R.id.rb_C3107_3_2);
        rb_C3107_3_DK = (RadioButton) findViewById(R.id.rb_C3107_3_DK);

        rb_C3107_4_1 = (RadioButton) findViewById(R.id.rb_C3107_4_1);
        rb_C3107_4_2 = (RadioButton) findViewById(R.id.rb_C3107_4_2);
        rb_C3107_4_DK = (RadioButton) findViewById(R.id.rb_C3107_4_DK);

        rb_C3107_5_1 = (RadioButton) findViewById(R.id.rb_C3107_5_1);
        rb_C3107_5_2 = (RadioButton) findViewById(R.id.rb_C3107_5_2);
        rb_C3107_5_DK = (RadioButton) findViewById(R.id.rb_C3107_5_DK);

        rb_C3107_6_1 = (RadioButton) findViewById(R.id.rb_C3107_6_1);
        rb_C3107_6_2 = (RadioButton) findViewById(R.id.rb_C3107_6_2);
        rb_C3107_6_DK = (RadioButton) findViewById(R.id.rb_C3107_6_DK);

        rb_C3107_7_1 = (RadioButton) findViewById(R.id.rb_C3107_7_1);
        rb_C3107_7_2 = (RadioButton) findViewById(R.id.rb_C3107_7_2);
        rb_C3107_7_DK = (RadioButton) findViewById(R.id.rb_C3107_7_DK);

        rb_C3107_8_1 = (RadioButton) findViewById(R.id.rb_C3107_8_1);
        rb_C3107_8_2 = (RadioButton) findViewById(R.id.rb_C3107_8_2);
        rb_C3107_8_DK = (RadioButton) findViewById(R.id.rb_C3107_8_DK);

        rb_C3107_9_1 = (RadioButton) findViewById(R.id.rb_C3107_9_1);
        rb_C3107_9_2 = (RadioButton) findViewById(R.id.rb_C3107_9_2);
        rb_C3107_9_DK = (RadioButton) findViewById(R.id.rb_C3107_9_DK);

        rb_C3107_10_1 = (RadioButton) findViewById(R.id.rb_C3107_10_1);
        rb_C3107_10_2 = (RadioButton) findViewById(R.id.rb_C3107_10_2);
        rb_C3107_10_DK = (RadioButton) findViewById(R.id.rb_C3107_10_DK);

        rb_C3107_11_1 = (RadioButton) findViewById(R.id.rb_C3107_11_1);
        rb_C3107_11_2 = (RadioButton) findViewById(R.id.rb_C3107_11_2);
        rb_C3107_11_DK = (RadioButton) findViewById(R.id.rb_C3107_11_DK);

        rb_C3107_12_1 = (RadioButton) findViewById(R.id.rb_C3107_12_1);
        rb_C3107_12_2 = (RadioButton) findViewById(R.id.rb_C3107_12_2);
        rb_C3107_12_DK = (RadioButton) findViewById(R.id.rb_C3107_12_DK);

        rb_C3107_13_1 = (RadioButton) findViewById(R.id.rb_C3107_13_1);
        rb_C3107_13_2 = (RadioButton) findViewById(R.id.rb_C3107_13_2);
        rb_C3107_13_DK = (RadioButton) findViewById(R.id.rb_C3107_13_DK);

        rb_C3107_14_1 = (RadioButton) findViewById(R.id.rb_C3107_14_1);
        rb_C3107_14_2 = (RadioButton) findViewById(R.id.rb_C3107_14_2);
        rb_C3107_14_DK = (RadioButton) findViewById(R.id.rb_C3107_14_DK);

        rb_C3107_15_1 = (RadioButton) findViewById(R.id.rb_C3107_15_1);
        rb_C3107_15_2 = (RadioButton) findViewById(R.id.rb_C3107_15_2);
        rb_C3107_15_DK = (RadioButton) findViewById(R.id.rb_C3107_15_DK);

        rb_C3107_16_1 = (RadioButton) findViewById(R.id.rb_C3107_16_1);
        rb_C3107_16_2 = (RadioButton) findViewById(R.id.rb_C3107_16_2);
        rb_C3107_16_DK = (RadioButton) findViewById(R.id.rb_C3107_16_DK);

        rb_C3107_17_1 = (RadioButton) findViewById(R.id.rb_C3107_17_1);
        rb_C3107_17_2 = (RadioButton) findViewById(R.id.rb_C3107_17_2);
        rb_C3107_17_DK = (RadioButton) findViewById(R.id.rb_C3107_17_DK);

        rb_C3107_18_1 = (RadioButton) findViewById(R.id.rb_C3107_18_1);
        rb_C3107_18_2 = (RadioButton) findViewById(R.id.rb_C3107_18_2);
        rb_C3107_18_DK = (RadioButton) findViewById(R.id.rb_C3107_18_DK);

        rb_C3107_19_1 = (RadioButton) findViewById(R.id.rb_C3107_19_1);
        rb_C3107_19_2 = (RadioButton) findViewById(R.id.rb_C3107_19_2);
        rb_C3107_19_DK = (RadioButton) findViewById(R.id.rb_C3107_19_DK);

        rb_C3107_20_1 = (RadioButton) findViewById(R.id.rb_C3107_20_1);
        rb_C3107_20_2 = (RadioButton) findViewById(R.id.rb_C3107_20_2);
        rb_C3107_20_DK = (RadioButton) findViewById(R.id.rb_C3107_20_DK);

        rb_C3107_21_1 = (RadioButton) findViewById(R.id.rb_C3107_21_1);
        rb_C3107_21_2 = (RadioButton) findViewById(R.id.rb_C3107_21_2);
        rb_C3107_21_DK = (RadioButton) findViewById(R.id.rb_C3107_21_DK);


        rb_C3108_1 = (RadioButton) findViewById(R.id.rb_C3108_1);
        rb_C3108_2 = (RadioButton) findViewById(R.id.rb_C3108_2);
        rb_C3108_3 = (RadioButton) findViewById(R.id.rb_C3108_3);


        rb_C3109_1_1 = (RadioButton) findViewById(R.id.rb_C3109_1_1);
        rb_C3109_1_2 = (RadioButton) findViewById(R.id.rb_C3109_1_2);
        rb_C3109_1_DK = (RadioButton) findViewById(R.id.rb_C3109_1_DK);
        rb_C3109_1_NR = (RadioButton) findViewById(R.id.rb_C3109_1_NR);

        rb_C3109_2_1 = (RadioButton) findViewById(R.id.rb_C3109_2_1);
        rb_C3109_2_2 = (RadioButton) findViewById(R.id.rb_C3109_2_2);
        rb_C3109_2_DK = (RadioButton) findViewById(R.id.rb_C3109_2_DK);
        rb_C3109_2_NR = (RadioButton) findViewById(R.id.rb_C3109_2_NR);

        rb_C3109_3_1 = (RadioButton) findViewById(R.id.rb_C3109_3_1);
        rb_C3109_3_2 = (RadioButton) findViewById(R.id.rb_C3109_3_2);
        rb_C3109_3_DK = (RadioButton) findViewById(R.id.rb_C3109_3_DK);
        rb_C3109_3_NR = (RadioButton) findViewById(R.id.rb_C3109_3_NR);

        rb_C3109_4_1 = (RadioButton) findViewById(R.id.rb_C3109_4_1);
        rb_C3109_4_2 = (RadioButton) findViewById(R.id.rb_C3109_4_2);
        rb_C3109_4_DK = (RadioButton) findViewById(R.id.rb_C3109_4_DK);
        rb_C3109_4_NR = (RadioButton) findViewById(R.id.rb_C3109_4_NR);

        rb_C3109_5_1 = (RadioButton) findViewById(R.id.rb_C3109_5_1);
        rb_C3109_5_2 = (RadioButton) findViewById(R.id.rb_C3109_5_2);
        rb_C3109_5_DK = (RadioButton) findViewById(R.id.rb_C3109_5_DK);
        rb_C3109_5_NR = (RadioButton) findViewById(R.id.rb_C3109_5_NR);

        rb_C3109_6_1 = (RadioButton) findViewById(R.id.rb_C3109_6_1);
        rb_C3109_6_2 = (RadioButton) findViewById(R.id.rb_C3109_6_2);
        rb_C3109_6_DK = (RadioButton) findViewById(R.id.rb_C3109_6_DK);
        rb_C3109_6_NR = (RadioButton) findViewById(R.id.rb_C3109_6_NR);

        rb_C3109_7_1 = (RadioButton) findViewById(R.id.rb_C3109_7_1);
        rb_C3109_7_2 = (RadioButton) findViewById(R.id.rb_C3109_7_2);
        rb_C3109_7_DK = (RadioButton) findViewById(R.id.rb_C3109_7_DK);
        rb_C3109_7_NR = (RadioButton) findViewById(R.id.rb_C3109_7_NR);

        rb_C3109_8_1 = (RadioButton) findViewById(R.id.rb_C3109_8_1);
        rb_C3109_8_2 = (RadioButton) findViewById(R.id.rb_C3109_8_2);
        rb_C3109_8_DK = (RadioButton) findViewById(R.id.rb_C3109_8_DK);
        rb_C3109_8_NR = (RadioButton) findViewById(R.id.rb_C3109_8_NR);

        rb_C3109_9_1 = (RadioButton) findViewById(R.id.rb_C3109_9_1);
        rb_C3109_9_2 = (RadioButton) findViewById(R.id.rb_C3109_9_2);
        rb_C3109_9_DK = (RadioButton) findViewById(R.id.rb_C3109_9_DK);
        rb_C3109_9_NR = (RadioButton) findViewById(R.id.rb_C3109_9_NR);

        rb_C3109_10_1 = (RadioButton) findViewById(R.id.rb_C3109_10_1);
        rb_C3109_10_2 = (RadioButton) findViewById(R.id.rb_C3109_10_2);
        rb_C3109_10_DK = (RadioButton) findViewById(R.id.rb_C3109_10_DK);
        rb_C3109_10_NR = (RadioButton) findViewById(R.id.rb_C3109_10_NR);

        rb_C3109_11_1 = (RadioButton) findViewById(R.id.rb_C3109_11_1);
        rb_C3109_11_2 = (RadioButton) findViewById(R.id.rb_C3109_11_2);
        rb_C3109_11_DK = (RadioButton) findViewById(R.id.rb_C3109_11_DK);
        rb_C3109_11_NR = (RadioButton) findViewById(R.id.rb_C3109_11_NR);

        rb_C3109_12_1 = (RadioButton) findViewById(R.id.rb_C3109_12_1);
        rb_C3109_12_2 = (RadioButton) findViewById(R.id.rb_C3109_12_2);
        rb_C3109_12_DK = (RadioButton) findViewById(R.id.rb_C3109_12_DK);
        rb_C3109_12_NR = (RadioButton) findViewById(R.id.rb_C3109_12_NR);

        rb_C3109_13_1 = (RadioButton) findViewById(R.id.rb_C3109_13_1);
        rb_C3109_13_2 = (RadioButton) findViewById(R.id.rb_C3109_13_2);
        rb_C3109_13_DK = (RadioButton) findViewById(R.id.rb_C3109_13_DK);
        rb_C3109_13_NR = (RadioButton) findViewById(R.id.rb_C3109_13_NR);

        rb_C3109_14_1 = (RadioButton) findViewById(R.id.rb_C3109_14_1);
        rb_C3109_14_2 = (RadioButton) findViewById(R.id.rb_C3109_14_2);
        rb_C3109_14_DK = (RadioButton) findViewById(R.id.rb_C3109_14_DK);
        rb_C3109_14_NR = (RadioButton) findViewById(R.id.rb_C3109_14_NR);


        rb_C3110_1 = (RadioButton) findViewById(R.id.rb_C3110_1);
        rb_C3110_2 = (RadioButton) findViewById(R.id.rb_C3110_2);
        rb_C3110_DK = (RadioButton) findViewById(R.id.rb_C3110_DK);


        rb_C3111_1 = (RadioButton) findViewById(R.id.rb_C3111_1);
        rb_C3111_2 = (RadioButton) findViewById(R.id.rb_C3111_2);
        rb_C3111_DK = (RadioButton) findViewById(R.id.rb_C3111_DK);

        rb_C3111_1_1 = (RadioButton) findViewById(R.id.rb_C3111_1_1);
        rb_C3111_1_2 = (RadioButton) findViewById(R.id.rb_C3111_1_2);
        rb_C3111_1_DK = (RadioButton) findViewById(R.id.rb_C3111_1_DK);

        rb_C3111_3_1 = (RadioButton) findViewById(R.id.rb_C3111_3_1);
        rb_C3111_3_2 = (RadioButton) findViewById(R.id.rb_C3111_3_2);
        rb_C3111_3_DK = (RadioButton) findViewById(R.id.rb_C3111_3_DK);

        rb_C3111_5_1 = (RadioButton) findViewById(R.id.rb_C3111_5_1);
        rb_C3111_5_2 = (RadioButton) findViewById(R.id.rb_C3111_5_2);
        rb_C3111_5_DK = (RadioButton) findViewById(R.id.rb_C3111_5_DK);

        rb_C3111_7_1 = (RadioButton) findViewById(R.id.rb_C3111_7_1);
        rb_C3111_7_2 = (RadioButton) findViewById(R.id.rb_C3111_7_2);
        rb_C3111_7_DK = (RadioButton) findViewById(R.id.rb_C3111_7_DK);

        rb_C3111_8_1 = (RadioButton) findViewById(R.id.rb_C3111_8_1);
        rb_C3111_8_2 = (RadioButton) findViewById(R.id.rb_C3111_8_2);
        rb_C3111_8_DK = (RadioButton) findViewById(R.id.rb_C3111_8_DK);

        rb_C3112_1 = (RadioButton) findViewById(R.id.rb_C3112_1);
        rb_C3112_2 = (RadioButton) findViewById(R.id.rb_C3112_2);
        rb_C3112_DK = (RadioButton) findViewById(R.id.rb_C3112_DK);

        //EditText

        //ed_study_id     = (EditText) findViewById(R.id.eb_study_id);
        ed_C3107_6_OT = (EditText) findViewById(R.id.ed_C3107_6_OT);
        ed_C3107_21_OT = (EditText) findViewById(R.id.ed_C3107_21_OT);
        ed_C3111_2 = (EditText) findViewById(R.id.ed_C3111_2);
        ed_C3111_4 = (EditText) findViewById(R.id.ed_C3111_4);
        ed_C3111_6 = (EditText) findViewById(R.id.ed_C3111_6);
        ed_C3111_9 = (EditText) findViewById(R.id.ed_C3111_9);
    }

    void events_call() {

        rb_C3101_1.setOnCheckedChangeListener(this);
        rb_C3101_2.setOnCheckedChangeListener(this);
        rb_C3101_3.setOnCheckedChangeListener(this);
        rb_C3101_DK.setOnCheckedChangeListener(this);

        rb_C3102_1.setOnCheckedChangeListener(this);
        rb_C3102_2.setOnCheckedChangeListener(this);
        rb_C3102_3.setOnCheckedChangeListener(this);
        rb_C3102_DK.setOnCheckedChangeListener(this);

        rb_C3103_1.setOnCheckedChangeListener(this);
        rb_C3103_2.setOnCheckedChangeListener(this);
        rb_C3103_DK.setOnCheckedChangeListener(this);

        rb_C3104_1.setOnCheckedChangeListener(this);
        rb_C3104_2.setOnCheckedChangeListener(this);
        rb_C3104_DK.setOnCheckedChangeListener(this);

        rb_C3105_1.setOnCheckedChangeListener(this);
        rb_C3105_2.setOnCheckedChangeListener(this);
        rb_C3105_3.setOnCheckedChangeListener(this);
        rb_C3105_4.setOnCheckedChangeListener(this);
        rb_C3105_DK.setOnCheckedChangeListener(this);

        rb_C3106_1.setOnCheckedChangeListener(this);
        rb_C3106_2.setOnCheckedChangeListener(this);
        rb_C3106_DK.setOnCheckedChangeListener(this);

        rb_C3107_1_1.setOnCheckedChangeListener(this);
        rb_C3107_1_2.setOnCheckedChangeListener(this);
        rb_C3107_1_DK.setOnCheckedChangeListener(this);
        rb_C3107_2_1.setOnCheckedChangeListener(this);
        rb_C3107_2_2.setOnCheckedChangeListener(this);
        rb_C3107_2_DK.setOnCheckedChangeListener(this);
        rb_C3107_3_1.setOnCheckedChangeListener(this);
        rb_C3107_3_2.setOnCheckedChangeListener(this);
        rb_C3107_3_DK.setOnCheckedChangeListener(this);
        rb_C3107_4_1.setOnCheckedChangeListener(this);
        rb_C3107_4_2.setOnCheckedChangeListener(this);
        rb_C3107_4_DK.setOnCheckedChangeListener(this);
        rb_C3107_5_1.setOnCheckedChangeListener(this);
        rb_C3107_5_2.setOnCheckedChangeListener(this);
        rb_C3107_5_DK.setOnCheckedChangeListener(this);
        rb_C3107_6_1.setOnCheckedChangeListener(this);
        rb_C3107_6_2.setOnCheckedChangeListener(this);
        rb_C3107_6_DK.setOnCheckedChangeListener(this);
        rb_C3107_7_1.setOnCheckedChangeListener(this);
        rb_C3107_7_2.setOnCheckedChangeListener(this);
        rb_C3107_7_DK.setOnCheckedChangeListener(this);
        rb_C3107_8_1.setOnCheckedChangeListener(this);
        rb_C3107_8_2.setOnCheckedChangeListener(this);
        rb_C3107_8_DK.setOnCheckedChangeListener(this);
        rb_C3107_9_1.setOnCheckedChangeListener(this);
        rb_C3107_9_2.setOnCheckedChangeListener(this);
        rb_C3107_9_DK.setOnCheckedChangeListener(this);
        rb_C3107_10_1.setOnCheckedChangeListener(this);
        rb_C3107_10_2.setOnCheckedChangeListener(this);
        rb_C3107_10_DK.setOnCheckedChangeListener(this);
        rb_C3107_11_1.setOnCheckedChangeListener(this);
        rb_C3107_11_2.setOnCheckedChangeListener(this);
        rb_C3107_11_DK.setOnCheckedChangeListener(this);
        rb_C3107_12_1.setOnCheckedChangeListener(this);
        rb_C3107_12_2.setOnCheckedChangeListener(this);
        rb_C3107_12_DK.setOnCheckedChangeListener(this);
        rb_C3107_13_1.setOnCheckedChangeListener(this);
        rb_C3107_13_2.setOnCheckedChangeListener(this);
        rb_C3107_13_DK.setOnCheckedChangeListener(this);
        rb_C3107_14_1.setOnCheckedChangeListener(this);
        rb_C3107_14_2.setOnCheckedChangeListener(this);
        rb_C3107_14_DK.setOnCheckedChangeListener(this);
        rb_C3107_15_1.setOnCheckedChangeListener(this);
        rb_C3107_15_2.setOnCheckedChangeListener(this);
        rb_C3107_15_DK.setOnCheckedChangeListener(this);
        rb_C3107_16_1.setOnCheckedChangeListener(this);
        rb_C3107_16_2.setOnCheckedChangeListener(this);
        rb_C3107_16_DK.setOnCheckedChangeListener(this);
        rb_C3107_17_1.setOnCheckedChangeListener(this);
        rb_C3107_17_2.setOnCheckedChangeListener(this);
        rb_C3107_17_DK.setOnCheckedChangeListener(this);
        rb_C3107_18_1.setOnCheckedChangeListener(this);
        rb_C3107_18_2.setOnCheckedChangeListener(this);
        rb_C3107_18_DK.setOnCheckedChangeListener(this);
        rb_C3107_19_1.setOnCheckedChangeListener(this);
        rb_C3107_19_2.setOnCheckedChangeListener(this);
        rb_C3107_19_DK.setOnCheckedChangeListener(this);
        rb_C3107_20_1.setOnCheckedChangeListener(this);
        rb_C3107_20_2.setOnCheckedChangeListener(this);
        rb_C3107_20_DK.setOnCheckedChangeListener(this);
        rb_C3107_21_1.setOnCheckedChangeListener(this);
        rb_C3107_21_2.setOnCheckedChangeListener(this);
        rb_C3107_21_DK.setOnCheckedChangeListener(this);

        rb_C3108_1.setOnCheckedChangeListener(this);
        rb_C3108_2.setOnCheckedChangeListener(this);
        rb_C3108_3.setOnCheckedChangeListener(this);

        rb_C3109_1_1.setOnCheckedChangeListener(this);
        rb_C3109_1_2.setOnCheckedChangeListener(this);
        rb_C3109_1_DK.setOnCheckedChangeListener(this);
        rb_C3109_1_NR.setOnCheckedChangeListener(this);
        rb_C3109_2_1.setOnCheckedChangeListener(this);
        rb_C3109_2_2.setOnCheckedChangeListener(this);
        rb_C3109_2_DK.setOnCheckedChangeListener(this);
        rb_C3109_2_NR.setOnCheckedChangeListener(this);
        rb_C3109_3_1.setOnCheckedChangeListener(this);
        rb_C3109_3_2.setOnCheckedChangeListener(this);
        rb_C3109_3_DK.setOnCheckedChangeListener(this);
        rb_C3109_3_NR.setOnCheckedChangeListener(this);
        rb_C3109_4_1.setOnCheckedChangeListener(this);
        rb_C3109_4_2.setOnCheckedChangeListener(this);
        rb_C3109_4_DK.setOnCheckedChangeListener(this);
        rb_C3109_4_NR.setOnCheckedChangeListener(this);
        rb_C3109_5_1.setOnCheckedChangeListener(this);
        rb_C3109_5_2.setOnCheckedChangeListener(this);
        rb_C3109_5_DK.setOnCheckedChangeListener(this);
        rb_C3109_5_NR.setOnCheckedChangeListener(this);
        rb_C3109_6_1.setOnCheckedChangeListener(this);
        rb_C3109_6_2.setOnCheckedChangeListener(this);
        rb_C3109_6_DK.setOnCheckedChangeListener(this);
        rb_C3109_6_NR.setOnCheckedChangeListener(this);
        rb_C3109_7_1.setOnCheckedChangeListener(this);
        rb_C3109_7_2.setOnCheckedChangeListener(this);
        rb_C3109_7_DK.setOnCheckedChangeListener(this);
        rb_C3109_7_NR.setOnCheckedChangeListener(this);
        rb_C3109_8_1.setOnCheckedChangeListener(this);
        rb_C3109_8_2.setOnCheckedChangeListener(this);
        rb_C3109_8_DK.setOnCheckedChangeListener(this);
        rb_C3109_8_NR.setOnCheckedChangeListener(this);
        rb_C3109_9_1.setOnCheckedChangeListener(this);
        rb_C3109_9_2.setOnCheckedChangeListener(this);
        rb_C3109_9_DK.setOnCheckedChangeListener(this);
        rb_C3109_9_NR.setOnCheckedChangeListener(this);
        rb_C3109_10_1.setOnCheckedChangeListener(this);
        rb_C3109_10_2.setOnCheckedChangeListener(this);
        rb_C3109_10_DK.setOnCheckedChangeListener(this);
        rb_C3109_10_NR.setOnCheckedChangeListener(this);
        rb_C3109_11_1.setOnCheckedChangeListener(this);
        rb_C3109_11_2.setOnCheckedChangeListener(this);
        rb_C3109_11_DK.setOnCheckedChangeListener(this);
        rb_C3109_11_NR.setOnCheckedChangeListener(this);
        rb_C3109_12_1.setOnCheckedChangeListener(this);
        rb_C3109_12_2.setOnCheckedChangeListener(this);
        rb_C3109_12_DK.setOnCheckedChangeListener(this);
        rb_C3109_12_NR.setOnCheckedChangeListener(this);
        rb_C3109_13_1.setOnCheckedChangeListener(this);
        rb_C3109_13_2.setOnCheckedChangeListener(this);
        rb_C3109_13_DK.setOnCheckedChangeListener(this);
        rb_C3109_13_NR.setOnCheckedChangeListener(this);
        rb_C3109_14_1.setOnCheckedChangeListener(this);
        rb_C3109_14_2.setOnCheckedChangeListener(this);
        rb_C3109_14_DK.setOnCheckedChangeListener(this);
        rb_C3109_14_NR.setOnCheckedChangeListener(this);

        rb_C3110_1.setOnCheckedChangeListener(this);
        rb_C3110_2.setOnCheckedChangeListener(this);
        rb_C3110_DK.setOnCheckedChangeListener(this);

        rb_C3111_1.setOnCheckedChangeListener(this);
        rb_C3111_2.setOnCheckedChangeListener(this);
        rb_C3111_DK.setOnCheckedChangeListener(this);
        rb_C3111_1_1.setOnCheckedChangeListener(this);
        rb_C3111_1_2.setOnCheckedChangeListener(this);
        rb_C3111_1_DK.setOnCheckedChangeListener(this);
        rb_C3111_3_1.setOnCheckedChangeListener(this);
        rb_C3111_3_2.setOnCheckedChangeListener(this);
        rb_C3111_3_DK.setOnCheckedChangeListener(this);
        rb_C3111_5_1.setOnCheckedChangeListener(this);
        rb_C3111_5_2.setOnCheckedChangeListener(this);
        rb_C3111_5_DK.setOnCheckedChangeListener(this);
        rb_C3111_7_1.setOnCheckedChangeListener(this);
        rb_C3111_7_2.setOnCheckedChangeListener(this);
        rb_C3111_7_DK.setOnCheckedChangeListener(this);
        rb_C3111_8_1.setOnCheckedChangeListener(this);
        rb_C3111_8_2.setOnCheckedChangeListener(this);
        rb_C3111_8_DK.setOnCheckedChangeListener(this);

        rb_C3112_1.setOnCheckedChangeListener(this);
        rb_C3112_2.setOnCheckedChangeListener(this);
        rb_C3112_DK.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3104_1
                || compoundButton.getId() == R.id.rb_C3104_2
                || compoundButton.getId() == R.id.rb_C3104_DK) {

            if (rb_C3104_2.isChecked() || rb_C3104_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3105);
                ClearAllcontrol.ClearAll(ll_C3106);

                ll_C3105.setVisibility(View.GONE);
                ll_C3106.setVisibility(View.GONE);
            } else {
                ll_C3105.setVisibility(View.VISIBLE);
                ll_C3106.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3108_1
                || compoundButton.getId() == R.id.rb_C3108_2
                || compoundButton.getId() == R.id.rb_C3108_3) {

            if (rb_C3108_2.isChecked() || rb_C3108_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3109_1);
                ClearAllcontrol.ClearAll(ll_C3109_2);
                ClearAllcontrol.ClearAll(ll_C3109_3);
                ClearAllcontrol.ClearAll(ll_C3109_4);
                ClearAllcontrol.ClearAll(ll_C3109_5);
                ClearAllcontrol.ClearAll(ll_C3109_6);
                ClearAllcontrol.ClearAll(ll_C3109_7);
                ClearAllcontrol.ClearAll(ll_C3109_8);
                ClearAllcontrol.ClearAll(ll_C3109_9);
                ClearAllcontrol.ClearAll(ll_C3109_10);
                ClearAllcontrol.ClearAll(ll_C3109_11);
                ClearAllcontrol.ClearAll(ll_C3109_12);
                ClearAllcontrol.ClearAll(ll_C3109_13);
                ClearAllcontrol.ClearAll(ll_C3109_14);
                ClearAllcontrol.ClearAll(ll_C3110);

                ll_C3109_1.setVisibility(View.GONE);
                ll_C3109_2.setVisibility(View.GONE);
                ll_C3109_3.setVisibility(View.GONE);
                ll_C3109_4.setVisibility(View.GONE);
                ll_C3109_5.setVisibility(View.GONE);
                ll_C3109_6.setVisibility(View.GONE);
                ll_C3109_7.setVisibility(View.GONE);
                ll_C3109_8.setVisibility(View.GONE);
                ll_C3109_9.setVisibility(View.GONE);
                ll_C3109_10.setVisibility(View.GONE);
                ll_C3109_11.setVisibility(View.GONE);
                ll_C3109_12.setVisibility(View.GONE);
                ll_C3109_13.setVisibility(View.GONE);
                ll_C3109_14.setVisibility(View.GONE);
                ll_C3110.setVisibility(View.GONE);
            } else {

                ll_C3109_1.setVisibility(View.VISIBLE);
                ll_C3109_2.setVisibility(View.VISIBLE);
                ll_C3109_3.setVisibility(View.VISIBLE);
                ll_C3109_4.setVisibility(View.VISIBLE);
                ll_C3109_5.setVisibility(View.VISIBLE);
                ll_C3109_6.setVisibility(View.VISIBLE);
                ll_C3109_7.setVisibility(View.VISIBLE);
                ll_C3109_8.setVisibility(View.VISIBLE);
                ll_C3109_9.setVisibility(View.VISIBLE);
                ll_C3109_10.setVisibility(View.VISIBLE);
                ll_C3109_11.setVisibility(View.VISIBLE);
                ll_C3109_12.setVisibility(View.VISIBLE);
                ll_C3109_13.setVisibility(View.VISIBLE);
                ll_C3109_14.setVisibility(View.VISIBLE);
                ll_C3110.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_1
                || compoundButton.getId() == R.id.rb_C3111_2
                || compoundButton.getId() == R.id.rb_C3111_DK) {

            if (rb_C3111_2.isChecked() || rb_C3111_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_1);
                ClearAllcontrol.ClearAll(ll_C3111_2);
                ClearAllcontrol.ClearAll(ll_C3111_3);
                ClearAllcontrol.ClearAll(ll_C3111_4);
                ClearAllcontrol.ClearAll(ll_C3111_5);
                ClearAllcontrol.ClearAll(ll_C3111_6);
                ClearAllcontrol.ClearAll(ll_C3111_7);
                ClearAllcontrol.ClearAll(ll_C3111_8);
                ClearAllcontrol.ClearAll(ll_C3111_9);

                ll_C3111_1.setVisibility(View.GONE);
                ll_C3111_2.setVisibility(View.GONE);
                ll_C3111_3.setVisibility(View.GONE);
                ll_C3111_4.setVisibility(View.GONE);
                ll_C3111_5.setVisibility(View.GONE);
                ll_C3111_6.setVisibility(View.GONE);
                ll_C3111_7.setVisibility(View.GONE);
                ll_C3111_8.setVisibility(View.GONE);
                ll_C3111_9.setVisibility(View.GONE);
            } else {
                ll_C3111_1.setVisibility(View.VISIBLE);
                ll_C3111_2.setVisibility(View.VISIBLE);
                ll_C3111_3.setVisibility(View.VISIBLE);
                ll_C3111_4.setVisibility(View.VISIBLE);
                ll_C3111_5.setVisibility(View.VISIBLE);
                ll_C3111_6.setVisibility(View.VISIBLE);
                ll_C3111_7.setVisibility(View.VISIBLE);
                ll_C3111_8.setVisibility(View.VISIBLE);
                ll_C3111_9.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_1_1
                || compoundButton.getId() == R.id.rb_C3111_1_2
                || compoundButton.getId() == R.id.rb_C3111_1_DK) {

            if (rb_C3111_1_2.isChecked() || rb_C3111_1_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_2);

                ll_C3111_2.setVisibility(View.GONE);
            } else {
                ll_C3111_2.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_3_1
                || compoundButton.getId() == R.id.rb_C3111_3_2
                || compoundButton.getId() == R.id.rb_C3111_3_DK) {

            if (rb_C3111_3_2.isChecked() || rb_C3111_3_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_4);

                ll_C3111_4.setVisibility(View.GONE);
            } else {
                ll_C3111_4.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_5_1
                || compoundButton.getId() == R.id.rb_C3111_5_2
                || compoundButton.getId() == R.id.rb_C3111_5_DK) {

            if (rb_C3111_5_2.isChecked() || rb_C3111_5_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_6);

                ll_C3111_6.setVisibility(View.GONE);
            } else {
                ll_C3111_6.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_8_1
                || compoundButton.getId() == R.id.rb_C3111_8_2
                || compoundButton.getId() == R.id.rb_C3111_8_DK) {

            if (rb_C3111_8_2.isChecked() || rb_C3111_8_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_9);

                ll_C3111_9.setVisibility(View.GONE);
            } else {
                ll_C3111_9.setVisibility(View.VISIBLE);
            }
        }


    }

    @Override
    public void onFocusChange(View view, boolean b) {
        // No Such Other
    }

    void value_assignment() {

        study_id = "0";
        C3101 = "000";
        C3102 = "000";
        C3103 = "000";
        C3104 = "000";
        C3105 = "000";
        C3106 = "000";
        C3107_1 = "000";
        C3107_2 = "000";
        C3107_3 = "000";
        C3107_4 = "000";
        C3107_5 = "000";
        C3107_6 = "000";
        C3107_6_OT = "000";
        C3107_7 = "000";
        C3107_8 = "000";
        C3107_9 = "000";
        C3107_10 = "000";
        C3107_11 = "000";
        C3107_12 = "000";
        C3107_13 = "000";
        C3107_14 = "000";
        C3107_15 = "000";
        C3107_16 = "000";
        C3107_17 = "000";
        C3107_18 = "000";
        C3107_19 = "000";
        C3107_20 = "000";
        C3107_21 = "000";
        C3107_21_OT = "000";
        C3108 = "000";
        C3109_1 = "000";
        C3109_2 = "000";
        C3109_3 = "000";
        C3109_4 = "000";
        C3109_5 = "000";
        C3109_6 = "000";
        C3109_7 = "000";
        C3109_8 = "000";
        C3109_9 = "000";
        C3109_10 = "000";
        C3109_11 = "000";
        C3109_12 = "000";
        C3109_13 = "000";
        C3109_14 = "000";
        C3110 = "000";
        C3111 = "000";
        C3111_1 = "000";
        C3111_2 = "000";
        C3111_3 = "000";
        C3111_4 = "000";
        C3111_5 = "000";
        C3111_6 = "000";
        C3111_7 = "000";
        C3111_8 = "000";
        C3111_9 = "000";
        C3112 = "000";
        STATUS = "0";

        if (rb_C3101_1.isChecked()) {
            C3101 = "1";
        } else if (rb_C3101_2.isChecked()) {
            C3101 = "2";
        } else if (rb_C3101_3.isChecked()) {
            C3101 = "3";
        } else if (rb_C3101_DK.isChecked()) {
            C3101 = "9";
        }


        if (rb_C3102_1.isChecked()) {
            C3102 = "1";
        } else if (rb_C3102_2.isChecked()) {
            C3102 = "2";
        } else if (rb_C3102_3.isChecked()) {
            C3102 = "3";
        } else if (rb_C3102_DK.isChecked()) {
            C3102 = "9";
        }


        if (rb_C3103_1.isChecked()) {
            C3103 = "1";
        } else if (rb_C3103_2.isChecked()) {
            C3103 = "2";
        } else if (rb_C3103_DK.isChecked()) {
            C3103 = "9";
        }


        if (rb_C3104_1.isChecked()) {
            C3104 = "1";
        } else if (rb_C3104_2.isChecked()) {
            C3104 = "2";
        } else if (rb_C3104_DK.isChecked()) {
            C3104 = "9";
        }


        if (rb_C3105_1.isChecked()) {
            C3105 = "1";
        } else if (rb_C3105_2.isChecked()) {
            C3105 = "2";
        } else if (rb_C3105_3.isChecked()) {
            C3105 = "3";
        } else if (rb_C3105_4.isChecked()) {
            C3105 = "4";
        } else if (rb_C3105_DK.isChecked()) {
            C3105 = "9";
        }

        if (rb_C3106_1.isChecked() && ed_C3107_6_OT.getText().toString().trim().length() > 0) {
            C3106 = "1";
            C3107_6_OT = ed_C3107_21_OT.getText().toString().trim();
        } else if (rb_C3106_2.isChecked()) {
            C3106 = "2";
        } else if (rb_C3106_DK.isChecked()) {
            C3106 = "9";
        }

        if (rb_C3107_1_1.isChecked()) {
            C3107_1 = "1";
        } else if (rb_C3107_1_2.isChecked()) {
            C3107_1 = "2";
        } else if (rb_C3107_1_DK.isChecked()) {
            C3107_1 = "9";
        }

        if (rb_C3107_2_1.isChecked()) {
            C3107_2 = "1";
        } else if (rb_C3107_2_2.isChecked()) {
            C3107_2 = "2";
        } else if (rb_C3107_2_DK.isChecked()) {
            C3107_2 = "9";
        }

        if (rb_C3107_3_1.isChecked()) {
            C3107_3 = "1";
        } else if (rb_C3107_3_2.isChecked()) {
            C3107_3 = "2";
        } else if (rb_C3107_3_DK.isChecked()) {
            C3107_3 = "9";
        }

        if (rb_C3107_4_1.isChecked()) {
            C3107_4 = "1";
        } else if (rb_C3107_4_2.isChecked()) {
            C3107_4 = "2";
        } else if (rb_C3107_4_DK.isChecked()) {
            C3107_4 = "9";
        }

        if (rb_C3107_5_1.isChecked()) {
            C3107_5 = "1";
        } else if (rb_C3107_5_2.isChecked()) {
            C3107_5 = "2";
        } else if (rb_C3107_5_DK.isChecked()) {
            C3107_5 = "9";
        }

        if (rb_C3107_6_1.isChecked()) {
            C3107_6 = "1";
        } else if (rb_C3107_6_2.isChecked()) {
            C3107_6 = "2";
        } else if (rb_C3107_6_DK.isChecked()) {
            C3107_6 = "9";
        }

        if (rb_C3107_7_1.isChecked()) {
            C3107_7 = "1";
        } else if (rb_C3107_7_2.isChecked()) {
            C3107_7 = "2";
        } else if (rb_C3107_7_DK.isChecked()) {
            C3107_7 = "9";
        }

        if (rb_C3107_8_1.isChecked()) {
            C3107_8 = "1";
        } else if (rb_C3107_8_2.isChecked()) {
            C3107_8 = "2";
        } else if (rb_C3107_8_DK.isChecked()) {
            C3107_8 = "9";
        }

        if (rb_C3107_9_1.isChecked()) {
            C3107_9 = "1";
        } else if (rb_C3107_9_2.isChecked()) {
            C3107_9 = "2";
        } else if (rb_C3107_9_DK.isChecked()) {
            C3107_9 = "9";
        }

        if (rb_C3107_10_1.isChecked()) {
            C3107_10 = "1";
        } else if (rb_C3107_10_2.isChecked()) {
            C3107_10 = "2";
        } else if (rb_C3107_10_DK.isChecked()) {
            C3107_10 = "9";
        }

        if (rb_C3107_11_1.isChecked()) {
            C3107_11 = "1";
        } else if (rb_C3107_11_2.isChecked()) {
            C3107_11 = "2";
        } else if (rb_C3107_11_DK.isChecked()) {
            C3107_11 = "9";
        }

        if (rb_C3107_12_1.isChecked()) {
            C3107_12 = "1";
        } else if (rb_C3107_12_2.isChecked()) {
            C3107_12 = "2";
        } else if (rb_C3107_12_DK.isChecked()) {
            C3107_12 = "9";
        }

        if (rb_C3107_13_1.isChecked()) {
            C3107_13 = "1";
        } else if (rb_C3107_13_2.isChecked()) {
            C3107_13 = "2";
        } else if (rb_C3107_13_DK.isChecked()) {
            C3107_13 = "9";
        }

        if (rb_C3107_14_1.isChecked()) {
            C3107_14 = "1";
        } else if (rb_C3107_14_2.isChecked()) {
            C3107_14 = "2";
        } else if (rb_C3107_14_DK.isChecked()) {
            C3107_14 = "9";
        }

        if (rb_C3107_15_1.isChecked()) {
            C3107_15 = "1";
        } else if (rb_C3107_15_2.isChecked()) {
            C3107_15 = "2";
        } else if (rb_C3107_15_DK.isChecked()) {
            C3107_15 = "9";
        }

        if (rb_C3107_16_1.isChecked()) {
            C3107_16 = "1";
        } else if (rb_C3107_16_2.isChecked()) {
            C3107_16 = "2";
        } else if (rb_C3107_16_DK.isChecked()) {
            C3107_16 = "9";
        }

        if (rb_C3107_17_1.isChecked()) {
            C3107_17 = "1";
        } else if (rb_C3107_17_2.isChecked()) {
            C3107_17 = "2";
        } else if (rb_C3107_17_DK.isChecked()) {
            C3107_17 = "9";
        }

        if (rb_C3107_18_1.isChecked()) {
            C3107_18 = "1";
        } else if (rb_C3107_18_2.isChecked()) {
            C3107_18 = "2";
        } else if (rb_C3107_18_DK.isChecked()) {
            C3107_18 = "9";
        }

        if (rb_C3107_19_1.isChecked()) {
            C3107_19 = "1";
        } else if (rb_C3107_19_2.isChecked()) {
            C3107_19 = "2";
        } else if (rb_C3107_19_DK.isChecked()) {
            C3107_19 = "9";
        }

        if (rb_C3107_20_1.isChecked()) {
            C3107_20 = "1";
        } else if (rb_C3107_20_2.isChecked()) {
            C3107_20 = "2";
        } else if (rb_C3107_20_DK.isChecked()) {
            C3107_20 = "9";
        }

        if (rb_C3107_21_1.isChecked() && ed_C3107_21_OT.getText().toString().trim().length() > 0) {
            C3107_21 = "1";
            C3107_21_OT = ed_C3107_21_OT.getText().toString().trim();
        } else if (rb_C3107_21_2.isChecked()) {
            C3107_21 = "2";
        } else if (rb_C3107_21_DK.isChecked()) {
            C3107_21 = "9";
        }


        if (rb_C3108_1.isChecked()) {
            C3108 = "1";
        } else if (rb_C3108_2.isChecked()) {
            C3108 = "2";
        } else if (rb_C3108_3.isChecked()) {
            C3108 = "3";
        }


        if (rb_C3109_1_1.isChecked()) {
            C3109_1 = "1";
        } else if (rb_C3109_1_2.isChecked()) {
            C3109_1 = "2";
        } else if (rb_C3109_1_NR.isChecked()) {
            C3109_1 = "3";
        } else if (rb_C3109_1_DK.isChecked()) {
            C3109_1 = "9";
        }

        if (rb_C3109_2_1.isChecked()) {
            C3109_2 = "1";
        } else if (rb_C3109_2_2.isChecked()) {
            C3109_2 = "2";
        } else if (rb_C3109_2_NR.isChecked()) {
            C3109_2 = "3";
        } else if (rb_C3109_2_DK.isChecked()) {
            C3109_2 = "9";
        }

        if (rb_C3109_3_1.isChecked()) {
            C3109_3 = "1";
        } else if (rb_C3109_3_2.isChecked()) {
            C3109_3 = "2";
        } else if (rb_C3109_3_NR.isChecked()) {
            C3109_3 = "3";
        } else if (rb_C3109_3_DK.isChecked()) {
            C3109_3 = "9";
        }

        if (rb_C3109_4_1.isChecked()) {
            C3109_4 = "1";
        } else if (rb_C3109_4_2.isChecked()) {
            C3109_4 = "2";
        } else if (rb_C3109_4_NR.isChecked()) {
            C3109_4 = "3";
        } else if (rb_C3109_4_DK.isChecked()) {
            C3109_4 = "9";
        }

        if (rb_C3109_5_1.isChecked()) {
            C3109_5 = "1";
        } else if (rb_C3109_5_2.isChecked()) {
            C3109_5 = "2";
        } else if (rb_C3109_5_NR.isChecked()) {
            C3109_5 = "3";
        } else if (rb_C3109_5_DK.isChecked()) {
            C3109_5 = "9";
        }

        if (rb_C3109_6_1.isChecked()) {
            C3109_6 = "1";
        } else if (rb_C3109_6_2.isChecked()) {
            C3109_6 = "2";
        } else if (rb_C3109_6_NR.isChecked()) {
            C3109_6 = "3";
        } else if (rb_C3109_6_DK.isChecked()) {
            C3109_6 = "9";
        }

        if (rb_C3109_7_1.isChecked()) {
            C3109_7 = "1";
        } else if (rb_C3109_7_2.isChecked()) {
            C3109_7 = "2";
        } else if (rb_C3109_7_NR.isChecked()) {
            C3109_7 = "3";
        } else if (rb_C3109_7_DK.isChecked()) {
            C3109_7 = "9";
        }

        if (rb_C3109_8_1.isChecked()) {
            C3109_8 = "1";
        } else if (rb_C3109_8_2.isChecked()) {
            C3109_8 = "2";
        } else if (rb_C3109_8_NR.isChecked()) {
            C3109_8 = "3";
        } else if (rb_C3109_8_DK.isChecked()) {
            C3109_8 = "9";
        }

        if (rb_C3109_9_1.isChecked()) {
            C3109_9 = "1";
        } else if (rb_C3109_9_2.isChecked()) {
            C3109_9 = "2";
        } else if (rb_C3109_9_NR.isChecked()) {
            C3109_9 = "3";
        } else if (rb_C3109_9_DK.isChecked()) {
            C3109_9 = "9";
        }

        if (rb_C3109_10_1.isChecked()) {
            C3109_10 = "1";
        } else if (rb_C3109_10_2.isChecked()) {
            C3109_10 = "2";
        } else if (rb_C3109_10_NR.isChecked()) {
            C3109_10 = "3";
        } else if (rb_C3109_10_DK.isChecked()) {
            C3109_10 = "9";
        }

        if (rb_C3109_11_1.isChecked()) {
            C3109_11 = "1";
        } else if (rb_C3109_11_2.isChecked()) {
            C3109_11 = "2";
        } else if (rb_C3109_11_NR.isChecked()) {
            C3109_11 = "3";
        } else if (rb_C3109_11_DK.isChecked()) {
            C3109_11 = "9";
        }

        if (rb_C3109_12_1.isChecked()) {
            C3109_12 = "1";
        } else if (rb_C3109_12_2.isChecked()) {
            C3109_12 = "2";
        } else if (rb_C3109_12_NR.isChecked()) {
            C3109_12 = "3";
        } else if (rb_C3109_12_DK.isChecked()) {
            C3109_12 = "9";
        }

        if (rb_C3109_13_1.isChecked()) {
            C3109_13 = "1";
        } else if (rb_C3109_13_2.isChecked()) {
            C3109_13 = "2";
        } else if (rb_C3109_13_NR.isChecked()) {
            C3109_13 = "3";
        } else if (rb_C3109_13_DK.isChecked()) {
            C3109_13 = "9";
        }

        if (rb_C3109_14_1.isChecked()) {
            C3109_14 = "1";
        } else if (rb_C3109_14_2.isChecked()) {
            C3109_14 = "2";
        } else if (rb_C3109_14_NR.isChecked()) {
            C3109_14 = "3";
        } else if (rb_C3109_14_DK.isChecked()) {
            C3109_14 = "9";
        }


        if (rb_C3110_1.isChecked()) {
            C3110 = "1";
        } else if (rb_C3110_2.isChecked()) {
            C3110 = "2";
        } else if (rb_C3110_DK.isChecked()) {
            C3110 = "9";
        }


        if (rb_C3111_1.isChecked()) {
            C3111 = "1";
        } else if (rb_C3111_2.isChecked()) {
            C3111 = "2";
        } else if (rb_C3111_DK.isChecked()) {
            C3111 = "9";
        }


        if (rb_C3111_1_1.isChecked()) {
            C3111_1 = "1";
        } else if (rb_C3111_1_2.isChecked()) {
            C3111_1 = "2";
        } else if (rb_C3111_1_DK.isChecked()) {
            C3111_1 = "9";
        }

        if (ed_C3111_2.getText().toString().trim().length() > 0) {
            C3111_2 = ed_C3111_2.getText().toString().trim();
        }

        if (rb_C3111_3_1.isChecked()) {
            C3111_3 = "1";
        } else if (rb_C3111_3_2.isChecked()) {
            C3111_3 = "2";
        } else if (rb_C3111_3_DK.isChecked()) {
            C3111_3 = "9";
        }

        if (ed_C3111_4.getText().toString().trim().length() > 0) {
            C3111_4 = ed_C3111_4.getText().toString().trim();
        }

        if (rb_C3111_5_1.isChecked()) {
            C3111_5 = "1";
        } else if (rb_C3111_5_2.isChecked()) {
            C3111_5 = "2";
        } else if (rb_C3111_5_DK.isChecked()) {
            C3111_5 = "9";
        }

        if (ed_C3111_6.getText().toString().trim().length() > 0) {
            C3111_6 = ed_C3111_6.getText().toString().trim();
        }

        if (rb_C3111_7_1.isChecked()) {
            C3111_7 = "1";
        } else if (rb_C3111_7_2.isChecked()) {
            C3111_7 = "2";
        } else if (rb_C3111_7_DK.isChecked()) {
            C3111_7 = "9";
        }

        if (rb_C3111_8_1.isChecked()) {
            C3111_8 = "1";
        } else if (rb_C3111_8_2.isChecked()) {
            C3111_8 = "2";
        } else if (rb_C3111_8_DK.isChecked()) {
            C3111_8 = "9";
        }

        if (ed_C3111_9.getText().toString().trim().length() > 0) {
            C3111_9 = ed_C3111_9.getText().toString().trim();
        }


        if (rb_C3112_1.isChecked()) {
            C3112 = "1";
        } else if (rb_C3112_2.isChecked()) {
            C3112 = "2";
        } else if (rb_C3112_DK.isChecked()) {
            C3112 = "9";
        }
    }

    void insert_data() {
        String query = "insert into C3101_C3112("
                + global.C.C.C3101_C3112.study_id + ","
                + global.C.C.C3101_C3112.C3101 + ","
                + global.C.C.C3101_C3112.C3102 + ","
                + global.C.C.C3101_C3112.C3103 + ","
                + global.C.C.C3101_C3112.C3104 + ","
                + global.C.C.C3101_C3112.C3105 + ","
                + global.C.C.C3101_C3112.C3106 + ","
                + global.C.C.C3101_C3112.C3107_1 + ","
                + global.C.C.C3101_C3112.C3107_2 + ","
                + global.C.C.C3101_C3112.C3107_3 + ","
                + global.C.C.C3101_C3112.C3107_4 + ","
                + global.C.C.C3101_C3112.C3107_5 + ","
                + global.C.C.C3101_C3112.C3107_6 + ","
                + global.C.C.C3101_C3112.C3107_6_OT + ","
                + global.C.C.C3101_C3112.C3107_7 + ","
                + global.C.C.C3101_C3112.C3107_8 + ","
                + global.C.C.C3101_C3112.C3107_9 + ","
                + global.C.C.C3101_C3112.C3107_10 + ","
                + global.C.C.C3101_C3112.C3107_11 + ","
                + global.C.C.C3101_C3112.C3107_12 + ","
                + global.C.C.C3101_C3112.C3107_13 + ","
                + global.C.C.C3101_C3112.C3107_14 + ","
                + global.C.C.C3101_C3112.C3107_15 + ","
                + global.C.C.C3101_C3112.C3107_16 + ","
                + global.C.C.C3101_C3112.C3107_17 + ","
                + global.C.C.C3101_C3112.C3107_18 + ","
                + global.C.C.C3101_C3112.C3107_19 + ","
                + global.C.C.C3101_C3112.C3107_20 + ","
                + global.C.C.C3101_C3112.C3107_21 + ","
                + global.C.C.C3101_C3112.C3107_21_OT + ","
                + global.C.C.C3101_C3112.C3108 + ","
                + global.C.C.C3101_C3112.C3109_1 + ","
                + global.C.C.C3101_C3112.C3109_2 + ","
                + global.C.C.C3101_C3112.C3109_3 + ","
                + global.C.C.C3101_C3112.C3109_4 + ","
                + global.C.C.C3101_C3112.C3109_5 + ","
                + global.C.C.C3101_C3112.C3109_6 + ","
                + global.C.C.C3101_C3112.C3109_7 + ","
                + global.C.C.C3101_C3112.C3109_8 + ","
                + global.C.C.C3101_C3112.C3109_9 + ","
                + global.C.C.C3101_C3112.C3109_10 + ","
                + global.C.C.C3101_C3112.C3109_11 + ","
                + global.C.C.C3101_C3112.C3109_12 + ","
                + global.C.C.C3101_C3112.C3109_13 + ","
                + global.C.C.C3101_C3112.C3109_14 + ","
                + global.C.C.C3101_C3112.C3110 + ","
                + global.C.C.C3101_C3112.C3111 + ","
                + global.C.C.C3101_C3112.C3111_1 + ","
                + global.C.C.C3101_C3112.C3111_2 + ","
                + global.C.C.C3101_C3112.C3111_3 + ","
                + global.C.C.C3101_C3112.C3111_4 + ","
                + global.C.C.C3101_C3112.C3111_5 + ","
                + global.C.C.C3101_C3112.C3111_6 + ","
                + global.C.C.C3101_C3112.C3111_7 + ","
                + global.C.C.C3101_C3112.C3111_8 + ","
                + global.C.C.C3101_C3112.C3111_9 + ","
                + global.C.C.C3101_C3112.C3112 + ","
                + global.C.C.C3101_C3112.STATUS + ") values ('" +
                study_id + "','" +
                C3101 + "','" +
                C3102 + "','" +
                C3103 + "','" +
                C3104 + "','" +
                C3105 + "','" +
                C3106 + "','" +
                C3107_1 + "','" +
                C3107_2 + "','" +
                C3107_3 + "','" +
                C3107_4 + "','" +
                C3107_5 + "','" +
                C3107_6 + "','" +
                C3107_6_OT + "','" +
                C3107_7 + "','" +
                C3107_8 + "','" +
                C3107_9 + "','" +
                C3107_10 + "','" +
                C3107_11 + "','" +
                C3107_12 + "','" +
                C3107_13 + "','" +
                C3107_14 + "','" +
                C3107_15 + "','" +
                C3107_16 + "','" +
                C3107_17 + "','" +
                C3107_18 + "','" +
                C3107_19 + "','" +
                C3107_20 + "','" +
                C3107_21 + "','" +
                C3107_21_OT + "','" +
                C3108 + "','" +
                C3109_1 + "','" +
                C3109_2 + "','" +
                C3109_3 + "','" +
                C3109_4 + "','" +
                C3109_5 + "','" +
                C3109_6 + "','" +
                C3109_7 + "','" +
                C3109_8 + "','" +
                C3109_9 + "','" +
                C3109_10 + "','" +
                C3109_11 + "','" +
                C3109_12 + "','" +
                C3109_13 + "','" +
                C3109_14 + "','" +
                C3110 + "','" +
                C3111 + "','" +
                C3111_1 + "','" +
                C3111_2 + "','" +
                C3111_3 + "','" +
                C3111_4 + "','" +
                C3111_5 + "','" +
                C3111_6 + "','" +
                C3111_7 + "','" +
                C3111_8 + "','" +
                C3111_9 + "','" +
                C3112 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_C3101) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3102) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3103) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3104) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_13) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_14) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_15) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_16) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_17) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_18) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_19) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_20) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_21) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3108) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3111) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_C3112) != false;
    }

}
