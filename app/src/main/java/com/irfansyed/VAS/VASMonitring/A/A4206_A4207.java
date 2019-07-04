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

public class A4206_A4207 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {




    //Declaration
    Button
            btn_next10;

    LinearLayout
            llA4206;

    CardView
            cvstudy_id,
            cvA4206,
            cvA42061,
            cvA42062,
            cvA42063,
            cvA42064,
            cvA42065,
            cvA42066,
            cvA42067,
            cvA42068,
            cvA42069,
            cvA420610,
            cvA420611,
            cvA420612,
            cvA420613,
            cvA420614,
            cvA420615,
            cvA420616,
            cvA420617,
            cvA420618,
            cvA420619,
            cvA420620,
            cvA420621,
            cvA420622,
            cvA4207;

    RadioGroup
            A4206,
            A42061,
            A42062,
            A42063,
            A42064,
            A42065,
            A42066,
            A42067,
            A42068,
            A42069,
            A420610,
            A420611,
            A420612,
            A420613,
            A420614,
            A420615,
            A420616,
            A420617,
            A420618,
            A420619,
            A420620,
            A420621,
            A420622;

    RadioButton
            A4206a,
            A4206b,
            A420698,
            A420699,
            A42061a,
            A42061b,
            A4206198,
            A4206199,
            A42062a,
            A42062b,
            A42062c,
            A42062d,
            A42062e,
            A4206298,
            A4206299,
            A4206296,
            A42063a,
            A42063b,
            A42063c,
            A42063d,
            A42063e,
            A42063f,
            A4206396,
            A4206398,
            A4206399,
            A42064a,
            A42064b,
            A4206498,
            A4206499,
            A42065a,
            A42065b,
            A4206598,
            A4206599,
            A42066a,
            A42066b,
            A4206698,
            A4206699,
            A42067a,
            A42067b,
            A4206798,
            A4206799,
            A42068a,
            A42068b,
            A4206898,
            A4206899,
            A42069a,
            A42069b,
            A4206998,
            A4206999,
            A420610a,
            A420610b,
            A420610c,
            A42061098,
            A42061099,
            A42061096,
            A420611a,
            A420611b,
            A42061198,
            A42061199,
            A420612a,
            A420612b,
            A42061298,
            A42061299,
            A420613a,
            A420613b,
            A42061398,
            A42061399,
            A420614a,
            A420614b,
            A42061498,
            A42061499,
            A420615a,
            A420615b,
            A42061598,
            A42061599,
            A420616a,
            A420616b,
            A42061698,
            A42061699,
            A420617a,
            A420617b,
            A42061798,
            A42061799,
            A420618a,
            A420618b,
            A42061898,
            A42061899,
            A420619a,
            A420619b,
            A42061998,
            A42061999,
            A420620a,
            A420620b,
            A42062098,
            A42062099,
            A420621a,
            A420621b,
            A42062198,
            A42062199,
            A420622a,
            A420622b,
            A42062298,
            A42062299;

    EditText
            ed_study_id,
            A4207D,
            A4207H;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next10 = findViewById(R.id.btn_next10);

        //Linear Layout
        llA4206 = findViewById(R.id.llA4206);

        //CardView
        cvA4206 = findViewById(R.id.cvA4206);
        cvA42061 = findViewById(R.id.cvA42061);
        cvA42062 = findViewById(R.id.cvA42062);
        cvA42063 = findViewById(R.id.cvA42063);
        cvA42064 = findViewById(R.id.cvA42064);
        cvA42065 = findViewById(R.id.cvA42065);
        cvA42066 = findViewById(R.id.cvA42066);
        cvA42067 = findViewById(R.id.cvA42067);
        cvA42068 = findViewById(R.id.cvA42068);
        cvA42069 = findViewById(R.id.cvA42069);
        cvA420610 = findViewById(R.id.cvA420610);
        cvA420611 = findViewById(R.id.cvA420611);
        cvA420612 = findViewById(R.id.cvA420612);
        cvA420613 = findViewById(R.id.cvA420613);
        cvA420614 = findViewById(R.id.cvA420614);
        cvA420615 = findViewById(R.id.cvA420615);
        cvA420616 = findViewById(R.id.cvA420616);
        cvA420617 = findViewById(R.id.cvA420617);
        cvA420618 = findViewById(R.id.cvA420618);
        cvA420619 = findViewById(R.id.cvA420619);
        cvA420620 = findViewById(R.id.cvA420620);
        cvA420621 = findViewById(R.id.cvA420621);
        cvA420622 = findViewById(R.id.cvA420622);
        cvA4207 = findViewById(R.id.cvA4207);

