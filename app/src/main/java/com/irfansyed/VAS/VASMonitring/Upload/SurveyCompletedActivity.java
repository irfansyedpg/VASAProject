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

import Global.C.C3001_C3011;
import Global.C.C3012_C3022;
import Global.C.C3051_C3099;
import Global.C.C3101_C3112;
import Global.C.C3121_C3228;
import Global.C.C3251_C3288_A_C;
import Global.C.C3251_C3288_B;
import Global.C.C3301_C3314;
import Global.C.C3351_C3364;
import Global.C.C3401_C3457;
import Global.C.C3471_C3472;
import Global.GS.Q1101_Q1610;
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
                        Q1101_Q1610.interviewType_upload = parseInt(arrr[1]);


                        //new Upload_Q1101_Q1610(mContext).execute();

                        uploadQ1101_Q1610(Q1101_Q1610.study_id_upload);
                        //uploadC3001_C3011(Q1101_Q1610.study_id_upload);

                        //Toast.makeText(mContext, "All is well", Toast.LENGTH_LONG).show();

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


    public void uploadQ1101_Q1610(final String study_id) {

        final RequestQueue myRequestQueue = Volley.newRequestQueue(mContext);

        StringRequest sendMyRequest = new StringRequest(Request.Method.POST, Constants.ROOT_URL,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(mContext, response, Toast.LENGTH_LONG).show();

                        myRequestQueue.getCache().clear();

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

                if (c != null) {

                    if (c.moveToFirst()) {

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
                }

                if (c2 != null) {

                    if (c2.moveToFirst()) {

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

                        params.put(C3001_C3011.C3001, "-1");
                        params.put(C3001_C3011.C3002, "-1");
                        params.put(C3001_C3011.C3003, "-1");
                        params.put(C3001_C3011.C3004, "-1");
                        params.put(C3001_C3011.C3005u, "-1");
                        params.put(C3001_C3011.C3005d, "-1");
                        params.put(C3001_C3011.C3005w, "-1");
                        params.put(C3001_C3011.C3005m, "-1");
                        params.put(C3001_C3011.C3006, "-1");
                        params.put(C3001_C3011.C3006_OT, "-1");
                        params.put(C3001_C3011.C3008, "-1");
                        params.put(C3001_C3011.C3008_OT, "-1");
                        params.put(C3001_C3011.C3009_1, "-1");
                        params.put(C3001_C3011.C3009_2, "-1");
                        params.put(C3001_C3011.C3009_3, "-1");
                        params.put(C3001_C3011.C3009_4, "-1");
                        params.put(C3001_C3011.C3010, "-1");
                        params.put(C3001_C3011.C3011, "-1");
                    }
                }

                if (c3 != null) {

                    if (c3.moveToFirst()) {

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
                }

                if (c4 != null) {

                    if (c4.moveToFirst()) {

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
                    }
                }


                if (c5 != null) {

                    if (c5.moveToFirst()) {

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
                }


                if (c6 != null) {

                    if (c6.moveToFirst()) {

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
                }

                if (c7 != null) {

                    if (c7.moveToFirst()) {

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
                }

                if (c8 != null) {

                    if (c8.moveToFirst()) {

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
                }

                if (c9 != null) {

                    if (c9.moveToFirst()) {

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
                }

                if (c10 != null) {

                    if (c10.moveToFirst()) {

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
                }

                if (c11 != null) {

                    if (c11.moveToFirst()) {

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
                }


                if (c12 != null) {

                    if (c12.moveToFirst()) {

                        params.put(C3251_C3288_B.sub_C3251_C3288_B.C3253, c12.getString(c12.getColumnIndex("C3253")));
                        params.put(C3251_C3288_B.sub_C3251_C3288_B.C3253_1, c12.getString(c12.getColumnIndex("C3253_1")));
                        params.put(C3251_C3288_B.sub_C3251_C3288_B.C3253_2A, c12.getString(c12.getColumnIndex("C3253_2A")));
                        params.put(C3251_C3288_B.sub_C3251_C3288_B.C3253_4, c12.getString(c12.getColumnIndex("C3253_4")));
                        params.put(C3251_C3288_B.sub_C3251_C3288_B.ACT_COUNT, c12.getString(c12.getColumnIndex("ACT_COUNT")));
                        params.put(C3251_C3288_B.sub_C3251_C3288_B.ACT_ID_FK, c12.getString(c12.getColumnIndex("ACT_ID_FK")));
                    }
                }

                return params;
            }
        };

        myRequestQueue.add(sendMyRequest);
    }
}