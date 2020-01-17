package com.irfansyed.vas.vasmonitring.child;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.vas.vasmonitring.R;
import com.irfansyed.vas.vasmonitring.databinding.C3251C3288CBinding;
import com.irfansyed.vas.vasmonitring.other.globale;

import java.util.Collection;

import Global.C.C3051_C3099;
import Global.C.C3251_C3288_A_C;
import Global.C.C3251_C3288_B;
import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

import static com.irfansyed.vas.vasmonitring.child.C3251_C3288_A.c3251A_ID;

public class C3251_C3288_C extends AppCompatActivity {

    int currentSection;

    String study_id;

    C3251C3288CBinding bi;
    boolean C3281Flag = true, flag_c3252 = true, flag_c3064 = true, flag_c3070 = true, flag_c3253 = false;
    int skip_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.c3251_c3288_c);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_c_sec_10));

        study_id = getIntent().getExtras().getString("study_id");

        /*DBHelper db = new DBHelper(this);
        Cursor C3253 = db.getData4("C3251_C3288_b", study_id);

        if (C3253.getCount() < 2) {

            bi.llC32681.setVisibility(View.GONE);
            bi.llC32682.setVisibility(View.GONE);
            bi.llC3269.setVisibility(View.GONE);
            bi.llC3270.setVisibility(View.GONE);
            bi.llC32711.setVisibility(View.GONE);
            bi.llC32712.setVisibility(View.GONE);
            bi.llC3272.setVisibility(View.GONE);
            bi.llC3273.setVisibility(View.GONE);
            bi.llC3274.setVisibility(View.GONE);
            bi.llC32751.setVisibility(View.GONE);
            bi.llC32752.setVisibility(View.GONE);
            bi.llC3276.setVisibility(View.GONE);
            bi.llC32771.setVisibility(View.GONE);
            bi.llC32772.setVisibility(View.GONE);

        } else {

            bi.llC32681.setVisibility(View.VISIBLE);
            bi.llC32682.setVisibility(View.VISIBLE);
            bi.llC3269.setVisibility(View.VISIBLE);
            bi.llC3270.setVisibility(View.VISIBLE);
            bi.llC32711.setVisibility(View.VISIBLE);
            bi.llC32712.setVisibility(View.VISIBLE);
            bi.llC3272.setVisibility(View.VISIBLE);
            bi.llC3273.setVisibility(View.VISIBLE);
            bi.llC3274.setVisibility(View.VISIBLE);
            bi.llC32751.setVisibility(View.VISIBLE);
            bi.llC32752.setVisibility(View.VISIBLE);
            bi.llC3276.setVisibility(View.VISIBLE);
            bi.llC32771.setVisibility(View.VISIBLE);
            bi.llC32772.setVisibility(View.VISIBLE);
        }*/

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        GetDataFromDB();
        SetContentUI();

    }

    private void GetDataFromDB() {

        DBHelper db = new DBHelper(this);

        Collection<C3251_C3288_B> col_c3251 = db.getSecC10BData(bi.edStudyId.getText().toString(), c3251A_ID);

        for (C3251_C3288_B col_data : col_c3251) {
            if (col_data.getC32532A().equals("1")) {

                String c3064 = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), Global.C.C3051_C3099.C3064);
                String c3065 = null;

                for (int i = 1; i <= 8; i++) {

                    String val;
                    if (i < 8)
                        val = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), "C3065_" + i);
                    else
                        val = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), C3051_C3099.C3065_DK);

                    if (Integer.valueOf(val) > -1) {
                        c3065 = val;
                        break;
                    }
                }
                c3065 = c3065 != null ? c3065 : "-1";

                String c3066 = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), Global.C.C3051_C3099.C3066);

                String c3067 = null;

                for (int i = 1; i <= 8; i++) {

                    String val;
                    if (i < 8)
                        val = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), "C3067_" + i);
                    else
                        val = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), C3051_C3099.C3067_DK);

                    if (Integer.valueOf(val) > -1) {
                        c3067 = val;
                        break;
                    }
                }
                c3067 = c3067 != null ? c3067 : "-1";

                String c3068 = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), Global.C.C3051_C3099.C3068);
                String c3069 = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), Global.C.C3051_C3099.C3069);
                String c3070 = db.getSpecificData(data.child.C3051_C3099.TABLE_NAME, bi.edStudyId.getText().toString(), Global.C.C3051_C3099.C3070);

                /*if (c3064.equals("-1") && c3065.equals("-1") && c3066.equals("-1")
                        && c3067.equals("-1") && c3068.equals("-1") && c3069.equals("-1") && c3070.equals("-1")) {
                    flag_c3064 = false;
                    break;
                } else {
                    flag_c3070 = false;
                    break;
                }*/

            }
        }

        if (flag_c3064 && flag_c3070) {

//        Inst_3
            String c3252 = db.getSpecificData(data.child.C3251_C3288_A_C.TABLE_NAME, bi.edStudyId.getText().toString(), C3251_C3288_A_C.sub_C3251_C3288_A_C.C3252);
            if (Integer.valueOf(c3252) == 2) {
                flag_c3252 = false;
            }

//        Inst_2 || Inst_4
            if (col_c3251 != null) {
                for (C3251_C3288_B col_data : col_c3251) {
                    /*if (Integer.valueOf(col_data.getC3253()) <= 3
                            && Integer.valueOf(col_data.getC32532A()) != 1) {
                        flag_c3253 = false;
                        break;
                    }*/

                    if (Integer.valueOf(col_data.getC32532A()) == 1 || Integer.valueOf(col_data.getC3253()) > 3) {
                        flag_c3253 = true;
                        break;
                    }

                }
            }

        } else {
            flag_c3253 = true;
        }
    }

    public void SetContentUI() {

        bi.rgC3255.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC32551.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3256); //ll_C3256
                }
            }
        });

        bi.rgC3260.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbC32602.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3278C3286); //ll_C3278_C3286
                    bi.llC3278C3286.setVisibility(View.GONE);
                } else if (i == bi.rbC32602.getId() || i == bi.rbC3260DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3261C3277A); //ll_C3261_C3277_A
                    ClearAllcontrol.ClearAll(bi.llC3261C3277B); //ll_C3261_C3277_B
                    bi.llC3261C3277A.setVisibility(View.GONE);
                    bi.llC3261C3277B.setVisibility(View.GONE);

                    bi.llC3278C3286.setVisibility(View.VISIBLE);
                } else {
                    bi.llC3278C3286.setVisibility(View.VISIBLE);
                    bi.llC3261C3277A.setVisibility(View.VISIBLE);
                    bi.llC3261C3277B.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rgC3259.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC325911.getId() || i != bi.rbC325917.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3262); //ll_C3262
                }


                if (i == bi.rbC325915.getId() || i == bi.rbC3259110.getId() || i == bi.rbC32591DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3281C3286); //ll_C3281_C3286
                    bi.llC3281C3286.setVisibility(View.GONE);

                    C3281Flag = false;
                } else {
                    bi.llC3281C3286.setVisibility(View.VISIBLE);

                    C3281Flag = true;
                }

            }
        });

        bi.rgC3263.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC32631.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3264); //ll_C3264

                    if (!bi.rbC32731.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llC3278C3280); //ll_C3278_C3280
                    }
                } else {
                    ClearAllcontrol.ClearAll(bi.llC3265C3265); //ll_C3265_C3265
                }
            }
        });

        bi.rgC3264.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbC326415.getId() || i == bi.rbC3264110.getId() || i == bi.rbC32641DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3281C3286); //ll_C3281_C3286
                    bi.llC3281C3286.setVisibility(View.GONE);

                    C3281Flag = false;
                } else {
                    bi.llC3281C3286.setVisibility(View.VISIBLE);

                    C3281Flag = true;
                }
            }
        });

        bi.rgC3266.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbC32662.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC32671C32772); //ll_C3267_1_C3277_2
                }
            }
        });

        bi.rgC3269.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC326911.getId() || i != bi.rbC326917.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3272); //ll_C3272
                }

                if (i == bi.rbC326915.getId() || i == bi.rbC3269110.getId() || i == bi.rbC32691DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3281C3286); //ll_C3281_C3286
                    bi.llC3281C3286.setVisibility(View.GONE);

                    C3281Flag = false;
                } else {
                    bi.llC3281C3286.setVisibility(View.VISIBLE);

                    C3281Flag = true;
                }
            }
        });

        bi.rgC3270.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC32701.getId() || i != bi.rbC32703.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3271C3277); //ll_C3271_C3277
                }
            }
        });

        bi.rgC3273.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC32731.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3274); //ll_C3274

                    if (!bi.rbC32631.isChecked()) {
                        ClearAllcontrol.ClearAll(bi.llC3278C3280); //ll_C3278_C3280
                    }
                } else {
                    ClearAllcontrol.ClearAll(bi.llC3275C3275); //ll_C3275_C3275
                }
            }
        });

        bi.rgC3274.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbC327415.getId() || i == bi.rbC3274110.getId() || i == bi.rbC32741DK.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3281C3286); //ll_C3281_C3286
                    bi.llC3281C3286.setVisibility(View.GONE);

                    C3281Flag = false;
                } else {
                    bi.llC3281C3286.setVisibility(View.VISIBLE);

                    C3281Flag = true;
                }
            }
        });

        bi.rgC3276.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbC32762.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC32771C32772); //ll_C3277_1_C3277_2
                }
            }
        });

        bi.rgC3279.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC32791.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3280); //ll_C3280
                }
            }
        });

        bi.rgC3281.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i != bi.rbC32811.getId()) {
                    ClearAllcontrol.ClearAll(bi.llC3282); //ll_C3282
                }
            }
        });


        CompoundButton.OnCheckedChangeListener cbx_2242 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbC3282Dk.isChecked()) {
                    bi.cbC32821.setChecked(false);
                    bi.cbC32821.setEnabled(false);
                    bi.cbC32822.setChecked(false);
                    bi.cbC32822.setEnabled(false);
                    bi.cbC32823.setChecked(false);
                    bi.cbC32823.setEnabled(false);
                    bi.cbC32824.setChecked(false);
                    bi.cbC32824.setEnabled(false);
                    bi.cbC32825.setChecked(false);
                    bi.cbC32825.setEnabled(false);
                    bi.cbC32826.setChecked(false);
                    bi.cbC32826.setEnabled(false);
                    bi.cbC32827.setChecked(false);
                    bi.cbC32827.setEnabled(false);
                } else {
                    bi.cbC32821.setEnabled(true);
                    bi.cbC32822.setEnabled(true);
                    bi.cbC32823.setEnabled(true);
                    bi.cbC32824.setEnabled(true);
                    bi.cbC32825.setEnabled(true);
                    bi.cbC32826.setEnabled(true);
                    bi.cbC32827.setEnabled(true);

                }

            }
        };

        bi.cbC32821.setOnCheckedChangeListener(cbx_2242);
        bi.cbC32822.setOnCheckedChangeListener(cbx_2242);
        bi.cbC32823.setOnCheckedChangeListener(cbx_2242);
        bi.cbC32824.setOnCheckedChangeListener(cbx_2242);
        bi.cbC32825.setOnCheckedChangeListener(cbx_2242);
        bi.cbC32826.setOnCheckedChangeListener(cbx_2242);
        bi.cbC32827.setOnCheckedChangeListener(cbx_2242);
        bi.cbC3282Dk.setOnCheckedChangeListener(cbx_2242);


        CompoundButton.OnCheckedChangeListener cbx_2243 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbC3283DK.isChecked()) {
                    bi.cbC32831.setChecked(false);
                    bi.cbC32831.setEnabled(false);
                    bi.cbC32832.setChecked(false);
                    bi.cbC32832.setEnabled(false);
                    bi.cbC32833.setChecked(false);
                    bi.cbC32833.setEnabled(false);
                    bi.cbC32834.setChecked(false);
                    bi.cbC32834.setEnabled(false);
                    bi.cbC32835.setChecked(false);
                    bi.cbC32835.setEnabled(false);
                    bi.cbC32836.setChecked(false);
                    bi.cbC32836.setEnabled(false);
                    bi.cbC32837.setChecked(false);
                    bi.cbC32837.setEnabled(false);
                } else {
                    bi.cbC32831.setEnabled(true);
                    bi.cbC32832.setEnabled(true);
                    bi.cbC32833.setEnabled(true);
                    bi.cbC32834.setEnabled(true);
                    bi.cbC32835.setEnabled(true);
                    bi.cbC32836.setEnabled(true);
                    bi.cbC32837.setEnabled(true);

                }

            }
        };

        bi.cbC32831.setOnCheckedChangeListener(cbx_2243);
        bi.cbC32832.setOnCheckedChangeListener(cbx_2243);
        bi.cbC32833.setOnCheckedChangeListener(cbx_2243);
        bi.cbC32834.setOnCheckedChangeListener(cbx_2243);
        bi.cbC32835.setOnCheckedChangeListener(cbx_2243);
        bi.cbC32836.setOnCheckedChangeListener(cbx_2243);
        bi.cbC32837.setOnCheckedChangeListener(cbx_2243);
        bi.cbC3283DK.setOnCheckedChangeListener(cbx_2243);

        CompoundButton.OnCheckedChangeListener cbx_2240 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbC3280DK.isChecked()) {
                    bi.cbC32801.setChecked(false);
                    bi.cbC32801.setEnabled(false);
                    bi.cbC32802.setChecked(false);
                    bi.cbC32802.setEnabled(false);
                    bi.cbC32803.setChecked(false);
                    bi.cbC32803.setEnabled(false);
                    bi.cbC32804.setChecked(false);
                    bi.cbC32804.setEnabled(false);
                    bi.cbC32805.setChecked(false);
                    bi.cbC32805.setEnabled(false);
                    bi.cbC32806.setChecked(false);
                    bi.cbC32806.setEnabled(false);
                    bi.cbC32807.setChecked(false);
                    bi.cbC32807.setEnabled(false);
                    bi.cbC32808.setChecked(false);
                    bi.cbC32808.setEnabled(false);
                    bi.cbC32809.setChecked(false);
                    bi.cbC32809.setEnabled(false);
                    bi.cbC328010.setChecked(false);
                    bi.cbC328010.setEnabled(false);
                    bi.cbC328011.setChecked(false);
                    bi.cbC328011.setEnabled(false);
                    bi.cbC328012.setChecked(false);
                    bi.cbC328012.setEnabled(false);
                    bi.cbC328013.setChecked(false);
                    bi.cbC328013.setEnabled(false);
                    bi.cbC328014.setChecked(false);
                    bi.cbC328014.setEnabled(false);
                    bi.cbC328015.setChecked(false);
                    bi.cbC328015.setEnabled(false);
                    bi.cbC3280OT.setChecked(false);
                    bi.cbC3280OT.setEnabled(false);
                } else {
                    bi.cbC32801.setEnabled(true);
                    bi.cbC32802.setEnabled(true);
                    bi.cbC32803.setEnabled(true);
                    bi.cbC32804.setEnabled(true);
                    bi.cbC32805.setEnabled(true);
                    bi.cbC32806.setEnabled(true);
                    bi.cbC32807.setEnabled(true);
                    bi.cbC32808.setEnabled(true);
                    bi.cbC32809.setEnabled(true);
                    bi.cbC328010.setEnabled(true);
                    bi.cbC328011.setEnabled(true);
                    bi.cbC328012.setEnabled(true);
                    bi.cbC328013.setEnabled(true);
                    bi.cbC328014.setEnabled(true);
                    bi.cbC328015.setEnabled(true);
                    bi.cbC3280OT.setEnabled(true);

                }

            }
        };

        bi.cbC32801.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32802.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32803.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32804.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32805.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32806.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32807.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32808.setOnCheckedChangeListener(cbx_2240);
        bi.cbC32809.setOnCheckedChangeListener(cbx_2240);
        bi.cbC328010.setOnCheckedChangeListener(cbx_2240);
        bi.cbC328011.setOnCheckedChangeListener(cbx_2240);
        bi.cbC328012.setOnCheckedChangeListener(cbx_2240);
        bi.cbC328013.setOnCheckedChangeListener(cbx_2240);
        bi.cbC328014.setOnCheckedChangeListener(cbx_2240);
        bi.cbC328015.setOnCheckedChangeListener(cbx_2240);
        bi.cbC3280OT.setOnCheckedChangeListener(cbx_2240);
        bi.cbC3280DK.setOnCheckedChangeListener(cbx_2240);

        // Get intent
        skip_flag = getIntent().getIntExtra("valFlag", 0);
        if (skip_flag == 2) {
            ClearAllcontrol.ClearAll(bi.llC3254); //ll_C3254
            bi.llC3254.setVisibility(View.GONE);
        } else if (skip_flag == 9) {
            ClearAllcontrol.ClearAll(bi.llC3254C3287); //ll_C3254_C3287
            bi.llC3254C3287.setVisibility(View.GONE);
        }


        //conditions
        if (!flag_c3252) {
            ClearAllcontrol.ClearAll(bi.llC3257C3288A); //ll_C3257_C3288_A
            bi.llC3257C3288A.setVisibility(View.GONE);
            ClearAllcontrol.ClearAll(bi.llC3257C3288B); //ll_C3257_C3288_B
            bi.llC3257C3288B.setVisibility(View.GONE);

            ClearAllcontrol.ClearAll(bi.llC3288); //ll_C3288
            bi.llC3288.setVisibility(View.GONE);
        }

        if (!flag_c3253) {
            ClearAllcontrol.ClearAll(bi.llC3254); //ll_C3254
            bi.llC3254.setVisibility(View.GONE);

            ClearAllcontrol.ClearAll(bi.llC3257C3286A); //ll_C3257_C3286_A
            bi.llC3257C3286A.setVisibility(View.GONE);
            ClearAllcontrol.ClearAll(bi.llC3257C3286B); //ll_C3257_C3286_B
            bi.llC3257C3286B.setVisibility(View.GONE);
        }

        if (!flag_c3064 || !flag_c3070) {
            ClearAllcontrol.ClearAll(bi.llC3254C3258A); //ll_C3254_C3258_A
            ClearAllcontrol.ClearAll(bi.llC3254C3258B); //ll_C3254_C3258_B

            bi.llC3254C3258A.setVisibility(View.GONE);
            bi.llC3254C3258B.setVisibility(View.GONE);
        }

        if (!flag_c3070) {
            ClearAllcontrol.ClearAll(bi.llC3259C3263A); //ll_C3259_C3263_A
            ClearAllcontrol.ClearAll(bi.llC3254C3263B); //ll_C3254_C3263_B

            bi.llC3259C3263A.setVisibility(View.GONE);
            bi.llC3254C3263B.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {

                startActivity(new Intent(this, flag_c3252 || flag_c3253 ? C3301_C3314.class : C3351_C3364.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        C3251_C3288_A_C C3251C = new C3251_C3288_A_C();

        C3251C.setC3254(bi.rbC32541.isChecked() ? "1" : bi.rbC32542.isChecked() ? "2" : bi.rbC32543.isChecked() ? "3" : bi.rbC32544.isChecked() ? "4" : bi.rbC32545.isChecked() ? "5" : bi.rbC3254OT.isChecked() ? "6" : bi.rbC3254DK.isChecked() ? "9" : "-1");
        C3251C.setC3254x(bi.edC3254OT.getText().toString().trim().length() > 0 ? bi.edC3254OT.getText().toString() : "-1");
        C3251C.setC3255(bi.rbC32551.isChecked() ? "1" : bi.rbC32552.isChecked() ? "2" : bi.rbC3255DK.isChecked() ? "9" : "-1");

        C3251C.setC32561(bi.cbC32561.isChecked() ? "1" : "-1");
        C3251C.setC32562(bi.cbC32562.isChecked() ? "2" : "-1");
        C3251C.setC32563(bi.cbC32563.isChecked() ? "3" : "-1");
        C3251C.setC32564(bi.cbC32564.isChecked() ? "4" : "-1");
        C3251C.setC32564x(bi.edC32564.getText().toString().trim().length() > 0 ? bi.edC32564.getText().toString() : "-1");
        C3251C.setC32565(bi.cbC32565.isChecked() ? "5" : "-1");
        C3251C.setC32566(bi.cbC32566.isChecked() ? "6" : "-1");
        C3251C.setC32567(bi.cbC32567.isChecked() ? "7" : "-1");
        C3251C.setC32568(bi.cbC32568.isChecked() ? "8" : "-1");
        C3251C.setC32569(bi.cbC32569.isChecked() ? "9" : "-1");
        C3251C.setC325610(bi.cbC325610.isChecked() ? "10" : "-1");
        C3251C.setC325611(bi.cbC325611.isChecked() ? "11" : "-1");
        C3251C.setC325612(bi.cbC325612.isChecked() ? "12" : "-1");
        C3251C.setC3256Ot(bi.cbC3256OT.isChecked() ? "13" : "-1");
        C3251C.setC3256OTx(bi.edC3256OT.getText().toString().trim().length() > 0 ? bi.edC3256OT.getText().toString() : "-1");
        C3251C.setC3256Dk(bi.cbC3256DK.isChecked() ? "99" : "-1");

        C3251C.setC32571(bi.edC32571.getText().toString().trim().length() > 0 ? bi.edC32571.getText().toString() : "-1");
        C3251C.setC32572(bi.edC32572.getText().toString().trim().length() > 0 ? bi.edC32572.getText().toString() : "-1");
        C3251C.setC32573(bi.edC32573.getText().toString().trim().length() > 0 ? bi.edC32573.getText().toString() : "-1");

        C3251C.setC32581(bi.rbC325811.isChecked() ? "1" : bi.rbC325812.isChecked() ? "2" : bi.rbC325813.isChecked() ? "3" : bi.rbC32581DK.isChecked() ? "9" : "-1");
        C3251C.setC32582(bi.rbC325821.isChecked() ? "1" : bi.rbC325822.isChecked() ? "2" : bi.rbC325823.isChecked() ? "3" : bi.rbC32582DK.isChecked() ? "9" : "-1");

        C3251C.setC3259(bi.rbC325911.isChecked() ? "1" : bi.rbC325912.isChecked() ? "2" : bi.rbC325913.isChecked() ? "3"
                : bi.rbC325914.isChecked() ? "4" : bi.rbC325915.isChecked() ? "5" : bi.rbC325916.isChecked() ? "6" : bi.rbC325917.isChecked() ? "7"
                : bi.rbC325918.isChecked() ? "8" : bi.rbC325919.isChecked() ? "9" : bi.rbC3259110.isChecked() ? "10" : bi.rbC3259111.isChecked() ? "11" : bi.rbC32591DK.isChecked() ? "99" : "-1");
        C3251C.setC32592(bi.edC32592.getText().toString().trim().length() > 0 ? bi.edC32592.getText().toString() : "-1");

        C3251C.setC3260(bi.rbC32601.isChecked() ? "1" : bi.rbC32602.isChecked() ? "2" : bi.rbC32603.isChecked() ? "3" : bi.rbC3260DK.isChecked() ? "9" : "-1");

        C3251C.setC32611(bi.edC32611.getText().toString().trim().length() > 0 ? bi.edC32611.getText().toString() : "-1");
        C3251C.setC32612(bi.edC32612.getText().toString().trim().length() > 0 ? bi.edC32612.getText().toString() : "-1");

        C3251C.setC3262(bi.rbC32621.isChecked() ? "1" : bi.rbC32622.isChecked() ? "2" : bi.rbC3262DK.isChecked() ? "9" : "-1");
        C3251C.setC3263(bi.rbC32631.isChecked() ? "1" : bi.rbC32632.isChecked() ? "2" : bi.rbC3263DK.isChecked() ? "9" : "-1");

        C3251C.setC3264(bi.rbC326411.isChecked() ? "1" : bi.rbC326412.isChecked() ? "2" : bi.rbC326413.isChecked() ? "3"
                : bi.rbC326414.isChecked() ? "4" : bi.rbC326415.isChecked() ? "5" : bi.rbC326416.isChecked() ? "6" : bi.rbC326417.isChecked() ? "7"
                : bi.rbC326418.isChecked() ? "8" : bi.rbC326419.isChecked() ? "9" : bi.rbC3264110.isChecked() ? "10" : bi.rbC3264111.isChecked() ? "11" : bi.rbC32641DK.isChecked() ? "99" : "-1");
        C3251C.setC32642(bi.edC32642.getText().toString().trim().length() > 0 ? bi.edC32642.getText().toString() : "-1");

        C3251C.setC32651(bi.rbC326511.isChecked() ? "1" : bi.rbC326512.isChecked() ? "2" : bi.rbC32651DK.isChecked() ? "9" : "-1");
        C3251C.setC32652(bi.rbC326521.isChecked() ? "1" : bi.rbC326522.isChecked() ? "2" : bi.rbC32652DK.isChecked() ? "9" : "-1");

        C3251C.setC3266(bi.rbC32661.isChecked() ? "1" : bi.rbC32662.isChecked() ? "2" : "-1");

        C3251C.setC32671(bi.rbC326711.isChecked() ? "1" : bi.rbC326712.isChecked() ? "2" : bi.rbC326713.isChecked() ? "3" : bi.rbC32671DK.isChecked() ? "9" : "-1");
        C3251C.setC32672(bi.rbC326721.isChecked() ? "1" : bi.rbC326722.isChecked() ? "2" : bi.rbC326723.isChecked() ? "3" : bi.rbC32672DK.isChecked() ? "9" : "-1");

        /*Repeat*/

        C3251C.setC32681(bi.rbC326811.isChecked() ? "1" : bi.rbC326812.isChecked() ? "2" : bi.rbC326813.isChecked() ? "3" : bi.rbC32681DK.isChecked() ? "9" : "-1");
        C3251C.setC32682(bi.rbC326821.isChecked() ? "1" : bi.rbC326822.isChecked() ? "2" : bi.rbC326823.isChecked() ? "3" : bi.rbC32682DK.isChecked() ? "9" : "-1");

        C3251C.setC3269(bi.rbC326911.isChecked() ? "1" : bi.rbC326912.isChecked() ? "2" : bi.rbC326913.isChecked() ? "3"
                : bi.rbC326914.isChecked() ? "4" : bi.rbC326915.isChecked() ? "5" : bi.rbC326916.isChecked() ? "6" : bi.rbC326917.isChecked() ? "7"
                : bi.rbC326918.isChecked() ? "8" : bi.rbC326919.isChecked() ? "9" : bi.rbC3269110.isChecked() ? "10" : bi.rbC3269111.isChecked() ? "11" : bi.rbC32691DK.isChecked() ? "99" : "-1");
        C3251C.setC32692(bi.edC32692.getText().toString().trim().length() > 0 ? bi.edC32692.getText().toString() : "-1");

        C3251C.setC3270(bi.rbC32701.isChecked() ? "1" : bi.rbC32702.isChecked() ? "2" : bi.rbC32703.isChecked() ? "3" : bi.rbC3270DK.isChecked() ? "9" : "-1");

        C3251C.setC32711(bi.edC32711.getText().toString().trim().length() > 0 ? bi.edC32711.getText().toString() : "-1");
        C3251C.setC32712(bi.edC32712.getText().toString().trim().length() > 0 ? bi.edC32712.getText().toString() : "-1");

        C3251C.setC3272(bi.rbC32721.isChecked() ? "1" : bi.rbC32722.isChecked() ? "2" : bi.rbC3272DK.isChecked() ? "9" : "-1");
        C3251C.setC3273(bi.rbC32731.isChecked() ? "1" : bi.rbC32732.isChecked() ? "2" : bi.rbC3273DK.isChecked() ? "9" : "-1");

        C3251C.setC3274(bi.rbC327411.isChecked() ? "1" : bi.rbC327412.isChecked() ? "2" : bi.rbC327413.isChecked() ? "3"
                : bi.rbC327414.isChecked() ? "4" : bi.rbC327415.isChecked() ? "5" : bi.rbC327416.isChecked() ? "6" : bi.rbC327417.isChecked() ? "7"
                : bi.rbC327418.isChecked() ? "8" : bi.rbC327419.isChecked() ? "9" : bi.rbC3274110.isChecked() ? "10" : bi.rbC3274111.isChecked() ? "11" : bi.rbC32741DK.isChecked() ? "99" : "-1");
        C3251C.setC32742(bi.edC32742.getText().toString().trim().length() > 0 ? bi.edC32742.getText().toString() : "-1");

        C3251C.setC32751(bi.rbC327511.isChecked() ? "1" : bi.rbC327512.isChecked() ? "2" : bi.rbC32751DK.isChecked() ? "9" : "-1");
        C3251C.setC32752(bi.rbC327521.isChecked() ? "1" : bi.rbC327522.isChecked() ? "2" : bi.rbC32752DK.isChecked() ? "9" : "-1");

        C3251C.setC3276(bi.rbC32761.isChecked() ? "1" : bi.rbC32762.isChecked() ? "2" : "-1");

        C3251C.setC32771(bi.rbC327711.isChecked() ? "1" : bi.rbC327712.isChecked() ? "2" : bi.rbC327713.isChecked() ? "3" : bi.rbC32771DK.isChecked() ? "9" : "-1");
        C3251C.setC32772(bi.rbC327721.isChecked() ? "1" : bi.rbC327722.isChecked() ? "2" : bi.rbC327723.isChecked() ? "3" : bi.rbC32772DK.isChecked() ? "9" : "-1");

        C3251C.setC3278(bi.rbC32781.isChecked() ? "1" : bi.rbC32782.isChecked() ? "2" : bi.rbC3278DK.isChecked() ? "9" : "-1");
        C3251C.setC3279(bi.rbC32791.isChecked() ? "1" : bi.rbC32792.isChecked() ? "2" : bi.rbC3279DK.isChecked() ? "9" : "-1");

        C3251C.setC32801(bi.cbC32801.isChecked() ? "1" : "-1");
        C3251C.setC32802(bi.cbC32802.isChecked() ? "2" : "-1");
        C3251C.setC32803(bi.cbC32803.isChecked() ? "3" : "-1");
        C3251C.setC32804(bi.cbC32804.isChecked() ? "4" : "-1");
        C3251C.setC32805(bi.cbC32805.isChecked() ? "5" : "-1");
        C3251C.setC32805x(bi.edC32805.getText().toString().trim().length() > 0 ? bi.edC32805.getText().toString() : "-1");
        C3251C.setC32806(bi.cbC32806.isChecked() ? "6" : "-1");
        C3251C.setC32807(bi.cbC32807.isChecked() ? "7" : "-1");
        C3251C.setC32808(bi.cbC32808.isChecked() ? "8" : "-1");
        C3251C.setC32809(bi.cbC32809.isChecked() ? "9" : "-1");
        C3251C.setC328010(bi.cbC328010.isChecked() ? "10" : "-1");
        C3251C.setC328011(bi.cbC328011.isChecked() ? "11" : "-1");
        C3251C.setC328012(bi.cbC328012.isChecked() ? "12" : "-1");
        C3251C.setC328013(bi.cbC328013.isChecked() ? "13" : "-1");
        C3251C.setC328014(bi.cbC328014.isChecked() ? "14" : "-1");
        C3251C.setC328015(bi.cbC328015.isChecked() ? "15" : "-1");
        C3251C.setC3280Ot(bi.cbC3280OT.isChecked() ? "16" : "-1");
        C3251C.setC3280OTx(bi.edC3280OT.getText().toString().trim().length() > 0 ? bi.edC3280OT.getText().toString() : "-1");
        C3251C.setC3280Dk(bi.cbC3280DK.isChecked() ? "99" : "-1");

        C3251C.setC3281(bi.rbC32811.isChecked() ? "1" : bi.rbC32812.isChecked() ? "2" : bi.rbC3281DK.isChecked() ? "9" : "-1");


        C3251C.setC32821(bi.cbC32821.isChecked() ? "1" : "-1");
        C3251C.setC32822(bi.cbC32822.isChecked() ? "2" : "-1");
        C3251C.setC32823(bi.cbC32823.isChecked() ? "3" : "-1");
        C3251C.setC32824(bi.cbC32824.isChecked() ? "4" : "-1");
        C3251C.setC32825(bi.cbC32825.isChecked() ? "5" : "-1");
        C3251C.setC32826(bi.cbC32826.isChecked() ? "6" : "-1");
        C3251C.setC32827(bi.cbC32827.isChecked() ? "7" : "-1");
        C3251C.setC3282Dk(bi.cbC3282Dk.isChecked() ? "99" : "-1");
        C3251C.setC32831(bi.cbC32831.isChecked() ? "1" : "-1");
        C3251C.setC32832(bi.cbC32832.isChecked() ? "2" : "-1");
        C3251C.setC32833(bi.cbC32833.isChecked() ? "3" : "-1");
        C3251C.setC32834(bi.cbC32834.isChecked() ? "4" : "-1");
        C3251C.setC32835(bi.cbC32835.isChecked() ? "5" : "-1");
        C3251C.setC32836(bi.cbC32836.isChecked() ? "6" : "-1");
        C3251C.setC32837(bi.cbC32837.isChecked() ? "7" : "-1");
        C3251C.setC3283Dk(bi.cbC3283DK.isChecked() ? "99" : "-1");

        C3251C.setC3284(bi.rbC32841.isChecked() ? "1" : bi.rbC32842.isChecked() ? "2" : bi.rbC3284DK.isChecked() ? "9" : bi.rbC3284RA.isChecked() ? "8" : "-1");
        C3251C.setC3285(bi.rbC32851.isChecked() ? "1" : bi.rbC32852.isChecked() ? "2" : bi.rbC3285DK.isChecked() ? "9" : bi.rbC3285RA.isChecked() ? "8" : "-1");
        C3251C.setC3286(bi.rbC32861.isChecked() ? "1" : bi.rbC32862.isChecked() ? "2" : bi.rbC3286DK.isChecked() ? "9" : bi.rbC3286RA.isChecked() ? "8" : "-1");

        C3251C.setC3287(bi.rbC32871.isChecked() ? "1" : bi.rbC32872.isChecked() ? "2" : bi.rbC3287DK.isChecked() ? "9" : bi.rbC3287RA.isChecked() ? "8" : "-1");

        C3251C.setC3288(bi.edC3288.getText().toString().trim().length() > 0 ? bi.edC3288.getText().toString() : "-1");

        DBHelper db = new DBHelper(this);
        Long row = db.update_C3251C(C3251C, bi.edStudyId.getText().toString());

        return row > 0;
    }

    public Boolean validateField() {

        if (skip_flag != 9) {

            if (skip_flag != 2) {

                if (flag_c3064 && flag_c3070) {
                    if (flag_c3253) {
                        //ll_C3254
                        if (!Gothrough.IamHiden(bi.llC3254)) {
                            return false;
                        }

                        if (!Gothrough.TextHidden(
                                bi.rbC3254OT.isChecked() ? bi.edC3254OT : null)) {
                            return false;
                        }
                    }
                }
            }

            if (flag_c3064 && flag_c3070) {
                //ll_C3255
                if (!Gothrough.IamHiden(bi.llC3255)) {
                    return false;
                }

                if (bi.rbC32551.isChecked()) {
                    //ll_C3256
                    if (!Gothrough.IamHiden(bi.llC3256)) {
                        return false;
                    }
                    if (!Gothrough.TextHidden(
                            bi.cbC32564.isChecked() ? bi.edC32564 : bi.cbC3256OT.isChecked() ? bi.edC3256OT : null)) {
                        return false;
                    }
                }
            }

            if (flag_c3252) {

                if (flag_c3253) {

                    if (flag_c3064 && flag_c3070) {
                        //ll_C3257
                        if (!Gothrough.IamHiden(bi.llC3257)) {
                            return false;
                        }

                        //ll_C3258_1
                        if (!Gothrough.IamHiden(bi.llC32581)) {
                            return false;
                        }
                        //ll_C3258_2
                        if (!Gothrough.IamHiden(bi.llC32582)) {
                            return false;
                        }
                    }

                    if (flag_c3070) {
                        //ll_C3259
                        if (!Gothrough.IamHiden(bi.llC3259)) {
                            return false;
                        }
                        if (!Gothrough.TextHidden(
                                !bi.rbC32591DK.isChecked() ? bi.edC32592 : null)) {
                            return false;
                        }

                        //ll_C3260
                        if (!Gothrough.IamHiden(bi.llC3260)) {
                            return false;
                        }
                    }

                    if (bi.rbC32601.isChecked()) {

                        if (flag_c3070) {
                            //ll_C3261_1
                            if (!Gothrough.IamHiden(bi.llC32611)) {
                                return false;
                            }
                            //ll_C3261_2
                            if (!Gothrough.IamHiden(bi.llC32612)) {
                                return false;
                            }

                            if (bi.rbC325911.isChecked() || bi.rbC325917.isChecked()) {
                                //ll_C3262
                                if (!Gothrough.IamHiden(bi.llC3262)) {
                                    return false;
                                }
                            }
                        }

                        //ll_C3263
                        if (!Gothrough.IamHiden(bi.llC3263)) {
                            return false;
                        }

                        if (bi.rbC32631.isChecked()) {
                            //ll_C3264
                            if (!Gothrough.IamHiden(bi.llC3264)) {
                                return false;
                            }
                            if (!Gothrough.TextHidden(
                                    !bi.rbC32641DK.isChecked() ? bi.edC32642 : null)) {
                                return false;
                            }
                        } else {
                            //ll_C3265_1
                            if (!Gothrough.IamHiden(bi.llC32651)) {
                                return false;
                            }
                            //ll_C3265_2
                            if (!Gothrough.IamHiden(bi.llC32652)) {
                                return false;
                            }
                        }

                        //ll_C3266
                        if (!Gothrough.IamHiden(bi.llC3266)) {
                            return false;
                        }

                        if (!bi.rbC32662.isChecked()) {
                            //ll_C3267_1
                            if (!Gothrough.IamHiden(bi.llC32671)) {
                                return false;
                            }
                            //ll_C3267_2
                            if (!Gothrough.IamHiden(bi.llC32672)) {
                                return false;
                            }

                            //ll_C3268_1
                            if (!Gothrough.IamHiden(bi.llC32681)) {
                                return false;
                            }
                            //ll_C3268_2
                            if (!Gothrough.IamHiden(bi.llC32682)) {
                                return false;
                            }
                            //ll_C3269
                            if (!Gothrough.IamHiden(bi.llC3269)) {
                                return false;
                            }
                            if (!Gothrough.TextHidden(
                                    !bi.rbC32691DK.isChecked() ? bi.edC32692 : null)) {
                                return false;
                            }

                            //ll_C3270
                            if (!Gothrough.IamHiden(bi.llC3270)) {
                                return false;
                            }

                            if (bi.rbC32701.isChecked() || bi.rbC32703.isChecked()) {
                                //ll_C3271_1
                                if (!Gothrough.IamHiden(bi.llC32711)) {
                                    return false;
                                }
                                //ll_C3271_2
                                if (!Gothrough.IamHiden(bi.llC32712)) {
                                    return false;
                                }

                                if (bi.rbC326911.isChecked() || bi.rbC326917.isChecked()) {
                                    //ll_C3272
                                    if (!Gothrough.IamHiden(bi.llC3272)) {
                                        return false;
                                    }
                                }
                                //ll_C3273
                                if (!Gothrough.IamHiden(bi.llC3273)) {
                                    return false;
                                }

                                if (bi.rbC32731.isChecked()) {
                                    //ll_C3274
                                    if (!Gothrough.IamHiden(bi.llC3274)) {
                                        return false;
                                    }
                                    if (!Gothrough.TextHidden(
                                            !bi.rbC32741DK.isChecked() ? bi.edC32742 : null)) {
                                        return false;
                                    }
                                } else {
                                    //ll_C3275_1
                                    if (!Gothrough.IamHiden(bi.llC32751)) {
                                        return false;
                                    }
                                    //ll_C3275_2
                                    if (!Gothrough.IamHiden(bi.llC32752)) {
                                        return false;
                                    }
                                }

                                //ll_C3276
                                if (!Gothrough.IamHiden(bi.llC3276)) {
                                    return false;
                                }

                                if (!bi.rbC32762.isChecked()) {
                                    //ll_C3277_1
                                    if (!Gothrough.IamHiden(bi.llC32771)) {
                                        return false;
                                    }
                                    //ll_C3277_2
                                    if (!Gothrough.IamHiden(bi.llC32772)) {
                                        return false;
                                    }
                                }
                            }
                        }

                    }

                    if (!bi.rbC32602.isChecked()) {

                        if (bi.rbC32631.isChecked() || bi.rbC32731.isChecked()) {
                            //ll_C3278
                            if (!Gothrough.IamHiden(bi.llC3278)) {
                                return false;
                            }
                            //ll_C3279
                            if (!Gothrough.IamHiden(bi.llC3279)) {
                                return false;
                            }
                            if (bi.rbC32791.isChecked()) {
                                //ll_C3280
                                if (!Gothrough.IamHiden(bi.llC3280)) {
                                    return false;
                                }
                            }
                            if (!Gothrough.TextHidden(
                                    bi.cbC32805.isChecked() ? bi.edC32805 : null)) {
                                return false;
                            }
                            if (!Gothrough.TextHidden(
                                    bi.cbC3280OT.isChecked() ? bi.edC3280OT : null)) {
                                return false;
                            }

                        }

                        if (C3281Flag) {
                            //ll_C3281
                            if (!Gothrough.IamHiden(bi.llC3281)) {
                                return false;
                            }

                            if (bi.rbC32811.isChecked()) {
                                //ll_C3282
                                if (!Gothrough.IamHiden(bi.llC3282)) {
                                    return false;
                                }
                            }

                            //ll_C3283
                            if (!Gothrough.IamHiden(bi.llC3283)) {
                                return false;
                            }
                            //ll_C3284
                            if (!Gothrough.IamHiden(bi.llC3284)) {
                                return false;
                            }
                            //ll_C3285
                            if (!Gothrough.IamHiden(bi.llC3285)) {
                                return false;
                            }
                            //ll_C3286
                            if (!Gothrough.IamHiden(bi.llC3286)) {
                                return false;
                            }

                        }
                    }

                }

                //ll_C3287
                if (!Gothrough.IamHiden(bi.llC3287)) {
                    return false;
                }

            }
        }

        if (flag_c3252) {
            //ll_C3288
            return Gothrough.IamHiden(bi.llC3288);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), currentSection = 9);
    }
}
