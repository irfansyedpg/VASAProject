package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;

import Global.C.C3001_C3011;
import data.LocalDataManager;
import utils.ClearAllcontrol;

public class C3351_C3364 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_C3351,
            ll_C3352,
            ll_C3353,
            ll_C3354,
            ll_C3355,
            ll_C3356,
            ll_C3357,
            ll_C3358,
            ll_C3363,
            ll_C3364;

    RadioButton
            rb_C3351_1,
            rb_C3351_2,
            rb_C3351_DK,
            rb_C3351_RA,
            rb_C3352_1,
            rb_C3352_2,
            rb_C3363_1,
            rb_C3363_2,
            rb_C3363_3,
            rb_C3363_DK,
            rb_C3363_RA;

    //CheckBox

    EditText
            ed_study_id,
            ed_C3353,
            ed_C3354,
            ed_C3355,
            ed_C3356,
            ed_C3357,
            ed_C3358,
            ed_C3364;

    String
            study_id,
            C3351,
            C3352,
            C3353,
            C3354,
            C3355,
            C3356,
            C3357,
            C3358,
            C3363,
            C3364,
            STATUS;


    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3351_c3364);

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_call();

        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(this, C3401_C3457.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts

        ll_C3351 = findViewById(R.id.ll_C3351);
        ll_C3352 = findViewById(R.id.ll_C3352);
        ll_C3353 = findViewById(R.id.ll_C3353);
        ll_C3354 = findViewById(R.id.ll_C3354);
        ll_C3355 = findViewById(R.id.ll_C3355);
        ll_C3356 = findViewById(R.id.ll_C3356);
        ll_C3357 = findViewById(R.id.ll_C3357);
        ll_C3358 = findViewById(R.id.ll_C3358);
        ll_C3363 = findViewById(R.id.ll_C3363);
        ll_C3364 = findViewById(R.id.ll_C3364);


        // Radio Buttons

        rb_C3351_1 = findViewById(R.id.rb_C3351_1);
        rb_C3351_2 = findViewById(R.id.rb_C3351_2);
        rb_C3351_DK = findViewById(R.id.rb_C3351_DK);
        rb_C3351_RA = findViewById(R.id.rb_C3351_RA);
        rb_C3352_1 = findViewById(R.id.rb_C3352_1);
        rb_C3352_2 = findViewById(R.id.rb_C3352_2);
        rb_C3363_1 = findViewById(R.id.rb_C3363_1);
        rb_C3363_2 = findViewById(R.id.rb_C3363_2);
        rb_C3363_3 = findViewById(R.id.rb_C3363_3);
        rb_C3363_DK = findViewById(R.id.rb_C3363_DK);
        rb_C3363_RA = findViewById(R.id.rb_C3363_RA);


        // Edittexts

        ed_C3353 = findViewById(R.id.ed_C3353);
        ed_C3354 = findViewById(R.id.ed_C3354);
        ed_C3355 = findViewById(R.id.ed_C3355);
        ed_C3356 = findViewById(R.id.ed_C3356);
        ed_C3357 = findViewById(R.id.ed_C3357);
        ed_C3358 = findViewById(R.id.ed_C3358);
        ed_C3364 = findViewById(R.id.ed_C3364);

    }

    void events_call() {

        rb_C3351_1.setOnCheckedChangeListener(this);
        rb_C3351_2.setOnCheckedChangeListener(this);
        rb_C3351_DK.setOnCheckedChangeListener(this);
        rb_C3351_RA.setOnCheckedChangeListener(this);

        rb_C3352_1.setOnCheckedChangeListener(this);
        rb_C3352_2.setOnCheckedChangeListener(this);

        rb_C3363_1.setOnCheckedChangeListener(this);
        rb_C3363_2.setOnCheckedChangeListener(this);
        rb_C3363_3.setOnCheckedChangeListener(this);
        rb_C3363_DK.setOnCheckedChangeListener(this);
        rb_C3363_RA.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3351_1
                || compoundButton.getId() == R.id.rb_C3351_2
                || compoundButton.getId() == R.id.rb_C3351_DK
                || compoundButton.getId() == R.id.rb_C3351_RA) {

            if (rb_C3351_1.isChecked()) {

                ll_C3352.setVisibility(View.VISIBLE);
                ll_C3353.setVisibility(View.VISIBLE);
                ll_C3354.setVisibility(View.VISIBLE);
                ll_C3355.setVisibility(View.VISIBLE);
                ll_C3356.setVisibility(View.VISIBLE);
                ll_C3357.setVisibility(View.VISIBLE);
                ll_C3358.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3352);
                ClearAllcontrol.ClearAll(ll_C3353);
                ClearAllcontrol.ClearAll(ll_C3354);
                ClearAllcontrol.ClearAll(ll_C3355);
                ClearAllcontrol.ClearAll(ll_C3356);
                ClearAllcontrol.ClearAll(ll_C3357);
                ClearAllcontrol.ClearAll(ll_C3358);

                ll_C3352.setVisibility(View.GONE);
                ll_C3353.setVisibility(View.GONE);
                ll_C3354.setVisibility(View.GONE);
                ll_C3355.setVisibility(View.GONE);
                ll_C3356.setVisibility(View.GONE);
                ll_C3357.setVisibility(View.GONE);
                ll_C3358.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3352_1
                || compoundButton.getId() == R.id.rb_C3352_2) {

            if (rb_C3352_1.isChecked()) {

                ll_C3353.setVisibility(View.VISIBLE);
                ll_C3354.setVisibility(View.VISIBLE);
                ll_C3355.setVisibility(View.VISIBLE);
                ll_C3356.setVisibility(View.VISIBLE);
                ll_C3357.setVisibility(View.VISIBLE);
                ll_C3358.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3353);
                ClearAllcontrol.ClearAll(ll_C3354);
                ClearAllcontrol.ClearAll(ll_C3355);
                ClearAllcontrol.ClearAll(ll_C3356);
                ClearAllcontrol.ClearAll(ll_C3357);
                ClearAllcontrol.ClearAll(ll_C3358);

                ll_C3353.setVisibility(View.GONE);
                ll_C3354.setVisibility(View.GONE);
                ll_C3355.setVisibility(View.GONE);
                ll_C3356.setVisibility(View.GONE);
                ll_C3357.setVisibility(View.GONE);
                ll_C3358.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3363_1
                || compoundButton.getId() == R.id.rb_C3363_2
                || compoundButton.getId() == R.id.rb_C3363_3
                || compoundButton.getId() == R.id.rb_C3363_DK
                || compoundButton.getId() == R.id.rb_C3363_RA) {

            if (rb_C3363_1.isChecked()) {

                ll_C3364.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3364);
                ll_C3364.setVisibility(View.GONE);
            }
        }

    }

    void value_assignment() {

        C3351 = "000";
        C3352 = "000";
        C3353 = "000";
        C3354 = "000";
        C3355 = "000";
        C3356 = "000";
        C3357 = "000";
        C3358 = "000";
        C3363 = "000";
        C3364 = "000";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        if (rb_C3351_1.isChecked()) {
            C3351 = "1";
        } else if (rb_C3351_2.isChecked()) {
            C3351 = "2";
        } else if (rb_C3351_DK.isChecked()) {
            C3351 = "9";
        } else if (rb_C3351_RA.isChecked()) {
            C3351 = "8";
        }

        if (rb_C3352_1.isChecked()) {
            C3352 = "1";
        } else if (rb_C3352_2.isChecked()) {
            C3352 = "2";
        }

        if (ed_C3353.getText().toString().trim().length() > 0) {
            C3353 = ed_C3353.getText().toString().trim();
        }

        if (ed_C3354.getText().toString().trim().length() > 0) {
            C3354 = ed_C3354.getText().toString().trim();
        }

        if (ed_C3355.getText().toString().trim().length() > 0) {
            C3355 = ed_C3355.getText().toString().trim();
        }

        if (ed_C3356.getText().toString().trim().length() > 0) {
            C3356 = ed_C3356.getText().toString().trim();
        }

        if (ed_C3357.getText().toString().trim().length() > 0) {
            C3357 = ed_C3357.getText().toString().trim();
        }

        if (ed_C3358.getText().toString().trim().length() > 0) {
            C3358 = ed_C3358.getText().toString().trim();
        }

        if (rb_C3363_1.isChecked()) {
            C3363 = "1";
        } else if (rb_C3363_2.isChecked()) {
            C3363 = "2";
        } else if (rb_C3363_3.isChecked()) {
            C3363 = "3";
        } else if (rb_C3363_DK.isChecked()) {
            C3363 = "9";
        } else if (rb_C3363_RA.isChecked()) {
            C3363 = "8";
        }

        if (ed_C3364.getText().toString().trim().length() > 0) {
            C3364 = ed_C3364.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into C3351_C3364("

                + C3001_C3011.study_id + ","
                + Global.C.C3351_C3364.C3351 + ","
                + Global.C.C3351_C3364.C3352 + ","
                + Global.C.C3351_C3364.C3353 + ","
                + Global.C.C3351_C3364.C3354 + ","
                + Global.C.C3351_C3364.C3355 + ","
                + Global.C.C3351_C3364.C3356 + ","
                + Global.C.C3351_C3364.C3357 + ","
                + Global.C.C3351_C3364.C3358 + ","
                + Global.C.C3351_C3364.C3363 + ","
                + Global.C.C3351_C3364.C3364 + ","
                + C3001_C3011.STATUS + ") values ('" +

                study_id + "','" +
                C3351 + "','" +
                C3352 + "','" +
                C3353 + "','" +
                C3354 + "','" +
                C3355 + "','" +
                C3356 + "','" +
                C3357 + "','" +
                C3358 + "','" +
                C3363 + "','" +
                C3364 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 12: Death certificate and civil registeration", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        /*if (Gothrough.IamHiden(ll_C3351) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3352) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3353) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3354) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3355) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3356) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3357) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3358) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3363) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3364) != false){
            return false;
        }*/

        return true;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this);
    }
}
