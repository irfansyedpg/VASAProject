package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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

import com.irfansyed.VAS.VASMonitring.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class A4251_A4284 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration Region
    Boolean A4252_check;

    List<String> lst_phase = new ArrayList();
    List<String> lst_action = new ArrayList();
    List<String> lst_symtomps = new ArrayList();
    List<String> lst_place = new ArrayList();


    Button
            btn_next11,
            btn_addd;

    LinearLayout
            cvstudy_id,
            cvA4251,
            cvA4252,
            cvA4253,
            cvA4254_1,
            cvA4254_2,
            cvA4255,
            cvA4256,
            cv257_273,
            cvA4257,
            cvA4258_1,
            cvA4258_2,
            cvA4259,
            cvA4260,
            cvA4261,
            cvA4262,
            cvA4263_1,
            cvA4263_2,
            cvA4264,
            cvA4266,
            cvA4267_1,
            cvA4267_2,
            cvA4268,
            cvA4269,
            cvA4270,
            cvA4271,
            cvA4272_1,
            cvA4272_2,
            cvA4273,
            cvA4274,
            cvA4275,
            cvA4276,
            cvA4277,
            cvA4278,
            cvA4279,
            cvA4280,
            cvA4281,
            cvA4282,
            cvA4283,
            cvA4284;

    RadioButton
            A4251_1,
            A4251_2,
            A425198,
            A4253_1,
            A4253_2,
            A4253_3,
            A425398,
            A4254_1_1,
            A4254_1_2,
            A4254_198,
            A4254_2_1,
            A4254_2_2,
            A4254_298,
            A4257_1,
            A4257_2,
            A4257_3,
            A4257_4,
            A4257_5,
            A4257_6,
            A4257_7,
            A4257_8,
            A4257_9,
            A4257_10,
            A4257_11,
            A425798,
            A4258_1_1,
            A4258_1_2,
            A4258_1_3,
            A4258_198,
            A4258_2_1,
            A4258_2_2,
            A4258_2_3,
            A4258_298,
            A4260_1,
            A4260_2,
            A426098,
            A4261_1,
            A4261_2,
            A426198,
            A4262_1,
            A4262_2,
            A4262_3,
            A4262_4,
            A4262_5,
            A4262_6,
            A4262_7,
            A4262_8,
            A4262_9,
            A4262_10,
            A4262_11,
            A426298,
            A4263_1_1,
            A4263_1_2,
            A4263_198,
            A4263_2_1,
            A4263_2_2,
            A4263_298,
            A4264_1,
            A4264_2,
            A4266_1,
            A4266_2,
            A4266_3,
            A4266_4,
            A4266_5,
            A4266_6,
            A4266_7,
            A4266_8,
            A4266_9,
            A4266_10,
            A4266_11,
            A426698,
            A4267_1_1,
            A4267_1_2,
            A4267_1_3,
            A4267_198,
            A4267_2_1,
            A4267_2_2,
            A4267_2_3,
            A4267_298,
            A4269_1,
            A4269_2,
            A426998,
            A4270_1,
            A4270_2,
            A427098,
            A4271_1,
            A4271_2,
            A4271_3,
            A4271_4,
            A4271_5,
            A4271_6,
            A4271_7,
            A4271_8,
            A4271_9,
            A4271_10,
            A4271_11,
            A427198,
            A4272_1_1,
            A4272_1_2,
            A4272_198,
            A4272_2_1,
            A4272_2_2,
            A4272_298,
            A4273_1,
            A4273_2,
            A4274_1,
            A4274_2,
            A427498,
            A4275_1,
            A4275_2,
            A427598,
            A4277_1,
            A4277_2,
            A427798,
            A4280_1,
            A4280_2,
            A428098,
            A428099,
            A4281_1,
            A4281_2,
            A428198,
            A428199,
            A4282_1,
            A4282_2,
            A428298,
            A428299,
            A4283_1,
            A4283_2,
            A428398,
            A428399;

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
            cb_A425598,
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
            cb_A427698,
            cb_A4278_1,
            cb_A4278_2,
            cb_A4278_3,
            cb_A4278_4,
            cb_A4278_5,
            cb_A4278_6,
            cb_A4278_7,
            cb_A427898,
            cb_A4279_1,
            cb_A4279_2,
            cb_A4279_3,
            cb_A4279_4,
            cb_A4279_5,
            cb_A4279_6,
            cb_A4279_7,
            cb_A427998;

    String
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
            A425598,
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
            A4275,
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
            A427698,
            A4277,
            A4278_1,
            A4278_2,
            A4278_3,
            A4278_4,
            A4278_5,
            A4278_6,
            A4278_7,
            A427898,
            A4279_1,
            A4279_2,
            A4279_3,
            A4279_4,
            A4279_5,
            A4279_6,
            A4279_7,
            A427998,
            A4280,
            A4281,
            A4282,
            A4283,
            A4284,
            STATUS;

    //EndRegion Declaration
    Boolean b_place_where = false;


    void Initialization() {

        A4252_start = findViewById(R.id.A4252_start);
        A4252_mid = findViewById(R.id.A4252_Mid);
        A4252_End = findViewById(R.id.A4252_End);

        btn_next11 = findViewById(R.id.btn_next11);
        btn_addd = findViewById(R.id.btn_addd);

        cvA4251 = findViewById(R.id.cvA4251);
        cvA4252 = findViewById(R.id.cvA4252);
        //   cvA4252_1 = findViewById(R.id.cvA4252_1);
        cvA4253 = findViewById(R.id.cvA4253);
        cvA4254_1 = findViewById(R.id.cvA42541);
        cvA4254_2 = findViewById(R.id.cvA42542);
        cvA4255 = findViewById(R.id.cvA4255);
        cvA4256 = findViewById(R.id.cvA4256);
        cv257_273 = findViewById(R.id.cv257_273);
        cvA4257 = findViewById(R.id.cvA4257);
        cvA4258_1 = findViewById(R.id.cvA42581);
        cvA4258_2 = findViewById(R.id.cvA42582);
        cvA4259 = findViewById(R.id.cvA4259);
        cvA4260 = findViewById(R.id.cvA4260);
        cvA4261 = findViewById(R.id.cvA4261);
        cvA4262 = findViewById(R.id.cvA4262);
        cvA4263_1 = findViewById(R.id.cvA4263_1);
        cvA4263_2 = findViewById(R.id.cvA4263_2);
        cvA4264 = findViewById(R.id.cvA4264);
        cvA4266 = findViewById(R.id.cvA4266);
        cvA4267_1 = findViewById(R.id.cvA4267_1);
        cvA4267_2 = findViewById(R.id.cvA4267_2);
        cvA4268 = findViewById(R.id.cvA4268);
        cvA4269 = findViewById(R.id.cvA4269);
        cvA4270 = findViewById(R.id.cvA4270);
        cvA4271 = findViewById(R.id.cvA4271);
        cvA4272_1 = findViewById(R.id.cvA4272_1);
        cvA4272_2 = findViewById(R.id.cvA4272_2);
        cvA4273 = findViewById(R.id.cvA4273);
        cvA4274 = findViewById(R.id.cvA4274);
        cvA4275 = findViewById(R.id.cvA4275);
        cvA4276 = findViewById(R.id.cvA4276);
        cvA4277 = findViewById(R.id.cvA4277);
        cvA4278 = findViewById(R.id.cvA4278);
        cvA4279 = findViewById(R.id.cvA4279);
        cvA4280 = findViewById(R.id.cvA4280);
        cvA4281 = findViewById(R.id.cvA4281);
        cvA4282 = findViewById(R.id.cvA4282);
        cvA4283 = findViewById(R.id.cvA4283);
        cvA4284 = findViewById(R.id.cvA4284);

        A4251_1 = findViewById(R.id.A4251a);
        A4251_2 = findViewById(R.id.A4251b);
        A425198 = findViewById(R.id.A425198);
        A4253_1 = findViewById(R.id.A4253a);
        A4253_2 = findViewById(R.id.A4253b);
        A4253_3 = findViewById(R.id.A425396);
        A425396x = findViewById(R.id.A425396x);
        A425398 = findViewById(R.id.A425398);
        A4254_1_1 = findViewById(R.id.A4254_1_1);
        A4254_1_2 = findViewById(R.id.A4254_1_2);
        A4254_198 = findViewById(R.id.A4254_198);
        A4254_2_1 = findViewById(R.id.A4254_2_1);
        A4254_2_2 = findViewById(R.id.A4254_2_2);
        A4254_298 = findViewById(R.id.A4254_298);
        A4257_1 = findViewById(R.id.A4257_1);
        A4257_2 = findViewById(R.id.A4257_2);
        A4257_3 = findViewById(R.id.A4257_3);
        A4257_4 = findViewById(R.id.A4257_4);
        A4257_5 = findViewById(R.id.A4257_5);
        A4257_6 = findViewById(R.id.A4257_6);
        A4257_7 = findViewById(R.id.A4257_7);
        A4257_8 = findViewById(R.id.A4257_8);
        A4257_9 = findViewById(R.id.A4257_9);
        A4257_10 = findViewById(R.id.A4257_10);
        A4257_11 = findViewById(R.id.A4257_11);
        A425798 = findViewById(R.id.A425798);
        A4258_1_1 = findViewById(R.id.A4258_1_1);
        A4258_1_2 = findViewById(R.id.A4258_1_2);
        A4258_1_3 = findViewById(R.id.A4258_1_3);
        A4258_198 = findViewById(R.id.A4258_198);
        A4258_2_1 = findViewById(R.id.A4258_2_1);
        A4258_2_2 = findViewById(R.id.A4258_2_2);
        A4258_2_3 = findViewById(R.id.A4258_2_3);
        A4258_298 = findViewById(R.id.A4258_298);
        A4260_1 = findViewById(R.id.A4260_1);
        A4260_2 = findViewById(R.id.A4260_2);
        A426098 = findViewById(R.id.A426098);
        A4261_1 = findViewById(R.id.A4261_1);
        A4261_2 = findViewById(R.id.A4261_2);
        A426198 = findViewById(R.id.A426198);
        A4262_1 = findViewById(R.id.A4262_1);
        A4262_2 = findViewById(R.id.A4262_2);
        A4262_3 = findViewById(R.id.A4262_3);
        A4262_4 = findViewById(R.id.A4262_4);
        A4262_5 = findViewById(R.id.A4262_5);
        A4262_6 = findViewById(R.id.A4262_6);
        A4262_7 = findViewById(R.id.A4262_7);
        A4262_8 = findViewById(R.id.A4262_8);
        A4262_9 = findViewById(R.id.A4262_9);
        A4262_10 = findViewById(R.id.A4262_10);
        A4262_11 = findViewById(R.id.A4262_11);
        A426298 = findViewById(R.id.A426298);
        A4263_1_1 = findViewById(R.id.A4263_1_1);
        A4263_1_2 = findViewById(R.id.A4263_1_2);
        A4263_198 = findViewById(R.id.A4263_198);
        A4263_2_1 = findViewById(R.id.A4263_2_1);
        A4263_2_2 = findViewById(R.id.A4263_2_2);
        A4263_298 = findViewById(R.id.A4263_298);
        A4264_1 = findViewById(R.id.A4264_1);
        A4264_2 = findViewById(R.id.A4264_2);
        A4266_1 = findViewById(R.id.A4266_1);
        A4266_2 = findViewById(R.id.A4266_2);
        A4266_3 = findViewById(R.id.A4266_3);
        A4266_4 = findViewById(R.id.A4266_4);
        A4266_5 = findViewById(R.id.A4266_5);
        A4266_6 = findViewById(R.id.A4266_6);
        A4266_7 = findViewById(R.id.A4266_7);
        A4266_8 = findViewById(R.id.A4266_8);
        A4266_9 = findViewById(R.id.A4266_9);
        A4266_10 = findViewById(R.id.A4266_10);
        A4266_11 = findViewById(R.id.A4266_11);
        A426698 = findViewById(R.id.A426698);
        A4267_1_1 = findViewById(R.id.A4267_1_1);
        A4267_1_2 = findViewById(R.id.A4267_1_2);
        A4267_1_3 = findViewById(R.id.A4267_1_3);
        A4267_198 = findViewById(R.id.A4267_198);
        A4267_2_1 = findViewById(R.id.A4267_2_1);
        A4267_2_2 = findViewById(R.id.A4267_2_2);
        A4267_2_3 = findViewById(R.id.A4267_2_3);
        A4267_298 = findViewById(R.id.A4267_298);
        A4269_1 = findViewById(R.id.A4269_1);
        A4269_2 = findViewById(R.id.A4269_2);
        A426998 = findViewById(R.id.A426998);
        A4270_1 = findViewById(R.id.A4270_1);
        A4270_2 = findViewById(R.id.A4270_2);
        A427098 = findViewById(R.id.A427098);
        A4271_1 = findViewById(R.id.A4271_1);
        A4271_2 = findViewById(R.id.A4271_2);
        A4271_3 = findViewById(R.id.A4271_3);
        A4271_4 = findViewById(R.id.A4271_4);
        A4271_5 = findViewById(R.id.A4271_5);
        A4271_6 = findViewById(R.id.A4271_6);
        A4271_7 = findViewById(R.id.A4271_7);
        A4271_8 = findViewById(R.id.A4271_8);
        A4271_9 = findViewById(R.id.A4271_9);
        A4271_10 = findViewById(R.id.A4271_10);
        A4271_11 = findViewById(R.id.A4271_11);
        A427198 = findViewById(R.id.A427198);
        A4272_1_1 = findViewById(R.id.A4272_1_1);
        A4272_1_2 = findViewById(R.id.A4272_1_2);
        A4272_198 = findViewById(R.id.A4272_198);
        A4272_2_1 = findViewById(R.id.A4272_2_1);
        A4272_2_2 = findViewById(R.id.A4272_2_2);
        A4272_298 = findViewById(R.id.A4272_298);
        A4273_1 = findViewById(R.id.A4273_1);
        A4273_2 = findViewById(R.id.A4273_2);
        A4274_1 = findViewById(R.id.A4274_1);
        A4274_2 = findViewById(R.id.A4274_2);
        A427498 = findViewById(R.id.A427498);
        A4275_1 = findViewById(R.id.A4275_1);
        A4275_2 = findViewById(R.id.A4275_2);
        A427598 = findViewById(R.id.A427598);
        A4277_1 = findViewById(R.id.A4277_1);
        A4277_2 = findViewById(R.id.A4277_2);
        A427798 = findViewById(R.id.A427798);
        A4280_1 = findViewById(R.id.A4280_1);
        A4280_2 = findViewById(R.id.A4280_2);
        A428098 = findViewById(R.id.A428098);
        A428099 = findViewById(R.id.A428099);
        A4281_1 = findViewById(R.id.A4281_1);
        A4281_2 = findViewById(R.id.A4281_2);
        A428198 = findViewById(R.id.A428198);
        A428199 = findViewById(R.id.A428199);
        A4282_1 = findViewById(R.id.A4282_1);
        A4282_2 = findViewById(R.id.A4282_2);
        A428298 = findViewById(R.id.A428298);
        A428299 = findViewById(R.id.A428299);
        A4283_1 = findViewById(R.id.A4283_1);
        A4283_2 = findViewById(R.id.A4283_2);
        A428398 = findViewById(R.id.A428398);
        A428399 = findViewById(R.id.A428399);

        A425396x = findViewById(R.id.A425396x);
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
        cb_A425598 = findViewById(R.id.cb_A425598);
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
        cb_A427698 = findViewById(R.id.cb_A427698);
        cb_A4278_1 = findViewById(R.id.cb_A4278_1);
        cb_A4278_2 = findViewById(R.id.cb_A4278_2);
        cb_A4278_3 = findViewById(R.id.cb_A4278_3);
        cb_A4278_4 = findViewById(R.id.cb_A4278_4);
        cb_A4278_5 = findViewById(R.id.cb_A4278_5);
        cb_A4278_6 = findViewById(R.id.cb_A4278_6);
        cb_A4278_7 = findViewById(R.id.cb_A4278_7);
        cb_A427898 = findViewById(R.id.cb_A427898);
        cb_A4279_1 = findViewById(R.id.cb_A4279_1);
        cb_A4279_2 = findViewById(R.id.cb_A4279_2);
        cb_A4279_3 = findViewById(R.id.cb_A4279_3);
        cb_A4279_4 = findViewById(R.id.cb_A4279_4);
        cb_A4279_5 = findViewById(R.id.cb_A4279_5);
        cb_A4279_6 = findViewById(R.id.cb_A4279_6);
        cb_A4279_7 = findViewById(R.id.cb_A4279_7);
        cb_A427998 = findViewById(R.id.cb_A427998);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4251__a4284);

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(true);

        Initialization();
        events_call();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_next11) {
            if (validateField() == false) {
                Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
                return;
            }


            if (A4251_1.isChecked() && lst_phase.size() == 0) {
                Toast.makeText(this, "Please add upar wala addd", Toast.LENGTH_LONG).show();
                return;
            }

            try {
                value_assignment();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            insert_data();


            if (A4251_1.isChecked() && lst_phase.size() > 0) {
                insert_A4252();
                //<editor-fold desc="Description">
            }
            //</editor-fold>


            Intent c = new Intent(A4251_A4284.this, A4301.class);
            c.putExtra("study_id", study_id);
            startActivity(c);
        }

        if (view.getId() == R.id.btn_addd) {

            if (lst_phase.size() > 8) {
                Toast.makeText(A4251_A4284.this, "Cannot be more then 9 ", Toast.LENGTH_LONG).show();
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

                    A4252_1_1,
                    A4252_1_2,
                    A4252_1_3,
                    A4252_2_1,
                    A4252_2_2,
                    A4252_2_3,
                    A4252_2_4,
                    A4252_2_5,
                    A4252_2_6,
                    A4252_2_7;

            A4252_1_1 = v.findViewById(R.id.A4252_1_1);
            A4252_1_2 = v.findViewById(R.id.A4252_1_2);
            A4252_1_3 = v.findViewById(R.id.A4252_1_3);
            A4252_2_1 = v.findViewById(R.id.A4252_2_1);
            A4252_2_2 = v.findViewById(R.id.A4252_2_2);
            A4252_2_3 = v.findViewById(R.id.A4252_2_3);
            A4252_2_4 = v.findViewById(R.id.A4252_2_4);
            A4252_2_5 = v.findViewById(R.id.A4252_2_5);
            A4252_2_6 = v.findViewById(R.id.A4252_2_6);
            A4252_2_7 = v.findViewById(R.id.A4252_2_7);

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

                    /*if (A4251_1.isChecked()) {
                        ClearAllcontrol(ll)
                    }*/


                    if (!Gothrough.IamHiden(ll2_A4252) || !Gothrough.IamHiden(ll3_A4252) || !Gothrough.IamHiden(ll5_A4252)) {
                        Toast.makeText(A4251_A4284.this, "Select All", Toast.LENGTH_LONG).show();

                        return;
                    }


                    if (A4252_1_1.isChecked()) {

                        if (Collections.frequency(lst_phase, "1") > 2) {
                            Toast.makeText(A4251_A4284.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }
                        lst_phase.add("1");

                    } else if (A4252_1_2.isChecked()) {


                        if (Collections.frequency(lst_phase, "2") > 2) {
                            Toast.makeText(A4251_A4284.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }

                        lst_phase.add("2");
                    } else if (A4252_1_3.isChecked()) {

                        if (Collections.frequency(lst_phase, "3") > 2) {
                            Toast.makeText(A4251_A4284.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }

                        lst_phase.add("3");
                    } else {
                        Toast.makeText(A4251_A4284.this, "Please select from Illness Phase options", Toast.LENGTH_LONG).show();

                        return;
                    }


                    if (A4252_2_1.isChecked()) {
                        lst_action.add("1");
                    } else if (A4252_2_2.isChecked()) {
                        lst_action.add("2");
                    } else if (A4252_2_3.isChecked()) {
                        lst_action.add("3");
                    } else if (A4252_2_4.isChecked()) {
                        lst_action.add("4");
                    } else if (A4252_2_5.isChecked()) {
                        lst_action.add("5");
                    } else if (A4252_2_6.isChecked()) {
                        lst_action.add("6");
                    } else if (A4252_2_7.isChecked()) {
                        lst_action.add("7");
                    } else {
                        // toast

                        return;
                    }

                    if (cb_place.isChecked()) {
                        b_place_where = true;

                        lst_place.add("1");
                        cb_place.setChecked(false);
                    } else {
                        lst_place.add("0");
                    }

                    if (ed_symt.getText().toString().trim().length() > 0) {
                        lst_symtomps.add(ed_symt.getText().toString().trim());
                    } else {
                        ed_symt.requestFocus();
                        ed_symt.setError("Enter Symtoms");
                        return;
                    }


                    A4252_start.setText("Start (" + Collections.frequency(lst_phase, "1") + ")");
                    A4252_mid.setText("Mid (" + Collections.frequency(lst_phase, "2") + ")");
                    A4252_End.setText("End (" + Collections.frequency(lst_phase, "3") + ")");
                    btn_addd.setText("ADD  (" + lst_phase.size() + ")");
                    b.cancel();

                }
            });


        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.A4251a
                || compoundButton.getId() == R.id.A4251b
                || compoundButton.getId() == R.id.A425198) {


            lst_phase.clear();
            lst_action.clear();
            lst_symtomps.clear();
            lst_place.clear();
            b_place_where = false;

            A4252_start.setText("Start");
            A4252_mid.setText("Mid");
            A4252_End.setText("End");
            btn_addd.setText("Add");


            ClearAllcontrol.ClearAll(cvA4252);
            //   ClearAllcontrol.ClearAll(cvA4252_1);
            ClearAllcontrol.ClearAll(cvA4253);
            ClearAllcontrol.ClearAll(cvA4254_1);
            ClearAllcontrol.ClearAll(cvA4254_2);
            ClearAllcontrol.ClearAll(cvA4255);
            ClearAllcontrol.ClearAll(cvA4256);
            ClearAllcontrol.ClearAll(cv257_273);
            ClearAllcontrol.ClearAll(cvA4274);
            ClearAllcontrol.ClearAll(cvA4275);
            ClearAllcontrol.ClearAll(cvA4276);
            ClearAllcontrol.ClearAll(cvA4277);
            ClearAllcontrol.ClearAll(cvA4278);
            ClearAllcontrol.ClearAll(cvA4279);
            ClearAllcontrol.ClearAll(cvA4280);
            ClearAllcontrol.ClearAll(cvA4281);
            ClearAllcontrol.ClearAll(cvA4282);
            ClearAllcontrol.ClearAll(cvA4283);

            cvA4252.setVisibility(View.GONE);
            //      cvA4252_1.setVisibility(View.GONE);
            cvA4253.setVisibility(View.GONE);
            cvA4254_1.setVisibility(View.GONE);
            cvA4254_2.setVisibility(View.GONE);
            cvA4255.setVisibility(View.GONE);
            cvA4256.setVisibility(View.GONE);
            cv257_273.setVisibility(View.GONE);
            cvA4274.setVisibility(View.GONE);
            cvA4275.setVisibility(View.GONE);
            cvA4276.setVisibility(View.GONE);
            cvA4277.setVisibility(View.GONE);
            cvA4278.setVisibility(View.GONE);
            cvA4279.setVisibility(View.GONE);
            cvA4280.setVisibility(View.GONE);
            cvA4281.setVisibility(View.GONE);
            cvA4282.setVisibility(View.GONE);
            cvA4283.setVisibility(View.GONE);

            if (A4251_1.isChecked()) {

                cvA4252.setVisibility(View.VISIBLE);
                //   cvA4252_1.setVisibility(View.VISIBLE);
                cvA4253.setVisibility(View.VISIBLE);
                cvA4254_2.setVisibility(View.VISIBLE);
                cvA4255.setVisibility(View.VISIBLE);
                cvA4256.setVisibility(View.VISIBLE);
                cv257_273.setVisibility(View.VISIBLE);
                cvA4274.setVisibility(View.VISIBLE);
                cvA4275.setVisibility(View.VISIBLE);
                cvA4276.setVisibility(View.VISIBLE);
                cvA4277.setVisibility(View.VISIBLE);
                cvA4278.setVisibility(View.VISIBLE);
                cvA4279.setVisibility(View.VISIBLE);
                cvA4280.setVisibility(View.VISIBLE);
                cvA4281.setVisibility(View.VISIBLE);
                cvA4282.setVisibility(View.VISIBLE);
                cvA4283.setVisibility(View.VISIBLE);

            } else if (A4251_2.isChecked()) {

                cvA4254_1.setVisibility(View.VISIBLE);
                cvA4255.setVisibility(View.VISIBLE);
                cvA4256.setVisibility(View.VISIBLE);
                cv257_273.setVisibility(View.VISIBLE);
                cvA4274.setVisibility(View.VISIBLE);
                cvA4275.setVisibility(View.VISIBLE);
                cvA4276.setVisibility(View.VISIBLE);
                cvA4277.setVisibility(View.VISIBLE);
                cvA4278.setVisibility(View.VISIBLE);
                cvA4279.setVisibility(View.VISIBLE);
                cvA4280.setVisibility(View.VISIBLE);
                cvA4281.setVisibility(View.VISIBLE);
                cvA4282.setVisibility(View.VISIBLE);
                cvA4283.setVisibility(View.VISIBLE);

            }
        }

        if (compoundButton.getId() == R.id.A4253_1
                || compoundButton.getId() == R.id.A4253_2
                || compoundButton.getId() == R.id.A4253_3
                || compoundButton.getId() == R.id.A425398) {
            if (A4253_3.isChecked()) {

                ed_A4253_3.setVisibility(View.VISIBLE);
            } else {
                ed_A4253_3.setText("");
                ed_A4253_3.setVisibility(View.GONE);
            }
        }

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
                || compoundButton.getId() == R.id.cb_A425598) {


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

            if (cb_A425598.isChecked()) {

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

                cb_A425598.setChecked(false);
            }

        }

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
                || compoundButton.getId() == R.id.cb_A427698) {


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

            if (cb_A427698.isChecked()) {

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

                cb_A427698.setChecked(false);
            }

        }
    }

    private void events_call() {

        btn_next11.setOnClickListener(this);
        btn_addd.setOnClickListener(this);

        A4251_1.setOnCheckedChangeListener(this);
        A4251_2.setOnCheckedChangeListener(this);
        A425198.setOnCheckedChangeListener(this);

        A4253_1.setOnCheckedChangeListener(this);
        A4253_2.setOnCheckedChangeListener(this);
        A4253_3.setOnCheckedChangeListener(this);
        A425398.setOnCheckedChangeListener(this);
        /*A4254_1.setOnCheckedChangeListener(this);
        A4254_2.setOnCheckedChangeListener(this);
        A425498.setOnCheckedChangeListener(this);
        A4274_1.setOnCheckedChangeListener(this);
        A4274_2.setOnCheckedChangeListener(this);
        A427498.setOnCheckedChangeListener(this);
        A4275_1.setOnCheckedChangeListener(this);
        A4275_2.setOnCheckedChangeListener(this);
        A427598.setOnCheckedChangeListener(this);
        A4277_1.setOnCheckedChangeListener(this);
        A4277_2.setOnCheckedChangeListener(this);
        A427798.setOnCheckedChangeListener(this);
        A4280_1.setOnCheckedChangeListener(this);
        A4280_2.setOnCheckedChangeListener(this);
        A428098.setOnCheckedChangeListener(this);
        A428099.setOnCheckedChangeListener(this);
        A4281_1.setOnCheckedChangeListener(this);
        A4281_2.setOnCheckedChangeListener(this);
        A428198.setOnCheckedChangeListener(this);
        A428199.setOnCheckedChangeListener(this);
        A4282_1.setOnCheckedChangeListener(this);
        A4282_2.setOnCheckedChangeListener(this);
        A428298.setOnCheckedChangeListener(this);
        A428299.setOnCheckedChangeListener(this);
        A4283_1.setOnCheckedChangeListener(this);
        A4283_2.setOnCheckedChangeListener(this);
        A428398.setOnCheckedChangeListener(this);
        A428399.setOnCheckedChangeListener(this);*/

        smart(cvA4255);
    }

    void value_assignment() throws JSONException {


        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //A4268
        json.put("study_id", study_id);
        json.put("STATUS", STATUS);
        
        //A4251
        json.put("A4251", A4251_1.isChecked() ? "1"
                : A4251_2.isChecked() ? "2"
                : A425198.isChecked() ? "98"
                : "-1");

        //A4253
        json.put("A4253", A4253_1.isChecked() ? "1"
                : A4253_2.isChecked() ? "2"
                : A4253_3.isChecked() ? "3"
                : A425398.isChecked() ? "98"
                : "-1");
        json.put("A4253_3", ed_A4253_3.getText().toString().trim().length() > 0 ? ed_A4253_3.getText().toString() : "-1");

        //A4254_1
        json.put("A4254_1", A4254_1_1.isChecked() ? "1"
                : A4254_1_2.isChecked() ? "2"
                : A4254_198.isChecked() ? "98"
                : "-1");

        //A4254_2
        json.put("A4254_2", A4254_2_1.isChecked() ? "1"
                : A4254_2_2.isChecked() ? "2"
                : A4254_298.isChecked() ? "98"
                : "-1");

        //A4255
        json.put("A4255_1", cb_A4255_1.isChecked() ? "1" : "-1");
        json.put("A4255_2", cb_A4255_2.isChecked() ? "2" : "-1");
        json.put("A4255_3", cb_A4255_3.isChecked() ? "3" : "-1");
        json.put("A4255_4", cb_A4255_4.isChecked() ? "4" : "-1");
        json.put("A4255_5", cb_A4255_5.isChecked() ? "5" : "-1");
        json.put("A4255_6", cb_A4255_6.isChecked() ? "6" : "-1");
        json.put("A4255_7", cb_A4255_7.isChecked() ? "7" : "-1");
        json.put("A4255_8", cb_A4255_8.isChecked() ? "8" : "-1");
        json.put("A4255_9", cb_A4255_9.isChecked() ? "9" : "-1");
        json.put("A4255_10", cb_A4255_10.isChecked() ? "10" : "-1");
        json.put("A4255_11", cb_A4255_11.isChecked() ? "11" : "-1");
        json.put("A4255_12", cb_A4255_12.isChecked() ? "12" : "-1");
        json.put("A4255_13", cb_A4255_13.isChecked() ? "13" : "-1");
        json.put("A425598", cb_A425598.isChecked() ? "98" : "-1");
        json.put("A4255_4_OT", ed_A4255_4.getText().toString().trim().length() > 0 ? ed_A4255_4.getText().toString().trim() : "-1");
        json.put("A4255_13_OT", ed_A4255_13.getText().toString().trim().length() > 0 ? ed_A4255_13.getText().toString().trim() : "-1");


        //A4255
        json.put("A4256_minutes", ed_A4256_minutes.getText().toString().trim().length() > 0 ? ed_A4256_minutes.getText().toString().trim() : "-1");
        json.put("A4256_hours", ed_A4256_hours.getText().toString().trim().length() > 0 ? ed_A4256_hours.getText().toString().trim() : "-1");
        json.put("A4256_days", ed_A4256_days.getText().toString().trim().length() > 0 ? ed_A4256_days.getText().toString().trim() : "-1");

        //A4257
        json.put("A4257", A4257_1.isChecked() ? "1"
                : A4257_2.isChecked() ? "2"
                : A4257_3.isChecked() ? "3"
                : A4257_4.isChecked() ? "4"
                : A4257_5.isChecked() ? "5"
                : A4257_6.isChecked() ? "6"
                : A4257_7.isChecked() ? "7"
                : A4257_8.isChecked() ? "8"
                : A4257_9.isChecked() ? "9"
                : A4257_10.isChecked() ? "10"
                : A4257_11.isChecked() ? "11"
                : A425798.isChecked() ? "98"
                : "-1");
        json.put("A4257_name", ed_A4257_name.getText().toString().trim().length() > 0 ? ed_A4257_name.getText().toString() : "-1");

        //A4258_1
        json.put("A4258_1", A4258_1_1.isChecked() ? "1"
                : A4258_1_2.isChecked() ? "2"
                : A4258_1_3.isChecked() ? "3"
                : A4258_198.isChecked() ? "98"
                : "-1");

        //A4258_2
        json.put("A4258_2", A4258_2_1.isChecked() ? "1"
                : A4258_2_2.isChecked() ? "2"
                : A4258_2_3.isChecked() ? "3"
                : A4258_298.isChecked() ? "98"
                : "-1");
        
        //A4259
        json.put("A4259_minutes", ed_A4259_minutes.getText().toString().trim().length() > 0 ? ed_A4259_minutes.getText().toString().trim() : "-1");
        json.put("A4259_hours", ed_A4259_hours.getText().toString().trim().length() > 0 ? ed_A4259_hours.getText().toString().trim() : "-1");


        //A4260
        json.put("A4260", A4260_1.isChecked() ? "1"
                : A4260_2.isChecked() ? "2"
                : A426098.isChecked() ? "98"
                : "-1");

        //A4261
        json.put("A4261", A4261_1.isChecked() ? "1"
                : A4261_2.isChecked() ? "2"
                : A426198.isChecked() ? "98"
                : "-1");

        //A4262
        json.put("A4262", A4262_1.isChecked() ? "1"
                : A4262_2.isChecked() ? "2"
                : A4262_3.isChecked() ? "3"
                : A4262_4.isChecked() ? "4"
                : A4262_5.isChecked() ? "5"
                : A4262_6.isChecked() ? "6"
                : A4262_7.isChecked() ? "7"
                : A4262_8.isChecked() ? "8"
                : A4262_9.isChecked() ? "9"
                : A4262_10.isChecked() ? "10"
                : A4262_11.isChecked() ? "11"
                : A426298.isChecked() ? "98"
                : "-1");
        json.put("A4262_name", ed_A4262_name.getText().toString().trim().length() > 0 ? ed_A4262_name.getText().toString() : "-1");

        //A4263_1
        json.put("A4263_1", A4263_1_1.isChecked() ? "1"
                : A4263_1_2.isChecked() ? "2"
                : A4263_198.isChecked() ? "98"
                : "-1");

        //A4263_2
        json.put("A4263_2", A4263_2_1.isChecked() ? "1"
                : A4263_2_2.isChecked() ? "2"
                : A4263_298.isChecked() ? "98"
                : "-1");

        //A4264
        json.put("A4264", A4264_1.isChecked() ? "1"
                : A4264_2.isChecked() ? "2"
                : "-1");

        //A4266
        json.put("A4266", A4266_1.isChecked() ? "1"
                : A4266_2.isChecked() ? "2"
                : A4266_3.isChecked() ? "3"
                : A4266_4.isChecked() ? "4"
                : A4266_5.isChecked() ? "5"
                : A4266_6.isChecked() ? "6"
                : A4266_7.isChecked() ? "7"
                : A4266_8.isChecked() ? "8"
                : A4266_9.isChecked() ? "9"
                : A4266_10.isChecked() ? "10"
                : A4266_11.isChecked() ? "11"
                : A426698.isChecked() ? "98"
                : "-1");
        json.put("A4266_name", ed_A4266_name.getText().toString().trim().length() > 0 ? ed_A4266_name.getText().toString() : "-1");

        //A4267_1
        json.put("A4267_1", A4267_1_1.isChecked() ? "1"
                : A4267_1_2.isChecked() ? "2"
                : A4267_1_3.isChecked() ? "3"
                : A4267_198.isChecked() ? "98"
                : "-1");

        //A4267_2
        json.put("A4267_2", A4267_2_1.isChecked() ? "1"
                : A4267_2_2.isChecked() ? "2"
                : A4267_2_3.isChecked() ? "3"
                : A4267_298.isChecked() ? "98"
                : "-1");

        //A4268
        json.put("A4268_minutes", ed_A4268_minutes.getText().toString().trim().length() > 0 ? ed_A4268_minutes.getText().toString().trim() : "-1");
        json.put("A4268_hours", ed_A4268_hours.getText().toString().trim().length() > 0 ? ed_A4268_hours.getText().toString().trim() : "-1");

        //A4269
        json.put("A4269", A4269_1.isChecked() ? "1"
                : A4269_2.isChecked() ? "2"
                : A426998.isChecked() ? "98"
                : "-1");

        //A4270
        json.put("A4270", A4270_1.isChecked() ? "1"
                : A4270_2.isChecked() ? "2"
                : A427098.isChecked() ? "98"
                : "-1");

        //A4271
        json.put("A4271", A4271_1.isChecked() ? "1"
                : A4271_2.isChecked() ? "2"
                : A4271_3.isChecked() ? "3"
                : A4271_4.isChecked() ? "4"
                : A4271_5.isChecked() ? "5"
                : A4271_6.isChecked() ? "6"
                : A4271_7.isChecked() ? "7"
                : A4271_8.isChecked() ? "8"
                : A4271_9.isChecked() ? "9"
                : A4271_10.isChecked() ? "10"
                : A4271_11.isChecked() ? "11"
                : A427198.isChecked() ? "98"
                : "-1");
        json.put("A4271_name", ed_A4271_name.getText().toString().trim().length() > 0 ? ed_A4271_name.getText().toString() : "-1");

        //A4272_1
        json.put("A4272_1", A4272_1_1.isChecked() ? "1"
                : A4272_1_2.isChecked() ? "2"
                : A4272_198.isChecked() ? "98"
                : "-1");

        //A4272_2
        json.put("A4272_2", A4272_2_1.isChecked() ? "1"
                : A4272_2_2.isChecked() ? "2"
                : A4272_298.isChecked() ? "98"
                : "-1");

        //A4273
        json.put("A4273", A4273_1.isChecked() ? "1"
                : A4273_2.isChecked() ? "2"
                : "-1");

        //A4274
        json.put("A4274", A4274_1.isChecked() ? "1"
                : A4274_2.isChecked() ? "2"
                : A427498.isChecked() ? "98"
                : "-1");

        //A4275
        json.put("A4275", A4275_1.isChecked() ? "1"
                : A4275_2.isChecked() ? "2"
                : A427598.isChecked() ? "98"
                : "-1");

        json.put("A4276_1", cb_A4276_1.isChecked() ? "1" : "-1");
        json.put("A4276_2", cb_A4276_2.isChecked() ? "2" : "-1");
        json.put("A4276_3", cb_A4276_3.isChecked() ? "3" : "-1");
        json.put("A4276_4", cb_A4276_4.isChecked() ? "4" : "-1");
        json.put("A4276_5", cb_A4276_5.isChecked() ? "5" : "-1");
        json.put("A4276_6", cb_A4276_6.isChecked() ? "6" : "-1");
        json.put("A4276_7", cb_A4276_7.isChecked() ? "7" : "-1");
        json.put("A4276_8", cb_A4276_8.isChecked() ? "8" : "-1");
        json.put("A4276_9", cb_A4276_9.isChecked() ? "9" : "-1");
        json.put("A4276_10", cb_A4276_10.isChecked() ? "10" : "-1");
        json.put("A4276_11", cb_A4276_11.isChecked() ? "11" : "-1");
        json.put("A4276_12", cb_A4276_12.isChecked() ? "12" : "-1");
        json.put("A4276_13", cb_A4276_13.isChecked() ? "13" : "-1");
        json.put("A4276_14", cb_A4276_11.isChecked() ? "14" : "-1");
        json.put("A4276_15", cb_A4276_12.isChecked() ? "15" : "-1");
        json.put("A4276_16", cb_A4276_13.isChecked() ? "16" : "-1");
        json.put("A427698", cb_A427698.isChecked() ? "98" : "-1");
        json.put("A4276_5_OT", ed_A4276_5.getText().toString().trim().length() > 0 ? ed_A4276_5.getText().toString().trim() : "-1");
        json.put("A4276_16_OT", ed_A4276_16.getText().toString().trim().length() > 0 ? ed_A4276_16.getText().toString().trim() : "-1");

        //A4277
        json.put("A4277", A4277_1.isChecked() ? "1"
                : A4277_2.isChecked() ? "2"
                : A427798.isChecked() ? "98"
                : "-1");

        json.put("A4278_1", cb_A4278_1.isChecked() ? "1" : "-1");
        json.put("A4278_2", cb_A4278_2.isChecked() ? "2" : "-1");
        json.put("A4278_3", cb_A4278_3.isChecked() ? "3" : "-1");
        json.put("A4278_4", cb_A4278_4.isChecked() ? "4" : "-1");
        json.put("A4278_5", cb_A4278_5.isChecked() ? "5" : "-1");
        json.put("A4278_6", cb_A4278_6.isChecked() ? "6" : "-1");
        json.put("A4278_7", cb_A4278_7.isChecked() ? "7" : "-1");
        json.put("A427898", cb_A427898.isChecked() ? "98" : "-1");

        json.put("A4279_1", cb_A4279_1.isChecked() ? "1" : "-1");
        json.put("A4279_2", cb_A4279_2.isChecked() ? "2" : "-1");
        json.put("A4279_3", cb_A4279_3.isChecked() ? "3" : "-1");
        json.put("A4279_4", cb_A4279_4.isChecked() ? "4" : "-1");
        json.put("A4279_5", cb_A4279_5.isChecked() ? "5" : "-1");
        json.put("A4279_6", cb_A4279_6.isChecked() ? "6" : "-1");
        json.put("A4279_7", cb_A4279_7.isChecked() ? "7" : "-1");
        json.put("A427998", cb_A427998.isChecked() ? "98" : "-1");

        //A4280
        json.put("A4280", A4280_1.isChecked() ? "1"
                : A4280_2.isChecked() ? "2"
                : A428098.isChecked() ? "98"
                : A428099.isChecked() ? "99"
                : "-1");

        //A4281
        json.put("A4281", A4281_1.isChecked() ? "1"
                : A4281_2.isChecked() ? "2"
                : A428198.isChecked() ? "98"
                : A428199.isChecked() ? "99"
                : "-1");

        //A4282
        json.put("A4282", A4282_1.isChecked() ? "1"
                : A4282_2.isChecked() ? "2"
                : A428298.isChecked() ? "98"
                : A428299.isChecked() ? "99"
                : "-1");

        //A4283
        json.put("A4283", A4283_1.isChecked() ? "1"
                : A4283_2.isChecked() ? "2"
                : A428398.isChecked() ? "98"
                : A428399.isChecked() ? "99"
                : "-1");


        json.put("A4284", ed_A4284_days.getText().toString().trim().length() > 0 ? ed_A4284_days.getText().toString().trim() : "-1");

        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());

        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

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
                + Global.A.A4251_A4284.A425598 + ","
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
                + Global.A.A4251_A4284.A4275 + ","
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
                + Global.A.A4251_A4284.A427698 + ","
                + Global.A.A4251_A4284.A4277 + ","
                + Global.A.A4251_A4284.A4278_1 + ","
                + Global.A.A4251_A4284.A4278_2 + ","
                + Global.A.A4251_A4284.A4278_3 + ","
                + Global.A.A4251_A4284.A4278_4 + ","
                + Global.A.A4251_A4284.A4278_5 + ","
                + Global.A.A4251_A4284.A4278_6 + ","
                + Global.A.A4251_A4284.A4278_7 + ","
                + Global.A.A4251_A4284.A427898 + ","
                + Global.A.A4251_A4284.A4279_1 + ","
                + Global.A.A4251_A4284.A4279_2 + ","
                + Global.A.A4251_A4284.A4279_3 + ","
                + Global.A.A4251_A4284.A4279_4 + ","
                + Global.A.A4251_A4284.A4279_5 + ","
                + Global.A.A4251_A4284.A4279_6 + ","
                + Global.A.A4251_A4284.A4279_7 + ","
                + Global.A.A4251_A4284.A427998 + ","
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
                A425598 + "','" +
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
                A4275 + "','" +
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
                A427698 + "','" +
                A4277 + "','" +
                A4278_1 + "','" +
                A4278_2 + "','" +
                A4278_3 + "','" +
                A4278_4 + "','" +
                A4278_5 + "','" +
                A4278_6 + "','" +
                A4278_7 + "','" +
                A427898 + "','" +
                A4279_1 + "','" +
                A4279_2 + "','" +
                A4279_3 + "','" +
                A4279_4 + "','" +
                A4279_5 + "','" +
                A4279_6 + "','" +
                A4279_7 + "','" +
                A427998 + "','" +
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


        String
                A4252_1,
                A4252_2,
                A4252_3,
                A4252_4;

        A4252_1 = "0";
        A4252_2 = "0";
        A4252_3 = "0";
        A4252_4 = "0";

        for (int i = 0; i < lst_phase.size(); i++)
        {
            A4252_1 = lst_phase.get(i);
            A4252_2 = lst_action.get(i);
            A4252_3 = lst_place.get(i);
            A4252_4 = lst_symtomps.get(i);


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

        if (Gothrough.IamHiden(cvstudy_id) == false) {
            return false;
        }
        if (Gothrough.IamHiden(cvA4251) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4253) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4254_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4254_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4255) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4256) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4257) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4258_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4258_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4259) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4260) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4261) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4262) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4263_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4263_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4264) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4266) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4267_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4267_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4268) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4269) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4270) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4271) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4272_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4272_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4273) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4274) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4275) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4276) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4277) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4278) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4279) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4280) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4281) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4282) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4283) == false) {
            return false;
        }

        return Gothrough.IamHiden(cvA4284) != false;
    }

    void smart(LinearLayout lv) {
        for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
            View view = lv.getChildAt(i);
            if (view instanceof CheckBox) {
                ((CheckBox) view).setOnCheckedChangeListener(this);
            }

        }
    }

}
