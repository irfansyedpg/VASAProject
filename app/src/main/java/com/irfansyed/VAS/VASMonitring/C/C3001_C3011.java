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

import com.irfansyed.VAS.VASMonitring.R;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class C3001_C3011 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_C3001,
            ll_C3002,
            ll_C3003,
            ll_C3004,
            ll_C3005u,
            ll_C3005d,
            ll_C3005w,
            ll_C3005m,
            ll_C3006,
            ll_C3006_OT,
            ll_C3008,
            ll_C3008_OT,
            ll_C3009_1,
            ll_C3009_2,
            ll_C3009_3,
            ll_C3009_4,
            ll_C3010,
            ll_C3011;

    RadioButton
            rb_C3001_1,
            rb_C3001_2,
            rb_C3001_DK,
            rb_C3001_RA,

            rb_C3002_1,
            rb_C3002_2,
            rb_C3002_DK,
            rb_C3002_RA,

            rb_C3003_1,
            rb_C3003_2,
            rb_C3003_DK,
            rb_C3003_RA,

            rb_C3004_1,
            rb_C3004_2,
            rb_C3004_3,
            rb_C3004_DK,
            rb_C3004_RA,

            rb_C3005u_1,
            rb_C3005u_2,
            rb_C3005u_3,
            rb_C3005u_DK,
            rb_C3005u_RA,

            rb_C3006_1,
            rb_C3006_2,
            rb_C3006_3,
            rb_C3006_4,
            rb_C3006_5,
                    rb_C3006_6,
            rb_C3006_7,
            rb_C3006_8,
            rb_C3006_9,
                    rb_C3006_10,
            rb_C3006_11,
                    rb_C3006_12,
            rb_C3006_DK,
            rb_C3006_RA,

            rb_C3008_1,
            rb_C3008_2,
            rb_C3008_3,
            rb_C3008_4,
            rb_C3008_5,
            rb_C3008_6,
                    rb_C3008_7,
            rb_C3008_8,
            rb_C3008_9,

            rb_C3009_1_1,
            rb_C3009_1_2,
            rb_C3009_1_DK,
            rb_C3009_1_RA,
            rb_C3009_2_1,
            rb_C3009_2_2,
            rb_C3009_2_DK,
            rb_C3009_2_RA,
            rb_C3009_3_1,
            rb_C3009_3_2,
            rb_C3009_3_DK,
            rb_C3009_3_RA,
            rb_C3009_4_1,
            rb_C3009_4_2,
            rb_C3009_4_DK,
            rb_C3009_4_RA,
            rb_C3011_1,
            rb_C3011_2;

    EditText
            ed_study_id,
            ed_C3005d,
            ed_C3005w,
            ed_C3005m,
            ed_C3006_OT,
            ed_C3008_OT,
            ed_C3010;

    String
            C3001,
            C3002,
            C3003,
            C3004,
            C3005u,
            C3005d,
            C3005w,
            C3005m,
            C3006,
            C3006_OT,
            C3008,
            C3008_OT,
            C3009_1,
            C3009_2,
            C3009_3,
            C3009_4,
            C3010,
            C3011,
            STATUS,
            study_id;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3001_c3011);

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

        Intent c = new Intent(this, C3012_C3022.class);

        startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts
        ll_C3001 = findViewById(R.id.ll_C3001);
        ll_C3002 = findViewById(R.id.ll_C3002);
        ll_C3003 = findViewById(R.id.ll_C3003);
        ll_C3004 = findViewById(R.id.ll_C3004);
        ll_C3005u = findViewById(R.id.ll_C3005u);
        ll_C3005d = findViewById(R.id.ll_C3005d);
        ll_C3005w = findViewById(R.id.ll_C3005w);
        ll_C3005m = findViewById(R.id.ll_C3005m);
        ll_C3006 = findViewById(R.id.ll_C3006);
        ll_C3006_OT = findViewById(R.id.ll_C3006_OT);
        ll_C3008 = findViewById(R.id.ll_C3008);
        ll_C3008_OT = findViewById(R.id.ll_C3008_OT);
        ll_C3009_1 = findViewById(R.id.ll_C3009_1);
        ll_C3009_2 = findViewById(R.id.ll_C3009_2);
        ll_C3009_3 = findViewById(R.id.ll_C3009_3);
        ll_C3009_4 = findViewById(R.id.ll_C3009_4);
        ll_C3010 = findViewById(R.id.ll_C3010);
        ll_C3011 = findViewById(R.id.ll_C3011);

        // Radio Buttons
        rb_C3001_1 = findViewById(R.id.rb_C3001_1);
        rb_C3001_2 = findViewById(R.id.rb_C3001_2);
        rb_C3001_DK = findViewById(R.id.rb_C3001_DK);
        rb_C3001_RA = findViewById(R.id.rb_C3001_RA);

        rb_C3002_1 = findViewById(R.id.rb_C3002_1);
        rb_C3002_2 = findViewById(R.id.rb_C3002_2);
        rb_C3002_DK = findViewById(R.id.rb_C3002_DK);
        rb_C3002_RA = findViewById(R.id.rb_C3002_RA);

        rb_C3003_1 = findViewById(R.id.rb_C3003_1);
        rb_C3003_2 = findViewById(R.id.rb_C3003_2);
        rb_C3003_DK = findViewById(R.id.rb_C3003_DK);
        rb_C3003_RA = findViewById(R.id.rb_C3003_RA);

        rb_C3004_1 = findViewById(R.id.rb_C3004_1);
        rb_C3004_2 = findViewById(R.id.rb_C3004_2);
        rb_C3004_3 = findViewById(R.id.rb_C3004_3);
        rb_C3004_DK = findViewById(R.id.rb_C3004_DK);
        rb_C3004_RA = findViewById(R.id.rb_C3004_RA);

        rb_C3005u_1 = findViewById(R.id.rb_C3005u_1);
        rb_C3005u_2 = findViewById(R.id.rb_C3005u_2);
        rb_C3005u_3 = findViewById(R.id.rb_C3005u_3);
        rb_C3005u_DK = findViewById(R.id.rb_C3005u_DK);
        rb_C3005u_RA = findViewById(R.id.rb_C3005u_RA);

        rb_C3006_1 = findViewById(R.id.rb_C3006_1);
        rb_C3006_2 = findViewById(R.id.rb_C3006_2);
        rb_C3006_3 = findViewById(R.id.rb_C3006_3);
        rb_C3006_4 = findViewById(R.id.rb_C3006_4);
        rb_C3006_5 = findViewById(R.id.rb_C3006_5);
        rb_C3006_6 = findViewById(R.id.rb_C3006_6);
        rb_C3006_7 = findViewById(R.id.rb_C3006_7);
        rb_C3006_8 = findViewById(R.id.rb_C3006_8);
        rb_C3006_9 = findViewById(R.id.rb_C3006_9);
        rb_C3006_10 = findViewById(R.id.rb_C3006_10);
        rb_C3006_11 = findViewById(R.id.rb_C3006_11);
        rb_C3006_12 = findViewById(R.id.rb_C3006_12);
        rb_C3006_DK = findViewById(R.id.rb_C3006_DK);
        rb_C3006_RA = findViewById(R.id.rb_C3006_RA);

        rb_C3008_1 = findViewById(R.id.rb_C3008_1);
        rb_C3008_2 = findViewById(R.id.rb_C3008_2);
        rb_C3008_3 = findViewById(R.id.rb_C3008_3);
        rb_C3008_4 = findViewById(R.id.rb_C3008_4);
        rb_C3008_5 = findViewById(R.id.rb_C3008_5);
        rb_C3008_6 = findViewById(R.id.rb_C3008_6);
        rb_C3008_7 = findViewById(R.id.rb_C3008_7);
        rb_C3008_8 = findViewById(R.id.rb_C3008_8);
        rb_C3008_9 = findViewById(R.id.rb_C3008_9);

        rb_C3009_1_1 = findViewById(R.id.rb_C3009_1_1);
        rb_C3009_1_2 = findViewById(R.id.rb_C3009_1_2);
        rb_C3009_1_DK = findViewById(R.id.rb_C3009_1_DK);
        rb_C3009_1_RA = findViewById(R.id.rb_C3009_1_RA);

        rb_C3009_2_1 = findViewById(R.id.rb_C3009_2_1);
        rb_C3009_2_2 = findViewById(R.id.rb_C3009_2_2);
        rb_C3009_2_DK = findViewById(R.id.rb_C3009_2_DK);
        rb_C3009_2_RA = findViewById(R.id.rb_C3009_2_RA);

        rb_C3009_3_1 = findViewById(R.id.rb_C3009_3_1);
        rb_C3009_3_2 = findViewById(R.id.rb_C3009_3_2);
        rb_C3009_3_DK = findViewById(R.id.rb_C3009_3_DK);
        rb_C3009_3_RA = findViewById(R.id.rb_C3009_3_RA);

        rb_C3009_4_1 = findViewById(R.id.rb_C3009_4_1);
        rb_C3009_4_2 = findViewById(R.id.rb_C3009_4_2);
        rb_C3009_4_DK = findViewById(R.id.rb_C3009_4_DK);
        rb_C3009_4_RA = findViewById(R.id.rb_C3009_4_RA);

        rb_C3011_1 = findViewById(R.id.rb_C3011_1);
        rb_C3011_2 = findViewById(R.id.rb_C3011_2);

        ed_C3005d = findViewById(R.id.ed_C3005d);
        ed_C3005w = findViewById(R.id.ed_C3005w);
        ed_C3005m = findViewById(R.id.ed_C3005m);
        ed_C3006_OT = findViewById(R.id.ed_C3006_OT);
        ed_C3008_OT = findViewById(R.id.ed_C3008_OT);
        ed_C3010 = findViewById(R.id.ed_C3010);
    }

    void events_call() {

        rb_C3001_1.setOnCheckedChangeListener(this);
        rb_C3001_2.setOnCheckedChangeListener(this);
        rb_C3001_DK.setOnCheckedChangeListener(this);
        rb_C3001_RA.setOnCheckedChangeListener(this);

        rb_C3003_1.setOnCheckedChangeListener(this);
        rb_C3003_2.setOnCheckedChangeListener(this);
        rb_C3003_DK.setOnCheckedChangeListener(this);
        rb_C3003_RA.setOnCheckedChangeListener(this);

        rb_C3004_1.setOnCheckedChangeListener(this);
        rb_C3004_2.setOnCheckedChangeListener(this);
        rb_C3004_3.setOnCheckedChangeListener(this);
        rb_C3004_DK.setOnCheckedChangeListener(this);
        rb_C3004_RA.setOnCheckedChangeListener(this);

        rb_C3005u_1.setOnCheckedChangeListener(this);
        rb_C3005u_2.setOnCheckedChangeListener(this);
        rb_C3005u_3.setOnCheckedChangeListener(this);
        rb_C3005u_DK.setOnCheckedChangeListener(this);
        rb_C3005u_RA.setOnCheckedChangeListener(this);

        rb_C3006_1.setOnCheckedChangeListener(this);
        rb_C3006_2.setOnCheckedChangeListener(this);
        rb_C3006_3.setOnCheckedChangeListener(this);
        rb_C3006_4.setOnCheckedChangeListener(this);
        rb_C3006_5.setOnCheckedChangeListener(this);
        rb_C3006_6.setOnCheckedChangeListener(this);
        rb_C3006_7.setOnCheckedChangeListener(this);
        rb_C3006_8.setOnCheckedChangeListener(this);
        rb_C3006_9.setOnCheckedChangeListener(this);
        rb_C3006_10.setOnCheckedChangeListener(this);
        rb_C3006_11.setOnCheckedChangeListener(this);
        rb_C3006_12.setOnCheckedChangeListener(this);
        rb_C3006_DK.setOnCheckedChangeListener(this);
        rb_C3006_RA.setOnCheckedChangeListener(this);

        rb_C3008_1.setOnCheckedChangeListener(this);
        rb_C3008_2.setOnCheckedChangeListener(this);
        rb_C3008_3.setOnCheckedChangeListener(this);
        rb_C3008_4.setOnCheckedChangeListener(this);
        rb_C3008_5.setOnCheckedChangeListener(this);
        rb_C3008_6.setOnCheckedChangeListener(this);
        rb_C3008_7.setOnCheckedChangeListener(this);
        rb_C3008_8.setOnCheckedChangeListener(this);
        rb_C3008_9.setOnCheckedChangeListener(this);

        rb_C3009_1_1.setOnCheckedChangeListener(this);
        rb_C3009_1_2.setOnCheckedChangeListener(this);
        rb_C3009_1_DK.setOnCheckedChangeListener(this);
        rb_C3009_1_RA.setOnCheckedChangeListener(this);

        rb_C3009_2_1.setOnCheckedChangeListener(this);
        rb_C3009_2_2.setOnCheckedChangeListener(this);
        rb_C3009_2_DK.setOnCheckedChangeListener(this);
        rb_C3009_2_RA.setOnCheckedChangeListener(this);

        rb_C3009_3_1.setOnCheckedChangeListener(this);
        rb_C3009_3_2.setOnCheckedChangeListener(this);
        rb_C3009_3_DK.setOnCheckedChangeListener(this);
        rb_C3009_3_RA.setOnCheckedChangeListener(this);

        rb_C3009_4_1.setOnCheckedChangeListener(this);
        rb_C3009_4_2.setOnCheckedChangeListener(this);
        rb_C3009_4_DK.setOnCheckedChangeListener(this);
        rb_C3009_4_RA.setOnCheckedChangeListener(this);

        rb_C3011_1.setOnCheckedChangeListener(this);
        rb_C3011_2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3001_1
                || compoundButton.getId() == R.id.rb_C3001_2
                || compoundButton.getId() == R.id.rb_C3001_DK
                || compoundButton.getId() == R.id.rb_C3001_RA) {

            ClearAllcontrol.ClearAll(ll_C3002);
            ll_C3002.setVisibility(View.GONE);

            if (rb_C3001_1.isChecked()) {

                ll_C3002.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3002);
                ll_C3002.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3003_1
                || compoundButton.getId() == R.id.rb_C3003_2
                || compoundButton.getId() == R.id.rb_C3003_DK
                || compoundButton.getId() == R.id.rb_C3003_RA) {

            ClearAllcontrol.ClearAll(ll_C3004);
            ClearAllcontrol.ClearAll(ll_C3005u);
            ClearAllcontrol.ClearAll(ll_C3005d);
            ClearAllcontrol.ClearAll(ll_C3005w);
            ClearAllcontrol.ClearAll(ll_C3005m);

            ll_C3004.setVisibility(View.GONE);
            ll_C3005u.setVisibility(View.GONE);
            ll_C3005d.setVisibility(View.GONE);
            ll_C3005w.setVisibility(View.GONE);
            ll_C3005m.setVisibility(View.GONE);

            if (rb_C3003_2.isChecked() || rb_C3003_DK.isChecked() || rb_C3003_RA.isChecked()) {

                ll_C3004.setVisibility(View.VISIBLE);
                ll_C3005u.setVisibility(View.VISIBLE);
                ll_C3005d.setVisibility(View.VISIBLE);
                ll_C3005w.setVisibility(View.VISIBLE);
                ll_C3005m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3004);
                ClearAllcontrol.ClearAll(ll_C3005u);
                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);

                ll_C3004.setVisibility(View.GONE);
                ll_C3005u.setVisibility(View.GONE);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3004_1
                || compoundButton.getId() == R.id.rb_C3004_2
                || compoundButton.getId() == R.id.rb_C3004_3
                || compoundButton.getId() == R.id.rb_C3004_DK
                || compoundButton.getId() == R.id.rb_C3004_RA) {

            ClearAllcontrol.ClearAll(ll_C3005u);
            ClearAllcontrol.ClearAll(ll_C3005d);
            ClearAllcontrol.ClearAll(ll_C3005w);
            ClearAllcontrol.ClearAll(ll_C3005m);

            ll_C3005u.setVisibility(View.GONE);
            ll_C3005d.setVisibility(View.GONE);
            ll_C3005w.setVisibility(View.GONE);
            ll_C3005m.setVisibility(View.GONE);

            if (rb_C3004_3.isChecked()) {

                ll_C3005u.setVisibility(View.VISIBLE);
                ll_C3005d.setVisibility(View.VISIBLE);
                ll_C3005w.setVisibility(View.VISIBLE);
                ll_C3005m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3005u);
                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);

                ll_C3005u.setVisibility(View.GONE);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3005u_1
                || compoundButton.getId() == R.id.rb_C3005u_2
                || compoundButton.getId() == R.id.rb_C3005u_3
                || compoundButton.getId() == R.id.rb_C3005u_DK
                || compoundButton.getId() == R.id.rb_C3005u_RA) {

            ClearAllcontrol.ClearAll(ll_C3005d);
            ClearAllcontrol.ClearAll(ll_C3005w);
            ClearAllcontrol.ClearAll(ll_C3005m);
            ll_C3005d.setVisibility(View.GONE);
            ll_C3005w.setVisibility(View.GONE);
            ll_C3005m.setVisibility(View.GONE);

            if (rb_C3005u_1.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);

                ll_C3005d.setVisibility(View.VISIBLE);

            } else if (rb_C3005u_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005m);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);

                ll_C3005w.setVisibility(View.VISIBLE);

            } else if (rb_C3005u_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);

                ll_C3005m.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3005d);
                ClearAllcontrol.ClearAll(ll_C3005w);
                ClearAllcontrol.ClearAll(ll_C3005m);
                ll_C3005d.setVisibility(View.GONE);
                ll_C3005w.setVisibility(View.GONE);
                ll_C3005m.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3006_1
                || compoundButton.getId() == R.id.rb_C3006_2
                || compoundButton.getId() == R.id.rb_C3006_3
                || compoundButton.getId() == R.id.rb_C3006_4
                || compoundButton.getId() == R.id.rb_C3006_5
                || compoundButton.getId() == R.id.rb_C3006_6
                || compoundButton.getId() == R.id.rb_C3006_7
                || compoundButton.getId() == R.id.rb_C3006_8
                || compoundButton.getId() == R.id.rb_C3006_9
                || compoundButton.getId() == R.id.rb_C3006_10
                || compoundButton.getId() == R.id.rb_C3006_11
                || compoundButton.getId() == R.id.rb_C3006_12
                || compoundButton.getId() == R.id.rb_C3006_DK
                || compoundButton.getId() == R.id.rb_C3006_RA) {

            ClearAllcontrol.ClearAll(ll_C3006_OT);
            ll_C3006_OT.setVisibility(View.GONE);

            if (rb_C3006_6.isChecked() || rb_C3006_10.isChecked() || rb_C3006_12.isChecked()) {

                ll_C3006_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3006_OT);
                ll_C3006_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3008_1
                || compoundButton.getId() == R.id.rb_C3008_2
                || compoundButton.getId() == R.id.rb_C3008_3
                || compoundButton.getId() == R.id.rb_C3008_4
                || compoundButton.getId() == R.id.rb_C3008_5
                || compoundButton.getId() == R.id.rb_C3008_6
                || compoundButton.getId() == R.id.rb_C3008_7
                || compoundButton.getId() == R.id.rb_C3008_8
                || compoundButton.getId() == R.id.rb_C3008_9) {

            ClearAllcontrol.ClearAll(ll_C3008_OT);
            ll_C3008_OT.setVisibility(View.GONE);

            if (rb_C3008_7.isChecked()) {

                ll_C3008_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3008_OT);
                ll_C3008_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3009_1_1
                || compoundButton.getId() == R.id.rb_C3009_1_2
                || compoundButton.getId() == R.id.rb_C3009_1_DK
                || compoundButton.getId() == R.id.rb_C3009_1_RA) {

            ClearAllcontrol.ClearAll(ll_C3009_2);
            ClearAllcontrol.ClearAll(ll_C3009_3);
            ClearAllcontrol.ClearAll(ll_C3009_4);

            ll_C3009_2.setVisibility(View.GONE);
            ll_C3009_3.setVisibility(View.GONE);
            ll_C3009_4.setVisibility(View.GONE);

            if (rb_C3009_1_2.isChecked() || rb_C3009_1_DK.isChecked() || rb_C3009_1_RA.isChecked()) {

                ll_C3009_2.setVisibility(View.VISIBLE);
                ll_C3009_3.setVisibility(View.VISIBLE);
                ll_C3009_4.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3009_2);
                ClearAllcontrol.ClearAll(ll_C3009_3);
                ClearAllcontrol.ClearAll(ll_C3009_4);

                ll_C3009_2.setVisibility(View.GONE);
                ll_C3009_3.setVisibility(View.GONE);
                ll_C3009_4.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3009_2_1
                || compoundButton.getId() == R.id.rb_C3009_2_2
                || compoundButton.getId() == R.id.rb_C3009_2_DK
                || compoundButton.getId() == R.id.rb_C3009_2_RA) {

            ClearAllcontrol.ClearAll(ll_C3009_3);
            ClearAllcontrol.ClearAll(ll_C3009_4);

            ll_C3009_3.setVisibility(View.GONE);
            ll_C3009_4.setVisibility(View.GONE);

            if (rb_C3009_2_2.isChecked() || rb_C3009_2_DK.isChecked() || rb_C3009_2_RA.isChecked()) {

                ll_C3009_3.setVisibility(View.VISIBLE);
                ll_C3009_4.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3009_3);
                ClearAllcontrol.ClearAll(ll_C3009_4);

                ll_C3009_3.setVisibility(View.GONE);
                ll_C3009_4.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_C3009_3_1
                || compoundButton.getId() == R.id.rb_C3009_3_2
                || compoundButton.getId() == R.id.rb_C3009_3_DK
                || compoundButton.getId() == R.id.rb_C3009_3_RA) {

            ClearAllcontrol.ClearAll(ll_C3009_4);
            ll_C3009_4.setVisibility(View.GONE);

            if (rb_C3009_3_2.isChecked() || rb_C3009_3_DK.isChecked() || rb_C3009_3_RA.isChecked()) {

                ll_C3009_4.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3009_4);
                ll_C3009_4.setVisibility(View.GONE);
            }
        }
    }

    void value_assignment() {

        study_id = "0";
        C3001 = "000";
        C3002 = "000";
        C3003 = "000";
        C3004 = "000";
        C3005u = "000";
        C3005d = "000";
        C3005w = "000";
        C3005m = "000";
        C3006 = "000";
        C3006_OT = "000";
        C3008 = "000";
        C3008_OT = "000";
        C3009_1 = "000";
        C3009_2 = "000";
        C3009_3 = "000";
        C3009_4 = "000";
        C3010 = "000";
        C3011 = "000";
        STATUS = "0";

        if (rb_C3001_1.isChecked()) {
            C3001 = "1";
        } else if (rb_C3001_2.isChecked()) {
            C3001 = "2";
        } else if (rb_C3001_DK.isChecked()) {
            C3001 = "9";
        } else if (rb_C3001_RA.isChecked()) {
            C3001 = "8";
        }

        if (rb_C3002_1.isChecked()) {
            C3002 = "1";
        } else if (rb_C3002_2.isChecked()) {
            C3002 = "2";
        } else if (rb_C3002_DK.isChecked()) {
            C3002 = "9";
        } else if (rb_C3002_RA.isChecked()) {
            C3002 = "8";
        }

        if (rb_C3003_1.isChecked()) {
            C3003 = "1";
        } else if (rb_C3003_2.isChecked()) {
            C3003 = "2";
        } else if (rb_C3003_DK.isChecked()) {
            C3003 = "9";
        } else if (rb_C3003_RA.isChecked()) {
            C3003 = "8";
        }

        if (rb_C3004_1.isChecked()) {
            C3004 = "1";
        } else if (rb_C3004_2.isChecked()) {
            C3004 = "2";
        } else if (rb_C3004_3.isChecked()) {
            C3004 = "3";
        } else if (rb_C3004_DK.isChecked()) {
            C3004 = "9";
        } else if (rb_C3004_RA.isChecked()) {
            C3004 = "8";
        }

        if (rb_C3005u_1.isChecked()) {
            C3005u = "1";
        } else if (rb_C3005u_2.isChecked()) {
            C3005u = "2";
        } else if (rb_C3005u_3.isChecked()) {
            C3005u = "3";
        } else if (rb_C3005u_DK.isChecked()) {
            C3005u = "9";
        } else if (rb_C3005u_RA.isChecked()) {
            C3005u = "8";
        }

        if (ed_C3005d.getText().toString().trim().length() > 0) {
            C3005d = ed_C3005d.getText().toString().trim();
        }

        if (ed_C3005w.getText().toString().trim().length() > 0) {
            C3005w = ed_C3005w.getText().toString().trim();
        }

        if (ed_C3005m.getText().toString().trim().length() > 0) {
            C3005m = ed_C3005m.getText().toString().trim();
        }

        if (rb_C3006_1.isChecked()) {
            C3006 = "1";
        } else if (rb_C3006_2.isChecked()) {
            C3006 = "2";
        } else if (rb_C3006_3.isChecked()) {
            C3006 = "3";
        } else if (rb_C3006_4.isChecked()) {
            C3006 = "4";
        } else if (rb_C3006_5.isChecked()) {
            C3006 = "5";
        } else if (rb_C3006_6.isChecked()) {
            C3006 = "6";
            C3006_OT = ed_C3006_OT.getText().toString().trim();
        } else if (rb_C3006_7.isChecked()) {
            C3006 = "7";
        } else if (rb_C3006_8.isChecked()) {
            C3006 = "8";
        } else if (rb_C3006_9.isChecked()) {
            C3006 = "9";
        } else if (rb_C3006_10.isChecked()) {
            C3006 = "10";
            C3006_OT = ed_C3006_OT.getText().toString().trim();
        } else if (rb_C3006_11.isChecked()) {
            C3006 = "11";
        } else if (rb_C3006_12.isChecked()) {
            C3006 = "12";
            C3006_OT = ed_C3006_OT.getText().toString().trim();
        } else if (rb_C3006_DK.isChecked()) {
            C3006 = "99";
        } else if (rb_C3006_RA.isChecked()) {
            C3006 = "88";
        }

        if (rb_C3008_1.isChecked()) {
            C3008 = "1";
        } else if (rb_C3008_2.isChecked()) {
            C3008 = "2";
        } else if (rb_C3008_3.isChecked()) {
            C3008 = "3";
        } else if (rb_C3008_4.isChecked()) {
            C3008 = "4";
        } else if (rb_C3008_5.isChecked()) {
            C3008 = "5";
        } else if (rb_C3008_6.isChecked()) {
            C3008 = "6";
        } else if (rb_C3008_7.isChecked()) {
            C3008 = "7";
            C3008_OT = ed_C3008_OT.getText().toString().trim();
        } else if (rb_C3008_8.isChecked()) {
            C3008 = "8";
        } else if (rb_C3008_9.isChecked()) {
            C3008 = "9";
        }

        if (rb_C3009_1_1.isChecked()) {
            C3009_1 = "1";
        } else if (rb_C3009_1_2.isChecked()) {
            C3009_1 = "2";
        } else if (rb_C3009_1_DK.isChecked()) {
            C3009_1 = "9";
        } else if (rb_C3009_1_RA.isChecked()) {
            C3009_1 = "8";
        }

        if (rb_C3009_2_1.isChecked()) {
            C3009_2 = "1";
        } else if (rb_C3009_2_2.isChecked()) {
            C3009_2 = "2";
        } else if (rb_C3009_2_DK.isChecked()) {
            C3009_2 = "9";
        } else if (rb_C3009_2_RA.isChecked()) {
            C3009_2 = "8";
        }

        if (rb_C3009_3_1.isChecked()) {
            C3009_3 = "1";
        } else if (rb_C3009_3_2.isChecked()) {
            C3009_3 = "2";
        } else if (rb_C3009_3_DK.isChecked()) {
            C3009_3 = "9";
        } else if (rb_C3009_3_RA.isChecked()) {
            C3009_3 = "8";
        }

        if (rb_C3009_4_1.isChecked()) {
            C3009_4 = "1";
        } else if (rb_C3009_4_2.isChecked()) {
            C3009_4 = "2";
        } else if (rb_C3009_4_DK.isChecked()) {
            C3009_4 = "9";
        } else if (rb_C3009_4_RA.isChecked()) {
            C3009_4 = "8";
        }

        if (ed_C3010.getText().toString().trim().length() > 0) {
            C3010 = ed_C3010.getText().toString().trim();
        }

        if (rb_C3011_1.isChecked()) {
            C3011 = "1";
        } else if (rb_C3011_2.isChecked()) {
            C3011 = "2";
        }
    }

    void insert_data() {
        String query = "insert into   C3001_C3011("
                + Global.C.C3001_C3011.study_id + ","
                + Global.C.C3001_C3011.C3001 + ","
                + Global.C.C3001_C3011.C3002 + ","
                + Global.C.C3001_C3011.C3003 + ","
                + Global.C.C3001_C3011.C3004 + ","
                + Global.C.C3001_C3011.C3005u + ","
                + Global.C.C3001_C3011.C3005d + ","
                + Global.C.C3001_C3011.C3005w + ","
                + Global.C.C3001_C3011.C3005m + ","
                + Global.C.C3001_C3011.C3006 + ","
                + Global.C.C3001_C3011.C3006_OT + ","
                + Global.C.C3001_C3011.C3008 + ","
                + Global.C.C3001_C3011.C3008_OT + ","
                + Global.C.C3001_C3011.C3009_1 + ","
                + Global.C.C3001_C3011.C3009_2 + ","
                + Global.C.C3001_C3011.C3009_3 + ","
                + Global.C.C3001_C3011.C3009_4 + ","
                + Global.C.C3001_C3011.C3010 + ","
                + Global.C.C3001_C3011.C3011 + ","
                + Global.C.C3001_C3011.STATUS + ") values ('" +

                study_id + "','" +
                C3001 + "','" +
                C3002 + "','" +
                C3003 + "','" +
                C3004 + "','" +
                C3005u + "','" +
                C3005d + "','" +
                C3005w + "','" +
                C3005m + "','" +
                C3006 + "','" +
                C3006_OT + "','" +
                C3008 + "','" +
                C3008_OT + "','" +
                C3009_1 + "','" +
                C3009_2 + "','" +
                C3009_3 + "','" +
                C3009_4 + "','" +
                C3010 + "','" +
                C3011 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 2: Background inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_C3001) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3002) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3003) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3004) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005u) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005w) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3005m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3006) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3006_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3008) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3008_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3009_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3010) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_C3011) != false;
    }

}