package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class A4301 extends AppCompatActivity {

    private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
    //Declaration Region
    Button
            btn_next12;
    LinearLayout
            llA4301;
    CardView
            cvstudy_id,
            cvA4301,
            cvA43021,
            cvA43022,
            cvA43023,
            cvA43024,
            cvA43025,
            cvA43026,
            cvA43027,
            cvA4303,
            cvA4304,
            cvA4305,
            cvA43061check,
            cvA43061,
            cvA43062check,
            cvA43062,
            cvA4307,
            cvA4308,
            cvA4309,
            cvA43101,
            cvA43102,
            cvA43103,
            cvA43104,
            cvA43105,
            cvA43106,
            cvA43107,
            cvA43108,
            cvA43109,
            cvA431010,
            cvA431011,
            cvA43111,
            cvA43112,
            cvA43113,
            cvA43114,
            cvA43115,
            cvA4312,
            cvA4313,
            cvA4314,
            cvA4315;
    RadioGroup
            A4301,
            A43021,
            A43022,
            A43023,
            A43024,
            A43025,
            A43026,
            A43027,
            A4303,
            A4304,
            A4305,
            A43061check,
            A43062check,
            A43101,
            A43102,
            A43103,
            A43104,
            A43105,
            A43106,
            A43107,
            A43108,
            A43109,
            A431010,
            A431011,
            A43111,
            A43112,
            A43113,
            A43114,
            A43115,
            A4312,
            A4313,
            A4314;
    RadioButton
            A4301a,
            A4301b,
            A430198,
            A430199,
            A43021a,
            A43021b,
            A4302198,
            A4302199,
            A43022a,
            A43022b,
            A4302298,
            A4302299,
            A43023a,
            A43023b,
            A4302398,
            A4302399,
            A43024a,
            A43024b,
            A4302498,
            A4302499,
            A43025a,
            A43025b,
            A4302598,
            A4302599,
            A43026a,
            A43026b,
            A4302698,
            A4302699,
            A43027a,
            A43027b,
            A4302798,
            A4302799,
            A4303a,
            A4303b,
            A430398,
            A430399,
            A4304a,
            A4304b,
            A430498,
            A430499,
            A4305a,
            A4305b,
            A43061checka,
            A43061checkb,
            A43062checka,
            A43062checkb,
            A43101a,
            A43101b,
            A4310198,
            A4310199,
            A43102a,
            A43102b,
            A4310298,
            A4310299,
            A43103a,
            A43103b,
            A4310398,
            A4310399,
            A43104a,
            A43104b,
            A4310498,
            A4310499,
            A43105a,
            A43105b,
            A4310598,
            A4310599,
            A43106a,
            A43106b,
            A4310698,
            A4310699,
            A43107a,
            A43107b,
            A4310798,
            A4310799,
            A43108a,
            A43108b,
            A4310898,
            A4310899,
            A43109a,
            A43109b,
            A4310998,
            A4310999,
            A431010a,
            A431010b,
            A43101098,
            A43101099,
            A431011a,
            A431011b,
            A43101198,
            A43101199,
            A43111a,
            A43111b,
            A4311198,
            A4311199,
            A43112a,
            A43112b,
            A4311298,
            A4311299,
            A43113a,
            A43113b,
            A4311398,
            A4311399,
            A43114a,
            A43114b,
            A4311498,
            A4311499,
            A43115a,
            A43115b,
            A4311598,
            A4311599,
            A4312a,
            A4312b,
            A431298,
            A431299,
            A4313a,
            A4313b,
            A431398,
            A431399,
            A4314a,
            A4314b,
            A431498,
            A431499;
    EditText
            ed_study_id,
            A43061,
            A43062,
            A4307,
            A4308,
            A4309,
            A4315;
    String
            study_id,
            STATUS;
    private Pattern pattern;
    private Matcher matcher;

    //EndRegion Declaration

    void Initialization() {

        btn_next12 = findViewById(R.id.btn_next12);

        llA4301 = findViewById(R.id.llA4301);

        cvA4301 = findViewById(R.id.cvA4301);
        cvA43021 = findViewById(R.id.cvA43021);
        cvA43022 = findViewById(R.id.cvA43022);
        cvA43023 = findViewById(R.id.cvA43023);
        cvA43024 = findViewById(R.id.cvA43024);
        cvA43025 = findViewById(R.id.cvA43025);
        cvA43026 = findViewById(R.id.cvA43026);
        cvA43027 = findViewById(R.id.cvA43027);
        cvA4303 = findViewById(R.id.cvA4303);
        cvA4304 = findViewById(R.id.cvA4304);
        cvA4305 = findViewById(R.id.cvA4305);
        cvA43061check = findViewById(R.id.cvA43061check);
        cvA43061 = findViewById(R.id.cvA43061);
        cvA43062check = findViewById(R.id.cvA43062check);
        cvA43062 = findViewById(R.id.cvA43062);
        cvA4307 = findViewById(R.id.cvA4307);
        cvA4308 = findViewById(R.id.cvA4308);
        cvA4309 = findViewById(R.id.cvA4309);
        cvA43101 = findViewById(R.id.cvA43101);
        cvA43102 = findViewById(R.id.cvA43102);
        cvA43103 = findViewById(R.id.cvA43103);
        cvA43104 = findViewById(R.id.cvA43104);
        cvA43105 = findViewById(R.id.cvA43105);
        cvA43106 = findViewById(R.id.cvA43106);
        cvA43107 = findViewById(R.id.cvA43107);
        cvA43108 = findViewById(R.id.cvA43108);
        cvA43109 = findViewById(R.id.cvA43109);
        cvA431010 = findViewById(R.id.cvA431010);
        cvA431011 = findViewById(R.id.cvA431011);
        cvA43111 = findViewById(R.id.cvA43111);
        cvA43112 = findViewById(R.id.cvA43112);
        cvA43113 = findViewById(R.id.cvA43113);
        cvA43114 = findViewById(R.id.cvA43114);
        cvA43115 = findViewById(R.id.cvA43115);
        cvA4312 = findViewById(R.id.cvA4312);
        cvA4313 = findViewById(R.id.cvA4313);
        cvA4314 = findViewById(R.id.cvA4314);
        cvA4315 = findViewById(R.id.cvA4315);


        A4301 = findViewById(R.id.A4301);
        A43021 = findViewById(R.id.A43021);
        A43022 = findViewById(R.id.A43022);
        A43023 = findViewById(R.id.A43023);
        A43024 = findViewById(R.id.A43024);
        A43025 = findViewById(R.id.A43025);
        A43026 = findViewById(R.id.A43026);
        A43027 = findViewById(R.id.A43027);
        A4303 = findViewById(R.id.A4303);
        A4304 = findViewById(R.id.A4304);
        A4305 = findViewById(R.id.A4305);
        A43061check = findViewById(R.id.A43061check);
        A43062check = findViewById(R.id.A43062check);
        A43101 = findViewById(R.id.A43101);
        A43102 = findViewById(R.id.A43102);
        A43103 = findViewById(R.id.A43103);
        A43104 = findViewById(R.id.A43104);
        A43105 = findViewById(R.id.A43105);
        A43106 = findViewById(R.id.A43106);
        A43107 = findViewById(R.id.A43107);
        A43108 = findViewById(R.id.A43108);
        A43109 = findViewById(R.id.A43109);
        A431010 = findViewById(R.id.A431010);
        A431011 = findViewById(R.id.A431011);
        A43111 = findViewById(R.id.A43111);
        A43112 = findViewById(R.id.A43112);
        A43113 = findViewById(R.id.A43113);
        A43114 = findViewById(R.id.A43114);
        A43115 = findViewById(R.id.A43115);
        A4312 = findViewById(R.id.A4312);
        A4313 = findViewById(R.id.A4313);
        A4314 = findViewById(R.id.A4314);


        A4301a = findViewById(R.id.A4301a);
        A4301b = findViewById(R.id.A4301b);
        A430198 = findViewById(R.id.A430198);
        A430199 = findViewById(R.id.A430199);
        A43021a = findViewById(R.id.A43021a);
        A43021b = findViewById(R.id.A43021b);
        A4302198 = findViewById(R.id.A4302198);
        A4302199 = findViewById(R.id.A4302199);
        A43022a = findViewById(R.id.A43022a);
        A43022b = findViewById(R.id.A43022b);
        A4302298 = findViewById(R.id.A4302298);
        A4302299 = findViewById(R.id.A4302299);
        A43023a = findViewById(R.id.A43023a);
        A43023b = findViewById(R.id.A43023b);
        A4302398 = findViewById(R.id.A4302398);
        A4302399 = findViewById(R.id.A4302399);
        A43024a = findViewById(R.id.A43024a);
        A43024b = findViewById(R.id.A43024b);
        A4302498 = findViewById(R.id.A4302498);
        A4302499 = findViewById(R.id.A4302499);
        A43025a = findViewById(R.id.A43025a);
        A43025b = findViewById(R.id.A43025b);
        A4302598 = findViewById(R.id.A4302598);
        A4302599 = findViewById(R.id.A4302599);
        A43026a = findViewById(R.id.A43026a);
        A43026b = findViewById(R.id.A43026b);
        A4302698 = findViewById(R.id.A4302698);
        A4302699 = findViewById(R.id.A4302699);
        A43027a = findViewById(R.id.A43027a);
        A43027b = findViewById(R.id.A43027b);
        A4302798 = findViewById(R.id.A4302798);
        A4302799 = findViewById(R.id.A4302799);
        A4303a = findViewById(R.id.A4303a);
        A4303b = findViewById(R.id.A4303b);
        A430398 = findViewById(R.id.A430398);
        A430399 = findViewById(R.id.A430399);
        A4304a = findViewById(R.id.A4304a);
        A4304b = findViewById(R.id.A4304b);
        A430498 = findViewById(R.id.A430498);
        A430499 = findViewById(R.id.A430499);
        A4305a = findViewById(R.id.A4305a);
        A4305b = findViewById(R.id.A4305b);
        A43061checka = findViewById(R.id.A43061checka);
        A43061checkb = findViewById(R.id.A43061checkb);
        A43062checka = findViewById(R.id.A43062checka);
        A43062checkb = findViewById(R.id.A43062checkb);
        A43101a = findViewById(R.id.A43101a);
        A43101b = findViewById(R.id.A43101b);
        A4310198 = findViewById(R.id.A4310198);
        A4310199 = findViewById(R.id.A4310199);
        A43102a = findViewById(R.id.A43102a);
        A43102b = findViewById(R.id.A43102b);
        A4310298 = findViewById(R.id.A4310298);
        A4310299 = findViewById(R.id.A4310299);
        A43103a = findViewById(R.id.A43103a);
        A43103b = findViewById(R.id.A43103b);
        A4310398 = findViewById(R.id.A4310398);
        A4310399 = findViewById(R.id.A4310399);
        A43104a = findViewById(R.id.A43104a);
        A43104b = findViewById(R.id.A43104b);
        A4310498 = findViewById(R.id.A4310498);
        A4310499 = findViewById(R.id.A4310499);
        A43105a = findViewById(R.id.A43105a);
        A43105b = findViewById(R.id.A43105b);
        A4310598 = findViewById(R.id.A4310598);
        A4310599 = findViewById(R.id.A4310599);
        A43106a = findViewById(R.id.A43106a);
        A43106b = findViewById(R.id.A43106b);
        A4310698 = findViewById(R.id.A4310698);
        A4310699 = findViewById(R.id.A4310699);
        A43107a = findViewById(R.id.A43107a);
        A43107b = findViewById(R.id.A43107b);
        A4310798 = findViewById(R.id.A4310798);
        A4310799 = findViewById(R.id.A4310799);
        A43108a = findViewById(R.id.A43108a);
        A43108b = findViewById(R.id.A43108b);
        A4310898 = findViewById(R.id.A4310898);
        A4310899 = findViewById(R.id.A4310899);
        A43109a = findViewById(R.id.A43109a);
        A43109b = findViewById(R.id.A43109b);
        A4310998 = findViewById(R.id.A4310998);
        A4310999 = findViewById(R.id.A4310999);
        A431010a = findViewById(R.id.A431010a);
        A431010b = findViewById(R.id.A431010b);
        A43101098 = findViewById(R.id.A43101098);
        A43101099 = findViewById(R.id.A43101099);
        A431011a = findViewById(R.id.A431011a);
        A431011b = findViewById(R.id.A431011b);
        A43101198 = findViewById(R.id.A43101198);
        A43101199 = findViewById(R.id.A43101199);
        A43111a = findViewById(R.id.A43111a);
        A43111b = findViewById(R.id.A43111b);
        A4311198 = findViewById(R.id.A4311198);
        A4311199 = findViewById(R.id.A4311199);
        A43112a = findViewById(R.id.A43112a);
        A43112b = findViewById(R.id.A43112b);
        A4311298 = findViewById(R.id.A4311298);
        A4311299 = findViewById(R.id.A4311299);
        A43113a = findViewById(R.id.A43113a);
        A43113b = findViewById(R.id.A43113b);
        A4311398 = findViewById(R.id.A4311398);
        A4311399 = findViewById(R.id.A4311399);
        A43114a = findViewById(R.id.A43114a);
        A43114b = findViewById(R.id.A43114b);
        A4311498 = findViewById(R.id.A4311498);
        A4311499 = findViewById(R.id.A4311499);
        A43115a = findViewById(R.id.A43115a);
        A43115b = findViewById(R.id.A43115b);
        A4311598 = findViewById(R.id.A4311598);
        A4311599 = findViewById(R.id.A4311599);
        A4312a = findViewById(R.id.A4312a);
        A4312b = findViewById(R.id.A4312b);
        A431298 = findViewById(R.id.A431298);
        A431299 = findViewById(R.id.A431299);
        A4313a = findViewById(R.id.A4313a);
        A4313b = findViewById(R.id.A4313b);
        A431398 = findViewById(R.id.A431398);
        A431399 = findViewById(R.id.A431399);
        A4314a = findViewById(R.id.A4314a);
        A4314b = findViewById(R.id.A4314b);
        A431498 = findViewById(R.id.A431498);
        A431499 = findViewById(R.id.A431499);

        A43061 = findViewById(R.id.A43061);
        A43062 = findViewById(R.id.A43062);
        A4307 = findViewById(R.id.A4307);
        A4308 = findViewById(R.id.A4308);
        A4309 = findViewById(R.id.A4309);
        A4315 = findViewById(R.id.A4315);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4301);

        this.setTitle(getString(R.string.h_a_sec_11));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        setupSkips();


        btn_next12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validateField() == false) {
                    Toast.makeText(A4301.this, "Required fields are missing", Toast.LENGTH_LONG).show();
                    return;
                }

                try {
                    Assignment_Insertion();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                pattern = Pattern.compile(DATE_PATTERN);

        /*if (!validate(A4306a.getText().toString().trim())) {

            A4306a.setError("Kindly enter a valid date");
            A4306a.requestFocus();
            return;
        }

        if (!validate(A4306b.getText().toString().trim())) {

            A4306b.setError("Kindly enter a valid date");
            A4306b.requestFocus();
            return;
        }

        if (!validate(A4307.getText().toString().trim())) {

            A4307.setError("Kindly enter a valid date");
            A4307.requestFocus();
            return;
        }*/


                Intent c = new Intent(A4301.this, A4351_A4364.class);
                c.putExtra("study_id", study_id);
                startActivity(c);
            }
        });

    }


    private void setupSkips() {

        A4301.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4301a.getId()) {
                    cvA43021.setVisibility(View.VISIBLE);
                    cvA43022.setVisibility(View.VISIBLE);
                    cvA43023.setVisibility(View.VISIBLE);
                    cvA43024.setVisibility(View.VISIBLE);
                    cvA43025.setVisibility(View.VISIBLE);
                    cvA43026.setVisibility(View.VISIBLE);
                    cvA43027.setVisibility(View.VISIBLE);
                    cvA4303.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA43021);
                    ClearAllcontrol.ClearAllC(cvA43022);
                    ClearAllcontrol.ClearAllC(cvA43023);
                    ClearAllcontrol.ClearAllC(cvA43024);
                    ClearAllcontrol.ClearAllC(cvA43025);
                    ClearAllcontrol.ClearAllC(cvA43026);
                    ClearAllcontrol.ClearAllC(cvA43027);
                    ClearAllcontrol.ClearAllC(cvA4303);

                    cvA43021.setVisibility(View.GONE);
                    cvA43022.setVisibility(View.GONE);
                    cvA43023.setVisibility(View.GONE);
                    cvA43024.setVisibility(View.GONE);
                    cvA43025.setVisibility(View.GONE);
                    cvA43026.setVisibility(View.GONE);
                    cvA43027.setVisibility(View.GONE);
                    cvA4303.setVisibility(View.GONE);
                }
            }
        });


        A43027.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A43027a.getId()) {
                    cvA4303.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4303);
                    cvA4303.setVisibility(View.GONE);
                }
            }
        });


        A4304.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4304a.getId()) {
                    cvA4305.setVisibility(View.VISIBLE);
                    cvA43061check.setVisibility(View.VISIBLE);
                    cvA43061.setVisibility(View.VISIBLE);
                    cvA43062check.setVisibility(View.VISIBLE);
                    cvA43062.setVisibility(View.VISIBLE);
                    cvA4307.setVisibility(View.VISIBLE);
                    cvA4308.setVisibility(View.VISIBLE);
                    cvA4309.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4305);
                    ClearAllcontrol.ClearAllC(cvA43061check);
                    ClearAllcontrol.ClearAllC(cvA43061);
                    ClearAllcontrol.ClearAllC(cvA43062check);
                    ClearAllcontrol.ClearAllC(cvA43062);
                    ClearAllcontrol.ClearAllC(cvA4307);
                    ClearAllcontrol.ClearAllC(cvA4308);
                    ClearAllcontrol.ClearAllC(cvA4309);

                    cvA4305.setVisibility(View.GONE);
                    cvA43061check.setVisibility(View.GONE);
                    cvA43061.setVisibility(View.GONE);
                    cvA43061check.setVisibility(View.GONE);
                    cvA43061.setVisibility(View.GONE);
                    cvA4307.setVisibility(View.GONE);
                    cvA4308.setVisibility(View.GONE);
                    cvA4309.setVisibility(View.GONE);
                }
            }
        });


        A4305.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4305a.getId()) {
                    cvA43061check.setVisibility(View.VISIBLE);
                    cvA43061.setVisibility(View.VISIBLE);
                    cvA43062check.setVisibility(View.VISIBLE);
                    cvA43062.setVisibility(View.VISIBLE);
                    cvA4307.setVisibility(View.VISIBLE);
                    cvA4308.setVisibility(View.VISIBLE);
                    cvA4309.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA43061check);
                    ClearAllcontrol.ClearAllC(cvA43061);
                    ClearAllcontrol.ClearAllC(cvA43062check);
                    ClearAllcontrol.ClearAllC(cvA43062);
                    ClearAllcontrol.ClearAllC(cvA4307);
                    ClearAllcontrol.ClearAllC(cvA4308);
                    ClearAllcontrol.ClearAllC(cvA4309);

                    cvA43061check.setVisibility(View.GONE);
                    cvA43061.setVisibility(View.GONE);
                    cvA43062check.setVisibility(View.GONE);
                    cvA43062.setVisibility(View.GONE);
                    cvA4307.setVisibility(View.GONE);
                    cvA4308.setVisibility(View.GONE);
                    cvA4309.setVisibility(View.GONE);
                }
            }
        });


        A43061check.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A43061checka.getId()) {
                    cvA43061.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA43061);
                    cvA43061.setVisibility(View.GONE);
                }
            }
        });


        A43062check.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A43062checka.getId()) {
                    cvA43062.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA43062);
                    cvA43062.setVisibility(View.GONE);
                }
            }
        });


        A4314.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4314a.getId()) {
                    cvA4315.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4315);
                    cvA4315.setVisibility(View.GONE);
                }
            }
        });

    }


    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4301
        json.put("A4301", A4301a.isChecked() ? "1"
                : A4301b.isChecked() ? "2"
                : A430198.isChecked() ? "98"
                : A430199.isChecked() ? "99"
                : "-1");

        //A43021
        json.put("A43021", A43021a.isChecked() ? "1"
                : A43021b.isChecked() ? "2"
                : A4302198.isChecked() ? "98"
                : A4302199.isChecked() ? "99"
                : "-1");

        //A43022
        json.put("A43022", A43022a.isChecked() ? "1"
                : A43022b.isChecked() ? "2"
                : A4302298.isChecked() ? "98"
                : A4302299.isChecked() ? "99"
                : "-1");

        //A43023
        json.put("A43023", A43023a.isChecked() ? "1"
                : A43023b.isChecked() ? "2"
                : A4302398.isChecked() ? "98"
                : A4302399.isChecked() ? "99"
                : "-1");

        //A43024
        json.put("A43024", A43024a.isChecked() ? "1"
                : A43024b.isChecked() ? "2"
                : A4302498.isChecked() ? "98"
                : A4302499.isChecked() ? "99"
                : "-1");

        //A43025
        json.put("A43025", A43025a.isChecked() ? "1"
                : A43025b.isChecked() ? "2"
                : A4302598.isChecked() ? "98"
                : A4302599.isChecked() ? "99"
                : "-1");

        //A43026
        json.put("A43026", A43026a.isChecked() ? "1"
                : A43026b.isChecked() ? "2"
                : A4302698.isChecked() ? "98"
                : A4302699.isChecked() ? "99"
                : "-1");

        //A43027
        json.put("A43027", A43027a.isChecked() ? "1"
                : A43027b.isChecked() ? "2"
                : A4302798.isChecked() ? "98"
                : A4302799.isChecked() ? "99"
                : "-1");

        //A4303
        json.put("A4303", A4303a.isChecked() ? "1"
                : A4303b.isChecked() ? "2"
                : A430398.isChecked() ? "98"
                : A430399.isChecked() ? "99"
                : "-1");

        //A4304
        json.put("A4304", A4304a.isChecked() ? "1"
                : A4304b.isChecked() ? "2"
                : A430498.isChecked() ? "98"
                : A430499.isChecked() ? "99"
                : "-1");

        //A4305
        json.put("A4305", A4305a.isChecked() ? "1"
                : A4305b.isChecked() ? "2"
                : "-1");

        //A43061check
        json.put("A43061check", A43061checka.isChecked() ? "1"
                : A43061checkb.isChecked() ? "2"
                : "-1");

        //A43062check
        json.put("A43062check", A43062checka.isChecked() ? "1"
                : A43062checkb.isChecked() ? "2"
                : "-1");

        //A43061
        json.put("A43061", A43061.getText().toString().trim().length() > 0 ? A43061.getText().toString().trim() : "-1");

        //A43062
        json.put("A43062", A43062.getText().toString().trim().length() > 0 ? A43062.getText().toString().trim() : "-1");

        //A4307
        json.put("A4307", A4307.getText().toString().trim().length() > 0 ? A4307.getText().toString().trim() : "-1");

        //A4308
        json.put("A4308", A4308.getText().toString().trim().length() > 0 ? A4308.getText().toString().trim() : "-1");

        //A4309
        json.put("A4309", A4309.getText().toString().trim().length() > 0 ? A4309.getText().toString().trim() : "-1");


        //A43101
        json.put("A43101", A43101a.isChecked() ? "1"
                : A43101b.isChecked() ? "2"
                : A4310198.isChecked() ? "98"
                : A4310199.isChecked() ? "99"
                : "-1");

        //A43102
        json.put("A43102", A43102a.isChecked() ? "1"
                : A43102b.isChecked() ? "2"
                : A4310298.isChecked() ? "98"
                : A4310299.isChecked() ? "99"
                : "-1");

        //A43103
        json.put("A43103", A43103a.isChecked() ? "1"
                : A43103b.isChecked() ? "2"
                : A4310398.isChecked() ? "98"
                : A4310399.isChecked() ? "99"
                : "-1");

        //A43104
        json.put("A43104", A43104a.isChecked() ? "1"
                : A43104b.isChecked() ? "2"
                : A4310498.isChecked() ? "98"
                : A4310499.isChecked() ? "99"
                : "-1");

        //A43105
        json.put("A43105", A43105a.isChecked() ? "1"
                : A43105b.isChecked() ? "2"
                : A4310598.isChecked() ? "98"
                : A4310599.isChecked() ? "99"
                : "-1");

        //A43106
        json.put("A43106", A43106a.isChecked() ? "1"
                : A43106b.isChecked() ? "2"
                : A4310698.isChecked() ? "98"
                : A4310699.isChecked() ? "99"
                : "-1");

        //A43107
        json.put("A43107", A43107a.isChecked() ? "1"
                : A43107b.isChecked() ? "2"
                : A4310798.isChecked() ? "98"
                : A4310799.isChecked() ? "99"
                : "-1");

        //A43108
        json.put("A43108", A43108a.isChecked() ? "1"
                : A43108b.isChecked() ? "2"
                : A4310898.isChecked() ? "98"
                : A4310899.isChecked() ? "99"
                : "-1");

        //A43109
        json.put("A43109", A43109a.isChecked() ? "1"
                : A43109b.isChecked() ? "2"
                : A4310998.isChecked() ? "98"
                : A4310999.isChecked() ? "99"
                : "-1");

        //A431010
        json.put("A431010", A431010a.isChecked() ? "1"
                : A431010b.isChecked() ? "2"
                : A43101098.isChecked() ? "98"
                : A43101099.isChecked() ? "99"
                : "-1");

        //A431011
        json.put("A431011", A431011a.isChecked() ? "1"
                : A431011b.isChecked() ? "2"
                : A43101198.isChecked() ? "98"
                : A43101199.isChecked() ? "99"
                : "-1");

        //A43111
        json.put("A43111", A43111a.isChecked() ? "1"
                : A43111b.isChecked() ? "2"
                : A4311198.isChecked() ? "98"
                : A4311199.isChecked() ? "99"
                : "-1");

        //A43112
        json.put("A43112", A43112a.isChecked() ? "1"
                : A43112b.isChecked() ? "2"
                : A4311298.isChecked() ? "98"
                : A4311299.isChecked() ? "99"
                : "-1");

        //A43113
        json.put("A43113", A43113a.isChecked() ? "1"
                : A43113b.isChecked() ? "2"
                : A4311398.isChecked() ? "98"
                : A4311399.isChecked() ? "99"
                : "-1");

        //A43114
        json.put("A43114", A43114a.isChecked() ? "1"
                : A43114b.isChecked() ? "2"
                : A4311498.isChecked() ? "98"
                : A4311499.isChecked() ? "99"
                : "-1");

        //A43115
        json.put("A43115", A43115a.isChecked() ? "1"
                : A43115b.isChecked() ? "2"
                : A4311598.isChecked() ? "98"
                : A4311599.isChecked() ? "99"
                : "-1");

        //A4312
        json.put("A4312", A4312a.isChecked() ? "1"
                : A4312b.isChecked() ? "2"
                : A431298.isChecked() ? "98"
                : A431299.isChecked() ? "99"
                : "-1");

        //A4313
        json.put("A4313", A4313a.isChecked() ? "1"
                : A4313b.isChecked() ? "2"
                : A431398.isChecked() ? "98"
                : A431399.isChecked() ? "99"
                : "-1");

        //A4314
        json.put("A4314", A4314a.isChecked() ? "1"
                : A4314b.isChecked() ? "2"
                : A431498.isChecked() ? "98"
                : A431499.isChecked() ? "99"
                : "-1");

        //A4315
        json.put("A4315", A4315.getText().toString().length() > 0 ? A4315.getText().toString().trim() : "-1");

        LocalDataManager ldm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4301) != false;
    }


    public boolean validate(final String date) {

        matcher = pattern.matcher(date);

        if (date.equals("99/99/9999")) {

            return true;

        } else if (matcher.matches()) {

            matcher.reset();

            if (matcher.find()) {

                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31") &&
                        (month.equals("4") || month.equals("6") || month.equals("9") ||
                                month.equals("11") || month.equals("04") || month.equals("06") ||
                                month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } else if (month.equals("2") || month.equals("02")) {
                    //leap year
                    if (year % 4 == 0) {
                        return !day.equals("30") && !day.equals("31");
                    } else {
                        return !day.equals("29") && !day.equals("30") && !day.equals("31");
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
