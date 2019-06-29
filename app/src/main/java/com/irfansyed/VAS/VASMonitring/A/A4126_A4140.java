package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import org.json.JSONException;
import org.json.JSONObject;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4126_A4140 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next7;

    LinearLayout
            llA4126;

    CardView
            cvstudy_id,
            cvA4126,
            cvA4127u,
            cvA4127_a,
            cvA4127_b,
            cvA4128,
            cvA4129,
            cvA4130u,
            cvA4130_a,
            cvA4130_b,
            cvA4131,
            cvA4132,
            cvA4133,
            cvA4134u,
            cvA4134_a,
            cvA4134_b,
            cvA4135,
            cvA4136,
            cvA4138,
            cvA4139,
            cvA4140;

    RadioGroup
            A4126,
            A4127u,
            A4128,
            A4129,
            A4130u,
            A4131,
            A4132,
            A4133,
            A4134u,
            A4135,
            A4136,
            A4138,
            A4139,
            A4140;

    RadioButton
            rbA4126_1,
            rbA4126_2,
            rbA4126_DK,
            rbA4126_RA,
            rbA4127u_1,
            rbA4127u_2,
            rbA4127u_DK,
            rbA4127u_RA,
            rbA4128_1,
            rbA4128_2,
            rbA4128_DK,
            rbA4128_RA,
            rbA4129_1,
            rbA4129_2,
            rbA4129_DK,
            rbA4129_RA,
            rbA4130u_1,
            rbA4130u_2,
            rbA4130u_DK,
            rbA4130u_RA,
            rbA4131_1,
            rbA4131_2,
            rbA4131_DK,
            rbA4131_RA,
            rbA4132_1,
            rbA4132_2,
            rbA4132_DK,
            rbA4132_RA,
            rbA4133_1,
            rbA4133_2,
            rbA4133_DK,
            rbA4133_RA,
            rbA4134u_1,
            rbA4134u_2,
            rbA4134u_DK,
            rbA4134u_RA,
            rbA4135_1,
            rbA4135_2,
            rbA4135_DK,
            rbA4135_RA,
            rbA4136_1,
            rbA4136_2,
            rbA4136_DK,
            rbA4136_RA,
            rbA4138_1,
            rbA4138_2,
            rbA4138_DK,
            rbA4138_RA,
            rbA4139_1,
            rbA4139_2,
            rbA4139_DK,
            rbA4139_RA,
            rbA4140_1,
            rbA4140_2,
            rbA4140_DK,
            rbA4140_RA;

    EditText
            ed_study_id,
            ed_A4127_a,
            ed_A4127_b,
            ed_A4130_a,
            ed_A4130_b,
            ed_A4134_a,
            ed_A4134_b;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next7 = findViewById(R.id.btn_next7);

        //Linear Layout
        llA4126 = findViewById(R.id.llA4126);

        //CardView
        cvA4126 = findViewById(R.id.cvA4126);
        cvA4127u = findViewById(R.id.cvA4127u);
        cvA4127_a = findViewById(R.id.cvA4127_a);
        cvA4127_b = findViewById(R.id.cvA4127_b);
        cvA4128 = findViewById(R.id.cvA4128);
        cvA4129 = findViewById(R.id.cvA4129);
        cvA4130u = findViewById(R.id.cvA4130u);
        cvA4130_a = findViewById(R.id.cvA4130_a);
        cvA4130_b = findViewById(R.id.cvA4130_b);
        cvA4131 = findViewById(R.id.cvA4131);
        cvA4132 = findViewById(R.id.cvA4132);
        cvA4133 = findViewById(R.id.cvA4133);
        cvA4134u = findViewById(R.id.cvA4134u);
        cvA4134_a = findViewById(R.id.cvA4134_a);
        cvA4134_b = findViewById(R.id.cvA4134_b);
        cvA4135 = findViewById(R.id.cvA4135);
        cvA4136 = findViewById(R.id.cvA4136);
        cvA4138 = findViewById(R.id.cvA4138);
        cvA4139 = findViewById(R.id.cvA4139);
        cvA4140 = findViewById(R.id.cvA4140);


        //RadioGroup
        A4126 = findViewById(R.id.A4126);
        A4127u = findViewById(R.id.A4127u);
        A4128 = findViewById(R.id.A4128);
        A4129 = findViewById(R.id.A4129);
        A4130u = findViewById(R.id.A4130u);
        A4131 = findViewById(R.id.A4131);
        A4132 = findViewById(R.id.A4132);
        A4133 = findViewById(R.id.A4133);
        A4134u = findViewById(R.id.A4134u);
        A4135 = findViewById(R.id.A4135);
        A4136 = findViewById(R.id.A4136);
        A4138 = findViewById(R.id.A4138);
        A4139 = findViewById(R.id.A4139);
        A4140 = findViewById(R.id.A4140);


        //Radio Button
        rbA4126_1 = findViewById(R.id.rbA4126_1);
        rbA4126_2 = findViewById(R.id.rbA4126_2);
        rbA4126_DK = findViewById(R.id.rbA4126_DK);
        rbA4126_RA = findViewById(R.id.rbA4126_RA);
        rbA4127u_1 = findViewById(R.id.rbA4127u_1);
        rbA4127u_2 = findViewById(R.id.rbA4127u_2);
        rbA4127u_DK = findViewById(R.id.rbA4127u_DK);
        rbA4127u_RA = findViewById(R.id.rbA4127u_RA);
        rbA4128_1 = findViewById(R.id.rbA4128_1);
        rbA4128_2 = findViewById(R.id.rbA4128_2);
        rbA4128_DK = findViewById(R.id.rbA4128_DK);
        rbA4128_RA = findViewById(R.id.rbA4128_RA);
        rbA4129_1 = findViewById(R.id.rbA4129_1);
        rbA4129_2 = findViewById(R.id.rbA4129_2);
        rbA4129_DK = findViewById(R.id.rbA4129_DK);
        rbA4129_RA = findViewById(R.id.rbA4129_RA);
        rbA4130u_1 = findViewById(R.id.rbA4130u_1);
        rbA4130u_2 = findViewById(R.id.rbA4130u_2);
        rbA4130u_DK = findViewById(R.id.rbA4130u_DK);
        rbA4130u_RA = findViewById(R.id.rbA4130u_RA);
        rbA4131_1 = findViewById(R.id.rbA4131_1);
        rbA4131_2 = findViewById(R.id.rbA4131_2);
        rbA4131_DK = findViewById(R.id.rbA4131_DK);
        rbA4131_RA = findViewById(R.id.rbA4131_RA);
        rbA4132_1 = findViewById(R.id.rbA4132_1);
        rbA4132_2 = findViewById(R.id.rbA4132_2);
        rbA4132_DK = findViewById(R.id.rbA4132_DK);
        rbA4132_RA = findViewById(R.id.rbA4132_RA);
        rbA4133_1 = findViewById(R.id.rbA4133_1);
        rbA4133_2 = findViewById(R.id.rbA4133_2);
        rbA4133_DK = findViewById(R.id.rbA4133_DK);
        rbA4133_RA = findViewById(R.id.rbA4133_RA);
        rbA4134u_1 = findViewById(R.id.rbA4134u_1);
        rbA4134u_2 = findViewById(R.id.rbA4134u_2);
        rbA4134u_DK = findViewById(R.id.rbA4134u_DK);
        rbA4134u_RA = findViewById(R.id.rbA4134u_RA);
        rbA4135_1 = findViewById(R.id.rbA4135_1);
        rbA4135_2 = findViewById(R.id.rbA4135_2);
        rbA4135_DK = findViewById(R.id.rbA4135_DK);
        rbA4135_RA = findViewById(R.id.rbA4135_RA);
        rbA4136_1 = findViewById(R.id.rbA4136_1);
        rbA4136_2 = findViewById(R.id.rbA4136_2);
        rbA4136_DK = findViewById(R.id.rbA4136_DK);
        rbA4136_RA = findViewById(R.id.rbA4136_RA);
        rbA4138_1 = findViewById(R.id.rbA4138_1);
        rbA4138_2 = findViewById(R.id.rbA4138_2);
        rbA4138_DK = findViewById(R.id.rbA4138_DK);
        rbA4138_RA = findViewById(R.id.rbA4138_RA);
        rbA4139_1 = findViewById(R.id.rbA4139_1);
        rbA4139_2 = findViewById(R.id.rbA4139_2);
        rbA4139_DK = findViewById(R.id.rbA4139_DK);
        rbA4139_RA = findViewById(R.id.rbA4139_RA);
        rbA4140_1 = findViewById(R.id.rbA4140_1);
        rbA4140_2 = findViewById(R.id.rbA4140_2);
        rbA4140_DK = findViewById(R.id.rbA4140_DK);
        rbA4140_RA = findViewById(R.id.rbA4140_RA);

        // Edit Text
        ed_A4127_a = findViewById(R.id.ed_A4127_a);
        ed_A4127_b = findViewById(R.id.ed_A4127_b);
        ed_A4130_a = findViewById(R.id.ed_A4130_a);
        ed_A4130_b = findViewById(R.id.ed_A4130_b);
        ed_A4134_a = findViewById(R.id.ed_A4134_a);
        ed_A4134_b = findViewById(R.id.ed_A4134_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4126__a4140);

        this.setTitle(getString(R.string.h_a_sec_9));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_calls();
        setupSkips();
    }

    @Override
    public void onClick(View view) {
        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        try {
            Assignment_Insertion();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Intent c = new Intent(A4126_A4140.this, A4144_A4156.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }


    private void setupSkips() {

        A4126.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4126_1.getId()) {
                    cvA4127u.setVisibility(View.VISIBLE);
                    cvA4127_a.setVisibility(View.VISIBLE);
                    cvA4127_b.setVisibility(View.VISIBLE);
                    cvA4128.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4127u);
                    ClearAllcontrol.ClearAllC(cvA4127_a);
                    ClearAllcontrol.ClearAllC(cvA4127_b);
                    ClearAllcontrol.ClearAllC(cvA4128);

                    cvA4127u.setVisibility(View.GONE);
                    cvA4127_a.setVisibility(View.GONE);
                    cvA4127_b.setVisibility(View.GONE);
                    cvA4128.setVisibility(View.GONE);
                }
            }
        });


        A4127u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4127_a);
                ClearAllcontrol.ClearAllC(cvA4127_b);

                cvA4127_a.setVisibility(View.GONE);
                cvA4127_b.setVisibility(View.GONE);

                if (checkedId == rbA4127u_1.getId()) {
                    cvA4127_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4127u_2.getId()) {
                    cvA4127_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4129.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4129_1.getId()) {
                    cvA4130u.setVisibility(View.VISIBLE);
                    cvA4130_a.setVisibility(View.VISIBLE);
                    cvA4130_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4130u);
                    ClearAllcontrol.ClearAllC(cvA4130_a);
                    ClearAllcontrol.ClearAllC(cvA4130_b);

                    cvA4130u.setVisibility(View.GONE);
                    cvA4130_a.setVisibility(View.GONE);
                    cvA4130_b.setVisibility(View.GONE);
                }
            }
        });


        A4130u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4130_a);
                ClearAllcontrol.ClearAllC(cvA4130_b);

                cvA4130_a.setVisibility(View.GONE);
                cvA4130_b.setVisibility(View.GONE);

                if (checkedId == rbA4130u_1.getId()) {
                    cvA4130_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4130u_2.getId()) {
                    cvA4130_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4133.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4133_1.getId()) {
                    cvA4134u.setVisibility(View.VISIBLE);
                    cvA4134_a.setVisibility(View.VISIBLE);
                    cvA4134_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4134u);
                    ClearAllcontrol.ClearAllC(cvA4134_a);
                    ClearAllcontrol.ClearAllC(cvA4134_b);

                    cvA4134u.setVisibility(View.GONE);
                    cvA4134_a.setVisibility(View.GONE);
                    cvA4134_b.setVisibility(View.GONE);
                }
            }
        });


        A4134u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4134_a);
                ClearAllcontrol.ClearAllC(cvA4134_b);

                cvA4134_a.setVisibility(View.GONE);
                cvA4134_b.setVisibility(View.GONE);

                if (checkedId == rbA4134u_1.getId()) {
                    cvA4134_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4134u_2.getId()) {
                    cvA4134_b.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private void events_calls() {

        btn_next7.setOnClickListener(this);

        ed_A4127_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4127_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4130_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4130_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4134_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4134_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4126
        json.put("A4126", rbA4126_1.isChecked() ? "1"
                : rbA4126_2.isChecked() ? "2"
                : rbA4126_DK.isChecked() ? "98"
                : rbA4126_RA.isChecked() ? "99"
                : "-1");

        //A4127u
        json.put("A4127u", rbA4127u_1.isChecked() ? "1"
                : rbA4127u_2.isChecked() ? "2"
                : rbA4127u_DK.isChecked() ? "98"
                : rbA4127u_RA.isChecked() ? "99"
                : "-1");

        //A4127_a
        json.put("A4127_a", ed_A4127_a.getText().toString().length() > 0 ? ed_A4127_a.getText().toString().trim() : "-1");

        //A4127_b
        json.put("A4127_b", ed_A4127_b.getText().toString().length() > 0 ? ed_A4127_b.getText().toString().trim() : "-1");

        //A4128
        json.put("A4128", rbA4128_1.isChecked() ? "1"
                : rbA4128_2.isChecked() ? "2"
                : rbA4128_DK.isChecked() ? "98"
                : rbA4128_RA.isChecked() ? "99"
                : "-1");

        //A4129
        json.put("A4129", rbA4129_1.isChecked() ? "1"
                : rbA4129_2.isChecked() ? "2"
                : rbA4129_DK.isChecked() ? "98"
                : rbA4129_RA.isChecked() ? "99"
                : "-1");

        //A4130u
        json.put("A4130u", rbA4130u_1.isChecked() ? "1"
                : rbA4130u_2.isChecked() ? "2"
                : rbA4130u_DK.isChecked() ? "98"
                : rbA4130u_RA.isChecked() ? "99"
                : "-1");

        //A4130_a
        json.put("A4130_a", ed_A4130_a.getText().toString().length() > 0 ? ed_A4130_a.getText().toString().trim() : "-1");

        //A4130_b
        json.put("A4130_b", ed_A4130_b.getText().toString().length() > 0 ? ed_A4130_b.getText().toString().trim() : "-1");


        //A4131
        json.put("A4131", rbA4131_1.isChecked() ? "1"
                : rbA4131_2.isChecked() ? "2"
                : rbA4131_DK.isChecked() ? "98"
                : rbA4131_RA.isChecked() ? "99"
                : "-1");

        //A4132
        json.put("A4132", rbA4132_1.isChecked() ? "1"
                : rbA4132_2.isChecked() ? "2"
                : rbA4132_DK.isChecked() ? "98"
                : rbA4132_RA.isChecked() ? "99"
                : "-1");

        //A4133
        json.put("A4133", rbA4133_1.isChecked() ? "1"
                : rbA4133_2.isChecked() ? "2"
                : rbA4133_DK.isChecked() ? "98"
                : rbA4133_RA.isChecked() ? "99"
                : "-1");

        //A4134u
        json.put("A4134u", rbA4134u_1.isChecked() ? "1"
                : rbA4134u_2.isChecked() ? "2"
                : rbA4134u_DK.isChecked() ? "98"
                : rbA4134u_RA.isChecked() ? "99"
                : "-1");

        //A4134_a
        json.put("A4134_a", ed_A4134_a.getText().toString().length() > 0 ? ed_A4134_a.getText().toString().trim() : "-1");

        //A4134_b
        json.put("A4134_b", ed_A4134_b.getText().toString().length() > 0 ? ed_A4134_b.getText().toString().trim() : "-1");
        
        
        //A4135
        json.put("A4135", rbA4135_1.isChecked() ? "1"
                : rbA4135_2.isChecked() ? "2"
                : rbA4135_DK.isChecked() ? "98"
                : rbA4135_RA.isChecked() ? "99"
                : "-1");
        
        //A4136
        json.put("A4136", rbA4136_1.isChecked() ? "1"
                : rbA4136_2.isChecked() ? "2"
                : rbA4136_DK.isChecked() ? "98"
                : rbA4136_RA.isChecked() ? "99"
                : "-1");

        //A4138
        json.put("A4138", rbA4138_1.isChecked() ? "1"
                : rbA4138_2.isChecked() ? "2"
                : rbA4138_DK.isChecked() ? "98"
                : rbA4138_RA.isChecked() ? "99"
                : "-1");

        //A4139
        json.put("A4139", rbA4139_1.isChecked() ? "1"
                : rbA4139_2.isChecked() ? "2"
                : rbA4139_DK.isChecked() ? "98"
                : rbA4139_RA.isChecked() ? "99"
                : "-1");

        //A4140
        json.put("A4140", rbA4140_1.isChecked() ? "1"
                : rbA4140_2.isChecked() ? "2"
                : rbA4140_DK.isChecked() ? "98"
                : rbA4140_RA.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4126) != false;
    }
}
