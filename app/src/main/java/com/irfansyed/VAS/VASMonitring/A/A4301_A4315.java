package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class A4301_A4315 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    private Pattern pattern;
    private Matcher matcher;
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
            A43061,
            A43062check,
            A43062,
            A4307,
            A4308,
            A4309,
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
        setContentView(R.layout.a4301__a4315);

        this.setTitle(getString(R.string.h_a_sec_11));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_call();
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
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

        value_assignment();
        insert_data();

        Intent c = new Intent(A4301_A4315.this, A4351_A4364.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.A4301a
                || compoundButton.getId() == R.id.A4301b
                || compoundButton.getId() == R.id.A430198
                || compoundButton.getId() == R.id.A430199) {
            if (A4301b.isChecked() || A430198.isChecked() || A430199.isChecked()) {

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

            } else {
                cvA43021.setVisibility(View.VISIBLE);
                cvA43022.setVisibility(View.VISIBLE);
                cvA43023.setVisibility(View.VISIBLE);
                cvA43024.setVisibility(View.VISIBLE);
                cvA43025.setVisibility(View.VISIBLE);
                cvA43026.setVisibility(View.VISIBLE);
                cvA43027.setVisibility(View.VISIBLE);
                cvA4303.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A43027a
                || compoundButton.getId() == R.id.A43027b
                || compoundButton.getId() == R.id.A4302798
                || compoundButton.getId() == R.id.A4302799) {
            if (A43027b.isChecked() || A4302798.isChecked() || A4302799.isChecked()) {

                ClearAllcontrol.ClearAllC(cvA4303);
                cvA4303.setVisibility(View.GONE);

            } else {
                cvA4303.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4304a
                || compoundButton.getId() == R.id.A4304b
                || compoundButton.getId() == R.id.A430498
                || compoundButton.getId() == R.id.A430499) {
            if (A4304b.isChecked() || A430498.isChecked() || A430499.isChecked()) {

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

            } else {
                cvA4305.setVisibility(View.VISIBLE);
                cvA43061check.setVisibility(View.VISIBLE);
                cvA43061.setVisibility(View.VISIBLE);
                cvA43062check.setVisibility(View.VISIBLE);
                cvA43062.setVisibility(View.VISIBLE);
                cvA4307.setVisibility(View.VISIBLE);
                cvA4308.setVisibility(View.VISIBLE);
                cvA4309.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4305a
                || compoundButton.getId() == R.id.A4305b) {
            if (A4305b.isChecked()) {

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

            } else {
                cvA43061check.setVisibility(View.VISIBLE);
                cvA43061.setVisibility(View.VISIBLE);
                cvA43062check.setVisibility(View.VISIBLE);
                cvA43062.setVisibility(View.VISIBLE);
                cvA4307.setVisibility(View.VISIBLE);
                cvA4308.setVisibility(View.VISIBLE);
                cvA4309.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A43061checka
                || compoundButton.getId() == R.id.A43061checkb) {
            if (A43061checkb.isChecked()) {

                ClearAllcontrol.ClearAllC(cvA43061);
                cvA43061.setVisibility(View.GONE);

            } else {
                cvA43061.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A43062checka
                || compoundButton.getId() == R.id.A43062checkb) {
            if (A43062checkb.isChecked()) {

                ClearAllcontrol.ClearAllC(cvA43062);
                cvA43062.setVisibility(View.GONE);

            } else {
                cvA43062.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4314a
                || compoundButton.getId() == R.id.A4314b
                || compoundButton.getId() == R.id.A431498
                || compoundButton.getId() == R.id.A431499) {
            if (A4314b.isChecked() || A431498.isChecked() || A431499.isChecked()) {

                ClearAllcontrol.ClearAllC(cvA4315);
                cvA4315.setVisibility(View.GONE);

            } else {
                cvA4315.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_call() {

        btn_next12.setOnClickListener(this);

        A4301a.setOnCheckedChangeListener(this);
        A4301b.setOnCheckedChangeListener(this);
        A430198.setOnCheckedChangeListener(this);
        A430199.setOnCheckedChangeListener(this);

        A43027a.setOnCheckedChangeListener(this);
        A43027b.setOnCheckedChangeListener(this);
        A4302798.setOnCheckedChangeListener(this);
        A4302799.setOnCheckedChangeListener(this);

        A4304a.setOnCheckedChangeListener(this);
        A4304b.setOnCheckedChangeListener(this);
        A430498.setOnCheckedChangeListener(this);
        A430499.setOnCheckedChangeListener(this);

        A4305a.setOnCheckedChangeListener(this);
        A4305b.setOnCheckedChangeListener(this);

        A43061checka.setOnCheckedChangeListener(this);
        A43061checkb.setOnCheckedChangeListener(this);

        A43062checka.setOnCheckedChangeListener(this);
        A43062checkb.setOnCheckedChangeListener(this);

        A4314a.setOnCheckedChangeListener(this);
        A4314b.setOnCheckedChangeListener(this);
        A431498.setOnCheckedChangeListener(this);
        A431499.setOnCheckedChangeListener(this);

    }

    void value_assignment() {

        study_id = "0";
        A4301 = "-1";
        A43021 = "-1";
        A43022 = "-1";
        A43023 = "-1";
        A43024 = "-1";
        A43025 = "-1";
        A43026 = "-1";
        A43027 = "-1";
        A4303 = "-1";
        A4304 = "-1";
        A4305 = "-1";
        A4306acheck = "-1";
        A4306a = "-1";
        A4306bcheck = "-1";
        A4306b = "-1";
        A4307 = "-1";
        A4308 = "-1";
        A4309 = "-1";
        A43101 = "-1";
        A43102 = "-1";
        A43103 = "-1";
        A43104 = "-1";
        A43105 = "-1";
        A43106 = "-1";
        A43107 = "-1";
        A43108 = "-1";
        A43109 = "-1";
        A431010 = "-1";
        A431011 = "-1";
        A43111 = "-1";
        A43112 = "-1";
        A43113 = "-1";
        A43114 = "-1";
        A43115 = "-1";
        A4312 = "-1";
        A4313 = "-1";
        A4314 = "-1";
        A4315 = "-1";
        STATUS = "0";


        if (study_id.getText().toString().length() > 0) {

            study_id = study_id.getText().toString().trim();
        }

        //A4301
        if (A4301a.isChecked()) {
            A4301 = "1";
        }
        if (A4301b.isChecked()) {
            A4301 = "2";
        }
        if (A430198.isChecked()) {
            A4301 = "9";
        }
        if (A430199.isChecked()) {
            A4301 = "8";
        }

        //A43021
        if (A43021a.isChecked()) {
            A43021 = "1";
        }
        if (A43021b.isChecked()) {
            A43021 = "2";
        }
        if (A4302198.isChecked()) {
            A43021 = "9";
        }
        if (A4302199.isChecked()) {
            A43021 = "8";
        }

        //A43022
        if (A43022a.isChecked()) {
            A43022 = "1";
        }
        if (A43022b.isChecked()) {
            A43022 = "2";
        }
        if (A4302298.isChecked()) {
            A43022 = "9";
        }
        if (A4302299.isChecked()) {
            A43022 = "8";
        }

        //A43023
        if (A43023a.isChecked()) {
            A43023 = "1";
        }
        if (A43023b.isChecked()) {
            A43023 = "2";
        }
        if (A4302398.isChecked()) {
            A43023 = "9";
        }
        if (A4302399.isChecked()) {
            A43023 = "8";
        }

        //A43024
        if (A43024a.isChecked()) {
            A43024 = "1";
        }
        if (A43024b.isChecked()) {
            A43024 = "2";
        }
        if (A4302498.isChecked()) {
            A43024 = "9";
        }
        if (A4302499.isChecked()) {
            A43024 = "8";
        }

        //A43025
        if (A43025a.isChecked()) {
            A43025 = "1";
        }
        if (A43025b.isChecked()) {
            A43025 = "2";
        }
        if (A4302598.isChecked()) {
            A43025 = "9";
        }
        if (A4302599.isChecked()) {
            A43025 = "8";
        }

        //A43026
        if (A43026a.isChecked()) {
            A43026 = "1";
        }
        if (A43026b.isChecked()) {
            A43026 = "2";
        }
        if (A4302698.isChecked()) {
            A43026 = "9";
        }
        if (A4302699.isChecked()) {
            A43026 = "8";
        }

        //A43027
        if (A43027a.isChecked()) {
            A43027 = "1";
        }
        if (A43027b.isChecked()) {
            A43027 = "2";
        }
        if (A4302798.isChecked()) {
            A43027 = "9";
        }
        if (A4302799.isChecked()) {
            A43027 = "8";
        }

        //A4303
        if (A4303a.isChecked()) {
            A4303 = "1";
        }
        if (A4303b.isChecked()) {
            A4303 = "2";
        }
        if (A430398.isChecked()) {
            A4303 = "9";
        }
        if (A430399.isChecked()) {
            A4303 = "8";
        }

        //A4304
        if (A4304a.isChecked()) {
            A4304 = "1";
        }
        if (A4304b.isChecked()) {
            A4304 = "2";
        }
        if (A430498.isChecked()) {
            A4304 = "9";
        }
        if (A430499.isChecked()) {
            A4304 = "8";
        }

        //A4305
        if (A4305a.isChecked()) {
            A4305 = "1";
        }
        if (A4305b.isChecked()) {
            A4305 = "2";
        }

        //A4306acheck
        if (A4306achecka.isChecked()) {
            A4306acheck = "1";
        }
        if (A4306acheckb.isChecked()) {
            A4306acheck = "2";
        }

        //A4306bcheck
        if (A4306bchecka.isChecked()) {
            A4306bcheck = "1";
        }
        if (A4306bcheckb.isChecked()) {
            A4306bcheck = "2";
        }

        //A43061
        if (A43061.getText().toString().trim().length() > 0) {
            A43061 = A43061.getText().toString().trim();
        }

        //A43062
        if (A43062.getText().toString().trim().length() > 0) {
            A4306b = A43062.getText().toString().trim();
        }

        //A4307
        if (A4307.getText().toString().trim().length() > 0) {
            A4307 = A4307.getText().toString().trim();
        }

        //A4308
        if (A4308.getText().toString().trim().length() > 0) {
            A4308 = A4308.getText().toString().trim();
        }

        //A4309
        if (A4309.getText().toString().trim().length() > 0) {
            A4309 = A4309.getText().toString().trim();
        }

        //A43101
        if (A43101a.isChecked()) {
            A43101 = "1";
        }
        if (A43101b.isChecked()) {
            A43101 = "2";
        }
        if (A4310198.isChecked()) {
            A43101 = "9";
        }
        if (A4310199.isChecked()) {
            A43101 = "8";
        }

        //A43102
        if (A43102a.isChecked()) {
            A43102 = "1";
        }
        if (A43102b.isChecked()) {
            A43102 = "2";
        }
        if (A4310298.isChecked()) {
            A43102 = "9";
        }
        if (A4310299.isChecked()) {
            A43102 = "8";
        }

        //A43103
        if (A43103a.isChecked()) {
            A43103 = "1";
        }
        if (A43103b.isChecked()) {
            A43103 = "2";
        }
        if (A4310398.isChecked()) {
            A43103 = "9";
        }
        if (A4310399.isChecked()) {
            A43103 = "8";
        }

        //A43104
        if (A43104a.isChecked()) {
            A43104 = "1";
        }
        if (A43104b.isChecked()) {
            A43104 = "2";
        }
        if (A4310498.isChecked()) {
            A43104 = "9";
        }
        if (A4310499.isChecked()) {
            A43104 = "8";
        }

        //A43105
        if (A43105a.isChecked()) {
            A43105 = "1";
        }
        if (A43105b.isChecked()) {
            A43105 = "2";
        }
        if (A4310598.isChecked()) {
            A43105 = "9";
        }
        if (A4310599.isChecked()) {
            A43105 = "8";
        }

        //A43106
        if (A43106a.isChecked()) {
            A43106 = "1";
        }
        if (A43106b.isChecked()) {
            A43106 = "2";
        }
        if (A4310698.isChecked()) {
            A43106 = "9";
        }
        if (A4310699.isChecked()) {
            A43106 = "8";
        }

        //A43107
        if (A43107a.isChecked()) {
            A43107 = "1";
        }
        if (A43107b.isChecked()) {
            A43107 = "2";
        }
        if (A4310798.isChecked()) {
            A43107 = "9";
        }
        if (A4310799.isChecked()) {
            A43107 = "8";
        }

        //A43108
        if (A43108a.isChecked()) {
            A43108 = "1";
        }
        if (A43108b.isChecked()) {
            A43108 = "2";
        }
        if (A4310898.isChecked()) {
            A43108 = "9";
        }
        if (A4310899.isChecked()) {
            A43108 = "8";
        }

        //A43109
        if (A43109a.isChecked()) {
            A43109 = "1";
        }
        if (A43109b.isChecked()) {
            A43109 = "2";
        }
        if (A4310998.isChecked()) {
            A43109 = "9";
        }
        if (A4310999.isChecked()) {
            A43109 = "8";
        }

        //A431010
        if (A431010a.isChecked()) {
            A431010 = "1";
        }
        if (A431010b.isChecked()) {
            A431010 = "2";
        }
        if (A43101098.isChecked()) {
            A431010 = "9";
        }
        if (A43101099.isChecked()) {
            A431010 = "8";
        }

        //A431011
        if (A431011a.isChecked()) {
            A431011 = "1";
        }
        if (A431011b.isChecked()) {
            A431011 = "2";
        }
        if (A43101198.isChecked()) {
            A431011 = "9";
        }
        if (A43101199.isChecked()) {
            A431011 = "8";
        }

        //A43111
        if (A43111a.isChecked()) {
            A43111 = "1";
        }
        if (A43111b.isChecked()) {
            A43111 = "2";
        }
        if (A4311198.isChecked()) {
            A43111 = "9";
        }
        if (A4311199.isChecked()) {
            A43111 = "8";
        }

        //A43112
        if (A43112a.isChecked()) {
            A43112 = "1";
        }
        if (A43112b.isChecked()) {
            A43112 = "2";
        }
        if (A4311298.isChecked()) {
            A43112 = "9";
        }
        if (A4311299.isChecked()) {
            A43112 = "8";
        }

        //A43113
        if (A43113a.isChecked()) {
            A43113 = "1";
        }
        if (A43113b.isChecked()) {
            A43113 = "2";
        }
        if (A4311398.isChecked()) {
            A43113 = "9";
        }
        if (A4311399.isChecked()) {
            A43113 = "8";
        }

        //A43114
        if (A43114a.isChecked()) {
            A43114 = "1";
        }
        if (A43114b.isChecked()) {
            A43114 = "2";
        }
        if (A4311498.isChecked()) {
            A43114 = "9";
        }
        if (A4311499.isChecked()) {
            A43114 = "8";
        }

        //A43115
        if (A43115a.isChecked()) {
            A43115 = "1";
        }
        if (A43115b.isChecked()) {
            A43115 = "2";
        }
        if (A4311598.isChecked()) {
            A43115 = "9";
        }
        if (A4311599.isChecked()) {
            A43115 = "8";
        }

        //A4312
        if (A4312a.isChecked()) {
            A4312 = "1";
        }
        if (A4312b.isChecked()) {
            A4312 = "2";
        }
        if (A431298.isChecked()) {
            A4312 = "9";
        }
        if (A431299.isChecked()) {
            A4312 = "8";
        }

        //A4313
        if (A4313a.isChecked()) {
            A4313 = "1";
        }
        if (A4313b.isChecked()) {
            A4313 = "2";
        }
        if (A431398.isChecked()) {
            A4313 = "9";
        }
        if (A431399.isChecked()) {
            A4313 = "8";
        }

        //A4314
        if (A4314a.isChecked()) {
            A4314 = "1";
        }
        if (A4314b.isChecked()) {
            A4314 = "2";
        }
        if (A431498.isChecked()) {
            A4314 = "9";
        }
        if (A431499.isChecked()) {
            A4314 = "8";
        }

        //A4315
        if (A4315.getText().toString().trim().length() > 0) {
            A4315 = A4315.getText().toString().trim();
        }


    }

    void insert_data() {

        String query = "insert into A4301_A4315("

                + Global.A.A4301_A4315.study_id + ","
                + Global.A.A4301_A4315.A4301 + ","
                + Global.A.A4301_A4315.A43021 + ","
                + Global.A.A4301_A4315.A43022 + ","
                + Global.A.A4301_A4315.A43023 + ","
                + Global.A.A4301_A4315.A43024 + ","
                + Global.A.A4301_A4315.A43025 + ","
                + Global.A.A4301_A4315.A43026 + ","
                + Global.A.A4301_A4315.A43027 + ","
                + Global.A.A4301_A4315.A4303 + ","
                + Global.A.A4301_A4315.A4304 + ","
                + Global.A.A4301_A4315.A4305 + ","
                + Global.A.A4301_A4315.A4306acheck + ","
                + Global.A.A4301_A4315.A4306a + ","
                + Global.A.A4301_A4315.A4306bcheck + ","
                + Global.A.A4301_A4315.A4306b + ","
                + Global.A.A4301_A4315.A4307 + ","
                + Global.A.A4301_A4315.A4308 + ","
                + Global.A.A4301_A4315.A4309 + ","
                + Global.A.A4301_A4315.A43101 + ","
                + Global.A.A4301_A4315.A43102 + ","
                + Global.A.A4301_A4315.A43103 + ","
                + Global.A.A4301_A4315.A43104 + ","
                + Global.A.A4301_A4315.A43105 + ","
                + Global.A.A4301_A4315.A43106 + ","
                + Global.A.A4301_A4315.A43107 + ","
                + Global.A.A4301_A4315.A43108 + ","
                + Global.A.A4301_A4315.A43109 + ","
                + Global.A.A4301_A4315.A431010 + ","
                + Global.A.A4301_A4315.A431011 + ","
                + Global.A.A4301_A4315.A43111 + ","
                + Global.A.A4301_A4315.A43112 + ","
                + Global.A.A4301_A4315.A43113 + ","
                + Global.A.A4301_A4315.A43114 + ","
                + Global.A.A4301_A4315.A43115 + ","
                + Global.A.A4301_A4315.A4312 + ","
                + Global.A.A4301_A4315.A4313 + ","
                + Global.A.A4301_A4315.A4314 + ","
                + Global.A.A4301_A4315.A4315 + ","
                + Global.A.A4301_A4315.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4301 + "','" +
                A43021 + "','" +
                A43022 + "','" +
                A43023 + "','" +
                A43024 + "','" +
                A43025 + "','" +
                A43026 + "','" +
                A43027 + "','" +
                A4303 + "','" +
                A4304 + "','" +
                A4305 + "','" +
                A4306acheck + "','" +
                A4306a + "','" +
                A4306bcheck + "','" +
                A4306b + "','" +
                A4307 + "','" +
                A4308 + "','" +
                A4309 + "','" +
                A43101 + "','" +
                A43102 + "','" +
                A43103 + "','" +
                A43104 + "','" +
                A43105 + "','" +
                A43106 + "','" +
                A43107 + "','" +
                A43108 + "','" +
                A43109 + "','" +
                A431010 + "','" +
                A431011 + "','" +
                A43111 + "','" +
                A43112 + "','" +
                A43113 + "','" +
                A43114 + "','" +
                A43115 + "','" +
                A4312 + "','" +
                A4313 + "','" +
                A4314 + "','" +
                A4315 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "12th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(llA4301) == false) {
            return false;
        }


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
