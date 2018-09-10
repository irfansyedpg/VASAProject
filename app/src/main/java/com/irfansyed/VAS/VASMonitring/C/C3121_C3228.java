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

import Global.C.C3001_C3011;
import data.LocalDataManager;
import utils.ClearAllcontrol;

public class C3121_C3228 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    // Region Declaration
    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_C3121,
            ll_C3122,
            ll_C3122d,
            ll_C3122m,
            ll_C3123_u,
            ll_C3123_b,
            ll_C3123_c,
            ll_C3124,
            ll_C3125,
            ll_C3126,
            ll_C3127,
            ll_C3128,
            ll_C3129,
            ll_C3130,
            ll_C3131,
            ll_C3132_u,
            ll_C3132_a,
            ll_C3132_b,
            ll_C3133,
            ll_C3134,
            ll_C3135,
            ll_C3136,
            ll_C3137,
            ll_C3138,
            ll_C3139,
            ll_C3140,
            ll_C3141,
            ll_C3142,
            ll_C3143,
            ll_C3144_u,
            ll_C3144,
            ll_C3144_a,
            ll_C3144_b,
            ll_C3145,
            ll_C3146,
            ll_C3147_u,
            ll_C3147_a,
            ll_C3147_b,
            ll_C3148,
            ll_C3149,
            ll_C3150_u,
            ll_C3150_a,
            ll_C3150_b,
            ll_C3151,
            ll_C3152_u,
            ll_C3152_a,
            ll_C3152_b,
            ll_C3153,
            ll_C3154,
            ll_C3155,
            ll_C3156,
            ll_C3157,
            ll_C3158,
            ll_C3159_u,
            ll_C3159_a,
            ll_C3159_b,
            ll_C3159_c,
            ll_C3160,
            ll_C3161,
            ll_C3162,
            ll_C3162d,
            ll_C3162m,
            ll_C3163_u,
            ll_C3163_a,
            ll_C3163_b,
            ll_C3164,
            ll_C3165_u,
            ll_C3165_a,
            ll_C3165_b,
            ll_C3166,
            ll_C3167,
            ll_C3168,
            ll_C3169,
            ll_C3170,
            ll_C3171,
            ll_C3172,
            ll_C3173,
            ll_C3174,
            ll_C3175_u,
            ll_C3175_a,
            ll_C3175_b,
            ll_C3176,
            ll_C3177_u,
            ll_C3177_a,
            ll_C3177_b,
            ll_C3178,
            ll_C3179_u,
            ll_C3179_a,
            ll_C3179_b,
            ll_C3180,
            ll_C3181,
            ll_C3182,
            ll_C3183,
            ll_C3184,
            ll_C3185,
            ll_C3186_1,
            ll_C3186,
            ll_C3187,
            ll_C3188,
            ll_C3189,
            ll_C3190,
            ll_C3191,
            ll_C3192,
            ll_C3193_u,
            ll_C3193_a,
            ll_C3193_b,
            ll_C3194,
            ll_C3195A,
            ll_C3195,
            ll_C3196,
            ll_C3197,
            ll_C3198,
            ll_C3199,
            ll_C3199_1,
            ll_C3200,
            ll_C3201_u,
            ll_C3201_a,
            ll_C3201_b,
            ll_C3202,
            ll_C3203,
            ll_C3204_u,
            ll_C3204_a,
            ll_C3204_b,
            ll_C3205,
            ll_C3206,
            ll_C3207,
            ll_C3208_u,
            ll_C3208_a,
            ll_C3208_b,
            ll_C3209,
            ll_C3210,
            ll_C3212,
            ll_C3213,
            ll_C3214,
            ll_C3215,
            ll_C3216,
            ll_C3217,
            ll_C3218,
            ll_C3219,
            ll_C3220_u,
            ll_C3220_a,
            ll_C3220_b,
            ll_C3221,
            ll_C3222,
            ll_C3223,
            ll_C3224,
            ll_C3225,
            ll_C3226,
            ll_C3227,
            ll_C3227_1,
            ll_C3227_2,
            ll_C3227_3,
            ll_C3227_4,
            ll_C3227_5,
            ll_C3227_6,
            ll_C3227_7,
            ll_C3227_8,
            ll_C3227_9,
            ll_C3227_10,
            ll_C3227_11,
            ll_C3227_12,
            ll_C3227_13,
            ll_C3227_14,
            ll_C3227_15,
            ll_C3227_16,
            ll_C3227_17,
            ll_C3227_18,
            ll_C3227_19,
            ll_C3227_20,
            ll_C3227_21,
            ll_C3227_22,
            ll_C3228;

    RadioButton
            rb_C3121_1,
            rb_C3121_2,
            rb_C3121_DK,
            rb_C3122_1,
            rb_C3122_2,
            rb_C3122_3,
            rb_C3122_DK,
            rb_C3123_u_1,
            rb_C3123_u_2,
            rb_C3123_u_DK,
            rb_C3123_u_RA,
            rb_C3124_1,
            rb_C3124_2,
            rb_C3124_DK,
            rb_C3124_RA,
            rb_C3125_1,
            rb_C3125_2,
            rb_C3125_3,
            rb_C3125_DK,
            rb_C3125_RA,
            rb_C3126_1,
            rb_C3126_2,
            rb_C3126_3,
            rb_C3126_DK,
            rb_C3126_RA,
            rb_C3127_1,
            rb_C3127_2,
            rb_C3127_DK,
            rb_C3127_RA,
            rb_C3128_1,
            rb_C3128_2,
            rb_C3128_DK,
            rb_C3128_RA,
            rb_C3129_1,
            rb_C3129_2,
            rb_C3129_DK,
            rb_C3129_RA,
            rb_C3130_1,
            rb_C3130_2,
            rb_C3130_DK,
            rb_C3130_RA,
            rb_C3132_u_1,
            rb_C3132_u_2,
            rb_C3132_u_DK,
            rb_C3132_u_RA,
            rb_C3133_1,
            rb_C3133_2,
            rb_C3133_DK,
            rb_C3133_RA,
            rb_C3135_1,
            rb_C3135_2,
            rb_C3135_DK,
            rb_C3135_RA,
            rb_C3136_1,
            rb_C3136_2,
            rb_C3136_DK,
            rb_C3136_RA,
            rb_C3137_1,
            rb_C3137_2,
            rb_C3137_DK,
            rb_C3137_RA,
            rb_C3138_1,
            rb_C3138_2,
            rb_C3138_DK,
            rb_C3138_RA,
            rb_C3139_1,
            rb_C3139_2,
            rb_C3139_DK,
            rb_C3139_RA,
            rb_C3140_1,
            rb_C3140_2,
            rb_C3140_DK,
            rb_C3140_RA,
            rb_C3141_1,
            rb_C3141_2,
            rb_C3141_DK,
            rb_C3141_RA,
            rb_C3142_1,
            rb_C3142_2,
            rb_C3142_DK,
            rb_C3142_RA,
            rb_C3143_1,
            rb_C3143_2,
            rb_C3143_DK,
            rb_C3143_RA,
            rb_C3144_u_1,
            rb_C3144_u_2,
            rb_C3144_u_3,
            rb_C3144_u_DK,
            rb_C3144_u_RA,
            rb_C3145_1,
            rb_C3145_2,
            rb_C3145_3,
            rb_C3145_DK,
            rb_C3145_RA,
            rb_C3146_1,
            rb_C3146_2,
            rb_C3146_DK,
            rb_C3146_RA,
            rb_C3147_u_3,
            rb_C3147_u_4,
            rb_C3147_u_DK,
            rb_C3147_u_RA,
            rb_C3148_1,
            rb_C3148_2,
            rb_C3148_DK,
            rb_C3148_RA,
            rb_C3149_1,
            rb_C3149_2,
            rb_C3149_DK,
            rb_C3149_RA,
            rb_C3150_u_1,
            rb_C3150_u_2,
            rb_C3150_u_DK,
            rb_C3150_u_RA,
            rb_C3151_1,
            rb_C3151_2,
            rb_C3151_DK,
            rb_C3152_u_1,
            rb_C3152_u_2,
            rb_C3152_u_DK,
            rb_C3152_u_RA,
            rb_C3153_1,
            rb_C3153_2,
            rb_C3153_DK,
            rb_C3153_RA,
            rb_C3154_1,
            rb_C3154_2,
            rb_C3154_DK,
            rb_C3154_RA,
            rb_C3155_1,
            rb_C3155_2,
            rb_C3155_DK,
            rb_C3155_RA,
            rb_C3156_1,
            rb_C3156_2,
            rb_C3156_DK,
            rb_C3156_RA,
            rb_C3157_1,
            rb_C3157_2,
            rb_C3157_DK,
            rb_C3157_RA,
            rb_C3158_1,
            rb_C3158_2,
            rb_C3158_DK,
            rb_C3158_RA,
            rb_C3159_u_1,
            rb_C3159_u_2,
            rb_C3159_u_3,
            rb_C3159_u_DK,
            rb_C3159_u_RA,
            rb_C3160_1,
            rb_C3160_2,
            rb_C3160_DK,
            rb_C3160_RA,
            rb_C3161_1,
            rb_C3161_2,
            rb_C3161_DK,
            rb_C3161_RA,
            rb_C3162_1,
            rb_C3162_2,
            rb_C3162_3,
            rb_C3162_DK,
            rb_C3163_u_1,
            rb_C3163_u_2,
            rb_C3163_u_DK,
            rb_C3163_u_RA,
            rb_C3164_1,
            rb_C3164_2,
            rb_C3164_DK,
            rb_C3164_RA,
            rb_C3165_u_1,
            rb_C3165_u_2,
            rb_C3165_u_DK,
            rb_C3165_u_RA,
            rb_C3166_1,
            rb_C3166_2,
            rb_C3166_DK,
            rb_C3166_RA,
            rb_C3168_1,
            rb_C3168_2,
            rb_C3168_DK,
            rb_C3168_RA,
            rb_C3169_1,
            rb_C3169_2,
            rb_C3169_DK,
            rb_C3169_RA,
            rb_C3170_1,
            rb_C3170_2,
            rb_C3170_DK,
            rb_C3170_RA,
            rb_C3171_1,
            rb_C3171_2,
            rb_C3171_DK,
            rb_C3171_RA,
            rb_C3173_1,
            rb_C3173_2,
            rb_C3173_DK,
            rb_C3173_RA,
            rb_C3174_1,
            rb_C3174_2,
            rb_C3174_DK,
            rb_C3174_RA,
            rb_C3175_u_1,
            rb_C3175_u_2,
            rb_C3175_u_DK,
            rb_C3175_u_RA,
            rb_C3176_1,
            rb_C3176_2,
            rb_C3176_DK,
            rb_C3176_RA,
            rb_C3177_u_1,
            rb_C3177_u_2,
            rb_C3177_u_DK,
            rb_C3177_u_RA,
            rb_C3178_1,
            rb_C3178_2,
            rb_C3178_DK,
            rb_C3178_RA,
            rb_C3179_u_1,
            rb_C3179_u_2,
            rb_C3179_u_DK,
            rb_C3179_u_RA,
            rb_C3180_1,
            rb_C3180_2,
            rb_C3180_DK,
            rb_C3180_RA,
            rb_C3181_1,
            rb_C3181_2,
            rb_C3181_DK,
            rb_C3181_RA,
            rb_C3182_1,
            rb_C3182_2,
            rb_C3182_DK,
            rb_C3182_RA,
            rb_C3183_1,
            rb_C3183_2,
            rb_C3183_DK,
            rb_C3183_RA,
            rb_C3185_1,
            rb_C3185_2,
            rb_C3185_DK,
            rb_C3185_RA,
            rb_C3186_1_1,
            rb_C3186_1_2,
            rb_C3186_1_DK,
            rb_C3186_1_RA,
            rb_C3186_1,
            rb_C3186_2,
            rb_C3186_DK,
            rb_C3186_RA,
            rb_C3187_1,
            rb_C3187_2,
            rb_C3187_DK,
            rb_C3187_RA,
            rb_C3188_1,
            rb_C3188_2,
            rb_C3188_DK,
            rb_C3188_RA,
            rb_C3189_1,
            rb_C3189_2,
            rb_C3189_DK,
            rb_C3189_RA,
            rb_C3190_1,
            rb_C3190_2,
            rb_C3190_DK,
            rb_C3190_RA,
            rb_C3191_1,
            rb_C3191_2,
            rb_C3191_DK,
            rb_C3191_RA,
            rb_C3192_1,
            rb_C3192_2,
            rb_C3192_DK,
            rb_C3192_RA,
            rb_C3193_u_3,
            rb_C3193_u_4,
            rb_C3193_u_DK,
            rb_C3193_u_RA,
            rb_C3194_1,
            rb_C3194_2,
            rb_C3194_DK,
            rb_C3194_RA,
            rb_C3195A_1,
            rb_C3195A_2,
            rb_C3195A_3,
            rb_C3195A_4,
            rb_C3195A_DK,
            rb_C3195A_RA,
            rb_C3195_1,
            rb_C3195_2,
            rb_C3195_3,
            rb_C3195_4,
            rb_C3195_DK,
            rb_C3195_RA,
            rb_C3197_1,
            rb_C3197_2,
            rb_C3197_DK,
            rb_C3197_RA,
            rb_C3198_1,
            rb_C3198_2,
            rb_C3198_DK,
            rb_C3198_RA,
            rb_C3199_1,
            rb_C3199_2,
            rb_C3199_DK,
            rb_C3199_RA,
            rb_C3199_1_1,
            rb_C3199_1_2,
            rb_C3199_1_DK,
            rb_C3199_1_RA,
            rb_C3200_1,
            rb_C3200_2,
            rb_C3200_DK,
            rb_C3200_RA,
            rb_C3201_u_1,
            rb_C3201_u_2,
            rb_C3201_u_DK,
            rb_C3201_u_RA,
            rb_C3202_1,
            rb_C3202_2,
            rb_C3202_DK,
            rb_C3202_RA,
            rb_C3203_1,
            rb_C3203_2,
            rb_C3203_DK,
            rb_C3203_RA,
            rb_C3204_u_1,
            rb_C3204_u_2,
            rb_C3204_u_DK,
            rb_C3204_u_RA,
            rb_C3205_1,
            rb_C3205_2,
            rb_C3205_DK,
            rb_C3205_RA,
            rb_C3206_1,
            rb_C3206_2,
            rb_C3206_DK,
            rb_C3206_RA,
            rb_C3207_1,
            rb_C3207_2,
            rb_C3207_DK,
            rb_C3207_RA,
            rb_C3208_u_0,
            rb_C3208_u_1,
            rb_C3208_u_DK,
            rb_C3208_u_RA,
            rb_C3209_1,
            rb_C3209_2,
            rb_C3209_DK,
            rb_C3209_RA,
            rb_C3210_1,
            rb_C3210_2,
            rb_C3210_DK,
            rb_C3210_RA,
            rb_C3212_1,
            rb_C3212_2,
            rb_C3212_DK,
            rb_C3212_RA,
            rb_C3213_1,
            rb_C3213_2,
            rb_C3213_DK,
            rb_C3213_RA,
            rb_C3214_1,
            rb_C3214_2,
            rb_C3214_DK,
            rb_C3214_RA,
            rb_C3215_1,
            rb_C3215_2,
            rb_C3215_DK,
            rb_C3215_RA,
            rb_C3216_1,
            rb_C3216_2,
            rb_C3216_DK,
            rb_C3216_RA,
            rb_C3217_1,
            rb_C3217_2,
            rb_C3217_DK,
            rb_C3217_RA,
            rb_C3218_1,
            rb_C3218_2,
            rb_C3218_3,
            rb_C3218_4,
            rb_C3218_5,
            rb_C3218_6,
            rb_C3218_7,
            rb_C3218_OT,
            rb_C3218_DK,
            rb_C3218_RA,
            rb_C3219_1,
            rb_C3219_2,
            rb_C3219_DK,
            rb_C3219_RA,
            rb_C3220_u_1,
            rb_C3220_u_2,
            rb_C3220_u_DK,
            rb_C3220_u_RA,
            rb_C3221_1,
            rb_C3221_2,
            rb_C3221_3,
            rb_C3222_1,
            rb_C3222_2,
            rb_C3222_DK,
            rb_C3222_RA,
            rb_C3223_1,
            rb_C3223_2,
            rb_C3223_DK,
            rb_C3223_RA,
            rb_C3224_1,
            rb_C3224_2,
            rb_C3224_DK,
            rb_C3224_RA,
            rb_C3225_1,
            rb_C3225_2,
            rb_C3225_DK,
            rb_C3225_RA,
            rb_C3226_1,
            rb_C3226_2,
            rb_C3226_DK,
            rb_C3226_RA,
            rb_C3227_1,
            rb_C3227_2,
            rb_C3227_DK,
            rb_C3227_RA,
            rb_C3227_1_1,
            rb_C3227_1_2,
            rb_C3227_1_DK,
            rb_C3227_1_RA,
            rb_C3227_2_1,
            rb_C3227_2_2,
            rb_C3227_2_3,
            rb_C3227_2_4,
            rb_C3227_2_5,
            rb_C3227_2_6,
            rb_C3227_2_DK,
            rb_C3227_2_RA,
            rb_C3227_3_1,
            rb_C3227_3_2,
            rb_C3227_3_3,
            rb_C3227_3_4,
            rb_C3227_3_5,
            rb_C3227_3_6,
            rb_C3227_3_7,
            rb_C3227_3_DK,
            rb_C3227_3_RA,
            rb_C3227_4_1,
            rb_C3227_4_2,
            rb_C3227_4_DK,
            rb_C3227_4_RA,
            rb_C3227_5_1,
            rb_C3227_5_2,
            rb_C3227_5_DK,
            rb_C3227_5_RA,
            rb_C3227_6_1,
            rb_C3227_6_2,
            rb_C3227_6_DK,
            rb_C3227_6_RA,
            rb_C3227_7_1,
            rb_C3227_7_2,
            rb_C3227_7_DK,
            rb_C3227_7_RA,
            rb_C3227_8_1,
            rb_C3227_8_2,
            rb_C3227_8_DK,
            rb_C3227_8_RA,
            rb_C3227_9_1,
            rb_C3227_9_2,
            rb_C3227_9_DK,
            rb_C3227_9_RA,
            rb_C3227_10_1,
            rb_C3227_10_2,
            rb_C3227_10_3,
            rb_C3227_10_4,
            rb_C3227_10_DK,
            rb_C3227_10_RA,
            rb_C3227_11_1,
            rb_C3227_11_2,
            rb_C3227_11_DK,
            rb_C3227_11_RA,
            rb_C3227_12_1,
            rb_C3227_12_2,
            rb_C3227_12_DK,
            rb_C3227_12_RA,
            rb_C3227_13_1,
            rb_C3227_13_2,
            rb_C3227_13_DK,
            rb_C3227_13_RA,
            rb_C3227_14_1,
            rb_C3227_14_2,
            rb_C3227_14_DK,
            rb_C3227_14_RA,
            rb_C3227_15_1,
            rb_C3227_15_2,
            rb_C3227_15_DK,
            rb_C3227_15_RA,
            rb_C3227_16_1,
            rb_C3227_16_2,
            rb_C3227_16_DK,
            rb_C3227_16_RA,
            rb_C3227_17_1,
            rb_C3227_17_2,
            rb_C3227_17_DK,
            rb_C3227_17_RA,
            rb_C3227_18_1,
            rb_C3227_18_2,
            rb_C3227_18_DK,
            rb_C3227_18_RA,
            rb_C3227_19_1,
            rb_C3227_19_2,
            rb_C3227_19_DK,
            rb_C3227_19_RA,
            rb_C3227_20_1,
            rb_C3227_20_2,
            rb_C3227_20_DK,
            rb_C3227_20_RA,
            rb_C3227_21_1,
            rb_C3227_21_2,
            rb_C3227_21_DK,
            rb_C3227_21_RA,
            rb_C3227_22_1,
            rb_C3227_22_2,
            rb_C3227_22_DK,
            rb_C3227_22_RA;


    EditText
            ed_study_id,
            ed_C3122d,
            ed_C3122m,
            ed_C3123_b,
            ed_C3123_c,
            ed_C3131,
            ed_C3132_a,
            ed_C3132_b,
            ed_C3134,
            ed_C3144,
            ed_C3144_a,
            ed_C3144_b,
            ed_C3147_a,
            ed_C3147_b,
            ed_C3150_a,
            ed_C3150_b,
            ed_C3152_a,
            ed_C3152_b,
            ed_C3159_a,
            ed_C3159_b,
            ed_C3159_c,
            ed_C3162d,
            ed_C3162m,
            ed_C3163_a,
            ed_C3163_b,
            ed_C3165_a,
            ed_C3165_b,
            ed_C3172,
            ed_C3175_a,
            ed_C3175_b,
            ed_C3177_a,
            ed_C3177_b,
            ed_C3179_a,
            ed_C3179_b,
            ed_C3184,
            ed_C3193_a,
            ed_C3193_b,
            ed_C3196,
            ed_C3201_a,
            ed_C3201_b,
            ed_C3204_a,
            ed_C3204_b,
            ed_C3208_a,
            ed_C3208_b,
            ed_C3220_a,
            ed_C3220_b,
            ed_C3228;

    String
            study_id,
            C3121,
            C3122,
            C3122d,
            C3122m,
            C3123_u,
            C3123_b,
            C3123_c,
            C3124,
            C3125,
            C3126,
            C3127,
            C3128,
            C3129,
            C3130,
            C3131,
            C3132_u,
            C3132_a,
            C3132_b,
            C3133,
            C3134,
            C3135,
            C3136,
            C3137,
            C3138,
            C3139,
            C3140,
            C3141,
            C3142,
            C3143,
            C3144_u,
            C3144,
            C3144_a,
            C3144_b,
            C3145,
            C3146,
            C3147_u,
            C3147_a,
            C3147_b,
            C3148,
            C3149,
            C3150_u,
            C3150_a,
            C3150_b,
            C3151,
            C3152_u,
            C3152_a,
            C3152_b,
            C3153,
            C3154,
            C3155,
            C3156,
            C3157,
            C3158,
            C3159_u,
            C3159_a,
            C3159_b,
            C3159_c,
            C3160,
            C3161,
            C3162,
            C3162d,
            C3162m,
            C3163_u,
            C3163_a,
            C3163_b,
            C3164,
            C3165_u,
            C3165_a,
            C3165_b,
            C3166,
            C3167,
            C3168,
            C3169,
            C3170,
            C3171,
            C3172,
            C3173,
            C3174,
            C3175_u,
            C3175_a,
            C3175_b,
            C3176,
            C3177_u,
            C3177_a,
            C3177_b,
            C3178,
            C3179_u,
            C3179_a,
            C3179_b,
            C3180,
            C3181,
            C3182,
            C3183,
            C3184,
            C3185,
            C3186_1,
            C3186,
            C3187,
            C3188,
            C3189,
            C3190,
            C3191,
            C3192,
            C3193_u,
            C3193_a,
            C3193_b,
            C3194,
            C3195A,
            C3195,
            C3196,
            C3197,
            C3198,
            C3199,
            C3199_1,
            C3200,
            C3201_u,
            C3201_a,
            C3201_b,
            C3202,
            C3203,
            C3204_u,
            C3204_a,
            C3204_b,
            C3205,
            C3206,
            C3207,
            C3208_u,
            C3208_a,
            C3208_b,
            C3209,
            C3210,
            C3212,
            C3213,
            C3214,
            C3215,
            C3216,
            C3217,
            C3218,
            C3219,
            C3220_u,
            C3220_a,
            C3220_b,
            C3221,
            C3222,
            C3223,
            C3224,
            C3225,
            C3226,
            C3227,
            C3227_1,
            C3227_2,
            C3227_3,
            C3227_4,
            C3227_5,
            C3227_6,
            C3227_7,
            C3227_8,
            C3227_9,
            C3227_10,
            C3227_11,
            C3227_12,
            C3227_13,
            C3227_14,
            C3227_15,
            C3227_16,
            C3227_17,
            C3227_18,
            C3227_19,
            C3227_20,
            C3227_21,
            C3227_22,
            C3228,
            STATUS;


    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3121_c3228);

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

        Intent c = new Intent(this, C3301_C3314.class);

        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts

        ll_C3121 = findViewById(R.id.ll_C3121);
        ll_C3122 = findViewById(R.id.ll_C3122);
        ll_C3122d = findViewById(R.id.ll_C3122d);
        ll_C3122m = findViewById(R.id.ll_C3122m);
        ll_C3123_u = findViewById(R.id.ll_C3123_u);
        ll_C3123_b = findViewById(R.id.ll_C3123_b);
        ll_C3123_c = findViewById(R.id.ll_C3123_c);
        ll_C3124 = findViewById(R.id.ll_C3124);
        ll_C3125 = findViewById(R.id.ll_C3125);
        ll_C3126 = findViewById(R.id.ll_C3126);
        ll_C3127 = findViewById(R.id.ll_C3127);
        ll_C3128 = findViewById(R.id.ll_C3128);
        ll_C3129 = findViewById(R.id.ll_C3129);
        ll_C3130 = findViewById(R.id.ll_C3130);
        ll_C3131 = findViewById(R.id.ll_C3131);
        ll_C3132_u = findViewById(R.id.ll_C3132_u);
        ll_C3132_a = findViewById(R.id.ll_C3132_a);
        ll_C3132_b = findViewById(R.id.ll_C3132_b);
        ll_C3133 = findViewById(R.id.ll_C3133);
        ll_C3134 = findViewById(R.id.ll_C3134);
        ll_C3135 = findViewById(R.id.ll_C3135);
        ll_C3136 = findViewById(R.id.ll_C3136);
        ll_C3137 = findViewById(R.id.ll_C3137);
        ll_C3138 = findViewById(R.id.ll_C3138);
        ll_C3139 = findViewById(R.id.ll_C3139);
        ll_C3140 = findViewById(R.id.ll_C3140);
        ll_C3141 = findViewById(R.id.ll_C3141);
        ll_C3142 = findViewById(R.id.ll_C3142);
        ll_C3143 = findViewById(R.id.ll_C3143);
        ll_C3144_u = findViewById(R.id.ll_C3144_u);
        ll_C3144 = findViewById(R.id.ll_C3144);
        ll_C3144_a = findViewById(R.id.ll_C3144_a);
        ll_C3144_b = findViewById(R.id.ll_C3144_b);
        ll_C3145 = findViewById(R.id.ll_C3145);
        ll_C3146 = findViewById(R.id.ll_C3146);
        ll_C3147_u = findViewById(R.id.ll_C3147_u);
        ll_C3147_a = findViewById(R.id.ll_C3147_a);
        ll_C3147_b = findViewById(R.id.ll_C3147_b);
        ll_C3148 = findViewById(R.id.ll_C3148);
        ll_C3149 = findViewById(R.id.ll_C3149);
        ll_C3150_u = findViewById(R.id.ll_C3150_u);
        ll_C3150_a = findViewById(R.id.ll_C3150_a);
        ll_C3150_b = findViewById(R.id.ll_C3150_b);
        ll_C3151 = findViewById(R.id.ll_C3151);
        ll_C3152_u = findViewById(R.id.ll_C3152_u);
        ll_C3152_a = findViewById(R.id.ll_C3152_a);
        ll_C3152_b = findViewById(R.id.ll_C3152_b);
        ll_C3153 = findViewById(R.id.ll_C3153);
        ll_C3154 = findViewById(R.id.ll_C3154);
        ll_C3155 = findViewById(R.id.ll_C3155);
        ll_C3156 = findViewById(R.id.ll_C3156);
        ll_C3157 = findViewById(R.id.ll_C3157);
        ll_C3158 = findViewById(R.id.ll_C3158);
        ll_C3159_u = findViewById(R.id.ll_C3159_u);
        ll_C3159_a = findViewById(R.id.ll_C3159_a);
        ll_C3159_b = findViewById(R.id.ll_C3159_b);
        ll_C3159_c = findViewById(R.id.ll_C3159_c);
        ll_C3160 = findViewById(R.id.ll_C3160);
        ll_C3161 = findViewById(R.id.ll_C3161);
        ll_C3162 = findViewById(R.id.ll_C3162);
        ll_C3162d = findViewById(R.id.ll_C3162d);
        ll_C3162m = findViewById(R.id.ll_C3162m);
        ll_C3163_u = findViewById(R.id.ll_C3163_u);
        ll_C3163_a = findViewById(R.id.ll_C3163_a);
        ll_C3163_b = findViewById(R.id.ll_C3163_b);
        ll_C3164 = findViewById(R.id.ll_C3164);
        ll_C3165_u = findViewById(R.id.ll_C3165_u);
        ll_C3165_a = findViewById(R.id.ll_C3165_a);
        ll_C3165_b = findViewById(R.id.ll_C3165_b);
        ll_C3166 = findViewById(R.id.ll_C3166);
        ll_C3167 = findViewById(R.id.ll_C3167);
        ll_C3168 = findViewById(R.id.ll_C3168);
        ll_C3169 = findViewById(R.id.ll_C3169);
        ll_C3170 = findViewById(R.id.ll_C3170);
        ll_C3171 = findViewById(R.id.ll_C3171);
        ll_C3172 = findViewById(R.id.ll_C3172);
        ll_C3173 = findViewById(R.id.ll_C3173);
        ll_C3174 = findViewById(R.id.ll_C3174);
        ll_C3175_u = findViewById(R.id.ll_C3175_u);
        ll_C3175_a = findViewById(R.id.ll_C3175_a);
        ll_C3175_b = findViewById(R.id.ll_C3175_b);
        ll_C3176 = findViewById(R.id.ll_C3176);
        ll_C3177_u = findViewById(R.id.ll_C3177_u);
        ll_C3177_a = findViewById(R.id.ll_C3177_a);
        ll_C3177_b = findViewById(R.id.ll_C3177_b);
        ll_C3178 = findViewById(R.id.ll_C3178);
        ll_C3179_u = findViewById(R.id.ll_C3179_u);
        ll_C3179_a = findViewById(R.id.ll_C3179_a);
        ll_C3179_b = findViewById(R.id.ll_C3179_b);
        ll_C3180 = findViewById(R.id.ll_C3180);
        ll_C3181 = findViewById(R.id.ll_C3181);
        ll_C3182 = findViewById(R.id.ll_C3182);
        ll_C3183 = findViewById(R.id.ll_C3183);
        ll_C3184 = findViewById(R.id.ll_C3184);
        ll_C3185 = findViewById(R.id.ll_C3185);
        ll_C3186_1 = findViewById(R.id.ll_C3186_1);
        ll_C3186 = findViewById(R.id.ll_C3186);
        ll_C3187 = findViewById(R.id.ll_C3187);
        ll_C3188 = findViewById(R.id.ll_C3188);
        ll_C3189 = findViewById(R.id.ll_C3189);
        ll_C3190 = findViewById(R.id.ll_C3190);
        ll_C3191 = findViewById(R.id.ll_C3191);
        ll_C3192 = findViewById(R.id.ll_C3192);
        ll_C3193_u = findViewById(R.id.ll_C3193_u);
        ll_C3193_a = findViewById(R.id.ll_C3193_a);
        ll_C3193_b = findViewById(R.id.ll_C3193_b);
        ll_C3194 = findViewById(R.id.ll_C3194);
        ll_C3195A = findViewById(R.id.ll_C3195A);
        ll_C3195 = findViewById(R.id.ll_C3195);
        ll_C3196 = findViewById(R.id.ll_C3196);
        ll_C3197 = findViewById(R.id.ll_C3197);
        ll_C3198 = findViewById(R.id.ll_C3198);
        ll_C3199 = findViewById(R.id.ll_C3199);
        ll_C3199_1 = findViewById(R.id.ll_C3199_1);
        ll_C3200 = findViewById(R.id.ll_C3200);
        ll_C3201_u = findViewById(R.id.ll_C3201_u);
        ll_C3201_a = findViewById(R.id.ll_C3201_a);
        ll_C3201_b = findViewById(R.id.ll_C3201_b);
        ll_C3202 = findViewById(R.id.ll_C3202);
        ll_C3203 = findViewById(R.id.ll_C3203);
        ll_C3204_u = findViewById(R.id.ll_C3204_u);
        ll_C3204_a = findViewById(R.id.ll_C3204_a);
        ll_C3204_b = findViewById(R.id.ll_C3204_b);
        ll_C3205 = findViewById(R.id.ll_C3205);
        ll_C3206 = findViewById(R.id.ll_C3206);
        ll_C3207 = findViewById(R.id.ll_C3207);
        ll_C3208_u = findViewById(R.id.ll_C3208_u);
        ll_C3208_a = findViewById(R.id.ll_C3208_a);
        ll_C3208_b = findViewById(R.id.ll_C3208_b);
        ll_C3209 = findViewById(R.id.ll_C3209);
        ll_C3210 = findViewById(R.id.ll_C3210);
        ll_C3212 = findViewById(R.id.ll_C3212);
        ll_C3213 = findViewById(R.id.ll_C3213);
        ll_C3214 = findViewById(R.id.ll_C3214);
        ll_C3215 = findViewById(R.id.ll_C3215);
        ll_C3216 = findViewById(R.id.ll_C3216);
        ll_C3217 = findViewById(R.id.ll_C3217);
        ll_C3218 = findViewById(R.id.ll_C3218);
        ll_C3219 = findViewById(R.id.ll_C3219);
        ll_C3220_u = findViewById(R.id.ll_C3220_u);
        ll_C3220_a = findViewById(R.id.ll_C3220_a);
        ll_C3220_b = findViewById(R.id.ll_C3220_b);
        ll_C3221 = findViewById(R.id.ll_C3221);
        ll_C3222 = findViewById(R.id.ll_C3222);
        ll_C3223 = findViewById(R.id.ll_C3223);
        ll_C3224 = findViewById(R.id.ll_C3224);
        ll_C3225 = findViewById(R.id.ll_C3225);
        ll_C3226 = findViewById(R.id.ll_C3226);
        ll_C3227 = findViewById(R.id.ll_C3227);
        ll_C3227_1 = findViewById(R.id.ll_C3227_1);
        ll_C3227_2 = findViewById(R.id.ll_C3227_2);
        ll_C3227_3 = findViewById(R.id.ll_C3227_3);
        ll_C3227_4 = findViewById(R.id.ll_C3227_4);
        ll_C3227_5 = findViewById(R.id.ll_C3227_5);
        ll_C3227_6 = findViewById(R.id.ll_C3227_6);
        ll_C3227_7 = findViewById(R.id.ll_C3227_7);
        ll_C3227_8 = findViewById(R.id.ll_C3227_8);
        ll_C3227_9 = findViewById(R.id.ll_C3227_9);
        ll_C3227_10 = findViewById(R.id.ll_C3227_10);
        ll_C3227_11 = findViewById(R.id.ll_C3227_11);
        ll_C3227_12 = findViewById(R.id.ll_C3227_12);
        ll_C3227_13 = findViewById(R.id.ll_C3227_13);
        ll_C3227_14 = findViewById(R.id.ll_C3227_14);
        ll_C3227_15 = findViewById(R.id.ll_C3227_15);
        ll_C3227_16 = findViewById(R.id.ll_C3227_16);
        ll_C3227_17 = findViewById(R.id.ll_C3227_17);
        ll_C3227_18 = findViewById(R.id.ll_C3227_18);
        ll_C3227_19 = findViewById(R.id.ll_C3227_19);
        ll_C3227_20 = findViewById(R.id.ll_C3227_20);
        ll_C3227_21 = findViewById(R.id.ll_C3227_21);
        ll_C3227_22 = findViewById(R.id.ll_C3227_22);
        ll_C3228 = findViewById(R.id.ll_C3228);

        // Radio Buttons

        rb_C3121_1 = findViewById(R.id.rb_C3121_1);
        rb_C3121_2 = findViewById(R.id.rb_C3121_2);
        rb_C3121_DK = findViewById(R.id.rb_C3121_DK);
        rb_C3123_u_1 = findViewById(R.id.rb_C3123_u_1);
        rb_C3123_u_2 = findViewById(R.id.rb_C3123_u_2);
        rb_C3123_u_DK = findViewById(R.id.rb_C3123_u_DK);
        rb_C3122_1 = findViewById(R.id.rb_C3122_1);
        rb_C3122_2 = findViewById(R.id.rb_C3122_2);
        rb_C3122_3 = findViewById(R.id.rb_C3122_3);
        rb_C3122_DK = findViewById(R.id.rb_C3122_DK);
        rb_C3123_u_RA = findViewById(R.id.rb_C3123_u_RA);
        rb_C3124_1 = findViewById(R.id.rb_C3124_1);
        rb_C3124_2 = findViewById(R.id.rb_C3124_2);
        rb_C3124_DK = findViewById(R.id.rb_C3124_DK);
        rb_C3124_RA = findViewById(R.id.rb_C3124_RA);
        rb_C3125_1 = findViewById(R.id.rb_C3125_1);
        rb_C3125_2 = findViewById(R.id.rb_C3125_2);
        rb_C3125_3 = findViewById(R.id.rb_C3125_3);
        rb_C3125_DK = findViewById(R.id.rb_C3125_DK);
        rb_C3125_RA = findViewById(R.id.rb_C3125_RA);
        rb_C3126_1 = findViewById(R.id.rb_C3126_1);
        rb_C3126_2 = findViewById(R.id.rb_C3126_2);
        rb_C3126_3 = findViewById(R.id.rb_C3126_3);
        rb_C3126_DK = findViewById(R.id.rb_C3126_DK);
        rb_C3126_RA = findViewById(R.id.rb_C3126_RA);
        rb_C3127_1 = findViewById(R.id.rb_C3127_1);
        rb_C3127_2 = findViewById(R.id.rb_C3127_2);
        rb_C3127_DK = findViewById(R.id.rb_C3127_DK);
        rb_C3127_RA = findViewById(R.id.rb_C3127_RA);
        rb_C3128_1 = findViewById(R.id.rb_C3128_1);
        rb_C3128_2 = findViewById(R.id.rb_C3128_2);
        rb_C3128_DK = findViewById(R.id.rb_C3128_DK);
        rb_C3128_RA = findViewById(R.id.rb_C3128_RA);
        rb_C3129_1 = findViewById(R.id.rb_C3129_1);
        rb_C3129_2 = findViewById(R.id.rb_C3129_2);
        rb_C3129_DK = findViewById(R.id.rb_C3129_DK);
        rb_C3129_RA = findViewById(R.id.rb_C3129_RA);
        rb_C3130_1 = findViewById(R.id.rb_C3130_1);
        rb_C3130_2 = findViewById(R.id.rb_C3130_2);
        rb_C3130_DK = findViewById(R.id.rb_C3130_DK);
        rb_C3130_RA = findViewById(R.id.rb_C3130_RA);
        rb_C3132_u_1 = findViewById(R.id.rb_C3132_u_1);
        rb_C3132_u_2 = findViewById(R.id.rb_C3132_u_2);
        rb_C3132_u_DK = findViewById(R.id.rb_C3132_u_DK);
        rb_C3132_u_RA = findViewById(R.id.rb_C3132_u_RA);
        rb_C3133_1 = findViewById(R.id.rb_C3133_1);
        rb_C3133_2 = findViewById(R.id.rb_C3133_2);
        rb_C3133_DK = findViewById(R.id.rb_C3133_DK);
        rb_C3133_RA = findViewById(R.id.rb_C3133_RA);
        rb_C3135_1 = findViewById(R.id.rb_C3135_1);
        rb_C3135_2 = findViewById(R.id.rb_C3135_2);
        rb_C3135_DK = findViewById(R.id.rb_C3135_DK);
        rb_C3135_RA = findViewById(R.id.rb_C3135_RA);
        rb_C3136_1 = findViewById(R.id.rb_C3136_1);
        rb_C3136_2 = findViewById(R.id.rb_C3136_2);
        rb_C3136_DK = findViewById(R.id.rb_C3136_DK);
        rb_C3136_RA = findViewById(R.id.rb_C3136_RA);
        rb_C3137_1 = findViewById(R.id.rb_C3137_1);
        rb_C3137_2 = findViewById(R.id.rb_C3137_2);
        rb_C3137_DK = findViewById(R.id.rb_C3137_DK);
        rb_C3137_RA = findViewById(R.id.rb_C3137_RA);
        rb_C3138_1 = findViewById(R.id.rb_C3138_1);
        rb_C3138_2 = findViewById(R.id.rb_C3138_2);
        rb_C3138_DK = findViewById(R.id.rb_C3138_DK);
        rb_C3138_RA = findViewById(R.id.rb_C3138_RA);
        rb_C3139_1 = findViewById(R.id.rb_C3139_1);
        rb_C3139_2 = findViewById(R.id.rb_C3139_2);
        rb_C3139_DK = findViewById(R.id.rb_C3139_DK);
        rb_C3139_RA = findViewById(R.id.rb_C3139_RA);
        rb_C3140_1 = findViewById(R.id.rb_C3140_1);
        rb_C3140_2 = findViewById(R.id.rb_C3140_2);
        rb_C3140_DK = findViewById(R.id.rb_C3140_DK);
        rb_C3140_RA = findViewById(R.id.rb_C3140_RA);
        rb_C3141_1 = findViewById(R.id.rb_C3141_1);
        rb_C3141_2 = findViewById(R.id.rb_C3141_2);
        rb_C3141_DK = findViewById(R.id.rb_C3141_DK);
        rb_C3141_RA = findViewById(R.id.rb_C3141_RA);
        rb_C3142_1 = findViewById(R.id.rb_C3142_1);
        rb_C3142_2 = findViewById(R.id.rb_C3142_2);
        rb_C3142_DK = findViewById(R.id.rb_C3142_DK);
        rb_C3142_RA = findViewById(R.id.rb_C3142_RA);
        rb_C3143_1 = findViewById(R.id.rb_C3143_1);
        rb_C3143_2 = findViewById(R.id.rb_C3143_2);
        rb_C3143_DK = findViewById(R.id.rb_C3143_DK);
        rb_C3143_RA = findViewById(R.id.rb_C3143_RA);
        rb_C3144_u_1 = findViewById(R.id.rb_C3144_u_1);
        rb_C3144_u_2 = findViewById(R.id.rb_C3144_u_2);
        rb_C3144_u_3 = findViewById(R.id.rb_C3144_u_3);
        rb_C3144_u_DK = findViewById(R.id.rb_C3144_u_DK);
        rb_C3144_u_RA = findViewById(R.id.rb_C3144_u_RA);
        rb_C3145_1 = findViewById(R.id.rb_C3145_1);
        rb_C3145_2 = findViewById(R.id.rb_C3145_2);
        rb_C3145_3 = findViewById(R.id.rb_C3145_3);
        rb_C3145_DK = findViewById(R.id.rb_C3145_DK);
        rb_C3145_RA = findViewById(R.id.rb_C3145_RA);
        rb_C3146_1 = findViewById(R.id.rb_C3146_1);
        rb_C3146_2 = findViewById(R.id.rb_C3146_2);
        rb_C3146_DK = findViewById(R.id.rb_C3146_DK);
        rb_C3146_RA = findViewById(R.id.rb_C3146_RA);
        rb_C3147_u_3 = findViewById(R.id.rb_C3147_u_3);
        rb_C3147_u_4 = findViewById(R.id.rb_C3147_u_4);
        rb_C3147_u_DK = findViewById(R.id.rb_C3147_u_DK);
        rb_C3147_u_RA = findViewById(R.id.rb_C3147_u_RA);
        rb_C3148_1 = findViewById(R.id.rb_C3148_1);
        rb_C3148_2 = findViewById(R.id.rb_C3148_2);
        rb_C3148_DK = findViewById(R.id.rb_C3148_DK);
        rb_C3148_RA = findViewById(R.id.rb_C3148_RA);
        rb_C3149_1 = findViewById(R.id.rb_C3149_1);
        rb_C3149_2 = findViewById(R.id.rb_C3149_2);
        rb_C3149_DK = findViewById(R.id.rb_C3149_DK);
        rb_C3149_RA = findViewById(R.id.rb_C3149_RA);
        rb_C3150_u_1 = findViewById(R.id.rb_C3150_u_1);
        rb_C3150_u_2 = findViewById(R.id.rb_C3150_u_2);
        rb_C3150_u_DK = findViewById(R.id.rb_C3150_u_DK);
        rb_C3150_u_RA = findViewById(R.id.rb_C3150_u_RA);
        rb_C3151_1 = findViewById(R.id.rb_C3151_1);
        rb_C3151_2 = findViewById(R.id.rb_C3151_2);
        rb_C3151_DK = findViewById(R.id.rb_C3151_DK);
        rb_C3152_u_1 = findViewById(R.id.rb_C3152_u_1);
        rb_C3152_u_2 = findViewById(R.id.rb_C3152_u_2);
        rb_C3152_u_DK = findViewById(R.id.rb_C3152_u_DK);
        rb_C3152_u_RA = findViewById(R.id.rb_C3152_u_RA);
        rb_C3153_1 = findViewById(R.id.rb_C3153_1);
        rb_C3153_2 = findViewById(R.id.rb_C3153_2);
        rb_C3153_DK = findViewById(R.id.rb_C3153_DK);
        rb_C3153_RA = findViewById(R.id.rb_C3153_RA);
        rb_C3154_1 = findViewById(R.id.rb_C3154_1);
        rb_C3154_2 = findViewById(R.id.rb_C3154_2);
        rb_C3154_DK = findViewById(R.id.rb_C3154_DK);
        rb_C3154_RA = findViewById(R.id.rb_C3154_RA);
        rb_C3155_1 = findViewById(R.id.rb_C3155_1);
        rb_C3155_2 = findViewById(R.id.rb_C3155_2);
        rb_C3155_DK = findViewById(R.id.rb_C3155_DK);
        rb_C3155_RA = findViewById(R.id.rb_C3155_RA);
        rb_C3156_1 = findViewById(R.id.rb_C3156_1);
        rb_C3156_2 = findViewById(R.id.rb_C3156_2);
        rb_C3156_DK = findViewById(R.id.rb_C3156_DK);
        rb_C3156_RA = findViewById(R.id.rb_C3156_RA);
        rb_C3157_1 = findViewById(R.id.rb_C3157_1);
        rb_C3157_2 = findViewById(R.id.rb_C3157_2);
        rb_C3157_DK = findViewById(R.id.rb_C3157_DK);
        rb_C3157_RA = findViewById(R.id.rb_C3157_RA);
        rb_C3158_1 = findViewById(R.id.rb_C3158_1);
        rb_C3158_2 = findViewById(R.id.rb_C3158_2);
        rb_C3158_DK = findViewById(R.id.rb_C3158_DK);
        rb_C3158_RA = findViewById(R.id.rb_C3158_RA);
        rb_C3159_u_1 = findViewById(R.id.rb_C3159_u_1);
        rb_C3159_u_2 = findViewById(R.id.rb_C3159_u_2);
        rb_C3159_u_3 = findViewById(R.id.rb_C3159_u_3);
        rb_C3159_u_DK = findViewById(R.id.rb_C3159_u_DK);
        rb_C3159_u_RA = findViewById(R.id.rb_C3159_u_RA);
        rb_C3160_1 = findViewById(R.id.rb_C3160_1);
        rb_C3160_2 = findViewById(R.id.rb_C3160_2);
        rb_C3160_DK = findViewById(R.id.rb_C3160_DK);
        rb_C3160_RA = findViewById(R.id.rb_C3160_RA);
        rb_C3161_1 = findViewById(R.id.rb_C3161_1);
        rb_C3161_2 = findViewById(R.id.rb_C3161_2);
        rb_C3161_DK = findViewById(R.id.rb_C3161_DK);
        rb_C3161_RA = findViewById(R.id.rb_C3161_RA);
        rb_C3162_1 = findViewById(R.id.rb_C3162_1);
        rb_C3162_2 = findViewById(R.id.rb_C3162_2);
        rb_C3162_3 = findViewById(R.id.rb_C3162_3);
        rb_C3162_DK = findViewById(R.id.rb_C3162_DK);
        rb_C3163_u_1 = findViewById(R.id.rb_C3163_u_1);
        rb_C3163_u_2 = findViewById(R.id.rb_C3163_u_2);
        rb_C3163_u_DK = findViewById(R.id.rb_C3163_u_DK);
        rb_C3163_u_RA = findViewById(R.id.rb_C3163_u_RA);
        rb_C3164_1 = findViewById(R.id.rb_C3164_1);
        rb_C3164_2 = findViewById(R.id.rb_C3164_2);
        rb_C3164_DK = findViewById(R.id.rb_C3164_DK);
        rb_C3164_RA = findViewById(R.id.rb_C3164_RA);
        rb_C3165_u_1 = findViewById(R.id.rb_C3165_u_1);
        rb_C3165_u_2 = findViewById(R.id.rb_C3165_u_2);
        rb_C3165_u_DK = findViewById(R.id.rb_C3165_u_DK);
        rb_C3165_u_RA = findViewById(R.id.rb_C3165_u_RA);
        rb_C3166_1 = findViewById(R.id.rb_C3166_1);
        rb_C3166_2 = findViewById(R.id.rb_C3166_2);
        rb_C3166_DK = findViewById(R.id.rb_C3166_DK);
        rb_C3166_RA = findViewById(R.id.rb_C3166_RA);
        rb_C3168_1 = findViewById(R.id.rb_C3168_1);
        rb_C3168_2 = findViewById(R.id.rb_C3168_2);
        rb_C3168_DK = findViewById(R.id.rb_C3168_DK);
        rb_C3168_RA = findViewById(R.id.rb_C3168_RA);
        rb_C3169_1 = findViewById(R.id.rb_C3169_1);
        rb_C3169_2 = findViewById(R.id.rb_C3169_2);
        rb_C3169_DK = findViewById(R.id.rb_C3169_DK);
        rb_C3169_RA = findViewById(R.id.rb_C3169_RA);
        rb_C3170_1 = findViewById(R.id.rb_C3170_1);
        rb_C3170_2 = findViewById(R.id.rb_C3170_2);
        rb_C3170_DK = findViewById(R.id.rb_C3170_DK);
        rb_C3170_RA = findViewById(R.id.rb_C3170_RA);
        rb_C3171_1 = findViewById(R.id.rb_C3171_1);
        rb_C3171_2 = findViewById(R.id.rb_C3171_2);
        rb_C3171_DK = findViewById(R.id.rb_C3171_DK);
        rb_C3171_RA = findViewById(R.id.rb_C3171_RA);
        rb_C3173_1 = findViewById(R.id.rb_C3173_1);
        rb_C3173_2 = findViewById(R.id.rb_C3173_2);
        rb_C3173_DK = findViewById(R.id.rb_C3173_DK);
        rb_C3173_RA = findViewById(R.id.rb_C3173_RA);
        rb_C3174_1 = findViewById(R.id.rb_C3174_1);
        rb_C3174_2 = findViewById(R.id.rb_C3174_2);
        rb_C3174_DK = findViewById(R.id.rb_C3174_DK);
        rb_C3174_RA = findViewById(R.id.rb_C3174_RA);
        rb_C3175_u_1 = findViewById(R.id.rb_C3175_u_1);
        rb_C3175_u_2 = findViewById(R.id.rb_C3175_u_2);
        rb_C3175_u_DK = findViewById(R.id.rb_C3175_u_DK);
        rb_C3175_u_RA = findViewById(R.id.rb_C3175_u_RA);
        rb_C3176_1 = findViewById(R.id.rb_C3176_1);
        rb_C3176_2 = findViewById(R.id.rb_C3176_2);
        rb_C3176_DK = findViewById(R.id.rb_C3176_DK);
        rb_C3176_RA = findViewById(R.id.rb_C3176_RA);
        rb_C3177_u_1 = findViewById(R.id.rb_C3177_u_1);
        rb_C3177_u_2 = findViewById(R.id.rb_C3177_u_2);
        rb_C3177_u_DK = findViewById(R.id.rb_C3177_u_DK);
        rb_C3177_u_RA = findViewById(R.id.rb_C3177_u_RA);
        rb_C3178_1 = findViewById(R.id.rb_C3178_1);
        rb_C3178_2 = findViewById(R.id.rb_C3178_2);
        rb_C3178_DK = findViewById(R.id.rb_C3178_DK);
        rb_C3178_RA = findViewById(R.id.rb_C3178_RA);
        rb_C3179_u_1 = findViewById(R.id.rb_C3179_u_1);
        rb_C3179_u_2 = findViewById(R.id.rb_C3179_u_2);
        rb_C3179_u_DK = findViewById(R.id.rb_C3179_u_DK);
        rb_C3179_u_RA = findViewById(R.id.rb_C3179_u_RA);
        rb_C3180_1 = findViewById(R.id.rb_C3180_1);
        rb_C3180_2 = findViewById(R.id.rb_C3180_2);
        rb_C3180_DK = findViewById(R.id.rb_C3180_DK);
        rb_C3180_RA = findViewById(R.id.rb_C3180_RA);
        rb_C3181_1 = findViewById(R.id.rb_C3181_1);
        rb_C3181_2 = findViewById(R.id.rb_C3181_2);
        rb_C3181_DK = findViewById(R.id.rb_C3181_DK);
        rb_C3181_RA = findViewById(R.id.rb_C3181_RA);
        rb_C3182_1 = findViewById(R.id.rb_C3182_1);
        rb_C3182_2 = findViewById(R.id.rb_C3182_2);
        rb_C3182_DK = findViewById(R.id.rb_C3182_DK);
        rb_C3182_RA = findViewById(R.id.rb_C3182_RA);
        rb_C3183_1 = findViewById(R.id.rb_C3183_1);
        rb_C3183_2 = findViewById(R.id.rb_C3183_2);
        rb_C3183_DK = findViewById(R.id.rb_C3183_DK);
        rb_C3183_RA = findViewById(R.id.rb_C3183_RA);
        rb_C3185_1 = findViewById(R.id.rb_C3185_1);
        rb_C3185_2 = findViewById(R.id.rb_C3185_2);
        rb_C3185_DK = findViewById(R.id.rb_C3185_DK);
        rb_C3185_RA = findViewById(R.id.rb_C3185_RA);
        rb_C3186_1_1 = findViewById(R.id.rb_C3186_1_1);
        rb_C3186_1_2 = findViewById(R.id.rb_C3186_1_2);
        rb_C3186_1_DK = findViewById(R.id.rb_C3186_1_DK);
        rb_C3186_1_RA = findViewById(R.id.rb_C3186_1_RA);
        rb_C3186_1 = findViewById(R.id.rb_C3186_1);
        rb_C3186_2 = findViewById(R.id.rb_C3186_2);
        rb_C3186_DK = findViewById(R.id.rb_C3186_DK);
        rb_C3186_RA = findViewById(R.id.rb_C3186_RA);
        rb_C3187_1 = findViewById(R.id.rb_C3187_1);
        rb_C3187_2 = findViewById(R.id.rb_C3187_2);
        rb_C3187_DK = findViewById(R.id.rb_C3187_DK);
        rb_C3187_RA = findViewById(R.id.rb_C3187_RA);
        rb_C3188_1 = findViewById(R.id.rb_C3188_1);
        rb_C3188_2 = findViewById(R.id.rb_C3188_2);
        rb_C3188_DK = findViewById(R.id.rb_C3188_DK);
        rb_C3188_RA = findViewById(R.id.rb_C3188_RA);
        rb_C3189_1 = findViewById(R.id.rb_C3189_1);
        rb_C3189_2 = findViewById(R.id.rb_C3189_2);
        rb_C3189_DK = findViewById(R.id.rb_C3189_DK);
        rb_C3189_RA = findViewById(R.id.rb_C3189_RA);
        rb_C3190_1 = findViewById(R.id.rb_C3190_1);
        rb_C3190_2 = findViewById(R.id.rb_C3190_2);
        rb_C3190_DK = findViewById(R.id.rb_C3190_DK);
        rb_C3190_RA = findViewById(R.id.rb_C3190_RA);
        rb_C3191_1 = findViewById(R.id.rb_C3191_1);
        rb_C3191_2 = findViewById(R.id.rb_C3191_2);
        rb_C3191_DK = findViewById(R.id.rb_C3191_DK);
        rb_C3191_RA = findViewById(R.id.rb_C3191_RA);
        rb_C3192_1 = findViewById(R.id.rb_C3192_1);
        rb_C3192_2 = findViewById(R.id.rb_C3192_2);
        rb_C3192_DK = findViewById(R.id.rb_C3192_DK);
        rb_C3192_RA = findViewById(R.id.rb_C3192_RA);
        rb_C3193_u_3 = findViewById(R.id.rb_C3193_u_3);
        rb_C3193_u_4 = findViewById(R.id.rb_C3193_u_4);
        rb_C3193_u_DK = findViewById(R.id.rb_C3193_u_DK);
        rb_C3193_u_RA = findViewById(R.id.rb_C3193_u_RA);
        rb_C3194_1 = findViewById(R.id.rb_C3194_1);
        rb_C3194_2 = findViewById(R.id.rb_C3194_2);
        rb_C3194_DK = findViewById(R.id.rb_C3194_DK);
        rb_C3194_RA = findViewById(R.id.rb_C3194_RA);
        rb_C3195A_1 = findViewById(R.id.rb_C3195A_1);
        rb_C3195A_2 = findViewById(R.id.rb_C3195A_2);
        rb_C3195A_3 = findViewById(R.id.rb_C3195A_3);
        rb_C3195A_4 = findViewById(R.id.rb_C3195A_4);
        rb_C3195A_DK = findViewById(R.id.rb_C3195A_DK);
        rb_C3195A_RA = findViewById(R.id.rb_C3195A_RA);
        rb_C3195_1 = findViewById(R.id.rb_C3195_1);
        rb_C3195_2 = findViewById(R.id.rb_C3195_2);
        rb_C3195_3 = findViewById(R.id.rb_C3195_3);
        rb_C3195_4 = findViewById(R.id.rb_C3195_4);
        rb_C3195_DK = findViewById(R.id.rb_C3195_DK);
        rb_C3195_RA = findViewById(R.id.rb_C3195_RA);
        rb_C3197_1 = findViewById(R.id.rb_C3197_1);
        rb_C3197_2 = findViewById(R.id.rb_C3197_2);
        rb_C3197_DK = findViewById(R.id.rb_C3197_DK);
        rb_C3197_RA = findViewById(R.id.rb_C3197_RA);
        rb_C3198_1 = findViewById(R.id.rb_C3198_1);
        rb_C3198_2 = findViewById(R.id.rb_C3198_2);
        rb_C3198_DK = findViewById(R.id.rb_C3198_DK);
        rb_C3198_RA = findViewById(R.id.rb_C3198_RA);
        rb_C3199_1 = findViewById(R.id.rb_C3199_1);
        rb_C3199_2 = findViewById(R.id.rb_C3199_2);
        rb_C3199_DK = findViewById(R.id.rb_C3199_DK);
        rb_C3199_RA = findViewById(R.id.rb_C3199_RA);
        rb_C3199_1_1 = findViewById(R.id.rb_C3199_1_1);
        rb_C3199_1_2 = findViewById(R.id.rb_C3199_1_2);
        rb_C3199_1_DK = findViewById(R.id.rb_C3199_1_DK);
        rb_C3199_1_RA = findViewById(R.id.rb_C3199_1_RA);
        rb_C3200_1 = findViewById(R.id.rb_C3200_1);
        rb_C3200_2 = findViewById(R.id.rb_C3200_2);
        rb_C3200_DK = findViewById(R.id.rb_C3200_DK);
        rb_C3200_RA = findViewById(R.id.rb_C3200_RA);
        rb_C3201_u_1 = findViewById(R.id.rb_C3201_u_1);
        rb_C3201_u_2 = findViewById(R.id.rb_C3201_u_2);
        rb_C3201_u_DK = findViewById(R.id.rb_C3201_u_DK);
        rb_C3201_u_RA = findViewById(R.id.rb_C3201_u_RA);
        rb_C3202_1 = findViewById(R.id.rb_C3202_1);
        rb_C3202_2 = findViewById(R.id.rb_C3202_2);
        rb_C3202_DK = findViewById(R.id.rb_C3202_DK);
        rb_C3202_RA = findViewById(R.id.rb_C3202_RA);
        rb_C3203_1 = findViewById(R.id.rb_C3203_1);
        rb_C3203_2 = findViewById(R.id.rb_C3203_2);
        rb_C3203_DK = findViewById(R.id.rb_C3203_DK);
        rb_C3203_RA = findViewById(R.id.rb_C3203_RA);
        rb_C3204_u_1 = findViewById(R.id.rb_C3204_u_1);
        rb_C3204_u_2 = findViewById(R.id.rb_C3204_u_2);
        rb_C3204_u_DK = findViewById(R.id.rb_C3204_u_DK);
        rb_C3204_u_RA = findViewById(R.id.rb_C3204_u_RA);
        rb_C3205_1 = findViewById(R.id.rb_C3205_1);
        rb_C3205_2 = findViewById(R.id.rb_C3205_2);
        rb_C3205_DK = findViewById(R.id.rb_C3205_DK);
        rb_C3205_RA = findViewById(R.id.rb_C3205_RA);
        rb_C3206_1 = findViewById(R.id.rb_C3206_1);
        rb_C3206_2 = findViewById(R.id.rb_C3206_2);
        rb_C3206_DK = findViewById(R.id.rb_C3206_DK);
        rb_C3206_RA = findViewById(R.id.rb_C3206_RA);
        rb_C3207_1 = findViewById(R.id.rb_C3207_1);
        rb_C3207_2 = findViewById(R.id.rb_C3207_2);
        rb_C3207_DK = findViewById(R.id.rb_C3207_DK);
        rb_C3207_RA = findViewById(R.id.rb_C3207_RA);
        rb_C3208_u_0 = findViewById(R.id.rb_C3208_u_0);
        rb_C3208_u_1 = findViewById(R.id.rb_C3208_u_1);
        rb_C3208_u_DK = findViewById(R.id.rb_C3208_u_DK);
        rb_C3208_u_RA = findViewById(R.id.rb_C3208_u_RA);
        rb_C3209_1 = findViewById(R.id.rb_C3209_1);
        rb_C3209_2 = findViewById(R.id.rb_C3209_2);
        rb_C3209_DK = findViewById(R.id.rb_C3209_DK);
        rb_C3209_RA = findViewById(R.id.rb_C3209_RA);
        rb_C3210_1 = findViewById(R.id.rb_C3210_1);
        rb_C3210_2 = findViewById(R.id.rb_C3210_2);
        rb_C3210_DK = findViewById(R.id.rb_C3210_DK);
        rb_C3210_RA = findViewById(R.id.rb_C3210_RA);
        rb_C3212_1 = findViewById(R.id.rb_C3212_1);
        rb_C3212_2 = findViewById(R.id.rb_C3212_2);
        rb_C3212_DK = findViewById(R.id.rb_C3212_DK);
        rb_C3212_RA = findViewById(R.id.rb_C3212_RA);
        rb_C3213_1 = findViewById(R.id.rb_C3213_1);
        rb_C3213_2 = findViewById(R.id.rb_C3213_2);
        rb_C3213_DK = findViewById(R.id.rb_C3213_DK);
        rb_C3213_RA = findViewById(R.id.rb_C3213_RA);
        rb_C3214_1 = findViewById(R.id.rb_C3214_1);
        rb_C3214_2 = findViewById(R.id.rb_C3214_2);
        rb_C3214_DK = findViewById(R.id.rb_C3214_DK);
        rb_C3214_RA = findViewById(R.id.rb_C3214_RA);
        rb_C3215_1 = findViewById(R.id.rb_C3215_1);
        rb_C3215_2 = findViewById(R.id.rb_C3215_2);
        rb_C3215_DK = findViewById(R.id.rb_C3215_DK);
        rb_C3215_RA = findViewById(R.id.rb_C3215_RA);
        rb_C3216_1 = findViewById(R.id.rb_C3216_1);
        rb_C3216_2 = findViewById(R.id.rb_C3216_2);
        rb_C3216_DK = findViewById(R.id.rb_C3216_DK);
        rb_C3216_RA = findViewById(R.id.rb_C3216_RA);
        rb_C3217_1 = findViewById(R.id.rb_C3217_1);
        rb_C3217_2 = findViewById(R.id.rb_C3217_2);
        rb_C3217_DK = findViewById(R.id.rb_C3217_DK);
        rb_C3217_RA = findViewById(R.id.rb_C3217_RA);
        rb_C3218_1 = findViewById(R.id.rb_C3218_1);
        rb_C3218_2 = findViewById(R.id.rb_C3218_2);
        rb_C3218_3 = findViewById(R.id.rb_C3218_3);
        rb_C3218_4 = findViewById(R.id.rb_C3218_4);
        rb_C3218_5 = findViewById(R.id.rb_C3218_5);
        rb_C3218_6 = findViewById(R.id.rb_C3218_6);
        rb_C3218_7 = findViewById(R.id.rb_C3218_7);
        rb_C3218_OT = findViewById(R.id.rb_C3218_OT);
        rb_C3218_DK = findViewById(R.id.rb_C3218_DK);
        rb_C3218_RA = findViewById(R.id.rb_C3218_RA);
        rb_C3219_1 = findViewById(R.id.rb_C3219_1);
        rb_C3219_2 = findViewById(R.id.rb_C3219_2);
        rb_C3219_DK = findViewById(R.id.rb_C3219_DK);
        rb_C3219_RA = findViewById(R.id.rb_C3219_RA);
        rb_C3220_u_1 = findViewById(R.id.rb_C3220_u_1);
        rb_C3220_u_2 = findViewById(R.id.rb_C3220_u_2);
        rb_C3220_u_DK = findViewById(R.id.rb_C3220_u_DK);
        rb_C3220_u_RA = findViewById(R.id.rb_C3220_u_RA);
        rb_C3221_1 = findViewById(R.id.rb_C3221_1);
        rb_C3221_2 = findViewById(R.id.rb_C3221_2);
        rb_C3221_3 = findViewById(R.id.rb_C3221_3);
        rb_C3222_1 = findViewById(R.id.rb_C3222_1);
        rb_C3222_2 = findViewById(R.id.rb_C3222_2);
        rb_C3222_DK = findViewById(R.id.rb_C3222_DK);
        rb_C3222_RA = findViewById(R.id.rb_C3222_RA);
        rb_C3223_1 = findViewById(R.id.rb_C3223_1);
        rb_C3223_2 = findViewById(R.id.rb_C3223_2);
        rb_C3223_DK = findViewById(R.id.rb_C3223_DK);
        rb_C3223_RA = findViewById(R.id.rb_C3223_RA);
        rb_C3224_1 = findViewById(R.id.rb_C3224_1);
        rb_C3224_2 = findViewById(R.id.rb_C3224_2);
        rb_C3224_DK = findViewById(R.id.rb_C3224_DK);
        rb_C3224_RA = findViewById(R.id.rb_C3224_RA);
        rb_C3225_1 = findViewById(R.id.rb_C3225_1);
        rb_C3225_2 = findViewById(R.id.rb_C3225_2);
        rb_C3225_DK = findViewById(R.id.rb_C3225_DK);
        rb_C3225_RA = findViewById(R.id.rb_C3225_RA);
        rb_C3226_1 = findViewById(R.id.rb_C3226_1);
        rb_C3226_2 = findViewById(R.id.rb_C3226_2);
        rb_C3226_DK = findViewById(R.id.rb_C3226_DK);
        rb_C3226_RA = findViewById(R.id.rb_C3226_RA);
        rb_C3227_1 = findViewById(R.id.rb_C3227_1);
        rb_C3227_2 = findViewById(R.id.rb_C3227_2);
        rb_C3227_DK = findViewById(R.id.rb_C3227_DK);
        rb_C3227_RA = findViewById(R.id.rb_C3227_RA);
        rb_C3227_1_1 = findViewById(R.id.rb_C3227_1_1);
        rb_C3227_1_2 = findViewById(R.id.rb_C3227_1_2);
        rb_C3227_1_DK = findViewById(R.id.rb_C3227_1_DK);
        rb_C3227_1_RA = findViewById(R.id.rb_C3227_1_RA);
        rb_C3227_2_1 = findViewById(R.id.rb_C3227_2_1);
        rb_C3227_2_2 = findViewById(R.id.rb_C3227_2_2);
        rb_C3227_2_3 = findViewById(R.id.rb_C3227_2_3);
        rb_C3227_2_4 = findViewById(R.id.rb_C3227_2_4);
        rb_C3227_2_5 = findViewById(R.id.rb_C3227_2_5);
        rb_C3227_2_6 = findViewById(R.id.rb_C3227_2_6);
        rb_C3227_2_DK = findViewById(R.id.rb_C3227_2_DK);
        rb_C3227_2_RA = findViewById(R.id.rb_C3227_2_RA);
        rb_C3227_3_1 = findViewById(R.id.rb_C3227_3_1);
        rb_C3227_3_2 = findViewById(R.id.rb_C3227_3_2);
        rb_C3227_3_3 = findViewById(R.id.rb_C3227_3_3);
        rb_C3227_3_4 = findViewById(R.id.rb_C3227_3_4);
        rb_C3227_3_5 = findViewById(R.id.rb_C3227_3_5);
        rb_C3227_3_6 = findViewById(R.id.rb_C3227_3_6);
        rb_C3227_3_7 = findViewById(R.id.rb_C3227_3_7);
        rb_C3227_3_DK = findViewById(R.id.rb_C3227_3_DK);
        rb_C3227_3_RA = findViewById(R.id.rb_C3227_3_RA);
        rb_C3227_4_1 = findViewById(R.id.rb_C3227_4_1);
        rb_C3227_4_2 = findViewById(R.id.rb_C3227_4_2);
        rb_C3227_4_DK = findViewById(R.id.rb_C3227_4_DK);
        rb_C3227_4_RA = findViewById(R.id.rb_C3227_4_RA);
        rb_C3227_5_1 = findViewById(R.id.rb_C3227_5_1);
        rb_C3227_5_2 = findViewById(R.id.rb_C3227_5_2);
        rb_C3227_5_DK = findViewById(R.id.rb_C3227_5_DK);
        rb_C3227_5_RA = findViewById(R.id.rb_C3227_5_RA);
        rb_C3227_6_1 = findViewById(R.id.rb_C3227_6_1);
        rb_C3227_6_2 = findViewById(R.id.rb_C3227_6_2);
        rb_C3227_6_DK = findViewById(R.id.rb_C3227_6_DK);
        rb_C3227_6_RA = findViewById(R.id.rb_C3227_6_RA);
        rb_C3227_7_1 = findViewById(R.id.rb_C3227_7_1);
        rb_C3227_7_2 = findViewById(R.id.rb_C3227_7_2);
        rb_C3227_7_DK = findViewById(R.id.rb_C3227_7_DK);
        rb_C3227_7_RA = findViewById(R.id.rb_C3227_7_RA);
        rb_C3227_8_1 = findViewById(R.id.rb_C3227_8_1);
        rb_C3227_8_2 = findViewById(R.id.rb_C3227_8_2);
        rb_C3227_8_DK = findViewById(R.id.rb_C3227_8_DK);
        rb_C3227_8_RA = findViewById(R.id.rb_C3227_8_RA);
        rb_C3227_9_1 = findViewById(R.id.rb_C3227_9_1);
        rb_C3227_9_2 = findViewById(R.id.rb_C3227_9_2);
        rb_C3227_9_DK = findViewById(R.id.rb_C3227_9_DK);
        rb_C3227_9_RA = findViewById(R.id.rb_C3227_9_RA);
        rb_C3227_10_1 = findViewById(R.id.rb_C3227_10_1);
        rb_C3227_10_2 = findViewById(R.id.rb_C3227_10_2);
        rb_C3227_10_3 = findViewById(R.id.rb_C3227_10_3);
        rb_C3227_10_4 = findViewById(R.id.rb_C3227_10_4);
        rb_C3227_10_DK = findViewById(R.id.rb_C3227_10_DK);
        rb_C3227_10_RA = findViewById(R.id.rb_C3227_10_RA);
        rb_C3227_11_1 = findViewById(R.id.rb_C3227_11_1);
        rb_C3227_11_2 = findViewById(R.id.rb_C3227_11_2);
        rb_C3227_11_DK = findViewById(R.id.rb_C3227_11_DK);
        rb_C3227_11_RA = findViewById(R.id.rb_C3227_11_RA);
        rb_C3227_12_1 = findViewById(R.id.rb_C3227_12_1);
        rb_C3227_12_2 = findViewById(R.id.rb_C3227_12_2);
        rb_C3227_12_DK = findViewById(R.id.rb_C3227_12_DK);
        rb_C3227_12_RA = findViewById(R.id.rb_C3227_12_RA);
        rb_C3227_13_1 = findViewById(R.id.rb_C3227_13_1);
        rb_C3227_13_2 = findViewById(R.id.rb_C3227_13_2);
        rb_C3227_13_DK = findViewById(R.id.rb_C3227_13_DK);
        rb_C3227_13_RA = findViewById(R.id.rb_C3227_13_RA);
        rb_C3227_14_1 = findViewById(R.id.rb_C3227_14_1);
        rb_C3227_14_2 = findViewById(R.id.rb_C3227_14_2);
        rb_C3227_14_DK = findViewById(R.id.rb_C3227_14_DK);
        rb_C3227_14_RA = findViewById(R.id.rb_C3227_14_RA);
        rb_C3227_15_1 = findViewById(R.id.rb_C3227_15_1);
        rb_C3227_15_2 = findViewById(R.id.rb_C3227_15_2);
        rb_C3227_15_DK = findViewById(R.id.rb_C3227_15_DK);
        rb_C3227_15_RA = findViewById(R.id.rb_C3227_15_RA);
        rb_C3227_16_1 = findViewById(R.id.rb_C3227_16_1);
        rb_C3227_16_2 = findViewById(R.id.rb_C3227_16_2);
        rb_C3227_16_DK = findViewById(R.id.rb_C3227_16_DK);
        rb_C3227_16_RA = findViewById(R.id.rb_C3227_16_RA);
        rb_C3227_17_1 = findViewById(R.id.rb_C3227_17_1);
        rb_C3227_17_2 = findViewById(R.id.rb_C3227_17_2);
        rb_C3227_17_DK = findViewById(R.id.rb_C3227_17_DK);
        rb_C3227_17_RA = findViewById(R.id.rb_C3227_17_RA);
        rb_C3227_18_1 = findViewById(R.id.rb_C3227_18_1);
        rb_C3227_18_2 = findViewById(R.id.rb_C3227_18_2);
        rb_C3227_18_DK = findViewById(R.id.rb_C3227_18_DK);
        rb_C3227_18_RA = findViewById(R.id.rb_C3227_18_RA);
        rb_C3227_19_1 = findViewById(R.id.rb_C3227_19_1);
        rb_C3227_19_2 = findViewById(R.id.rb_C3227_19_2);
        rb_C3227_19_DK = findViewById(R.id.rb_C3227_19_DK);
        rb_C3227_19_RA = findViewById(R.id.rb_C3227_19_RA);
        rb_C3227_20_1 = findViewById(R.id.rb_C3227_20_1);
        rb_C3227_20_2 = findViewById(R.id.rb_C3227_20_2);
        rb_C3227_20_DK = findViewById(R.id.rb_C3227_20_DK);
        rb_C3227_20_RA = findViewById(R.id.rb_C3227_20_RA);
        rb_C3227_21_1 = findViewById(R.id.rb_C3227_21_1);
        rb_C3227_21_2 = findViewById(R.id.rb_C3227_21_2);
        rb_C3227_21_DK = findViewById(R.id.rb_C3227_21_DK);
        rb_C3227_21_RA = findViewById(R.id.rb_C3227_21_RA);
        rb_C3227_22_1 = findViewById(R.id.rb_C3227_22_1);
        rb_C3227_22_2 = findViewById(R.id.rb_C3227_22_2);
        rb_C3227_22_DK = findViewById(R.id.rb_C3227_22_DK);
        rb_C3227_22_RA = findViewById(R.id.rb_C3227_22_RA);


        //ed_C3005d   = (EditText) findViewById(R.id.ed_C3005d);

        ed_C3122d = findViewById(R.id.ed_C3122d);
        ed_C3122m = findViewById(R.id.ed_C3122m);
        ed_C3123_b = findViewById(R.id.ed_C3123_b);
        ed_C3123_c = findViewById(R.id.ed_C3123_c);
        ed_C3131 = findViewById(R.id.ed_C3131);
        ed_C3132_a = findViewById(R.id.ed_C3132_a);
        ed_C3132_b = findViewById(R.id.ed_C3132_b);
        ed_C3134 = findViewById(R.id.ed_C3134);
        ed_C3144 = findViewById(R.id.ed_C3144);
        ed_C3144_a = findViewById(R.id.ed_C3144_a);
        ed_C3144_b = findViewById(R.id.ed_C3144_b);
        ed_C3147_a = findViewById(R.id.ed_C3147_a);
        ed_C3147_b = findViewById(R.id.ed_C3147_b);
        ed_C3150_a = findViewById(R.id.ed_C3150_a);
        ed_C3150_b = findViewById(R.id.ed_C3150_b);
        ed_C3152_a = findViewById(R.id.ed_C3152_a);
        ed_C3152_b = findViewById(R.id.ed_C3152_b);
        ed_C3159_a = findViewById(R.id.ed_C3159_a);
        ed_C3159_b = findViewById(R.id.ed_C3159_b);
        ed_C3159_c = findViewById(R.id.ed_C3159_c);
        ed_C3162d = findViewById(R.id.ed_C3162d);
        ed_C3162m = findViewById(R.id.ed_C3162m);
        ed_C3163_a = findViewById(R.id.ed_C3163_a);
        ed_C3163_b = findViewById(R.id.ed_C3163_b);
        ed_C3165_a = findViewById(R.id.ed_C3165_a);
        ed_C3165_b = findViewById(R.id.ed_C3165_b);
        ed_C3172 = findViewById(R.id.ed_C3172);
        ed_C3175_a = findViewById(R.id.ed_C3175_a);
        ed_C3175_b = findViewById(R.id.ed_C3175_b);
        ed_C3177_a = findViewById(R.id.ed_C3177_a);
        ed_C3177_b = findViewById(R.id.ed_C3177_b);
        ed_C3179_a = findViewById(R.id.ed_C3179_a);
        ed_C3179_b = findViewById(R.id.ed_C3179_b);
        ed_C3184 = findViewById(R.id.ed_C3184);
        ed_C3193_a = findViewById(R.id.ed_C3193_a);
        ed_C3193_b = findViewById(R.id.ed_C3193_b);
        ed_C3196 = findViewById(R.id.ed_C3196);
        ed_C3201_a = findViewById(R.id.ed_C3201_a);
        ed_C3201_b = findViewById(R.id.ed_C3201_b);
        ed_C3204_a = findViewById(R.id.ed_C3204_a);
        ed_C3204_b = findViewById(R.id.ed_C3204_b);
        ed_C3208_a = findViewById(R.id.ed_C3208_a);
        ed_C3208_b = findViewById(R.id.ed_C3208_b);
        ed_C3220_a = findViewById(R.id.ed_C3220_a);
        ed_C3220_b = findViewById(R.id.ed_C3220_b);
        ed_C3228 = findViewById(R.id.ed_C3228);

    }

    void events_call() {

        rb_C3121_1.setOnCheckedChangeListener(this);
        rb_C3121_2.setOnCheckedChangeListener(this);
        rb_C3121_DK.setOnCheckedChangeListener(this);

        rb_C3122_1.setOnCheckedChangeListener(this);
        rb_C3122_2.setOnCheckedChangeListener(this);
        rb_C3122_3.setOnCheckedChangeListener(this);
        rb_C3122_DK.setOnCheckedChangeListener(this);

        rb_C3123_u_1.setOnCheckedChangeListener(this);
        rb_C3123_u_2.setOnCheckedChangeListener(this);
        rb_C3123_u_DK.setOnCheckedChangeListener(this);
        rb_C3123_u_RA.setOnCheckedChangeListener(this);


        rb_C3130_1.setOnCheckedChangeListener(this);
        rb_C3130_2.setOnCheckedChangeListener(this);
        rb_C3130_DK.setOnCheckedChangeListener(this);
        rb_C3130_RA.setOnCheckedChangeListener(this);

        rb_C3132_u_1.setOnCheckedChangeListener(this);
        rb_C3132_u_2.setOnCheckedChangeListener(this);
        rb_C3132_u_DK.setOnCheckedChangeListener(this);
        rb_C3132_u_RA.setOnCheckedChangeListener(this);

        rb_C3135_1.setOnCheckedChangeListener(this);
        rb_C3135_2.setOnCheckedChangeListener(this);
        rb_C3135_DK.setOnCheckedChangeListener(this);
        rb_C3135_RA.setOnCheckedChangeListener(this);

        rb_C3137_1.setOnCheckedChangeListener(this);
        rb_C3137_2.setOnCheckedChangeListener(this);
        rb_C3137_DK.setOnCheckedChangeListener(this);
        rb_C3137_RA.setOnCheckedChangeListener(this);

        rb_C3142_1.setOnCheckedChangeListener(this);
        rb_C3142_2.setOnCheckedChangeListener(this);
        rb_C3142_DK.setOnCheckedChangeListener(this);
        rb_C3142_RA.setOnCheckedChangeListener(this);

        rb_C3144_u_1.setOnCheckedChangeListener(this);
        rb_C3144_u_2.setOnCheckedChangeListener(this);
        rb_C3144_u_3.setOnCheckedChangeListener(this);
        rb_C3144_u_DK.setOnCheckedChangeListener(this);
        rb_C3144_u_RA.setOnCheckedChangeListener(this);

        rb_C3146_1.setOnCheckedChangeListener(this);
        rb_C3146_2.setOnCheckedChangeListener(this);
        rb_C3146_DK.setOnCheckedChangeListener(this);
        rb_C3146_RA.setOnCheckedChangeListener(this);

        rb_C3147_u_3.setOnCheckedChangeListener(this);
        rb_C3147_u_4.setOnCheckedChangeListener(this);
        rb_C3147_u_DK.setOnCheckedChangeListener(this);
        rb_C3147_u_RA.setOnCheckedChangeListener(this);

        rb_C3149_1.setOnCheckedChangeListener(this);
        rb_C3149_2.setOnCheckedChangeListener(this);
        rb_C3149_DK.setOnCheckedChangeListener(this);
        rb_C3149_RA.setOnCheckedChangeListener(this);

        rb_C3150_u_1.setOnCheckedChangeListener(this);
        rb_C3150_u_2.setOnCheckedChangeListener(this);
        rb_C3150_u_DK.setOnCheckedChangeListener(this);
        rb_C3150_u_RA.setOnCheckedChangeListener(this);

        rb_C3151_1.setOnCheckedChangeListener(this);
        rb_C3151_2.setOnCheckedChangeListener(this);
        rb_C3151_DK.setOnCheckedChangeListener(this);

        rb_C3152_u_1.setOnCheckedChangeListener(this);
        rb_C3152_u_2.setOnCheckedChangeListener(this);
        rb_C3152_u_DK.setOnCheckedChangeListener(this);
        rb_C3152_u_RA.setOnCheckedChangeListener(this);

        rb_C3158_1.setOnCheckedChangeListener(this);
        rb_C3158_2.setOnCheckedChangeListener(this);
        rb_C3158_DK.setOnCheckedChangeListener(this);
        rb_C3158_RA.setOnCheckedChangeListener(this);

        rb_C3159_u_1.setOnCheckedChangeListener(this);
        rb_C3159_u_2.setOnCheckedChangeListener(this);
        rb_C3159_u_3.setOnCheckedChangeListener(this);
        rb_C3159_u_DK.setOnCheckedChangeListener(this);
        rb_C3159_u_RA.setOnCheckedChangeListener(this);

        rb_C3161_1.setOnCheckedChangeListener(this);
        rb_C3161_2.setOnCheckedChangeListener(this);
        rb_C3161_DK.setOnCheckedChangeListener(this);
        rb_C3161_RA.setOnCheckedChangeListener(this);

        rb_C3162_1.setOnCheckedChangeListener(this);
        rb_C3162_2.setOnCheckedChangeListener(this);
        rb_C3162_3.setOnCheckedChangeListener(this);
        rb_C3162_DK.setOnCheckedChangeListener(this);

        rb_C3163_u_1.setOnCheckedChangeListener(this);
        rb_C3163_u_2.setOnCheckedChangeListener(this);
        rb_C3163_u_DK.setOnCheckedChangeListener(this);
        rb_C3163_u_RA.setOnCheckedChangeListener(this);

        rb_C3164_1.setOnCheckedChangeListener(this);
        rb_C3164_2.setOnCheckedChangeListener(this);
        rb_C3164_DK.setOnCheckedChangeListener(this);
        rb_C3164_RA.setOnCheckedChangeListener(this);

        rb_C3165_u_1.setOnCheckedChangeListener(this);
        rb_C3165_u_2.setOnCheckedChangeListener(this);
        rb_C3165_u_DK.setOnCheckedChangeListener(this);
        rb_C3165_u_RA.setOnCheckedChangeListener(this);

        rb_C3171_1.setOnCheckedChangeListener(this);
        rb_C3171_2.setOnCheckedChangeListener(this);
        rb_C3171_DK.setOnCheckedChangeListener(this);
        rb_C3171_RA.setOnCheckedChangeListener(this);

        rb_C3174_1.setOnCheckedChangeListener(this);
        rb_C3174_2.setOnCheckedChangeListener(this);
        rb_C3174_DK.setOnCheckedChangeListener(this);
        rb_C3174_RA.setOnCheckedChangeListener(this);

        rb_C3175_u_1.setOnCheckedChangeListener(this);
        rb_C3175_u_2.setOnCheckedChangeListener(this);
        rb_C3175_u_DK.setOnCheckedChangeListener(this);
        rb_C3175_u_RA.setOnCheckedChangeListener(this);

        rb_C3176_1.setOnCheckedChangeListener(this);
        rb_C3176_2.setOnCheckedChangeListener(this);
        rb_C3176_DK.setOnCheckedChangeListener(this);
        rb_C3176_RA.setOnCheckedChangeListener(this);

        rb_C3177_u_1.setOnCheckedChangeListener(this);
        rb_C3177_u_2.setOnCheckedChangeListener(this);
        rb_C3177_u_DK.setOnCheckedChangeListener(this);
        rb_C3177_u_RA.setOnCheckedChangeListener(this);

        rb_C3178_1.setOnCheckedChangeListener(this);
        rb_C3178_2.setOnCheckedChangeListener(this);
        rb_C3178_DK.setOnCheckedChangeListener(this);
        rb_C3178_RA.setOnCheckedChangeListener(this);

        rb_C3179_u_1.setOnCheckedChangeListener(this);
        rb_C3179_u_2.setOnCheckedChangeListener(this);
        rb_C3179_u_DK.setOnCheckedChangeListener(this);
        rb_C3179_u_RA.setOnCheckedChangeListener(this);

        rb_C3182_1.setOnCheckedChangeListener(this);
        rb_C3182_2.setOnCheckedChangeListener(this);
        rb_C3182_DK.setOnCheckedChangeListener(this);
        rb_C3182_RA.setOnCheckedChangeListener(this);

        rb_C3186_1_1.setOnCheckedChangeListener(this);
        rb_C3186_1_2.setOnCheckedChangeListener(this);
        rb_C3186_1_DK.setOnCheckedChangeListener(this);
        rb_C3186_1_RA.setOnCheckedChangeListener(this);

        rb_C3189_1.setOnCheckedChangeListener(this);
        rb_C3189_2.setOnCheckedChangeListener(this);
        rb_C3189_DK.setOnCheckedChangeListener(this);
        rb_C3189_RA.setOnCheckedChangeListener(this);

        rb_C3191_1.setOnCheckedChangeListener(this);
        rb_C3191_2.setOnCheckedChangeListener(this);
        rb_C3191_DK.setOnCheckedChangeListener(this);
        rb_C3191_RA.setOnCheckedChangeListener(this);

        rb_C3192_1.setOnCheckedChangeListener(this);
        rb_C3192_2.setOnCheckedChangeListener(this);
        rb_C3192_DK.setOnCheckedChangeListener(this);
        rb_C3192_RA.setOnCheckedChangeListener(this);

        rb_C3193_u_3.setOnCheckedChangeListener(this);
        rb_C3193_u_4.setOnCheckedChangeListener(this);
        rb_C3193_u_DK.setOnCheckedChangeListener(this);
        rb_C3193_u_RA.setOnCheckedChangeListener(this);

        rb_C3194_1.setOnCheckedChangeListener(this);
        rb_C3194_2.setOnCheckedChangeListener(this);
        rb_C3194_DK.setOnCheckedChangeListener(this);
        rb_C3194_RA.setOnCheckedChangeListener(this);

        rb_C3200_1.setOnCheckedChangeListener(this);
        rb_C3200_2.setOnCheckedChangeListener(this);
        rb_C3200_DK.setOnCheckedChangeListener(this);
        rb_C3200_RA.setOnCheckedChangeListener(this);

        rb_C3201_u_1.setOnCheckedChangeListener(this);
        rb_C3201_u_2.setOnCheckedChangeListener(this);
        rb_C3201_u_DK.setOnCheckedChangeListener(this);
        rb_C3201_u_RA.setOnCheckedChangeListener(this);

        rb_C3203_1.setOnCheckedChangeListener(this);
        rb_C3203_2.setOnCheckedChangeListener(this);
        rb_C3203_DK.setOnCheckedChangeListener(this);
        rb_C3203_RA.setOnCheckedChangeListener(this);

        rb_C3204_u_1.setOnCheckedChangeListener(this);
        rb_C3204_u_2.setOnCheckedChangeListener(this);
        rb_C3204_u_DK.setOnCheckedChangeListener(this);
        rb_C3204_u_RA.setOnCheckedChangeListener(this);

        rb_C3207_1.setOnCheckedChangeListener(this);
        rb_C3207_2.setOnCheckedChangeListener(this);
        rb_C3207_DK.setOnCheckedChangeListener(this);
        rb_C3207_RA.setOnCheckedChangeListener(this);

        rb_C3208_u_0.setOnCheckedChangeListener(this);
        rb_C3208_u_1.setOnCheckedChangeListener(this);
        rb_C3208_u_DK.setOnCheckedChangeListener(this);
        rb_C3208_u_RA.setOnCheckedChangeListener(this);

        rb_C3216_1.setOnCheckedChangeListener(this);
        rb_C3216_2.setOnCheckedChangeListener(this);
        rb_C3216_DK.setOnCheckedChangeListener(this);
        rb_C3216_RA.setOnCheckedChangeListener(this);

        rb_C3219_1.setOnCheckedChangeListener(this);
        rb_C3219_2.setOnCheckedChangeListener(this);
        rb_C3219_DK.setOnCheckedChangeListener(this);
        rb_C3219_RA.setOnCheckedChangeListener(this);

        rb_C3220_u_1.setOnCheckedChangeListener(this);
        rb_C3220_u_2.setOnCheckedChangeListener(this);
        rb_C3220_u_DK.setOnCheckedChangeListener(this);
        rb_C3220_u_RA.setOnCheckedChangeListener(this);

        rb_C3224_1.setOnCheckedChangeListener(this);
        rb_C3224_2.setOnCheckedChangeListener(this);
        rb_C3224_DK.setOnCheckedChangeListener(this);
        rb_C3224_RA.setOnCheckedChangeListener(this);

        rb_C3227_1.setOnCheckedChangeListener(this);
        rb_C3227_2.setOnCheckedChangeListener(this);
        rb_C3227_DK.setOnCheckedChangeListener(this);
        rb_C3227_RA.setOnCheckedChangeListener(this);

        rb_C3227_1_1.setOnCheckedChangeListener(this);
        rb_C3227_1_2.setOnCheckedChangeListener(this);
        rb_C3227_1_DK.setOnCheckedChangeListener(this);
        rb_C3227_1_RA.setOnCheckedChangeListener(this);

        rb_C3227_3_1.setOnCheckedChangeListener(this);
        rb_C3227_3_2.setOnCheckedChangeListener(this);
        rb_C3227_3_3.setOnCheckedChangeListener(this);
        rb_C3227_3_4.setOnCheckedChangeListener(this);
        rb_C3227_3_5.setOnCheckedChangeListener(this);
        rb_C3227_3_6.setOnCheckedChangeListener(this);
        rb_C3227_3_7.setOnCheckedChangeListener(this);
        rb_C3227_3_DK.setOnCheckedChangeListener(this);
        rb_C3227_3_RA.setOnCheckedChangeListener(this);

        rb_C3227_8_1.setOnCheckedChangeListener(this);
        rb_C3227_8_2.setOnCheckedChangeListener(this);
        rb_C3227_8_DK.setOnCheckedChangeListener(this);
        rb_C3227_8_RA.setOnCheckedChangeListener(this);

        rb_C3227_9_1.setOnCheckedChangeListener(this);
        rb_C3227_9_2.setOnCheckedChangeListener(this);
        rb_C3227_9_DK.setOnCheckedChangeListener(this);
        rb_C3227_9_RA.setOnCheckedChangeListener(this);

        rb_C3227_20_1.setOnCheckedChangeListener(this);
        rb_C3227_20_2.setOnCheckedChangeListener(this);
        rb_C3227_20_DK.setOnCheckedChangeListener(this);
        rb_C3227_20_RA.setOnCheckedChangeListener(this);

        rb_C3227_21_1.setOnCheckedChangeListener(this);
        rb_C3227_21_2.setOnCheckedChangeListener(this);
        rb_C3227_21_DK.setOnCheckedChangeListener(this);
        rb_C3227_21_RA.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3121_1
                || compoundButton.getId() == R.id.rb_C3121_2
                || compoundButton.getId() == R.id.rb_C3121_DK) {

            if (rb_C3121_1.isChecked()) {

                ll_C3122.setVisibility(View.VISIBLE);
                ll_C3122d.setVisibility(View.VISIBLE);
                ll_C3122m.setVisibility(View.VISIBLE);
                ll_C3123_u.setVisibility(View.VISIBLE);
                ll_C3123_b.setVisibility(View.VISIBLE);
                ll_C3123_c.setVisibility(View.VISIBLE);
                ll_C3124.setVisibility(View.VISIBLE);
                ll_C3125.setVisibility(View.VISIBLE);
                ll_C3126.setVisibility(View.VISIBLE);
                ll_C3127.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3122);
                ClearAllcontrol.ClearAll(ll_C3122d);
                ClearAllcontrol.ClearAll(ll_C3122m);
                ClearAllcontrol.ClearAll(ll_C3123_u);
                ClearAllcontrol.ClearAll(ll_C3123_b);
                ClearAllcontrol.ClearAll(ll_C3123_c);
                ClearAllcontrol.ClearAll(ll_C3124);
                ClearAllcontrol.ClearAll(ll_C3125);
                ClearAllcontrol.ClearAll(ll_C3126);
                ClearAllcontrol.ClearAll(ll_C3127);

                ll_C3122.setVisibility(View.GONE);
                ll_C3122d.setVisibility(View.GONE);
                ll_C3122m.setVisibility(View.GONE);
                ll_C3123_u.setVisibility(View.GONE);
                ll_C3123_b.setVisibility(View.GONE);
                ll_C3123_c.setVisibility(View.GONE);
                ll_C3124.setVisibility(View.GONE);
                ll_C3125.setVisibility(View.GONE);
                ll_C3126.setVisibility(View.GONE);
                ll_C3127.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3122_1
                || compoundButton.getId() == R.id.rb_C3122_2
                || compoundButton.getId() == R.id.rb_C3122_3
                || compoundButton.getId() == R.id.rb_C3122_DK) {

            if (rb_C3122_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3122m);
                ll_C3122m.setVisibility(View.GONE);

                ll_C3122d.setVisibility(View.VISIBLE);

            } else if (rb_C3122_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3122d);
                ll_C3122d.setVisibility(View.GONE);

                ll_C3122m.setVisibility(View.VISIBLE);

            } else if (rb_C3122_3.isChecked()) {

                ll_C3122d.setVisibility(View.VISIBLE);
                ll_C3122m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3122d);
                ClearAllcontrol.ClearAll(ll_C3122m);

                ll_C3122d.setVisibility(View.GONE);
                ll_C3122m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3123_u_1
                || compoundButton.getId() == R.id.rb_C3123_u_2
                || compoundButton.getId() == R.id.rb_C3123_u_DK
                || compoundButton.getId() == R.id.rb_C3123_u_RA) {

            if (rb_C3123_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3123_c);
                ll_C3123_c.setVisibility(View.GONE);

                ll_C3123_b.setVisibility(View.VISIBLE);

            } else if (rb_C3123_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3123_b);
                ll_C3123_b.setVisibility(View.GONE);

                ll_C3123_c.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3123_b);
                ClearAllcontrol.ClearAll(ll_C3123_c);

                ll_C3123_b.setVisibility(View.GONE);
                ll_C3123_c.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3130_1
                || compoundButton.getId() == R.id.rb_C3130_2
                || compoundButton.getId() == R.id.rb_C3130_DK
                || compoundButton.getId() == R.id.rb_C3130_RA) {

            if (rb_C3130_1.isChecked()) {

                ll_C3131.setVisibility(View.VISIBLE);
                ll_C3132_u.setVisibility(View.VISIBLE);
                ll_C3132_a.setVisibility(View.VISIBLE);
                ll_C3132_b.setVisibility(View.VISIBLE);
                ll_C3133.setVisibility(View.VISIBLE);
                ll_C3134.setVisibility(View.VISIBLE);
                ll_C3135.setVisibility(View.VISIBLE);
                ll_C3136.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3131);
                ClearAllcontrol.ClearAll(ll_C3132_u);
                ClearAllcontrol.ClearAll(ll_C3132_a);
                ClearAllcontrol.ClearAll(ll_C3132_b);
                ClearAllcontrol.ClearAll(ll_C3133);
                ClearAllcontrol.ClearAll(ll_C3134);
                ClearAllcontrol.ClearAll(ll_C3135);
                ClearAllcontrol.ClearAll(ll_C3136);

                ll_C3131.setVisibility(View.GONE);
                ll_C3132_u.setVisibility(View.GONE);
                ll_C3132_a.setVisibility(View.GONE);
                ll_C3132_b.setVisibility(View.GONE);
                ll_C3133.setVisibility(View.GONE);
                ll_C3134.setVisibility(View.GONE);
                ll_C3135.setVisibility(View.GONE);
                ll_C3136.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3132_u_1
                || compoundButton.getId() == R.id.rb_C3132_u_2
                || compoundButton.getId() == R.id.rb_C3132_u_DK
                || compoundButton.getId() == R.id.rb_C3132_u_RA) {

            if (rb_C3132_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3132_b);
                ll_C3132_b.setVisibility(View.GONE);

                ll_C3132_a.setVisibility(View.VISIBLE);

            } else if (rb_C3132_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3132_a);
                ll_C3132_a.setVisibility(View.GONE);

                ll_C3132_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3132_a);
                ClearAllcontrol.ClearAll(ll_C3132_b);
                ll_C3132_a.setVisibility(View.GONE);
                ll_C3132_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3135_1
                || compoundButton.getId() == R.id.rb_C3135_2
                || compoundButton.getId() == R.id.rb_C3135_DK
                || compoundButton.getId() == R.id.rb_C3135_RA) {

            if (rb_C3135_1.isChecked()) {

                ll_C3136.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3136);
                ll_C3136.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3137_1
                || compoundButton.getId() == R.id.rb_C3137_2
                || compoundButton.getId() == R.id.rb_C3137_DK
                || compoundButton.getId() == R.id.rb_C3137_RA) {

            if (rb_C3137_1.isChecked()) {

                ll_C3138.setVisibility(View.VISIBLE);
                ll_C3139.setVisibility(View.VISIBLE);
                ll_C3140.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3138);
                ClearAllcontrol.ClearAll(ll_C3139);
                ClearAllcontrol.ClearAll(ll_C3140);

                ll_C3138.setVisibility(View.GONE);
                ll_C3139.setVisibility(View.GONE);
                ll_C3140.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3142_1
                || compoundButton.getId() == R.id.rb_C3142_2
                || compoundButton.getId() == R.id.rb_C3142_DK
                || compoundButton.getId() == R.id.rb_C3142_RA) {

            if (rb_C3142_1.isChecked()) {

                ll_C3143.setVisibility(View.VISIBLE);
                ll_C3144.setVisibility(View.VISIBLE);
                ll_C3144_u.setVisibility(View.VISIBLE);
                ll_C3144_a.setVisibility(View.VISIBLE);
                ll_C3144_b.setVisibility(View.VISIBLE);
                ll_C3145.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3143);
                ClearAllcontrol.ClearAll(ll_C3144);
                ClearAllcontrol.ClearAll(ll_C3144_u);
                ClearAllcontrol.ClearAll(ll_C3144_a);
                ClearAllcontrol.ClearAll(ll_C3144_b);
                ClearAllcontrol.ClearAll(ll_C3145);

                ll_C3143.setVisibility(View.GONE);
                ll_C3144.setVisibility(View.GONE);
                ll_C3144_u.setVisibility(View.GONE);
                ll_C3144_a.setVisibility(View.GONE);
                ll_C3144_b.setVisibility(View.GONE);
                ll_C3145.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3144_u_1
                || compoundButton.getId() == R.id.rb_C3144_u_2
                || compoundButton.getId() == R.id.rb_C3144_u_3
                || compoundButton.getId() == R.id.rb_C3144_u_DK
                || compoundButton.getId() == R.id.rb_C3144_u_RA) {

            if (rb_C3144_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3144_a);
                ClearAllcontrol.ClearAll(ll_C3144_b);

                ll_C3144_a.setVisibility(View.GONE);
                ll_C3144_b.setVisibility(View.GONE);

                ll_C3144.setVisibility(View.VISIBLE);

            } else if (rb_C3144_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3144);
                ClearAllcontrol.ClearAll(ll_C3144_b);

                ll_C3144.setVisibility(View.GONE);
                ll_C3144_b.setVisibility(View.GONE);

                ll_C3144_a.setVisibility(View.VISIBLE);

            } else if (rb_C3144_u_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3144);
                ClearAllcontrol.ClearAll(ll_C3144_a);

                ll_C3144.setVisibility(View.GONE);
                ll_C3144_a.setVisibility(View.GONE);

                ll_C3144_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3144);
                ClearAllcontrol.ClearAll(ll_C3144_a);
                ClearAllcontrol.ClearAll(ll_C3144_b);

                ll_C3144.setVisibility(View.GONE);
                ll_C3144_a.setVisibility(View.GONE);
                ll_C3144_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3146_1
                || compoundButton.getId() == R.id.rb_C3146_2
                || compoundButton.getId() == R.id.rb_C3146_DK
                || compoundButton.getId() == R.id.rb_C3146_RA) {

            if (rb_C3146_1.isChecked()) {

                ll_C3147_u.setVisibility(View.VISIBLE);
                ll_C3147_a.setVisibility(View.VISIBLE);
                ll_C3147_b.setVisibility(View.VISIBLE);
                ll_C3148.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3147_u);
                ClearAllcontrol.ClearAll(ll_C3147_a);
                ClearAllcontrol.ClearAll(ll_C3147_b);
                ClearAllcontrol.ClearAll(ll_C3148);

                ll_C3147_u.setVisibility(View.GONE);
                ll_C3147_a.setVisibility(View.GONE);
                ll_C3147_b.setVisibility(View.GONE);
                ll_C3148.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3147_u_3
                || compoundButton.getId() == R.id.rb_C3147_u_4
                || compoundButton.getId() == R.id.rb_C3147_u_DK
                || compoundButton.getId() == R.id.rb_C3147_u_RA) {

            if (rb_C3147_u_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3147_b);
                ll_C3147_b.setVisibility(View.GONE);

                ll_C3147_a.setVisibility(View.VISIBLE);

            } else if (rb_C3147_u_4.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3147_a);
                ll_C3147_a.setVisibility(View.GONE);

                ll_C3147_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3147_a);
                ClearAllcontrol.ClearAll(ll_C3147_b);

                ll_C3147_a.setVisibility(View.GONE);
                ll_C3147_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3149_1
                || compoundButton.getId() == R.id.rb_C3149_2
                || compoundButton.getId() == R.id.rb_C3149_DK
                || compoundButton.getId() == R.id.rb_C3149_RA) {

            if (rb_C3149_1.isChecked()) {

                ll_C3150_u.setVisibility(View.VISIBLE);
                ll_C3150_a.setVisibility(View.VISIBLE);
                ll_C3150_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3150_u);
                ClearAllcontrol.ClearAll(ll_C3150_a);
                ClearAllcontrol.ClearAll(ll_C3150_b);

                ll_C3150_u.setVisibility(View.GONE);
                ll_C3150_a.setVisibility(View.GONE);
                ll_C3150_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3150_u_1
                || compoundButton.getId() == R.id.rb_C3150_u_2
                || compoundButton.getId() == R.id.rb_C3150_u_DK
                || compoundButton.getId() == R.id.rb_C3150_u_RA) {

            if (rb_C3150_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3150_b);
                ll_C3150_b.setVisibility(View.GONE);

                ll_C3150_a.setVisibility(View.VISIBLE);

            } else if (rb_C3150_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3150_a);
                ll_C3150_a.setVisibility(View.GONE);

                ll_C3150_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3150_a);
                ClearAllcontrol.ClearAll(ll_C3150_b);

                ll_C3150_a.setVisibility(View.GONE);
                ll_C3150_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3151_1
                || compoundButton.getId() == R.id.rb_C3151_2
                || compoundButton.getId() == R.id.rb_C3151_DK) {

            if (rb_C3151_2.isChecked() || rb_C3151_DK.isChecked()) {

                ll_C3152_u.setVisibility(View.VISIBLE);
                ll_C3152_a.setVisibility(View.VISIBLE);
                ll_C3152_b.setVisibility(View.VISIBLE);
                ll_C3153.setVisibility(View.VISIBLE);
                ll_C3154.setVisibility(View.VISIBLE);
                ll_C3155.setVisibility(View.VISIBLE);
                ll_C3156.setVisibility(View.VISIBLE);
                ll_C3157.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3152_u);
                ClearAllcontrol.ClearAll(ll_C3152_a);
                ClearAllcontrol.ClearAll(ll_C3152_b);
                ClearAllcontrol.ClearAll(ll_C3153);
                ClearAllcontrol.ClearAll(ll_C3154);
                ClearAllcontrol.ClearAll(ll_C3155);
                ClearAllcontrol.ClearAll(ll_C3156);
                ClearAllcontrol.ClearAll(ll_C3157);

                ll_C3152_u.setVisibility(View.GONE);
                ll_C3152_a.setVisibility(View.GONE);
                ll_C3152_b.setVisibility(View.GONE);
                ll_C3153.setVisibility(View.GONE);
                ll_C3154.setVisibility(View.GONE);
                ll_C3155.setVisibility(View.GONE);
                ll_C3156.setVisibility(View.GONE);
                ll_C3157.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3152_u_1
                || compoundButton.getId() == R.id.rb_C3152_u_2
                || compoundButton.getId() == R.id.rb_C3152_u_DK
                || compoundButton.getId() == R.id.rb_C3152_u_RA) {

            if (rb_C3152_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3152_b);
                ll_C3152_b.setVisibility(View.GONE);

                ll_C3152_a.setVisibility(View.VISIBLE);

            } else if (rb_C3152_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3152_a);
                ll_C3152_a.setVisibility(View.GONE);

                ll_C3152_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3152_a);
                ClearAllcontrol.ClearAll(ll_C3152_b);

                ll_C3152_a.setVisibility(View.GONE);
                ll_C3152_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3158_1
                || compoundButton.getId() == R.id.rb_C3158_2
                || compoundButton.getId() == R.id.rb_C3158_DK
                || compoundButton.getId() == R.id.rb_C3158_RA) {

            if (rb_C3158_1.isChecked()) {

                ll_C3159_u.setVisibility(View.VISIBLE);
                ll_C3159_a.setVisibility(View.VISIBLE);
                ll_C3159_b.setVisibility(View.VISIBLE);
                ll_C3159_c.setVisibility(View.VISIBLE);
                ll_C3160.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3159_u);
                ClearAllcontrol.ClearAll(ll_C3159_a);
                ClearAllcontrol.ClearAll(ll_C3159_b);
                ClearAllcontrol.ClearAll(ll_C3159_c);
                ClearAllcontrol.ClearAll(ll_C3160);

                ll_C3159_u.setVisibility(View.GONE);
                ll_C3159_a.setVisibility(View.GONE);
                ll_C3159_b.setVisibility(View.GONE);
                ll_C3159_c.setVisibility(View.GONE);
                ll_C3160.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3159_u_1
                || compoundButton.getId() == R.id.rb_C3159_u_2
                || compoundButton.getId() == R.id.rb_C3159_u_3
                || compoundButton.getId() == R.id.rb_C3159_u_DK
                || compoundButton.getId() == R.id.rb_C3159_u_RA) {

            if (rb_C3159_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3159_b);
                ClearAllcontrol.ClearAll(ll_C3159_c);
                ll_C3159_b.setVisibility(View.GONE);
                ll_C3159_c.setVisibility(View.GONE);

                ll_C3159_a.setVisibility(View.VISIBLE);

            } else if (rb_C3159_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3159_a);
                ClearAllcontrol.ClearAll(ll_C3159_c);
                ll_C3159_a.setVisibility(View.GONE);
                ll_C3159_c.setVisibility(View.GONE);

                ll_C3159_b.setVisibility(View.VISIBLE);

            } else if (rb_C3159_u_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3159_a);
                ClearAllcontrol.ClearAll(ll_C3159_b);
                ll_C3159_a.setVisibility(View.GONE);
                ll_C3159_b.setVisibility(View.GONE);

                ll_C3159_c.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3159_a);
                ClearAllcontrol.ClearAll(ll_C3159_b);
                ClearAllcontrol.ClearAll(ll_C3159_c);

                ll_C3159_a.setVisibility(View.GONE);
                ll_C3159_b.setVisibility(View.GONE);
                ll_C3159_c.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3161_1
                || compoundButton.getId() == R.id.rb_C3161_2
                || compoundButton.getId() == R.id.rb_C3161_DK
                || compoundButton.getId() == R.id.rb_C3161_RA) {

            if (rb_C3161_1.isChecked()) {

                ll_C3162.setVisibility(View.VISIBLE);
                ll_C3162d.setVisibility(View.VISIBLE);
                ll_C3162m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3162);
                ClearAllcontrol.ClearAll(ll_C3162d);
                ClearAllcontrol.ClearAll(ll_C3162m);

                ll_C3162.setVisibility(View.GONE);
                ll_C3162d.setVisibility(View.GONE);
                ll_C3162m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3162_1
                || compoundButton.getId() == R.id.rb_C3162_2
                || compoundButton.getId() == R.id.rb_C3162_3
                || compoundButton.getId() == R.id.rb_C3162_DK) {

            if (rb_C3162_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3162m);
                ll_C3162m.setVisibility(View.GONE);

                ll_C3162d.setVisibility(View.VISIBLE);

            } else if (rb_C3162_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3162d);
                ll_C3162d.setVisibility(View.GONE);

                ll_C3162m.setVisibility(View.VISIBLE);

            } else if (rb_C3162_3.isChecked()) {

                ll_C3162d.setVisibility(View.VISIBLE);
                ll_C3162m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3162d);
                ClearAllcontrol.ClearAll(ll_C3162m);

                ll_C3162d.setVisibility(View.GONE);
                ll_C3162m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3163_u_1
                || compoundButton.getId() == R.id.rb_C3163_u_2
                || compoundButton.getId() == R.id.rb_C3163_u_DK
                || compoundButton.getId() == R.id.rb_C3163_u_RA) {

            if (rb_C3163_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3163_b);
                ll_C3163_b.setVisibility(View.GONE);

                ll_C3163_a.setVisibility(View.VISIBLE);

            } else if (rb_C3163_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3163_a);
                ll_C3163_a.setVisibility(View.GONE);

                ll_C3163_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3163_a);
                ClearAllcontrol.ClearAll(ll_C3163_b);

                ll_C3163_a.setVisibility(View.GONE);
                ll_C3163_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3164_1
                || compoundButton.getId() == R.id.rb_C3164_2
                || compoundButton.getId() == R.id.rb_C3164_DK
                || compoundButton.getId() == R.id.rb_C3164_RA) {

            if (rb_C3164_1.isChecked()) {

                ll_C3165_u.setVisibility(View.VISIBLE);
                ll_C3165_a.setVisibility(View.VISIBLE);
                ll_C3165_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3165_u);
                ClearAllcontrol.ClearAll(ll_C3165_a);
                ClearAllcontrol.ClearAll(ll_C3165_b);

                ll_C3165_u.setVisibility(View.GONE);
                ll_C3165_a.setVisibility(View.GONE);
                ll_C3165_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3165_u_1
                || compoundButton.getId() == R.id.rb_C3165_u_2
                || compoundButton.getId() == R.id.rb_C3165_u_DK
                || compoundButton.getId() == R.id.rb_C3165_u_RA) {

            if (rb_C3165_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3165_b);
                ll_C3165_b.setVisibility(View.GONE);

                ll_C3165_a.setVisibility(View.VISIBLE);

            } else if (rb_C3165_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3165_a);
                ll_C3165_a.setVisibility(View.GONE);

                ll_C3165_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3165_a);
                ClearAllcontrol.ClearAll(ll_C3165_b);

                ll_C3165_a.setVisibility(View.GONE);
                ll_C3165_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3171_1
                || compoundButton.getId() == R.id.rb_C3171_2
                || compoundButton.getId() == R.id.rb_C3171_DK
                || compoundButton.getId() == R.id.rb_C3171_RA) {

            if (rb_C3171_1.isChecked()) {

                ll_C3172.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3172);
                ll_C3172.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3174_1
                || compoundButton.getId() == R.id.rb_C3174_2
                || compoundButton.getId() == R.id.rb_C3174_DK
                || compoundButton.getId() == R.id.rb_C3174_RA) {

            if (rb_C3174_1.isChecked()) {

                ll_C3175_u.setVisibility(View.VISIBLE);
                ll_C3175_a.setVisibility(View.VISIBLE);
                ll_C3175_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3175_u);
                ClearAllcontrol.ClearAll(ll_C3175_a);
                ClearAllcontrol.ClearAll(ll_C3175_b);

                ll_C3175_u.setVisibility(View.GONE);
                ll_C3175_a.setVisibility(View.GONE);
                ll_C3175_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3175_u_1
                || compoundButton.getId() == R.id.rb_C3175_u_2
                || compoundButton.getId() == R.id.rb_C3175_u_DK
                || compoundButton.getId() == R.id.rb_C3175_u_RA) {

            if (rb_C3175_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3175_b);
                ll_C3175_b.setVisibility(View.GONE);

                ll_C3175_a.setVisibility(View.VISIBLE);

            } else if (rb_C3175_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3175_a);
                ll_C3175_a.setVisibility(View.GONE);

                ll_C3175_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3175_a);
                ClearAllcontrol.ClearAll(ll_C3175_b);

                ll_C3175_a.setVisibility(View.GONE);
                ll_C3175_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3176_1
                || compoundButton.getId() == R.id.rb_C3176_2
                || compoundButton.getId() == R.id.rb_C3176_DK
                || compoundButton.getId() == R.id.rb_C3176_RA) {

            if (rb_C3176_1.isChecked()) {

                ll_C3177_u.setVisibility(View.VISIBLE);
                ll_C3177_a.setVisibility(View.VISIBLE);
                ll_C3177_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3177_u);
                ClearAllcontrol.ClearAll(ll_C3177_a);
                ClearAllcontrol.ClearAll(ll_C3177_b);

                ll_C3177_u.setVisibility(View.GONE);
                ll_C3177_a.setVisibility(View.GONE);
                ll_C3177_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3177_u_1
                || compoundButton.getId() == R.id.rb_C3177_u_2
                || compoundButton.getId() == R.id.rb_C3177_u_DK
                || compoundButton.getId() == R.id.rb_C3177_u_RA) {

            if (rb_C3177_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3177_b);
                ll_C3177_b.setVisibility(View.GONE);

                ll_C3177_a.setVisibility(View.VISIBLE);

            } else if (rb_C3177_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3177_a);
                ll_C3177_a.setVisibility(View.GONE);

                ll_C3177_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3177_a);
                ClearAllcontrol.ClearAll(ll_C3177_b);
                ll_C3177_a.setVisibility(View.GONE);
                ll_C3177_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3178_1
                || compoundButton.getId() == R.id.rb_C3178_2
                || compoundButton.getId() == R.id.rb_C3178_DK
                || compoundButton.getId() == R.id.rb_C3178_RA) {

            if (rb_C3178_1.isChecked()) {

                ll_C3179_u.setVisibility(View.VISIBLE);
                ll_C3179_a.setVisibility(View.VISIBLE);
                ll_C3179_b.setVisibility(View.VISIBLE);
                ll_C3180.setVisibility(View.VISIBLE);
                ll_C3181.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3179_u);
                ClearAllcontrol.ClearAll(ll_C3179_a);
                ClearAllcontrol.ClearAll(ll_C3179_b);
                ClearAllcontrol.ClearAll(ll_C3180);
                ClearAllcontrol.ClearAll(ll_C3181);

                ll_C3179_u.setVisibility(View.GONE);
                ll_C3179_a.setVisibility(View.GONE);
                ll_C3179_b.setVisibility(View.GONE);
                ll_C3180.setVisibility(View.GONE);
                ll_C3181.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3179_u_1
                || compoundButton.getId() == R.id.rb_C3179_u_2
                || compoundButton.getId() == R.id.rb_C3179_u_DK
                || compoundButton.getId() == R.id.rb_C3179_u_RA) {

            if (rb_C3179_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3179_b);
                ll_C3179_b.setVisibility(View.GONE);

                ll_C3179_a.setVisibility(View.VISIBLE);

            } else if (rb_C3179_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3179_a);
                ll_C3179_a.setVisibility(View.GONE);

                ll_C3179_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3179_a);
                ClearAllcontrol.ClearAll(ll_C3179_b);

                ll_C3179_a.setVisibility(View.GONE);
                ll_C3179_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3182_1
                || compoundButton.getId() == R.id.rb_C3182_2
                || compoundButton.getId() == R.id.rb_C3182_DK
                || compoundButton.getId() == R.id.rb_C3182_RA) {

            if (rb_C3182_1.isChecked()) {

                ll_C3183.setVisibility(View.VISIBLE);
                ll_C3184.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3183);
                ClearAllcontrol.ClearAll(ll_C3184);

                ll_C3183.setVisibility(View.GONE);
                ll_C3184.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3186_1_1
                || compoundButton.getId() == R.id.rb_C3186_1_2
                || compoundButton.getId() == R.id.rb_C3186_1_DK
                || compoundButton.getId() == R.id.rb_C3186_1_RA) {

            if (rb_C3186_1_1.isChecked()) {

                ll_C3186.setVisibility(View.VISIBLE);
                ll_C3187.setVisibility(View.VISIBLE);
                ll_C3188.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3186);
                ClearAllcontrol.ClearAll(ll_C3187);
                ClearAllcontrol.ClearAll(ll_C3188);

                ll_C3186.setVisibility(View.GONE);
                ll_C3187.setVisibility(View.GONE);
                ll_C3188.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3189_1
                || compoundButton.getId() == R.id.rb_C3189_2
                || compoundButton.getId() == R.id.rb_C3189_DK
                || compoundButton.getId() == R.id.rb_C3189_RA) {

            if (rb_C3189_1.isChecked()) {

                ll_C3190.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3190);
                ll_C3190.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3191_1
                || compoundButton.getId() == R.id.rb_C3191_2
                || compoundButton.getId() == R.id.rb_C3191_DK
                || compoundButton.getId() == R.id.rb_C3191_RA) {

            if (rb_C3191_1.isChecked()) {

                ll_C3192.setVisibility(View.VISIBLE);
                ll_C3193_u.setVisibility(View.VISIBLE);
                ll_C3193_a.setVisibility(View.VISIBLE);
                ll_C3193_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3192);
                ClearAllcontrol.ClearAll(ll_C3193_u);
                ClearAllcontrol.ClearAll(ll_C3193_a);
                ClearAllcontrol.ClearAll(ll_C3193_b);

                ll_C3192.setVisibility(View.GONE);
                ll_C3193_u.setVisibility(View.GONE);
                ll_C3193_a.setVisibility(View.GONE);
                ll_C3193_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3192_1
                || compoundButton.getId() == R.id.rb_C3192_2
                || compoundButton.getId() == R.id.rb_C3192_DK
                || compoundButton.getId() == R.id.rb_C3192_RA) {

            if (rb_C3192_1.isChecked()) {

                ll_C3193_u.setVisibility(View.VISIBLE);
                ll_C3193_a.setVisibility(View.VISIBLE);
                ll_C3193_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3193_u);
                ClearAllcontrol.ClearAll(ll_C3193_a);
                ClearAllcontrol.ClearAll(ll_C3193_b);

                ll_C3193_u.setVisibility(View.GONE);
                ll_C3193_a.setVisibility(View.GONE);
                ll_C3193_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3193_u_3
                || compoundButton.getId() == R.id.rb_C3193_u_4
                || compoundButton.getId() == R.id.rb_C3193_u_DK
                || compoundButton.getId() == R.id.rb_C3193_u_RA) {

            if (rb_C3193_u_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3193_b);
                ll_C3193_b.setVisibility(View.GONE);

                ll_C3193_a.setVisibility(View.VISIBLE);

            } else if (rb_C3193_u_4.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3193_a);
                ll_C3193_a.setVisibility(View.GONE);

                ll_C3193_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3193_a);
                ClearAllcontrol.ClearAll(ll_C3193_b);

                ll_C3193_a.setVisibility(View.GONE);
                ll_C3193_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3194_1
                || compoundButton.getId() == R.id.rb_C3194_2
                || compoundButton.getId() == R.id.rb_C3194_DK
                || compoundButton.getId() == R.id.rb_C3194_RA) {

            if (rb_C3194_1.isChecked()) {

                ll_C3195A.setVisibility(View.VISIBLE);
                ll_C3195.setVisibility(View.VISIBLE);
                ll_C3196.setVisibility(View.VISIBLE);
                ll_C3197.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3195A);
                ClearAllcontrol.ClearAll(ll_C3195);
                ClearAllcontrol.ClearAll(ll_C3196);
                ClearAllcontrol.ClearAll(ll_C3197);

                ll_C3195A.setVisibility(View.GONE);
                ll_C3195.setVisibility(View.GONE);
                ll_C3196.setVisibility(View.GONE);
                ll_C3197.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3200_1
                || compoundButton.getId() == R.id.rb_C3200_2
                || compoundButton.getId() == R.id.rb_C3200_DK
                || compoundButton.getId() == R.id.rb_C3200_RA) {

            if (rb_C3200_1.isChecked()) {

                ll_C3201_u.setVisibility(View.VISIBLE);
                ll_C3201_a.setVisibility(View.VISIBLE);
                ll_C3201_b.setVisibility(View.VISIBLE);
                ll_C3202.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3201_u);
                ClearAllcontrol.ClearAll(ll_C3201_a);
                ClearAllcontrol.ClearAll(ll_C3201_b);
                ClearAllcontrol.ClearAll(ll_C3202);

                ll_C3201_u.setVisibility(View.GONE);
                ll_C3201_a.setVisibility(View.GONE);
                ll_C3201_b.setVisibility(View.GONE);
                ll_C3202.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3201_u_1
                || compoundButton.getId() == R.id.rb_C3201_u_2
                || compoundButton.getId() == R.id.rb_C3201_u_DK
                || compoundButton.getId() == R.id.rb_C3201_u_RA) {

            if (rb_C3201_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3201_b);
                ll_C3201_b.setVisibility(View.GONE);

                ll_C3201_a.setVisibility(View.VISIBLE);

            } else if (rb_C3201_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3201_a);
                ll_C3201_a.setVisibility(View.GONE);

                ll_C3201_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3201_a);
                ClearAllcontrol.ClearAll(ll_C3201_b);

                ll_C3201_a.setVisibility(View.GONE);
                ll_C3201_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3203_1
                || compoundButton.getId() == R.id.rb_C3203_2
                || compoundButton.getId() == R.id.rb_C3203_DK
                || compoundButton.getId() == R.id.rb_C3203_RA) {

            if (rb_C3203_1.isChecked()) {

                ll_C3204_u.setVisibility(View.VISIBLE);
                ll_C3204_a.setVisibility(View.VISIBLE);
                ll_C3204_b.setVisibility(View.VISIBLE);
                ll_C3205.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3204_u);
                ClearAllcontrol.ClearAll(ll_C3204_a);
                ClearAllcontrol.ClearAll(ll_C3204_b);
                ClearAllcontrol.ClearAll(ll_C3205);

                ll_C3204_u.setVisibility(View.GONE);
                ll_C3204_a.setVisibility(View.GONE);
                ll_C3204_b.setVisibility(View.GONE);
                ll_C3205.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3204_u_1
                || compoundButton.getId() == R.id.rb_C3204_u_2
                || compoundButton.getId() == R.id.rb_C3204_u_DK
                || compoundButton.getId() == R.id.rb_C3204_u_RA) {

            if (rb_C3204_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3204_b);
                ll_C3204_b.setVisibility(View.GONE);

                ll_C3204_a.setVisibility(View.VISIBLE);

            } else if (rb_C3204_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3204_a);
                ll_C3204_a.setVisibility(View.GONE);

                ll_C3204_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3204_a);
                ClearAllcontrol.ClearAll(ll_C3204_b);

                ll_C3204_a.setVisibility(View.GONE);
                ll_C3204_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3207_1
                || compoundButton.getId() == R.id.rb_C3207_2
                || compoundButton.getId() == R.id.rb_C3207_DK
                || compoundButton.getId() == R.id.rb_C3207_RA) {

            if (rb_C3207_1.isChecked()) {

                ll_C3208_u.setVisibility(View.VISIBLE);
                ll_C3208_a.setVisibility(View.VISIBLE);
                ll_C3208_b.setVisibility(View.VISIBLE);
                ll_C3209.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3208_u);
                ClearAllcontrol.ClearAll(ll_C3208_a);
                ClearAllcontrol.ClearAll(ll_C3208_b);
                ClearAllcontrol.ClearAll(ll_C3209);

                ll_C3208_u.setVisibility(View.GONE);
                ll_C3208_a.setVisibility(View.GONE);
                ll_C3208_b.setVisibility(View.GONE);
                ll_C3209.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3208_u_0
                || compoundButton.getId() == R.id.rb_C3208_u_1
                || compoundButton.getId() == R.id.rb_C3208_u_DK
                || compoundButton.getId() == R.id.rb_C3208_u_RA) {

            if (rb_C3208_u_0.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3208_b);
                ll_C3208_b.setVisibility(View.GONE);

                ll_C3208_a.setVisibility(View.VISIBLE);

            } else if (rb_C3208_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3208_a);
                ll_C3208_a.setVisibility(View.GONE);

                ll_C3208_b.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3208_a);
                ClearAllcontrol.ClearAll(ll_C3208_b);

                ll_C3208_a.setVisibility(View.GONE);
                ll_C3208_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3216_1
                || compoundButton.getId() == R.id.rb_C3216_2
                || compoundButton.getId() == R.id.rb_C3216_DK
                || compoundButton.getId() == R.id.rb_C3216_RA) {

            if (rb_C3216_1.isChecked()) {

                ll_C3217.setVisibility(View.VISIBLE);
                ll_C3218.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3217);
                ClearAllcontrol.ClearAll(ll_C3218);

                ll_C3217.setVisibility(View.GONE);
                ll_C3218.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3219_1
                || compoundButton.getId() == R.id.rb_C3219_2
                || compoundButton.getId() == R.id.rb_C3219_DK
                || compoundButton.getId() == R.id.rb_C3219_RA) {

            if (rb_C3219_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3220_u);
                ClearAllcontrol.ClearAll(ll_C3220_a);
                ClearAllcontrol.ClearAll(ll_C3220_b);
                ClearAllcontrol.ClearAll(ll_C3221);
                ClearAllcontrol.ClearAll(ll_C3222);
                ClearAllcontrol.ClearAll(ll_C3223);
                ClearAllcontrol.ClearAll(ll_C3224);

                ll_C3220_u.setVisibility(View.VISIBLE);
                ll_C3220_a.setVisibility(View.VISIBLE);
                ll_C3220_b.setVisibility(View.VISIBLE);
                ll_C3221.setVisibility(View.VISIBLE);
                ll_C3222.setVisibility(View.VISIBLE);
                ll_C3223.setVisibility(View.VISIBLE);
                ll_C3224.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3220_u);
                ClearAllcontrol.ClearAll(ll_C3220_a);
                ClearAllcontrol.ClearAll(ll_C3220_b);
                ClearAllcontrol.ClearAll(ll_C3221);
                ClearAllcontrol.ClearAll(ll_C3222);
                ClearAllcontrol.ClearAll(ll_C3223);
                ClearAllcontrol.ClearAll(ll_C3224);

                ll_C3220_u.setVisibility(View.GONE);
                ll_C3220_a.setVisibility(View.GONE);
                ll_C3220_b.setVisibility(View.GONE);
                ll_C3221.setVisibility(View.GONE);
                ll_C3222.setVisibility(View.GONE);
                ll_C3223.setVisibility(View.GONE);
                ll_C3224.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3220_u_1
                || compoundButton.getId() == R.id.rb_C3220_u_2
                || compoundButton.getId() == R.id.rb_C3220_u_DK
                || compoundButton.getId() == R.id.rb_C3220_u_RA) {

            if (rb_C3220_u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3220_b);
                ll_C3220_b.setVisibility(View.GONE);

                ll_C3220_a.setVisibility(View.VISIBLE);

            } else if (rb_C3220_u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3220_a);
                ll_C3220_a.setVisibility(View.GONE);

                ll_C3220_b.setVisibility(View.VISIBLE);
            } else {

                ClearAllcontrol.ClearAll(ll_C3220_a);
                ClearAllcontrol.ClearAll(ll_C3220_b);

                ll_C3220_a.setVisibility(View.GONE);
                ll_C3220_b.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3224_1
                || compoundButton.getId() == R.id.rb_C3224_2
                || compoundButton.getId() == R.id.rb_C3224_DK
                || compoundButton.getId() == R.id.rb_C3224_RA) {

            if (rb_C3224_1.isChecked()) {

                ll_C3225.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3225);
                ll_C3225.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_1
                || compoundButton.getId() == R.id.rb_C3227_2
                || compoundButton.getId() == R.id.rb_C3227_DK
                || compoundButton.getId() == R.id.rb_C3227_RA) {

            if (rb_C3227_1.isChecked() || rb_C3227_DK.isChecked() || rb_C3227_RA.isChecked()) {

                ll_C3227_1.setVisibility(View.VISIBLE);
                ll_C3227_2.setVisibility(View.VISIBLE);
                ll_C3227_3.setVisibility(View.VISIBLE);
                ll_C3227_4.setVisibility(View.VISIBLE);
                ll_C3227_5.setVisibility(View.VISIBLE);
                ll_C3227_6.setVisibility(View.VISIBLE);
                ll_C3227_7.setVisibility(View.VISIBLE);
                ll_C3227_8.setVisibility(View.VISIBLE);
                ll_C3227_9.setVisibility(View.VISIBLE);
                ll_C3227_10.setVisibility(View.VISIBLE);
                ll_C3227_11.setVisibility(View.VISIBLE);
                ll_C3227_12.setVisibility(View.VISIBLE);
                ll_C3227_13.setVisibility(View.VISIBLE);
                ll_C3227_14.setVisibility(View.VISIBLE);
                ll_C3227_15.setVisibility(View.VISIBLE);
                ll_C3227_16.setVisibility(View.VISIBLE);
                ll_C3227_17.setVisibility(View.VISIBLE);
                ll_C3227_18.setVisibility(View.VISIBLE);
                ll_C3227_19.setVisibility(View.VISIBLE);
                ll_C3227_20.setVisibility(View.VISIBLE);
                ll_C3227_21.setVisibility(View.VISIBLE);
                ll_C3227_22.setVisibility(View.VISIBLE);
                ll_C3228.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3227_1);
                ClearAllcontrol.ClearAll(ll_C3227_2);
                ClearAllcontrol.ClearAll(ll_C3227_3);
                ClearAllcontrol.ClearAll(ll_C3227_4);
                ClearAllcontrol.ClearAll(ll_C3227_5);
                ClearAllcontrol.ClearAll(ll_C3227_6);
                ClearAllcontrol.ClearAll(ll_C3227_7);
                ClearAllcontrol.ClearAll(ll_C3227_8);
                ClearAllcontrol.ClearAll(ll_C3227_9);
                ClearAllcontrol.ClearAll(ll_C3227_10);
                ClearAllcontrol.ClearAll(ll_C3227_11);
                ClearAllcontrol.ClearAll(ll_C3227_12);
                ClearAllcontrol.ClearAll(ll_C3227_13);
                ClearAllcontrol.ClearAll(ll_C3227_14);
                ClearAllcontrol.ClearAll(ll_C3227_15);
                ClearAllcontrol.ClearAll(ll_C3227_16);
                ClearAllcontrol.ClearAll(ll_C3227_17);
                ClearAllcontrol.ClearAll(ll_C3227_18);
                ClearAllcontrol.ClearAll(ll_C3227_19);
                ClearAllcontrol.ClearAll(ll_C3227_20);
                ClearAllcontrol.ClearAll(ll_C3227_21);
                ClearAllcontrol.ClearAll(ll_C3227_22);
                ClearAllcontrol.ClearAll(ll_C3228);

                ll_C3227_1.setVisibility(View.GONE);
                ll_C3227_2.setVisibility(View.GONE);
                ll_C3227_3.setVisibility(View.GONE);
                ll_C3227_4.setVisibility(View.GONE);
                ll_C3227_5.setVisibility(View.GONE);
                ll_C3227_6.setVisibility(View.GONE);
                ll_C3227_7.setVisibility(View.GONE);
                ll_C3227_8.setVisibility(View.GONE);
                ll_C3227_9.setVisibility(View.GONE);
                ll_C3227_10.setVisibility(View.GONE);
                ll_C3227_11.setVisibility(View.GONE);
                ll_C3227_12.setVisibility(View.GONE);
                ll_C3227_13.setVisibility(View.GONE);
                ll_C3227_14.setVisibility(View.GONE);
                ll_C3227_15.setVisibility(View.GONE);
                ll_C3227_16.setVisibility(View.GONE);
                ll_C3227_17.setVisibility(View.GONE);
                ll_C3227_18.setVisibility(View.GONE);
                ll_C3227_19.setVisibility(View.GONE);
                ll_C3227_20.setVisibility(View.GONE);
                ll_C3227_21.setVisibility(View.GONE);
                ll_C3227_22.setVisibility(View.GONE);
                ll_C3228.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_1_1
                || compoundButton.getId() == R.id.rb_C3227_1_2
                || compoundButton.getId() == R.id.rb_C3227_1_DK
                || compoundButton.getId() == R.id.rb_C3227_1_RA) {

            if (rb_C3227_1_1.isChecked()) {

                ll_C3227_2.setVisibility(View.VISIBLE);
                ll_C3227_3.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3227_2);
                ClearAllcontrol.ClearAll(ll_C3227_3);
                ll_C3227_2.setVisibility(View.GONE);
                ll_C3227_3.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_3_1
                || compoundButton.getId() == R.id.rb_C3227_3_2
                || compoundButton.getId() == R.id.rb_C3227_3_3
                || compoundButton.getId() == R.id.rb_C3227_3_4
                || compoundButton.getId() == R.id.rb_C3227_3_5
                || compoundButton.getId() == R.id.rb_C3227_3_6
                || compoundButton.getId() == R.id.rb_C3227_3_DK
                || compoundButton.getId() == R.id.rb_C3227_3_RA
                || compoundButton.getId() == R.id.rb_C3227_3_7) {

            if (rb_C3227_3_1.isChecked() || rb_C3227_3_2.isChecked() || rb_C3227_3_3.isChecked()
                    || rb_C3227_3_4.isChecked() || rb_C3227_3_5.isChecked() || rb_C3227_3_6.isChecked()
                    || rb_C3227_3_DK.isChecked() || rb_C3227_3_RA.isChecked() || rb_C3227_3_7.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3227_4);
                ClearAllcontrol.ClearAll(ll_C3227_5);
                ClearAllcontrol.ClearAll(ll_C3227_6);
                ClearAllcontrol.ClearAll(ll_C3227_7);
                ClearAllcontrol.ClearAll(ll_C3227_8);
                ClearAllcontrol.ClearAll(ll_C3227_9);
                ClearAllcontrol.ClearAll(ll_C3227_10);
                ClearAllcontrol.ClearAll(ll_C3227_11);
                ClearAllcontrol.ClearAll(ll_C3227_12);
                ClearAllcontrol.ClearAll(ll_C3227_13);
                ClearAllcontrol.ClearAll(ll_C3227_14);
                ClearAllcontrol.ClearAll(ll_C3227_15);
                ClearAllcontrol.ClearAll(ll_C3227_16);
                ClearAllcontrol.ClearAll(ll_C3227_17);
                ClearAllcontrol.ClearAll(ll_C3227_18);
                ClearAllcontrol.ClearAll(ll_C3227_19);

                ll_C3227_4.setVisibility(View.GONE);
                ll_C3227_5.setVisibility(View.GONE);
                ll_C3227_6.setVisibility(View.GONE);
                ll_C3227_7.setVisibility(View.GONE);
                ll_C3227_8.setVisibility(View.GONE);
                ll_C3227_9.setVisibility(View.GONE);
                ll_C3227_10.setVisibility(View.GONE);
                ll_C3227_11.setVisibility(View.GONE);
                ll_C3227_12.setVisibility(View.GONE);
                ll_C3227_13.setVisibility(View.GONE);
                ll_C3227_14.setVisibility(View.GONE);
                ll_C3227_15.setVisibility(View.GONE);
                ll_C3227_16.setVisibility(View.GONE);
                ll_C3227_17.setVisibility(View.GONE);
                ll_C3227_18.setVisibility(View.GONE);
                ll_C3227_19.setVisibility(View.GONE);

            } else {

                ll_C3227_4.setVisibility(View.VISIBLE);
                ll_C3227_5.setVisibility(View.VISIBLE);
                ll_C3227_6.setVisibility(View.VISIBLE);
                ll_C3227_7.setVisibility(View.VISIBLE);
                ll_C3227_8.setVisibility(View.VISIBLE);
                ll_C3227_9.setVisibility(View.VISIBLE);
                ll_C3227_10.setVisibility(View.VISIBLE);
                ll_C3227_11.setVisibility(View.VISIBLE);
                ll_C3227_12.setVisibility(View.VISIBLE);
                ll_C3227_13.setVisibility(View.VISIBLE);
                ll_C3227_14.setVisibility(View.VISIBLE);
                ll_C3227_15.setVisibility(View.VISIBLE);
                ll_C3227_16.setVisibility(View.VISIBLE);
                ll_C3227_17.setVisibility(View.VISIBLE);
                ll_C3227_18.setVisibility(View.VISIBLE);
                ll_C3227_19.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_8_1
                || compoundButton.getId() == R.id.rb_C3227_8_2
                || compoundButton.getId() == R.id.rb_C3227_8_DK
                || compoundButton.getId() == R.id.rb_C3227_8_RA) {

            if (rb_C3227_8_2.isChecked() || rb_C3227_8_DK.isChecked() || rb_C3227_8_RA.isChecked()) {

                ll_C3227_9.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3227_9);
                ll_C3227_9.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_9_1
                || compoundButton.getId() == R.id.rb_C3227_9_2
                || compoundButton.getId() == R.id.rb_C3227_9_DK
                || compoundButton.getId() == R.id.rb_C3227_9_RA) {

            if (rb_C3227_9_1.isChecked()) {

                ll_C3227_10.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3227_10);
                ll_C3227_10.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_20_1
                || compoundButton.getId() == R.id.rb_C3227_20_2
                || compoundButton.getId() == R.id.rb_C3227_20_DK
                || compoundButton.getId() == R.id.rb_C3227_20_RA) {

            if (rb_C3227_20_2.isChecked() || rb_C3227_20_DK.isChecked() || rb_C3227_20_RA.isChecked()) {

                ll_C3227_21.setVisibility(View.VISIBLE);
                ll_C3227_22.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3227_21);
                ClearAllcontrol.ClearAll(ll_C3227_22);

                ll_C3227_21.setVisibility(View.GONE);
                ll_C3227_22.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3227_21_1
                || compoundButton.getId() == R.id.rb_C3227_21_2
                || compoundButton.getId() == R.id.rb_C3227_21_DK
                || compoundButton.getId() == R.id.rb_C3227_21_RA) {

            if (rb_C3227_21_2.isChecked() || rb_C3227_21_DK.isChecked() || rb_C3227_21_RA.isChecked()) {

                ll_C3227_22.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3227_22);
                ll_C3227_22.setVisibility(View.GONE);
            }
        }
    }

    void value_assignment() {

        study_id = "000";
        C3121 = "000";
        C3122 = "000";
        C3122d = "000";
        C3122m = "000";
        C3123_u = "000";
        C3123_b = "000";
        C3123_c = "000";
        C3124 = "000";
        C3125 = "000";
        C3126 = "000";
        C3127 = "000";
        C3128 = "000";
        C3129 = "000";
        C3130 = "000";
        C3131 = "000";
        C3132_u = "000";
        C3132_a = "000";
        C3132_b = "000";
        C3133 = "000";
        C3134 = "000";
        C3135 = "000";
        C3136 = "000";
        C3137 = "000";
        C3138 = "000";
        C3139 = "000";
        C3140 = "000";
        C3141 = "000";
        C3142 = "000";
        C3143 = "000";
        C3144_u = "000";
        C3144 = "000";
        C3144_a = "000";
        C3144_b = "000";
        C3145 = "000";
        C3146 = "000";
        C3147_u = "000";
        C3147_a = "000";
        C3147_b = "000";
        C3148 = "000";
        C3149 = "000";
        C3150_u = "000";
        C3150_a = "000";
        C3150_b = "000";
        C3151 = "000";
        C3152_u = "000";
        C3152_a = "000";
        C3152_b = "000";
        C3153 = "000";
        C3154 = "000";
        C3155 = "000";
        C3156 = "000";
        C3157 = "000";
        C3158 = "000";
        C3159_u = "000";
        C3159_a = "000";
        C3159_b = "000";
        C3159_c = "000";
        C3160 = "000";
        C3161 = "000";
        C3162 = "000";
        C3162d = "000";
        C3162m = "000";
        C3163_u = "000";
        C3163_a = "000";
        C3163_b = "000";
        C3164 = "000";
        C3165_u = "000";
        C3165_a = "000";
        C3165_b = "000";
        C3166 = "000";
        C3167 = "000";
        C3168 = "000";
        C3169 = "000";
        C3170 = "000";
        C3171 = "000";
        C3172 = "000";
        C3173 = "000";
        C3174 = "000";
        C3175_u = "000";
        C3175_a = "000";
        C3175_b = "000";
        C3176 = "000";
        C3177_u = "000";
        C3177_a = "000";
        C3177_b = "000";
        C3178 = "000";
        C3179_u = "000";
        C3179_a = "000";
        C3179_b = "000";
        C3180 = "000";
        C3181 = "000";
        C3182 = "000";
        C3183 = "000";
        C3184 = "000";
        C3185 = "000";
        C3186_1 = "000";
        C3186 = "000";
        C3187 = "000";
        C3188 = "000";
        C3189 = "000";
        C3190 = "000";
        C3191 = "000";
        C3192 = "000";
        C3193_u = "000";
        C3193_a = "000";
        C3193_b = "000";
        C3194 = "000";
        C3195A = "000";
        C3195 = "000";
        C3196 = "000";
        C3197 = "000";
        C3198 = "000";
        C3199 = "000";
        C3199_1 = "000";
        C3200 = "000";
        C3201_u = "000";
        C3201_a = "000";
        C3201_b = "000";
        C3202 = "000";
        C3203 = "000";
        C3204_u = "000";
        C3204_a = "000";
        C3204_b = "000";
        C3205 = "000";
        C3206 = "000";
        C3207 = "000";
        C3208_u = "000";
        C3208_a = "000";
        C3208_b = "000";
        C3209 = "000";
        C3210 = "000";
        C3212 = "000";
        C3213 = "000";
        C3214 = "000";
        C3215 = "000";
        C3216 = "000";
        C3217 = "000";
        C3218 = "000";
        C3219 = "000";
        C3220_u = "000";
        C3220_a = "000";
        C3220_b = "000";
        C3221 = "000";
        C3222 = "000";
        C3223 = "000";
        C3224 = "000";
        C3225 = "000";
        C3226 = "000";
        C3227 = "000";
        C3227_1 = "000";
        C3227_2 = "000";
        C3227_3 = "000";
        C3227_4 = "000";
        C3227_5 = "000";
        C3227_6 = "000";
        C3227_7 = "000";
        C3227_8 = "000";
        C3227_9 = "000";
        C3227_10 = "000";
        C3227_11 = "000";
        C3227_12 = "000";
        C3227_13 = "000";
        C3227_14 = "000";
        C3227_15 = "000";
        C3227_16 = "000";
        C3227_17 = "000";
        C3227_18 = "000";
        C3227_19 = "000";
        C3227_20 = "000";
        C3227_21 = "000";
        C3227_22 = "000";
        C3228 = "000";
        STATUS = "0";


        if (rb_C3121_1.isChecked()) {
            C3121 = "1";
        } else if (rb_C3121_2.isChecked()) {
            C3121 = "2";
        } else if (rb_C3121_DK.isChecked()) {
            C3121 = "9";
        }

        if (rb_C3122_1.isChecked()) {
            C3122 = "1";
            C3122d = ed_C3122d.getText().toString().trim();
        } else if (rb_C3122_2.isChecked()) {
            C3122 = "2";
            C3122m = ed_C3122m.getText().toString().trim();
        } else if (rb_C3122_3.isChecked()) {
            C3122 = "3";
            C3122d = ed_C3122d.getText().toString().trim();
            C3122m = ed_C3122m.getText().toString().trim();;
        } else if (rb_C3122_DK.isChecked()) {
            C3122 = "99";
            C3122d = "99";
            C3122m = "99";
        }

        if (rb_C3123_u_1.isChecked()) {
            C3123_u = "1";
            C3123_b = ed_C3123_b.getText().toString().trim();
        } else if (rb_C3123_u_2.isChecked()) {
            C3123_u = "2";
            C3123_c = ed_C3123_c.getText().toString().trim();
        } else if (rb_C3123_u_DK.isChecked()) {
            C3123_u = "9";
            C3123_b = "99";
            C3123_c = "99";
        } else if (rb_C3123_u_RA.isChecked()) {
            C3123_u = "8";
            C3123_b = "99";
            C3123_c = "99";
        }

        if (rb_C3124_1.isChecked()) {
            C3124 = "1";
        } else if (rb_C3124_2.isChecked()) {
            C3124 = "2";
        } else if (rb_C3124_DK.isChecked()) {
            C3124 = "9";
        } else if (rb_C3124_RA.isChecked()) {
            C3124 = "8";
        }

        if (rb_C3125_1.isChecked()) {
            C3125 = "1";
        } else if (rb_C3125_2.isChecked()) {
            C3125 = "2";
        } else if (rb_C3125_3.isChecked()) {
            C3125 = "3";
        } else if (rb_C3125_DK.isChecked()) {
            C3125 = "9";
        } else if (rb_C3125_RA.isChecked()) {
            C3125 = "8";
        }

        if (rb_C3126_1.isChecked()) {
            C3126 = "1";
        } else if (rb_C3126_2.isChecked()) {
            C3126 = "2";
        } else if (rb_C3126_3.isChecked()) {
            C3126 = "3";
        } else if (rb_C3126_DK.isChecked()) {
            C3126 = "9";
        } else if (rb_C3126_RA.isChecked()) {
            C3126 = "8";
        }

        if (rb_C3127_1.isChecked()) {
            C3127 = "1";
        } else if (rb_C3127_2.isChecked()) {
            C3127 = "2";
        } else if (rb_C3127_DK.isChecked()) {
            C3127 = "9";
        } else if (rb_C3127_RA.isChecked()) {
            C3127 = "8";
        }

        if (rb_C3128_1.isChecked()) {
            C3128 = "1";
        } else if (rb_C3128_2.isChecked()) {
            C3128 = "2";
        } else if (rb_C3128_DK.isChecked()) {
            C3128 = "9";
        } else if (rb_C3128_RA.isChecked()) {
            C3128 = "8";
        }

        if (rb_C3129_1.isChecked()) {
            C3129 = "1";
        } else if (rb_C3129_2.isChecked()) {
            C3129 = "2";
        } else if (rb_C3129_DK.isChecked()) {
            C3129 = "9";
        } else if (rb_C3129_RA.isChecked()) {
            C3129 = "8";
        }

        if (rb_C3130_1.isChecked()) {
            C3130 = "1";
        } else if (rb_C3130_2.isChecked()) {
            C3130 = "2";
        } else if (rb_C3130_DK.isChecked()) {
            C3130 = "9";
        } else if (rb_C3130_RA.isChecked()) {
            C3130 = "8";
        }

        if (ed_C3131.getText().toString().trim().length() > 0) {
            C3131 = ed_C3131.getText().toString().trim();
        }

        if (rb_C3132_u_1.isChecked()) {
            C3132_u = "1";
            C3132_a = ed_C3132_a.getText().toString().trim();
        } else if (rb_C3132_u_2.isChecked()) {
            C3132_u = "2";
            C3132_b = ed_C3132_b.getText().toString().trim();
        } else if (rb_C3132_u_DK.isChecked()) {
            C3132_u = "9";
            C3132_a = "99";
            C3132_b = "99";
        } else if (rb_C3132_u_RA.isChecked()) {
            C3132_u = "8";
            C3132_a = "99";
            C3132_b = "99";
        }

        if (rb_C3133_1.isChecked()) {
            C3133 = "1";
        } else if (rb_C3133_2.isChecked()) {
            C3133 = "2";
        } else if (rb_C3133_DK.isChecked()) {
            C3133 = "9";
        } else if (rb_C3133_RA.isChecked()) {
            C3133 = "8";
        }

        if (ed_C3134.getText().toString().trim().length() > 0) {
            C3134 = ed_C3134.getText().toString().trim();
        }

        if (rb_C3135_1.isChecked()) {
            C3135 = "1";
        } else if (rb_C3135_2.isChecked()) {
            C3135 = "2";
        } else if (rb_C3135_DK.isChecked()) {
            C3135 = "9";
        } else if (rb_C3135_RA.isChecked()) {
            C3135 = "8";
        }

        if (rb_C3136_1.isChecked()) {
            C3136 = "1";
        } else if (rb_C3136_2.isChecked()) {
            C3136 = "2";
        } else if (rb_C3136_DK.isChecked()) {
            C3136 = "9";
        } else if (rb_C3136_RA.isChecked()) {
            C3136 = "8";
        }

        if (rb_C3137_1.isChecked()) {
            C3137 = "1";
        } else if (rb_C3137_2.isChecked()) {
            C3137 = "2";
        } else if (rb_C3137_DK.isChecked()) {
            C3137 = "9";
        } else if (rb_C3137_RA.isChecked()) {
            C3137 = "8";
        }

        if (rb_C3138_1.isChecked()) {
            C3138 = "1";
        } else if (rb_C3138_2.isChecked()) {
            C3138 = "2";
        } else if (rb_C3138_DK.isChecked()) {
            C3138 = "9";
        } else if (rb_C3138_RA.isChecked()) {
            C3138 = "8";
        }

        if (rb_C3139_1.isChecked()) {
            C3139 = "1";
        } else if (rb_C3139_2.isChecked()) {
            C3139 = "2";
        } else if (rb_C3139_DK.isChecked()) {
            C3139 = "9";
        } else if (rb_C3139_RA.isChecked()) {
            C3139 = "8";
        }

        if (rb_C3140_1.isChecked()) {
            C3140 = "1";
        } else if (rb_C3140_2.isChecked()) {
            C3140 = "2";
        } else if (rb_C3140_DK.isChecked()) {
            C3140 = "9";
        } else if (rb_C3140_RA.isChecked()) {
            C3140 = "8";
        }

        if (rb_C3141_1.isChecked()) {
            C3141 = "1";
        } else if (rb_C3141_2.isChecked()) {
            C3141 = "2";
        } else if (rb_C3141_DK.isChecked()) {
            C3141 = "9";
        } else if (rb_C3141_RA.isChecked()) {
            C3141 = "8";
        }

        if (rb_C3142_1.isChecked()) {
            C3142 = "1";
        } else if (rb_C3142_2.isChecked()) {
            C3142 = "2";
        } else if (rb_C3142_DK.isChecked()) {
            C3142 = "9";
        } else if (rb_C3142_RA.isChecked()) {
            C3142 = "8";
        }

        if (rb_C3143_1.isChecked()) {
            C3143 = "1";
        } else if (rb_C3143_2.isChecked()) {
            C3143 = "2";
        } else if (rb_C3143_DK.isChecked()) {
            C3143 = "9";
        } else if (rb_C3143_RA.isChecked()) {
            C3143 = "8";
        }

        if (rb_C3144_u_1.isChecked()) {
            C3144_u = "1";
            C3144 = ed_C3144.getText().toString().trim();
        } else if (rb_C3144_u_2.isChecked()) {
            C3144_u = "2";
            C3144_a = ed_C3144_a.getText().toString().trim();
        } else if (rb_C3144_u_3.isChecked()) {
            C3144_u = "3";
            C3144_b = ed_C3144_b.getText().toString().trim();
        } else if (rb_C3144_u_DK.isChecked()) {
            C3144_u = "9";
            C3144 = "99";
            C3144_a = "99";
            C3144_b = "99";
        } else if (rb_C3144_u_RA.isChecked()) {
            C3144_u = "8";
            C3144 = "99";
            C3144_a = "99";
            C3144_b = "99";
        }

        if (rb_C3145_1.isChecked()) {
            C3145 = "1";
        } else if (rb_C3145_2.isChecked()) {
            C3145 = "2";
        } else if (rb_C3145_3.isChecked()) {
            C3145 = "3";
        } else if (rb_C3145_DK.isChecked()) {
            C3145 = "9";
        } else if (rb_C3145_RA.isChecked()) {
            C3145 = "8";
        }

        if (rb_C3146_1.isChecked()) {
            C3146 = "1";
        } else if (rb_C3146_2.isChecked()) {
            C3146 = "2";
        } else if (rb_C3146_DK.isChecked()) {
            C3146 = "9";
        } else if (rb_C3146_RA.isChecked()) {
            C3146 = "8";
        }

        if (rb_C3147_u_3.isChecked()) {
            C3147_u = "3";
            C3147_a = ed_C3147_a.getText().toString().trim();
        } else if (rb_C3147_u_4.isChecked()) {
            C3147_u = "4";
            C3147_b = ed_C3147_b.getText().toString().trim();
        } else if (rb_C3147_u_DK.isChecked()) {
            C3147_u = "9";
            C3147_a = "99";
            C3147_b = "99";
        } else if (rb_C3147_u_RA.isChecked()) {
            C3147_u = "8";
            C3147_a = "99";
            C3147_b = "99";
        }

        if (rb_C3148_1.isChecked()) {
            C3148 = "1";
        } else if (rb_C3148_2.isChecked()) {
            C3148 = "2";
        } else if (rb_C3148_DK.isChecked()) {
            C3148 = "9";
        } else if (rb_C3148_RA.isChecked()) {
            C3148 = "8";
        }

        if (rb_C3149_1.isChecked()) {
            C3149 = "1";
        } else if (rb_C3149_2.isChecked()) {
            C3149 = "2";
        } else if (rb_C3149_DK.isChecked()) {
            C3149 = "9";
        } else if (rb_C3149_RA.isChecked()) {
            C3149 = "8";
        }

        if (rb_C3150_u_1.isChecked()) {
            C3150_u = "1";
            C3150_a = ed_C3150_a.getText().toString().trim();
        } else if (rb_C3150_u_2.isChecked()) {
            C3150_u = "2";
            C3150_b = ed_C3150_b.getText().toString().trim();
        } else if (rb_C3150_u_DK.isChecked()) {
            C3150_u = "9";
            C3150_a = "99";
            C3150_b = "99";
        } else if (rb_C3150_u_RA.isChecked()) {
            C3150_u = "8";
            C3150_a = "99";
            C3150_b = "99";
        }

        if (rb_C3151_1.isChecked()) {
            C3151 = "1";
        } else if (rb_C3151_2.isChecked()) {
            C3151 = "2";
        } else if (rb_C3151_DK.isChecked()) {
            C3151 = "9";
        }

        if (rb_C3152_u_1.isChecked()) {
            C3152_u = "1";
            C3152_a = ed_C3152_a.getText().toString().trim();
        } else if (rb_C3152_u_2.isChecked()) {
            C3152_u = "2";
            C3152_b = ed_C3152_b.getText().toString().trim();
        } else if (rb_C3152_u_DK.isChecked()) {
            C3152_u = "9";
            C3152_a = "99";
            C3152_b = "99";
        } else if (rb_C3152_u_RA.isChecked()) {
            C3152_u = "8";
            C3152_a = "99";
            C3152_b = "99";
        }

        if (rb_C3153_1.isChecked()) {
            C3153 = "1";
        } else if (rb_C3153_2.isChecked()) {
            C3153 = "2";
        } else if (rb_C3153_DK.isChecked()) {
            C3153 = "9";
        } else if (rb_C3153_RA.isChecked()) {
            C3153 = "8";
        }

        if (rb_C3154_1.isChecked()) {
            C3154 = "1";
        } else if (rb_C3154_2.isChecked()) {
            C3154 = "2";
        } else if (rb_C3154_DK.isChecked()) {
            C3154 = "9";
        } else if (rb_C3154_RA.isChecked()) {
            C3154 = "8";
        }

        if (rb_C3155_1.isChecked()) {
            C3155 = "1";
        } else if (rb_C3155_2.isChecked()) {
            C3155 = "2";
        } else if (rb_C3155_DK.isChecked()) {
            C3155 = "9";
        } else if (rb_C3155_RA.isChecked()) {
            C3155 = "8";
        }

        if (rb_C3156_1.isChecked()) {
            C3156 = "1";
        } else if (rb_C3156_2.isChecked()) {
            C3156 = "2";
        } else if (rb_C3156_DK.isChecked()) {
            C3156 = "9";
        } else if (rb_C3156_RA.isChecked()) {
            C3156 = "8";
        }

        if (rb_C3157_1.isChecked()) {
            C3157 = "1";
        } else if (rb_C3157_2.isChecked()) {
            C3157 = "2";
        } else if (rb_C3157_DK.isChecked()) {
            C3157 = "9";
        } else if (rb_C3157_RA.isChecked()) {
            C3157 = "8";
        }

        if (rb_C3158_1.isChecked()) {
            C3158 = "1";
        } else if (rb_C3158_2.isChecked()) {
            C3158 = "2";
        } else if (rb_C3158_DK.isChecked()) {
            C3158 = "9";
        } else if (rb_C3158_RA.isChecked()) {
            C3158 = "8";
        }

        if (rb_C3159_u_1.isChecked()) {
            C3159_u = "1";
            C3159_a = ed_C3159_a.getText().toString().trim();
        } else if (rb_C3159_u_2.isChecked()) {
            C3159_u = "2";
            C3159_b = ed_C3159_b.getText().toString().trim();
        } else if (rb_C3159_u_3.isChecked()) {
            C3159_u = "3";
            C3159_c = ed_C3159_c.getText().toString().trim();
        } else if (rb_C3159_u_DK.isChecked()) {
            C3159_u = "9";
            C3159_a = "99";
            C3159_b = "99";
            C3159_c = "99";
        } else if (rb_C3159_u_RA.isChecked()) {
            C3159_u = "8";
            C3159_a = "99";
            C3159_b = "99";
            C3159_c = "99";
        }

        if (rb_C3160_1.isChecked()) {
            C3160 = "1";
        } else if (rb_C3160_2.isChecked()) {
            C3160 = "2";
        } else if (rb_C3160_DK.isChecked()) {
            C3160 = "9";
        } else if (rb_C3160_RA.isChecked()) {
            C3160 = "8";
        }

        if (rb_C3161_1.isChecked()) {
            C3161 = "1";
        } else if (rb_C3161_2.isChecked()) {
            C3161 = "2";
        } else if (rb_C3161_DK.isChecked()) {
            C3161 = "9";
        } else if (rb_C3161_RA.isChecked()) {
            C3161 = "8";
        }

        if (rb_C3162_1.isChecked()) {
            C3162 = "1";
            C3162d = ed_C3162d.getText().toString().trim();
        } else if (rb_C3162_2.isChecked()) {
            C3162 = "2";
            C3162m = ed_C3162m.getText().toString().trim();
        } else if (rb_C3162_3.isChecked()) {
            C3162 = "3";
            C3162d = ed_C3162d.getText().toString().trim();
            C3162m = ed_C3162m.getText().toString().trim();
        }else if (rb_C3162_DK.isChecked()) {
            C3162 = "99";
            C3162d = "99";
            C3162m = "99";
        }

        if (rb_C3163_u_1.isChecked()) {
            C3163_u = "1";
            C3163_a = ed_C3163_a.getText().toString().trim();
        } else if (rb_C3163_u_2.isChecked()) {
            C3163_u = "2";
            C3163_b = ed_C3163_b.getText().toString().trim();
        } else if (rb_C3163_u_DK.isChecked()) {
            C3163_u = "9";
            C3163_a = "99";
            C3163_b = "99";
        } else if (rb_C3163_u_RA.isChecked()) {
            C3163_u = "8";
            C3163_a = "99";
            C3163_b = "99";
        }

        if (rb_C3164_1.isChecked()) {
            C3164 = "1";
        } else if (rb_C3164_2.isChecked()) {
            C3164 = "2";
        } else if (rb_C3164_DK.isChecked()) {
            C3164 = "9";
        } else if (rb_C3164_RA.isChecked()) {
            C3164 = "8";
        }

        if (rb_C3165_u_1.isChecked()) {
            C3165_u = "1";
            C3165_a = ed_C3165_a.getText().toString().trim();
        } else if (rb_C3165_u_2.isChecked()) {
            C3165_u = "2";
            C3165_b = ed_C3165_b.getText().toString().trim();
        } else if (rb_C3165_u_DK.isChecked()) {
            C3165_u = "9";
            C3165_a = "99";
            C3165_b = "99";
        } else if (rb_C3165_u_RA.isChecked()) {
            C3165_u = "8";
            C3165_a = "99";
            C3165_b = "99";
        }

        if (rb_C3166_1.isChecked()) {
            C3166 = "1";
        } else if (rb_C3166_2.isChecked()) {
            C3166 = "2";
        } else if (rb_C3166_DK.isChecked()) {
            C3166 = "9";
        } else if (rb_C3166_RA.isChecked()) {
            C3166 = "8";
        }

        if (rb_C3168_1.isChecked()) {
            C3168 = "1";
        } else if (rb_C3168_2.isChecked()) {
            C3168 = "2";
        } else if (rb_C3168_DK.isChecked()) {
            C3168 = "9";
        } else if (rb_C3168_RA.isChecked()) {
            C3168 = "8";
        }

        if (rb_C3169_1.isChecked()) {
            C3169 = "1";
        } else if (rb_C3169_2.isChecked()) {
            C3169 = "2";
        } else if (rb_C3169_DK.isChecked()) {
            C3169 = "9";
        } else if (rb_C3169_RA.isChecked()) {
            C3169 = "8";
        }

        if (rb_C3170_1.isChecked()) {
            C3170 = "1";
        } else if (rb_C3170_2.isChecked()) {
            C3170 = "2";
        } else if (rb_C3170_DK.isChecked()) {
            C3170 = "9";
        } else if (rb_C3170_RA.isChecked()) {
            C3170 = "8";
        }

        if (rb_C3171_1.isChecked()) {
            C3171 = "1";
        } else if (rb_C3171_2.isChecked()) {
            C3171 = "2";
        } else if (rb_C3171_DK.isChecked()) {
            C3171 = "9";
        } else if (rb_C3171_RA.isChecked()) {
            C3171 = "8";
        }

        if (ed_C3172.getText().toString().trim().length() > 0) {
            C3172 = ed_C3172.getText().toString().trim();
        }

        if (rb_C3173_1.isChecked()) {
            C3173 = "1";
        } else if (rb_C3173_2.isChecked()) {
            C3173 = "2";
        } else if (rb_C3173_DK.isChecked()) {
            C3173 = "9";
        } else if (rb_C3173_RA.isChecked()) {
            C3173 = "8";
        }

        if (rb_C3174_1.isChecked()) {
            C3174 = "1";
        } else if (rb_C3174_2.isChecked()) {
            C3174 = "2";
        } else if (rb_C3174_DK.isChecked()) {
            C3174 = "9";
        } else if (rb_C3174_RA.isChecked()) {
            C3174 = "8";
        }

        if (rb_C3175_u_1.isChecked()) {
            C3175_u = "1";
            C3175_a = ed_C3175_a.getText().toString().trim();
        } else if (rb_C3175_u_2.isChecked()) {
            C3175_u = "2";
            C3175_b = ed_C3175_b.getText().toString().trim();
        } else if (rb_C3175_u_DK.isChecked()) {
            C3175_u = "9";
            C3175_a = "99";
            C3175_b = "99";
        } else if (rb_C3175_u_RA.isChecked()) {
            C3175_u = "8";
            C3175_a = "99";
            C3175_b = "99";
        }

        if (rb_C3176_1.isChecked()) {
            C3176 = "1";
        } else if (rb_C3176_2.isChecked()) {
            C3176 = "2";
        } else if (rb_C3176_DK.isChecked()) {
            C3176 = "9";
        } else if (rb_C3176_RA.isChecked()) {
            C3176 = "8";
        }

        if (rb_C3177_u_1.isChecked()) {
            C3177_u = "1";
            C3177_a = ed_C3177_a.getText().toString().trim();
        } else if (rb_C3177_u_2.isChecked()) {
            C3177_u = "2";
            C3177_b = ed_C3177_b.getText().toString().trim();
        } else if (rb_C3177_u_DK.isChecked()) {
            C3177_u = "9";
            C3177_a = "99";
            C3177_b = "99";
        } else if (rb_C3177_u_RA.isChecked()) {
            C3177_u = "8";
            C3177_a = "99";
            C3177_b = "99";
        }

        if (rb_C3178_1.isChecked()) {
            C3178 = "1";
        } else if (rb_C3178_2.isChecked()) {
            C3178 = "2";
        } else if (rb_C3178_DK.isChecked()) {
            C3178 = "9";
        } else if (rb_C3178_RA.isChecked()) {
            C3178 = "8";
        }

        if (rb_C3179_u_1.isChecked()) {
            C3179_u = "1";
            C3179_a = ed_C3179_a.getText().toString().trim();
        } else if (rb_C3179_u_2.isChecked()) {
            C3179_u = "2";
            C3179_b = ed_C3179_b.getText().toString().trim();
        } else if (rb_C3179_u_DK.isChecked()) {
            C3179_u = "9";
            C3179_a = "99";
            C3179_b = "99";
        } else if (rb_C3179_u_RA.isChecked()) {
            C3179_u = "8";
            C3179_a = "99";
            C3179_b = "99";
        }

        if (rb_C3180_1.isChecked()) {
            C3180 = "1";
        } else if (rb_C3180_2.isChecked()) {
            C3180 = "2";
        } else if (rb_C3180_DK.isChecked()) {
            C3180 = "9";
        } else if (rb_C3180_RA.isChecked()) {
            C3180 = "8";
        }

        if (rb_C3181_1.isChecked()) {
            C3181 = "1";
        } else if (rb_C3181_2.isChecked()) {
            C3181 = "2";
        } else if (rb_C3181_DK.isChecked()) {
            C3181 = "9";
        } else if (rb_C3181_RA.isChecked()) {
            C3181 = "8";
        }

        if (rb_C3182_1.isChecked()) {
            C3182 = "1";
        } else if (rb_C3182_2.isChecked()) {
            C3182 = "2";
        } else if (rb_C3182_DK.isChecked()) {
            C3182 = "9";
        } else if (rb_C3182_RA.isChecked()) {
            C3182 = "8";
        }

        if (rb_C3183_1.isChecked()) {
            C3183 = "1";
        } else if (rb_C3183_2.isChecked()) {
            C3183 = "2";
        } else if (rb_C3183_DK.isChecked()) {
            C3183 = "9";
        } else if (rb_C3183_RA.isChecked()) {
            C3183 = "8";
        }

        if (ed_C3184.getText().toString().trim().length() > 0) {
            C3184 = ed_C3184.getText().toString().trim();
        }

        if (rb_C3185_1.isChecked()) {
            C3185 = "1";
        } else if (rb_C3185_2.isChecked()) {
            C3185 = "2";
        } else if (rb_C3185_DK.isChecked()) {
            C3185 = "9";
        } else if (rb_C3185_RA.isChecked()) {
            C3185 = "8";
        }

        if (rb_C3186_1_1.isChecked()) {
            C3186_1 = "1";
        } else if (rb_C3186_1_2.isChecked()) {
            C3186_1 = "2";
        } else if (rb_C3186_1_DK.isChecked()) {
            C3186_1 = "9";
        } else if (rb_C3186_1_RA.isChecked()) {
            C3186_1 = "8";
        }

        if (rb_C3186_1.isChecked()) {
            C3186 = "1";
        } else if (rb_C3186_2.isChecked()) {
            C3186 = "2";
        } else if (rb_C3186_DK.isChecked()) {
            C3186 = "9";
        } else if (rb_C3186_RA.isChecked()) {
            C3186 = "8";
        }

        if (rb_C3187_1.isChecked()) {
            C3187 = "1";
        } else if (rb_C3187_2.isChecked()) {
            C3187 = "2";
        } else if (rb_C3187_DK.isChecked()) {
            C3187 = "9";
        } else if (rb_C3187_RA.isChecked()) {
            C3187 = "8";
        }

        if (rb_C3188_1.isChecked()) {
            C3188 = "1";
        } else if (rb_C3188_2.isChecked()) {
            C3188 = "2";
        } else if (rb_C3188_DK.isChecked()) {
            C3188 = "9";
        } else if (rb_C3188_RA.isChecked()) {
            C3188 = "8";
        }

        if (rb_C3189_1.isChecked()) {
            C3189 = "1";
        } else if (rb_C3189_2.isChecked()) {
            C3189 = "2";
        } else if (rb_C3189_DK.isChecked()) {
            C3189 = "9";
        } else if (rb_C3189_RA.isChecked()) {
            C3189 = "8";
        }

        if (rb_C3190_1.isChecked()) {
            C3190 = "1";
        } else if (rb_C3190_2.isChecked()) {
            C3190 = "2";
        } else if (rb_C3190_DK.isChecked()) {
            C3190 = "9";
        } else if (rb_C3190_RA.isChecked()) {
            C3190 = "8";
        }

        if (rb_C3191_1.isChecked()) {
            C3191 = "1";
        } else if (rb_C3191_2.isChecked()) {
            C3191 = "2";
        } else if (rb_C3191_DK.isChecked()) {
            C3191 = "9";
        } else if (rb_C3191_RA.isChecked()) {
            C3191 = "8";
        }

        if (rb_C3192_1.isChecked()) {
            C3192 = "1";
        } else if (rb_C3192_2.isChecked()) {
            C3192 = "2";
        } else if (rb_C3192_DK.isChecked()) {
            C3192 = "9";
        } else if (rb_C3192_RA.isChecked()) {
            C3192 = "8";
        }

        if (rb_C3193_u_3.isChecked()) {
            C3193_u = "3";
            C3193_a = ed_C3193_a.getText().toString().trim();
        } else if (rb_C3193_u_4.isChecked()) {
            C3193_u = "4";
            C3193_b = ed_C3193_b.getText().toString().trim();
        } else if (rb_C3193_u_DK.isChecked()) {
            C3193_u = "9";
            C3193_a = "99";
            C3193_b = "99";
        } else if (rb_C3193_u_RA.isChecked()) {
            C3193_u = "8";
            C3193_a = "99";
            C3193_b = "99";
        }

        if (rb_C3194_1.isChecked()) {
            C3194 = "1";
        } else if (rb_C3194_2.isChecked()) {
            C3194 = "2";
        } else if (rb_C3194_DK.isChecked()) {
            C3194 = "9";
        } else if (rb_C3194_RA.isChecked()) {
            C3194 = "8";
        }

        if (rb_C3195A_1.isChecked()) {
            C3195A = "1";
        } else if (rb_C3195A_2.isChecked()) {
            C3195A = "2";
        } else if (rb_C3195A_3.isChecked()) {
            C3195A = "3";
        } else if (rb_C3195A_4.isChecked()) {
            C3195A = "4";
        } else if (rb_C3195A_DK.isChecked()) {
            C3195A = "9";
        } else if (rb_C3195A_RA.isChecked()) {
            C3195A = "8";
        }

        if (rb_C3195_1.isChecked()) {
            C3195 = "1";
        } else if (rb_C3195_2.isChecked()) {
            C3195 = "2";
        } else if (rb_C3195_3.isChecked()) {
            C3195 = "3";
        } else if (rb_C3195_4.isChecked()) {
            C3195 = "4";
        } else if (rb_C3195_DK.isChecked()) {
            C3195 = "9";
        } else if (rb_C3195_RA.isChecked()) {
            C3195 = "8";
        }


        if (ed_C3196.getText().toString().trim().length() > 0) {
            C3196 = ed_C3196.getText().toString().trim();
        }

        if (rb_C3197_1.isChecked()) {
            C3197 = "1";
        } else if (rb_C3197_2.isChecked()) {
            C3197 = "2";
        } else if (rb_C3197_DK.isChecked()) {
            C3197 = "9";
        } else if (rb_C3197_RA.isChecked()) {
            C3197 = "8";
        }

        if (rb_C3198_1.isChecked()) {
            C3198 = "1";
        } else if (rb_C3198_2.isChecked()) {
            C3198 = "2";
        } else if (rb_C3198_DK.isChecked()) {
            C3198 = "9";
        } else if (rb_C3198_RA.isChecked()) {
            C3198 = "8";
        }

        if (rb_C3199_1.isChecked()) {
            C3199 = "1";
        } else if (rb_C3199_2.isChecked()) {
            C3199 = "2";
        } else if (rb_C3199_DK.isChecked()) {
            C3199 = "9";
        } else if (rb_C3199_RA.isChecked()) {
            C3199 = "8";
        }

        if (rb_C3199_1_1.isChecked()) {
            C3199_1 = "1";
        } else if (rb_C3199_1_2.isChecked()) {
            C3199_1 = "2";
        } else if (rb_C3199_1_DK.isChecked()) {
            C3199_1 = "9";
        } else if (rb_C3199_1_RA.isChecked()) {
            C3199_1 = "8";
        }

        if (rb_C3200_1.isChecked()) {
            C3200 = "1";
        } else if (rb_C3200_2.isChecked()) {
            C3200 = "2";
        } else if (rb_C3200_DK.isChecked()) {
            C3200 = "9";
        } else if (rb_C3200_RA.isChecked()) {
            C3200 = "8";
        }

        if (rb_C3201_u_1.isChecked()) {
            C3201_u = "1";
            C3201_a = ed_C3201_a.getText().toString().trim();
        } else if (rb_C3201_u_2.isChecked()) {
            C3201_u = "2";
            C3201_b = ed_C3201_b.getText().toString().trim();
        } else if (rb_C3201_u_DK.isChecked()) {
            C3201_u = "9";
            C3201_a = "99";
            C3201_b = "99";
        } else if (rb_C3201_u_RA.isChecked()) {
            C3201_u = "8";
            C3201_a = "99";
            C3201_b = "99";
        }

        if (rb_C3202_1.isChecked()) {
            C3202 = "1";
        } else if (rb_C3202_2.isChecked()) {
            C3202 = "2";
        } else if (rb_C3202_DK.isChecked()) {
            C3202 = "9";
        } else if (rb_C3202_RA.isChecked()) {
            C3202 = "8";
        }

        if (rb_C3203_1.isChecked()) {
            C3203 = "1";
        } else if (rb_C3203_2.isChecked()) {
            C3203 = "2";
        } else if (rb_C3203_DK.isChecked()) {
            C3203 = "9";
        } else if (rb_C3203_RA.isChecked()) {
            C3203 = "8";
        }

        if (rb_C3204_u_1.isChecked()) {
            C3204_u = "1";
            C3204_a = ed_C3204_a.getText().toString().trim();
        } else if (rb_C3204_u_2.isChecked()) {
            C3204_u = "2";
            C3204_b = ed_C3204_b.getText().toString().trim();
        } else if (rb_C3204_u_DK.isChecked()) {
            C3204_u = "9";
            C3204_a = "99";
            C3204_b = "99";
        } else if (rb_C3204_u_RA.isChecked()) {
            C3204_u = "8";
            C3204_a = "99";
            C3204_b = "99";
        }

        if (rb_C3205_1.isChecked()) {
            C3205 = "1";
        } else if (rb_C3205_2.isChecked()) {
            C3205 = "2";
        } else if (rb_C3205_DK.isChecked()) {
            C3205 = "9";
        } else if (rb_C3205_RA.isChecked()) {
            C3205 = "8";
        }

        if (rb_C3206_1.isChecked()) {
            C3206 = "1";
        } else if (rb_C3206_2.isChecked()) {
            C3206 = "2";
        } else if (rb_C3206_DK.isChecked()) {
            C3206 = "9";
        } else if (rb_C3206_RA.isChecked()) {
            C3206 = "8";
        }

        if (rb_C3207_1.isChecked()) {
            C3207 = "1";
        } else if (rb_C3207_2.isChecked()) {
            C3207 = "2";
        } else if (rb_C3207_DK.isChecked()) {
            C3207 = "9";
        } else if (rb_C3207_RA.isChecked()) {
            C3207 = "8";
        }

        if (rb_C3208_u_0.isChecked()) {
            C3208_u = "0";
            C3208_a = ed_C3208_a.getText().toString().trim();
        } else if (rb_C3208_u_1.isChecked()) {
            C3208_u = "1";
            C3208_b = ed_C3208_b.getText().toString().trim();
        } else if (rb_C3208_u_DK.isChecked()) {
            C3208_u = "9";
            C3208_a = "99";
            C3208_b = "99";
        } else if (rb_C3208_u_RA.isChecked()) {
            C3208_u = "8";
            C3208_a = "99";
            C3208_b = "99";
        }

        if (rb_C3209_1.isChecked()) {
            C3209 = "1";
        } else if (rb_C3209_2.isChecked()) {
            C3209 = "2";
        } else if (rb_C3209_DK.isChecked()) {
            C3209 = "9";
        } else if (rb_C3209_RA.isChecked()) {
            C3209 = "8";
        }

        if (rb_C3210_1.isChecked()) {
            C3210 = "1";
        } else if (rb_C3210_2.isChecked()) {
            C3210 = "2";
        } else if (rb_C3210_DK.isChecked()) {
            C3210 = "9";
        } else if (rb_C3210_RA.isChecked()) {
            C3210 = "8";
        }

        if (rb_C3212_1.isChecked()) {
            C3212 = "1";
        } else if (rb_C3212_2.isChecked()) {
            C3212 = "2";
        } else if (rb_C3212_DK.isChecked()) {
            C3212 = "9";
        } else if (rb_C3212_RA.isChecked()) {
            C3212 = "8";
        }

        if (rb_C3213_1.isChecked()) {
            C3213 = "1";
        } else if (rb_C3213_2.isChecked()) {
            C3213 = "2";
        } else if (rb_C3213_DK.isChecked()) {
            C3213 = "9";
        } else if (rb_C3213_RA.isChecked()) {
            C3213 = "8";
        }

        if (rb_C3214_1.isChecked()) {
            C3214 = "1";
        } else if (rb_C3214_2.isChecked()) {
            C3214 = "2";
        } else if (rb_C3214_DK.isChecked()) {
            C3214 = "9";
        } else if (rb_C3214_RA.isChecked()) {
            C3214 = "8";
        }

        if (rb_C3215_1.isChecked()) {
            C3215 = "1";
        } else if (rb_C3215_2.isChecked()) {
            C3215 = "2";
        } else if (rb_C3215_DK.isChecked()) {
            C3215 = "9";
        } else if (rb_C3215_RA.isChecked()) {
            C3215 = "8";
        }

        if (rb_C3216_1.isChecked()) {
            C3216 = "1";
        } else if (rb_C3216_2.isChecked()) {
            C3216 = "2";
        } else if (rb_C3216_DK.isChecked()) {
            C3216 = "9";
        } else if (rb_C3216_RA.isChecked()) {
            C3216 = "8";
        }

        if (rb_C3217_1.isChecked()) {
            C3217 = "1";
        } else if (rb_C3217_2.isChecked()) {
            C3217 = "2";
        } else if (rb_C3217_DK.isChecked()) {
            C3217 = "9";
        } else if (rb_C3217_RA.isChecked()) {
            C3217 = "8";
        }

        if (rb_C3218_1.isChecked()) {
            C3218 = "1";
        } else if (rb_C3218_2.isChecked()) {
            C3218 = "2";
        } else if (rb_C3218_3.isChecked()) {
            C3218 = "3";
        } else if (rb_C3218_4.isChecked()) {
            C3218 = "4";
        } else if (rb_C3218_5.isChecked()) {
            C3218 = "5";
        } else if (rb_C3218_6.isChecked()) {
            C3218 = "6";
        } else if (rb_C3218_7.isChecked()) {
            C3218 = "7";
        } else if (rb_C3218_DK.isChecked()) {
            C3218 = "9";
        } else if (rb_C3218_RA.isChecked()) {
            C3218 = "8";
        } else if (rb_C3218_OT.isChecked()) {
            C3218 = "10";
        }

        if (rb_C3219_1.isChecked()) {
            C3219 = "1";
        } else if (rb_C3219_2.isChecked()) {
            C3219 = "2";
        } else if (rb_C3219_DK.isChecked()) {
            C3219 = "9";
        } else if (rb_C3219_RA.isChecked()) {
            C3219 = "8";
        }

        if (rb_C3220_u_1.isChecked()) {
            C3220_u = "0";
            C3220_a = ed_C3220_a.getText().toString().trim();
        } else if (rb_C3220_u_2.isChecked()) {
            C3220_u = "1";
            C3220_b = ed_C3220_b.getText().toString().trim();
        } else if (rb_C3220_u_RA.isChecked()) {
            C3220_u = "9";
            C3220_a = "99";
            C3220_b = "99";
        } else if (rb_C3220_u_DK.isChecked()) {
            C3220_u = "8";
            C3220_a = "99";
            C3220_b = "99";
        }

        if (rb_C3221_1.isChecked()) {
            C3221 = "1";
        } else if (rb_C3221_2.isChecked()) {
            C3221 = "2";
        } else if (rb_C3221_3.isChecked()) {
            C3221 = "3";
        }

        if (rb_C3222_1.isChecked()) {
            C3222 = "1";
        } else if (rb_C3222_2.isChecked()) {
            C3222 = "2";
        } else if (rb_C3222_DK.isChecked()) {
            C3222 = "9";
        } else if (rb_C3222_RA.isChecked()) {
            C3222 = "8";
        }

        if (rb_C3223_1.isChecked()) {
            C3223 = "1";
        } else if (rb_C3223_2.isChecked()) {
            C3223 = "2";
        } else if (rb_C3223_DK.isChecked()) {
            C3223 = "9";
        } else if (rb_C3223_RA.isChecked()) {
            C3223 = "8";
        }

        if (rb_C3224_1.isChecked()) {
            C3224 = "1";
        } else if (rb_C3224_2.isChecked()) {
            C3224 = "2";
        } else if (rb_C3224_DK.isChecked()) {
            C3224 = "9";
        } else if (rb_C3224_RA.isChecked()) {
            C3224 = "8";
        }

        if (rb_C3225_1.isChecked()) {
            C3225 = "1";
        } else if (rb_C3225_2.isChecked()) {
            C3225 = "2";
        } else if (rb_C3225_DK.isChecked()) {
            C3225 = "9";
        } else if (rb_C3225_RA.isChecked()) {
            C3225 = "8";
        }

        if (rb_C3226_1.isChecked()) {
            C3226 = "1";
        } else if (rb_C3226_2.isChecked()) {
            C3226 = "2";
        } else if (rb_C3226_DK.isChecked()) {
            C3226 = "9";
        } else if (rb_C3226_RA.isChecked()) {
            C3226 = "8";
        }

        if (rb_C3227_1.isChecked()) {
            C3227 = "1";
        } else if (rb_C3227_2.isChecked()) {
            C3227 = "2";
        } else if (rb_C3227_DK.isChecked()) {
            C3227 = "9";
        } else if (rb_C3227_RA.isChecked()) {
            C3227 = "8";
        }

        if (rb_C3227_1_1.isChecked()) {
            C3227_1 = "1";
        } else if (rb_C3227_1_2.isChecked()) {
            C3227_1 = "2";
        } else if (rb_C3227_1_DK.isChecked()) {
            C3227_1 = "9";
        } else if (rb_C3227_1_RA.isChecked()) {
            C3227_1 = "8";
        }

        if (rb_C3227_2_1.isChecked()) {
            C3227_2 = "1";
        } else if (rb_C3227_2_2.isChecked()) {
            C3227_2 = "2";
        } else if (rb_C3227_2_3.isChecked()) {
            C3227_2 = "3";
        } else if (rb_C3227_2_4.isChecked()) {
            C3227_2 = "4";
        } else if (rb_C3227_2_5.isChecked()) {
            C3227_2 = "5";
        } else if (rb_C3227_2_6.isChecked()) {
            C3227_2 = "6";
        } else if (rb_C3227_2_DK.isChecked()) {
            C3227_2 = "9";
        } else if (rb_C3227_2_RA.isChecked()) {
            C3227_2 = "8";
        }

        if (rb_C3227_3_1.isChecked()) {
            C3227_3 = "1";
        } else if (rb_C3227_3_2.isChecked()) {
            C3227_3 = "2";
        } else if (rb_C3227_3_3.isChecked()) {
            C3227_3 = "3";
        } else if (rb_C3227_3_4.isChecked()) {
            C3227_3 = "4";
        } else if (rb_C3227_3_5.isChecked()) {
            C3227_3 = "5";
        } else if (rb_C3227_3_6.isChecked()) {
            C3227_3 = "6";
        } else if (rb_C3227_3_7.isChecked()) {
            C3227_3 = "7";
        } else if (rb_C3227_3_DK.isChecked()) {
            C3227_3 = "9";
        } else if (rb_C3227_3_RA.isChecked()) {
            C3227_3 = "8";
        }

        if (rb_C3227_4_1.isChecked()) {
            C3227_4 = "1";
        } else if (rb_C3227_4_2.isChecked()) {
            C3227_4 = "2";
        } else if (rb_C3227_4_DK.isChecked()) {
            C3227_4 = "9";
        } else if (rb_C3227_4_RA.isChecked()) {
            C3227_4 = "8";
        }

        if (rb_C3227_5_1.isChecked()) {
            C3227_5 = "1";
        } else if (rb_C3227_5_2.isChecked()) {
            C3227_5 = "2";
        } else if (rb_C3227_5_DK.isChecked()) {
            C3227_5 = "9";
        } else if (rb_C3227_5_RA.isChecked()) {
            C3227_5 = "8";
        }

        if (rb_C3227_6_1.isChecked()) {
            C3227_6 = "1";
        } else if (rb_C3227_6_2.isChecked()) {
            C3227_6 = "2";
        } else if (rb_C3227_6_DK.isChecked()) {
            C3227_6 = "9";
        } else if (rb_C3227_6_RA.isChecked()) {
            C3227_6 = "8";
        }

        if (rb_C3227_7_1.isChecked()) {
            C3227_7 = "1";
        } else if (rb_C3227_7_2.isChecked()) {
            C3227_7 = "2";
        } else if (rb_C3227_7_DK.isChecked()) {
            C3227_7 = "9";
        } else if (rb_C3227_7_RA.isChecked()) {
            C3227_7 = "8";
        }

        if (rb_C3227_8_1.isChecked()) {
            C3227_8 = "1";
        } else if (rb_C3227_8_2.isChecked()) {
            C3227_8 = "2";
        } else if (rb_C3227_8_DK.isChecked()) {
            C3227_8 = "9";
        } else if (rb_C3227_8_RA.isChecked()) {
            C3227_8 = "8";
        }

        if (rb_C3227_9_1.isChecked()) {
            C3227_9 = "1";
        } else if (rb_C3227_9_2.isChecked()) {
            C3227_9 = "2";
        } else if (rb_C3227_9_DK.isChecked()) {
            C3227_9 = "9";
        } else if (rb_C3227_9_RA.isChecked()) {
            C3227_9 = "8";
        }

        if (rb_C3227_10_1.isChecked()) {
            C3227_10 = "1";
        } else if (rb_C3227_10_2.isChecked()) {
            C3227_10 = "2";
        } else if (rb_C3227_10_3.isChecked()) {
            C3227_10 = "3";
        } else if (rb_C3227_10_4.isChecked()) {
            C3227_10 = "4";
        } else if (rb_C3227_10_DK.isChecked()) {
            C3227_10 = "9";
        } else if (rb_C3227_10_RA.isChecked()) {
            C3227_10 = "8";
        }

        if (rb_C3227_11_1.isChecked()) {
            C3227_11 = "1";
        } else if (rb_C3227_11_2.isChecked()) {
            C3227_11 = "2";
        } else if (rb_C3227_11_DK.isChecked()) {
            C3227_11 = "9";
        } else if (rb_C3227_11_RA.isChecked()) {
            C3227_11 = "8";
        }

        if (rb_C3227_12_1.isChecked()) {
            C3227_12 = "1";
        } else if (rb_C3227_12_2.isChecked()) {
            C3227_12 = "2";
        } else if (rb_C3227_12_DK.isChecked()) {
            C3227_12 = "9";
        } else if (rb_C3227_12_RA.isChecked()) {
            C3227_12 = "8";
        }

        if (rb_C3227_13_1.isChecked()) {
            C3227_13 = "1";
        } else if (rb_C3227_13_2.isChecked()) {
            C3227_13 = "2";
        } else if (rb_C3227_13_DK.isChecked()) {
            C3227_13 = "9";
        } else if (rb_C3227_13_RA.isChecked()) {
            C3227_13 = "8";
        }

        if (rb_C3227_14_1.isChecked()) {
            C3227_14 = "1";
        } else if (rb_C3227_14_2.isChecked()) {
            C3227_14 = "2";
        } else if (rb_C3227_14_DK.isChecked()) {
            C3227_14 = "9";
        } else if (rb_C3227_14_RA.isChecked()) {
            C3227_14 = "8";
        }

        if (rb_C3227_15_1.isChecked()) {
            C3227_15 = "1";
        } else if (rb_C3227_15_2.isChecked()) {
            C3227_15 = "2";
        } else if (rb_C3227_15_DK.isChecked()) {
            C3227_15 = "9";
        } else if (rb_C3227_15_RA.isChecked()) {
            C3227_15 = "8";
        }

        if (rb_C3227_16_1.isChecked()) {
            C3227_16 = "1";
        } else if (rb_C3227_16_2.isChecked()) {
            C3227_16 = "2";
        } else if (rb_C3227_16_DK.isChecked()) {
            C3227_16 = "9";
        } else if (rb_C3227_16_RA.isChecked()) {
            C3227_16 = "8";
        }

        if (rb_C3227_17_1.isChecked()) {
            C3227_17 = "1";
        } else if (rb_C3227_17_2.isChecked()) {
            C3227_17 = "2";
        } else if (rb_C3227_17_DK.isChecked()) {
            C3227_17 = "9";
        } else if (rb_C3227_17_RA.isChecked()) {
            C3227_17 = "8";
        }

        if (rb_C3227_18_1.isChecked()) {
            C3227_18 = "1";
        } else if (rb_C3227_18_2.isChecked()) {
            C3227_18 = "2";
        } else if (rb_C3227_18_DK.isChecked()) {
            C3227_18 = "9";
        } else if (rb_C3227_18_RA.isChecked()) {
            C3227_18 = "8";
        }

        if (rb_C3227_19_1.isChecked()) {
            C3227_19 = "1";
        } else if (rb_C3227_19_2.isChecked()) {
            C3227_19 = "2";
        } else if (rb_C3227_19_DK.isChecked()) {
            C3227_19 = "9";
        } else if (rb_C3227_19_RA.isChecked()) {
            C3227_19 = "8";
        }

        if (rb_C3227_20_1.isChecked()) {
            C3227_20 = "1";
        } else if (rb_C3227_20_2.isChecked()) {
            C3227_20 = "2";
        } else if (rb_C3227_20_DK.isChecked()) {
            C3227_20 = "9";
        } else if (rb_C3227_20_RA.isChecked()) {
            C3227_20 = "8";
        }

        if (rb_C3227_21_1.isChecked()) {
            C3227_21 = "1";
        } else if (rb_C3227_21_2.isChecked()) {
            C3227_21 = "2";
        } else if (rb_C3227_21_DK.isChecked()) {
            C3227_21 = "9";
        } else if (rb_C3227_21_RA.isChecked()) {
            C3227_21 = "8";
        }

        if (rb_C3227_22_1.isChecked()) {
            C3227_22 = "1";
        } else if (rb_C3227_22_2.isChecked()) {
            C3227_22 = "2";
        } else if (rb_C3227_22_DK.isChecked()) {
            C3227_22 = "9";
        } else if (rb_C3227_22_RA.isChecked()) {
            C3227_22 = "8";
        }

        if (ed_C3228.getText().toString().trim().length() > 0) {
            C3228 = ed_C3228.getText().toString().trim();
        }


    }

    void insert_data() {

        String query = "insert into   C3121_C3228("

                + C3001_C3011.study_id + ","
                + Global.C.C3121_C3228.C3121 + ","
                + Global.C.C3121_C3228.C3122 + ","
                + Global.C.C3121_C3228.C3122d + ","
                + Global.C.C3121_C3228.C3122m + ","
                + Global.C.C3121_C3228.C3123_u + ","
                + Global.C.C3121_C3228.C3123_b + ","
                + Global.C.C3121_C3228.C3123_c + ","
                + Global.C.C3121_C3228.C3124 + ","
                + Global.C.C3121_C3228.C3125 + ","
                + Global.C.C3121_C3228.C3126 + ","
                + Global.C.C3121_C3228.C3127 + ","
                + Global.C.C3121_C3228.C3128 + ","
                + Global.C.C3121_C3228.C3129 + ","
                + Global.C.C3121_C3228.C3130 + ","
                + Global.C.C3121_C3228.C3131 + ","
                + Global.C.C3121_C3228.C3132_u + ","
                + Global.C.C3121_C3228.C3132_a + ","
                + Global.C.C3121_C3228.C3132_b + ","
                + Global.C.C3121_C3228.C3133 + ","
                + Global.C.C3121_C3228.C3134 + ","
                + Global.C.C3121_C3228.C3135 + ","
                + Global.C.C3121_C3228.C3136 + ","
                + Global.C.C3121_C3228.C3137 + ","
                + Global.C.C3121_C3228.C3138 + ","
                + Global.C.C3121_C3228.C3139 + ","
                + Global.C.C3121_C3228.C3140 + ","
                + Global.C.C3121_C3228.C3141 + ","
                + Global.C.C3121_C3228.C3142 + ","
                + Global.C.C3121_C3228.C3143 + ","
                + Global.C.C3121_C3228.C3144_u + ","
                + Global.C.C3121_C3228.C3144 + ","
                + Global.C.C3121_C3228.C3144_a + ","
                + Global.C.C3121_C3228.C3144_b + ","
                + Global.C.C3121_C3228.C3145 + ","
                + Global.C.C3121_C3228.C3146 + ","
                + Global.C.C3121_C3228.C3147_u + ","
                + Global.C.C3121_C3228.C3147_a + ","
                + Global.C.C3121_C3228.C3147_b + ","
                + Global.C.C3121_C3228.C3148 + ","
                + Global.C.C3121_C3228.C3149 + ","
                + Global.C.C3121_C3228.C3150_u + ","
                + Global.C.C3121_C3228.C3150_a + ","
                + Global.C.C3121_C3228.C3150_b + ","
                + Global.C.C3121_C3228.C3151 + ","
                + Global.C.C3121_C3228.C3152_u + ","
                + Global.C.C3121_C3228.C3152_a + ","
                + Global.C.C3121_C3228.C3152_b + ","
                + Global.C.C3121_C3228.C3153 + ","
                + Global.C.C3121_C3228.C3154 + ","
                + Global.C.C3121_C3228.C3155 + ","
                + Global.C.C3121_C3228.C3156 + ","
                + Global.C.C3121_C3228.C3157 + ","
                + Global.C.C3121_C3228.C3158 + ","
                + Global.C.C3121_C3228.C3159_u + ","
                + Global.C.C3121_C3228.C3159_a + ","
                + Global.C.C3121_C3228.C3159_b + ","
                + Global.C.C3121_C3228.C3159_c + ","
                + Global.C.C3121_C3228.C3160 + ","
                + Global.C.C3121_C3228.C3161 + ","
                + Global.C.C3121_C3228.C3162 + ","
                + Global.C.C3121_C3228.C3162d + ","
                + Global.C.C3121_C3228.C3162m + ","
                + Global.C.C3121_C3228.C3163_u + ","
                + Global.C.C3121_C3228.C3163_a + ","
                + Global.C.C3121_C3228.C3163_b + ","
                + Global.C.C3121_C3228.C3164 + ","
                + Global.C.C3121_C3228.C3165_u + ","
                + Global.C.C3121_C3228.C3165_a + ","
                + Global.C.C3121_C3228.C3165_b + ","
                + Global.C.C3121_C3228.C3166 + ","
                + Global.C.C3121_C3228.C3167 + ","
                + Global.C.C3121_C3228.C3168 + ","
                + Global.C.C3121_C3228.C3169 + ","
                + Global.C.C3121_C3228.C3170 + ","
                + Global.C.C3121_C3228.C3171 + ","
                + Global.C.C3121_C3228.C3172 + ","
                + Global.C.C3121_C3228.C3173 + ","
                + Global.C.C3121_C3228.C3174 + ","
                + Global.C.C3121_C3228.C3175_u + ","
                + Global.C.C3121_C3228.C3175_a + ","
                + Global.C.C3121_C3228.C3175_b + ","
                + Global.C.C3121_C3228.C3176 + ","
                + Global.C.C3121_C3228.C3177_u + ","
                + Global.C.C3121_C3228.C3177_a + ","
                + Global.C.C3121_C3228.C3177_b + ","
                + Global.C.C3121_C3228.C3178 + ","
                + Global.C.C3121_C3228.C3179_u + ","
                + Global.C.C3121_C3228.C3179_a + ","
                + Global.C.C3121_C3228.C3179_b + ","
                + Global.C.C3121_C3228.C3180 + ","
                + Global.C.C3121_C3228.C3181 + ","
                + Global.C.C3121_C3228.C3182 + ","
                + Global.C.C3121_C3228.C3183 + ","
                + Global.C.C3121_C3228.C3184 + ","
                + Global.C.C3121_C3228.C3185 + ","
                + Global.C.C3121_C3228.C3186_1 + ","
                + Global.C.C3121_C3228.C3186 + ","
                + Global.C.C3121_C3228.C3187 + ","
                + Global.C.C3121_C3228.C3188 + ","
                + Global.C.C3121_C3228.C3189 + ","
                + Global.C.C3121_C3228.C3190 + ","
                + Global.C.C3121_C3228.C3191 + ","
                + Global.C.C3121_C3228.C3192 + ","
                + Global.C.C3121_C3228.C3193_u + ","
                + Global.C.C3121_C3228.C3193_a + ","
                + Global.C.C3121_C3228.C3193_b + ","
                + Global.C.C3121_C3228.C3194 + ","
                + Global.C.C3121_C3228.C3195A + ","
                + Global.C.C3121_C3228.C3195 + ","
                + Global.C.C3121_C3228.C3196 + ","
                + Global.C.C3121_C3228.C3197 + ","
                + Global.C.C3121_C3228.C3198 + ","
                + Global.C.C3121_C3228.C3199 + ","
                + Global.C.C3121_C3228.C3199_1 + ","
                + Global.C.C3121_C3228.C3200 + ","
                + Global.C.C3121_C3228.C3201_u + ","
                + Global.C.C3121_C3228.C3201_a + ","
                + Global.C.C3121_C3228.C3201_b + ","
                + Global.C.C3121_C3228.C3202 + ","
                + Global.C.C3121_C3228.C3203 + ","
                + Global.C.C3121_C3228.C3204_u + ","
                + Global.C.C3121_C3228.C3204_a + ","
                + Global.C.C3121_C3228.C3204_b + ","
                + Global.C.C3121_C3228.C3205 + ","
                + Global.C.C3121_C3228.C3206 + ","
                + Global.C.C3121_C3228.C3207 + ","
                + Global.C.C3121_C3228.C3208_u + ","
                + Global.C.C3121_C3228.C3208_a + ","
                + Global.C.C3121_C3228.C3208_b + ","
                + Global.C.C3121_C3228.C3209 + ","
                + Global.C.C3121_C3228.C3210 + ","
                + Global.C.C3121_C3228.C3212 + ","
                + Global.C.C3121_C3228.C3213 + ","
                + Global.C.C3121_C3228.C3214 + ","
                + Global.C.C3121_C3228.C3215 + ","
                + Global.C.C3121_C3228.C3216 + ","
                + Global.C.C3121_C3228.C3217 + ","
                + Global.C.C3121_C3228.C3218 + ","
                + Global.C.C3121_C3228.C3219 + ","
                + Global.C.C3121_C3228.C3220_u + ","
                + Global.C.C3121_C3228.C3220_a + ","
                + Global.C.C3121_C3228.C3220_b + ","
                + Global.C.C3121_C3228.C3221 + ","
                + Global.C.C3121_C3228.C3222 + ","
                + Global.C.C3121_C3228.C3223 + ","
                + Global.C.C3121_C3228.C3224 + ","
                + Global.C.C3121_C3228.C3225 + ","
                + Global.C.C3121_C3228.C3226 + ","
                + Global.C.C3121_C3228.C3227 + ","
                + Global.C.C3121_C3228.C3227_1 + ","
                + Global.C.C3121_C3228.C3227_2 + ","
                + Global.C.C3121_C3228.C3227_3 + ","
                + Global.C.C3121_C3228.C3227_4 + ","
                + Global.C.C3121_C3228.C3227_5 + ","
                + Global.C.C3121_C3228.C3227_6 + ","
                + Global.C.C3121_C3228.C3227_7 + ","
                + Global.C.C3121_C3228.C3227_8 + ","
                + Global.C.C3121_C3228.C3227_9 + ","
                + Global.C.C3121_C3228.C3227_10 + ","
                + Global.C.C3121_C3228.C3227_11 + ","
                + Global.C.C3121_C3228.C3227_12 + ","
                + Global.C.C3121_C3228.C3227_13 + ","
                + Global.C.C3121_C3228.C3227_14 + ","
                + Global.C.C3121_C3228.C3227_15 + ","
                + Global.C.C3121_C3228.C3227_16 + ","
                + Global.C.C3121_C3228.C3227_17 + ","
                + Global.C.C3121_C3228.C3227_18 + ","
                + Global.C.C3121_C3228.C3227_19 + ","
                + Global.C.C3121_C3228.C3227_20 + ","
                + Global.C.C3121_C3228.C3227_21 + ","
                + Global.C.C3121_C3228.C3227_22 + ","
                + Global.C.C3121_C3228.C3228 + ","
                + C3001_C3011.STATUS + ") values ('" +

                study_id + "','" +
                C3121 + "','" +
                C3122 + "','" +
                C3122d + "','" +
                C3122m + "','" +
                C3123_u + "','" +
                C3123_b + "','" +
                C3123_c + "','" +
                C3124 + "','" +
                C3125 + "','" +
                C3126 + "','" +
                C3127 + "','" +
                C3128 + "','" +
                C3129 + "','" +
                C3130 + "','" +
                C3131 + "','" +
                C3132_u + "','" +
                C3132_a + "','" +
                C3132_b + "','" +
                C3133 + "','" +
                C3134 + "','" +
                C3135 + "','" +
                C3136 + "','" +
                C3137 + "','" +
                C3138 + "','" +
                C3139 + "','" +
                C3140 + "','" +
                C3141 + "','" +
                C3142 + "','" +
                C3143 + "','" +
                C3144_u + "','" +
                C3144 + "','" +
                C3144_a + "','" +
                C3144_b + "','" +
                C3145 + "','" +
                C3146 + "','" +
                C3147_u + "','" +
                C3147_a + "','" +
                C3147_b + "','" +
                C3148 + "','" +
                C3149 + "','" +
                C3150_u + "','" +
                C3150_a + "','" +
                C3150_b + "','" +
                C3151 + "','" +
                C3152_u + "','" +
                C3152_a + "','" +
                C3152_b + "','" +
                C3153 + "','" +
                C3154 + "','" +
                C3155 + "','" +
                C3156 + "','" +
                C3157 + "','" +
                C3158 + "','" +
                C3159_u + "','" +
                C3159_a + "','" +
                C3159_b + "','" +
                C3159_c + "','" +
                C3160 + "','" +
                C3161 + "','" +
                C3162 + "','" +
                C3162d + "','" +
                C3162m + "','" +
                C3163_u + "','" +
                C3163_a + "','" +
                C3163_b + "','" +
                C3164 + "','" +
                C3165_u + "','" +
                C3165_a + "','" +
                C3165_b + "','" +
                C3166 + "','" +
                C3167 + "','" +
                C3168 + "','" +
                C3169 + "','" +
                C3170 + "','" +
                C3171 + "','" +
                C3172 + "','" +
                C3173 + "','" +
                C3174 + "','" +
                C3175_u + "','" +
                C3175_a + "','" +
                C3175_b + "','" +
                C3176 + "','" +
                C3177_u + "','" +
                C3177_a + "','" +
                C3177_b + "','" +
                C3178 + "','" +
                C3179_u + "','" +
                C3179_a + "','" +
                C3179_b + "','" +
                C3180 + "','" +
                C3181 + "','" +
                C3182 + "','" +
                C3183 + "','" +
                C3184 + "','" +
                C3185 + "','" +
                C3186_1 + "','" +
                C3186 + "','" +
                C3187 + "','" +
                C3188 + "','" +
                C3189 + "','" +
                C3190 + "','" +
                C3191 + "','" +
                C3192 + "','" +
                C3193_u + "','" +
                C3193_a + "','" +
                C3193_b + "','" +
                C3194 + "','" +
                C3195A + "','" +
                C3195 + "','" +
                C3196 + "','" +
                C3197 + "','" +
                C3198 + "','" +
                C3199 + "','" +
                C3199_1 + "','" +
                C3200 + "','" +
                C3201_u + "','" +
                C3201_a + "','" +
                C3201_b + "','" +
                C3202 + "','" +
                C3203 + "','" +
                C3204_u + "','" +
                C3204_a + "','" +
                C3204_b + "','" +
                C3205 + "','" +
                C3206 + "','" +
                C3207 + "','" +
                C3208_u + "','" +
                C3208_a + "','" +
                C3208_b + "','" +
                C3209 + "','" +
                C3210 + "','" +
                C3212 + "','" +
                C3213 + "','" +
                C3214 + "','" +
                C3215 + "','" +
                C3216 + "','" +
                C3217 + "','" +
                C3218 + "','" +
                C3219 + "','" +
                C3220_u + "','" +
                C3220_a + "','" +
                C3220_b + "','" +
                C3221 + "','" +
                C3222 + "','" +
                C3223 + "','" +
                C3224 + "','" +
                C3225 + "','" +
                C3226 + "','" +
                C3227 + "','" +
                C3227_1 + "','" +
                C3227_2 + "','" +
                C3227_3 + "','" +
                C3227_4 + "','" +
                C3227_5 + "','" +
                C3227_6 + "','" +
                C3227_7 + "','" +
                C3227_8 + "','" +
                C3227_9 + "','" +
                C3227_10 + "','" +
                C3227_11 + "','" +
                C3227_12 + "','" +
                C3227_13 + "','" +
                C3227_14 + "','" +
                C3227_15 + "','" +
                C3227_16 + "','" +
                C3227_17 + "','" +
                C3227_18 + "','" +
                C3227_19 + "','" +
                C3227_20 + "','" +
                C3227_21 + "','" +
                C3227_22 + "','" +
                C3228 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 8: Signs and symptoms associated with the fatal illness", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        /*if (Gothrough.IamHiden(ll_C3121) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3122) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3122d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3122m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3123_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3123_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3123_c) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3124) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3125) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3126) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3127) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3128) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3129) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3130) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3131) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3132_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3132_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3132_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3133) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3134) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3135) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3136) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3137) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3138) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3139) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3140) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3141) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3142) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3143) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3144_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3144) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3144_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3144_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3145) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3146) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3147_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3147_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3147_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3148) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3149) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3150_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3150_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3150_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3151) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3152_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3152_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3152_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3153) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3154) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3155) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3156) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3157) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3158) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3159_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3159_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3159_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3159_c) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3160) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3161) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3162) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3162d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3162m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3163_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3163_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3163_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3164) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3165_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3165_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3165_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3166) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3168) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3169) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3170) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3171) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3172) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3173) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3174) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3175_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3175_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3175_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3176) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3177_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3177_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3177_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3178) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3179_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3179_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3179_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3180) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3181) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3182) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3183) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3184) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3185) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3186_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3186) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3187) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3188) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3189) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3190) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3191) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3192) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3193_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3193_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3193_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3194) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3195A) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3195) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3196) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3197) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3198) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3199) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3199_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3200) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3201_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3201_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3201_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3202) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3203) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3204_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3204_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3204_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3205) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3206) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3207) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3208_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3208_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3208_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3209) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3210) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3212) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3213) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3214) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3215) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3216) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3217) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3218) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3219) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3220_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3220_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3220_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3221) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3222) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3223) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3224) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3225) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3226) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_13) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_14) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_15) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_16) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_17) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_18) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_19) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_20) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_21) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3227_22) == false) {
            return false;
        }

        if(Gothrough.IamHiden(ll_C3228) == false) {
            return false;
        }*/

        return true;
    }

}
