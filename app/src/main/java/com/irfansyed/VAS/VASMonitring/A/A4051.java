package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.InputFilter;
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

public class A4051 extends AppCompatActivity implements View.OnClickListener {

    //Declaration
    Button
            btn_next2;

    LinearLayout
            llA4051;

    CardView
            cvstudy_id,
            cvA4051,
            cvA4052u,
            cvA4052D,
            cvA4052M,
            cvA4053,
            cvA4054,
            cvA4055,
            cvA4056,
            cvA4057,
            cvA4058,
            cvA4059u,
            cvA4059D,
            cvA4059M,
            cvA4060,
            cvA4061,
            cvA4062,
            cvA4063,
            cvA4064u,
            cvA4064D,
            cvA4064M,
            cvA40641,
            cvA4065,
            cvA4066;

    RadioGroup
            A4051,
            A4052u,
            A4053,
            A4054,
            A4055,
            A4056,
            A4057,
            A4058,
            A4059u,
            A4060,
            A4061,
            A4062,
            A4063,
            A4064u,
            A40641,
            A4065,
            A4066;

    RadioButton
            A4051a,
            A4051b,
            A405198,
            A405199,
            A4052ua,
            A4052ub,
            A4052u98,
            A4052u99,
            A4053a,
            A4053b,
            A405398,
            A405399,
            A4054a,
            A4054b,
            A4054c,
            A405498,
            A405499,
            A4055a,
            A4055b,
            A4055c,
            A405598,
            A405599,
            A4056a,
            A4056b,
            A405698,
            A405699,
            A4057a,
            A4057b,
            A405798,
            A405799,
            A4058a,
            A4058b,
            A405898,
            A405899,
            A4059ua,
            A4059ub,
            A4059u98,
            A4059u99,
            A4060a,
            A4060b,
            A406098,
            A406099,
            A4061a,
            A4061b,
            A406198,
            A406199,
            A4062a,
            A4062b,
            A406298,
            A406299,
            A4063a,
            A4063b,
            A406398,
            A406399,
            A4064ua,
            A4064ub,
            A4064u98,
            A4064u99,
            A40641a,
            A40641b,
            A4064198,
            A4064199,
            A4065a,
            A4065b,
            A406598,
            A406599,
            A4066a,
            A4066b,
            A406698,
            A406699;

    EditText
            ed_study_id,
            A4052D,
            A4052M,
            A4059D,
            A4059M,
            A4064D,
            A4064M;

    String
            study_id,
            STATUS;

    //End DECLARATION

