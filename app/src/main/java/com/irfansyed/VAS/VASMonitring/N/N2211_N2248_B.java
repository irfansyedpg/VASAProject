package com.irfansyed.VAS.VASMonitring.N;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.databinding.N2211N2248BBinding;

import data.DBHelper;
import utils.Gothrough;

import static com.irfansyed.VAS.VASMonitring.N.N2211_N2248_A.n2211A_ID;

public class N2211_N2248_B extends AppCompatActivity {

    static int count = 1;
    N2211N2248BBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2211__n2248_b);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_n_sec_10));

        SetContentUI();

    }

    private void SetContentUI() {

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);

        if (count == 1) {
            bi.llN22133E2A.setVisibility(View.VISIBLE); //ll_N2213_3E_2A
//            bi.btnContinue.setEnabled(false);
        } else {
            bi.llN22133E2A.setVisibility(View.GONE); //ll_N2213_3E_2A
//            bi.btnContinue.setEnabled(true);
        }

        if (count == 9) {
            bi.btnAddMore.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {

                count = 1;

                startActivity(new Intent(this, N2211_N2248_C.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean SaveData() {

        Global.N.N2211_N2248_B n2211B = new Global.N.N2211_N2248_B();

        n2211B.setN2213(bi.rbN2213A1.isChecked() ? "1" : bi.rbN2213A2.isChecked() ? "2" : bi.rbN2213A3.isChecked() ? "3" : bi.rbN2213A4.isChecked() ? "4"
                : bi.rbN2213A5.isChecked() ? "5" : bi.rbN2213A6.isChecked() ? "6" : bi.rbN2213A7.isChecked() ? "7" : "-1");
        n2211B.setN22132a(bi.cbN22133E2A.isChecked() ? "1" : "-1");
        n2211B.setN22134(bi.edN22134.getText().toString());
        n2211B.setACT_COUNT(String.valueOf(count));
        n2211B.setACT_ID_FK(String.valueOf(n2211A_ID));

        n2211B.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2211_B(n2211B);

        return row != 0;
    }

    public void BtnAddMore() {
        if (validateField()) {

            if (SaveData()) {
                count++;
                finish();
                startActivity(new Intent(this, N2211_N2248_B.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean validateField() {

        //ll_ll_N2213
        if (!Gothrough.IamHiden(bi.llN2213)) {
            return false;
        }

        //ll_ll_N2213_4
        return Gothrough.IamHiden(bi.llN22134);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You Can't go back..", Toast.LENGTH_SHORT).show();
    }
}
