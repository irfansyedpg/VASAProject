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

public class A4051_A4066 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next2;

    LinearLayout
            llA4051;

    CardView
            cvstudy_id,
            cvA4051,
            cvA4052_u,
            cvA4052_b,
            cvA4052_c,
            cvA4053,
            cvA4054,
            cvA4055,
            cvA4056,
            cvA4057,
            cvA4058,
            cvA4059_u,
            cvA4059_a,
            cvA4059_b,
            cvA4060,
            cvA4061,
            cvA4062,
            cvA4063,
            cvA4064_u,
            cvA4064_a,
            cvA4064_b,
            cvA4064_1,
            cvA4065,
            cvA4066;

    RadioGroup
            A4051,
            A4052_u,
            A4053,
            A4054,
            A4055,
            A4056,
            A4057,
            A4058,
            A4059_u,
            A4060,
            A4061,
            A4062,
            A4063,
            A4064_u,
            A4064_1,
            A4065,
            A4066;

    RadioButton
            rb_A4051_1,
            rb_A4051_2,
            rb_A4051_DK,
            rb_A4051_RA,
            rb_A4052_u_1,
            rb_A4052_u_2,
            rb_A4052_u_DK,
            rb_A4052_u_RA,
            rb_A4053_1,
            rb_A4053_2,
            rb_A4053_DK,
            rb_A4053_RA,
            rb_A4054_1,
            rb_A4054_2,
            rb_A4054_3,
            rb_A4054_DK,
            rb_A4054_RA,
            rb_A4055_1,
            rb_A4055_2,
            rb_A4055_3,
            rb_A4055_DK,
            rb_A4055_RA,
            rb_A4056_1,
            rb_A4056_2,
            rb_A4056_DK,
            rb_A4056_RA,
            rb_A4057_1,
            rb_A4057_2,
            rb_A4057_DK,
            rb_A4057_RA,
            rb_A4058_1,
            rb_A4058_2,
            rb_A4058_DK,
            rb_A4058_RA,
            rb_A4059_u_1,
            rb_A4059_u_2,
            rb_A4059_u_DK,
            rb_A4059_u_RA,
            rb_A4060_1,
            rb_A4060_2,
            rb_A4060_DK,
            rb_A4060_RA,
            rb_A4061_1,
            rb_A4061_2,
            rb_A4061_DK,
            rb_A4061_RA,
            rb_A4062_1,
            rb_A4062_2,
            rb_A4062_DK,
            rb_A4062_RA,
            rb_A4063_1,
            rb_A4063_2,
            rb_A4063_DK,
            rb_A4063_RA,
            rb_A4064_u_1,
            rb_A4064_u_2,
            rb_A4064_u_DK,
            rb_A4064_u_RA,
            rb_A4064_1_1,
            rb_A4064_1_2,
            rb_A4064_1_DK,
            rb_A4064_1_RA,
            rb_A4065_1,
            rb_A4065_2,
            rb_A4065_DK,
            rb_A4065_RA,
            rb_A4066_1,
            rb_A4066_2,
            rb_A4066_DK,
            rb_A4066_RA;

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
        cvA4052_u = findViewById(R.id.cvA4052_u);
        cvA4052_b = findViewById(R.id.cvA4052_b);
        cvA4052_c = findViewById(R.id.cvA4052_c);
        cvA4053 = findViewById(R.id.cvA4053);
        cvA4054 = findViewById(R.id.cvA4054);
        cvA4055 = findViewById(R.id.cvA4055);
        cvA4056 = findViewById(R.id.cvA4056);
        cvA4057 = findViewById(R.id.cvA4057);
        cvA4058 = findViewById(R.id.cvA4058);
        cvA4059_u = findViewById(R.id.cvA4059_u);
        cvA4059_a = findViewById(R.id.cvA4059_a);
        cvA4059_b = findViewById(R.id.cvA4059_b);
        cvA4060 = findViewById(R.id.cvA4060);
        cvA4061 = findViewById(R.id.cvA4061);
        cvA4062 = findViewById(R.id.cvA4062);
        cvA4063 = findViewById(R.id.cvA4063);
        cvA4064_u = findViewById(R.id.cvA4064_u);
        cvA4064_a = findViewById(R.id.cvA4064_a);
        cvA4064_b = findViewById(R.id.cvA4064_b);
        cvA4064_1 = findViewById(R.id.cvA4064_1);
        cvA4065 = findViewById(R.id.cvA4065);
        cvA4066 = findViewById(R.id.cvA4066);

        //RadioGroup
        A4051 = findViewById(R.id.A4051);
        A4052_u = findViewById(R.id.A4052_u);
        A4053 = findViewById(R.id.A4053);
        A4054 = findViewById(R.id.A4054);
        A4055 = findViewById(R.id.A4055);
        A4056 = findViewById(R.id.A4056);
        A4057 = findViewById(R.id.A4057);
        A4058 = findViewById(R.id.A4058);
        A4059_u = findViewById(R.id.A4059_u);
        A4060 = findViewById(R.id.A4060);
        A4061 = findViewById(R.id.A4061);
        A4062 = findViewById(R.id.A4062);
        A4063 = findViewById(R.id.A4063);
        A4064_u = findViewById(R.id.A4064_u);
        A4064_1 = findViewById(R.id.A4064_1);
        A4065 = findViewById(R.id.A4065);
        A4066 = findViewById(R.id.A4066);

        //Radio Button
        rb_A4051_1 = findViewById(R.id.rb_A4051_1);
        rb_A4051_2 = findViewById(R.id.rb_A4051_2);
        rb_A4051_DK = findViewById(R.id.rb_A4051_DK);
        rb_A4051_RA = findViewById(R.id.rb_A4051_RA);
        rb_A4052_u_1 = findViewById(R.id.rb_A4052_u_1);
        rb_A4052_u_2 = findViewById(R.id.rb_A4052_u_2);
        rb_A4052_u_DK = findViewById(R.id.rb_A4052_u_DK);
        rb_A4052_u_RA = findViewById(R.id.rb_A4052_u_RA);
        rb_A4053_1 = findViewById(R.id.rb_A4053_1);
        rb_A4053_2 = findViewById(R.id.rb_A4053_2);
        rb_A4053_DK = findViewById(R.id.rb_A4053_DK);
        rb_A4053_RA = findViewById(R.id.rb_A4053_RA);
        rb_A4054_1 = findViewById(R.id.rb_A4054_1);
        rb_A4054_2 = findViewById(R.id.rb_A4054_2);
        rb_A4054_3 = findViewById(R.id.rb_A4054_3);
        rb_A4054_DK = findViewById(R.id.rb_A4054_DK);
        rb_A4054_RA = findViewById(R.id.rb_A4054_RA);
        rb_A4055_1 = findViewById(R.id.rb_A4055_1);
        rb_A4055_2 = findViewById(R.id.rb_A4055_2);
        rb_A4055_3 = findViewById(R.id.rb_A4055_3);
        rb_A4055_DK = findViewById(R.id.rb_A4055_DK);
        rb_A4055_RA = findViewById(R.id.rb_A4055_RA);
        rb_A4056_1 = findViewById(R.id.rb_A4056_1);
        rb_A4056_2 = findViewById(R.id.rb_A4056_2);
        rb_A4056_DK = findViewById(R.id.rb_A4056_DK);
        rb_A4056_RA = findViewById(R.id.rb_A4056_RA);
        rb_A4057_1 = findViewById(R.id.rb_A4057_1);
        rb_A4057_2 = findViewById(R.id.rb_A4057_2);
        rb_A4057_DK = findViewById(R.id.rb_A4057_DK);
        rb_A4057_RA = findViewById(R.id.rb_A4057_RA);
        rb_A4058_1 = findViewById(R.id.rb_A4058_1);
        rb_A4058_2 = findViewById(R.id.rb_A4058_2);
        rb_A4058_DK = findViewById(R.id.rb_A4058_DK);
        rb_A4058_RA = findViewById(R.id.rb_A4058_RA);
        rb_A4059_u_1 = findViewById(R.id.rb_A4059_u_1);
        rb_A4059_u_2 = findViewById(R.id.rb_A4059_u_2);
        rb_A4059_u_DK = findViewById(R.id.rb_A4059_u_DK);
        rb_A4059_u_RA = findViewById(R.id.rb_A4059_u_RA);
        rb_A4060_1 = findViewById(R.id.rb_A4060_1);
        rb_A4060_2 = findViewById(R.id.rb_A4060_2);
        rb_A4060_DK = findViewById(R.id.rb_A4060_DK);
        rb_A4060_RA = findViewById(R.id.rb_A4060_RA);
        rb_A4061_1 = findViewById(R.id.rb_A4061_1);
        rb_A4061_2 = findViewById(R.id.rb_A4061_2);
        rb_A4061_DK = findViewById(R.id.rb_A4061_DK);
        rb_A4061_RA = findViewById(R.id.rb_A4061_RA);
        rb_A4062_1 = findViewById(R.id.rb_A4062_1);
        rb_A4062_2 = findViewById(R.id.rb_A4062_2);
        rb_A4062_DK = findViewById(R.id.rb_A4062_DK);
        rb_A4062_RA = findViewById(R.id.rb_A4062_RA);
        rb_A4063_1 = findViewById(R.id.rb_A4063_1);
        rb_A4063_2 = findViewById(R.id.rb_A4063_2);
        rb_A4063_DK = findViewById(R.id.rb_A4063_DK);
        rb_A4063_RA = findViewById(R.id.rb_A4063_RA);
        rb_A4064_u_1 = findViewById(R.id.rb_A4064_u_1);
        rb_A4064_u_2 = findViewById(R.id.rb_A4064_u_2);
        rb_A4064_u_DK = findViewById(R.id.rb_A4064_u_DK);
        rb_A4064_u_RA = findViewById(R.id.rb_A4064_u_RA);
        rb_A4064_1_1 = findViewById(R.id.rb_A4064_1_1);
        rb_A4064_1_2 = findViewById(R.id.rb_A4064_1_2);
        rb_A4064_1_DK = findViewById(R.id.rb_A4064_1_DK);
        rb_A4064_1_RA = findViewById(R.id.rb_A4064_1_RA);
        rb_A4065_1 = findViewById(R.id.rb_A4065_1);
        rb_A4065_2 = findViewById(R.id.rb_A4065_2);
        rb_A4065_DK = findViewById(R.id.rb_A4065_DK);
        rb_A4065_RA = findViewById(R.id.rb_A4065_RA);
        rb_A4066_1 = findViewById(R.id.rb_A4066_1);
        rb_A4066_2 = findViewById(R.id.rb_A4066_2);
        rb_A4066_DK = findViewById(R.id.rb_A4066_DK);
        rb_A4066_RA = findViewById(R.id.rb_A4066_RA);

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
        setContentView(R.layout.a4051__a4066);

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

                if (checkedId == rb_A4051_1.getId()) {
                    cvA4052_u.setVisibility(View.VISIBLE);
                    cvA4052_b.setVisibility(View.VISIBLE);
                    cvA4052_c.setVisibility(View.VISIBLE);
                    cvA4053.setVisibility(View.VISIBLE);
                    cvA4054.setVisibility(View.VISIBLE);
                    cvA4055.setVisibility(View.VISIBLE);
                    cvA4056.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4052_u);
                    ClearAllcontrol.ClearAllC(cvA4052_b);
                    ClearAllcontrol.ClearAllC(cvA4052_c);
                    ClearAllcontrol.ClearAllC(cvA4053);
                    ClearAllcontrol.ClearAllC(cvA4054);
                    ClearAllcontrol.ClearAllC(cvA4055);
                    ClearAllcontrol.ClearAllC(cvA4056);

                    cvA4052_u.setVisibility(View.GONE);
                    cvA4052_b.setVisibility(View.GONE);
                    cvA4052_c.setVisibility(View.GONE);
                    cvA4053.setVisibility(View.GONE);
                    cvA4054.setVisibility(View.GONE);
                    cvA4055.setVisibility(View.GONE);
                    cvA4056.setVisibility(View.GONE);
                }
            }
        });


        A4052_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4052_b);
                ClearAllcontrol.ClearAllC(cvA4052_c);

                cvA4052_b.setVisibility(View.GONE);
                cvA4052_c.setVisibility(View.GONE);

                if (checkedId == rb_A4052_u_1.getId()) {
                    cvA4052_b.setVisibility(View.VISIBLE);
                } else if (checkedId == rb_A4052_u_2.getId()) {
                    cvA4052_c.setVisibility(View.VISIBLE);
                }

            }

        });


        A4058.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rb_A4058_1.getId()) {
                    cvA4059_u.setVisibility(View.VISIBLE);
                    cvA4059_a.setVisibility(View.VISIBLE);
                    cvA4059_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4059_u);
                    ClearAllcontrol.ClearAllC(cvA4059_a);
                    ClearAllcontrol.ClearAllC(cvA4059_b);

                    cvA4059_u.setVisibility(View.GONE);
                    cvA4059_a.setVisibility(View.GONE);
                    cvA4059_b.setVisibility(View.GONE);
                }

            }

        });


        A4059_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4059_a);
                ClearAllcontrol.ClearAllC(cvA4059_b);

                cvA4059_a.setVisibility(View.GONE);
                cvA4059_b.setVisibility(View.GONE);

                if (checkedId == rb_A4059_u_1.getId()) {
                    cvA4059_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rb_A4059_u_2.getId()) {
                    cvA4059_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4060.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rb_A4060_1.getId()) {
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

                if (checkedId == rb_A4062_1.getId()) {
                    cvA4063.setVisibility(View.VISIBLE);
                    cvA4064_u.setVisibility(View.VISIBLE);
                    cvA4064_a.setVisibility(View.VISIBLE);
                    cvA4064_b.setVisibility(View.VISIBLE);
                    cvA4064_1.setVisibility(View.VISIBLE);
                    cvA4065.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4063);
                    ClearAllcontrol.ClearAllC(cvA4064_u);
                    ClearAllcontrol.ClearAllC(cvA4064_a);
                    ClearAllcontrol.ClearAllC(cvA4064_b);
                    ClearAllcontrol.ClearAllC(cvA4064_1);
                    ClearAllcontrol.ClearAllC(cvA4065);

                    cvA4063.setVisibility(View.GONE);
                    cvA4064_u.setVisibility(View.GONE);
                    cvA4064_a.setVisibility(View.GONE);
                    cvA4064_b.setVisibility(View.GONE);
                    cvA4064_1.setVisibility(View.GONE);
                    cvA4065.setVisibility(View.GONE);
                }
            }
        });


        A4064_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4064_a);
                ClearAllcontrol.ClearAllC(cvA4064_b);

                cvA4064_a.setVisibility(View.GONE);
                cvA4064_b.setVisibility(View.GONE);

                if (checkedId == rb_A4064_u_1.getId()) {
                    cvA4064_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rb_A4064_u_2.getId()) {
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

        Intent c = new Intent(A4051_A4066.this, A4067_A4080.class);
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
        json.put("A4051", rb_A4051_1.isChecked() ? "1"
                : rb_A4051_2.isChecked() ? "2"
                : rb_A4051_DK.isChecked() ? "98"
                : rb_A4051_RA.isChecked() ? "99"
                : "-1");

        //A4052_u
        json.put("A4052_u", rb_A4052_u_1.isChecked() ? "1"
                : rb_A4052_u_2.isChecked() ? "2"
                : rb_A4052_u_DK.isChecked() ? "98"
                : rb_A4052_u_RA.isChecked() ? "99"
                : "-1");

        //A4052_b
        json.put("A4052_b", ed_A4052_b.getText().toString().length() > 0 ? ed_A4052_b.getText().toString().trim() : "-1");

        //A4052_c
        json.put("A4052_c", ed_A4052_c.getText().toString().length() > 0 ? ed_A4052_c.getText().toString().trim() : "-1");

        //A4053
        json.put("A4053", rb_A4053_1.isChecked() ? "1"
                : rb_A4053_2.isChecked() ? "2"
                : rb_A4053_DK.isChecked() ? "98"
                : rb_A4053_RA.isChecked() ? "99"
                : "-1");

        //A4054
        json.put("A4054", rb_A4054_1.isChecked() ? "1"
                : rb_A4054_2.isChecked() ? "2"
                : rb_A4054_3.isChecked() ? "3"
                : rb_A4054_DK.isChecked() ? "98"
                : rb_A4054_RA.isChecked() ? "99"
                : "-1");

        //A4055
        json.put("A4055", rb_A4055_1.isChecked() ? "1"
                : rb_A4055_2.isChecked() ? "2"
                : rb_A4055_3.isChecked() ? "3"
                : rb_A4055_DK.isChecked() ? "98"
                : rb_A4055_RA.isChecked() ? "99"
                : "-1");

        //A4056
        json.put("A4056", rb_A4056_1.isChecked() ? "1"
                : rb_A4056_2.isChecked() ? "2"
                : rb_A4056_DK.isChecked() ? "98"
                : rb_A4056_RA.isChecked() ? "99"
                : "-1");

        //A4057
        json.put("A4057", rb_A4057_1.isChecked() ? "1"
                : rb_A4057_2.isChecked() ? "2"
                : rb_A4057_DK.isChecked() ? "98"
                : rb_A4057_RA.isChecked() ? "99"
                : "-1");

        //A4058
        json.put("A4058", rb_A4058_1.isChecked() ? "1"
                : rb_A4058_2.isChecked() ? "2"
                : rb_A4058_DK.isChecked() ? "98"
                : rb_A4058_RA.isChecked() ? "99"
                : "-1");

        //A4059u
        json.put("A4059u", rb_A4059_u_1.isChecked() ? "1"
                : rb_A4059_u_2.isChecked() ? "2"
                : rb_A4059_u_DK.isChecked() ? "98"
                : rb_A4059_u_RA.isChecked() ? "99"
                : "-1");

        //A4059_a
        json.put("A4059_a", ed_A4059_a.getText().toString().length() > 0 ? ed_A4059_a.getText().toString().trim() : "-1");

        //A4059_b
        json.put("A4059_b", ed_A4059_b.getText().toString().length() > 0 ? ed_A4059_b.getText().toString().trim() : "-1");

        //A4060
        json.put("A4060", rb_A4060_1.isChecked() ? "1"
                : rb_A4060_2.isChecked() ? "2"
                : rb_A4060_DK.isChecked() ? "98"
                : rb_A4060_RA.isChecked() ? "99"
                : "-1");

        //A4061
        json.put("A4061", rb_A4061_1.isChecked() ? "1"
                : rb_A4061_2.isChecked() ? "2"
                : rb_A4061_DK.isChecked() ? "98"
                : rb_A4061_RA.isChecked() ? "99"
                : "-1");

        //A4062
        json.put("A4062", rb_A4062_1.isChecked() ? "1"
                : rb_A4062_2.isChecked() ? "2"
                : rb_A4062_DK.isChecked() ? "98"
                : rb_A4062_RA.isChecked() ? "99"
                : "-1");

        //A4063
        json.put("A4063", rb_A4063_1.isChecked() ? "1"
                : rb_A4063_2.isChecked() ? "2"
                : rb_A4063_DK.isChecked() ? "98"
                : rb_A4063_RA.isChecked() ? "99"
                : "-1");

        //A4064u
        json.put("A4064u", rb_A4064_u_1.isChecked() ? "1"
                : rb_A4064_u_2.isChecked() ? "2"
                : rb_A4064_u_DK.isChecked() ? "98"
                : rb_A4064_u_RA.isChecked() ? "99"
                : "-1");

        //A4064_a
        json.put("A4064_a", ed_A4064_a.getText().toString().length() > 0 ? ed_A4064_a.getText().toString().trim() : "-1");

        //A4064_b
        json.put("A4064_b", ed_A4064_b.getText().toString().length() > 0 ? ed_A4064_b.getText().toString().trim() : "-1");

        //A4064_1
        json.put("A4064_1", rb_A4064_1_1.isChecked() ? "1"
                : rb_A4064_1_2.isChecked() ? "2"
                : rb_A4064_1_DK.isChecked() ? "98"
                : rb_A4064_1_RA.isChecked() ? "99"
                : "-1");

        //A4065
        json.put("A4065", rb_A4065_1.isChecked() ? "1"
                : rb_A4065_2.isChecked() ? "2"
                : rb_A4065_DK.isChecked() ? "98"
                : rb_A4065_RA.isChecked() ? "99"
                : "-1");

        //A4066
        json.put("A4066", rb_A4066_1.isChecked() ? "1"
                : rb_A4066_2.isChecked() ? "2"
                : rb_A4066_DK.isChecked() ? "98"
                : rb_A4066_RA.isChecked() ? "99"
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