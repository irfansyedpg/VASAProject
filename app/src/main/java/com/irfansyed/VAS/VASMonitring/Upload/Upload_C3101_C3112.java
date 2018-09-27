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

import Global.C.C3001_C3011;
import Global.C.C3101_C3112;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_C3101_C3112 extends AsyncTask {

    public static ProgressDialog dialog;
    Context mContext;
    HashMap<String, String> param;
    String[]                interviewLogData;
    String                  mUserMsg;
    // wait for Toast then kill app
    Thread thread = new Thread() {
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

    public Upload_C3101_C3112(Context context) {

        //stop interview
        // if(InterviewUploadingStatus.status<2)
        //   this.cancel(false);

        mContext = context;
        dialog = new ProgressDialog(context);
        param = new HashMap<>();

    }

    @Override
    protected void onPreExecute() {

        //dialog.setMessage("Uploading interview Please wait ....");
        //dialog.setCancelable(false);
        //dialog.show();

        //region Query
        String query = "select * from C3101_C3112 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "c3101_c3112");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(C3001_C3011.study_id, c.getString(c.getColumnIndex("study_id")));


                        param.put(C3101_C3112.C3101 , c.getString(c.getColumnIndex("C3101")));
                        param.put(C3101_C3112.C3102 , c.getString(c.getColumnIndex("C3102")));
                        param.put(C3101_C3112.C3103 , c.getString(c.getColumnIndex("C3103")));
                        param.put(C3101_C3112.C3104 , c.getString(c.getColumnIndex("C3104")));
                        param.put(C3101_C3112.C3105 , c.getString(c.getColumnIndex("C3105")));
                        param.put(C3101_C3112.C3105_OT , c.getString(c.getColumnIndex("C3105_OT")));
                        param.put(C3101_C3112.C3106 , c.getString(c.getColumnIndex("C3106")));
                        param.put(C3101_C3112.C3107_1 , c.getString(c.getColumnIndex("C3107_1")));
                        param.put(C3101_C3112.C3107_2 , c.getString(c.getColumnIndex("C3107_2")));
                        param.put(C3101_C3112.C3107_3 , c.getString(c.getColumnIndex("C3107_3")));
                        param.put(C3101_C3112.C3107_4 , c.getString(c.getColumnIndex("C3107_4")));
                        param.put(C3101_C3112.C3107_5 , c.getString(c.getColumnIndex("C3107_5")));
                        param.put(C3101_C3112.C3107_6 , c.getString(c.getColumnIndex("C3107_6")));
                        param.put(C3101_C3112.C3107_6_OT , c.getString(c.getColumnIndex("C3107_6_")));
                        param.put(C3101_C3112.C3107_7 , c.getString(c.getColumnIndex("C3107_7")));
                        param.put(C3101_C3112.C3107_8 , c.getString(c.getColumnIndex("C3107_8")));
                        param.put(C3101_C3112.C3107_9 , c.getString(c.getColumnIndex("C3107_9")));
                        param.put(C3101_C3112.C3107_10 , c.getString(c.getColumnIndex("C3107_10")));
                        param.put(C3101_C3112.C3107_11 , c.getString(c.getColumnIndex("C3107_11")));
                        param.put(C3101_C3112.C3107_12 , c.getString(c.getColumnIndex("C3107_12")));
                        param.put(C3101_C3112.C3107_13 , c.getString(c.getColumnIndex("C3107_13")));
                        param.put(C3101_C3112.C3107_14 , c.getString(c.getColumnIndex("C3107_14")));
                        param.put(C3101_C3112.C3107_15 , c.getString(c.getColumnIndex("C3107_15")));
                        param.put(C3101_C3112.C3107_16 , c.getString(c.getColumnIndex("C3107_16")));
                        param.put(C3101_C3112.C3107_17 , c.getString(c.getColumnIndex("C3107_17")));
                        param.put(C3101_C3112.C3107_18 , c.getString(c.getColumnIndex("C3107_18")));
                        param.put(C3101_C3112.C3107_19 , c.getString(c.getColumnIndex("C3107_19")));
                        param.put(C3101_C3112.C3107_20 , c.getString(c.getColumnIndex("C3107_20")));
                        param.put(C3101_C3112.C3107_21 , c.getString(c.getColumnIndex("C3107_21")));
                        param.put(C3101_C3112.C3107_21_OT , c.getString(c.getColumnIndex("C3107_21")));
                        param.put(C3101_C3112.C3108 , c.getString(c.getColumnIndex("C3108")));
                        param.put(C3101_C3112.C3109_1 , c.getString(c.getColumnIndex("C3109_1")));
                        param.put(C3101_C3112.C3109_2 , c.getString(c.getColumnIndex("C3109_2")));
                        param.put(C3101_C3112.C3109_3 , c.getString(c.getColumnIndex("C3109_3")));
                        param.put(C3101_C3112.C3109_4 , c.getString(c.getColumnIndex("C3109_4")));
                        param.put(C3101_C3112.C3109_5 , c.getString(c.getColumnIndex("C3109_5")));
                        param.put(C3101_C3112.C3109_6 , c.getString(c.getColumnIndex("C3109_6")));
                        param.put(C3101_C3112.C3109_7 , c.getString(c.getColumnIndex("C3109_7")));
                        param.put(C3101_C3112.C3109_8 , c.getString(c.getColumnIndex("C3109_8")));
                        param.put(C3101_C3112.C3109_9 , c.getString(c.getColumnIndex("C3109_9")));
                        param.put(C3101_C3112.C3109_10 , c.getString(c.getColumnIndex("C3109_10")));
                        param.put(C3101_C3112.C3109_11 , c.getString(c.getColumnIndex("C3109_11")));
                        param.put(C3101_C3112.C3109_12 , c.getString(c.getColumnIndex("C3109_12")));
                        param.put(C3101_C3112.C3109_13 , c.getString(c.getColumnIndex("C3109_13")));
                        param.put(C3101_C3112.C3109_14 , c.getString(c.getColumnIndex("C3109_14")));
                        param.put(C3101_C3112.C3110 , c.getString(c.getColumnIndex("C3110")));
                        param.put(C3101_C3112.C3111 , c.getString(c.getColumnIndex("C3111")));
                        param.put(C3101_C3112.C3111_1 , c.getString(c.getColumnIndex("C3111_1")));
                        param.put(C3101_C3112.C3111_2 , c.getString(c.getColumnIndex("C3111_2")));
                        param.put(C3101_C3112.C3111_3 , c.getString(c.getColumnIndex("C3111_3")));
                        param.put(C3101_C3112.C3111_4 , c.getString(c.getColumnIndex("C3111_4")));
                        param.put(C3101_C3112.C3111_5 , c.getString(c.getColumnIndex("C3111_5")));
                        param.put(C3101_C3112.C3111_6 , c.getString(c.getColumnIndex("C3111_6")));
                        param.put(C3101_C3112.C3111_7 , c.getString(c.getColumnIndex("C3111_7")));
                        param.put(C3101_C3112.C3111_8 , c.getString(c.getColumnIndex("C3111_8")));
                        param.put(C3101_C3112.C3111_9 , c.getString(c.getColumnIndex("C3111_9")));
                        param.put(C3101_C3112.C3112 , c.getString(c.getColumnIndex("C3112")));

            }
        }


        //endregion
        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        String urlString = new MyPreferences(mContext).getReq1();

        URL url;
        HttpURLConnection connection;

        try {
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            // connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000);

            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));

            bw.write(PostRequestData.getData(param));
            bw.flush();


            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String st = "", line;
                while ((line = br.readLine()) != null) {
                    st = st + line;
                }
                return st;
            } else {
                mUserMsg = "Server Couldn't process the request";
            }
        } catch (MalformedURLException e) {
            Toast.makeText(mContext, e.toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {


            mUserMsg = "Please make sure that Internet connection is available," +
                    " and server IP is inserted in settings";
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {

        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();

            String result = (((String) o).replace("\"", ""));

            //Toast.makeText(mContext, "C3001 to C3011 is Uploaded", Toast.LENGTH_SHORT).show();

            new Upload_C3121_C3228(mContext).execute();

            //thread.start();
        } catch (IOException e) {
            //if connection was available via connecting but
            //we can't get data from server..
            if (mUserMsg == null)
                mUserMsg = "Please check connection";
            dialog.dismiss();
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
            mUserMsg = e.getMessage();
            dialog.dismiss();
        } catch (Exception e) {
            Toast.makeText(mContext, "Uploading failed at request a4001_a4014 section", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
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
}
