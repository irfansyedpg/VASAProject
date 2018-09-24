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

import Global.A.A4401_A4473;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4401_A4473 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4401_A4473(Context context) {

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
        String query1 = "select * from A4401_A4473 where study_id = '%s' order by id  desc LIMIT 1";


        query1 = String.format(query1, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c1 = LocalDataManager.database.rawQuery(query1, null);



        if (c1 != null) {
            if (c1.moveToFirst()) {
                param.put("tableName", "a4401_a4473");


                param.put(A4401_A4473.study_id, c1.getString(0));
                param.put(A4401_A4473.A4401, c1.getString(1));
                param.put(A4401_A4473.A4402, c1.getString(2));
                param.put(A4401_A4473.A4402_5_OT, c1.getString(3));
                param.put(A4401_A4473.A4403_province, c1.getString(4));
                param.put(A4401_A4473.A4403_district, c1.getString(5));
                param.put(A4401_A4473.A4404_years, c1.getString(6));
                param.put(A4401_A4473.A4405_hours, c1.getString(7));
                param.put(A4401_A4473.A4405_minutes, c1.getString(8));
                param.put(A4401_A4473.A4451_1, c1.getString(9));
                param.put(A4401_A4473.A4451_2, c1.getString(10));
                param.put(A4401_A4473.A4451_3, c1.getString(11));
                param.put(A4401_A4473.A4451_4, c1.getString(12));
                param.put(A4401_A4473.A4451_5, c1.getString(13));
                param.put(A4401_A4473.A4451_6, c1.getString(14));
                param.put(A4401_A4473.A4451_7, c1.getString(15));
                param.put(A4401_A4473.A4451_8, c1.getString(16));
                param.put(A4401_A4473.A4451_9, c1.getString(17));
                param.put(A4401_A4473.A4451_10, c1.getString(18));
                param.put(A4401_A4473.A4451_11, c1.getString(19));
                param.put(A4401_A4473.A4451_12, c1.getString(20));
                param.put(A4401_A4473.A4451_13, c1.getString(21));
                param.put(A4401_A4473.A4451_13_OT, c1.getString(22));
                param.put(A4401_A4473.A4451_code, c1.getString(23));
                param.put(A4401_A4473.A4452_1, c1.getString(24));
                param.put(A4401_A4473.A4452_2, c1.getString(25));
                param.put(A4401_A4473.A4452_3, c1.getString(26));
                param.put(A4401_A4473.A4452_4, c1.getString(27));
                param.put(A4401_A4473.A4452_5, c1.getString(28));
                param.put(A4401_A4473.A4452_6, c1.getString(29));
                param.put(A4401_A4473.A4452_7, c1.getString(30));
                param.put(A4401_A4473.A4452_8, c1.getString(31));
                param.put(A4401_A4473.A4452_9, c1.getString(32));
                param.put(A4401_A4473.A4452_9_OT, c1.getString(33));
                param.put(A4401_A4473.A4452_code, c1.getString(34));
                param.put(A4401_A4473.A4453_1, c1.getString(35));
                param.put(A4401_A4473.A4453_2, c1.getString(36));
                param.put(A4401_A4473.A4453_3, c1.getString(37));
                param.put(A4401_A4473.A4453_4, c1.getString(38));
                param.put(A4401_A4473.A4453_5, c1.getString(39));
                param.put(A4401_A4473.A4453_6, c1.getString(40));
                param.put(A4401_A4473.A4453_7, c1.getString(41));
                param.put(A4401_A4473.A4453_8, c1.getString(42));
                param.put(A4401_A4473.A4453_9, c1.getString(43));
                param.put(A4401_A4473.A4453_10, c1.getString(44));
                param.put(A4401_A4473.A4453_11, c1.getString(45));
                param.put(A4401_A4473.A4453_12, c1.getString(46));
                param.put(A4401_A4473.A4453_12_OT, c1.getString(47));
                param.put(A4401_A4473.A4453_code, c1.getString(48));
                param.put(A4401_A4473.A4454, c1.getString(49));
                param.put(A4401_A4473.A4455, c1.getString(50));
                param.put(A4401_A4473.A4456, c1.getString(51));
                param.put(A4401_A4473.A4457, c1.getString(52));
                param.put(A4401_A4473.A4471, c1.getString(53));
                param.put(A4401_A4473.A4472_1, c1.getString(54));
                param.put(A4401_A4473.A4472_2, c1.getString(55));
                param.put(A4401_A4473.A4472_3, c1.getString(56));
                param.put(A4401_A4473.A4472_4, c1.getString(57));
                param.put(A4401_A4473.A4472_5, c1.getString(58));
                param.put(A4401_A4473.A4472_6, c1.getString(59));
                param.put(A4401_A4473.A4472_7, c1.getString(60));
                param.put(A4401_A4473.A4472_8, c1.getString(61));
                param.put(A4401_A4473.A4472_9, c1.getString(62));
                param.put(A4401_A4473.A4472_10, c1.getString(63));
                param.put(A4401_A4473.A4472_11, c1.getString(64));
                param.put(A4401_A4473.A4472_12, c1.getString(65));
                param.put(A4401_A4473.A4472_DK, c1.getString(66));
                param.put(A4401_A4473.A4473, c1.getString(67));
                param.put(A4401_A4473.STATUS, c1.getString(68));








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


            Toast.makeText(mContext, "A4401_A4473 section Uploaded", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(mContext,"Uploading failed at request A4401_A4473 section", Toast.LENGTH_SHORT).show();
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
