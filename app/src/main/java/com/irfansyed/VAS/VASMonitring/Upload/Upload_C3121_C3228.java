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

import Global.C.C3001_C3011;
import Global.C.C3121_C3228;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_C3121_C3228 extends AsyncTask {

    public static ProgressDialog dialog;
    Context mContext;
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

    public Upload_C3121_C3228(Context context) {

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

        //region Query
        String query = "select * from C3121_C3228 where study_id = '"+ Q1101_Q1610.study_id_upload +"' order by id  desc LIMIT 1";


        query = String.format(query, Q1101_Q1610.study_id_upload);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "c3121_c3228");
                param.put(Q1101_Q1610.interviewType, String.valueOf(Q1101_Q1610.interviewType_upload));
                param.put(C3001_C3011.study_id, c.getString(c.getColumnIndex("study_id")));


                param.put(C3121_C3228.C3121 , c.getString(c.getColumnIndex("C3121")));
                param.put(C3121_C3228.C3122d , c.getString(c.getColumnIndex("C3122d")));
                param.put(C3121_C3228.C3122m , c.getString(c.getColumnIndex("C3122m")));
                param.put(C3121_C3228.C3123_u , c.getString(c.getColumnIndex("C3123_u")));
                param.put(C3121_C3228.C3123_b , c.getString(c.getColumnIndex("C3123_b")));
                param.put(C3121_C3228.C3123_c , c.getString(c.getColumnIndex("C3123_c")));
                param.put(C3121_C3228.C3124 , c.getString(c.getColumnIndex("C3124")));
                param.put(C3121_C3228.C3125 , c.getString(c.getColumnIndex("C3125")));
                param.put(C3121_C3228.C3126 , c.getString(c.getColumnIndex("C3126")));
                param.put(C3121_C3228.C3127 , c.getString(c.getColumnIndex("C3127")));
                param.put(C3121_C3228.C3128 , c.getString(c.getColumnIndex("C3128")));
                param.put(C3121_C3228.C3129 , c.getString(c.getColumnIndex("C3129")));
                param.put(C3121_C3228.C3130 , c.getString(c.getColumnIndex("C3130")));
                param.put(C3121_C3228.C3131 , c.getString(c.getColumnIndex("C3131")));
                param.put(C3121_C3228.C3132_u , c.getString(c.getColumnIndex("C3132_u")));
                param.put(C3121_C3228.C3132_a , c.getString(c.getColumnIndex("C3132_a")));
                param.put(C3121_C3228.C3132_b , c.getString(c.getColumnIndex("C3132_b")));
                param.put(C3121_C3228.C3133 , c.getString(c.getColumnIndex("C3133")));
                param.put(C3121_C3228.C3134 , c.getString(c.getColumnIndex("C3134")));
                param.put(C3121_C3228.C3135 , c.getString(c.getColumnIndex("C3135")));
                param.put(C3121_C3228.C3136 , c.getString(c.getColumnIndex("C3136")));
                param.put(C3121_C3228.C3137 , c.getString(c.getColumnIndex("C3137")));
                param.put(C3121_C3228.C3138 , c.getString(c.getColumnIndex("C3138")));
                param.put(C3121_C3228.C3139 , c.getString(c.getColumnIndex("C3139")));
                param.put(C3121_C3228.C3140 , c.getString(c.getColumnIndex("C3140")));
                param.put(C3121_C3228.C3141 , c.getString(c.getColumnIndex("C3141")));
                param.put(C3121_C3228.C3142 , c.getString(c.getColumnIndex("C3142")));
                param.put(C3121_C3228.C3143 , c.getString(c.getColumnIndex("C3143")));
                param.put(C3121_C3228.C3144_u , c.getString(c.getColumnIndex("C3144_u")));
                param.put(C3121_C3228.C3144 , c.getString(c.getColumnIndex("C3144")));
                param.put(C3121_C3228.C3144_a , c.getString(c.getColumnIndex("C3144_a")));
                param.put(C3121_C3228.C3144_b , c.getString(c.getColumnIndex("C3144_b")));
                param.put(C3121_C3228.C3145 , c.getString(c.getColumnIndex("C3145")));
                param.put(C3121_C3228.C3146 , c.getString(c.getColumnIndex("C3146")));
                param.put(C3121_C3228.C3147_u , c.getString(c.getColumnIndex("C3147_u")));
                param.put(C3121_C3228.C3147_a , c.getString(c.getColumnIndex("C3147_a")));
                param.put(C3121_C3228.C3147_b , c.getString(c.getColumnIndex("C3147_b")));
                param.put(C3121_C3228.C3148 , c.getString(c.getColumnIndex("C3148")));
                param.put(C3121_C3228.C3149 , c.getString(c.getColumnIndex("C3149")));
                param.put(C3121_C3228.C3150_u , c.getString(c.getColumnIndex("C3150_u")));
                param.put(C3121_C3228.C3150_a , c.getString(c.getColumnIndex("C3150_a")));
                param.put(C3121_C3228.C3150_b , c.getString(c.getColumnIndex("C3150_b")));
                param.put(C3121_C3228.C3151 , c.getString(c.getColumnIndex("C3151")));
                param.put(C3121_C3228.C3152_u , c.getString(c.getColumnIndex("C3152_u")));
                param.put(C3121_C3228.C3152_a , c.getString(c.getColumnIndex("C3152_a")));
                param.put(C3121_C3228.C3152_b , c.getString(c.getColumnIndex("C3152_b")));
                param.put(C3121_C3228.C3153 , c.getString(c.getColumnIndex("C3153")));
                param.put(C3121_C3228.C3154 , c.getString(c.getColumnIndex("C3154")));
                param.put(C3121_C3228.C3155 , c.getString(c.getColumnIndex("C3155")));
                param.put(C3121_C3228.C3156 , c.getString(c.getColumnIndex("C3156")));
                param.put(C3121_C3228.C3157 , c.getString(c.getColumnIndex("C3157")));
                param.put(C3121_C3228.C3158 , c.getString(c.getColumnIndex("C3158")));
                param.put(C3121_C3228.C3159_u , c.getString(c.getColumnIndex("C3159_u")));
                param.put(C3121_C3228.C3159_a , c.getString(c.getColumnIndex("C3159_a")));
                param.put(C3121_C3228.C3159_b , c.getString(c.getColumnIndex("C3159_b")));
                param.put(C3121_C3228.C3159_c , c.getString(c.getColumnIndex("C3159_c")));
                param.put(C3121_C3228.C3160 , c.getString(c.getColumnIndex("C3160")));
                param.put(C3121_C3228.C3161 , c.getString(c.getColumnIndex("C3161")));
                param.put(C3121_C3228.C3162d , c.getString(c.getColumnIndex("C3162d")));
                param.put(C3121_C3228.C3162m , c.getString(c.getColumnIndex("C3162m")));
                param.put(C3121_C3228.C3163_u , c.getString(c.getColumnIndex("C3163_u")));
                param.put(C3121_C3228.C3163_a , c.getString(c.getColumnIndex("C3163_a")));
                param.put(C3121_C3228.C3163_b , c.getString(c.getColumnIndex("C3163_b")));
                param.put(C3121_C3228.C3164 , c.getString(c.getColumnIndex("C3164")));
                param.put(C3121_C3228.C3165_u , c.getString(c.getColumnIndex("C3165_u")));
                param.put(C3121_C3228.C3165_a , c.getString(c.getColumnIndex("C3165_a")));
                param.put(C3121_C3228.C3165_b , c.getString(c.getColumnIndex("C3165_b")));
                param.put(C3121_C3228.C3166 , c.getString(c.getColumnIndex("C3166")));
                param.put(C3121_C3228.C3167 , c.getString(c.getColumnIndex("C3167")));
                param.put(C3121_C3228.C3168 , c.getString(c.getColumnIndex("C3168")));
                param.put(C3121_C3228.C3169 , c.getString(c.getColumnIndex("C3169")));
                param.put(C3121_C3228.C3170 , c.getString(c.getColumnIndex("C3170")));
                param.put(C3121_C3228.C3171 , c.getString(c.getColumnIndex("C3171")));
                param.put(C3121_C3228.C3172 , c.getString(c.getColumnIndex("C3172")));
                param.put(C3121_C3228.C3173 , c.getString(c.getColumnIndex("C3173")));
                param.put(C3121_C3228.C3174 , c.getString(c.getColumnIndex("C3174")));
                param.put(C3121_C3228.C3175_u , c.getString(c.getColumnIndex("C3175_u")));
                param.put(C3121_C3228.C3175_a , c.getString(c.getColumnIndex("C3175_a")));
                param.put(C3121_C3228.C3175_b , c.getString(c.getColumnIndex("C3175_b")));
                param.put(C3121_C3228.C3176 , c.getString(c.getColumnIndex("C3176")));
                param.put(C3121_C3228.C3177_u , c.getString(c.getColumnIndex("C3177_u")));
                param.put(C3121_C3228.C3177_a , c.getString(c.getColumnIndex("C3177_a")));
                param.put(C3121_C3228.C3177_b , c.getString(c.getColumnIndex("C3177_b")));
                param.put(C3121_C3228.C3178 , c.getString(c.getColumnIndex("C3178")));
                param.put(C3121_C3228.C3179_u , c.getString(c.getColumnIndex("C3179_u")));
                param.put(C3121_C3228.C3179_a , c.getString(c.getColumnIndex("C3179_a")));
                param.put(C3121_C3228.C3179_b , c.getString(c.getColumnIndex("C3179_b")));
                param.put(C3121_C3228.C3180 , c.getString(c.getColumnIndex("C3180")));
                param.put(C3121_C3228.C3181 , c.getString(c.getColumnIndex("C3181")));
                param.put(C3121_C3228.C3182 , c.getString(c.getColumnIndex("C3182")));
                param.put(C3121_C3228.C3183 , c.getString(c.getColumnIndex("C3183")));
                param.put(C3121_C3228.C3184 , c.getString(c.getColumnIndex("C3184")));
                param.put(C3121_C3228.C3185 , c.getString(c.getColumnIndex("C3185")));
                param.put(C3121_C3228.C3186_1 , c.getString(c.getColumnIndex("C3186_1")));
                param.put(C3121_C3228.C3186 , c.getString(c.getColumnIndex("C3186")));
                param.put(C3121_C3228.C3187 , c.getString(c.getColumnIndex("C3187")));
                param.put(C3121_C3228.C3188 , c.getString(c.getColumnIndex("C3188")));
                param.put(C3121_C3228.C3189 , c.getString(c.getColumnIndex("C3189")));
                param.put(C3121_C3228.C3190 , c.getString(c.getColumnIndex("C3190")));
                param.put(C3121_C3228.C3191 , c.getString(c.getColumnIndex("C3191")));
                param.put(C3121_C3228.C3192 , c.getString(c.getColumnIndex("C3192")));
                param.put(C3121_C3228.C3193_u , c.getString(c.getColumnIndex("C3193_u")));
                param.put(C3121_C3228.C3193_a , c.getString(c.getColumnIndex("C3193_a")));
                param.put(C3121_C3228.C3193_b , c.getString(c.getColumnIndex("C3193_b")));
                param.put(C3121_C3228.C3194 , c.getString(c.getColumnIndex("C3194")));
                param.put(C3121_C3228.C3195A , c.getString(c.getColumnIndex("C3195A")));
                param.put(C3121_C3228.C3195 , c.getString(c.getColumnIndex("C3195")));
                param.put(C3121_C3228.C3196 , c.getString(c.getColumnIndex("C3196")));
                param.put(C3121_C3228.C3197 , c.getString(c.getColumnIndex("C3197")));
                param.put(C3121_C3228.C3198 , c.getString(c.getColumnIndex("C3198")));
                param.put(C3121_C3228.C3199 , c.getString(c.getColumnIndex("C3199")));
                param.put(C3121_C3228.C3199_1 , c.getString(c.getColumnIndex("C3199_1")));
                param.put(C3121_C3228.C3200 , c.getString(c.getColumnIndex("C3200")));
                param.put(C3121_C3228.C3201_u , c.getString(c.getColumnIndex("C3201_u")));
                param.put(C3121_C3228.C3201_a , c.getString(c.getColumnIndex("C3201_a")));
                param.put(C3121_C3228.C3201_b , c.getString(c.getColumnIndex("C3201_b")));
                param.put(C3121_C3228.C3202 , c.getString(c.getColumnIndex("C3202")));
                param.put(C3121_C3228.C3203 , c.getString(c.getColumnIndex("C3203")));
                param.put(C3121_C3228.C3204_u , c.getString(c.getColumnIndex("C3204_u")));
                param.put(C3121_C3228.C3204_a , c.getString(c.getColumnIndex("C3204_a")));
                param.put(C3121_C3228.C3204_b , c.getString(c.getColumnIndex("C3204_b")));
                param.put(C3121_C3228.C3205 , c.getString(c.getColumnIndex("C3205")));
                param.put(C3121_C3228.C3206 , c.getString(c.getColumnIndex("C3206")));
                param.put(C3121_C3228.C3207 , c.getString(c.getColumnIndex("C3207")));
                param.put(C3121_C3228.C3208_u , c.getString(c.getColumnIndex("C3208_u")));
                param.put(C3121_C3228.C3208_a , c.getString(c.getColumnIndex("C3208_a")));
                param.put(C3121_C3228.C3208_b , c.getString(c.getColumnIndex("C3208_b")));
                param.put(C3121_C3228.C3209 , c.getString(c.getColumnIndex("C3209")));
                param.put(C3121_C3228.C3210 , c.getString(c.getColumnIndex("C3210")));
                param.put(C3121_C3228.C3212 , c.getString(c.getColumnIndex("C3212")));
                param.put(C3121_C3228.C3213 , c.getString(c.getColumnIndex("C3213")));
                param.put(C3121_C3228.C3214 , c.getString(c.getColumnIndex("C3214")));
                param.put(C3121_C3228.C3215 , c.getString(c.getColumnIndex("C3215")));
                param.put(C3121_C3228.C3216 , c.getString(c.getColumnIndex("C3216")));
                param.put(C3121_C3228.C3217 , c.getString(c.getColumnIndex("C3217")));
                param.put(C3121_C3228.C3218 , c.getString(c.getColumnIndex("C3218")));
                param.put(C3121_C3228.C3218_OT , c.getString(c.getColumnIndex("C3218_OT")));
                param.put(C3121_C3228.C3219 , c.getString(c.getColumnIndex("C3219")));
                param.put(C3121_C3228.C3220_u , c.getString(c.getColumnIndex("C3220_u")));
                param.put(C3121_C3228.C3220_a , c.getString(c.getColumnIndex("C3220_a")));
                param.put(C3121_C3228.C3220_b , c.getString(c.getColumnIndex("C3220_b")));
                param.put(C3121_C3228.C3221 , c.getString(c.getColumnIndex("C3221")));
                param.put(C3121_C3228.C3222 , c.getString(c.getColumnIndex("C3222")));
                param.put(C3121_C3228.C3223 , c.getString(c.getColumnIndex("C3223")));
                param.put(C3121_C3228.C3224 , c.getString(c.getColumnIndex("C3224")));
                param.put(C3121_C3228.C3225 , c.getString(c.getColumnIndex("C3225")));
                param.put(C3121_C3228.C3226 , c.getString(c.getColumnIndex("C3226")));
                param.put(C3121_C3228.C3227 , c.getString(c.getColumnIndex("C3227")));
                param.put(C3121_C3228.C3227_1 , c.getString(c.getColumnIndex("C3227_1")));
                param.put(C3121_C3228.C3227_2 , c.getString(c.getColumnIndex("C3227_2")));
                param.put(C3121_C3228.C3227_3 , c.getString(c.getColumnIndex("C3227_3")));
                param.put(C3121_C3228.C3227_4 , c.getString(c.getColumnIndex("C3227_4")));
                param.put(C3121_C3228.C3227_5 , c.getString(c.getColumnIndex("C3227_5")));
                param.put(C3121_C3228.C3227_6 , c.getString(c.getColumnIndex("C3227_6")));
                param.put(C3121_C3228.C3227_7 , c.getString(c.getColumnIndex("C3227_7")));
                param.put(C3121_C3228.C3227_8 , c.getString(c.getColumnIndex("C3227_8")));
                param.put(C3121_C3228.C3227_9 , c.getString(c.getColumnIndex("C3227_9")));
                param.put(C3121_C3228.C3227_10 , c.getString(c.getColumnIndex("C3227_10")));
                param.put(C3121_C3228.C3227_11 , c.getString(c.getColumnIndex("C3227_11")));
                param.put(C3121_C3228.C3227_12 , c.getString(c.getColumnIndex("C3227_12")));
                param.put(C3121_C3228.C3227_13 , c.getString(c.getColumnIndex("C3227_13")));
                param.put(C3121_C3228.C3227_14 , c.getString(c.getColumnIndex("C3227_14")));
                param.put(C3121_C3228.C3227_15 , c.getString(c.getColumnIndex("C3227_15")));
                param.put(C3121_C3228.C3227_16 , c.getString(c.getColumnIndex("C3227_16")));
                param.put(C3121_C3228.C3227_17 , c.getString(c.getColumnIndex("C3227_17")));
                param.put(C3121_C3228.C3227_18 , c.getString(c.getColumnIndex("C3227_18")));
                param.put(C3121_C3228.C3227_19 , c.getString(c.getColumnIndex("C3227_19")));
                param.put(C3121_C3228.C3227_20 , c.getString(c.getColumnIndex("C3227_20")));
                param.put(C3121_C3228.C3227_21 , c.getString(c.getColumnIndex("C3227_21")));
                param.put(C3121_C3228.C3227_22 , c.getString(c.getColumnIndex("C3227_22")));
                param.put(C3121_C3228.C3228 , c.getString(c.getColumnIndex("C3228")));


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

    @Override
    protected void onPostExecute(Object o) {

        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();

            String result = (((String) o).replace("\"", ""));

            Toast.makeText(mContext, "C3001 to C3011 is Uploaded", Toast.LENGTH_SHORT).show();

            new Upload_C3301_C3314(mContext).execute();

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
            Toast.makeText(mContext, "Uploading failed at request a4001_a4014 section", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
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
}
