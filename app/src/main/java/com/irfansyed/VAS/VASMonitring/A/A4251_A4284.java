package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class A4251_A4284 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration Region

    Boolean A4252_check;

    int check = 0;

    List<String> phase = new ArrayList();
    List<String> care = new ArrayList();
    List<String> symtomps = new ArrayList();
    List<String> place = new ArrayList();


    Button
            btn_next11,
            btn_addd;

    LinearLayout
            ll_study_id,
            ll_A4251,
            ll_A4252,
            ll_A4253,
            ll_A4254_1,
            ll_A4254_2,
            ll_A4255,
            ll_A4256,
            ll_A4257,
            ll_A4258_1,
            ll_A4258_2,
            ll_A4259,
            ll_A4260,
            ll_A4261,
            ll_A4262,
            ll_A4263_1,
            ll_A4263_2,
            ll_A4264,
            ll_A4266,
            ll_A4267_1,
            ll_A4267_2,
            ll_A4268,
            ll_A4269,
            ll_A4270,
            ll_A4271,
            ll_A4272_1,
            ll_A4272_2,
            ll_A4273,
            ll_A4274,
            ll_A4275_1,
            ll_A4275_2,
            ll_A4276,
            ll_A4277,
            ll_A4278,
            ll_A4279,
            ll_A4280,
            ll_A4281,
            ll_A4282,
            ll_A4283,
            ll_A4284;

    RadioButton
            rb_A4251_1,
            rb_A4251_2,
            rb_A4251_DK,
            rb_A4253_1,
            rb_A4253_2,
            rb_A4253_3,
            rb_A4253_DK,
            rb_A4254_1_1,
            rb_A4254_1_2,
            rb_A4254_1_DK,
            rb_A4254_2_1,
            rb_A4254_2_2,
            rb_A4254_2_DK,
            rb_A4257_1,
            rb_A4257_2,
            rb_A4257_3,
            rb_A4257_4,
            rb_A4257_5,
            rb_A4257_6,
            rb_A4257_7,
            rb_A4257_8,
            rb_A4257_9,
            rb_A4257_10,
            rb_A4257_11,
            rb_A4257_DK,
            rb_A4258_1_1,
            rb_A4258_1_2,
            rb_A4258_1_3,
            rb_A4258_1_DK,
            rb_A4258_2_1,
            rb_A4258_2_2,
            rb_A4258_2_3,
            rb_A4258_2_DK,
            rb_A4260_1,
            rb_A4260_2,
            rb_A4260_DK,
            rb_A4261_1,
            rb_A4261_2,
            rb_A4261_DK,
            rb_A4262_1,
            rb_A4262_2,
            rb_A4262_3,
            rb_A4262_4,
            rb_A4262_5,
            rb_A4262_6,
            rb_A4262_7,
            rb_A4262_8,
            rb_A4262_9,
            rb_A4262_10,
            rb_A4262_11,
            rb_A4262_DK,
            rb_A4263_1_1,
            rb_A4263_1_2,
            rb_A4263_1_DK,
            rb_A4263_2_1,
            rb_A4263_2_2,
            rb_A4263_2_DK,
            rb_A4264_1,
            rb_A4264_2,
            rb_A4266_1,
            rb_A4266_2,
            rb_A4266_3,
            rb_A4266_4,
            rb_A4266_5,
            rb_A4266_6,
            rb_A4266_7,
            rb_A4266_8,
            rb_A4266_9,
            rb_A4266_10,
            rb_A4266_11,
            rb_A4266_DK,
            rb_A4267_1_1,
            rb_A4267_1_2,
            rb_A4267_1_3,
            rb_A4267_1_DK,
            rb_A4267_2_1,
            rb_A4267_2_2,
            rb_A4267_2_3,
            rb_A4267_2_DK,
            rb_A4269_1,
            rb_A4269_2,
            rb_A4269_DK,
            rb_A4270_1,
            rb_A4270_2,
            rb_A4270_DK,
            rb_A4271_1,
            rb_A4271_2,
            rb_A4271_3,
            rb_A4271_4,
            rb_A4271_5,
            rb_A4271_6,
            rb_A4271_7,
            rb_A4271_8,
            rb_A4271_9,
            rb_A4271_10,
            rb_A4271_11,
            rb_A4271_DK,
            rb_A4272_1_1,
            rb_A4272_1_2,
            rb_A4272_1_DK,
            rb_A4272_2_1,
            rb_A4272_2_2,
            rb_A4272_2_DK,
            rb_A4273_1,
            rb_A4273_2,
            rb_A4274_1,
            rb_A4274_2,
            rb_A4274_DK,
            rb_A4275_1_1,
            rb_A4275_1_2,
            rb_A4275_1_DK,
            rb_A4275_2_1,
            rb_A4275_2_2,
            rb_A4275_2_DK,
            rb_A4277_1,
            rb_A4277_2,
            rb_A4277_DK,
            rb_A4280_1,
            rb_A4280_2,
            rb_A4280_DK,
            rb_A4280_RA,
            rb_A4281_1,
            rb_A4281_2,
            rb_A4281_DK,
            rb_A4281_RA,
            rb_A4282_1,
            rb_A4282_2,
            rb_A4282_DK,
            rb_A4282_RA,
            rb_A4283_1,
            rb_A4283_2,
            rb_A4283_DK,
            rb_A4283_RA;

    EditText
            ed_study_id,
            ed_A4253_3,
            ed_A4255_4,
            ed_A4255_13,
            ed_A4256_minutes,
            ed_A4256_hours,
            ed_A4256_days,
            ed_A4257_name,
            ed_A4259_minutes,
            ed_A4259_hours,
            ed_A4262_name,
            ed_A4266_name,
            ed_A4268_minutes,
            ed_A4268_hours,
            ed_A4271_name,
            ed_A4276_5,
            ed_A4276_16,
            ed_A4284_days;

    TextView
            A4252_start,
            A4252_mid,
            A4252_End;

    CheckBox
            cb_A4255_1,
            cb_A4255_2,
            cb_A4255_3,
            cb_A4255_4,
            cb_A4255_5,
            cb_A4255_6,
            cb_A4255_7,
            cb_A4255_8,
            cb_A4255_9,
            cb_A4255_10,
            cb_A4255_11,
            cb_A4255_12,
            cb_A4255_13,
            cb_A4255_DK,
            cb_A4276_1,
            cb_A4276_2,
            cb_A4276_3,
            cb_A4276_4,
            cb_A4276_5,
            cb_A4276_6,
            cb_A4276_7,
            cb_A4276_8,
            cb_A4276_9,
            cb_A4276_10,
            cb_A4276_11,
            cb_A4276_12,
            cb_A4276_13,
            cb_A4276_14,
            cb_A4276_15,
            cb_A4276_16,
            cb_A4276_DK,
            cb_A4278_1,
            cb_A4278_2,
            cb_A4278_3,
            cb_A4278_4,
            cb_A4278_5,
            cb_A4278_6,
            cb_A4278_7,
            cb_A4278_DK,
            cb_A4279_1,
            cb_A4279_2,
            cb_A4279_3,
            cb_A4279_4,
            cb_A4279_5,
            cb_A4279_6,
            cb_A4279_7,
            cb_A4279_DK;

    String
            A4013m_flag,
            A4013y_flag,
            study_id,
            A4251,
            A4253,
            A4253_3,
            A4254_1,
            A4254_2,
            A4255_1,
            A4255_2,
            A4255_3,
            A4255_4,
            A4255_4_OT,
            A4255_5,
            A4255_6,
            A4255_7,
            A4255_8,
            A4255_9,
            A4255_10,
            A4255_11,
            A4255_12,
            A4255_13,
            A4255_13_OT,
            A4255_DK,
            A4256_days,
            A4256_hours,
            A4256_minutes,
            A4257,
            A4257_name,
            A4258_1,
            A4258_2,
            A4259_hours,
            A4259_minutes,
            A4260,
            A4261,
            A4262,
            A4262_name,
            A4263_1,
            A4263_2,
            A4264,
            A4266,
            A4266_name,
            A4267_1,
            A4267_2,
            A4268_hours,
            A4268_minutes,
            A4269,
            A4270,
            A4271,
            A4271_name,
            A4272_1,
            A4272_2,
            A4273,
            A4274,
            A4275_1,
            A4275_2,
            A4276_1,
            A4276_2,
            A4276_3,
            A4276_4,
            A4276_5,
            A4276_5_OT,
            A4276_6,
            A4276_7,
            A4276_8,
            A4276_9,
            A4276_10,
            A4276_11,
            A4276_12,
            A4276_13,
            A4276_14,
            A4276_15,
            A4276_16,
            A4276_16_OT,
            A4276_DK,
            A4277,
            A4278_1,
            A4278_2,
            A4278_3,
            A4278_4,
            A4278_5,
            A4278_6,
            A4278_7,
            A4278_DK,
            A4279_1,
            A4279_2,
            A4279_3,
            A4279_4,
            A4279_5,
            A4279_6,
            A4279_7,
            A4279_DK,
            A4280,
            A4281,
            A4282,
            A4283,
            A4284,
            STATUS;

    String
            A4252_1,
            A4252_2,
            A4252_3,
            A4252_4;


    int currentSection;


    //Declaration

    Boolean b_place_where = false;
    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            if ((ed_A4259_hours.getText().hashCode() == s.hashCode())
                    || (ed_A4259_minutes.getText().hashCode() == s.hashCode())){

                if ((ed_A4259_hours.getText().toString().trim().length() > 0
                        || ed_A4259_minutes.getText().toString().trim().length() > 0)
                        && (!rb_A4257_1.isChecked() || !rb_A4257_7.isChecked())) {

                    ClearAllcontrol.ClearAll(ll_A4260);
                    ll_A4260.setVisibility(View.GONE);
                } else {
                    ll_A4260.setVisibility(View.VISIBLE);
                }
            }


            if ((ed_A4268_hours.getText().hashCode() == s.hashCode())
                    || (ed_A4268_minutes.getText().hashCode() == s.hashCode())){

                if ((ed_A4268_hours.getText().toString().trim().length() > 0
                        || ed_A4268_minutes.getText().toString().trim().length() > 0)
                        && (!rb_A4266_1.isChecked() || !rb_A4266_7.isChecked())) {

                    ClearAllcontrol.ClearAll(ll_A4269);
                    ll_A4269.setVisibility(View.GONE);
                } else {
                    ll_A4269.setVisibility(View.VISIBLE);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4251__a4284);

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_call();

        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("A4001_A4014", study_id);

        if (res.getCount() > 0) {

            //Toast.makeText(this, "" + res.getString(res.getColumnIndex("study_id")), Toast.LENGTH_LONG).show();
            res.moveToFirst();

            A4013m_flag = res.getString(res.getColumnIndex("A4013m"));
            A4013y_flag = res.getString(res.getColumnIndex("A4013y"));

            Toast.makeText(this, "Illness Lasted  " + A4013m_flag + "  Months", Toast.LENGTH_LONG).show();

            Toast.makeText(this, "Illness Lasted  " + A4013y_flag + "  Years", Toast.LENGTH_LONG).show();

        }
    }

    void Initialization() {

        A4252_start = findViewById(R.id.A4252_start);
        A4252_mid = findViewById(R.id.A4252_Mid);
        A4252_End = findViewById(R.id.A4252_End);

        btn_next11 = findViewById(R.id.btn_next11);
        btn_addd = findViewById(R.id.btn_addd);

        ll_A4251 = findViewById(R.id.ll_A4251);
        ll_A4252 = findViewById(R.id.ll_A4252);
        //   ll_A4252_1 = findViewById(R.id.ll_A4252_1);
        ll_A4253 = findViewById(R.id.ll_A4253);
        ll_A4254_1 = findViewById(R.id.ll_A4254_1);
        ll_A4254_2 = findViewById(R.id.ll_A4254_2);
        ll_A4255 = findViewById(R.id.ll_A4255);
        ll_A4256 = findViewById(R.id.ll_A4256);
        ll_A4257 = findViewById(R.id.ll_A4257);
        ll_A4258_1 = findViewById(R.id.ll_A4258_1);
        ll_A4258_2 = findViewById(R.id.ll_A4258_2);
        ll_A4259 = findViewById(R.id.ll_A4259);
        ll_A4260 = findViewById(R.id.ll_A4260);
        ll_A4261 = findViewById(R.id.ll_A4261);
        ll_A4262 = findViewById(R.id.ll_A4262);
        ll_A4263_1 = findViewById(R.id.ll_A4263_1);
        ll_A4263_2 = findViewById(R.id.ll_A4263_2);
        ll_A4264 = findViewById(R.id.ll_A4264);
        ll_A4266 = findViewById(R.id.ll_A4266);
        ll_A4267_1 = findViewById(R.id.ll_A4267_1);
        ll_A4267_2 = findViewById(R.id.ll_A4267_2);
        ll_A4268 = findViewById(R.id.ll_A4268);
        ll_A4269 = findViewById(R.id.ll_A4269);
        ll_A4270 = findViewById(R.id.ll_A4270);
        ll_A4271 = findViewById(R.id.ll_A4271);
        ll_A4272_1 = findViewById(R.id.ll_A4272_1);
        ll_A4272_2 = findViewById(R.id.ll_A4272_2);
        ll_A4273 = findViewById(R.id.ll_A4273);
        ll_A4274 = findViewById(R.id.ll_A4274);
        ll_A4275_1 = findViewById(R.id.ll_A4275_1);
        ll_A4275_2 = findViewById(R.id.ll_A4275_2);
        ll_A4276 = findViewById(R.id.ll_A4276);
        ll_A4277 = findViewById(R.id.ll_A4277);
        ll_A4278 = findViewById(R.id.ll_A4278);
        ll_A4279 = findViewById(R.id.ll_A4279);
        ll_A4280 = findViewById(R.id.ll_A4280);
        ll_A4281 = findViewById(R.id.ll_A4281);
        ll_A4282 = findViewById(R.id.ll_A4282);
        ll_A4283 = findViewById(R.id.ll_A4283);
        ll_A4284 = findViewById(R.id.ll_A4284);

        rb_A4251_1 = findViewById(R.id.rb_A4251_1);
        rb_A4251_2 = findViewById(R.id.rb_A4251_2);
        rb_A4251_DK = findViewById(R.id.rb_A4251_DK);
        rb_A4253_1 = findViewById(R.id.rb_A4253_1);
        rb_A4253_2 = findViewById(R.id.rb_A4253_2);
        rb_A4253_3 = findViewById(R.id.rb_A4253_3);
        rb_A4253_DK = findViewById(R.id.rb_A4253_DK);
        rb_A4254_1_1 = findViewById(R.id.rb_A4254_1_1);
        rb_A4254_1_2 = findViewById(R.id.rb_A4254_1_2);
        rb_A4254_1_DK = findViewById(R.id.rb_A4254_1_DK);
        rb_A4254_2_1 = findViewById(R.id.rb_A4254_2_1);
        rb_A4254_2_2 = findViewById(R.id.rb_A4254_2_2);
        rb_A4254_2_DK = findViewById(R.id.rb_A4254_2_DK);
        rb_A4257_1 = findViewById(R.id.rb_A4257_1);
        rb_A4257_2 = findViewById(R.id.rb_A4257_2);
        rb_A4257_3 = findViewById(R.id.rb_A4257_3);
        rb_A4257_4 = findViewById(R.id.rb_A4257_4);
        rb_A4257_5 = findViewById(R.id.rb_A4257_5);
        rb_A4257_6 = findViewById(R.id.rb_A4257_6);
        rb_A4257_7 = findViewById(R.id.rb_A4257_7);
        rb_A4257_8 = findViewById(R.id.rb_A4257_8);
        rb_A4257_9 = findViewById(R.id.rb_A4257_9);
        rb_A4257_10 = findViewById(R.id.rb_A4257_10);
        rb_A4257_11 = findViewById(R.id.rb_A4257_11);
        rb_A4257_DK = findViewById(R.id.rb_A4257_DK);
        rb_A4258_1_1 = findViewById(R.id.rb_A4258_1_1);
        rb_A4258_1_2 = findViewById(R.id.rb_A4258_1_2);
        rb_A4258_1_3 = findViewById(R.id.rb_A4258_1_3);
        rb_A4258_1_DK = findViewById(R.id.rb_A4258_1_DK);
        rb_A4258_2_1 = findViewById(R.id.rb_A4258_2_1);
        rb_A4258_2_2 = findViewById(R.id.rb_A4258_2_2);
        rb_A4258_2_3 = findViewById(R.id.rb_A4258_2_3);
        rb_A4258_2_DK = findViewById(R.id.rb_A4258_2_DK);
        rb_A4260_1 = findViewById(R.id.rb_A4260_1);
        rb_A4260_2 = findViewById(R.id.rb_A4260_2);
        rb_A4260_DK = findViewById(R.id.rb_A4260_DK);
        rb_A4261_1 = findViewById(R.id.rb_A4261_1);
        rb_A4261_2 = findViewById(R.id.rb_A4261_2);
        rb_A4261_DK = findViewById(R.id.rb_A4261_DK);
        rb_A4262_1 = findViewById(R.id.rb_A4262_1);
        rb_A4262_2 = findViewById(R.id.rb_A4262_2);
        rb_A4262_3 = findViewById(R.id.rb_A4262_3);
        rb_A4262_4 = findViewById(R.id.rb_A4262_4);
        rb_A4262_5 = findViewById(R.id.rb_A4262_5);
        rb_A4262_6 = findViewById(R.id.rb_A4262_6);
        rb_A4262_7 = findViewById(R.id.rb_A4262_7);
        rb_A4262_8 = findViewById(R.id.rb_A4262_8);
        rb_A4262_9 = findViewById(R.id.rb_A4262_9);
        rb_A4262_10 = findViewById(R.id.rb_A4262_10);
        rb_A4262_11 = findViewById(R.id.rb_A4262_11);
        rb_A4262_DK = findViewById(R.id.rb_A4262_DK);
        rb_A4263_1_1 = findViewById(R.id.rb_A4263_1_1);
        rb_A4263_1_2 = findViewById(R.id.rb_A4263_1_2);
        rb_A4263_1_DK = findViewById(R.id.rb_A4263_1_DK);
        rb_A4263_2_1 = findViewById(R.id.rb_A4263_2_1);
        rb_A4263_2_2 = findViewById(R.id.rb_A4263_2_2);
        rb_A4263_2_DK = findViewById(R.id.rb_A4263_2_DK);
        rb_A4264_1 = findViewById(R.id.rb_A4264_1);
        rb_A4264_2 = findViewById(R.id.rb_A4264_2);
        rb_A4266_1 = findViewById(R.id.rb_A4266_1);
        rb_A4266_2 = findViewById(R.id.rb_A4266_2);
        rb_A4266_3 = findViewById(R.id.rb_A4266_3);
        rb_A4266_4 = findViewById(R.id.rb_A4266_4);
        rb_A4266_5 = findViewById(R.id.rb_A4266_5);
        rb_A4266_6 = findViewById(R.id.rb_A4266_6);
        rb_A4266_7 = findViewById(R.id.rb_A4266_7);
        rb_A4266_8 = findViewById(R.id.rb_A4266_8);
        rb_A4266_9 = findViewById(R.id.rb_A4266_9);
        rb_A4266_10 = findViewById(R.id.rb_A4266_10);
        rb_A4266_11 = findViewById(R.id.rb_A4266_11);
        rb_A4266_DK = findViewById(R.id.rb_A4266_DK);
        rb_A4267_1_1 = findViewById(R.id.rb_A4267_1_1);
        rb_A4267_1_2 = findViewById(R.id.rb_A4267_1_2);
        rb_A4267_1_3 = findViewById(R.id.rb_A4267_1_3);
        rb_A4267_1_DK = findViewById(R.id.rb_A4267_1_DK);
        rb_A4267_2_1 = findViewById(R.id.rb_A4267_2_1);
        rb_A4267_2_2 = findViewById(R.id.rb_A4267_2_2);
        rb_A4267_2_3 = findViewById(R.id.rb_A4267_2_3);
        rb_A4267_2_DK = findViewById(R.id.rb_A4267_2_DK);
        rb_A4269_1 = findViewById(R.id.rb_A4269_1);
        rb_A4269_2 = findViewById(R.id.rb_A4269_2);
        rb_A4269_DK = findViewById(R.id.rb_A4269_DK);
        rb_A4270_1 = findViewById(R.id.rb_A4270_1);
        rb_A4270_2 = findViewById(R.id.rb_A4270_2);
        rb_A4270_DK = findViewById(R.id.rb_A4270_DK);
        rb_A4271_1 = findViewById(R.id.rb_A4271_1);
        rb_A4271_2 = findViewById(R.id.rb_A4271_2);
        rb_A4271_3 = findViewById(R.id.rb_A4271_3);
        rb_A4271_4 = findViewById(R.id.rb_A4271_4);
        rb_A4271_5 = findViewById(R.id.rb_A4271_5);
        rb_A4271_6 = findViewById(R.id.rb_A4271_6);
        rb_A4271_7 = findViewById(R.id.rb_A4271_7);
        rb_A4271_8 = findViewById(R.id.rb_A4271_8);
        rb_A4271_9 = findViewById(R.id.rb_A4271_9);
        rb_A4271_10 = findViewById(R.id.rb_A4271_10);
        rb_A4271_11 = findViewById(R.id.rb_A4271_11);
        rb_A4271_DK = findViewById(R.id.rb_A4271_DK);
        rb_A4272_1_1 = findViewById(R.id.rb_A4272_1_1);
        rb_A4272_1_2 = findViewById(R.id.rb_A4272_1_2);
        rb_A4272_1_DK = findViewById(R.id.rb_A4272_1_DK);
        rb_A4272_2_1 = findViewById(R.id.rb_A4272_2_1);
        rb_A4272_2_2 = findViewById(R.id.rb_A4272_2_2);
        rb_A4272_2_DK = findViewById(R.id.rb_A4272_2_DK);
        rb_A4273_1 = findViewById(R.id.rb_A4273_1);
        rb_A4273_2 = findViewById(R.id.rb_A4273_2);
        rb_A4274_1 = findViewById(R.id.rb_A4274_1);
        rb_A4274_2 = findViewById(R.id.rb_A4274_2);
        rb_A4274_DK = findViewById(R.id.rb_A4274_DK);
        rb_A4275_1_1 = findViewById(R.id.rb_A4275_1_1);
        rb_A4275_1_2 = findViewById(R.id.rb_A4275_1_2);
        rb_A4275_1_DK = findViewById(R.id.rb_A4275_1_DK);
        rb_A4275_2_1 = findViewById(R.id.rb_A4275_2_1);
        rb_A4275_2_2 = findViewById(R.id.rb_A4275_2_2);
        rb_A4275_2_DK = findViewById(R.id.rb_A4275_2_DK);
        rb_A4277_1 = findViewById(R.id.rb_A4277_1);
        rb_A4277_2 = findViewById(R.id.rb_A4277_2);
        rb_A4277_DK = findViewById(R.id.rb_A4277_DK);
        rb_A4280_1 = findViewById(R.id.rb_A4280_1);
        rb_A4280_2 = findViewById(R.id.rb_A4280_2);
        rb_A4280_DK = findViewById(R.id.rb_A4280_DK);
        rb_A4280_RA = findViewById(R.id.rb_A4280_RA);
        rb_A4281_1 = findViewById(R.id.rb_A4281_1);
        rb_A4281_2 = findViewById(R.id.rb_A4281_2);
        rb_A4281_DK = findViewById(R.id.rb_A4281_DK);
        rb_A4281_RA = findViewById(R.id.rb_A4281_RA);
        rb_A4282_1 = findViewById(R.id.rb_A4282_1);
        rb_A4282_2 = findViewById(R.id.rb_A4282_2);
        rb_A4282_DK = findViewById(R.id.rb_A4282_DK);
        rb_A4282_RA = findViewById(R.id.rb_A4282_RA);
        rb_A4283_1 = findViewById(R.id.rb_A4283_1);
        rb_A4283_2 = findViewById(R.id.rb_A4283_2);
        rb_A4283_DK = findViewById(R.id.rb_A4283_DK);
        rb_A4283_RA = findViewById(R.id.rb_A4283_RA);

        ed_A4253_3 = findViewById(R.id.ed_A4253_3);
        ed_A4255_4 = findViewById(R.id.ed_A4255_4);
        ed_A4255_13 = findViewById(R.id.ed_A4255_13);
        ed_A4256_minutes = findViewById(R.id.ed_A4256_minutes);
        ed_A4256_hours = findViewById(R.id.ed_A4256_hours);
        ed_A4256_days = findViewById(R.id.ed_A4256_days);
        ed_A4257_name = findViewById(R.id.ed_A4257_name);
        ed_A4259_hours = findViewById(R.id.ed_A4259_hours);
        ed_A4259_minutes = findViewById(R.id.ed_A4259_minutes);
        ed_A4262_name = findViewById(R.id.ed_A4262_name);
        ed_A4266_name = findViewById(R.id.ed_A4266_name);
        ed_A4268_hours = findViewById(R.id.ed_A4268_hours);
        ed_A4268_minutes = findViewById(R.id.ed_A4268_minutes);
        ed_A4271_name = findViewById(R.id.ed_A4271_name);
        ed_A4276_5 = findViewById(R.id.ed_A4276_5);
        ed_A4276_16 = findViewById(R.id.ed_A4276_16);
        ed_A4284_days = findViewById(R.id.ed_A4284_days);

        cb_A4255_1 = findViewById(R.id.cb_A4255_1);
        cb_A4255_2 = findViewById(R.id.cb_A4255_2);
        cb_A4255_3 = findViewById(R.id.cb_A4255_3);
        cb_A4255_4 = findViewById(R.id.cb_A4255_4);
        cb_A4255_5 = findViewById(R.id.cb_A4255_5);
        cb_A4255_6 = findViewById(R.id.cb_A4255_6);
        cb_A4255_7 = findViewById(R.id.cb_A4255_7);
        cb_A4255_8 = findViewById(R.id.cb_A4255_8);
        cb_A4255_9 = findViewById(R.id.cb_A4255_9);
        cb_A4255_10 = findViewById(R.id.cb_A4255_10);
        cb_A4255_11 = findViewById(R.id.cb_A4255_11);
        cb_A4255_12 = findViewById(R.id.cb_A4255_12);
        cb_A4255_13 = findViewById(R.id.cb_A4255_13);
        cb_A4255_DK = findViewById(R.id.cb_A4255_DK);
        cb_A4276_1 = findViewById(R.id.cb_A4276_1);
        cb_A4276_2 = findViewById(R.id.cb_A4276_2);
        cb_A4276_3 = findViewById(R.id.cb_A4276_3);
        cb_A4276_4 = findViewById(R.id.cb_A4276_4);
        cb_A4276_5 = findViewById(R.id.cb_A4276_5);
        cb_A4276_6 = findViewById(R.id.cb_A4276_6);
        cb_A4276_7 = findViewById(R.id.cb_A4276_7);
        cb_A4276_8 = findViewById(R.id.cb_A4276_8);
        cb_A4276_9 = findViewById(R.id.cb_A4276_9);
        cb_A4276_10 = findViewById(R.id.cb_A4276_10);
        cb_A4276_11 = findViewById(R.id.cb_A4276_11);
        cb_A4276_12 = findViewById(R.id.cb_A4276_12);
        cb_A4276_13 = findViewById(R.id.cb_A4276_13);
        cb_A4276_14 = findViewById(R.id.cb_A4276_14);
        cb_A4276_15 = findViewById(R.id.cb_A4276_15);
        cb_A4276_16 = findViewById(R.id.cb_A4276_16);
        cb_A4276_DK = findViewById(R.id.cb_A4276_DK);
        cb_A4278_1 = findViewById(R.id.cb_A4278_1);
        cb_A4278_2 = findViewById(R.id.cb_A4278_2);
        cb_A4278_3 = findViewById(R.id.cb_A4278_3);
        cb_A4278_4 = findViewById(R.id.cb_A4278_4);
        cb_A4278_5 = findViewById(R.id.cb_A4278_5);
        cb_A4278_6 = findViewById(R.id.cb_A4278_6);
        cb_A4278_7 = findViewById(R.id.cb_A4278_7);
        cb_A4278_DK = findViewById(R.id.cb_A4278_DK);
        cb_A4279_1 = findViewById(R.id.cb_A4279_1);
        cb_A4279_2 = findViewById(R.id.cb_A4279_2);
        cb_A4279_3 = findViewById(R.id.cb_A4279_3);
        cb_A4279_4 = findViewById(R.id.cb_A4279_4);
        cb_A4279_5 = findViewById(R.id.cb_A4279_5);
        cb_A4279_6 = findViewById(R.id.cb_A4279_6);
        cb_A4279_7 = findViewById(R.id.cb_A4279_7);
        cb_A4279_DK = findViewById(R.id.cb_A4279_DK);

    }

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.btn_next11) {
            if (validateField() == false) {
                Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
                return;
            }


            if (rb_A4251_1.isChecked() && phase.size() == 0) {
                Toast.makeText(this, "Please Attempt All", Toast.LENGTH_LONG).show();
                return;
            }

            value_assignment();
            insert_data();


            if (rb_A4251_1.isChecked() && phase.size() > 0) {
                insert_A4252();
            }


            DBHelper db = new DBHelper(this);
            Cursor res1 = db.getData("A4251_A4284", study_id);


            if (res1.getCount() > 0) {

                res1.moveToFirst();

                if (((Integer.valueOf(res1.getString(res1.getColumnIndex("A4254_1"))).equals(2)
                        || Integer.valueOf(res1.getString(res1.getColumnIndex("A4254_1"))).equals(9)
                        || Integer.valueOf(res1.getString(res1.getColumnIndex("A4254_2"))).equals(2)
                        || Integer.valueOf(res1.getString(res1.getColumnIndex("A4254_2"))).equals(9)

                )
                        && Integer.valueOf(res1.getString(res1.getColumnIndex("A4251"))).equals(2))
                    || ((!care.contains("4") || !care.contains("5") || !care.contains("6") || !care.contains("7")  ) && Integer.valueOf(res1.getString(res1.getColumnIndex("A4251"))).equals(1))){

                    Intent c = new Intent(this, A4351_A4364.class);
                    c.putExtra("study_id", study_id);
                    startActivity(c);

                } else {

                    Intent c = new Intent(A4251_A4284.this, A4301_A4315.class);
                    c.putExtra("study_id", study_id);
                    startActivity(c);

                }
            }

        }

        if (view.getId() == R.id.btn_addd) {

            if (phase.size() > 8) {
                Toast.makeText(A4251_A4284.this, "Cannot be more then 9 ", Toast.LENGTH_LONG).show();


                DBHelper db = new DBHelper(this);
                Cursor res = db.getData3("A4252_atributes", study_id);


                if (res.getCount() > 1) {


                    Toast.makeText(this, "" + res.getCount(), Toast.LENGTH_LONG).show();

                    res.moveToFirst();


                }

                return;
            }

            final AlertDialog b = new AlertDialog.Builder(this).create();

            LayoutInflater layoutInflater = getLayoutInflater();
            final View v = layoutInflater.inflate(R.layout.dialog_tt, null);
            b.setView(v);
            b.setCancelable(false);
            b.show();

            Button btnsbt = v.findViewById(R.id.btn_sbt);

            Button btnCancel = v.findViewById(R.id.btn_cncl);

            LinearLayout ll4_A4252 = v.findViewById(R.id.ll4_A4252);

            final LinearLayout ll5_A4252 = v.findViewById(R.id.ll5_A4252);
            final LinearLayout ll2_A4252 = v.findViewById(R.id.ll2_A4252);
            final LinearLayout ll3_A4252 = v.findViewById(R.id.ll3_A4252);


            final RadioButton

                    rb_A4252_1_1,
                    rb_A4252_1_2,
                    rb_A4252_1_3,
                    rb_A4252_2_1,
                    rb_A4252_2_2,
                    rb_A4252_2_3,
                    rb_A4252_2_4,
                    rb_A4252_2_5,
                    rb_A4252_2_6,
                    rb_A4252_2_7;

            rb_A4252_1_1 = v.findViewById(R.id.rb_A4252_1_1);
            rb_A4252_1_2 = v.findViewById(R.id.rb_A4252_1_2);
            rb_A4252_1_3 = v.findViewById(R.id.rb_A4252_1_3);
            rb_A4252_2_1 = v.findViewById(R.id.rb_A4252_2_1);
            rb_A4252_2_2 = v.findViewById(R.id.rb_A4252_2_2);
            rb_A4252_2_3 = v.findViewById(R.id.rb_A4252_2_3);
            rb_A4252_2_4 = v.findViewById(R.id.rb_A4252_2_4);
            rb_A4252_2_5 = v.findViewById(R.id.rb_A4252_2_5);
            rb_A4252_2_6 = v.findViewById(R.id.rb_A4252_2_6);
            rb_A4252_2_7 = v.findViewById(R.id.rb_A4252_2_7);

            final CheckBox cb_place = v.findViewById(R.id.cb_A4252_2_8);

            final EditText ed_symt = v.findViewById(R.id.ed_A4252);


            if (b_place_where == true) {

                ll4_A4252.setVisibility(View.GONE);
            }

            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // A4251_A4284.super.onBackPressed();


                    b.cancel();
                }
            });

            btnsbt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    /*if (rb_A4251_1.isChecked()) {
                        ClearAllcontrol(ll)
                    }*/


                    if (Gothrough.IamHiden(ll2_A4252) == false || Gothrough.IamHiden(ll3_A4252) == false || Gothrough.IamHiden(ll5_A4252) == false) {
                        Toast.makeText(A4251_A4284.this, "Select All", Toast.LENGTH_LONG).show();


                        return;
                    }


                    if (rb_A4252_1_1.isChecked()) {

                        if (Collections.frequency(phase, "1") > 2) {
                            Toast.makeText(A4251_A4284.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }
                        phase.add("1");

                    } else if (rb_A4252_1_2.isChecked()) {


                        if (Collections.frequency(phase, "2") > 2) {
                            Toast.makeText(A4251_A4284.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }

                        phase.add("2");
                    } else if (rb_A4252_1_3.isChecked()) {

                        if (Collections.frequency(phase, "3") > 2) {
                            Toast.makeText(A4251_A4284.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }

                        phase.add("3");
                    } else {
                        Toast.makeText(A4251_A4284.this, "Please Fill Question A4252 (Card)", Toast.LENGTH_LONG).show();

                        return;
                    }


                    if (rb_A4252_2_4.isChecked() || rb_A4252_2_5.isChecked() || rb_A4252_2_6.isChecked() || rb_A4252_2_7.isChecked()) {

                        check = check + 1;
                        Toast.makeText(getApplicationContext(), "" + check, Toast.LENGTH_LONG).show();
                    }

                    if (rb_A4252_2_1.isChecked()) {
                        care.add("1");
                    } else if (rb_A4252_2_2.isChecked()) {
                        care.add("2");
                    } else if (rb_A4252_2_3.isChecked()) {
                        care.add("3");
                    } else if (rb_A4252_2_4.isChecked()) {
                        care.add("4");
                    } else if (rb_A4252_2_5.isChecked()) {
                        care.add("5");
                    } else if (rb_A4252_2_6.isChecked()) {
                        care.add("6");
                    } else if (rb_A4252_2_7.isChecked()) {
                        care.add("7");
                    } else {
                        // toast

                        return;
                    }

                    if (cb_place.isChecked()) {
                        b_place_where = true;

                        place.add("1");
                        cb_place.setChecked(false);
                    } else {
                        place.add("0");
                    }

                    if (ed_symt.getText().toString().trim().length() > 0) {
                        symtomps.add(ed_symt.getText().toString().trim());
                    } else {
                        ed_symt.requestFocus();
                        ed_symt.setError("Enter Symtoms");
                        return;
                    }


                    A4252_start.setText("Start (" + Collections.frequency(phase, "1") + ")");
                    A4252_mid.setText("Mid (" + Collections.frequency(phase, "2") + ")");
                    A4252_End.setText("End (" + Collections.frequency(phase, "3") + ")");
                    btn_addd.setText("ADD  (" + phase.size() + ")");


                    /*List<String> careL = new ArrayList();


                    careL.add("4");
                    careL.add("5");
                    careL.add("6");
                    careL.add("7");
*/
                    if (care.contains("4") || care.contains("5") || care.contains("6") || care.contains("7")) {
                        ll_A4253.setVisibility(View.VISIBLE);
                        ll_A4254_2.setVisibility(View.VISIBLE);
                        ClearAllcontrol.ClearAll(ll_A4254_1);
                        ll_A4254_1.setVisibility(View.GONE);
                    } else {
                        ClearAllcontrol.ClearAll(ll_A4253);
                        ClearAllcontrol.ClearAll(ll_A4254_2);

                        ll_A4253.setVisibility(View.GONE);
                        ll_A4254_2.setVisibility(View.GONE);
                        ll_A4254_1.setVisibility(View.VISIBLE);
                    }

                    b.cancel();

                }

            });


        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        //A4251
        if (compoundButton.getId() == R.id.rb_A4251_1
                || compoundButton.getId() == R.id.rb_A4251_2
                || compoundButton.getId() == R.id.rb_A4251_DK) {


            phase.clear();
            care.clear();
            symtomps.clear();
            place.clear();
            check = 0;
            b_place_where = false;

            A4252_start.setText("Start");
            A4252_mid.setText("Mid");
            A4252_End.setText("End");
            btn_addd.setText("Add");


            if (rb_A4251_2.isChecked()) {



                ClearAllcontrol.ClearAll(ll_A4252);
                ClearAllcontrol.ClearAll(ll_A4253);
                ClearAllcontrol.ClearAll(ll_A4254_2);

                ll_A4252.setVisibility(View.GONE);
                ll_A4253.setVisibility(View.GONE);
                ll_A4254_2.setVisibility(View.GONE);

                ll_A4254_1.setVisibility(View.VISIBLE);
                ll_A4255.setVisibility(View.VISIBLE);
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4257.setVisibility(View.VISIBLE);
                ll_A4258_1.setVisibility(View.VISIBLE);
                ll_A4258_2.setVisibility(View.VISIBLE);
                ll_A4259.setVisibility(View.VISIBLE);
                ll_A4260.setVisibility(View.VISIBLE);
                ll_A4261.setVisibility(View.VISIBLE);
                ll_A4262.setVisibility(View.VISIBLE);
                ll_A4263_1.setVisibility(View.VISIBLE);
                ll_A4263_2.setVisibility(View.VISIBLE);
                ll_A4264.setVisibility(View.VISIBLE);
                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);

            } else if (rb_A4251_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4252);
                ClearAllcontrol.ClearAll(ll_A4253);
                ClearAllcontrol.ClearAll(ll_A4254_1);
                ClearAllcontrol.ClearAll(ll_A4254_2);
                ClearAllcontrol.ClearAll(ll_A4255);
                ClearAllcontrol.ClearAll(ll_A4256);
                ClearAllcontrol.ClearAll(ll_A4257);
                ClearAllcontrol.ClearAll(ll_A4258_1);
                ClearAllcontrol.ClearAll(ll_A4258_2);
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);
                ClearAllcontrol.ClearAll(ll_A4266);
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ClearAllcontrol.ClearAll(ll_A4268);
                ClearAllcontrol.ClearAll(ll_A4269);
                ClearAllcontrol.ClearAll(ll_A4270);
                ClearAllcontrol.ClearAll(ll_A4271);
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ClearAllcontrol.ClearAll(ll_A4273);
                ClearAllcontrol.ClearAll(ll_A4274);
                ClearAllcontrol.ClearAll(ll_A4275_1);
                ClearAllcontrol.ClearAll(ll_A4275_2);
                ClearAllcontrol.ClearAll(ll_A4276);
                ClearAllcontrol.ClearAll(ll_A4277);
                ClearAllcontrol.ClearAll(ll_A4278);
                ClearAllcontrol.ClearAll(ll_A4279);
                ClearAllcontrol.ClearAll(ll_A4280);
                ClearAllcontrol.ClearAll(ll_A4281);
                ClearAllcontrol.ClearAll(ll_A4282);
                ClearAllcontrol.ClearAll(ll_A4283);

                ll_A4252.setVisibility(View.GONE);
                ll_A4253.setVisibility(View.GONE);
                ll_A4254_1.setVisibility(View.GONE);
                ll_A4254_2.setVisibility(View.GONE);
                ll_A4255.setVisibility(View.GONE);
                ll_A4256.setVisibility(View.GONE);
                ll_A4257.setVisibility(View.GONE);
                ll_A4258_1.setVisibility(View.GONE);
                ll_A4258_2.setVisibility(View.GONE);
                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);
                ll_A4266.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4268.setVisibility(View.GONE);
                ll_A4269.setVisibility(View.GONE);
                ll_A4270.setVisibility(View.GONE);
                ll_A4271.setVisibility(View.GONE);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
                ll_A4273.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275_1.setVisibility(View.GONE);
                ll_A4275_2.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);
                ll_A4283.setVisibility(View.GONE);
            }
            else if (rb_A4251_1.isChecked())
                {
                    ll_A4252.setVisibility(View.VISIBLE);
                    ll_A4253.setVisibility(View.VISIBLE);
                    ll_A4254_1.setVisibility(View.VISIBLE);
                    ll_A4254_2.setVisibility(View.VISIBLE);
                    ll_A4255.setVisibility(View.VISIBLE);
                    ll_A4256.setVisibility(View.VISIBLE);
                    ll_A4257.setVisibility(View.VISIBLE);
                    ll_A4258_1.setVisibility(View.VISIBLE);
                    ll_A4258_2.setVisibility(View.VISIBLE);
                    ll_A4259.setVisibility(View.VISIBLE);
                    ll_A4260.setVisibility(View.VISIBLE);
                    ll_A4261.setVisibility(View.VISIBLE);
                    ll_A4262.setVisibility(View.VISIBLE);
                    ll_A4263_1.setVisibility(View.VISIBLE);
                    ll_A4263_2.setVisibility(View.VISIBLE);
                    ll_A4264.setVisibility(View.VISIBLE);
                    ll_A4266.setVisibility(View.VISIBLE);
                    ll_A4267_1.setVisibility(View.VISIBLE);
                    ll_A4267_2.setVisibility(View.VISIBLE);
                    ll_A4268.setVisibility(View.VISIBLE);
                    ll_A4269.setVisibility(View.VISIBLE);
                    ll_A4270.setVisibility(View.VISIBLE);
                    ll_A4271.setVisibility(View.VISIBLE);
                    ll_A4272_1.setVisibility(View.VISIBLE);
                    ll_A4272_2.setVisibility(View.VISIBLE);
                    ll_A4273.setVisibility(View.VISIBLE);
                    ll_A4274.setVisibility(View.VISIBLE);
                    ll_A4275_1.setVisibility(View.VISIBLE);
                    ll_A4275_2.setVisibility(View.VISIBLE);
                    ll_A4276.setVisibility(View.VISIBLE);
                    ll_A4277.setVisibility(View.VISIBLE);
                    ll_A4278.setVisibility(View.VISIBLE);
                    ll_A4279.setVisibility(View.VISIBLE);
                    ll_A4280.setVisibility(View.VISIBLE);
                    ll_A4281.setVisibility(View.VISIBLE);
                    ll_A4282.setVisibility(View.VISIBLE);
                    ll_A4283.setVisibility(View.VISIBLE);
                }
        }


        //A4253
        if (compoundButton.getId() == R.id.rb_A4253_1
                || compoundButton.getId() == R.id.rb_A4253_2
                || compoundButton.getId() == R.id.rb_A4253_3
                || compoundButton.getId() == R.id.rb_A4253_DK) {
            if (rb_A4253_3.isChecked()) {

                ed_A4253_3.setVisibility(View.VISIBLE);
            } else {
                ed_A4253_3.setText("");
                ed_A4253_3.setVisibility(View.GONE);
            }
        }


        //A4254_1
        if (compoundButton.getId() == R.id.rb_A4254_1_1
                || compoundButton.getId() == R.id.rb_A4254_1_2
                || compoundButton.getId() == R.id.rb_A4254_1_DK) {

            ClearAllcontrol.ClearAll(ll_A4254_2);
            ll_A4254_2.setVisibility(View.GONE);

            if (rb_A4254_1_2.isChecked() || rb_A4254_1_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4255);
                ll_A4255.setVisibility(View.GONE);
            } else {
                ll_A4255.setVisibility(View.VISIBLE);
            }

            if ((rb_A4254_1_2.isChecked() || rb_A4254_1_DK.isChecked()) && rb_A4251_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4255);
                ClearAllcontrol.ClearAll(ll_A4256);
                ClearAllcontrol.ClearAll(ll_A4257);
                ClearAllcontrol.ClearAll(ll_A4258_1);
                ClearAllcontrol.ClearAll(ll_A4258_2);
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);
                ClearAllcontrol.ClearAll(ll_A4266);
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ClearAllcontrol.ClearAll(ll_A4268);
                ClearAllcontrol.ClearAll(ll_A4269);
                ClearAllcontrol.ClearAll(ll_A4270);
                ClearAllcontrol.ClearAll(ll_A4271);
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ClearAllcontrol.ClearAll(ll_A4273);
                ClearAllcontrol.ClearAll(ll_A4274);
                ClearAllcontrol.ClearAll(ll_A4275_1);
                ClearAllcontrol.ClearAll(ll_A4275_2);
                ClearAllcontrol.ClearAll(ll_A4276);
                ClearAllcontrol.ClearAll(ll_A4277);
                ClearAllcontrol.ClearAll(ll_A4278);
                ClearAllcontrol.ClearAll(ll_A4279);
                ClearAllcontrol.ClearAll(ll_A4280);
                ClearAllcontrol.ClearAll(ll_A4281);
                ClearAllcontrol.ClearAll(ll_A4282);
                ClearAllcontrol.ClearAll(ll_A4283);
                ClearAllcontrol.ClearAll(ll_A4284);

                ll_A4255.setVisibility(View.GONE);
                ll_A4256.setVisibility(View.GONE);
                ll_A4257.setVisibility(View.GONE);
                ll_A4258_1.setVisibility(View.GONE);
                ll_A4258_2.setVisibility(View.GONE);
                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);
                ll_A4266.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4268.setVisibility(View.GONE);
                ll_A4269.setVisibility(View.GONE);
                ll_A4270.setVisibility(View.GONE);
                ll_A4271.setVisibility(View.GONE);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
                ll_A4273.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275_1.setVisibility(View.GONE);
                ll_A4275_2.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);
                ll_A4283.setVisibility(View.GONE);
                ll_A4284.setVisibility(View.GONE);
            } else {
                ll_A4255.setVisibility(View.VISIBLE);
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4257.setVisibility(View.VISIBLE);
                ll_A4258_1.setVisibility(View.VISIBLE);
                ll_A4258_2.setVisibility(View.VISIBLE);
                ll_A4259.setVisibility(View.VISIBLE);
                ll_A4260.setVisibility(View.VISIBLE);
                ll_A4261.setVisibility(View.VISIBLE);
                ll_A4262.setVisibility(View.VISIBLE);
                ll_A4263_1.setVisibility(View.VISIBLE);
                ll_A4263_2.setVisibility(View.VISIBLE);
                ll_A4264.setVisibility(View.VISIBLE);
                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);
                ll_A4284.setVisibility(View.VISIBLE);
            }
        }


        //A4254_2
        if (compoundButton.getId() == R.id.rb_A4254_2_1
                || compoundButton.getId() == R.id.rb_A4254_2_2
                || compoundButton.getId() == R.id.rb_A4254_2_DK) {

            if (rb_A4254_2_2.isChecked() || rb_A4254_2_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4255);
                ll_A4255.setVisibility(View.GONE);
            } else {
                ll_A4255.setVisibility(View.VISIBLE);
            }

            if ((rb_A4254_2_2.isChecked() || rb_A4254_2_DK.isChecked()) && rb_A4251_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4256);
                ClearAllcontrol.ClearAll(ll_A4257);
                ClearAllcontrol.ClearAll(ll_A4258_1);
                ClearAllcontrol.ClearAll(ll_A4258_2);
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);
                ClearAllcontrol.ClearAll(ll_A4266);
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ClearAllcontrol.ClearAll(ll_A4268);
                ClearAllcontrol.ClearAll(ll_A4269);
                ClearAllcontrol.ClearAll(ll_A4270);
                ClearAllcontrol.ClearAll(ll_A4271);
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ClearAllcontrol.ClearAll(ll_A4273);
                ClearAllcontrol.ClearAll(ll_A4274);
                ClearAllcontrol.ClearAll(ll_A4275_1);
                ClearAllcontrol.ClearAll(ll_A4275_2);
                ClearAllcontrol.ClearAll(ll_A4276);
                ClearAllcontrol.ClearAll(ll_A4277);
                ClearAllcontrol.ClearAll(ll_A4278);
                ClearAllcontrol.ClearAll(ll_A4279);
                ClearAllcontrol.ClearAll(ll_A4280);
                ClearAllcontrol.ClearAll(ll_A4281);
                ClearAllcontrol.ClearAll(ll_A4282);
                ClearAllcontrol.ClearAll(ll_A4283);
                ClearAllcontrol.ClearAll(ll_A4284);

                ll_A4256.setVisibility(View.GONE);
                ll_A4257.setVisibility(View.GONE);
                ll_A4258_1.setVisibility(View.GONE);
                ll_A4258_2.setVisibility(View.GONE);
                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);
                ll_A4266.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4268.setVisibility(View.GONE);
                ll_A4269.setVisibility(View.GONE);
                ll_A4270.setVisibility(View.GONE);
                ll_A4271.setVisibility(View.GONE);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
                ll_A4273.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275_1.setVisibility(View.GONE);
                ll_A4275_2.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);
                ll_A4283.setVisibility(View.GONE);
                ll_A4284.setVisibility(View.GONE);
            } else {
                ll_A4256.setVisibility(View.VISIBLE);
                ll_A4257.setVisibility(View.VISIBLE);
                ll_A4258_1.setVisibility(View.VISIBLE);
                ll_A4258_2.setVisibility(View.VISIBLE);
                ll_A4259.setVisibility(View.VISIBLE);
                ll_A4260.setVisibility(View.VISIBLE);
                ll_A4261.setVisibility(View.VISIBLE);
                ll_A4262.setVisibility(View.VISIBLE);
                ll_A4263_1.setVisibility(View.VISIBLE);
                ll_A4263_2.setVisibility(View.VISIBLE);
                ll_A4264.setVisibility(View.VISIBLE);
                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
                ll_A4283.setVisibility(View.VISIBLE);
                ll_A4284.setVisibility(View.VISIBLE);
            }

        }


        //A4255  
        if (compoundButton.getId() == R.id.cb_A4255_1
                || compoundButton.getId() == R.id.cb_A4255_2
                || compoundButton.getId() == R.id.cb_A4255_3
                || compoundButton.getId() == R.id.cb_A4255_4
                || compoundButton.getId() == R.id.cb_A4255_5
                || compoundButton.getId() == R.id.cb_A4255_6
                || compoundButton.getId() == R.id.cb_A4255_7
                || compoundButton.getId() == R.id.cb_A4255_8
                || compoundButton.getId() == R.id.cb_A4255_9
                || compoundButton.getId() == R.id.cb_A4255_10
                || compoundButton.getId() == R.id.cb_A4255_11
                || compoundButton.getId() == R.id.cb_A4255_12
                || compoundButton.getId() == R.id.cb_A4255_13
                || compoundButton.getId() == R.id.cb_A4255_DK) {


            if (cb_A4255_4.isChecked()) {

                ed_A4255_4.setVisibility(View.VISIBLE);
            } else {
                ed_A4255_4.setText("");
                ed_A4255_4.setVisibility(View.GONE);
            }

            if (cb_A4255_13.isChecked()) {

                ed_A4255_13.setVisibility(View.VISIBLE);
            } else {
                ed_A4255_13.setText("");
                ed_A4255_13.setVisibility(View.GONE);
            }

            if (cb_A4255_DK.isChecked()) {

                cb_A4255_1.setChecked(false);
                cb_A4255_2.setChecked(false);
                cb_A4255_3.setChecked(false);
                cb_A4255_4.setChecked(false);
                cb_A4255_5.setChecked(false);
                cb_A4255_6.setChecked(false);
                cb_A4255_7.setChecked(false);
                cb_A4255_8.setChecked(false);
                cb_A4255_9.setChecked(false);
                cb_A4255_10.setChecked(false);
                cb_A4255_11.setChecked(false);
                cb_A4255_12.setChecked(false);
                cb_A4255_13.setChecked(false);

                ed_A4255_4.setText("");
                ed_A4255_4.setVisibility(View.GONE);

                ed_A4255_13.setText("");
                ed_A4255_13.setVisibility(View.GONE);

            } else {

                cb_A4255_DK.setChecked(false);
            }

            if ((cb_A4255_1.isChecked() || cb_A4255_2.isChecked() || cb_A4255_3.isChecked()
                    || cb_A4255_4.isChecked() || cb_A4255_5.isChecked() || cb_A4255_6.isChecked() || cb_A4255_7.isChecked()
                    || cb_A4255_8.isChecked() || cb_A4255_9.isChecked() || cb_A4255_10.isChecked() || cb_A4255_11.isChecked()
                    || cb_A4255_12.isChecked() || cb_A4255_13.isChecked() || cb_A4255_DK.isChecked())
                    && !(care.contains("4") || care.contains("5") || care.contains("6") || care.contains("7")))
            {
                ClearAllcontrol.ClearAll(ll_A4256);
                ClearAllcontrol.ClearAll(ll_A4257);
                ClearAllcontrol.ClearAll(ll_A4258_1);
                ClearAllcontrol.ClearAll(ll_A4258_2);
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);
                ClearAllcontrol.ClearAll(ll_A4266);
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ClearAllcontrol.ClearAll(ll_A4268);
                ClearAllcontrol.ClearAll(ll_A4269);
                ClearAllcontrol.ClearAll(ll_A4270);
                ClearAllcontrol.ClearAll(ll_A4271);
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ClearAllcontrol.ClearAll(ll_A4273);
                ClearAllcontrol.ClearAll(ll_A4274);
                ClearAllcontrol.ClearAll(ll_A4275_1);
                ClearAllcontrol.ClearAll(ll_A4275_2);
                ClearAllcontrol.ClearAll(ll_A4276);
                ClearAllcontrol.ClearAll(ll_A4277);
                ClearAllcontrol.ClearAll(ll_A4278);
                ClearAllcontrol.ClearAll(ll_A4279);
                ClearAllcontrol.ClearAll(ll_A4280);
                ClearAllcontrol.ClearAll(ll_A4281);
                ClearAllcontrol.ClearAll(ll_A4282);

                ll_A4256.setVisibility(View.GONE);
                ll_A4257.setVisibility(View.GONE);
                ll_A4258_1.setVisibility(View.GONE);
                ll_A4258_2.setVisibility(View.GONE);
                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);
                ll_A4266.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4268.setVisibility(View.GONE);
                ll_A4269.setVisibility(View.GONE);
                ll_A4270.setVisibility(View.GONE);
                ll_A4271.setVisibility(View.GONE);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
                ll_A4273.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275_1.setVisibility(View.GONE);
                ll_A4275_2.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);
            }
            else
                {
                    ll_A4256.setVisibility(View.VISIBLE);
                    ll_A4257.setVisibility(View.VISIBLE);
                    ll_A4258_1.setVisibility(View.VISIBLE);
                    ll_A4258_2.setVisibility(View.VISIBLE);
                    ll_A4259.setVisibility(View.VISIBLE);
                    ll_A4260.setVisibility(View.VISIBLE);
                    ll_A4261.setVisibility(View.VISIBLE);
                    ll_A4262.setVisibility(View.VISIBLE);
                    ll_A4263_1.setVisibility(View.VISIBLE);
                    ll_A4263_2.setVisibility(View.VISIBLE);
                    ll_A4264.setVisibility(View.VISIBLE);
                    ll_A4266.setVisibility(View.VISIBLE);
                    ll_A4267_1.setVisibility(View.VISIBLE);
                    ll_A4267_2.setVisibility(View.VISIBLE);
                    ll_A4268.setVisibility(View.VISIBLE);
                    ll_A4269.setVisibility(View.VISIBLE);
                    ll_A4270.setVisibility(View.VISIBLE);
                    ll_A4271.setVisibility(View.VISIBLE);
                    ll_A4272_1.setVisibility(View.VISIBLE);
                    ll_A4272_2.setVisibility(View.VISIBLE);
                    ll_A4273.setVisibility(View.VISIBLE);
                    ll_A4274.setVisibility(View.VISIBLE);
                    ll_A4275_1.setVisibility(View.VISIBLE);
                    ll_A4275_2.setVisibility(View.VISIBLE);
                    ll_A4276.setVisibility(View.VISIBLE);
                    ll_A4277.setVisibility(View.VISIBLE);
                    ll_A4278.setVisibility(View.VISIBLE);
                    ll_A4279.setVisibility(View.VISIBLE);
                    ll_A4280.setVisibility(View.VISIBLE);
                    ll_A4281.setVisibility(View.VISIBLE);
                    ll_A4282.setVisibility(View.VISIBLE);
                }

        }


        //A4257  
        if (compoundButton.getId() == R.id.rb_A4257_1
                || compoundButton.getId() == R.id.rb_A4257_2
                || compoundButton.getId() == R.id.rb_A4257_3
                || compoundButton.getId() == R.id.rb_A4257_4
                || compoundButton.getId() == R.id.rb_A4257_5
                || compoundButton.getId() == R.id.rb_A4257_6
                || compoundButton.getId() == R.id.rb_A4257_7
                || compoundButton.getId() == R.id.rb_A4257_8
                || compoundButton.getId() == R.id.rb_A4257_9
                || compoundButton.getId() == R.id.rb_A4257_10
                || compoundButton.getId() == R.id.rb_A4257_11
                || compoundButton.getId() == R.id.rb_A4257_DK)
        {

            if (rb_A4257_5.isChecked() || rb_A4257_10.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4258_1);
                ll_A4258_1.setVisibility(View.GONE);
                ll_A4258_2.setVisibility(View.VISIBLE);
            } else {
                ClearAllcontrol.ClearAll(ll_A4258_2);
                ll_A4258_2.setVisibility(View.GONE);
                ll_A4258_1.setVisibility(View.VISIBLE);
            }
        }



        //A4258_1
        if (compoundButton.getId() == R.id.rb_A4258_1_1
                || compoundButton.getId() == R.id.rb_A4258_1_2
                || compoundButton.getId() == R.id.rb_A4258_1_3
                || compoundButton.getId() == R.id.rb_A4258_1_DK) {

                ClearAllcontrol.ClearAll(ll_A4258_2);
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);
                ClearAllcontrol.ClearAll(ll_A4266);
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ClearAllcontrol.ClearAll(ll_A4268);
                ClearAllcontrol.ClearAll(ll_A4269);
                ClearAllcontrol.ClearAll(ll_A4270);
                ClearAllcontrol.ClearAll(ll_A4271);
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ClearAllcontrol.ClearAll(ll_A4273);
                ClearAllcontrol.ClearAll(ll_A4274);
                ClearAllcontrol.ClearAll(ll_A4275_1);
                ClearAllcontrol.ClearAll(ll_A4275_2);
                ClearAllcontrol.ClearAll(ll_A4276);
                ClearAllcontrol.ClearAll(ll_A4277);
                ClearAllcontrol.ClearAll(ll_A4278);
                ClearAllcontrol.ClearAll(ll_A4279);
                ClearAllcontrol.ClearAll(ll_A4280);
                ClearAllcontrol.ClearAll(ll_A4281);
                ClearAllcontrol.ClearAll(ll_A4282);

                ll_A4258_2.setVisibility(View.GONE);
                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);
                ll_A4266.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4268.setVisibility(View.GONE);
                ll_A4269.setVisibility(View.GONE);
                ll_A4270.setVisibility(View.GONE);
                ll_A4271.setVisibility(View.GONE);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
                ll_A4273.setVisibility(View.GONE);
                ll_A4274.setVisibility(View.GONE);
                ll_A4275_1.setVisibility(View.GONE);
                ll_A4275_2.setVisibility(View.GONE);
                ll_A4276.setVisibility(View.GONE);
                ll_A4277.setVisibility(View.GONE);
                ll_A4278.setVisibility(View.GONE);
                ll_A4279.setVisibility(View.GONE);
                ll_A4280.setVisibility(View.GONE);
                ll_A4281.setVisibility(View.GONE);
                ll_A4282.setVisibility(View.GONE);

                if (rb_A4258_1_1.isChecked())
                {
                    ll_A4259.setVisibility(View.VISIBLE);
                    ll_A4260.setVisibility(View.VISIBLE);
                    ll_A4261.setVisibility(View.VISIBLE);
                    ll_A4262.setVisibility(View.VISIBLE);
                    ll_A4263_1.setVisibility(View.VISIBLE);
                    ll_A4263_2.setVisibility(View.VISIBLE);
                    ll_A4264.setVisibility(View.VISIBLE);
                    ll_A4266.setVisibility(View.VISIBLE);
                    ll_A4267_1.setVisibility(View.VISIBLE);
                    ll_A4267_2.setVisibility(View.VISIBLE);
                    ll_A4268.setVisibility(View.VISIBLE);
                    ll_A4269.setVisibility(View.VISIBLE);
                    ll_A4270.setVisibility(View.VISIBLE);
                    ll_A4271.setVisibility(View.VISIBLE);
                    ll_A4272_1.setVisibility(View.VISIBLE);
                    ll_A4272_2.setVisibility(View.VISIBLE);
                    ll_A4273.setVisibility(View.VISIBLE);
                    ll_A4274.setVisibility(View.VISIBLE);
                    ll_A4275_1.setVisibility(View.VISIBLE);
                    ll_A4275_2.setVisibility(View.VISIBLE);
                    ll_A4276.setVisibility(View.VISIBLE);
                    ll_A4277.setVisibility(View.VISIBLE);
                    ll_A4278.setVisibility(View.VISIBLE);
                    ll_A4279.setVisibility(View.VISIBLE);
                    ll_A4280.setVisibility(View.VISIBLE);
                    ll_A4281.setVisibility(View.VISIBLE);
                    ll_A4282.setVisibility(View.VISIBLE);
                }
                /**/



            else if (rb_A4258_1_3.isChecked() || rb_A4258_1_DK.isChecked())
            {
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);

                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);

                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);

            if (check < 2)
            {
                ClearAllcontrol.ClearAll(ll_A4266);
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ClearAllcontrol.ClearAll(ll_A4268);
                ClearAllcontrol.ClearAll(ll_A4269);
                ClearAllcontrol.ClearAll(ll_A4270);
                ClearAllcontrol.ClearAll(ll_A4271);
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ClearAllcontrol.ClearAll(ll_A4273);

                ll_A4266.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4268.setVisibility(View.GONE);
                ll_A4269.setVisibility(View.GONE);
                ll_A4270.setVisibility(View.GONE);
                ll_A4271.setVisibility(View.GONE);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
                ll_A4273.setVisibility(View.GONE);

                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
            }
            }


        }


        //A4258_2
        if (compoundButton.getId() == R.id.rb_A4258_2_1
                || compoundButton.getId() == R.id.rb_A4258_2_2
                || compoundButton.getId() == R.id.rb_A4258_2_3
                || compoundButton.getId() == R.id.rb_A4258_2_DK) {

            ClearAllcontrol.ClearAll(ll_A4258_1);
            ClearAllcontrol.ClearAll(ll_A4259);
            ClearAllcontrol.ClearAll(ll_A4260);
            ClearAllcontrol.ClearAll(ll_A4261);
            ClearAllcontrol.ClearAll(ll_A4262);
            ClearAllcontrol.ClearAll(ll_A4263_1);
            ClearAllcontrol.ClearAll(ll_A4263_2);
            ClearAllcontrol.ClearAll(ll_A4264);
            ClearAllcontrol.ClearAll(ll_A4266);
            ClearAllcontrol.ClearAll(ll_A4267_1);
            ClearAllcontrol.ClearAll(ll_A4267_2);
            ClearAllcontrol.ClearAll(ll_A4268);
            ClearAllcontrol.ClearAll(ll_A4269);
            ClearAllcontrol.ClearAll(ll_A4270);
            ClearAllcontrol.ClearAll(ll_A4271);
            ClearAllcontrol.ClearAll(ll_A4272_1);
            ClearAllcontrol.ClearAll(ll_A4272_2);
            ClearAllcontrol.ClearAll(ll_A4273);
            ClearAllcontrol.ClearAll(ll_A4274);
            ClearAllcontrol.ClearAll(ll_A4275_1);
            ClearAllcontrol.ClearAll(ll_A4275_2);
            ClearAllcontrol.ClearAll(ll_A4276);
            ClearAllcontrol.ClearAll(ll_A4277);
            ClearAllcontrol.ClearAll(ll_A4278);
            ClearAllcontrol.ClearAll(ll_A4279);
            ClearAllcontrol.ClearAll(ll_A4280);
            ClearAllcontrol.ClearAll(ll_A4281);
            ClearAllcontrol.ClearAll(ll_A4282);

            ll_A4258_1.setVisibility(View.GONE);
            ll_A4259.setVisibility(View.GONE);
            ll_A4260.setVisibility(View.GONE);
            ll_A4261.setVisibility(View.GONE);
            ll_A4262.setVisibility(View.GONE);
            ll_A4263_1.setVisibility(View.GONE);
            ll_A4263_2.setVisibility(View.GONE);
            ll_A4264.setVisibility(View.GONE);
            ll_A4266.setVisibility(View.GONE);
            ll_A4267_1.setVisibility(View.GONE);
            ll_A4267_2.setVisibility(View.GONE);
            ll_A4268.setVisibility(View.GONE);
            ll_A4269.setVisibility(View.GONE);
            ll_A4270.setVisibility(View.GONE);
            ll_A4271.setVisibility(View.GONE);
            ll_A4272_1.setVisibility(View.GONE);
            ll_A4272_2.setVisibility(View.GONE);
            ll_A4273.setVisibility(View.GONE);
            ll_A4274.setVisibility(View.GONE);
            ll_A4275_1.setVisibility(View.GONE);
            ll_A4275_2.setVisibility(View.GONE);
            ll_A4276.setVisibility(View.GONE);
            ll_A4277.setVisibility(View.GONE);
            ll_A4278.setVisibility(View.GONE);
            ll_A4279.setVisibility(View.GONE);
            ll_A4280.setVisibility(View.GONE);
            ll_A4281.setVisibility(View.GONE);
            ll_A4282.setVisibility(View.GONE);

            if (rb_A4258_2_1.isChecked())
            {
                ll_A4259.setVisibility(View.VISIBLE);
                ll_A4260.setVisibility(View.VISIBLE);
                ll_A4261.setVisibility(View.VISIBLE);
                ll_A4262.setVisibility(View.VISIBLE);
                ll_A4263_1.setVisibility(View.VISIBLE);
                ll_A4263_2.setVisibility(View.VISIBLE);
                ll_A4264.setVisibility(View.VISIBLE);
                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);
            }
            /**/



            else if (rb_A4258_2_3.isChecked() || rb_A4258_2_DK.isChecked())
            {
                ClearAllcontrol.ClearAll(ll_A4259);
                ClearAllcontrol.ClearAll(ll_A4260);
                ClearAllcontrol.ClearAll(ll_A4261);
                ClearAllcontrol.ClearAll(ll_A4262);
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ClearAllcontrol.ClearAll(ll_A4264);

                ll_A4259.setVisibility(View.GONE);
                ll_A4260.setVisibility(View.GONE);
                ll_A4261.setVisibility(View.GONE);
                ll_A4262.setVisibility(View.GONE);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
                ll_A4264.setVisibility(View.GONE);

                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);

                if (check < 2)
                {
                    ClearAllcontrol.ClearAll(ll_A4266);
                    ClearAllcontrol.ClearAll(ll_A4267_1);
                    ClearAllcontrol.ClearAll(ll_A4267_2);
                    ClearAllcontrol.ClearAll(ll_A4268);
                    ClearAllcontrol.ClearAll(ll_A4269);
                    ClearAllcontrol.ClearAll(ll_A4270);
                    ClearAllcontrol.ClearAll(ll_A4271);
                    ClearAllcontrol.ClearAll(ll_A4272_1);
                    ClearAllcontrol.ClearAll(ll_A4272_2);
                    ClearAllcontrol.ClearAll(ll_A4273);

                    ll_A4266.setVisibility(View.GONE);
                    ll_A4267_1.setVisibility(View.GONE);
                    ll_A4267_2.setVisibility(View.GONE);
                    ll_A4268.setVisibility(View.GONE);
                    ll_A4269.setVisibility(View.GONE);
                    ll_A4270.setVisibility(View.GONE);
                    ll_A4271.setVisibility(View.GONE);
                    ll_A4272_1.setVisibility(View.GONE);
                    ll_A4272_2.setVisibility(View.GONE);
                    ll_A4273.setVisibility(View.GONE);

                    ll_A4274.setVisibility(View.VISIBLE);
                    ll_A4275_1.setVisibility(View.VISIBLE);
                    ll_A4275_2.setVisibility(View.VISIBLE);
                    ll_A4276.setVisibility(View.VISIBLE);
                    ll_A4277.setVisibility(View.VISIBLE);
                    ll_A4278.setVisibility(View.VISIBLE);
                    ll_A4279.setVisibility(View.VISIBLE);
                    ll_A4280.setVisibility(View.VISIBLE);
                    ll_A4281.setVisibility(View.VISIBLE);
                    ll_A4282.setVisibility(View.VISIBLE);
                }}


        }
        
        
        //A4261  
        if (compoundButton.getId() == R.id.rb_A4261_1
                || compoundButton.getId() == R.id.rb_A4261_2
                || compoundButton.getId() == R.id.rb_A4261_DK)
        
        {
            if (rb_A4261_2.isChecked() || rb_A4261_DK.isChecked()) {
                
                ClearAllcontrol.ClearAll(ll_A4262);
                ll_A4262.setVisibility(View.GONE);
            } 
            else 
                {
                    ll_A4262.setVisibility(View.VISIBLE); 
                }

            
                if (rb_A4261_1.isChecked()) 
                { 
                    ll_A4275_2.setVisibility(View.VISIBLE);
                    
                    ClearAllcontrol.ClearAll(ll_A4275_1);
                    ll_A4275_1.setVisibility(View.GONE); 
                } 
                else 
                    { 
                        ll_A4272_2.setVisibility(View.VISIBLE);
                        
                        ClearAllcontrol.ClearAll(ll_A4272_1);
                        ll_A4275_1.setVisibility(View.GONE); 
                    }
        }


        //A4262  
        if (compoundButton.getId() == R.id.rb_A4262_1
                || compoundButton.getId() == R.id.rb_A4262_2
                || compoundButton.getId() == R.id.rb_A4262_3
                || compoundButton.getId() == R.id.rb_A4262_4
                || compoundButton.getId() == R.id.rb_A4262_5
                || compoundButton.getId() == R.id.rb_A4262_6
                || compoundButton.getId() == R.id.rb_A4262_7
                || compoundButton.getId() == R.id.rb_A4262_8
                || compoundButton.getId() == R.id.rb_A4262_9
                || compoundButton.getId() == R.id.rb_A4262_10
                || compoundButton.getId() == R.id.rb_A4262_11
                || compoundButton.getId() == R.id.rb_A4262_DK)
        {
            if (rb_A4262_1.isChecked() || rb_A4262_2.isChecked() || rb_A4262_3.isChecked() || rb_A4262_4.isChecked() || rb_A4262_5.isChecked()
                    || rb_A4262_6.isChecked() || rb_A4262_7.isChecked() || rb_A4262_8.isChecked() || rb_A4262_9.isChecked()
                    || rb_A4262_10.isChecked() || rb_A4262_11.isChecked() || rb_A4262_DK.isChecked())
            {
                ClearAllcontrol.ClearAll(ll_A4263_1);
                ClearAllcontrol.ClearAll(ll_A4263_2);
                ll_A4263_1.setVisibility(View.GONE);
                ll_A4263_2.setVisibility(View.GONE);
            }
            else
                {
                    ll_A4263_1.setVisibility(View.VISIBLE);
                    ll_A4263_2.setVisibility(View.VISIBLE);
                }
        }
        
        
        //A4264
        if (compoundButton.getId() == R.id.rb_A4264_1
                || compoundButton.getId() == R.id.rb_A4264_2)

        {
            if (rb_A4264_1.isChecked() && check > 1)
            {
                ll_A4266.setVisibility(View.VISIBLE);
                ll_A4267_1.setVisibility(View.VISIBLE);
                ll_A4267_2.setVisibility(View.VISIBLE);
                ll_A4268.setVisibility(View.VISIBLE);
                ll_A4269.setVisibility(View.VISIBLE);
                ll_A4270.setVisibility(View.VISIBLE);
                ll_A4271.setVisibility(View.VISIBLE);
                ll_A4272_1.setVisibility(View.VISIBLE);
                ll_A4272_2.setVisibility(View.VISIBLE);
                ll_A4273.setVisibility(View.VISIBLE);
            }
            else
                {
                    ClearAllcontrol.ClearAll(ll_A4266);
                    ClearAllcontrol.ClearAll(ll_A4267_1);
                    ClearAllcontrol.ClearAll(ll_A4267_2);
                    ClearAllcontrol.ClearAll(ll_A4268);
                    ClearAllcontrol.ClearAll(ll_A4269);
                    ClearAllcontrol.ClearAll(ll_A4270);
                    ClearAllcontrol.ClearAll(ll_A4271);
                    ClearAllcontrol.ClearAll(ll_A4272_1);
                    ClearAllcontrol.ClearAll(ll_A4272_2);
                    ClearAllcontrol.ClearAll(ll_A4273);

                    ll_A4266.setVisibility(View.GONE);
                    ll_A4267_1.setVisibility(View.GONE);
                    ll_A4267_2.setVisibility(View.GONE);
                    ll_A4268.setVisibility(View.GONE);
                    ll_A4269.setVisibility(View.GONE);
                    ll_A4270.setVisibility(View.GONE);
                    ll_A4271.setVisibility(View.GONE);
                    ll_A4272_1.setVisibility(View.GONE);
                    ll_A4272_2.setVisibility(View.GONE);
                    ll_A4273.setVisibility(View.GONE);
                }



        //A4264_2
        if (rb_A4264_2.isChecked() && (rb_A4261_1.isChecked() || rb_A4270_1.isChecked())) {

            ll_A4274.setVisibility(View.VISIBLE);
            ll_A4275_1.setVisibility(View.VISIBLE);
            ll_A4275_2.setVisibility(View.VISIBLE);
            ll_A4276.setVisibility(View.VISIBLE);
        }

        else
        {
            ClearAllcontrol.ClearAll(ll_A4274);
            ClearAllcontrol.ClearAll(ll_A4275_1);
            ClearAllcontrol.ClearAll(ll_A4275_2);
            ClearAllcontrol.ClearAll(ll_A4276);

            ll_A4274.setVisibility(View.GONE);
            ll_A4275_1.setVisibility(View.GONE);
            ll_A4275_2.setVisibility(View.GONE);
            ll_A4276.setVisibility(View.GONE);

            if (rb_A4257_1.isChecked() || rb_A4257_2.isChecked() || rb_A4257_3.isChecked() || rb_A4257_4.isChecked()
                    || rb_A4257_6.isChecked() || rb_A4257_7.isChecked() || rb_A4257_8.isChecked() || rb_A4257_9.isChecked()
                    || rb_A4262_1.isChecked() || rb_A4262_2.isChecked() || rb_A4262_3.isChecked() || rb_A4262_4.isChecked()
                    || rb_A4262_6.isChecked() || rb_A4262_7.isChecked() || rb_A4262_8.isChecked() || rb_A4262_9.isChecked()
                    || rb_A4266_1.isChecked() || rb_A4266_2.isChecked() || rb_A4266_3.isChecked() || rb_A4266_4.isChecked()
                    || rb_A4266_6.isChecked() || rb_A4266_7.isChecked() || rb_A4266_8.isChecked() || rb_A4266_9.isChecked()
                    || rb_A4271_1.isChecked() || rb_A4271_2.isChecked() || rb_A4271_3.isChecked() || rb_A4271_4.isChecked()
                    || rb_A4271_6.isChecked() || rb_A4271_7.isChecked() || rb_A4271_8.isChecked() || rb_A4271_9.isChecked())

            {
                ll_A4277.setVisibility(View.VISIBLE);
                ll_A4278.setVisibility(View.VISIBLE);
                ll_A4279.setVisibility(View.VISIBLE);
                ll_A4280.setVisibility(View.VISIBLE);
                ll_A4281.setVisibility(View.VISIBLE);
                ll_A4282.setVisibility(View.VISIBLE);

            }
            else
                {
                    ClearAllcontrol.ClearAll(ll_A4277);
                    ClearAllcontrol.ClearAll(ll_A4278);
                    ClearAllcontrol.ClearAll(ll_A4279);
                    ClearAllcontrol.ClearAll(ll_A4280);
                    ClearAllcontrol.ClearAll(ll_A4281);
                    ClearAllcontrol.ClearAll(ll_A4282);

                    ll_A4277.setVisibility(View.GONE);
                    ll_A4278.setVisibility(View.GONE);
                    ll_A4279.setVisibility(View.GONE);
                    ll_A4280.setVisibility(View.GONE);
                    ll_A4281.setVisibility(View.GONE);
                    ll_A4282.setVisibility(View.GONE);
                }
        }

        }



        //A4266
        if (compoundButton.getId() == R.id.rb_A4266_1
                || compoundButton.getId() == R.id.rb_A4266_2
                || compoundButton.getId() == R.id.rb_A4266_3
                || compoundButton.getId() == R.id.rb_A4266_4
                || compoundButton.getId() == R.id.rb_A4266_5
                || compoundButton.getId() == R.id.rb_A4266_6
                || compoundButton.getId() == R.id.rb_A4266_7
                || compoundButton.getId() == R.id.rb_A4266_8
                || compoundButton.getId() == R.id.rb_A4266_9
                || compoundButton.getId() == R.id.rb_A4266_10
                || compoundButton.getId() == R.id.rb_A4266_11
                || compoundButton.getId() == R.id.rb_A4266_DK) {
            if (rb_A4266_5.isChecked() || rb_A4266_10.isChecked()) {
                ClearAllcontrol.ClearAll(ll_A4267_1);
                ll_A4267_1.setVisibility(View.GONE);
                ll_A4267_2.setVisibility(View.VISIBLE);
            } else {
                ClearAllcontrol.ClearAll(ll_A4267_2);
                ll_A4267_2.setVisibility(View.GONE);
                ll_A4267_1.setVisibility(View.VISIBLE);
            }
        }



        //A4267
        if (compoundButton.getId() == R.id.rb_A4267_1_1
                || compoundButton.getId() == R.id.rb_A4267_1_2
                || compoundButton.getId() == R.id.rb_A4267_1_3
                || compoundButton.getId() == R.id.rb_A4267_1_DK)
        {

            if (rb_A4267_1_2.isChecked() || rb_A4267_1_3.isChecked() || rb_A4267_1_DK.isChecked()) {

            ClearAllcontrol.ClearAll(ll_A4268);
            ClearAllcontrol.ClearAll(ll_A4269);
            ClearAllcontrol.ClearAll(ll_A4270);
            ClearAllcontrol.ClearAll(ll_A4271);
            ClearAllcontrol.ClearAll(ll_A4272_1);
            ClearAllcontrol.ClearAll(ll_A4272_2);
            ClearAllcontrol.ClearAll(ll_A4273);

            ll_A4268.setVisibility(View.GONE);
            ll_A4269.setVisibility(View.GONE);
            ll_A4270.setVisibility(View.GONE);
            ll_A4271.setVisibility(View.GONE);
            ll_A4272_1.setVisibility(View.GONE);
            ll_A4272_2.setVisibility(View.GONE);
            ll_A4273.setVisibility(View.GONE);
        }

        else
        {
            ll_A4268.setVisibility(View.VISIBLE);
            ll_A4269.setVisibility(View.VISIBLE);
            ll_A4270.setVisibility(View.VISIBLE);
            ll_A4271.setVisibility(View.VISIBLE);
            ll_A4272_1.setVisibility(View.VISIBLE);
            ll_A4272_2.setVisibility(View.VISIBLE);
            ll_A4273.setVisibility(View.VISIBLE);

            if (rb_A4261_1.isChecked() || rb_A4270_1.isChecked())
            {
                ll_A4274.setVisibility(View.VISIBLE);
                ll_A4275_1.setVisibility(View.VISIBLE);
                ll_A4275_2.setVisibility(View.VISIBLE);
                ll_A4276.setVisibility(View.VISIBLE);
            }
            else
                {
                    ClearAllcontrol.ClearAll(ll_A4274);
                    ClearAllcontrol.ClearAll(ll_A4275_1);
                    ClearAllcontrol.ClearAll(ll_A4275_2);
                    ClearAllcontrol.ClearAll(ll_A4276);

                    ll_A4274.setVisibility(View.GONE);
                    ll_A4275_1.setVisibility(View.GONE);
                    ll_A4275_2.setVisibility(View.GONE);
                    ll_A4276.setVisibility(View.GONE);

                if (rb_A4257_1.isChecked() || rb_A4257_2.isChecked() || rb_A4257_3.isChecked() || rb_A4257_4.isChecked()
                    || rb_A4257_6.isChecked() || rb_A4257_7.isChecked() || rb_A4257_8.isChecked() || rb_A4257_9.isChecked()
                    || rb_A4262_1.isChecked() || rb_A4262_2.isChecked() || rb_A4262_3.isChecked() || rb_A4262_4.isChecked()
                    || rb_A4262_6.isChecked() || rb_A4262_7.isChecked() || rb_A4262_8.isChecked() || rb_A4262_9.isChecked()
                    || rb_A4266_1.isChecked() || rb_A4266_2.isChecked() || rb_A4266_3.isChecked() || rb_A4266_4.isChecked()
                    || rb_A4266_6.isChecked() || rb_A4266_7.isChecked() || rb_A4266_8.isChecked() || rb_A4266_9.isChecked()
                    || rb_A4271_1.isChecked() || rb_A4271_2.isChecked() || rb_A4271_3.isChecked() || rb_A4271_4.isChecked()
                    || rb_A4271_6.isChecked() || rb_A4271_7.isChecked() || rb_A4271_8.isChecked() || rb_A4271_9.isChecked())
                {
                    ll_A4277.setVisibility(View.VISIBLE);
                    ll_A4278.setVisibility(View.VISIBLE);
                    ll_A4279.setVisibility(View.VISIBLE);
                    ll_A4280.setVisibility(View.VISIBLE);
                    ll_A4281.setVisibility(View.VISIBLE);
                    ll_A4282.setVisibility(View.VISIBLE);
                }
                else
                    {
                        ClearAllcontrol.ClearAll(ll_A4277);
                        ClearAllcontrol.ClearAll(ll_A4278);
                        ClearAllcontrol.ClearAll(ll_A4279);
                        ClearAllcontrol.ClearAll(ll_A4280);
                        ClearAllcontrol.ClearAll(ll_A4281);
                        ClearAllcontrol.ClearAll(ll_A4282);

                        ll_A4277.setVisibility(View.GONE);
                        ll_A4278.setVisibility(View.GONE);
                        ll_A4279.setVisibility(View.GONE);
                        ll_A4280.setVisibility(View.GONE);
                        ll_A4281.setVisibility(View.GONE);
                        ll_A4282.setVisibility(View.GONE);
                    }
                }
        }

        }



        //A4270
        if (compoundButton.getId() == R.id.rb_A4270_1
                || compoundButton.getId() == R.id.rb_A4270_2
                || compoundButton.getId() == R.id.rb_A4270_DK)

        {
            if (rb_A4270_2.isChecked() || rb_A4270_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_A4271);
                ll_A4271.setVisibility(View.GONE);
            }
            else
            {
                ll_A4271.setVisibility(View.VISIBLE);
            }


            if (rb_A4270_1.isChecked())
            {
                ll_A4275_2.setVisibility(View.VISIBLE);

                ClearAllcontrol.ClearAll(ll_A4275_1);
                ll_A4275_1.setVisibility(View.GONE);
            }
            else
            {
                ll_A4272_2.setVisibility(View.VISIBLE);

                ClearAllcontrol.ClearAll(ll_A4272_1);
                ll_A4275_1.setVisibility(View.GONE);
            }
        }


        //A4271
        if (compoundButton.getId() == R.id.rb_A4271_1
                || compoundButton.getId() == R.id.rb_A4271_2
                || compoundButton.getId() == R.id.rb_A4271_3
                || compoundButton.getId() == R.id.rb_A4271_4
                || compoundButton.getId() == R.id.rb_A4271_5
                || compoundButton.getId() == R.id.rb_A4271_6
                || compoundButton.getId() == R.id.rb_A4271_7
                || compoundButton.getId() == R.id.rb_A4271_8
                || compoundButton.getId() == R.id.rb_A4271_9
                || compoundButton.getId() == R.id.rb_A4271_10
                || compoundButton.getId() == R.id.rb_A4271_11
                || compoundButton.getId() == R.id.rb_A4271_DK)
        {
            if (rb_A4271_1.isChecked() || rb_A4271_2.isChecked() || rb_A4271_3.isChecked() || rb_A4271_4.isChecked()
                    || rb_A4271_5.isChecked() || rb_A4271_6.isChecked() || rb_A4271_7.isChecked() || rb_A4271_8.isChecked()
                    || rb_A4271_9.isChecked() || rb_A4271_10.isChecked() || rb_A4271_11.isChecked() || rb_A4271_DK.isChecked())
            {
                ClearAllcontrol.ClearAll(ll_A4272_1);
                ClearAllcontrol.ClearAll(ll_A4272_2);
                ll_A4272_1.setVisibility(View.GONE);
                ll_A4272_2.setVisibility(View.GONE);
            }
            else
                {
                    ll_A4272_1.setVisibility(View.VISIBLE);
                    ll_A4272_2.setVisibility(View.VISIBLE);
                }
        }


        //A4276
        if (compoundButton.getId() == R.id.cb_A4276_1
                || compoundButton.getId() == R.id.cb_A4276_2
                || compoundButton.getId() == R.id.cb_A4276_3
                || compoundButton.getId() == R.id.cb_A4276_4
                || compoundButton.getId() == R.id.cb_A4276_5
                || compoundButton.getId() == R.id.cb_A4276_6
                || compoundButton.getId() == R.id.cb_A4276_7
                || compoundButton.getId() == R.id.cb_A4276_8
                || compoundButton.getId() == R.id.cb_A4276_9
                || compoundButton.getId() == R.id.cb_A4276_10
                || compoundButton.getId() == R.id.cb_A4276_11
                || compoundButton.getId() == R.id.cb_A4276_12
                || compoundButton.getId() == R.id.cb_A4276_13
                || compoundButton.getId() == R.id.cb_A4276_14
                || compoundButton.getId() == R.id.cb_A4276_15
                || compoundButton.getId() == R.id.cb_A4276_16
                || compoundButton.getId() == R.id.cb_A4276_DK) {


            if (cb_A4276_5.isChecked()) {

                ed_A4276_5.setVisibility(View.VISIBLE);
            } else {
                ed_A4276_5.setText("");
                ed_A4276_5.setVisibility(View.GONE);
            }

            if (cb_A4276_16.isChecked()) {

                ed_A4276_16.setVisibility(View.VISIBLE);
            } else {
                ed_A4276_16.setText("");
                ed_A4276_16.setVisibility(View.GONE);
            }

            if (cb_A4276_DK.isChecked()) {

                cb_A4276_1.setChecked(false);
                cb_A4276_2.setChecked(false);
                cb_A4276_3.setChecked(false);
                cb_A4276_4.setChecked(false);
                cb_A4276_5.setChecked(false);
                cb_A4276_6.setChecked(false);
                cb_A4276_7.setChecked(false);
                cb_A4276_8.setChecked(false);
                cb_A4276_9.setChecked(false);
                cb_A4276_10.setChecked(false);
                cb_A4276_11.setChecked(false);
                cb_A4276_12.setChecked(false);
                cb_A4276_13.setChecked(false);
                cb_A4276_14.setChecked(false);
                cb_A4276_15.setChecked(false);
                cb_A4276_16.setChecked(false);

                ed_A4276_5.setText("");
                ed_A4276_5.setVisibility(View.GONE);

                ed_A4276_16.setText("");
                ed_A4276_16.setVisibility(View.GONE);

            } else {

                cb_A4276_DK.setChecked(false);
            }

        }


        //A4277
        if (compoundButton.getId() == R.id.rb_A4277_1
                || compoundButton.getId() == R.id.rb_A4277_2
                || compoundButton.getId() == R.id.rb_A4277_DK)

        {
            if (rb_A4277_2.isChecked() || rb_A4277_DK.isChecked())
            {
                ClearAllcontrol.ClearAll(ll_A4278);
                ll_A4278.setVisibility(View.GONE);
            }
            else
                {
                    ll_A4278.setVisibility(View.VISIBLE);
                }
        }


        //A4278
        if (compoundButton.getId() == R.id.cb_A4278_DK) {
            if (cb_A4278_DK.isChecked()) {
                cb_A4278_1.setChecked(false);
                cb_A4278_2.setChecked(false);
                cb_A4278_3.setChecked(false);
                cb_A4278_4.setChecked(false);
                cb_A4278_5.setChecked(false);
                cb_A4278_6.setChecked(false);
                cb_A4278_7.setChecked(false);
            } else {
                cb_A4278_DK.setChecked(false);
            }
        } else {

            cb_A4278_DK.setChecked(false);
        }


        //A4279
        if (compoundButton.getId() == R.id.cb_A4279_DK) {
            if (cb_A4279_DK.isChecked()) {
                cb_A4279_1.setChecked(false);
                cb_A4279_2.setChecked(false);
                cb_A4279_3.setChecked(false);
                cb_A4279_4.setChecked(false);
                cb_A4279_5.setChecked(false);
                cb_A4279_6.setChecked(false);
                cb_A4279_7.setChecked(false);
            } else {
                cb_A4279_DK.setChecked(false);
            }
        } else {

            cb_A4279_DK.setChecked(false);
        }
    }

    private void events_call() {

        btn_next11.setOnClickListener(this);
        btn_addd.setOnClickListener(this);

        rb_A4251_1.setOnCheckedChangeListener(this);
        rb_A4251_2.setOnCheckedChangeListener(this);
        rb_A4251_DK.setOnCheckedChangeListener(this);

        rb_A4253_1.setOnCheckedChangeListener(this);
        rb_A4253_2.setOnCheckedChangeListener(this);
        rb_A4253_3.setOnCheckedChangeListener(this);
        rb_A4253_DK.setOnCheckedChangeListener(this);

        rb_A4254_1_1.setOnCheckedChangeListener(this);
        rb_A4254_1_2.setOnCheckedChangeListener(this);
        rb_A4254_1_DK.setOnCheckedChangeListener(this);

        rb_A4254_2_1.setOnCheckedChangeListener(this);
        rb_A4254_2_2.setOnCheckedChangeListener(this);
        rb_A4254_2_DK.setOnCheckedChangeListener(this);

        rb_A4257_1.setOnCheckedChangeListener(this);
        rb_A4257_2.setOnCheckedChangeListener(this);
        rb_A4257_3.setOnCheckedChangeListener(this);
        rb_A4257_4.setOnCheckedChangeListener(this);
        rb_A4257_5.setOnCheckedChangeListener(this);
        rb_A4257_6.setOnCheckedChangeListener(this);
        rb_A4257_7.setOnCheckedChangeListener(this);
        rb_A4257_8.setOnCheckedChangeListener(this);
        rb_A4257_9.setOnCheckedChangeListener(this);
        rb_A4257_10.setOnCheckedChangeListener(this);
        rb_A4257_11.setOnCheckedChangeListener(this);
        rb_A4257_DK.setOnCheckedChangeListener(this);

        rb_A4258_1_1.setOnCheckedChangeListener(this);
        rb_A4258_1_2.setOnCheckedChangeListener(this);
        rb_A4258_1_3.setOnCheckedChangeListener(this);
        rb_A4258_1_DK.setOnCheckedChangeListener(this);

        rb_A4258_2_1.setOnCheckedChangeListener(this);
        rb_A4258_2_2.setOnCheckedChangeListener(this);
        rb_A4258_2_3.setOnCheckedChangeListener(this);
        rb_A4258_2_DK.setOnCheckedChangeListener(this);

        rb_A4261_1.setOnCheckedChangeListener(this);
        rb_A4261_2.setOnCheckedChangeListener(this);
        rb_A4261_DK.setOnCheckedChangeListener(this);

        rb_A4262_1.setOnCheckedChangeListener(this);
        rb_A4262_2.setOnCheckedChangeListener(this);
        rb_A4262_3.setOnCheckedChangeListener(this);
        rb_A4262_4.setOnCheckedChangeListener(this);
        rb_A4262_5.setOnCheckedChangeListener(this);
        rb_A4262_6.setOnCheckedChangeListener(this);
        rb_A4262_7.setOnCheckedChangeListener(this);
        rb_A4262_8.setOnCheckedChangeListener(this);
        rb_A4262_9.setOnCheckedChangeListener(this);
        rb_A4262_10.setOnCheckedChangeListener(this);
        rb_A4262_11.setOnCheckedChangeListener(this);
        rb_A4262_DK.setOnCheckedChangeListener(this);

        rb_A4264_1.setOnCheckedChangeListener(this);
        rb_A4264_2.setOnCheckedChangeListener(this);

        rb_A4266_1.setOnCheckedChangeListener(this);
        rb_A4266_2.setOnCheckedChangeListener(this);
        rb_A4266_3.setOnCheckedChangeListener(this);
        rb_A4266_4.setOnCheckedChangeListener(this);
        rb_A4266_5.setOnCheckedChangeListener(this);
        rb_A4266_6.setOnCheckedChangeListener(this);
        rb_A4266_7.setOnCheckedChangeListener(this);
        rb_A4266_8.setOnCheckedChangeListener(this);
        rb_A4266_9.setOnCheckedChangeListener(this);
        rb_A4266_10.setOnCheckedChangeListener(this);
        rb_A4266_11.setOnCheckedChangeListener(this);
        rb_A4266_DK.setOnCheckedChangeListener(this);

        rb_A4267_1_1.setOnCheckedChangeListener(this);
        rb_A4267_1_2.setOnCheckedChangeListener(this);
        rb_A4267_1_3.setOnCheckedChangeListener(this);
        rb_A4267_1_DK.setOnCheckedChangeListener(this);

        rb_A4267_2_1.setOnCheckedChangeListener(this);
        rb_A4267_2_2.setOnCheckedChangeListener(this);
        rb_A4267_2_3.setOnCheckedChangeListener(this);
        rb_A4267_2_DK.setOnCheckedChangeListener(this);

        rb_A4270_1.setOnCheckedChangeListener(this);
        rb_A4270_2.setOnCheckedChangeListener(this);
        rb_A4270_DK.setOnCheckedChangeListener(this);

        rb_A4271_1.setOnCheckedChangeListener(this);
        rb_A4271_2.setOnCheckedChangeListener(this);
        rb_A4271_3.setOnCheckedChangeListener(this);
        rb_A4271_4.setOnCheckedChangeListener(this);
        rb_A4271_5.setOnCheckedChangeListener(this);
        rb_A4271_6.setOnCheckedChangeListener(this);
        rb_A4271_7.setOnCheckedChangeListener(this);
        rb_A4271_8.setOnCheckedChangeListener(this);
        rb_A4271_9.setOnCheckedChangeListener(this);
        rb_A4271_10.setOnCheckedChangeListener(this);
        rb_A4271_11.setOnCheckedChangeListener(this);
        rb_A4271_DK.setOnCheckedChangeListener(this);

        rb_A4273_1.setOnCheckedChangeListener(this);
        rb_A4273_2.setOnCheckedChangeListener(this);

        rb_A4275_1_1.setOnCheckedChangeListener(this);
        rb_A4275_1_2.setOnCheckedChangeListener(this);
        rb_A4275_1_DK.setOnCheckedChangeListener(this);

        rb_A4275_2_1.setOnCheckedChangeListener(this);
        rb_A4275_2_2.setOnCheckedChangeListener(this);
        rb_A4275_2_DK.setOnCheckedChangeListener(this);

        rb_A4277_1.setOnCheckedChangeListener(this);
        rb_A4277_2.setOnCheckedChangeListener(this);
        rb_A4277_DK.setOnCheckedChangeListener(this);

        ed_A4259_hours.addTextChangedListener(generalTextWatcher);
        ed_A4259_minutes.addTextChangedListener(generalTextWatcher);

        ed_A4268_hours.addTextChangedListener(generalTextWatcher);
        ed_A4268_minutes.addTextChangedListener(generalTextWatcher);

        smart(ll_A4255);
        smart(ll_A4276);
        smart(ll_A4278);
        smart(ll_A4279);
    }

    void value_assignment() {

        study_id = "0";
        A4251 = "-1";
        A4253 = "-1";
        A4253_3 = "-1";
        A4254_1 = "-1";
        A4254_2 = "-1";
        A4255_1 = "-1";
        A4255_2 = "-1";
        A4255_3 = "-1";
        A4255_4 = "-1";
        A4255_4_OT = "-1";
        A4255_5 = "-1";
        A4255_6 = "-1";
        A4255_7 = "-1";
        A4255_8 = "-1";
        A4255_9 = "-1";
        A4255_10 = "-1";
        A4255_11 = "-1";
        A4255_12 = "-1";
        A4255_13 = "-1";
        A4255_13_OT = "-1";
        A4255_DK = "-1";
        A4256_days = "-1";
        A4256_hours = "-1";
        A4256_minutes = "-1";
        A4257 = "-1";
        A4257_name = "-1";
        A4258_1 = "-1";
        A4258_2 = "-1";
        A4259_hours = "-1";
        A4259_minutes = "-1";
        A4260 = "-1";
        A4261 = "-1";
        A4262 = "-1";
        A4262_name = "-1";
        A4263_1 = "-1";
        A4263_2 = "-1";
        A4264 = "-1";
        A4266 = "-1";
        A4266_name = "-1";
        A4267_1 = "-1";
        A4267_2 = "-1";
        A4268_hours = "-1";
        A4268_minutes = "-1";
        A4269 = "-1";
        A4270 = "-1";
        A4271 = "-1";
        A4271_name = "-1";
        A4272_1 = "-1";
        A4272_2 = "-1";
        A4273 = "-1";
        A4274 = "-1";
        A4275_1 = "-1";
        A4275_2 = "-1";
        A4276_1 = "-1";
        A4276_2 = "-1";
        A4276_3 = "-1";
        A4276_4 = "-1";
        A4276_5 = "-1";
        A4276_5_OT = "-1";
        A4276_6 = "-1";
        A4276_7 = "-1";
        A4276_8 = "-1";
        A4276_9 = "-1";
        A4276_10 = "-1";
        A4276_11 = "-1";
        A4276_12 = "-1";
        A4276_13 = "-1";
        A4276_14 = "-1";
        A4276_15 = "-1";
        A4276_16 = "-1";
        A4276_16_OT = "-1";
        A4276_DK = "-1";
        A4277 = "-1";
        A4278_1 = "-1";
        A4278_2 = "-1";
        A4278_3 = "-1";
        A4278_4 = "-1";
        A4278_5 = "-1";
        A4278_6 = "-1";
        A4278_7 = "-1";
        A4278_DK = "-1";
        A4279_1 = "-1";
        A4279_2 = "-1";
        A4279_3 = "-1";
        A4279_4 = "-1";
        A4279_5 = "-1";
        A4279_6 = "-1";
        A4279_7 = "-1";
        A4279_DK = "-1";
        A4280 = "-1";
        A4281 = "-1";
        A4282 = "-1";
        A4283 = "-1";
        A4284 = "-1";
        STATUS = "0";


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4251
        if (rb_A4251_1.isChecked()) {
            A4251 = "1";
        }
        if (rb_A4251_2.isChecked()) {
            A4251 = "2";
        }
        if (rb_A4251_DK.isChecked()) {
            A4251 = "9";
        }

        //A4253
        if (rb_A4253_1.isChecked()) {
            A4253 = "1";
        }
        if (rb_A4253_2.isChecked()) {
            A4253 = "2";
        }
        if (rb_A4253_3.isChecked()) {
            A4253 = "3";
        }
        if (rb_A4253_DK.isChecked()) {
            A4253 = "9";
        }
        if (ed_A4253_3.getText().toString().trim().length() > 0) {
            A4253_3 = ed_A4253_3.getText().toString().trim();
        }

        //A4254_1
        if (rb_A4254_1_1.isChecked()) {
            A4254_1 = "1";
        }
        if (rb_A4254_1_2.isChecked()) {
            A4254_1 = "2";
        }
        if (rb_A4254_1_DK.isChecked()) {
            A4254_1 = "9";
        }

        //A4254_2
        if (rb_A4254_2_1.isChecked()) {
            A4254_2 = "1";
        }
        if (rb_A4254_2_2.isChecked()) {
            A4254_2 = "2";
        }
        if (rb_A4254_2_DK.isChecked()) {
            A4254_2 = "9";
        }

        //A4255
        if (cb_A4255_1.isChecked()) {
            A4255_1 = "1";
        }
        if (cb_A4255_2.isChecked()) {
            A4255_2 = "2";
        }
        if (cb_A4255_3.isChecked()) {
            A4255_3 = "3";
        }
        if (cb_A4255_4.isChecked()) {
            A4255_4 = "4";
        }
        if (ed_A4255_4.getText().toString().trim().length() > 0) {
            A4255_4_OT = ed_A4255_4.getText().toString().trim();
        }
        if (cb_A4255_5.isChecked()) {
            A4255_5 = "5";
        }
        if (cb_A4255_6.isChecked()) {
            A4255_6 = "6";
        }
        if (cb_A4255_7.isChecked()) {
            A4255_7 = "7";
        }
        if (cb_A4255_8.isChecked()) {
            A4255_8 = "8";
        }
        if (cb_A4255_9.isChecked()) {
            A4255_9 = "9";
        }
        if (cb_A4255_9.isChecked()) {
            A4255_9 = "9";
        }
        if (cb_A4255_10.isChecked()) {
            A4255_10 = "10";
        }
        if (cb_A4255_11.isChecked()) {
            A4255_11 = "11";
        }
        if (cb_A4255_12.isChecked()) {
            A4255_12 = "12";
        }
        if (cb_A4255_13.isChecked()) {
            A4255_13 = "13";
        }
        if (ed_A4255_13.getText().toString().trim().length() > 0) {
            A4255_13_OT = ed_A4255_13.getText().toString().trim();
        }
        if (cb_A4255_DK.isChecked()) {
            A4255_DK = "99";
        }

        //A4256
        if (ed_A4256_days.getText().toString().trim().length() > 0) {
            A4256_days = ed_A4256_days.getText().toString().trim();
        }
        if (ed_A4256_hours.getText().toString().trim().length() > 0) {
            A4256_hours = ed_A4256_hours.getText().toString().trim();
        }
        if (ed_A4256_minutes.getText().toString().trim().length() > 0) {
            A4256_minutes = ed_A4256_minutes.getText().toString().trim();
        }

        //A4257
        if (rb_A4257_1.isChecked()) {
            A4257 = "1";
        }
        if (rb_A4257_2.isChecked()) {
            A4257 = "2";
        }
        if (rb_A4257_3.isChecked()) {
            A4257 = "3";
        }
        if (rb_A4257_4.isChecked()) {
            A4257 = "4";
        }
        if (rb_A4257_5.isChecked()) {
            A4257 = "5";
        }
        if (rb_A4257_6.isChecked()) {
            A4257 = "6";
        }
        if (rb_A4257_7.isChecked()) {
            A4257 = "7";
        }
        if (rb_A4257_8.isChecked()) {
            A4257 = "8";
        }
        if (rb_A4257_9.isChecked()) {
            A4257 = "9";
        }
        if (rb_A4257_10.isChecked()) {
            A4257 = "10";
        }
        if (rb_A4257_11.isChecked()) {
            A4257 = "11";
        }
        if (rb_A4257_DK.isChecked()) {
            A4257 = "99";
        }
        if (ed_A4257_name.getText().toString().trim().length() > 0) {
            A4257_name = ed_A4257_name.getText().toString().trim();
        }

        //A4258_1
        if (rb_A4258_1_1.isChecked()) {
            A4258_1 = "1";
        }
        if (rb_A4258_1_2.isChecked()) {
            A4258_1 = "2";
        }
        if (rb_A4258_1_3.isChecked()) {
            A4258_1 = "3";
        }
        if (rb_A4258_1_DK.isChecked()) {
            A4258_1 = "9";
        }

        //A4258_2
        if (rb_A4258_2_1.isChecked()) {
            A4258_2 = "1";
        }
        if (rb_A4258_2_2.isChecked()) {
            A4258_2 = "2";
        }
        if (rb_A4258_2_3.isChecked()) {
            A4258_2 = "3";
        }
        if (rb_A4258_2_DK.isChecked()) {
            A4258_2 = "9";
        }

        //A4259
        if (ed_A4259_hours.getText().toString().trim().length() > 0) {
            A4259_hours = ed_A4259_hours.getText().toString().trim();
        }
        if (ed_A4259_minutes.getText().toString().trim().length() > 0) {
            A4259_minutes = ed_A4259_minutes.getText().toString().trim();
        }

        //A4260
        if (rb_A4260_1.isChecked()) {
            A4260 = "1";
        }
        if (rb_A4260_2.isChecked()) {
            A4260 = "2";
        }
        if (rb_A4260_DK.isChecked()) {
            A4260 = "9";
        }

        //A4261
        if (rb_A4261_1.isChecked()) {
            A4261 = "1";
        }
        if (rb_A4261_2.isChecked()) {
            A4261 = "2";
        }
        if (rb_A4261_DK.isChecked()) {
            A4261 = "9";
        }

        //A4262
        if (rb_A4262_1.isChecked()) {
            A4262 = "1";
        }
        if (rb_A4262_2.isChecked()) {
            A4262 = "2";
        }
        if (rb_A4262_3.isChecked()) {
            A4262 = "3";
        }
        if (rb_A4262_4.isChecked()) {
            A4262 = "4";
        }
        if (rb_A4262_5.isChecked()) {
            A4262 = "5";
        }
        if (rb_A4262_6.isChecked()) {
            A4262 = "6";
        }
        if (rb_A4262_7.isChecked()) {
            A4262 = "7";
        }
        if (rb_A4262_8.isChecked()) {
            A4262 = "8";
        }
        if (rb_A4262_9.isChecked()) {
            A4262 = "9";
        }
        if (rb_A4262_10.isChecked()) {
            A4262 = "10";
        }
        if (rb_A4262_11.isChecked()) {
            A4262 = "11";
        }
        if (rb_A4262_DK.isChecked()) {
            A4262 = "99";
        }
        if (ed_A4262_name.getText().toString().trim().length() > 0) {
            A4262_name = ed_A4262_name.getText().toString().trim();
        }

        //A4263_1
        if (rb_A4263_1_1.isChecked()) {
            A4263_1 = "1";
        }
        if (rb_A4263_1_2.isChecked()) {
            A4263_1 = "2";
        }
        if (rb_A4263_1_DK.isChecked()) {
            A4263_1 = "9";
        }

        //A4263_2
        if (rb_A4263_2_1.isChecked()) {
            A4263_2 = "1";
        }
        if (rb_A4263_2_2.isChecked()) {
            A4263_2 = "2";
        }
        if (rb_A4263_2_DK.isChecked()) {
            A4263_2 = "9";
        }

        //A4264
        if (rb_A4264_1.isChecked()) {
            A4264 = "1";
        }
        if (rb_A4264_2.isChecked()) {
            A4264 = "2";
        }

        //A4266
        if (rb_A4266_1.isChecked()) {
            A4266 = "1";
        }
        if (rb_A4266_2.isChecked()) {
            A4266 = "2";
        }
        if (rb_A4266_3.isChecked()) {
            A4266 = "3";
        }
        if (rb_A4266_4.isChecked()) {
            A4266 = "4";
        }
        if (rb_A4266_5.isChecked()) {
            A4266 = "5";
        }
        if (rb_A4266_6.isChecked()) {
            A4266 = "6";
        }
        if (rb_A4266_7.isChecked()) {
            A4266 = "7";
        }
        if (rb_A4266_8.isChecked()) {
            A4266 = "8";
        }
        if (rb_A4266_9.isChecked()) {
            A4266 = "9";
        }
        if (rb_A4266_10.isChecked()) {
            A4266 = "10";
        }
        if (rb_A4266_11.isChecked()) {
            A4266 = "11";
        }
        if (rb_A4266_DK.isChecked()) {
            A4266 = "99";
        }
        if (ed_A4266_name.getText().toString().trim().length() > 0) {
            A4266_name = ed_A4266_name.getText().toString().trim();
        }

        //A4267_1
        if (rb_A4267_1_1.isChecked()) {
            A4267_1 = "1";
        }
        if (rb_A4267_1_2.isChecked()) {
            A4267_1 = "2";
        }
        if (rb_A4267_1_3.isChecked()) {
            A4267_1 = "3";
        }
        if (rb_A4267_1_DK.isChecked()) {
            A4267_1 = "9";
        }

        //A4267_2
        if (rb_A4267_2_1.isChecked()) {
            A4267_2 = "1";
        }
        if (rb_A4267_2_2.isChecked()) {
            A4267_2 = "2";
        }
        if (rb_A4267_2_3.isChecked()) {
            A4267_2 = "3";
        }
        if (rb_A4267_2_DK.isChecked()) {
            A4267_2 = "9";
        }

        //A4268
        if (ed_A4268_hours.getText().toString().trim().length() > 0) {
            A4268_hours = ed_A4268_hours.getText().toString().trim();
        }
        if (ed_A4268_minutes.getText().toString().trim().length() > 0) {
            A4268_minutes = ed_A4268_minutes.getText().toString().trim();
        }

        //A4269
        if (rb_A4269_1.isChecked()) {
            A4269 = "1";
        }
        if (rb_A4269_2.isChecked()) {
            A4269 = "2";
        }
        if (rb_A4269_DK.isChecked()) {
            A4269 = "9";
        }

        //A4270
        if (rb_A4270_1.isChecked()) {
            A4270 = "1";
        }
        if (rb_A4270_2.isChecked()) {
            A4270 = "2";
        }
        if (rb_A4270_DK.isChecked()) {
            A4270 = "9";
        }

        //A4271
        if (rb_A4271_1.isChecked()) {
            A4271 = "1";
        }
        if (rb_A4271_2.isChecked()) {
            A4271 = "2";
        }
        if (rb_A4271_3.isChecked()) {
            A4271 = "3";
        }
        if (rb_A4271_4.isChecked()) {
            A4271 = "4";
        }
        if (rb_A4271_5.isChecked()) {
            A4271 = "5";
        }
        if (rb_A4271_6.isChecked()) {
            A4271 = "6";
        }
        if (rb_A4271_7.isChecked()) {
            A4271 = "7";
        }
        if (rb_A4271_8.isChecked()) {
            A4271 = "8";
        }
        if (rb_A4271_9.isChecked()) {
            A4271 = "9";
        }
        if (rb_A4271_10.isChecked()) {
            A4271 = "10";
        }
        if (rb_A4271_11.isChecked()) {
            A4271 = "11";
        }
        if (rb_A4271_DK.isChecked()) {
            A4271 = "99";
        }
        if (ed_A4271_name.getText().toString().trim().length() > 0) {
            A4271_name = ed_A4271_name.getText().toString().trim();
        }

        //A4272_1
        if (rb_A4272_1_1.isChecked()) {
            A4272_1 = "1";
        }
        if (rb_A4272_1_2.isChecked()) {
            A4272_1 = "2";
        }
        if (rb_A4272_1_DK.isChecked()) {
            A4272_1 = "9";
        }

        //A4272_2
        if (rb_A4272_2_1.isChecked()) {
            A4272_2 = "1";
        }
        if (rb_A4272_2_2.isChecked()) {
            A4272_2 = "2";
        }
        if (rb_A4272_2_DK.isChecked()) {
            A4272_2 = "9";
        }

        //A4273
        if (rb_A4273_1.isChecked()) {
            A4273 = "1";
        }
        if (rb_A4273_2.isChecked()) {
            A4273 = "2";
        }


        //A4274
        if (rb_A4274_1.isChecked()) {
            A4274 = "1";
        }
        if (rb_A4274_2.isChecked()) {
            A4274 = "2";
        }
        if (rb_A4274_DK.isChecked()) {
            A4274 = "9";
        }

        //A4275_1
        if (rb_A4275_1_1.isChecked()) {
            A4275_1 = "1";
        }
        if (rb_A4275_1_2.isChecked()) {
            A4275_1 = "2";
        }
        if (rb_A4275_1_DK.isChecked()) {
            A4275_1 = "9";
        }

        //A4275_2
        if (rb_A4275_2_1.isChecked()) {
            A4275_2 = "1";
        }
        if (rb_A4275_2_2.isChecked()) {
            A4275_2 = "2";
        }
        if (rb_A4275_2_DK.isChecked()) {
            A4275_2 = "9";
        }

        //A4276
        if (cb_A4276_1.isChecked()) {
            A4276_1 = "1";
        }
        if (cb_A4276_2.isChecked()) {
            A4276_2 = "2";
        }
        if (cb_A4276_3.isChecked()) {
            A4276_3 = "3";
        }
        if (cb_A4276_4.isChecked()) {
            A4276_4 = "4";
        }
        if (cb_A4276_5.isChecked()) {
            A4276_5 = "5";
        }
        if (ed_A4276_5.getText().toString().trim().length() > 0) {
            A4276_5_OT = ed_A4276_5.getText().toString().trim();
        }
        if (cb_A4276_5.isChecked()) {
            A4276_5 = "5";
        }
        if (cb_A4276_6.isChecked()) {
            A4276_6 = "6";
        }
        if (cb_A4276_7.isChecked()) {
            A4276_7 = "7";
        }
        if (cb_A4276_8.isChecked()) {
            A4276_8 = "8";
        }
        if (cb_A4276_9.isChecked()) {
            A4276_9 = "9";
        }
        if (cb_A4276_9.isChecked()) {
            A4276_9 = "9";
        }
        if (cb_A4276_10.isChecked()) {
            A4276_10 = "10";
        }
        if (cb_A4276_11.isChecked()) {
            A4276_11 = "11";
        }
        if (cb_A4276_12.isChecked()) {
            A4276_12 = "12";
        }
        if (cb_A4276_13.isChecked()) {
            A4276_13 = "13";
        }
        if (cb_A4276_14.isChecked()) {
            A4276_14 = "14";
        }
        if (cb_A4276_15.isChecked()) {
            A4276_15 = "15";
        }
        if (cb_A4276_16.isChecked()) {
            A4276_16 = "16";
        }
        if (ed_A4276_16.getText().toString().trim().length() > 0) {
            A4276_16_OT = ed_A4276_16.getText().toString().trim();
        }
        if (cb_A4276_DK.isChecked()) {
            A4276_DK = "99";
        }

        //A4277
        if (rb_A4277_1.isChecked()) {
            A4277 = "1";
        }
        if (rb_A4277_2.isChecked()) {
            A4277 = "2";
        }
        if (rb_A4277_DK.isChecked()) {
            A4277 = "9";
        }

        //A4278
        if (cb_A4278_1.isChecked()) {
            A4278_1 = "1";
        }
        if (cb_A4278_2.isChecked()) {
            A4278_2 = "2";
        }
        if (cb_A4278_3.isChecked()) {
            A4278_3 = "3";
        }
        if (cb_A4278_4.isChecked()) {
            A4278_4 = "4";
        }
        if (cb_A4278_5.isChecked()) {
            A4278_5 = "5";
        }
        if (cb_A4278_6.isChecked()) {
            A4278_6 = "6";
        }
        if (cb_A4278_7.isChecked()) {
            A4278_7 = "7";
        }
        if (cb_A4278_DK.isChecked()) {
            A4278_DK = "9";
        }

        //A4279
        if (cb_A4279_1.isChecked()) {
            A4279_1 = "1";
        }
        if (cb_A4279_2.isChecked()) {
            A4279_2 = "2";
        }
        if (cb_A4279_3.isChecked()) {
            A4279_3 = "3";
        }
        if (cb_A4279_4.isChecked()) {
            A4279_4 = "4";
        }
        if (cb_A4279_5.isChecked()) {
            A4279_5 = "5";
        }
        if (cb_A4279_6.isChecked()) {
            A4279_6 = "6";
        }
        if (cb_A4279_7.isChecked()) {
            A4279_7 = "7";
        }
        if (cb_A4279_DK.isChecked()) {
            A4279_DK = "9";
        }

        //A4280
        if (rb_A4280_1.isChecked()) {
            A4280 = "1";
        }
        if (rb_A4280_2.isChecked()) {
            A4280 = "2";
        }
        if (rb_A4280_DK.isChecked()) {
            A4280 = "9";
        }
        if (rb_A4280_RA.isChecked()) {
            A4280 = "8";
        }

        //A4281
        if (rb_A4281_1.isChecked()) {
            A4281 = "1";
        }
        if (rb_A4281_2.isChecked()) {
            A4281 = "2";
        }
        if (rb_A4281_DK.isChecked()) {
            A4281 = "9";
        }
        if (rb_A4281_RA.isChecked()) {
            A4281 = "8";
        }

        //A4282
        if (rb_A4282_1.isChecked()) {
            A4282 = "1";
        }
        if (rb_A4282_2.isChecked()) {
            A4282 = "2";
        }
        if (rb_A4282_DK.isChecked()) {
            A4282 = "9";
        }
        if (rb_A4282_RA.isChecked()) {
            A4282 = "8";
        }

        //A4283
        if (rb_A4283_1.isChecked()) {
            A4283 = "1";
        }
        if (rb_A4283_2.isChecked()) {
            A4283 = "2";
        }
        if (rb_A4283_DK.isChecked()) {
            A4283 = "9";
        }
        if (rb_A4283_RA.isChecked()) {
            A4280 = "8";
        }

        //A4284
        if (ed_A4284_days.getText().toString().trim().length() > 0) {
            A4284 = ed_A4284_days.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into A4251_A4284("

                + Global.A.A4251_A4284.study_id + ","
                + Global.A.A4251_A4284.A4251 + ","
                + Global.A.A4251_A4284.A4253 + ","
                + Global.A.A4251_A4284.A4253_3 + ","
                + Global.A.A4251_A4284.A4254_1 + ","
                + Global.A.A4251_A4284.A4254_2 + ","
                + Global.A.A4251_A4284.A4255_1 + ","
                + Global.A.A4251_A4284.A4255_2 + ","
                + Global.A.A4251_A4284.A4255_3 + ","
                + Global.A.A4251_A4284.A4255_4 + ","
                + Global.A.A4251_A4284.A4255_4_OT + ","
                + Global.A.A4251_A4284.A4255_5 + ","
                + Global.A.A4251_A4284.A4255_6 + ","
                + Global.A.A4251_A4284.A4255_7 + ","
                + Global.A.A4251_A4284.A4255_8 + ","
                + Global.A.A4251_A4284.A4255_9 + ","
                + Global.A.A4251_A4284.A4255_10 + ","
                + Global.A.A4251_A4284.A4255_11 + ","
                + Global.A.A4251_A4284.A4255_12 + ","
                + Global.A.A4251_A4284.A4255_13 + ","
                + Global.A.A4251_A4284.A4255_13_OT + ","
                + Global.A.A4251_A4284.A4255_DK + ","
                + Global.A.A4251_A4284.A4256_days + ","
                + Global.A.A4251_A4284.A4256_hours + ","
                + Global.A.A4251_A4284.A4256_minutes + ","
                + Global.A.A4251_A4284.A4257 + ","
                + Global.A.A4251_A4284.A4257_name + ","
                + Global.A.A4251_A4284.A4258_1 + ","
                + Global.A.A4251_A4284.A4258_2 + ","
                + Global.A.A4251_A4284.A4259_hours + ","
                + Global.A.A4251_A4284.A4259_minutes + ","
                + Global.A.A4251_A4284.A4260 + ","
                + Global.A.A4251_A4284.A4261 + ","
                + Global.A.A4251_A4284.A4262 + ","
                + Global.A.A4251_A4284.A4262_name + ","
                + Global.A.A4251_A4284.A4263_1 + ","
                + Global.A.A4251_A4284.A4263_2 + ","
                + Global.A.A4251_A4284.A4264 + ","
                + Global.A.A4251_A4284.A4266 + ","
                + Global.A.A4251_A4284.A4266_name + ","
                + Global.A.A4251_A4284.A4267_1 + ","
                + Global.A.A4251_A4284.A4267_2 + ","
                + Global.A.A4251_A4284.A4268_hours + ","
                + Global.A.A4251_A4284.A4268_minutes + ","
                + Global.A.A4251_A4284.A4269 + ","
                + Global.A.A4251_A4284.A4270 + ","
                + Global.A.A4251_A4284.A4271 + ","
                + Global.A.A4251_A4284.A4271_name + ","
                + Global.A.A4251_A4284.A4272_1 + ","
                + Global.A.A4251_A4284.A4272_2 + ","
                + Global.A.A4251_A4284.A4273 + ","
                + Global.A.A4251_A4284.A4274 + ","
                + Global.A.A4251_A4284.A4275_1 + ","
                + Global.A.A4251_A4284.A4275_2 + ","
                + Global.A.A4251_A4284.A4276_1 + ","
                + Global.A.A4251_A4284.A4276_2 + ","
                + Global.A.A4251_A4284.A4276_3 + ","
                + Global.A.A4251_A4284.A4276_4 + ","
                + Global.A.A4251_A4284.A4276_5 + ","
                + Global.A.A4251_A4284.A4276_5_OT + ","
                + Global.A.A4251_A4284.A4276_6 + ","
                + Global.A.A4251_A4284.A4276_7 + ","
                + Global.A.A4251_A4284.A4276_8 + ","
                + Global.A.A4251_A4284.A4276_9 + ","
                + Global.A.A4251_A4284.A4276_10 + ","
                + Global.A.A4251_A4284.A4276_11 + ","
                + Global.A.A4251_A4284.A4276_12 + ","
                + Global.A.A4251_A4284.A4276_13 + ","
                + Global.A.A4251_A4284.A4276_14 + ","
                + Global.A.A4251_A4284.A4276_15 + ","
                + Global.A.A4251_A4284.A4276_16 + ","
                + Global.A.A4251_A4284.A4276_16_OT + ","
                + Global.A.A4251_A4284.A4276_DK + ","
                + Global.A.A4251_A4284.A4277 + ","
                + Global.A.A4251_A4284.A4278_1 + ","
                + Global.A.A4251_A4284.A4278_2 + ","
                + Global.A.A4251_A4284.A4278_3 + ","
                + Global.A.A4251_A4284.A4278_4 + ","
                + Global.A.A4251_A4284.A4278_5 + ","
                + Global.A.A4251_A4284.A4278_6 + ","
                + Global.A.A4251_A4284.A4278_7 + ","
                + Global.A.A4251_A4284.A4278_DK + ","
                + Global.A.A4251_A4284.A4279_1 + ","
                + Global.A.A4251_A4284.A4279_2 + ","
                + Global.A.A4251_A4284.A4279_3 + ","
                + Global.A.A4251_A4284.A4279_4 + ","
                + Global.A.A4251_A4284.A4279_5 + ","
                + Global.A.A4251_A4284.A4279_6 + ","
                + Global.A.A4251_A4284.A4279_7 + ","
                + Global.A.A4251_A4284.A4279_DK + ","
                + Global.A.A4251_A4284.A4280 + ","
                + Global.A.A4251_A4284.A4281 + ","
                + Global.A.A4251_A4284.A4282 + ","
                + Global.A.A4251_A4284.A4283 + ","
                + Global.A.A4251_A4284.A4284 + ","
                + Global.A.A4251_A4284.STATUS + ")" +


                " values ('" +

                study_id + "','" +
                A4251 + "','" +
                A4253 + "','" +
                A4253_3 + "','" +
                A4254_1 + "','" +
                A4254_2 + "','" +
                A4255_1 + "','" +
                A4255_2 + "','" +
                A4255_3 + "','" +
                A4255_4 + "','" +
                A4255_4_OT + "','" +
                A4255_5 + "','" +
                A4255_6 + "','" +
                A4255_7 + "','" +
                A4255_8 + "','" +
                A4255_9 + "','" +
                A4255_10 + "','" +
                A4255_11 + "','" +
                A4255_12 + "','" +
                A4255_13 + "','" +
                A4255_13_OT + "','" +
                A4255_DK + "','" +
                A4256_days + "','" +
                A4256_hours + "','" +
                A4256_minutes + "','" +
                A4257 + "','" +
                A4257_name + "','" +
                A4258_1 + "','" +
                A4258_2 + "','" +
                A4259_hours + "','" +
                A4259_minutes + "','" +
                A4260 + "','" +
                A4261 + "','" +
                A4262 + "','" +
                A4262_name + "','" +
                A4263_1 + "','" +
                A4263_2 + "','" +
                A4264 + "','" +
                A4266 + "','" +
                A4266_name + "','" +
                A4267_1 + "','" +
                A4267_2 + "','" +
                A4268_hours + "','" +
                A4268_minutes + "','" +
                A4269 + "','" +
                A4270 + "','" +
                A4271 + "','" +
                A4271_name + "','" +
                A4272_1 + "','" +
                A4272_2 + "','" +
                A4273 + "','" +
                A4274 + "','" +
                A4275_1 + "','" +
                A4275_2 + "','" +
                A4276_1 + "','" +
                A4276_2 + "','" +
                A4276_3 + "','" +
                A4276_4 + "','" +
                A4276_5 + "','" +
                A4276_5_OT + "','" +
                A4276_6 + "','" +
                A4276_7 + "','" +
                A4276_8 + "','" +
                A4276_9 + "','" +
                A4276_10 + "','" +
                A4276_11 + "','" +
                A4276_12 + "','" +
                A4276_13 + "','" +
                A4276_14 + "','" +
                A4276_15 + "','" +
                A4276_16 + "','" +
                A4276_16_OT + "','" +
                A4276_DK + "','" +
                A4277 + "','" +
                A4278_1 + "','" +
                A4278_2 + "','" +
                A4278_3 + "','" +
                A4278_4 + "','" +
                A4278_5 + "','" +
                A4278_6 + "','" +
                A4278_7 + "','" +
                A4278_DK + "','" +
                A4279_1 + "','" +
                A4279_2 + "','" +
                A4279_3 + "','" +
                A4279_4 + "','" +
                A4279_5 + "','" +
                A4279_6 + "','" +
                A4279_7 + "','" +
                A4279_DK + "','" +
                A4280 + "','" +
                A4281 + "','" +
                A4282 + "','" +
                A4283 + "','" +
                A4284 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "11th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    void insert_A4252() {

        A4252_1 = "-1";
        A4252_2 = "-1";
        A4252_3 = "-1";
        A4252_4 = "-1";


        for (int i = 0; i < phase.size(); i++) {
            A4252_1 = phase.get(i);
            A4252_2 = care.get(i);
            A4252_3 = place.get(i);
            A4252_4 = symtomps.get(i);


            String query = "insert into A4252_atributes("

                    + Global.A.A4251_A4284.study_id + ","
                    + Global.A.A4251_A4284.A4252_1 + ","
                    + Global.A.A4251_A4284.A4252_2 + ","
                    + Global.A.A4251_A4284.A4252_3 + ","
                    + Global.A.A4251_A4284.A4252_4 + ")" +


                    " values ('" +

                    study_id + "','" +
                    A4252_1 + "','" +
                    A4252_2 + "','" +
                    A4252_3 + "','" +
                    A4252_4 + "'" +

                    ")";

            query = String.format(query);

            LocalDataManager Lm = new LocalDataManager(this);

            LocalDataManager.database.execSQL(query);
        } // loop end

        Toast.makeText(this, "12th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_A4251) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4253) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4254_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4254_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4255) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4256) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4257) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4258_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4258_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4259) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4260) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4261) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4262) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4263_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4263_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4264) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4266) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4267_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4267_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4268) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4269) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4270) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4271) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4272_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4272_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4273) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4274) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4275_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4275_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4276) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4277) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4278) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4279) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4280) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4281) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4282) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_A4283) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_A4284) != false;
    }

    void smart(LinearLayout lv) {
        for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
            View view = lv.getChildAt(i);
            if (view instanceof CheckBox) {
                ((CheckBox) view).setOnCheckedChangeListener(this);
            }

        }
    }

    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 12);
    }

}
