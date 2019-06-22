package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
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

public class A4001 extends AppCompatActivity implements View.OnClickListener {


    //  Region_Declaration
    Button
            btn_next1;

    CardView
            cvstudy_id,
            cvA4001,
            cvA4002,
            cvA4003,
            cvA4004,
            cvA4005,
            cvA4006,
            cvA4007,
            cvA4007_1,
            cvA4008,
            cvA4009a,
            cvA4010,
            cvA4011,
            cvA4012,
            cvA4013u,
            cvA4013d,
            cvA4013m,
            cvA4013y,
            cvA4014;

    LinearLayout
            llA4001;

    RadioGroup
            A4002,
            A4003,
            A4004,
            A4006,
            A4007,
            A4008,
            A4009a,
            A4010,
            A4013u,
            A4014;

    RadioButton
            rb_A4002_1,
            rb_A4002_2,
            rb_A4002_3,
            rb_A4002_4,
            rb_A4002_5,
            rb_A4002_6,
            rb_A4002_DK,
            rb_A4002_RA,
            rb_A4003_1,
            rb_A4003_2,
            rb_A4003_DK,
            rb_A4003_RA,
            rb_A4004_1,
            rb_A4004_2,
            rb_A4004_3,
            rb_A4004_DK,
            rb_A4004_RA,
            rb_A4006_1,
            rb_A4006_2,
            rb_A4006_DK,
            rb_A4006_RA,
            rb_A4007_1,
            rb_A4007_2,
            rb_A4007_3,
            rb_A4007_4,
            rb_A4007_5,
            rb_A4007_6,
            rb_A4007_DK,
            rb_A4007_RA,
            rb_A4008_1,
            rb_A4008_2,
            rb_A4008_DK,
            rb_A4008_RA,
            rb_A4009a_1,
            rb_A4009a_2,
            rb_A4009a_DK,
            rb_A4009a_RA,
            rb_A4010_1,
            rb_A4010_2,
            rb_A4010_3,
            rb_A4010_4,
            rb_A4010_DK,
            rb_A4010_RA,
            rb_A4013u_1,
            rb_A4013u_2,
            rb_A4013u_3,
            rb_A4013u_DK,
            rb_A4013u_RA,
            rb_A4014_1,
            rb_A4014_2,
            rb_A4014_DK;

    EditText
            ed_study_id,
            ed_A4001,
            ed_A4005,
            ed_A4007_1,
            ed_A4011,
            ed_A4012,
            ed_A4013d,
            ed_A4013m,
            ed_A4013y;

    String
            study_id,
            STATUS;

