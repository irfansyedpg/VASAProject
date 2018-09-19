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
                //param.put(Q1101_Q1610.Q1101, c1.getString(2));
                //param.put(Q1101_Q1610.Q1102, c1.getString(3));
                //param.put(Q1101_Q1610.Q1103, c1.getString(4));
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

        if (c4 != null) {
            if (c4.moveToFirst()) {
                param.put("tableName", "a4067_a4080");
                param.put("id", c4.getString(0));
                param.put(A4067_A4080.study_id, c4.getString(1));
                param.put(A4067_A4080.A4067, c4.getString(2));
                param.put(A4067_A4080.A4068, c4.getString(3));
                param.put(A4067_A4080.A4069_u, c4.getString(4));
                param.put(A4067_A4080.A4069_a, c4.getString(5));
                param.put(A4067_A4080.A4069_b, c4.getString(6));
                param.put(A4067_A4080.A4069_c, c4.getString(7));
                param.put(A4067_A4080.A4070, c4.getString(8));
                param.put(A4067_A4080.A4071, c4.getString(9));
                param.put(A4067_A4080.A4072_u, c4.getString(10));
                param.put(A4067_A4080.A4072_a, c4.getString(11));
                param.put(A4067_A4080.A4072_b, c4.getString(12));
                param.put(A4067_A4080.A4073, c4.getString(13));
                param.put(A4067_A4080.A4074, c4.getString(14));
                param.put(A4067_A4080.A4075_u, c4.getString(15));
                param.put(A4067_A4080.A4075_a, c4.getString(16));
                param.put(A4067_A4080.A4075_b, c4.getString(17));
                param.put(A4067_A4080.A4076, c4.getString(18));
                param.put(A4067_A4080.A4077_u, c4.getString(19));
                param.put(A4067_A4080.A4077_a, c4.getString(20));
                param.put(A4067_A4080.A4077_b, c4.getString(21));
                param.put(A4067_A4080.A4078, c4.getString(22));
                param.put(A4067_A4080.A4079, c4.getString(23));
                param.put(A4067_A4080.A4080, c4.getString(24));
                param.put(A4067_A4080.STATUS, c4.getString(25));
            }

        }

        if (c5 != null) {
            if (c5.moveToFirst()) {
                param.put("tableName", "a4081_a4094");
                param.put("id", c5.getString(0));
                param.put(A4081_A4094.study_id, c5.getString(1));
                param.put(A4081_A4094.A4081, c5.getString(2));
                param.put(A4081_A4094.A4082_u, c5.getString(3));
                param.put(A4081_A4094.A4082_a, c5.getString(4));
                param.put(A4081_A4094.A4082_b, c5.getString(5));
                param.put(A4081_A4094.A4082_c, c5.getString(6));
                param.put(A4081_A4094.A4083, c5.getString(7));
                param.put(A4081_A4094.A4084, c5.getString(8));
                param.put(A4081_A4094.A4085_u, c5.getString(9));
                param.put(A4081_A4094.A4085_a, c5.getString(10));
                param.put(A4081_A4094.A4085_b, c5.getString(11));
                param.put(A4081_A4094.A4086, c5.getString(12));
                param.put(A4081_A4094.A4087_u, c5.getString(13));
                param.put(A4081_A4094.A4087_a, c5.getString(14));
                param.put(A4081_A4094.A4087_b, c5.getString(15));
                param.put(A4081_A4094.A4088, c5.getString(16));
                param.put(A4081_A4094.A4089, c5.getString(17));
                param.put(A4081_A4094.A4090, c5.getString(18));
                param.put(A4081_A4094.A4091, c5.getString(19));
                param.put(A4081_A4094.A4092, c5.getString(20));
                param.put(A4081_A4094.A4093, c5.getString(21));
                param.put(A4081_A4094.A4094_u, c5.getString(22));
                param.put(A4081_A4094.A4094_a, c5.getString(23));
                param.put(A4081_A4094.A4094_b, c5.getString(24));
                param.put(A4081_A4094.A4094_c, c5.getString(25));
                param.put(A4081_A4094.STATUS, c5.getString(26));
            }

        }

        if (c6 != null) {
            if (c6.moveToFirst()) {
                param.put("tableName", "a4095_a4108");
                param.put("id", c6.getString(0));
                param.put(A4095_A4108.study_id, c6.getString(1));
                param.put(A4095_A4108.A4095, c6.getString(2));
                param.put(A4095_A4108.A4096, c6.getString(3));
                param.put(A4095_A4108.A4097_u, c6.getString(4));
                param.put(A4095_A4108.A4097_a, c6.getString(5));
                param.put(A4095_A4108.A4097_b, c6.getString(6));
                param.put(A4095_A4108.A4098, c6.getString(7));
                param.put(A4095_A4108.A4099_u, c6.getString(8));
                param.put(A4095_A4108.A4099_a, c6.getString(9));
                param.put(A4095_A4108.A4099_b, c6.getString(10));
                param.put(A4095_A4108.A4100, c6.getString(11));
                param.put(A4095_A4108.A4101_u, c6.getString(12));
                param.put(A4095_A4108.A4101_a, c6.getString(13));
                param.put(A4095_A4108.A4101_b, c6.getString(14));
                param.put(A4095_A4108.A4102, c6.getString(15));
                param.put(A4095_A4108.A4103, c6.getString(16));
                param.put(A4095_A4108.A4104, c6.getString(17));
                param.put(A4095_A4108.A4105, c6.getString(18));
                param.put(A4095_A4108.A4106, c6.getString(19));
                param.put(A4095_A4108.A4107, c6.getString(20));
                param.put(A4095_A4108.A4108, c6.getString(21));
                param.put(A4095_A4108.STATUS, c6.getString(22));
            }

        }

        if (c7 != null) {
            if (c7.moveToFirst()) {
                param.put("tableName", "a4109_a4125");
                param.put("id", c7.getString(0));
                param.put(A4109_A4125.study_id, c7.getString(1));
                param.put(A4109_A4125.A4109, c7.getString(2));
                param.put(A4109_A4125.A4110, c7.getString(3));
                param.put(A4109_A4125.A4111, c7.getString(4));
                param.put(A4109_A4125.A4112, c7.getString(5));
                param.put(A4109_A4125.A4113, c7.getString(6));
                param.put(A4109_A4125.A4114, c7.getString(7));
                param.put(A4109_A4125.A4115, c7.getString(8));
                param.put(A4109_A4125.A4116, c7.getString(9));
                param.put(A4109_A4125.A4117_u, c7.getString(10));
                param.put(A4109_A4125.A4117_a, c7.getString(11));
                param.put(A4109_A4125.A4117_b, c7.getString(12));
                param.put(A4109_A4125.A4118, c7.getString(13));
                param.put(A4109_A4125.A4119, c7.getString(14));
                param.put(A4109_A4125.A4120, c7.getString(15));
                param.put(A4109_A4125.A4121, c7.getString(16));
                param.put(A4109_A4125.A4122, c7.getString(17));
                param.put(A4109_A4125.A4123, c7.getString(18));
                param.put(A4109_A4125.A4124, c7.getString(19));
                param.put(A4109_A4125.A4125, c7.getString(20));
                param.put(A4109_A4125.STATUS, c7.getString(21));
            }

        }


        if (c8 != null) {
            if (c8.moveToFirst()) {
                param.put("tableName", "a4126_a4140");
                param.put("id", c8.getString(0));
                param.put(A4126_A4140.study_id, c8.getString(1));
                param.put(A4126_A4140.A4126, c8.getString(2));
                param.put(A4126_A4140.A4127_u, c8.getString(3));
                param.put(A4126_A4140.A4127_a, c8.getString(4));
                param.put(A4126_A4140.A4127_b, c8.getString(5));
                param.put(A4126_A4140.A4128, c8.getString(6));
                param.put(A4126_A4140.A4129, c8.getString(7));
                param.put(A4126_A4140.A4130_u, c8.getString(8));
                param.put(A4126_A4140.A4130_a, c8.getString(9));
                param.put(A4126_A4140.A4130_b, c8.getString(10));
                param.put(A4126_A4140.A4131, c8.getString(11));
                param.put(A4126_A4140.A4132, c8.getString(12));
                param.put(A4126_A4140.A4133, c8.getString(13));
                param.put(A4126_A4140.A4134_u, c8.getString(14));
                param.put(A4126_A4140.A4134_a, c8.getString(15));
                param.put(A4126_A4140.A4134_b, c8.getString(16));
                param.put(A4126_A4140.A4135, c8.getString(17));
                param.put(A4126_A4140.A4136, c8.getString(18));
                param.put(A4126_A4140.A4138, c8.getString(19));
                param.put(A4126_A4140.A4139, c8.getString(20));
                param.put(A4126_A4140.A4140, c8.getString(21));
                param.put(A4126_A4140.STATUS, c8.getString(22));
            }

        }


        if (c9 != null) {
            if (c9.moveToFirst()) {
                param.put("tableName", "a4144_a4156");
                param.put("id", c9.getString(0));
                param.put(A4144_A4156.study_id, c9.getString(1));
                param.put(A4144_A4156.A4144, c9.getString(2));
                param.put(A4144_A4156.A4145, c9.getString(3));
                param.put(A4144_A4156.A4146, c9.getString(4));
                param.put(A4144_A4156.A4147, c9.getString(5));
                param.put(A4144_A4156.A4148, c9.getString(6));
                param.put(A4144_A4156.A4149, c9.getString(7));
                param.put(A4144_A4156.A4150_u, c9.getString(8));
                param.put(A4144_A4156.A4150_a, c9.getString(9));
                param.put(A4144_A4156.A4150_b, c9.getString(10));
                param.put(A4144_A4156.A4151, c9.getString(11));
                param.put(A4144_A4156.A4152, c9.getString(12));
                param.put(A4144_A4156.A4153, c9.getString(13));
                param.put(A4144_A4156.A4154, c9.getString(14));
                param.put(A4144_A4156.A4155, c9.getString(15));
                param.put(A4144_A4156.A4156, c9.getString(16));
                param.put(A4144_A4156.STATUS, c9.getString(17));
            }

        }


        if (c10 != null) {
            if (c10.moveToFirst()) {
                param.put("tableName", "a4157_a4205");
                param.put("id", c10.getString(0));
                param.put(A4157_A4205.study_id, c10.getString(1));
                param.put(A4157_A4205.A4157, c10.getString(2));
                param.put(A4157_A4205.A4158, c10.getString(3));
                param.put(A4157_A4205.A4159, c10.getString(4));
                param.put(A4157_A4205.A4160, c10.getString(5));
                param.put(A4157_A4205.A4161, c10.getString(6));
                param.put(A4157_A4205.A4161_1, c10.getString(7));
                param.put(A4157_A4205.A4162, c10.getString(8));
                param.put(A4157_A4205.A4163_1, c10.getString(9));
                param.put(A4157_A4205.A4163, c10.getString(10));
                param.put(A4157_A4205.A4164, c10.getString(11));
                param.put(A4157_A4205.A4166, c10.getString(12));
                param.put(A4157_A4205.A4167, c10.getString(13));
                param.put(A4157_A4205.A4168_1, c10.getString(14));
                param.put(A4157_A4205.A4168_3, c10.getString(15));
                param.put(A4157_A4205.A4168, c10.getString(16));
                param.put(A4157_A4205.A4173_1, c10.getString(17));
                param.put(A4157_A4205.A4173, c10.getString(18));
                param.put(A4157_A4205.A4173_2, c10.getString(19));
                param.put(A4157_A4205.A4178_1, c10.getString(20));
                param.put(A4157_A4205.A4178_2, c10.getString(21));
                param.put(A4157_A4205.A4178, c10.getString(22));
                param.put(A4157_A4205.A4179, c10.getString(23));
                param.put(A4157_A4205.A4180, c10.getString(24));
                param.put(A4157_A4205.A4181, c10.getString(25));
                param.put(A4157_A4205.A4182, c10.getString(26));
                param.put(A4157_A4205.A4183, c10.getString(27));
                param.put(A4157_A4205.A4184, c10.getString(28));
                param.put(A4157_A4205.A4185, c10.getString(29));
                param.put(A4157_A4205.A4186, c10.getString(30));
                param.put(A4157_A4205.A4186_1, c10.getString(31));
                param.put(A4157_A4205.A4187, c10.getString(32));
                param.put(A4157_A4205.A4188, c10.getString(33));
                param.put(A4157_A4205.A4189, c10.getString(34));
                param.put(A4157_A4205.A4190, c10.getString(35));
                param.put(A4157_A4205.A4191, c10.getString(36));
                param.put(A4157_A4205.A4192, c10.getString(37));
                param.put(A4157_A4205.A4193, c10.getString(38));
                param.put(A4157_A4205.A4193_1, c10.getString(39));
                param.put(A4157_A4205.A4194, c10.getString(40));
                param.put(A4157_A4205.A4195, c10.getString(41));
                param.put(A4157_A4205.A4196, c10.getString(42));
                param.put(A4157_A4205.A4197, c10.getString(43));
                param.put(A4157_A4205.A4198_1, c10.getString(44));
                param.put(A4157_A4205.A4198, c10.getString(45));
                param.put(A4157_A4205.A4200, c10.getString(46));
                param.put(A4157_A4205.A4202, c10.getString(47));
                param.put(A4157_A4205.A4203, c10.getString(48));
                param.put(A4157_A4205.A4204, c10.getString(49));
                param.put(A4157_A4205.A4205, c10.getString(50));
                param.put(A4157_A4205.A4205_1, c10.getString(51));
                param.put(A4157_A4205.STATUS, c10.getString(52));
            }

        }


        if (c11 != null) {
            if (c11.moveToFirst()) {
                param.put("tableName", "a4206_a4207");
                param.put("id", c11.getString(0));
                param.put(A4206_A4207.study_id, c11.getString(1));
                param.put(A4206_A4207.A4206, c11.getString(2));
                param.put(A4206_A4207.A4206_1, c11.getString(3));
                param.put(A4206_A4207.A4206_2, c11.getString(4));
                param.put(A4206_A4207.A4206_3, c11.getString(5));
                param.put(A4206_A4207.A4206_4, c11.getString(6));
                param.put(A4206_A4207.A4206_5, c11.getString(7));
                param.put(A4206_A4207.A4206_6, c11.getString(8));
                param.put(A4206_A4207.A4206_7, c11.getString(9));
                param.put(A4206_A4207.A4206_8, c11.getString(10));
                param.put(A4206_A4207.A4206_9, c11.getString(11));
                param.put(A4206_A4207.A4206_10, c11.getString(12));
                param.put(A4206_A4207.A4206_11, c11.getString(13));
                param.put(A4206_A4207.A4206_12, c11.getString(14));
                param.put(A4206_A4207.A4206_13, c11.getString(15));
                param.put(A4206_A4207.A4206_14, c11.getString(16));
                param.put(A4206_A4207.A4206_15, c11.getString(17));
                param.put(A4206_A4207.A4206_16, c11.getString(18));
                param.put(A4206_A4207.A4206_17, c11.getString(19));
                param.put(A4206_A4207.A4206_18, c11.getString(20));
                param.put(A4206_A4207.A4206_19, c11.getString(21));
                param.put(A4206_A4207.A4206_20, c11.getString(22));
                param.put(A4206_A4207.A4206_21, c11.getString(23));
                param.put(A4206_A4207.A4206_22, c11.getString(24));
                param.put(A4206_A4207.A4207, c11.getString(25));
                param.put(A4206_A4207.STATUS, c11.getString(26));
            }

        }

        if (c12 != null) {
            if (c12.moveToFirst()) {
                param.put("tableName", "a4251_a4284");
                param.put("id", c12.getString(0));
                param.put(A4251_A4284.study_id, c12.getString(1));
                param.put(A4251_A4284.A4251, c12.getString(2));
                param.put(A4251_A4284.A4253, c12.getString(3));
                param.put(A4251_A4284.A4253_3, c12.getString(4));
                param.put(A4251_A4284.A4254_1, c12.getString(5));
                param.put(A4251_A4284.A4254_2, c12.getString(6));
                param.put(A4251_A4284.A4255_1, c12.getString(7));
                param.put(A4251_A4284.A4255_2, c12.getString(8));
                param.put(A4251_A4284.A4255_3, c12.getString(9));
                param.put(A4251_A4284.A4255_4, c12.getString(10));
                param.put(A4251_A4284.A4255_4_OT, c12.getString(11));
                param.put(A4251_A4284.A4255_5, c12.getString(12));
                param.put(A4251_A4284.A4255_6, c12.getString(13));
                param.put(A4251_A4284.A4255_7, c12.getString(14));
                param.put(A4251_A4284.A4255_8, c12.getString(15));
                param.put(A4251_A4284.A4255_9, c12.getString(16));
                param.put(A4251_A4284.A4255_10, c12.getString(17));
                param.put(A4251_A4284.A4255_11, c12.getString(18));
                param.put(A4251_A4284.A4255_12, c12.getString(19));
                param.put(A4251_A4284.A4255_13, c12.getString(20));
                param.put(A4251_A4284.A4255_13_OT, c12.getString(21));
                param.put(A4251_A4284.A4255_DK, c12.getString(22));
                param.put(A4251_A4284.A4256_minutes, c12.getString(23));
                param.put(A4251_A4284.A4256_hours, c12.getString(24));
                param.put(A4251_A4284.A4256_days, c12.getString(25));
                param.put(A4251_A4284.A4257, c12.getString(26));
                param.put(A4251_A4284.A4257_name, c12.getString(27));
                param.put(A4251_A4284.A4258_1, c12.getString(28));
                param.put(A4251_A4284.A4258_2, c12.getString(29));
                param.put(A4251_A4284.A4259_hours, c12.getString(30));
                param.put(A4251_A4284.A4259_minutes, c12.getString(31));
                param.put(A4251_A4284.A4260, c12.getString(32));
                param.put(A4251_A4284.A4261, c12.getString(33));
                param.put(A4251_A4284.A4262, c12.getString(34));
                param.put(A4251_A4284.A4262_name, c12.getString(35));
                param.put(A4251_A4284.A4263_1, c12.getString(36));
                param.put(A4251_A4284.A4263_2, c12.getString(37));
                param.put(A4251_A4284.A4264, c12.getString(38));
                param.put(A4251_A4284.A4266, c12.getString(39));
                param.put(A4251_A4284.A4266_name, c12.getString(40));
                param.put(A4251_A4284.A4267_1, c12.getString(41));
                param.put(A4251_A4284.A4267_2, c12.getString(42));
                param.put(A4251_A4284.A4268_hours, c12.getString(43));
                param.put(A4251_A4284.A4268_minutes, c12.getString(44));
                param.put(A4251_A4284.A4269, c12.getString(45));
                param.put(A4251_A4284.A4270, c12.getString(46));
                param.put(A4251_A4284.A4271, c12.getString(47));
                param.put(A4251_A4284.A4271_name, c12.getString(48));
                param.put(A4251_A4284.A4272_1, c12.getString(49));
                param.put(A4251_A4284.A4272_2, c12.getString(50));
                param.put(A4251_A4284.A4273, c12.getString(51));
                param.put(A4251_A4284.A4274, c12.getString(52));
                param.put(A4251_A4284.A4275, c12.getString(53));
                param.put(A4251_A4284.A4276_1, c12.getString(54));
                param.put(A4251_A4284.A4276_2, c12.getString(55));
                param.put(A4251_A4284.A4276_3, c12.getString(56));
                param.put(A4251_A4284.A4276_4, c12.getString(57));
                param.put(A4251_A4284.A4276_5, c12.getString(58));
                param.put(A4251_A4284.A4276_5_OT, c12.getString(59));
                param.put(A4251_A4284.A4276_6, c12.getString(60));
                param.put(A4251_A4284.A4276_7, c12.getString(61));
                param.put(A4251_A4284.A4276_8, c12.getString(62));
                param.put(A4251_A4284.A4276_9, c12.getString(63));
                param.put(A4251_A4284.A4276_10, c12.getString(64));
                param.put(A4251_A4284.A4276_11, c12.getString(65));
                param.put(A4251_A4284.A4276_12, c12.getString(66));
                param.put(A4251_A4284.A4276_13, c12.getString(67));
                param.put(A4251_A4284.A4276_14, c12.getString(68));
                param.put(A4251_A4284.A4276_15, c12.getString(69));
                param.put(A4251_A4284.A4276_16, c12.getString(70));
                param.put(A4251_A4284.A4276_16_OT, c12.getString(71));
                param.put(A4251_A4284.A4276_DK, c12.getString(72));
                param.put(A4251_A4284.A4277, c12.getString(73));
                param.put(A4251_A4284.A4278_1, c12.getString(74));
                param.put(A4251_A4284.A4278_2, c12.getString(75));
                param.put(A4251_A4284.A4278_3, c12.getString(76));
                param.put(A4251_A4284.A4278_4, c12.getString(77));
                param.put(A4251_A4284.A4278_5, c12.getString(78));
                param.put(A4251_A4284.A4278_6, c12.getString(79));
                param.put(A4251_A4284.A4278_7, c12.getString(80));
                param.put(A4251_A4284.A4278_DK, c12.getString(81));
                param.put(A4251_A4284.A4279_1, c12.getString(82));
                param.put(A4251_A4284.A4279_2, c12.getString(83));
                param.put(A4251_A4284.A4279_3, c12.getString(84));
                param.put(A4251_A4284.A4279_4, c12.getString(85));
                param.put(A4251_A4284.A4279_5, c12.getString(86));
                param.put(A4251_A4284.A4279_6, c12.getString(87));
                param.put(A4251_A4284.A4279_7, c12.getString(88));
                param.put(A4251_A4284.A4279_DK, c12.getString(89));
                param.put(A4251_A4284.A4280, c12.getString(90));
                param.put(A4251_A4284.A4281, c12.getString(91));
                param.put(A4251_A4284.A4282, c12.getString(92));
                param.put(A4251_A4284.A4283, c12.getString(93));
                param.put(A4251_A4284.A4284, c12.getString(94));
                param.put(A4251_A4284.STATUS, c12.getString(95));

            }

        }

        if (c13 != null) {
            if (c13.moveToFirst()) {
                param.put("tableName", "a4301_a4315");
                param.put("id", c13.getString(0));
                param.put(A4301_A4315.study_id, c13.getString(1));
                param.put(A4301_A4315.A4301, c13.getString(2));
                param.put(A4301_A4315.A4302_1, c13.getString(3));
                param.put(A4301_A4315.A4302_2, c13.getString(4));
                param.put(A4301_A4315.A4302_3, c13.getString(5));
                param.put(A4301_A4315.A4302_4, c13.getString(6));
                param.put(A4301_A4315.A4302_5, c13.getString(7));
                param.put(A4301_A4315.A4302_6, c13.getString(8));
                param.put(A4301_A4315.A4302_7, c13.getString(9));
                param.put(A4301_A4315.A4303, c13.getString(10));
                param.put(A4301_A4315.A4304, c13.getString(11));
                param.put(A4301_A4315.A4305, c13.getString(12));
                param.put(A4301_A4315.A4306_1check, c13.getString(13));
                param.put(A4301_A4315.A4306_1, c13.getString(14));
                param.put(A4301_A4315.A4306_2check, c13.getString(15));
                param.put(A4301_A4315.A4306_2, c13.getString(16));
                param.put(A4301_A4315.A4307, c13.getString(17));
                param.put(A4301_A4315.A4308, c13.getString(18));
                param.put(A4301_A4315.A4309, c13.getString(19));
                param.put(A4301_A4315.A4310_1, c13.getString(20));
                param.put(A4301_A4315.A4310_2, c13.getString(21));
                param.put(A4301_A4315.A4310_3, c13.getString(22));
                param.put(A4301_A4315.A4310_4, c13.getString(23));
                param.put(A4301_A4315.A4310_5, c13.getString(24));
                param.put(A4301_A4315.A4310_6, c13.getString(25));
                param.put(A4301_A4315.A4310_7, c13.getString(26));
                param.put(A4301_A4315.A4310_8, c13.getString(27));
                param.put(A4301_A4315.A4310_9, c13.getString(28));
                param.put(A4301_A4315.A4310_10, c13.getString(29));
                param.put(A4301_A4315.A4310_11, c13.getString(30));
                param.put(A4301_A4315.A4311_1, c13.getString(31));
                param.put(A4301_A4315.A4311_2, c13.getString(32));
                param.put(A4301_A4315.A4311_3, c13.getString(33));
                param.put(A4301_A4315.A4311_4, c13.getString(34));
                param.put(A4301_A4315.A4311_5, c13.getString(35));
                param.put(A4301_A4315.A4312, c13.getString(36));
                param.put(A4301_A4315.A4313, c13.getString(37));
                param.put(A4301_A4315.A4314, c13.getString(38));
                param.put(A4301_A4315.A4315, c13.getString(39));
                param.put(A4301_A4315.STATUS, c13.getString(40));

            }

        }

        if (c14 != null) {
            if (c14.moveToFirst()) {
                param.put("tableName", "a4351_a4364");
                param.put("id", c14.getString(0));
                param.put(A4351_A4364.study_id, c14.getString(1));
                param.put(A4351_A4364.A4351, c14.getString(2));
                param.put(A4351_A4364.A4352, c14.getString(3));
                param.put(A4351_A4364.A4353, c14.getString(4));
                param.put(A4351_A4364.A4354, c14.getString(5));
                param.put(A4351_A4364.A4355, c14.getString(6));
                param.put(A4351_A4364.A4356, c14.getString(7));
                param.put(A4351_A4364.A4357, c14.getString(8));
                param.put(A4351_A4364.A4358, c14.getString(9));
                param.put(A4351_A4364.A4363, c14.getString(10));
                param.put(A4351_A4364.A4364, c14.getString(11));
                param.put(A4351_A4364.STATUS, c14.getString(12));

            }

        }

        if (c15 != null) {
            if (c15.moveToFirst()) {
                param.put("tableName", "a4401_a4473");
                param.put("id", c15.getString(0));
                param.put(A4401_A4473.study_id, c15.getString(1));
                param.put(A4401_A4473.A4401, c15.getString(2));
                param.put(A4401_A4473.A4402, c15.getString(3));
                param.put(A4401_A4473.A4402_5_OT, c15.getString(4));
                param.put(A4401_A4473.A4403_province, c15.getString(5));
                param.put(A4401_A4473.A4403_district, c15.getString(6));
                param.put(A4401_A4473.A4404_years, c15.getString(7));
                param.put(A4401_A4473.A4405_hours, c15.getString(8));
                param.put(A4401_A4473.A4405_minutes, c15.getString(9));
                param.put(A4401_A4473.A4451_1, c15.getString(10));
                param.put(A4401_A4473.A4451_2, c15.getString(11));
                param.put(A4401_A4473.A4451_3, c15.getString(12));
                param.put(A4401_A4473.A4451_4, c15.getString(13));
                param.put(A4401_A4473.A4451_5, c15.getString(14));
                param.put(A4401_A4473.A4451_6, c15.getString(15));
                param.put(A4401_A4473.A4451_7, c15.getString(16));
                param.put(A4401_A4473.A4451_8, c15.getString(17));
                param.put(A4401_A4473.A4451_9, c15.getString(18));
                param.put(A4401_A4473.A4451_10, c15.getString(19));
                param.put(A4401_A4473.A4451_11, c15.getString(20));
                param.put(A4401_A4473.A4451_12, c15.getString(21));
                param.put(A4401_A4473.A4451_13, c15.getString(22));
                param.put(A4401_A4473.A4451_13_OT, c15.getString(23));
                param.put(A4401_A4473.A4451_code, c15.getString(24));
                param.put(A4401_A4473.A4452_1, c15.getString(25));
                param.put(A4401_A4473.A4452_2, c15.getString(26));
                param.put(A4401_A4473.A4452_3, c15.getString(27));
                param.put(A4401_A4473.A4452_4, c15.getString(28));
                param.put(A4401_A4473.A4452_5, c15.getString(29));
                param.put(A4401_A4473.A4452_6, c15.getString(30));
                param.put(A4401_A4473.A4452_7, c15.getString(31));
                param.put(A4401_A4473.A4452_8, c15.getString(32));
                param.put(A4401_A4473.A4452_9, c15.getString(33));
                param.put(A4401_A4473.A4452_9_OT, c15.getString(34));
                param.put(A4401_A4473.A4452_code, c15.getString(35));
                param.put(A4401_A4473.A4453_1, c15.getString(36));
                param.put(A4401_A4473.A4453_2, c15.getString(37));
                param.put(A4401_A4473.A4453_3, c15.getString(38));
                param.put(A4401_A4473.A4453_4, c15.getString(39));
                param.put(A4401_A4473.A4453_5, c15.getString(40));
                param.put(A4401_A4473.A4453_6, c15.getString(41));
                param.put(A4401_A4473.A4453_7, c15.getString(42));
                param.put(A4401_A4473.A4453_8, c15.getString(43));
                param.put(A4401_A4473.A4453_9, c15.getString(44));
                param.put(A4401_A4473.A4453_10, c15.getString(45));
                param.put(A4401_A4473.A4453_11, c15.getString(46));
                param.put(A4401_A4473.A4453_12, c15.getString(47));
                param.put(A4401_A4473.A4453_12_OT, c15.getString(48));
                param.put(A4401_A4473.A4453_code, c15.getString(49));
                param.put(A4401_A4473.A4454, c15.getString(50));
                param.put(A4401_A4473.A4455, c15.getString(51));
                param.put(A4401_A4473.A4456, c15.getString(52));
                param.put(A4401_A4473.A4457, c15.getString(53));
                param.put(A4401_A4473.A4471, c15.getString(54));
                param.put(A4401_A4473.A4472_1, c15.getString(55));
                param.put(A4401_A4473.A4472_2, c15.getString(56));
                param.put(A4401_A4473.A4472_3, c15.getString(57));
                param.put(A4401_A4473.A4472_4, c15.getString(58));
                param.put(A4401_A4473.A4472_5, c15.getString(59));
                param.put(A4401_A4473.A4472_6, c15.getString(60));
                param.put(A4401_A4473.A4472_7, c15.getString(61));
                param.put(A4401_A4473.A4472_8, c15.getString(62));
                param.put(A4401_A4473.A4472_9, c15.getString(63));
                param.put(A4401_A4473.A4472_10, c15.getString(64));
                param.put(A4401_A4473.A4472_11, c15.getString(65));
                param.put(A4401_A4473.A4472_12, c15.getString(66));
                param.put(A4401_A4473.A4472_DK, c15.getString(67));
                param.put(A4401_A4473.A4473, c15.getString(68));
                param.put(A4401_A4473.STATUS, c15.getString(69));

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
