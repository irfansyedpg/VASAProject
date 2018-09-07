package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class C3012_C3022 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //region Declaration
    Button btn_next;

    // Liner Layout
    LinearLayout
            ll_C3012,
            ll_C3013,
            ll_C3015,
            ll_C3016,
            ll_C3017,
            ll_C3018,
            ll_C3018_1,
            ll_C3019_u,
            ll_C3019_a,
            ll_C3019_b,
            ll_C3019_c,
            ll_C3020,
            ll_C3021u,
            ll_C3021d,
            ll_C3021m,
            ll_C3021y,
            ll_C3022,
            ll_c3013_c3018;


    RadioButton
            rb_C3013_1,
            rb_C3013_2,
            rb_C3013_DK,
            rb_C3013_RA,
            rb_C3015_1,
            rb_C3015_2,
            rb_C3015_3,
            rb_C3015_DK,
            rb_C3015_RA,
            rb_C3017_1,
            rb_C3017_2,
            rb_C3017_DK,
            rb_C3017_RA,
            rb_C3018_1,
            rb_C3018_2,
            rb_C3018_3,
            rb_C3018_4,
            rb_C3018_5,
            rb_C3018_6,
            rb_C3018_DK,
            rb_C3018_RA,
            rb_C3019_u_1,
            rb_C3019_u_2,
            rb_C3019_u_3,
            rb_C3019_u_DK,
            rb_C3019_u_RA,
            rb_C3020_1,
            rb_C3020_2,
            rb_C3020_DK,
            rb_C3020_RA,
            rb_C3021u_1,
            rb_C3021u_2,
            rb_C3021u_3,
            rb_C3021u_DK,
            rb_C3021u_RA,
            rb_C3022_1,
            rb_C3022_2,
            rb_C3022_DK;

    EditText
            ed_C3012,
            ed_C3016,
            ed_C3018_1,
            ed_C3019_a,
            ed_C3019_b,
            ed_C3019_c,
            ed_C3021d,
            ed_C3021m,
            ed_C3021y;

    String
            study_id,
            C3012,
            C3013,
            C3015,
            C3016,
            C3017,
            C3018,
            C3018_1,
            C3019_u,
            C3019_a,
            C3019_b,
            C3019_c,
            C3020,
            C3021u,
            C3021d,
            C3021m,
            C3021y,
            C3022,
            STATUS;

    int ageInDays;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3012_c3022);

        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("Q1101_Q1610");

        if (res.getCount() > 0) {

            res.moveToFirst();

            String dob = res.getString(67);
            String dod = res.getString(71);

            ageInDays = numOfDays(dob, dod);
        }


        this.Initialization();

        if (ageInDays > 1460) {

            ll_C3013.setVisibility(View.VISIBLE);
            ll_C3015.setVisibility(View.VISIBLE);
            ll_C3016.setVisibility(View.VISIBLE);
            ll_C3017.setVisibility(View.VISIBLE);
            ll_C3018.setVisibility(View.VISIBLE);
            ll_C3018_1.setVisibility(View.VISIBLE);

        } else {

            ClearAllcontrol.ClearAll(ll_C3013);
            ClearAllcontrol.ClearAll(ll_C3015);
            ClearAllcontrol.ClearAll(ll_C3016);
            ClearAllcontrol.ClearAll(ll_C3017);
            ClearAllcontrol.ClearAll(ll_C3018);
            ClearAllcontrol.ClearAll(ll_C3018_1);

            ll_C3013.setVisibility(View.GONE);
            ll_C3015.setVisibility(View.GONE);
            ll_C3016.setVisibility(View.GONE);
            ll_C3017.setVisibility(View.GONE);
            ll_C3018.setVisibility(View.GONE);
            ll_C3018_1.setVisibility(View.GONE);
        }

        if (ageInDays < 3285) {

            ClearAllcontrol.ClearAll(ll_C3018);
            ClearAllcontrol.ClearAll(ll_C3018_1);

            ll_C3018.setVisibility(View.GONE);
            ll_C3018_1.setVisibility(View.GONE);

        } else {

            ll_C3018.setVisibility(View.VISIBLE);
            ll_C3018_1.setVisibility(View.VISIBLE);
        }

        this.events_call();

        btn_next.setOnClickListener(this);
    }

    public int numOfDays(String dob, String dod) {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd/mm/yyyy");

        int numOfDays = 0;

        try {
            Date date1 = myFormat.parse(dob);
            Date date2 = myFormat.parse(dod);
            long diff = date2.getTime() - date1.getTime();

            numOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return numOfDays;
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        if (ageInDays < 334) {

            Intent c = new Intent(this, C3051_C3099.class);
            startActivity(c);

        } else {

            this.value_assignment();
            this.insert_data();

            Intent c = new Intent(this, C3101_C3112.class);
            startActivity(c);
        }
    }

    void Initialization() {

        btn_next = (Button) findViewById(R.id.btn_next);

        ll_C3012 = (LinearLayout) findViewById(R.id.ll_C3012);
        ll_C3013 = (LinearLayout) findViewById(R.id.ll_C3013);
        ll_C3015 = (LinearLayout) findViewById(R.id.ll_C3015);
        ll_C3016 = (LinearLayout) findViewById(R.id.ll_C3016);
        ll_C3017 = (LinearLayout) findViewById(R.id.ll_C3017);
        ll_C3018 = (LinearLayout) findViewById(R.id.ll_C3018);
        ll_C3018_1 = (LinearLayout) findViewById(R.id.ll_C3018_1);
        ll_C3019_u = (LinearLayout) findViewById(R.id.ll_C3019_u);
        ll_C3019_a = (LinearLayout) findViewById(R.id.ll_C3019_a);
        ll_C3019_b = (LinearLayout) findViewById(R.id.ll_C3019_b);
        ll_C3019_c = (LinearLayout) findViewById(R.id.ll_C3019_c);
        ll_C3020 = (LinearLayout) findViewById(R.id.ll_C3020);
        ll_C3021u = (LinearLayout) findViewById(R.id.ll_C3021u);
        ll_C3021d = (LinearLayout) findViewById(R.id.ll_C3021d);
        ll_C3021m = (LinearLayout) findViewById(R.id.ll_C3021m);
        ll_C3021y = (LinearLayout) findViewById(R.id.ll_C3021y);
        ll_C3022 = (LinearLayout) findViewById(R.id.ll_C3022);
        ll_c3013_c3018 = (LinearLayout) findViewById(R.id.ll_c3013_c3018);

        rb_C3013_1 = (RadioButton) findViewById(R.id.rb_C3013_1);
        rb_C3013_2 = (RadioButton) findViewById(R.id.rb_C3013_2);
        rb_C3013_DK = (RadioButton) findViewById(R.id.rb_C3013_DK);
        rb_C3013_RA = (RadioButton) findViewById(R.id.rb_C3013_RA);
        rb_C3015_1 = (RadioButton) findViewById(R.id.rb_C3015_1);
        rb_C3015_2 = (RadioButton) findViewById(R.id.rb_C3015_2);
        rb_C3015_3 = (RadioButton) findViewById(R.id.rb_C3015_3);
        rb_C3015_DK = (RadioButton) findViewById(R.id.rb_C3015_DK);
        rb_C3015_RA = (RadioButton) findViewById(R.id.rb_C3015_RA);
        rb_C3017_1 = (RadioButton) findViewById(R.id.rb_C3017_1);
        rb_C3017_2 = (RadioButton) findViewById(R.id.rb_C3017_2);
        rb_C3017_DK = (RadioButton) findViewById(R.id.rb_C3017_DK);
        rb_C3017_RA = (RadioButton) findViewById(R.id.rb_C3017_RA);
        rb_C3018_1 = (RadioButton) findViewById(R.id.rb_C3018_1);
        rb_C3018_2 = (RadioButton) findViewById(R.id.rb_C3018_2);
        rb_C3018_3 = (RadioButton) findViewById(R.id.rb_C3018_3);
        rb_C3018_4 = (RadioButton) findViewById(R.id.rb_C3018_4);
        rb_C3018_5 = (RadioButton) findViewById(R.id.rb_C3018_5);
        rb_C3018_6 = (RadioButton) findViewById(R.id.rb_C3018_6);

        rb_C3018_DK = (RadioButton) findViewById(R.id.rb_C3018_DK);
        rb_C3018_RA = (RadioButton) findViewById(R.id.rb_C3018_RA);
        rb_C3019_u_1 = (RadioButton) findViewById(R.id.rb_C3019_u_1);
        rb_C3019_u_2 = (RadioButton) findViewById(R.id.rb_C3019_u_2);
        rb_C3019_u_3 = (RadioButton) findViewById(R.id.rb_C3019_u_3);
        rb_C3019_u_DK = (RadioButton) findViewById(R.id.rb_C3019_u_DK);
        rb_C3019_u_RA = (RadioButton) findViewById(R.id.rb_C3019_u_RA);
        rb_C3020_1 = (RadioButton) findViewById(R.id.rb_C3020_1);
        rb_C3020_2 = (RadioButton) findViewById(R.id.rb_C3020_2);
        rb_C3020_DK = (RadioButton) findViewById(R.id.rb_C3020_DK);
        rb_C3020_RA = (RadioButton) findViewById(R.id.rb_C3020_RA);
        rb_C3021u_1 = (RadioButton) findViewById(R.id.rb_C3021u_1);
        rb_C3021u_2 = (RadioButton) findViewById(R.id.rb_C3021u_2);
        rb_C3021u_3 = (RadioButton) findViewById(R.id.rb_C3021u_3);
        rb_C3021u_DK = (RadioButton) findViewById(R.id.rb_C3021u_DK);
        rb_C3021u_RA = (RadioButton) findViewById(R.id.rb_C3021u_RA);
        rb_C3022_1 = (RadioButton) findViewById(R.id.rb_C3022_1);
        rb_C3022_2 = (RadioButton) findViewById(R.id.rb_C3022_2);
        rb_C3022_DK = (RadioButton) findViewById(R.id.rb_C3022_DK);

        ed_C3012 = (EditText) findViewById(R.id.ed_C3012);
        ed_C3016 = (EditText) findViewById(R.id.ed_C3016);
        ed_C3018_1 = (EditText) findViewById(R.id.ed_C3018_1);
        ed_C3019_a = (EditText) findViewById(R.id.ed_C3019_a);
        ed_C3019_b = (EditText) findViewById(R.id.ed_C3019_b);
        ed_C3019_c = (EditText) findViewById(R.id.ed_C3019_c);
        ed_C3021d = (EditText) findViewById(R.id.ed_C3021d);
        ed_C3021m = (EditText) findViewById(R.id.ed_C3021m);
        ed_C3021y = (EditText) findViewById(R.id.ed_C3021y);
    }

    void events_call() {

        rb_C3013_1.setOnCheckedChangeListener(this);
        rb_C3013_2.setOnCheckedChangeListener(this);
        rb_C3013_DK.setOnCheckedChangeListener(this);
        rb_C3013_RA.setOnCheckedChangeListener(this);

        rb_C3015_1.setOnCheckedChangeListener(this);
        rb_C3015_2.setOnCheckedChangeListener(this);
        rb_C3015_3.setOnCheckedChangeListener(this);
        rb_C3015_DK.setOnCheckedChangeListener(this);
        rb_C3015_RA.setOnCheckedChangeListener(this);
        rb_C3017_1.setOnCheckedChangeListener(this);
        rb_C3017_2.setOnCheckedChangeListener(this);
        rb_C3017_DK.setOnCheckedChangeListener(this);
        rb_C3017_RA.setOnCheckedChangeListener(this);
        rb_C3018_1.setOnCheckedChangeListener(this);
        rb_C3018_2.setOnCheckedChangeListener(this);
        rb_C3018_3.setOnCheckedChangeListener(this);
        rb_C3018_4.setOnCheckedChangeListener(this);
        rb_C3018_5.setOnCheckedChangeListener(this);
        rb_C3018_6.setOnCheckedChangeListener(this);
        rb_C3018_DK.setOnCheckedChangeListener(this);
        rb_C3018_RA.setOnCheckedChangeListener(this);
        rb_C3019_u_1.setOnCheckedChangeListener(this);
        rb_C3019_u_2.setOnCheckedChangeListener(this);
        rb_C3019_u_3.setOnCheckedChangeListener(this);
        rb_C3019_u_DK.setOnCheckedChangeListener(this);
        rb_C3019_u_RA.setOnCheckedChangeListener(this);
        rb_C3020_1.setOnCheckedChangeListener(this);
        rb_C3020_2.setOnCheckedChangeListener(this);
        rb_C3020_DK.setOnCheckedChangeListener(this);
        rb_C3020_RA.setOnCheckedChangeListener(this);
        rb_C3021u_1.setOnCheckedChangeListener(this);
        rb_C3021u_2.setOnCheckedChangeListener(this);
        rb_C3021u_3.setOnCheckedChangeListener(this);
        rb_C3021u_DK.setOnCheckedChangeListener(this);
        rb_C3021u_RA.setOnCheckedChangeListener(this);
        rb_C3022_1.setOnCheckedChangeListener(this);
        rb_C3022_2.setOnCheckedChangeListener(this);
        rb_C3022_DK.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3013_1
                || compoundButton.getId() == R.id.rb_C3013_2
                || compoundButton.getId() == R.id.rb_C3013_DK
                || compoundButton.getId() == R.id.rb_C3013_RA) {

            if (rb_C3013_1.isChecked()) {

                ll_C3015.setVisibility(View.VISIBLE);
                ll_C3016.setVisibility(View.VISIBLE);
            } else {

                ClearAllcontrol.ClearAll(ll_C3015);
                ClearAllcontrol.ClearAll(ll_C3016);

                ll_C3015.setVisibility(View.GONE);
                ll_C3016.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3015_1
                || compoundButton.getId() == R.id.rb_C3015_2
                || compoundButton.getId() == R.id.rb_C3015_3
                || compoundButton.getId() == R.id.rb_C3015_DK
                || compoundButton.getId() == R.id.rb_C3015_RA) {

            if (rb_C3015_DK.isChecked() || rb_C3015_RA.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3016);
                ll_C3016.setVisibility(View.GONE);
            } else {

                ll_C3016.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3018_1
                || compoundButton.getId() == R.id.rb_C3018_2
                || compoundButton.getId() == R.id.rb_C3018_3
                || compoundButton.getId() == R.id.rb_C3018_4
                || compoundButton.getId() == R.id.rb_C3018_5
                || compoundButton.getId() == R.id.rb_C3018_6
                || compoundButton.getId() == R.id.rb_C3018_DK
                || compoundButton.getId() == R.id.rb_C3018_RA) {

            if (rb_C3018_2.isChecked()) {

                ll_C3018_1.setVisibility(View.VISIBLE);
            } else {

                ClearAllcontrol.ClearAll(ll_C3018_1);
                ll_C3018_1.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3019_u_1
                || compoundButton.getId() == R.id.rb_C3019_u_2
                || compoundButton.getId() == R.id.rb_C3019_u_3
                || compoundButton.getId() == R.id.rb_C3019_u_DK
                || compoundButton.getId() == R.id.rb_C3019_u_RA) {

            ClearAllcontrol.ClearAll(ll_C3019_a);
            ClearAllcontrol.ClearAll(ll_C3019_b);
            ClearAllcontrol.ClearAll(ll_C3019_c);

            ll_C3019_a.setVisibility(View.GONE);
            ll_C3019_b.setVisibility(View.GONE);
            ll_C3019_c.setVisibility(View.GONE);

            if (rb_C3019_u_1.isChecked()) {

                ll_C3019_a.setVisibility(View.VISIBLE);
            } else if (rb_C3019_u_2.isChecked()) {

                ll_C3019_b.setVisibility(View.VISIBLE);
            } else if (rb_C3019_u_3.isChecked()) {

                ll_C3019_c.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3021u_1
                || compoundButton.getId() == R.id.rb_C3021u_2
                || compoundButton.getId() == R.id.rb_C3021u_3
                || compoundButton.getId() == R.id.rb_C3021u_DK
                || compoundButton.getId() == R.id.rb_C3021u_RA) {

            ClearAllcontrol.ClearAll(ll_C3021d);
            ClearAllcontrol.ClearAll(ll_C3021m);
            ClearAllcontrol.ClearAll(ll_C3021y);

            ll_C3021d.setVisibility(View.GONE);
            ll_C3021m.setVisibility(View.GONE);
            ll_C3021y.setVisibility(View.GONE);

            if (rb_C3021u_1.isChecked()) {

                ll_C3021d.setVisibility(View.VISIBLE);
            } else if (rb_C3021u_2.isChecked()) {

                ll_C3021m.setVisibility(View.VISIBLE);
            } else if (rb_C3021u_3.isChecked()) {

                ll_C3021y.setVisibility(View.VISIBLE);
            }
        }
    }

    void value_assignment() {

        study_id = "0";
        C3012 = "000";
        C3013 = "000";
        C3015 = "000";
        C3016 = "000";
        C3017 = "000";
        C3018 = "000";
        C3018_1 = "000";
        C3019_u = "000";
        C3019_a = "000";
        C3019_b = "000";
        C3019_c = "000";
        C3020 = "000";
        C3021u = "000";
        C3021d = "000";
        C3021m = "000";
        C3021y = "000";
        C3022 = "000";
        STATUS = "0";

        if (ed_C3012.getText().toString().trim().length() > 0) {
            C3012 = ed_C3012.getText().toString().trim();
        }

        if (rb_C3013_1.isChecked()) {
            C3013 = "1";
        } else if (rb_C3013_2.isChecked()) {
            C3013 = "2";
        } else if (rb_C3013_DK.isChecked()) {
            C3013 = "9";
        } else if (rb_C3013_RA.isChecked()) {
            C3013 = "8";
        }


        if (rb_C3015_1.isChecked()) {
            C3015 = "1";
        } else if (rb_C3015_2.isChecked()) {
            C3015 = "2";
        } else if (rb_C3015_3.isChecked()) {
            C3015 = "3";
        } else if (rb_C3015_DK.isChecked()) {
            C3015 = "9";
        } else if (rb_C3015_RA.isChecked()) {
            C3015 = "8";
        }


        if (ed_C3016.getText().toString().trim().length() > 0) {
            C3016 = ed_C3016.getText().toString().trim();
        }

        if (rb_C3017_1.isChecked()) {
            C3017 = "1";
        } else if (rb_C3017_2.isChecked()) {
            C3017 = "2";
        } else if (rb_C3017_DK.isChecked()) {
            C3017 = "9";
        } else if (rb_C3017_RA.isChecked()) {
            C3017 = "8";
        }


        if (rb_C3018_1.isChecked()) {
            C3018 = "1";
        } else if (rb_C3018_2.isChecked()) {
            C3018 = "2";
        } else if (rb_C3018_3.isChecked()) {
            C3018 = "3";
        } else if (rb_C3018_4.isChecked()) {
            C3018 = "4";
        } else if (rb_C3018_5.isChecked()) {
            C3018 = "5";
        } else if (rb_C3018_6.isChecked()) {
            C3018 = "6";
        } else if (rb_C3018_DK.isChecked()) {
            C3018 = "9";
        } else if (rb_C3018_RA.isChecked()) {
            C3018 = "8";
        }


        if (ed_C3018_1.getText().toString().trim().length() > 0) {
            C3018_1 = ed_C3018_1.getText().toString().trim();
        }


        if (rb_C3019_u_1.isChecked()) {
            C3019_u = "1";
        } else if (rb_C3019_u_2.isChecked()) {
            C3019_u = "2";
        } else if (rb_C3019_u_3.isChecked()) {
            C3019_u = "3";
        } else if (rb_C3019_u_DK.isChecked()) {
            C3019_u = "9";
        } else if (rb_C3019_u_RA.isChecked()) {
            C3019_u = "8";
        }


        if (ed_C3019_a.getText().toString().trim().length() > 0) {
            C3019_a = ed_C3019_a.getText().toString().trim();
        }

        if (ed_C3019_b.getText().toString().trim().length() > 0) {
            C3019_b = ed_C3019_b.getText().toString().trim();
        }

        if (ed_C3019_c.getText().toString().trim().length() > 0) {
            C3019_c = ed_C3019_c.getText().toString().trim();
        }


        if (rb_C3020_1.isChecked()) {
            C3020 = "1";
        } else if (rb_C3020_2.isChecked()) {
            C3020 = "2";
        } else if (rb_C3020_DK.isChecked()) {
            C3020 = "9";
        } else if (rb_C3020_RA.isChecked()) {
            C3020 = "8";
        }


        if (rb_C3021u_1.isChecked()) {
            C3021u = "1";
        } else if (rb_C3021u_2.isChecked()) {
            C3021u = "2";
        } else if (rb_C3021u_3.isChecked()) {
            C3021u = "3";
        } else if (rb_C3021u_DK.isChecked()) {
            C3021u = "9";
        } else if (rb_C3021u_RA.isChecked()) {
            C3021u = "8";
        }


        if (ed_C3021d.getText().toString().trim().length() > 0) {
            C3021d = ed_C3021d.getText().toString().trim();
        }

        if (ed_C3021m.getText().toString().trim().length() > 0) {
            C3021m = ed_C3021m.getText().toString().trim();
        }

        if (ed_C3021y.getText().toString().trim().length() > 0) {
            C3021y = ed_C3021y.getText().toString().trim();
        }


        if (rb_C3022_1.isChecked()) {
            C3022 = "1";
        } else if (rb_C3022_2.isChecked()) {
            C3022 = "2";
        } else if (rb_C3022_DK.isChecked()) {
            C3022 = "9";
        }
    }

    void insert_data() {
        String query = "insert into   C3012_C3022("
                + global.C.C.C3012_C3022.study_id + ","
                + global.C.C.C3012_C3022.C3012 + ","
                + global.C.C.C3012_C3022.C3013 + ","
                + global.C.C.C3012_C3022.C3015 + ","
                + global.C.C.C3012_C3022.C3016 + ","
                + global.C.C.C3012_C3022.C3017 + ","
                + global.C.C.C3012_C3022.C3018 + ","
                + global.C.C.C3012_C3022.C3018_1 + ","
                + global.C.C.C3012_C3022.C3019_u + ","
                + global.C.C.C3012_C3022.C3019_a + ","
                + global.C.C.C3012_C3022.C3019_b + ","
                + global.C.C.C3012_C3022.C3019_c + ","
                + global.C.C.C3012_C3022.C3020 + ","
                + global.C.C.C3012_C3022.C3021u + ","
                + global.C.C.C3012_C3022.C3021d + ","
                + global.C.C.C3012_C3022.C3021m + ","
                + global.C.C.C3012_C3022.C3021y + ","
                + global.C.C.C3012_C3022.C3022 + ","
                + global.C.C.C3012_C3022.STATUS + ") values ('" +
                study_id + "','" +
                C3012 + "','" +
                C3013 + "','" +
                C3015 + "','" +
                C3016 + "','" +
                C3017 + "','" +
                C3018 + "','" +
                C3018_1 + "','" +
                C3019_u + "','" +
                C3019_a + "','" +
                C3019_b + "','" +
                C3019_c + "','" +
                C3020 + "','" +
                C3021u + "','" +
                C3021d + "','" +
                C3021m + "','" +
                C3021y + "','" +
                C3022 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 2: Background (Child Deaths) inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        /*if (Gothrough.IamHiden(ll_C3012) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3013) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3015) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3017) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3018) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3019_u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3019_a) == false && Gothrough.IamHiden(ll_C3019_b) == false && Gothrough.IamHiden(ll_C3019_c) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3020) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3021u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3021d) == false && Gothrough.IamHiden(ll_C3021m) == false && Gothrough.IamHiden(ll_C3021y) == false) {
            return false;
        }*/

        return Gothrough.IamHiden(ll_C3022) != false;
    }
}