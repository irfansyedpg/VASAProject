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

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4095_A4108 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next5;

    LinearLayout
            llA4095;

    CardView
            cvstudy_id,
            cvA4095,
            cvA4096,
            cvA4097u,
            cvA4097_a,
            cvA4097_b,
            cvA4098,
            cvA4099u,
            cvA4099_a,
            cvA4099_b,
            cvA4100,
            cvA4101u,
            cvA4101_a,
            cvA4101_b,
            cvA4102,
            cvA4103,
            cvA4104,
            cvA4105,
            cvA4106,
            cvA4107,
            cvA4108;

    RadioGroup
            A4095,
            A4096,
            A4097u,
            A4098,
            A4099u,
            A4100,
            A4101u,
            A4102,
            A4103,
            A4104,
            A4105,
            A4106,
            A4108;

    RadioButton
            rbA4095_1,
            rbA4095_2,
            rbA4095_DK,
            rbA4095_RA,
            rbA4096_1,
            rbA4096_2,
            rbA4096_DK,
            rbA4096_RA,
            rbA4097u_1,
            rbA4097u_2,
            rbA4097u_DK,
            rbA4097u_RA,
            rbA4098_1,
            rbA4098_2,
            rbA4098_DK,
            rbA4098_RA,
            rbA4099u_1,
            rbA4099u_2,
            rbA4099u_DK,
            rbA4099u_RA,
            rbA4100_1,
            rbA4100_2,
            rbA4100_DK,
            rbA4100_RA,
            rbA4101u_1,
            rbA4101u_2,
            rbA4101u_DK,
            rbA4101u_RA,
            rbA4102_1,
            rbA4102_2,
            rbA4102_DK,
            rbA4102_RA,
            rbA4103_1,
            rbA4103_2,
            rbA4103_DK,
            rbA4103_RA,
            rbA4104_1,
            rbA4104_2,
            rbA4104_DK,
            rbA4104_RA,
            rbA4105_1,
            rbA4105_2,
            rbA4105_DK,
            rbA4105_RA,
            rbA4106_1,
            rbA4106_2,
            rbA4106_DK,
            rbA4106_RA,
            rbA4108_1,
            rbA4108_2,
            rbA4108_DK,
            rbA4108_RA;

    EditText
            ed_study_id,
            ed_A4097_a,
            ed_A4097_b,
            ed_A4099_a,
            ed_A4099_b,
            ed_A4101_a,
            ed_A4101_b,
            ed_A4107;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next5 = findViewById(R.id.btn_next5);

        //LinearLayout
        llA4095 = findViewById(R.id.llA4095);

        //CardView
        cvA4095 = findViewById(R.id.cvA4095);
        cvA4096 = findViewById(R.id.cvA4096);
        cvA4097u = findViewById(R.id.cvA4097u);
        cvA4097_a = findViewById(R.id.cvA4097_a);
        cvA4097_b = findViewById(R.id.cvA4097_b);
        cvA4098 = findViewById(R.id.cvA4098);
        cvA4099u = findViewById(R.id.cvA4099u);
        cvA4099_a = findViewById(R.id.cvA4099_a);
        cvA4099_b = findViewById(R.id.cvA4099_b);
        cvA4100 = findViewById(R.id.cvA4100);
        cvA4101u = findViewById(R.id.cvA4101u);
        cvA4101_a = findViewById(R.id.cvA4101_a);
        cvA4101_b = findViewById(R.id.cvA4101_b);
        cvA4102 = findViewById(R.id.cvA4102);
        cvA4103 = findViewById(R.id.cvA4103);
        cvA4104 = findViewById(R.id.cvA4104);
        cvA4105 = findViewById(R.id.cvA4105);
        cvA4106 = findViewById(R.id.cvA4106);
        cvA4107 = findViewById(R.id.cvA4107);
        cvA4108 = findViewById(R.id.cvA4108);

        //RadioGroup
        A4095 = findViewById(R.id.A4095);
        A4096 = findViewById(R.id.A4096);
        A4097u = findViewById(R.id.A4097u);
        A4098 = findViewById(R.id.A4098);
        A4099u = findViewById(R.id.A4099u);
        A4100 = findViewById(R.id.A4100);
        A4101u = findViewById(R.id.A4101u);
        A4102 = findViewById(R.id.A4102);
        A4103 = findViewById(R.id.A4103);
        A4104 = findViewById(R.id.A4104);
        A4105 = findViewById(R.id.A4105);
        A4106 = findViewById(R.id.A4106);
        A4108 = findViewById(R.id.A4108);

        //Radio Button
        rbA4095_1 = findViewById(R.id.rbA4095_1);
        rbA4095_2 = findViewById(R.id.rbA4095_2);
        rbA4095_DK = findViewById(R.id.rbA4095_DK);
        rbA4095_RA = findViewById(R.id.rbA4095_RA);
        rbA4096_1 = findViewById(R.id.rbA4096_1);
        rbA4096_2 = findViewById(R.id.rbA4096_2);
        rbA4096_DK = findViewById(R.id.rbA4096_DK);
        rbA4096_RA = findViewById(R.id.rbA4096_RA);
        rbA4097u_1 = findViewById(R.id.rbA4097u_1);
        rbA4097u_2 = findViewById(R.id.rbA4097u_2);
        rbA4097u_DK = findViewById(R.id.rbA4097u_DK);
        rbA4097u_RA = findViewById(R.id.rbA4097u_RA);
        rbA4098_1 = findViewById(R.id.rbA4098_1);
        rbA4098_2 = findViewById(R.id.rbA4098_2);
        rbA4098_DK = findViewById(R.id.rbA4098_DK);
        rbA4098_RA = findViewById(R.id.rbA4098_RA);
        rbA4099u_1 = findViewById(R.id.rbA4099u_1);
        rbA4099u_2 = findViewById(R.id.rbA4099u_2);
        rbA4099u_DK = findViewById(R.id.rbA4099u_DK);
        rbA4099u_RA = findViewById(R.id.rbA4099u_RA);
        rbA4100_1 = findViewById(R.id.rbA4100_1);
        rbA4100_2 = findViewById(R.id.rbA4100_2);
        rbA4100_DK = findViewById(R.id.rbA4100_DK);
        rbA4100_RA = findViewById(R.id.rbA4100_RA);
        rbA4101u_1 = findViewById(R.id.rbA4101u_1);
        rbA4101u_2 = findViewById(R.id.rbA4101u_2);
        rbA4101u_DK = findViewById(R.id.rbA4101u_DK);
        rbA4101u_RA = findViewById(R.id.rbA4101u_RA);
        rbA4102_1 = findViewById(R.id.rbA4102_1);
        rbA4102_2 = findViewById(R.id.rbA4102_2);
        rbA4102_DK = findViewById(R.id.rbA4102_DK);
        rbA4102_RA = findViewById(R.id.rbA4102_RA);
        rbA4103_1 = findViewById(R.id.rbA4103_1);
        rbA4103_2 = findViewById(R.id.rbA4103_2);
        rbA4103_DK = findViewById(R.id.rbA4103_DK);
        rbA4103_RA = findViewById(R.id.rbA4103_RA);
        rbA4104_1 = findViewById(R.id.rbA4104_1);
        rbA4104_2 = findViewById(R.id.rbA4104_2);
        rbA4104_DK = findViewById(R.id.rbA4104_DK);
        rbA4104_RA = findViewById(R.id.rbA4104_RA);
        rbA4105_1 = findViewById(R.id.rbA4105_1);
        rbA4105_2 = findViewById(R.id.rbA4105_2);
        rbA4105_DK = findViewById(R.id.rbA4105_DK);
        rbA4105_RA = findViewById(R.id.rbA4105_RA);
        rbA4106_1 = findViewById(R.id.rbA4106_1);
        rbA4106_2 = findViewById(R.id.rbA4106_2);
        rbA4106_DK = findViewById(R.id.rbA4106_DK);
        rbA4106_RA = findViewById(R.id.rbA4106_RA);
        rbA4108_1 = findViewById(R.id.rbA4108_1);
        rbA4108_2 = findViewById(R.id.rbA4108_2);
        rbA4108_DK = findViewById(R.id.rbA4108_DK);
        rbA4108_RA = findViewById(R.id.rbA4108_RA);

        // Edit Text
        ed_A4097_a = findViewById(R.id.ed_A4097_a);
        ed_A4097_b = findViewById(R.id.ed_A4097_b);
        ed_A4099_a = findViewById(R.id.ed_A4099_a);
        ed_A4099_b = findViewById(R.id.ed_A4099_b);
        ed_A4101_a = findViewById(R.id.ed_A4101_a);
        ed_A4101_b = findViewById(R.id.ed_A4101_b);
        ed_A4107 = findViewById(R.id.ed_A4107);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4095__a4108);

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

        Intent c = new Intent(A4095_A4108.this, A4109_A4125.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rbA4096_1
                || compoundButton.getId() == R.id.rbA4096_2
                || compoundButton.getId() == R.id.rbA4096_DK
                || compoundButton.getId() == R.id.rbA4096_RA)

        {
            if (rbA4096_2.isChecked() || rbA4096_DK.isChecked() || rbA4096_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4097u);
                ClearAllcontrol.ClearAllC(cvA4097_a);
                ClearAllcontrol.ClearAllC(cvA4097_b);

                cvA4097u.setVisibility(View.GONE);
                cvA4097_a.setVisibility(View.GONE);
                cvA4097_b.setVisibility(View.GONE);

            } else {
                cvA4097u.setVisibility(View.VISIBLE);
                cvA4097_a.setVisibility(View.VISIBLE);
                cvA4097_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4097u_1
                || compoundButton.getId() == R.id.rbA4097u_2
                || compoundButton.getId() == R.id.rbA4097u_DK
                || compoundButton.getId() == R.id.rbA4097u_RA)

            ClearAllcontrol.ClearAllC(cvA4097_a);
        ClearAllcontrol.ClearAllC(cvA4097_b);

        cvA4097_a.setVisibility(View.GONE);
        cvA4097_b.setVisibility(View.GONE);

        {
            if (rbA4097u_1.isChecked()) {
                cvA4097_a.setVisibility(View.VISIBLE);
            } else if (rbA4097u_2.isChecked()) {
                cvA4097_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4098_1
                || compoundButton.getId() == R.id.rbA4098_2
                || compoundButton.getId() == R.id.rbA4098_DK
                || compoundButton.getId() == R.id.rbA4098_RA)

        {
            if (rbA4098_2.isChecked() || rbA4098_DK.isChecked() || rbA4098_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4099u);
                ClearAllcontrol.ClearAllC(cvA4099_a);
                ClearAllcontrol.ClearAllC(cvA4099_b);

                cvA4099u.setVisibility(View.GONE);
                cvA4099_a.setVisibility(View.GONE);
                cvA4099_b.setVisibility(View.GONE);

            } else {
                cvA4099u.setVisibility(View.VISIBLE);
                cvA4099_a.setVisibility(View.VISIBLE);
                cvA4099_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4099u_1
                || compoundButton.getId() == R.id.rbA4099u_2
                || compoundButton.getId() == R.id.rbA4099u_DK
                || compoundButton.getId() == R.id.rbA4099u_RA)

            ClearAllcontrol.ClearAllC(cvA4099_a);
        ClearAllcontrol.ClearAllC(cvA4099_b);

        cvA4099_a.setVisibility(View.GONE);
        cvA4099_b.setVisibility(View.GONE);

        {
            if (rbA4099u_1.isChecked()) {
                cvA4099_a.setVisibility(View.VISIBLE);
            } else if (rbA4099u_2.isChecked()) {
                cvA4099_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4100_1
                || compoundButton.getId() == R.id.rbA4100_2
                || compoundButton.getId() == R.id.rbA4100_DK
                || compoundButton.getId() == R.id.rbA4100_RA)

        {
            if (rbA4100_2.isChecked() || rbA4100_DK.isChecked() || rbA4100_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4101u);
                ClearAllcontrol.ClearAllC(cvA4101_a);
                ClearAllcontrol.ClearAllC(cvA4101_b);

                cvA4101u.setVisibility(View.GONE);
                cvA4101_a.setVisibility(View.GONE);
                cvA4101_b.setVisibility(View.GONE);

            } else {
                cvA4101u.setVisibility(View.VISIBLE);
                cvA4101_a.setVisibility(View.VISIBLE);
                cvA4101_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4101u_1
                || compoundButton.getId() == R.id.rbA4101u_2
                || compoundButton.getId() == R.id.rbA4101u_DK
                || compoundButton.getId() == R.id.rbA4101u_RA)

            ClearAllcontrol.ClearAllC(cvA4101_a);
        ClearAllcontrol.ClearAllC(cvA4101_b);

        cvA4101_a.setVisibility(View.GONE);
        cvA4101_b.setVisibility(View.GONE);

        {
            if (rbA4101u_1.isChecked()) {
                cvA4101_a.setVisibility(View.VISIBLE);
            } else if (rbA4101u_2.isChecked()) {
                cvA4101_b.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4102_1
                || compoundButton.getId() == R.id.rbA4102_2
                || compoundButton.getId() == R.id.rbA4102_DK
                || compoundButton.getId() == R.id.rbA4102_RA)

        {
            if (rbA4102_2.isChecked() || rbA4102_DK.isChecked() || rbA4102_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4103);
                ClearAllcontrol.ClearAllC(cvA4104);
                ClearAllcontrol.ClearAllC(cvA4105);

                cvA4103.setVisibility(View.GONE);
                cvA4104.setVisibility(View.GONE);
                cvA4105.setVisibility(View.GONE);

            } else {
                cvA4103.setVisibility(View.VISIBLE);
                cvA4104.setVisibility(View.VISIBLE);
                cvA4105.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.rbA4106_1
                || compoundButton.getId() == R.id.rbA4106_2
                || compoundButton.getId() == R.id.rbA4106_DK
                || compoundButton.getId() == R.id.rbA4106_RA)

        {
            if (rbA4106_2.isChecked() || rbA4106_DK.isChecked() || rbA4106_RA.isChecked()) {
                ClearAllcontrol.ClearAllC(cvA4107);
                ClearAllcontrol.ClearAllC(cvA4108);

                cvA4107.setVisibility(View.GONE);
                cvA4108.setVisibility(View.GONE);

            } else {
                cvA4107.setVisibility(View.VISIBLE);
                cvA4108.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next5.setOnClickListener(this);

        rbA4096_1.setOnCheckedChangeListener(this);
        rbA4096_2.setOnCheckedChangeListener(this);
        rbA4096_DK.setOnCheckedChangeListener(this);
        rbA4096_RA.setOnCheckedChangeListener(this);
        rbA4097u_1.setOnCheckedChangeListener(this);
        rbA4097u_2.setOnCheckedChangeListener(this);
        rbA4097u_DK.setOnCheckedChangeListener(this);
        rbA4097u_RA.setOnCheckedChangeListener(this);
        rbA4098_1.setOnCheckedChangeListener(this);
        rbA4098_2.setOnCheckedChangeListener(this);
        rbA4098_DK.setOnCheckedChangeListener(this);
        rbA4098_RA.setOnCheckedChangeListener(this);
        rbA4099u_1.setOnCheckedChangeListener(this);
        rbA4099u_2.setOnCheckedChangeListener(this);
        rbA4099u_DK.setOnCheckedChangeListener(this);
        rbA4099u_RA.setOnCheckedChangeListener(this);
        rbA4100_1.setOnCheckedChangeListener(this);
        rbA4100_2.setOnCheckedChangeListener(this);
        rbA4100_DK.setOnCheckedChangeListener(this);
        rbA4100_RA.setOnCheckedChangeListener(this);
        rbA4101u_1.setOnCheckedChangeListener(this);
        rbA4101u_2.setOnCheckedChangeListener(this);
        rbA4101u_DK.setOnCheckedChangeListener(this);
        rbA4101u_RA.setOnCheckedChangeListener(this);
        rbA4102_1.setOnCheckedChangeListener(this);
        rbA4102_2.setOnCheckedChangeListener(this);
        rbA4102_DK.setOnCheckedChangeListener(this);
        rbA4102_RA.setOnCheckedChangeListener(this);
        rbA4106_1.setOnCheckedChangeListener(this);
        rbA4106_2.setOnCheckedChangeListener(this);
        rbA4106_DK.setOnCheckedChangeListener(this);
        rbA4106_RA.setOnCheckedChangeListener(this);

        ed_A4097_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4097_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4099_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4099_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4101_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4101_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4107.setFilters(new InputFilter[]{new InputFilterMinMax(0, 60, 88, 99)});

    }

    void value_assignment() {

        study_id = "0";
        A4095 = "-1";
        A4096 = "-1";
        A4097u = "-1";
        A4097_a = "-1";
        A4097_b = "-1";
        A4098 = "-1";
        A4099u = "-1";
        A4099_a = "-1";
        A4099_b = "-1";
        A4100 = "-1";
        A4101u = "-1";
        A4101_a = "-1";
        A4101_b = "-1";
        A4102 = "-1";
        A4103 = "-1";
        A4104 = "-1";
        A4105 = "-1";
        A4106 = "-1";
        A4107 = "-1";
        A4108 = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4095
        if (rbA4095_1.isChecked()) {
            A4095 = "1";
        }
        if (rbA4095_2.isChecked()) {
            A4095 = "2";
        }
        if (rbA4095_DK.isChecked()) {
            A4095 = "9";
        }
        if (rbA4095_RA.isChecked()) {
            A4095 = "8";
        }

        //A4096
        if (rbA4096_1.isChecked()) {
            A4096 = "1";
        }
        if (rbA4096_2.isChecked()) {
            A4096 = "2";
        }
        if (rbA4096_DK.isChecked()) {
            A4096 = "9";
        }
        if (rbA4096_RA.isChecked()) {
            A4096 = "8";
        }

        //A4097u
        if (rbA4097u_1.isChecked()) {
            A4097u = "1";
        }
        if (rbA4097u_2.isChecked()) {
            A4097u = "2";
        }
        if (rbA4097u_DK.isChecked()) {
            A4097u = "9";
        }
        if (rbA4097u_RA.isChecked()) {
            A4097u = "8";
        }

        //A4097_a
        if (ed_A4097_a.getText().toString().trim().length() > 0) {
            A4097_a = ed_A4097_a.getText().toString().trim();
        }

        //A4097_b
        if (ed_A4097_b.getText().toString().trim().length() > 0) {
            A4097_b = ed_A4097_b.getText().toString().trim();
        }

        //A4098
        if (rbA4098_1.isChecked()) {
            A4098 = "1";
        }
        if (rbA4098_2.isChecked()) {
            A4098 = "2";
        }
        if (rbA4098_DK.isChecked()) {
            A4098 = "9";
        }
        if (rbA4098_RA.isChecked()) {
            A4098 = "8";
        }

        //A4099u
        if (rbA4099u_1.isChecked()) {
            A4099u = "1";
        }
        if (rbA4099u_2.isChecked()) {
            A4099u = "2";
        }
        if (rbA4099u_DK.isChecked()) {
            A4099u = "9";
        }
        if (rbA4099u_RA.isChecked()) {
            A4099u = "8";
        }

        //A4099_a
        if (ed_A4099_a.getText().toString().trim().length() > 0) {
            A4099_a = ed_A4099_a.getText().toString().trim();
        }

        //A4099_b
        if (ed_A4099_b.getText().toString().trim().length() > 0) {
            A4099_b = ed_A4099_b.getText().toString().trim();
        }

        //A4100
        if (rbA4100_1.isChecked()) {
            A4100 = "1";
        }
        if (rbA4100_2.isChecked()) {
            A4100 = "2";
        }
        if (rbA4100_DK.isChecked()) {
            A4100 = "9";
        }
        if (rbA4100_RA.isChecked()) {
            A4100 = "8";
        }

        //A4101u
        if (rbA4101u_1.isChecked()) {
            A4101u = "1";
        }
        if (rbA4101u_2.isChecked()) {
            A4101u = "2";
        }
        if (rbA4101u_DK.isChecked()) {
            A4101u = "9";
        }
        if (rbA4101u_RA.isChecked()) {
            A4101u = "8";
        }

        //A4101_a
        if (ed_A4101_a.getText().toString().trim().length() > 0) {
            A4101_a = ed_A4101_a.getText().toString().trim();
        }

        //A4101_b
        if (ed_A4101_b.getText().toString().trim().length() > 0) {
            A4101_b = ed_A4101_b.getText().toString().trim();
        }

        //A4102
        if (rbA4102_1.isChecked()) {
            A4102 = "1";
        }
        if (rbA4102_2.isChecked()) {
            A4102 = "2";
        }
        if (rbA4102_DK.isChecked()) {
            A4102 = "9";
        }
        if (rbA4102_RA.isChecked()) {
            A4102 = "8";
        }

        //A4103
        if (rbA4103_1.isChecked()) {
            A4103 = "1";
        }
        if (rbA4103_2.isChecked()) {
            A4103 = "2";
        }
        if (rbA4103_DK.isChecked()) {
            A4103 = "9";
        }
        if (rbA4103_RA.isChecked()) {
            A4103 = "8";
        }

        //A4104
        if (rbA4104_1.isChecked()) {
            A4104 = "1";
        }
        if (rbA4104_2.isChecked()) {
            A4104 = "2";
        }
        if (rbA4104_DK.isChecked()) {
            A4104 = "9";
        }
        if (rbA4104_RA.isChecked()) {
            A4104 = "8";
        }

        //A4105
        if (rbA4105_1.isChecked()) {
            A4105 = "1";
        }
        if (rbA4105_2.isChecked()) {
            A4105 = "2";
        }
        if (rbA4105_DK.isChecked()) {
            A4105 = "9";
        }
        if (rbA4105_RA.isChecked()) {
            A4105 = "8";
        }

        //A4106
        if (rbA4106_1.isChecked()) {
            A4106 = "1";
        }
        if (rbA4106_2.isChecked()) {
            A4106 = "2";
        }
        if (rbA4106_DK.isChecked()) {
            A4106 = "9";
        }
        if (rbA4106_RA.isChecked()) {
            A4106 = "8";
        }

        //A4107
        if (ed_A4107.getText().toString().trim().length() > 0) {
            A4107 = ed_A4107.getText().toString().trim();
        }

        //A4108
        if (rbA4108_1.isChecked()) {
            A4108 = "1";
        }
        if (rbA4108_2.isChecked()) {
            A4108 = "2";
        }
        if (rbA4108_DK.isChecked()) {
            A4108 = "9";
        }
        if (rbA4108_RA.isChecked()) {
            A4108 = "8";
        }
    }

    void insert_data() {

        String query = "insert into A4095_A4108("

                + Global.A.A4095_A4108.study_id + ","
                + Global.A.A4095_A4108.A4095 + ","
                + Global.A.A4095_A4108.A4096 + ","
                + Global.A.A4095_A4108.A4097u + ","
                + Global.A.A4095_A4108.A4097_a + ","
                + Global.A.A4095_A4108.A4097_b + ","
                + Global.A.A4095_A4108.A4098 + ","
                + Global.A.A4095_A4108.A4099u + ","
                + Global.A.A4095_A4108.A4099_a + ","
                + Global.A.A4095_A4108.A4099_b + ","
                + Global.A.A4095_A4108.A4100 + ","
                + Global.A.A4095_A4108.A4101u + ","
                + Global.A.A4095_A4108.A4101_a + ","
                + Global.A.A4095_A4108.A4101_b + ","
                + Global.A.A4095_A4108.A4102 + ","
                + Global.A.A4095_A4108.A4103 + ","
                + Global.A.A4095_A4108.A4104 + ","
                + Global.A.A4095_A4108.A4105 + ","
                + Global.A.A4095_A4108.A4106 + ","
                + Global.A.A4095_A4108.A4107 + ","
                + Global.A.A4095_A4108.A4108 + ","
                + Global.A.A4095_A4108.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4095 + "','" +
                A4096 + "','" +
                A4097u + "','" +
                A4097_a + "','" +
                A4097_b + "','" +
                A4098 + "','" +
                A4099u + "','" +
                A4099_a + "','" +
                A4099_b + "','" +
                A4100 + "','" +
                A4101u + "','" +
                A4101_a + "','" +
                A4101_b + "','" +
                A4102 + "','" +
                A4103 + "','" +
                A4104 + "','" +
                A4105 + "','" +
                A4106 + "','" +
                A4107 + "','" +
                A4108 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "5th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(cvstudy_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4095) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4096) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4097u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4097_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4097_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4098) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4099u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4099_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4099_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4100) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4101u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4101_a) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4101_b) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4102) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4103) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4104) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4105) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4106) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4107) == false) {
            return false;
        }

        return Gothrough.IamHiden(cvA4108) != false;
    }
}
