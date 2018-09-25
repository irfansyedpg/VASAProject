package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.databinding.C3251C3288BBinding;

import data.DBHelper;
import utils.Gothrough;

import static com.irfansyed.VAS.VASMonitring.C.C3251_C3288_A.c3251A_ID;

public class C3251_C3288_B extends AppCompatActivity {

    int currentSection;

    String study_id;

    static int count = 1, counter = 1;
    C3251C3288BBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.c3251_c3288_b);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_c_sec_10));

        study_id = getIntent().getExtras().getString("study_id");

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        SetContentUI();

    }

    public void SetContentUI() {

        bi.btnContinue.setEnabled(false);

        DBHelper db = new DBHelper(this);

        if (count == 1) {
            bi.llC32533E2A.setVisibility(View.VISIBLE); //ll_C3253_3E_2A

            bi.rbC325312.setEnabled(false);
            bi.rbC325313.setEnabled(false);
        } else {
            bi.llC32533E2A.setVisibility(View.GONE); //ll_C3253_3E_2A

            if (count == 9) {
                bi.btnAddMore.setVisibility(View.GONE);
            }

            String c32531 = db.getSpecificData(data.C.C3251_C3288_B.TABLE_NAME, bi.edStudyId.getText().toString(), Global.C.C3251_C3288_B.sub_C3251_C3288_B.C3253_1);
            switch (Integer.valueOf(c32531)) {
                case 1:
                    bi.rbC325313.setEnabled(false);

                    if (count == 4){
                        bi.rbC325311.setEnabled(false);
                    }

                    break;
                case 2:
                    bi.rbC325311.setEnabled(false);

                    if (count == 7){
                        bi.rbC325312.setEnabled(false);
                    }

                    break;
                case 3:
                    count = 8;
                    bi.rbC325311.setEnabled(false);
                    bi.rbC325312.setEnabled(false);
                    break;

            }
        }

        bi.rgC32531.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.rbC325313.getId()) {
                    bi.btnContinue.setEnabled(true);
                }
            }
        });

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {

                count = 1;
                counter = 1;

                startActivity(new Intent(this, C3251_C3288_C.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.C.C3251_C3288_B c3251B = new Global.C.C3251_C3288_B();

        c3251B.setC32531(bi.rbC325311.isChecked() ? "1" : bi.rbC325312.isChecked() ? "2" : bi.rbC325313.isChecked() ? "3" : "0");
        c3251B.setC3253(bi.rbC3253A1.isChecked() ? "1" : bi.rbC3253A2.isChecked() ? "2" : bi.rbC3253A3.isChecked() ? "3" : bi.rbC3253A4.isChecked() ? "4"
                : bi.rbC3253A5.isChecked() ? "5" : bi.rbC3253A6.isChecked() ? "6" : bi.rbC3253A7.isChecked() ? "7" : "0");
        c3251B.setC32532a(bi.cbC32533E2A.isChecked() ? "1" : "0");
        c3251B.setC32534(bi.edC32534.getText().toString());
        c3251B.setACT_COUNT(String.valueOf(counter));
        c3251B.setACT_ID_FK(String.valueOf(c3251A_ID));

        c3251B.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_C3251_B(c3251B);

        return row != 0;
    }

    public void BtnAddMore() {
        if (validateField()) {

            if (SaveData()) {
                count++;
                counter++;
                finish();
                startActivity(new Intent(this, C3251_C3288_B.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_C3253_1
        if (!Gothrough.IamHiden(bi.llC32531)) {
            return false;
        }
        //ll_ll_C3253
        if (!Gothrough.IamHiden(bi.llC3253)) {
            return false;
        }

        //ll_ll_C3253_4
        return Gothrough.IamHiden(bi.llC32534);

    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), currentSection = 8);
    }
}
