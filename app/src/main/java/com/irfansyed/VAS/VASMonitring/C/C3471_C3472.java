package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Core.HomeActivity;
import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;

public class C3471_C3472 extends AppCompatActivity implements View.OnClickListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_C3471,
            ll_C3472;

    RadioButton
            rb_C3472_1,
            rb_C3472_2,
            rb_C3472_3,
            rb_C3472_4,
            rb_C3472_5,
            rb_C3472_6,
            rb_C3472_7,
            rb_C3472_8,
            rb_C3472_9,
            rb_C3472_10,
            rb_C3472_11,
            rb_C3472_DK;

    EditText
            ed_study_id,
            ed_C3471;

    String
            study_id,
            C3471,
            C3472,
            STATUS;

    int currentSection;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3471_c3472);

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();

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

        Intent c = new Intent(this, HomeActivity.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

        Toast.makeText(this, "Interview Completted...", Toast.LENGTH_LONG).show();
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts
        ll_C3471 = findViewById(R.id.ll_C3471);
        ll_C3472 = findViewById(R.id.ll_C3472);

        // Radio Buttons

        rb_C3472_1 = findViewById(R.id.rb_C3472_1);
        rb_C3472_2 = findViewById(R.id.rb_C3472_2);
        rb_C3472_3 = findViewById(R.id.rb_C3472_3);
        rb_C3472_4 = findViewById(R.id.rb_C3472_4);
        rb_C3472_5 = findViewById(R.id.rb_C3472_5);
        rb_C3472_6 = findViewById(R.id.rb_C3472_6);
        rb_C3472_7 = findViewById(R.id.rb_C3472_7);
        rb_C3472_8 = findViewById(R.id.rb_C3472_8);
        rb_C3472_9 = findViewById(R.id.rb_C3472_9);
        rb_C3472_10 = findViewById(R.id.rb_C3472_10);
        rb_C3472_11 = findViewById(R.id.rb_C3472_11);
        rb_C3472_DK = findViewById(R.id.rb_C3472_DK);


        ed_C3471 = findViewById(R.id.ed_C3471);

    }

    void value_assignment() {

        C3471 = "000";
        C3472 = "000";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        if (ed_C3471.getText().toString().trim().length() > 0) {
            C3471 = ed_C3471.getText().toString().trim();
        }

        if (rb_C3472_1.isChecked()) {
            C3472 = "1";
        } else if (rb_C3472_2.isChecked()) {
            C3472 = "2";
        } else if (rb_C3472_3.isChecked()) {
            C3472 = "3";
        } else if (rb_C3472_4.isChecked()) {
            C3472 = "4";
        } else if (rb_C3472_5.isChecked()) {
            C3472 = "5";
        } else if (rb_C3472_6.isChecked()) {
            C3472 = "6";
        } else if (rb_C3472_7.isChecked()) {
            C3472 = "7";
        } else if (rb_C3472_8.isChecked()) {
            C3472 = "8";
        } else if (rb_C3472_9.isChecked()) {
            C3472 = "9";
        } else if (rb_C3472_10.isChecked()) {
            C3472 = "10";
        } else if (rb_C3472_11.isChecked()) {
            C3472 = "11";
        } else if (rb_C3472_DK.isChecked()) {
            C3472 = "99";
        }
    }

    void insert_data() {
        String query = "insert into   C3471_C3472("
                + Global.C.C3471_C3472.study_id + ","
                + Global.C.C3471_C3472.C3471 + ","
                + Global.C.C3471_C3472.C3472 + ","
                + Global.C.C3471_C3472.STATUS + ") values ('" +

                study_id + "','" +
                C3471 + "','" +
                C3472 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 15: Open ended response & interviewer comments/observations inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        /*if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3471) == false) {
            return false;
        }

        if(Gothrough.IamHiden(ll_C3472) != false) {
            return false;
        }*/

        return true;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 11);
    }
}