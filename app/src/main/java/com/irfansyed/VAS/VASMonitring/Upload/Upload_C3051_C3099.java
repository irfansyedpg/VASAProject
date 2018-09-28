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
import Global.C.C3051_C3099;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_C3051_C3099 extends AsyncTask {

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

    public Upload_C3051_C3099(Context context) {

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
        String query = "select * from C3051_C3099 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "c3051_c3099");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(C3001_C3011.study_id, c.getString(c.getColumnIndex("study_id")));


                param.put(C3051_C3099.C3051, c.getString(c.getColumnIndex("C3051")));
                param.put(C3051_C3099.C3052, c.getString(c.getColumnIndex("C3052")));
                param.put(C3051_C3099.C3053, c.getString(c.getColumnIndex("C3053")));
                param.put(C3051_C3099.C3053a, c.getString(c.getColumnIndex("C3053a")));
                param.put(C3051_C3099.C3054, c.getString(c.getColumnIndex("C3054")));
                param.put(C3051_C3099.C3055, c.getString(c.getColumnIndex("C3055")));
                param.put(C3051_C3099.C3056, c.getString(c.getColumnIndex("C3056")));
                param.put(C3051_C3099.C3057, c.getString(c.getColumnIndex("C3057")));
                param.put(C3051_C3099.C3058, c.getString(c.getColumnIndex("C3058")));
                param.put(C3051_C3099.C3059, c.getString(c.getColumnIndex("C3059")));
                param.put(C3051_C3099.C3060, c.getString(c.getColumnIndex("C3060")));
                param.put(C3051_C3099.C3061, c.getString(c.getColumnIndex("C3061")));
                param.put(C3051_C3099.C3062, c.getString(c.getColumnIndex("C3062")));
                param.put(C3051_C3099.C3063, c.getString(c.getColumnIndex("C3063")));
                param.put(C3051_C3099.C3064, c.getString(c.getColumnIndex("C3064")));
                param.put(C3051_C3099.C3065_1, c.getString(c.getColumnIndex("C3065_1")));
                param.put(C3051_C3099.C3065_2, c.getString(c.getColumnIndex("C3065_2")));
                param.put(C3051_C3099.C3065_3, c.getString(c.getColumnIndex("C3065_3")));
                param.put(C3051_C3099.C3065_4, c.getString(c.getColumnIndex("C3065_4")));
                param.put(C3051_C3099.C3065_5, c.getString(c.getColumnIndex("C3065_5")));
                param.put(C3051_C3099.C3065_6, c.getString(c.getColumnIndex("C3065_6")));
                param.put(C3051_C3099.C3065_7, c.getString(c.getColumnIndex("C3065_7")));
                param.put(C3051_C3099.C3065_OT, c.getString(c.getColumnIndex("C3065_OT")));
                param.put(C3051_C3099.C3065_DK, c.getString(c.getColumnIndex("C3065_DK")));
                param.put(C3051_C3099.C3066, c.getString(c.getColumnIndex("C3066")));
                param.put(C3051_C3099.C3067_1, c.getString(c.getColumnIndex("C3067_1")));
                param.put(C3051_C3099.C3067_2, c.getString(c.getColumnIndex("C3067_2")));
                param.put(C3051_C3099.C3067_3, c.getString(c.getColumnIndex("C3067_3")));
                param.put(C3051_C3099.C3067_4, c.getString(c.getColumnIndex("C3067_4")));
                param.put(C3051_C3099.C3067_5, c.getString(c.getColumnIndex("C3067_5")));
                param.put(C3051_C3099.C3067_6, c.getString(c.getColumnIndex("C3067_6")));
                param.put(C3051_C3099.C3067_7, c.getString(c.getColumnIndex("C3067_7")));
                param.put(C3051_C3099.C3067_OT, c.getString(c.getColumnIndex("C3067_OT")));
                param.put(C3051_C3099.C3067_DK, c.getString(c.getColumnIndex("C3067_DK")));
                param.put(C3051_C3099.C3068, c.getString(c.getColumnIndex("C3068")));
                param.put(C3051_C3099.C3068_OT, c.getString(c.getColumnIndex("C3068_OT")));
                param.put(C3051_C3099.C3069, c.getString(c.getColumnIndex("C3069")));
                param.put(C3051_C3099.C3070, c.getString(c.getColumnIndex("C3070")));
                param.put(C3051_C3099.C3071, c.getString(c.getColumnIndex("C3071")));
                param.put(C3051_C3099.C3072, c.getString(c.getColumnIndex("C3072")));
                param.put(C3051_C3099.C3073_1, c.getString(c.getColumnIndex("C3073_1")));
                param.put(C3051_C3099.C3073_2, c.getString(c.getColumnIndex("C3073_2")));
                param.put(C3051_C3099.C3073_3, c.getString(c.getColumnIndex("C3073_3")));
                param.put(C3051_C3099.C3074, c.getString(c.getColumnIndex("C3074")));
                param.put(C3051_C3099.C3075, c.getString(c.getColumnIndex("C3075")));
                param.put(C3051_C3099.C3076, c.getString(c.getColumnIndex("C3076")));
                param.put(C3051_C3099.C3077, c.getString(c.getColumnIndex("C3077")));
                param.put(C3051_C3099.C3078, c.getString(c.getColumnIndex("C3078")));
                param.put(C3051_C3099.C3079, c.getString(c.getColumnIndex("C3079")));
                param.put(C3051_C3099.C3079_OT, c.getString(c.getColumnIndex("C3079_OT")));
                param.put(C3051_C3099.C3080, c.getString(c.getColumnIndex("C3080")));
                param.put(C3051_C3099.C3081, c.getString(c.getColumnIndex("C3081")));
                param.put(C3051_C3099.C3082, c.getString(c.getColumnIndex("C3082")));
                param.put(C3051_C3099.C3083, c.getString(c.getColumnIndex("C3083")));
                param.put(C3051_C3099.C3084, c.getString(c.getColumnIndex("C3084")));
                param.put(C3051_C3099.C3085, c.getString(c.getColumnIndex("C3085")));
                param.put(C3051_C3099.C3086, c.getString(c.getColumnIndex("C3086")));
                param.put(C3051_C3099.C3087, c.getString(c.getColumnIndex("C3087")));
                param.put(C3051_C3099.C3088, c.getString(c.getColumnIndex("C3088")));
                param.put(C3051_C3099.C3089, c.getString(c.getColumnIndex("C3089")));
                param.put(C3051_C3099.C3090_1, c.getString(c.getColumnIndex("C3090_1")));
                param.put(C3051_C3099.C3090_2, c.getString(c.getColumnIndex("C3090_2")));
                param.put(C3051_C3099.C3091, c.getString(c.getColumnIndex("C3091")));
                param.put(C3051_C3099.C3092, c.getString(c.getColumnIndex("C3092")));
                param.put(C3051_C3099.C3093, c.getString(c.getColumnIndex("C3093")));
                param.put(C3051_C3099.C3094, c.getString(c.getColumnIndex("C3094")));
                param.put(C3051_C3099.C3095, c.getString(c.getColumnIndex("C3095")));
                param.put(C3051_C3099.C3096, c.getString(c.getColumnIndex("C3096")));
                param.put(C3051_C3099.C3097, c.getString(c.getColumnIndex("C3097")));
                param.put(C3051_C3099.C3098, c.getString(c.getColumnIndex("C3098")));
                param.put(C3051_C3099.C3099, c.getString(c.getColumnIndex("C3099")));

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

            new Upload_C3101_C3112(mContext).execute();

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
            Toast.makeText(mContext, "Uploading failed at request C3051_C3099 section", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}
