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

import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4206_A4207 extends AppCompatActivity implements View.OnClickListener {




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

        Intent c = new Intent(A4206_A4207.this, A4251_A4284.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }


    private void setupSkips() {

        A4206.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A4206b.getId()) {
                    cvA42061.setVisibility(View.VISIBLE);
                    cvA42062.setVisibility(View.VISIBLE);
                    cvA42063.setVisibility(View.VISIBLE);
                    cvA42064.setVisibility(View.VISIBLE);
                    cvA42065.setVisibility(View.VISIBLE);
                    cvA42066.setVisibility(View.VISIBLE);
                    cvA42067.setVisibility(View.VISIBLE);
                    cvA42068.setVisibility(View.VISIBLE);
                    cvA42069.setVisibility(View.VISIBLE);
                    cvA420610.setVisibility(View.VISIBLE);
                    cvA420611.setVisibility(View.VISIBLE);
                    cvA420612.setVisibility(View.VISIBLE);
                    cvA420613.setVisibility(View.VISIBLE);
                    cvA420614.setVisibility(View.VISIBLE);
                    cvA420615.setVisibility(View.VISIBLE);
                    cvA420616.setVisibility(View.VISIBLE);
                    cvA420617.setVisibility(View.VISIBLE);
                    cvA420618.setVisibility(View.VISIBLE);
                    cvA420619.setVisibility(View.VISIBLE);
                    cvA420620.setVisibility(View.VISIBLE);
                    cvA420621.setVisibility(View.VISIBLE);
                    cvA420622.setVisibility(View.VISIBLE);
                    cvA4207.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA42061);
                    ClearAllcontrol.ClearAllC(cvA42062);
                    ClearAllcontrol.ClearAllC(cvA42063);
                    ClearAllcontrol.ClearAllC(cvA42064);
                    ClearAllcontrol.ClearAllC(cvA42065);
                    ClearAllcontrol.ClearAllC(cvA42066);
                    ClearAllcontrol.ClearAllC(cvA42067);
                    ClearAllcontrol.ClearAllC(cvA42068);
                    ClearAllcontrol.ClearAllC(cvA42069);
                    ClearAllcontrol.ClearAllC(cvA420610);
                    ClearAllcontrol.ClearAllC(cvA420611);
                    ClearAllcontrol.ClearAllC(cvA420612);
                    ClearAllcontrol.ClearAllC(cvA420613);
                    ClearAllcontrol.ClearAllC(cvA420614);
                    ClearAllcontrol.ClearAllC(cvA420615);
                    ClearAllcontrol.ClearAllC(cvA420616);
                    ClearAllcontrol.ClearAllC(cvA420617);
                    ClearAllcontrol.ClearAllC(cvA420618);
                    ClearAllcontrol.ClearAllC(cvA420619);
                    ClearAllcontrol.ClearAllC(cvA420620);
                    ClearAllcontrol.ClearAllC(cvA420621);
                    ClearAllcontrol.ClearAllC(cvA420622);
                    ClearAllcontrol.ClearAllC(cvA4207);

                    cvA42061.setVisibility(View.GONE);
                    cvA42062.setVisibility(View.GONE);
                    cvA42063.setVisibility(View.GONE);
                    cvA42064.setVisibility(View.GONE);
                    cvA42065.setVisibility(View.GONE);
                    cvA42066.setVisibility(View.GONE);
                    cvA42067.setVisibility(View.GONE);
                    cvA42068.setVisibility(View.GONE);
                    cvA42069.setVisibility(View.GONE);
                    cvA420610.setVisibility(View.GONE);
                    cvA420611.setVisibility(View.GONE);
                    cvA420612.setVisibility(View.GONE);
                    cvA420613.setVisibility(View.GONE);
                    cvA420614.setVisibility(View.GONE);
                    cvA420615.setVisibility(View.GONE);
                    cvA420616.setVisibility(View.GONE);
                    cvA420617.setVisibility(View.GONE);
                    cvA420618.setVisibility(View.GONE);
                    cvA420619.setVisibility(View.GONE);
                    cvA420620.setVisibility(View.GONE);
                    cvA420621.setVisibility(View.GONE);
                    cvA420622.setVisibility(View.GONE);
                    cvA4207.setVisibility(View.GONE);
                }
            }
        });


        A42061.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A42061a.getId()) {
                    cvA42062.setVisibility(View.VISIBLE);
                    cvA42063.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA42062);
                    ClearAllcontrol.ClearAllC(cvA42063);
                    cvA42062.setVisibility(View.GONE);
                    cvA42063.setVisibility(View.GONE);
                }
            }
        });


        A42068.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A42068a.getId()) {
                    cvA42069.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA42069);
                    cvA42069.setVisibility(View.GONE);
                }
            }
        });


        A42069.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A42069a.getId()) {
                    cvA420610.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA420610);
                    cvA420610.setVisibility(View.GONE);
                }
            }
        });


        A420621.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A420621a.getId()) {
                    cvA420622.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA420622);
                    cvA420622.setVisibility(View.GONE);
                }
            }
        });


        A420621.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A420621a.getId()) {
                    cvA420622.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA420622);
                    cvA420622.setVisibility(View.GONE);
                }
            }
        });

    }


    private void events_calls() {

        btn_next10.setOnClickListener(this);

        A4207H.setFilters(new InputFilter[]{new InputFilterMinMax(0, 23, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4206
        json.put("A4206", A4206a.isChecked() ? "1"
                : A4206b.isChecked() ? "2"
                : A420698.isChecked() ? "98"
                : A420699.isChecked() ? "99"
                : "-1");

        //A42061
        json.put("A42061", A42061a.isChecked() ? "1"
                : A42061b.isChecked() ? "2"
                : A4206198.isChecked() ? "98"
                : A4206199.isChecked() ? "99"
                : "-1");

        //A42062
        json.put("A42062", A42062a.isChecked() ? "1"
                : A42062b.isChecked() ? "2"
                : A42062c.isChecked() ? "3"
                : A42062d.isChecked() ? "4"
                : A42062e.isChecked() ? "5"
                : A4206296.isChecked() ? "96"
                : A4206298.isChecked() ? "98"
                : A4206299.isChecked() ? "99"
                : "-1");

        //A42063
        json.put("A42063", A42063a.isChecked() ? "1"
                : A42063b.isChecked() ? "2"
                : A42063c.isChecked() ? "3"
                : A42063d.isChecked() ? "4"
                : A42063e.isChecked() ? "5"
                : A42063f.isChecked() ? "6"
                : A4206396.isChecked() ? "96"
                : A4206398.isChecked() ? "98"
                : A4206399.isChecked() ? "99"
                : "-1");

        //A42064
        json.put("A42064", A42064a.isChecked() ? "1"
                : A42064b.isChecked() ? "2"
                : A4206498.isChecked() ? "98"
                : A4206499.isChecked() ? "99"
                : "-1");

        //A42065
        json.put("A42065", A42065a.isChecked() ? "1"
                : A42065b.isChecked() ? "2"
                : A4206598.isChecked() ? "98"
                : A4206599.isChecked() ? "99"
                : "-1");

        //A42066
        json.put("A42066", A42066a.isChecked() ? "1"
                : A42066b.isChecked() ? "2"
                : A4206698.isChecked() ? "98"
                : A4206699.isChecked() ? "99"
                : "-1");

        //A42067
        json.put("A42067", A42067a.isChecked() ? "1"
                : A42067b.isChecked() ? "2"
                : A4206798.isChecked() ? "98"
                : A4206799.isChecked() ? "99"
                : "-1");

        //A42068
        json.put("A42068", A42068a.isChecked() ? "1"
                : A42068b.isChecked() ? "2"
                : A4206898.isChecked() ? "98"
                : A4206899.isChecked() ? "99"
                : "-1");

        //A42069
        json.put("A42069", A42069a.isChecked() ? "1"
                : A42069b.isChecked() ? "2"
                : A4206998.isChecked() ? "98"
                : A4206999.isChecked() ? "99"
                : "-1");

        //A420610
        json.put("A420610", A420610a.isChecked() ? "1"
                : A420610b.isChecked() ? "2"
                : A420610c.isChecked() ? "3"
                : A42061096.isChecked() ? "96"
                : A42061098.isChecked() ? "98"
                : A42061099.isChecked() ? "99"
                : "-1");

        //A420611
        json.put("A420611", A420611a.isChecked() ? "1"
                : A420611b.isChecked() ? "2"
                : A42061198.isChecked() ? "98"
                : A42061199.isChecked() ? "99"
                : "-1");

        //A420612
        json.put("A420612", A420612a.isChecked() ? "1"
                : A420612b.isChecked() ? "2"
                : A42061298.isChecked() ? "98"
                : A42061299.isChecked() ? "99"
                : "-1");

        //A420613
        json.put("A420613", A420613a.isChecked() ? "1"
                : A420613b.isChecked() ? "2"
                : A42061398.isChecked() ? "98"
                : A42061399.isChecked() ? "99"
                : "-1");

        //A420614
        json.put("A420614", A420614a.isChecked() ? "1"
                : A420614b.isChecked() ? "2"
                : A42061498.isChecked() ? "98"
                : A42061499.isChecked() ? "99"
                : "-1");

        //A420615
        json.put("A420615", A420615a.isChecked() ? "1"
                : A420615b.isChecked() ? "2"
                : A42061598.isChecked() ? "98"
                : A42061599.isChecked() ? "99"
                : "-1");

        //A420616
        json.put("A420616", A420616a.isChecked() ? "1"
                : A420616b.isChecked() ? "2"
                : A42061698.isChecked() ? "98"
                : A42061699.isChecked() ? "99"
                : "-1");

        //A420617
        json.put("A420617", A420617a.isChecked() ? "1"
                : A420617b.isChecked() ? "2"
                : A42061798.isChecked() ? "98"
                : A42061799.isChecked() ? "99"
                : "-1");

        //A420618
        json.put("A420618", A420618a.isChecked() ? "1"
                : A420618b.isChecked() ? "2"
                : A42061898.isChecked() ? "98"
                : A42061899.isChecked() ? "99"
                : "-1");

        //A420619
        json.put("A420619", A420619a.isChecked() ? "1"
                : A420619b.isChecked() ? "2"
                : A42061998.isChecked() ? "98"
                : A42061999.isChecked() ? "99"
                : "-1");
        
        

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

        //A4207H
        json.put("A4207H", A4207H.getText().toString().trim().length() > 0 ? A4207H.getText().toString().trim() : "-1");

        //A4207D
        json.put("A4207D", A4207D.getText().toString().trim().length() > 0 ? A4207D.getText().toString().trim() : "-1");

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4206) != false;
    }
}
