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

public class A4051 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next2;

    LinearLayout
            llA4051;

    CardView
            cvstudy_id,
            cvA4051,
            cvA4052u,
            cvA4052_b,
            cvA4052_c,
            cvA4053,
            cvA4054,
            cvA4055,
            cvA4056,
            cvA4057,
            cvA4058,
            cvA4059u,
            cvA4059_a,
            cvA4059_b,
            cvA4060,
            cvA4061,
            cvA4062,
            cvA4063,
            cvA4064u,
            cvA4064_a,
            cvA4064_b,
            cvA4064_1,
            cvA4065,
            cvA4066;

    RadioGroup
            A4051,
            A4052u,
            A4053,
            A4054,
            A4055,
            A4056,
            A4057,
            A4058,
            A4059u,
            A4060,
            A4061,
            A4062,
            A4063,
            A4064u,
            A4064_1,
            A4065,
            A4066;

    RadioButton
            A4051_1,
            A4051_2,
            A4051_DK,
            A4051_RA,
            A4052u_1,
            A4052u_2,
            A4052u_DK,
            A4052u_RA,
            A4053_1,
            A4053_2,
            A4053_DK,
            A4053_RA,
            A4054_1,
            A4054_2,
            A4054_3,
            A4054_DK,
            A4054_RA,
            A4055_1,
            A4055_2,
            A4055_3,
            A4055_DK,
            A4055_RA,
            A4056_1,
            A4056_2,
            A4056_DK,
            A4056_RA,
            A4057_1,
            A4057_2,
            A4057_DK,
            A4057_RA,
            A4058_1,
            A4058_2,
            A4058_DK,
            A4058_RA,
            A4059u_1,
            A4059u_2,
            A4059u_DK,
            A4059u_RA,
            A4060_1,
            A4060_2,
            A4060_DK,
            A4060_RA,
            A4061_1,
            A4061_2,
            A4061_DK,
            A4061_RA,
            A4062_1,
            A4062_2,
            A4062_DK,
            A4062_RA,
            A4063_1,
            A4063_2,
            A4063_DK,
            A4063_RA,
            A4064u_1,
            A4064u_2,
            A4064u_DK,
            A4064u_RA,
            A4064_1_1,
            A4064_1_2,
            A4064_1_DK,
            A4064_1_RA,
            A4065_1,
            A4065_2,
            A4065_DK,
            A4065_RA,
            A4066_1,
            A4066_2,
            A4066_DK,
            A4066_RA;

    EditText
            ed_study_id,
            ed_A4052_b,
            ed_A4052_c,
            ed_A4059_a,
            ed_A4059_b,
            ed_A4064_a,
            ed_A4064_b;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next2 = findViewById(R.id.btn_next2);

        //Linear Layout
        cvA4051 = findViewById(R.id.cvA4051);
        cvA4052u = findViewById(R.id.cvA4052u);
        cvA4052_b = findViewById(R.id.cvA4052_b);
        cvA4052_c = findViewById(R.id.cvA4052_c);
        cvA4053 = findViewById(R.id.cvA4053);
        cvA4054 = findViewById(R.id.cvA4054);
        cvA4055 = findViewById(R.id.cvA4055);
        cvA4056 = findViewById(R.id.cvA4056);
        cvA4057 = findViewById(R.id.cvA4057);
        cvA4058 = findViewById(R.id.cvA4058);
        cvA4059u = findViewById(R.id.cvA4059u);
        cvA4059_a = findViewById(R.id.cvA4059_a);
        cvA4059_b = findViewById(R.id.cvA4059_b);
        cvA4060 = findViewById(R.id.cvA4060);
        cvA4061 = findViewById(R.id.cvA4061);
        cvA4062 = findViewById(R.id.cvA4062);
        cvA4063 = findViewById(R.id.cvA4063);
        cvA4064u = findViewById(R.id.cvA4064u);
        cvA4064_a = findViewById(R.id.cvA4064_a);
        cvA4064_b = findViewById(R.id.cvA4064_b);
        cvA4064_1 = findViewById(R.id.cvA4064_1);
        cvA4065 = findViewById(R.id.cvA4065);
        cvA4066 = findViewById(R.id.cvA4066);

        //RadioGroup
        A4051 = findViewById(R.id.A4051);
        A4052u = findViewById(R.id.A4052u);
        A4053 = findViewById(R.id.A4053);
        A4054 = findViewById(R.id.A4054);
        A4055 = findViewById(R.id.A4055);
        A4056 = findViewById(R.id.A4056);
        A4057 = findViewById(R.id.A4057);
        A4058 = findViewById(R.id.A4058);
        A4059u = findViewById(R.id.A4059u);
        A4060 = findViewById(R.id.A4060);
        A4061 = findViewById(R.id.A4061);
        A4062 = findViewById(R.id.A4062);
        A4063 = findViewById(R.id.A4063);
        A4064u = findViewById(R.id.A4064u);
        A4064_1 = findViewById(R.id.A4064_1);
        A4065 = findViewById(R.id.A4065);
        A4066 = findViewById(R.id.A4066);

        //Radio Button
        A4051_1 = findViewById(R.id.A4051_1);
        A4051_2 = findViewById(R.id.A4051_2);
        A4051_DK = findViewById(R.id.A4051_DK);
        A4051_RA = findViewById(R.id.A4051_RA);
        A4052u_1 = findViewById(R.id.A4052u_1);
        A4052u_2 = findViewById(R.id.A4052u_2);
        A4052u_DK = findViewById(R.id.A4052u_DK);
        A4052u_RA = findViewById(R.id.A4052u_RA);
        A4053_1 = findViewById(R.id.A4053_1);
        A4053_2 = findViewById(R.id.A4053_2);
        A4053_DK = findViewById(R.id.A4053_DK);
        A4053_RA = findViewById(R.id.A4053_RA);
        A4054_1 = findViewById(R.id.A4054_1);
        A4054_2 = findViewById(R.id.A4054_2);
        A4054_3 = findViewById(R.id.A4054_3);
        A4054_DK = findViewById(R.id.A4054_DK);
        A4054_RA = findViewById(R.id.A4054_RA);
        A4055_1 = findViewById(R.id.A4055_1);
        A4055_2 = findViewById(R.id.A4055_2);
        A4055_3 = findViewById(R.id.A4055_3);
        A4055_DK = findViewById(R.id.A4055_DK);
        A4055_RA = findViewById(R.id.A4055_RA);
        A4056_1 = findViewById(R.id.A4056_1);
        A4056_2 = findViewById(R.id.A4056_2);
        A4056_DK = findViewById(R.id.A4056_DK);
        A4056_RA = findViewById(R.id.A4056_RA);
        A4057_1 = findViewById(R.id.A4057_1);
        A4057_2 = findViewById(R.id.A4057_2);
        A4057_DK = findViewById(R.id.A4057_DK);
        A4057_RA = findViewById(R.id.A4057_RA);
        A4058_1 = findViewById(R.id.A4058_1);
        A4058_2 = findViewById(R.id.A4058_2);
        A4058_DK = findViewById(R.id.A4058_DK);
        A4058_RA = findViewById(R.id.A4058_RA);
        A4059u_1 = findViewById(R.id.A4059u_1);
        A4059u_2 = findViewById(R.id.A4059u_2);
        A4059u_DK = findViewById(R.id.A4059u_DK);
        A4059u_RA = findViewById(R.id.A4059u_RA);
        A4060_1 = findViewById(R.id.A4060_1);
        A4060_2 = findViewById(R.id.A4060_2);
        A4060_DK = findViewById(R.id.A4060_DK);
        A4060_RA = findViewById(R.id.A4060_RA);
        A4061_1 = findViewById(R.id.A4061_1);
        A4061_2 = findViewById(R.id.A4061_2);
        A4061_DK = findViewById(R.id.A4061_DK);
        A4061_RA = findViewById(R.id.A4061_RA);
        A4062_1 = findViewById(R.id.A4062_1);
        A4062_2 = findViewById(R.id.A4062_2);
        A4062_DK = findViewById(R.id.A4062_DK);
        A4062_RA = findViewById(R.id.A4062_RA);
        A4063_1 = findViewById(R.id.A4063_1);
        A4063_2 = findViewById(R.id.A4063_2);
        A4063_DK = findViewById(R.id.A4063_DK);
        A4063_RA = findViewById(R.id.A4063_RA);
        A4064u_1 = findViewById(R.id.A4064u_1);
        A4064u_2 = findViewById(R.id.A4064u_2);
        A4064u_DK = findViewById(R.id.A4064u_DK);
        A4064u_RA = findViewById(R.id.A4064u_RA);
        A4064_1_1 = findViewById(R.id.A4064_1_1);
        A4064_1_2 = findViewById(R.id.A4064_1_2);
        A4064_1_DK = findViewById(R.id.A4064_1_DK);
        A4064_1_RA = findViewById(R.id.A4064_1_RA);
        A4065_1 = findViewById(R.id.A4065_1);
        A4065_2 = findViewById(R.id.A4065_2);
        A4065_DK = findViewById(R.id.A4065_DK);
        A4065_RA = findViewById(R.id.A4065_RA);
        A4066_1 = findViewById(R.id.A4066_1);
        A4066_2 = findViewById(R.id.A4066_2);
        A4066_DK = findViewById(R.id.A4066_DK);
        A4066_RA = findViewById(R.id.A4066_RA);

        // Edit Text
        ed_A4052_b = findViewById(R.id.ed_A4052_b);
        ed_A4052_c = findViewById(R.id.ed_A4052_c);
        ed_A4059_a = findViewById(R.id.ed_A4059_a);
        ed_A4059_b = findViewById(R.id.ed_A4059_b);
        ed_A4064_a = findViewById(R.id.ed_A4064_a);
        ed_A4064_b = findViewById(R.id.ed_A4064_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4051);

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


    private void setupSkips() {

        A4051.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4051_1.getId()) {
                    cvA4052u.setVisibility(View.VISIBLE);
                    cvA4052_b.setVisibility(View.VISIBLE);
                    cvA4052_c.setVisibility(View.VISIBLE);
                    cvA4053.setVisibility(View.VISIBLE);
                    cvA4054.setVisibility(View.VISIBLE);
                    cvA4055.setVisibility(View.VISIBLE);
                    cvA4056.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4052u);
                    ClearAllcontrol.ClearAllC(cvA4052_b);
                    ClearAllcontrol.ClearAllC(cvA4052_c);
                    ClearAllcontrol.ClearAllC(cvA4053);
                    ClearAllcontrol.ClearAllC(cvA4054);
                    ClearAllcontrol.ClearAllC(cvA4055);
                    ClearAllcontrol.ClearAllC(cvA4056);

                    cvA4052u.setVisibility(View.GONE);
                    cvA4052_b.setVisibility(View.GONE);
                    cvA4052_c.setVisibility(View.GONE);
                    cvA4053.setVisibility(View.GONE);
                    cvA4054.setVisibility(View.GONE);
                    cvA4055.setVisibility(View.GONE);
                    cvA4056.setVisibility(View.GONE);
                }
            }
        });


        A4052u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4052_b);
                ClearAllcontrol.ClearAllC(cvA4052_c);

                cvA4052_b.setVisibility(View.GONE);
                cvA4052_c.setVisibility(View.GONE);

                if (checkedId == A4052u_1.getId()) {
                    cvA4052_b.setVisibility(View.VISIBLE);
                } else if (checkedId == A4052u_2.getId()) {
                    cvA4052_c.setVisibility(View.VISIBLE);
                }

            }

        });


        A4058.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4058_1.getId()) {
                    cvA4059u.setVisibility(View.VISIBLE);
                    cvA4059_a.setVisibility(View.VISIBLE);
                    cvA4059_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4059u);
                    ClearAllcontrol.ClearAllC(cvA4059_a);
                    ClearAllcontrol.ClearAllC(cvA4059_b);

                    cvA4059u.setVisibility(View.GONE);
                    cvA4059_a.setVisibility(View.GONE);
                    cvA4059_b.setVisibility(View.GONE);
                }

            }

        });


        A4059u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4059_a);
                ClearAllcontrol.ClearAllC(cvA4059_b);

                cvA4059_a.setVisibility(View.GONE);
                cvA4059_b.setVisibility(View.GONE);

                if (checkedId == A4059u_1.getId()) {
                    cvA4059_a.setVisibility(View.VISIBLE);
                } else if (checkedId == A4059u_2.getId()) {
                    cvA4059_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4060.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4060_1.getId()) {
                    cvA4061.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4061);
                    cvA4061.setVisibility(View.GONE);
                }
            }
        });


        A4062.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4062_1.getId()) {
                    cvA4063.setVisibility(View.VISIBLE);
                    cvA4064u.setVisibility(View.VISIBLE);
                    cvA4064_a.setVisibility(View.VISIBLE);
                    cvA4064_b.setVisibility(View.VISIBLE);
                    cvA4064_1.setVisibility(View.VISIBLE);
                    cvA4065.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4063);
                    ClearAllcontrol.ClearAllC(cvA4064u);
                    ClearAllcontrol.ClearAllC(cvA4064_a);
                    ClearAllcontrol.ClearAllC(cvA4064_b);
                    ClearAllcontrol.ClearAllC(cvA4064_1);
                    ClearAllcontrol.ClearAllC(cvA4065);

                    cvA4063.setVisibility(View.GONE);
                    cvA4064u.setVisibility(View.GONE);
                    cvA4064_a.setVisibility(View.GONE);
                    cvA4064_b.setVisibility(View.GONE);
                    cvA4064_1.setVisibility(View.GONE);
                    cvA4065.setVisibility(View.GONE);
                }
            }
        });


        A4064u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4064_a);
                ClearAllcontrol.ClearAllC(cvA4064_b);

                cvA4064_a.setVisibility(View.GONE);
                cvA4064_b.setVisibility(View.GONE);

                if (checkedId == A4064u_1.getId()) {
                    cvA4064_a.setVisibility(View.VISIBLE);
                } else if (checkedId == A4064u_2.getId()) {
                    cvA4064_b.setVisibility(View.VISIBLE);
                }
            }
        });

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

        Intent c = new Intent(A4051.this, A4067.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    private void events_calls() {

        btn_next2.setOnClickListener(this);

        ed_A4052_b.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        ed_A4052_c.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        ed_A4059_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        ed_A4059_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        ed_A4064_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        ed_A4064_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4051
        json.put("A4051", A4051_1.isChecked() ? "1"
                : A4051_2.isChecked() ? "2"
                : A4051_DK.isChecked() ? "98"
                : A4051_RA.isChecked() ? "99"
                : "-1");

        //A4052u
        json.put("A4052u", A4052u_1.isChecked() ? "1"
                : A4052u_2.isChecked() ? "2"
                : A4052u_DK.isChecked() ? "98"
                : A4052u_RA.isChecked() ? "99"
                : "-1");

        //A4052_b
        json.put("A4052_b", ed_A4052_b.getText().toString().length() > 0 ? ed_A4052_b.getText().toString().trim() : "-1");

        //A4052_c
        json.put("A4052_c", ed_A4052_c.getText().toString().length() > 0 ? ed_A4052_c.getText().toString().trim() : "-1");

        //A4053
        json.put("A4053", A4053_1.isChecked() ? "1"
                : A4053_2.isChecked() ? "2"
                : A4053_DK.isChecked() ? "98"
                : A4053_RA.isChecked() ? "99"
                : "-1");

        //A4054
        json.put("A4054", A4054_1.isChecked() ? "1"
                : A4054_2.isChecked() ? "2"
                : A4054_3.isChecked() ? "3"
                : A4054_DK.isChecked() ? "98"
                : A4054_RA.isChecked() ? "99"
                : "-1");

        //A4055
        json.put("A4055", A4055_1.isChecked() ? "1"
                : A4055_2.isChecked() ? "2"
                : A4055_3.isChecked() ? "3"
                : A4055_DK.isChecked() ? "98"
                : A4055_RA.isChecked() ? "99"
                : "-1");

        //A4056
        json.put("A4056", A4056_1.isChecked() ? "1"
                : A4056_2.isChecked() ? "2"
                : A4056_DK.isChecked() ? "98"
                : A4056_RA.isChecked() ? "99"
                : "-1");

        //A4057
        json.put("A4057", A4057_1.isChecked() ? "1"
                : A4057_2.isChecked() ? "2"
                : A4057_DK.isChecked() ? "98"
                : A4057_RA.isChecked() ? "99"
                : "-1");

        //A4058
        json.put("A4058", A4058_1.isChecked() ? "1"
                : A4058_2.isChecked() ? "2"
                : A4058_DK.isChecked() ? "98"
                : A4058_RA.isChecked() ? "99"
                : "-1");

        //A4059u
        json.put("A4059u", A4059u_1.isChecked() ? "1"
                : A4059u_2.isChecked() ? "2"
                : A4059u_DK.isChecked() ? "98"
                : A4059u_RA.isChecked() ? "99"
                : "-1");

        //A4059_a
        json.put("A4059_a", ed_A4059_a.getText().toString().length() > 0 ? ed_A4059_a.getText().toString().trim() : "-1");

        //A4059_b
        json.put("A4059_b", ed_A4059_b.getText().toString().length() > 0 ? ed_A4059_b.getText().toString().trim() : "-1");

        //A4060
        json.put("A4060", A4060_1.isChecked() ? "1"
                : A4060_2.isChecked() ? "2"
                : A4060_DK.isChecked() ? "98"
                : A4060_RA.isChecked() ? "99"
                : "-1");

        //A4061
        json.put("A4061", A4061_1.isChecked() ? "1"
                : A4061_2.isChecked() ? "2"
                : A4061_DK.isChecked() ? "98"
                : A4061_RA.isChecked() ? "99"
                : "-1");

        //A4062
        json.put("A4062", A4062_1.isChecked() ? "1"
                : A4062_2.isChecked() ? "2"
                : A4062_DK.isChecked() ? "98"
                : A4062_RA.isChecked() ? "99"
                : "-1");

        //A4063
        json.put("A4063", A4063_1.isChecked() ? "1"
                : A4063_2.isChecked() ? "2"
                : A4063_DK.isChecked() ? "98"
                : A4063_RA.isChecked() ? "99"
                : "-1");

        //A4064u
        json.put("A4064u", A4064u_1.isChecked() ? "1"
                : A4064u_2.isChecked() ? "2"
                : A4064u_DK.isChecked() ? "98"
                : A4064u_RA.isChecked() ? "99"
                : "-1");

        //A4064_a
        json.put("A4064_a", ed_A4064_a.getText().toString().length() > 0 ? ed_A4064_a.getText().toString().trim() : "-1");

        //A4064_b
        json.put("A4064_b", ed_A4064_b.getText().toString().length() > 0 ? ed_A4064_b.getText().toString().trim() : "-1");

        //A4064_1
        json.put("A4064_1", A4064_1_1.isChecked() ? "1"
                : A4064_1_2.isChecked() ? "2"
                : A4064_1_DK.isChecked() ? "98"
                : A4064_1_RA.isChecked() ? "99"
                : "-1");

        //A4065
        json.put("A4065", A4065_1.isChecked() ? "1"
                : A4065_2.isChecked() ? "2"
                : A4065_DK.isChecked() ? "98"
                : A4065_RA.isChecked() ? "99"
                : "-1");

        //A4066
        json.put("A4066", A4066_1.isChecked() ? "1"
                : A4066_2.isChecked() ? "2"
                : A4066_DK.isChecked() ? "98"
                : A4066_RA.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4051) != false;
    }
}