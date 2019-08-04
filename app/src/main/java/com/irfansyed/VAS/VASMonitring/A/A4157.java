package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
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

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;

public class A4157 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next9;

    LinearLayout
            llA4157;

    CardView
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

    RadioGroup
            A4157,
            A4158,
            A4159,
            A4160,
            A4161,
            A41611,
            A4162,
            A41631,
            A4163,
            A4166,
            A4167,
            A41681,
            A41683,
            A4168,
            A41731,
            A4173,
            A41732,
            A41782,
            A4178,
            A4179,
            A4181,
            A4182,
            A4183,
            A4184,
            A4185,
            A4186,
            A41861,
            A4187,
            A4188,
            A4189,
            A4190,
            A4191,
            A4193,
            A41931,
            A4194,
            A4195,
            A4196,
            A4197,
            A41981,
            A4198,
            A4200,
            A4202,
            A4203,
            A4204,
            A4205,
            A42051;

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

    A4166a,
            A4166b,
            A416698,
            A416699,

    A4167a,
            A4167b,
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

    A4182a,
            A4182b,
            A418298,
            A418299,

    A4183a,
            A4183b,
            A418398,
            A418399,

    A4184a,
            A4184b,
            A418498,
            A418499,

    A4185a,
            A4185b,
            A418598,
            A418599,

    A4186a,
            A4186b,
            A418698,
            A418699,

    A41861a,
            A41861b,
            A4186198,
            A4186199,

    A4187a,
            A4187b,
            A418798,
            A418799,

    A4188a,
            A4188b,
            A418898,
            A418899,

    A4189a,
            A4189b,
            A418998,
            A418999,

    A4190a,
            A4190b,
            A419098,
            A419099,

    A4191a,
            A4191b,
            A419198,
            A419199,

    A4193a,
            A4193b,
            A419398,
            A419399,

    A41931a,
            A41931b,
            A41931c,
            A41931d,
            A4193198,
            A4193199,

    A4194a,
            A4194b,
            A419498,
            A419499,

    A4195a,
            A4195b,
            A419598,
            A419599,

    A4196a,
            A4196b,
            A419698,
            A419699,

    A4197a,
            A4197b,
            A419798,
            A419799,

    A41981a,
            A41981b,
            A4198198,
            A4198199,

    A4198a,
            A4198b,
            A4198c,
            A4198d,
            A419898,
            A419899,
            A419896,

    A4200a,
            A4200b,
            A4200c,
            A4200d,
            A4200e,
            A4200f,
            A420098,
            A420099,
            A420096,

    A4202a,
            A4202b,
            A420298,
            A420299,

    A4203a,
            A4203b,
            A420398,
            A420399,

    A4204a,
            A4204b,
            A420498,
            A420499,
            A4205a,
            A4205b,
            A420598,
            A420599,
            A42051a,
            A42051b,
            A4205198,
            A4205199;

    EditText
            ed_study_id,
            A4164,
            A41781,
            A4180,
            A4192;

    String
            study_id,
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
            if (A41781.getText().hashCode() == s.hashCode()) {
                if (A41781.getText().toString().trim().length() > 0 && Integer.parseInt(A41781.getText().toString().trim()) > 0) {
                    ClearAllcontrol.ClearAllC(cvA41782);
                    cvA41782.setVisibility(View.GONE);
                } else {
                    cvA41782.setVisibility(View.VISIBLE);
                }
            }

            if (A4180.getText().hashCode() == s.hashCode()) {
                if (A4180.getText().toString().trim().length() > 0 && Integer.parseInt(A4180.getText().toString().trim()) < 1) {
                    ClearAllcontrol.ClearAllC(cvA4181);
                    cvA4181.setVisibility(View.GONE);
                } else {
                    cvA4181.setVisibility(View.VISIBLE);
                }
            }
        }

    };

    void Initialization() {

        //Button
        btn_next9 = findViewById(R.id.btn_next9);


        //LinearLayout
        llA4157 = findViewById(R.id.llA4157);


        //CardView
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
        cvA41681 = findViewById(R.id.cvA41681);
        cvA41683 = findViewById(R.id.cvA41683);
        cvA4168 = findViewById(R.id.cvA4168);
        cvA41731 = findViewById(R.id.cvA41731);
        cvA4173 = findViewById(R.id.cvA4173);
        cvA41732 = findViewById(R.id.cvA41732);
        cvA41781 = findViewById(R.id.cvA41781);
        cvA41782 = findViewById(R.id.cvA41782);
        cvA4178 = findViewById(R.id.cvA4178);
        cvA4179 = findViewById(R.id.cvA4179);
        cvA4180 = findViewById(R.id.cvA4180);
        cvA4181 = findViewById(R.id.cvA4181);
        cvA4182 = findViewById(R.id.cvA4182);
        cvA4183 = findViewById(R.id.cvA4183);
        cvA4184 = findViewById(R.id.cvA4184);
        cvA4185 = findViewById(R.id.cvA4185);
        cvA4186 = findViewById(R.id.cvA4186);
        cvA41861 = findViewById(R.id.cvA41861);
        cvA4187 = findViewById(R.id.cvA4187);
        cvA4188 = findViewById(R.id.cvA4188);
        cvA4189 = findViewById(R.id.cvA4189);
        cvA4190 = findViewById(R.id.cvA4190);
        cvA4191 = findViewById(R.id.cvA4191);
        cvA4192 = findViewById(R.id.cvA4192);
        cvA4193 = findViewById(R.id.cvA4193);
        cvA41931 = findViewById(R.id.cvA41931);
        cvA4194 = findViewById(R.id.cvA4194);
        cvA4195 = findViewById(R.id.cvA4195);
        cvA4196 = findViewById(R.id.cvA4196);
        cvA4197 = findViewById(R.id.cvA4197);
        cvA41981 = findViewById(R.id.cvA41981);
        cvA4198 = findViewById(R.id.cvA4198);
        cvA4200 = findViewById(R.id.cvA4200);
        cvA4202 = findViewById(R.id.cvA4202);
        cvA4203 = findViewById(R.id.cvA4203);
        cvA4204 = findViewById(R.id.cvA4204);
        cvA4205 = findViewById(R.id.cvA4205);
        cvA42051 = findViewById(R.id.cvA42051);

        //RadioGroup
        A4157 = findViewById(R.id.A4157);
        A4158 = findViewById(R.id.A4158);
        A4159 = findViewById(R.id.A4159);
        A4160 = findViewById(R.id.A4160);
        A4161 = findViewById(R.id.A4161);
        A41611 = findViewById(R.id.A41611);
        A4162 = findViewById(R.id.A4162);
        A41631 = findViewById(R.id.A41631);
        A4163 = findViewById(R.id.A4163);
        A4166 = findViewById(R.id.A4166);
        A4167 = findViewById(R.id.A4167);
        A41681 = findViewById(R.id.A41681);
        A41683 = findViewById(R.id.A41683);
        A4168 = findViewById(R.id.A4168);
        A41731 = findViewById(R.id.A41731);
        A4173 = findViewById(R.id.A4173);
        A41732 = findViewById(R.id.A41732);
        A41782 = findViewById(R.id.A41782);
        A4178 = findViewById(R.id.A4178);
        A4179 = findViewById(R.id.A4179);
        A4181 = findViewById(R.id.A4181);
        A4182 = findViewById(R.id.A4182);
        A4183 = findViewById(R.id.A4183);
        A4184 = findViewById(R.id.A4184);
        A4185 = findViewById(R.id.A4185);
        A4186 = findViewById(R.id.A4186);
        A41861 = findViewById(R.id.A41861);
        A4187 = findViewById(R.id.A4187);
        A4188 = findViewById(R.id.A4188);
        A4189 = findViewById(R.id.A4189);
        A4190 = findViewById(R.id.A4190);
        A4191 = findViewById(R.id.A4191);
        A4193 = findViewById(R.id.A4193);
        A41931 = findViewById(R.id.A41931);
        A4194 = findViewById(R.id.A4194);
        A4195 = findViewById(R.id.A4195);
        A4196 = findViewById(R.id.A4196);
        A4197 = findViewById(R.id.A4197);
        A41981 = findViewById(R.id.A41981);
        A4198 = findViewById(R.id.A4198);
        A4200 = findViewById(R.id.A4200);
        A4202 = findViewById(R.id.A4202);
        A4203 = findViewById(R.id.A4203);
        A4204 = findViewById(R.id.A4204);
        A4205 = findViewById(R.id.A4205);
        A42051 = findViewById(R.id.A42051);

        //Radio Button
        A4157a = findViewById(R.id.A4157a);
        A4157b = findViewById(R.id.A4157b);
        A415798 = findViewById(R.id.A415798);
        A415799 = findViewById(R.id.A415799);

        A4158a = findViewById(R.id.A4158a);
        A4158b = findViewById(R.id.A4158b);
        A415898 = findViewById(R.id.A415898);
        A415899 = findViewById(R.id.A415899);

        A4159a = findViewById(R.id.A4159a);
        A4159b = findViewById(R.id.A4159b);
        A415998 = findViewById(R.id.A415998);
        A415999 = findViewById(R.id.A415999);

        A4160a = findViewById(R.id.A4160a);
        A4160b = findViewById(R.id.A4160b);
        A416098 = findViewById(R.id.A416098);
        A416099 = findViewById(R.id.A416099);

        A4161a = findViewById(R.id.A4161a);
        A4161b = findViewById(R.id.A4161b);
        A416198 = findViewById(R.id.A416198);
        A416199 = findViewById(R.id.A416199);

        A41611a = findViewById(R.id.A41611a);
        A41611b = findViewById(R.id.A41611b);
        A4161198 = findViewById(R.id.A4161198);
        A4161199 = findViewById(R.id.A4161199);

        A4162a = findViewById(R.id.A4162a);
        A4162b = findViewById(R.id.A4162b);
        A416298 = findViewById(R.id.A416298);
        A416299 = findViewById(R.id.A416299);

        A41631a = findViewById(R.id.A41631a);
        A41631b = findViewById(R.id.A41631b);
        A4163198 = findViewById(R.id.A4163198);
        A4163199 = findViewById(R.id.A4163199);

        A4163a = findViewById(R.id.A4163a);
        A4163b = findViewById(R.id.A4163b);
        A416398 = findViewById(R.id.A416398);
        A416399 = findViewById(R.id.A416399);

        A4166a = findViewById(R.id.A4166a);
        A4166b = findViewById(R.id.A4166b);
        A416698 = findViewById(R.id.A416698);
        A416699 = findViewById(R.id.A416699);

        A4167a = findViewById(R.id.A4167a);
        A4167b = findViewById(R.id.A4167b);
        A416798 = findViewById(R.id.A416798);
        A416799 = findViewById(R.id.A416799);

        A41681a = findViewById(R.id.A41681a);
        A41681b = findViewById(R.id.A41681b);
        A4168198 = findViewById(R.id.A4168198);
        A4168199 = findViewById(R.id.A4168199);

        A41683a = findViewById(R.id.A41683a);
        A41683b = findViewById(R.id.A41683b);
        A4168398 = findViewById(R.id.A4168398);
        A4168399 = findViewById(R.id.A4168399);

        A4168a = findViewById(R.id.A4168a);
        A4168b = findViewById(R.id.A4168b);
        A416898 = findViewById(R.id.A416898);
        A416899 = findViewById(R.id.A416899);

        A41731a = findViewById(R.id.A41731a);
        A41731b = findViewById(R.id.A41731b);
        A4173198 = findViewById(R.id.A4173198);
        A4173199 = findViewById(R.id.A4173199);

        A4173a = findViewById(R.id.A4173a);
        A4173b = findViewById(R.id.A4173b);
        A417398 = findViewById(R.id.A417398);
        A417399 = findViewById(R.id.A417399);

        A41732a = findViewById(R.id.A41732a);
        A41732b = findViewById(R.id.A41732b);
        A4173298 = findViewById(R.id.A4173298);
        A4173299 = findViewById(R.id.A4173299);

        A41782a = findViewById(R.id.A41782a);
        A41782b = findViewById(R.id.A41782b);
        A4178298 = findViewById(R.id.A4178298);
        A4178299 = findViewById(R.id.A4178299);

        A4178a = findViewById(R.id.A4178a);
        A4178b = findViewById(R.id.A4178b);
        A417898 = findViewById(R.id.A417898);
        A417899 = findViewById(R.id.A417899);

        A4179a = findViewById(R.id.A4179a);
        A4179b = findViewById(R.id.A4179b);
        A417998 = findViewById(R.id.A417998);
        A417999 = findViewById(R.id.A417999);

        A4181a = findViewById(R.id.A4181a);
        A4181b = findViewById(R.id.A4181b);
        A418198 = findViewById(R.id.A418198);
        A418199 = findViewById(R.id.A418199);

        A4182a = findViewById(R.id.A4182a);
        A4182b = findViewById(R.id.A4182b);
        A418298 = findViewById(R.id.A418298);
        A418299 = findViewById(R.id.A418299);

        A4183a = findViewById(R.id.A4183a);
        A4183b = findViewById(R.id.A4183b);
        A418398 = findViewById(R.id.A418398);
        A418399 = findViewById(R.id.A418399);

        A4184a = findViewById(R.id.A4184a);
        A4184b = findViewById(R.id.A4184b);
        A418498 = findViewById(R.id.A418498);
        A418499 = findViewById(R.id.A418499);

        A4185a = findViewById(R.id.A4185a);
        A4185b = findViewById(R.id.A4185b);
        A418598 = findViewById(R.id.A418598);
        A418599 = findViewById(R.id.A418599);

        A4186a = findViewById(R.id.A4186a);
        A4186b = findViewById(R.id.A4186b);
        A418698 = findViewById(R.id.A418698);
        A418699 = findViewById(R.id.A418699);

        A41861a = findViewById(R.id.A41861a);
        A41861b = findViewById(R.id.A41861b);
        A4186198 = findViewById(R.id.A4186198);
        A4186199 = findViewById(R.id.A4186199);

        A4187a = findViewById(R.id.A4187a);
        A4187b = findViewById(R.id.A4187b);
        A418798 = findViewById(R.id.A418798);
        A418799 = findViewById(R.id.A418799);

        A4188a = findViewById(R.id.A4188a);
        A4188b = findViewById(R.id.A4188b);
        A418898 = findViewById(R.id.A418898);
        A418899 = findViewById(R.id.A418899);

        A4189a = findViewById(R.id.A4189a);
        A4189b = findViewById(R.id.A4189b);
        A418998 = findViewById(R.id.A418998);
        A418999 = findViewById(R.id.A418999);

        A4190a = findViewById(R.id.A4190a);
        A4190b = findViewById(R.id.A4190b);
        A419098 = findViewById(R.id.A419098);
        A419099 = findViewById(R.id.A419099);

        A4191a = findViewById(R.id.A4191a);
        A4191b = findViewById(R.id.A4191b);
        A419198 = findViewById(R.id.A419198);
        A419199 = findViewById(R.id.A419199);

        A4193a = findViewById(R.id.A4193a);
        A4193b = findViewById(R.id.A4193b);
        A419398 = findViewById(R.id.A419398);
        A419399 = findViewById(R.id.A419399);

        A41931a = findViewById(R.id.A41931a);
        A41931b = findViewById(R.id.A41931b);
        A41931c = findViewById(R.id.A41931c);
        A41931d = findViewById(R.id.A41931d);
        A4193198 = findViewById(R.id.A4193198);
        A4193199 = findViewById(R.id.A4193199);

        A4194a = findViewById(R.id.A4194a);
        A4194b = findViewById(R.id.A4194b);
        A419498 = findViewById(R.id.A419498);
        A419499 = findViewById(R.id.A419499);

        A4195a = findViewById(R.id.A4195a);
        A4195b = findViewById(R.id.A4195b);
        A419598 = findViewById(R.id.A419598);
        A419599 = findViewById(R.id.A419599);

        A4196a = findViewById(R.id.A4196a);
        A4196b = findViewById(R.id.A4196b);
        A419698 = findViewById(R.id.A419698);
        A419699 = findViewById(R.id.A419699);

        A4197a = findViewById(R.id.A4197a);
        A4197b = findViewById(R.id.A4197b);
        A419798 = findViewById(R.id.A419798);
        A419799 = findViewById(R.id.A419799);

        A41981a = findViewById(R.id.A41981a);
        A41981b = findViewById(R.id.A41981b);
        A4198198 = findViewById(R.id.A4198198);
        A4198199 = findViewById(R.id.A4198199);

        A4198a = findViewById(R.id.A4198a);
        A4198b = findViewById(R.id.A4198b);
        A4198c = findViewById(R.id.A4198c);
        A4198d = findViewById(R.id.A4198d);
        A419898 = findViewById(R.id.A419898);
        A419899 = findViewById(R.id.A419899);
        A419896 = findViewById(R.id.A419896);

        A4200a = findViewById(R.id.A4200a);
        A4200b = findViewById(R.id.A4200b);
        A4200c = findViewById(R.id.A4200c);
        A4200d = findViewById(R.id.A4200d);
        A4200e = findViewById(R.id.A4200e);
        A4200f = findViewById(R.id.A4200f);
        A420098 = findViewById(R.id.A420098);
        A420099 = findViewById(R.id.A420099);
        A420096 = findViewById(R.id.A420096);

        A4202a = findViewById(R.id.A4202a);
        A4202b = findViewById(R.id.A4202b);
        A420298 = findViewById(R.id.A420298);
        A420299 = findViewById(R.id.A420299);

        A4203a = findViewById(R.id.A4203a);
        A4203b = findViewById(R.id.A4203b);
        A420398 = findViewById(R.id.A420398);
        A420399 = findViewById(R.id.A420399);

        A4204a = findViewById(R.id.A4204a);
        A4204b = findViewById(R.id.A4204b);
        A420498 = findViewById(R.id.A420498);
        A420499 = findViewById(R.id.A420499);

        A4205a = findViewById(R.id.A4205a);
        A4205b = findViewById(R.id.A4205b);
        A420598 = findViewById(R.id.A420598);
        A420599 = findViewById(R.id.A420599);

        A42051a = findViewById(R.id.A42051a);
        A42051b = findViewById(R.id.A42051b);
        A4205198 = findViewById(R.id.A4205198);
        A4205199 = findViewById(R.id.A4205199);

        // Edit Text
        A4164 = findViewById(R.id.A4164);
        A41781 = findViewById(R.id.A41781);
        A4180 = findViewById(R.id.A4180);
        A4192 = findViewById(R.id.A4192);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4157);

        this.setTitle(getString(R.string.h_a_sec_9));

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

        Intent c = new Intent(A4157.this, A4206.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }

    private void setupSkips() {

        A4159.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4159a.getId()) {
                    cvA4160.setVisibility(View.VISIBLE);
                    cvA4161.setVisibility(View.VISIBLE);
                    cvA41611.setVisibility(View.VISIBLE);
                    cvA4162.setVisibility(View.VISIBLE);
                    cvA41631.setVisibility(View.VISIBLE);
                    cvA4163.setVisibility(View.VISIBLE);
                    cvA4164.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4160);
                    ClearAllcontrol.ClearAllC(cvA4161);
                    ClearAllcontrol.ClearAllC(cvA41611);
                    ClearAllcontrol.ClearAllC(cvA4162);
                    ClearAllcontrol.ClearAllC(cvA41631);
                    ClearAllcontrol.ClearAllC(cvA4163);
                    ClearAllcontrol.ClearAllC(cvA4164);

                    cvA4160.setVisibility(View.GONE);
                    cvA4161.setVisibility(View.GONE);
                    cvA41611.setVisibility(View.GONE);
                    cvA4162.setVisibility(View.GONE);
                    cvA41631.setVisibility(View.GONE);
                    cvA4163.setVisibility(View.GONE);
                    cvA4164.setVisibility(View.GONE);
                }
            }
        });


        A4160.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4160a.getId()) {
                    cvA4161.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4161);
                    cvA4161.setVisibility(View.GONE);
                }
            }
        });


        A4162.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4162a.getId()) {
                    cvA41631.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA41631);
                    cvA41631.setVisibility(View.GONE);
                }
            }
        });


        A4163.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4163a.getId()) {
                    cvA4164.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4164);
                    cvA4164.setVisibility(View.GONE);
                }
            }
        });


        A4167.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A4167a.getId()) {
                    cvA41681.setVisibility(View.VISIBLE);
                    cvA41683.setVisibility(View.VISIBLE);
                    cvA4168.setVisibility(View.VISIBLE);
                    cvA41731.setVisibility(View.VISIBLE);
                    cvA4173.setVisibility(View.VISIBLE);
                    cvA41732.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA41681);
                    ClearAllcontrol.ClearAllC(cvA41683);
                    ClearAllcontrol.ClearAllC(cvA4168);
                    ClearAllcontrol.ClearAllC(cvA41731);
                    ClearAllcontrol.ClearAllC(cvA4173);
                    ClearAllcontrol.ClearAllC(cvA41732);

                    cvA41681.setVisibility(View.GONE);
                    cvA41683.setVisibility(View.GONE);
                    cvA4168.setVisibility(View.GONE);
                    cvA41731.setVisibility(View.GONE);
                    cvA4173.setVisibility(View.GONE);
                    cvA41732.setVisibility(View.GONE);
                }
            }
        });


        A41681.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A41681a.getId()) {
                    cvA41683.setVisibility(View.VISIBLE);
                    cvA4168.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA41683);
                    ClearAllcontrol.ClearAllC(cvA4168);

                    cvA41683.setVisibility(View.GONE);
                    cvA4168.setVisibility(View.GONE);
                }
            }
        });


        A41683.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A41683a.getId()) {
                    cvA4168.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4168);
                    cvA4168.setVisibility(View.GONE);
                }
            }
        });


        A4168.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4168a.getId()) {
                    cvA41731.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA41731);
                    cvA41731.setVisibility(View.GONE);
                }
            }
        });


        A41731.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4168.getId()) {
                    cvA4173.setVisibility(View.VISIBLE);
                    cvA41732.setVisibility(View.VISIBLE);
                    cvA41781.setVisibility(View.VISIBLE);
                    cvA41782.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4173);
                    ClearAllcontrol.ClearAllC(cvA41732);
                    ClearAllcontrol.ClearAllC(cvA41781);
                    ClearAllcontrol.ClearAllC(cvA41782);

                    cvA4173.setVisibility(View.GONE);
                    cvA41732.setVisibility(View.GONE);
                    cvA41781.setVisibility(View.GONE);
                    cvA41782.setVisibility(View.GONE);
                }
            }
        });


        A4173.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4173a.getId()) {
                    cvA41732.setVisibility(View.VISIBLE);
                    cvA41781.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA41732);
                    ClearAllcontrol.ClearAllC(cvA41781);

                    cvA41732.setVisibility(View.GONE);
                    cvA41781.setVisibility(View.GONE);
                }
            }
        });


        A41732.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A41732a.getId()) {
                    cvA41781.setVisibility(View.VISIBLE);
                    cvA41782.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA41781);
                    ClearAllcontrol.ClearAllC(cvA41782);
                    cvA41781.setVisibility(View.GONE);
                    cvA41782.setVisibility(View.GONE);
                }
            }
        });


        A41782.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A41782a.getId() || checkedId == A4178299.getId()) {
                    ClearAllcontrol.ClearAllC(cvA41781);
                    ClearAllcontrol.ClearAllC(cvA4178);
                    ClearAllcontrol.ClearAllC(cvA4179);
                    ClearAllcontrol.ClearAllC(cvA4180);
                    ClearAllcontrol.ClearAllC(cvA4181);
                    ClearAllcontrol.ClearAllC(cvA4182);
                    ClearAllcontrol.ClearAllC(cvA4183);
                    ClearAllcontrol.ClearAllC(cvA4184);
                    ClearAllcontrol.ClearAllC(cvA4185);
                    ClearAllcontrol.ClearAllC(cvA4186);
                    ClearAllcontrol.ClearAllC(cvA41861);
                    ClearAllcontrol.ClearAllC(cvA4187);
                    ClearAllcontrol.ClearAllC(cvA4188);
                    ClearAllcontrol.ClearAllC(cvA4189);
                    ClearAllcontrol.ClearAllC(cvA4190);
                    ClearAllcontrol.ClearAllC(cvA4191);
                    ClearAllcontrol.ClearAllC(cvA4192);
                    ClearAllcontrol.ClearAllC(cvA4193);
                    ClearAllcontrol.ClearAllC(cvA41931);
                    ClearAllcontrol.ClearAllC(cvA4194);
                    ClearAllcontrol.ClearAllC(cvA4195);
                    ClearAllcontrol.ClearAllC(cvA4196);
                    ClearAllcontrol.ClearAllC(cvA4197);
                    ClearAllcontrol.ClearAllC(cvA41981);
                    ClearAllcontrol.ClearAllC(cvA4198);
                    ClearAllcontrol.ClearAllC(cvA4200);
                    ClearAllcontrol.ClearAllC(cvA4202);
                    ClearAllcontrol.ClearAllC(cvA4203);
                    ClearAllcontrol.ClearAllC(cvA4204);
                    ClearAllcontrol.ClearAllC(cvA4205);
                    ClearAllcontrol.ClearAllC(cvA42051);

                    cvA41781.setVisibility(View.GONE);
                    cvA4178.setVisibility(View.GONE);
                    cvA4179.setVisibility(View.GONE);
                    cvA4180.setVisibility(View.GONE);
                    cvA4181.setVisibility(View.GONE);
                    cvA4182.setVisibility(View.GONE);
                    cvA4183.setVisibility(View.GONE);
                    cvA4184.setVisibility(View.GONE);
                    cvA4185.setVisibility(View.GONE);
                    cvA4186.setVisibility(View.GONE);
                    cvA41861.setVisibility(View.GONE);
                    cvA4187.setVisibility(View.GONE);
                    cvA4188.setVisibility(View.GONE);
                    cvA4189.setVisibility(View.GONE);
                    cvA4190.setVisibility(View.GONE);
                    cvA4191.setVisibility(View.GONE);
                    cvA4192.setVisibility(View.GONE);
                    cvA4193.setVisibility(View.GONE);
                    cvA41931.setVisibility(View.GONE);
                    cvA4194.setVisibility(View.GONE);
                    cvA4195.setVisibility(View.GONE);
                    cvA4196.setVisibility(View.GONE);
                    cvA4197.setVisibility(View.GONE);
                    cvA41981.setVisibility(View.GONE);
                    cvA4198.setVisibility(View.GONE);
                    cvA4200.setVisibility(View.GONE);
                    cvA4202.setVisibility(View.GONE);
                    cvA4203.setVisibility(View.GONE);
                    cvA4204.setVisibility(View.GONE);
                    cvA4205.setVisibility(View.GONE);
                    cvA42051.setVisibility(View.GONE);
                } else {
                    cvA41781.setVisibility(View.VISIBLE);
                    cvA4178.setVisibility(View.VISIBLE);
                    cvA4179.setVisibility(View.VISIBLE);
                    cvA4180.setVisibility(View.VISIBLE);
                    cvA4181.setVisibility(View.VISIBLE);
                    cvA4182.setVisibility(View.VISIBLE);
                    cvA4183.setVisibility(View.VISIBLE);
                    cvA4184.setVisibility(View.VISIBLE);
                    cvA4185.setVisibility(View.VISIBLE);
                    cvA4186.setVisibility(View.VISIBLE);
                    cvA41861.setVisibility(View.VISIBLE);
                    cvA4187.setVisibility(View.VISIBLE);
                    cvA4188.setVisibility(View.VISIBLE);
                    cvA4189.setVisibility(View.VISIBLE);
                    cvA4190.setVisibility(View.VISIBLE);
                    cvA4191.setVisibility(View.VISIBLE);
                    cvA4192.setVisibility(View.VISIBLE);
                    cvA4193.setVisibility(View.VISIBLE);
                    cvA41931.setVisibility(View.VISIBLE);
                    cvA4194.setVisibility(View.VISIBLE);
                    cvA4195.setVisibility(View.VISIBLE);
                    cvA4196.setVisibility(View.VISIBLE);
                    cvA4197.setVisibility(View.VISIBLE);
                    cvA41981.setVisibility(View.VISIBLE);
                    cvA4198.setVisibility(View.VISIBLE);
                    cvA4200.setVisibility(View.VISIBLE);
                    cvA4202.setVisibility(View.VISIBLE);
                    cvA4203.setVisibility(View.VISIBLE);
                    cvA4204.setVisibility(View.VISIBLE);
                    cvA4205.setVisibility(View.VISIBLE);
                    cvA42051.setVisibility(View.VISIBLE);
                }
                if (checkedId == A41782b.getId() || checkedId == A4178298.getId()) {
                    cvA4163.requestChildFocus(A41631, cvA4163);
                } else {

                    cvA41782.requestChildFocus(A41782a, cvA41782);
                }
            }
        });


        A4194.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4194a.getId()) {
                    cvA4195.setVisibility(View.VISIBLE);
                    cvA4196.setVisibility(View.VISIBLE);
                    cvA4197.setVisibility(View.VISIBLE);
                    cvA41981.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4195);
                    ClearAllcontrol.ClearAllC(cvA4196);
                    ClearAllcontrol.ClearAllC(cvA4197);
                    ClearAllcontrol.ClearAllC(cvA41981);
                    cvA4195.setVisibility(View.GONE);
                    cvA4196.setVisibility(View.GONE);
                    cvA4197.setVisibility(View.GONE);
                    cvA41981.setVisibility(View.GONE);
                }
            }
        });


        A4195.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4195a.getId()) {
                    cvA4196.setVisibility(View.VISIBLE);
                    cvA4197.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4196);
                    ClearAllcontrol.ClearAllC(cvA4197);
                    cvA4196.setVisibility(View.GONE);
                    cvA4197.setVisibility(View.GONE);
                }
            }
        });


        A4196.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A4196a.getId()) {
                    cvA4197.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4197);
                    cvA4197.setVisibility(View.GONE);
                }
            }
        });


        A4200.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4194a.getId() || checkedId == A4195a.getId() || checkedId == A4196a.getId() || checkedId == A4197a.getId()) {
                    ClearAllcontrol.ClearAllC(cvA4202);
                    ClearAllcontrol.ClearAllC(cvA4203);
                    ClearAllcontrol.ClearAllC(cvA4204);
                    ClearAllcontrol.ClearAllC(cvA4205);
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
        });


        A4202.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A4202a.getId()) {
                    cvA4203.setVisibility(View.VISIBLE);
                    cvA4204.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4203);
                    ClearAllcontrol.ClearAllC(cvA4204);

                    cvA4203.setVisibility(View.GONE);
                    cvA4204.setVisibility(View.GONE);
                }
            }
        });


        A4203.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId != A4203a.getId()) {
                    cvA4204.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4204);
                    cvA4204.setVisibility(View.GONE);
                }
            }
        });

    }

    private void events_calls() {

        btn_next9.setOnClickListener(this);

        A41781.addTextChangedListener(generalTextWatcher);

        A41781.setFilters(new InputFilter[]{new InputFilterMinMax(1, 10, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4157
        json.put("A4157", A4157a.isChecked() ? "1"
                : A4157b.isChecked() ? "2"
                : A415798.isChecked() ? "98"
                : A415799.isChecked() ? "99"
                : "-1");

        //A4158
        json.put("A4158", A4158a.isChecked() ? "1"
                : A4158b.isChecked() ? "2"
                : A415898.isChecked() ? "98"
                : A415899.isChecked() ? "99"
                : "-1");

        //A4159
        json.put("A4159", A4159a.isChecked() ? "1"
                : A4159b.isChecked() ? "2"
                : A415998.isChecked() ? "98"
                : A415999.isChecked() ? "99"
                : "-1");

        //A4160
        json.put("A4160", A4160a.isChecked() ? "1"
                : A4160b.isChecked() ? "2"
                : A416098.isChecked() ? "98"
                : A416099.isChecked() ? "99"
                : "-1");

        //A4161
        json.put("A4161", A4161a.isChecked() ? "1"
                : A4161b.isChecked() ? "2"
                : A416198.isChecked() ? "98"
                : A416199.isChecked() ? "99"
                : "-1");

        //A41611
        json.put("A41611", A41611a.isChecked() ? "1"
                : A41611b.isChecked() ? "2"
                : A4161198.isChecked() ? "98"
                : A4161199.isChecked() ? "99"
                : "-1");

        //A4162
        json.put("A4162", A4162a.isChecked() ? "1"
                : A4162b.isChecked() ? "2"
                : A416298.isChecked() ? "98"
                : A416299.isChecked() ? "99"
                : "-1");

        //A41631
        json.put("A41631", A41631a.isChecked() ? "1"
                : A41631b.isChecked() ? "2"
                : A4163198.isChecked() ? "98"
                : A4163199.isChecked() ? "99"
                : "-1");

        //A4163
        json.put("A4163", A4163a.isChecked() ? "1"
                : A4163b.isChecked() ? "2"
                : A416398.isChecked() ? "98"
                : A416399.isChecked() ? "99"
                : "-1");


        //A4164
        json.put("A4164", A4164.getText().toString().trim().length() > 0 ? A4164.getText().toString().trim() : "-1");


        //A4166
        json.put("A4166", A4166a.isChecked() ? "1"
                : A4166b.isChecked() ? "2"
                : A416698.isChecked() ? "98"
                : A416699.isChecked() ? "99"
                : "-1");

        //A4167
        json.put("A4167", A4167a.isChecked() ? "1"
                : A4167b.isChecked() ? "2"
                : A416798.isChecked() ? "98"
                : A416799.isChecked() ? "99"
                : "-1");

        //A41681
        json.put("A41681", A41681a.isChecked() ? "1"
                : A41681b.isChecked() ? "2"
                : A4168198.isChecked() ? "98"
                : A4168199.isChecked() ? "99"
                : "-1");

        //A41683
        json.put("A41683", A41683a.isChecked() ? "1"
                : A41683b.isChecked() ? "2"
                : A4168398.isChecked() ? "98"
                : A4168399.isChecked() ? "99"
                : "-1");

        //A41683
        json.put("A41683", A41683a.isChecked() ? "1"
                : A41683b.isChecked() ? "2"
                : A4168398.isChecked() ? "98"
                : A4168399.isChecked() ? "99"
                : "-1");

        //A4168
        json.put("A4168", A4168a.isChecked() ? "1"
                : A4168b.isChecked() ? "2"
                : A416898.isChecked() ? "98"
                : A416899.isChecked() ? "99"
                : "-1");

        //A41731
        json.put("A41731", A41731a.isChecked() ? "1"
                : A41731b.isChecked() ? "2"
                : A4173198.isChecked() ? "98"
                : A4173199.isChecked() ? "99"
                : "-1");

        //A4173
        json.put("A4173", A4173a.isChecked() ? "1"
                : A4173b.isChecked() ? "2"
                : A417398.isChecked() ? "98"
                : A417399.isChecked() ? "99"
                : "-1");

        //A41732
        json.put("A41732", A41732a.isChecked() ? "1"
                : A41732b.isChecked() ? "2"
                : A4173298.isChecked() ? "98"
                : A4173299.isChecked() ? "99"
                : "-1");

        //A41781
        json.put("A41781", A41781.getText().toString().trim().length() > 0 ? A41781.getText().toString().trim() : "-1");


        //A41782
        json.put("A41782", A41782a.isChecked() ? "1"
                : A41782b.isChecked() ? "2"
                : A4178298.isChecked() ? "98"
                : A4178299.isChecked() ? "99"
                : "-1");

        //A4178
        json.put("A4178", A4178a.isChecked() ? "1"
                : A4178b.isChecked() ? "2"
                : A417898.isChecked() ? "98"
                : A417899.isChecked() ? "99"
                : "-1");

        //A4179
        json.put("A4179", A4179a.isChecked() ? "1"
                : A4179b.isChecked() ? "2"
                : A417998.isChecked() ? "98"
                : A417999.isChecked() ? "99"
                : "-1");

        //A4180
        json.put("A4180", A4180.getText().toString().trim().length() > 0 ? A4180.getText().toString().trim() : "-1");


        //A4181
        json.put("A4181", A4181a.isChecked() ? "1"
                : A4181b.isChecked() ? "2"
                : A418198.isChecked() ? "98"
                : A418199.isChecked() ? "99"
                : "-1");

        //A4182
        json.put("A4182", A4182a.isChecked() ? "1"
                : A4182b.isChecked() ? "2"
                : A418298.isChecked() ? "98"
                : A418299.isChecked() ? "99"
                : "-1");

        //A4183
        json.put("A4183", A4183a.isChecked() ? "1"
                : A4183b.isChecked() ? "2"
                : A418398.isChecked() ? "98"
                : A418399.isChecked() ? "99"
                : "-1");

        //A4184
        json.put("A4184", A4184a.isChecked() ? "1"
                : A4184b.isChecked() ? "2"
                : A418498.isChecked() ? "98"
                : A418499.isChecked() ? "99"
                : "-1");

        //A4185
        json.put("A4185", A4185a.isChecked() ? "1"
                : A4185b.isChecked() ? "2"
                : A418598.isChecked() ? "98"
                : A418599.isChecked() ? "99"
                : "-1");

        //A4186
        json.put("A4186", A4186a.isChecked() ? "1"
                : A4186b.isChecked() ? "2"
                : A418698.isChecked() ? "98"
                : A418699.isChecked() ? "99"
                : "-1");

        //A41861
        json.put("A41861", A41861a.isChecked() ? "1"
                : A41861b.isChecked() ? "2"
                : A4186198.isChecked() ? "98"
                : A4186199.isChecked() ? "99"
                : "-1");

        //A4187
        json.put("A4187", A4187a.isChecked() ? "1"
                : A4187b.isChecked() ? "2"
                : A418798.isChecked() ? "98"
                : A418799.isChecked() ? "99"
                : "-1");

        //A4188
        json.put("A4188", A4188a.isChecked() ? "1"
                : A4188b.isChecked() ? "2"
                : A418898.isChecked() ? "98"
                : A418899.isChecked() ? "99"
                : "-1");

        //A4189
        json.put("A4189", A4189a.isChecked() ? "1"
                : A4189b.isChecked() ? "2"
                : A418998.isChecked() ? "98"
                : A418999.isChecked() ? "99"
                : "-1");

        //A4190
        json.put("A4190", A4190a.isChecked() ? "1"
                : A4190b.isChecked() ? "2"
                : A419098.isChecked() ? "98"
                : A419099.isChecked() ? "99"
                : "-1");

        //A4191
        json.put("A4191", A4191a.isChecked() ? "1"
                : A4191b.isChecked() ? "2"
                : A419198.isChecked() ? "98"
                : A419199.isChecked() ? "99"
                : "-1");

        //A4192
        json.put("A4192", A4192.getText().toString().trim().length() > 0 ? A4192.getText().toString().trim() : "-1");


        //A4193
        json.put("A4193", A4193a.isChecked() ? "1"
                : A4193b.isChecked() ? "2"
                : A419398.isChecked() ? "98"
                : A419399.isChecked() ? "99"
                : "-1");

        //A41931
        json.put("A41931", A41931a.isChecked() ? "1"
                : A41931b.isChecked() ? "2"
                : A41931c.isChecked() ? "3"
                : A41931d.isChecked() ? "4"
                : A4193198.isChecked() ? "98"
                : A4193199.isChecked() ? "99"
                : "-1");

        //A4194
        json.put("A4194", A4194a.isChecked() ? "1"
                : A4194b.isChecked() ? "2"
                : A419498.isChecked() ? "98"
                : A419499.isChecked() ? "99"
                : "-1");

        //A4195
        json.put("A4195", A4195a.isChecked() ? "1"
                : A4195b.isChecked() ? "2"
                : A419598.isChecked() ? "98"
                : A419599.isChecked() ? "99"
                : "-1");

        //A4196
        json.put("A4196", A4196a.isChecked() ? "1"
                : A4196b.isChecked() ? "2"
                : A419698.isChecked() ? "98"
                : A419699.isChecked() ? "99"
                : "-1");

        //A4197
        json.put("A4197", A4197a.isChecked() ? "1"
                : A4197b.isChecked() ? "2"
                : A419798.isChecked() ? "98"
                : A419799.isChecked() ? "99"
                : "-1");

        //A41981
        json.put("A41981", A41981a.isChecked() ? "1"
                : A41981b.isChecked() ? "2"
                : A4198198.isChecked() ? "98"
                : A4198199.isChecked() ? "99"
                : "-1");

        //A4198
        json.put("A4198", A4198a.isChecked() ? "1"
                : A4198b.isChecked() ? "2"
                : A4198c.isChecked() ? "3"
                : A4198d.isChecked() ? "4"
                : A419898.isChecked() ? "98"
                : A419899.isChecked() ? "99"
                : A419896.isChecked() ? "96"
                : "-1");

        //A4200
        json.put("A4200", A4200a.isChecked() ? "1"
                : A4200b.isChecked() ? "2"
                : A4200c.isChecked() ? "3"
                : A4200d.isChecked() ? "4"
                : A4200e.isChecked() ? "5"
                : A4200f.isChecked() ? "6"
                : A420098.isChecked() ? "98"
                : A420099.isChecked() ? "99"
                : A420096.isChecked() ? "96"
                : "-1");

        //A4202
        json.put("A4202", A4202a.isChecked() ? "1"
                : A4202b.isChecked() ? "2"
                : A420298.isChecked() ? "98"
                : A420299.isChecked() ? "99"
                : "-1");

        //A4203
        json.put("A4203", A4203a.isChecked() ? "1"
                : A4203b.isChecked() ? "2"
                : A420398.isChecked() ? "98"
                : A420399.isChecked() ? "99"
                : "-1");

        //A4204
        json.put("A4204", A4204a.isChecked() ? "1"
                : A4204b.isChecked() ? "2"
                : A420498.isChecked() ? "98"
                : A420499.isChecked() ? "99"
                : "-1");

        //A4205
        json.put("A4205", A4205a.isChecked() ? "1"
                : A4205b.isChecked() ? "2"
                : A420598.isChecked() ? "98"
                : A420599.isChecked() ? "99"
                : "-1");

        //A42051
        json.put("A42051", A42051a.isChecked() ? "1"
                : A42051b.isChecked() ? "2"
                : A4205198.isChecked() ? "98"
                : A4205199.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager ldm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();

    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4157) != false;
    }

}
