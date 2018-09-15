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
import java.util.List;

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
import data.GS.Q1101_Q1610;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class UploadHouseInfoAsync extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

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

        HashMap<String, List<String>> map = QuestionModel.quest.get("a");

        //region Query
        String query1 = "select * from Q1101_Q1610 where study_id = '%s' order by id  desc LIMIT 1";
        String query2 = "select * from A4001_A4014 where study_id = '%s' order by id  desc LIMIT 1";
        String query3 = "select * from A4051_A4066 where study_id = '%s' order by id  desc LIMIT 1";
        String query4 = "select * from A4067_A4080 where study_id = '%s' order by id  desc LIMIT 1";
        String query5 = "select * from A4081_A4094 where study_id = '%s' order by id  desc LIMIT 1";
        String query6 = "select * from A4095_A4108 where study_id = '%s' order by id  desc LIMIT 1";
        String query7 = "select * from A4109_A4125 where study_id = '%s' order by id  desc LIMIT 1";
        String query8 = "select * from A4126_A4140 where study_id = '%s' order by id  desc LIMIT 1";
        String query9 = "select * from A4144_A4156 where study_id = '%s' order by id  desc LIMIT 1";
        String query10 = "select * from A4157_A4205 where study_id = '%s' order by id  desc LIMIT 1";
        String query11 = "select * from A4206_A4207 where study_id = '%s' order by id  desc LIMIT 1";
        String query12 = "select * from A4251_A4284 where study_id = '%s' order by id  desc LIMIT 1";
        String query13 = "select * from A4301_A4315 where study_id = '%s' order by id  desc LIMIT 1";
        String query14 = "select * from A4351_A4364 where study_id = '%s' order by id  desc LIMIT 1";
        String query15 = "select * from A4401_A4473 where study_id = '%s' order by id  desc LIMIT 1";
        String query16 = "select * from C3001_C3011 where study_id = '%s'  order by id  desc LIMIT 1";

        query1 = String.format(query1, Q1101_Q1610.study_id);
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

        //Cursor c = LocalDataManager.database.rawQuery(query, null);
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


        if (c1 != null) {
            if (c1.moveToFirst()) {
                param.put("tableName", "q1101_q1610");
                param.put("id", c1.getString(0));
                param.put(Q1101_Q1610.study_id, c1.getString(1));
                param.put(Q1101_Q1610.Q1101, c1.getString(2));
                param.put(Q1101_Q1610.Q1102, c1.getString(3));
                param.put(Q1101_Q1610.Q1103, c1.getString(4));
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


        if (c2 != null) {
            if (c2.moveToFirst()) {
                param.put("tableName", "a4001_a4014");
                param.put("id", c2.getString(0));
                param.put(A4001_A4014.study_id, c2.getString(1));
                param.put(A4001_A4014.A4001, c2.getString(2));
                param.put(A4001_A4014.A4002, c2.getString(3));
                param.put(A4001_A4014.A4003, c2.getString(4));
                param.put(A4001_A4014.A4004, c2.getString(5));
                param.put(A4001_A4014.A4005, c2.getString(6));
                param.put(A4001_A4014.A4006, c2.getString(7));
                param.put(A4001_A4014.A4007, c2.getString(8));
                param.put(A4001_A4014.A4007_1, c2.getString(9));
                param.put(A4001_A4014.A4008, c2.getString(10));
                param.put(A4001_A4014.A4009a, c2.getString(11));
                param.put(A4001_A4014.A4010, c2.getString(12));
                param.put(A4001_A4014.A4011, c2.getString(13));
                param.put(A4001_A4014.A4012, c2.getString(14));
                param.put(A4001_A4014.A4013u, c2.getString(15));
                param.put(A4001_A4014.A4013d, c2.getString(16));
                param.put(A4001_A4014.A4013m, c2.getString(17));
                param.put(A4001_A4014.A4013y, c2.getString(18));
                param.put(A4001_A4014.STATUS, c2.getString(19));
            }
        }

        if (c3 != null) {
            if (c3.moveToFirst()) {
                param.put("tableName", "a4051_a4066");
                param.put("id", c3.getString(0));
                param.put(A4051_A4066.study_id, c3.getString(1));
                param.put(A4051_A4066.A4051, c3.getString(2));
                param.put(A4051_A4066.A4052_u, c3.getString(3));
                param.put(A4051_A4066.A4052_b, c3.getString(4));
                param.put(A4051_A4066.A4052_c, c3.getString(5));
                param.put(A4051_A4066.A4053, c3.getString(6));
                param.put(A4051_A4066.A4054, c3.getString(7));
                param.put(A4051_A4066.A4055, c3.getString(8));
                param.put(A4051_A4066.A4056, c3.getString(9));
                param.put(A4051_A4066.A4057, c3.getString(10));
                param.put(A4051_A4066.A4058, c3.getString(11));
                param.put(A4051_A4066.A4059_u, c3.getString(12));
                param.put(A4051_A4066.A4059_a, c3.getString(13));
                param.put(A4051_A4066.A4059_b, c3.getString(14));
                param.put(A4051_A4066.A4060, c3.getString(15));
                param.put(A4051_A4066.A4061, c3.getString(16));
                param.put(A4051_A4066.A4062, c3.getString(17));
                param.put(A4051_A4066.A4063, c3.getString(18));
                param.put(A4051_A4066.A4064_u, c3.getString(19));
                param.put(A4051_A4066.A4064_a, c3.getString(20));
                param.put(A4051_A4066.A4064_b, c3.getString(21));
                param.put(A4051_A4066.A4064_1, c3.getString(22));
                param.put(A4051_A4066.A4065, c3.getString(23));
                param.put(A4051_A4066.A4066, c3.getString(24));
                param.put(A4051_A4066.STATUS, c3.getString(25));
            }
        }

        if (c16 != null) {
            if (c16.moveToFirst()) {

                param.put("tableName", "c3001_c3011");
                param.put("id", c16.getString(0));
                param.put(C3001_C3011.study_id, c16.getString(1));
                param.put(C3001_C3011.C3001, c16.getString(2));
                param.put(C3001_C3011.C3002, c16.getString(3));
                param.put(C3001_C3011.C3003, c16.getString(4));
                param.put(C3001_C3011.C3004, c16.getString(5));
                param.put(C3001_C3011.C3005u, c16.getString(6));
                param.put(C3001_C3011.C3005d, c16.getString(7));
                param.put(C3001_C3011.C3005w, c16.getString(8));
                param.put(C3001_C3011.C3005m, c16.getString(9));
                param.put(C3001_C3011.C3006, c16.getString(10));
                param.put(C3001_C3011.C3006_OT, c16.getString(11));
                param.put(C3001_C3011.C3008, c16.getString(12));
                param.put(C3001_C3011.C3008_OT, c16.getString(13));
                param.put(C3001_C3011.C3009_1, c16.getString(14));
                param.put(C3001_C3011.C3009_2, c16.getString(15));
                param.put(C3001_C3011.C3009_3, c16.getString(16));
                param.put(C3001_C3011.C3009_4, c16.getString(17));
                param.put(C3001_C3011.C3010, c16.getString(18));
                param.put(C3001_C3011.C3011, c16.getString(19));
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


            Toast.makeText(mContext, "Interivew Has ben Uploaded", Toast.LENGTH_SHORT).show();
            // new LocalDataManager(mContext).uploadInterview();

            // LogtableUpdates.UpdateLogStatusUpload(mContext,Validation.hfauploadid);

            update_status(param.get("id"));
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
            Toast.makeText(mContext,"Uploading failed at request 1", Toast.LENGTH_SHORT).show();
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
