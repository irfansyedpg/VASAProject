package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4144_A4156 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next8;

    LinearLayout
            llA4144;

    CardView
            cvstudy_id,
            cvA4144,
            cvA4145,
            cvA4146,
            cvA4147,
            cvA4148,
            cvA4149,
            cvA4150u,
            cvA4150_a,
            cvA4150_b,
            cvA4151,
            cvA4152,
            cvA4153,
            cvA4154,
            cvA4155,
            cvA4156;

    RadioGroup
            A4144,
            A4145,
            A4146,
            A4147,
            A4148,
            A4149,
            A4150u,
            A4151,
            A4152,
            A4153,
            A4154,
            A4155,
            A4156;

    RadioButton
            rbA4144_1,
            rbA4144_2,
            rbA4144_DK,
            rbA4144_RA,
            rbA4145_1,
            rbA4145_2,
            rbA4145_DK,
            rbA4145_RA,
            rbA4146_1,
            rbA4146_2,
            rbA4146_DK,
            rbA4146_RA,
            rbA4147_1,
            rbA4147_2,
            rbA4147_DK,
            rbA4147_RA,
            rbA4148_1,
            rbA4148_2,
            rbA4148_3,
            rbA4148_4,
            rbA4148_5,
            rbA4148_6,
            rbA4148_7,
            rbA4148_10,
            rbA4148_DK,
            rbA4148_RA,
            rbA4149_1,
            rbA4149_2,
            rbA4149_DK,
            rbA4149_RA,
            rbA4150u_1,
            rbA4150u_2,
            rbA4150u_DK,
            rbA4150u_RA,
            rbA4151_1,
            rbA4151_2,
            rbA4151_3,
            rbA4152_1,
            rbA4152_2,
            rbA4152_DK,
            rbA4152_RA,
            rbA4153_1,
            rbA4153_2,
            rbA4153_DK,
            rbA4153_RA,
            rbA4154_1,
            rbA4154_2,
            rbA4154_DK,
            rbA4154_RA,
            rbA4155_1,
            rbA4155_2,
            rbA4155_DK,
            rbA4155_RA,
            rbA4156_1,
            rbA4156_2,
            rbA4156_DK,
            rbA4156_RA;

    EditText
            ed_study_id,
            ed_A4150_a,
            ed_A4150_b;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next8 = findViewById(R.id.btn_next8);

        //Linear Layout
        llA4144 = findViewById(R.id.llA4144);

        //CardView
        cvA4144 = findViewById(R.id.cvA4144);
        cvA4145 = findViewById(R.id.cvA4145);
        cvA4146 = findViewById(R.id.cvA4146);
        cvA4147 = findViewById(R.id.cvA4147);
        cvA4148 = findViewById(R.id.cvA4148);
        cvA4149 = findViewById(R.id.cvA4149);
        cvA4150u = findViewById(R.id.cvA4150u);
        cvA4150_a = findViewById(R.id.cvA4150_a);
        cvA4150_b = findViewById(R.id.cvA4150_b);
        cvA4151 = findViewById(R.id.cvA4151);
        cvA4152 = findViewById(R.id.cvA4152);
        cvA4153 = findViewById(R.id.cvA4153);
        cvA4154 = findViewById(R.id.cvA4154);
        cvA4155 = findViewById(R.id.cvA4155);
        cvA4156 = findViewById(R.id.cvA4156);

        //RadioGroup
        A4144 = findViewById(R.id.A4144);
        A4145 = findViewById(R.id.A4145);
        A4146 = findViewById(R.id.A4146);
        A4147 = findViewById(R.id.A4147);
        A4148 = findViewById(R.id.A4148);
        A4149 = findViewById(R.id.A4149);
        A4150u = findViewById(R.id.A4150u);
        A4151 = findViewById(R.id.A4151);
        A4152 = findViewById(R.id.A4152);
        A4153 = findViewById(R.id.A4153);
        A4154 = findViewById(R.id.A4154);
        A4155 = findViewById(R.id.A4155);
        A4156 = findViewById(R.id.A4156);

        //Radio Button
        rbA4144_1 = findViewById(R.id.rbA4144_1);
        rbA4144_2 = findViewById(R.id.rbA4144_2);
        rbA4144_DK = findViewById(R.id.rbA4144_DK);
        rbA4144_RA = findViewById(R.id.rbA4144_RA);
        rbA4145_1 = findViewById(R.id.rbA4145_1);
        rbA4145_2 = findViewById(R.id.rbA4145_2);
        rbA4145_DK = findViewById(R.id.rbA4145_DK);
        rbA4145_RA = findViewById(R.id.rbA4145_RA);
        rbA4146_1 = findViewById(R.id.rbA4146_1);
        rbA4146_2 = findViewById(R.id.rbA4146_2);
        rbA4146_DK = findViewById(R.id.rbA4146_DK);
        rbA4146_RA = findViewById(R.id.rbA4146_RA);
        rbA4147_1 = findViewById(R.id.rbA4147_1);
        rbA4147_2 = findViewById(R.id.rbA4147_2);
        rbA4147_DK = findViewById(R.id.rbA4147_DK);
        rbA4147_RA = findViewById(R.id.rbA4147_RA);
        rbA4148_1 = findViewById(R.id.rbA4148_1);
        rbA4148_2 = findViewById(R.id.rbA4148_2);
        rbA4148_3 = findViewById(R.id.rbA4148_3);
        rbA4148_4 = findViewById(R.id.rbA4148_4);
        rbA4148_5 = findViewById(R.id.rbA4148_5);
        rbA4148_6 = findViewById(R.id.rbA4148_6);
        rbA4148_7 = findViewById(R.id.rbA4148_7);
        rbA4148_10 = findViewById(R.id.rbA4148_10);
        rbA4148_DK = findViewById(R.id.rbA4148_DK);
        rbA4148_RA = findViewById(R.id.rbA4148_RA);
        rbA4149_1 = findViewById(R.id.rbA4149_1);
        rbA4149_2 = findViewById(R.id.rbA4149_2);
        rbA4149_DK = findViewById(R.id.rbA4149_DK);
        rbA4149_RA = findViewById(R.id.rbA4149_RA);
        rbA4150u_1 = findViewById(R.id.rbA4150u_1);
        rbA4150u_2 = findViewById(R.id.rbA4150u_2);
        rbA4150u_DK = findViewById(R.id.rbA4150u_DK);
        rbA4150u_RA = findViewById(R.id.rbA4150u_RA);
        rbA4151_1 = findViewById(R.id.rbA4151_1);
        rbA4151_2 = findViewById(R.id.rbA4151_2);
        rbA4151_3 = findViewById(R.id.rbA4151_3);
        rbA4152_1 = findViewById(R.id.rbA4152_1);
        rbA4152_2 = findViewById(R.id.rbA4152_2);
        rbA4152_DK = findViewById(R.id.rbA4152_DK);
        rbA4152_RA = findViewById(R.id.rbA4152_RA);
        rbA4153_1 = findViewById(R.id.rbA4153_1);
        rbA4153_2 = findViewById(R.id.rbA4153_2);
        rbA4153_DK = findViewById(R.id.rbA4153_DK);
        rbA4153_RA = findViewById(R.id.rbA4153_RA);
        rbA4154_1 = findViewById(R.id.rbA4154_1);
        rbA4154_2 = findViewById(R.id.rbA4154_2);
        rbA4154_DK = findViewById(R.id.rbA4154_DK);
        rbA4154_RA = findViewById(R.id.rbA4154_RA);
        rbA4155_1 = findViewById(R.id.rbA4155_1);
        rbA4155_2 = findViewById(R.id.rbA4155_2);
        rbA4155_DK = findViewById(R.id.rbA4155_DK);
        rbA4155_RA = findViewById(R.id.rbA4155_RA);
        rbA4156_1 = findViewById(R.id.rbA4156_1);
        rbA4156_2 = findViewById(R.id.rbA4156_2);
        rbA4156_DK = findViewById(R.id.rbA4156_DK);
        rbA4156_RA = findViewById(R.id.rbA4156_RA);

        // Edit Text
        ed_A4150_a = findViewById(R.id.ed_A4150_a);
        ed_A4150_b = findViewById(R.id.ed_A4150_b);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4144__a4156);

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

        Assignment_Insertion();
        Intent c = new Intent(A4144_A4156.this, A4157_A4205.class);
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

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rbA4146_1
                || compoundButton.getId() == R.id.rbA4146_2
                || compoundButton.getId() == R.id.rbA4146_DK
                || compoundButton.getId() == R.id.rbA4146_RA)

        {
            if (rbA4146_2.isChecked() || rbA4146_DK.isChecked() || rbA4146_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4147);
                ClearAllcontrol.ClearAllC(cvA4148);

                cvA4147.setVisibility(View.GONE);
                cvA4148.setVisibility(View.GONE);

            } else {
                cvA4147.setVisibility(View.VISIBLE);
                cvA4148.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4149_1
                || compoundButton.getId() == R.id.rbA4149_2
                || compoundButton.getId() == R.id.rbA4149_DK
                || compoundButton.getId() == R.id.rbA4149_RA)

        {
            if (rbA4149_2.isChecked() || rbA4149_DK.isChecked() || rbA4149_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4150u);
                ClearAllcontrol.ClearAllC(cvA4150_a);
                ClearAllcontrol.ClearAllC(cvA4150_b);
                ClearAllcontrol.ClearAllC(cvA4151);

                cvA4150u.setVisibility(View.GONE);
                cvA4150_a.setVisibility(View.GONE);
                cvA4150_b.setVisibility(View.GONE);
                cvA4151.setVisibility(View.GONE);

            } else {
                cvA4150u.setVisibility(View.VISIBLE);
                cvA4150_a.setVisibility(View.VISIBLE);
                cvA4150_b.setVisibility(View.VISIBLE);
                cvA4151.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4150u_1
                || compoundButton.getId() == R.id.rbA4150u_2
                || compoundButton.getId() == R.id.rbA4150u_DK
                || compoundButton.getId() == R.id.rbA4150u_RA)

            ClearAllcontrol.ClearAllC(cvA4150_a);
        ClearAllcontrol.ClearAllC(cvA4150_b);

        cvA4150_a.setVisibility(View.GONE);
        cvA4150_b.setVisibility(View.GONE);

        {
            if (rbA4150u_1.isChecked()) {
                cvA4150_a.setVisibility(View.VISIBLE);
            } else if (rbA4150u_2.isChecked()) {
                cvA4150_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4154_1
                || compoundButton.getId() == R.id.rbA4154_2
                || compoundButton.getId() == R.id.rbA4154_DK
                || compoundButton.getId() == R.id.rbA4154_RA)

        {
            if (rbA4154_2.isChecked() || rbA4154_DK.isChecked() || rbA4154_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4155);

                cvA4155.setVisibility(View.GONE);

            } else {
                cvA4155.setVisibility(View.VISIBLE);
            }
        }

    }


    private void events_calls() {

        btn_next8.setOnClickListener(this);

        rbA4146_1.setOnCheckedChangeListener(this);
        rbA4146_2.setOnCheckedChangeListener(this);
        rbA4146_DK.setOnCheckedChangeListener(this);
        rbA4146_RA.setOnCheckedChangeListener(this);
        rbA4149_1.setOnCheckedChangeListener(this);
        rbA4149_2.setOnCheckedChangeListener(this);
        rbA4149_DK.setOnCheckedChangeListener(this);
        rbA4149_RA.setOnCheckedChangeListener(this);
        rbA4150u_1.setOnCheckedChangeListener(this);
        rbA4150u_2.setOnCheckedChangeListener(this);
        rbA4150u_DK.setOnCheckedChangeListener(this);
        rbA4150u_RA.setOnCheckedChangeListener(this);
        rbA4154_1.setOnCheckedChangeListener(this);
        rbA4154_2.setOnCheckedChangeListener(this);
        rbA4154_DK.setOnCheckedChangeListener(this);
        rbA4154_RA.setOnCheckedChangeListener(this);

        ed_A4150_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4150_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() {

        study_id = "0";
        A4144 = "-1";
        A4145 = "-1";
        A4146 = "-1";
        A4147 = "-1";
        A4148 = "-1";
        A4149 = "-1";
        A4150u = "-1";
        A4150_a = "-1";
        A4150_b = "-1";
        A4151 = "-1";
        A4152 = "-1";
        A4153 = "-1";
        A4154 = "-1";
        A4155 = "-1";
        A4156 = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4144
        if (rbA4144_1.isChecked()) {
            A4144 = "1";
        }
        if (rbA4144_2.isChecked()) {
            A4144 = "2";
        }
        if (rbA4144_DK.isChecked()) {
            A4144 = "9";
        }
        if (rbA4144_RA.isChecked()) {
            A4144 = "8";
        }

        //A4145
        if (rbA4145_1.isChecked()) {
            A4145 = "1";
        }
        if (rbA4145_2.isChecked()) {
            A4145 = "2";
        }
        if (rbA4145_DK.isChecked()) {
            A4145 = "9";
        }
        if (rbA4145_RA.isChecked()) {
            A4145 = "8";
        }

        //A4146
        if (rbA4146_1.isChecked()) {
            A4146 = "1";
        }
        if (rbA4146_2.isChecked()) {
            A4146 = "2";
        }
        if (rbA4146_DK.isChecked()) {
            A4146 = "9";
        }
        if (rbA4146_RA.isChecked()) {
            A4146 = "8";
        }

        //A4147
        if (rbA4147_1.isChecked()) {
            A4147 = "1";
        }
        if (rbA4147_2.isChecked()) {
            A4147 = "2";
        }
        if (rbA4147_DK.isChecked()) {
            A4147 = "9";
        }
        if (rbA4147_RA.isChecked()) {
            A4147 = "8";
        }

        //A4148
        if (rbA4148_1.isChecked()) {
            A4148 = "1";
        }
        if (rbA4148_2.isChecked()) {
            A4148 = "2";
        }
        if (rbA4148_3.isChecked()) {
            A4148 = "3";
        }
        if (rbA4148_4.isChecked()) {
            A4148 = "4";
        }
        if (rbA4148_5.isChecked()) {
            A4148 = "5";
        }
        if (rbA4148_6.isChecked()) {
            A4148 = "6";
        }
        if (rbA4148_7.isChecked()) {
            A4148 = "7";
        }
        if (rbA4148_10.isChecked()) {
            A4148 = "10";
        }
        if (rbA4148_DK.isChecked()) {
            A4148 = "9";
        }
        if (rbA4148_RA.isChecked()) {
            A4148 = "8";
        }

        //A4149
        if (rbA4149_1.isChecked()) {
            A4149 = "1";
        }
        if (rbA4149_2.isChecked()) {
            A4149 = "2";
        }
        if (rbA4149_DK.isChecked()) {
            A4149 = "9";
        }
        if (rbA4149_RA.isChecked()) {
            A4149 = "8";
        }

        //A4150u
        if (rbA4150u_1.isChecked()) {
            A4150u = "1";
        }
        if (rbA4150u_2.isChecked()) {
            A4150u = "2";
        }
        if (rbA4150u_DK.isChecked()) {
            A4150u = "9";
        }
        if (rbA4150u_RA.isChecked()) {
            A4150u = "8";
        }

        //A4150_a
        if (ed_A4150_a.getText().toString().trim().length() > 0) {
            A4150_a = ed_A4150_a.getText().toString().trim();
        }

        //A4150_b
        if (ed_A4150_b.getText().toString().trim().length() > 0) {
            A4150_b = ed_A4150_b.getText().toString().trim();
        }

        //A4151
        if (rbA4151_1.isChecked()) {
            A4151 = "1";
        }
        if (rbA4151_2.isChecked()) {
            A4151 = "2";
        }
        if (rbA4151_3.isChecked()) {
            A4151 = "3";
        }

        //A4152
        if (rbA4152_1.isChecked()) {
            A4152 = "1";
        }
        if (rbA4152_2.isChecked()) {
            A4152 = "2";
        }
        if (rbA4152_DK.isChecked()) {
            A4152 = "9";
        }
        if (rbA4152_RA.isChecked()) {
            A4152 = "8";
        }

        //A4153
        if (rbA4153_1.isChecked()) {
            A4153 = "1";
        }
        if (rbA4153_2.isChecked()) {
            A4153 = "2";
        }
        if (rbA4153_DK.isChecked()) {
            A4153 = "9";
        }
        if (rbA4153_RA.isChecked()) {
            A4153 = "8";
        }

        //A4154
        if (rbA4154_1.isChecked()) {
            A4154 = "1";
        }
        if (rbA4154_2.isChecked()) {
            A4154 = "2";
        }
        if (rbA4154_DK.isChecked()) {
            A4154 = "9";
        }
        if (rbA4154_RA.isChecked()) {
            A4154 = "8";
        }

        //A4155
        if (rbA4155_1.isChecked()) {
            A4155 = "1";
        }
        if (rbA4155_2.isChecked()) {
            A4155 = "2";
        }
        if (rbA4155_DK.isChecked()) {
            A4155 = "9";
        }
        if (rbA4155_RA.isChecked()) {
            A4155 = "8";
        }

        //A4156
        if (rbA4156_1.isChecked()) {
            A4156 = "1";
        }
        if (rbA4156_2.isChecked()) {
            A4156 = "2";
        }
        if (rbA4156_DK.isChecked()) {
            A4156 = "9";
        }
        if (rbA4156_RA.isChecked()) {
            A4156 = "8";
        }
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4144) != false;
    }
}