        //RadioGroup
        A4206 = findViewById(R.id.A4206);
        A42061 = findViewById(R.id.A42061);
        A42062 = findViewById(R.id.A42062);
        A42063 = findViewById(R.id.A42063);
        A42064 = findViewById(R.id.A42064);
        A42065 = findViewById(R.id.A42065);
        A42066 = findViewById(R.id.A42066);
        A42067 = findViewById(R.id.A42067);
        A42068 = findViewById(R.id.A42068);
        A42069 = findViewById(R.id.A42069);
        A420610 = findViewById(R.id.A420610);
        A420611 = findViewById(R.id.A420611);
        A420612 = findViewById(R.id.A420612);
        A420613 = findViewById(R.id.A420613);
        A420614 = findViewById(R.id.A420614);
        A420615 = findViewById(R.id.A420615);
        A420616 = findViewById(R.id.A420616);
        A420617 = findViewById(R.id.A420617);
        A420618 = findViewById(R.id.A420618);
        A420619 = findViewById(R.id.A420619);
        A420620 = findViewById(R.id.A420620);
        A420621 = findViewById(R.id.A420621);
        A420622 = findViewById(R.id.A420622);

        //Radio Button
        A4206a = findViewById(R.id.A4206a);
        A4206b = findViewById(R.id.A4206b);
        A420698 = findViewById(R.id.A420698);
        A420699 = findViewById(R.id.A420699);
        A42061a = findViewById(R.id.A42061a);
        A42061b = findViewById(R.id.A42061b);
        A4206198 = findViewById(R.id.A4206198);
        A4206199 = findViewById(R.id.A4206199);
        A42062a = findViewById(R.id.A42062a);
        A42062b = findViewById(R.id.A42062b);
        A42062c = findViewById(R.id.A42062c);
        A42062d = findViewById(R.id.A42062d);
        A42062e = findViewById(R.id.A42062e);
        A4206296 = findViewById(R.id.A4206296);
        A4206298 = findViewById(R.id.A4206298);
        A4206299 = findViewById(R.id.A4206299);
        A42063a = findViewById(R.id.A42063a);
        A42063b = findViewById(R.id.A42063b);
        A42063c = findViewById(R.id.A42063c);
        A42063d = findViewById(R.id.A42063d);
        A42063e = findViewById(R.id.A42063e);
        A42063f = findViewById(R.id.A42063f);
        A4206396 = findViewById(R.id.A4206396);
        A4206398 = findViewById(R.id.A4206398);
        A4206399 = findViewById(R.id.A4206399);
        A42064a = findViewById(R.id.A42064a);
        A42064b = findViewById(R.id.A42064b);
        A4206498 = findViewById(R.id.A4206498);
        A4206499 = findViewById(R.id.A4206499);
        A42065a = findViewById(R.id.A42065a);
        A42065b = findViewById(R.id.A42065b);
        A4206598 = findViewById(R.id.A4206598);
        A4206599 = findViewById(R.id.A4206599);
        A42066a = findViewById(R.id.A42066a);
        A42066b = findViewById(R.id.A42066b);
        A4206698 = findViewById(R.id.A4206698);
        A4206699 = findViewById(R.id.A4206699);
        A42067a = findViewById(R.id.A42067a);
        A42067b = findViewById(R.id.A42067b);
        A4206798 = findViewById(R.id.A4206798);
        A4206799 = findViewById(R.id.A4206799);
        A42068a = findViewById(R.id.A42068a);
        A42068b = findViewById(R.id.A42068b);
        A4206898 = findViewById(R.id.A4206898);
        A4206899 = findViewById(R.id.A4206899);
        A42069a = findViewById(R.id.A42069a);
        A42069b = findViewById(R.id.A42069b);
        A4206998 = findViewById(R.id.A4206998);
        A4206999 = findViewById(R.id.A4206999);
        A420610a = findViewById(R.id.A420610a);
        A420610b = findViewById(R.id.A420610b);
        A420610c = findViewById(R.id.A420610c);
        A42061096 = findViewById(R.id.A42061096);
        A42061098 = findViewById(R.id.A42061098);
        A42061099 = findViewById(R.id.A42061099);
        A420611a = findViewById(R.id.A420611a);
        A420611b = findViewById(R.id.A420611b);
        A42061198 = findViewById(R.id.A42061198);
        A42061199 = findViewById(R.id.A42061199);
        A420612a = findViewById(R.id.A420612a);
        A420612b = findViewById(R.id.A420612b);
        A42061298 = findViewById(R.id.A42061298);
        A42061299 = findViewById(R.id.A42061299);
        A420613a = findViewById(R.id.A420613a);
        A420613b = findViewById(R.id.A420613b);
        A42061398 = findViewById(R.id.A42061398);
        A42061399 = findViewById(R.id.A42061399);
        A420614a = findViewById(R.id.A420614a);
        A420614b = findViewById(R.id.A420614b);
        A42061498 = findViewById(R.id.A42061498);
        A42061499 = findViewById(R.id.A42061499);
        A420615a = findViewById(R.id.A420615a);
        A420615b = findViewById(R.id.A420615b);
        A42061598 = findViewById(R.id.A42061598);
        A42061599 = findViewById(R.id.A42061599);
        A420616a = findViewById(R.id.A420616a);
        A420616b = findViewById(R.id.A420616b);
        A42061698 = findViewById(R.id.A42061698);
        A42061699 = findViewById(R.id.A42061699);
        A420617a = findViewById(R.id.A420617a);
        A420617b = findViewById(R.id.A420617b);
        A42061798 = findViewById(R.id.A42061798);
        A42061799 = findViewById(R.id.A42061799);
        A420618a = findViewById(R.id.A420618a);
        A420618b = findViewById(R.id.A420618b);
        A42061898 = findViewById(R.id.A42061898);
        A42061899 = findViewById(R.id.A42061899);
        A420619a = findViewById(R.id.A420619a);
        A420619b = findViewById(R.id.A420619b);
        A42061998 = findViewById(R.id.A42061998);
        A42061999 = findViewById(R.id.A42061999);
        A420620a = findViewById(R.id.A420620a);
        A420620b = findViewById(R.id.A420620b);
        A42062098 = findViewById(R.id.A42062098);
        A42062099 = findViewById(R.id.A42062099);
        A420621a = findViewById(R.id.A420621a);
        A420621b = findViewById(R.id.A420621b);
        A42062198 = findViewById(R.id.A42062198);
        A42062199 = findViewById(R.id.A42062199);
        A420622a = findViewById(R.id.A420622a);
        A420622b = findViewById(R.id.A420622b);
        A42062298 = findViewById(R.id.A42062298);
        A42062299 = findViewById(R.id.A42062299);

