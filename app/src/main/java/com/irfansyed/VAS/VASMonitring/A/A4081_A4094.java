package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4081_A4094 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next4;

    LinearLayout
            cvstudy_id,
            llA4081,
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
            A4081,
            A4082u,
            A4082_a,
            A4082_b,
            A4082_c,
            A4083,
            A4084,
            A4085u,
            A4085_a,
            A4085_b,
            A4086,
            A4087u,
            A4087_a,
            A4087_b,
            A4088,
            A4089,
            A4090,
            A4091,
            A4092,
            A4093,
            A4094u,
            A4094_a,
            A4094_b,
            A4094_c,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next4 = findViewById(R.id.btn_next4);

        //Linear Layout
        llA4081 = findViewById(R.id.llA4081);

        //CardView
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
        setContentView(R.layout.a4081__a4094);

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

        value_assignment();
        insert_data();

        Intent c = new Intent(A4081_A4094.this, A4095_A4108.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rbA4081_1
                || compoundButton.getId() == R.id.rbA4081_2
                || compoundButton.getId() == R.id.rbA4081_DK
                || compoundButton.getId() == R.id.rbA4081_RA)

        {
            if (rbA4081_2.isChecked() || rbA4081_DK.isChecked() || rbA4081_RA.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4082u);
                ClearAllcontrol.ClearAll(cvA4082_a);
                ClearAllcontrol.ClearAll(cvA4082_b);
                ClearAllcontrol.ClearAll(cvA4082_c);
                ClearAllcontrol.ClearAll(cvA4083);

                cvA4082u.setVisibility(View.GONE);
                cvA4082_a.setVisibility(View.GONE);
                cvA4082_b.setVisibility(View.GONE);
                cvA4082_c.setVisibility(View.GONE);
                cvA4083.setVisibility(View.GONE);

            } else {
                cvA4082u.setVisibility(View.VISIBLE);
                cvA4082_a.setVisibility(View.VISIBLE);
                cvA4082_b.setVisibility(View.VISIBLE);
                cvA4082_c.setVisibility(View.VISIBLE);
                cvA4083.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4082u_1
                || compoundButton.getId() == R.id.rbA4082u_2
                || compoundButton.getId() == R.id.rbA4082u_DK
                || compoundButton.getId() == R.id.rbA4082u_RA)

            ClearAllcontrol.ClearAll(cvA4082_a);
        ClearAllcontrol.ClearAll(cvA4082_b);
        ClearAllcontrol.ClearAll(cvA4082_c);

        cvA4082_a.setVisibility(View.GONE);
        cvA4082_b.setVisibility(View.GONE);
        cvA4082_c.setVisibility(View.GONE);

        {
            if (rbA4082u_1.isChecked()) {
                cvA4082_a.setVisibility(View.VISIBLE);
            } else if (rbA4082u_2.isChecked()) {
                cvA4082_b.setVisibility(View.VISIBLE);
            } else if (rbA4082u_3.isChecked()) {
                cvA4082_c.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4084_1
                || compoundButton.getId() == R.id.rbA4084_2
                || compoundButton.getId() == R.id.rbA4084_DK
                || compoundButton.getId() == R.id.rbA4084_RA)

        {
            if (rbA4084_2.isChecked() || rbA4084_DK.isChecked() || rbA4084_RA.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4085u);
                ClearAllcontrol.ClearAll(cvA4085_a);
                ClearAllcontrol.ClearAll(cvA4085_b);

                cvA4085u.setVisibility(View.GONE);
                cvA4085_a.setVisibility(View.GONE);
                cvA4085_b.setVisibility(View.GONE);

            } else {
                cvA4085u.setVisibility(View.VISIBLE);
                cvA4085_a.setVisibility(View.VISIBLE);
                cvA4085_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4085u_1
                || compoundButton.getId() == R.id.rbA4085u_2
                || compoundButton.getId() == R.id.rbA4085u_DK
                || compoundButton.getId() == R.id.rbA4085u_RA)

            ClearAllcontrol.ClearAll(cvA4085_a);
        ClearAllcontrol.ClearAll(cvA4085_b);

        cvA4085_a.setVisibility(View.GONE);
        cvA4085_b.setVisibility(View.GONE);

        {
            if (rbA4085u_1.isChecked()) {
                cvA4085_a.setVisibility(View.VISIBLE);
            } else if (rbA4085u_2.isChecked()) {
                cvA4085_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4086_1
                || compoundButton.getId() == R.id.rbA4086_2
                || compoundButton.getId() == R.id.rbA4086_DK
                || compoundButton.getId() == R.id.rbA4086_RA)

        {
            if (rbA4086_2.isChecked() || rbA4086_DK.isChecked() || rbA4086_RA.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4087u);
                ClearAllcontrol.ClearAll(cvA4087_a);
                ClearAllcontrol.ClearAll(cvA4087_b);
                ClearAllcontrol.ClearAll(cvA4088);
                ClearAllcontrol.ClearAll(cvA4089);

                cvA4087u.setVisibility(View.GONE);
                cvA4087_a.setVisibility(View.GONE);
                cvA4087_b.setVisibility(View.GONE);
                cvA4088.setVisibility(View.GONE);
                cvA4089.setVisibility(View.GONE);

            } else {
                cvA4087u.setVisibility(View.VISIBLE);
                cvA4087_a.setVisibility(View.VISIBLE);
                cvA4087_b.setVisibility(View.VISIBLE);
                cvA4088.setVisibility(View.VISIBLE);
                cvA4089.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4087u_1
                || compoundButton.getId() == R.id.rbA4087u_2
                || compoundButton.getId() == R.id.rbA4087u_DK
                || compoundButton.getId() == R.id.rbA4087u_RA)

            ClearAllcontrol.ClearAll(cvA4087_a);
        ClearAllcontrol.ClearAll(cvA4087_b);

        cvA4087_a.setVisibility(View.GONE);
        cvA4087_b.setVisibility(View.GONE);

        {
            if (rbA4087u_1.isChecked()) {
                cvA4087_a.setVisibility(View.VISIBLE);
            } else if (rbA4087u_2.isChecked()) {
                cvA4087_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4091_1
                || compoundButton.getId() == R.id.rbA4091_2
                || compoundButton.getId() == R.id.rbA4091_DK
                || compoundButton.getId() == R.id.rbA4091_RA)

        {
            if (rbA4091_2.isChecked() || rbA4091_DK.isChecked() || rbA4091_RA.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4092);
                ClearAllcontrol.ClearAll(cvA4093);
                ClearAllcontrol.ClearAll(cvA4094u);
                ClearAllcontrol.ClearAll(cvA4094_a);
                ClearAllcontrol.ClearAll(cvA4094_b);
                ClearAllcontrol.ClearAll(cvA4094_c);

                cvA4092.setVisibility(View.GONE);
                cvA4093.setVisibility(View.GONE);
                cvA4094u.setVisibility(View.GONE);
                cvA4094_a.setVisibility(View.GONE);
                cvA4094_b.setVisibility(View.GONE);
                cvA4094_c.setVisibility(View.GONE);

            } else {
                cvA4092.setVisibility(View.VISIBLE);
                cvA4093.setVisibility(View.VISIBLE);
                cvA4094u.setVisibility(View.VISIBLE);
                cvA4094_a.setVisibility(View.VISIBLE);
                cvA4094_b.setVisibility(View.VISIBLE);
                cvA4094_c.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4094u_1
                || compoundButton.getId() == R.id.rbA4094u_2
                || compoundButton.getId() == R.id.rbA4094u_3
                || compoundButton.getId() == R.id.rbA4094u_DK
                || compoundButton.getId() == R.id.rbA4094u_RA)

            ClearAllcontrol.ClearAll(cvA4094_a);
        ClearAllcontrol.ClearAll(cvA4094_b);
        ClearAllcontrol.ClearAll(cvA4094_c);

        cvA4094_a.setVisibility(View.GONE);
        cvA4094_b.setVisibility(View.GONE);
        cvA4094_c.setVisibility(View.GONE);

        {
            if (rbA4094u_1.isChecked()) {
                cvA4094_a.setVisibility(View.VISIBLE);
            } else if (rbA4094u_2.isChecked()) {
                cvA4094_b.setVisibility(View.VISIBLE);
            } else if (rbA4094u_3.isChecked()) {
                cvA4094_c.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next4.setOnClickListener(this);

        rbA4081_1.setOnCheckedChangeListener(this);
        rbA4081_2.setOnCheckedChangeListener(this);
        rbA4081_DK.setOnCheckedChangeListener(this);
        rbA4081_RA.setOnCheckedChangeListener(this);
        rbA4082u_1.setOnCheckedChangeListener(this);
        rbA4082u_2.setOnCheckedChangeListener(this);
        rbA4082u_3.setOnCheckedChangeListener(this);
        rbA4082u_DK.setOnCheckedChangeListener(this);
        rbA4082u_RA.setOnCheckedChangeListener(this);
        rbA4084_1.setOnCheckedChangeListener(this);
        rbA4084_2.setOnCheckedChangeListener(this);
        rbA4084_DK.setOnCheckedChangeListener(this);
        rbA4084_RA.setOnCheckedChangeListener(this);
        rbA4085u_1.setOnCheckedChangeListener(this);
        rbA4085u_2.setOnCheckedChangeListener(this);
        rbA4085u_DK.setOnCheckedChangeListener(this);
        rbA4085u_RA.setOnCheckedChangeListener(this);
        rbA4086_1.setOnCheckedChangeListener(this);
        rbA4086_2.setOnCheckedChangeListener(this);
        rbA4086_DK.setOnCheckedChangeListener(this);
        rbA4086_RA.setOnCheckedChangeListener(this);
        rbA4087u_1.setOnCheckedChangeListener(this);
        rbA4087u_2.setOnCheckedChangeListener(this);
        rbA4087u_DK.setOnCheckedChangeListener(this);
        rbA4087u_RA.setOnCheckedChangeListener(this);
        rbA4091_1.setOnCheckedChangeListener(this);
        rbA4091_2.setOnCheckedChangeListener(this);
        rbA4091_DK.setOnCheckedChangeListener(this);
        rbA4091_RA.setOnCheckedChangeListener(this);
        rbA4094u_1.setOnCheckedChangeListener(this);
        rbA4094u_2.setOnCheckedChangeListener(this);
        rbA4094u_3.setOnCheckedChangeListener(this);
        rbA4094u_DK.setOnCheckedChangeListener(this);
        rbA4094u_RA.setOnCheckedChangeListener(this);

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

    void value_assignment() {

        study_id = "0";
        A4081 = "-1";
        A4082u = "-1";
        A4082_a = "-1";
        A4082_b = "-1";
        A4082_c = "-1";
        A4083 = "-1";
        A4084 = "-1";
        A4085u = "-1";
        A4085_a = "-1";
        A4085_b = "-1";
        A4086 = "-1";
        A4087u = "-1";
        A4087_a = "-1";
        A4087_b = "-1";
        A4088 = "-1";
        A4089 = "-1";
        A4090 = "-1";
        A4091 = "-1";
        A4092 = "-1";
        A4093 = "-1";
        A4094u = "-1";
        A4094_a = "-1";
        A4094_b = "-1";
        A4094_c = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4081
        if (rbA4081_1.isChecked()) {
            A4081 = "1";
        }
        if (rbA4081_2.isChecked()) {
            A4081 = "2";
        }
        if (rbA4081_DK.isChecked()) {
            A4081 = "9";
        }
        if (rbA4081_RA.isChecked()) {
            A4081 = "8";
        }

        //A4082u
        if (rbA4082u_1.isChecked()) {
            A4082u = "1";
        }
        if (rbA4082u_2.isChecked()) {
            A4082u = "2";
        }
        if (rbA4082u_3.isChecked()) {
            A4082u = "3";
        }
        if (rbA4082u_DK.isChecked()) {
            A4082u = "9";
        }
        if (rbA4082u_RA.isChecked()) {
            A4082u = "8";
        }

        //A4082_a
        if (ed_A4082_a.getText().toString().trim().length() > 0) {
            A4082_a = ed_A4082_a.getText().toString().trim();
        }

        //A4082_b
        if (ed_A4082_b.getText().toString().trim().length() > 0) {
            A4082_b = ed_A4082_b.getText().toString().trim();
        }

        //A4082_c
        if (ed_A4082_c.getText().toString().trim().length() > 0) {
            A4082_c = ed_A4082_c.getText().toString().trim();
        }

        //A4083
        if (rbA4083_1.isChecked()) {
            A4083 = "1";
        }
        if (rbA4083_2.isChecked()) {
            A4083 = "2";
        }
        if (rbA4083_DK.isChecked()) {
            A4083 = "9";
        }
        if (rbA4083_RA.isChecked()) {
            A4083 = "8";
        }

        //A4084
        if (rbA4084_1.isChecked()) {
            A4084 = "1";
        }
        if (rbA4084_2.isChecked()) {
            A4084 = "2";
        }
        if (rbA4084_DK.isChecked()) {
            A4084 = "9";
        }
        if (rbA4084_RA.isChecked()) {
            A4084 = "8";
        }

        //A4085u
        if (rbA4085u_1.isChecked()) {
            A4085u = "1";
        }
        if (rbA4085u_2.isChecked()) {
            A4085u = "2";
        }
        if (rbA4085u_DK.isChecked()) {
            A4085u = "9";
        }
        if (rbA4085u_RA.isChecked()) {
            A4085u = "8";
        }

        //A4085_a
        if (ed_A4085_a.getText().toString().trim().length() > 0) {
            A4085_a = ed_A4085_a.getText().toString().trim();
        }

        //A4085_b
        if (ed_A4085_b.getText().toString().trim().length() > 0) {
            A4085_b = ed_A4085_b.getText().toString().trim();
        }

        //A4086
        if (rbA4086_1.isChecked()) {
            A4086 = "1";
        }
        if (rbA4086_2.isChecked()) {
            A4086 = "2";
        }
        if (rbA4086_DK.isChecked()) {
            A4086 = "9";
        }
        if (rbA4086_RA.isChecked()) {
            A4086 = "8";
        }

        //A4087u
        if (rbA4087u_1.isChecked()) {
            A4087u = "1";
        }
        if (rbA4087u_2.isChecked()) {
            A4087u = "2";
        }
        if (rbA4087u_DK.isChecked()) {
            A4087u = "9";
        }
        if (rbA4087u_RA.isChecked()) {
            A4087u = "8";
        }

        //A4087_a
        if (ed_A4087_a.getText().toString().trim().length() > 0) {
            A4087_a = ed_A4087_a.getText().toString().trim();
        }

        //A4087_b
        if (ed_A4087_b.getText().toString().trim().length() > 0) {
            A4087_b = ed_A4087_b.getText().toString().trim();
        }

        //A4088
        if (rbA4088_1.isChecked()) {
            A4088 = "1";
        }
        if (rbA4088_2.isChecked()) {
            A4088 = "2";
        }
        if (rbA4088_DK.isChecked()) {
            A4088 = "9";
        }
        if (rbA4088_RA.isChecked()) {
            A4088 = "8";
        }

        //A4089
        if (rbA4089_1.isChecked()) {
            A4089 = "1";
        }
        if (rbA4089_2.isChecked()) {
            A4089 = "2";
        }
        if (rbA4089_DK.isChecked()) {
            A4089 = "9";
        }
        if (rbA4089_RA.isChecked()) {
            A4089 = "8";
        }

        //A4090
        if (rbA4090_1.isChecked()) {
            A4090 = "1";
        }
        if (rbA4090_2.isChecked()) {
            A4090 = "2";
        }
        if (rbA4090_DK.isChecked()) {
            A4090 = "9";
        }
        if (rbA4090_RA.isChecked()) {
            A4090 = "8";
        }

        //A4091
        if (rbA4091_1.isChecked()) {
            A4091 = "1";
        }
        if (rbA4091_2.isChecked()) {
            A4091 = "2";
        }
        if (rbA4091_DK.isChecked()) {
            A4091 = "9";
        }
        if (rbA4091_RA.isChecked()) {
            A4091 = "8";
        }

        //A4092
        if (rbA4092_1.isChecked()) {
            A4092 = "1";
        }
        if (rbA4092_2.isChecked()) {
            A4092 = "2";
        }
        if (rbA4092_DK.isChecked()) {
            A4092 = "9";
        }
        if (rbA4092_RA.isChecked()) {
            A4092 = "8";
        }

        //A4093
        if (ed_A4093.getText().toString().trim().length() > 0) {
            A4093 = ed_A4093.getText().toString().trim();
        }

        //A4094u
        if (rbA4094u_1.isChecked()) {
            A4094u = "1";
        }
        if (rbA4094u_2.isChecked()) {
            A4094u = "2";
        }
        if (rbA4094u_3.isChecked()) {
            A4094u = "3";
        }
        if (rbA4094u_DK.isChecked()) {
            A4094u = "9";
        }
        if (rbA4094u_RA.isChecked()) {
            A4094u = "8";
        }

        //A4094_a
        if (ed_A4094_a.getText().toString().trim().length() > 0) {
            A4094_a = ed_A4094_a.getText().toString().trim();
        }

        //A4094_b
        if (ed_A4094_b.getText().toString().trim().length() > 0) {
            A4094_b = ed_A4094_b.getText().toString().trim();
        }

        //A4094_c
        if (ed_A4094_c.getText().toString().trim().length() > 0) {
            A4094_c = ed_A4094_c.getText().toString().trim();
        }

    }

    void insert_data() {

        String query = "insert into A4081_A4094("

                + Global.A.A4081_A4094.study_id + ","
                + Global.A.A4081_A4094.A4081 + ","
                + Global.A.A4081_A4094.A4082u + ","
                + Global.A.A4081_A4094.A4082_a + ","
                + Global.A.A4081_A4094.A4082_b + ","
                + Global.A.A4081_A4094.A4082_c + ","
                + Global.A.A4081_A4094.A4083 + ","
                + Global.A.A4081_A4094.A4084 + ","
                + Global.A.A4081_A4094.A4085u + ","
                + Global.A.A4081_A4094.A4085_a + ","
                + Global.A.A4081_A4094.A4085_b + ","
                + Global.A.A4081_A4094.A4086 + ","
                + Global.A.A4081_A4094.A4087u + ","
                + Global.A.A4081_A4094.A4087_a + ","
                + Global.A.A4081_A4094.A4087_b + ","
                + Global.A.A4081_A4094.A4088 + ","
                + Global.A.A4081_A4094.A4089 + ","
                + Global.A.A4081_A4094.A4090 + ","
                + Global.A.A4081_A4094.A4091 + ","
                + Global.A.A4081_A4094.A4092 + ","
                + Global.A.A4081_A4094.A4093 + ","
                + Global.A.A4081_A4094.A4094u + ","
                + Global.A.A4081_A4094.A4094_a + ","
                + Global.A.A4081_A4094.A4094_b + ","
                + Global.A.A4081_A4094.A4094_c + ","
                + Global.A.A4081_A4094.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4081 + "','" +
                A4082u + "','" +
                A4082_a + "','" +
                A4082_b + "','" +
                A4082_c + "','" +
                A4083 + "','" +
                A4084 + "','" +
                A4085u + "','" +
                A4085_a + "','" +
                A4085_b + "','" +
                A4086 + "','" +
                A4087u + "','" +
                A4087_a + "','" +
                A4087_b + "','" +
                A4088 + "','" +
                A4089 + "','" +
                A4090 + "','" +
                A4091 + "','" +
                A4092 + "','" +
                A4093 + "','" +
                A4094u + "','" +
                A4094_a + "','" +
                A4094_b + "','" +
                A4094_c + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "4th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4081) != false;
    }
}
