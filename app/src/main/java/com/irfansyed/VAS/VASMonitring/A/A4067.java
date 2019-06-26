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

public class A4067 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next3;

    LinearLayout
            llA4067;

    CardView
            cvstudy_id,
            cvA4067,
            cvA4068,
            cvA4069u,
            cvA4069_a,
            cvA4069_b,
            cvA4069_c,
            cvA4070,
            cvA4071,
            cvA4072u,
            cvA4072_a,
            cvA4072_b,
            cvA4073,
            cvA4074,
            cvA4075u,
            cvA4075_a,
            cvA4075_b,
            cvA4076,
            cvA4077u,
            cvA4077_a,
            cvA4077_b,
            cvA4078,
            cvA4079,
            cvA4080;

    RadioGroup
            A4067,
            A4068,
            A4069u,
            A4070,
            A4071,
            A4072u,
            A4073,
            A4074,
            A4075u,
            A4076,
            A4077u,
            A4078,
            A4079,
            A4080;

    RadioButton
            rbA4067_1,
            rbA4067_2,
            rbA4067_DK,
            rbA4067_RA,
            rbA4068_1,
            rbA4068_2,
            rbA4068_DK,
            rbA4068_RA,
            rbA4069u_1,
            rbA4069u_2,
            rbA4069u_3,
            rbA4069u_DK,
            rbA4069u_RA,
            rbA4070_1,
            rbA4070_2,
            rbA4070_3,
            rbA4070_DK,
            rbA4070_RA,
            rbA4071_1,
            rbA4071_2,
            rbA4071_DK,
            rbA4071_RA,
            rbA4072u_1,
            rbA4072u_2,
            rbA4072u_DK,
            rbA4072u_RA,
            rbA4073_1,
            rbA4073_2,
            rbA4073_DK,
            rbA4073_RA,
            rbA4074_1,
            rbA4074_2,
            rbA4074_DK,
            rbA4074_RA,
            rbA4075u_1,
            rbA4075u_2,
            rbA4075u_DK,
            rbA4075u_RA,
            rbA4076_1,
            rbA4076_2,
            rbA4076_DK,
            rbA4076_RA,
            rbA4077u_1,
            rbA4077u_2,
            rbA4077u_DK,
            rbA4077u_RA,
            rbA4078_1,
            rbA4078_2,
            rbA4078_DK,
            rbA4078_RA,
            rbA4079_1,
            rbA4079_2,
            rbA4079_DK,
            rbA4079_RA,
            rbA4080_1,
            rbA4080_2,
            rbA4080_DK,
            rbA4080_RA;

    EditText
            ed_study_id,
            ed_A4069_a,
            ed_A4069_b,
            ed_A4069_c,
            ed_A4072_a,
            ed_A4072_b,
            ed_A4075_a,
            ed_A4075_b,
            ed_A4077_a,
            ed_A4077_b;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next3 = findViewById(R.id.btn_next3);

        //Linear Layout
        llA4067 = findViewById(R.id.llA4067);

        //CardView
        cvA4067 = findViewById(R.id.cvA4067);
        cvA4068 = findViewById(R.id.cvA4068);
        cvA4069u = findViewById(R.id.cvA4069u);
        cvA4069_a = findViewById(R.id.cvA4069_a);
        cvA4069_b = findViewById(R.id.cvA4069_b);
        cvA4069_c = findViewById(R.id.cvA4069_c);
        cvA4070 = findViewById(R.id.cvA4070);
        cvA4071 = findViewById(R.id.cvA4071);
        cvA4072u = findViewById(R.id.cvA4072u);
        cvA4072_a = findViewById(R.id.cvA4072_a);
        cvA4072_b = findViewById(R.id.cvA4072_b);
        cvA4073 = findViewById(R.id.cvA4073);
        cvA4074 = findViewById(R.id.cvA4074);
        cvA4075u = findViewById(R.id.cvA4075u);
        cvA4075_a = findViewById(R.id.cvA4075_a);
        cvA4075_b = findViewById(R.id.cvA4075_b);
        cvA4076 = findViewById(R.id.cvA4076);
        cvA4077u = findViewById(R.id.cvA4077u);
        cvA4077_a = findViewById(R.id.cvA4077_a);
        cvA4077_b = findViewById(R.id.cvA4077_b);
        cvA4078 = findViewById(R.id.cvA4078);
        cvA4079 = findViewById(R.id.cvA4079);
        cvA4080 = findViewById(R.id.cvA4080);

        //RadioGroup
        A4067 = findViewById(R.id.A4067);
        A4068 = findViewById(R.id.A4068);
        A4069u = findViewById(R.id.A4069u);
        A4070 = findViewById(R.id.A4070);
        A4071 = findViewById(R.id.A4071);
        A4072u = findViewById(R.id.A4072u);
        A4073 = findViewById(R.id.A4073);
        A4074 = findViewById(R.id.A4074);
        A4075u = findViewById(R.id.A4075u);
        A4076 = findViewById(R.id.A4076);
        A4077u = findViewById(R.id.A4077u);
        A4078 = findViewById(R.id.A4078);
        A4079 = findViewById(R.id.A4079);
        A4080 = findViewById(R.id.A4080);

        //Radio Button
        rbA4067_1 = findViewById(R.id.rbA4067_1);
        rbA4067_2 = findViewById(R.id.rbA4067_2);
        rbA4067_DK = findViewById(R.id.rbA4067_DK);
        rbA4067_RA = findViewById(R.id.rbA4067_RA);
        rbA4068_1 = findViewById(R.id.rbA4068_1);
        rbA4068_2 = findViewById(R.id.rbA4068_2);
        rbA4068_DK = findViewById(R.id.rbA4068_DK);
        rbA4068_RA = findViewById(R.id.rbA4068_RA);
        rbA4069u_1 = findViewById(R.id.rbA4069u_1);
        rbA4069u_2 = findViewById(R.id.rbA4069u_2);
        rbA4069u_3 = findViewById(R.id.rbA4069u_3);
        rbA4069u_DK = findViewById(R.id.rbA4069u_DK);
        rbA4069u_RA = findViewById(R.id.rbA4069u_RA);
        rbA4070_1 = findViewById(R.id.rbA4070_1);
        rbA4070_2 = findViewById(R.id.rbA4070_2);
        rbA4070_3 = findViewById(R.id.rbA4070_3);
        rbA4070_DK = findViewById(R.id.rbA4070_DK);
        rbA4070_RA = findViewById(R.id.rbA4070_RA);
        rbA4071_1 = findViewById(R.id.rbA4071_1);
        rbA4071_2 = findViewById(R.id.rbA4071_2);
        rbA4071_DK = findViewById(R.id.rbA4071_DK);
        rbA4071_RA = findViewById(R.id.rbA4071_RA);
        rbA4072u_1 = findViewById(R.id.rbA4072u_1);
        rbA4072u_2 = findViewById(R.id.rbA4072u_2);
        rbA4072u_DK = findViewById(R.id.rbA4072u_DK);
        rbA4072u_RA = findViewById(R.id.rbA4072u_RA);
        rbA4073_1 = findViewById(R.id.rbA4073_1);
        rbA4073_2 = findViewById(R.id.rbA4073_2);
        rbA4073_DK = findViewById(R.id.rbA4073_DK);
        rbA4073_RA = findViewById(R.id.rbA4073_RA);
        rbA4074_1 = findViewById(R.id.rbA4074_1);
        rbA4074_2 = findViewById(R.id.rbA4074_2);
        rbA4074_DK = findViewById(R.id.rbA4074_DK);
        rbA4074_RA = findViewById(R.id.rbA4074_RA);
        rbA4075u_1 = findViewById(R.id.rbA4075u_1);
        rbA4075u_2 = findViewById(R.id.rbA4075u_2);
        rbA4075u_DK = findViewById(R.id.rbA4075u_DK);
        rbA4075u_RA = findViewById(R.id.rbA4075u_RA);
        rbA4076_1 = findViewById(R.id.rbA4076_1);
        rbA4076_2 = findViewById(R.id.rbA4076_2);
        rbA4076_DK = findViewById(R.id.rbA4076_DK);
        rbA4076_RA = findViewById(R.id.rbA4076_RA);
        rbA4077u_1 = findViewById(R.id.rbA4077u_1);
        rbA4077u_2 = findViewById(R.id.rbA4077u_2);
        rbA4077u_DK = findViewById(R.id.rbA4077u_DK);
        rbA4077u_RA = findViewById(R.id.rbA4077u_RA);
        rbA4078_1 = findViewById(R.id.rbA4078_1);
        rbA4078_2 = findViewById(R.id.rbA4078_2);
        rbA4078_DK = findViewById(R.id.rbA4078_DK);
        rbA4078_RA = findViewById(R.id.rbA4078_RA);
        rbA4079_1 = findViewById(R.id.rbA4079_1);
        rbA4079_2 = findViewById(R.id.rbA4079_2);
        rbA4079_DK = findViewById(R.id.rbA4079_DK);
        rbA4079_RA = findViewById(R.id.rbA4079_RA);
        rbA4080_1 = findViewById(R.id.rbA4080_1);
        rbA4080_2 = findViewById(R.id.rbA4080_2);
        rbA4080_DK = findViewById(R.id.rbA4080_DK);
        rbA4080_RA = findViewById(R.id.rbA4080_RA);

        // Edit Text
        ed_A4069_a = findViewById(R.id.ed_A4069_a);
        ed_A4069_b = findViewById(R.id.ed_A4069_b);
        ed_A4069_c = findViewById(R.id.ed_A4069_c);
        ed_A4072_a = findViewById(R.id.ed_A4072_a);
        ed_A4072_b = findViewById(R.id.ed_A4072_b);
        ed_A4075_a = findViewById(R.id.ed_A4075_a);
        ed_A4075_b = findViewById(R.id.ed_A4075_b);
        ed_A4077_a = findViewById(R.id.ed_A4077_a);
        ed_A4077_b = findViewById(R.id.ed_A4077_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4067);

        this.setTitle(getString(R.string.h_a_sec_9));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_calls();
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

        Intent c = new Intent(A4067.this, A4081_A4094.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
        setupSkips();

    }


    private void setupSkips() {

        A4067.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4067_1.getId()) {
                    cvA4068.setVisibility(View.VISIBLE);
                    cvA4069u.setVisibility(View.VISIBLE);
                    cvA4069_a.setVisibility(View.VISIBLE);
                    cvA4069_b.setVisibility(View.VISIBLE);
                    cvA4069_c.setVisibility(View.VISIBLE);
                    cvA4070.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4068);
                    ClearAllcontrol.ClearAllC(cvA4069u);
                    ClearAllcontrol.ClearAllC(cvA4069_a);
                    ClearAllcontrol.ClearAllC(cvA4069_b);
                    ClearAllcontrol.ClearAllC(cvA4069_c);
                    ClearAllcontrol.ClearAllC(cvA4070);

                    cvA4068.setVisibility(View.GONE);
                    cvA4069u.setVisibility(View.GONE);
                    cvA4069_a.setVisibility(View.GONE);
                    cvA4069_b.setVisibility(View.GONE);
                    cvA4069_c.setVisibility(View.GONE);
                    cvA4070.setVisibility(View.GONE);
                }
            }
        });


        A4069u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4069_a);
                ClearAllcontrol.ClearAllC(cvA4069_b);
                ClearAllcontrol.ClearAllC(cvA4069_c);

                cvA4069_a.setVisibility(View.GONE);
                cvA4069_b.setVisibility(View.GONE);
                cvA4069_c.setVisibility(View.GONE);

                if (checkedId == rbA4069u_1.getId()) {
                    cvA4069_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4069u_2.getId()) {
                    cvA4069_b.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4069u_3.getId()) {
                    cvA4069_c.setVisibility(View.VISIBLE);
                }

            }

        });


        A4071.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4071_1.getId()) {
                    cvA4072u.setVisibility(View.VISIBLE);
                    cvA4072_a.setVisibility(View.VISIBLE);
                    cvA4072_b.setVisibility(View.VISIBLE);
                    cvA4073.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4072u);
                    ClearAllcontrol.ClearAllC(cvA4072_a);
                    ClearAllcontrol.ClearAllC(cvA4072_b);
                    ClearAllcontrol.ClearAllC(cvA4073);

                    cvA4072u.setVisibility(View.GONE);
                    cvA4072_a.setVisibility(View.GONE);
                    cvA4072_b.setVisibility(View.GONE);
                    cvA4073.setVisibility(View.GONE);
                }

            }

        });


        A4072u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4072_a);
                ClearAllcontrol.ClearAllC(cvA4072_b);

                cvA4072_a.setVisibility(View.GONE);
                cvA4072_b.setVisibility(View.GONE);

                if (checkedId == rbA4072u_1.getId()) {
                    cvA4072_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4072u_2.getId()) {
                    cvA4072_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4074.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4074_1.getId()) {
                    cvA4075u.setVisibility(View.VISIBLE);
                    cvA4075_a.setVisibility(View.VISIBLE);
                    cvA4075_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4075u);
                    ClearAllcontrol.ClearAllC(cvA4075_a);
                    ClearAllcontrol.ClearAllC(cvA4075_b);

                    cvA4075u.setVisibility(View.GONE);
                    cvA4075_a.setVisibility(View.GONE);
                    cvA4075_b.setVisibility(View.GONE);
                }
            }
        });


        A4075u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4075_a);
                ClearAllcontrol.ClearAllC(cvA4075_b);

                cvA4075_a.setVisibility(View.GONE);
                cvA4075_b.setVisibility(View.GONE);

                if (checkedId == rbA4075u_1.getId()) {
                    cvA4075_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4075u_2.getId()) {
                    cvA4075_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4076.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4076_1.getId()) {
                    cvA4077u.setVisibility(View.VISIBLE);
                    cvA4077_a.setVisibility(View.VISIBLE);
                    cvA4077_b.setVisibility(View.VISIBLE);
                    cvA4078.setVisibility(View.VISIBLE);
                    cvA4079.setVisibility(View.VISIBLE);
                    cvA4080.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4077u);
                    ClearAllcontrol.ClearAllC(cvA4077_a);
                    ClearAllcontrol.ClearAllC(cvA4077_b);
                    ClearAllcontrol.ClearAllC(cvA4078);
                    ClearAllcontrol.ClearAllC(cvA4079);
                    ClearAllcontrol.ClearAllC(cvA4080);

                    cvA4077u.setVisibility(View.GONE);
                    cvA4077_a.setVisibility(View.GONE);
                    cvA4077_b.setVisibility(View.GONE);
                    cvA4078.setVisibility(View.GONE);
                    cvA4079.setVisibility(View.GONE);
                    cvA4080.setVisibility(View.GONE);
                }
            }
        });


        A4077u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4077_a);
                ClearAllcontrol.ClearAllC(cvA4077_b);

                cvA4077_a.setVisibility(View.GONE);
                cvA4077_b.setVisibility(View.GONE);

                if (checkedId == rbA4077u_1.getId()) {
                    cvA4077_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4077u_2.getId()) {
                    cvA4077_b.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private void events_calls() {

        btn_next3.setOnClickListener(this);

        ed_A4069_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 23, 99, 99)});
        ed_A4069_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 30, 99, 99)});
        ed_A4069_c.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4072_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4072_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4075_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4075_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4077_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4077_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4067
        json.put("A4067", rbA4067_1.isChecked() ? "1"
                : rbA4067_2.isChecked() ? "2"
                : rbA4067_DK.isChecked() ? "98"
                : rbA4067_RA.isChecked() ? "99"
                : "-1");

        //A4068
        json.put("A4068", rbA4068_1.isChecked() ? "1"
                : rbA4068_2.isChecked() ? "2"
                : rbA4068_DK.isChecked() ? "98"
                : rbA4068_RA.isChecked() ? "99"
                : "-1");

        //A4069u
        json.put("A4069u", rbA4069u_1.isChecked() ? "1"
                : rbA4069u_2.isChecked() ? "2"
                : rbA4069u_3.isChecked() ? "3"
                : rbA4069u_DK.isChecked() ? "98"
                : rbA4069u_RA.isChecked() ? "99"
                : "-1");

        //A4069_a
        json.put("A4069_a", ed_A4069_a.getText().toString().length() > 0 ? ed_A4069_a.getText().toString().trim() : "-1");

        //A4069_b
        json.put("A4069_b", ed_A4069_b.getText().toString().length() > 0 ? ed_A4069_b.getText().toString().trim() : "-1");

        //A4069_c
        json.put("A4069_c", ed_A4069_c.getText().toString().length() > 0 ? ed_A4069_c.getText().toString().trim() : "-1");


        //A4070
        json.put("A4070", rbA4070_1.isChecked() ? "1"
                : rbA4070_2.isChecked() ? "2"
                : rbA4070_3.isChecked() ? "3"
                : rbA4070_DK.isChecked() ? "98"
                : rbA4070_RA.isChecked() ? "99"
                : "-1");

        //A4071
        json.put("A4071", rbA4071_1.isChecked() ? "1"
                : rbA4071_2.isChecked() ? "2"
                : rbA4071_DK.isChecked() ? "98"
                : rbA4071_RA.isChecked() ? "99"
                : "-1");


        //A4072u
        json.put("A4072u", rbA4072u_1.isChecked() ? "1"
                : rbA4072u_2.isChecked() ? "2"
                : rbA4072u_DK.isChecked() ? "98"
                : rbA4072u_RA.isChecked() ? "99"
                : "-1");

        //A4072_a
        json.put("A4072_a", ed_A4072_a.getText().toString().length() > 0 ? ed_A4072_a.getText().toString().trim() : "-1");

        //A4072_b
        json.put("A4072_b", ed_A4072_b.getText().toString().length() > 0 ? ed_A4072_b.getText().toString().trim() : "-1");


        //A4073
        json.put("A4073", rbA4073_1.isChecked() ? "1"
                : rbA4073_2.isChecked() ? "2"
                : rbA4073_DK.isChecked() ? "98"
                : rbA4073_RA.isChecked() ? "99"
                : "-1");

        //A4074
        json.put("A4074", rbA4074_1.isChecked() ? "1"
                : rbA4074_2.isChecked() ? "2"
                : rbA4074_DK.isChecked() ? "98"
                : rbA4074_RA.isChecked() ? "99"
                : "-1");


        //A4075u
        json.put("A4075u", rbA4075u_1.isChecked() ? "1"
                : rbA4075u_2.isChecked() ? "2"
                : rbA4075u_DK.isChecked() ? "98"
                : rbA4075u_RA.isChecked() ? "99"
                : "-1");

        //A4075_a
        json.put("A4075_a", ed_A4075_a.getText().toString().length() > 0 ? ed_A4075_a.getText().toString().trim() : "-1");

        //A4075_b
        json.put("A4075_b", ed_A4075_b.getText().toString().length() > 0 ? ed_A4075_b.getText().toString().trim() : "-1");


        //A4076
        json.put("A4076", rbA4076_1.isChecked() ? "1"
                : rbA4076_2.isChecked() ? "2"
                : rbA4076_DK.isChecked() ? "98"
                : rbA4076_RA.isChecked() ? "99"
                : "-1");


        //A4077u
        json.put("A4077u", rbA4077u_1.isChecked() ? "1"
                : rbA4077u_2.isChecked() ? "2"
                : rbA4077u_DK.isChecked() ? "98"
                : rbA4077u_RA.isChecked() ? "99"
                : "-1");

        //A4077_a
        json.put("A4077_a", ed_A4077_a.getText().toString().length() > 0 ? ed_A4077_a.getText().toString().trim() : "-1");

        //A4077_b
        json.put("A4077_b", ed_A4077_b.getText().toString().length() > 0 ? ed_A4077_b.getText().toString().trim() : "-1");


        //A4078
        json.put("A4078", rbA4078_1.isChecked() ? "1"
                : rbA4078_2.isChecked() ? "2"
                : rbA4078_DK.isChecked() ? "98"
                : rbA4078_RA.isChecked() ? "99"
                : "-1");

        //A4079
        json.put("A4079", rbA4079_1.isChecked() ? "1"
                : rbA4079_2.isChecked() ? "2"
                : rbA4079_DK.isChecked() ? "98"
                : rbA4079_RA.isChecked() ? "99"
                : "-1");

        //A4080
        json.put("A4080", rbA4080_1.isChecked() ? "1"
                : rbA4080_2.isChecked() ? "2"
                : rbA4080_DK.isChecked() ? "98"
                : rbA4080_RA.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4067) != false;
    }
}