        // Edit Text
        A4207H = findViewById(R.id.A4207H);
        A4207D = findViewById(R.id.A4207D);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4206__a4207);

        this.setTitle(getString(R.string.h_a_sec_I_A));

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

        Intent c = new Intent(A4206_A4207.this, A4251_A4284.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.A4206_1
                || compoundButton.getId() == R.id.A4206_2
                || compoundButton.getId() == R.id.A420698
                || compoundButton.getId() == R.id.A420699)

        {
            if (A4206_2.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4206_1);
                ClearAllcontrol.ClearAll(cvA4206_2);
                ClearAllcontrol.ClearAll(cvA4206_3);
                ClearAllcontrol.ClearAll(cvA4206_4);
                ClearAllcontrol.ClearAll(cvA4206_5);
                ClearAllcontrol.ClearAll(cvA4206_6);
                ClearAllcontrol.ClearAll(cvA4206_7);
                ClearAllcontrol.ClearAll(cvA4206_8);
                ClearAllcontrol.ClearAll(cvA4206_9);
                ClearAllcontrol.ClearAll(cvA4206_10);
                ClearAllcontrol.ClearAll(cvA4206_11);
                ClearAllcontrol.ClearAll(cvA4206_12);
                ClearAllcontrol.ClearAll(cvA4206_13);
                ClearAllcontrol.ClearAll(cvA4206_14);
                ClearAllcontrol.ClearAll(cvA4206_15);
                ClearAllcontrol.ClearAll(cvA4206_16);
                ClearAllcontrol.ClearAll(cvA4206_17);
                ClearAllcontrol.ClearAll(cvA4206_18);
                ClearAllcontrol.ClearAll(cvA4206_19);
                ClearAllcontrol.ClearAll(cvA4206_20);
                ClearAllcontrol.ClearAll(cvA4206_21);
                ClearAllcontrol.ClearAll(cvA4206_22);
                ClearAllcontrol.ClearAll(cvA4207);

                cvA4206_1.setVisibility(View.GONE);
                cvA4206_2.setVisibility(View.GONE);
                cvA4206_3.setVisibility(View.GONE);
                cvA4206_4.setVisibility(View.GONE);
                cvA4206_5.setVisibility(View.GONE);
                cvA4206_6.setVisibility(View.GONE);
                cvA4206_7.setVisibility(View.GONE);
                cvA4206_8.setVisibility(View.GONE);
                cvA4206_9.setVisibility(View.GONE);
                cvA4206_10.setVisibility(View.GONE);
                cvA4206_11.setVisibility(View.GONE);
                cvA4206_12.setVisibility(View.GONE);
                cvA4206_13.setVisibility(View.GONE);
                cvA4206_14.setVisibility(View.GONE);
                cvA4206_15.setVisibility(View.GONE);
                cvA4206_16.setVisibility(View.GONE);
                cvA4206_17.setVisibility(View.GONE);
                cvA4206_18.setVisibility(View.GONE);
                cvA4206_19.setVisibility(View.GONE);
                cvA4206_20.setVisibility(View.GONE);
                cvA4206_21.setVisibility(View.GONE);
                cvA4206_22.setVisibility(View.GONE);
                cvA4207.setVisibility(View.GONE);

            } else {
                cvA4206_1.setVisibility(View.VISIBLE);
                cvA4206_2.setVisibility(View.VISIBLE);
                cvA4206_3.setVisibility(View.VISIBLE);
                cvA4206_4.setVisibility(View.VISIBLE);
                cvA4206_5.setVisibility(View.VISIBLE);
                cvA4206_6.setVisibility(View.VISIBLE);
                cvA4206_7.setVisibility(View.VISIBLE);
                cvA4206_8.setVisibility(View.VISIBLE);
                cvA4206_9.setVisibility(View.VISIBLE);
                cvA4206_10.setVisibility(View.VISIBLE);
                cvA4206_11.setVisibility(View.VISIBLE);
                cvA4206_12.setVisibility(View.VISIBLE);
                cvA4206_13.setVisibility(View.VISIBLE);
                cvA4206_14.setVisibility(View.VISIBLE);
                cvA4206_15.setVisibility(View.VISIBLE);
                cvA4206_16.setVisibility(View.VISIBLE);
                cvA4206_17.setVisibility(View.VISIBLE);
                cvA4206_18.setVisibility(View.VISIBLE);
                cvA4206_19.setVisibility(View.VISIBLE);
                cvA4206_20.setVisibility(View.VISIBLE);
                cvA4206_21.setVisibility(View.VISIBLE);
                cvA4206_22.setVisibility(View.VISIBLE);
                cvA4207.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A42061a
                || compoundButton.getId() == R.id.A42061b
                || compoundButton.getId() == R.id.A4206_198
                || compoundButton.getId() == R.id.A4206_199)

        {
            if (A42061b.isChecked() || A4206_198.isChecked() || A4206_199.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4206_2);
                ClearAllcontrol.ClearAll(cvA4206_3);

                cvA4206_2.setVisibility(View.GONE);
                cvA4206_3.setVisibility(View.GONE);

            } else {
                cvA4206_2.setVisibility(View.VISIBLE);
                cvA4206_3.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4206_8_1
                || compoundButton.getId() == R.id.A4206_8_2
                || compoundButton.getId() == R.id.A4206_898
                || compoundButton.getId() == R.id.A4206_899)

        {
            if (A4206_8_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4206_9);

                cvA4206_9.setVisibility(View.GONE);

            } else {
                cvA4206_9.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4206_9_1
                || compoundButton.getId() == R.id.A4206_9_2
                || compoundButton.getId() == R.id.A4206_998
                || compoundButton.getId() == R.id.A4206_999)

        {
            if (A4206_9_2.isChecked() || A4206_998.isChecked() || A4206_999.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4206_10);

                cvA4206_10.setVisibility(View.GONE);

            } else {
                cvA4206_10.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4206_21_1
                || compoundButton.getId() == R.id.A4206_21_2
                || compoundButton.getId() == R.id.A4206_2198
                || compoundButton.getId() == R.id.A4206_2199)

        {
            if (A4206_21_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4206_22);

                cvA4206_22.setVisibility(View.GONE);

            } else {
                cvA4206_22.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4206_21_1
                || compoundButton.getId() == R.id.A4206_21_2
                || compoundButton.getId() == R.id.A4206_2198
                || compoundButton.getId() == R.id.A4206_2199)

        {
            if (A4206_21_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4206_22);

                cvA4206_22.setVisibility(View.GONE);

            } else {
                cvA4206_22.setVisibility(View.VISIBLE);
            }
        }

    }


    private void events_calls() {

        btn_next10.setOnClickListener(this);

        A4206_1.setOnCheckedChangeListener(this);
        A4206_2.setOnCheckedChangeListener(this);
        A420698.setOnCheckedChangeListener(this);
        A420699.setOnCheckedChangeListener(this);
        A42061a.setOnCheckedChangeListener(this);
        A42061b.setOnCheckedChangeListener(this);
        A4206_198.setOnCheckedChangeListener(this);
        A4206_199.setOnCheckedChangeListener(this);
        A42063a.setOnCheckedChangeListener(this);
        A42063b.setOnCheckedChangeListener(this);
        A42063c.setOnCheckedChangeListener(this);
        A42063d.setOnCheckedChangeListener(this);
        A42063e.setOnCheckedChangeListener(this);
        A42063f.setOnCheckedChangeListener(this);
        A4206396.setOnCheckedChangeListener(this);
        A4206_398.setOnCheckedChangeListener(this);
        A4206_399.setOnCheckedChangeListener(this);
        A4206_8_1.setOnCheckedChangeListener(this);
        A4206_8_2.setOnCheckedChangeListener(this);
        A4206_898.setOnCheckedChangeListener(this);
        A4206_899.setOnCheckedChangeListener(this);
        A4206_9_1.setOnCheckedChangeListener(this);
        A4206_9_2.setOnCheckedChangeListener(this);
        A4206_998.setOnCheckedChangeListener(this);
        A4206_999.setOnCheckedChangeListener(this);
        A4206_21_1.setOnCheckedChangeListener(this);
        A4206_21_2.setOnCheckedChangeListener(this);
        A4206_2198.setOnCheckedChangeListener(this);
        A4206_2199.setOnCheckedChangeListener(this);

        ed_A4207_hour.setFilters(new InputFilter[]{new InputFilterMinMax(0, 23, 99, 99)});

    }

    void value_assignment() {

        study_id = "0";
        A4206 = "-1";
        A4206_1 = "-1";
        A4206_2 = "-1";
        A4206_3 = "-1";
        A4206_4 = "-1";
        A4206_5 = "-1";
        A4206_6 = "-1";
        A4206_7 = "-1";
        A4206_8 = "-1";
        A4206_9 = "-1";
        A4206_10 = "-1";
        A4206_11 = "-1";
        A4206_12 = "-1";
        A4206_13 = "-1";
        A4206_14 = "-1";
        A4206_15 = "-1";
        A4206_16 = "-1";
        A4206_17 = "-1";
        A4206_18 = "-1";
        A4206_19 = "-1";
        A4206_20 = "-1";
        A4206_21 = "-1";
        A4206_22 = "-1";
        A4207_hour = "-1";
        A4207_day = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4206
        if (A4206_1.isChecked()) {
            A4206 = "1";
        }
        if (A4206_2.isChecked()) {
            A4206 = "2";
        }
        if (A420698.isChecked()) {
            A4206 = "9";
        }
        if (A420699.isChecked()) {
            A4206 = "8";
        }

        //A4206_1
        if (A42061a.isChecked()) {
            A4206_1 = "1";
        }
        if (A42061b.isChecked()) {
            A4206_1 = "2";
        }
        if (A4206_198.isChecked()) {
            A4206_1 = "9";
        }
        if (A4206_199.isChecked()) {
            A4206_1 = "8";
        }

        //A4206_2
        if (A42062a.isChecked()) {
            A4206_2 = "1";
        }
        if (A42062b.isChecked()) {
            A4206_2 = "2";
        }
        if (A42062c.isChecked()) {
            A4206_2 = "3";
        }
        if (A42062d.isChecked()) {
            A4206_2 = "4";
        }
        if (A42062e.isChecked()) {
            A4206_2 = "5";
        }
        if (A42062f.isChecked()) {
            A4206_2 = "6";
        }
        if (A4206_298.isChecked()) {
            A4206_2 = "9";
        }
        if (A4206_299.isChecked()) {
            A4206_2 = "8";
        }

        //A4206_3
        if (A42063a.isChecked()) {
            A4206_3 = "1";
        }
        if (A42063b.isChecked()) {
            A4206_3 = "2";
        }
        if (A42063c.isChecked()) {
            A4206_3 = "3";
        }
        if (A42063d.isChecked()) {
            A4206_3 = "4";
        }
        if (A42063e.isChecked()) {
            A4206_3 = "5";
        }
        if (A42063f.isChecked()) {
            A4206_3 = "6";
        }
        if (A4206396.isChecked()) {
            A4206_3 = "7";
        }
        if (A4206_398.isChecked()) {
            A4206_3 = "9";
        }
        if (A4206_399.isChecked()) {
            A4206_3 = "8";
        }

        //A4206_4
        if (A4206_4_1.isChecked()) {
            A4206_4 = "1";
        }
        if (A4206_4_2.isChecked()) {
            A4206_4 = "2";
        }
        if (A4206_498.isChecked()) {
            A4206_4 = "9";
        }
        if (A4206_499.isChecked()) {
            A4206_4 = "8";
        }

        //A4206_5
        if (A4206_5_1.isChecked()) {
            A4206_5 = "1";
        }
        if (A4206_5_2.isChecked()) {
            A4206_5 = "2";
        }
        if (A4206_598.isChecked()) {
            A4206_5 = "9";
        }
        if (A4206_599.isChecked()) {
            A4206_5 = "8";
        }

        //A4206_6
        if (A4206_6_1.isChecked()) {
            A4206_6 = "1";
        }
        if (A4206_6_2.isChecked()) {
            A4206_6 = "2";
        }
        if (A4206_698.isChecked()) {
            A4206_6 = "9";
        }
        if (A4206_699.isChecked()) {
            A4206_6 = "8";
        }

        //A4206_7
        if (A4206_7_1.isChecked()) {
            A4206_7 = "1";
        }
        if (A4206_7_2.isChecked()) {
            A4206_7 = "2";
        }
        if (A4206_798.isChecked()) {
            A4206_7 = "9";
        }
        if (A4206_799.isChecked()) {
            A4206_7 = "8";
        }

        //A4206_8
        if (A4206_8_1.isChecked()) {
            A4206_8 = "1";
        }
        if (A4206_8_2.isChecked()) {
            A4206_8 = "2";
        }
        if (A4206_898.isChecked()) {
            A4206_8 = "9";
        }
        if (A4206_899.isChecked()) {
            A4206_8 = "8";
        }

        //A4206_9
        if (A4206_9_1.isChecked()) {
            A4206_9 = "1";
        }
        if (A4206_9_2.isChecked()) {
            A4206_9 = "2";
        }
        if (A4206_998.isChecked()) {
            A4206_9 = "9";
        }
        if (A4206_999.isChecked()) {
            A4206_9 = "8";
        }

        //A4206_10
        if (A4206_10_1.isChecked()) {
            A4206_10 = "1";
        }
        if (A4206_10_2.isChecked()) {
            A4206_10 = "2";
        }
        if (A4206_10_3.isChecked()) {
            A4206_10 = "3";
        }
        if (A4206_10_4.isChecked()) {
            A4206_10 = "4";
        }
        if (A4206_1098.isChecked()) {
            A4206_10 = "9";
        }
        if (A4206_1099.isChecked()) {
            A4206_10 = "8";
        }

        //A4206_11
        if (A4206_11_1.isChecked()) {
            A4206_11 = "1";
        }
        if (A4206_11_2.isChecked()) {
            A4206_11 = "2";
        }
        if (A4206_1198.isChecked()) {
            A4206_11 = "9";
        }
        if (A4206_1199.isChecked()) {
            A4206_11 = "8";
        }

        //A4206_12
        if (A4206_12_1.isChecked()) {
            A4206_12 = "1";
        }
        if (A4206_12_2.isChecked()) {
            A4206_12 = "2";
        }
        if (A4206_1298.isChecked()) {
            A4206_12 = "9";
        }
        if (A4206_1299.isChecked()) {
            A4206_12 = "8";
        }

        //A4206_13
        if (A4206_13_1.isChecked()) {
            A4206_13 = "1";
        }
        if (A4206_13_2.isChecked()) {
            A4206_13 = "2";
        }
        if (A4206_1398.isChecked()) {
            A4206_13 = "9";
        }
        if (A4206_1399.isChecked()) {
            A4206_13 = "8";
        }

        //A4206_14
        if (A4206_14_1.isChecked()) {
            A4206_14 = "1";
        }
        if (A4206_14_2.isChecked()) {
            A4206_14 = "2";
        }
        if (A4206_1498.isChecked()) {
            A4206_14 = "9";
        }
        if (A4206_1499.isChecked()) {
            A4206_14 = "8";
        }

        //A4206_15
        if (A4206_15_1.isChecked()) {
            A4206_15 = "1";
        }
        if (A4206_15_2.isChecked()) {
            A4206_15 = "2";
        }
        if (A4206_1598.isChecked()) {
            A4206_15 = "9";
        }
        if (A4206_1599.isChecked()) {
            A4206_15 = "8";
        }

        //A4206_16
        if (A4206_16_1.isChecked()) {
            A4206_16 = "1";
        }
        if (A4206_16_2.isChecked()) {
            A4206_16 = "2";
        }
        if (A4206_1698.isChecked()) {
            A4206_16 = "9";
        }
        if (A4206_1699.isChecked()) {
            A4206_16 = "8";
        }

        //A4206_17
        if (A4206_17_1.isChecked()) {
            A4206_17 = "1";
        }
        if (A4206_17_2.isChecked()) {
            A4206_17 = "2";
        }
        if (A4206_1798.isChecked()) {
            A4206_17 = "9";
        }
        if (A4206_1799.isChecked()) {
            A4206_17 = "8";
        }

        //A4206_18
        if (A4206_18_1.isChecked()) {
            A4206_18 = "1";
        }
        if (A4206_18_2.isChecked()) {
            A4206_18 = "2";
        }
        if (A4206_1898.isChecked()) {
            A4206_18 = "9";
        }
        if (A4206_1899.isChecked()) {
            A4206_18 = "8";
        }

        //A4206_19
        if (A4206_19_1.isChecked()) {
            A4206_19 = "1";
        }
        if (A4206_19_2.isChecked()) {
            A4206_19 = "2";
        }
        if (A4206_1998.isChecked()) {
            A4206_19 = "9";
        }
        if (A4206_1999.isChecked()) {
            A4206_19 = "8";
        }

        //A4206_20
        if (A4206_20_1.isChecked()) {
            A4206_20 = "1";
        }
        if (A4206_20_2.isChecked()) {
            A4206_20 = "2";
        }
        if (A4206_2098.isChecked()) {
            A4206_20 = "9";
        }
        if (A4206_2099.isChecked()) {
            A4206_20 = "8";
        }

        //A4206_21
        if (A4206_21_1.isChecked()) {
            A4206_21 = "1";
        }
        if (A4206_21_2.isChecked()) {
            A4206_21 = "2";
        }
        if (A4206_2198.isChecked()) {
            A4206_21 = "9";
        }
        if (A4206_2199.isChecked()) {
            A4206_21 = "8";
        }

        //A4206_22
        if (A4206_22_1.isChecked()) {
            A4206_22 = "1";
        }
        if (A4206_22_2.isChecked()) {
            A4206_22 = "2";
        }
        if (A4206_2298.isChecked()) {
            A4206_22 = "9";
        }
        if (A4206_2299.isChecked()) {
            A4206_22 = "8";
        }

        //A4207_hour
        if (ed_A4207_hour.getText().toString().trim().length() > 0) {
            A4207_hour = ed_A4207_hour.getText().toString().trim();
        }

        //A4207_day
        if (ed_A4207_day.getText().toString().trim().length() > 0) {
            A4207_day = ed_A4207_day.getText().toString().trim();
        }

    }

    void insert_data() {

        String query = "insert into A4206_A4207("

                + Global.A.A4206_A4207.study_id + ","
                + Global.A.A4206_A4207.A4206 + ","
                + Global.A.A4206_A4207.A4206_1 + ","
                + Global.A.A4206_A4207.A4206_2 + ","
                + Global.A.A4206_A4207.A4206_3 + ","
                + Global.A.A4206_A4207.A4206_4 + ","
                + Global.A.A4206_A4207.A4206_5 + ","
                + Global.A.A4206_A4207.A4206_6 + ","
                + Global.A.A4206_A4207.A4206_7 + ","
                + Global.A.A4206_A4207.A4206_8 + ","
                + Global.A.A4206_A4207.A4206_9 + ","
                + Global.A.A4206_A4207.A4206_10 + ","
                + Global.A.A4206_A4207.A4206_11 + ","
                + Global.A.A4206_A4207.A4206_12 + ","
                + Global.A.A4206_A4207.A4206_13 + ","
                + Global.A.A4206_A4207.A4206_14 + ","
                + Global.A.A4206_A4207.A4206_15 + ","
                + Global.A.A4206_A4207.A4206_16 + ","
                + Global.A.A4206_A4207.A4206_17 + ","
                + Global.A.A4206_A4207.A4206_18 + ","
                + Global.A.A4206_A4207.A4206_19 + ","
                + Global.A.A4206_A4207.A4206_20 + ","
                + Global.A.A4206_A4207.A4206_21 + ","
                + Global.A.A4206_A4207.A4206_22 + ","
                + Global.A.A4206_A4207.A4207_hour + ","
                + Global.A.A4206_A4207.A4207_day + ","
                + Global.A.A4206_A4207.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4206 + "','" +
                A4206_1 + "','" +
                A4206_2 + "','" +
                A4206_3 + "','" +
                A4206_4 + "','" +
                A4206_5 + "','" +
                A4206_6 + "','" +
                A4206_7 + "','" +
                A4206_8 + "','" +
                A4206_9 + "','" +
                A4206_10 + "','" +
                A4206_11 + "','" +
                A4206_12 + "','" +
                A4206_13 + "','" +
                A4206_14 + "','" +
                A4206_15 + "','" +
                A4206_16 + "','" +
                A4206_17 + "','" +
                A4206_18 + "','" +
                A4206_19 + "','" +
                A4206_20 + "','" +
                A4206_21 + "','" +
                A4206_22 + "','" +
                A4207_hour + "','" +
                A4207_day + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "10th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4206) != false;
    }
}
