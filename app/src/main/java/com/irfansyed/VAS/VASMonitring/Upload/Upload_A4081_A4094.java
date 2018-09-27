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

import Global.A.A4081_A4094;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4081_A4094 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4081_A4094(Context context) {

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
        String query = "select * from A4081_A4094 where study_id = '%s' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {
                param.put("tableName", "A4081_A4094");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(A4081_A4094.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(A4081_A4094.A4081, c.getString(c.getColumnIndex("A4081")));
                param.put(A4081_A4094.A4082_u, c.getString(c.getColumnIndex("A4082_u")));
                param.put(A4081_A4094.A4082_a, c.getString(c.getColumnIndex("A4082_a")));
                param.put(A4081_A4094.A4082_b, c.getString(c.getColumnIndex("A4082_b")));
                param.put(A4081_A4094.A4082_c, c.getString(c.getColumnIndex("A4082_c")));
                param.put(A4081_A4094.A4083, c.getString(c.getColumnIndex("A4083")));
                param.put(A4081_A4094.A4084, c.getString(c.getColumnIndex("A4084")));
                param.put(A4081_A4094.A4085_u, c.getString(c.getColumnIndex("A4085_u")));
                param.put(A4081_A4094.A4085_a, c.getString(c.getColumnIndex("A4085_a")));
                param.put(A4081_A4094.A4085_b, c.getString(c.getColumnIndex("A4085_b")));
                param.put(A4081_A4094.A4086, c.getString(c.getColumnIndex("A4086")));
                param.put(A4081_A4094.A4087_u, c.getString(c.getColumnIndex("A4087_u")));
                param.put(A4081_A4094.A4087_a, c.getString(c.getColumnIndex("A4087_a")));
                param.put(A4081_A4094.A4087_b, c.getString(c.getColumnIndex("A4087_b")));
                param.put(A4081_A4094.A4088, c.getString(c.getColumnIndex("A4088")));
                param.put(A4081_A4094.A4089, c.getString(c.getColumnIndex("A4089")));
                param.put(A4081_A4094.A4090, c.getString(c.getColumnIndex("A4090")));
                param.put(A4081_A4094.A4091, c.getString(c.getColumnIndex("A4091")));
                param.put(A4081_A4094.A4092, c.getString(c.getColumnIndex("A4092")));
                param.put(A4081_A4094.A4093, c.getString(c.getColumnIndex("A4093")));
                param.put(A4081_A4094.A4094_u, c.getString(c.getColumnIndex("A4094_u")));
                param.put(A4081_A4094.A4094_a, c.getString(c.getColumnIndex("A4094_a")));
                param.put(A4081_A4094.A4094_b, c.getString(c.getColumnIndex("A4094_b")));
                param.put(A4081_A4094.A4094_c, c.getString(c.getColumnIndex("A4094_c")));
                param.put(A4081_A4094.STATUS, c.getString(c.getColumnIndex("STATUS")));




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


            Toast.makeText(mContext, "A4081_A4094 section Uploaded", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(mContext,"Uploading failed at request A4081_A4094 section", Toast.LENGTH_SHORT).show();
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
