package com.irfansyed.VAS.VASMonitring.Upload;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import Global.A.A4251_A4284;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4251_A4284 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4251_A4284(Context context) {

        //stop interview
       // if(InterviewUploadingStatus.status<2)
         //   this.cancel(false);

        mContext = context;
        dialog = new ProgressDialog(context);
        param = new HashMap<>();

    }

    @Override
    protected void onPreExecute() {

        dialog.setMessage("Uploading interview Please wait ....");
        dialog.setCancelable(false);
        dialog.show();

        HashMap<String, List<String>> map = QuestionModel.quest.get("a");

        //region Query
        String query = "select * from A4251_A4284 where study_id = '%s' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);

        if (c != null) {
            if (c.moveToFirst()) {
                param.put("tableName", "A4251_A4284");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(A4251_A4284.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(A4251_A4284.A4251, c.getString(c.getColumnIndex("A4251")));
                param.put(A4251_A4284.A4253, c.getString(c.getColumnIndex("A4253")));
                param.put(A4251_A4284.A4253_3, c.getString(c.getColumnIndex("A4253_3")));
                param.put(A4251_A4284.A4254_1, c.getString(c.getColumnIndex("A4254_1")));
                param.put(A4251_A4284.A4254_2, c.getString(c.getColumnIndex("A4254_2")));
                param.put(A4251_A4284.A4255_1, c.getString(c.getColumnIndex("A4255_1")));
                param.put(A4251_A4284.A4255_2, c.getString(c.getColumnIndex("A4255_2")));
                param.put(A4251_A4284.A4255_3, c.getString(c.getColumnIndex("A4255_3")));
                param.put(A4251_A4284.A4255_4, c.getString(c.getColumnIndex("A4255_4")));
                param.put(A4251_A4284.A4255_4_OT, c.getString(c.getColumnIndex("A4255_4_OT")));
                param.put(A4251_A4284.A4255_5, c.getString(c.getColumnIndex("A4255_5")));
                param.put(A4251_A4284.A4255_6, c.getString(c.getColumnIndex("A4255_6")));
                param.put(A4251_A4284.A4255_7, c.getString(c.getColumnIndex("A4255_7")));
                param.put(A4251_A4284.A4255_8, c.getString(c.getColumnIndex("A4255_8")));
                param.put(A4251_A4284.A4255_9, c.getString(c.getColumnIndex("A4255_9")));
                param.put(A4251_A4284.A4255_10, c.getString(c.getColumnIndex("A4255_10")));
                param.put(A4251_A4284.A4255_11, c.getString(c.getColumnIndex("A4255_11")));
                param.put(A4251_A4284.A4255_12, c.getString(c.getColumnIndex("A4255_12")));
                param.put(A4251_A4284.A4255_13, c.getString(c.getColumnIndex("A4255_13")));
                param.put(A4251_A4284.A4255_13_OT, c.getString(c.getColumnIndex("A4255_13_OT")));
                param.put(A4251_A4284.A4255_DK, c.getString(c.getColumnIndex("A4255_DK")));
                param.put(A4251_A4284.A4256_days, c.getString(c.getColumnIndex("A4256_days")));
                param.put(A4251_A4284.A4256_hours, c.getString(c.getColumnIndex("A4256_hours")));
                param.put(A4251_A4284.A4256_minutes, c.getString(c.getColumnIndex("A4256_minutes")));
                param.put(A4251_A4284.A4257, c.getString(c.getColumnIndex("A4257")));
                param.put(A4251_A4284.A4257_name, c.getString(c.getColumnIndex("A4257_name")));
                param.put(A4251_A4284.A4258_1, c.getString(c.getColumnIndex("A4258_1")));
                param.put(A4251_A4284.A4258_2, c.getString(c.getColumnIndex("A4258_2")));
                param.put(A4251_A4284.A4259_hours, c.getString(c.getColumnIndex("A4259_hours")));
                param.put(A4251_A4284.A4259_minutes, c.getString(c.getColumnIndex("A4259_minutes")));
                param.put(A4251_A4284.A4260, c.getString(c.getColumnIndex("A4260")));
                param.put(A4251_A4284.A4261, c.getString(c.getColumnIndex("A4261")));
                param.put(A4251_A4284.A4262, c.getString(c.getColumnIndex("A4262")));
                param.put(A4251_A4284.A4262_name, c.getString(c.getColumnIndex("A4262_name")));
                param.put(A4251_A4284.A4263_1, c.getString(c.getColumnIndex("A4263_1")));
                param.put(A4251_A4284.A4263_2, c.getString(c.getColumnIndex("A4263_2")));
                param.put(A4251_A4284.A4264, c.getString(c.getColumnIndex("A4264")));
                param.put(A4251_A4284.A4266, c.getString(c.getColumnIndex("A4266")));
                param.put(A4251_A4284.A4266_name, c.getString(c.getColumnIndex("A4266_name")));
                param.put(A4251_A4284.A4267_1, c.getString(c.getColumnIndex("A4267_1")));
                param.put(A4251_A4284.A4267_2, c.getString(c.getColumnIndex("A4267_2")));
                param.put(A4251_A4284.A4268_hours, c.getString(c.getColumnIndex("A4268_hours")));
                param.put(A4251_A4284.A4268_minutes, c.getString(c.getColumnIndex("A4268_minutes")));
                param.put(A4251_A4284.A4269, c.getString(c.getColumnIndex("A4269")));
                param.put(A4251_A4284.A4270, c.getString(c.getColumnIndex("A4270")));
                param.put(A4251_A4284.A4271, c.getString(c.getColumnIndex("A4271")));
                param.put(A4251_A4284.A4271_name, c.getString(c.getColumnIndex("A4271_name")));
                param.put(A4251_A4284.A4272_1, c.getString(c.getColumnIndex("A4272_1")));
                param.put(A4251_A4284.A4272_2, c.getString(c.getColumnIndex("A4272_2")));
                param.put(A4251_A4284.A4273, c.getString(c.getColumnIndex("A4273")));
                param.put(A4251_A4284.A4274, c.getString(c.getColumnIndex("A4274")));
                param.put(A4251_A4284.A4275, c.getString(c.getColumnIndex("A4275")));
                param.put(A4251_A4284.A4276_1, c.getString(c.getColumnIndex("A4276_1")));
                param.put(A4251_A4284.A4276_2, c.getString(c.getColumnIndex("A4276_2")));
                param.put(A4251_A4284.A4276_3, c.getString(c.getColumnIndex("A4276_3")));
                param.put(A4251_A4284.A4276_4, c.getString(c.getColumnIndex("A4276_4")));
                param.put(A4251_A4284.A4276_5, c.getString(c.getColumnIndex("A4276_5")));
                param.put(A4251_A4284.A4276_5_OT, c.getString(c.getColumnIndex("A4276_5_OT")));
                param.put(A4251_A4284.A4276_6, c.getString(c.getColumnIndex("A4276_6")));
                param.put(A4251_A4284.A4276_7, c.getString(c.getColumnIndex("A4276_7")));
                param.put(A4251_A4284.A4276_8, c.getString(c.getColumnIndex("A4276_8")));
                param.put(A4251_A4284.A4276_9, c.getString(c.getColumnIndex("A4276_9")));
                param.put(A4251_A4284.A4276_10, c.getString(c.getColumnIndex("A4276_10")));
                param.put(A4251_A4284.A4276_11, c.getString(c.getColumnIndex("A4276_11")));
                param.put(A4251_A4284.A4276_12, c.getString(c.getColumnIndex("A4276_12")));
                param.put(A4251_A4284.A4276_13, c.getString(c.getColumnIndex("A4276_13")));
                param.put(A4251_A4284.A4276_14, c.getString(c.getColumnIndex("A4276_14")));
                param.put(A4251_A4284.A4276_15, c.getString(c.getColumnIndex("A4276_15")));
                param.put(A4251_A4284.A4276_16, c.getString(c.getColumnIndex("A4276_16")));
                param.put(A4251_A4284.A4276_16_OT, c.getString(c.getColumnIndex("A4276_16_OT")));
                param.put(A4251_A4284.A4276_DK, c.getString(c.getColumnIndex("A4276_DK")));
                param.put(A4251_A4284.A4277, c.getString(c.getColumnIndex("A4277")));
                param.put(A4251_A4284.A4278_1, c.getString(c.getColumnIndex("A4278_1")));
                param.put(A4251_A4284.A4278_2, c.getString(c.getColumnIndex("A4278_2")));
                param.put(A4251_A4284.A4278_3, c.getString(c.getColumnIndex("A4278_3")));
                param.put(A4251_A4284.A4278_4, c.getString(c.getColumnIndex("A4278_4")));
                param.put(A4251_A4284.A4278_5, c.getString(c.getColumnIndex("A4278_5")));
                param.put(A4251_A4284.A4278_6, c.getString(c.getColumnIndex("A4278_6")));
                param.put(A4251_A4284.A4278_7, c.getString(c.getColumnIndex("A4278_7")));
                param.put(A4251_A4284.A4278_DK, c.getString(c.getColumnIndex("A4278_DK")));
                param.put(A4251_A4284.A4279_1, c.getString(c.getColumnIndex("A4279_1")));
                param.put(A4251_A4284.A4279_2, c.getString(c.getColumnIndex("A4279_2")));
                param.put(A4251_A4284.A4279_3, c.getString(c.getColumnIndex("A4279_3")));
                param.put(A4251_A4284.A4279_4, c.getString(c.getColumnIndex("A4279_4")));
                param.put(A4251_A4284.A4279_5, c.getString(c.getColumnIndex("A4279_5")));
                param.put(A4251_A4284.A4279_6, c.getString(c.getColumnIndex("A4279_6")));
                param.put(A4251_A4284.A4279_7, c.getString(c.getColumnIndex("A4279_7")));
                param.put(A4251_A4284.A4279_DK, c.getString(c.getColumnIndex("A4279_DK")));
                param.put(A4251_A4284.A4280, c.getString(c.getColumnIndex("A4280")));
                param.put(A4251_A4284.A4281, c.getString(c.getColumnIndex("A4281")));
                param.put(A4251_A4284.A4282, c.getString(c.getColumnIndex("A4282")));
                param.put(A4251_A4284.A4283, c.getString(c.getColumnIndex("A4283")));
                param.put(A4251_A4284.A4284, c.getString(c.getColumnIndex("A4284")));
                param.put(A4251_A4284.STATUS, c.getString(c.getColumnIndex("STATUS")));

            }
        }

        //endregion
        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] objects)
    {

        String urlString = new MyPreferences(mContext).getReq1();

        URL url;
        HttpURLConnection connection;

        try
        {
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
           // connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000);

           OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

            bw.write(PostRequestData.getData(param));
            bw.flush();


            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String st ="", line;
                while ((line = br.readLine()) != null) {
                    st = st + line;
                }
                return st;
            }
            else
            {
                mUserMsg ="Server Couldn't process the request";
            }
        }
        catch (MalformedURLException e) {
            Toast.makeText(mContext,e.toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {


            mUserMsg ="Please make sure that Internet connection is available," +
                 " and server IP is inserted in settings";
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {

        try {
            dialog.dismiss();

          if(mUserMsg != null)
                throw  new IOException();



            //int houseId = Integer.parseInt(((String) o).replace("\"",""));

            String result=(((String) o).replace("\"",""));


            Toast.makeText(mContext, "A4251_A4284 section Uploaded", Toast.LENGTH_SHORT).show();
            // new LocalDataManager(mContext).uploadInterview();

            // LogtableUpdates.UpdateLogStatusUpload(mContext,Validation.hfauploadid);

            //update_status(param.get("id"));
            thread.start();
        }

        catch (IOException e) {
            //if connection was available via connecting but
            //we can't get data from server..
            if(mUserMsg == null)
                mUserMsg ="Please check connection";
            dialog.dismiss();
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
            mUserMsg = e.getMessage();
            dialog.dismiss();
        }

        catch (Exception e) {
            Toast.makeText(mContext,"Uploading failed at request A4251_A4284 section", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        }
        finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }


    void update_status(String id) {
        String query = "Update C3001_C3011 set STATUS = '1' where id='" + id + "'";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(mContext);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(mContext, "Status updated", Toast.LENGTH_SHORT).show();
    }

   // wait for Toast then kill app
    Thread thread = new Thread(){
        @Override
        public void run() {
            try {
                Thread.sleep(800); // As I am using LENGTH_LONG in Toast
                // Your_Activity.this.finish();


                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                // getActivity().finish();


                System.exit(0);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
}