    void Initialization() {

        //Button
        btn_next2 = findViewById(R.id.btn_next2);

        //Linear Layout
        cvA4051 = findViewById(R.id.cvA4051);
        cvA4052u = findViewById(R.id.cvA4052u);
        cvA4052D = findViewById(R.id.cvA4052D);
        cvA4052M = findViewById(R.id.cvA4052M);
        cvA4053 = findViewById(R.id.cvA4053);
        cvA4054 = findViewById(R.id.cvA4054);
        cvA4055 = findViewById(R.id.cvA4055);
        cvA4056 = findViewById(R.id.cvA4056);
        cvA4057 = findViewById(R.id.cvA4057);
        cvA4058 = findViewById(R.id.cvA4058);
        cvA4059u = findViewById(R.id.cvA4059u);
        cvA4059D = findViewById(R.id.cvA4059D);
        cvA4059M = findViewById(R.id.cvA4059M);
        cvA4060 = findViewById(R.id.cvA4060);
        cvA4061 = findViewById(R.id.cvA4061);
        cvA4062 = findViewById(R.id.cvA4062);
        cvA4063 = findViewById(R.id.cvA4063);
        cvA4064u = findViewById(R.id.cvA4064u);
        cvA4064D = findViewById(R.id.cvA4064D);
        cvA4064M = findViewById(R.id.cvA4064M);
        cvA40641 = findViewById(R.id.cvA40641);
        cvA4065 = findViewById(R.id.cvA4065);
        cvA4066 = findViewById(R.id.cvA4066);

        //RadioGroup
        A4051 = findViewById(R.id.A4051);
        A4052u = findViewById(R.id.A4052u);
        A4053 = findViewById(R.id.A4053);
        A4054 = findViewById(R.id.A4054);
        A4055 = findViewById(R.id.A4055);
        A4056 = findViewById(R.id.A4056);
        A4057 = findViewById(R.id.A4057);
        A4058 = findViewById(R.id.A4058);
        A4059u = findViewById(R.id.A4059u);
        A4060 = findViewById(R.id.A4060);
        A4061 = findViewById(R.id.A4061);
        A4062 = findViewById(R.id.A4062);
        A4063 = findViewById(R.id.A4063);
        A4064u = findViewById(R.id.A4064u);
        A40641 = findViewById(R.id.A40641);
        A4065 = findViewById(R.id.A4065);
        A4066 = findViewById(R.id.A4066);

        //Radio Button
        A4051a = findViewById(R.id.A4051a);
        A4051b = findViewById(R.id.A4051b);
        A405198 = findViewById(R.id.A405198);
        A405199 = findViewById(R.id.A405199);
        A4052ua = findViewById(R.id.A4052ua);
        A4052ub = findViewById(R.id.A4052ub);
        A4052u98 = findViewById(R.id.A4052u98);
        A4052u99 = findViewById(R.id.A4052u99);
        A4053a = findViewById(R.id.A4053a);
        A4053b = findViewById(R.id.A4053b);
        A405398 = findViewById(R.id.A405398);
        A405399 = findViewById(R.id.A405399);
        A4054a = findViewById(R.id.A4054a);
        A4054b = findViewById(R.id.A4054b);
        A4054c = findViewById(R.id.A4054c);
        A405498 = findViewById(R.id.A405498);
        A405499 = findViewById(R.id.A405499);
        A4055a = findViewById(R.id.A4055a);
        A4055b = findViewById(R.id.A4055b);
        A4055c = findViewById(R.id.A4055c);
        A405598 = findViewById(R.id.A405598);
        A405599 = findViewById(R.id.A405599);
        A4056a = findViewById(R.id.A4056a);
        A4056b = findViewById(R.id.A4056b);
        A405698 = findViewById(R.id.A405698);
        A405699 = findViewById(R.id.A405699);
        A4057a = findViewById(R.id.A4057a);
        A4057b = findViewById(R.id.A4057b);
        A405798 = findViewById(R.id.A405798);
        A405799 = findViewById(R.id.A405799);
        A4058a = findViewById(R.id.A4058a);
        A4058b = findViewById(R.id.A4058b);
        A405898 = findViewById(R.id.A405898);
        A405899 = findViewById(R.id.A405899);
        A4059ua = findViewById(R.id.A4059ua);
        A4059ub = findViewById(R.id.A4059ub);
        A4059u98 = findViewById(R.id.A4059u98);
        A4059u99 = findViewById(R.id.A4059u99);
        A4060a = findViewById(R.id.A4060a);
        A4060b = findViewById(R.id.A4060b);
        A406098 = findViewById(R.id.A406098);
        A406099 = findViewById(R.id.A406099);
        A4061a = findViewById(R.id.A4061a);
        A4061b = findViewById(R.id.A4061b);
        A406198 = findViewById(R.id.A406198);
        A406199 = findViewById(R.id.A406199);
        A4062a = findViewById(R.id.A4062a);
        A4062b = findViewById(R.id.A4062b);
        A406298 = findViewById(R.id.A406298);
        A406299 = findViewById(R.id.A406299);
        A4063a = findViewById(R.id.A4063a);
        A4063b = findViewById(R.id.A4063b);
        A406398 = findViewById(R.id.A406398);
        A406399 = findViewById(R.id.A406399);
        A4064ua = findViewById(R.id.A4064ua);
        A4064ub = findViewById(R.id.A4064ub);
        A4064u98 = findViewById(R.id.A4064u98);
        A4064u99 = findViewById(R.id.A4064u99);
        A40641a = findViewById(R.id.A40641a);
        A40641b = findViewById(R.id.A40641b);
        A4064198 = findViewById(R.id.A4064198);
        A4064199 = findViewById(R.id.A4064199);
        A4065a = findViewById(R.id.A4065a);
        A4065b = findViewById(R.id.A4065b);
        A406598 = findViewById(R.id.A406598);
        A406599 = findViewById(R.id.A406599);
        A4066a = findViewById(R.id.A4066a);
        A4066b = findViewById(R.id.A4066b);
        A406698 = findViewById(R.id.A406698);
        A406699 = findViewById(R.id.A406699);

        // Edit Text
        A4052D = findViewById(R.id.A4052D);
        A4052M = findViewById(R.id.A4052M);
        A4059D = findViewById(R.id.A4059D);
        A4059M = findViewById(R.id.A4059M);
        A4064D = findViewById(R.id.A4064D);
        A4064M = findViewById(R.id.A4064M);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4051);

