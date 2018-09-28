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

import Global.A.A4157_A4205;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4157_A4205 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4157_A4205(Context context) {

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
        String query = "select * from A4157_A4205 where study_id = '%s' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);

        Cursor c = LocalDataManager.database.rawQuery(query, null);

        if (c != null) {
            if (c.moveToFirst()) {
                param.put("tableName", "A4157_A4205");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(A4157_A4205.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(A4157_A4205.A4157, c.getString(c.getColumnIndex("A4157")));
                param.put(A4157_A4205.A4158, c.getString(c.getColumnIndex("A4158")));
                param.put(A4157_A4205.A4159, c.getString(c.getColumnIndex("A4159")));
                param.put(A4157_A4205.A4160, c.getString(c.getColumnIndex("A4160")));
                param.put(A4157_A4205.A4161, c.getString(c.getColumnIndex("A4161")));
                param.put(A4157_A4205.A4161_1, c.getString(c.getColumnIndex("A4161_1")));
                param.put(A4157_A4205.A4162, c.getString(c.getColumnIndex("A4162")));
                param.put(A4157_A4205.A4163, c.getString(c.getColumnIndex("A4163")));
                param.put(A4157_A4205.A4163, c.getString(c.getColumnIndex("A4163")));
                param.put(A4157_A4205.A4164, c.getString(c.getColumnIndex("A4164")));
                param.put(A4157_A4205.A4166, c.getString(c.getColumnIndex("A4166")));
                param.put(A4157_A4205.A4167, c.getString(c.getColumnIndex("A4167")));
                param.put(A4157_A4205.A4168_1, c.getString(c.getColumnIndex("A4168_1")));
                param.put(A4157_A4205.A4168_3, c.getString(c.getColumnIndex("A4168_3")));
                param.put(A4157_A4205.A4168, c.getString(c.getColumnIndex("A4168")));
                param.put(A4157_A4205.A4173_1, c.getString(c.getColumnIndex("A4173_1")));
                param.put(A4157_A4205.A4173, c.getString(c.getColumnIndex("A4173")));
                param.put(A4157_A4205.A4173_2, c.getString(c.getColumnIndex("A4173_2")));
                param.put(A4157_A4205.A4178_1, c.getString(c.getColumnIndex("A4178_1")));
                param.put(A4157_A4205.A4178_2, c.getString(c.getColumnIndex("A4178_2")));
                param.put(A4157_A4205.A4178, c.getString(c.getColumnIndex("A4178")));
                param.put(A4157_A4205.A4179, c.getString(c.getColumnIndex("A4179")));
                param.put(A4157_A4205.A4180, c.getString(c.getColumnIndex("A4180")));
                param.put(A4157_A4205.A4181, c.getString(c.getColumnIndex("A4181")));
                param.put(A4157_A4205.A4182, c.getString(c.getColumnIndex("A4182")));
                param.put(A4157_A4205.A4183, c.getString(c.getColumnIndex("A4183")));
                param.put(A4157_A4205.A4184, c.getString(c.getColumnIndex("A4184")));
                param.put(A4157_A4205.A4185, c.getString(c.getColumnIndex("A4185")));
                param.put(A4157_A4205.A4186, c.getString(c.getColumnIndex("A4186")));
                param.put(A4157_A4205.A4186_1, c.getString(c.getColumnIndex("A4186_1")));
                param.put(A4157_A4205.A4187, c.getString(c.getColumnIndex("A4187")));
                param.put(A4157_A4205.A4188, c.getString(c.getColumnIndex("A4188")));
                param.put(A4157_A4205.A4189, c.getString(c.getColumnIndex("A4189")));
                param.put(A4157_A4205.A4190, c.getString(c.getColumnIndex("A4190")));
                param.put(A4157_A4205.A4191, c.getString(c.getColumnIndex("A4191")));
                param.put(A4157_A4205.A4192, c.getString(c.getColumnIndex("A4192")));
                param.put(A4157_A4205.A4193, c.getString(c.getColumnIndex("A4193")));
                param.put(A4157_A4205.A4193_1, c.getString(c.getColumnIndex("A4193_1")));
                param.put(A4157_A4205.A4194, c.getString(c.getColumnIndex("A4194")));
                param.put(A4157_A4205.A4195, c.getString(c.getColumnIndex("A4195")));
                param.put(A4157_A4205.A4196, c.getString(c.getColumnIndex("A4196")));
                param.put(A4157_A4205.A4197, c.getString(c.getColumnIndex("A4197")));
                param.put(A4157_A4205.A4198_1, c.getString(c.getColumnIndex("A4198_1")));
                param.put(A4157_A4205.A4198, c.getString(c.getColumnIndex("A4198")));
                param.put(A4157_A4205.A4200, c.getString(c.getColumnIndex("A4200")));
                param.put(A4157_A4205.A4202, c.getString(c.getColumnIndex("A4202")));
                param.put(A4157_A4205.A4203, c.getString(c.getColumnIndex("A4203")));
                param.put(A4157_A4205.A4204, c.getString(c.getColumnIndex("A4204")));
                param.put(A4157_A4205.A4205, c.getString(c.getColumnIndex("A4205")));
                param.put(A4157_A4205.A4205_1, c.getString(c.getColumnIndex("A4205_1")));
                param.put(A4157_A4205.STATUS, c.getString(c.getColumnIndex("STATUS")));

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


            Toast.makeText(mContext, "A4157_A4205 section Uploaded", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(mContext,"Uploading failed at request A4157_A4205 section", Toast.LENGTH_SHORT).show();
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
