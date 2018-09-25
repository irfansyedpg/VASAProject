package com.irfansyed.VAS.VASMonitring.Upload;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.irfansyed.VAS.VASMonitring.R;

import java.util.Collections;
import java.util.List;

import Global.GS.Q1101_Q1610;
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

                        Q1101_Q1610.study_id_upload      = arrr[0];
                        Q1101_Q1610.interviewType_upload = parseInt(arrr[1]);


                        new Upload_Q1101_Q1610(mContext).execute();

                        //    new UploadSectionEAsync(mContext, "3").execute(); // irfan


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


}