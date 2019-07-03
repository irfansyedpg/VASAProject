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

public class A4157_A4205 extends AppCompatActivity implements View.OnClickListener {

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
        insert_data();

        Intent c = new Intent(A4157_A4205.this, A4206_A4207.class);
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

        //A4144
        json.put("A4144", rbA4144_1.isChecked() ? "1"
                : rbA4144_2.isChecked() ? "2"
                : rbA4144_DK.isChecked() ? "98"
                : rbA4144_RA.isChecked() ? "99"
                : "-1");

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

        return Gothrough.IamHiden(llA4157) != false;
    }

}
