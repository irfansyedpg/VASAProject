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



import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_Q1101_Q1610 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_Q1101_Q1610(Context context) {

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
        String query1 = "select * from Q1101_Q1610 where study_id = '%s' order by id  desc LIMIT 1";


        query1 = String.format(query1, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c1 = LocalDataManager.database.rawQuery(query1, null);



        if (c1 != null) {
            if (c1.moveToFirst()) {
                param.put("tableName", "q1101_q1610");
                param.put("id", c1.getString(0));
                param.put(Q1101_Q1610.study_id, c1.getString(1));
              // param.put(Q1101_Q1610.Q1101, c1.getString(2));
              // param.put(Q1101_Q1610.Q1102, c1.getString(3));
              // param.put(Q1101_Q1610.Q1103, c1.getString(4));
                param.put(Q1101_Q1610.Q1202, c1.getString(5));
                param.put(Q1101_Q1610.Q1202, c1.getString(6));
                param.put(Q1101_Q1610.Q1203, c1.getString(7));
                param.put(Q1101_Q1610.Q1204, c1.getString(8));
                param.put(Q1101_Q1610.Q1205, c1.getString(9));
                param.put(Q1101_Q1610.Q1206_d, c1.getString(10));
                param.put(Q1101_Q1610.Q1206_m, c1.getString(11));
                param.put(Q1101_Q1610.Q1206_y, c1.getString(12));
                param.put(Q1101_Q1610.Q1207, c1.getString(13));
                param.put(Q1101_Q1610.Q1208, c1.getString(14));
                param.put(Q1101_Q1610.Q1209, c1.getString(15));
                param.put(Q1101_Q1610.Q1301, c1.getString(16));
                param.put(Q1101_Q1610.Q1302, c1.getString(17));
                param.put(Q1101_Q1610.Q1307, c1.getString(18));
                param.put(Q1101_Q1610.Q1308, c1.getString(19));
                param.put(Q1101_Q1610.Q1309, c1.getString(20));
                param.put(Q1101_Q1610.Q1310, c1.getString(21));
                param.put(Q1101_Q1610.Q1311, c1.getString(22));
                param.put(Q1101_Q1610.Q1312, c1.getString(23));
                param.put(Q1101_Q1610.Q1313, c1.getString(24));
                param.put(Q1101_Q1610.Q1401, c1.getString(25));
                param.put(Q1101_Q1610.Q1402, c1.getString(26));
                param.put(Q1101_Q1610.Q1403, c1.getString(27));
                param.put(Q1101_Q1610.Q1403_OT, c1.getString(28));
                param.put(Q1101_Q1610.Q1404, c1.getString(29));
                param.put(Q1101_Q1610.Q1405, c1.getString(30));
                param.put(Q1101_Q1610.Q1406, c1.getString(31));
                param.put(Q1101_Q1610.Q1407, c1.getString(32));
                param.put(Q1101_Q1610.Q1408, c1.getString(33));
                param.put(Q1101_Q1610.Q1409, c1.getString(34));
                param.put(Q1101_Q1610.Q1410, c1.getString(35));
                param.put(Q1101_Q1610.Q1411, c1.getString(36));
                param.put(Q1101_Q1610.Q1412, c1.getString(37));
                param.put(Q1101_Q1610.Q1413, c1.getString(38));
                param.put(Q1101_Q1610.Q1414_1, c1.getString(39));
                param.put(Q1101_Q1610.Q1414_2, c1.getString(40));
                param.put(Q1101_Q1610.Q1414_3, c1.getString(41));
                param.put(Q1101_Q1610.Q1414_4, c1.getString(42));
                param.put(Q1101_Q1610.Q1414_5, c1.getString(43));
                param.put(Q1101_Q1610.Q1414_6, c1.getString(44));
                param.put(Q1101_Q1610.Q1414_7, c1.getString(45));
                param.put(Q1101_Q1610.Q1414_8, c1.getString(46));
                param.put(Q1101_Q1610.Q1414_9, c1.getString(47));
                param.put(Q1101_Q1610.Q1414_10, c1.getString(48));
                param.put(Q1101_Q1610.Q1415, c1.getString(49));
                param.put(Q1101_Q1610.Q1416, c1.getString(50));
                param.put(Q1101_Q1610.Q1416_OT, c1.getString(51));
                param.put(Q1101_Q1610.Q1417, c1.getString(52));
                param.put(Q1101_Q1610.Q1417_OT, c1.getString(53));
                param.put(Q1101_Q1610.Q1418, c1.getString(54));
                param.put(Q1101_Q1610.Q1418_OT, c1.getString(55));
                param.put(Q1101_Q1610.Q1419, c1.getString(56));
                param.put(Q1101_Q1610.Q1419_OT, c1.getString(57));
                param.put(Q1101_Q1610.Q1420, c1.getString(58));
                param.put(Q1101_Q1610.Q1420_OT, c1.getString(59));
                param.put(Q1101_Q1610.Q1421, c1.getString(60));
                param.put(Q1101_Q1610.Q1421_OT, c1.getString(61));
                param.put(Q1101_Q1610.Q1501, c1.getString(62));
                param.put(Q1101_Q1610.Q1502, c1.getString(63));
                param.put(Q1101_Q1610.Q1503, c1.getString(64));
                param.put(Q1101_Q1610.Q1503_OT, c1.getString(65));
                param.put(Q1101_Q1610.Q1601, c1.getString(66));
                param.put(Q1101_Q1610.Q1602, c1.getString(67));
                param.put(Q1101_Q1610.Q1603, c1.getString(68));
                param.put(Q1101_Q1610.Q1604, c1.getString(69));
                param.put(Q1101_Q1610.Q1604_OT, c1.getString(70));
                param.put(Q1101_Q1610.Q1605, c1.getString(71));
                param.put(Q1101_Q1610.Q1606, c1.getString(72));
                param.put(Q1101_Q1610.Q1607_1, c1.getString(73));
                param.put(Q1101_Q1610.Q1607_2, c1.getString(74));
                param.put(Q1101_Q1610.Q1607_3, c1.getString(75));
                param.put(Q1101_Q1610.Q1608_1, c1.getString(76));
                param.put(Q1101_Q1610.Q1608_2, c1.getString(77));
                param.put(Q1101_Q1610.Q1608_3, c1.getString(78));
                param.put(Q1101_Q1610.Q1609, c1.getString(79));
                param.put(Q1101_Q1610.Q1610_1, c1.getString(80));
                param.put(Q1101_Q1610.Q1610_2, c1.getString(81));
                param.put(Q1101_Q1610.Q1610_3, c1.getString(82));
                param.put(Q1101_Q1610.interviewType, c1.getString(83));
                param.put(Q1101_Q1610.currentSection, c1.getString(84));
                param.put(Q1101_Q1610.STATUS, c1.getString(85));
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
            Toast.makeText(mContext,"Uploading failed at request Q section", Toast.LENGTH_SHORT).show();
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
