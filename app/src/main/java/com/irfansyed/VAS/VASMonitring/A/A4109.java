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

public class A4109 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next6;

    LinearLayout
            llA4109;
    CardView
            cvstudy_id,
            cvA4109,
            cvA4110,
            cvA4111,
            cvA4112,
            cvA4113,
            cvA4114,
            cvA4115,
            cvA4116,
            cvA4117u,
            cvA4117_a,
            cvA4117_b,
            cvA4118,
            cvA4119,
            cvA4120,
            cvA4121,
            cvA4122,
            cvA4123,
            cvA4124,
            cvA4125;

    RadioGroup
            A4109,
            A4110,
            A4111,
            A4112,
            A4113,
            A4114,
            A4115,
            A4116,
            A4117u,
            A4118,
            A4119,
            A4120,
            A4122,
            A4123,
            A4124,
            A4125;


    RadioButton
            rbA4109_1,
            rbA4109_2,
            rbA4109_DK,
            rbA4109_RA,
            rbA4110_1,
            rbA4110_2,
            rbA4110_DK,
            rbA4110_RA,
            rbA4111_1,
            rbA4111_2,
            rbA4111_DK,
            rbA4111_RA,
            rbA4112_1,
            rbA4112_2,
            rbA4112_DK,
            rbA4112_RA,
            rbA4113_1,
            rbA4113_2,
            rbA4113_DK,
            rbA4113_RA,
            rbA4114_1,
            rbA4114_2,
            rbA4114_DK,
            rbA4114_RA,
            rbA4115_1,
            rbA4115_2,
            rbA4115_DK,
            rbA4115_RA,
            rbA4116_1,
            rbA4116_2,
            rbA4116_DK,
            rbA4116_RA,
            rbA4117u_1,
            rbA4117u_2,
            rbA4117u_DK,
            rbA4117u_RA,
            rbA4118_1,
            rbA4118_2,
            rbA4118_DK,
            rbA4118_RA,
            rbA4119_1,
            rbA4119_2,
            rbA4119_3,
            rbA4119_4,
            rbA4119_DK,
            rbA4119_RA,
            rbA4120_1,
            rbA4120_2,
            rbA4120_3,
            rbA4120_4,
            rbA4120_DK,
            rbA4120_RA,
            rbA4122_1,
            rbA4122_2,
            rbA4122_DK,
            rbA4122_RA,
            rbA4123_1,
            rbA4123_2,
            rbA4123_DK,
            rbA4123_RA,
            rbA4124_1,
            rbA4124_2,
            rbA4124_DK,
            rbA4124_RA,
            rbA4125_1,
            rbA4125_2,
            rbA4125_DK,
            rbA4125_RA;

    EditText
            ed_study_id,
            ed_A4107,
            ed_A4117_a,
            ed_A4117_b,
            ed_A4121;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next6 = findViewById(R.id.btn_next6);

        //Linear Layout
        llA4109 = findViewById(R.id.llA4109);

        //CardView
        cvA4109 = findViewById(R.id.cvA4109);
        cvA4110 = findViewById(R.id.cvA4110);
        cvA4111 = findViewById(R.id.cvA4111);
        cvA4112 = findViewById(R.id.cvA4112);
        cvA4113 = findViewById(R.id.cvA4113);
        cvA4114 = findViewById(R.id.cvA4114);
        cvA4115 = findViewById(R.id.cvA4115);
        cvA4116 = findViewById(R.id.cvA4116);
        cvA4117u = findViewById(R.id.cvA4117u);
        cvA4117_a = findViewById(R.id.cvA4117_a);
        cvA4117_b = findViewById(R.id.cvA4117_b);
        cvA4118 = findViewById(R.id.cvA4118);
        cvA4119 = findViewById(R.id.cvA4119);
        cvA4120 = findViewById(R.id.cvA4120);
        cvA4121 = findViewById(R.id.cvA4121);
        cvA4122 = findViewById(R.id.cvA4122);
        cvA4123 = findViewById(R.id.cvA4123);
        cvA4124 = findViewById(R.id.cvA4124);
        cvA4125 = findViewById(R.id.cvA4125);

        //RadioGroup
        A4109 = findViewById(R.id.A4109);
        A4110 = findViewById(R.id.A4110);
        A4111 = findViewById(R.id.A4111);
        A4112 = findViewById(R.id.A4112);
        A4113 = findViewById(R.id.A4113);
        A4114 = findViewById(R.id.A4114);
        A4115 = findViewById(R.id.A4115);
        A4116 = findViewById(R.id.A4116);
        A4117u = findViewById(R.id.A4117u);
        A4118 = findViewById(R.id.A4118);
        A4119 = findViewById(R.id.A4119);
        A4120 = findViewById(R.id.A4120);
        A4122 = findViewById(R.id.A4122);
        A4123 = findViewById(R.id.A4123);
        A4124 = findViewById(R.id.A4124);
        A4125 = findViewById(R.id.A4125);

        //Radio Button
        rbA4109_1 = findViewById(R.id.rbA4109_1);
        rbA4109_2 = findViewById(R.id.rbA4109_2);
        rbA4109_DK = findViewById(R.id.rbA4109_DK);
        rbA4109_RA = findViewById(R.id.rbA4109_RA);
        rbA4110_1 = findViewById(R.id.rbA4110_1);
        rbA4110_2 = findViewById(R.id.rbA4110_2);
        rbA4110_DK = findViewById(R.id.rbA4110_DK);
        rbA4110_RA = findViewById(R.id.rbA4110_RA);
        rbA4111_1 = findViewById(R.id.rbA4111_1);
        rbA4111_2 = findViewById(R.id.rbA4111_2);
        rbA4111_DK = findViewById(R.id.rbA4111_DK);
        rbA4111_RA = findViewById(R.id.rbA4111_RA);
        rbA4112_1 = findViewById(R.id.rbA4112_1);
        rbA4112_2 = findViewById(R.id.rbA4112_2);
        rbA4112_DK = findViewById(R.id.rbA4112_DK);
        rbA4112_RA = findViewById(R.id.rbA4112_RA);
        rbA4113_1 = findViewById(R.id.rbA4113_1);
        rbA4113_2 = findViewById(R.id.rbA4113_2);
        rbA4113_DK = findViewById(R.id.rbA4113_DK);
        rbA4113_RA = findViewById(R.id.rbA4113_RA);
        rbA4114_1 = findViewById(R.id.rbA4114_1);
        rbA4114_2 = findViewById(R.id.rbA4114_2);
        rbA4114_DK = findViewById(R.id.rbA4114_DK);
        rbA4114_RA = findViewById(R.id.rbA4114_RA);
        rbA4115_1 = findViewById(R.id.rbA4115_1);
        rbA4115_2 = findViewById(R.id.rbA4115_2);
        rbA4115_DK = findViewById(R.id.rbA4115_DK);
        rbA4115_RA = findViewById(R.id.rbA4115_RA);
        rbA4116_1 = findViewById(R.id.rbA4116_1);
        rbA4116_2 = findViewById(R.id.rbA4116_2);
        rbA4116_DK = findViewById(R.id.rbA4116_DK);
        rbA4116_RA = findViewById(R.id.rbA4116_RA);
        rbA4117u_1 = findViewById(R.id.rbA4117u_1);
        rbA4117u_2 = findViewById(R.id.rbA4117u_2);
        rbA4117u_DK = findViewById(R.id.rbA4117u_DK);
        rbA4117u_RA = findViewById(R.id.rbA4117u_RA);
        rbA4118_1 = findViewById(R.id.rbA4118_1);
        rbA4118_2 = findViewById(R.id.rbA4118_2);
        rbA4118_DK = findViewById(R.id.rbA4118_DK);
        rbA4118_RA = findViewById(R.id.rbA4118_RA);
        rbA4119_1 = findViewById(R.id.rbA4119_1);
        rbA4119_2 = findViewById(R.id.rbA4119_2);
        rbA4119_3 = findViewById(R.id.rbA4119_3);
        rbA4119_4 = findViewById(R.id.rbA4119_4);
        rbA4119_DK = findViewById(R.id.rbA4119_DK);
        rbA4119_RA = findViewById(R.id.rbA4119_RA);
        rbA4120_1 = findViewById(R.id.rbA4120_1);
        rbA4120_2 = findViewById(R.id.rbA4120_2);
        rbA4120_3 = findViewById(R.id.rbA4120_3);
        rbA4120_4 = findViewById(R.id.rbA4120_4);
        rbA4120_DK = findViewById(R.id.rbA4120_DK);
        rbA4120_RA = findViewById(R.id.rbA4120_RA);
        rbA4122_1 = findViewById(R.id.rbA4122_1);
        rbA4122_2 = findViewById(R.id.rbA4122_2);
        rbA4122_DK = findViewById(R.id.rbA4122_DK);
        rbA4122_RA = findViewById(R.id.rbA4122_RA);
        rbA4123_1 = findViewById(R.id.rbA4123_1);
        rbA4123_2 = findViewById(R.id.rbA4123_2);
        rbA4123_DK = findViewById(R.id.rbA4123_DK);
        rbA4123_RA = findViewById(R.id.rbA4123_RA);
        rbA4124_1 = findViewById(R.id.rbA4124_1);
        rbA4124_2 = findViewById(R.id.rbA4124_2);
        rbA4124_DK = findViewById(R.id.rbA4124_DK);
        rbA4124_RA = findViewById(R.id.rbA4124_RA);
        rbA4125_1 = findViewById(R.id.rbA4125_1);
        rbA4125_2 = findViewById(R.id.rbA4125_2);
        rbA4125_DK = findViewById(R.id.rbA4125_DK);
        rbA4125_RA = findViewById(R.id.rbA4125_RA);

        // Edit Text
        ed_A4107 = findViewById(R.id.ed_A4107);
        ed_A4117_a = findViewById(R.id.ed_A4117_a);
        ed_A4117_b = findViewById(R.id.ed_A4117_b);
        ed_A4121 = findViewById(R.id.ed_A4121);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4109);

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

        Intent c = new Intent(A4109.this, A4126_A4140.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }


    private void setupSkips() {

        A4109.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4109_1.getId()) {
                    cvA4110.setVisibility(View.VISIBLE);
                    cvA4111.setVisibility(View.VISIBLE);
                    cvA4112.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4110);
                    ClearAllcontrol.ClearAllC(cvA4111);
                    ClearAllcontrol.ClearAllC(cvA4112);

                    cvA4110.setVisibility(View.GONE);
                    cvA4111.setVisibility(View.GONE);
                    cvA4112.setVisibility(View.GONE);
                }
            }
        });


        A4113.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4113_1.getId()) {
                    cvA4114.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4114);
                    cvA4114.setVisibility(View.GONE);
                }
            }
        });


        A4115.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4115_1.getId()) {
                    cvA4116.setVisibility(View.VISIBLE);
                    cvA4117u.setVisibility(View.VISIBLE);
                    cvA4117_a.setVisibility(View.VISIBLE);
                    cvA4117_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4116);
                    ClearAllcontrol.ClearAllC(cvA4117u);
                    ClearAllcontrol.ClearAllC(cvA4117_a);
                    ClearAllcontrol.ClearAllC(cvA4117_b);

                    cvA4116.setVisibility(View.GONE);
                    cvA4117u.setVisibility(View.GONE);
                    cvA4117_a.setVisibility(View.GONE);
                    cvA4117_b.setVisibility(View.GONE);
                }
            }
        });


        A4116.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4116_1.getId()) {
                    cvA4117u.setVisibility(View.VISIBLE);
                    cvA4117_a.setVisibility(View.VISIBLE);
                    cvA4117_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4117u);
                    ClearAllcontrol.ClearAllC(cvA4117_a);
                    ClearAllcontrol.ClearAllC(cvA4117_b);

                    cvA4117u.setVisibility(View.GONE);
                    cvA4117_a.setVisibility(View.GONE);
                    cvA4117_b.setVisibility(View.GONE);
                }
            }
        });


        A4117u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4117_a);
                ClearAllcontrol.ClearAllC(cvA4117_b);

                cvA4117_a.setVisibility(View.GONE);
                cvA4117_b.setVisibility(View.GONE);

                if (checkedId == rbA4117u_1.getId()) {
                    cvA4117_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4117u_2.getId()) {
                    cvA4117_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4118.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4118_1.getId()) {
                    cvA4119.setVisibility(View.VISIBLE);
                    cvA4120.setVisibility(View.VISIBLE);
                    cvA4121.setVisibility(View.VISIBLE);
                    cvA4122.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4119);
                    ClearAllcontrol.ClearAllC(cvA4120);
                    ClearAllcontrol.ClearAllC(cvA4121);
                    ClearAllcontrol.ClearAllC(cvA4122);

                    cvA4119.setVisibility(View.GONE);
                    cvA4120.setVisibility(View.GONE);
                    cvA4121.setVisibility(View.GONE);
                    cvA4122.setVisibility(View.GONE);
                }
            }
        });


    }

    private void events_calls() {

        btn_next6.setOnClickListener(this);

        ed_A4117_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4117_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4109
        json.put("A4109", rbA4109_1.isChecked() ? "1"
                : rbA4109_2.isChecked() ? "2"
                : rbA4109_DK.isChecked() ? "98"
                : rbA4109_RA.isChecked() ? "99"
                : "-1");

        //A4110
        json.put("A4110", rbA4110_1.isChecked() ? "1"
                : rbA4110_2.isChecked() ? "2"
                : rbA4110_DK.isChecked() ? "98"
                : rbA4110_RA.isChecked() ? "99"
                : "-1");

        //A4111
        json.put("A4111", rbA4111_1.isChecked() ? "1"
                : rbA4111_2.isChecked() ? "2"
                : rbA4111_DK.isChecked() ? "98"
                : rbA4111_RA.isChecked() ? "99"
                : "-1");

        //A4112
        json.put("A4112", rbA4112_1.isChecked() ? "1"
                : rbA4112_2.isChecked() ? "2"
                : rbA4112_DK.isChecked() ? "98"
                : rbA4112_RA.isChecked() ? "99"
                : "-1");

        //A4113
        json.put("A4113", rbA4113_1.isChecked() ? "1"
                : rbA4113_2.isChecked() ? "2"
                : rbA4113_DK.isChecked() ? "98"
                : rbA4113_RA.isChecked() ? "99"
                : "-1");

        //A4114
        json.put("A4114", rbA4114_1.isChecked() ? "1"
                : rbA4114_2.isChecked() ? "2"
                : rbA4114_DK.isChecked() ? "98"
                : rbA4114_RA.isChecked() ? "99"
                : "-1");

        //A4115
        json.put("A4115", rbA4115_1.isChecked() ? "1"
                : rbA4115_2.isChecked() ? "2"
                : rbA4115_DK.isChecked() ? "98"
                : rbA4115_RA.isChecked() ? "99"
                : "-1");

        //A4116
        json.put("A4116", rbA4116_1.isChecked() ? "1"
                : rbA4116_2.isChecked() ? "2"
                : rbA4116_DK.isChecked() ? "98"
                : rbA4116_RA.isChecked() ? "99"
                : "-1");

        //A4117u
        json.put("A4117u", rbA4117u_1.isChecked() ? "1"
                : rbA4117u_2.isChecked() ? "2"
                : rbA4117u_DK.isChecked() ? "98"
                : rbA4117u_RA.isChecked() ? "99"
                : "-1");

        //A4117_a
        json.put("A4117_a", ed_A4117_a.getText().toString().length() > 0 ? ed_A4117_a.getText().toString().trim() : "-1");

        //A4117_b
        json.put("A4117_b", ed_A4117_b.getText().toString().length() > 0 ? ed_A4117_b.getText().toString().trim() : "-1");


        //A4118
        json.put("A4118", rbA4118_1.isChecked() ? "1"
                : rbA4118_2.isChecked() ? "2"
                : rbA4118_DK.isChecked() ? "98"
                : rbA4118_RA.isChecked() ? "99"
                : "-1");

        //A4119
        json.put("A4119", rbA4119_1.isChecked() ? "1"
                : rbA4119_2.isChecked() ? "2"
                : rbA4119_3.isChecked() ? "3"
                : rbA4119_4.isChecked() ? "4"
                : rbA4119_DK.isChecked() ? "98"
                : rbA4119_RA.isChecked() ? "99"
                : "-1");

        //A4120
        json.put("A4120", rbA4120_1.isChecked() ? "1"
                : rbA4120_2.isChecked() ? "2"
                : rbA4120_3.isChecked() ? "3"
                : rbA4120_4.isChecked() ? "4"
                : rbA4120_DK.isChecked() ? "98"
                : rbA4120_RA.isChecked() ? "99"
                : "-1");

        //A4121
        json.put("A4121", ed_A4121.getText().toString().length() > 0 ? ed_A4121.getText().toString().trim() : "-1");


        //A4122
        json.put("A4122", rbA4122_1.isChecked() ? "1"
                : rbA4122_2.isChecked() ? "2"
                : rbA4122_DK.isChecked() ? "98"
                : rbA4122_RA.isChecked() ? "99"
                : "-1");

        //A4123
        json.put("A4123", rbA4123_1.isChecked() ? "1"
                : rbA4123_2.isChecked() ? "2"
                : rbA4123_DK.isChecked() ? "98"
                : rbA4123_RA.isChecked() ? "99"
                : "-1");

        //A4124
        json.put("A4124", rbA4124_1.isChecked() ? "1"
                : rbA4124_2.isChecked() ? "2"
                : rbA4124_DK.isChecked() ? "98"
                : rbA4124_RA.isChecked() ? "99"
                : "-1");


        //A4125
        json.put("A4125", rbA4125_1.isChecked() ? "1"
                : rbA4125_2.isChecked() ? "2"
                : rbA4125_DK.isChecked() ? "98"
                : rbA4125_RA.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4109) != false;
    }
}
