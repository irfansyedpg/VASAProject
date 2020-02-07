package data;

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

import Global.A.A4001_A4014;
import Global.A.A4051_A4066;
import Global.A.A4067_A4080;
import Global.A.A4081_A4094;
import Global.A.A4095_A4108;
import Global.A.A4109_A4125;
import Global.A.A4126_A4140;
import Global.A.A4144_A4156;
import Global.A.A4157_A4205;
import Global.A.A4206_A4207;
import Global.A.A4251_A4284;
import Global.A.A4301_A4315;
import Global.A.A4351_A4364;
import Global.A.A4401_A4473;
import Global.C.C3001_C3011;
import Global.GS.Q1101_Q1610;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class UploadHouseInfoAsync extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
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

    public UploadHouseInfoAsync(Context context) {

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

        if (Q1101_Q1610.interviewType_upload == 1) {

            //region Query
            String query1 = "select * from Q1101_Q1610 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query2 = "select * from A4001_A4014 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query3 = "select * from A4051_A4066 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query4 = "select * from A4067_A4080 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query5 = "select * from A4081_A4094 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query6 = "select * from A4095_A4108 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query7 = "select * from A4109_A4125 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query8 = "select * from A4126_A4140 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query9 = "select * from A4144_A4156 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query10 = "select * from A4157_A4205 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query11 = "select * from A4206_A4207 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query12 = "select * from A4251_A4284 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query13 = "select * from A4301_A4315 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query14 = "select * from A4351_A4364 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query15 = "select * from A4401_A4473 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query16 = "select * from C3001_C3011 where study_id = '" + Q1101_Q1610.study_id_upload + "'  order by id  desc LIMIT 1";

            query1 = String.format(query1, Q1101_Q1610.study_id_upload);
            query2 = String.format(query2, A4001_A4014.study_id);
            query3 = String.format(query3, A4051_A4066.study_id);
            query4 = String.format(query4, A4067_A4080.study_id);
            query5 = String.format(query5, A4081_A4094.study_id);
            query6 = String.format(query6, A4095_A4108.study_id);
            query7 = String.format(query7, A4109_A4125.study_id);
            query8 = String.format(query8, A4126_A4140.study_id);
            query9 = String.format(query9, A4144_A4156.study_id);
            query10 = String.format(query10, A4157_A4205.study_id);
            query11 = String.format(query11, A4206_A4207.study_id);
            query12 = String.format(query12, A4251_A4284.study_id);
            query13 = String.format(query13, A4301_A4315.study_id);
            query14 = String.format(query14, A4351_A4364.study_id);
            query15 = String.format(query15, A4401_A4473.study_id);
            query16 = String.format(query16, C3001_C3011.study_id);

            LocalDataManager Lm = new LocalDataManager(mContext);

            Cursor c1 = LocalDataManager.database.rawQuery(query1, null);
            Cursor c2 = LocalDataManager.database.rawQuery(query2, null);
            Cursor c3 = LocalDataManager.database.rawQuery(query3, null);
            Cursor c4 = LocalDataManager.database.rawQuery(query4, null);
            Cursor c5 = LocalDataManager.database.rawQuery(query5, null);
            Cursor c6 = LocalDataManager.database.rawQuery(query6, null);
            Cursor c7 = LocalDataManager.database.rawQuery(query7, null);
            Cursor c8 = LocalDataManager.database.rawQuery(query8, null);
            Cursor c9 = LocalDataManager.database.rawQuery(query9, null);
            Cursor c10 = LocalDataManager.database.rawQuery(query10, null);
            Cursor c11 = LocalDataManager.database.rawQuery(query11, null);
            Cursor c12 = LocalDataManager.database.rawQuery(query12, null);
            Cursor c13 = LocalDataManager.database.rawQuery(query13, null);
            Cursor c14 = LocalDataManager.database.rawQuery(query14, null);
            Cursor c15 = LocalDataManager.database.rawQuery(query15, null);
            Cursor c16 = LocalDataManager.database.rawQuery(query16, null);

        } else if (Q1101_Q1610.interviewType_upload == 2) {

            //region Query
            String query1 = "select * from Q1101_Q1610 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query2 = "select * from A4001_A4014 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query3 = "select * from A4051_A4066 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query4 = "select * from A4067_A4080 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query5 = "select * from A4081_A4094 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query6 = "select * from A4095_A4108 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query7 = "select * from A4109_A4125 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query8 = "select * from A4126_A4140 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query9 = "select * from A4144_A4156 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query10 = "select * from A4157_A4205 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query11 = "select * from A4206_A4207 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query12 = "select * from A4251_A4284 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query13 = "select * from A4301_A4315 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query14 = "select * from A4351_A4364 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query15 = "select * from A4401_A4473 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query16 = "select * from C3001_C3011 where study_id = '" + Q1101_Q1610.study_id_upload + "'  order by id  desc LIMIT 1";

            query1 = String.format(query1, Q1101_Q1610.study_id_upload);
            query2 = String.format(query2, A4001_A4014.study_id);
            query3 = String.format(query3, A4051_A4066.study_id);
            query4 = String.format(query4, A4067_A4080.study_id);
            query5 = String.format(query5, A4081_A4094.study_id);
            query6 = String.format(query6, A4095_A4108.study_id);
            query7 = String.format(query7, A4109_A4125.study_id);
            query8 = String.format(query8, A4126_A4140.study_id);
            query9 = String.format(query9, A4144_A4156.study_id);
            query10 = String.format(query10, A4157_A4205.study_id);
            query11 = String.format(query11, A4206_A4207.study_id);
            query12 = String.format(query12, A4251_A4284.study_id);
            query13 = String.format(query13, A4301_A4315.study_id);
            query14 = String.format(query14, A4351_A4364.study_id);
            query15 = String.format(query15, A4401_A4473.study_id);
            query16 = String.format(query16, C3001_C3011.study_id);

            LocalDataManager Lm = new LocalDataManager(mContext);

            Cursor c1 = LocalDataManager.database.rawQuery(query1, null);
            Cursor c2 = LocalDataManager.database.rawQuery(query2, null);
            Cursor c3 = LocalDataManager.database.rawQuery(query3, null);
            Cursor c4 = LocalDataManager.database.rawQuery(query4, null);
            Cursor c5 = LocalDataManager.database.rawQuery(query5, null);
            Cursor c6 = LocalDataManager.database.rawQuery(query6, null);
            Cursor c7 = LocalDataManager.database.rawQuery(query7, null);
            Cursor c8 = LocalDataManager.database.rawQuery(query8, null);
            Cursor c9 = LocalDataManager.database.rawQuery(query9, null);
            Cursor c10 = LocalDataManager.database.rawQuery(query10, null);
            Cursor c11 = LocalDataManager.database.rawQuery(query11, null);
            Cursor c12 = LocalDataManager.database.rawQuery(query12, null);
            Cursor c13 = LocalDataManager.database.rawQuery(query13, null);
            Cursor c14 = LocalDataManager.database.rawQuery(query14, null);
            Cursor c15 = LocalDataManager.database.rawQuery(query15, null);
            Cursor c16 = LocalDataManager.database.rawQuery(query16, null);


        } else if (Q1101_Q1610.interviewType_upload == 3) {

            //region Query
            String query1 = "select * from Q1101_Q1610 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query2 = "select * from A4001_A4014 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query3 = "select * from A4051_A4066 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query4 = "select * from A4067_A4080 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query5 = "select * from A4081_A4094 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query6 = "select * from A4095_A4108 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query7 = "select * from A4109_A4125 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query8 = "select * from A4126_A4140 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query9 = "select * from A4144_A4156 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query10 = "select * from A4157_A4205 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query11 = "select * from A4206_A4207 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query12 = "select * from A4251_A4284 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query13 = "select * from A4301_A4315 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query14 = "select * from A4351_A4364 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query15 = "select * from A4401_A4473 where study_id = '" + Q1101_Q1610.study_id_upload + "' order by id  desc LIMIT 1";
            String query16 = "select * from C3001_C3011 where study_id = '" + Q1101_Q1610.study_id_upload + "'  order by id  desc LIMIT 1";

            query1 = String.format(query1, Q1101_Q1610.study_id_upload);
            query2 = String.format(query2, A4001_A4014.study_id);
            query3 = String.format(query3, A4051_A4066.study_id);
            query4 = String.format(query4, A4067_A4080.study_id);
            query5 = String.format(query5, A4081_A4094.study_id);
            query6 = String.format(query6, A4095_A4108.study_id);
            query7 = String.format(query7, A4109_A4125.study_id);
            query8 = String.format(query8, A4126_A4140.study_id);
            query9 = String.format(query9, A4144_A4156.study_id);
            query10 = String.format(query10, A4157_A4205.study_id);
            query11 = String.format(query11, A4206_A4207.study_id);
            query12 = String.format(query12, A4251_A4284.study_id);
            query13 = String.format(query13, A4301_A4315.study_id);
            query14 = String.format(query14, A4351_A4364.study_id);
            query15 = String.format(query15, A4401_A4473.study_id);
            query16 = String.format(query16, C3001_C3011.study_id);

            LocalDataManager Lm = new LocalDataManager(mContext);

            Cursor c1 = LocalDataManager.database.rawQuery(query1, null);
            Cursor c2 = LocalDataManager.database.rawQuery(query2, null);
            Cursor c3 = LocalDataManager.database.rawQuery(query3, null);
            Cursor c4 = LocalDataManager.database.rawQuery(query4, null);
            Cursor c5 = LocalDataManager.database.rawQuery(query5, null);
            Cursor c6 = LocalDataManager.database.rawQuery(query6, null);
            Cursor c7 = LocalDataManager.database.rawQuery(query7, null);
            Cursor c8 = LocalDataManager.database.rawQuery(query8, null);
            Cursor c9 = LocalDataManager.database.rawQuery(query9, null);
            Cursor c10 = LocalDataManager.database.rawQuery(query10, null);
            Cursor c11 = LocalDataManager.database.rawQuery(query11, null);
            Cursor c12 = LocalDataManager.database.rawQuery(query12, null);
            Cursor c13 = LocalDataManager.database.rawQuery(query13, null);
            Cursor c14 = LocalDataManager.database.rawQuery(query14, null);
            Cursor c15 = LocalDataManager.database.rawQuery(query15, null);
            Cursor c16 = LocalDataManager.database.rawQuery(query16, null);
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


    void update_status(String id) {
        String query = "Update C3001_C3011 set STATUS = '1' where id='" + id + "'";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(mContext);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(mContext, "Status updated", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostExecute(Object o) {

        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();


            //int houseId = Integer.parseInt(((String) o).replace("\"",""));

            String result = (((String) o).replace("\"", ""));


            Toast.makeText(mContext, "Interivew Has been Uploaded", Toast.LENGTH_SHORT).show();
            // new LocalDataManager(mContext).uploadInterview();

            // LogtableUpdates.UpdateLogStatusUpload(mContext,Validation.hfauploadid);

            update_status(param.get("id"));
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
            Toast.makeText(mContext, "Uploading failed at request 1", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}
