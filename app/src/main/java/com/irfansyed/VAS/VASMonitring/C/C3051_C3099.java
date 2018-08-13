package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Gothrough;
import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;
import utils.ClearAllcontrol;


public class C3051_C3099 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, View.OnFocusChangeListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
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
            rb_C3059_9,
            rb_C3059_8,
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
            rb_C3068_OT,
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
            C3065_1,
            C3065_2,
            C3065_3,
            C3065_4,
            C3065_5,
            C3065_6,
            C3065_OT,
            C3065_DK,
            C3067_1,
            C3067_2,
            C3067_3,
            C3067_4,
            C3067_5,
            C3067_6,
            C3067_OT,
            C3067_DK;

    EditText
            ed_C3052,
            ed_C3062,
            ed_C3081,
            ed_C3082,
            ed_C3087,
            ed_C3090;

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
            C3065,
            C3066,
            C3067,
            C3068,
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
            C3090,
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

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3001_c3011);

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

        Intent c2 = new Intent(this, C3012_C3022.class);

        startActivity(c2);
    }

    void Initialization() {

        // Button Next
        btn_next = (Button) findViewById(R.id.btn_next);

        // Layouts

        ll_C3051 = (LinearLayout) findViewById(R.id.ll_C3051);
        ll_C3052 = (LinearLayout) findViewById(R.id.ll_C3052);
        ll_C3053 = (LinearLayout) findViewById(R.id.ll_C3053);
        ;
        ll_C3053a = (LinearLayout) findViewById(R.id.ll_C3053a);
        ;
        ll_C3054 = (LinearLayout) findViewById(R.id.ll_C3054);
        ll_C3055 = (LinearLayout) findViewById(R.id.ll_C3055);
        ll_C3056 = (LinearLayout) findViewById(R.id.ll_C3056);
        ll_C3057 = (LinearLayout) findViewById(R.id.ll_C3057);
        ll_C3058 = (LinearLayout) findViewById(R.id.ll_C3058);
        ll_C3059 = (LinearLayout) findViewById(R.id.ll_C3059);
        ll_C3060 = (LinearLayout) findViewById(R.id.ll_C3060);
        ll_C3061 = (LinearLayout) findViewById(R.id.ll_C3061);
        ll_C3062 = (LinearLayout) findViewById(R.id.ll_C3062);
        ll_C3063 = (LinearLayout) findViewById(R.id.ll_C3063);
        ll_C3064 = (LinearLayout) findViewById(R.id.ll_C3064);
        ll_C3065 = (LinearLayout) findViewById(R.id.ll_C3065);
        ll_C3066 = (LinearLayout) findViewById(R.id.ll_C3066);
        ll_C3067 = (LinearLayout) findViewById(R.id.ll_C3067);
        ll_C3068 = (LinearLayout) findViewById(R.id.ll_C3068);
        ll_C3069 = (LinearLayout) findViewById(R.id.ll_C3069);
        ll_C3070 = (LinearLayout) findViewById(R.id.ll_C3070);
        ll_C3071 = (LinearLayout) findViewById(R.id.ll_C3071);
        ll_C3072 = (LinearLayout) findViewById(R.id.ll_C3072);
        ll_C3073_1 = (LinearLayout) findViewById(R.id.ll_C3073_1);
        ll_C3073_2 = (LinearLayout) findViewById(R.id.ll_C3073_2);
        ll_C3073_3 = (LinearLayout) findViewById(R.id.ll_C3073_3);
        ll_C3074 = (LinearLayout) findViewById(R.id.ll_C3074);
        ll_C3075 = (LinearLayout) findViewById(R.id.ll_C3075);
        ll_C3076 = (LinearLayout) findViewById(R.id.ll_C3076);
        ll_C3077 = (LinearLayout) findViewById(R.id.ll_C3077);
        ll_C3078 = (LinearLayout) findViewById(R.id.ll_C3078);
        ll_C3079 = (LinearLayout) findViewById(R.id.ll_C3079);
        ll_C3080 = (LinearLayout) findViewById(R.id.ll_C3080);
        ll_C3081 = (LinearLayout) findViewById(R.id.ll_C3081);
        ll_C3082 = (LinearLayout) findViewById(R.id.ll_C3082);
        ll_C3083 = (LinearLayout) findViewById(R.id.ll_C3083);
        ll_C3084 = (LinearLayout) findViewById(R.id.ll_C3084);
        ll_C3085 = (LinearLayout) findViewById(R.id.ll_C3085);
        ll_C3086 = (LinearLayout) findViewById(R.id.ll_C3086);
        ll_C3087 = (LinearLayout) findViewById(R.id.ll_C3087);
        ll_C3088 = (LinearLayout) findViewById(R.id.ll_C3088);
        ll_C3089 = (LinearLayout) findViewById(R.id.ll_C3089);
        ll_C3090 = (LinearLayout) findViewById(R.id.ll_C3090);
        ll_C3091 = (LinearLayout) findViewById(R.id.ll_C3091);
        ll_C3092 = (LinearLayout) findViewById(R.id.ll_C3092);
        ll_C3093 = (LinearLayout) findViewById(R.id.ll_C3093);
        ll_C3094 = (LinearLayout) findViewById(R.id.ll_C3094);
        ll_C3095 = (LinearLayout) findViewById(R.id.ll_C3095);
        ll_C3096 = (LinearLayout) findViewById(R.id.ll_C3096);
        ll_C3097 = (LinearLayout) findViewById(R.id.ll_C3097);
        ll_C3098 = (LinearLayout) findViewById(R.id.ll_C3098);
        ll_C3099 = (LinearLayout) findViewById(R.id.ll_C3099);

        // Radio Buttons

        rb_C3051_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3051_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3051_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3051_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053a_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053a_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053a_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3053a_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3054_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3054_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3054_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3054_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3055_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3055_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3055_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3055_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3056_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3056_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3056_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3056_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3057_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3057_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3057_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3057_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3058_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3058_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3058_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3059_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3059_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3059_9 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3059_8 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3060_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3060_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3060_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3061_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3061_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3061_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3063_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3063_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3063_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3064_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3064_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3064_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3066_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3066_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3066_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_3 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_4 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_5 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_6 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_7 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_8 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_9 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_OT = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3068_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3069_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3069_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3069_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3070_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3070_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3070_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3071_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3071_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3071_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3071_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3072_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3072_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3072_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3072_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_1_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_1_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_1_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_1_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_2_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_2_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_2_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_2_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_3_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_3_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3073_3_DK = (RadioButton) findViewById(R.id.rb_C3073_3_DK);
        rb_C3073_3_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3074_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3074_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3074_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3074_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3075_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3075_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3075_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3075_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3076_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3076_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3076_3 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3076_4 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3076_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3076_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3077_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3077_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3077_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3078_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3078_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3078_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3079_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3079_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3079_3 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3079_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3080_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3080_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3080_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3083_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3083_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3083_3 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3083_4 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3083_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3084_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3084_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3084_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3084_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3085_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3085_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3085_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3085_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3086_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3086_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3086_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3086_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3088_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3088_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3088_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3088_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3089_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3089_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3089_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3089_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3091_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3091_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3091_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3091_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3092_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3092_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3092_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3092_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3093_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3093_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3093_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3093_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3094_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3094_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3094_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3094_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3095_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3095_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3095_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3095_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3096_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3096_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3096_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3096_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3097_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3097_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3097_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3097_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3098_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3098_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3098_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3098_RA = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3099_1 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3099_2 = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3099_DK = (RadioButton) findViewById(R.id.rb_C3051_2);
        rb_C3099_RA = (RadioButton) findViewById(R.id.rb_C3051_2);

        ed_C3005d = (EditText) findViewById(R.id.ed_C3005d);
        ed_C3005w = (EditText) findViewById(R.id.ed_C3005w);
        ed_C3005m = (EditText) findViewById(R.id.ed_C3005m);
        ed_C3006_6 = (EditText) findViewById(R.id.ed_C3006_6);
        ed_C3006_10 = (EditText) findViewById(R.id.ed_C3006_10);
        ed_C3006_OT = (EditText) findViewById(R.id.ed_C3006_OT);
        ed_C3008_7 = (EditText) findViewById(R.id.ed_C3008_7);
        ed_C3010 = (EditText) findViewById(R.id.ed_C3010);

    }

    void events_call() {

        rb_C3001_1.setOnCheckedChangeListener(this);
        rb_C3001_2.setOnCheckedChangeListener(this);
        rb_C3001_DK.setOnCheckedChangeListener(this);
        rb_C3001_RA.setOnCheckedChangeListener(this);

        rb_C3002_1.setOnCheckedChangeListener(this);
        rb_C3002_2.setOnCheckedChangeListener(this);
        rb_C3002_DK.setOnCheckedChangeListener(this);
        rb_C3002_RA.setOnCheckedChangeListener(this);

        rb_C3003_1.setOnCheckedChangeListener(this);
        rb_C3003_2.setOnCheckedChangeListener(this);
        rb_C3003_DK.setOnCheckedChangeListener(this);
        rb_C3003_RA.setOnCheckedChangeListener(this);

        rb_C3004_1.setOnCheckedChangeListener(this);
        rb_C3004_2.setOnCheckedChangeListener(this);
        rb_C3004_3.setOnCheckedChangeListener(this);
        rb_C3004_DK.setOnCheckedChangeListener(this);
        rb_C3004_RA.setOnCheckedChangeListener(this);

        rb_C3005u_1.setOnCheckedChangeListener(this);
        rb_C3005u_2.setOnCheckedChangeListener(this);
        rb_C3005u_3.setOnCheckedChangeListener(this);
        rb_C3005u_DK.setOnCheckedChangeListener(this);
        rb_C3005u_RA.setOnCheckedChangeListener(this);

        rb_C3006_1.setOnCheckedChangeListener(this);
        rb_C3006_2.setOnCheckedChangeListener(this);
        rb_C3006_3.setOnCheckedChangeListener(this);
        rb_C3006_4.setOnCheckedChangeListener(this);
        rb_C3006_5.setOnCheckedChangeListener(this);
        rb_C3006_7.setOnCheckedChangeListener(this);
        rb_C3006_8.setOnCheckedChangeListener(this);
        rb_C3006_9.setOnCheckedChangeListener(this);
        rb_C3006_11.setOnCheckedChangeListener(this);
        rb_C3006_DK.setOnCheckedChangeListener(this);
        rb_C3006_RA.setOnCheckedChangeListener(this);

        rb_C3008_1.setOnCheckedChangeListener(this);
        rb_C3008_2.setOnCheckedChangeListener(this);
        rb_C3008_3.setOnCheckedChangeListener(this);
        rb_C3008_4.setOnCheckedChangeListener(this);
        rb_C3008_5.setOnCheckedChangeListener(this);
        rb_C3008_6.setOnCheckedChangeListener(this);
        rb_C3008_8.setOnCheckedChangeListener(this);
        rb_C3008_9.setOnCheckedChangeListener(this);

        rb_C3009_1_1.setOnCheckedChangeListener(this);
        rb_C3009_1_2.setOnCheckedChangeListener(this);
        rb_C3009_1_DK.setOnCheckedChangeListener(this);
        rb_C3009_1_RA.setOnCheckedChangeListener(this);

        rb_C3009_2_1.setOnCheckedChangeListener(this);
        rb_C3009_2_2.setOnCheckedChangeListener(this);
        rb_C3009_2_DK.setOnCheckedChangeListener(this);
        rb_C3009_2_RA.setOnCheckedChangeListener(this);

        rb_C3009_3_1.setOnCheckedChangeListener(this);
        rb_C3009_3_2.setOnCheckedChangeListener(this);
        rb_C3009_3_DK.setOnCheckedChangeListener(this);
        rb_C3009_3_RA.setOnCheckedChangeListener(this);

        rb_C3009_4_1.setOnCheckedChangeListener(this);
        rb_C3009_4_2.setOnCheckedChangeListener(this);
        rb_C3009_4_DK.setOnCheckedChangeListener(this);
        rb_C3009_4_RA.setOnCheckedChangeListener(this);

        rb_C3011_1.setOnCheckedChangeListener(this);
        rb_C3011_2.setOnCheckedChangeListener(this);

        ed_C3005d.setOnFocusChangeListener(this);
        ed_C3005w.setOnFocusChangeListener(this);
        ed_C3005m.setOnFocusChangeListener(this);
        ed_C3006_6.setOnFocusChangeListener(this);
        ed_C3006_10.setOnFocusChangeListener(this);
        ed_C3006_OT.setOnFocusChangeListener(this);
        ed_C3008_7.setOnFocusChangeListener(this);
        ed_C3010.setOnFocusChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3001_1
                || compoundButton.getId() == R.id.rb_C3001_2
                || compoundButton.getId() == R.id.rb_C3001_DK
                || compoundButton.getId() == R.id.rb_C3001_RA) {

            if (rb_C3001_2.isChecked() || rb_C3001_DK.isChecked() || rb_C3001_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3002);
                ll_C3002.setVisibility(View.GONE);
            } else {
                ll_C3002.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3003_1
                || compoundButton.getId() == R.id.rb_C3003_2
                || compoundButton.getId() == R.id.rb_C3003_DK
                || compoundButton.getId() == R.id.rb_C3003_RA) {

            if (rb_C3003_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3004);
                ClearAllcontrol.ClearAll(ll_C3005u);
                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);

                ll_C3004.setVisibility(View.GONE);
                ll_C3005u.setVisibility(View.GONE);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);
            } else {

                ll_C3004.setVisibility(View.VISIBLE);
                ll_C3005u.setVisibility(View.VISIBLE);
                ll_C3005d.setVisibility(View.VISIBLE);
                ll_C3005w.setVisibility(View.VISIBLE);
                ll_C3005m.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3004_1
                || compoundButton.getId() == R.id.rb_C3004_2
                || compoundButton.getId() == R.id.rb_C3004_3
                || compoundButton.getId() == R.id.rb_C3004_DK
                || compoundButton.getId() == R.id.rb_C3004_RA) {

            if (rb_C3004_3.isChecked()) {

                ll_C3005u.setVisibility(View.VISIBLE);
                ll_C3005d.setVisibility(View.VISIBLE);
                ll_C3005w.setVisibility(View.VISIBLE);
                ll_C3005m.setVisibility(View.VISIBLE);
            } else {

                ClearAllcontrol.ClearAll(ll_C3005u);
                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);

                ll_C3005u.setVisibility(View.GONE);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3005u_1
                || compoundButton.getId() == R.id.rb_C3005u_2
                || compoundButton.getId() == R.id.rb_C3005u_3
                || compoundButton.getId() == R.id.rb_C3005u_DK
                || compoundButton.getId() == R.id.rb_C3005u_RA) {

            if (rb_C3005u_DK.isChecked() || rb_C3005u_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);

            } else if (rb_C3005u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005m);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);

                ll_C3005w.setVisibility(View.VISIBLE);

            } else if (rb_C3005u_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);

                ll_C3005m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);

                ll_C3005d.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3006_1
                || compoundButton.getId() == R.id.rb_C3006_2
                || compoundButton.getId() == R.id.rb_C3006_3
                || compoundButton.getId() == R.id.rb_C3006_4
                || compoundButton.getId() == R.id.rb_C3006_5
                || compoundButton.getId() == R.id.rb_C3006_7
                || compoundButton.getId() == R.id.rb_C3006_8
                || compoundButton.getId() == R.id.rb_C3006_9
                || compoundButton.getId() == R.id.rb_C3006_11
                || compoundButton.getId() == R.id.rb_C3006_DK
                || compoundButton.getId() == R.id.rb_C3006_RA) {

            ed_C3006_6.setText("");
            ed_C3006_10.setText("");
            ed_C3006_OT.setText("");
        }

        if (compoundButton.getId() == R.id.rb_C3008_1
                || compoundButton.getId() == R.id.rb_C3008_2
                || compoundButton.getId() == R.id.rb_C3008_3
                || compoundButton.getId() == R.id.rb_C3008_4
                || compoundButton.getId() == R.id.rb_C3008_5
                || compoundButton.getId() == R.id.rb_C3008_6
                || compoundButton.getId() == R.id.rb_C3008_8
                || compoundButton.getId() == R.id.rb_C3008_9) {

            ed_C3008_7.setText("");
        }

        if (compoundButton.getId() == R.id.rb_C3009_1_1
                || compoundButton.getId() == R.id.rb_C3009_1_2
                || compoundButton.getId() == R.id.rb_C3009_1_DK
                || compoundButton.getId() == R.id.rb_C3009_1_RA) {

            if (rb_C3009_1_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3009_2);
                ClearAllcontrol.ClearAll(ll_C3009_3);
                ClearAllcontrol.ClearAll(ll_C3009_4);

                ll_C3009_2.setVisibility(View.GONE);
                ll_C3009_3.setVisibility(View.GONE);
                ll_C3009_4.setVisibility(View.GONE);
            } else {

                ll_C3009_2.setVisibility(View.VISIBLE);
                ll_C3009_3.setVisibility(View.VISIBLE);
                ll_C3009_4.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3009_2_1
                || compoundButton.getId() == R.id.rb_C3009_2_2
                || compoundButton.getId() == R.id.rb_C3009_2_DK
                || compoundButton.getId() == R.id.rb_C3009_2_RA) {

            if (rb_C3009_2_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3009_3);
                ClearAllcontrol.ClearAll(ll_C3009_4);

                ll_C3009_3.setVisibility(View.GONE);
                ll_C3009_4.setVisibility(View.GONE);
            } else {

                ll_C3009_3.setVisibility(View.VISIBLE);
                ll_C3009_4.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3009_3_1
                || compoundButton.getId() == R.id.rb_C3009_3_2
                || compoundButton.getId() == R.id.rb_C3009_3_DK
                || compoundButton.getId() == R.id.rb_C3009_3_RA) {

            if (rb_C3009_3_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3009_4);

                ll_C3009_4.setVisibility(View.GONE);
            } else {

                ll_C3009_4.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        if (view.getId() == R.id.ed_C3006_6
                || view.getId() == R.id.ed_C3006_10
                || view.getId() == R.id.ed_C3006_OT) {

            if (!b) {
            } else {

                rb_C3006_1.setChecked(false);
                rb_C3006_2.setChecked(false);
                rb_C3006_3.setChecked(false);
                rb_C3006_4.setChecked(false);
                rb_C3006_5.setChecked(false);
                rb_C3006_7.setChecked(false);
                rb_C3006_8.setChecked(false);
                rb_C3006_9.setChecked(false);
                rb_C3006_11.setChecked(false);
                rb_C3006_DK.setChecked(false);
                rb_C3006_RA.setChecked(false);

                if (view.getId() == R.id.ed_C3006_6) {
                    ed_C3006_10.setText("");
                    ed_C3006_OT.setText("");
                } else if (view.getId() == R.id.ed_C3006_OT) {
                    ed_C3006_10.setText("");
                    ed_C3006_6.setText("");
                } else if (view.getId() == R.id.ed_C3006_10) {
                    ed_C3006_OT.setText("");
                    ed_C3006_6.setText("");
                }
            }
        }

        if (view.getId() == R.id.ed_C3008_7) {

            if (!b) {
            } else {
                rb_C3008_1.setChecked(false);
                rb_C3008_2.setChecked(false);
                rb_C3008_3.setChecked(false);
                rb_C3008_4.setChecked(false);
                rb_C3008_5.setChecked(false);
                rb_C3008_6.setChecked(false);
                rb_C3008_8.setChecked(false);
                rb_C3008_9.setChecked(false);
            }
        }
    }

    void value_assignment() {

        study_id = "0";
        C3001 = "000";
        C3002 = "000";
        C3003 = "000";
        C3004 = "000";
        C3005u = "000";
        C3005d = "000";
        C3005w = "000";
        C3005m = "000";
        C3006 = "000";
        C3008 = "000";
        C3009_1 = "000";
        C3009_2 = "000";
        C3009_3 = "000";
        C3009_4 = "000";
        C3010 = "000";
        C3011 = "000";
        STATUS = "0";

        if (rb_C3001_1.isChecked()) {
            C3001 = "1";
        } else if (rb_C3001_2.isChecked()) {
            C3001 = "2";
        } else if (rb_C3001_DK.isChecked()) {
            C3001 = "9";
        } else if (rb_C3001_RA.isChecked()) {
            C3001 = "8";
        }


        if (rb_C3002_1.isChecked()) {
            C3002 = "1";
        } else if (rb_C3002_2.isChecked()) {
            C3002 = "2";
        } else if (rb_C3002_DK.isChecked()) {
            C3002 = "9";
        } else if (rb_C3002_RA.isChecked()) {
            C3002 = "8";
        }


        if (rb_C3003_1.isChecked()) {
            C3003 = "1";
        } else if (rb_C3003_2.isChecked()) {
            C3003 = "2";
        } else if (rb_C3003_DK.isChecked()) {
            C3003 = "9";
        } else if (rb_C3003_RA.isChecked()) {
            C3003 = "8";
        }


        if (rb_C3004_1.isChecked()) {
            C3004 = "1";
        } else if (rb_C3004_2.isChecked()) {
            C3004 = "2";
        } else if (rb_C3004_3.isChecked()) {
            C3004 = "3";
        } else if (rb_C3004_DK.isChecked()) {
            C3004 = "9";
        } else if (rb_C3004_RA.isChecked()) {
            C3004 = "8";
        }


        if (rb_C3005u_1.isChecked()) {
            C3005u = "1";
        } else if (rb_C3005u_2.isChecked()) {
            C3005u = "2";
        } else if (rb_C3005u_3.isChecked()) {
            C3005u = "3";
        } else if (rb_C3005u_DK.isChecked()) {
            C3005u = "9";
        } else if (rb_C3005u_RA.isChecked()) {
            C3005u = "8";
        }


        if (ed_C3005d.getText().toString().trim().length() > 0) {
            C3005d = ed_C3005d.getText().toString().trim();
        }


        if (ed_C3005w.getText().toString().trim().length() > 0) {
            C3005w = ed_C3005w.getText().toString().trim();
        }


        if (ed_C3005m.getText().toString().trim().length() > 0) {
            C3005m = ed_C3005m.getText().toString().trim();
        }


        if (rb_C3006_1.isChecked()) {
            C3006 = "1";
        } else if (rb_C3006_2.isChecked()) {
            C3006 = "2";
        } else if (rb_C3006_3.isChecked()) {
            C3006 = "3";
        } else if (rb_C3006_4.isChecked()) {
            C3006 = "4";
        } else if (rb_C3006_5.isChecked()) {
            C3006 = "5";
        } else if (rb_C3006_7.isChecked()) {
            C3006 = "7";
        } else if (rb_C3006_8.isChecked()) {
            C3006 = "8";
        } else if (rb_C3006_9.isChecked()) {
            C3006 = "9";
        } else if (rb_C3006_11.isChecked()) {
            C3006 = "11";
        } else if (rb_C3006_DK.isChecked()) {
            C3006 = "99";
        } else if (rb_C3006_RA.isChecked()) {
            C3006 = "88";
        } else if (ed_C3006_6.getText().toString().trim().length() > 0) {
            C3005m = ed_C3006_6.getText().toString().trim();
        } else if (ed_C3006_10.getText().toString().trim().length() > 0) {
            C3005m = ed_C3006_10.getText().toString().trim();
        } else if (ed_C3006_OT.getText().toString().trim().length() > 0) {
            C3005m = ed_C3006_OT.getText().toString().trim();
        }


        if (rb_C3008_1.isChecked()) {
            C3008 = "1";
        } else if (rb_C3008_2.isChecked()) {
            C3008 = "2";
        } else if (rb_C3008_3.isChecked()) {
            C3008 = "3";
        } else if (rb_C3008_4.isChecked()) {
            C3008 = "4";
        } else if (rb_C3008_5.isChecked()) {
            C3008 = "5";
        } else if (rb_C3008_6.isChecked()) {
            C3008 = "6";
        } else if (rb_C3008_8.isChecked()) {
            C3008 = "8";
        } else if (rb_C3008_9.isChecked()) {
            C3008 = "9";
        } else if (ed_C3008_7.getText().toString().trim().length() > 0) {
            C3008 = ed_C3008_7.getText().toString().trim();
        }


        if (rb_C3009_1_1.isChecked()) {
            C3009_1 = "1";
        } else if (rb_C3009_1_2.isChecked()) {
            C3009_1 = "2";
        } else if (rb_C3009_1_DK.isChecked()) {
            C3009_1 = "9";
        } else if (rb_C3009_1_RA.isChecked()) {
            C3009_1 = "8";
        }


        if (rb_C3009_2_1.isChecked()) {
            C3009_2 = "1";
        } else if (rb_C3009_2_2.isChecked()) {
            C3009_2 = "2";
        } else if (rb_C3009_2_DK.isChecked()) {
            C3009_2 = "9";
        } else if (rb_C3009_2_RA.isChecked()) {
            C3009_2 = "8";
        }


        if (rb_C3009_3_1.isChecked()) {
            C3009_3 = "1";
        } else if (rb_C3009_3_2.isChecked()) {
            C3009_3 = "2";
        } else if (rb_C3009_3_DK.isChecked()) {
            C3009_3 = "9";
        } else if (rb_C3009_3_RA.isChecked()) {
            C3009_3 = "8";
        }


        if (rb_C3009_4_1.isChecked()) {
            C3009_4 = "1";
        } else if (rb_C3009_4_2.isChecked()) {
            C3009_4 = "2";
        } else if (rb_C3009_4_DK.isChecked()) {
            C3009_4 = "9";
        } else if (rb_C3009_4_RA.isChecked()) {
            C3009_4 = "8";
        }


        if (ed_C3010.getText().toString().trim().length() > 0) {
            C3010 = ed_C3010.getText().toString().trim();
        }

        if (rb_C3011_1.isChecked()) {
            C3011 = "1";
        } else if (rb_C3011_2.isChecked()) {
            C3011 = "2";
        }
    }

    void insert_data() {
        String query = "insert into   C3001_C3011("
                + global.C.C.C3001_C3011.study_id + ","
                + global.C.C.C3001_C3011.C3001 + ","
                + global.C.C.C3001_C3011.C3002 + ","
                + global.C.C.C3001_C3011.C3003 + ","
                + global.C.C.C3001_C3011.C3004 + ","
                + global.C.C.C3001_C3011.C3005u + ","
                + global.C.C.C3001_C3011.C3005d + ","
                + global.C.C.C3001_C3011.C3005w + ","
                + global.C.C.C3001_C3011.C3005m + ","
                + global.C.C.C3001_C3011.C3006 + ","
                + global.C.C.C3001_C3011.C3008 + ","
                + global.C.C.C3001_C3011.C3009_1 + ","
                + global.C.C.C3001_C3011.C3009_2 + ","
                + global.C.C.C3001_C3011.C3009_3 + ","
                + global.C.C.C3001_C3011.C3009_4 + ","
                + global.C.C.C3001_C3011.C3010 + ","
                + global.C.C.C3001_C3011.C3011 + ","
                + global.C.C.C3001_C3011.STATUS + ") values ('" +

                study_id + "','" +
                C3001 + "','" +
                C3002 + "','" +
                C3003 + "','" +
                C3004 + "','" +
                C3005u + "','" +
                C3005d + "','" +
                C3005w + "','" +
                C3005m + "','" +
                C3006 + "','" +
                C3008 + "','" +
                C3009_1 + "','" +
                C3009_2 + "','" +
                C3009_3 + "','" +
                C3009_4 + "','" +
                C3010 + "','" +
                C3011 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        Lm.database.execSQL(query);

        Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_C3001) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3002) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3003) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3004) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005w) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3006) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3008) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3010) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3011) == false) {
            return false;
        }

        return true;
    }

}
