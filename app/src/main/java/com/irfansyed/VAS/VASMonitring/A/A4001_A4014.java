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

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4001_A4014 extends AppCompatActivity implements View.OnClickListener {


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

        value_assignment();
        insert_data();

        Intent c = new Intent(A4001_A4014.this, A4051_A4066.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4001__a4014);

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

    void value_assignment() {

        study_id = "0";
        A4001 = "-1";
        A4002 = "-1";
        A4003 = "-1";
        A4004 = "-1";
        A4005 = "-1";
        A4006 = "-1";
        A4007 = "-1";
        A4007_1 = "-1";
        A4008 = "-1";
        A4009a = "-1";
        A4010 = "-1";
        A4011 = "-1";
        A4012 = "-1";
        A4013u = "-1";
        A4013d = "-1";
        A4013m = "-1";
        A4013y = "-1";
        A4014 = "-1";
        STATUS = "0";


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4001
        if (ed_A4001.getText().toString().trim().length() > 0) {
            A4001 = ed_A4001.getText().toString().trim();
        }

        //A4002
        if (rb_A4002_1.isChecked()) {
            A4002 = "1";
        }
        if (rb_A4002_2.isChecked()) {
            A4002 = "2";
        }
        if (rb_A4002_3.isChecked()) {
            A4002 = "3";
        }
        if (rb_A4002_4.isChecked()) {
            A4002 = "4";
        }
        if (rb_A4002_5.isChecked()) {
            A4002 = "5";
        }
        if (rb_A4002_6.isChecked()) {
            A4002 = "6";
        }
        if (rb_A4002_DK.isChecked()) {
            A4002 = "9";
        }
        if (rb_A4002_RA.isChecked()) {
            A4002 = "8";
        }

        //A4003
        if (rb_A4003_1.isChecked()) {
            A4003 = "1";
        }
        if (rb_A4003_2.isChecked()) {
            A4003 = "2";
        }
        if (rb_A4003_DK.isChecked()) {
            A4003 = "9";
        }
        if (rb_A4003_RA.isChecked()) {
            A4003 = "8";
        }

        //A4004
        if (rb_A4004_1.isChecked()) {
            A4004 = "1";
        }
        if (rb_A4004_2.isChecked()) {
            A4004 = "2";
        }
        if (rb_A4004_3.isChecked()) {
            A4004 = "3";
        }
        if (rb_A4004_DK.isChecked()) {
            A4004 = "9";
        }
        if (rb_A4004_RA.isChecked()) {
            A4004 = "8";
        }

        //A4005
        if (ed_A4005.getText().toString().trim().length() > 0) {
            A4005 = ed_A4005.getText().toString().trim();
        }

        //A4006
        if (rb_A4006_1.isChecked()) {
            A4006 = "1";
        }
        if (rb_A4006_2.isChecked()) {
            A4006 = "2";
        }
        if (rb_A4006_DK.isChecked()) {
            A4006 = "9";
        }
        if (rb_A4006_RA.isChecked()) {
            A4006 = "8";
        }

        //A4007
        if (rb_A4007_1.isChecked()) {
            A4007 = "1";
        }
        if (rb_A4007_2.isChecked()) {
            A4007 = "2";
        }
        if (rb_A4007_3.isChecked()) {
            A4007 = "3";
        }
        if (rb_A4007_4.isChecked()) {
            A4007 = "4";
        }
        if (rb_A4007_5.isChecked()) {
            A4007 = "5";
        }
        if (rb_A4007_6.isChecked()) {
            A4007 = "6";
        }
        if (rb_A4007_DK.isChecked()) {
            A4007 = "9";
        }
        if (rb_A4007_RA.isChecked()) {
            A4007 = "8";
        }

        //A4007_1
        if (ed_A4007_1.getText().toString().trim().length() > 0) {
            A4007_1 = ed_A4007_1.getText().toString().trim();
        }

        //A4008
        if (rb_A4008_1.isChecked()) {
            A4008 = "1";
        }
        if (rb_A4008_2.isChecked()) {
            A4008 = "2";
        }
        if (rb_A4008_DK.isChecked()) {
            A4008 = "9";
        }
        if (rb_A4008_RA.isChecked()) {
            A4008 = "8";
        }

        //A4009a
        if (rb_A4009a_1.isChecked()) {
            A4009a = "1";
        }
        if (rb_A4009a_2.isChecked()) {
            A4009a = "2";
        }
        if (rb_A4009a_DK.isChecked()) {
            A4009a = "9";
        }
        if (rb_A4009a_RA.isChecked()) {
            A4009a = "8";
        }

        //A4010
        if (rb_A4010_1.isChecked()) {
            A4010 = "1";
        }
        if (rb_A4010_2.isChecked()) {
            A4010 = "2";
        }
        if (rb_A4010_3.isChecked()) {
            A4010 = "3";
        }
        if (rb_A4010_4.isChecked()) {
            A4010 = "4";
        }
        if (rb_A4010_DK.isChecked()) {
            A4010 = "9";
        }
        if (rb_A4010_RA.isChecked()) {
            A4010 = "8";
        }

        //A4011
        if (ed_A4011.getText().toString().trim().length() > 0) {
            A4011 = ed_A4011.getText().toString().trim();
        }

        //A4012
        if (ed_A4012.getText().toString().trim().length() > 0) {
            A4012 = ed_A4012.getText().toString().trim();
        }

        //A4013u
        if (rb_A4013u_1.isChecked()) {
            A4013u = "1";
        }
        if (rb_A4013u_2.isChecked()) {
            A4013u = "2";
        }
        if (rb_A4013u_3.isChecked()) {
            A4013u = "3";
        }
        if (rb_A4013u_DK.isChecked()) {
            A4013u = "9";
        }
        if (rb_A4013u_RA.isChecked()) {
            A4013u = "8";
        }

        //A4013d
        if (ed_A4013d.getText().toString().trim().length() > 0) {
            A4013d = ed_A4013d.getText().toString().trim();
        }

        //A4013m
        if (ed_A4013m.getText().toString().trim().length() > 0) {
            A4013m = ed_A4013m.getText().toString().trim();
        }

        //A4013y
        if (ed_A4013y.getText().toString().trim().length() > 0) {
            A4013y = ed_A4013y.getText().toString().trim();
        }

        //A4014
        if (rb_A4014_1.isChecked()) {
            A4014 = "1";
        }
        if (rb_A4014_2.isChecked()) {
            A4014 = "2";
        }
        if (rb_A4014_DK.isChecked()) {
            A4014 = "9";
        }
    }

    void insert_data() {

        String query = "insert into A4001_A4014("

                + Global.A.A4001_A4014.study_id + ","
                + Global.A.A4001_A4014.A4001 + ","
                + Global.A.A4001_A4014.A4002 + ","
                + Global.A.A4001_A4014.A4003 + ","
                + Global.A.A4001_A4014.A4004 + ","
                + Global.A.A4001_A4014.A4005 + ","
                + Global.A.A4001_A4014.A4006 + ","
                + Global.A.A4001_A4014.A4007 + ","
                + Global.A.A4001_A4014.A4007_1 + ","
                + Global.A.A4001_A4014.A4008 + ","
                + Global.A.A4001_A4014.A4009a + ","
                + Global.A.A4001_A4014.A4010 + ","
                + Global.A.A4001_A4014.A4011 + ","
                + Global.A.A4001_A4014.A4012 + ","
                + Global.A.A4001_A4014.A4013u + ","
                + Global.A.A4001_A4014.A4013d + ","
                + Global.A.A4001_A4014.A4013m + ","
                + Global.A.A4001_A4014.A4013y + ","
                + Global.A.A4001_A4014.A4014 + ","
                + Global.A.A4001_A4014.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4001 + "','" +
                A4002 + "','" +
                A4003 + "','" +
                A4004 + "','" +
                A4005 + "','" +
                A4006 + "','" +
                A4007 + "','" +
                A4007_1 + "','" +
                A4008 + "','" +
                A4009a + "','" +
                A4010 + "','" +
                A4011 + "','" +
                A4012 + "','" +
                A4013u + "','" +
                A4013d + "','" +
                A4013m + "','" +
                A4013y + "','" +
                A4014 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "1st TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4001) != false;
    }

}


