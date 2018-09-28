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

import Global.A.A4067_A4080;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4067_A4080 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4067_A4080(Context context) {

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
        String query = "select * from A4067_A4080 where study_id = '%s' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {
                param.put("tableName", "A4067_A4080");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(A4067_A4080.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(A4067_A4080.A4067, c.getString(c.getColumnIndex("A4067")));
                param.put(A4067_A4080.A4068, c.getString(c.getColumnIndex("A4068")));
                param.put(A4067_A4080.A4069_u, c.getString(c.getColumnIndex("A4069_u")));
                param.put(A4067_A4080.A4069_a, c.getString(c.getColumnIndex("A4069_a")));
                param.put(A4067_A4080.A4069_b, c.getString(c.getColumnIndex("A4069_b")));
                param.put(A4067_A4080.A4069_c, c.getString(c.getColumnIndex("A4069_c")));
                param.put(A4067_A4080.A4070, c.getString(c.getColumnIndex("A4070")));
                param.put(A4067_A4080.A4071, c.getString(c.getColumnIndex("A4071")));
                param.put(A4067_A4080.A4072_u, c.getString(c.getColumnIndex("A4072_u")));
                param.put(A4067_A4080.A4072_a, c.getString(c.getColumnIndex("A4072_a")));
                param.put(A4067_A4080.A4072_b, c.getString(c.getColumnIndex("A4072_b")));
                param.put(A4067_A4080.A4073, c.getString(c.getColumnIndex("A4073")));
                param.put(A4067_A4080.A4074, c.getString(c.getColumnIndex("A4074")));
                param.put(A4067_A4080.A4075_u, c.getString(c.getColumnIndex("A4075_u")));
                param.put(A4067_A4080.A4075_a, c.getString(c.getColumnIndex("A4075_a")));
                param.put(A4067_A4080.A4075_b, c.getString(c.getColumnIndex("A4075_b")));
                param.put(A4067_A4080.A4076, c.getString(c.getColumnIndex("A4076")));
                param.put(A4067_A4080.A4077_u, c.getString(c.getColumnIndex("A4077_u")));
                param.put(A4067_A4080.A4077_a, c.getString(c.getColumnIndex("A4077_a")));
                param.put(A4067_A4080.A4077_b, c.getString(c.getColumnIndex("A4077_b")));
                param.put(A4067_A4080.A4078, c.getString(c.getColumnIndex("A4078")));
                param.put(A4067_A4080.A4079, c.getString(c.getColumnIndex("A4079")));
                param.put(A4067_A4080.A4080, c.getString(c.getColumnIndex("A4080")));
                param.put(A4067_A4080.STATUS, c.getString(c.getColumnIndex("STATUS")));



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


            Toast.makeText(mContext, "Q section Uploaded", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(mContext,"Uploading failed at request a4067_a4080 section", Toast.LENGTH_SHORT).show();
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
