package com.irfansyed.vas.vasmonitring.neo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.irfansyed.vas.vasmonitring.R;
import com.irfansyed.vas.vasmonitring.databinding.N2211N2248ABinding;
import com.irfansyed.vas.vasmonitring.other.globale;

import data.DBHelper;
import utils.Gothrough;

public class N2211_N2248_A extends AppCompatActivity {

    public static int n2211A_ID = 0;
    N2211N2248ABinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_a);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_n_sec_10));

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);
    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                finish();
                startActivity(new Intent(this, bi.rbN22121.isChecked() ? N2211_N2248_B.class : N2211_N2248_C.class)
                        .putExtra("valFlag", bi.rbN22122.isChecked() ? 2 : 9)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2211_N2248_A_C n2211 = new Global.N.N2211_N2248_A_C();

        n2211.setN22111(bi.rbN221111.isChecked() ? "1" : bi.rbN221112.isChecked() ? "2" : bi.rbN221113.isChecked() ? "3" : bi.rbN22111DK.isChecked() ? "9" : "-1");
        n2211.setN22112(bi.rbN221121.isChecked() ? "1" : bi.rbN221122.isChecked() ? "2" : bi.rbN221123.isChecked() ? "3" : bi.rbN22112DK.isChecked() ? "9" : "-1");
        n2211.setN2212(bi.rbN22121.isChecked() ? "1" : bi.rbN22122.isChecked() ? "2" : bi.rbN2212DK.isChecked() ? "9" : "-1");

        n2211.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2211_A_C(n2211);

        n2211A_ID = row.intValue();

        return row != 0;
    }

    public Boolean validateField() {

        //ll_N2211_1
        if (!Gothrough.IamHiden(bi.llN22111)) {
            return false;
        }

        //ll_N2211_2
        if (!Gothrough.IamHiden(bi.llN22112)) {
            return false;
        }

        //ll_N2212
        return Gothrough.IamHiden(bi.llN2212);
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 11);
    }
}
