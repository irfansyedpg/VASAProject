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
import Global.C.C3401_C3457;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_C3401_C3457 extends AsyncTask {

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

    public Upload_C3401_C3457(Context context) {

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

        //region Query
        String query = "select * from C3401_C3457 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "c3401_C3457");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(C3001_C3011.study_id, c.getString(c.getColumnIndex("study_id")));


                param.put(C3401_C3457.C3401 , c.getString(c.getColumnIndex(" C3401")));
                param.put(C3401_C3457.C3402 , c.getString(c.getColumnIndex(" C3402")));
                param.put(C3401_C3457.C3403 , c.getString(c.getColumnIndex(" C3403")));
                param.put(C3401_C3457.C3404 , c.getString(c.getColumnIndex(" C3404")));
                param.put(C3401_C3457.C3405 , c.getString(c.getColumnIndex(" C3405")));
                param.put(C3401_C3457.C3406 , c.getString(c.getColumnIndex(" C3406")));
                param.put(C3401_C3457.C3407 , c.getString(c.getColumnIndex(" C3407")));
                param.put(C3401_C3457.C3408 , c.getString(c.getColumnIndex(" C3408")));
                param.put(C3401_C3457.C3409 , c.getString(c.getColumnIndex(" C3409")));
                param.put(C3401_C3457.C3410 , c.getString(c.getColumnIndex(" C3410")));
                param.put(C3401_C3457.C3411 , c.getString(c.getColumnIndex(" C3411")));
                param.put(C3401_C3457.C3412_L1 , c.getString(c.getColumnIndex(" C3412_L1")));
                param.put(C3401_C3457.C3412_L2 , c.getString(c.getColumnIndex(" C3412_L2")));
                param.put(C3401_C3457.C3413 , c.getString(c.getColumnIndex(" C3413")));
                param.put(C3401_C3457.C3414_1 , c.getString(c.getColumnIndex(" C3414_1")));
                param.put(C3401_C3457.C3414_2 , c.getString(c.getColumnIndex(" C3414_2")));
                param.put(C3401_C3457.C3451_1 , c.getString(c.getColumnIndex(" C3451_1")));
                param.put(C3401_C3457.C3451_2 , c.getString(c.getColumnIndex(" C3451_2")));
                param.put(C3401_C3457.C3451_3 , c.getString(c.getColumnIndex(" C3451_3")));
                param.put(C3401_C3457.C3451_4 , c.getString(c.getColumnIndex(" C3451_4")));
                param.put(C3401_C3457.C3451_5 , c.getString(c.getColumnIndex(" C3451_5")));
                param.put(C3401_C3457.C3451_6 , c.getString(c.getColumnIndex(" C3451_6")));
                param.put(C3401_C3457.C3451_7 , c.getString(c.getColumnIndex(" C3451_7")));
                param.put(C3401_C3457.C3451_8 , c.getString(c.getColumnIndex(" C3451_8")));
                param.put(C3401_C3457.C3451_9 , c.getString(c.getColumnIndex(" C3451_9")));
                param.put(C3401_C3457.C3451_10 , c.getString(c.getColumnIndex(" C3451_10")));
                param.put(C3401_C3457.C3451_11 , c.getString(c.getColumnIndex(" C3451_11")));
                param.put(C3401_C3457.C3451_12 , c.getString(c.getColumnIndex(" C3451_12")));
                param.put(C3401_C3457.C3451_13 , c.getString(c.getColumnIndex(" C3451_13")));
                param.put(C3401_C3457.C3451_13_OT , c.getString(c.getColumnIndex(" C3451_13_OT")));
                param.put(C3401_C3457.C3452_1 , c.getString(c.getColumnIndex(" C3452_1")));
                param.put(C3401_C3457.C3452_2 , c.getString(c.getColumnIndex(" C3452_2")));
                param.put(C3401_C3457.C3452_3 , c.getString(c.getColumnIndex(" C3452_3")));
                param.put(C3401_C3457.C3452_4 , c.getString(c.getColumnIndex(" C3452_4")));
                param.put(C3401_C3457.C3452_5 , c.getString(c.getColumnIndex(" C3452_5")));
                param.put(C3401_C3457.C3452_6 , c.getString(c.getColumnIndex(" C3452_6")));
                param.put(C3401_C3457.C3452_7 , c.getString(c.getColumnIndex(" C3452_7")));
                param.put(C3401_C3457.C3452_8 , c.getString(c.getColumnIndex(" C3452_8")));
                param.put(C3401_C3457.C3452_9 , c.getString(c.getColumnIndex(" C3452_9")));
                param.put(C3401_C3457.C3452_9_OT , c.getString(c.getColumnIndex(" C3452_9_OT")));
                param.put(C3401_C3457.C3453_1 , c.getString(c.getColumnIndex(" C3453_1")));
                param.put(C3401_C3457.C3453_2 , c.getString(c.getColumnIndex(" C3453_2")));
                param.put(C3401_C3457.C3453_3 , c.getString(c.getColumnIndex(" C3453_3")));
                param.put(C3401_C3457.C3453_4 , c.getString(c.getColumnIndex(" C3453_4")));
                param.put(C3401_C3457.C3453_5 , c.getString(c.getColumnIndex(" C3453_5")));
                param.put(C3401_C3457.C3453_6 , c.getString(c.getColumnIndex(" C3453_6")));
                param.put(C3401_C3457.C3453_7 , c.getString(c.getColumnIndex(" C3453_7")));
                param.put(C3401_C3457.C3453_8 , c.getString(c.getColumnIndex(" C3453_8")));
                param.put(C3401_C3457.C3453_9 , c.getString(c.getColumnIndex(" C3453_9")));
                param.put(C3401_C3457.C3453_10 , c.getString(c.getColumnIndex(" C3453_10")));
                param.put(C3401_C3457.C3453_11 , c.getString(c.getColumnIndex(" C3453_11")));
                param.put(C3401_C3457.C3453_12 , c.getString(c.getColumnIndex(" C3453_12")));
                param.put(C3401_C3457.C3453_12_OT , c.getString(c.getColumnIndex(" C3453_12_OT")));
                param.put(C3401_C3457.C3454 , c.getString(c.getColumnIndex(" C3454")));
                param.put(C3401_C3457.C3455 , c.getString(c.getColumnIndex(" C3455")));
                param.put(C3401_C3457.C3456 , c.getString(c.getColumnIndex(" C3456")));
                param.put(C3401_C3457.C3457 , c.getString(c.getColumnIndex(" C3457")));



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

            Toast.makeText(mContext, "C3001 to C3011 is Uploaded", Toast.LENGTH_SHORT).show();

            //new Upload_C3401_C3457(mContext).execute();

            thread.start();
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
