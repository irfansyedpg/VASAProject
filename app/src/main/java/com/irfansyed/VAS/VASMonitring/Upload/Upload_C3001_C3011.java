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
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_C3001_C3011 extends AsyncTask {

    public static ProgressDialog dialog;
    Context mContext;
    HashMap<String, String> param;
    //    String[]                interviewLogData;
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

    public Upload_C3001_C3011(Context context) {

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
        String query = "select * from C3001_C3011 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {

            if (c.moveToFirst()) {

                param.put("tableName", "c3001_c3011");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(C3001_C3011.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(C3001_C3011.C3001, c.getString(c.getColumnIndex("C3001")));
                param.put(C3001_C3011.C3002, c.getString(c.getColumnIndex("C3002")));
                param.put(C3001_C3011.C3003, c.getString(c.getColumnIndex("C3003")));
                param.put(C3001_C3011.C3004, c.getString(c.getColumnIndex("C3004")));
                param.put(C3001_C3011.C3005u, c.getString(c.getColumnIndex("C3005u")));
                param.put(C3001_C3011.C3005d, c.getString(c.getColumnIndex("C3005d")));
                param.put(C3001_C3011.C3005w, c.getString(c.getColumnIndex("C3005w")));
                param.put(C3001_C3011.C3005m, c.getString(c.getColumnIndex("C3005m")));
                param.put(C3001_C3011.C3006, c.getString(c.getColumnIndex("C3006")));
                param.put(C3001_C3011.C3006_OT, c.getString(c.getColumnIndex("C3006_OT")));
                param.put(C3001_C3011.C3008, c.getString(c.getColumnIndex("C3008")));
                param.put(C3001_C3011.C3008_OT, c.getString(c.getColumnIndex("C3008_OT")));
                param.put(C3001_C3011.C3009_1, c.getString(c.getColumnIndex("C3009_1")));
                param.put(C3001_C3011.C3009_2, c.getString(c.getColumnIndex("C3009_2")));
                param.put(C3001_C3011.C3009_3, c.getString(c.getColumnIndex("C3009_3")));
                param.put(C3001_C3011.C3009_4, c.getString(c.getColumnIndex("C3009_4")));
                param.put(C3001_C3011.C3010, c.getString(c.getColumnIndex("C3010")));
                param.put(C3001_C3011.C3011, c.getString(c.getColumnIndex("C3011")));
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
            //  dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();

            //String result = (((String) o).replace("\"", ""));

            //Toast.makeText(mContext, "C3001 to C3011 is Uploaded", Toast.LENGTH_SHORT).show();

            new Upload_C3012_C3022(mContext).execute();

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
            Toast.makeText(mContext, "Uploading failed at request C3012_C3022 section", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}