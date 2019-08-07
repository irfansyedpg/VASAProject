package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class A4351 extends AppCompatActivity implements View.OnClickListener {

    //  Region_Declaration
    Button
            btn_next13;

    LinearLayout
            llA4351;

    CardView
            cvstudy_id,
            cvA4351,
            cvA4352,
            cvA4353,
            cvA4354,
            cvA4355,
            cvA4356,
            cvA4357,
            cvA4358,
            cvA4363,
            cvA4364;

    RadioGroup
            A4351,
            A4352,
            A4363;

    RadioButton
            A4351a,
            A4351b,
            A435198,
            A435199,
            A4352a,
            A4352b,
            A4363a,
            A4363b,
            A4363c,
            A436398,
            A436399;


    EditText
            ed_study_id,
            A4353,
            A4354,
            A4355,
            A4356,
            A4357,
            A4358,
            A4364;

    String
            study_id,
            STATUS;

    // End Region_Declaration

    void Initialization() {

        btn_next13 = findViewById(R.id.btn_next13);

        cvA4351 = findViewById(R.id.cvA4351);
        cvA4352 = findViewById(R.id.cvA4352);
        cvA4353 = findViewById(R.id.cvA4353);
        cvA4354 = findViewById(R.id.cvA4354);
        cvA4355 = findViewById(R.id.cvA4355);
        cvA4356 = findViewById(R.id.cvA4356);
        cvA4357 = findViewById(R.id.cvA4357);
        cvA4358 = findViewById(R.id.cvA4358);
        cvA4363 = findViewById(R.id.cvA4363);
        cvA4364 = findViewById(R.id.cvA4364);

        A4351 = findViewById(R.id.A4351);
        A4352 = findViewById(R.id.A4352);
        A4363 = findViewById(R.id.A4363);

        A4351a = findViewById(R.id.A4351a);
        A4351b = findViewById(R.id.A4351b);
        A435198 = findViewById(R.id.A435198);
        A435199 = findViewById(R.id.A435199);
        A4352a = findViewById(R.id.A4352a);
        A4352b = findViewById(R.id.A4352b);
        A4363a = findViewById(R.id.A4363a);
        A4363b = findViewById(R.id.A4363b);
        A4363c = findViewById(R.id.A4363c);
        A436398 = findViewById(R.id.A436398);
        A436399 = findViewById(R.id.A436399);

        A4353 = findViewById(R.id.A4353);
        A4354 = findViewById(R.id.A4354);
        A4355 = findViewById(R.id.A4355);
        A4356 = findViewById(R.id.A4356);
        A4357 = findViewById(R.id.A4357);
        A4358 = findViewById(R.id.A4358);
        A4364 = findViewById(R.id.A4364);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4351);

        this.setTitle(getString(R.string.h_a_sec_12));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);
        btn_next13.setOnClickListener(this);
        Initialization();
        setupSkips();
    }

    @Override
    public void onClick(View view) {
        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(A4351.this, A4401.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }


    private void setupSkips() {

        A4351.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4351a.getId()) {
                    cvA4352.setVisibility(View.VISIBLE);
                    cvA4353.setVisibility(View.VISIBLE);
                    cvA4354.setVisibility(View.VISIBLE);
                    cvA4355.setVisibility(View.VISIBLE);
                    cvA4356.setVisibility(View.VISIBLE);
                    cvA4357.setVisibility(View.VISIBLE);
                    cvA4358.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4352);
                    ClearAllcontrol.ClearAllC(cvA4353);
                    ClearAllcontrol.ClearAllC(cvA4354);
                    ClearAllcontrol.ClearAllC(cvA4355);
                    ClearAllcontrol.ClearAllC(cvA4356);
                    ClearAllcontrol.ClearAllC(cvA4357);
                    ClearAllcontrol.ClearAllC(cvA4358);

                    cvA4352.setVisibility(View.GONE);
                    cvA4353.setVisibility(View.GONE);
                    cvA4354.setVisibility(View.GONE);
                    cvA4355.setVisibility(View.GONE);
                    cvA4356.setVisibility(View.GONE);
                    cvA4357.setVisibility(View.GONE);
                    cvA4358.setVisibility(View.GONE);
                }
            }
        });

        A4352.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4352a.getId()) {
                    cvA4353.setVisibility(View.VISIBLE);
                    cvA4354.setVisibility(View.VISIBLE);
                    cvA4355.setVisibility(View.VISIBLE);
                    cvA4356.setVisibility(View.VISIBLE);
                    cvA4357.setVisibility(View.VISIBLE);
                    cvA4358.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4353);
                    ClearAllcontrol.ClearAllC(cvA4354);
                    ClearAllcontrol.ClearAllC(cvA4355);
                    ClearAllcontrol.ClearAllC(cvA4356);
                    ClearAllcontrol.ClearAllC(cvA4357);
                    ClearAllcontrol.ClearAllC(cvA4358);

                    cvA4353.setVisibility(View.GONE);
                    cvA4354.setVisibility(View.GONE);
                    cvA4355.setVisibility(View.GONE);
                    cvA4356.setVisibility(View.GONE);
                    cvA4357.setVisibility(View.GONE);
                    cvA4358.setVisibility(View.GONE);
                }
            }
        });

        A4363.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4363a.getId()) {
                    cvA4364.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4364);
                    cvA4364.setVisibility(View.GONE);
                }
            }
        });

    }

    void value_assignment() {

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4351
        if (A4351a.isChecked()) {
            A4351 = "1";
        }
        if (A4351b.isChecked()) {
            A4351 = "2";
        }
        if (A435198.isChecked()) {
            A4351 = "9";
        }
        if (A435199.isChecked()) {
            A4351 = "8";
        }

        //A4352
        if (A4352a.isChecked()) {
            A4352 = "1";
        }
        if (A4352b.isChecked()) {
            A4352 = "2";
        }

        //A4353
        if (A4353.getText().toString().trim().length() > 0) {
            A4353 = A4353.getText().toString().trim();
        }

        //A4354
        if (A4354.getText().toString().trim().length() > 0) {
            A4354 = A4354.getText().toString().trim();
        }

        //A4355
        if (A4355.getText().toString().trim().length() > 0) {
            A4355 = A4355.getText().toString().trim();
        }

        //A4356
        if (A4356.getText().toString().trim().length() > 0) {
            A4356 = A4356.getText().toString().trim();
        }

        //A4357
        if (A4357.getText().toString().trim().length() > 0) {
            A4357 = A4357.getText().toString().trim();
        }

        //A4358
        if (A4358.getText().toString().trim().length() > 0) {
            A4358 = A4358.getText().toString().trim();
        }

        //A4363
        if (A4363a.isChecked()) {
            A4363 = "1";
        }
        if (A4363b.isChecked()) {
            A4363 = "2";
        }
        if (A4363c.isChecked()) {
            A4363 = "3";
        }
        if (A436398.isChecked()) {
            A4363 = "9";
        }
        if (A436399.isChecked()) {
            A4363 = "8";
        }

        //A4364
        if (A4364.getText().toString().trim().length() > 0) {
            A4364 = A4364.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into A4351_A4364("

                + Global.A.A4351_A4364.study_id + ","
                + Global.A.A4351_A4364.A4351 + ","
                + Global.A.A4351_A4364.A4352 + ","
                + Global.A.A4351_A4364.A4353 + ","
                + Global.A.A4351_A4364.A4354 + ","
                + Global.A.A4351_A4364.A4355 + ","
                + Global.A.A4351_A4364.A4356 + ","
                + Global.A.A4351_A4364.A4357 + ","
                + Global.A.A4351_A4364.A4358 + ","
                + Global.A.A4351_A4364.A4363 + ","
                + Global.A.A4351_A4364.A4364 + ","
                + Global.A.A4351_A4364.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4351 + "','" +
                A4352 + "','" +
                A4353 + "','" +
                A4354 + "','" +
                A4355 + "','" +
                A4356 + "','" +
                A4357 + "','" +
                A4358 + "','" +
                A4363 + "','" +
                A4364 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "13th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(llA4351) == false) {
            return false;
        }

        return Gothrough.IamHiden(llA4351) != false;
    }
}
