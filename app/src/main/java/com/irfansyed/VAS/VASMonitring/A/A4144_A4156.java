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

public class A4144_A4156 extends AppCompatActivity implements View.OnClickListener {

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
            rbA4148_96,
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
        rbA4148_96 = findViewById(R.id.rbA4148_96);
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
        Intent c = new Intent(A4144_A4156.this, A4157_A4205.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }


    private void setupSkips() {

        A4146.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4146_1.getId()) {
                    cvA4147.setVisibility(View.VISIBLE);
                    cvA4148.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4147);
                    ClearAllcontrol.ClearAllC(cvA4148);
                    cvA4147.setVisibility(View.GONE);
                    cvA4148.setVisibility(View.GONE);
                }
            }
        });


        

        A4149.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4149_1.getId()) {
                    cvA4150u.setVisibility(View.VISIBLE);
                    cvA4150_a.setVisibility(View.VISIBLE);
                    cvA4150_b.setVisibility(View.VISIBLE);
                    cvA4151.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4150u);
                    ClearAllcontrol.ClearAllC(cvA4150_a);
                    ClearAllcontrol.ClearAllC(cvA4150_b);
                    ClearAllcontrol.ClearAllC(cvA4151);

                    cvA4150u.setVisibility(View.GONE);
                    cvA4150_a.setVisibility(View.GONE);
                    cvA4150_b.setVisibility(View.GONE);
                    cvA4151.setVisibility(View.GONE);
                }
            }
        });


        A4150u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4150_a);
                ClearAllcontrol.ClearAllC(cvA4150_b);

                cvA4150_a.setVisibility(View.GONE);
                cvA4150_b.setVisibility(View.GONE);

                if (checkedId == rbA4150u_1.getId()) {
                    cvA4150_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4150u_2.getId()) {
                    cvA4150_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4154.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4154_1.getId()) {
                    cvA4155.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4155);
                    cvA4155.setVisibility(View.GONE);
                }
            }
        });

    }


    private void events_calls() {

        btn_next8.setOnClickListener(this);

        ed_A4150_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4150_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4144
        json.put("A4144", rbA4144_1.isChecked() ? "1"
                : rbA4144_2.isChecked() ? "2"
                : rbA4144_DK.isChecked() ? "98"
                : rbA4144_RA.isChecked() ? "99"
                : "-1");

        //A4145
        json.put("A4145", rbA4145_1.isChecked() ? "1"
                : rbA4145_2.isChecked() ? "2"
                : rbA4145_DK.isChecked() ? "98"
                : rbA4145_RA.isChecked() ? "99"
                : "-1");

        //A4146
        json.put("A4146", rbA4146_1.isChecked() ? "1"
                : rbA4146_2.isChecked() ? "2"
                : rbA4146_DK.isChecked() ? "98"
                : rbA4146_RA.isChecked() ? "99"
                : "-1");

        //A4147
        json.put("A4147", rbA4147_1.isChecked() ? "1"
                : rbA4147_2.isChecked() ? "2"
                : rbA4147_DK.isChecked() ? "98"
                : rbA4147_RA.isChecked() ? "99"
                : "-1");

        //A4148
        json.put("A4148", rbA4148_1.isChecked() ? "1"
                : rbA4148_2.isChecked() ? "2"
                : rbA4148_3.isChecked() ? "3"
                : rbA4148_4.isChecked() ? "4"
                : rbA4148_5.isChecked() ? "5"
                : rbA4148_6.isChecked() ? "6"
                : rbA4148_7.isChecked() ? "7"
                : rbA4148_DK.isChecked() ? "98"
                : rbA4148_RA.isChecked() ? "99"
                : rbA4148_96.isChecked() ? "96"
                : "-1");
        
        
        //A4149
        json.put("A4149", rbA4149_1.isChecked() ? "1"
                : rbA4149_2.isChecked() ? "2"
                : rbA4149_DK.isChecked() ? "98"
                : rbA4149_RA.isChecked() ? "99"
                : "-1");

        //A4150u
        json.put("A4150u", rbA4150u_1.isChecked() ? "1"
                : rbA4150u_2.isChecked() ? "2"
                : rbA4150u_DK.isChecked() ? "98"
                : rbA4150u_RA.isChecked() ? "99"
                : "-1");

        //A4150_a
        json.put("A4150_a", ed_A4150_a.getText().toString().length() > 0 ? ed_A4150_a.getText().toString().trim() : "-1");

        //A4150_b
        json.put("A4150_b", ed_A4150_b.getText().toString().length() > 0 ? ed_A4150_b.getText().toString().trim() : "-1");


        //A4151
        json.put("A4151", rbA4151_1.isChecked() ? "1"
                : rbA4151_2.isChecked() ? "2"
                : rbA4151_3.isChecked() ? "3"
                : "-1");

        //A4152
        json.put("A4152", rbA4152_1.isChecked() ? "1"
                : rbA4152_2.isChecked() ? "2"
                : rbA4152_DK.isChecked() ? "98"
                : rbA4152_RA.isChecked() ? "99"
                : "-1");

        //A4153
        json.put("A4153", rbA4153_1.isChecked() ? "1"
                : rbA4153_2.isChecked() ? "2"
                : rbA4153_DK.isChecked() ? "98"
                : rbA4153_RA.isChecked() ? "99"
                : "-1");

        //A4154
        json.put("A4154", rbA4154_1.isChecked() ? "1"
                : rbA4154_2.isChecked() ? "2"
                : rbA4154_DK.isChecked() ? "98"
                : rbA4154_RA.isChecked() ? "99"
                : "-1");

        //A4155
        json.put("A4155", rbA4155_1.isChecked() ? "1"
                : rbA4155_2.isChecked() ? "2"
                : rbA4155_DK.isChecked() ? "98"
                : rbA4155_RA.isChecked() ? "99"
                : "-1");

        //A4156
        json.put("A4156", rbA4156_1.isChecked() ? "1"
                : rbA4156_2.isChecked() ? "2"
                : rbA4156_DK.isChecked() ? "98"
                : rbA4156_RA.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4144) != false;
    }
}