        this.setTitle(getString(R.string.h_a_sec_9));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        eventsMalls();
        setupSkips();

    }


    private void setupSkips() {

        A4051.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4051a.getId()) {
                    cvA4052u.setVisibility(View.VISIBLE);
                    cvA4052M.setVisibility(View.VISIBLE);
                    cvA4052M.setVisibility(View.VISIBLE);
                    cvA4053.setVisibility(View.VISIBLE);
                    cvA4054.setVisibility(View.VISIBLE);
                    cvA4055.setVisibility(View.VISIBLE);
                    cvA4056.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4052u);
                    ClearAllcontrol.ClearAllC(cvA4052M);
                    ClearAllcontrol.ClearAllC(cvA4052M);
                    ClearAllcontrol.ClearAllC(cvA4053);
                    ClearAllcontrol.ClearAllC(cvA4054);
                    ClearAllcontrol.ClearAllC(cvA4055);
                    ClearAllcontrol.ClearAllC(cvA4056);

                    cvA4052u.setVisibility(View.GONE);
                    cvA4052M.setVisibility(View.GONE);
                    cvA4052M.setVisibility(View.GONE);
                    cvA4053.setVisibility(View.GONE);
                    cvA4054.setVisibility(View.GONE);
                    cvA4055.setVisibility(View.GONE);
                    cvA4056.setVisibility(View.GONE);
                }
            }
        });


        A4052u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4052M);
                ClearAllcontrol.ClearAllC(cvA4052M);

                cvA4052M.setVisibility(View.GONE);
                cvA4052M.setVisibility(View.GONE);

                if (checkedId == A4052ua.getId()) {
                    cvA4052M.setVisibility(View.VISIBLE);
                } else if (checkedId == A4052ub.getId()) {
                    cvA4052M.setVisibility(View.VISIBLE);
                }

            }

        });


        A4058.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4058a.getId()) {
                    cvA4059u.setVisibility(View.VISIBLE);
                    cvA4059D.setVisibility(View.VISIBLE);
                    cvA4059M.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4059u);
                    ClearAllcontrol.ClearAllC(cvA4059D);
                    ClearAllcontrol.ClearAllC(cvA4059M);

                    cvA4059u.setVisibility(View.GONE);
                    cvA4059D.setVisibility(View.GONE);
                    cvA4059M.setVisibility(View.GONE);
                }

            }

        });


        A4059u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4059D);
                ClearAllcontrol.ClearAllC(cvA4059M);

                cvA4059D.setVisibility(View.GONE);
                cvA4059M.setVisibility(View.GONE);

                if (checkedId == A4059ua.getId()) {
                    cvA4059D.setVisibility(View.VISIBLE);
                } else if (checkedId == A4059ub.getId()) {
                    cvA4059M.setVisibility(View.VISIBLE);
                }
            }
        });


        A4060.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4060a.getId()) {
                    cvA4061.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4061);
                    cvA4061.setVisibility(View.GONE);
                }
            }
        });


        A4062.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == A4062a.getId()) {
                    cvA4063.setVisibility(View.VISIBLE);
                    cvA4064u.setVisibility(View.VISIBLE);
                    cvA4064D.setVisibility(View.VISIBLE);
                    cvA4064M.setVisibility(View.VISIBLE);
                    cvA40641.setVisibility(View.VISIBLE);
                    cvA4065.setVisibility(View.VISIBLE);
                } else {
                    ClearAllcontrol.ClearAllC(cvA4063);
                    ClearAllcontrol.ClearAllC(cvA4064u);
                    ClearAllcontrol.ClearAllC(cvA4064D);
                    ClearAllcontrol.ClearAllC(cvA4064M);
                    ClearAllcontrol.ClearAllC(cvA40641);
                    ClearAllcontrol.ClearAllC(cvA4065);

                    cvA4063.setVisibility(View.GONE);
                    cvA4064u.setVisibility(View.GONE);
                    cvA4064D.setVisibility(View.GONE);
                    cvA4064M.setVisibility(View.GONE);
                    cvA40641.setVisibility(View.GONE);
                    cvA4065.setVisibility(View.GONE);
                }
            }
        });


        A4064u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                ClearAllcontrol.ClearAllC(cvA4064D);
                ClearAllcontrol.ClearAllC(cvA4064M);

                cvA4064D.setVisibility(View.GONE);
                cvA4064M.setVisibility(View.GONE);

                if (checkedId == A4064ua.getId()) {
                    cvA4064D.setVisibility(View.VISIBLE);
                } else if (checkedId == A4064ub.getId()) {
                    cvA4064M.setVisibility(View.VISIBLE);
                }
            }
        });

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

        Intent c = new Intent(A4051.this, A4067.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    private void eventsMalls() {

        btn_next2.setOnClickListener(this);

        A4052M.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        A4052M.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        A4059D.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        A4059M.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});
        A4064D.setFilters(new InputFilter[]{new InputFilterMinMax(0, 29, 99, 99)});
        A4064M.setFilters(new InputFilter[]{new InputFilterMinMax(1, 60, 99, 99)});

    }

    void Assignment_Insertion() throws JSONException {

        Toast.makeText(this, "Value Assignment & Data Insertion for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject json = new JSONObject();

        //study_id
        json.put("study_id", ed_study_id.getText().toString().length() > 0 ? ed_study_id.getText().toString().trim() : "-1");

        //A4051
        json.put("A4051", A4051a.isChecked() ? "1"
                : A4051b.isChecked() ? "2"
                : A405198.isChecked() ? "98"
                : A405199.isChecked() ? "99"
                : "-1");

        //A4052u
        json.put("A4052u", A4052ua.isChecked() ? "1"
                : A4052ub.isChecked() ? "2"
                : A4052u98.isChecked() ? "98"
                : A4052u99.isChecked() ? "99"
                : "-1");

        //A4052D
        json.put("A4052D", A4052D.getText().toString().length() > 0 ? A4052D.getText().toString().trim() : "-1");

        //A4052M
        json.put("A4052M", A4052M.getText().toString().length() > 0 ? A4052M.getText().toString().trim() : "-1");

        //A4053
        json.put("A4053", A4053a.isChecked() ? "1"
                : A4053b.isChecked() ? "2"
                : A405398.isChecked() ? "98"
                : A405399.isChecked() ? "99"
                : "-1");

        //A4054
        json.put("A4054", A4054a.isChecked() ? "1"
                : A4054b.isChecked() ? "2"
                : A4054c.isChecked() ? "3"
                : A405498.isChecked() ? "98"
                : A405499.isChecked() ? "99"
                : "-1");

        //A4055
        json.put("A4055", A4055a.isChecked() ? "1"
                : A4055b.isChecked() ? "2"
                : A4055c.isChecked() ? "3"
                : A405598.isChecked() ? "98"
                : A405599.isChecked() ? "99"
                : "-1");

        //A4056
        json.put("A4056", A4056a.isChecked() ? "1"
                : A4056b.isChecked() ? "2"
                : A405698.isChecked() ? "98"
                : A405699.isChecked() ? "99"
                : "-1");

        //A4057
        json.put("A4057", A4057a.isChecked() ? "1"
                : A4057b.isChecked() ? "2"
                : A405798.isChecked() ? "98"
                : A405799.isChecked() ? "99"
                : "-1");

        //A4058
        json.put("A4058", A4058a.isChecked() ? "1"
                : A4058b.isChecked() ? "2"
                : A405898.isChecked() ? "98"
                : A405899.isChecked() ? "99"
                : "-1");

        //A4059u
        json.put("A4059u", A4059ua.isChecked() ? "1"
                : A4059ub.isChecked() ? "2"
                : A4059u98.isChecked() ? "98"
                : A4059u99.isChecked() ? "99"
                : "-1");

        //A4059D
        json.put("A4059D", A4059D.getText().toString().length() > 0 ? A4059D.getText().toString().trim() : "-1");

        //A4059M
        json.put("A4059M", A4059M.getText().toString().length() > 0 ? A4059M.getText().toString().trim() : "-1");

        //A4060
        json.put("A4060", A4060a.isChecked() ? "1"
                : A4060b.isChecked() ? "2"
                : A406098.isChecked() ? "98"
                : A406099.isChecked() ? "99"
                : "-1");

        //A4061
        json.put("A4061", A4061a.isChecked() ? "1"
                : A4061b.isChecked() ? "2"
                : A406198.isChecked() ? "98"
                : A406199.isChecked() ? "99"
                : "-1");

        //A4062
        json.put("A4062", A4062a.isChecked() ? "1"
                : A4062b.isChecked() ? "2"
                : A406298.isChecked() ? "98"
                : A406299.isChecked() ? "99"
                : "-1");

        //A4063
        json.put("A4063", A4063a.isChecked() ? "1"
                : A4063b.isChecked() ? "2"
                : A406398.isChecked() ? "98"
                : A406399.isChecked() ? "99"
                : "-1");

        //A4064u
        json.put("A4064u", A4064ua.isChecked() ? "1"
                : A4064ub.isChecked() ? "2"
                : A4064u98.isChecked() ? "98"
                : A4064u99.isChecked() ? "99"
                : "-1");

        //A4064D
        json.put("A4064D", A4064D.getText().toString().length() > 0 ? A4064D.getText().toString().trim() : "-1");

        //A4064M
        json.put("A4064M", A4064M.getText().toString().length() > 0 ? A4064M.getText().toString().trim() : "-1");

        //A40641
        json.put("A40641", A40641a.isChecked() ? "1"
                : A40641b.isChecked() ? "2"
                : A4064198.isChecked() ? "98"
                : A4064199.isChecked() ? "99"
                : "-1");

        //A4065
        json.put("A4065", A4065a.isChecked() ? "1"
                : A4065b.isChecked() ? "2"
                : A406598.isChecked() ? "98"
                : A406599.isChecked() ? "99"
                : "-1");

        //A4066
        json.put("A4066", A4066a.isChecked() ? "1"
                : A4066b.isChecked() ? "2"
                : A406698.isChecked() ? "98"
                : A406699.isChecked() ? "99"
                : "-1");


        //json.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());
        //json.put("mp06b002", mp06b002.getText().toString());


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Value Assignment & Data Insertion...", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        return Gothrough.IamHiden(llA4051) != false;
    }
}