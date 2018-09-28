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
import Global.C.C3301_C3314;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_C3301_C3314 extends AsyncTask {

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

    public Upload_C3301_C3314(Context context) {

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
        String query = "select * from C3301_C3314 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "c3301_c3314");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(C3001_C3011.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(C3301_C3314.C3301 ,c.getString(c.getColumnIndex("C3301")));
                param.put(C3301_C3314.C3302_1 ,c.getString(c.getColumnIndex("C3302_1")));
                param.put(C3301_C3314.C3302_2 ,c.getString(c.getColumnIndex("C3302_2")));
                param.put(C3301_C3314.C3302_3 ,c.getString(c.getColumnIndex("C3302_3")));
                param.put(C3301_C3314.C3302_4 ,c.getString(c.getColumnIndex("C3302_4")));
                param.put(C3301_C3314.C3302_5 ,c.getString(c.getColumnIndex("C3302_5")));
                param.put(C3301_C3314.C3302_6 ,c.getString(c.getColumnIndex("C3302_6")));
                param.put(C3301_C3314.C3302_7 ,c.getString(c.getColumnIndex("C3302_7")));
                param.put(C3301_C3314.C3303 ,c.getString(c.getColumnIndex("C3303")));
                param.put(C3301_C3314.C3304 ,c.getString(c.getColumnIndex("C3304")));
                param.put(C3301_C3314.C3305 ,c.getString(c.getColumnIndex("C3305")));
                param.put(C3301_C3314.C3306_1check ,c.getString(c.getColumnIndex("C3306_1ch")));
                param.put(C3301_C3314.C3306_1 ,c.getString(c.getColumnIndex("C3306_1")));
                param.put(C3301_C3314.C3306_2check ,c.getString(c.getColumnIndex("C3306_2ch")));
                param.put(C3301_C3314.C3306_2 ,c.getString(c.getColumnIndex("C3306_2")));
                param.put(C3301_C3314.C3307 ,c.getString(c.getColumnIndex("C3307")));
                param.put(C3301_C3314.C3308 ,c.getString(c.getColumnIndex("C3308")));
                param.put(C3301_C3314.C3309 ,c.getString(c.getColumnIndex("C3309")));
                param.put(C3301_C3314.C3310_1 ,c.getString(c.getColumnIndex("C3310_1")));
                param.put(C3301_C3314.C3310_2 ,c.getString(c.getColumnIndex("C3310_2")));
                param.put(C3301_C3314.C3310_3 ,c.getString(c.getColumnIndex("C3310_3")));
                param.put(C3301_C3314.C3310_4 ,c.getString(c.getColumnIndex("C3310_4")));
                param.put(C3301_C3314.C3310_5 ,c.getString(c.getColumnIndex("C3310_5")));
                param.put(C3301_C3314.C3310_6 ,c.getString(c.getColumnIndex("C3310_6")));
                param.put(C3301_C3314.C3310_7 ,c.getString(c.getColumnIndex("C3310_7")));
                param.put(C3301_C3314.C3310_8 ,c.getString(c.getColumnIndex("C3310_8")));
                param.put(C3301_C3314.C3310_9 ,c.getString(c.getColumnIndex("C3310_9")));
                param.put(C3301_C3314.C3310_10 ,c.getString(c.getColumnIndex("C3310_10")));
                param.put(C3301_C3314.C3310_11 ,c.getString(c.getColumnIndex("C3310_11")));
                param.put(C3301_C3314.C3311 ,c.getString(c.getColumnIndex("C3311")));
                param.put(C3301_C3314.C3312 ,c.getString(c.getColumnIndex("C3312")));
                param.put(C3301_C3314.C3313 ,c.getString(c.getColumnIndex("C3313")));
                param.put(C3301_C3314.C3314 ,c.getString(c.getColumnIndex("C3314")));
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
            //dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();

            String result = (((String) o).replace("\"", ""));

            //Toast.makeText(mContext, "C3001 to C3011 is Uploaded", Toast.LENGTH_SHORT).show();

            new Upload_C3351_C3364(mContext).execute();

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

    /*void update_status(String id) {
        String query = "Update C3001_C3011 set STATUS = '1' where id='" + id + "'";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(mContext);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(mContext, "Status updated", Toast.LENGTH_SHORT).show();
    }*/
}
