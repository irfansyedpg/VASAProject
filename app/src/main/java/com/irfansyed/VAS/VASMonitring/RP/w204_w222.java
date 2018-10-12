package com.irfansyed.VAS.VASMonitring.RP;

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
import com.santalu.widget.MaskEditText;

import java.util.ArrayList;
import java.util.List;

import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;


public class w204_w222 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    //region Declaration
    Button
            btn_next;

    LinearLayout
            ll_W201,
            ll_W202,
            ll_W203,
            ll_W204,
            ll_W205,
            ll_W206,
            ll_W207,
            ll_W208,
            ll_W209,
            ll_W210,
            ll_W211,
            ll_W212,
            ll_W213,
            ll_W214,
            ll_W215;

    RadioButton
            rb_W203_1,
            rb_W203_2,
            rb_W204_1,
            rb_W204_2,
            rb_W205_1,
            rb_W205_2,
            rb_W207_1,
            rb_W207_2,
            rb_W208_1,
            rb_W208_2,
            rb_W209_1,
            rb_W209_2;


    CheckBox
            cb_W210_1,
            cb_W210_2,
            cb_W210_3,
            cb_W210_dk,
            cb_W210_RA;

    EditText
            ed_W201_d,
            ed_W201_m,
            ed_W201_y,
            ed_W202,
            ed_W206,
            ed_W211,
            ed_W212,
            ed_W213,
            ed_W214,
            ed_W215;

    String
            study_id,
            W201_d,
            W201_m,
            W201_y,
            W202,
            W203,
            W204,
            W205,
            W206,
            W207,
            W208,
            W209,
            W210_1,
            W210_2,
            W210_3,
            W210_4,
            W210_5,
            W211,
            W212,
            W213,
            W214,
            W215;

    //endregion
    List<String> lst_w17 = new ArrayList();
    List<String> lst_w18 = new ArrayList();
    List<String> lst_w19 = new ArrayList();
    List<String> lst_w21 = new ArrayList();
    List<String> lst_w22 = new ArrayList();
    String
            w17,
            w18,
            w19,
            w21,
            w22;
    String section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w204_w215);

        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        section = getStudyId.getExtras().getString("section");


        this.initialize();
        this.event_call();


    }

    void initialize() {


        btn_next = findViewById(R.id.btn_next);

        ll_W201 = findViewById(R.id.ll_W201);
        ll_W202 = findViewById(R.id.ll_W202);
        ll_W203 = findViewById(R.id.ll_W203);
        ll_W204 = findViewById(R.id.ll_W204);
        ll_W205 = findViewById(R.id.ll_W205);
        ll_W206 = findViewById(R.id.ll_W206);
        ll_W207 = findViewById(R.id.ll_W207);
        ll_W208 = findViewById(R.id.ll_W208);
        ll_W209 = findViewById(R.id.ll_W209);
        ll_W210 = findViewById(R.id.ll_W210);
        ll_W211 = findViewById(R.id.ll_W211);
        ll_W212 = findViewById(R.id.ll_W212);
        ll_W213 = findViewById(R.id.ll_W213);
        ll_W214 = findViewById(R.id.ll_W214);
        ll_W215 = findViewById(R.id.ll_W215);


        rb_W203_1 = findViewById(R.id.rb_W203_1);
        rb_W203_2 = findViewById(R.id.rb_W203_2);

        rb_W204_1 = findViewById(R.id.rb_W204_1);
        rb_W204_2 = findViewById(R.id.rb_W204_2);
        rb_W205_1 = findViewById(R.id.rb_W205_1);
        rb_W205_2 = findViewById(R.id.rb_W205_2);

        rb_W207_1 = findViewById(R.id.rb_W207_1);
        rb_W207_2 = findViewById(R.id.rb_W207_2);
        rb_W208_1 = findViewById(R.id.rb_W208_1);
        rb_W208_2 = findViewById(R.id.rb_W208_2);
        rb_W209_1 = findViewById(R.id.rb_W209_1);
        rb_W209_2 = findViewById(R.id.rb_W209_2);


        cb_W210_1 = findViewById(R.id.cb_W210_1);
        cb_W210_2 = findViewById(R.id.cb_W210_2);
        cb_W210_3 = findViewById(R.id.cb_W210_3);
        cb_W210_dk = findViewById(R.id.cb_W210_dk);
        cb_W210_RA = findViewById(R.id.cb_W210_RA);

        ed_W201_d = findViewById(R.id.ed_W201_d);
        ed_W201_m = findViewById(R.id.ed_W201_m);
        ed_W201_y = findViewById(R.id.ed_W201_y);
        ed_W202 = findViewById(R.id.ed_W202);
        ed_W206 = findViewById(R.id.ed_w206);
        ed_W211 = findViewById(R.id.ed_W211);
        ed_W212 = findViewById(R.id.ed_W212);
        ed_W213 = findViewById(R.id.ed_W213);
        ed_W214 = findViewById(R.id.ed_W214);
        ed_W215 = findViewById(R.id.ed_W215);

    }

    void event_call() {
        btn_next.setOnClickListener(this);


        rb_W204_1.setOnCheckedChangeListener(this);
        rb_W204_2.setOnCheckedChangeListener(this);
        rb_W205_1.setOnCheckedChangeListener(this);
        rb_W205_2.setOnCheckedChangeListener(this);

        rb_W207_1.setOnCheckedChangeListener(this);
        rb_W207_2.setOnCheckedChangeListener(this);
        rb_W208_1.setOnCheckedChangeListener(this);
        rb_W208_2.setOnCheckedChangeListener(this);
        rb_W209_1.setOnCheckedChangeListener(this);
        rb_W209_2.setOnCheckedChangeListener(this);

        cb_W210_1.setOnCheckedChangeListener(this);
        cb_W210_2.setOnCheckedChangeListener(this);
        cb_W210_3.setOnCheckedChangeListener(this);
        cb_W210_RA.setOnCheckedChangeListener(this);
        cb_W210_dk.setOnCheckedChangeListener(this);
    }

    void show_dailuge() {


        final LinearLayout
                ll_W217,
                ll_W218,
                ll_W219,
                ll_W221,
                ll_W222;

        final MaskEditText ed_w217;

        final RadioButton

                rb_W218_1,
                rb_W218_2,
                rb_W218_3,
                rb_W218_4,
                rb_W218_5,
                rb_W218_6,
                rb_W219_1,
                rb_W219_2;

        final EditText
                ed_W221_1,
                ed_W221_2,
                ed_W221_3,
                ed_W222_1,
                ed_W222_2,
                ed_W222_3;


        final AlertDialog b = new AlertDialog.Builder(this).create();

        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialog_w217_w22, null);
        b.setCancelable(false);
        b.setView(v);


        ll_W217 = v.findViewById(R.id.ll_W217);
        ll_W218 = v.findViewById(R.id.ll_W218);
        ll_W219 = v.findViewById(R.id.ll_W219);
        ll_W221 = v.findViewById(R.id.ll_W221);
        ll_W222 = v.findViewById(R.id.ll_W222);
        ed_w217 = v.findViewById(R.id.ed_w217);

        TextView txt_genral = v.findViewById(R.id.txt_pregno);

        int preg = lst_w17.size() + 1;
        txt_genral.setText(" Enter Detail for Pregnancy No: (" + preg + ")");


        rb_W218_1 = v.findViewById(R.id.rb_W218_1);
        rb_W218_2 = v.findViewById(R.id.rb_W218_2);
        rb_W218_3 = v.findViewById(R.id.rb_W218_3);
        rb_W218_4 = v.findViewById(R.id.rb_W218_4);
        rb_W218_5 = v.findViewById(R.id.rb_W218_5);
        rb_W218_6 = v.findViewById(R.id.rb_W218_6);
        rb_W219_1 = v.findViewById(R.id.rb_W219_1);
        rb_W219_2 = v.findViewById(R.id.rb_W219_2);

        ed_W221_1 = v.findViewById(R.id.ed_W221_1);
        ed_W221_2 = v.findViewById(R.id.ed_W221_2);
        ed_W221_3 = v.findViewById(R.id.ed_W221_3);
        ed_W222_1 = v.findViewById(R.id.ed_W222_1);
        ed_W222_2 = v.findViewById(R.id.ed_W222_2);
        ed_W222_3 = v.findViewById(R.id.ed_W222_3);


        Button btn_add = v.findViewById(R.id.btn_add);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!Gothrough.IamHiden(ll_W217) || !Gothrough.IamHiden(ll_W218) || !Gothrough.IamHiden(ll_W219) || !Gothrough.IamHiden(ll_W221) || !Gothrough.IamHiden(ll_W222)) {
                    Toast.makeText(w204_w222.this, "Select Mendatory Field", Toast.LENGTH_LONG).show();
                    return;
                }


                if (ed_w217.getText().toString().trim().length() > 0) {
                    lst_w17.add(ed_w217.getText().toString().trim());
                } else {
                    lst_w17.add("-1");
                }

                if (rb_W218_1.isChecked()) {
                    lst_w18.add("1");
                } else if (rb_W218_2.isChecked()) {
                    lst_w18.add("2");
                } else if (rb_W218_3.isChecked()) {
                    lst_w18.add("3");
                } else if (rb_W218_4.isChecked()) {
                    lst_w18.add("4");
                } else if (rb_W218_5.isChecked()) {
                    lst_w18.add("5");
                } else if (rb_W218_6.isChecked()) {
                    lst_w18.add("6");
                } else {
                    lst_w18.add("-1");
                }

                if (rb_W219_1.isChecked()) {
                    lst_w19.add("1");
                }
                if (rb_W219_2.isChecked()) {
                    lst_w19.add("2");
                } else {
                    lst_w19.add("-1");
                }

                int year_21 = 0;
                int month_21 = 0;
                int days_21 = 0;

                if (ed_W221_1.getText().toString().trim().length() > 0) {
                    year_21 = Integer.parseInt(ed_W221_1.getText().toString().trim()) * 365;
                }


                if (ed_W221_2.getText().toString().trim().length() > 0) {
                    month_21 = Integer.parseInt(ed_W221_2.getText().toString().trim()) * 30;
                }

                if (ed_W221_1.getText().toString().trim().length() > 0) {
                    days_21 = Integer.parseInt(ed_W221_3.getText().toString().trim()) * 1;
                }


                days_21 = days_21 + month_21 + year_21;


                int year_22 = 0;
                int month_22 = 0;
                int days_22 = 0;

                if (ed_W222_1.getText().toString().trim().length() > 0) {
                    year_22 = Integer.parseInt(ed_W222_1.getText().toString().trim()) * 365;
                }

                if (ed_W222_2.getText().toString().trim().length() > 0) {
                    month_22 = Integer.parseInt(ed_W222_2.getText().toString().trim()) * 30;
                }

                if (ed_W222_1.getText().toString().trim().length() > 0) {
                    days_22 = Integer.parseInt(ed_W222_3.getText().toString().trim()) * 1;
                }

                days_22 = days_22 + month_22 + year_22;

                lst_w21.add(Integer.toString(days_21));
                lst_w22.add(Integer.toString(days_22));


                int number_preg = Integer.parseInt(ed_W215.getText().toString());

                if (lst_w17.size() < number_preg) {
                    btn_next.setText("Add Next Pregnancy No:(" + lst_w17.size() + ")");
                } else {
                    btn_next.setText("Next Section");
                }

                b.cancel();
            }
        });


        rb_W218_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W219.setVisibility(View.GONE);
                    ll_W221.setVisibility(View.GONE);
                    ll_W222.setVisibility(View.GONE);

                    ClearAllcontrol.ClearAll(ll_W219);
                    ClearAllcontrol.ClearAll(ll_W221);
                    ClearAllcontrol.ClearAll(ll_W222);
                } else {
                    ll_W219.setVisibility(View.VISIBLE);
                    ll_W221.setVisibility(View.VISIBLE);
                    ll_W222.setVisibility(View.VISIBLE);
                }
            }
        });


        rb_W218_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W219.setVisibility(View.GONE);
                    ll_W221.setVisibility(View.GONE);
                    ll_W222.setVisibility(View.GONE);

                    ClearAllcontrol.ClearAll(ll_W219);
                    ClearAllcontrol.ClearAll(ll_W221);
                    ClearAllcontrol.ClearAll(ll_W222);
                } else {
                    ll_W219.setVisibility(View.VISIBLE);
                    ll_W221.setVisibility(View.VISIBLE);
                    ll_W222.setVisibility(View.VISIBLE);
                }
            }
        });
        //show dialog

        rb_W218_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W219.setVisibility(View.VISIBLE);
                    ll_W221.setVisibility(View.VISIBLE);
                    ll_W222.setVisibility(View.VISIBLE);
                } else {

                }
            }
        });
        //show dialog


        rb_W218_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W219.setVisibility(View.VISIBLE);
                    ll_W221.setVisibility(View.VISIBLE);
                    ll_W222.setVisibility(View.VISIBLE);
                } else {

                }
            }
        });
        //show dialog

        rb_W218_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W219.setVisibility(View.GONE);
                    ll_W221.setVisibility(View.GONE);
                    ll_W222.setVisibility(View.GONE);

                    ClearAllcontrol.ClearAll(ll_W219);
                    ClearAllcontrol.ClearAll(ll_W221);
                    ClearAllcontrol.ClearAll(ll_W222);
                } else {
                    ll_W219.setVisibility(View.VISIBLE);
                    ll_W221.setVisibility(View.VISIBLE);
                    ll_W222.setVisibility(View.VISIBLE);
                }
            }
        });
        //show dialog


        rb_W218_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W219.setVisibility(View.VISIBLE);
                    ll_W221.setVisibility(View.VISIBLE);
                    ll_W222.setVisibility(View.VISIBLE);
                } else {


                }
            }
        });
        //show dialog


        rb_W219_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W221.setVisibility(View.VISIBLE);

                    ll_W222.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(ll_W222);


                }

            }
        });

        rb_W219_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ll_W222.setVisibility(View.VISIBLE);

                    ll_W221.setVisibility(View.GONE);
                    ClearAllcontrol.ClearAll(ll_W221);


                }

            }
        });


        b.show();

    }

    boolean validateField() {


        if (Gothrough.IamHiden(ll_W204) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W205) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W206) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W207) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W208) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W209) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W210) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W211) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W212) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W213) == false) {
            return false;
        }
        if (Gothrough.IamHiden(ll_W214) == false) {
            return false;
        }
        return Gothrough.IamHiden(ll_W215) != false;

    }

    void value_assignment() {

        W201_d = "-1";
        W201_m = "-1";
        W201_y = "-1";
        W202 = "-1";
        W203 = "-1";
        W204 = "-1";
        W205 = "-1";
        W206 = "-1";
        W207 = "-1";
        W208 = "-1";
        W209 = "-1";
        W210_1 = "-1";
        W210_2 = "-1";
        W210_3 = "-1";
        W210_4 = "-1";
        W210_5 = "-1";
        W211 = "-1";
        W212 = "-1";
        W213 = "-1";
        W214 = "-1";
        W215 = "-1";


        if (ed_W201_d.getText().toString().length() > 0) {

            W201_d = ed_W201_d.getText().toString().trim();
        }
        if (ed_W201_m.getText().toString().length() > 0) {

            W201_m = ed_W201_m.getText().toString().trim();
        }
        if (ed_W201_y.getText().toString().length() > 0) {

            W201_y = ed_W201_y.getText().toString().trim();
        }

        if (ed_W202.getText().toString().length() > 0) {

            W202 = ed_W202.getText().toString().trim();
        }

        if (rb_W203_1.isChecked()) {
            W203 = "1";
        } else if (rb_W203_2.isChecked()) {
            W203 = "2";
        }

        if (rb_W204_1.isChecked()) {
            W204 = "1";
        } else if (rb_W204_2.isChecked()) {
            W204 = "2";
        }

        if (rb_W205_1.isChecked()) {
            W205 = "1";
        } else if (rb_W205_2.isChecked()) {
            W205 = "2";
        }

        if (rb_W207_1.isChecked()) {
            W207 = "1";
        } else if (rb_W207_2.isChecked()) {
            W207 = "2";
        }

        if (rb_W208_1.isChecked()) {
            W208 = "1";
        } else if (rb_W208_2.isChecked()) {
            W208 = "2";
        }

        if (rb_W209_1.isChecked()) {
            W209 = "1";
        } else if (rb_W209_2.isChecked()) {
            W209 = "2";
        }

        if (cb_W210_1.isChecked()) {
            W210_1 = "1";
        }
        if (cb_W210_2.isChecked()) {
            W210_2 = "1";
        }
        if (cb_W210_3.isChecked()) {
            W210_3 = "1";
        }
        if (cb_W210_dk.isChecked()) {
            W210_4 = "1";
        }
        if (cb_W210_RA.isChecked()) {
            W210_5 = "1";
        }

        if (ed_W206.getText().toString().trim().length() > 0) {
            W206 = ed_W206.getText().toString().trim();
        }

        if (ed_W211.getText().toString().trim().length() > 0) {
            W211 = ed_W211.getText().toString().trim();
        }
        if (ed_W212.getText().toString().trim().length() > 0) {
            W212 = ed_W212.getText().toString().trim();
        }
        if (ed_W213.getText().toString().trim().length() > 0) {
            W213 = ed_W213.getText().toString().trim();
        }

        if (ed_W214.getText().toString().trim().length() > 0) {
            W214 = ed_W214.getText().toString().trim();
        }

        if (ed_W215.getText().toString().trim().length() > 0) {
            W215 = ed_W215.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into w204_w215("

                + Global.RP.w204_w215.study_id + "," +
                Global.RP.w204_w215.W201_d + "," +
                Global.RP.w204_w215.W201_m + "," +
                Global.RP.w204_w215.W201_y + "," +
                Global.RP.w204_w215.W202 + "," +
                Global.RP.w204_w215.W203 + "," +
                Global.RP.w204_w215.W204 + "," +
                Global.RP.w204_w215.W205 + "," +
                Global.RP.w204_w215.W206 + "," +
                Global.RP.w204_w215.W207 + "," +
                Global.RP.w204_w215.W208 + "," +
                Global.RP.w204_w215.W209 + "," +
                Global.RP.w204_w215.W210_1 + "," +
                Global.RP.w204_w215.W210_2 + "," +
                Global.RP.w204_w215.W210_3 + "," +
                Global.RP.w204_w215.W210_4 + "," +
                Global.RP.w204_w215.W210_5 + "," +
                Global.RP.w204_w215.W211 + "," +
                Global.RP.w204_w215.W212 + "," +
                Global.RP.w204_w215.W213 + "," +
                Global.RP.w204_w215.W214 + "," +
                Global.RP.w204_w215.W215 + ")" +


                " values ('" +
                study_id + "','" +
                W201_d + "','" +
                W201_m + "','" +
                W201_y + "','" +
                W202 + "','" +
                W203 + "','" +
                W204 + "','" +
                W205 + "','" +
                W206 + "','" +
                W207 + "','" +
                W208 + "','" +
                W209 + "','" +
                W210_1 + "','" +
                W210_2 + "','" +
                W210_3 + "','" +
                W210_4 + "','" +
                W210_5 + "','" +
                W211 + "','" +
                W212 + "','" +
                W213 + "','" +
                W214 + "','" +
                W215 + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "1st TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

    }

    void insert_w216_w222() {


        w17 = "-1";
        w18 = "-1";
        w19 = "-1";
        w21 = "-1";
        w22 = "-1";


        for (int i = 0; i < lst_w17.size(); i++) {

            w17 = lst_w17.get(i);
            w18 = lst_w18.get(i);
            w19 = lst_w19.get(i);
            w21 = lst_w21.get(i);
            w22 = lst_w22.get(i);


            String query = "insert into w216_w222(" +

                    Global.RP.w216_w222.study_id + "," +
                    Global.RP.w216_w222.W17 + "," +
                    Global.RP.w216_w222.W18 + "," +
                    Global.RP.w216_w222.W19 + "," +
                    Global.RP.w216_w222.W21 + "," +
                    Global.RP.w216_w222.W22 + ")" +

                    " values ('" +
                    study_id + "','" +

                    w17 + "','" +
                    w18 + "','" +
                    w19 + "','" +
                    w21 + "','" +
                    w22 + "')";


            query = String.format(query);

            LocalDataManager Lm = new LocalDataManager(this);

            LocalDataManager.database.execSQL(query);

            Toast.makeText(this, "2nd TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();

        }

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_next) {

            if (validateField() == false) {

                Toast.makeText(w204_w222.this, "Please Enter Mendatory Fields ", Toast.LENGTH_LONG).show();
                return;

            }


            int number_preg = 0;

            if (ed_W211.getText().toString().length() > 0) {
                number_preg = Integer.parseInt(ed_W211.getText().toString());
            }


            if (rb_W208_1.isChecked()) {
                number_preg = number_preg - 1;
            }

            if (lst_w17.size() < number_preg) {
                this.show_dailuge();


                return;

            }

            this.value_assignment();
            this.insert_data();
            this.insert_w216_w222();


            Intent c = new Intent();

            if (section.equals("C3001_C3011")) {


                c = new Intent(this, com.irfansyed.VAS.VASMonitring.C.C3001_C3011.class);

                c.putExtra("study_id", study_id);

                startActivity(c);
            } else if (section.equals("C3012_C3022")) {


                c = new Intent(this, com.irfansyed.VAS.VASMonitring.C.C3012_C3022.class);

                c.putExtra("study_id", study_id);

                startActivity(c);
            } else if (section.equals("N2001_N2011")) {


                c = new Intent(this, com.irfansyed.VAS.VASMonitring.N.N2001_N2011.class);

                c.putExtra("study_id", study_id);

                startActivity(c);
            } else {
                c = new Intent(this, com.irfansyed.VAS.VASMonitring.A.A4001_A4014.class);

                c.putExtra("study_id", study_id);

                startActivity(c);
            }


        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)


    {

        if (buttonView.getId() == R.id.rb_W204_1 || buttonView.getId() == R.id.rb_W204_2) {
            if (rb_W204_1.isChecked()) {
                ll_W205.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(ll_W205);
            } else {

                ll_W205.setVisibility(View.VISIBLE);


            }

        }

        if (buttonView.getId() == R.id.rb_W207_1 || buttonView.getId() == R.id.rb_W207_2) {
            if (rb_W207_2.isChecked()) {

                ll_W208.setVisibility(View.GONE);
                ll_W209.setVisibility(View.GONE);
                ll_W210.setVisibility(View.GONE);
                ll_W211.setVisibility(View.GONE);
                ll_W212.setVisibility(View.GONE);
                ll_W213.setVisibility(View.GONE);
                ll_W214.setVisibility(View.GONE);
                ll_W215.setVisibility(View.GONE);


                ClearAllcontrol.ClearAll(ll_W208);
                ClearAllcontrol.ClearAll(ll_W209);
                ClearAllcontrol.ClearAll(ll_W210);
                ClearAllcontrol.ClearAll(ll_W211);
                ClearAllcontrol.ClearAll(ll_W212);
                ClearAllcontrol.ClearAll(ll_W213);
                ClearAllcontrol.ClearAll(ll_W214);
                ClearAllcontrol.ClearAll(ll_W215);
            } else {


                ll_W208.setVisibility(View.VISIBLE);
                ll_W209.setVisibility(View.VISIBLE);
                ll_W210.setVisibility(View.VISIBLE);
                ll_W211.setVisibility(View.VISIBLE);
                ll_W212.setVisibility(View.VISIBLE);
                ll_W213.setVisibility(View.VISIBLE);
                ll_W214.setVisibility(View.VISIBLE);
                ll_W215.setVisibility(View.VISIBLE);


            }

        }


        if (buttonView.getId() == R.id.rb_W205_1 || buttonView.getId() == R.id.rb_W205_2) {
            if (rb_W205_2.isChecked()) {
                ll_W206.setVisibility(View.GONE);
                ll_W207.setVisibility(View.GONE);
                ll_W208.setVisibility(View.GONE);
                ll_W209.setVisibility(View.GONE);
                ll_W210.setVisibility(View.GONE);
                ll_W211.setVisibility(View.GONE);
                ll_W212.setVisibility(View.GONE);
                ll_W213.setVisibility(View.GONE);
                ll_W214.setVisibility(View.GONE);
                ll_W215.setVisibility(View.GONE);

                ClearAllcontrol.ClearAll(ll_W206);
                ClearAllcontrol.ClearAll(ll_W207);
                ClearAllcontrol.ClearAll(ll_W208);
                ClearAllcontrol.ClearAll(ll_W209);
                ClearAllcontrol.ClearAll(ll_W210);
                ClearAllcontrol.ClearAll(ll_W211);
                ClearAllcontrol.ClearAll(ll_W212);
                ClearAllcontrol.ClearAll(ll_W213);
                ClearAllcontrol.ClearAll(ll_W214);
                ClearAllcontrol.ClearAll(ll_W215);
            } else {

                ll_W206.setVisibility(View.VISIBLE);
                ll_W207.setVisibility(View.VISIBLE);
                ll_W208.setVisibility(View.VISIBLE);
                ll_W209.setVisibility(View.VISIBLE);
                ll_W210.setVisibility(View.VISIBLE);
                ll_W211.setVisibility(View.VISIBLE);
                ll_W212.setVisibility(View.VISIBLE);
                ll_W213.setVisibility(View.VISIBLE);
                ll_W214.setVisibility(View.VISIBLE);
                ll_W215.setVisibility(View.VISIBLE);


            }

        }


        if (buttonView.getId() == R.id.rb_W208_1 || buttonView.getId() == R.id.rb_W208_2) {
            if (rb_W208_2.isChecked()) {
                ll_W209.setVisibility(View.GONE);
                ll_W210.setVisibility(View.GONE);
                ClearAllcontrol.ClearAll(ll_W209);
                ClearAllcontrol.ClearAll(ll_W210);
            } else if (rb_W208_1.isChecked())

            {

                ll_W209.setVisibility(View.VISIBLE);
                ll_W210.setVisibility(View.VISIBLE);


            }

        }

        if (buttonView.getId() == R.id.cb_W210_1 ||
                buttonView.getId() == R.id.cb_W210_2 ||
                buttonView.getId() == R.id.cb_W210_3 ||
                buttonView.getId() == R.id.cb_W210_dk ||
                buttonView.getId() == R.id.cb_W210_RA) {
            if (buttonView.getId() == R.id.cb_W210_dk) {
                if (cb_W210_dk.isChecked()) {
                    cb_W210_1.setChecked(false);
                    cb_W210_2.setChecked(false);
                    cb_W210_3.setChecked(false);
                    cb_W210_RA.setChecked(false);

                }
            }

            if (buttonView.getId() == R.id.cb_W210_RA) {
                if (cb_W210_RA.isChecked()) {
                    cb_W210_1.setChecked(false);
                    cb_W210_2.setChecked(false);
                    cb_W210_3.setChecked(false);
                    cb_W210_dk.setChecked(false);

                }
            }
            if (buttonView.getId() == R.id.cb_W210_1 ||
                    buttonView.getId() == R.id.cb_W210_2 ||
                    buttonView.getId() == R.id.cb_W210_3) {

                if (cb_W210_1.isChecked() || cb_W210_2.isChecked() || cb_W210_3.isChecked()) {
                    cb_W210_dk.setChecked(false);
                    cb_W210_RA.setChecked(false);
                }


            }


        }


    }
}




