package com.irfansyed.VAS.VASMonitring.Pending;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.irfansyed.VAS.VASMonitring.C.C3001_C3011;
import com.irfansyed.VAS.VASMonitring.C.C3012_C3022;
import com.irfansyed.VAS.VASMonitring.C.C3051_C3099;
import com.irfansyed.VAS.VASMonitring.C.C3101_C3112;
import com.irfansyed.VAS.VASMonitring.C.C3121_C3228;
import com.irfansyed.VAS.VASMonitring.C.C3251_C3288_A;
import com.irfansyed.VAS.VASMonitring.C.C3251_C3288_B;
import com.irfansyed.VAS.VASMonitring.C.C3251_C3288_C;
import com.irfansyed.VAS.VASMonitring.C.C3301_C3314;
import com.irfansyed.VAS.VASMonitring.C.C3351_C3364;
import com.irfansyed.VAS.VASMonitring.C.C3401_C3457;
import com.irfansyed.VAS.VASMonitring.C.C3471_C3472;
import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.RP.w204_w222;

import java.util.Collections;
import java.util.List;

import data.LocalDataManager;


public class SurveyPendingActivity extends AppCompatActivity {

    RecyclerView               mRecyclerView;
    RecyclerView.Adapter       mAdapter;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pending_interviews);

        List<String> list = new LocalDataManager(this).getLogListPending("0");


        if (list == null)
            return;

        Collections.sort(list);

        mRecyclerView = findViewById(R.id.list_survey_completed);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new SurveyPendingCustomAdapter(this, list);
        mRecyclerView.setAdapter(mAdapter);
    }
}


class SurveyPendingCustomAdapter extends RecyclerView.Adapter {

    Context      mContext;
    List<String> mList;

    public SurveyPendingCustomAdapter(Context context, List<String> list) {
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
                b.setTitle("Restart Interview");
                b.setMessage("Do you want to restart this interview");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String memberId = vh.textName.getText().toString();


                        String[] arrr = memberId.split("/");

                        String study_id = arrr[0];
                        int curentSection = Integer.valueOf(arrr[1]);
                        int interviewType = Integer.valueOf(arrr[2]);

                        //here call activity
                        Intent  intent = null;
                        if(interviewType == 2){

                            if(curentSection == 2){

                                intent= new Intent(mContext, C3001_C3011.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 3){

                                intent= new Intent(mContext, C3012_C3022.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 4){

                                intent= new Intent(mContext, C3051_C3099.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 5){

                                intent= new Intent(mContext, C3101_C3112.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 6){

                                intent= new Intent(mContext, C3121_C3228.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 7){

                                intent= new Intent(mContext, C3251_C3288_A.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 8){

                                intent= new Intent(mContext, C3251_C3288_B.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 9){

                                intent= new Intent(mContext, C3251_C3288_C.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 10){

                                intent= new Intent(mContext, C3301_C3314.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                            if(curentSection == 11){

                                intent= new Intent(mContext, C3351_C3364.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 12){

                                intent= new Intent(mContext, C3401_C3457.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 13){

                                intent= new Intent(mContext, C3471_C3472.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }

                            if(curentSection == 20){

                                intent= new Intent(mContext, w204_w222.class);
                                intent.putExtra("study_id", study_id);
                                mContext.startActivity(intent);
                            }
                        }
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        // Intent intent = null;

                      //    intent = new Intent(this, SurveyPendingActivity.class);
                    }
                }).show();
            }
        });
    }


    /*void fun_language() {

        final MyPreferences preferences = new MyPreferences(mContext);

        String lang = preferences.getlanguage();

        //create a string for country
        String country = preferences.getcountry();

        Locale locale = new Locale(lang, country);

        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        mContext.getResources().updateConfiguration(config,
                mContext.getResources().getDisplayMetrics());​
    }*/


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


}