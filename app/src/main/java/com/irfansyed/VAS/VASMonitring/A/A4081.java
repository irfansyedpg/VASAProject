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

public class A4081 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next4;

    LinearLayout
            llA4081;

    CardView
            cvstudy_id,
            cvA4081,
            cvA4082u,
            cvA4082_a,
            cvA4082_b,
            cvA4082_c,
            cvA4083,
            cvA4084,
            cvA4085u,
            cvA4085_a,
            cvA4085_b,
            cvA4086,
            cvA4087u,
            cvA4087_a,
            cvA4087_b,
            cvA4088,
            cvA4089,
            cvA4090,
            cvA4091,
            cvA4092,
            cvA4093,
            cvA4094u,
            cvA4094_a,
            cvA4094_b,
            cvA4094_c;

    RadioGroup
            A4081,
            A4082u,
            A4083,
            A4084,
            A4085u,
            A4086,
            A4087u,
            A4088,
            A4089,
            A4090,
            A4091,
            A4092,
            A4094u;

    RadioButton
            rbA4081_1,
            rbA4081_2,
            rbA4081_DK,
            rbA4081_RA,
            rbA4082u_1,
            rbA4082u_2,
            rbA4082u_3,
            rbA4082u_DK,
            rbA4082u_RA,
            rbA4083_1,
            rbA4083_2,
            rbA4083_DK,
            rbA4083_RA,
            rbA4084_1,
            rbA4084_2,
            rbA4084_DK,
            rbA4084_RA,
            rbA4085u_1,
            rbA4085u_2,
            rbA4085u_DK,
            rbA4085u_RA,
            rbA4086_1,
            rbA4086_2,
            rbA4086_DK,
            rbA4086_RA,
            rbA4087u_1,
            rbA4087u_2,
            rbA4087u_DK,
            rbA4087u_RA,
            rbA4088_1,
            rbA4088_2,
            rbA4088_DK,
            rbA4088_RA,
            rbA4089_1,
            rbA4089_2,
            rbA4089_DK,
            rbA4089_RA,
            rbA4090_1,
            rbA4090_2,
            rbA4090_DK,
            rbA4090_RA,
            rbA4091_1,
            rbA4091_2,
            rbA4091_DK,
            rbA4091_RA,
            rbA4092_1,
            rbA4092_2,
            rbA4092_DK,
            rbA4092_RA,
            rbA4094u_1,
            rbA4094u_2,
            rbA4094u_3,
            rbA4094u_DK,
            rbA4094u_RA;

    EditText
            ed_study_id,
            ed_A4082_a,
            ed_A4082_b,
            ed_A4082_c,
            ed_A4085_a,
            ed_A4085_b,
            ed_A4087_a,
            ed_A4087_b,
            ed_A4093,
            ed_A4094_a,
            ed_A4094_b,
            ed_A4094_c;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next4 = findViewById(R.id.btn_next4);

        //Linear Layout
        llA4081 = findViewById(R.id.llA4081);

        //CardView
        cvA4081 = findViewById(R.id.cvA4081);
        cvA4082u = findViewById(R.id.cvA4082u);
        cvA4082_a = findViewById(R.id.cvA4082_a);
        cvA4082_b = findViewById(R.id.cvA4082_b);
        cvA4082_c = findViewById(R.id.cvA4082_c);
        cvA4083 = findViewById(R.id.cvA4083);
        cvA4084 = findViewById(R.id.cvA4084);
        cvA4085u = findViewById(R.id.cvA4085u);
        cvA4085_a = findViewById(R.id.cvA4085_a);
        cvA4085_b = findViewById(R.id.cvA4085_b);
        cvA4086 = findViewById(R.id.cvA4086);
        cvA4087u = findViewById(R.id.cvA4087u);
        cvA4087_a = findViewById(R.id.cvA4087_a);
        cvA4087_b = findViewById(R.id.cvA4087_b);
        cvA4088 = findViewById(R.id.cvA4088);
        cvA4089 = findViewById(R.id.cvA4089);
        cvA4090 = findViewById(R.id.cvA4090);
        cvA4091 = findViewById(R.id.cvA4091);
        cvA4092 = findViewById(R.id.cvA4092);
        cvA4093 = findViewById(R.id.cvA4093);
        cvA4094u = findViewById(R.id.cvA4094u);
        cvA4094_a = findViewById(R.id.cvA4094_a);
        cvA4094_b = findViewById(R.id.cvA4094_b);
        cvA4094_c = findViewById(R.id.cvA4094_c);

        //RadioGroup
        A4081 = findViewById(R.id.A4081);
        A4082u = findViewById(R.id.A4082u);
        A4083 = findViewById(R.id.A4083);
        A4084 = findViewById(R.id.A4084);
        A4085u = findViewById(R.id.A4085u);
        A4086 = findViewById(R.id.A4086);
        A4087u = findViewById(R.id.A4087u);
        A4088 = findViewById(R.id.A4088);
        A4089 = findViewById(R.id.A4089);
        A4090 = findViewById(R.id.A4090);
        A4091 = findViewById(R.id.A4091);
        A4092 = findViewById(R.id.A4092);
        A4094u = findViewById(R.id.A4094u);

        //Radio Button
        rbA4081_1 = findViewById(R.id.rbA4081_1);
        rbA4081_2 = findViewById(R.id.rbA4081_2);
        rbA4081_DK = findViewById(R.id.rbA4081_DK);
        rbA4081_RA = findViewById(R.id.rbA4081_RA);
        rbA4082u_1 = findViewById(R.id.rbA4082u_1);
        rbA4082u_2 = findViewById(R.id.rbA4082u_2);
        rbA4082u_3 = findViewById(R.id.rbA4082u_3);
        rbA4082u_DK = findViewById(R.id.rbA4082u_DK);
        rbA4082u_RA = findViewById(R.id.rbA4082u_RA);
        rbA4083_1 = findViewById(R.id.rbA4083_1);
        rbA4083_2 = findViewById(R.id.rbA4083_2);
        rbA4083_DK = findViewById(R.id.rbA4083_DK);
        rbA4083_RA = findViewById(R.id.rbA4083_RA);
        rbA4084_1 = findViewById(R.id.rbA4084_1);
        rbA4084_2 = findViewById(R.id.rbA4084_2);
        rbA4084_DK = findViewById(R.id.rbA4084_DK);
        rbA4084_RA = findViewById(R.id.rbA4084_RA);
        rbA4085u_1 = findViewById(R.id.rbA4085u_1);
        rbA4085u_2 = findViewById(R.id.rbA4085u_2);
        rbA4085u_DK = findViewById(R.id.rbA4085u_DK);
        rbA4085u_RA = findViewById(R.id.rbA4085u_RA);
        rbA4086_1 = findViewById(R.id.rbA4086_1);
        rbA4086_2 = findViewById(R.id.rbA4086_2);
        rbA4086_DK = findViewById(R.id.rbA4086_DK);
        rbA4086_RA = findViewById(R.id.rbA4086_RA);
        rbA4087u_1 = findViewById(R.id.rbA4087u_1);
        rbA4087u_2 = findViewById(R.id.rbA4087u_2);
        rbA4087u_DK = findViewById(R.id.rbA4087u_DK);
        rbA4087u_RA = findViewById(R.id.rbA4087u_RA);
        rbA4088_1 = findViewById(R.id.rbA4088_1);
        rbA4088_2 = findViewById(R.id.rbA4088_2);
        rbA4088_DK = findViewById(R.id.rbA4088_DK);
        rbA4088_RA = findViewById(R.id.rbA4088_RA);
        rbA4089_1 = findViewById(R.id.rbA4089_1);
        rbA4089_2 = findViewById(R.id.rbA4089_2);
        rbA4089_DK = findViewById(R.id.rbA4089_DK);
        rbA4089_RA = findViewById(R.id.rbA4089_RA);
        rbA4090_1 = findViewById(R.id.rbA4090_1);
        rbA4090_2 = findViewById(R.id.rbA4090_2);
        rbA4090_DK = findViewById(R.id.rbA4090_DK);
        rbA4090_RA = findViewById(R.id.rbA4090_RA);
        rbA4091_1 = findViewById(R.id.rbA4091_1);
        rbA4091_2 = findViewById(R.id.rbA4091_2);
        rbA4091_DK = findViewById(R.id.rbA4091_DK);
        rbA4091_RA = findViewById(R.id.rbA4091_RA);
        rbA4092_1 = findViewById(R.id.rbA4092_1);
        rbA4092_2 = findViewById(R.id.rbA4092_2);
        rbA4092_DK = findViewById(R.id.rbA4092_DK);
        rbA4092_RA = findViewById(R.id.rbA4092_RA);
        rbA4094u_1 = findViewById(R.id.rbA4094u_1);
        rbA4094u_2 = findViewById(R.id.rbA4094u_2);
        rbA4094u_3 = findViewById(R.id.rbA4094u_3);
        rbA4094u_DK = findViewById(R.id.rbA4094u_DK);
        rbA4094u_RA = findViewById(R.id.rbA4094u_RA);

        // Edit Text
        ed_A4082_a = findViewById(R.id.ed_A4082_a);
        ed_A4082_b = findViewById(R.id.ed_A4082_b);
        ed_A4082_c = findViewById(R.id.ed_A4082_c);
        ed_A4085_a = findViewById(R.id.ed_A4085_a);
        ed_A4085_b = findViewById(R.id.ed_A4085_b);
        ed_A4087_a = findViewById(R.id.ed_A4087_a);
        ed_A4087_b = findViewById(R.id.ed_A4087_b);
        ed_A4093 = findViewById(R.id.ed_A4093);
        ed_A4094_a = findViewById(R.id.ed_A4094_a);
        ed_A4094_b = findViewById(R.id.ed_A4094_b);
        ed_A4094_c = findViewById(R.id.ed_A4094_c);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4081);

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

        Intent c = new Intent(A4081.this, A4095_A4108.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }


    private void setupSkips() {

        A4081.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4081_1.getId()) {
                    cvA4082u.setVisibility(View.VISIBLE);
                    cvA4082_a.setVisibility(View.VISIBLE);
                    cvA4082_b.setVisibility(View.VISIBLE);
                    cvA4082_c.setVisibility(View.VISIBLE);
                    cvA4083.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4082u);
                    ClearAllcontrol.ClearAllC(cvA4082_a);
                    ClearAllcontrol.ClearAllC(cvA4082_b);
                    ClearAllcontrol.ClearAllC(cvA4082_c);
                    ClearAllcontrol.ClearAllC(cvA4083);

                    cvA4082u.setVisibility(View.GONE);
                    cvA4082_a.setVisibility(View.GONE);
                    cvA4082_b.setVisibility(View.GONE);
                    cvA4082_c.setVisibility(View.GONE);
                    cvA4083.setVisibility(View.GONE);
                }
            }
        });


        A4082u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4082_a);
                ClearAllcontrol.ClearAllC(cvA4082_b);
                ClearAllcontrol.ClearAllC(cvA4082_c);

                cvA4082_a.setVisibility(View.GONE);
                cvA4082_b.setVisibility(View.GONE);
                cvA4082_c.setVisibility(View.GONE);

                if (checkedId == rbA4082u_1.getId()) {
                    cvA4082_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4082u_2.getId()) {
                    cvA4082_b.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4082u_3.getId()) {
                    cvA4082_c.setVisibility(View.VISIBLE);
                }

            }

        });


        A4084.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4084_1.getId()) {
                    cvA4085u.setVisibility(View.VISIBLE);
                    cvA4085_a.setVisibility(View.VISIBLE);
                    cvA4085_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4085u);
                    ClearAllcontrol.ClearAllC(cvA4085_a);
                    ClearAllcontrol.ClearAllC(cvA4085_b);

                    cvA4085u.setVisibility(View.GONE);
                    cvA4085_a.setVisibility(View.GONE);
                    cvA4085_b.setVisibility(View.GONE);
                }

            }

        });


        A4085u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4085_a);
                ClearAllcontrol.ClearAllC(cvA4085_b);

                cvA4085_a.setVisibility(View.GONE);
                cvA4085_b.setVisibility(View.GONE);

                if (checkedId == rbA4085u_1.getId()) {
                    cvA4085_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4085u_2.getId()) {
                    cvA4085_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4086.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4086_1.getId()) {
                    cvA4087u.setVisibility(View.VISIBLE);
                    cvA4087_a.setVisibility(View.VISIBLE);
                    cvA4087_b.setVisibility(View.VISIBLE);
                    cvA4088.setVisibility(View.VISIBLE);
                    cvA4089.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4087u);
                    ClearAllcontrol.ClearAllC(cvA4087_a);
                    ClearAllcontrol.ClearAllC(cvA4087_b);
                    ClearAllcontrol.ClearAllC(cvA4088);
                    ClearAllcontrol.ClearAllC(cvA4089);

                    cvA4087u.setVisibility(View.GONE);
                    cvA4087_a.setVisibility(View.GONE);
                    cvA4087_b.setVisibility(View.GONE);
                    cvA4088.setVisibility(View.GONE);
                    cvA4089.setVisibility(View.GONE);
                }
            }
        });


        A4087u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4087_a);
                ClearAllcontrol.ClearAllC(cvA4087_b);

                cvA4087_a.setVisibility(View.GONE);
                cvA4087_b.setVisibility(View.GONE);

                if (checkedId == rbA4087u_1.getId()) {
                    cvA4087_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4087u_2.getId()) {
                    cvA4087_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4091.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4091_1.getId()) {
                    cvA4092.setVisibility(View.VISIBLE);
                    cvA4093.setVisibility(View.VISIBLE);
                    cvA4094u.setVisibility(View.VISIBLE);
                    cvA4094_a.setVisibility(View.VISIBLE);
                    cvA4094_b.setVisibility(View.VISIBLE);
                    cvA4094_c.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4092);
                    ClearAllcontrol.ClearAllC(cvA4093);
                    ClearAllcontrol.ClearAllC(cvA4094u);
                    ClearAllcontrol.ClearAllC(cvA4094_a);
                    ClearAllcontrol.ClearAllC(cvA4094_b);
                    ClearAllcontrol.ClearAllC(cvA4094_c);

                    cvA4092.setVisibility(View.GONE);
                    cvA4093.setVisibility(View.GONE);
                    cvA4094u.setVisibility(View.GONE);
                    cvA4094_a.setVisibility(View.GONE);
                    cvA4094_b.setVisibility(View.GONE);
                    cvA4094_c.setVisibility(View.GONE);
                }
            }
        });


        A4094u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4094_a);
                ClearAllcontrol.ClearAllC(cvA4094_b);
                ClearAllcontrol.ClearAllC(cvA4094_c);

                cvA4094_a.setVisibility(View.GONE);
                cvA4094_b.setVisibility(View.GONE);
                cvA4094_c.setVisibility(View.GONE);

                if (checkedId == rbA4094u_1.getId()) {
                    cvA4094_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4094u_2.getId()) {
                    cvA4094_b.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4094u_3.getId()) {
                    cvA4094_c.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private void events_calls() {

        btn_next4.setOnClickListener(this);

        ed_A4082_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4082_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        ed_A4082_c.setFilters(new InputFilter[]{new InputFilterMinMax(1, 49, 99, 99)});

        ed_A4085_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4085_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4087_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4087_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4094_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 59, 99, 99)});
        ed_A4094_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 99, 99)});
        ed_A4094_c.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4081
        json.put("A4081", rbA4081_1.isChecked() ? "1"
                : rbA4081_2.isChecked() ? "2"
                : rbA4081_DK.isChecked() ? "98"
                : rbA4081_RA.isChecked() ? "99"
                : "-1");

        //A4082u
        json.put("A4082u", rbA4082u_1.isChecked() ? "1"
                : rbA4082u_2.isChecked() ? "2"
                : rbA4082u_3.isChecked() ? "3"
                : rbA4082u_DK.isChecked() ? "98"
                : rbA4082u_RA.isChecked() ? "99"
                : "-1");

        //A4082_a
        json.put("A4082_a", ed_A4082_a.getText().toString().length() > 0 ? ed_A4082_a.getText().toString().trim() : "-1");

        //A4082_b
        json.put("A4082_b", ed_A4082_b.getText().toString().length() > 0 ? ed_A4082_b.getText().toString().trim() : "-1");

        //A4082_c
        json.put("A4082_c", ed_A4082_c.getText().toString().length() > 0 ? ed_A4082_c.getText().toString().trim() : "-1");

        //A4083
        json.put("A4083", rbA4083_1.isChecked() ? "1"
                : rbA4083_2.isChecked() ? "2"
                : rbA4083_DK.isChecked() ? "98"
                : rbA4083_RA.isChecked() ? "99"
                : "-1");

        //A4084
        json.put("A4084", rbA4084_1.isChecked() ? "1"
                : rbA4084_2.isChecked() ? "2"
                : rbA4084_DK.isChecked() ? "98"
                : rbA4084_RA.isChecked() ? "99"
                : "-1");

        //A4085u
        json.put("A4085u", rbA4085u_1.isChecked() ? "1"
                : rbA4085u_2.isChecked() ? "2"
                : rbA4085u_DK.isChecked() ? "98"
                : rbA4085u_RA.isChecked() ? "99"
                : "-1");

        //A4085_a
        json.put("A4085_a", ed_A4085_a.getText().toString().length() > 0 ? ed_A4085_a.getText().toString().trim() : "-1");

        //A4085_b
        json.put("A4085_b", ed_A4085_b.getText().toString().length() > 0 ? ed_A4085_b.getText().toString().trim() : "-1");


        //A4086
        json.put("A4086", rbA4086_1.isChecked() ? "1"
                : rbA4086_2.isChecked() ? "2"
                : rbA4086_DK.isChecked() ? "98"
                : rbA4086_RA.isChecked() ? "99"
                : "-1");


        //A4087u
        json.put("A4087u", rbA4087u_1.isChecked() ? "1"
                : rbA4087u_2.isChecked() ? "2"
                : rbA4087u_DK.isChecked() ? "98"
                : rbA4087u_RA.isChecked() ? "99"
                : "-1");

        //A4087_a
        json.put("A4087_a", ed_A4087_a.getText().toString().length() > 0 ? ed_A4087_a.getText().toString().trim() : "-1");

        //A4087_b
        json.put("A4087_b", ed_A4087_b.getText().toString().length() > 0 ? ed_A4087_b.getText().toString().trim() : "-1");


        //A4088
        json.put("A4088", rbA4088_1.isChecked() ? "1"
                : rbA4088_2.isChecked() ? "2"
                : rbA4088_DK.isChecked() ? "98"
                : rbA4088_RA.isChecked() ? "99"
                : "-1");

        //A4089
        json.put("A4089", rbA4089_1.isChecked() ? "1"
                : rbA4089_2.isChecked() ? "2"
                : rbA4089_DK.isChecked() ? "98"
                : rbA4089_RA.isChecked() ? "99"
                : "-1");

        //A4090
        json.put("A4090", rbA4090_1.isChecked() ? "1"
                : rbA4090_2.isChecked() ? "2"
                : rbA4090_DK.isChecked() ? "98"
                : rbA4090_RA.isChecked() ? "99"
                : "-1");

        //A4091
        json.put("A4091", rbA4091_1.isChecked() ? "1"
                : rbA4091_2.isChecked() ? "2"
                : rbA4091_DK.isChecked() ? "98"
                : rbA4091_RA.isChecked() ? "99"
                : "-1");

        //A4092
        json.put("A4092", rbA4092_1.isChecked() ? "1"
                : rbA4092_2.isChecked() ? "2"
                : rbA4092_DK.isChecked() ? "98"
                : rbA4092_RA.isChecked() ? "99"
                : "-1");

        //A4093
        json.put("A4093", ed_A4093.getText().toString().length() > 0 ? ed_A4093.getText().toString().trim() : "-1");


        //A4094u
        json.put("A4094u", rbA4094u_1.isChecked() ? "1"
                : rbA4094u_2.isChecked() ? "2"
                : rbA4094u_3.isChecked() ? "3"
                : rbA4094u_DK.isChecked() ? "98"
                : rbA4094u_RA.isChecked() ? "99"
                : "-1");

        //A4094_a
        json.put("A4094_a", ed_A4094_a.getText().toString().length() > 0 ? ed_A4094_a.getText().toString().trim() : "-1");

        //A4094_b
        json.put("A4094_b", ed_A4094_b.getText().toString().length() > 0 ? ed_A4094_b.getText().toString().trim() : "-1");

        //A4094_c
        json.put("A4094_c", ed_A4094_c.getText().toString().length() > 0 ? ed_A4094_c.getText().toString().trim() : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4081) != false;
    }

}
