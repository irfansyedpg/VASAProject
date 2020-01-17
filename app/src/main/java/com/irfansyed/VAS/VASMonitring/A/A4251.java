package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.databinding.A4251Binding;
import com.irfansyed.VAS.VASMonitring.databinding.DialogTtBinding;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import data.LocalDataManager;
import validation.ClearClass;
import validation.ValidatorClass;


public class A4251 extends AppCompatActivity implements View.OnClickListener {

    A4251Binding bi;


    Boolean A4252_check;

    List<String> lst_phase = new ArrayList();
    List<String> lst_action = new ArrayList();
    List<String> lst_symtomps = new ArrayList();
    List<String> lst_place = new ArrayList();



    //EndRegion Declaration
    Boolean b_place_where = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.a4251);
        bi.setCallback(this);


        events_call();

    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_next11) {
            if (!formValidation()) {
                if (bi.A4251a.isChecked() && lst_phase.size() == 0) {
                    Toast.makeText(this, "Please add upar wala addd", Toast.LENGTH_LONG).show();
                    return;
                }

                try {
                    SaveDraft();
                } catch (JSONException e) {
                    e.printStackTrace();
                }


                if (bi.A4251a.isChecked() && lst_phase.size() > 0) {
                    insert_A4252();
                }


                Intent c = new Intent(A4251.this, A4301.class);
                startActivity(c);
            }

        }

        if (view.getId() == R.id.btnAdd) {

            if (lst_phase.size() > 8) {
                Toast.makeText(A4251.this, "Cannot be more than 9 ", Toast.LENGTH_LONG).show();
                return;
            }

            final AlertDialog b = new AlertDialog.Builder(this).create();

            //LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LayoutInflater inflater = getLayoutInflater();
            final View v = inflater.inflate(R.layout.dialog_tt, null);
            b.setView(v);
            b.setCancelable(false);
            b.show();

            final DialogTtBinding dialogT = DataBindingUtil.bind(view);


            if (b_place_where == true) {

                ClearClass.ClearAllFields(dialogT.llA42524, null);
                dialogT.llA42524.setVisibility(View.GONE);
            }


            dialogT.btnCncl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.cancel();
                }
            });


            dialogT.btnSbt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (!ValidatorClass.EmptyCheckingContainer(A4251.this, dialogT.llA4252)) {
                        Toast.makeText(A4251.this, "Select All", Toast.LENGTH_LONG).show();

                        return;
                    }


                    if (dialogT.A42521a.isChecked()) {

                        if (Collections.frequency(lst_phase, "1") > 2) {
                            Toast.makeText(A4251.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }
                        lst_phase.add("1");

                    } else if (dialogT.A42521b.isChecked()) {

                        if (Collections.frequency(lst_phase, "2") > 2) {
                            Toast.makeText(A4251.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();
                            return;
                        }

                        lst_phase.add("2");
                    } else if (dialogT.A42521c.isChecked()) {

                        if (Collections.frequency(lst_phase, "3") > 2) {
                            Toast.makeText(A4251.this, "Cannot be more then 3 ", Toast.LENGTH_LONG).show();

                            return;
                        }

                        lst_phase.add("3");
                    } else {
                        Toast.makeText(A4251.this, "Please select from Illness Phase options", Toast.LENGTH_LONG).show();

                        return;
                    }


                    if (dialogT.A42522a.isChecked()) {
                        lst_action.add("1");
                    } else if (dialogT.A42522b.isChecked()) {
                        lst_action.add("2");
                    } else if (dialogT.A42522c.isChecked()) {
                        lst_action.add("3");
                    } else if (dialogT.A42522d.isChecked()) {
                        lst_action.add("4");
                    } else if (dialogT.A42522e.isChecked()) {
                        lst_action.add("5");
                    } else if (dialogT.A42522f.isChecked()) {
                        lst_action.add("6");
                    } else if (dialogT.A42522g.isChecked()) {
                        lst_action.add("7");
                    } else {
                        // toast

                        return;
                    }

                    if (dialogT.A42523.isChecked()) {
                        b_place_where = true;

                        lst_place.add("1");
                        dialogT.A42523.setChecked(false);
                    } else {
                        lst_place.add("0");
                    }

                    if (dialogT.A42524.getText().toString().trim().length() > 0) {
                        lst_symtomps.add(dialogT.A42524.getText().toString().trim());
                    } else {
                        dialogT.A42524.requestFocus();
                        dialogT.A42524.setError("Enter Symtoms");
                        return;
                    }


                    bi.A4252Start.setText("Start (" + Collections.frequency(lst_phase, "1") + ")");
                    bi.A4252Mid.setText("Mid (" + Collections.frequency(lst_phase, "2") + ")");
                    bi.A4252End.setText("End (" + Collections.frequency(lst_phase, "3") + ")");
                    bi.btnAdd.setText("ADD  (" + lst_phase.size() + ")");
                    b.cancel();

                }
            });


        }

    }

    private void events_call() {

        bi.A4251.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                lst_phase.clear();
                lst_action.clear();
                lst_symtomps.clear();
                lst_place.clear();
                b_place_where = false;

                bi.A4252Start.setText("Start");
                bi.A4252Mid.setText("Mid");
                bi.A4252End.setText("End");
                bi.btnAdd.setText("Add");


                ClearClass.ClearAllFields(bi.cvA4252, null);
                ClearClass.ClearAllFields(bi.cvA4253, null);
                ClearClass.ClearAllFields(bi.cvA42541, null);
                ClearClass.ClearAllFields(bi.cvA42542, null);
                ClearClass.ClearAllFields(bi.cvA4255, null);
                ClearClass.ClearAllFields(bi.cvA4256, null);
                ClearClass.ClearAllFields(bi.ll257273, null);
                ClearClass.ClearAllFields(bi.cvA4274, null);
                ClearClass.ClearAllFields(bi.cvA4275, null);
                ClearClass.ClearAllFields(bi.cvA4276, null);
                ClearClass.ClearAllFields(bi.cvA4277, null);
                ClearClass.ClearAllFields(bi.cvA4278, null);
                ClearClass.ClearAllFields(bi.cvA4279, null);
                ClearClass.ClearAllFields(bi.cvA4280, null);
                ClearClass.ClearAllFields(bi.cvA4281, null);
                ClearClass.ClearAllFields(bi.cvA4282, null);
                ClearClass.ClearAllFields(bi.cvA4283, null);

                bi.cvA4252.setVisibility(View.GONE);
                //      cvA4252_1.setVisibility(View.GONE);
                bi.cvA4253.setVisibility(View.GONE);
                bi.cvA42541.setVisibility(View.GONE);
                bi.cvA42542.setVisibility(View.GONE);
                bi.cvA4255.setVisibility(View.GONE);
                bi.cvA4256.setVisibility(View.GONE);
                bi.ll257273.setVisibility(View.GONE);
                bi.cvA4274.setVisibility(View.GONE);
                bi.cvA4275.setVisibility(View.GONE);
                bi.cvA4276.setVisibility(View.GONE);
                bi.cvA4277.setVisibility(View.GONE);
                bi.cvA4278.setVisibility(View.GONE);
                bi.cvA4279.setVisibility(View.GONE);
                bi.cvA4280.setVisibility(View.GONE);
                bi.cvA4281.setVisibility(View.GONE);
                bi.cvA4282.setVisibility(View.GONE);
                bi.cvA4283.setVisibility(View.GONE);

                if (checkedId == bi.A4251a.getId()) {
                    bi.cvA4252.setVisibility(View.VISIBLE);
                    bi.cvA4253.setVisibility(View.VISIBLE);
                    bi.cvA42542.setVisibility(View.VISIBLE);
                    bi.cvA4255.setVisibility(View.VISIBLE);
                    bi.cvA4256.setVisibility(View.VISIBLE);
                    bi.ll257273.setVisibility(View.VISIBLE);
                    bi.cvA4274.setVisibility(View.VISIBLE);
                    bi.cvA4275.setVisibility(View.VISIBLE);
                    bi.cvA4276.setVisibility(View.VISIBLE);
                    bi.cvA4277.setVisibility(View.VISIBLE);
                    bi.cvA4278.setVisibility(View.VISIBLE);
                    bi.cvA4279.setVisibility(View.VISIBLE);
                    bi.cvA4280.setVisibility(View.VISIBLE);
                    bi.cvA4281.setVisibility(View.VISIBLE);
                    bi.cvA4282.setVisibility(View.VISIBLE);
                    bi.cvA4283.setVisibility(View.VISIBLE);

                } else if (bi.A4251b.isChecked()) {
                    bi.cvA42541.setVisibility(View.VISIBLE);
                    bi.cvA4255.setVisibility(View.VISIBLE);
                    bi.cvA4256.setVisibility(View.VISIBLE);
                    bi.ll257273.setVisibility(View.VISIBLE);
                    bi.cvA4274.setVisibility(View.VISIBLE);
                    bi.cvA4275.setVisibility(View.VISIBLE);
                    bi.cvA4276.setVisibility(View.VISIBLE);
                    bi.cvA4277.setVisibility(View.VISIBLE);
                    bi.cvA4278.setVisibility(View.VISIBLE);
                    bi.cvA4279.setVisibility(View.VISIBLE);
                    bi.cvA4280.setVisibility(View.VISIBLE);
                    bi.cvA4281.setVisibility(View.VISIBLE);
                    bi.cvA4282.setVisibility(View.VISIBLE);
                    bi.cvA4283.setVisibility(View.VISIBLE);
                }
            }
        });
        
    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("study_id", bi.studyid);

        //A4251
        json.put("A4251", bi.A4251a.isChecked() ? "1"
                : bi.A4251b.isChecked() ? "2"
                : bi.A425198.isChecked() ? "98"
                : "0");

        //A4253
        json.put("A4253", bi.A4253a.isChecked() ? "1"
                : bi.A4253b.isChecked() ? "2"
                : bi.A425396.isChecked() ? "96"
                : bi.A425398.isChecked() ? "98"
                : "0");
        json.put("A425396x", bi.A425396x.getText().toString().trim().length() > 0 ? bi.A425396x.getText().toString() : "0");

        //A42541
        json.put("A42541", bi.A42541a.isChecked() ? "1"
                : bi.A42541b.isChecked() ? "2"
                : bi.A4254198.isChecked() ? "98"
                : "0");

        //A42542
        json.put("A42542", bi.A42542a.isChecked() ? "1"
                : bi.A42542b.isChecked() ? "2"
                : bi.A4254298.isChecked() ? "98"
                : "-1");

        //A4255
        json.put("A4255a", bi.A4255a.isChecked() ? "1" : "0");
        json.put("A4255b", bi.A4255b.isChecked() ? "2" : "0");
        json.put("A4255c", bi.A4255c.isChecked() ? "3" : "0");
        json.put("A4255d", bi.A4255d.isChecked() ? "4" : "0");
        json.put("A4255e", bi.A4255e.isChecked() ? "5" : "0");
        json.put("A4255f", bi.A4255f.isChecked() ? "6" : "0");
        json.put("A4255g", bi.A4255g.isChecked() ? "7" : "0");
        json.put("A4255h", bi.A4255h.isChecked() ? "8" : "0");
        json.put("A4255i", bi.A4255i.isChecked() ? "9" : "0");
        json.put("A4255j", bi.A4255j.isChecked() ? "10" : "0");
        json.put("A4255k", bi.A4255k.isChecked() ? "11" : "0");
        json.put("A4255l", bi.A4255l.isChecked() ? "12" : "0");
        json.put("A425596", bi.A425596.isChecked() ? "96" : "0");
        json.put("A425598", bi.A425598.isChecked() ? "98" : "0");
        json.put("A4255dx", bi.A4255dx.getText().toString().trim().length() > 0 ? bi.A4255dx.getText().toString().trim() : "0");
        json.put("A425596x", bi.A425596x.getText().toString().trim().length() > 0 ? bi.A425596x.getText().toString().trim() : "0");


        //A4256
        json.put("A4256m", bi.A4256m.getText().toString().trim().length() > 0 ? bi.A4256m.getText().toString().trim() : "0");
        json.put("A4256H", bi.A4256H.getText().toString().trim().length() > 0 ? bi.A4256H.getText().toString().trim() : "0");
        json.put("A4256D", bi.A4256D.getText().toString().trim().length() > 0 ? bi.A4256D.getText().toString().trim() : "0");

        //A4257
        json.put("A4257", bi.A4257a.isChecked() ? "1"
                : bi.A4257b.isChecked() ? "2"
                : bi.A4257c.isChecked() ? "3"
                : bi.A4257d.isChecked() ? "4"
                : bi.A4257e.isChecked() ? "5"
                : bi.A4257f.isChecked() ? "6"
                : bi.A4257g.isChecked() ? "7"
                : bi.A4257h.isChecked() ? "8"
                : bi.A4257i.isChecked() ? "9"
                : bi.A4257j.isChecked() ? "10"
                : bi.A4257k.isChecked() ? "11"
                : bi.A425798.isChecked() ? "98"
                : "0");
        json.put("A4257name", bi.A4257name.getText().toString().trim().length() > 0 ? bi.A4257name.getText().toString() : "0");

        //A42581
        json.put("A42581", bi.A42581a.isChecked() ? "1"
                : bi.A42581b.isChecked() ? "2"
                : bi.A42581c.isChecked() ? "3"
                : bi.A4258198.isChecked() ? "98"
                : "0");

        //A42582
        json.put("A42582", bi.A42582a.isChecked() ? "1"
                : bi.A42582b.isChecked() ? "2"
                : bi.A42582c.isChecked() ? "3"
                : bi.A4258298.isChecked() ? "98"
                : "0");

        //A4259
        json.put("A4259m", bi.A4259m.getText().toString().trim().length() > 0 ? bi.A4259m.getText().toString().trim() : "0");
        json.put("A4259H", bi.A4259H.getText().toString().trim().length() > 0 ? bi.A4259H.getText().toString().trim() : "0");


        //A4260
        json.put("A4260", bi.A4260a.isChecked() ? "1"
                : bi.A4260b.isChecked() ? "2"
                : bi.A426098.isChecked() ? "98"
                : "0");

        //A4261
        json.put("A4261", bi.A4261a.isChecked() ? "1"
                : bi.A4261b.isChecked() ? "2"
                : bi.A426198.isChecked() ? "98"
                : "0");

        //A4262
        json.put("A4262", bi.A4262a.isChecked() ? "1"
                : bi.A4262b.isChecked() ? "2"
                : bi.A4262c.isChecked() ? "3"
                : bi.A4262d.isChecked() ? "4"
                : bi.A4262e.isChecked() ? "5"
                : bi.A4262f.isChecked() ? "6"
                : bi.A4262g.isChecked() ? "7"
                : bi.A4262h.isChecked() ? "8"
                : bi.A4262i.isChecked() ? "9"
                : bi.A4262j.isChecked() ? "10"
                : bi.A4262k.isChecked() ? "11"
                : bi.A426298.isChecked() ? "98"
                : "-1");
        json.put("A4262name", bi.A4262name.getText().toString().trim().length() > 0 ? bi.A4262name.getText().toString() : "0");

        //A42631
        json.put("A42631", bi.A42631a.isChecked() ? "1"
                : bi.A42631b.isChecked() ? "2"
                : bi.A4263198.isChecked() ? "98"
                : "0");

        //A42632
        json.put("A42632", bi.A42632a.isChecked() ? "1"
                : bi.A42632b.isChecked() ? "2"
                : bi.A4263298.isChecked() ? "98"
                : "0");

        //A4264
        json.put("A4264", bi.A4264a.isChecked() ? "1"
                : bi.A4264b.isChecked() ? "2"
                : "0");

        //A4266
        json.put("A4266", bi.A4266a.isChecked() ? "1"
                : bi.A4266b.isChecked() ? "2"
                : bi.A4266c.isChecked() ? "3"
                : bi.A4266d.isChecked() ? "4"
                : bi.A4266e.isChecked() ? "5"
                : bi.A4266f.isChecked() ? "6"
                : bi.A4266g.isChecked() ? "7"
                : bi.A4266h.isChecked() ? "8"
                : bi.A4266i.isChecked() ? "9"
                : bi.A4266j.isChecked() ? "10"
                : bi.A4266k.isChecked() ? "11"
                : bi.A426698.isChecked() ? "98"
                : "-1");
        json.put("A4266name", bi.A4266name.getText().toString().trim().length() > 0 ? bi.A4266name.getText().toString() : "0");

        //A42671
        json.put("A42671", bi.A42671a.isChecked() ? "1"
                : bi.A42671b.isChecked() ? "2"
                : bi.A42671c.isChecked() ? "3"
                : bi.A4267198.isChecked() ? "98"
                : "0");

        //A42672
        json.put("A42672", bi.A42672a.isChecked() ? "1"
                : bi.A42672b.isChecked() ? "2"
                : bi.A42672c.isChecked() ? "3"
                : bi.A4267298.isChecked() ? "98"
                : "0");

        //A4268
        json.put("A4268m", bi.A4268m.getText().toString().trim().length() > 0 ? bi.A4268m.getText().toString().trim() : "0");
        json.put("A4268H", bi.A4268H.getText().toString().trim().length() > 0 ? bi.A4268H.getText().toString().trim() : "0");

        //A4269
        json.put("A4269", bi.A4269a.isChecked() ? "1"
                : bi.A4269b.isChecked() ? "2"
                : bi.A426998.isChecked() ? "98"
                : "0");

        //A4270
        json.put("A4270", bi.A4270a.isChecked() ? "1"
                : bi.A4270b.isChecked() ? "2"
                : bi.A427098.isChecked() ? "98"
                : "0");

        //A4271
        json.put("A4271", bi.A4271a.isChecked() ? "1"
                : bi.A4271b.isChecked() ? "2"
                : bi.A4271c.isChecked() ? "3"
                : bi.A4271d.isChecked() ? "4"
                : bi.A4271e.isChecked() ? "5"
                : bi.A4271f.isChecked() ? "6"
                : bi.A4271g.isChecked() ? "7"
                : bi.A4271h.isChecked() ? "8"
                : bi.A4271i.isChecked() ? "9"
                : bi.A4271j.isChecked() ? "10"
                : bi.A4271k.isChecked() ? "11"
                : bi.A427198.isChecked() ? "98"
                : "0");
        json.put("A4271name", bi.A4271name.getText().toString().trim().length() > 0 ? bi.A4271name.getText().toString() : "0");

        //A42721
        json.put("A42721", bi.A42721a.isChecked() ? "1"
                : bi.A42721b.isChecked() ? "2"
                : bi.A4272198.isChecked() ? "98"
                : "0");

        //A42722
        json.put("A42722", bi.A42722a.isChecked() ? "1"
                : bi.A42722b.isChecked() ? "2"
                : bi.A4272298.isChecked() ? "98"
                : "0");

        //A4273
        json.put("A4273", bi.A4273a.isChecked() ? "1"
                : bi.A4273b.isChecked() ? "2"
                : "0");

        //A4274
        json.put("A4274", bi.A4274a.isChecked() ? "1"
                : bi.A4274b.isChecked() ? "2"
                : bi.A427498.isChecked() ? "98"
                : "0");

        //A4275
        json.put("A4275", bi.A4275a.isChecked() ? "1"
                : bi.A4275b.isChecked() ? "2"
                : bi.A427598.isChecked() ? "98"
                : "0");

        //A4276
        json.put("A4276a", bi.A4276a.isChecked() ? "1" : "0");
        json.put("A4276b", bi.A4276b.isChecked() ? "2" : "0");
        json.put("A4276c", bi.A4276c.isChecked() ? "3" : "0");
        json.put("A4276d", bi.A4276d.isChecked() ? "4" : "0");
        json.put("A4276e", bi.A4276e.isChecked() ? "5" : "0");
        json.put("A4276f", bi.A4276f.isChecked() ? "6" : "0");
        json.put("A4276g", bi.A4276g.isChecked() ? "7" : "0");
        json.put("A4276h", bi.A4276h.isChecked() ? "8" : "0");
        json.put("A4276i", bi.A4276i.isChecked() ? "9" : "0");
        json.put("A4276j", bi.A4276j.isChecked() ? "10" : "0");
        json.put("A4276k", bi.A4276k.isChecked() ? "11" : "0");
        json.put("A4276l", bi.A4276l.isChecked() ? "12" : "0");
        json.put("A4276m", bi.A4276m.isChecked() ? "13" : "0");
        json.put("A4276n", bi.A4276n.isChecked() ? "14" : "0");
        json.put("A4276o", bi.A4276o.isChecked() ? "15" : "0");
        json.put("A427696", bi.A427696.isChecked() ? "96" : "0");
        json.put("A427698", bi.A427698.isChecked() ? "98" : "0");
        json.put("A4276ex", bi.A4276ex.getText().toString().trim().length() > 0 ? bi.A4276ex.getText().toString().trim() : "0");
        json.put("A427696x", bi.A427696x.getText().toString().trim().length() > 0 ? bi.A427696x.getText().toString().trim() : "0");

        
        //A4277
        json.put("A4277", bi.A4277a.isChecked() ? "1"
                : bi.A4277b.isChecked() ? "2"
                : bi.A427798.isChecked() ? "98"
                : "0");

        //A4278
        json.put("A4278a", bi.A4278a.isChecked() ? "1" : "0");
        json.put("A4278b", bi.A4278b.isChecked() ? "2" : "0");
        json.put("A4278c", bi.A4278c.isChecked() ? "3" : "0");
        json.put("A4278d", bi.A4278d.isChecked() ? "4" : "0");
        json.put("A4278e", bi.A4278e.isChecked() ? "5" : "0");
        json.put("A4278f", bi.A4278f.isChecked() ? "6" : "0");
        json.put("A427896", bi.A427896.isChecked() ? "96" : "0");
        json.put("A427898", bi.A427898.isChecked() ? "98" : "0");

        //A4279
        json.put("A4279a", bi.A4279a.isChecked() ? "1" : "0");
        json.put("A4279b", bi.A4279b.isChecked() ? "2" : "0");
        json.put("A4279c", bi.A4279c.isChecked() ? "3" : "0");
        json.put("A4279d", bi.A4279d.isChecked() ? "4" : "0");
        json.put("A4279e", bi.A4279e.isChecked() ? "5" : "0");
        json.put("A4279f", bi.A4279f.isChecked() ? "6" : "0");
        json.put("A427996", bi.A427996.isChecked() ? "96" : "0");
        json.put("A427998", bi.A427998.isChecked() ? "98" : "0");

        //A4280
        json.put("A4280", bi.A4280a.isChecked() ? "1"
                : bi.A4280b.isChecked() ? "2"
                : bi.A428098.isChecked() ? "98"
                : bi.A428099.isChecked() ? "99"
                : "0");

        //A4281
        json.put("A4281", bi.A4281a.isChecked() ? "1"
                : bi.A4281b.isChecked() ? "2"
                : bi.A428198.isChecked() ? "98"
                : bi.A428199.isChecked() ? "99"
                : "0");

        //A4282
        json.put("A4282", bi.A4282a.isChecked() ? "1"
                : bi.A4282b.isChecked() ? "2"
                : bi.A428298.isChecked() ? "98"
                : bi.A428299.isChecked() ? "99"
                : "0");

        //A4283
        json.put("A4283", bi.A4283a.isChecked() ? "1"
                : bi.A4283b.isChecked() ? "2"
                : bi.A428398.isChecked() ? "98"
                : bi.A428399.isChecked() ? "99"
                : "0");


        json.put("A4284D", bi.A4284D.getText().toString().trim().length() > 0 ? bi.A4284D.getText().toString().trim() : "0");


        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(String.valueOf(json));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

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

        for (int i = 0; i < lst_phase.size(); i++) {
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

                    bi.studyid + "','" +
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

    private boolean formValidation() {
        return ValidatorClass.EmptyCheckingContainer(this, bi.llA4251);
    }


}
