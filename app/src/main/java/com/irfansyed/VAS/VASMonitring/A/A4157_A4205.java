package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
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

public class A4157_A4205 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //Declaration
    Button
            btn_next9;

    LinearLayout
            cvstudy_id,
            cvA4157,
            cvA4158,
            cvA4159,
            cvA4160,
            cvA4161,
            cvA41611,
            cvA4162,
            cvA41631,
            cvA4163,
            cvA4164,
            cvA4166,
            cvA4167,
            cvA41681,
            cvA41683,
            cvA4168,
            cvA41731,
            cvA4173,
            cvA41732,
            cvA41781,
            cvA41782,
            cvA4178,
            cvA4179,
            cvA4180,
            cvA4181,
            cvA4182,
            cvA4183,
            cvA4184,
            cvA4185,
            cvA4186,
            cvA41861,
            cvA4187,
            cvA4188,
            cvA4189,
            cvA4190,
            cvA4191,
            cvA4192,
            cvA4193,
            cvA41931,
            cvA4194,
            cvA4195,
            cvA4196,
            cvA4197,
            cvA41981,
            cvA4198,
            cvA4200,
            cvA4202,
            cvA4203,
            cvA4204,
            cvA4205,
            cvA42051;

    RadioGroup A4163;

    RadioButton
            A4157a,
            A4157b,
            A415798,
            A415799,
            A4158a,
            A4158b,
            A415898,
            A415899,
            A4159a,
            A4159b,
            A415998,
            A415999,
            A4160a,
            A4160b,
            A416098,
            A416099,
            A4161a,
            A4161b,
            A416198,
            A416199,
            A41611a,
            A41611b,
            A4161198,
            A4161199,
            A4162a,
            A4162b,
            A416298,
            A416299,
            A41631a,
            A41631b,
            A4163198,
            A4163199,
            A4163a,
            A4163b,
            A416398,
            A416399,
            A41661,
            A41662,
            A416698,
            A416699,
            A41671,
            A41672,
            A416798,
            A416799,
            A41681a,
            A41681b,
            A4168198,
            A4168199,
            A41683a,
            A41683b,
            A4168398,
            A4168399,
            A4168a,
            A4168b,
            A416898,
            A416899,
            A41731a,
            A41731b,
            A4173198,
            A4173199,
            A4173a,
            A4173b,
            A417398,
            A417399,
            A41732a,
            A41732b,
            A4173298,
            A4173299,
            A41782a,
            A41782b,
            A4178298,
            A4178299,
            A4178a,
            A4178b,
            A417898,
            A417899,
            A4179a,
            A4179b,
            A417998,
            A417999,
            A4181a,
            A4181b,
            A418198,
            A418199,
            A4182_1,
            A4182_2,
            A418298,
            A418299,
            A4183_1,
            A4183_2,
            A418398,
            A418399,
            A4184_1,
            A4184_2,
            A418498,
            A418499,
            A4185_1,
            A4185_2,
            A418598,
            A418599,
            A4186_1,
            A4186_2,
            A418698,
            A418699,
            A41861a,
            A41861b,
            A4186_198,
            A4186_199,
            A4187_1,
            A4187_2,
            A418798,
            A418799,
            A4188_1,
            A4188_2,
            A418898,
            A418899,
            A4189_1,
            A4189_2,
            A418998,
            A418999,
            A4190_1,
            A4190_2,
            A419098,
            A419099,
            A4191_1,
            A4191_2,
            A419198,
            A419199,
            A4193_1,
            A4193_2,
            A419398,
            A419399,
            A41931a,
            A41931b,
            A41931c,
            A4193_1_4,
            A4193_198,
            A4193_199,
            A4194_1,
            A4194_2,
            A419498,
            A419499,
            A4195_1,
            A4195_2,
            A419598,
            A419599,
            A4196_1,
            A4196_2,
            A419698,
            A419699,
            A4197_1,
            A4197_2,
            A419798,
            A419799,
            A41981a,
            A41981b,
            A4198_198,
            A4198_199,
            A4198_1,
            A4198_2,
            A4198_3,
            A4198_4,
            A4198_5,
            A419898,
            A419899,
            A4200_1,
            A4200_2,
            A4200_3,
            A4200_4,
            A4200_5,
            A4200_6,
            A4200_7,
            A420098,
            A420099,
            A4202_1,
            A4202_2,
            A420298,
            A420299,
            A4203_1,
            A4203_2,
            A420398,
            A420399,
            A4204_1,
            A4204_2,
            A420498,
            A420499,
            A4205_1,
            A4205_2,
            A420598,
            A420599,
            A42051a,
            A42051b,
            A4205_198,
            A4205_199;

    EditText
            ed_study_id,
            A4164,
            A4178_1,
            A4180,
            A4192;

    String
            study_id,
            A4157,
            A4158,
            A4159,
            A4160,
            A4161,
            A41611,
            A4162,
            A41631,
            A4163,
            A4164,
            A4166,
            A4167,
            A4168_1,
            A4168_3,
            A4168,
            A4173_1,
            A4173,
            A4173_2,
            A4178_1,
            A4178_2,
            A4178,
            A4179,
            A4180,
            A4181,
            A4182,
            A4183,
            A4184,
            A4185,
            A4186,
            A4186_1,
            A4187,
            A4188,
            A4189,
            A4190,
            A4191,
            A4192,
            A4193,
            A4193_1,
            A4194,
            A4195,
            A4196,
            A4197,
            A4198_1,
            A4198,
            A4200,
            A4202,
            A4203,
            A4204,
            A4205,
            A4205_1,
            STATUS;

    //End DECLARATION
    private TextWatcher generalTextWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (ed_A4178_1.getText().hashCode() == s.hashCode()) {
                if (ed_A4178_1.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4178_1.getText().toString().trim()) > 0) {
                    ClearAllcontrol.ClearAll(cvA4178_2);
                    cvA4178_2.setVisibility(View.GONE);
                } else {
                    cvA4178_2.setVisibility(View.VISIBLE);
                }
            }

            if (ed_A4180.getText().hashCode() == s.hashCode()) {
                if (ed_A4180.getText().toString().trim().length() > 0 && Integer.parseInt(ed_A4180.getText().toString().trim()) < 1) {
                    ClearAllcontrol.ClearAll(cvA4181);
                    cvA4181.setVisibility(View.GONE);
                } else {
                    cvA4181.setVisibility(View.VISIBLE);
                }
            }
        }

    };

    @Override
    public void onClick(View view) {
        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(A4157_A4205.this, A4206_A4207.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4157__a4205);

        this.setTitle(getString(R.string.h_a_sec_9));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_calls();
    }

    void Initialization() {

        //Button
        btn_next9 = findViewById(R.id.btn_next9);

        Group_A4163 = findViewById(R.id.Group_A4163);

        //Linear Layout
        cvA4157 = findViewById(R.id.cvA4157);
        cvA4158 = findViewById(R.id.cvA4158);
        cvA4159 = findViewById(R.id.cvA4159);
        cvA4160 = findViewById(R.id.cvA4160);
        cvA4161 = findViewById(R.id.cvA4161);
        cvA41611 = findViewById(R.id.cvA41611);
        cvA4162 = findViewById(R.id.cvA4162);
        cvA41631 = findViewById(R.id.cvA41631);
        cvA4163 = findViewById(R.id.cvA4163);
        cvA4164 = findViewById(R.id.cvA4164);
        cvA4166 = findViewById(R.id.cvA4166);
        cvA4167 = findViewById(R.id.cvA4167);
        cvA4168_1 = findViewById(R.id.cvA4168_1);
        cvA4168_3 = findViewById(R.id.cvA4168_3);
        cvA4168 = findViewById(R.id.cvA4168);
        cvA4173_1 = findViewById(R.id.cvA4173_1);
        cvA4173 = findViewById(R.id.cvA4173);
        cvA4173_2 = findViewById(R.id.cvA4173_2);
        cvA4178_1 = findViewById(R.id.cvA4178_1);
        cvA4178_2 = findViewById(R.id.cvA4178_2);
        cvA4178 = findViewById(R.id.cvA4178);
        cvA4179 = findViewById(R.id.cvA4179);
        cvA4180 = findViewById(R.id.cvA4180);
        cvA4181 = findViewById(R.id.cvA4181);
        cvA4182 = findViewById(R.id.cvA4182);
        cvA4183 = findViewById(R.id.cvA4183);
        cvA4184 = findViewById(R.id.cvA4184);
        cvA4185 = findViewById(R.id.cvA4185);
        cvA4186 = findViewById(R.id.cvA4186);
        cvA4186_1 = findViewById(R.id.cvA4186_1);
        cvA4187 = findViewById(R.id.cvA4187);
        cvA4188 = findViewById(R.id.cvA4188);
        cvA4189 = findViewById(R.id.cvA4189);
        cvA4190 = findViewById(R.id.cvA4190);
        cvA4191 = findViewById(R.id.cvA4191);
        cvA4192 = findViewById(R.id.cvA4192);
        cvA4193 = findViewById(R.id.cvA4193);
        cvA4193_1 = findViewById(R.id.cvA4193_1);
        cvA4194 = findViewById(R.id.cvA4194);
        cvA4195 = findViewById(R.id.cvA4195);
        cvA4196 = findViewById(R.id.cvA4196);
        cvA4197 = findViewById(R.id.cvA4197);
        cvA4198_1 = findViewById(R.id.cvA4198_1);
        cvA4198 = findViewById(R.id.cvA4198);
        cvA4200 = findViewById(R.id.cvA4200);
        cvA4202 = findViewById(R.id.cvA4202);
        cvA4203 = findViewById(R.id.cvA4203);
        cvA4204 = findViewById(R.id.cvA4204);
        cvA4205 = findViewById(R.id.cvA4205);
        cvA4205_1 = findViewById(R.id.cvA4205_1);

        //Radio Button
        A4157_1 = findViewById(R.id.A4157_1);
        A4157_2 = findViewById(R.id.A4157_2);
        A415798 = findViewById(R.id.A415798);
        A415799 = findViewById(R.id.A415799);
        A4158_1 = findViewById(R.id.A4158_1);
        A4158_2 = findViewById(R.id.A4158_2);
        A415898 = findViewById(R.id.A415898);
        A415899 = findViewById(R.id.A415899);
        A4159_1 = findViewById(R.id.A4159_1);
        A4159_2 = findViewById(R.id.A4159_2);
        A415998 = findViewById(R.id.A415998);
        A415999 = findViewById(R.id.A415999);
        A4160_1 = findViewById(R.id.A4160_1);
        A4160_2 = findViewById(R.id.A4160_2);
        A416098 = findViewById(R.id.A416098);
        A416099 = findViewById(R.id.A416099);
        A41611 = findViewById(R.id.A41611);
        A4161_2 = findViewById(R.id.A4161_2);
        A416198 = findViewById(R.id.A416198);
        A416199 = findViewById(R.id.A416199);
        A41611a = findViewById(R.id.A41611a);
        A41611b = findViewById(R.id.A41611b);
        A4161198 = findViewById(R.id.A4161198);
        A4161199 = findViewById(R.id.A4161199);
        A4162_1 = findViewById(R.id.A4162_1);
        A4162_2 = findViewById(R.id.A4162_2);
        A416298 = findViewById(R.id.A416298);
        A416299 = findViewById(R.id.A416299);
        A41631a = findViewById(R.id.A41631a);
        A41631b = findViewById(R.id.A41631b);
        A4163198 = findViewById(R.id.A4163198);
        A4163199 = findViewById(R.id.A4163199);
        A41631 = findViewById(R.id.A41631);
        A4163_2 = findViewById(R.id.A4163_2);
        A416398 = findViewById(R.id.A416398);
        A416399 = findViewById(R.id.A416399);
        A4166_1 = findViewById(R.id.A4166_1);
        A4166_2 = findViewById(R.id.A4166_2);
        A416698 = findViewById(R.id.A416698);
        A416699 = findViewById(R.id.A416699);
        A4167_1 = findViewById(R.id.A4167_1);
        A4167_2 = findViewById(R.id.A4167_2);
        A416798 = findViewById(R.id.A416798);
        A416799 = findViewById(R.id.A416799);
        A41681a = findViewById(R.id.A41681a);
        A41681b = findViewById(R.id.A41681b);
        A4168_198 = findViewById(R.id.A4168_198);
        A4168_199 = findViewById(R.id.A4168_199);
        A4168_3_1 = findViewById(R.id.A4168_3_1);
        A4168_3_2 = findViewById(R.id.A4168_3_2);
        A4168_398 = findViewById(R.id.A4168_398);
        A4168_399 = findViewById(R.id.A4168_399);
        A4168_1 = findViewById(R.id.A4168_1);
        A4168_2 = findViewById(R.id.A4168_2);
        A416898 = findViewById(R.id.A416898);
        A416899 = findViewById(R.id.A416899);
        A41731a = findViewById(R.id.A41731a);
        A41731b = findViewById(R.id.A41731b);
        A4173_198 = findViewById(R.id.A4173_198);
        A4173_199 = findViewById(R.id.A4173_199);
        A4173_1 = findViewById(R.id.A4173_1);
        A4173_2 = findViewById(R.id.A4173_2);
        A417398 = findViewById(R.id.A417398);
        A417399 = findViewById(R.id.A417399);
        A4173_2_1 = findViewById(R.id.A4173_2_1);
        A4173_2_2 = findViewById(R.id.A4173_2_2);
        A4173_298 = findViewById(R.id.A4173_298);
        A4173_299 = findViewById(R.id.A4173_299);
        A4178_2_1 = findViewById(R.id.A4178_2_1);
        A4178_2_2 = findViewById(R.id.A4178_2_2);
        A4178_298 = findViewById(R.id.A4178_298);
        A4178_299 = findViewById(R.id.A4178_299);
        A4178_1 = findViewById(R.id.A4178_1);
        A4178_2 = findViewById(R.id.A4178_2);
        A417898 = findViewById(R.id.A417898);
        A417899 = findViewById(R.id.A417899);
        A4179_1 = findViewById(R.id.A4179_1);
        A4179_2 = findViewById(R.id.A4179_2);
        A417998 = findViewById(R.id.A417998);
        A417999 = findViewById(R.id.A417999);
        A4181_1 = findViewById(R.id.A4181_1);
        A4181_2 = findViewById(R.id.A4181_2);
        A418198 = findViewById(R.id.A418198);
        A418199 = findViewById(R.id.A418199);
        A4182_1 = findViewById(R.id.A4182_1);
        A4182_2 = findViewById(R.id.A4182_2);
        A418298 = findViewById(R.id.A418298);
        A418299 = findViewById(R.id.A418299);
        A4183_1 = findViewById(R.id.A4183_1);
        A4183_2 = findViewById(R.id.A4183_2);
        A418398 = findViewById(R.id.A418398);
        A418399 = findViewById(R.id.A418399);
        A4184_1 = findViewById(R.id.A4184_1);
        A4184_2 = findViewById(R.id.A4184_2);
        A418498 = findViewById(R.id.A418498);
        A418499 = findViewById(R.id.A418499);
        A4185_1 = findViewById(R.id.A4185_1);
        A4185_2 = findViewById(R.id.A4185_2);
        A418598 = findViewById(R.id.A418598);
        A418599 = findViewById(R.id.A418599);
        A4186_1 = findViewById(R.id.A4186_1);
        A4186_2 = findViewById(R.id.A4186_2);
        A418698 = findViewById(R.id.A418698);
        A418699 = findViewById(R.id.A418699);
        A41861a = findViewById(R.id.A41861a);
        A41861b = findViewById(R.id.A41861b);
        A4186_198 = findViewById(R.id.A4186_198);
        A4186_199 = findViewById(R.id.A4186_199);
        A4187_1 = findViewById(R.id.A4187_1);
        A4187_2 = findViewById(R.id.A4187_2);
        A418798 = findViewById(R.id.A418798);
        A418799 = findViewById(R.id.A418799);
        A4188_1 = findViewById(R.id.A4188_1);
        A4188_2 = findViewById(R.id.A4188_2);
        A418898 = findViewById(R.id.A418898);
        A418899 = findViewById(R.id.A418899);
        A4189_1 = findViewById(R.id.A4189_1);
        A4189_2 = findViewById(R.id.A4189_2);
        A418998 = findViewById(R.id.A418998);
        A418999 = findViewById(R.id.A418999);
        A4190_1 = findViewById(R.id.A4190_1);
        A4190_2 = findViewById(R.id.A4190_2);
        A419098 = findViewById(R.id.A419098);
        A419099 = findViewById(R.id.A419099);
        A4191_1 = findViewById(R.id.A4191_1);
        A4191_2 = findViewById(R.id.A4191_2);
        A419198 = findViewById(R.id.A419198);
        A419199 = findViewById(R.id.A419199);
        A4193_1 = findViewById(R.id.A4193_1);
        A4193_2 = findViewById(R.id.A4193_2);
        A419398 = findViewById(R.id.A419398);
        A419399 = findViewById(R.id.A419399);
        A41931a = findViewById(R.id.A41931a);
        A41931b = findViewById(R.id.A41931b);
        A41931c = findViewById(R.id.A41931c);
        A4193_1_4 = findViewById(R.id.A4193_1_4);
        A4193_198 = findViewById(R.id.A4193_198);
        A4193_199 = findViewById(R.id.A4193_199);
        A4194_1 = findViewById(R.id.A4194_1);
        A4194_2 = findViewById(R.id.A4194_2);
        A419498 = findViewById(R.id.A419498);
        A419499 = findViewById(R.id.A419499);
        A4195_1 = findViewById(R.id.A4195_1);
        A4195_2 = findViewById(R.id.A4195_2);
        A419598 = findViewById(R.id.A419598);
        A419599 = findViewById(R.id.A419599);
        A4196_1 = findViewById(R.id.A4196_1);
        A4196_2 = findViewById(R.id.A4196_2);
        A419698 = findViewById(R.id.A419698);
        A419699 = findViewById(R.id.A419699);
        A4197_1 = findViewById(R.id.A4197_1);
        A4197_2 = findViewById(R.id.A4197_2);
        A419798 = findViewById(R.id.A419798);
        A419799 = findViewById(R.id.A419799);
        A41981a = findViewById(R.id.A41981a);
        A41981b = findViewById(R.id.A41981b);
        A4198_198 = findViewById(R.id.A4198_198);
        A4198_199 = findViewById(R.id.A4198_199);
        A4198_1 = findViewById(R.id.A4198_1);
        A4198_2 = findViewById(R.id.A4198_2);
        A4198_3 = findViewById(R.id.A4198_3);
        A4198_4 = findViewById(R.id.A4198_4);
        A4198_5 = findViewById(R.id.A4198_5);
        A419898 = findViewById(R.id.A419898);
        A419899 = findViewById(R.id.A419899);
        A4200_1 = findViewById(R.id.A4200_1);
        A4200_2 = findViewById(R.id.A4200_2);
        A4200_3 = findViewById(R.id.A4200_3);
        A4200_4 = findViewById(R.id.A4200_4);
        A4200_5 = findViewById(R.id.A4200_5);
        A4200_6 = findViewById(R.id.A4200_6);
        A4200_7 = findViewById(R.id.A4200_7);
        A420098 = findViewById(R.id.A420098);
        A420099 = findViewById(R.id.A420099);
        A4202_1 = findViewById(R.id.A4202_1);
        A4202_2 = findViewById(R.id.A4202_2);
        A420298 = findViewById(R.id.A420298);
        A420299 = findViewById(R.id.A420299);
        A4203_1 = findViewById(R.id.A4203_1);
        A4203_2 = findViewById(R.id.A4203_2);
        A420398 = findViewById(R.id.A420398);
        A420399 = findViewById(R.id.A420399);
        A4204_1 = findViewById(R.id.A4204_1);
        A4204_2 = findViewById(R.id.A4204_2);
        A420498 = findViewById(R.id.A420498);
        A420499 = findViewById(R.id.A420499);
        A4205_1 = findViewById(R.id.A4205_1);
        A4205_2 = findViewById(R.id.A4205_2);
        A420598 = findViewById(R.id.A420598);
        A420599 = findViewById(R.id.A420599);
        A42051a = findViewById(R.id.A42051a);
        A42051b = findViewById(R.id.A42051b);
        A4205_198 = findViewById(R.id.A4205_198);
        A4205_199 = findViewById(R.id.A4205_199);

        // Edit Text
        ed_A4164 = findViewById(R.id.ed_A4164);
        ed_A4178_1 = findViewById(R.id.ed_A4178_1);
        ed_A4180 = findViewById(R.id.ed_A4180);
        ed_A4192 = findViewById(R.id.ed_A4192);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.A4159_1
                || compoundButton.getId() == R.id.A4159_2
                || compoundButton.getId() == R.id.A415998
                || compoundButton.getId() == R.id.A415999)

        {
            if (A4159_2.isChecked() || A415998.isChecked() || A415999.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4160);
                ClearAllcontrol.ClearAll(cvA4161);
                ClearAllcontrol.ClearAll(cvA41611);
                ClearAllcontrol.ClearAll(cvA4162);
                ClearAllcontrol.ClearAll(cvA41631);
                ClearAllcontrol.ClearAll(cvA4163);
                ClearAllcontrol.ClearAll(cvA4164);

                cvA4160.setVisibility(View.GONE);
                cvA4161.setVisibility(View.GONE);
                cvA41611.setVisibility(View.GONE);
                cvA4162.setVisibility(View.GONE);
                cvA41631.setVisibility(View.GONE);
                cvA4163.setVisibility(View.GONE);
                cvA4164.setVisibility(View.GONE);

            } else {
                cvA4160.setVisibility(View.VISIBLE);
                cvA4161.setVisibility(View.VISIBLE);
                cvA41611.setVisibility(View.VISIBLE);
                cvA4162.setVisibility(View.VISIBLE);
                cvA41631.setVisibility(View.VISIBLE);
                cvA4163.setVisibility(View.VISIBLE);
                cvA4164.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4160_1
                || compoundButton.getId() == R.id.A4160_2
                || compoundButton.getId() == R.id.A416098
                || compoundButton.getId() == R.id.A416099)

        {
            if (A4160_2.isChecked() || A416098.isChecked() || A416099.isChecked()) {

                ClearAllcontrol.ClearAll(cvA4161);
                cvA4161.setVisibility(View.GONE);

            } else {
                cvA4161.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4162_1
                || compoundButton.getId() == R.id.A4162_2
                || compoundButton.getId() == R.id.A416298
                || compoundButton.getId() == R.id.A416299)

        {
            if (A4162_2.isChecked() || A416298.isChecked() || A416299.isChecked()) {

                ClearAllcontrol.ClearAll(cvA41631);
                cvA41631.setVisibility(View.GONE);

            } else {
                cvA41631.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A41631
                || compoundButton.getId() == R.id.A4163_2
                || compoundButton.getId() == R.id.A416398
                || compoundButton.getId() == R.id.A416399)

        {
            if (A4163_2.isChecked() || A416398.isChecked() || A416399.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4164);

                cvA4164.setVisibility(View.GONE);

            } else {
                cvA4164.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4167_1
                || compoundButton.getId() == R.id.A4167_2
                || compoundButton.getId() == R.id.A416798
                || compoundButton.getId() == R.id.A416799)

        {
            if (A4167_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4168_1);
                ClearAllcontrol.ClearAll(cvA4168_3);
                ClearAllcontrol.ClearAll(cvA4168);
                ClearAllcontrol.ClearAll(cvA4173_1);
                ClearAllcontrol.ClearAll(cvA4173);
                ClearAllcontrol.ClearAll(cvA4173_2);

                cvA4168_1.setVisibility(View.GONE);
                cvA4168_3.setVisibility(View.GONE);
                cvA4168.setVisibility(View.GONE);
                cvA4173_1.setVisibility(View.GONE);
                cvA4173.setVisibility(View.GONE);
                cvA4173_2.setVisibility(View.GONE);

            } else {
                cvA4168_1.setVisibility(View.VISIBLE);
                cvA4168_3.setVisibility(View.VISIBLE);
                cvA4168.setVisibility(View.VISIBLE);
                cvA4173_1.setVisibility(View.VISIBLE);
                cvA4173.setVisibility(View.VISIBLE);
                cvA4173_2.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A41681a
                || compoundButton.getId() == R.id.A41681b
                || compoundButton.getId() == R.id.A4168_198
                || compoundButton.getId() == R.id.A4168_199)

        {
            if (A41681a.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4168_3);
                ClearAllcontrol.ClearAll(cvA4168);

                cvA4168_3.setVisibility(View.GONE);
                cvA4168.setVisibility(View.GONE);

            } else {
                cvA4168_3.setVisibility(View.VISIBLE);
                cvA4168.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4168_3_1
                || compoundButton.getId() == R.id.A4168_3_2
                || compoundButton.getId() == R.id.A4168_398
                || compoundButton.getId() == R.id.A4168_399)

        {
            if (A4168_3_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4168);

                cvA4168.setVisibility(View.GONE);

            } else {
                cvA4168.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4168_1
                || compoundButton.getId() == R.id.A4168_2
                || compoundButton.getId() == R.id.A416898
                || compoundButton.getId() == R.id.A416899)

        {
            if (A4168_2.isChecked() || A416898.isChecked() || A416899.isChecked()) {

                ClearAllcontrol.ClearAll(cvA4173_1);
                cvA4173_1.setVisibility(View.GONE);
            } else {
                cvA4173_1.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.A41731a
                || compoundButton.getId() == R.id.A41731b
                || compoundButton.getId() == R.id.A4173_198
                || compoundButton.getId() == R.id.A4173_199) {

            if (A41731a.isChecked() || A41731b.isChecked() || A4173_198.isChecked() || A4173_199.isChecked()) {

                ClearAllcontrol.ClearAll(cvA4173);
                ClearAllcontrol.ClearAll(cvA4173_2);
                ClearAllcontrol.ClearAll(cvA4178_1);
                ClearAllcontrol.ClearAll(cvA4178_2);

                cvA4173.setVisibility(View.GONE);
                cvA4173_2.setVisibility(View.GONE);
                cvA4178_1.setVisibility(View.GONE);
                cvA4178_2.setVisibility(View.GONE);
            } else {
                cvA4173.setVisibility(View.VISIBLE);
                cvA4173_2.setVisibility(View.VISIBLE);
                cvA4178_1.setVisibility(View.VISIBLE);
                cvA4178_2.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.A4173_1
                || compoundButton.getId() == R.id.A4173_2
                || compoundButton.getId() == R.id.A417398
                || compoundButton.getId() == R.id.A417399)

        {
            if (A4173_2.isChecked() || A417398.isChecked() || A417399.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4173_2);
                ClearAllcontrol.ClearAll(cvA4178_1);

                cvA4173_2.setVisibility(View.GONE);
                cvA4178_1.setVisibility(View.GONE);

            } else {
                cvA4173_2.setVisibility(View.VISIBLE);
                cvA4178_1.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.A4173_2_1
                || compoundButton.getId() == R.id.A4173_2_2
                || compoundButton.getId() == R.id.A4173_298
                || compoundButton.getId() == R.id.A4173_299) {

            if (A4173_2_1.isChecked() || A4173_2_2.isChecked() || A4173_298.isChecked() || A4173_299.isChecked()) {

                ClearAllcontrol.ClearAll(cvA4178_1);
                ClearAllcontrol.ClearAll(cvA4178_2);

                cvA4178_1.setVisibility(View.GONE);
                cvA4178_2.setVisibility(View.GONE);
            } else {
                cvA4178_1.setVisibility(View.VISIBLE);
                cvA4178_2.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4178_2_1
                || compoundButton.getId() == R.id.A4178_2_2
                || compoundButton.getId() == R.id.A4178_298
                || compoundButton.getId() == R.id.A4178_299) {


            if (A4178_2_1.isChecked() || A4178_299.isChecked()) {

                ClearAllcontrol.ClearAll(cvA4178_1);
                ClearAllcontrol.ClearAll(cvA4178);
                ClearAllcontrol.ClearAll(cvA4179);
                ClearAllcontrol.ClearAll(cvA4180);
                ClearAllcontrol.ClearAll(cvA4181);
                ClearAllcontrol.ClearAll(cvA4182);
                ClearAllcontrol.ClearAll(cvA4183);
                ClearAllcontrol.ClearAll(cvA4184);
                ClearAllcontrol.ClearAll(cvA4185);
                ClearAllcontrol.ClearAll(cvA4186);
                ClearAllcontrol.ClearAll(cvA4186_1);
                ClearAllcontrol.ClearAll(cvA4187);
                ClearAllcontrol.ClearAll(cvA4188);
                ClearAllcontrol.ClearAll(cvA4189);
                ClearAllcontrol.ClearAll(cvA4190);
                ClearAllcontrol.ClearAll(cvA4191);
                ClearAllcontrol.ClearAll(cvA4192);
                ClearAllcontrol.ClearAll(cvA4193);
                ClearAllcontrol.ClearAll(cvA4193_1);
                ClearAllcontrol.ClearAll(cvA4194);
                ClearAllcontrol.ClearAll(cvA4195);
                ClearAllcontrol.ClearAll(cvA4196);
                ClearAllcontrol.ClearAll(cvA4197);
                ClearAllcontrol.ClearAll(cvA4198_1);
                ClearAllcontrol.ClearAll(cvA4198);
                ClearAllcontrol.ClearAll(cvA4200);
                ClearAllcontrol.ClearAll(cvA4202);
                ClearAllcontrol.ClearAll(cvA4203);
                ClearAllcontrol.ClearAll(cvA4204);
                ClearAllcontrol.ClearAll(cvA4205);
                ClearAllcontrol.ClearAll(cvA4205_1);

                cvA4178_1.setVisibility(View.GONE);
                cvA4178.setVisibility(View.GONE);
                cvA4179.setVisibility(View.GONE);
                cvA4180.setVisibility(View.GONE);
                cvA4181.setVisibility(View.GONE);
                cvA4182.setVisibility(View.GONE);
                cvA4183.setVisibility(View.GONE);
                cvA4184.setVisibility(View.GONE);
                cvA4185.setVisibility(View.GONE);
                cvA4186.setVisibility(View.GONE);
                cvA4186_1.setVisibility(View.GONE);
                cvA4187.setVisibility(View.GONE);
                cvA4188.setVisibility(View.GONE);
                cvA4189.setVisibility(View.GONE);
                cvA4190.setVisibility(View.GONE);
                cvA4191.setVisibility(View.GONE);
                cvA4192.setVisibility(View.GONE);
                cvA4193.setVisibility(View.GONE);
                cvA4193_1.setVisibility(View.GONE);
                cvA4194.setVisibility(View.GONE);
                cvA4195.setVisibility(View.GONE);
                cvA4196.setVisibility(View.GONE);
                cvA4197.setVisibility(View.GONE);
                cvA4198_1.setVisibility(View.GONE);
                cvA4198.setVisibility(View.GONE);
                cvA4200.setVisibility(View.GONE);
                cvA4202.setVisibility(View.GONE);
                cvA4203.setVisibility(View.GONE);
                cvA4204.setVisibility(View.GONE);
                cvA4205.setVisibility(View.GONE);
                cvA4205_1.setVisibility(View.GONE);

            } else {
                cvA4178_1.setVisibility(View.VISIBLE);
                cvA4178.setVisibility(View.VISIBLE);
                cvA4179.setVisibility(View.VISIBLE);
                cvA4180.setVisibility(View.VISIBLE);
                cvA4181.setVisibility(View.VISIBLE);
                cvA4182.setVisibility(View.VISIBLE);
                cvA4183.setVisibility(View.VISIBLE);
                cvA4184.setVisibility(View.VISIBLE);
                cvA4185.setVisibility(View.VISIBLE);
                cvA4186.setVisibility(View.VISIBLE);
                cvA4186_1.setVisibility(View.VISIBLE);
                cvA4187.setVisibility(View.VISIBLE);
                cvA4188.setVisibility(View.VISIBLE);
                cvA4189.setVisibility(View.VISIBLE);
                cvA4190.setVisibility(View.VISIBLE);
                cvA4191.setVisibility(View.VISIBLE);
                cvA4192.setVisibility(View.VISIBLE);
                cvA4193.setVisibility(View.VISIBLE);
                cvA4193_1.setVisibility(View.VISIBLE);
                cvA4194.setVisibility(View.VISIBLE);
                cvA4195.setVisibility(View.VISIBLE);
                cvA4196.setVisibility(View.VISIBLE);
                cvA4197.setVisibility(View.VISIBLE);
                cvA4198_1.setVisibility(View.VISIBLE);
                cvA4198.setVisibility(View.VISIBLE);
                cvA4200.setVisibility(View.VISIBLE);
                cvA4202.setVisibility(View.VISIBLE);
                cvA4203.setVisibility(View.VISIBLE);
                cvA4204.setVisibility(View.VISIBLE);
                cvA4205.setVisibility(View.VISIBLE);
                cvA4205_1.setVisibility(View.VISIBLE);
            }

            if (A4178_2_2.isChecked() || A4178_298.isChecked()) {
                cvA4163.requestChildFocus(A41631, cvA4163);
            } else {

                cvA4178_2.requestChildFocus(A4178_2_1, cvA4178_2);
            }
        }


        if (compoundButton.getId() == R.id.A4194_1
                || compoundButton.getId() == R.id.A4194_2
                || compoundButton.getId() == R.id.A419498
                || compoundButton.getId() == R.id.A419499)

        {
            if (A4194_2.isChecked() || A419498.isChecked() || A419499.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4195);
                ClearAllcontrol.ClearAll(cvA4196);
                ClearAllcontrol.ClearAll(cvA4197);
                ClearAllcontrol.ClearAll(cvA4198_1);

                cvA4195.setVisibility(View.GONE);
                cvA4196.setVisibility(View.GONE);
                cvA4197.setVisibility(View.GONE);
                cvA4198_1.setVisibility(View.GONE);

            } else {
                cvA4195.setVisibility(View.VISIBLE);
                cvA4196.setVisibility(View.VISIBLE);
                cvA4197.setVisibility(View.VISIBLE);
                cvA4198_1.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4195_1
                || compoundButton.getId() == R.id.A4195_2
                || compoundButton.getId() == R.id.A419598
                || compoundButton.getId() == R.id.A419599)

        {
            if (A4195_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4196);
                ClearAllcontrol.ClearAll(cvA4197);

                cvA4196.setVisibility(View.GONE);
                cvA4197.setVisibility(View.GONE);

            } else {
                cvA4196.setVisibility(View.VISIBLE);
                cvA4197.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4196_1
                || compoundButton.getId() == R.id.A4196_2
                || compoundButton.getId() == R.id.A419698
                || compoundButton.getId() == R.id.A419699)

        {
            if (A4196_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4197);

                cvA4197.setVisibility(View.GONE);

            } else {
                cvA4197.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4200_1
                || compoundButton.getId() == R.id.A4200_2
                || compoundButton.getId() == R.id.A4200_3
                || compoundButton.getId() == R.id.A4200_4
                || compoundButton.getId() == R.id.A4200_5
                || compoundButton.getId() == R.id.A4200_6
                || compoundButton.getId() == R.id.A4200_7
                || compoundButton.getId() == R.id.A420098
                || compoundButton.getId() == R.id.A420099)

        {
            if (A4194_1.isChecked() || A4195_1.isChecked() || A4196_1.isChecked() || A4197_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4202);
                ClearAllcontrol.ClearAll(cvA4203);
                ClearAllcontrol.ClearAll(cvA4204);
                ClearAllcontrol.ClearAll(cvA4205);

                cvA4202.setVisibility(View.GONE);
                cvA4203.setVisibility(View.GONE);
                cvA4204.setVisibility(View.GONE);
                cvA4205.setVisibility(View.GONE);

            } else {
                cvA4202.setVisibility(View.VISIBLE);
                cvA4203.setVisibility(View.VISIBLE);
                cvA4204.setVisibility(View.VISIBLE);
                cvA4205.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4202_1
                || compoundButton.getId() == R.id.A4202_2
                || compoundButton.getId() == R.id.A420298
                || compoundButton.getId() == R.id.A420299)

        {
            if (A4202_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4203);
                ClearAllcontrol.ClearAll(cvA4204);

                cvA4203.setVisibility(View.GONE);
                cvA4204.setVisibility(View.GONE);

            } else {
                cvA4203.setVisibility(View.VISIBLE);
                cvA4204.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A4203_1
                || compoundButton.getId() == R.id.A4203_2
                || compoundButton.getId() == R.id.A420398
                || compoundButton.getId() == R.id.A420399)

        {
            if (A4203_1.isChecked()) {
                ClearAllcontrol.ClearAll(cvA4204);

                cvA4204.setVisibility(View.GONE);

            } else {
                cvA4204.setVisibility(View.VISIBLE);
            }
        }

    }

    private void events_calls() {

        btn_next9.setOnClickListener(this);

        A4159_1.setOnCheckedChangeListener(this);
        A4159_2.setOnCheckedChangeListener(this);
        A415998.setOnCheckedChangeListener(this);
        A415999.setOnCheckedChangeListener(this);
        A4160_1.setOnCheckedChangeListener(this);
        A4160_2.setOnCheckedChangeListener(this);
        A416098.setOnCheckedChangeListener(this);
        A416099.setOnCheckedChangeListener(this);
        A4162_1.setOnCheckedChangeListener(this);
        A4162_2.setOnCheckedChangeListener(this);
        A416298.setOnCheckedChangeListener(this);
        A416299.setOnCheckedChangeListener(this);
        A41631a.setOnCheckedChangeListener(this);
        A41631b.setOnCheckedChangeListener(this);
        A4163198.setOnCheckedChangeListener(this);
        A4163199.setOnCheckedChangeListener(this);
        A41631.setOnCheckedChangeListener(this);
        A4163_2.setOnCheckedChangeListener(this);
        A416398.setOnCheckedChangeListener(this);
        A416399.setOnCheckedChangeListener(this);
        A4167_1.setOnCheckedChangeListener(this);
        A4167_2.setOnCheckedChangeListener(this);
        A416798.setOnCheckedChangeListener(this);
        A416799.setOnCheckedChangeListener(this);
        A41681a.setOnCheckedChangeListener(this);
        A41681b.setOnCheckedChangeListener(this);
        A4168_198.setOnCheckedChangeListener(this);
        A4168_199.setOnCheckedChangeListener(this);
        A4168_3_1.setOnCheckedChangeListener(this);
        A4168_3_2.setOnCheckedChangeListener(this);
        A4168_398.setOnCheckedChangeListener(this);
        A4168_399.setOnCheckedChangeListener(this);
        A4168_1.setOnCheckedChangeListener(this);
        A4168_2.setOnCheckedChangeListener(this);
        A416898.setOnCheckedChangeListener(this);
        A416899.setOnCheckedChangeListener(this);
        A41731a.setOnCheckedChangeListener(this);
        A41731b.setOnCheckedChangeListener(this);
        A4173_198.setOnCheckedChangeListener(this);
        A4173_199.setOnCheckedChangeListener(this);
        A4173_1.setOnCheckedChangeListener(this);
        A4173_2.setOnCheckedChangeListener(this);
        A417398.setOnCheckedChangeListener(this);
        A417399.setOnCheckedChangeListener(this);
        A4173_2_1.setOnCheckedChangeListener(this);
        A4173_2_2.setOnCheckedChangeListener(this);
        A4173_298.setOnCheckedChangeListener(this);
        A4173_299.setOnCheckedChangeListener(this);
        A4178_2_1.setOnCheckedChangeListener(this);
        A4178_2_2.setOnCheckedChangeListener(this);
        A4178_298.setOnCheckedChangeListener(this);
        A4178_299.setOnCheckedChangeListener(this);
        A4178_1.setOnCheckedChangeListener(this);
        A4178_2.setOnCheckedChangeListener(this);
        A417898.setOnCheckedChangeListener(this);
        A417899.setOnCheckedChangeListener(this);
        A4186_1.setOnCheckedChangeListener(this);
        A4186_2.setOnCheckedChangeListener(this);
        A418698.setOnCheckedChangeListener(this);
        A418699.setOnCheckedChangeListener(this);
        A4193_1.setOnCheckedChangeListener(this);
        A4193_2.setOnCheckedChangeListener(this);
        A419398.setOnCheckedChangeListener(this);
        A419399.setOnCheckedChangeListener(this);
        A4194_1.setOnCheckedChangeListener(this);
        A4194_2.setOnCheckedChangeListener(this);
        A419498.setOnCheckedChangeListener(this);
        A419499.setOnCheckedChangeListener(this);
        A4195_1.setOnCheckedChangeListener(this);
        A4195_2.setOnCheckedChangeListener(this);
        A419598.setOnCheckedChangeListener(this);
        A419599.setOnCheckedChangeListener(this);
        A4196_1.setOnCheckedChangeListener(this);
        A4196_2.setOnCheckedChangeListener(this);
        A419698.setOnCheckedChangeListener(this);
        A419699.setOnCheckedChangeListener(this);
        A4200_1.setOnCheckedChangeListener(this);
        A4200_2.setOnCheckedChangeListener(this);
        A4200_3.setOnCheckedChangeListener(this);
        A4200_4.setOnCheckedChangeListener(this);
        A4200_5.setOnCheckedChangeListener(this);
        A4200_6.setOnCheckedChangeListener(this);
        A4200_7.setOnCheckedChangeListener(this);
        A420098.setOnCheckedChangeListener(this);
        A420099.setOnCheckedChangeListener(this);
        A4202_1.setOnCheckedChangeListener(this);
        A4202_2.setOnCheckedChangeListener(this);
        A420298.setOnCheckedChangeListener(this);
        A420299.setOnCheckedChangeListener(this);
        A4203_1.setOnCheckedChangeListener(this);
        A4203_2.setOnCheckedChangeListener(this);
        A420398.setOnCheckedChangeListener(this);
        A420399.setOnCheckedChangeListener(this);

        ed_A4178_1.addTextChangedListener(generalTextWatcher);

        ed_A4178_1.setFilters(new InputFilter[]{new InputFilterMinMax(1, 10, 99, 99)});

    }

    void value_assignment() {

        study_id = "0";
        A4157 = "-1";
        A4158 = "-1";
        A4159 = "-1";
        A4160 = "-1";
        A4161 = "-1";
        A41611 = "-1";
        A4162 = "-1";
        A41631 = "-1";
        A4163 = "-1";
        A4164 = "-1";
        A4166 = "-1";
        A4167 = "-1";
        A4168_1 = "-1";
        A4168_3 = "-1";
        A4168 = "-1";
        A4173_1 = "-1";
        A4173 = "-1";
        A4173_2 = "-1";
        A4178_1 = "-1";
        A4178_2 = "-1";
        A4178 = "-1";
        A4179 = "-1";
        A4180 = "-1";
        A4181 = "-1";
        A4182 = "-1";
        A4183 = "-1";
        A4184 = "-1";
        A4185 = "-1";
        A4186 = "-1";
        A4186_1 = "-1";
        A4187 = "-1";
        A4188 = "-1";
        A4189 = "-1";
        A4190 = "-1";
        A4191 = "-1";
        A4192 = "-1";
        A4193 = "-1";
        A4193_1 = "-1";
        A4194 = "-1";
        A4195 = "-1";
        A4196 = "-1";
        A4197 = "-1";
        A4198_1 = "-1";
        A4198 = "-1";
        A4200 = "-1";
        A4202 = "-1";
        A4203 = "-1";
        A4204 = "-1";
        A4205 = "-1";
        A4205_1 = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        //A4157
        if (A4157_1.isChecked()) {
            A4157 = "1";
        }
        if (A4157_2.isChecked()) {
            A4157 = "2";
        }
        if (A415798.isChecked()) {
            A4157 = "9";
        }
        if (A415799.isChecked()) {
            A4157 = "8";
        }

        //A4158
        if (A4158_1.isChecked()) {
            A4158 = "1";
        }
        if (A4158_2.isChecked()) {
            A4158 = "2";
        }
        if (A415898.isChecked()) {
            A4158 = "9";
        }
        if (A415899.isChecked()) {
            A4158 = "8";
        }

        //A4159
        if (A4159_1.isChecked()) {
            A4159 = "1";
        }
        if (A4159_2.isChecked()) {
            A4159 = "2";
        }
        if (A415998.isChecked()) {
            A4159 = "9";
        }
        if (A415999.isChecked()) {
            A4159 = "8";
        }

        //A4160
        if (A4160_1.isChecked()) {
            A4160 = "1";
        }
        if (A4160_2.isChecked()) {
            A4160 = "2";
        }
        if (A416098.isChecked()) {
            A4160 = "9";
        }
        if (A416099.isChecked()) {
            A4160 = "8";
        }

        //A4161
        if (A41611.isChecked()) {
            A4161 = "1";
        }
        if (A4161_2.isChecked()) {
            A4161 = "2";
        }
        if (A416198.isChecked()) {
            A4161 = "9";
        }
        if (A416199.isChecked()) {
            A4161 = "8";
        }

        //A41611
        if (A41611a.isChecked()) {
            A41611 = "1";
        }
        if (A41611b.isChecked()) {
            A41611 = "2";
        }
        if (A4161198.isChecked()) {
            A41611 = "9";
        }
        if (A4161199.isChecked()) {
            A41611 = "8";
        }

        //A4162
        if (A4162_1.isChecked()) {
            A4162 = "1";
        }
        if (A4162_2.isChecked()) {
            A4162 = "2";
        }
        if (A416298.isChecked()) {
            A4162 = "9";
        }
        if (A416299.isChecked()) {
            A4162 = "8";
        }

        //A41631
        if (A41631a.isChecked()) {
            A41631 = "1";
        }
        if (A41631b.isChecked()) {
            A41631 = "2";
        }
        if (A4163198.isChecked()) {
            A41631 = "9";
        }
        if (A4163199.isChecked()) {
            A41631 = "8";
        }

        //A4163
        if (A41631.isChecked()) {
            A4163 = "1";
        }
        if (A4163_2.isChecked()) {
            A4163 = "2";
        }
        if (A416398.isChecked()) {
            A4163 = "9";
        }
        if (A416399.isChecked()) {
            A4163 = "8";
        }

        //A4164
        if (ed_A4164.getText().toString().trim().length() > 0) {
            A4164 = ed_A4164.getText().toString().trim();
        }

        //A4166
        if (A4166_1.isChecked()) {
            A4166 = "1";
        }
        if (A4166_2.isChecked()) {
            A4166 = "2";
        }
        if (A416698.isChecked()) {
            A4166 = "9";
        }
        if (A416699.isChecked()) {
            A4166 = "8";
        }

        //A4167
        if (A4167_1.isChecked()) {
            A4167 = "1";
        }
        if (A4167_2.isChecked()) {
            A4167 = "2";
        }
        if (A416798.isChecked()) {
            A4167 = "9";
        }
        if (A416799.isChecked()) {
            A4167 = "8";
        }

        //A4168_1
        if (A41681a.isChecked()) {
            A4168_1 = "1";
        }
        if (A41681b.isChecked()) {
            A4168_1 = "2";
        }
        if (A4168_198.isChecked()) {
            A4168_1 = "9";
        }
        if (A4168_199.isChecked()) {
            A4168_1 = "8";
        }

        //A4168_3
        if (A4168_3_1.isChecked()) {
            A4168_3 = "1";
        }
        if (A4168_3_2.isChecked()) {
            A4168_3 = "2";
        }
        if (A4168_398.isChecked()) {
            A4168_3 = "9";
        }
        if (A4168_399.isChecked()) {
            A4168_3 = "8";
        }

        //A4168
        if (A4168_1.isChecked()) {
            A4168 = "1";
        }
        if (A4168_2.isChecked()) {
            A4168 = "2";
        }
        if (A416898.isChecked()) {
            A4168 = "9";
        }
        if (A416899.isChecked()) {
            A4168 = "8";
        }

        //A4173_1
        if (A41731a.isChecked()) {
            A4173_1 = "1";
        }
        if (A41731b.isChecked()) {
            A4173_1 = "2";
        }
        if (A4173_198.isChecked()) {
            A4173_1 = "9";
        }
        if (A4173_199.isChecked()) {
            A4173_1 = "8";
        }

        //A4173
        if (A4173_1.isChecked()) {
            A4173 = "1";
        }
        if (A4173_2.isChecked()) {
            A4173 = "2";
        }
        if (A417398.isChecked()) {
            A4173 = "9";
        }
        if (A417399.isChecked()) {
            A4173 = "8";
        }

        //A4173_2
        if (A4173_2_1.isChecked()) {
            A4173_2 = "1";
        }
        if (A4173_2_2.isChecked()) {
            A4173_2 = "2";
        }
        if (A4173_298.isChecked()) {
            A4173_2 = "9";
        }
        if (A4173_299.isChecked()) {
            A4173_2 = "8";
        }

        //A4178_1
        if (ed_A4178_1.getText().toString().trim().length() > 0) {
            A4178_1 = ed_A4178_1.getText().toString().trim();
        }

        //A4178_2
        if (A4178_2_1.isChecked()) {
            A4178_2 = "1";
        }
        if (A4178_2_2.isChecked()) {
            A4178_2 = "2";
        }
        if (A4178_298.isChecked()) {
            A4178_2 = "9";
        }
        if (A4178_299.isChecked()) {
            A4178_2 = "8";
        }

        //A4178
        if (A4178_1.isChecked()) {
            A4178 = "1";
        }
        if (A4178_2.isChecked()) {
            A4178 = "2";
        }
        if (A417898.isChecked()) {
            A4178 = "9";
        }
        if (A417899.isChecked()) {
            A4178 = "8";
        }

        //A4179
        if (A4179_1.isChecked()) {
            A4179 = "1";
        }
        if (A4179_2.isChecked()) {
            A4179 = "2";
        }
        if (A417998.isChecked()) {
            A4179 = "9";
        }
        if (A417999.isChecked()) {
            A4179 = "8";
        }

        //A4180
        if (ed_A4180.getText().toString().trim().length() > 0) {
            A4180 = ed_A4180.getText().toString().trim();
        }

        //A4181
        if (A4181_1.isChecked()) {
            A4181 = "1";
        }
        if (A4181_2.isChecked()) {
            A4181 = "2";
        }
        if (A418198.isChecked()) {
            A4181 = "9";
        }
        if (A418199.isChecked()) {
            A4181 = "8";
        }

        //A4182
        if (A4182_1.isChecked()) {
            A4182 = "1";
        }
        if (A4182_2.isChecked()) {
            A4182 = "2";
        }
        if (A418298.isChecked()) {
            A4182 = "9";
        }
        if (A418299.isChecked()) {
            A4182 = "8";
        }

        //A4183
        if (A4183_1.isChecked()) {
            A4183 = "1";
        }
        if (A4183_2.isChecked()) {
            A4183 = "2";
        }
        if (A418398.isChecked()) {
            A4183 = "9";
        }
        if (A418399.isChecked()) {
            A4183 = "8";
        }

        //A4184
        if (A4184_1.isChecked()) {
            A4184 = "1";
        }
        if (A4184_2.isChecked()) {
            A4184 = "2";
        }
        if (A418498.isChecked()) {
            A4184 = "9";
        }
        if (A418499.isChecked()) {
            A4184 = "8";
        }

        //A4185
        if (A4185_1.isChecked()) {
            A4185 = "1";
        }
        if (A4185_2.isChecked()) {
            A4185 = "2";
        }
        if (A418598.isChecked()) {
            A4185 = "9";
        }
        if (A418599.isChecked()) {
            A4185 = "8";
        }

        //A4186
        if (A4186_1.isChecked()) {
            A4186 = "1";
        }
        if (A4186_2.isChecked()) {
            A4186 = "2";
        }
        if (A418698.isChecked()) {
            A4186 = "9";
        }
        if (A418699.isChecked()) {
            A4186 = "8";
        }

        //A4186_1
        if (A41861a.isChecked()) {
            A4186_1 = "1";
        }
        if (A41861b.isChecked()) {
            A4186_1 = "2";
        }
        if (A4186_198.isChecked()) {
            A4186_1 = "9";
        }
        if (A4186_199.isChecked()) {
            A4186_1 = "8";
        }

        //A4187
        if (A4187_1.isChecked()) {
            A4187 = "1";
        }
        if (A4187_2.isChecked()) {
            A4187 = "2";
        }
        if (A418798.isChecked()) {
            A4187 = "9";
        }
        if (A418799.isChecked()) {
            A4187 = "8";
        }

        //A4188
        if (A4188_1.isChecked()) {
            A4188 = "1";
        }
        if (A4188_2.isChecked()) {
            A4188 = "2";
        }
        if (A418898.isChecked()) {
            A4188 = "9";
        }
        if (A418899.isChecked()) {
            A4188 = "8";
        }

        //A4189
        if (A4189_1.isChecked()) {
            A4189 = "1";
        }
        if (A4189_2.isChecked()) {
            A4189 = "2";
        }
        if (A418998.isChecked()) {
            A4189 = "9";
        }
        if (A418999.isChecked()) {
            A4189 = "8";
        }

        //A4190
        if (A4190_1.isChecked()) {
            A4190 = "1";
        }
        if (A4190_2.isChecked()) {
            A4190 = "2";
        }
        if (A419098.isChecked()) {
            A4190 = "9";
        }
        if (A419099.isChecked()) {
            A4190 = "8";
        }

        //A4191
        if (A4191_1.isChecked()) {
            A4191 = "1";
        }
        if (A4191_2.isChecked()) {
            A4191 = "2";
        }
        if (A419198.isChecked()) {
            A4191 = "9";
        }
        if (A419199.isChecked()) {
            A4191 = "8";
        }

        //A4192
        if (ed_A4192.getText().toString().trim().length() > 0) {
            A4192 = ed_A4192.getText().toString().trim();
        }

        //A4193
        if (A4193_1.isChecked()) {
            A4193 = "1";
        }
        if (A4193_2.isChecked()) {
            A4193 = "2";
        }
        if (A419398.isChecked()) {
            A4193 = "9";
        }
        if (A419399.isChecked()) {
            A4193 = "8";
        }

        //A4193_1
        if (A41931a.isChecked()) {
            A4193_1 = "1";
        }
        if (A41931b.isChecked()) {
            A4193_1 = "2";
        }
        if (A41931c.isChecked()) {
            A4193_1 = "3";
        }
        if (A4193_1_4.isChecked()) {
            A4193_1 = "4";
        }
        if (A4193_198.isChecked()) {
            A4193_1 = "9";
        }
        if (A4193_199.isChecked()) {
            A4193_1 = "8";
        }

        //A4194
        if (A4194_1.isChecked()) {
            A4194 = "1";
        }
        if (A4194_2.isChecked()) {
            A4194 = "2";
        }
        if (A419498.isChecked()) {
            A4194 = "9";
        }
        if (A419499.isChecked()) {
            A4194 = "8";
        }

        //A4195
        if (A4195_1.isChecked()) {
            A4195 = "1";
        }
        if (A4195_2.isChecked()) {
            A4195 = "2";
        }
        if (A419598.isChecked()) {
            A4195 = "9";
        }
        if (A419599.isChecked()) {
            A4195 = "8";
        }

        //A4196
        if (A4196_1.isChecked()) {
            A4196 = "1";
        }
        if (A4196_2.isChecked()) {
            A4196 = "2";
        }
        if (A419698.isChecked()) {
            A4196 = "9";
        }
        if (A419699.isChecked()) {
            A4196 = "8";
        }

        //A4197
        if (A4197_1.isChecked()) {
            A4197 = "1";
        }
        if (A4197_2.isChecked()) {
            A4197 = "2";
        }
        if (A419798.isChecked()) {
            A4197 = "9";
        }
        if (A419799.isChecked()) {
            A4197 = "8";
        }

        //A4198_1
        if (A41981a.isChecked()) {
            A4198_1 = "1";
        }
        if (A41981b.isChecked()) {
            A4198_1 = "2";
        }
        if (A4198_198.isChecked()) {
            A4198_1 = "9";
        }
        if (A4198_199.isChecked()) {
            A4198_1 = "8";
        }

        //A4198
        if (A4198_1.isChecked()) {
            A4198 = "1";
        }
        if (A4198_2.isChecked()) {
            A4198 = "2";
        }
        if (A4198_3.isChecked()) {
            A4198 = "3";
        }
        if (A4198_4.isChecked()) {
            A4198 = "4";
        }
        if (A4198_5.isChecked()) {
            A4198 = "5";
        }
        if (A419898.isChecked()) {
            A4198 = "9";
        }
        if (A419899.isChecked()) {
            A4198 = "8";
        }

        //A4200
        if (A4200_1.isChecked()) {
            A4200 = "1";
        }
        if (A4200_2.isChecked()) {
            A4200 = "2";
        }
        if (A4200_3.isChecked()) {
            A4200 = "3";
        }
        if (A4200_4.isChecked()) {
            A4200 = "4";
        }
        if (A4200_5.isChecked()) {
            A4200 = "5";
        }
        if (A4200_6.isChecked()) {
            A4200 = "6";
        }
        if (A4200_7.isChecked()) {
            A4200 = "7";
        }
        if (A420098.isChecked()) {
            A4200 = "9";
        }
        if (A420099.isChecked()) {
            A4200 = "8";
        }

        //A4202
        if (A4202_1.isChecked()) {
            A4202 = "1";
        }
        if (A4202_2.isChecked()) {
            A4202 = "2";
        }
        if (A420298.isChecked()) {
            A4202 = "9";
        }
        if (A420299.isChecked()) {
            A4202 = "8";
        }

        //A4203
        if (A4203_1.isChecked()) {
            A4203 = "1";
        }
        if (A4203_2.isChecked()) {
            A4203 = "2";
        }
        if (A420398.isChecked()) {
            A4203 = "9";
        }
        if (A420399.isChecked()) {
            A4203 = "8";
        }

        //A4204
        if (A4204_1.isChecked()) {
            A4204 = "1";
        }
        if (A4204_2.isChecked()) {
            A4204 = "2";
        }
        if (A420498.isChecked()) {
            A4204 = "9";
        }
        if (A420499.isChecked()) {
            A4204 = "8";
        }

        //A4205
        if (A4205_1.isChecked()) {
            A4205 = "1";
        }
        if (A4205_2.isChecked()) {
            A4205 = "2";
        }
        if (A420598.isChecked()) {
            A4205 = "9";
        }
        if (A420599.isChecked()) {
            A4205 = "8";
        }

        //A4205_1
        if (A42051a.isChecked()) {
            A4205_1 = "1";
        }
        if (A42051b.isChecked()) {
            A4205_1 = "2";
        }
        if (A4205_198.isChecked()) {
            A4205_1 = "9";
        }
        if (A4205_199.isChecked()) {
            A4205_1 = "8";
        }


    }

    void insert_data() {

        String query = "insert into A4157_A4205("

                + Global.A.A4157_A4205.study_id + ","
                + Global.A.A4157_A4205.A4157 + ","
                + Global.A.A4157_A4205.A4158 + ","
                + Global.A.A4157_A4205.A4159 + ","
                + Global.A.A4157_A4205.A4160 + ","
                + Global.A.A4157_A4205.A4161 + ","
                + Global.A.A4157_A4205.A41611 + ","
                + Global.A.A4157_A4205.A4162 + ","
                + Global.A.A4157_A4205.A41631 + ","
                + Global.A.A4157_A4205.A4163 + ","
                + Global.A.A4157_A4205.A4164 + ","
                + Global.A.A4157_A4205.A4166 + ","
                + Global.A.A4157_A4205.A4167 + ","
                + Global.A.A4157_A4205.A4168_1 + ","
                + Global.A.A4157_A4205.A4168_3 + ","
                + Global.A.A4157_A4205.A4168 + ","
                + Global.A.A4157_A4205.A4173_1 + ","
                + Global.A.A4157_A4205.A4173 + ","
                + Global.A.A4157_A4205.A4173_2 + ","
                + Global.A.A4157_A4205.A4178_1 + ","
                + Global.A.A4157_A4205.A4178_2 + ","
                + Global.A.A4157_A4205.A4178 + ","
                + Global.A.A4157_A4205.A4179 + ","
                + Global.A.A4157_A4205.A4180 + ","
                + Global.A.A4157_A4205.A4181 + ","
                + Global.A.A4157_A4205.A4182 + ","
                + Global.A.A4157_A4205.A4183 + ","
                + Global.A.A4157_A4205.A4184 + ","
                + Global.A.A4157_A4205.A4185 + ","
                + Global.A.A4157_A4205.A4186 + ","
                + Global.A.A4157_A4205.A4186_1 + ","
                + Global.A.A4157_A4205.A4187 + ","
                + Global.A.A4157_A4205.A4188 + ","
                + Global.A.A4157_A4205.A4189 + ","
                + Global.A.A4157_A4205.A4190 + ","
                + Global.A.A4157_A4205.A4191 + ","
                + Global.A.A4157_A4205.A4192 + ","
                + Global.A.A4157_A4205.A4193 + ","
                + Global.A.A4157_A4205.A4193_1 + ","
                + Global.A.A4157_A4205.A4194 + ","
                + Global.A.A4157_A4205.A4195 + ","
                + Global.A.A4157_A4205.A4196 + ","
                + Global.A.A4157_A4205.A4197 + ","
                + Global.A.A4157_A4205.A4198_1 + ","
                + Global.A.A4157_A4205.A4198 + ","
                + Global.A.A4157_A4205.A4200 + ","
                + Global.A.A4157_A4205.A4202 + ","
                + Global.A.A4157_A4205.A4203 + ","
                + Global.A.A4157_A4205.A4204 + ","
                + Global.A.A4157_A4205.A4205 + ","
                + Global.A.A4157_A4205.A4205_1 + ","
                + Global.A.A4157_A4205.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4157 + "','" +
                A4158 + "','" +
                A4159 + "','" +
                A4160 + "','" +
                A4161 + "','" +
                A41611 + "','" +
                A4162 + "','" +
                A41631 + "','" +
                A4163 + "','" +
                A4164 + "','" +
                A4166 + "','" +
                A4167 + "','" +
                A4168_1 + "','" +
                A4168_3 + "','" +
                A4168 + "','" +
                A4173_1 + "','" +
                A4173 + "','" +
                A4173_2 + "','" +
                A4178_1 + "','" +
                A4178_2 + "','" +
                A4178 + "','" +
                A4179 + "','" +
                A4180 + "','" +
                A4181 + "','" +
                A4182 + "','" +
                A4183 + "','" +
                A4184 + "','" +
                A4185 + "','" +
                A4186 + "','" +
                A4186_1 + "','" +
                A4187 + "','" +
                A4188 + "','" +
                A4189 + "','" +
                A4190 + "','" +
                A4191 + "','" +
                A4192 + "','" +
                A4193 + "','" +
                A4193_1 + "','" +
                A4194 + "','" +
                A4195 + "','" +
                A4196 + "','" +
                A4197 + "','" +
                A4198_1 + "','" +
                A4198 + "','" +
                A4200 + "','" +
                A4202 + "','" +
                A4203 + "','" +
                A4204 + "','" +
                A4205 + "','" +
                A4205_1 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "9th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(cvstudy_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4157) == false) {
            return false;
        }
        if (Gothrough.IamHiden(cvA4158) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4159) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4160) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4161) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA41611) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4162) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA41631) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4163) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4164) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4166) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4167) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4168_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4168_3) == false) {
            return false;
        }
        if (Gothrough.IamHiden(cvA4168) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4173_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4173) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4173_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4178_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4178_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4178) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4179) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4180) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4181) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4182) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4183) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4184) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4185) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4186) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4186_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4187) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4188) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4189) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4190) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4191) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4192) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4193) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4193_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4194) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4195) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4196) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4197) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4198_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4198) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4200) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4202) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4203) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4204) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4205) == false) {
            return false;
        }

        return Gothrough.IamHiden(cvA4205_1) != false;
    }

}
