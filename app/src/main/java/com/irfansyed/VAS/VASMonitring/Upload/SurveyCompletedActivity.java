package com.irfansyed.VAS.VASMonitring.Upload;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.irfansyed.VAS.VASMonitring.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Global.A.A4001_A4014;
import Global.A.A4051_A4066;
import Global.A.A4067_A4080;
import Global.A.A4081_A4094;
import Global.A.A4095_A4108;
import Global.A.A4109_A4125;
import Global.A.A4126_A4140;
import Global.A.A4144_A4156;
import Global.A.A4157_A4205;
import Global.A.A4206_A4207;
import Global.A.A4251_A4284;
import Global.A.A4301_A4315;
import Global.A.A4351_A4364;
import Global.A.A4401_A4473;
import Global.C.C3001_C3011;
import Global.C.C3012_C3022;
import Global.C.C3051_C3099;
import Global.C.C3101_C3112;
import Global.C.C3121_C3228;
import Global.C.C3251_C3288_A_C;
import Global.C.C3301_C3314;
import Global.C.C3351_C3364;
import Global.C.C3401_C3457;
import Global.C.C3471_C3472;
import Global.GS.Q1101_Q1610;
import Global.N.N2001_N2011;
import Global.N.N2012_N2016;
import Global.N.N2017_N2022_3;
import Global.N.N2023_N2026;
import Global.N.N2051_N2078;
import Global.N.N2080_N2107;
import data.DBHelper;
import data.LocalDataManager;

import static java.lang.Integer.parseInt;


public class SurveyCompletedActivity extends AppCompatActivity {

    RecyclerView               mRecyclerView;
    RecyclerView.Adapter       mAdapter;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_completed);

        List<String> list = new LocalDataManager(this).getLogList("0");


        if (list == null)
            return;

        Collections.sort(list);

        mRecyclerView = findViewById(R.id.list_survey_completed);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new SurveyCompletedCustomAdapter(this, list);
        mRecyclerView.setAdapter(mAdapter);
    }
}


class SurveyCompletedCustomAdapter extends RecyclerView.Adapter {

    Context      mContext;
    List<String> mList;

    public SurveyCompletedCustomAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_survey_pending, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final ViewHolder vh = (ViewHolder) holder;

        //rejected items..
        if (mList.get(position).contains("--00")) {
            vh.itemView.setBackgroundColor(Color.parseColor("#FFB7BC"));
        }

        vh.textName.setText(mList.get(position).split("--")[0]);
        vh.textId.setText(position + 1 + "");

        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder b = new AlertDialog.Builder(mContext);
                b.setTitle("Upload Interview");
                b.setMessage("Do you want to upload this interview ");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String memberId = vh.textName.getText().toString().trim();
                        String[] arrr = memberId.split("/");

                        Q1101_Q1610.study_id_upload = arrr[0];
                        int interviewType = parseInt(arrr[1]);


                        //new Upload_Q1101_Q1610(mContext).execute();

