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

public class A4095 extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.a4095);

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

        Intent c = new Intent(A4095.this, A4109_A4125.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }


    private void setupSkips() {

        A4096.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4096_1.getId()) {
                    cvA4097u.setVisibility(View.VISIBLE);
                    cvA4097_a.setVisibility(View.VISIBLE);
                    cvA4097_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4097u);
                    ClearAllcontrol.ClearAllC(cvA4097_a);
                    ClearAllcontrol.ClearAllC(cvA4097_b);

                    cvA4097u.setVisibility(View.GONE);
                    cvA4097_a.setVisibility(View.GONE);
                    cvA4097_b.setVisibility(View.GONE);
                }
            }
        });


        A4097u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4097_a);
                ClearAllcontrol.ClearAllC(cvA4097_b);

                cvA4097_a.setVisibility(View.GONE);
                cvA4097_b.setVisibility(View.GONE);

                if (checkedId == rbA4097u_1.getId()) {
                    cvA4097_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4097u_2.getId()) {
                    cvA4097_b.setVisibility(View.VISIBLE);
                }

            }

        });


        A4098.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4098_1.getId()) {
                    cvA4099u.setVisibility(View.VISIBLE);
                    cvA4099_a.setVisibility(View.VISIBLE);
                    cvA4099_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4099u);
                    ClearAllcontrol.ClearAllC(cvA4099_a);
                    ClearAllcontrol.ClearAllC(cvA4099_b);

                    cvA4099u.setVisibility(View.GONE);
                    cvA4099_a.setVisibility(View.GONE);
                    cvA4099_b.setVisibility(View.GONE);
                }
            }
        });


        A4099u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4099_a);
                ClearAllcontrol.ClearAllC(cvA4099_b);

                cvA4099_a.setVisibility(View.GONE);
                cvA4099_b.setVisibility(View.GONE);

                if (checkedId == rbA4099u_1.getId()) {
                    cvA4099_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4099u_2.getId()) {
                    cvA4099_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4100.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4100_1.getId()) {
                    cvA4101u.setVisibility(View.VISIBLE);
                    cvA4101_a.setVisibility(View.VISIBLE);
                    cvA4101_b.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4101u);
                    ClearAllcontrol.ClearAllC(cvA4101_a);
                    ClearAllcontrol.ClearAllC(cvA4101_b);

                    cvA4101u.setVisibility(View.GONE);
                    cvA4101_a.setVisibility(View.GONE);
                    cvA4101_b.setVisibility(View.GONE);
                }
            }
        });


        A4101u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4101_a);
                ClearAllcontrol.ClearAllC(cvA4101_b);

                cvA4101_a.setVisibility(View.GONE);
                cvA4101_b.setVisibility(View.GONE);

                if (checkedId == rbA4101u_1.getId()) {
                    cvA4101_a.setVisibility(View.VISIBLE);
                } else if (checkedId == rbA4101u_2.getId()) {
                    cvA4101_b.setVisibility(View.VISIBLE);
                }
            }
        });


        A4102.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4102_1.getId()) {
                    cvA4103.setVisibility(View.VISIBLE);
                    cvA4104.setVisibility(View.VISIBLE);
                    cvA4105.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4103);
                    ClearAllcontrol.ClearAllC(cvA4104);
                    ClearAllcontrol.ClearAllC(cvA4105);

                    cvA4103.setVisibility(View.GONE);
                    cvA4104.setVisibility(View.GONE);
                    cvA4105.setVisibility(View.GONE);
                }
            }
        });


        A4106.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rbA4106_1.getId()) {
                    cvA4107.setVisibility(View.VISIBLE);
                    cvA4108.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4107);
                    ClearAllcontrol.ClearAllC(cvA4108);

                    cvA4107.setVisibility(View.GONE);
                    cvA4108.setVisibility(View.GONE);
                }
            }
        });

    }

    private void events_calls() {

        btn_next5.setOnClickListener(this);

        ed_A4097_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4097_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4099_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4099_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4101_a.setFilters(new InputFilter[]{new InputFilterMinMax(0, 30, 99, 99)});
        ed_A4101_b.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

        ed_A4107.setFilters(new InputFilter[]{new InputFilterMinMax(0, 60, 88, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4095
        json.put("A4095", rbA4095_1.isChecked() ? "1"
                : rbA4095_2.isChecked() ? "2"
                : rbA4095_DK.isChecked() ? "98"
                : rbA4095_RA.isChecked() ? "99"
                : "-1");

        //A4096
        json.put("A4096", rbA4096_1.isChecked() ? "1"
                : rbA4096_2.isChecked() ? "2"
                : rbA4096_DK.isChecked() ? "98"
                : rbA4096_RA.isChecked() ? "99"
                : "-1");

        //A4097u
        json.put("A4097u", rbA4097u_1.isChecked() ? "1"
                : rbA4097u_2.isChecked() ? "2"
                : rbA4097u_DK.isChecked() ? "98"
                : rbA4097u_RA.isChecked() ? "99"
                : "-1");

        //A4097_a
        json.put("A4097_a", ed_A4097_a.getText().toString().length() > 0 ? ed_A4097_a.getText().toString().trim() : "-1");

        //A4097_b
        json.put("A4097_b", ed_A4097_b.getText().toString().length() > 0 ? ed_A4097_b.getText().toString().trim() : "-1");

        //A4098
        json.put("A4098", rbA4098_1.isChecked() ? "1"
                : rbA4098_2.isChecked() ? "2"
                : rbA4098_DK.isChecked() ? "98"
                : rbA4098_RA.isChecked() ? "99"
                : "-1");

        //A4099u
        json.put("A4099u", rbA4099u_1.isChecked() ? "1"
                : rbA4099u_2.isChecked() ? "2"
                : rbA4099u_DK.isChecked() ? "98"
                : rbA4099u_RA.isChecked() ? "99"
                : "-1");

        //A4099_a
        json.put("A4099_a", ed_A4099_a.getText().toString().length() > 0 ? ed_A4099_a.getText().toString().trim() : "-1");

        //A4099_b
        json.put("A4099_b", ed_A4099_b.getText().toString().length() > 0 ? ed_A4099_b.getText().toString().trim() : "-1");


        //A4100
        json.put("A4100", rbA4100_1.isChecked() ? "1"
                : rbA4100_2.isChecked() ? "2"
                : rbA4100_DK.isChecked() ? "98"
                : rbA4100_RA.isChecked() ? "99"
                : "-1");

        //A4101u
        json.put("A4101u", rbA4101u_1.isChecked() ? "1"
                : rbA4101u_2.isChecked() ? "2"
                : rbA4101u_DK.isChecked() ? "98"
                : rbA4101u_RA.isChecked() ? "99"
                : "-1");

        //A4101_a
        json.put("A4101_a", ed_A4101_a.getText().toString().length() > 0 ? ed_A4101_a.getText().toString().trim() : "-1");

        //A4101_b
        json.put("A4101_b", ed_A4101_b.getText().toString().length() > 0 ? ed_A4101_b.getText().toString().trim() : "-1");


        //A4102
        json.put("A4102", rbA4102_1.isChecked() ? "1"
                : rbA4102_2.isChecked() ? "2"
                : rbA4102_DK.isChecked() ? "98"
                : rbA4102_RA.isChecked() ? "99"
                : "-1");

        //A4103
        json.put("A4103", rbA4103_1.isChecked() ? "1"
                : rbA4103_2.isChecked() ? "2"
                : rbA4103_DK.isChecked() ? "98"
                : rbA4103_RA.isChecked() ? "99"
                : "-1");

        //A4104
        json.put("A4104", rbA4104_1.isChecked() ? "1"
                : rbA4104_2.isChecked() ? "2"
                : rbA4104_DK.isChecked() ? "98"
                : rbA4104_RA.isChecked() ? "99"
                : "-1");


        //A4105
        json.put("A4105", rbA4105_1.isChecked() ? "1"
                : rbA4105_2.isChecked() ? "2"
                : rbA4105_DK.isChecked() ? "98"
                : rbA4105_RA.isChecked() ? "99"
                : "-1");


        //A4106
        json.put("A4106", rbA4106_1.isChecked() ? "1"
                : rbA4106_2.isChecked() ? "2"
                : rbA4106_DK.isChecked() ? "98"
                : rbA4106_RA.isChecked() ? "99"
                : "-1");

        //A4107
        json.put("A4107", ed_A4107.getText().toString().length() > 0 ? ed_A4107.getText().toString().trim() : "-1");


        //A4108
        json.put("A4108", rbA4108_1.isChecked() ? "1"
                : rbA4108_2.isChecked() ? "2"
                : rbA4108_DK.isChecked() ? "98"
                : rbA4108_RA.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4095) != false;
    }

}
