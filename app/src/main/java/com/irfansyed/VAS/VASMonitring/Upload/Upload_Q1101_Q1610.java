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

import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_Q1101_Q1610 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;

    //String[]                interviewLogData;
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

        dialog.setMessage("Uploading Interview  Please wait ....");
        dialog.setCancelable(false);
        dialog.show();

        //region Query
        String query = "select * from Q1101_Q1610 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";

        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);

        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "q1101_q1610");
                param.put(Q1101_Q1610.study_id, c.getString(c.getColumnIndex("study_id")));
                param.put(Q1101_Q1610.Q1201_1, c.getString(c.getColumnIndex("Q1201_1")));
                param.put(Q1101_Q1610.Q1201_2, c.getString(c.getColumnIndex("Q1201_2")));
                param.put(Q1101_Q1610.Q1201_3, c.getString(c.getColumnIndex("Q1201_3")));
                param.put(Q1101_Q1610.Q1201_4, c.getString(c.getColumnIndex("Q1201_4")));
                param.put(Q1101_Q1610.Q1201_5, c.getString(c.getColumnIndex("Q1201_5")));
                param.put(Q1101_Q1610.Q1201_6, c.getString(c.getColumnIndex("Q1201_6")));
                param.put(Q1101_Q1610.Q1202, c.getString(c.getColumnIndex("Q1202")));
                param.put(Q1101_Q1610.Q1203, c.getString(c.getColumnIndex("Q1203")));
                param.put(Q1101_Q1610.Q1204, c.getString(c.getColumnIndex("Q1204")));
                param.put(Q1101_Q1610.Q1205, c.getString(c.getColumnIndex("Q1205")));
                param.put(Q1101_Q1610.Q1206_d, c.getString(c.getColumnIndex("Q1206_d")));
                param.put(Q1101_Q1610.Q1206_m, c.getString(c.getColumnIndex("Q1206_m")));
                param.put(Q1101_Q1610.Q1206_y, c.getString(c.getColumnIndex("Q1206_y")));
                param.put(Q1101_Q1610.Q1207, c.getString(c.getColumnIndex("Q1207")));
                param.put(Q1101_Q1610.Q1208, c.getString(c.getColumnIndex("Q1208")));
                param.put(Q1101_Q1610.Q1209, c.getString(c.getColumnIndex("Q1209")));
                param.put(Q1101_Q1610.Q1301, c.getString(c.getColumnIndex("Q1301")));
                param.put(Q1101_Q1610.Q1302, c.getString(c.getColumnIndex("Q1302")));
                param.put(Q1101_Q1610.Q1307, c.getString(c.getColumnIndex("Q1307")));
                param.put(Q1101_Q1610.Q1308, c.getString(c.getColumnIndex("Q1308")));
                param.put(Q1101_Q1610.Q1309, c.getString(c.getColumnIndex("Q1309")));
                param.put(Q1101_Q1610.Q1310, c.getString(c.getColumnIndex("Q1310")));
                param.put(Q1101_Q1610.Q1311, c.getString(c.getColumnIndex("Q1311")));
                param.put(Q1101_Q1610.Q1312, c.getString(c.getColumnIndex("Q1312")));
                param.put(Q1101_Q1610.Q1313, c.getString(c.getColumnIndex("Q1313")));
                param.put(Q1101_Q1610.Q1401, c.getString(c.getColumnIndex("Q1401")));
                param.put(Q1101_Q1610.Q1402, c.getString(c.getColumnIndex("Q1402")));
                param.put(Q1101_Q1610.Q1403, c.getString(c.getColumnIndex("Q1403")));
                param.put(Q1101_Q1610.Q1403_OT, c.getString(c.getColumnIndex("Q1403_OT")));
                param.put(Q1101_Q1610.Q1404, c.getString(c.getColumnIndex("Q1404")));
                param.put(Q1101_Q1610.Q1405, c.getString(c.getColumnIndex("Q1405")));
                param.put(Q1101_Q1610.Q1406, c.getString(c.getColumnIndex("Q1406")));
                param.put(Q1101_Q1610.Q1407, c.getString(c.getColumnIndex("Q1407")));
                param.put(Q1101_Q1610.Q1408, c.getString(c.getColumnIndex("Q1408")));
                param.put(Q1101_Q1610.Q1409, c.getString(c.getColumnIndex("Q1409")));
                param.put(Q1101_Q1610.Q1410, c.getString(c.getColumnIndex("Q1410")));
                param.put(Q1101_Q1610.Q1411, c.getString(c.getColumnIndex("Q1411")));
                param.put(Q1101_Q1610.Q1412, c.getString(c.getColumnIndex("Q1412")));
                param.put(Q1101_Q1610.Q1413, c.getString(c.getColumnIndex("Q1413")));
                param.put(Q1101_Q1610.Q1414_1, c.getString(c.getColumnIndex("Q1414_1")));
                param.put(Q1101_Q1610.Q1414_2, c.getString(c.getColumnIndex("Q1414_2")));
                param.put(Q1101_Q1610.Q1414_3, c.getString(c.getColumnIndex("Q1414_3")));
                param.put(Q1101_Q1610.Q1414_4, c.getString(c.getColumnIndex("Q1414_4")));
                param.put(Q1101_Q1610.Q1414_5, c.getString(c.getColumnIndex("Q1414_5")));
                param.put(Q1101_Q1610.Q1414_6, c.getString(c.getColumnIndex("Q1414_6")));
                param.put(Q1101_Q1610.Q1414_7, c.getString(c.getColumnIndex("Q1414_7")));
                param.put(Q1101_Q1610.Q1414_8, c.getString(c.getColumnIndex("Q1414_8")));
                param.put(Q1101_Q1610.Q1414_9, c.getString(c.getColumnIndex("Q1414_9")));
                param.put(Q1101_Q1610.Q1414_10, c.getString(c.getColumnIndex("Q1414_10")));
                param.put(Q1101_Q1610.Q1415, c.getString(c.getColumnIndex("Q1415")));
                param.put(Q1101_Q1610.Q1416, c.getString(c.getColumnIndex("Q1416")));
                param.put(Q1101_Q1610.Q1416_OT, c.getString(c.getColumnIndex("Q1416_OT")));
                param.put(Q1101_Q1610.Q1417, c.getString(c.getColumnIndex("Q1417")));
                param.put(Q1101_Q1610.Q1417_OT, c.getString(c.getColumnIndex("Q1417_OT")));
                param.put(Q1101_Q1610.Q1418, c.getString(c.getColumnIndex("Q1418")));
                param.put(Q1101_Q1610.Q1418_OT, c.getString(c.getColumnIndex("Q1418_OT")));
                param.put(Q1101_Q1610.Q1419, c.getString(c.getColumnIndex("Q1419")));
                param.put(Q1101_Q1610.Q1419_OT, c.getString(c.getColumnIndex("Q1419_OT")));
                param.put(Q1101_Q1610.Q1420, c.getString(c.getColumnIndex("Q1420")));
                param.put(Q1101_Q1610.Q1420_OT, c.getString(c.getColumnIndex("Q1420_OT")));
                param.put(Q1101_Q1610.Q1421, c.getString(c.getColumnIndex("Q1421")));
                param.put(Q1101_Q1610.Q1421_OT, c.getString(c.getColumnIndex("Q1421_OT")));
                param.put(Q1101_Q1610.Q1501, c.getString(c.getColumnIndex("Q1501")));
                param.put(Q1101_Q1610.Q1502, c.getString(c.getColumnIndex("Q1502")));
                param.put(Q1101_Q1610.Q1503, c.getString(c.getColumnIndex("Q1503")));
                param.put(Q1101_Q1610.Q1503_OT, c.getString(c.getColumnIndex("Q1503_OT")));
                param.put(Q1101_Q1610.Q1601, c.getString(c.getColumnIndex("Q1601")));
                param.put(Q1101_Q1610.Q1602, c.getString(c.getColumnIndex("Q1602")));
                param.put(Q1101_Q1610.Q1603, c.getString(c.getColumnIndex("Q1603")));
                param.put(Q1101_Q1610.Q1604, c.getString(c.getColumnIndex("Q1604")));
                param.put(Q1101_Q1610.Q1604_OT, c.getString(c.getColumnIndex("Q1604_OT")));
                param.put(Q1101_Q1610.Q1605, c.getString(c.getColumnIndex("Q1605")));
                param.put(Q1101_Q1610.Q1606, c.getString(c.getColumnIndex("Q1606")));
                param.put(Q1101_Q1610.Q1607_1, c.getString(c.getColumnIndex("Q1607_1")));
                param.put(Q1101_Q1610.Q1607_2, c.getString(c.getColumnIndex("Q1607_2")));
                param.put(Q1101_Q1610.Q1607_3, c.getString(c.getColumnIndex("Q1607_3")));
                param.put(Q1101_Q1610.Q1608_1, c.getString(c.getColumnIndex("Q1608_1")));
                param.put(Q1101_Q1610.Q1608_2, c.getString(c.getColumnIndex("Q1608_2")));
                param.put(Q1101_Q1610.Q1608_3, c.getString(c.getColumnIndex("Q1608_3")));
                param.put(Q1101_Q1610.Q1609, c.getString(c.getColumnIndex("Q1609")));
                param.put(Q1101_Q1610.Q1610_1, c.getString(c.getColumnIndex("Q1610_1")));
                param.put(Q1101_Q1610.Q1610_2, c.getString(c.getColumnIndex("Q1610_2")));
                param.put(Q1101_Q1610.Q1610_3, c.getString(c.getColumnIndex("Q1610_3")));
                param.put(Q1101_Q1610.interviewType, c.getString(c.getColumnIndex("interviewType")));
                param.put(Q1101_Q1610.currentSection, c.getString(c.getColumnIndex("currentSection")));
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
            connection.setConnectTimeout(20000);

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


    /*void update_status(String id) {
        String query = "Update C3001_C3011 set STATUS = '1' where id='" + id + "'";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(mContext);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(mContext, "Status updated", Toast.LENGTH_SHORT).show();
    }*/

    @Override
    protected void onPostExecute(Object o) {

        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();

            //String result = (((String) o).replace("\"", ""));
            // call another table upload here

            if (Q1101_Q1610.interviewType_upload == 1) {

                new Upload_A4001_A4014(mContext).execute();

            } else if (Q1101_Q1610.interviewType_upload == 2) {

                new Upload_C3001_C3011(mContext).execute();
            }

          //  thread.start();
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
            Toast.makeText(mContext, "Uploading failed at request Q section", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}