                        if (interviewType == 1) {

                            upload_N(Q1101_Q1610.study_id_upload);

                        } else if (interviewType == 2) {

                            upload_C(Q1101_Q1610.study_id_upload);

                        } else if (interviewType == 3) {

                            upload_A(Q1101_Q1610.study_id_upload);
                        }

                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                    }
                }).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textName, textId;

        public ViewHolder(View v) {
            super(v);
            textName = v.findViewById(R.id.text_item_survey_pending_name);
            textId = v.findViewById(R.id.text_item_survey_pending_id);
        }
    }

    public void upload_N(final String study_id) {

        final String ROOT_URL = "http://10.199.28.127/sm/Welcome/collect_N";

        final RequestQueue myRequestQueue = Volley.newRequestQueue(mContext);

        StringRequest sendMyRequest = new StringRequest(Request.Method.POST, ROOT_URL,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(mContext, response, Toast.LENGTH_LONG).show();
                        myRequestQueue.getCache().clear();
                        //upload2(study_id);

                        try {

                            JSONObject JSONObject = new JSONObject(response);

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(mContext, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {

            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<>();

                //ArrayList<String> loopResponse = new ArrayList();

                DBHelper db = new DBHelper(mContext);

                Cursor c = db.getData("Q1101_Q1610", study_id);
                Cursor c2 = db.getData("N2001_N2011", study_id);
                Cursor c3 = db.getData("N2012_N2016", study_id);
                Cursor c4 = db.getData("N2017_N2022_3", study_id);
                Cursor c5 = db.getData("N2023_N2026", study_id);
                Cursor c6 = db.getData("N2051_N2078", study_id);
                Cursor c7 = db.getData("N2080_N2107", study_id);
                Cursor c8 = db.getData("N2110_N2189a", study_id);
                Cursor c9 = db.getData("N2190_N2191", study_id);
                Cursor c10 = db.getData("N2192_N2202", study_id);
                Cursor c11 = db.getData("N2211_N2248_A_C", study_id);
                Cursor c12 = db.getData("N2251_N2260", study_id);
                Cursor c13 = db.getData("N2271_N2284", study_id);
                Cursor c14 = db.getData("N2291_N2304", study_id);
                Cursor c15 = db.getData("N2311_N2317", study_id);
                Cursor c16 = db.getData("N2321_N2322", study_id);
                Cursor c17 = db.getData("N2211_N2248_B", study_id);

                params.put("table1", "q1101_q1610");
                params.put("table2", "n2001_n2011");
                params.put("table3", "n2012_n2016");
                params.put("table4", "n2017_n2022_3");
                params.put("table5", "n2023_n2026");
                params.put("table6", "n2051_n2078");
                params.put("table7", "n2080_n2107");
                params.put("table8", "n2110_n2189a");
                params.put("table9", "n2190_n2191");
                params.put("table10", "n2192_n2202");
                params.put("table11", "n2211_n2248_a_c");
                params.put("table12", "n2251_n2260");
                params.put("table13", "n2271_n2284");
                params.put("table14", "n2291_n2304");
                params.put("table15", "n2311_n2317");
                params.put("table16", "n2321_n2322");
                params.put("table17", "n2211_n2248_b");

                if (c.getCount() > 0) {

                    c.moveToFirst();

                    params.put(Q1101_Q1610.study_id, c.getString(c.getColumnIndex("study_id")));
                    params.put(Q1101_Q1610.Q1201_1, c.getString(c.getColumnIndex("Q1201_1")));
                    params.put(Q1101_Q1610.Q1201_2, c.getString(c.getColumnIndex("Q1201_2")));
                    params.put(Q1101_Q1610.Q1201_3, c.getString(c.getColumnIndex("Q1201_3")));
                    params.put(Q1101_Q1610.Q1201_4, c.getString(c.getColumnIndex("Q1201_4")));
                    params.put(Q1101_Q1610.Q1201_5, c.getString(c.getColumnIndex("Q1201_5")));
                    params.put(Q1101_Q1610.Q1201_6, c.getString(c.getColumnIndex("Q1201_6")));
                    params.put(Q1101_Q1610.Q1202, c.getString(c.getColumnIndex("Q1202")));
                    params.put(Q1101_Q1610.Q1203, c.getString(c.getColumnIndex("Q1203")));
                    params.put(Q1101_Q1610.Q1204, c.getString(c.getColumnIndex("Q1204")));
                    params.put(Q1101_Q1610.Q1205, c.getString(c.getColumnIndex("Q1205")));
                    params.put(Q1101_Q1610.Q1206_d, c.getString(c.getColumnIndex("Q1206_d")));
                    params.put(Q1101_Q1610.Q1206_m, c.getString(c.getColumnIndex("Q1206_m")));
                    params.put(Q1101_Q1610.Q1206_y, c.getString(c.getColumnIndex("Q1206_y")));
                    params.put(Q1101_Q1610.Q1207, c.getString(c.getColumnIndex("Q1207")));
                    params.put(Q1101_Q1610.Q1208, c.getString(c.getColumnIndex("Q1208")));
                    params.put(Q1101_Q1610.Q1209, c.getString(c.getColumnIndex("Q1209")));
                    params.put(Q1101_Q1610.Q1301, c.getString(c.getColumnIndex("Q1301")));
                    params.put(Q1101_Q1610.Q1302, c.getString(c.getColumnIndex("Q1302")));
                    params.put(Q1101_Q1610.Q1307, c.getString(c.getColumnIndex("Q1307")));
                    params.put(Q1101_Q1610.Q1308, c.getString(c.getColumnIndex("Q1308")));
                    params.put(Q1101_Q1610.Q1309, c.getString(c.getColumnIndex("Q1309")));
                    params.put(Q1101_Q1610.Q1310, c.getString(c.getColumnIndex("Q1310")));
                    params.put(Q1101_Q1610.Q1311, c.getString(c.getColumnIndex("Q1311")));
                    params.put(Q1101_Q1610.Q1312, c.getString(c.getColumnIndex("Q1312")));
                    params.put(Q1101_Q1610.Q1313, c.getString(c.getColumnIndex("Q1313")));
                    params.put(Q1101_Q1610.Q1401, c.getString(c.getColumnIndex("Q1401")));
                    params.put(Q1101_Q1610.Q1402, c.getString(c.getColumnIndex("Q1402")));
                    params.put(Q1101_Q1610.Q1403, c.getString(c.getColumnIndex("Q1403")));
                    params.put(Q1101_Q1610.Q1403_OT, c.getString(c.getColumnIndex("Q1403_OT")));
                    params.put(Q1101_Q1610.Q1404, c.getString(c.getColumnIndex("Q1404")));
                    params.put(Q1101_Q1610.Q1405, c.getString(c.getColumnIndex("Q1405")));
                    params.put(Q1101_Q1610.Q1406, c.getString(c.getColumnIndex("Q1406")));
                    params.put(Q1101_Q1610.Q1407, c.getString(c.getColumnIndex("Q1407")));
                    params.put(Q1101_Q1610.Q1408, c.getString(c.getColumnIndex("Q1408")));
                    params.put(Q1101_Q1610.Q1409, c.getString(c.getColumnIndex("Q1409")));
                    params.put(Q1101_Q1610.Q1410, c.getString(c.getColumnIndex("Q1410")));
                    params.put(Q1101_Q1610.Q1411, c.getString(c.getColumnIndex("Q1411")));
                    params.put(Q1101_Q1610.Q1412, c.getString(c.getColumnIndex("Q1412")));
                    params.put(Q1101_Q1610.Q1413, c.getString(c.getColumnIndex("Q1413")));
                    params.put(Q1101_Q1610.Q1414_1, c.getString(c.getColumnIndex("Q1414_1")));
                    params.put(Q1101_Q1610.Q1414_2, c.getString(c.getColumnIndex("Q1414_2")));
                    params.put(Q1101_Q1610.Q1414_3, c.getString(c.getColumnIndex("Q1414_3")));
                    params.put(Q1101_Q1610.Q1414_4, c.getString(c.getColumnIndex("Q1414_4")));
                    params.put(Q1101_Q1610.Q1414_5, c.getString(c.getColumnIndex("Q1414_5")));
                    params.put(Q1101_Q1610.Q1414_6, c.getString(c.getColumnIndex("Q1414_6")));
                    params.put(Q1101_Q1610.Q1414_7, c.getString(c.getColumnIndex("Q1414_7")));
                    params.put(Q1101_Q1610.Q1414_8, c.getString(c.getColumnIndex("Q1414_8")));
                    params.put(Q1101_Q1610.Q1414_9, c.getString(c.getColumnIndex("Q1414_9")));
                    params.put(Q1101_Q1610.Q1414_10, c.getString(c.getColumnIndex("Q1414_10")));
                    params.put(Q1101_Q1610.Q1415, c.getString(c.getColumnIndex("Q1415")));
                    params.put(Q1101_Q1610.Q1416, c.getString(c.getColumnIndex("Q1416")));
                    params.put(Q1101_Q1610.Q1416_OT, c.getString(c.getColumnIndex("Q1416_OT")));
                    params.put(Q1101_Q1610.Q1417, c.getString(c.getColumnIndex("Q1417")));
                    params.put(Q1101_Q1610.Q1417_OT, c.getString(c.getColumnIndex("Q1417_OT")));
                    params.put(Q1101_Q1610.Q1418, c.getString(c.getColumnIndex("Q1418")));
                    params.put(Q1101_Q1610.Q1418_OT, c.getString(c.getColumnIndex("Q1418_OT")));
                    params.put(Q1101_Q1610.Q1419, c.getString(c.getColumnIndex("Q1419")));
                    params.put(Q1101_Q1610.Q1419_OT, c.getString(c.getColumnIndex("Q1419_OT")));
                    params.put(Q1101_Q1610.Q1420, c.getString(c.getColumnIndex("Q1420")));
                    params.put(Q1101_Q1610.Q1420_OT, c.getString(c.getColumnIndex("Q1420_OT")));
                    params.put(Q1101_Q1610.Q1421, c.getString(c.getColumnIndex("Q1421")));
                    params.put(Q1101_Q1610.Q1421_OT, c.getString(c.getColumnIndex("Q1421_OT")));
                    params.put(Q1101_Q1610.Q1501, c.getString(c.getColumnIndex("Q1501")));
                    params.put(Q1101_Q1610.Q1502, c.getString(c.getColumnIndex("Q1502")));
                    params.put(Q1101_Q1610.Q1503, c.getString(c.getColumnIndex("Q1503")));
                    params.put(Q1101_Q1610.Q1503_OT, c.getString(c.getColumnIndex("Q1503_OT")));
                    params.put(Q1101_Q1610.Q1601, c.getString(c.getColumnIndex("Q1601")));
                    params.put(Q1101_Q1610.Q1602, c.getString(c.getColumnIndex("Q1602")));
                    params.put(Q1101_Q1610.Q1603, c.getString(c.getColumnIndex("Q1603")));
                    params.put(Q1101_Q1610.Q1604, c.getString(c.getColumnIndex("Q1604")));
                    params.put(Q1101_Q1610.Q1604_OT, c.getString(c.getColumnIndex("Q1604_OT")));
                    params.put(Q1101_Q1610.Q1605, c.getString(c.getColumnIndex("Q1605")));
                    params.put(Q1101_Q1610.Q1606, c.getString(c.getColumnIndex("Q1606")));
                    params.put(Q1101_Q1610.Q1607_1, c.getString(c.getColumnIndex("Q1607_1")));
                    params.put(Q1101_Q1610.Q1607_2, c.getString(c.getColumnIndex("Q1607_2")));
                    params.put(Q1101_Q1610.Q1607_3, c.getString(c.getColumnIndex("Q1607_3")));
                    params.put(Q1101_Q1610.Q1608_1, c.getString(c.getColumnIndex("Q1608_1")));
                    params.put(Q1101_Q1610.Q1608_2, c.getString(c.getColumnIndex("Q1608_2")));
                    params.put(Q1101_Q1610.Q1608_3, c.getString(c.getColumnIndex("Q1608_3")));
                    params.put(Q1101_Q1610.Q1609, c.getString(c.getColumnIndex("Q1609")));
                    params.put(Q1101_Q1610.Q1610_1, c.getString(c.getColumnIndex("Q1610_1")));
                    params.put(Q1101_Q1610.Q1610_2, c.getString(c.getColumnIndex("Q1610_2")));
                    params.put(Q1101_Q1610.Q1610_3, c.getString(c.getColumnIndex("Q1610_3")));
                    params.put(Q1101_Q1610.interviewType, c.getString(c.getColumnIndex("interviewType")));
                    params.put(Q1101_Q1610.currentSection, c.getString(c.getColumnIndex("currentSection")));
                }

                if (c2.getCount() > 0) {

                    c2.moveToFirst();

                    params.put(N2001_N2011.sub_N2001_N2011.N2001, c2.getString(c2.getColumnIndex("N2001")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2002, c2.getString(c2.getColumnIndex("N2002")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2003, c2.getString(c2.getColumnIndex("N2003")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2004, c2.getString(c2.getColumnIndex("N2004")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2005u, c2.getString(c2.getColumnIndex("N2005u")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2005d, c2.getString(c2.getColumnIndex("N2005d")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2005w, c2.getString(c2.getColumnIndex("N2005w")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2005m, c2.getString(c2.getColumnIndex("N2005m")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2006, c2.getString(c2.getColumnIndex("N2006")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2006x, c2.getString(c2.getColumnIndex("N2006x")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2008, c2.getString(c2.getColumnIndex("N2008")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2008x, c2.getString(c2.getColumnIndex("N2008x")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2009_1, c2.getString(c2.getColumnIndex("N2009_1")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2009_2, c2.getString(c2.getColumnIndex("N2009_2")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2009_3, c2.getString(c2.getColumnIndex("N2009_3")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2009_4, c2.getString(c2.getColumnIndex("N2009_4")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2010, c2.getString(c2.getColumnIndex("N2010")));
                    params.put(N2001_N2011.sub_N2001_N2011.N2011, c2.getString(c2.getColumnIndex("N2011")));
                }

                if (c3.getCount() > 0) {

                    c3.moveToFirst();

                    params.put(N2012_N2016.sub_N2012_N2016.N2012, c3.getString(c3.getColumnIndex("N2012")));
                    params.put(N2012_N2016.sub_N2012_N2016.N2013, c3.getString(c3.getColumnIndex("N2013")));
                    params.put(N2012_N2016.sub_N2012_N2016.N2014, c3.getString(c3.getColumnIndex("N2014")));
                    params.put(N2012_N2016.sub_N2012_N2016.N2015, c3.getString(c3.getColumnIndex("N2015")));
                    params.put(N2012_N2016.sub_N2012_N2016.N2016, c3.getString(c3.getColumnIndex("N2016")));
                }

                if (c4.getCount() > 0) {

                    c4.moveToFirst();

                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2017, c4.getString(c4.getColumnIndex("N2017")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2018, c4.getString(c4.getColumnIndex("N2018")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2019u, c4.getString(c4.getColumnIndex("N2019u")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2019h, c4.getString(c4.getColumnIndex("N2019h")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2019d, c4.getString(c4.getColumnIndex("N2019d")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2020, c4.getString(c4.getColumnIndex("N2020")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2021, c4.getString(c4.getColumnIndex("N2021")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022, c4.getString(c4.getColumnIndex("N2022")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_1, c4.getString(c4.getColumnIndex("N2022_1")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_2, c4.getString(c4.getColumnIndex("N2022_2")));
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_3, c4.getString(c4.getColumnIndex("N2022_3")));

                } else {

                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2017, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2018, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2019u, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2019h, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2019d, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2020, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2021, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_1, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_2, "-2");
                    params.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_3, "-2");
                }

                if (c5.getCount() > 0) {

                    c5.moveToFirst();

                    params.put(N2023_N2026.sub_N2023_N2026.N2023, c5.getString(c5.getColumnIndex("N2023")));
                    params.put(N2023_N2026.sub_N2023_N2026.N2024, c5.getString(c5.getColumnIndex("N2024")));
                    params.put(N2023_N2026.sub_N2023_N2026.N2024_1, c5.getString(c5.getColumnIndex("N2024_1")));
                    params.put(N2023_N2026.sub_N2023_N2026.N2025U, c5.getString(c5.getColumnIndex("N2025U")));
                    params.put(N2023_N2026.sub_N2023_N2026.N2025D, c5.getString(c5.getColumnIndex("N2025D")));
                    params.put(N2023_N2026.sub_N2023_N2026.N2026, c5.getString(c5.getColumnIndex("N2026")));
                }

                if (c6.getCount() > 0) {

                    c6.moveToFirst();

                    params.put(N2051_N2078.sub_N2051_N2078.N2051, c6.getString(c6.getColumnIndex("N2051")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2052, c6.getString(c6.getColumnIndex("N2052")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_1, c6.getString(c6.getColumnIndex("N2053_1")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_2, c6.getString(c6.getColumnIndex("N2053_2")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_3, c6.getString(c6.getColumnIndex("N2053_3")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_4, c6.getString(c6.getColumnIndex("N2053_4")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_5, c6.getString(c6.getColumnIndex("N2053_5")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_DK, c6.getString(c6.getColumnIndex("N2053_DK")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_OT, c6.getString(c6.getColumnIndex("N2053_OT")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2053_OTx, c6.getString(c6.getColumnIndex("N2053_OTx")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2054, c6.getString(c6.getColumnIndex("N2054")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2055, c6.getString(c6.getColumnIndex("N2055")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2056, c6.getString(c6.getColumnIndex("N2056")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2057_1, c6.getString(c6.getColumnIndex("N2057_1")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2057_2, c6.getString(c6.getColumnIndex("N2057_2")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2057_3, c6.getString(c6.getColumnIndex("N2057_3")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2057_4, c6.getString(c6.getColumnIndex("N2057_4")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2057_5, c6.getString(c6.getColumnIndex("N2057_5")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2057_6, c6.getString(c6.getColumnIndex("N2057_6")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_1, c6.getString(c6.getColumnIndex("N2058_1")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_2, c6.getString(c6.getColumnIndex("N2058_2")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_3, c6.getString(c6.getColumnIndex("N2058_3")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_4, c6.getString(c6.getColumnIndex("N2058_4")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_5, c6.getString(c6.getColumnIndex("N2058_5")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_6, c6.getString(c6.getColumnIndex("N2058_6")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_7, c6.getString(c6.getColumnIndex("N2058_7")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_8, c6.getString(c6.getColumnIndex("N2058_8")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_9, c6.getString(c6.getColumnIndex("N2058_9")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2058_10, c6.getString(c6.getColumnIndex("N2058_10")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2059, c6.getString(c6.getColumnIndex("N2059")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2060, c6.getString(c6.getColumnIndex("N2060")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2061, c6.getString(c6.getColumnIndex("N2061")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2062, c6.getString(c6.getColumnIndex("N2062")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2063, c6.getString(c6.getColumnIndex("N2063")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2064, c6.getString(c6.getColumnIndex("N2064")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2065, c6.getString(c6.getColumnIndex("N2065")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2066, c6.getString(c6.getColumnIndex("N2066")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2067, c6.getString(c6.getColumnIndex("N2067")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2068, c6.getString(c6.getColumnIndex("N2068")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2069_1, c6.getString(c6.getColumnIndex("N2069_1")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2069_2, c6.getString(c6.getColumnIndex("N2069_2")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2069_3, c6.getString(c6.getColumnIndex("N2069_3")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2070, c6.getString(c6.getColumnIndex("N2070")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2071, c6.getString(c6.getColumnIndex("N2071")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2072, c6.getString(c6.getColumnIndex("N2072")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2073, c6.getString(c6.getColumnIndex("N2073")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2074, c6.getString(c6.getColumnIndex("N2074")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2074x, c6.getString(c6.getColumnIndex("N2074x")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2075, c6.getString(c6.getColumnIndex("N2075")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2076, c6.getString(c6.getColumnIndex("N2076")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2076x, c6.getString(c6.getColumnIndex("N2076x")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2077, c6.getString(c6.getColumnIndex("N2077")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_1, c6.getString(c6.getColumnIndex("N2078_1")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_2, c6.getString(c6.getColumnIndex("N2078_2")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_3, c6.getString(c6.getColumnIndex("N2078_3")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_4, c6.getString(c6.getColumnIndex("N2078_4")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_4x, c6.getString(c6.getColumnIndex("N2078_4x")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_5, c6.getString(c6.getColumnIndex("N2078_5")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_6, c6.getString(c6.getColumnIndex("N2078_6")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_7, c6.getString(c6.getColumnIndex("N2078_7")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_8, c6.getString(c6.getColumnIndex("N2078_8")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_9, c6.getString(c6.getColumnIndex("N2078_9")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_10, c6.getString(c6.getColumnIndex("N2078_10")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_11, c6.getString(c6.getColumnIndex("N2078_11")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_12, c6.getString(c6.getColumnIndex("N2078_12")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_13, c6.getString(c6.getColumnIndex("N2078_13")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_DK, c6.getString(c6.getColumnIndex("N2078_DK")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_OT, c6.getString(c6.getColumnIndex("N2078_OT")));
                    params.put(N2051_N2078.sub_N2051_N2078.N2078_OTx, c6.getString(c6.getColumnIndex("N2078_OTx")));
                }

                if (c7.getCount() > 0) {

                    c7.moveToFirst();

                    params.put(N2080_N2107.sub_N2080_N2107.N2080_1, c7.getString(c7.getColumnIndex("N2080_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_2, c7.getString(c7.getColumnIndex("N2080_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_3, c7.getString(c7.getColumnIndex("N2080_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_4, c7.getString(c7.getColumnIndex("N2080_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_5, c7.getString(c7.getColumnIndex("N2080_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_6, c7.getString(c7.getColumnIndex("N2080_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_7, c7.getString(c7.getColumnIndex("N2080_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_8, c7.getString(c7.getColumnIndex("N2080_8")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_9, c7.getString(c7.getColumnIndex("N2080_9")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_10, c7.getString(c7.getColumnIndex("N2080_10")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_11, c7.getString(c7.getColumnIndex("N2080_11")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_12, c7.getString(c7.getColumnIndex("N2080_12")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_13, c7.getString(c7.getColumnIndex("N2080_13")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_14, c7.getString(c7.getColumnIndex("N2080_14")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_15, c7.getString(c7.getColumnIndex("N2080_15")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_15x, c7.getString(c7.getColumnIndex("N2080_15x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2080_16, c7.getString(c7.getColumnIndex("N2080_16")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2081, c7.getString(c7.getColumnIndex("N2081")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_1, c7.getString(c7.getColumnIndex("N2082_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_2, c7.getString(c7.getColumnIndex("N2082_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_3, c7.getString(c7.getColumnIndex("N2082_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_4, c7.getString(c7.getColumnIndex("N2082_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_5, c7.getString(c7.getColumnIndex("N2082_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_6, c7.getString(c7.getColumnIndex("N2082_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_DK, c7.getString(c7.getColumnIndex("N2082_DK")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_OT, c7.getString(c7.getColumnIndex("N2082_OT")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2082_OTx, c7.getString(c7.getColumnIndex("N2082_OTx")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2083, c7.getString(c7.getColumnIndex("N2083")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_1, c7.getString(c7.getColumnIndex("N2084_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_2, c7.getString(c7.getColumnIndex("N2084_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_3, c7.getString(c7.getColumnIndex("N2084_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_4, c7.getString(c7.getColumnIndex("N2084_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_5, c7.getString(c7.getColumnIndex("N2084_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_6, c7.getString(c7.getColumnIndex("N2084_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_7, c7.getString(c7.getColumnIndex("N2084_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_8, c7.getString(c7.getColumnIndex("N2084_8")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_9, c7.getString(c7.getColumnIndex("N2084_9")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_10, c7.getString(c7.getColumnIndex("N2084_10")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_11, c7.getString(c7.getColumnIndex("N2084_11")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_12, c7.getString(c7.getColumnIndex("N2084_12")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_13, c7.getString(c7.getColumnIndex("N2084_13")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_14, c7.getString(c7.getColumnIndex("N2084_14")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2084_OT, c7.getString(c7.getColumnIndex("N2084_OT")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2085, c7.getString(c7.getColumnIndex("N2085")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_1, c7.getString(c7.getColumnIndex("N2086_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_2, c7.getString(c7.getColumnIndex("N2086_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_3, c7.getString(c7.getColumnIndex("N2086_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_4, c7.getString(c7.getColumnIndex("N2086_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_4x, c7.getString(c7.getColumnIndex("N2086_4x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_5, c7.getString(c7.getColumnIndex("N2086_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_6, c7.getString(c7.getColumnIndex("N2086_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_7, c7.getString(c7.getColumnIndex("N2086_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_8, c7.getString(c7.getColumnIndex("N2086_8")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_9, c7.getString(c7.getColumnIndex("N2086_9")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_10, c7.getString(c7.getColumnIndex("N2086_10")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_11, c7.getString(c7.getColumnIndex("N2086_11")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_12, c7.getString(c7.getColumnIndex("N2086_12")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_OT, c7.getString(c7.getColumnIndex("N2086_OT")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_OTx, c7.getString(c7.getColumnIndex("N2086_OTx")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2086_DK, c7.getString(c7.getColumnIndex("N2086_DK")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2087, c7.getString(c7.getColumnIndex("N2087")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_1, c7.getString(c7.getColumnIndex("N2088_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_2, c7.getString(c7.getColumnIndex("N2088_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_3, c7.getString(c7.getColumnIndex("N2088_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_4, c7.getString(c7.getColumnIndex("N2088_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_5, c7.getString(c7.getColumnIndex("N2088_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_6, c7.getString(c7.getColumnIndex("N2088_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_7, c7.getString(c7.getColumnIndex("N2088_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_8, c7.getString(c7.getColumnIndex("N2088_8")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_9, c7.getString(c7.getColumnIndex("N2088_9")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_10, c7.getString(c7.getColumnIndex("N2088_10")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_11, c7.getString(c7.getColumnIndex("N2088_11")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_12, c7.getString(c7.getColumnIndex("N2088_12")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_13, c7.getString(c7.getColumnIndex("N2088_13")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_14, c7.getString(c7.getColumnIndex("N2088_14")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_15, c7.getString(c7.getColumnIndex("N2088_15")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_16, c7.getString(c7.getColumnIndex("N2088_16")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_17, c7.getString(c7.getColumnIndex("N2088_17")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_18, c7.getString(c7.getColumnIndex("N2088_18")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_18x, c7.getString(c7.getColumnIndex("N2088_18x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2088_19, c7.getString(c7.getColumnIndex("N2088_19")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2089, c7.getString(c7.getColumnIndex("N2089")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2089x, c7.getString(c7.getColumnIndex("N2089x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2090, c7.getString(c7.getColumnIndex("N2090")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_1, c7.getString(c7.getColumnIndex("N2091_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_2, c7.getString(c7.getColumnIndex("N2091_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_3, c7.getString(c7.getColumnIndex("N2091_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_4, c7.getString(c7.getColumnIndex("N2091_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_5, c7.getString(c7.getColumnIndex("N2091_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_6, c7.getString(c7.getColumnIndex("N2091_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_OT, c7.getString(c7.getColumnIndex("N2091_OT")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_OTx, c7.getString(c7.getColumnIndex("N2091_OTx")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2091_DK, c7.getString(c7.getColumnIndex("N2091_DK")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2092, c7.getString(c7.getColumnIndex("N2092")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2092x, c7.getString(c7.getColumnIndex("N2092x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2093, c7.getString(c7.getColumnIndex("N2093")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2093x, c7.getString(c7.getColumnIndex("N2093x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2094, c7.getString(c7.getColumnIndex("N2094")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2095, c7.getString(c7.getColumnIndex("N2095")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_1, c7.getString(c7.getColumnIndex("N2096_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_2, c7.getString(c7.getColumnIndex("N2096_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_3, c7.getString(c7.getColumnIndex("N2096_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_4, c7.getString(c7.getColumnIndex("N2096_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_5, c7.getString(c7.getColumnIndex("N2096_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_6, c7.getString(c7.getColumnIndex("N2096_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_7, c7.getString(c7.getColumnIndex("N2096_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_8, c7.getString(c7.getColumnIndex("N2096_8")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_9, c7.getString(c7.getColumnIndex("N2096_9")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_10, c7.getString(c7.getColumnIndex("N2096_10")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_11, c7.getString(c7.getColumnIndex("N2096_11")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_12, c7.getString(c7.getColumnIndex("N2096_12")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_13, c7.getString(c7.getColumnIndex("N2096_13")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_14, c7.getString(c7.getColumnIndex("N2096_14")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_15, c7.getString(c7.getColumnIndex("N2096_15")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_16, c7.getString(c7.getColumnIndex("N2096_16")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_17, c7.getString(c7.getColumnIndex("N2096_17")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2096_OT, c7.getString(c7.getColumnIndex("N2096_18")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2097_1, c7.getString(c7.getColumnIndex("N2097_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2097_2, c7.getString(c7.getColumnIndex("N2097_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2097_3, c7.getString(c7.getColumnIndex("N2097_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2098, c7.getString(c7.getColumnIndex("N2098")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2098x, c7.getString(c7.getColumnIndex("N2098x")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2099, c7.getString(c7.getColumnIndex("N2099")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_1, c7.getString(c7.getColumnIndex("N2100_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_2, c7.getString(c7.getColumnIndex("N2100_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_3, c7.getString(c7.getColumnIndex("N2100_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_4, c7.getString(c7.getColumnIndex("N2100_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_5, c7.getString(c7.getColumnIndex("N2100_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_6, c7.getString(c7.getColumnIndex("N2100_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_7, c7.getString(c7.getColumnIndex("N2100_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2100_DK, c7.getString(c7.getColumnIndex("N2100_DK")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_1, c7.getString(c7.getColumnIndex("N2101_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_2, c7.getString(c7.getColumnIndex("N2101_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_3, c7.getString(c7.getColumnIndex("N2101_3")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_4, c7.getString(c7.getColumnIndex("N2101_4")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_5, c7.getString(c7.getColumnIndex("N2101_5")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_6, c7.getString(c7.getColumnIndex("N2101_6")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_7, c7.getString(c7.getColumnIndex("N2101_7")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2101_DK, c7.getString(c7.getColumnIndex("N2101_DK")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2102, c7.getString(c7.getColumnIndex("N2102")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2103_1, c7.getString(c7.getColumnIndex("N2103_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2103_2, c7.getString(c7.getColumnIndex("N2103_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2104, c7.getString(c7.getColumnIndex("N2104")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2105, c7.getString(c7.getColumnIndex("N2105")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2106, c7.getString(c7.getColumnIndex("N2106")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2107_1, c7.getString(c7.getColumnIndex("N2107_1")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2107_2, c7.getString(c7.getColumnIndex("N2107_2")));
                    params.put(N2080_N2107.sub_N2080_N2107.N2107_3, c7.getString(c7.getColumnIndex("N2107_3")));
                }

                return params;
            }
        };

        myRequestQueue.add(sendMyRequest);
    }

    public void upload_C(final String study_id) {

        final String ROOT_URL = "http://10.199.28.86/sm/Welcome/collect_C";

        final RequestQueue myRequestQueue = Volley.newRequestQueue(mContext);

        StringRequest sendMyRequest = new StringRequest(Request.Method.POST, ROOT_URL,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(mContext, response, Toast.LENGTH_LONG).show();
                        myRequestQueue.getCache().clear();
                        //upload2(study_id);

                        try {

                            JSONObject JSONObject = new JSONObject(response);

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(mContext, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {

            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<>();

                //ArrayList<String> loopResponse = new ArrayList();


                DBHelper db = new DBHelper(mContext);

                Cursor c = db.getData("Q1101_Q1610", study_id);
                Cursor c2 = db.getData("C3001_C3011", study_id);
                Cursor c3 = db.getData("C3012_C3022", study_id);
                Cursor c4 = db.getData("C3051_C3099", study_id);
                Cursor c5 = db.getData("C3101_C3112", study_id);
                Cursor c6 = db.getData("C3121_C3228", study_id);
                Cursor c7 = db.getData("C3301_C3314", study_id);
                Cursor c8 = db.getData("C3351_C3364", study_id);
                Cursor c9 = db.getData("C3401_C3457", study_id);
                Cursor c10 = db.getData("C3471_C3472", study_id);
                Cursor c11 = db.getData("C3251_C3288_A_C", study_id);
                Cursor c12 = db.getData("C3251_C3288_B", study_id);

                params.put("table1", "q1101_q1610");
                params.put("table2", "c3001_c3011");
                params.put("table3", "c3012_c3022");
                params.put("table4", "c3051_c3099");
                params.put("table5", "c3101_c3112");
                params.put("table6", "c3121_c3228");
                params.put("table7", "c3301_c3314");
                params.put("table8", "c3351_c3364");
                params.put("table9", "c3401_c3457");
                params.put("table10", "c3471_c3472");
                params.put("table11", "c3251_c3288_a_c");
                params.put("table12", "c3251_c3288_b");

                if (c.getCount() > 0) {

                    c.moveToFirst();

                    params.put(Q1101_Q1610.study_id, c.getString(c.getColumnIndex("study_id")));
                    params.put(Q1101_Q1610.Q1201_1, c.getString(c.getColumnIndex("Q1201_1")));
                    params.put(Q1101_Q1610.Q1201_2, c.getString(c.getColumnIndex("Q1201_2")));
                    params.put(Q1101_Q1610.Q1201_3, c.getString(c.getColumnIndex("Q1201_3")));
                    params.put(Q1101_Q1610.Q1201_4, c.getString(c.getColumnIndex("Q1201_4")));
                    params.put(Q1101_Q1610.Q1201_5, c.getString(c.getColumnIndex("Q1201_5")));
                    params.put(Q1101_Q1610.Q1201_6, c.getString(c.getColumnIndex("Q1201_6")));
                    params.put(Q1101_Q1610.Q1202, c.getString(c.getColumnIndex("Q1202")));
                    params.put(Q1101_Q1610.Q1203, c.getString(c.getColumnIndex("Q1203")));
                    params.put(Q1101_Q1610.Q1204, c.getString(c.getColumnIndex("Q1204")));
                    params.put(Q1101_Q1610.Q1205, c.getString(c.getColumnIndex("Q1205")));
                    params.put(Q1101_Q1610.Q1206_d, c.getString(c.getColumnIndex("Q1206_d")));
                    params.put(Q1101_Q1610.Q1206_m, c.getString(c.getColumnIndex("Q1206_m")));
                    params.put(Q1101_Q1610.Q1206_y, c.getString(c.getColumnIndex("Q1206_y")));
                    params.put(Q1101_Q1610.Q1207, c.getString(c.getColumnIndex("Q1207")));
                    params.put(Q1101_Q1610.Q1208, c.getString(c.getColumnIndex("Q1208")));
                    params.put(Q1101_Q1610.Q1209, c.getString(c.getColumnIndex("Q1209")));
                    params.put(Q1101_Q1610.Q1301, c.getString(c.getColumnIndex("Q1301")));
                    params.put(Q1101_Q1610.Q1302, c.getString(c.getColumnIndex("Q1302")));
                    params.put(Q1101_Q1610.Q1307, c.getString(c.getColumnIndex("Q1307")));
                    params.put(Q1101_Q1610.Q1308, c.getString(c.getColumnIndex("Q1308")));
                    params.put(Q1101_Q1610.Q1309, c.getString(c.getColumnIndex("Q1309")));
                    params.put(Q1101_Q1610.Q1310, c.getString(c.getColumnIndex("Q1310")));
                    params.put(Q1101_Q1610.Q1311, c.getString(c.getColumnIndex("Q1311")));
                    params.put(Q1101_Q1610.Q1312, c.getString(c.getColumnIndex("Q1312")));
                    params.put(Q1101_Q1610.Q1313, c.getString(c.getColumnIndex("Q1313")));
                    params.put(Q1101_Q1610.Q1401, c.getString(c.getColumnIndex("Q1401")));
                    params.put(Q1101_Q1610.Q1402, c.getString(c.getColumnIndex("Q1402")));
                    params.put(Q1101_Q1610.Q1403, c.getString(c.getColumnIndex("Q1403")));
                    params.put(Q1101_Q1610.Q1403_OT, c.getString(c.getColumnIndex("Q1403_OT")));
                    params.put(Q1101_Q1610.Q1404, c.getString(c.getColumnIndex("Q1404")));
                    params.put(Q1101_Q1610.Q1405, c.getString(c.getColumnIndex("Q1405")));
                    params.put(Q1101_Q1610.Q1406, c.getString(c.getColumnIndex("Q1406")));
                    params.put(Q1101_Q1610.Q1407, c.getString(c.getColumnIndex("Q1407")));
                    params.put(Q1101_Q1610.Q1408, c.getString(c.getColumnIndex("Q1408")));
                    params.put(Q1101_Q1610.Q1409, c.getString(c.getColumnIndex("Q1409")));
                    params.put(Q1101_Q1610.Q1410, c.getString(c.getColumnIndex("Q1410")));
                    params.put(Q1101_Q1610.Q1411, c.getString(c.getColumnIndex("Q1411")));
                    params.put(Q1101_Q1610.Q1412, c.getString(c.getColumnIndex("Q1412")));
                    params.put(Q1101_Q1610.Q1413, c.getString(c.getColumnIndex("Q1413")));
                    params.put(Q1101_Q1610.Q1414_1, c.getString(c.getColumnIndex("Q1414_1")));
                    params.put(Q1101_Q1610.Q1414_2, c.getString(c.getColumnIndex("Q1414_2")));
                    params.put(Q1101_Q1610.Q1414_3, c.getString(c.getColumnIndex("Q1414_3")));
                    params.put(Q1101_Q1610.Q1414_4, c.getString(c.getColumnIndex("Q1414_4")));
                    params.put(Q1101_Q1610.Q1414_5, c.getString(c.getColumnIndex("Q1414_5")));
                    params.put(Q1101_Q1610.Q1414_6, c.getString(c.getColumnIndex("Q1414_6")));
                    params.put(Q1101_Q1610.Q1414_7, c.getString(c.getColumnIndex("Q1414_7")));
                    params.put(Q1101_Q1610.Q1414_8, c.getString(c.getColumnIndex("Q1414_8")));
                    params.put(Q1101_Q1610.Q1414_9, c.getString(c.getColumnIndex("Q1414_9")));
                    params.put(Q1101_Q1610.Q1414_10, c.getString(c.getColumnIndex("Q1414_10")));
                    params.put(Q1101_Q1610.Q1415, c.getString(c.getColumnIndex("Q1415")));
                    params.put(Q1101_Q1610.Q1416, c.getString(c.getColumnIndex("Q1416")));
                    params.put(Q1101_Q1610.Q1416_OT, c.getString(c.getColumnIndex("Q1416_OT")));
                    params.put(Q1101_Q1610.Q1417, c.getString(c.getColumnIndex("Q1417")));
                    params.put(Q1101_Q1610.Q1417_OT, c.getString(c.getColumnIndex("Q1417_OT")));
                    params.put(Q1101_Q1610.Q1418, c.getString(c.getColumnIndex("Q1418")));
                    params.put(Q1101_Q1610.Q1418_OT, c.getString(c.getColumnIndex("Q1418_OT")));
                    params.put(Q1101_Q1610.Q1419, c.getString(c.getColumnIndex("Q1419")));
                    params.put(Q1101_Q1610.Q1419_OT, c.getString(c.getColumnIndex("Q1419_OT")));
                    params.put(Q1101_Q1610.Q1420, c.getString(c.getColumnIndex("Q1420")));
                    params.put(Q1101_Q1610.Q1420_OT, c.getString(c.getColumnIndex("Q1420_OT")));
                    params.put(Q1101_Q1610.Q1421, c.getString(c.getColumnIndex("Q1421")));
                    params.put(Q1101_Q1610.Q1421_OT, c.getString(c.getColumnIndex("Q1421_OT")));
                    params.put(Q1101_Q1610.Q1501, c.getString(c.getColumnIndex("Q1501")));
                    params.put(Q1101_Q1610.Q1502, c.getString(c.getColumnIndex("Q1502")));
                    params.put(Q1101_Q1610.Q1503, c.getString(c.getColumnIndex("Q1503")));
                    params.put(Q1101_Q1610.Q1503_OT, c.getString(c.getColumnIndex("Q1503_OT")));
                    params.put(Q1101_Q1610.Q1601, c.getString(c.getColumnIndex("Q1601")));
                    params.put(Q1101_Q1610.Q1602, c.getString(c.getColumnIndex("Q1602")));
                    params.put(Q1101_Q1610.Q1603, c.getString(c.getColumnIndex("Q1603")));
                    params.put(Q1101_Q1610.Q1604, c.getString(c.getColumnIndex("Q1604")));
                    params.put(Q1101_Q1610.Q1604_OT, c.getString(c.getColumnIndex("Q1604_OT")));
                    params.put(Q1101_Q1610.Q1605, c.getString(c.getColumnIndex("Q1605")));
                    params.put(Q1101_Q1610.Q1606, c.getString(c.getColumnIndex("Q1606")));
                    params.put(Q1101_Q1610.Q1607_1, c.getString(c.getColumnIndex("Q1607_1")));
                    params.put(Q1101_Q1610.Q1607_2, c.getString(c.getColumnIndex("Q1607_2")));
                    params.put(Q1101_Q1610.Q1607_3, c.getString(c.getColumnIndex("Q1607_3")));
                    params.put(Q1101_Q1610.Q1608_1, c.getString(c.getColumnIndex("Q1608_1")));
                    params.put(Q1101_Q1610.Q1608_2, c.getString(c.getColumnIndex("Q1608_2")));
                    params.put(Q1101_Q1610.Q1608_3, c.getString(c.getColumnIndex("Q1608_3")));
                    params.put(Q1101_Q1610.Q1609, c.getString(c.getColumnIndex("Q1609")));
                    params.put(Q1101_Q1610.Q1610_1, c.getString(c.getColumnIndex("Q1610_1")));
                    params.put(Q1101_Q1610.Q1610_2, c.getString(c.getColumnIndex("Q1610_2")));
                    params.put(Q1101_Q1610.Q1610_3, c.getString(c.getColumnIndex("Q1610_3")));
                    params.put(Q1101_Q1610.interviewType, c.getString(c.getColumnIndex("interviewType")));
                    params.put(Q1101_Q1610.currentSection, c.getString(c.getColumnIndex("currentSection")));
                }

                if (c2.getCount() > 0) {

                    c2.moveToFirst();

                    params.put(C3001_C3011.C3001, c2.getString(c2.getColumnIndex("C3001")));
                    params.put(C3001_C3011.C3002, c2.getString(c2.getColumnIndex("C3002")));
                    params.put(C3001_C3011.C3003, c2.getString(c2.getColumnIndex("C3003")));
                    params.put(C3001_C3011.C3004, c2.getString(c2.getColumnIndex("C3004")));
                    params.put(C3001_C3011.C3005u, c2.getString(c2.getColumnIndex("C3005u")));
                    params.put(C3001_C3011.C3005d, c2.getString(c2.getColumnIndex("C3005d")));
                    params.put(C3001_C3011.C3005w, c2.getString(c2.getColumnIndex("C3005w")));
                    params.put(C3001_C3011.C3005m, c2.getString(c2.getColumnIndex("C3005m")));
                    params.put(C3001_C3011.C3006, c2.getString(c2.getColumnIndex("C3006")));
                    params.put(C3001_C3011.C3006_OT, c2.getString(c2.getColumnIndex("C3006_OT")));
                    params.put(C3001_C3011.C3008, c2.getString(c2.getColumnIndex("C3008")));
                    params.put(C3001_C3011.C3008_OT, c2.getString(c2.getColumnIndex("C3008_OT")));
                    params.put(C3001_C3011.C3009_1, c2.getString(c2.getColumnIndex("C3009_1")));
                    params.put(C3001_C3011.C3009_2, c2.getString(c2.getColumnIndex("C3009_2")));
                    params.put(C3001_C3011.C3009_3, c2.getString(c2.getColumnIndex("C3009_3")));
                    params.put(C3001_C3011.C3009_4, c2.getString(c2.getColumnIndex("C3009_4")));
                    params.put(C3001_C3011.C3010, c2.getString(c2.getColumnIndex("C3010")));
                    params.put(C3001_C3011.C3011, c2.getString(c2.getColumnIndex("C3011")));

                } else {

                    params.put(C3001_C3011.C3001, "-2");
                    params.put(C3001_C3011.C3002, "-2");
                    params.put(C3001_C3011.C3003, "-2");
                    params.put(C3001_C3011.C3004, "-2");
                    params.put(C3001_C3011.C3005u, "-2");
                    params.put(C3001_C3011.C3005d, "-2");
                    params.put(C3001_C3011.C3005w, "-2");
                    params.put(C3001_C3011.C3005m, "-2");
                    params.put(C3001_C3011.C3006, "-2");
                    params.put(C3001_C3011.C3006_OT, "-2");
                    params.put(C3001_C3011.C3008, "-2");
                    params.put(C3001_C3011.C3008_OT, "-2");
                    params.put(C3001_C3011.C3009_1, "-2");
                    params.put(C3001_C3011.C3009_2, "-2");
                    params.put(C3001_C3011.C3009_3, "-2");
                    params.put(C3001_C3011.C3009_4, "-2");
                    params.put(C3001_C3011.C3010, "-2");
                    params.put(C3001_C3011.C3011, "-2");
                }

                if (c3.getCount() > 0) {

                    c3.moveToFirst();

                    params.put(C3012_C3022.C3012, c3.getString(c3.getColumnIndex("C3012")));
                    params.put(C3012_C3022.C3013, c3.getString(c3.getColumnIndex("C3013")));
                    params.put(C3012_C3022.C3015, c3.getString(c3.getColumnIndex("C3015")));
                    params.put(C3012_C3022.C3016, c3.getString(c3.getColumnIndex("C3016")));
                    params.put(C3012_C3022.C3017, c3.getString(c3.getColumnIndex("C3017")));
                    params.put(C3012_C3022.C3018, c3.getString(c3.getColumnIndex("C3018")));
                    params.put(C3012_C3022.C3018_1, c3.getString(c3.getColumnIndex("C3018_1")));
                    params.put(C3012_C3022.C3019_u, c3.getString(c3.getColumnIndex("C3019_u")));
                    params.put(C3012_C3022.C3019_a, c3.getString(c3.getColumnIndex("C3019_a")));
                    params.put(C3012_C3022.C3019_b, c3.getString(c3.getColumnIndex("C3019_b")));
                    params.put(C3012_C3022.C3019_c, c3.getString(c3.getColumnIndex("C3019_c")));
                    params.put(C3012_C3022.C3020, c3.getString(c3.getColumnIndex("C3020")));
                    params.put(C3012_C3022.C3021u, c3.getString(c3.getColumnIndex("C3021u")));
                    params.put(C3012_C3022.C3021d, c3.getString(c3.getColumnIndex("C3021d")));
                    params.put(C3012_C3022.C3021m, c3.getString(c3.getColumnIndex("C3021m")));
                    params.put(C3012_C3022.C3021y, c3.getString(c3.getColumnIndex("C3021y")));
                    params.put(C3012_C3022.C3022, c3.getString(c3.getColumnIndex("C3022")));

                }

                if (c4.getCount() > 0) {

                    c4.moveToFirst();

                    params.put(C3051_C3099.C3051, c4.getString(c4.getColumnIndex("C3051")));
                    params.put(C3051_C3099.C3052, c4.getString(c4.getColumnIndex("C3052")));
                    params.put(C3051_C3099.C3053, c4.getString(c4.getColumnIndex("C3053")));
                    params.put(C3051_C3099.C3053a, c4.getString(c4.getColumnIndex("C3053a")));
                    params.put(C3051_C3099.C3054, c4.getString(c4.getColumnIndex("C3054")));
                    params.put(C3051_C3099.C3055, c4.getString(c4.getColumnIndex("C3055")));
                    params.put(C3051_C3099.C3056, c4.getString(c4.getColumnIndex("C3056")));
                    params.put(C3051_C3099.C3057, c4.getString(c4.getColumnIndex("C3057")));
                    params.put(C3051_C3099.C3058, c4.getString(c4.getColumnIndex("C3058")));
                    params.put(C3051_C3099.C3059, c4.getString(c4.getColumnIndex("C3059")));
                    params.put(C3051_C3099.C3060, c4.getString(c4.getColumnIndex("C3060")));
                    params.put(C3051_C3099.C3061, c4.getString(c4.getColumnIndex("C3061")));
                    params.put(C3051_C3099.C3062, c4.getString(c4.getColumnIndex("C3062")));
                    params.put(C3051_C3099.C3063, c4.getString(c4.getColumnIndex("C3063")));
                    params.put(C3051_C3099.C3064, c4.getString(c4.getColumnIndex("C3064")));
                    params.put(C3051_C3099.C3065_1, c4.getString(c4.getColumnIndex("C3065_1")));
                    params.put(C3051_C3099.C3065_2, c4.getString(c4.getColumnIndex("C3065_2")));
                    params.put(C3051_C3099.C3065_3, c4.getString(c4.getColumnIndex("C3065_3")));
                    params.put(C3051_C3099.C3065_4, c4.getString(c4.getColumnIndex("C3065_4")));
                    params.put(C3051_C3099.C3065_5, c4.getString(c4.getColumnIndex("C3065_5")));
                    params.put(C3051_C3099.C3065_6, c4.getString(c4.getColumnIndex("C3065_6")));
                    params.put(C3051_C3099.C3065_7, c4.getString(c4.getColumnIndex("C3065_7")));
                    params.put(C3051_C3099.C3065_DK, c4.getString(c4.getColumnIndex("C3065_DK")));
                    params.put(C3051_C3099.C3065_OT, c4.getString(c4.getColumnIndex("C3065_OT")));
                    params.put(C3051_C3099.C3066, c4.getString(c4.getColumnIndex("C3066")));
                    params.put(C3051_C3099.C3067_1, c4.getString(c4.getColumnIndex("C3067_1")));
                    params.put(C3051_C3099.C3067_2, c4.getString(c4.getColumnIndex("C3067_2")));
                    params.put(C3051_C3099.C3067_3, c4.getString(c4.getColumnIndex("C3067_3")));
                    params.put(C3051_C3099.C3067_4, c4.getString(c4.getColumnIndex("C3067_4")));
                    params.put(C3051_C3099.C3067_5, c4.getString(c4.getColumnIndex("C3067_5")));
                    params.put(C3051_C3099.C3067_6, c4.getString(c4.getColumnIndex("C3067_6")));
                    params.put(C3051_C3099.C3067_7, c4.getString(c4.getColumnIndex("C3067_7")));
                    params.put(C3051_C3099.C3067_DK, c4.getString(c4.getColumnIndex("C3067_DK")));
                    params.put(C3051_C3099.C3067_OT, c4.getString(c4.getColumnIndex("C3067_OT")));
                    params.put(C3051_C3099.C3068, c4.getString(c4.getColumnIndex("C3068")));
                    params.put(C3051_C3099.C3068_OT, c4.getString(c4.getColumnIndex("C3068_OT")));
                    params.put(C3051_C3099.C3069, c4.getString(c4.getColumnIndex("C3069")));
                    params.put(C3051_C3099.C3070, c4.getString(c4.getColumnIndex("C3070")));
                    params.put(C3051_C3099.C3071, c4.getString(c4.getColumnIndex("C3071")));
                    params.put(C3051_C3099.C3072, c4.getString(c4.getColumnIndex("C3072")));
                    params.put(C3051_C3099.C3073_1, c4.getString(c4.getColumnIndex("C3073_1")));
                    params.put(C3051_C3099.C3073_2, c4.getString(c4.getColumnIndex("C3073_2")));
                    params.put(C3051_C3099.C3073_3, c4.getString(c4.getColumnIndex("C3073_3")));
                    params.put(C3051_C3099.C3074, c4.getString(c4.getColumnIndex("C3074")));
                    params.put(C3051_C3099.C3075, c4.getString(c4.getColumnIndex("C3075")));
                    params.put(C3051_C3099.C3076, c4.getString(c4.getColumnIndex("C3076")));
                    params.put(C3051_C3099.C3077, c4.getString(c4.getColumnIndex("C3077")));
                    params.put(C3051_C3099.C3078, c4.getString(c4.getColumnIndex("C3078")));
                    params.put(C3051_C3099.C3079, c4.getString(c4.getColumnIndex("C3079")));
                    params.put(C3051_C3099.C3079_OT, c4.getString(c4.getColumnIndex("C3079_OT")));
                    params.put(C3051_C3099.C3080, c4.getString(c4.getColumnIndex("C3080")));
                    params.put(C3051_C3099.C3081, c4.getString(c4.getColumnIndex("C3081")));
                    params.put(C3051_C3099.C3082, c4.getString(c4.getColumnIndex("C3082")));
                    params.put(C3051_C3099.C3083, c4.getString(c4.getColumnIndex("C3083")));
                    params.put(C3051_C3099.C3084, c4.getString(c4.getColumnIndex("C3084")));
                    params.put(C3051_C3099.C3085, c4.getString(c4.getColumnIndex("C3085")));
                    params.put(C3051_C3099.C3086, c4.getString(c4.getColumnIndex("C3086")));
                    params.put(C3051_C3099.C3087, c4.getString(c4.getColumnIndex("C3087")));
                    params.put(C3051_C3099.C3088, c4.getString(c4.getColumnIndex("C3088")));
                    params.put(C3051_C3099.C3089, c4.getString(c4.getColumnIndex("C3089")));
                    params.put(C3051_C3099.C3090_1, c4.getString(c4.getColumnIndex("C3090_1")));
                    params.put(C3051_C3099.C3090_2, c4.getString(c4.getColumnIndex("C3090_2")));
                    params.put(C3051_C3099.C3091, c4.getString(c4.getColumnIndex("C3091")));
                    params.put(C3051_C3099.C3092, c4.getString(c4.getColumnIndex("C3092")));
                    params.put(C3051_C3099.C3093, c4.getString(c4.getColumnIndex("C3093")));
                    params.put(C3051_C3099.C3094, c4.getString(c4.getColumnIndex("C3094")));
                    params.put(C3051_C3099.C3095, c4.getString(c4.getColumnIndex("C3095")));
                    params.put(C3051_C3099.C3096, c4.getString(c4.getColumnIndex("C3096")));
                    params.put(C3051_C3099.C3097, c4.getString(c4.getColumnIndex("C3097")));
                    params.put(C3051_C3099.C3098, c4.getString(c4.getColumnIndex("C3098")));
                    params.put(C3051_C3099.C3099, c4.getString(c4.getColumnIndex("C3099")));

                } else {

                    params.put(C3051_C3099.C3051, "-2");
                    params.put(C3051_C3099.C3052, "-2");
                    params.put(C3051_C3099.C3053, "-2");
                    params.put(C3051_C3099.C3053a, "-2");
                    params.put(C3051_C3099.C3054, "-2");
                    params.put(C3051_C3099.C3055, "-2");
                    params.put(C3051_C3099.C3056, "-2");
                    params.put(C3051_C3099.C3057, "-2");
                    params.put(C3051_C3099.C3058, "-2");
                    params.put(C3051_C3099.C3059, "-2");
                    params.put(C3051_C3099.C3060, "-2");
                    params.put(C3051_C3099.C3061, "-2");
                    params.put(C3051_C3099.C3062, "-2");
                    params.put(C3051_C3099.C3063, "-2");
                    params.put(C3051_C3099.C3064, "-2");
                    params.put(C3051_C3099.C3065_1, "-2");
                    params.put(C3051_C3099.C3065_2, "-2");
                    params.put(C3051_C3099.C3065_3, "-2");
                    params.put(C3051_C3099.C3065_4, "-2");
                    params.put(C3051_C3099.C3065_5, "-2");
                    params.put(C3051_C3099.C3065_6, "-2");
                    params.put(C3051_C3099.C3065_7, "-2");
                    params.put(C3051_C3099.C3065_DK, "-2");
                    params.put(C3051_C3099.C3065_OT, "-2");
                    params.put(C3051_C3099.C3066, "-2");
                    params.put(C3051_C3099.C3067_1, "-2");
                    params.put(C3051_C3099.C3067_2, "-2");
                    params.put(C3051_C3099.C3067_3, "-2");
                    params.put(C3051_C3099.C3067_4, "-2");
                    params.put(C3051_C3099.C3067_5, "-2");
                    params.put(C3051_C3099.C3067_6, "-2");
                    params.put(C3051_C3099.C3067_7, "-2");
                    params.put(C3051_C3099.C3067_DK, "-2");
                    params.put(C3051_C3099.C3067_OT, "-2");
                    params.put(C3051_C3099.C3068, "-2");
                    params.put(C3051_C3099.C3068_OT, "-2");
                    params.put(C3051_C3099.C3069, "-2");
                    params.put(C3051_C3099.C3070, "-2");
                    params.put(C3051_C3099.C3071, "-2");
                    params.put(C3051_C3099.C3072, "-2");
                    params.put(C3051_C3099.C3073_1, "-2");
                    params.put(C3051_C3099.C3073_2, "-2");
                    params.put(C3051_C3099.C3073_3, "-2");
                    params.put(C3051_C3099.C3074, "-2");
                    params.put(C3051_C3099.C3075, "-2");
                    params.put(C3051_C3099.C3076, "-2");
                    params.put(C3051_C3099.C3077, "-2");
                    params.put(C3051_C3099.C3078, "-2");
                    params.put(C3051_C3099.C3079, "-2");
                    params.put(C3051_C3099.C3079_OT, "-2");
                    params.put(C3051_C3099.C3080, "-2");
                    params.put(C3051_C3099.C3081, "-2");
                    params.put(C3051_C3099.C3082, "-2");
                    params.put(C3051_C3099.C3083, "-2");
                    params.put(C3051_C3099.C3084, "-2");
                    params.put(C3051_C3099.C3085, "-2");
                    params.put(C3051_C3099.C3086, "-2");
                    params.put(C3051_C3099.C3087, "-2");
                    params.put(C3051_C3099.C3088, "-2");
                    params.put(C3051_C3099.C3089, "-2");
                    params.put(C3051_C3099.C3090_1, "-2");
                    params.put(C3051_C3099.C3090_2, "-2");
                    params.put(C3051_C3099.C3091, "-2");
                    params.put(C3051_C3099.C3092, "-2");
                    params.put(C3051_C3099.C3093, "-2");
                    params.put(C3051_C3099.C3094, "-2");
                    params.put(C3051_C3099.C3095, "-2");
                    params.put(C3051_C3099.C3096, "-2");
                    params.put(C3051_C3099.C3097, "-2");
                    params.put(C3051_C3099.C3098, "-2");
                    params.put(C3051_C3099.C3099, "-2");
                }

                if (c5.getCount() > 0) {

                    c5.moveToFirst();

                    params.put(C3101_C3112.C3101, c5.getString(c5.getColumnIndex("C3101")));
                    params.put(C3101_C3112.C3102, c5.getString(c5.getColumnIndex("C3102")));
                    params.put(C3101_C3112.C3103, c5.getString(c5.getColumnIndex("C3103")));
                    params.put(C3101_C3112.C3104, c5.getString(c5.getColumnIndex("C3104")));
                    params.put(C3101_C3112.C3105, c5.getString(c5.getColumnIndex("C3105")));
                    params.put(C3101_C3112.C3105_OT, c5.getString(c5.getColumnIndex("C3105_OT")));
                    params.put(C3101_C3112.C3106, c5.getString(c5.getColumnIndex("C3106")));
                    params.put(C3101_C3112.C3107_1, c5.getString(c5.getColumnIndex("C3107_1")));
                    params.put(C3101_C3112.C3107_2, c5.getString(c5.getColumnIndex("C3107_2")));
                    params.put(C3101_C3112.C3107_3, c5.getString(c5.getColumnIndex("C3107_3")));
                    params.put(C3101_C3112.C3107_4, c5.getString(c5.getColumnIndex("C3107_4")));
                    params.put(C3101_C3112.C3107_5, c5.getString(c5.getColumnIndex("C3107_5")));
                    params.put(C3101_C3112.C3107_6, c5.getString(c5.getColumnIndex("C3107_6")));
                    params.put(C3101_C3112.C3107_6_OT, c5.getString(c5.getColumnIndex("C3107_6_OT")));
                    params.put(C3101_C3112.C3107_7, c5.getString(c5.getColumnIndex("C3107_7")));
                    params.put(C3101_C3112.C3107_8, c5.getString(c5.getColumnIndex("C3107_8")));
                    params.put(C3101_C3112.C3107_9, c5.getString(c5.getColumnIndex("C3107_9")));
                    params.put(C3101_C3112.C3107_10, c5.getString(c5.getColumnIndex("C3107_10")));
                    params.put(C3101_C3112.C3107_11, c5.getString(c5.getColumnIndex("C3107_11")));
                    params.put(C3101_C3112.C3107_12, c5.getString(c5.getColumnIndex("C3107_12")));
                    params.put(C3101_C3112.C3107_13, c5.getString(c5.getColumnIndex("C3107_13")));
                    params.put(C3101_C3112.C3107_14, c5.getString(c5.getColumnIndex("C3107_14")));
                    params.put(C3101_C3112.C3107_15, c5.getString(c5.getColumnIndex("C3107_15")));
                    params.put(C3101_C3112.C3107_16, c5.getString(c5.getColumnIndex("C3107_16")));
                    params.put(C3101_C3112.C3107_17, c5.getString(c5.getColumnIndex("C3107_17")));
                    params.put(C3101_C3112.C3107_18, c5.getString(c5.getColumnIndex("C3107_18")));
                    params.put(C3101_C3112.C3107_19, c5.getString(c5.getColumnIndex("C3107_19")));
                    params.put(C3101_C3112.C3107_20, c5.getString(c5.getColumnIndex("C3107_20")));
                    params.put(C3101_C3112.C3107_21, c5.getString(c5.getColumnIndex("C3107_21")));
                    params.put(C3101_C3112.C3107_21_OT, c5.getString(c5.getColumnIndex("C3107_21")));
                    params.put(C3101_C3112.C3108, c5.getString(c5.getColumnIndex("C3108")));
                    params.put(C3101_C3112.C3109_1, c5.getString(c5.getColumnIndex("C3109_1")));
                    params.put(C3101_C3112.C3109_2, c5.getString(c5.getColumnIndex("C3109_2")));
                    params.put(C3101_C3112.C3109_3, c5.getString(c5.getColumnIndex("C3109_3")));
                    params.put(C3101_C3112.C3109_4, c5.getString(c5.getColumnIndex("C3109_4")));
                    params.put(C3101_C3112.C3109_5, c5.getString(c5.getColumnIndex("C3109_5")));
                    params.put(C3101_C3112.C3109_6, c5.getString(c5.getColumnIndex("C3109_6")));
                    params.put(C3101_C3112.C3109_7, c5.getString(c5.getColumnIndex("C3109_7")));
                    params.put(C3101_C3112.C3109_8, c5.getString(c5.getColumnIndex("C3109_8")));
                    params.put(C3101_C3112.C3109_9, c5.getString(c5.getColumnIndex("C3109_9")));
                    params.put(C3101_C3112.C3109_10, c5.getString(c5.getColumnIndex("C3109_10")));
                    params.put(C3101_C3112.C3109_11, c5.getString(c5.getColumnIndex("C3109_11")));
                    params.put(C3101_C3112.C3109_12, c5.getString(c5.getColumnIndex("C3109_12")));
                    params.put(C3101_C3112.C3109_13, c5.getString(c5.getColumnIndex("C3109_13")));
                    params.put(C3101_C3112.C3109_14, c5.getString(c5.getColumnIndex("C3109_14")));
                    params.put(C3101_C3112.C3110, c5.getString(c5.getColumnIndex("C3110")));
                    params.put(C3101_C3112.C3111, c5.getString(c5.getColumnIndex("C3111")));
                    params.put(C3101_C3112.C3111_1, c5.getString(c5.getColumnIndex("C3111_1")));
                    params.put(C3101_C3112.C3111_2, c5.getString(c5.getColumnIndex("C3111_2")));
                    params.put(C3101_C3112.C3111_3, c5.getString(c5.getColumnIndex("C3111_3")));
                    params.put(C3101_C3112.C3111_4, c5.getString(c5.getColumnIndex("C3111_4")));
                    params.put(C3101_C3112.C3111_5, c5.getString(c5.getColumnIndex("C3111_5")));
                    params.put(C3101_C3112.C3111_6, c5.getString(c5.getColumnIndex("C3111_6")));
                    params.put(C3101_C3112.C3111_7, c5.getString(c5.getColumnIndex("C3111_7")));
                    params.put(C3101_C3112.C3111_8, c5.getString(c5.getColumnIndex("C3111_8")));
                    params.put(C3101_C3112.C3111_9, c5.getString(c5.getColumnIndex("C3111_9")));
                    params.put(C3101_C3112.C3112, c5.getString(c5.getColumnIndex("C3112")));
                }

                if (c6.getCount() > 0) {

                    c6.moveToFirst();

                    params.put(C3121_C3228.C3121, c6.getString(c6.getColumnIndex("C3121")));
                    params.put(C3121_C3228.C3122d, c6.getString(c6.getColumnIndex("C3122d")));
                    params.put(C3121_C3228.C3122m, c6.getString(c6.getColumnIndex("C3122m")));
                    params.put(C3121_C3228.C3123_u, c6.getString(c6.getColumnIndex("C3123_u")));
                    params.put(C3121_C3228.C3123_b, c6.getString(c6.getColumnIndex("C3123_b")));
                    params.put(C3121_C3228.C3123_c, c6.getString(c6.getColumnIndex("C3123_c")));
                    params.put(C3121_C3228.C3124, c6.getString(c6.getColumnIndex("C3124")));
                    params.put(C3121_C3228.C3125, c6.getString(c6.getColumnIndex("C3125")));
                    params.put(C3121_C3228.C3126, c6.getString(c6.getColumnIndex("C3126")));
                    params.put(C3121_C3228.C3127, c6.getString(c6.getColumnIndex("C3127")));
                    params.put(C3121_C3228.C3128, c6.getString(c6.getColumnIndex("C3128")));
                    params.put(C3121_C3228.C3129, c6.getString(c6.getColumnIndex("C3129")));
                    params.put(C3121_C3228.C3130, c6.getString(c6.getColumnIndex("C3130")));
                    params.put(C3121_C3228.C3131, c6.getString(c6.getColumnIndex("C3131")));
                    params.put(C3121_C3228.C3132_u, c6.getString(c6.getColumnIndex("C3132_u")));
                    params.put(C3121_C3228.C3132_a, c6.getString(c6.getColumnIndex("C3132_a")));
                    params.put(C3121_C3228.C3132_b, c6.getString(c6.getColumnIndex("C3132_b")));
                    params.put(C3121_C3228.C3133, c6.getString(c6.getColumnIndex("C3133")));
                    params.put(C3121_C3228.C3134, c6.getString(c6.getColumnIndex("C3134")));
                    params.put(C3121_C3228.C3135, c6.getString(c6.getColumnIndex("C3135")));
                    params.put(C3121_C3228.C3136, c6.getString(c6.getColumnIndex("C3136")));
                    params.put(C3121_C3228.C3137, c6.getString(c6.getColumnIndex("C3137")));
                    params.put(C3121_C3228.C3138, c6.getString(c6.getColumnIndex("C3138")));
                    params.put(C3121_C3228.C3139, c6.getString(c6.getColumnIndex("C3139")));
                    params.put(C3121_C3228.C3140, c6.getString(c6.getColumnIndex("C3140")));
                    params.put(C3121_C3228.C3141, c6.getString(c6.getColumnIndex("C3141")));
                    params.put(C3121_C3228.C3142, c6.getString(c6.getColumnIndex("C3142")));
                    params.put(C3121_C3228.C3143, c6.getString(c6.getColumnIndex("C3143")));
                    params.put(C3121_C3228.C3144_u, c6.getString(c6.getColumnIndex("C3144_u")));
                    params.put(C3121_C3228.C3144, c6.getString(c6.getColumnIndex("C3144")));
                    params.put(C3121_C3228.C3144_a, c6.getString(c6.getColumnIndex("C3144_a")));
                    params.put(C3121_C3228.C3144_b, c6.getString(c6.getColumnIndex("C3144_b")));
                    params.put(C3121_C3228.C3145, c6.getString(c6.getColumnIndex("C3145")));
                    params.put(C3121_C3228.C3146, c6.getString(c6.getColumnIndex("C3146")));
                    params.put(C3121_C3228.C3147_u, c6.getString(c6.getColumnIndex("C3147_u")));
                    params.put(C3121_C3228.C3147_a, c6.getString(c6.getColumnIndex("C3147_a")));
                    params.put(C3121_C3228.C3147_b, c6.getString(c6.getColumnIndex("C3147_b")));
                    params.put(C3121_C3228.C3148, c6.getString(c6.getColumnIndex("C3148")));
                    params.put(C3121_C3228.C3149, c6.getString(c6.getColumnIndex("C3149")));
                    params.put(C3121_C3228.C3150_u, c6.getString(c6.getColumnIndex("C3150_u")));
                    params.put(C3121_C3228.C3150_a, c6.getString(c6.getColumnIndex("C3150_a")));
                    params.put(C3121_C3228.C3150_b, c6.getString(c6.getColumnIndex("C3150_b")));
                    params.put(C3121_C3228.C3151, c6.getString(c6.getColumnIndex("C3151")));
                    params.put(C3121_C3228.C3152_u, c6.getString(c6.getColumnIndex("C3152_u")));
                    params.put(C3121_C3228.C3152_a, c6.getString(c6.getColumnIndex("C3152_a")));
                    params.put(C3121_C3228.C3152_b, c6.getString(c6.getColumnIndex("C3152_b")));
                    params.put(C3121_C3228.C3153, c6.getString(c6.getColumnIndex("C3153")));
                    params.put(C3121_C3228.C3154, c6.getString(c6.getColumnIndex("C3154")));
                    params.put(C3121_C3228.C3155, c6.getString(c6.getColumnIndex("C3155")));
                    params.put(C3121_C3228.C3156, c6.getString(c6.getColumnIndex("C3156")));
                    params.put(C3121_C3228.C3157, c6.getString(c6.getColumnIndex("C3157")));
                    params.put(C3121_C3228.C3158, c6.getString(c6.getColumnIndex("C3158")));
                    params.put(C3121_C3228.C3159_u, c6.getString(c6.getColumnIndex("C3159_u")));
                    params.put(C3121_C3228.C3159_a, c6.getString(c6.getColumnIndex("C3159_a")));
                    params.put(C3121_C3228.C3159_b, c6.getString(c6.getColumnIndex("C3159_b")));
                    params.put(C3121_C3228.C3159_c, c6.getString(c6.getColumnIndex("C3159_c")));
                    params.put(C3121_C3228.C3160, c6.getString(c6.getColumnIndex("C3160")));
                    params.put(C3121_C3228.C3161, c6.getString(c6.getColumnIndex("C3161")));
                    params.put(C3121_C3228.C3162d, c6.getString(c6.getColumnIndex("C3162d")));
                    params.put(C3121_C3228.C3162m, c6.getString(c6.getColumnIndex("C3162m")));
                    params.put(C3121_C3228.C3163_u, c6.getString(c6.getColumnIndex("C3163_u")));
                    params.put(C3121_C3228.C3163_a, c6.getString(c6.getColumnIndex("C3163_a")));
                    params.put(C3121_C3228.C3163_b, c6.getString(c6.getColumnIndex("C3163_b")));
                    params.put(C3121_C3228.C3164, c6.getString(c6.getColumnIndex("C3164")));
                    params.put(C3121_C3228.C3165_u, c6.getString(c6.getColumnIndex("C3165_u")));
                    params.put(C3121_C3228.C3165_a, c6.getString(c6.getColumnIndex("C3165_a")));
                    params.put(C3121_C3228.C3165_b, c6.getString(c6.getColumnIndex("C3165_b")));
                    params.put(C3121_C3228.C3166, c6.getString(c6.getColumnIndex("C3166")));
                    params.put(C3121_C3228.C3167, c6.getString(c6.getColumnIndex("C3167")));
                    params.put(C3121_C3228.C3168, c6.getString(c6.getColumnIndex("C3168")));
                    params.put(C3121_C3228.C3169, c6.getString(c6.getColumnIndex("C3169")));
                    params.put(C3121_C3228.C3170, c6.getString(c6.getColumnIndex("C3170")));
                    params.put(C3121_C3228.C3171, c6.getString(c6.getColumnIndex("C3171")));
                    params.put(C3121_C3228.C3172, c6.getString(c6.getColumnIndex("C3172")));
                    params.put(C3121_C3228.C3173, c6.getString(c6.getColumnIndex("C3173")));
                    params.put(C3121_C3228.C3174, c6.getString(c6.getColumnIndex("C3174")));
                    params.put(C3121_C3228.C3175_u, c6.getString(c6.getColumnIndex("C3175_u")));
                    params.put(C3121_C3228.C3175_a, c6.getString(c6.getColumnIndex("C3175_a")));
                    params.put(C3121_C3228.C3175_b, c6.getString(c6.getColumnIndex("C3175_b")));
                    params.put(C3121_C3228.C3176, c6.getString(c6.getColumnIndex("C3176")));
                    params.put(C3121_C3228.C3177_u, c6.getString(c6.getColumnIndex("C3177_u")));
                    params.put(C3121_C3228.C3177_a, c6.getString(c6.getColumnIndex("C3177_a")));
                    params.put(C3121_C3228.C3177_b, c6.getString(c6.getColumnIndex("C3177_b")));
                    params.put(C3121_C3228.C3178, c6.getString(c6.getColumnIndex("C3178")));
                    params.put(C3121_C3228.C3179_u, c6.getString(c6.getColumnIndex("C3179_u")));
                    params.put(C3121_C3228.C3179_a, c6.getString(c6.getColumnIndex("C3179_a")));
                    params.put(C3121_C3228.C3179_b, c6.getString(c6.getColumnIndex("C3179_b")));
                    params.put(C3121_C3228.C3180, c6.getString(c6.getColumnIndex("C3180")));
                    params.put(C3121_C3228.C3181, c6.getString(c6.getColumnIndex("C3181")));
                    params.put(C3121_C3228.C3182, c6.getString(c6.getColumnIndex("C3182")));
                    params.put(C3121_C3228.C3183, c6.getString(c6.getColumnIndex("C3183")));
                    params.put(C3121_C3228.C3184, c6.getString(c6.getColumnIndex("C3184")));
                    params.put(C3121_C3228.C3185, c6.getString(c6.getColumnIndex("C3185")));
                    params.put(C3121_C3228.C3186_1, c6.getString(c6.getColumnIndex("C3186_1")));
                    params.put(C3121_C3228.C3186, c6.getString(c6.getColumnIndex("C3186")));
                    params.put(C3121_C3228.C3187, c6.getString(c6.getColumnIndex("C3187")));
                    params.put(C3121_C3228.C3188, c6.getString(c6.getColumnIndex("C3188")));
                    params.put(C3121_C3228.C3189, c6.getString(c6.getColumnIndex("C3189")));
                    params.put(C3121_C3228.C3190, c6.getString(c6.getColumnIndex("C3190")));
                    params.put(C3121_C3228.C3191, c6.getString(c6.getColumnIndex("C3191")));
                    params.put(C3121_C3228.C3192, c6.getString(c6.getColumnIndex("C3192")));
                    params.put(C3121_C3228.C3193_u, c6.getString(c6.getColumnIndex("C3193_u")));
                    params.put(C3121_C3228.C3193_a, c6.getString(c6.getColumnIndex("C3193_a")));
                    params.put(C3121_C3228.C3193_b, c6.getString(c6.getColumnIndex("C3193_b")));
                    params.put(C3121_C3228.C3194, c6.getString(c6.getColumnIndex("C3194")));
                    params.put(C3121_C3228.C3195A, c6.getString(c6.getColumnIndex("C3195A")));
                    params.put(C3121_C3228.C3195, c6.getString(c6.getColumnIndex("C3195")));
                    params.put(C3121_C3228.C3196, c6.getString(c6.getColumnIndex("C3196")));
                    params.put(C3121_C3228.C3197, c6.getString(c6.getColumnIndex("C3197")));
                    params.put(C3121_C3228.C3198, c6.getString(c6.getColumnIndex("C3198")));
                    params.put(C3121_C3228.C3199, c6.getString(c6.getColumnIndex("C3199")));
                    params.put(C3121_C3228.C3199_1, c6.getString(c6.getColumnIndex("C3199_1")));
                    params.put(C3121_C3228.C3200, c6.getString(c6.getColumnIndex("C3200")));
                    params.put(C3121_C3228.C3201_u, c6.getString(c6.getColumnIndex("C3201_u")));
                    params.put(C3121_C3228.C3201_a, c6.getString(c6.getColumnIndex("C3201_a")));
                    params.put(C3121_C3228.C3201_b, c6.getString(c6.getColumnIndex("C3201_b")));
                    params.put(C3121_C3228.C3202, c6.getString(c6.getColumnIndex("C3202")));
                    params.put(C3121_C3228.C3203, c6.getString(c6.getColumnIndex("C3203")));
                    params.put(C3121_C3228.C3204_u, c6.getString(c6.getColumnIndex("C3204_u")));
                    params.put(C3121_C3228.C3204_a, c6.getString(c6.getColumnIndex("C3204_a")));
                    params.put(C3121_C3228.C3204_b, c6.getString(c6.getColumnIndex("C3204_b")));
                    params.put(C3121_C3228.C3205, c6.getString(c6.getColumnIndex("C3205")));
                    params.put(C3121_C3228.C3206, c6.getString(c6.getColumnIndex("C3206")));
                    params.put(C3121_C3228.C3207, c6.getString(c6.getColumnIndex("C3207")));
                    params.put(C3121_C3228.C3208_u, c6.getString(c6.getColumnIndex("C3208_u")));
                    params.put(C3121_C3228.C3208_a, c6.getString(c6.getColumnIndex("C3208_a")));
                    params.put(C3121_C3228.C3208_b, c6.getString(c6.getColumnIndex("C3208_b")));
                    params.put(C3121_C3228.C3209, c6.getString(c6.getColumnIndex("C3209")));
                    params.put(C3121_C3228.C3210, c6.getString(c6.getColumnIndex("C3210")));
                    params.put(C3121_C3228.C3212, c6.getString(c6.getColumnIndex("C3212")));
                    params.put(C3121_C3228.C3213, c6.getString(c6.getColumnIndex("C3213")));
                    params.put(C3121_C3228.C3214, c6.getString(c6.getColumnIndex("C3214")));
                    params.put(C3121_C3228.C3215, c6.getString(c6.getColumnIndex("C3215")));
                    params.put(C3121_C3228.C3216, c6.getString(c6.getColumnIndex("C3216")));
                    params.put(C3121_C3228.C3217, c6.getString(c6.getColumnIndex("C3217")));
                    params.put(C3121_C3228.C3218, c6.getString(c6.getColumnIndex("C3218")));
                    params.put(C3121_C3228.C3218_OT, c6.getString(c6.getColumnIndex("C3218_OT")));
                    params.put(C3121_C3228.C3219, c6.getString(c6.getColumnIndex("C3219")));
                    params.put(C3121_C3228.C3220_u, c6.getString(c6.getColumnIndex("C3220_u")));
                    params.put(C3121_C3228.C3220_a, c6.getString(c6.getColumnIndex("C3220_a")));
                    params.put(C3121_C3228.C3220_b, c6.getString(c6.getColumnIndex("C3220_b")));
                    params.put(C3121_C3228.C3221, c6.getString(c6.getColumnIndex("C3221")));
                    params.put(C3121_C3228.C3222, c6.getString(c6.getColumnIndex("C3222")));
                    params.put(C3121_C3228.C3223, c6.getString(c6.getColumnIndex("C3223")));
                    params.put(C3121_C3228.C3224, c6.getString(c6.getColumnIndex("C3224")));
                    params.put(C3121_C3228.C3225, c6.getString(c6.getColumnIndex("C3225")));
                    params.put(C3121_C3228.C3226, c6.getString(c6.getColumnIndex("C3226")));
                    params.put(C3121_C3228.C3227, c6.getString(c6.getColumnIndex("C3227")));
                    params.put(C3121_C3228.C3227_1, c6.getString(c6.getColumnIndex("C3227_1")));
                    params.put(C3121_C3228.C3227_2, c6.getString(c6.getColumnIndex("C3227_2")));
                    params.put(C3121_C3228.C3227_3, c6.getString(c6.getColumnIndex("C3227_3")));
                    params.put(C3121_C3228.C3227_4, c6.getString(c6.getColumnIndex("C3227_4")));
                    params.put(C3121_C3228.C3227_5, c6.getString(c6.getColumnIndex("C3227_5")));
                    params.put(C3121_C3228.C3227_6, c6.getString(c6.getColumnIndex("C3227_6")));
                    params.put(C3121_C3228.C3227_7, c6.getString(c6.getColumnIndex("C3227_7")));
                    params.put(C3121_C3228.C3227_8, c6.getString(c6.getColumnIndex("C3227_8")));
                    params.put(C3121_C3228.C3227_9, c6.getString(c6.getColumnIndex("C3227_9")));
                    params.put(C3121_C3228.C3227_10, c6.getString(c6.getColumnIndex("C3227_10")));
                    params.put(C3121_C3228.C3227_11, c6.getString(c6.getColumnIndex("C3227_11")));
                    params.put(C3121_C3228.C3227_12, c6.getString(c6.getColumnIndex("C3227_12")));
                    params.put(C3121_C3228.C3227_13, c6.getString(c6.getColumnIndex("C3227_13")));
                    params.put(C3121_C3228.C3227_14, c6.getString(c6.getColumnIndex("C3227_14")));
                    params.put(C3121_C3228.C3227_15, c6.getString(c6.getColumnIndex("C3227_15")));
                    params.put(C3121_C3228.C3227_16, c6.getString(c6.getColumnIndex("C3227_16")));
                    params.put(C3121_C3228.C3227_17, c6.getString(c6.getColumnIndex("C3227_17")));
                    params.put(C3121_C3228.C3227_18, c6.getString(c6.getColumnIndex("C3227_18")));
                    params.put(C3121_C3228.C3227_19, c6.getString(c6.getColumnIndex("C3227_19")));
                    params.put(C3121_C3228.C3227_20, c6.getString(c6.getColumnIndex("C3227_20")));
                    params.put(C3121_C3228.C3227_21, c6.getString(c6.getColumnIndex("C3227_21")));
                    params.put(C3121_C3228.C3227_22, c6.getString(c6.getColumnIndex("C3227_22")));
                    params.put(C3121_C3228.C3228, c6.getString(c6.getColumnIndex("C3228")));
                }

                if (c7.getCount() > 0) {

                    c7.moveToFirst();

                    params.put(C3301_C3314.C3301, c7.getString(c7.getColumnIndex("C3301")));
                    params.put(C3301_C3314.C3302_1, c7.getString(c7.getColumnIndex("C3302_1")));
                    params.put(C3301_C3314.C3302_2, c7.getString(c7.getColumnIndex("C3302_2")));
                    params.put(C3301_C3314.C3302_3, c7.getString(c7.getColumnIndex("C3302_3")));
                    params.put(C3301_C3314.C3302_4, c7.getString(c7.getColumnIndex("C3302_4")));
                    params.put(C3301_C3314.C3302_5, c7.getString(c7.getColumnIndex("C3302_5")));
                    params.put(C3301_C3314.C3302_6, c7.getString(c7.getColumnIndex("C3302_6")));
                    params.put(C3301_C3314.C3302_7, c7.getString(c7.getColumnIndex("C3302_7")));
                    params.put(C3301_C3314.C3303, c7.getString(c7.getColumnIndex("C3303")));
                    params.put(C3301_C3314.C3304, c7.getString(c7.getColumnIndex("C3304")));
                    params.put(C3301_C3314.C3305, c7.getString(c7.getColumnIndex("C3305")));
                    params.put(C3301_C3314.C3306_1check, c7.getString(c7.getColumnIndex("C3306_1check")));
                    params.put(C3301_C3314.C3306_1, c7.getString(c7.getColumnIndex("C3306_1")));
                    params.put(C3301_C3314.C3306_2check, c7.getString(c7.getColumnIndex("C3306_2check")));
                    params.put(C3301_C3314.C3306_2, c7.getString(c7.getColumnIndex("C3306_2")));
                    params.put(C3301_C3314.C3307, c7.getString(c7.getColumnIndex("C3307")));
                    params.put(C3301_C3314.C3308, c7.getString(c7.getColumnIndex("C3308")));
                    params.put(C3301_C3314.C3309, c7.getString(c7.getColumnIndex("C3309")));
                    params.put(C3301_C3314.C3310_1, c7.getString(c7.getColumnIndex("C3310_1")));
                    params.put(C3301_C3314.C3310_2, c7.getString(c7.getColumnIndex("C3310_2")));
                    params.put(C3301_C3314.C3310_3, c7.getString(c7.getColumnIndex("C3310_3")));
                    params.put(C3301_C3314.C3310_4, c7.getString(c7.getColumnIndex("C3310_4")));
                    params.put(C3301_C3314.C3310_5, c7.getString(c7.getColumnIndex("C3310_5")));
                    params.put(C3301_C3314.C3310_6, c7.getString(c7.getColumnIndex("C3310_6")));
                    params.put(C3301_C3314.C3310_7, c7.getString(c7.getColumnIndex("C3310_7")));
                    params.put(C3301_C3314.C3310_8, c7.getString(c7.getColumnIndex("C3310_8")));
                    params.put(C3301_C3314.C3310_9, c7.getString(c7.getColumnIndex("C3310_9")));
                    params.put(C3301_C3314.C3310_10, c7.getString(c7.getColumnIndex("C3310_10")));
                    params.put(C3301_C3314.C3310_11, c7.getString(c7.getColumnIndex("C3310_11")));
                    params.put(C3301_C3314.C3311, c7.getString(c7.getColumnIndex("C3311")));
                    params.put(C3301_C3314.C3312, c7.getString(c7.getColumnIndex("C3312")));
                    params.put(C3301_C3314.C3313, c7.getString(c7.getColumnIndex("C3313")));
                    params.put(C3301_C3314.C3314, c7.getString(c7.getColumnIndex("C3314")));
                }

                if (c8.getCount() > 0) {

                    c8.moveToFirst();

                    params.put(C3351_C3364.C3351, c8.getString(c8.getColumnIndex("C3351")));
                    params.put(C3351_C3364.C3352, c8.getString(c8.getColumnIndex("C3352")));
                    params.put(C3351_C3364.C3353, c8.getString(c8.getColumnIndex("C3353")));
                    params.put(C3351_C3364.C3354, c8.getString(c8.getColumnIndex("C3354")));
                    params.put(C3351_C3364.C3355, c8.getString(c8.getColumnIndex("C3355")));
                    params.put(C3351_C3364.C3356, c8.getString(c8.getColumnIndex("C3356")));
                    params.put(C3351_C3364.C3357, c8.getString(c8.getColumnIndex("C3357")));
                    params.put(C3351_C3364.C3358, c8.getString(c8.getColumnIndex("C3358")));
                    params.put(C3351_C3364.C3363, c8.getString(c8.getColumnIndex("C3363")));
                    params.put(C3351_C3364.C3364, c8.getString(c8.getColumnIndex("C3364")));
                }

                if (c9.getCount() > 0) {

                    c9.moveToFirst();

                    params.put(C3401_C3457.C3401, c9.getString(c9.getColumnIndex("C3401")));
                    params.put(C3401_C3457.C3402, c9.getString(c9.getColumnIndex("C3402")));
                    params.put(C3401_C3457.C3403, c9.getString(c9.getColumnIndex("C3403")));
                    params.put(C3401_C3457.C3404, c9.getString(c9.getColumnIndex("C3404")));
                    params.put(C3401_C3457.C3405, c9.getString(c9.getColumnIndex("C3405")));
                    params.put(C3401_C3457.C3406, c9.getString(c9.getColumnIndex("C3406")));
                    params.put(C3401_C3457.C3407, c9.getString(c9.getColumnIndex("C3407")));
                    params.put(C3401_C3457.C3408, c9.getString(c9.getColumnIndex("C3408")));
                    params.put(C3401_C3457.C3409, c9.getString(c9.getColumnIndex("C3409")));
                    params.put(C3401_C3457.C3410, c9.getString(c9.getColumnIndex("C3410")));
                    params.put(C3401_C3457.C3411, c9.getString(c9.getColumnIndex("C3411")));
                    params.put(C3401_C3457.C3412_L1, c9.getString(c9.getColumnIndex("C3412_L1")));
                    params.put(C3401_C3457.C3412_L2, c9.getString(c9.getColumnIndex("C3412_L2")));
                    params.put(C3401_C3457.C3413, c9.getString(c9.getColumnIndex("C3413")));
                    params.put(C3401_C3457.C3414_1, c9.getString(c9.getColumnIndex("C3414_1")));
                    params.put(C3401_C3457.C3414_2, c9.getString(c9.getColumnIndex("C3414_2")));
                    params.put(C3401_C3457.C3451_1, c9.getString(c9.getColumnIndex("C3451_1")));
                    params.put(C3401_C3457.C3451_2, c9.getString(c9.getColumnIndex("C3451_2")));
                    params.put(C3401_C3457.C3451_3, c9.getString(c9.getColumnIndex("C3451_3")));
                    params.put(C3401_C3457.C3451_4, c9.getString(c9.getColumnIndex("C3451_4")));
                    params.put(C3401_C3457.C3451_5, c9.getString(c9.getColumnIndex("C3451_5")));
                    params.put(C3401_C3457.C3451_6, c9.getString(c9.getColumnIndex("C3451_6")));
                    params.put(C3401_C3457.C3451_7, c9.getString(c9.getColumnIndex("C3451_7")));
                    params.put(C3401_C3457.C3451_8, c9.getString(c9.getColumnIndex("C3451_8")));
                    params.put(C3401_C3457.C3451_9, c9.getString(c9.getColumnIndex("C3451_9")));
                    params.put(C3401_C3457.C3451_10, c9.getString(c9.getColumnIndex("C3451_10")));
                    params.put(C3401_C3457.C3451_11, c9.getString(c9.getColumnIndex("C3451_11")));
                    params.put(C3401_C3457.C3451_12, c9.getString(c9.getColumnIndex("C3451_12")));
                    params.put(C3401_C3457.C3451_13, c9.getString(c9.getColumnIndex("C3451_13")));
                    params.put(C3401_C3457.C3451_13_OT, c9.getString(c9.getColumnIndex("C3451_13_OT")));
                    params.put(C3401_C3457.C3452_1, c9.getString(c9.getColumnIndex("C3452_1")));
                    params.put(C3401_C3457.C3452_2, c9.getString(c9.getColumnIndex("C3452_2")));
                    params.put(C3401_C3457.C3452_3, c9.getString(c9.getColumnIndex("C3452_3")));
                    params.put(C3401_C3457.C3452_4, c9.getString(c9.getColumnIndex("C3452_4")));
                    params.put(C3401_C3457.C3452_5, c9.getString(c9.getColumnIndex("C3452_5")));
                    params.put(C3401_C3457.C3452_6, c9.getString(c9.getColumnIndex("C3452_6")));
                    params.put(C3401_C3457.C3452_7, c9.getString(c9.getColumnIndex("C3452_7")));
                    params.put(C3401_C3457.C3452_8, c9.getString(c9.getColumnIndex("C3452_8")));
                    params.put(C3401_C3457.C3452_9, c9.getString(c9.getColumnIndex("C3452_9")));
                    params.put(C3401_C3457.C3452_9_OT, c9.getString(c9.getColumnIndex("C3452_9_OT")));
                    params.put(C3401_C3457.C3453_1, c9.getString(c9.getColumnIndex("C3453_1")));
                    params.put(C3401_C3457.C3453_2, c9.getString(c9.getColumnIndex("C3453_2")));
                    params.put(C3401_C3457.C3453_3, c9.getString(c9.getColumnIndex("C3453_3")));
                    params.put(C3401_C3457.C3453_4, c9.getString(c9.getColumnIndex("C3453_4")));
                    params.put(C3401_C3457.C3453_5, c9.getString(c9.getColumnIndex("C3453_5")));
                    params.put(C3401_C3457.C3453_6, c9.getString(c9.getColumnIndex("C3453_6")));
                    params.put(C3401_C3457.C3453_7, c9.getString(c9.getColumnIndex("C3453_7")));
                    params.put(C3401_C3457.C3453_8, c9.getString(c9.getColumnIndex("C3453_8")));
                    params.put(C3401_C3457.C3453_9, c9.getString(c9.getColumnIndex("C3453_9")));
                    params.put(C3401_C3457.C3453_10, c9.getString(c9.getColumnIndex("C3453_10")));
                    params.put(C3401_C3457.C3453_11, c9.getString(c9.getColumnIndex("C3453_11")));
                    params.put(C3401_C3457.C3453_12, c9.getString(c9.getColumnIndex("C3453_12")));
                    params.put(C3401_C3457.C3453_12_OT, c9.getString(c9.getColumnIndex("C3453_12_OT")));
                    params.put(C3401_C3457.C3454, c9.getString(c9.getColumnIndex("C3454")));
                    params.put(C3401_C3457.C3455, c9.getString(c9.getColumnIndex("C3455")));
                    params.put(C3401_C3457.C3456, c9.getString(c9.getColumnIndex("C3456")));
                    params.put(C3401_C3457.C3457, c9.getString(c9.getColumnIndex("C3457")));
                }

                if (c10.getCount() > 0) {

                    c10.moveToFirst();

                    params.put(C3471_C3472.C3471, c10.getString(c10.getColumnIndex("C3471")));
                    params.put(C3471_C3472.C3472_1, c10.getString(c10.getColumnIndex("C3472_1")));
                    params.put(C3471_C3472.C3472_2, c10.getString(c10.getColumnIndex("C3472_2")));
                    params.put(C3471_C3472.C3472_3, c10.getString(c10.getColumnIndex("C3472_3")));
                    params.put(C3471_C3472.C3472_4, c10.getString(c10.getColumnIndex("C3472_4")));
                    params.put(C3471_C3472.C3472_5, c10.getString(c10.getColumnIndex("C3472_5")));
                    params.put(C3471_C3472.C3472_6, c10.getString(c10.getColumnIndex("C3472_6")));
                    params.put(C3471_C3472.C3472_7, c10.getString(c10.getColumnIndex("C3472_7")));
                    params.put(C3471_C3472.C3472_8, c10.getString(c10.getColumnIndex("C3472_8")));
                    params.put(C3471_C3472.C3472_9, c10.getString(c10.getColumnIndex("C3472_9")));
                    params.put(C3471_C3472.C3472_10, c10.getString(c10.getColumnIndex("C3472_10")));
                    params.put(C3471_C3472.C3472_11, c10.getString(c10.getColumnIndex("C3472_11")));
                    params.put(C3471_C3472.C3472_DK, c10.getString(c10.getColumnIndex("C3472_DK")));
                }

                if (c11.getCount() > 0) {

                    c11.moveToFirst();

                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3251_1, c11.getString(c11.getColumnIndex("C3251_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3251_2, c11.getString(c11.getColumnIndex("C3251_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3252, c11.getString(c11.getColumnIndex("C3252")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3254, c11.getString(c11.getColumnIndex("C3254")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3254x, c11.getString(c11.getColumnIndex("C3254x")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3255, c11.getString(c11.getColumnIndex("C3255")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_1, c11.getString(c11.getColumnIndex("C3256_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_2, c11.getString(c11.getColumnIndex("C3256_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_3, c11.getString(c11.getColumnIndex("C3256_3")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_4, c11.getString(c11.getColumnIndex("C3256_4")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_4x, c11.getString(c11.getColumnIndex("C3256_4x")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_5, c11.getString(c11.getColumnIndex("C3256_5")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_6, c11.getString(c11.getColumnIndex("C3256_6")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_7, c11.getString(c11.getColumnIndex("C3256_7")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_8, c11.getString(c11.getColumnIndex("C3256_8")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_9, c11.getString(c11.getColumnIndex("C3256_9")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_10, c11.getString(c11.getColumnIndex("C3256_10")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_11, c11.getString(c11.getColumnIndex("C3256_11")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_12, c11.getString(c11.getColumnIndex("C3256_12")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_OT, c11.getString(c11.getColumnIndex("C3256_OT")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_OTx, c11.getString(c11.getColumnIndex("C3256_OTx")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3256_DK, c11.getString(c11.getColumnIndex("C3256_DK")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3257_1, c11.getString(c11.getColumnIndex("C3257_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3257_2, c11.getString(c11.getColumnIndex("C3257_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3257_3, c11.getString(c11.getColumnIndex("C3257_3")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3258_1, c11.getString(c11.getColumnIndex("C3258_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3258_2, c11.getString(c11.getColumnIndex("C3258_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3259, c11.getString(c11.getColumnIndex("C3259")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3259_2, c11.getString(c11.getColumnIndex("C3259_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3260, c11.getString(c11.getColumnIndex("C3260")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3261_1, c11.getString(c11.getColumnIndex("C3261_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3261_2, c11.getString(c11.getColumnIndex("C3261_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3262, c11.getString(c11.getColumnIndex("C3262")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3263, c11.getString(c11.getColumnIndex("C3263")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3264, c11.getString(c11.getColumnIndex("C3264")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3264_2, c11.getString(c11.getColumnIndex("C3264_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3265_1, c11.getString(c11.getColumnIndex("C3265_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3265_2, c11.getString(c11.getColumnIndex("C3265_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3266, c11.getString(c11.getColumnIndex("C3266")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3267_1, c11.getString(c11.getColumnIndex("C3267_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3267_2, c11.getString(c11.getColumnIndex("C3267_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3268_1, c11.getString(c11.getColumnIndex("C3268_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3268_2, c11.getString(c11.getColumnIndex("C3268_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3269, c11.getString(c11.getColumnIndex("C3269")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3269_2, c11.getString(c11.getColumnIndex("C3269_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3270, c11.getString(c11.getColumnIndex("C3270")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3271_1, c11.getString(c11.getColumnIndex("C3271_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3271_2, c11.getString(c11.getColumnIndex("C3271_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3272, c11.getString(c11.getColumnIndex("C3272")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3273, c11.getString(c11.getColumnIndex("C3273")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3274, c11.getString(c11.getColumnIndex("C3274")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3274_2, c11.getString(c11.getColumnIndex("C3274_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3275_1, c11.getString(c11.getColumnIndex("C3275_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3275_2, c11.getString(c11.getColumnIndex("C3275_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3276, c11.getString(c11.getColumnIndex("C3276")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3277_1, c11.getString(c11.getColumnIndex("C3277_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3277_2, c11.getString(c11.getColumnIndex("C3277_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3278, c11.getString(c11.getColumnIndex("C3278")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3279, c11.getString(c11.getColumnIndex("C3279")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_1, c11.getString(c11.getColumnIndex("C3280_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_2, c11.getString(c11.getColumnIndex("C3280_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_3, c11.getString(c11.getColumnIndex("C3280_3")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_4, c11.getString(c11.getColumnIndex("C3280_4")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_5x, c11.getString(c11.getColumnIndex("C3280_5x")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_5, c11.getString(c11.getColumnIndex("C3280_5")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_6, c11.getString(c11.getColumnIndex("C3280_6")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_7, c11.getString(c11.getColumnIndex("C3280_7")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_8, c11.getString(c11.getColumnIndex("C3280_8")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_9, c11.getString(c11.getColumnIndex("C3280_9")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_10, c11.getString(c11.getColumnIndex("C3280_10")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_11, c11.getString(c11.getColumnIndex("C3280_11")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_12, c11.getString(c11.getColumnIndex("C3280_12")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_13, c11.getString(c11.getColumnIndex("C3280_13")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_14, c11.getString(c11.getColumnIndex("C3280_14")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_15, c11.getString(c11.getColumnIndex("C3280_15")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_OT, c11.getString(c11.getColumnIndex("C3280_OT")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_OTx, c11.getString(c11.getColumnIndex("C3280_OTx")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3280_DK, c11.getString(c11.getColumnIndex("C3280_DK")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3281, c11.getString(c11.getColumnIndex("C3281")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_1, c11.getString(c11.getColumnIndex("C3282_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_2, c11.getString(c11.getColumnIndex("C3282_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_3, c11.getString(c11.getColumnIndex("C3282_3")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_4, c11.getString(c11.getColumnIndex("C3282_4")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_5, c11.getString(c11.getColumnIndex("C3282_5")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_6, c11.getString(c11.getColumnIndex("C3282_6")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_7, c11.getString(c11.getColumnIndex("C3282_7")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3282_DK, c11.getString(c11.getColumnIndex("C3282_DK")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_1, c11.getString(c11.getColumnIndex("C3283_1")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_2, c11.getString(c11.getColumnIndex("C3283_2")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_3, c11.getString(c11.getColumnIndex("C3283_3")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_4, c11.getString(c11.getColumnIndex("C3283_4")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_5, c11.getString(c11.getColumnIndex("C3283_5")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_6, c11.getString(c11.getColumnIndex("C3283_6")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_7, c11.getString(c11.getColumnIndex("C3283_7")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3283_DK, c11.getString(c11.getColumnIndex("C3283_DK")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3284, c11.getString(c11.getColumnIndex("C3284")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3285, c11.getString(c11.getColumnIndex("C3285")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3286, c11.getString(c11.getColumnIndex("C3286")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3287, c11.getString(c11.getColumnIndex("C3287")));
                    params.put(C3251_C3288_A_C.sub_C3251_C3288_A_C.C3288, c11.getString(c11.getColumnIndex("C3288")));
                }

                if (c12.getCount() > 0) {

                    //ArrayList loopResponse = new ArrayList();

                    c12.moveToFirst();

                    for (int i = 0; i < c12.getCount(); i++) {

                        if (i == 0) {
                            try {

                                JSONObject round_one = new JSONObject();
                                String C3253_a, C3253_1_a, C3253_2A_a, C3253_4_a;

                                C3253_a = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_a = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_a = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_a = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_one.put("C3253_a", C3253_a);
                                round_one.put("C3253_1_a", C3253_1_a);
                                round_one.put("C3253_2A_a", C3253_2A_a);
                                round_one.put("C3253_4_a", C3253_4_a);

                                params.put("round_one", String.valueOf(round_one));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 1) {
                            try {

                                JSONObject round_two = new JSONObject();
                                String C3253_b, C3253_1_b, C3253_2A_b, C3253_4_b;

                                C3253_b = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_b = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_b = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_b = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_two.put("C3253_b", C3253_b);
                                round_two.put("C3253_1_b", C3253_1_b);
                                round_two.put("C3253_2A_b", C3253_2A_b);
                                round_two.put("C3253_4_b", C3253_4_b);

                                params.put("round_two", String.valueOf(round_two));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 2) {
                            try {

                                JSONObject round_three = new JSONObject();
                                String C3253_c, C3253_1_c, C3253_2A_c, C3253_4_c;

                                C3253_c = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_c = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_c = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_c = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_three.put("C3253_c", C3253_c);
                                round_three.put("C3253_1_c", C3253_1_c);
                                round_three.put("C3253_2A_c", C3253_2A_c);
                                round_three.put("C3253_4_c", C3253_4_c);

                                params.put("round_three", String.valueOf(round_three));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 3) {
                            try {

                                JSONObject round_four = new JSONObject();
                                String C3253_d, C3253_1_d, C3253_2A_d, C3253_4_d;

                                C3253_d = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_d = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_d = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_d = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_four.put("C3253_d", C3253_d);
                                round_four.put("C3253_1_d", C3253_1_d);
                                round_four.put("C3253_2A_d", C3253_2A_d);
                                round_four.put("C3253_4_d", C3253_4_d);

                                params.put("round_four", String.valueOf(round_four));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 4) {
                            try {

                                JSONObject round_five = new JSONObject();
                                String C3253_e, C3253_1_e, C3253_2A_e, C3253_4_e;

                                C3253_e = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_e = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_e = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_e = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_five.put("C3253_e", C3253_e);
                                round_five.put("C3253_1_e", C3253_1_e);
                                round_five.put("C3253_2A_e", C3253_2A_e);
                                round_five.put("C3253_4_e", C3253_4_e);

                                params.put("round_five", String.valueOf(round_five));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();
                            }
                        }

                        if (i == 5) {
                            try {

                                JSONObject round_six = new JSONObject();
                                String C3253_f, C3253_1_f, C3253_2A_f, C3253_4_f;

                                C3253_f = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_f = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_f = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_f = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_six.put("C3253_f", C3253_f);
                                round_six.put("C3253_1_f", C3253_1_f);
                                round_six.put("C3253_2A_f", C3253_2A_f);
                                round_six.put("C3253_4_f", C3253_4_f);

                                params.put("round_six", String.valueOf(round_six));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();
                            }
                        }

                        if (i == 6) {
                            try {

                                JSONObject round_seven = new JSONObject();
                                String C3253_g, C3253_1_g, C3253_2A_g, C3253_4_g;

                                C3253_g = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_g = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_g = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_g = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_seven.put("C3253_g", C3253_g);
                                round_seven.put("C3253_1_g", C3253_1_g);
                                round_seven.put("C3253_2A_g", C3253_2A_g);
                                round_seven.put("C3253_4_g", C3253_4_g);

                                params.put("round_seven", String.valueOf(round_seven));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();
                            }
                        }

                        if (i == 7) {
                            try {

                                JSONObject round_eight = new JSONObject();
                                String C3253_h, C3253_1_h, C3253_2A_h, C3253_4_h;

                                C3253_h = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_h = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_h = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_h = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_eight.put("C3253_h", C3253_h);
                                round_eight.put("C3253_1_h", C3253_1_h);
                                round_eight.put("C3253_2A_h", C3253_2A_h);
                                round_eight.put("C3253_4_h", C3253_4_h);

                                params.put("round_eight", String.valueOf(round_eight));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();
                            }
                        }

                        if (i == 8) {
                            try {

                                JSONObject round_nine = new JSONObject();
                                String C3253_i, C3253_1_i, C3253_2A_i, C3253_4_i;

                                C3253_i = c12.getString(c12.getColumnIndex("C3253"));
                                C3253_1_i = c12.getString(c12.getColumnIndex("C3253_1"));
                                C3253_2A_i = c12.getString(c12.getColumnIndex("C3253_2A"));
                                C3253_4_i = c12.getString(c12.getColumnIndex("C3253_4"));

                                round_nine.put("C3253_i", C3253_i);
                                round_nine.put("C3253_1_i", C3253_1_i);
                                round_nine.put("C3253_2A_i", C3253_2A_i);
                                round_nine.put("C3253_4_i", C3253_4_i);

                                params.put("round_nine", String.valueOf(round_nine));
                                c12.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();
                            }
                        }
                    }
                }

                return params;
            }
        };

        myRequestQueue.add(sendMyRequest);
    }

    public void upload_A(final String study_id) {

        final String ROOT_URL = "http://10.199.28.86/sm/Welcome/collect_A";

        final RequestQueue myRequestQueue = Volley.newRequestQueue(mContext);

        StringRequest sendMyRequest = new StringRequest(Request.Method.POST, ROOT_URL,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(mContext, response, Toast.LENGTH_LONG).show();
                        myRequestQueue.getCache().clear();
                        //upload2(study_id);

                        try {

                            JSONObject JSONObject = new JSONObject(response);

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(mContext, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {

            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<>();

                //ArrayList<String> loopResponse = new ArrayList();

                DBHelper db = new DBHelper(mContext);

                Cursor c = db.getData("Q1101_Q1610", study_id);
                Cursor c2 = db.getData("A4001_A4014", study_id);
                Cursor c3 = db.getData("A4051_A4066", study_id);
                Cursor c4 = db.getData("A4067_A4080", study_id);
                Cursor c5 = db.getData("A4081_A4094", study_id);
                Cursor c6 = db.getData("A4095_A4108", study_id);
                Cursor c7 = db.getData("A4109_A4125", study_id);
                Cursor c8 = db.getData("A4126_A4140", study_id);
                Cursor c9 = db.getData("A4144_A4156", study_id);
                Cursor c10 = db.getData("A4157_A4205", study_id);
                Cursor c11 = db.getData("A4206_A4207", study_id);
                Cursor c12 = db.getData("A4251_A4284", study_id);
                Cursor c13 = db.getData("A4301_A4315", study_id);
                Cursor c14 = db.getData("A4351_A4364", study_id);
                Cursor c15 = db.getData("A4401_A4473", study_id);
                Cursor c16 = db.getData("A4252_atributes", study_id);

                params.put("table1", "q1101_q1610");
                params.put("table2", "a4001_a4014");
                params.put("table3", "a4051_a4066");
                params.put("table4", "a4067_a4080");
                params.put("table5", "a4081_a4094");
                params.put("table6", "a4095_a4108");
                params.put("table7", "a4109_a4125");
                params.put("table8", "a4126_a4140");
                params.put("table9", "a4144_a4156");
                params.put("table10", "a4157_a4205");
                params.put("table11", "a4206_a4207");
                params.put("table12", "a4251_a4284");
                params.put("table13", "a4301_a4315");
                params.put("table14", "a4351_a4364");
                params.put("table15", "a4401_a4473");
                params.put("table16", "a4252_atributes");

                if (c.getCount() > 0) {

                    c.moveToFirst();

                    params.put(Q1101_Q1610.study_id, c.getString(c.getColumnIndex("study_id")));
                    params.put(Q1101_Q1610.Q1201_1, c.getString(c.getColumnIndex("Q1201_1")));
                    params.put(Q1101_Q1610.Q1201_2, c.getString(c.getColumnIndex("Q1201_2")));
                    params.put(Q1101_Q1610.Q1201_3, c.getString(c.getColumnIndex("Q1201_3")));
                    params.put(Q1101_Q1610.Q1201_4, c.getString(c.getColumnIndex("Q1201_4")));
                    params.put(Q1101_Q1610.Q1201_5, c.getString(c.getColumnIndex("Q1201_5")));
                    params.put(Q1101_Q1610.Q1201_6, c.getString(c.getColumnIndex("Q1201_6")));
                    params.put(Q1101_Q1610.Q1202, c.getString(c.getColumnIndex("Q1202")));
                    params.put(Q1101_Q1610.Q1203, c.getString(c.getColumnIndex("Q1203")));
                    params.put(Q1101_Q1610.Q1204, c.getString(c.getColumnIndex("Q1204")));
                    params.put(Q1101_Q1610.Q1205, c.getString(c.getColumnIndex("Q1205")));
                    params.put(Q1101_Q1610.Q1206_d, c.getString(c.getColumnIndex("Q1206_d")));
                    params.put(Q1101_Q1610.Q1206_m, c.getString(c.getColumnIndex("Q1206_m")));
                    params.put(Q1101_Q1610.Q1206_y, c.getString(c.getColumnIndex("Q1206_y")));
                    params.put(Q1101_Q1610.Q1207, c.getString(c.getColumnIndex("Q1207")));
                    params.put(Q1101_Q1610.Q1208, c.getString(c.getColumnIndex("Q1208")));
                    params.put(Q1101_Q1610.Q1209, c.getString(c.getColumnIndex("Q1209")));
                    params.put(Q1101_Q1610.Q1301, c.getString(c.getColumnIndex("Q1301")));
                    params.put(Q1101_Q1610.Q1302, c.getString(c.getColumnIndex("Q1302")));
                    params.put(Q1101_Q1610.Q1307, c.getString(c.getColumnIndex("Q1307")));
                    params.put(Q1101_Q1610.Q1308, c.getString(c.getColumnIndex("Q1308")));
                    params.put(Q1101_Q1610.Q1309, c.getString(c.getColumnIndex("Q1309")));
                    params.put(Q1101_Q1610.Q1310, c.getString(c.getColumnIndex("Q1310")));
                    params.put(Q1101_Q1610.Q1311, c.getString(c.getColumnIndex("Q1311")));
                    params.put(Q1101_Q1610.Q1312, c.getString(c.getColumnIndex("Q1312")));
                    params.put(Q1101_Q1610.Q1313, c.getString(c.getColumnIndex("Q1313")));
                    params.put(Q1101_Q1610.Q1401, c.getString(c.getColumnIndex("Q1401")));
                    params.put(Q1101_Q1610.Q1402, c.getString(c.getColumnIndex("Q1402")));
                    params.put(Q1101_Q1610.Q1403, c.getString(c.getColumnIndex("Q1403")));
                    params.put(Q1101_Q1610.Q1403_OT, c.getString(c.getColumnIndex("Q1403_OT")));
                    params.put(Q1101_Q1610.Q1404, c.getString(c.getColumnIndex("Q1404")));
                    params.put(Q1101_Q1610.Q1405, c.getString(c.getColumnIndex("Q1405")));
                    params.put(Q1101_Q1610.Q1406, c.getString(c.getColumnIndex("Q1406")));
                    params.put(Q1101_Q1610.Q1407, c.getString(c.getColumnIndex("Q1407")));
                    params.put(Q1101_Q1610.Q1408, c.getString(c.getColumnIndex("Q1408")));
                    params.put(Q1101_Q1610.Q1409, c.getString(c.getColumnIndex("Q1409")));
                    params.put(Q1101_Q1610.Q1410, c.getString(c.getColumnIndex("Q1410")));
                    params.put(Q1101_Q1610.Q1411, c.getString(c.getColumnIndex("Q1411")));
                    params.put(Q1101_Q1610.Q1412, c.getString(c.getColumnIndex("Q1412")));
                    params.put(Q1101_Q1610.Q1413, c.getString(c.getColumnIndex("Q1413")));
                    params.put(Q1101_Q1610.Q1414_1, c.getString(c.getColumnIndex("Q1414_1")));
                    params.put(Q1101_Q1610.Q1414_2, c.getString(c.getColumnIndex("Q1414_2")));
                    params.put(Q1101_Q1610.Q1414_3, c.getString(c.getColumnIndex("Q1414_3")));
                    params.put(Q1101_Q1610.Q1414_4, c.getString(c.getColumnIndex("Q1414_4")));
                    params.put(Q1101_Q1610.Q1414_5, c.getString(c.getColumnIndex("Q1414_5")));
                    params.put(Q1101_Q1610.Q1414_6, c.getString(c.getColumnIndex("Q1414_6")));
                    params.put(Q1101_Q1610.Q1414_7, c.getString(c.getColumnIndex("Q1414_7")));
                    params.put(Q1101_Q1610.Q1414_8, c.getString(c.getColumnIndex("Q1414_8")));
                    params.put(Q1101_Q1610.Q1414_9, c.getString(c.getColumnIndex("Q1414_9")));
                    params.put(Q1101_Q1610.Q1414_10, c.getString(c.getColumnIndex("Q1414_10")));
                    params.put(Q1101_Q1610.Q1415, c.getString(c.getColumnIndex("Q1415")));
                    params.put(Q1101_Q1610.Q1416, c.getString(c.getColumnIndex("Q1416")));
                    params.put(Q1101_Q1610.Q1416_OT, c.getString(c.getColumnIndex("Q1416_OT")));
                    params.put(Q1101_Q1610.Q1417, c.getString(c.getColumnIndex("Q1417")));
                    params.put(Q1101_Q1610.Q1417_OT, c.getString(c.getColumnIndex("Q1417_OT")));
                    params.put(Q1101_Q1610.Q1418, c.getString(c.getColumnIndex("Q1418")));
                    params.put(Q1101_Q1610.Q1418_OT, c.getString(c.getColumnIndex("Q1418_OT")));
                    params.put(Q1101_Q1610.Q1419, c.getString(c.getColumnIndex("Q1419")));
                    params.put(Q1101_Q1610.Q1419_OT, c.getString(c.getColumnIndex("Q1419_OT")));
                    params.put(Q1101_Q1610.Q1420, c.getString(c.getColumnIndex("Q1420")));
                    params.put(Q1101_Q1610.Q1420_OT, c.getString(c.getColumnIndex("Q1420_OT")));
                    params.put(Q1101_Q1610.Q1421, c.getString(c.getColumnIndex("Q1421")));
                    params.put(Q1101_Q1610.Q1421_OT, c.getString(c.getColumnIndex("Q1421_OT")));
                    params.put(Q1101_Q1610.Q1501, c.getString(c.getColumnIndex("Q1501")));
                    params.put(Q1101_Q1610.Q1502, c.getString(c.getColumnIndex("Q1502")));
                    params.put(Q1101_Q1610.Q1503, c.getString(c.getColumnIndex("Q1503")));
                    params.put(Q1101_Q1610.Q1503_OT, c.getString(c.getColumnIndex("Q1503_OT")));
                    params.put(Q1101_Q1610.Q1601, c.getString(c.getColumnIndex("Q1601")));
                    params.put(Q1101_Q1610.Q1602, c.getString(c.getColumnIndex("Q1602")));
                    params.put(Q1101_Q1610.Q1603, c.getString(c.getColumnIndex("Q1603")));
                    params.put(Q1101_Q1610.Q1604, c.getString(c.getColumnIndex("Q1604")));
                    params.put(Q1101_Q1610.Q1604_OT, c.getString(c.getColumnIndex("Q1604_OT")));
                    params.put(Q1101_Q1610.Q1605, c.getString(c.getColumnIndex("Q1605")));
                    params.put(Q1101_Q1610.Q1606, c.getString(c.getColumnIndex("Q1606")));
                    params.put(Q1101_Q1610.Q1607_1, c.getString(c.getColumnIndex("Q1607_1")));
                    params.put(Q1101_Q1610.Q1607_2, c.getString(c.getColumnIndex("Q1607_2")));
                    params.put(Q1101_Q1610.Q1607_3, c.getString(c.getColumnIndex("Q1607_3")));
                    params.put(Q1101_Q1610.Q1608_1, c.getString(c.getColumnIndex("Q1608_1")));
                    params.put(Q1101_Q1610.Q1608_2, c.getString(c.getColumnIndex("Q1608_2")));
                    params.put(Q1101_Q1610.Q1608_3, c.getString(c.getColumnIndex("Q1608_3")));
                    params.put(Q1101_Q1610.Q1609, c.getString(c.getColumnIndex("Q1609")));
                    params.put(Q1101_Q1610.Q1610_1, c.getString(c.getColumnIndex("Q1610_1")));
                    params.put(Q1101_Q1610.Q1610_2, c.getString(c.getColumnIndex("Q1610_2")));
                    params.put(Q1101_Q1610.Q1610_3, c.getString(c.getColumnIndex("Q1610_3")));
                    params.put(Q1101_Q1610.interviewType, c.getString(c.getColumnIndex("interviewType")));
                    params.put(Q1101_Q1610.currentSection, c.getString(c.getColumnIndex("currentSection")));
                }

                if (c2.getCount() > 0) {

                    c2.moveToFirst();

                    params.put(A4001_A4014.A4001, c2.getString(c2.getColumnIndex("A4001")));
                    params.put(A4001_A4014.A4002, c2.getString(c2.getColumnIndex("A4002")));
                    params.put(A4001_A4014.A4003, c2.getString(c2.getColumnIndex("A4003")));
                    params.put(A4001_A4014.A4004, c2.getString(c2.getColumnIndex("A4004")));
                    params.put(A4001_A4014.A4005, c2.getString(c2.getColumnIndex("A4005")));
                    params.put(A4001_A4014.A4006, c2.getString(c2.getColumnIndex("A4006")));
                    params.put(A4001_A4014.A4007, c2.getString(c2.getColumnIndex("A4007")));
                    params.put(A4001_A4014.A4007_1, c2.getString(c2.getColumnIndex("A4007_1")));
                    params.put(A4001_A4014.A4008, c2.getString(c2.getColumnIndex("A4008")));
                    params.put(A4001_A4014.A4009a, c2.getString(c2.getColumnIndex("A4009a")));
                    params.put(A4001_A4014.A4010, c2.getString(c2.getColumnIndex("A4010")));
                    params.put(A4001_A4014.A4011, c2.getString(c2.getColumnIndex("A4011")));
                    params.put(A4001_A4014.A4012, c2.getString(c2.getColumnIndex("A4012")));
                    params.put(A4001_A4014.A4013u, c2.getString(c2.getColumnIndex("A4013u")));
                    params.put(A4001_A4014.A4013d, c2.getString(c2.getColumnIndex("A4013d")));
                    params.put(A4001_A4014.A4013m, c2.getString(c2.getColumnIndex("A4013m")));
                    params.put(A4001_A4014.A4013y, c2.getString(c2.getColumnIndex("A4013y")));
                    params.put(A4001_A4014.A4014, c2.getString(c2.getColumnIndex("A4014")));

                } else {

                    params.put(A4001_A4014.A4001, "-2");
                    params.put(A4001_A4014.A4002, "-2");
                    params.put(A4001_A4014.A4003, "-2");
                    params.put(A4001_A4014.A4004, "-2");
                    params.put(A4001_A4014.A4005, "-2");
                    params.put(A4001_A4014.A4006, "-2");
                    params.put(A4001_A4014.A4007, "-2");
                    params.put(A4001_A4014.A4007_1, "-2");
                    params.put(A4001_A4014.A4008, "-2");
                    params.put(A4001_A4014.A4009a, "-2");
                    params.put(A4001_A4014.A4010, "-2");
                    params.put(A4001_A4014.A4011, "-2");
                    params.put(A4001_A4014.A4012, "-2");
                    params.put(A4001_A4014.A4013u, "-2");
                    params.put(A4001_A4014.A4013d, "-2");
                    params.put(A4001_A4014.A4013m, "-2");
                    params.put(A4001_A4014.A4013y, "-2");
                }

                if (c3.getCount() > 0) {

                    c3.moveToFirst();

                    params.put(A4051_A4066.A4051, c3.getString(c3.getColumnIndex("A4051")));
                    params.put(A4051_A4066.A4052_u, c3.getString(c3.getColumnIndex("A4052_u")));
                    params.put(A4051_A4066.A4052_b, c3.getString(c3.getColumnIndex("A4052_b")));
                    params.put(A4051_A4066.A4052_c, c3.getString(c3.getColumnIndex("A4052_c")));
                    params.put(A4051_A4066.A4053, c3.getString(c3.getColumnIndex("A4053")));
                    params.put(A4051_A4066.A4054, c3.getString(c3.getColumnIndex("A4054")));
                    params.put(A4051_A4066.A4055, c3.getString(c3.getColumnIndex("A4055")));
                    params.put(A4051_A4066.A4056, c3.getString(c3.getColumnIndex("A4056")));
                    params.put(A4051_A4066.A4057, c3.getString(c3.getColumnIndex("A4057")));
                    params.put(A4051_A4066.A4058, c3.getString(c3.getColumnIndex("A4058")));
                    params.put(A4051_A4066.A4059_u, c3.getString(c3.getColumnIndex("A4059_u")));
                    params.put(A4051_A4066.A4059_a, c3.getString(c3.getColumnIndex("A4059_a")));
                    params.put(A4051_A4066.A4059_b, c3.getString(c3.getColumnIndex("A4059_b")));
                    params.put(A4051_A4066.A4060, c3.getString(c3.getColumnIndex("A4060")));
                    params.put(A4051_A4066.A4061, c3.getString(c3.getColumnIndex("A4061")));
                    params.put(A4051_A4066.A4062, c3.getString(c3.getColumnIndex("A4062")));
                    params.put(A4051_A4066.A4063, c3.getString(c3.getColumnIndex("A4063")));
                    params.put(A4051_A4066.A4064_u, c3.getString(c3.getColumnIndex("A4064_u")));
                    params.put(A4051_A4066.A4064_a, c3.getString(c3.getColumnIndex("A4064_a")));
                    params.put(A4051_A4066.A4064_b, c3.getString(c3.getColumnIndex("A4064_b")));
                    params.put(A4051_A4066.A4064_1, c3.getString(c3.getColumnIndex("A4064_1")));
                    params.put(A4051_A4066.A4065, c3.getString(c3.getColumnIndex("A4065")));
                    params.put(A4051_A4066.A4066, c3.getString(c3.getColumnIndex("A4066")));

                } else {

                    params.put(A4051_A4066.A4051, "-2");
                    params.put(A4051_A4066.A4052_u, "-2");
                    params.put(A4051_A4066.A4052_b, "-2");
                    params.put(A4051_A4066.A4052_c, "-2");
                    params.put(A4051_A4066.A4053, "-2");
                    params.put(A4051_A4066.A4054, "-2");
                    params.put(A4051_A4066.A4055, "-2");
                    params.put(A4051_A4066.A4056, "-2");
                    params.put(A4051_A4066.A4057, "-2");
                    params.put(A4051_A4066.A4058, "-2");
                    params.put(A4051_A4066.A4059_u, "-2");
                    params.put(A4051_A4066.A4059_a, "-2");
                    params.put(A4051_A4066.A4059_b, "-2");
                    params.put(A4051_A4066.A4060, "-2");
                    params.put(A4051_A4066.A4061, "-2");
                    params.put(A4051_A4066.A4062, "-2");
                    params.put(A4051_A4066.A4063, "-2");
                    params.put(A4051_A4066.A4064_u, "-2");
                    params.put(A4051_A4066.A4064_a, "-2");
                    params.put(A4051_A4066.A4064_b, "-2");
                    params.put(A4051_A4066.A4064_1, "-2");
                    params.put(A4051_A4066.A4065, "-2");
                    params.put(A4051_A4066.A4066, "-2");
                }

                if (c4.getCount() > 0) {

                    c4.moveToFirst();

                    params.put(A4067_A4080.A4067, c4.getString(c4.getColumnIndex("A4067")));
                    params.put(A4067_A4080.A4068, c4.getString(c4.getColumnIndex("A4068")));
                    params.put(A4067_A4080.A4069_u, c4.getString(c4.getColumnIndex("A4069_u")));
                    params.put(A4067_A4080.A4069_a, c4.getString(c4.getColumnIndex("A4069_a")));
                    params.put(A4067_A4080.A4069_b, c4.getString(c4.getColumnIndex("A4069_b")));
                    params.put(A4067_A4080.A4069_c, c4.getString(c4.getColumnIndex("A4069_c")));
                    params.put(A4067_A4080.A4070, c4.getString(c4.getColumnIndex("A4070")));
                    params.put(A4067_A4080.A4071, c4.getString(c4.getColumnIndex("A4071")));
                    params.put(A4067_A4080.A4072_u, c4.getString(c4.getColumnIndex("A4072_u")));
                    params.put(A4067_A4080.A4072_a, c4.getString(c4.getColumnIndex("A4072_a")));
                    params.put(A4067_A4080.A4072_b, c4.getString(c4.getColumnIndex("A4072_b")));
                    params.put(A4067_A4080.A4073, c4.getString(c4.getColumnIndex("A4073")));
                    params.put(A4067_A4080.A4074, c4.getString(c4.getColumnIndex("A4074")));
                    params.put(A4067_A4080.A4075_u, c4.getString(c4.getColumnIndex("A4075_u")));
                    params.put(A4067_A4080.A4075_a, c4.getString(c4.getColumnIndex("A4075_a")));
                    params.put(A4067_A4080.A4075_b, c4.getString(c4.getColumnIndex("A4075_b")));
                    params.put(A4067_A4080.A4076, c4.getString(c4.getColumnIndex("A4076")));
                    params.put(A4067_A4080.A4077_u, c4.getString(c4.getColumnIndex("A4077_u")));
                    params.put(A4067_A4080.A4077_a, c4.getString(c4.getColumnIndex("A4077_a")));
                    params.put(A4067_A4080.A4077_b, c4.getString(c4.getColumnIndex("A4077_b")));
                    params.put(A4067_A4080.A4078, c4.getString(c4.getColumnIndex("A4078")));
                    params.put(A4067_A4080.A4079, c4.getString(c4.getColumnIndex("A4079")));
                    params.put(A4067_A4080.A4080, c4.getString(c4.getColumnIndex("A4080")));

                } else {

                    params.put(A4067_A4080.A4067, "-2");
                    params.put(A4067_A4080.A4068, "-2");
                    params.put(A4067_A4080.A4069_u, "-2");
                    params.put(A4067_A4080.A4069_a, "-2");
                    params.put(A4067_A4080.A4069_b, "-2");
                    params.put(A4067_A4080.A4069_c, "-2");
                    params.put(A4067_A4080.A4070, "-2");
                    params.put(A4067_A4080.A4071, "-2");
                    params.put(A4067_A4080.A4072_u, "-2");
                    params.put(A4067_A4080.A4072_a, "-2");
                    params.put(A4067_A4080.A4072_b, "-2");
                    params.put(A4067_A4080.A4073, "-2");
                    params.put(A4067_A4080.A4074, "-2");
                    params.put(A4067_A4080.A4075_u, "-2");
                    params.put(A4067_A4080.A4075_a, "-2");
                    params.put(A4067_A4080.A4075_b, "-2");
                    params.put(A4067_A4080.A4076, "-2");
                    params.put(A4067_A4080.A4077_u, "-2");
                    params.put(A4067_A4080.A4077_a, "-2");
                    params.put(A4067_A4080.A4077_b, "-2");
                    params.put(A4067_A4080.A4078, "-2");
                    params.put(A4067_A4080.A4079, "-2");
                    params.put(A4067_A4080.A4080, "-2");
                }


                if (c5.getCount() > 0) {

                    c5.moveToFirst();

                    params.put(A4081_A4094.A4081, c5.getString(c5.getColumnIndex("A4081")));
                    params.put(A4081_A4094.A4082_u, c5.getString(c5.getColumnIndex("A4082_u")));
                    params.put(A4081_A4094.A4082_a, c5.getString(c5.getColumnIndex("A4082_a")));
                    params.put(A4081_A4094.A4082_b, c5.getString(c5.getColumnIndex("A4082_b")));
                    params.put(A4081_A4094.A4082_c, c5.getString(c5.getColumnIndex("A4082_c")));
                    params.put(A4081_A4094.A4083, c5.getString(c5.getColumnIndex("A4083")));
                    params.put(A4081_A4094.A4084, c5.getString(c5.getColumnIndex("A4084")));
                    params.put(A4081_A4094.A4085_u, c5.getString(c5.getColumnIndex("A4085_u")));
                    params.put(A4081_A4094.A4085_a, c5.getString(c5.getColumnIndex("A4085_a")));
                    params.put(A4081_A4094.A4085_b, c5.getString(c5.getColumnIndex("A4085_b")));
                    params.put(A4081_A4094.A4086, c5.getString(c5.getColumnIndex("A4086")));
                    params.put(A4081_A4094.A4087_u, c5.getString(c5.getColumnIndex("A4087_u")));
                    params.put(A4081_A4094.A4087_a, c5.getString(c5.getColumnIndex("A4087_a")));
                    params.put(A4081_A4094.A4087_b, c5.getString(c5.getColumnIndex("A4087_b")));
                    params.put(A4081_A4094.A4088, c5.getString(c5.getColumnIndex("A4088")));
                    params.put(A4081_A4094.A4089, c5.getString(c5.getColumnIndex("A4089")));
                    params.put(A4081_A4094.A4090, c5.getString(c5.getColumnIndex("A4090")));
                    params.put(A4081_A4094.A4091, c5.getString(c5.getColumnIndex("A4091")));
                    params.put(A4081_A4094.A4092, c5.getString(c5.getColumnIndex("A4092")));
                    params.put(A4081_A4094.A4093, c5.getString(c5.getColumnIndex("A4093")));
                    params.put(A4081_A4094.A4094_u, c5.getString(c5.getColumnIndex("A4094_u")));
                    params.put(A4081_A4094.A4094_a, c5.getString(c5.getColumnIndex("A4094_a")));
                    params.put(A4081_A4094.A4094_b, c5.getString(c5.getColumnIndex("A4094_b")));
                    params.put(A4081_A4094.A4094_c, c5.getString(c5.getColumnIndex("A4094_c")));

                } else {

                    params.put(A4081_A4094.A4081, "-2");
                    params.put(A4081_A4094.A4082_u, "-2");
                    params.put(A4081_A4094.A4082_a, "-2");
                    params.put(A4081_A4094.A4082_b, "-2");
                    params.put(A4081_A4094.A4082_c, "-2");
                    params.put(A4081_A4094.A4083, "-2");
                    params.put(A4081_A4094.A4084, "-2");
                    params.put(A4081_A4094.A4085_u, "-2");
                    params.put(A4081_A4094.A4085_a, "-2");
                    params.put(A4081_A4094.A4085_b, "-2");
                    params.put(A4081_A4094.A4086, "-2");
                    params.put(A4081_A4094.A4087_u, "-2");
                    params.put(A4081_A4094.A4087_a, "-2");
                    params.put(A4081_A4094.A4087_b, "-2");
                    params.put(A4081_A4094.A4088, "-2");
                    params.put(A4081_A4094.A4089, "-2");
                    params.put(A4081_A4094.A4090, "-2");
                    params.put(A4081_A4094.A4091, "-2");
                    params.put(A4081_A4094.A4092, "-2");
                    params.put(A4081_A4094.A4093, "-2");
                    params.put(A4081_A4094.A4094_u, "-2");
                    params.put(A4081_A4094.A4094_a, "-2");
                    params.put(A4081_A4094.A4094_b, "-2");
                    params.put(A4081_A4094.A4094_c, "-2");
                }

                if (c6.getCount() > 0) {

                    c6.moveToFirst();

                    params.put(A4095_A4108.A4095, c6.getString(c6.getColumnIndex("A4095")));
                    params.put(A4095_A4108.A4096, c6.getString(c6.getColumnIndex("A4096")));
                    params.put(A4095_A4108.A4097_u, c6.getString(c6.getColumnIndex("A4097_u")));
                    params.put(A4095_A4108.A4097_a, c6.getString(c6.getColumnIndex("A4097_a")));
                    params.put(A4095_A4108.A4097_b, c6.getString(c6.getColumnIndex("A4097_b")));
                    params.put(A4095_A4108.A4098, c6.getString(c6.getColumnIndex("A4098")));
                    params.put(A4095_A4108.A4099_u, c6.getString(c6.getColumnIndex("A4099_u")));
                    params.put(A4095_A4108.A4099_a, c6.getString(c6.getColumnIndex("A4099_a")));
                    params.put(A4095_A4108.A4099_b, c6.getString(c6.getColumnIndex("A4099_b")));
                    params.put(A4095_A4108.A4100, c6.getString(c6.getColumnIndex("A4100")));
                    params.put(A4095_A4108.A4101_u, c6.getString(c6.getColumnIndex("A4101_u")));
                    params.put(A4095_A4108.A4101_a, c6.getString(c6.getColumnIndex("A4101_a")));
                    params.put(A4095_A4108.A4101_b, c6.getString(c6.getColumnIndex("A4101_b")));
                    params.put(A4095_A4108.A4102, c6.getString(c6.getColumnIndex("A4102")));
                    params.put(A4095_A4108.A4103, c6.getString(c6.getColumnIndex("A4103")));
                    params.put(A4095_A4108.A4104, c6.getString(c6.getColumnIndex("A4104")));
                    params.put(A4095_A4108.A4105, c6.getString(c6.getColumnIndex("A4105")));
                    params.put(A4095_A4108.A4106, c6.getString(c6.getColumnIndex("A4106")));
                    params.put(A4095_A4108.A4107, c6.getString(c6.getColumnIndex("A4107")));
                    params.put(A4095_A4108.A4108, c6.getString(c6.getColumnIndex("A4108")));

                } else {

                    params.put(A4095_A4108.A4095, "-2");
                    params.put(A4095_A4108.A4096, "-2");
                    params.put(A4095_A4108.A4097_u, "-2");
                    params.put(A4095_A4108.A4097_a, "-2");
                    params.put(A4095_A4108.A4097_b, "-2");
                    params.put(A4095_A4108.A4098, "-2");
                    params.put(A4095_A4108.A4099_u, "-2");
                    params.put(A4095_A4108.A4099_a, "-2");
                    params.put(A4095_A4108.A4099_b, "-2");
                    params.put(A4095_A4108.A4100, "-2");
                    params.put(A4095_A4108.A4101_u, "-2");
                    params.put(A4095_A4108.A4101_a, "-2");
                    params.put(A4095_A4108.A4101_b, "-2");
                    params.put(A4095_A4108.A4102, "-2");
                    params.put(A4095_A4108.A4103, "-2");
                    params.put(A4095_A4108.A4104, "-2");
                    params.put(A4095_A4108.A4105, "-2");
                    params.put(A4095_A4108.A4106, "-2");
                    params.put(A4095_A4108.A4107, "-2");
                    params.put(A4095_A4108.A4108, "-2");
                }


                if (c7.getCount() > 0) {

                    c7.moveToFirst();

                    params.put(A4109_A4125.A4109, c7.getString(c7.getColumnIndex("A4109")));
                    params.put(A4109_A4125.A4110, c7.getString(c7.getColumnIndex("A4110")));
                    params.put(A4109_A4125.A4111, c7.getString(c7.getColumnIndex("A4111")));
                    params.put(A4109_A4125.A4112, c7.getString(c7.getColumnIndex("A4112")));
                    params.put(A4109_A4125.A4113, c7.getString(c7.getColumnIndex("A4113")));
                    params.put(A4109_A4125.A4114, c7.getString(c7.getColumnIndex("A4114")));
                    params.put(A4109_A4125.A4115, c7.getString(c7.getColumnIndex("A4115")));
                    params.put(A4109_A4125.A4116, c7.getString(c7.getColumnIndex("A4116")));
                    params.put(A4109_A4125.A4117_u, c7.getString(c7.getColumnIndex("A4117_u")));
                    params.put(A4109_A4125.A4117_a, c7.getString(c7.getColumnIndex("A4117_a")));
                    params.put(A4109_A4125.A4117_b, c7.getString(c7.getColumnIndex("A4117_b")));
                    params.put(A4109_A4125.A4118, c7.getString(c7.getColumnIndex("A4118")));
                    params.put(A4109_A4125.A4119, c7.getString(c7.getColumnIndex("A4119")));
                    params.put(A4109_A4125.A4120, c7.getString(c7.getColumnIndex("A4120")));
                    params.put(A4109_A4125.A4121, c7.getString(c7.getColumnIndex("A4121")));
                    params.put(A4109_A4125.A4122, c7.getString(c7.getColumnIndex("A4122")));
                    params.put(A4109_A4125.A4123, c7.getString(c7.getColumnIndex("A4123")));
                    params.put(A4109_A4125.A4124, c7.getString(c7.getColumnIndex("A4124")));
                    params.put(A4109_A4125.A4125, c7.getString(c7.getColumnIndex("A4125")));

                } else {

                    params.put(A4109_A4125.A4109, "-2");
                    params.put(A4109_A4125.A4110, "-2");
                    params.put(A4109_A4125.A4111, "-2");
                    params.put(A4109_A4125.A4112, "-2");
                    params.put(A4109_A4125.A4113, "-2");
                    params.put(A4109_A4125.A4114, "-2");
                    params.put(A4109_A4125.A4115, "-2");
                    params.put(A4109_A4125.A4116, "-2");
                    params.put(A4109_A4125.A4117_u, "-2");
                    params.put(A4109_A4125.A4117_a, "-2");
                    params.put(A4109_A4125.A4117_b, "-2");
                    params.put(A4109_A4125.A4118, "-2");
                    params.put(A4109_A4125.A4119, "-2");
                    params.put(A4109_A4125.A4120, "-2");
                    params.put(A4109_A4125.A4121, "-2");
                    params.put(A4109_A4125.A4122, "-2");
                    params.put(A4109_A4125.A4123, "-2");
                    params.put(A4109_A4125.A4124, "-2");
                    params.put(A4109_A4125.A4125, "-2");
                }


                if (c8.getCount() > 0) {

                    c8.moveToFirst();

                    params.put(A4126_A4140.A4126, c8.getString(c8.getColumnIndex("A4126")));
                    params.put(A4126_A4140.A4127_u, c8.getString(c8.getColumnIndex("A4127_u")));
                    params.put(A4126_A4140.A4127_a, c8.getString(c8.getColumnIndex("A4127_a")));
                    params.put(A4126_A4140.A4127_b, c8.getString(c8.getColumnIndex("A4127_b")));
                    params.put(A4126_A4140.A4128, c8.getString(c8.getColumnIndex("A4128")));
                    params.put(A4126_A4140.A4129, c8.getString(c8.getColumnIndex("A4129")));
                    params.put(A4126_A4140.A4130_u, c8.getString(c8.getColumnIndex("A4130_u")));
                    params.put(A4126_A4140.A4130_a, c8.getString(c8.getColumnIndex("A4130_a")));
                    params.put(A4126_A4140.A4130_b, c8.getString(c8.getColumnIndex("A4130_b")));
                    params.put(A4126_A4140.A4131, c8.getString(c8.getColumnIndex("A4131")));
                    params.put(A4126_A4140.A4132, c8.getString(c8.getColumnIndex("A4132")));
                    params.put(A4126_A4140.A4133, c8.getString(c8.getColumnIndex("A4133")));
                    params.put(A4126_A4140.A4134_u, c8.getString(c8.getColumnIndex("A4134_u")));
                    params.put(A4126_A4140.A4134_a, c8.getString(c8.getColumnIndex("A4134_a")));
                    params.put(A4126_A4140.A4134_b, c8.getString(c8.getColumnIndex("A4134_b")));
                    params.put(A4126_A4140.A4135, c8.getString(c8.getColumnIndex("A4135")));
                    params.put(A4126_A4140.A4136, c8.getString(c8.getColumnIndex("A4136")));
                    params.put(A4126_A4140.A4138, c8.getString(c8.getColumnIndex("A4138")));
                    params.put(A4126_A4140.A4139, c8.getString(c8.getColumnIndex("A4139")));
                    params.put(A4126_A4140.A4140, c8.getString(c8.getColumnIndex("A4140")));

                } else {

                    params.put(A4126_A4140.A4126, "-2");
                    params.put(A4126_A4140.A4127_u, "-2");
                    params.put(A4126_A4140.A4127_a, "-2");
                    params.put(A4126_A4140.A4127_b, "-2");
                    params.put(A4126_A4140.A4128, "-2");
                    params.put(A4126_A4140.A4129, "-2");
                    params.put(A4126_A4140.A4130_u, "-2");
                    params.put(A4126_A4140.A4130_a, "-2");
                    params.put(A4126_A4140.A4130_b, "-2");
                    params.put(A4126_A4140.A4131, "-2");
                    params.put(A4126_A4140.A4132, "-2");
                    params.put(A4126_A4140.A4133, "-2");
                    params.put(A4126_A4140.A4134_u, "-2");
                    params.put(A4126_A4140.A4134_a, "-2");
                    params.put(A4126_A4140.A4134_b, "-2");
                    params.put(A4126_A4140.A4135, "-2");
                    params.put(A4126_A4140.A4136, "-2");
                    params.put(A4126_A4140.A4138, "-2");
                    params.put(A4126_A4140.A4139, "-2");
                    params.put(A4126_A4140.A4140, "-2");
                }


                if (c9.getCount() > 0) {

                    c9.moveToFirst();

                    params.put(A4144_A4156.A4144, c9.getString(c9.getColumnIndex("A4144")));
                    params.put(A4144_A4156.A4145, c9.getString(c9.getColumnIndex("A4145")));
                    params.put(A4144_A4156.A4146, c9.getString(c9.getColumnIndex("A4146")));
                    params.put(A4144_A4156.A4147, c9.getString(c9.getColumnIndex("A4147")));
                    params.put(A4144_A4156.A4148, c9.getString(c9.getColumnIndex("A4148")));
                    params.put(A4144_A4156.A4149, c9.getString(c9.getColumnIndex("A4149")));
                    params.put(A4144_A4156.A4150_u, c9.getString(c9.getColumnIndex("A4150_u")));
                    params.put(A4144_A4156.A4150_a, c9.getString(c9.getColumnIndex("A4150_a")));
                    params.put(A4144_A4156.A4150_b, c9.getString(c9.getColumnIndex("A4150_b")));
                    params.put(A4144_A4156.A4151, c9.getString(c9.getColumnIndex("A4151")));
                    params.put(A4144_A4156.A4152, c9.getString(c9.getColumnIndex("A4152")));
                    params.put(A4144_A4156.A4153, c9.getString(c9.getColumnIndex("A4153")));
                    params.put(A4144_A4156.A4154, c9.getString(c9.getColumnIndex("A4154")));
                    params.put(A4144_A4156.A4155, c9.getString(c9.getColumnIndex("A4155")));
                    params.put(A4144_A4156.A4156, c9.getString(c9.getColumnIndex("A4156")));

                } else {

                    params.put(A4144_A4156.A4144, "-2");
                    params.put(A4144_A4156.A4145, "-2");
                    params.put(A4144_A4156.A4146, "-2");
                    params.put(A4144_A4156.A4147, "-2");
                    params.put(A4144_A4156.A4148, "-2");
                    params.put(A4144_A4156.A4149, "-2");
                    params.put(A4144_A4156.A4150_u, "-2");
                    params.put(A4144_A4156.A4150_a, "-2");
                    params.put(A4144_A4156.A4150_b, "-2");
                    params.put(A4144_A4156.A4151, "-2");
                    params.put(A4144_A4156.A4152, "-2");
                    params.put(A4144_A4156.A4153, "-2");
                    params.put(A4144_A4156.A4154, "-2");
                    params.put(A4144_A4156.A4155, "-2");
                    params.put(A4144_A4156.A4156, "-2");
                }

                if (c10.getCount() > 0) {

                    c10.moveToFirst();

                    params.put(A4157_A4205.A4157, c10.getString(c10.getColumnIndex("A4157")));
                    params.put(A4157_A4205.A4158, c10.getString(c10.getColumnIndex("A4158")));
                    params.put(A4157_A4205.A4159, c10.getString(c10.getColumnIndex("A4159")));
                    params.put(A4157_A4205.A4160, c10.getString(c10.getColumnIndex("A4160")));
                    params.put(A4157_A4205.A4161, c10.getString(c10.getColumnIndex("A4161")));
                    params.put(A4157_A4205.A4161_1, c10.getString(c10.getColumnIndex("A4161_1")));
                    params.put(A4157_A4205.A4162, c10.getString(c10.getColumnIndex("A4162")));
                    params.put(A4157_A4205.A4163_1, c10.getString(c10.getColumnIndex("A4163_1")));
                    params.put(A4157_A4205.A4163, c10.getString(c10.getColumnIndex("A4163")));
                    params.put(A4157_A4205.A4164, c10.getString(c10.getColumnIndex("A4164")));
                    params.put(A4157_A4205.A4166, c10.getString(c10.getColumnIndex("A4166")));
                    params.put(A4157_A4205.A4167, c10.getString(c10.getColumnIndex("A4167")));
                    params.put(A4157_A4205.A4168_1, c10.getString(c10.getColumnIndex("A4168_1")));
                    params.put(A4157_A4205.A4168_3, c10.getString(c10.getColumnIndex("A4168_3")));
                    params.put(A4157_A4205.A4168, c10.getString(c10.getColumnIndex("A4168")));
                    params.put(A4157_A4205.A4173_1, c10.getString(c10.getColumnIndex("A4173_1")));
                    params.put(A4157_A4205.A4173, c10.getString(c10.getColumnIndex("A4173")));
                    params.put(A4157_A4205.A4173_2, c10.getString(c10.getColumnIndex("A4173_2")));
                    params.put(A4157_A4205.A4178_1, c10.getString(c10.getColumnIndex("A4178_1")));
                    params.put(A4157_A4205.A4178_2, c10.getString(c10.getColumnIndex("A4178_2")));
                    params.put(A4157_A4205.A4178, c10.getString(c10.getColumnIndex("A4178")));
                    params.put(A4157_A4205.A4179, c10.getString(c10.getColumnIndex("A4179")));
                    params.put(A4157_A4205.A4180, c10.getString(c10.getColumnIndex("A4180")));
                    params.put(A4157_A4205.A4181, c10.getString(c10.getColumnIndex("A4181")));
                    params.put(A4157_A4205.A4182, c10.getString(c10.getColumnIndex("A4182")));
                    params.put(A4157_A4205.A4183, c10.getString(c10.getColumnIndex("A4183")));
                    params.put(A4157_A4205.A4184, c10.getString(c10.getColumnIndex("A4184")));
                    params.put(A4157_A4205.A4185, c10.getString(c10.getColumnIndex("A4185")));
                    params.put(A4157_A4205.A4186, c10.getString(c10.getColumnIndex("A4186")));
                    params.put(A4157_A4205.A4186_1, c10.getString(c10.getColumnIndex("A4186_1")));
                    params.put(A4157_A4205.A4187, c10.getString(c10.getColumnIndex("A4187")));
                    params.put(A4157_A4205.A4188, c10.getString(c10.getColumnIndex("A4188")));
                    params.put(A4157_A4205.A4189, c10.getString(c10.getColumnIndex("A4189")));
                    params.put(A4157_A4205.A4190, c10.getString(c10.getColumnIndex("A4190")));
                    params.put(A4157_A4205.A4191, c10.getString(c10.getColumnIndex("A4191")));
                    params.put(A4157_A4205.A4192, c10.getString(c10.getColumnIndex("A4192")));
                    params.put(A4157_A4205.A4193, c10.getString(c10.getColumnIndex("A4193")));
                    params.put(A4157_A4205.A4193_1, c10.getString(c10.getColumnIndex("A4193_1")));
                    params.put(A4157_A4205.A4194, c10.getString(c10.getColumnIndex("A4194")));
                    params.put(A4157_A4205.A4195, c10.getString(c10.getColumnIndex("A4195")));
                    params.put(A4157_A4205.A4196, c10.getString(c10.getColumnIndex("A4196")));
                    params.put(A4157_A4205.A4197, c10.getString(c10.getColumnIndex("A4197")));
                    params.put(A4157_A4205.A4198_1, c10.getString(c10.getColumnIndex("A4198_1")));
                    params.put(A4157_A4205.A4198, c10.getString(c10.getColumnIndex("A4198")));
                    params.put(A4157_A4205.A4200, c10.getString(c10.getColumnIndex("A4200")));
                    params.put(A4157_A4205.A4202, c10.getString(c10.getColumnIndex("A4202")));
                    params.put(A4157_A4205.A4203, c10.getString(c10.getColumnIndex("A4203")));
                    params.put(A4157_A4205.A4204, c10.getString(c10.getColumnIndex("A4204")));
                    params.put(A4157_A4205.A4205, c10.getString(c10.getColumnIndex("A4205")));
                    params.put(A4157_A4205.A4205_1, c10.getString(c10.getColumnIndex("A4205_1")));

                } else {

                    params.put(A4157_A4205.A4157, "-2");
                    params.put(A4157_A4205.A4158, "-2");
                    params.put(A4157_A4205.A4159, "-2");
                    params.put(A4157_A4205.A4160, "-2");
                    params.put(A4157_A4205.A4161, "-2");
                    params.put(A4157_A4205.A4161_1, "-2");
                    params.put(A4157_A4205.A4162, "-2");
                    params.put(A4157_A4205.A4163, "-2");
                    params.put(A4157_A4205.A4163, "-2");
                    params.put(A4157_A4205.A4164, "-2");
                    params.put(A4157_A4205.A4166, "-2");
                    params.put(A4157_A4205.A4167, "-2");
                    params.put(A4157_A4205.A4168_1, "-2");
                    params.put(A4157_A4205.A4168_3, "-2");
                    params.put(A4157_A4205.A4168, "-2");
                    params.put(A4157_A4205.A4173_1, "-2");
                    params.put(A4157_A4205.A4173, "-2");
                    params.put(A4157_A4205.A4173_2, "-2");
                    params.put(A4157_A4205.A4178_1, "-2");
                    params.put(A4157_A4205.A4178_2, "-2");
                    params.put(A4157_A4205.A4178, "-2");
                    params.put(A4157_A4205.A4179, "-2");
                    params.put(A4157_A4205.A4180, "-2");
                    params.put(A4157_A4205.A4181, "-2");
                    params.put(A4157_A4205.A4182, "-2");
                    params.put(A4157_A4205.A4183, "-2");
                    params.put(A4157_A4205.A4184, "-2");
                    params.put(A4157_A4205.A4185, "-2");
                    params.put(A4157_A4205.A4186, "-2");
                    params.put(A4157_A4205.A4186_1, "-2");
                    params.put(A4157_A4205.A4187, "-2");
                    params.put(A4157_A4205.A4188, "-2");
                    params.put(A4157_A4205.A4189, "-2");
                    params.put(A4157_A4205.A4190, "-2");
                    params.put(A4157_A4205.A4191, "-2");
                    params.put(A4157_A4205.A4192, "-2");
                    params.put(A4157_A4205.A4193, "-2");
                    params.put(A4157_A4205.A4193_1, "-2");
                    params.put(A4157_A4205.A4194, "-2");
                    params.put(A4157_A4205.A4195, "-2");
                    params.put(A4157_A4205.A4196, "-2");
                    params.put(A4157_A4205.A4197, "-2");
                    params.put(A4157_A4205.A4198_1, "-2");
                    params.put(A4157_A4205.A4198, "-2");
                    params.put(A4157_A4205.A4200, "-2");
                    params.put(A4157_A4205.A4202, "-2");
                    params.put(A4157_A4205.A4203, "-2");
                    params.put(A4157_A4205.A4204, "-2");
                    params.put(A4157_A4205.A4205, "-2");
                    params.put(A4157_A4205.A4205_1, "-2");
                }

                if (c11.getCount() > 0) {

                    c11.moveToFirst();

                    params.put(A4206_A4207.A4206, c11.getString(c11.getColumnIndex("A4206")));
                    params.put(A4206_A4207.A4206_1, c11.getString(c11.getColumnIndex("A4206_1")));
                    params.put(A4206_A4207.A4206_2, c11.getString(c11.getColumnIndex("A4206_2")));
                    params.put(A4206_A4207.A4206_3, c11.getString(c11.getColumnIndex("A4206_3")));
                    params.put(A4206_A4207.A4206_4, c11.getString(c11.getColumnIndex("A4206_4")));
                    params.put(A4206_A4207.A4206_5, c11.getString(c11.getColumnIndex("A4206_5")));
                    params.put(A4206_A4207.A4206_6, c11.getString(c11.getColumnIndex("A4206_6")));
                    params.put(A4206_A4207.A4206_7, c11.getString(c11.getColumnIndex("A4206_7")));
                    params.put(A4206_A4207.A4206_8, c11.getString(c11.getColumnIndex("A4206_8")));
                    params.put(A4206_A4207.A4206_9, c11.getString(c11.getColumnIndex("A4206_9")));
                    params.put(A4206_A4207.A4206_10, c11.getString(c11.getColumnIndex("A4206_10")));
                    params.put(A4206_A4207.A4206_11, c11.getString(c11.getColumnIndex("A4206_11")));
                    params.put(A4206_A4207.A4206_12, c11.getString(c11.getColumnIndex("A4206_12")));
                    params.put(A4206_A4207.A4206_13, c11.getString(c11.getColumnIndex("A4206_13")));
                    params.put(A4206_A4207.A4206_14, c11.getString(c11.getColumnIndex("A4206_14")));
                    params.put(A4206_A4207.A4206_15, c11.getString(c11.getColumnIndex("A4206_15")));
                    params.put(A4206_A4207.A4206_16, c11.getString(c11.getColumnIndex("A4206_16")));
                    params.put(A4206_A4207.A4206_17, c11.getString(c11.getColumnIndex("A4206_17")));
                    params.put(A4206_A4207.A4206_18, c11.getString(c11.getColumnIndex("A4206_18")));
                    params.put(A4206_A4207.A4206_19, c11.getString(c11.getColumnIndex("A4206_19")));
                    params.put(A4206_A4207.A4206_20, c11.getString(c11.getColumnIndex("A4206_20")));
                    params.put(A4206_A4207.A4206_21, c11.getString(c11.getColumnIndex("A4206_21")));
                    params.put(A4206_A4207.A4206_22, c11.getString(c11.getColumnIndex("A4206_22")));
                    params.put(A4206_A4207.A4207_hour, c11.getString(c11.getColumnIndex("A4207_hour")));
                    params.put(A4206_A4207.A4207_day, c11.getString(c11.getColumnIndex("A4207_day")));

                } else {

                    params.put(A4206_A4207.A4206, "-2");
                    params.put(A4206_A4207.A4206_1, "-2");
                    params.put(A4206_A4207.A4206_2, "-2");
                    params.put(A4206_A4207.A4206_3, "-2");
                    params.put(A4206_A4207.A4206_4, "-2");
                    params.put(A4206_A4207.A4206_5, "-2");
                    params.put(A4206_A4207.A4206_6, "-2");
                    params.put(A4206_A4207.A4206_7, "-2");
                    params.put(A4206_A4207.A4206_8, "-2");
                    params.put(A4206_A4207.A4206_9, "-2");
                    params.put(A4206_A4207.A4206_10, "-2");
                    params.put(A4206_A4207.A4206_11, "-2");
                    params.put(A4206_A4207.A4206_12, "-2");
                    params.put(A4206_A4207.A4206_13, "-2");
                    params.put(A4206_A4207.A4206_14, "-2");
                    params.put(A4206_A4207.A4206_15, "-2");
                    params.put(A4206_A4207.A4206_16, "-2");
                    params.put(A4206_A4207.A4206_17, "-2");
                    params.put(A4206_A4207.A4206_18, "-2");
                    params.put(A4206_A4207.A4206_19, "-2");
                    params.put(A4206_A4207.A4206_20, "-2");
                    params.put(A4206_A4207.A4206_21, "-2");
                    params.put(A4206_A4207.A4206_22, "-2");
                    params.put(A4206_A4207.A4207_hour, "-2");
                    params.put(A4206_A4207.A4207_day, "-2");
                }

                if (c12.getCount() > 0) {

                    c12.moveToFirst();

                    params.put(A4251_A4284.A4251, c12.getString(c12.getColumnIndex("A4251")));
                    params.put(A4251_A4284.A4253, c12.getString(c12.getColumnIndex("A4253")));
                    params.put(A4251_A4284.A4253_3, c12.getString(c12.getColumnIndex("A4253_3")));
                    params.put(A4251_A4284.A4254_1, c12.getString(c12.getColumnIndex("A4254_1")));
                    params.put(A4251_A4284.A4254_2, c12.getString(c12.getColumnIndex("A4254_2")));
                    params.put(A4251_A4284.A4255_1, c12.getString(c12.getColumnIndex("A4255_1")));
                    params.put(A4251_A4284.A4255_2, c12.getString(c12.getColumnIndex("A4255_2")));
                    params.put(A4251_A4284.A4255_3, c12.getString(c12.getColumnIndex("A4255_3")));
                    params.put(A4251_A4284.A4255_4, c12.getString(c12.getColumnIndex("A4255_4")));
                    params.put(A4251_A4284.A4255_4_OT, c12.getString(c12.getColumnIndex("A4255_4_OT")));
                    params.put(A4251_A4284.A4255_5, c12.getString(c12.getColumnIndex("A4255_5")));
                    params.put(A4251_A4284.A4255_6, c12.getString(c12.getColumnIndex("A4255_6")));
                    params.put(A4251_A4284.A4255_7, c12.getString(c12.getColumnIndex("A4255_7")));
                    params.put(A4251_A4284.A4255_8, c12.getString(c12.getColumnIndex("A4255_8")));
                    params.put(A4251_A4284.A4255_9, c12.getString(c12.getColumnIndex("A4255_9")));
                    params.put(A4251_A4284.A4255_10, c12.getString(c12.getColumnIndex("A4255_10")));
                    params.put(A4251_A4284.A4255_11, c12.getString(c12.getColumnIndex("A4255_11")));
                    params.put(A4251_A4284.A4255_12, c12.getString(c12.getColumnIndex("A4255_12")));
                    params.put(A4251_A4284.A4255_13, c12.getString(c12.getColumnIndex("A4255_13")));
                    params.put(A4251_A4284.A4255_13_OT, c12.getString(c12.getColumnIndex("A4255_13_OT")));
                    params.put(A4251_A4284.A4255_DK, c12.getString(c12.getColumnIndex("A4255_DK")));
                    params.put(A4251_A4284.A4256_days, c12.getString(c12.getColumnIndex("A4256_days")));
                    params.put(A4251_A4284.A4256_hours, c12.getString(c12.getColumnIndex("A4256_hours")));
                    params.put(A4251_A4284.A4256_minutes, c12.getString(c12.getColumnIndex("A4256_minutes")));
                    params.put(A4251_A4284.A4257, c12.getString(c12.getColumnIndex("A4257")));
                    params.put(A4251_A4284.A4257_name, c12.getString(c12.getColumnIndex("A4257_name")));
                    params.put(A4251_A4284.A4258_1, c12.getString(c12.getColumnIndex("A4258_1")));
                    params.put(A4251_A4284.A4258_2, c12.getString(c12.getColumnIndex("A4258_2")));
                    params.put(A4251_A4284.A4259_hours, c12.getString(c12.getColumnIndex("A4259_hours")));
                    params.put(A4251_A4284.A4259_minutes, c12.getString(c12.getColumnIndex("A4259_minutes")));
                    params.put(A4251_A4284.A4260, c12.getString(c12.getColumnIndex("A4260")));
                    params.put(A4251_A4284.A4261, c12.getString(c12.getColumnIndex("A4261")));
                    params.put(A4251_A4284.A4262, c12.getString(c12.getColumnIndex("A4262")));
                    params.put(A4251_A4284.A4262_name, c12.getString(c12.getColumnIndex("A4262_name")));
                    params.put(A4251_A4284.A4263_1, c12.getString(c12.getColumnIndex("A4263_1")));
                    params.put(A4251_A4284.A4263_2, c12.getString(c12.getColumnIndex("A4263_2")));
                    params.put(A4251_A4284.A4264, c12.getString(c12.getColumnIndex("A4264")));
                    params.put(A4251_A4284.A4266, c12.getString(c12.getColumnIndex("A4266")));
                    params.put(A4251_A4284.A4266_name, c12.getString(c12.getColumnIndex("A4266_name")));
                    params.put(A4251_A4284.A4267_1, c12.getString(c12.getColumnIndex("A4267_1")));
                    params.put(A4251_A4284.A4267_2, c12.getString(c12.getColumnIndex("A4267_2")));
                    params.put(A4251_A4284.A4268_hours, c12.getString(c12.getColumnIndex("A4268_hours")));
                    params.put(A4251_A4284.A4268_minutes, c12.getString(c12.getColumnIndex("A4268_minutes")));
                    params.put(A4251_A4284.A4269, c12.getString(c12.getColumnIndex("A4269")));
                    params.put(A4251_A4284.A4270, c12.getString(c12.getColumnIndex("A4270")));
                    params.put(A4251_A4284.A4271, c12.getString(c12.getColumnIndex("A4271")));
                    params.put(A4251_A4284.A4271_name, c12.getString(c12.getColumnIndex("A4271_name")));
                    params.put(A4251_A4284.A4272_1, c12.getString(c12.getColumnIndex("A4272_1")));
                    params.put(A4251_A4284.A4272_2, c12.getString(c12.getColumnIndex("A4272_2")));
                    params.put(A4251_A4284.A4273, c12.getString(c12.getColumnIndex("A4273")));
                    params.put(A4251_A4284.A4274, c12.getString(c12.getColumnIndex("A4274")));
                    params.put(A4251_A4284.A4275_1, c12.getString(c12.getColumnIndex("A4275_1")));
                    params.put(A4251_A4284.A4275_2, c12.getString(c12.getColumnIndex("A4275_2")));
                    params.put(A4251_A4284.A4276_1, c12.getString(c12.getColumnIndex("A4276_1")));
                    params.put(A4251_A4284.A4276_2, c12.getString(c12.getColumnIndex("A4276_2")));
                    params.put(A4251_A4284.A4276_3, c12.getString(c12.getColumnIndex("A4276_3")));
                    params.put(A4251_A4284.A4276_4, c12.getString(c12.getColumnIndex("A4276_4")));
                    params.put(A4251_A4284.A4276_5, c12.getString(c12.getColumnIndex("A4276_5")));
                    params.put(A4251_A4284.A4276_5_OT, c12.getString(c12.getColumnIndex("A4276_5_OT")));
                    params.put(A4251_A4284.A4276_6, c12.getString(c12.getColumnIndex("A4276_6")));
                    params.put(A4251_A4284.A4276_7, c12.getString(c12.getColumnIndex("A4276_7")));
                    params.put(A4251_A4284.A4276_8, c12.getString(c12.getColumnIndex("A4276_8")));
                    params.put(A4251_A4284.A4276_9, c12.getString(c12.getColumnIndex("A4276_9")));
                    params.put(A4251_A4284.A4276_10, c12.getString(c12.getColumnIndex("A4276_10")));
                    params.put(A4251_A4284.A4276_11, c12.getString(c12.getColumnIndex("A4276_11")));
                    params.put(A4251_A4284.A4276_12, c12.getString(c12.getColumnIndex("A4276_12")));
                    params.put(A4251_A4284.A4276_13, c12.getString(c12.getColumnIndex("A4276_13")));
                    params.put(A4251_A4284.A4276_14, c12.getString(c12.getColumnIndex("A4276_14")));
                    params.put(A4251_A4284.A4276_15, c12.getString(c12.getColumnIndex("A4276_15")));
                    params.put(A4251_A4284.A4276_16, c12.getString(c12.getColumnIndex("A4276_16")));
                    params.put(A4251_A4284.A4276_16_OT, c12.getString(c12.getColumnIndex("A4276_16_OT")));
                    params.put(A4251_A4284.A4276_DK, c12.getString(c12.getColumnIndex("A4276_DK")));
                    params.put(A4251_A4284.A4277, c12.getString(c12.getColumnIndex("A4277")));
                    params.put(A4251_A4284.A4278_1, c12.getString(c12.getColumnIndex("A4278_1")));
                    params.put(A4251_A4284.A4278_2, c12.getString(c12.getColumnIndex("A4278_2")));
                    params.put(A4251_A4284.A4278_3, c12.getString(c12.getColumnIndex("A4278_3")));
                    params.put(A4251_A4284.A4278_4, c12.getString(c12.getColumnIndex("A4278_4")));
                    params.put(A4251_A4284.A4278_5, c12.getString(c12.getColumnIndex("A4278_5")));
                    params.put(A4251_A4284.A4278_6, c12.getString(c12.getColumnIndex("A4278_6")));
                    params.put(A4251_A4284.A4278_7, c12.getString(c12.getColumnIndex("A4278_7")));
                    params.put(A4251_A4284.A4278_DK, c12.getString(c12.getColumnIndex("A4278_DK")));
                    params.put(A4251_A4284.A4279_1, c12.getString(c12.getColumnIndex("A4279_1")));
                    params.put(A4251_A4284.A4279_2, c12.getString(c12.getColumnIndex("A4279_2")));
                    params.put(A4251_A4284.A4279_3, c12.getString(c12.getColumnIndex("A4279_3")));
                    params.put(A4251_A4284.A4279_4, c12.getString(c12.getColumnIndex("A4279_4")));
                    params.put(A4251_A4284.A4279_5, c12.getString(c12.getColumnIndex("A4279_5")));
                    params.put(A4251_A4284.A4279_6, c12.getString(c12.getColumnIndex("A4279_6")));
                    params.put(A4251_A4284.A4279_7, c12.getString(c12.getColumnIndex("A4279_7")));
                    params.put(A4251_A4284.A4279_DK, c12.getString(c12.getColumnIndex("A4279_DK")));
                    params.put(A4251_A4284.A4280, c12.getString(c12.getColumnIndex("A4280")));
                    params.put(A4251_A4284.A4281, c12.getString(c12.getColumnIndex("A4281")));
                    params.put(A4251_A4284.A4282, c12.getString(c12.getColumnIndex("A4282")));
                    params.put(A4251_A4284.A4283, c12.getString(c12.getColumnIndex("A4283")));
                    params.put(A4251_A4284.A4284, c12.getString(c12.getColumnIndex("A4284")));

                } else {

                    params.put(A4251_A4284.A4251, "-2");
                    params.put(A4251_A4284.A4253, "-2");
                    params.put(A4251_A4284.A4253_3, "-2");
                    params.put(A4251_A4284.A4254_1, "-2");
                    params.put(A4251_A4284.A4254_2, "-2");
                    params.put(A4251_A4284.A4255_1, "-2");
                    params.put(A4251_A4284.A4255_2, "-2");
                    params.put(A4251_A4284.A4255_3, "-2");
                    params.put(A4251_A4284.A4255_4, "-2");
                    params.put(A4251_A4284.A4255_4_OT, "-2");
                    params.put(A4251_A4284.A4255_5, "-2");
                    params.put(A4251_A4284.A4255_6, "-2");
                    params.put(A4251_A4284.A4255_7, "-2");
                    params.put(A4251_A4284.A4255_8, "-2");
                    params.put(A4251_A4284.A4255_9, "-2");
                    params.put(A4251_A4284.A4255_10, "-2");
                    params.put(A4251_A4284.A4255_11, "-2");
                    params.put(A4251_A4284.A4255_12, "-2");
                    params.put(A4251_A4284.A4255_13, "-2");
                    params.put(A4251_A4284.A4255_13_OT, "-2");
                    params.put(A4251_A4284.A4255_DK, "-2");
                    params.put(A4251_A4284.A4256_days, "-2");
                    params.put(A4251_A4284.A4256_hours, "-2");
                    params.put(A4251_A4284.A4256_minutes, "-2");
                    params.put(A4251_A4284.A4257, "-2");
                    params.put(A4251_A4284.A4257_name, "-2");
                    params.put(A4251_A4284.A4258_1, "-2");
                    params.put(A4251_A4284.A4258_2, "-2");
                    params.put(A4251_A4284.A4259_hours, "-2");
                    params.put(A4251_A4284.A4259_minutes, "-2");
                    params.put(A4251_A4284.A4260, "-2");
                    params.put(A4251_A4284.A4261, "-2");
                    params.put(A4251_A4284.A4262, "-2");
                    params.put(A4251_A4284.A4262_name, "-2");
                    params.put(A4251_A4284.A4263_1, "-2");
                    params.put(A4251_A4284.A4263_2, "-2");
                    params.put(A4251_A4284.A4264, "-2");
                    params.put(A4251_A4284.A4266, "-2");
                    params.put(A4251_A4284.A4266_name, "-2");
                    params.put(A4251_A4284.A4267_1, "-2");
                    params.put(A4251_A4284.A4267_2, "-2");
                    params.put(A4251_A4284.A4268_hours, "-2");
                    params.put(A4251_A4284.A4268_minutes, "-2");
                    params.put(A4251_A4284.A4269, "-2");
                    params.put(A4251_A4284.A4270, "-2");
                    params.put(A4251_A4284.A4271, "-2");
                    params.put(A4251_A4284.A4271_name, "-2");
                    params.put(A4251_A4284.A4272_1, "-2");
                    params.put(A4251_A4284.A4272_2, "-2");
                    params.put(A4251_A4284.A4273, "-2");
                    params.put(A4251_A4284.A4274, "-2");
                    params.put(A4251_A4284.A4275_1, "-2");
                    params.put(A4251_A4284.A4275_2, "-2");
                    params.put(A4251_A4284.A4276_1, "-2");
                    params.put(A4251_A4284.A4276_2, "-2");
                    params.put(A4251_A4284.A4276_3, "-2");
                    params.put(A4251_A4284.A4276_4, "-2");
                    params.put(A4251_A4284.A4276_5, "-2");
                    params.put(A4251_A4284.A4276_5_OT, "-2");
                    params.put(A4251_A4284.A4276_6, "-2");
                    params.put(A4251_A4284.A4276_7, "-2");
                    params.put(A4251_A4284.A4276_8, "-2");
                    params.put(A4251_A4284.A4276_9, "-2");
                    params.put(A4251_A4284.A4276_10, "-2");
                    params.put(A4251_A4284.A4276_11, "-2");
                    params.put(A4251_A4284.A4276_12, "-2");
                    params.put(A4251_A4284.A4276_13, "-2");
                    params.put(A4251_A4284.A4276_14, "-2");
                    params.put(A4251_A4284.A4276_15, "-2");
                    params.put(A4251_A4284.A4276_16, "-2");
                    params.put(A4251_A4284.A4276_16_OT, "-2");
                    params.put(A4251_A4284.A4276_DK, "-2");
                    params.put(A4251_A4284.A4277, "-2");
                    params.put(A4251_A4284.A4278_1, "-2");
                    params.put(A4251_A4284.A4278_2, "-2");
                    params.put(A4251_A4284.A4278_3, "-2");
                    params.put(A4251_A4284.A4278_4, "-2");
                    params.put(A4251_A4284.A4278_5, "-2");
                    params.put(A4251_A4284.A4278_6, "-2");
                    params.put(A4251_A4284.A4278_7, "-2");
                    params.put(A4251_A4284.A4278_DK, "-2");
                    params.put(A4251_A4284.A4279_1, "-2");
                    params.put(A4251_A4284.A4279_2, "-2");
                    params.put(A4251_A4284.A4279_3, "-2");
                    params.put(A4251_A4284.A4279_4, "-2");
                    params.put(A4251_A4284.A4279_5, "-2");
                    params.put(A4251_A4284.A4279_6, "-2");
                    params.put(A4251_A4284.A4279_7, "-2");
                    params.put(A4251_A4284.A4279_DK, "-2");
                    params.put(A4251_A4284.A4280, "-2");
                    params.put(A4251_A4284.A4281, "-2");
                    params.put(A4251_A4284.A4282, "-2");
                    params.put(A4251_A4284.A4283, "-2");
                    params.put(A4251_A4284.A4284, "-2");
                }

                if (c13.getCount() > 0) {

                    c13.moveToFirst();

                    params.put(A4301_A4315.A4301, c13.getString(c13.getColumnIndex("A4301")));
                    params.put(A4301_A4315.A4302_1, c13.getString(c13.getColumnIndex("A4302_1")));
                    params.put(A4301_A4315.A4302_2, c13.getString(c13.getColumnIndex("A4302_2")));
                    params.put(A4301_A4315.A4302_3, c13.getString(c13.getColumnIndex("A4302_3")));
                    params.put(A4301_A4315.A4302_4, c13.getString(c13.getColumnIndex("A4302_4")));
                    params.put(A4301_A4315.A4302_5, c13.getString(c13.getColumnIndex("A4302_5")));
                    params.put(A4301_A4315.A4302_6, c13.getString(c13.getColumnIndex("A4302_6")));
                    params.put(A4301_A4315.A4302_7, c13.getString(c13.getColumnIndex("A4302_7")));
                    params.put(A4301_A4315.A4303, c13.getString(c13.getColumnIndex("A4303")));
                    params.put(A4301_A4315.A4304, c13.getString(c13.getColumnIndex("A4304")));
                    params.put(A4301_A4315.A4305, c13.getString(c13.getColumnIndex("A4305")));
                    params.put(A4301_A4315.A4306_1check, c13.getString(c13.getColumnIndex("A4306_1check")));
                    params.put(A4301_A4315.A4306_1, c13.getString(c13.getColumnIndex("A4306_1")));
                    params.put(A4301_A4315.A4306_2check, c13.getString(c13.getColumnIndex("A4306_2check")));
                    params.put(A4301_A4315.A4306_2, c13.getString(c13.getColumnIndex("A4306_2")));
                    params.put(A4301_A4315.A4307, c13.getString(c13.getColumnIndex("A4307")));
                    params.put(A4301_A4315.A4308, c13.getString(c13.getColumnIndex("A4308")));
                    params.put(A4301_A4315.A4309, c13.getString(c13.getColumnIndex("A4309")));
                    params.put(A4301_A4315.A4310_1, c13.getString(c13.getColumnIndex("A4310_1")));
                    params.put(A4301_A4315.A4310_2, c13.getString(c13.getColumnIndex("A4310_2")));
                    params.put(A4301_A4315.A4310_3, c13.getString(c13.getColumnIndex("A4310_3")));
                    params.put(A4301_A4315.A4310_4, c13.getString(c13.getColumnIndex("A4310_4")));
                    params.put(A4301_A4315.A4310_5, c13.getString(c13.getColumnIndex("A4310_5")));
                    params.put(A4301_A4315.A4310_6, c13.getString(c13.getColumnIndex("A4310_6")));
                    params.put(A4301_A4315.A4310_7, c13.getString(c13.getColumnIndex("A4310_7")));
                    params.put(A4301_A4315.A4310_8, c13.getString(c13.getColumnIndex("A4310_8")));
                    params.put(A4301_A4315.A4310_9, c13.getString(c13.getColumnIndex("A4310_9")));
                    params.put(A4301_A4315.A4310_10, c13.getString(c13.getColumnIndex("A4310_10")));
                    params.put(A4301_A4315.A4310_11, c13.getString(c13.getColumnIndex("A4310_11")));
                    params.put(A4301_A4315.A4311_1, c13.getString(c13.getColumnIndex("A4311_1")));
                    params.put(A4301_A4315.A4311_2, c13.getString(c13.getColumnIndex("A4311_2")));
                    params.put(A4301_A4315.A4311_3, c13.getString(c13.getColumnIndex("A4311_3")));
                    params.put(A4301_A4315.A4311_4, c13.getString(c13.getColumnIndex("A4311_4")));
                    params.put(A4301_A4315.A4311_5, c13.getString(c13.getColumnIndex("A4311_5")));
                    params.put(A4301_A4315.A4312, c13.getString(c13.getColumnIndex("A4312")));
                    params.put(A4301_A4315.A4313, c13.getString(c13.getColumnIndex("A4313")));
                    params.put(A4301_A4315.A4314, c13.getString(c13.getColumnIndex("A4314")));
                    params.put(A4301_A4315.A4315, c13.getString(c13.getColumnIndex("A4315")));

                } else {

                    params.put(A4301_A4315.A4301, "-2");
                    params.put(A4301_A4315.A4302_1, "-2");
                    params.put(A4301_A4315.A4302_2, "-2");
                    params.put(A4301_A4315.A4302_3, "-2");
                    params.put(A4301_A4315.A4302_4, "-2");
                    params.put(A4301_A4315.A4302_5, "-2");
                    params.put(A4301_A4315.A4302_6, "-2");
                    params.put(A4301_A4315.A4302_7, "-2");
                    params.put(A4301_A4315.A4303, "-2");
                    params.put(A4301_A4315.A4304, "-2");
                    params.put(A4301_A4315.A4305, "-2");
                    params.put(A4301_A4315.A4306_1check, "-2");
                    params.put(A4301_A4315.A4306_1, "-2");
                    params.put(A4301_A4315.A4306_2check, "-2");
                    params.put(A4301_A4315.A4306_2, "-2");
                    params.put(A4301_A4315.A4307, "-2");
                    params.put(A4301_A4315.A4308, "-2");
                    params.put(A4301_A4315.A4309, "-2");
                    params.put(A4301_A4315.A4310_1, "-2");
                    params.put(A4301_A4315.A4310_2, "-2");
                    params.put(A4301_A4315.A4310_3, "-2");
                    params.put(A4301_A4315.A4310_4, "-2");
                    params.put(A4301_A4315.A4310_5, "-2");
                    params.put(A4301_A4315.A4310_6, "-2");
                    params.put(A4301_A4315.A4310_7, "-2");
                    params.put(A4301_A4315.A4310_8, "-2");
                    params.put(A4301_A4315.A4310_9, "-2");
                    params.put(A4301_A4315.A4310_10, "-2");
                    params.put(A4301_A4315.A4310_11, "-2");
                    params.put(A4301_A4315.A4311_1, "-2");
                    params.put(A4301_A4315.A4311_2, "-2");
                    params.put(A4301_A4315.A4311_3, "-2");
                    params.put(A4301_A4315.A4311_4, "-2");
                    params.put(A4301_A4315.A4311_5, "-2");
                    params.put(A4301_A4315.A4312, "-2");
                    params.put(A4301_A4315.A4313, "-2");
                    params.put(A4301_A4315.A4314, "-2");
                    params.put(A4301_A4315.A4315, "-2");
                }

                if (c14.getCount() > 0) {

                    c14.moveToFirst();

                    params.put(A4351_A4364.A4351, c14.getString(c14.getColumnIndex("A4351")));
                    params.put(A4351_A4364.A4352, c14.getString(c14.getColumnIndex("A4352")));
                    params.put(A4351_A4364.A4353, c14.getString(c14.getColumnIndex("A4353")));
                    params.put(A4351_A4364.A4354, c14.getString(c14.getColumnIndex("A4354")));
                    params.put(A4351_A4364.A4355, c14.getString(c14.getColumnIndex("A4355")));
                    params.put(A4351_A4364.A4356, c14.getString(c14.getColumnIndex("A4356")));
                    params.put(A4351_A4364.A4357, c14.getString(c14.getColumnIndex("A4357")));
                    params.put(A4351_A4364.A4358, c14.getString(c14.getColumnIndex("A4358")));
                    params.put(A4351_A4364.A4363, c14.getString(c14.getColumnIndex("A4363")));
                    params.put(A4351_A4364.A4364, c14.getString(c14.getColumnIndex("A4364")));

                } else {

                    params.put(A4351_A4364.A4351, "-2");
                    params.put(A4351_A4364.A4352, "-2");
                    params.put(A4351_A4364.A4353, "-2");
                    params.put(A4351_A4364.A4354, "-2");
                    params.put(A4351_A4364.A4355, "-2");
                    params.put(A4351_A4364.A4356, "-2");
                    params.put(A4351_A4364.A4357, "-2");
                    params.put(A4351_A4364.A4358, "-2");
                    params.put(A4351_A4364.A4363, "-2");
                    params.put(A4351_A4364.A4364, "-2");
                }

                if (c15.getCount() > 0) {

                    c15.moveToFirst();

                    params.put(A4401_A4473.A4401, c15.getString(c15.getColumnIndex("A4401")));
                    params.put(A4401_A4473.A4402, c15.getString(c15.getColumnIndex("A4402")));
                    params.put(A4401_A4473.A4402_5_OT, c15.getString(c15.getColumnIndex("A4402_5_OT")));
                    params.put(A4401_A4473.A4403_province, c15.getString(c15.getColumnIndex("A4403_province")));
                    params.put(A4401_A4473.A4403_district, c15.getString(c15.getColumnIndex("A4403_district")));
                    params.put(A4401_A4473.A4404_years, c15.getString(c15.getColumnIndex("A4404_years")));
                    params.put(A4401_A4473.A4405_hours, c15.getString(c15.getColumnIndex("A4405_hours")));
                    params.put(A4401_A4473.A4405_minutes, c15.getString(c15.getColumnIndex("A4405_minutes")));
                    params.put(A4401_A4473.A4451_1, c15.getString(c15.getColumnIndex("A4451_1")));
                    params.put(A4401_A4473.A4451_2, c15.getString(c15.getColumnIndex("A4451_2")));
                    params.put(A4401_A4473.A4451_3, c15.getString(c15.getColumnIndex("A4451_3")));
                    params.put(A4401_A4473.A4451_4, c15.getString(c15.getColumnIndex("A4451_4")));
                    params.put(A4401_A4473.A4451_5, c15.getString(c15.getColumnIndex("A4451_5")));
                    params.put(A4401_A4473.A4451_6, c15.getString(c15.getColumnIndex("A4451_6")));
                    params.put(A4401_A4473.A4451_7, c15.getString(c15.getColumnIndex("A4451_7")));
                    params.put(A4401_A4473.A4451_8, c15.getString(c15.getColumnIndex("A4451_8")));
                    params.put(A4401_A4473.A4451_9, c15.getString(c15.getColumnIndex("A4451_9")));
                    params.put(A4401_A4473.A4451_10, c15.getString(c15.getColumnIndex("A4451_10")));
                    params.put(A4401_A4473.A4451_11, c15.getString(c15.getColumnIndex("A4451_11")));
                    params.put(A4401_A4473.A4451_12, c15.getString(c15.getColumnIndex("A4451_12")));
                    params.put(A4401_A4473.A4451_13, c15.getString(c15.getColumnIndex("A4451_13")));
                    params.put(A4401_A4473.A4451_13_OT, c15.getString(c15.getColumnIndex("A4451_13_OT")));
                    params.put(A4401_A4473.A4451_code, c15.getString(c15.getColumnIndex("A4451_code")));
                    params.put(A4401_A4473.A4452_1, c15.getString(c15.getColumnIndex("A4452_1")));
                    params.put(A4401_A4473.A4452_2, c15.getString(c15.getColumnIndex("A4452_2")));
                    params.put(A4401_A4473.A4452_3, c15.getString(c15.getColumnIndex("A4452_3")));
                    params.put(A4401_A4473.A4452_4, c15.getString(c15.getColumnIndex("A4452_4")));
                    params.put(A4401_A4473.A4452_5, c15.getString(c15.getColumnIndex("A4452_5")));
                    params.put(A4401_A4473.A4452_6, c15.getString(c15.getColumnIndex("A4452_6")));
                    params.put(A4401_A4473.A4452_7, c15.getString(c15.getColumnIndex("A4452_7")));
                    params.put(A4401_A4473.A4452_8, c15.getString(c15.getColumnIndex("A4452_8")));
                    params.put(A4401_A4473.A4452_9, c15.getString(c15.getColumnIndex("A4452_9")));
                    params.put(A4401_A4473.A4452_9_OT, c15.getString(c15.getColumnIndex("A4452_9_OT")));
                    params.put(A4401_A4473.A4452_code, c15.getString(c15.getColumnIndex("A4452_code")));
                    params.put(A4401_A4473.A4453_1, c15.getString(c15.getColumnIndex("A4453_1")));
                    params.put(A4401_A4473.A4453_2, c15.getString(c15.getColumnIndex("A4453_2")));
                    params.put(A4401_A4473.A4453_3, c15.getString(c15.getColumnIndex("A4453_3")));
                    params.put(A4401_A4473.A4453_4, c15.getString(c15.getColumnIndex("A4453_4")));
                    params.put(A4401_A4473.A4453_5, c15.getString(c15.getColumnIndex("A4453_5")));
                    params.put(A4401_A4473.A4453_6, c15.getString(c15.getColumnIndex("A4453_6")));
                    params.put(A4401_A4473.A4453_7, c15.getString(c15.getColumnIndex("A4453_7")));
                    params.put(A4401_A4473.A4453_8, c15.getString(c15.getColumnIndex("A4453_8")));
                    params.put(A4401_A4473.A4453_9, c15.getString(c15.getColumnIndex("A4453_9")));
                    params.put(A4401_A4473.A4453_10, c15.getString(c15.getColumnIndex("A4453_10")));
                    params.put(A4401_A4473.A4453_11, c15.getString(c15.getColumnIndex("A4453_11")));
                    params.put(A4401_A4473.A4453_12, c15.getString(c15.getColumnIndex("A4453_12")));
                    params.put(A4401_A4473.A4453_12_OT, c15.getString(c15.getColumnIndex("A4453_12_OT")));
                    params.put(A4401_A4473.A4453_code, c15.getString(c15.getColumnIndex("A4453_code")));
                    params.put(A4401_A4473.A4454, c15.getString(c15.getColumnIndex("A4454")));
                    params.put(A4401_A4473.A4455, c15.getString(c15.getColumnIndex("A4455")));
                    params.put(A4401_A4473.A4456, c15.getString(c15.getColumnIndex("A4456")));
                    params.put(A4401_A4473.A4457, c15.getString(c15.getColumnIndex("A4457")));
                    params.put(A4401_A4473.A4471, c15.getString(c15.getColumnIndex("A4471")));
                    params.put(A4401_A4473.A4472_1, c15.getString(c15.getColumnIndex("A4472_1")));
                    params.put(A4401_A4473.A4472_2, c15.getString(c15.getColumnIndex("A4472_2")));
                    params.put(A4401_A4473.A4472_3, c15.getString(c15.getColumnIndex("A4472_3")));
                    params.put(A4401_A4473.A4472_4, c15.getString(c15.getColumnIndex("A4472_4")));
                    params.put(A4401_A4473.A4472_5, c15.getString(c15.getColumnIndex("A4472_5")));
                    params.put(A4401_A4473.A4472_6, c15.getString(c15.getColumnIndex("A4472_6")));
                    params.put(A4401_A4473.A4472_7, c15.getString(c15.getColumnIndex("A4472_7")));
                    params.put(A4401_A4473.A4472_8, c15.getString(c15.getColumnIndex("A4472_8")));
                    params.put(A4401_A4473.A4472_9, c15.getString(c15.getColumnIndex("A4472_9")));
                    params.put(A4401_A4473.A4472_10, c15.getString(c15.getColumnIndex("A4472_10")));
                    params.put(A4401_A4473.A4472_11, c15.getString(c15.getColumnIndex("A4472_11")));
                    params.put(A4401_A4473.A4472_12, c15.getString(c15.getColumnIndex("A4472_12")));
                    params.put(A4401_A4473.A4472_DK, c15.getString(c15.getColumnIndex("A4472_DK")));
                    params.put(A4401_A4473.A4473, c15.getString(c15.getColumnIndex("A4473")));

                } else {

                    params.put(A4401_A4473.A4401, "-2");
                    params.put(A4401_A4473.A4402, "-2");
                    params.put(A4401_A4473.A4402_5_OT, "-2");
                    params.put(A4401_A4473.A4403_province, "-2");
                    params.put(A4401_A4473.A4403_district, "-2");
                    params.put(A4401_A4473.A4404_years, "-2");
                    params.put(A4401_A4473.A4405_hours, "-2");
                    params.put(A4401_A4473.A4405_minutes, "-2");
                    params.put(A4401_A4473.A4451_1, "-2");
                    params.put(A4401_A4473.A4451_2, "-2");
                    params.put(A4401_A4473.A4451_3, "-2");
                    params.put(A4401_A4473.A4451_4, "-2");
                    params.put(A4401_A4473.A4451_5, "-2");
                    params.put(A4401_A4473.A4451_6, "-2");
                    params.put(A4401_A4473.A4451_7, "-2");
                    params.put(A4401_A4473.A4451_8, "-2");
                    params.put(A4401_A4473.A4451_9, "-2");
                    params.put(A4401_A4473.A4451_10, "-2");
                    params.put(A4401_A4473.A4451_11, "-2");
                    params.put(A4401_A4473.A4451_12, "-2");
                    params.put(A4401_A4473.A4451_13, "-2");
                    params.put(A4401_A4473.A4451_13_OT, "-2");
                    params.put(A4401_A4473.A4451_code, "-2");
                    params.put(A4401_A4473.A4452_1, "-2");
                    params.put(A4401_A4473.A4452_2, "-2");
                    params.put(A4401_A4473.A4452_3, "-2");
                    params.put(A4401_A4473.A4452_4, "-2");
                    params.put(A4401_A4473.A4452_5, "-2");
                    params.put(A4401_A4473.A4452_6, "-2");
                    params.put(A4401_A4473.A4452_7, "-2");
                    params.put(A4401_A4473.A4452_8, "-2");
                    params.put(A4401_A4473.A4452_9, "-2");
                    params.put(A4401_A4473.A4452_9_OT, "-2");
                    params.put(A4401_A4473.A4452_code, "-2");
                    params.put(A4401_A4473.A4453_1, "-2");
                    params.put(A4401_A4473.A4453_2, "-2");
                    params.put(A4401_A4473.A4453_3, "-2");
                    params.put(A4401_A4473.A4453_4, "-2");
                    params.put(A4401_A4473.A4453_5, "-2");
                    params.put(A4401_A4473.A4453_6, "-2");
                    params.put(A4401_A4473.A4453_7, "-2");
                    params.put(A4401_A4473.A4453_8, "-2");
                    params.put(A4401_A4473.A4453_9, "-2");
                    params.put(A4401_A4473.A4453_10, "-2");
                    params.put(A4401_A4473.A4453_11, "-2");
                    params.put(A4401_A4473.A4453_12, "-2");
                    params.put(A4401_A4473.A4453_12_OT, "-2");
                    params.put(A4401_A4473.A4453_code, "-2");
                    params.put(A4401_A4473.A4454, "-2");
                    params.put(A4401_A4473.A4455, "-2");
                    params.put(A4401_A4473.A4456, "-2");
                    params.put(A4401_A4473.A4457, "-2");
                    params.put(A4401_A4473.A4471, "-2");
                    params.put(A4401_A4473.A4472_1, "-2");
                    params.put(A4401_A4473.A4472_2, "-2");
                    params.put(A4401_A4473.A4472_3, "-2");
                    params.put(A4401_A4473.A4472_4, "-2");
                    params.put(A4401_A4473.A4472_5, "-2");
                    params.put(A4401_A4473.A4472_6, "-2");
                    params.put(A4401_A4473.A4472_7, "-2");
                    params.put(A4401_A4473.A4472_8, "-2");
                    params.put(A4401_A4473.A4472_9, "-2");
                    params.put(A4401_A4473.A4472_10, "-2");
                    params.put(A4401_A4473.A4472_11, "-2");
                    params.put(A4401_A4473.A4472_12, "-2");
                    params.put(A4401_A4473.A4472_DK, "-2");
                    params.put(A4401_A4473.A4473, "-2");
                }

                if (c16.getCount() > 0) {

                    c16.moveToFirst();

                    for (int i = 0; i < c16.getCount(); i++) {

                        if (i == 0) {
                            try {

                                JSONObject round_one = new JSONObject();
                                String A4252_1_a, A4252_2_a, A4252_3_a, A4252_4_a;

                                A4252_1_a = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_a = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_a = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_a = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_one.put("A4252_1_a", A4252_1_a);
                                round_one.put("A4252_2_a", A4252_2_a);
                                round_one.put("A4252_3_a", A4252_3_a);
                                round_one.put("A4252_4_a", A4252_4_a);

                                params.put("round_one", String.valueOf(round_one));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 1) {
                            try {

                                JSONObject round_two = new JSONObject();
                                String A4252_1_b, A4252_2_b, A4252_3_b, A4252_4_b;

                                A4252_1_b = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_b = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_b = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_b = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_two.put("A4252_1_b", A4252_1_b);
                                round_two.put("A4252_2_b", A4252_2_b);
                                round_two.put("A4252_3_b", A4252_3_b);
                                round_two.put("A4252_4_b", A4252_4_b);

                                params.put("round_two", String.valueOf(round_two));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 2) {
                            try {

                                JSONObject round_three = new JSONObject();
                                String A4252_1_c, A4252_2_c, A4252_3_c, A4252_4_c;

                                A4252_1_c = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_c = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_c = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_c = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_three.put("A4252_1_c", A4252_1_c);
                                round_three.put("A4252_2_c", A4252_2_c);
                                round_three.put("A4252_3_c", A4252_3_c);
                                round_three.put("A4252_4_c", A4252_4_c);

                                params.put("round_three", String.valueOf(round_three));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 3) {
                            try {

                                JSONObject round_four = new JSONObject();
                                String A4252_1_d, A4252_2_d, A4252_3_d, A4252_4_d;

                                A4252_1_d = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_d = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_d = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_d = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_four.put("A4252_1_d", A4252_1_d);
                                round_four.put("A4252_2_d", A4252_2_d);
                                round_four.put("A4252_3_d", A4252_3_d);
                                round_four.put("A4252_4_d", A4252_4_d);

                                params.put("round_four", String.valueOf(round_four));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 4) {
                            try {

                                JSONObject round_five = new JSONObject();
                                String A4252_1_e, A4252_2_e, A4252_3_e, A4252_4_e;

                                A4252_1_e = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_e = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_e = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_e = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_five.put("A4252_1_e", A4252_1_e);
                                round_five.put("A4252_2_e", A4252_2_e);
                                round_five.put("A4252_3_e", A4252_3_e);
                                round_five.put("A4252_4_e", A4252_4_e);

                                params.put("round_five", String.valueOf(round_five));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 5) {
                            try {

                                JSONObject round_six = new JSONObject();
                                String A4252_1_f, A4252_2_f, A4252_3_f, A4252_4_f;

                                A4252_1_f = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_f = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_f = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_f = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_six.put("A4252_1_f", A4252_1_f);
                                round_six.put("A4252_2_f", A4252_2_f);
                                round_six.put("A4252_3_f", A4252_3_f);
                                round_six.put("A4252_4_f", A4252_4_f);

                                params.put("round_six", String.valueOf(round_six));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 6) {
                            try {

                                JSONObject round_seven = new JSONObject();
                                String A4252_1_g, A4252_2_g, A4252_3_g, A4252_4_g;

                                A4252_1_g = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_g = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_g = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_g = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_seven.put("A4252_1_g", A4252_1_g);
                                round_seven.put("A4252_2_g", A4252_2_g);
                                round_seven.put("A4252_3_g", A4252_3_g);
                                round_seven.put("A4252_4_g", A4252_4_g);

                                params.put("round_seven", String.valueOf(round_seven));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 7) {
                            try {

                                JSONObject round_eight = new JSONObject();
                                String A4252_1_h, A4252_2_h, A4252_3_h, A4252_4_h;

                                A4252_1_h = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_h = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_h = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_h = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_eight.put("A4252_1_h", A4252_1_h);
                                round_eight.put("A4252_2_h", A4252_2_h);
                                round_eight.put("A4252_3_h", A4252_3_h);
                                round_eight.put("A4252_4_h", A4252_4_h);

                                params.put("round_eight", String.valueOf(round_eight));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                        if (i == 8) {
                            try {

                                JSONObject round_nine = new JSONObject();
                                String A4252_1_i, A4252_2_i, A4252_3_i, A4252_4_i;

                                A4252_1_i = c16.getString(c16.getColumnIndex("A4252_1"));
                                A4252_2_i = c16.getString(c16.getColumnIndex("A4252_2"));
                                A4252_3_i = c16.getString(c16.getColumnIndex("A4252_3"));
                                A4252_4_i = c16.getString(c16.getColumnIndex("A4252_4"));

                                round_nine.put("A4252_1_i", A4252_1_i);
                                round_nine.put("A4252_2_i", A4252_2_i);
                                round_nine.put("A4252_3_i", A4252_3_i);
                                round_nine.put("A4252_4_i", A4252_4_i);

                                params.put("round_nine", String.valueOf(round_nine));
                                c16.moveToNext();

                            } catch (JSONException e) {

                                e.printStackTrace();

                            }
                        }

                    }
                }

                return params;
            }
        };

        myRequestQueue.add(sendMyRequest);
    }

}