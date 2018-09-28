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

import Global.A.A4126_A4140;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4126_A4140 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4126_A4140(Context context) {

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
        String query = "select * from A4126_A4140 where study_id = '%s' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);

        if (c != null) {
            if (c.moveToFirst()) {
                param.put("tableName", "A4126_A4140");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(A4126_A4140.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(A4126_A4140.A4126, c.getString(c.getColumnIndex("A4126")));
                param.put(A4126_A4140.A4127_u, c.getString(c.getColumnIndex("A4127_u")));
                param.put(A4126_A4140.A4127_a, c.getString(c.getColumnIndex("A4127_a")));
                param.put(A4126_A4140.A4127_b, c.getString(c.getColumnIndex("A4127_b")));
                param.put(A4126_A4140.A4128, c.getString(c.getColumnIndex("A4128")));
                param.put(A4126_A4140.A4129, c.getString(c.getColumnIndex("A4129")));
                param.put(A4126_A4140.A4130_u, c.getString(c.getColumnIndex("A4130_u")));
                param.put(A4126_A4140.A4130_a, c.getString(c.getColumnIndex("A4130_a")));
                param.put(A4126_A4140.A4130_b, c.getString(c.getColumnIndex("A4130_b")));
                param.put(A4126_A4140.A4131, c.getString(c.getColumnIndex("A4131")));
                param.put(A4126_A4140.A4132, c.getString(c.getColumnIndex("A4132")));
                param.put(A4126_A4140.A4133, c.getString(c.getColumnIndex("A4133")));
                param.put(A4126_A4140.A4134_u, c.getString(c.getColumnIndex("A4134_u")));
                param.put(A4126_A4140.A4134_a, c.getString(c.getColumnIndex("A4134_a")));
                param.put(A4126_A4140.A4134_b, c.getString(c.getColumnIndex("A4134_b")));
                param.put(A4126_A4140.A4135, c.getString(c.getColumnIndex("A4135")));
                param.put(A4126_A4140.A4136, c.getString(c.getColumnIndex("A4136")));
                param.put(A4126_A4140.A4138, c.getString(c.getColumnIndex("A4138")));
                param.put(A4126_A4140.A4139, c.getString(c.getColumnIndex("A4139")));
                param.put(A4126_A4140.A4140, c.getString(c.getColumnIndex("A4140")));
                param.put(A4126_A4140.STATUS, c.getString(c.getColumnIndex("STATUS")));


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


            Toast.makeText(mContext, "A4126_A4140 section Uploaded", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(mContext,"Uploading failed at request A4126_A4140 section", Toast.LENGTH_SHORT).show();
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