    // End Region_Declaration
    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (ed_A4005.getText().hashCode() == s.hashCode()) {
                if (ed_A4005.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4005.getText().toString().trim()) > 7) {
                    cvA4006.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAllC(cvA4006);
                } else {
                    cvA4006.setVisibility(View.VISIBLE);
                }
            }

            if (ed_A4011.getText().hashCode() == s.hashCode()) {
                if (ed_A4011.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4011.getText().toString().trim()) >= 1) {
                    cvA4012.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAllC(cvA4012);
                } else {
                    cvA4012.setVisibility(View.VISIBLE);
                }
            }

        }

    };

    void Initialization() {

        btn_next1 = findViewById(R.id.btn_next1);

        llA4001 = findViewById(R.id.llA4001);
        cvA4001 = findViewById(R.id.cvA4001);
        cvA4002 = findViewById(R.id.cvA4002);
        cvA4003 = findViewById(R.id.cvA4003);
        cvA4004 = findViewById(R.id.cvA4004);
        cvA4005 = findViewById(R.id.cvA4005);
        cvA4006 = findViewById(R.id.cvA4006);
        cvA4007 = findViewById(R.id.cvA4007);
        cvA4007_1 = findViewById(R.id.cvA4007_1);
        cvA4008 = findViewById(R.id.cvA4008);
        cvA4009a = findViewById(R.id.cvA4009a);
        cvA4010 = findViewById(R.id.cvA4010);
        cvA4011 = findViewById(R.id.cvA4011);
        cvA4012 = findViewById(R.id.cvA4012);
        cvA4013u = findViewById(R.id.cvA4013u);
        cvA4013d = findViewById(R.id.cvA4013d);
        cvA4013m = findViewById(R.id.cvA4013m);
        cvA4013y = findViewById(R.id.cvA4013y);
        cvA4014 = findViewById(R.id.cvA4014);

        A4002 = findViewById(R.id.A4002);
        A4003 = findViewById(R.id.A4003);
        A4004 = findViewById(R.id.A4004);
        A4006 = findViewById(R.id.A4006);
        A4007 = findViewById(R.id.A4007);
        A4008 = findViewById(R.id.A4008);
        A4009a = findViewById(R.id.A4009a);
        A4010 = findViewById(R.id.A4010);
        A4013u = findViewById(R.id.A4013u);
        A4014 = findViewById(R.id.A4014);

        rb_A4002_1 = findViewById(R.id.rb_A4002_1);
        rb_A4002_2 = findViewById(R.id.rb_A4002_2);
        rb_A4002_3 = findViewById(R.id.rb_A4002_3);
        rb_A4002_4 = findViewById(R.id.rb_A4002_4);
        rb_A4002_5 = findViewById(R.id.rb_A4002_5);
        rb_A4002_6 = findViewById(R.id.rb_A4002_6);
        rb_A4002_DK = findViewById(R.id.rb_A4002_DK);
        rb_A4002_RA = findViewById(R.id.rb_A4002_RA);
        rb_A4003_1 = findViewById(R.id.rb_A4003_1);
        rb_A4003_2 = findViewById(R.id.rb_A4003_2);
        rb_A4003_DK = findViewById(R.id.rb_A4003_DK);
        rb_A4003_RA = findViewById(R.id.rb_A4003_RA);
        rb_A4004_1 = findViewById(R.id.rb_A4004_1);
        rb_A4004_2 = findViewById(R.id.rb_A4004_2);
        rb_A4004_3 = findViewById(R.id.rb_A4004_3);
        rb_A4004_DK = findViewById(R.id.rb_A4004_DK);
        rb_A4004_RA = findViewById(R.id.rb_A4004_RA);
        rb_A4006_1 = findViewById(R.id.rb_A4006_1);
        rb_A4006_2 = findViewById(R.id.rb_A4006_2);
        rb_A4006_DK = findViewById(R.id.rb_A4006_DK);
        rb_A4006_RA = findViewById(R.id.rb_A4006_RA);
        rb_A4007_1 = findViewById(R.id.rb_A4007_1);
        rb_A4007_2 = findViewById(R.id.rb_A4007_2);
        rb_A4007_3 = findViewById(R.id.rb_A4007_3);
        rb_A4007_4 = findViewById(R.id.rb_A4007_4);
        rb_A4007_5 = findViewById(R.id.rb_A4007_5);
        rb_A4007_6 = findViewById(R.id.rb_A4007_6);
        rb_A4007_DK = findViewById(R.id.rb_A4007_DK);
        rb_A4007_RA = findViewById(R.id.rb_A4007_RA);
        rb_A4008_1 = findViewById(R.id.rb_A4008_1);
        rb_A4008_2 = findViewById(R.id.rb_A4008_2);
        rb_A4008_DK = findViewById(R.id.rb_A4008_DK);
        rb_A4008_RA = findViewById(R.id.rb_A4008_RA);
        rb_A4009a_1 = findViewById(R.id.rb_A4009a_1);
        rb_A4009a_2 = findViewById(R.id.rb_A4009a_2);
        rb_A4009a_DK = findViewById(R.id.rb_A4009a_DK);
        rb_A4009a_RA = findViewById(R.id.rb_A4009a_RA);
        rb_A4010_1 = findViewById(R.id.rb_A4010_1);
        rb_A4010_2 = findViewById(R.id.rb_A4010_2);
        rb_A4010_3 = findViewById(R.id.rb_A4010_3);
        rb_A4010_4 = findViewById(R.id.rb_A4010_4);
        rb_A4010_DK = findViewById(R.id.rb_A4010_DK);
        rb_A4010_RA = findViewById(R.id.rb_A4010_RA);
        rb_A4013u_1 = findViewById(R.id.rb_A4013u_1);
        rb_A4013u_2 = findViewById(R.id.rb_A4013u_2);
        rb_A4013u_3 = findViewById(R.id.rb_A4013u_3);
        rb_A4013u_DK = findViewById(R.id.rb_A4013u_DK);
        rb_A4013u_RA = findViewById(R.id.rb_A4013u_RA);
        rb_A4014_1 = findViewById(R.id.rb_A4014_1);
        rb_A4014_2 = findViewById(R.id.rb_A4014_2);
        rb_A4014_DK = findViewById(R.id.rb_A4014_DK);

        ed_A4001 = findViewById(R.id.ed_A4001);
        ed_A4005 = findViewById(R.id.ed_A4005);
        ed_A4007_1 = findViewById(R.id.ed_A4007_1);
        ed_A4011 = findViewById(R.id.ed_A4011);
        ed_A4012 = findViewById(R.id.ed_A4012);
        ed_A4013d = findViewById(R.id.ed_A4013d);
        ed_A4013m = findViewById(R.id.ed_A4013m);
        ed_A4013y = findViewById(R.id.ed_A4013y);

    }

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

        Intent c = new Intent(A4001.this, A4051.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4001);

        this.setTitle(getString(R.string.h_a_sec_2_4));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        this.setTitle(getString(R.string.h_n_sec_2_1));

        Initialization();
        events_call();
        setupSkips();
    }

    private void setupSkips() {

        A4003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != rb_A4003_1.getId()) {
                    cvA4004.setVisibility(View.VISIBLE);
                    cvA4005.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4004);
                    ClearAllcontrol.ClearAllC(cvA4005);
                    cvA4004.setVisibility(View.GONE);
                    cvA4005.setVisibility(View.GONE);
                }
            }
        });


        A4004.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rb_A4004_1.getId()) {
                    cvA4005.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4005);
                    cvA4005.setVisibility(View.GONE);
                }

            }

        });


        A4007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rb_A4007_2.getId()) {
                    cvA4007_1.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4007_1);
                    cvA4007_1.setVisibility(View.GONE);
                }

            }

        });


        A4009a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rb_A4009a_1.getId()) {
                    cvA4010.setVisibility(View.VISIBLE);
                    cvA4011.setVisibility(View.VISIBLE);
                    cvA4012.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4010);
                    ClearAllcontrol.ClearAllC(cvA4011);
                    ClearAllcontrol.ClearAllC(cvA4012);
                    cvA4010.setVisibility(View.GONE);
                    cvA4011.setVisibility(View.GONE);
                    cvA4012.setVisibility(View.GONE);
                }
            }
        });


        A4010.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rb_A4010_1.getId()) {
                    cvA4011.setVisibility(View.VISIBLE);
                } else if (checkedId == rb_A4010_2.getId() || checkedId == rb_A4010_3.getId() || checkedId == rb_A4010_4.getId()) {
                    cvA4012.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4011);
                    ClearAllcontrol.ClearAllC(cvA4012);
                    cvA4011.setVisibility(View.GONE);
                    cvA4012.setVisibility(View.GONE);
                }
            }
        });


        A4013u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4013d);
                ClearAllcontrol.ClearAllC(cvA4013m);
                ClearAllcontrol.ClearAllC(cvA4013y);
                cvA4013d.setVisibility(View.GONE);
                cvA4013m.setVisibility(View.GONE);
                cvA4013y.setVisibility(View.GONE);

                if (checkedId == rb_A4013u_1.getId()) {
                    cvA4013d.setVisibility(View.VISIBLE);
                } else if (checkedId == rb_A4013u_2.getId()) {
                    cvA4013m.setVisibility(View.VISIBLE);
                } else if (checkedId == rb_A4013u_3.getId()) {
                    cvA4013y.setVisibility(View.VISIBLE);
                }
            }
        });

    }


    void events_call() {

        ed_A4005.addTextChangedListener(generalTextWatcher);
        ed_A4011.addTextChangedListener(generalTextWatcher);


        ed_A4005.setFilters(new InputFilter[]{new InputFilterMinMax(0, 22, 99, 99)});
        ed_A4013d.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        ed_A4013m.setFilters(new InputFilter[]{new InputFilterMinMax(1, 11, 99, 99)});
        ed_A4013y.setFilters(new InputFilter[]{new InputFilterMinMax(1, 49, 99, 99)});

    }


    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");
        json.put("STATUS", STATUS);

        //A4001
        json.put("A4001", ed_A4001.getText().toString().length() > 0 ? ed_A4001.getText().toString().trim() : "-1");

        //A4002
        json.put("A4002", rb_A4002_1.isChecked() ? "1"
                : rb_A4002_2.isChecked() ? "2"
                : rb_A4002_3.isChecked() ? "3"
                : rb_A4002_4.isChecked() ? "4"
                : rb_A4002_5.isChecked() ? "5"
                : rb_A4002_6.isChecked() ? "6"
                : rb_A4002_DK.isChecked() ? "98"
                : rb_A4002_RA.isChecked() ? "99"
                : "-1");

        //A4003
        json.put("A4003", rb_A4003_1.isChecked() ? "1"
                : rb_A4003_2.isChecked() ? "2"
                : rb_A4003_DK.isChecked() ? "98"
                : rb_A4003_RA.isChecked() ? "99"
                : "-1");

        //A4004
        json.put("A4004", rb_A4004_1.isChecked() ? "1"
                : rb_A4004_2.isChecked() ? "2"
                : rb_A4004_3.isChecked() ? "3"
                : rb_A4004_DK.isChecked() ? "98"
                : rb_A4004_RA.isChecked() ? "99"
                : "-1");

        //A4005
        json.put("A4005", ed_A4005.getText().toString().length() > 0 ? ed_A4005.getText().toString().trim() : "-1");

        //A4006
        json.put("A4006", rb_A4006_1.isChecked() ? "1"
                : rb_A4006_2.isChecked() ? "2"
                : rb_A4006_DK.isChecked() ? "98"
                : rb_A4006_RA.isChecked() ? "99"
                : "-1");

        //A4007
        json.put("A4007", rb_A4007_1.isChecked() ? "1"
                : rb_A4007_2.isChecked() ? "2"
                : rb_A4007_3.isChecked() ? "3"
                : rb_A4007_4.isChecked() ? "4"
                : rb_A4007_5.isChecked() ? "5"
                : rb_A4007_6.isChecked() ? "6"
                : rb_A4007_DK.isChecked() ? "98"
                : rb_A4007_RA.isChecked() ? "99"
                : "-1");

        //A4007_1
        json.put("A4007_1", ed_A4007_1.getText().toString().length() > 0 ? ed_A4007_1.getText().toString().trim() : "-1");

        //A4008
        json.put("A4008", rb_A4008_1.isChecked() ? "1"
                : rb_A4008_2.isChecked() ? "2"
                : rb_A4008_DK.isChecked() ? "98"
                : rb_A4008_RA.isChecked() ? "99"
                : "-1");

        //A4009a
        json.put("A4009a", rb_A4009a_1.isChecked() ? "1"
                : rb_A4009a_2.isChecked() ? "2"
                : rb_A4009a_DK.isChecked() ? "98"
                : rb_A4009a_RA.isChecked() ? "99"
                : "-1");

        //A4010
        json.put("A4010", rb_A4010_1.isChecked() ? "1"
                : rb_A4010_2.isChecked() ? "2"
                : rb_A4010_3.isChecked() ? "3"
                : rb_A4010_4.isChecked() ? "4"
                : rb_A4010_DK.isChecked() ? "98"
                : rb_A4010_RA.isChecked() ? "99"
                : "-1");

        //A4011
        json.put("A4011", ed_A4011.getText().toString().length() > 0 ? ed_A4011.getText().toString().trim() : "-1");

        //A4012
        json.put("A4012", ed_A4012.getText().toString().length() > 0 ? ed_A4012.getText().toString().trim() : "-1");

        //A4013u
        json.put("A4013u", rb_A4013u_1.isChecked() ? "1"
                : rb_A4013u_2.isChecked() ? "2"
                : rb_A4013u_3.isChecked() ? "3"
                : rb_A4013u_DK.isChecked() ? "98"
                : rb_A4013u_RA.isChecked() ? "99"
                : "-1");


        //A4013d
        json.put("A4013d", ed_A4013d.getText().toString().length() > 0 ? ed_A4013d.getText().toString().trim() : "-1");

        //A4013m
        json.put("A4013m", ed_A4013m.getText().toString().length() > 0 ? ed_A4013m.getText().toString().trim() : "-1");

        //A4013y
        json.put("A4013y", ed_A4013y.getText().toString().length() > 0 ? ed_A4013y.getText().toString().trim() : "-1");

        //A4014
        json.put("A4014", rb_A4014_1.isChecked() ? "1"
                : rb_A4014_2.isChecked() ? "2"
                : rb_A4014_DK.isChecked() ? "98"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4001) != false;
    }

}


