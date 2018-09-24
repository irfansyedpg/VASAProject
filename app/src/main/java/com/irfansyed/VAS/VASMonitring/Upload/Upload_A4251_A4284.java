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

import Global.A.A4251_A4284;
import Global.GS.Q1101_Q1610;
import data.LocalDataManager;
import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class Upload_A4251_A4284 extends AsyncTask {

    Context mContext;
    public static ProgressDialog dialog;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;

    public Upload_A4251_A4284(Context context) {

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
        String query1 = "select * from A4251_A4284 where study_id = '%s' order by id  desc LIMIT 1";


        query1 = String.format(query1, Q1101_Q1610.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);


        Cursor c1 = LocalDataManager.database.rawQuery(query1, null);



        if (c1 != null) {
            if (c1.moveToFirst()) {
                param.put("tableName", "a4251_a4284");

                param.put(A4251_A4284.	study_id 	, c1.getString(	0	));
                param.put(A4251_A4284.	A4251	, c1.getString(	1	));
                param.put(A4251_A4284.	A4253	, c1.getString(	2	));
                param.put(A4251_A4284.	A4253_3 	, c1.getString(	3	));
              //  param.put(A4251_A4284.	A4254	, c1.getString(	4	));
                param.put(A4251_A4284.	A4255_1 	, c1.getString(	5	));
                param.put(A4251_A4284.	A4255_2 	, c1.getString(	6	));
                param.put(A4251_A4284.	A4255_3 	, c1.getString(	7	));
                param.put(A4251_A4284.	A4255_4 	, c1.getString(	8	));
                param.put(A4251_A4284.	A4255_4_OT 	, c1.getString(	9	));
                param.put(A4251_A4284.	A4255_5	, c1.getString(	10	));
                param.put(A4251_A4284.	A4255_6	, c1.getString(	11	));
                param.put(A4251_A4284.	A4255_7	, c1.getString(	12	));
                param.put(A4251_A4284.	A4255_8	, c1.getString(	13	));
                param.put(A4251_A4284.	A4255_9	, c1.getString(	14	));
                param.put(A4251_A4284.	A4255_10 	, c1.getString(	15	));
                param.put(A4251_A4284.	A4255_11 	, c1.getString(	16	));
                param.put(A4251_A4284.	A4255_12 	, c1.getString(	17	));
                param.put(A4251_A4284.	A4255_13 	, c1.getString(	18	));
                param.put(A4251_A4284.	A4255_13_OT 	, c1.getString(	19	));
                param.put(A4251_A4284.	A4255_DK 	, c1.getString(	20	));
                param.put(A4251_A4284.	A4256_days 	, c1.getString(	21	));
                param.put(A4251_A4284.	A4256_hours 	, c1.getString(	22	));
                param.put(A4251_A4284.	A4256_minutes 	, c1.getString(	23	));
                param.put(A4251_A4284.	A4257 	, c1.getString(	24	));
                param.put(A4251_A4284.	A4257_name 	, c1.getString(	25	));
              //  param.put(A4251_A4284.	A4258 	, c1.getString(	26	));
                param.put(A4251_A4284.	A4259_hours 	, c1.getString(	27	));
                param.put(A4251_A4284.	A4259_minutes 	, c1.getString(	28	));
                param.put(A4251_A4284.	A4260 	, c1.getString(	29	));
                param.put(A4251_A4284.	A4261 	, c1.getString(	30	));
                param.put(A4251_A4284.	A4262 	, c1.getString(	31	));
                param.put(A4251_A4284.	A4262_name	, c1.getString(	32	));
                param.put(A4251_A4284.	A4263_1 	, c1.getString(	33	));
                param.put(A4251_A4284.	A4263_2 	, c1.getString(	34	));
                param.put(A4251_A4284.	A4264 	, c1.getString(	35	));
                param.put(A4251_A4284.	A4266 	, c1.getString(	36	));
                param.put(A4251_A4284.	A4266_name 	, c1.getString(	37	));
             //   param.put(A4251_A4284.	A4267 	, c1.getString(	38	));
                param.put(A4251_A4284.	A4268_hours 	, c1.getString(	39	));
                param.put(A4251_A4284.	A4268_minutes 	, c1.getString(	40	));
                param.put(A4251_A4284.	A4269 	, c1.getString(	41	));
                param.put(A4251_A4284.	A4270 	, c1.getString(	42	));
                param.put(A4251_A4284.	A4271 	, c1.getString(	43	));
                param.put(A4251_A4284.	A4271_name 	, c1.getString(	44	));
                param.put(A4251_A4284.	A4272_1 	, c1.getString(	45	));
                param.put(A4251_A4284.	A4272_2 	, c1.getString(	46	));
                param.put(A4251_A4284.	A4273 	, c1.getString(	47	));
                param.put(A4251_A4284.	A4274 	, c1.getString(	48	));
                param.put(A4251_A4284.	A4275 	, c1.getString(	49	));
                param.put(A4251_A4284.	A4276_1  	, c1.getString(	50	));
                param.put(A4251_A4284.	A4276_2  	, c1.getString(	51	));
                param.put(A4251_A4284.	A4276_3  	, c1.getString(	52	));
                param.put(A4251_A4284.	A4276_4  	, c1.getString(	53	));
                param.put(A4251_A4284.	A4276_5  	, c1.getString(	54	));
                param.put(A4251_A4284.	A4276_5_OT 	, c1.getString(	55	));
                param.put(A4251_A4284.	A4276_6	, c1.getString(	56	));
                param.put(A4251_A4284.	A4276_7	, c1.getString(	57	));
                param.put(A4251_A4284.	A4276_8	, c1.getString(	58	));
                param.put(A4251_A4284.	A4276_9	, c1.getString(	59	));
                param.put(A4251_A4284.	A4276_10 	, c1.getString(	60	));
                param.put(A4251_A4284.	A4276_11 	, c1.getString(	61	));
                param.put(A4251_A4284.	A4276_12 	, c1.getString(	62	));
                param.put(A4251_A4284.	A4276_13 	, c1.getString(	63	));
                param.put(A4251_A4284.	A4276_14 	, c1.getString(	64	));
                param.put(A4251_A4284.	A4276_15 	, c1.getString(	65	));
                param.put(A4251_A4284.	A4276_16 	, c1.getString(	66	));
                param.put(A4251_A4284.	A4276_16_OT 	, c1.getString(	67	));
                param.put(A4251_A4284.	A4276_DK 	, c1.getString(	68	));
                param.put(A4251_A4284.	A4277 	, c1.getString(	69	));
                param.put(A4251_A4284.	A4278_1 	, c1.getString(	70	));
                param.put(A4251_A4284.	A4278_2 	, c1.getString(	71	));
                param.put(A4251_A4284.	A4278_3 	, c1.getString(	72	));
                param.put(A4251_A4284.	A4278_4 	, c1.getString(	73	));
                param.put(A4251_A4284.	A4278_5 	, c1.getString(	74	));
                param.put(A4251_A4284.	A4278_6 	, c1.getString(	75	));
                param.put(A4251_A4284.	A4278_7 	, c1.getString(	76	));
                param.put(A4251_A4284.	A4278_DK 	, c1.getString(	77	));
                param.put(A4251_A4284.	A4279_1	, c1.getString(	78	));
                param.put(A4251_A4284.	A4279_2	, c1.getString(	79	));
                param.put(A4251_A4284.	A4279_3	, c1.getString(	80	));
                param.put(A4251_A4284.	A4279_4	, c1.getString(	81	));
                param.put(A4251_A4284.	A4279_5	, c1.getString(	82	));
                param.put(A4251_A4284.	A4279_6	, c1.getString(	83	));
                param.put(A4251_A4284.	A4279_7	, c1.getString(	84	));
                param.put(A4251_A4284.	A4279_DK 	, c1.getString(	85	));
                param.put(A4251_A4284.	A4280 	, c1.getString(	86	));
                param.put(A4251_A4284.	A4281 	, c1.getString(	87	));
                param.put(A4251_A4284.	A4282 	, c1.getString(	88	));
                param.put(A4251_A4284.	A4283 	, c1.getString(	89	));
                param.put(A4251_A4284.	A4284 	, c1.getString(	90	));
                param.put(A4251_A4284.	STATUS	, c1.getString(	91	));





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


            Toast.makeText(mContext, "A4251_A4284 section Uploaded", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(mContext,"Uploading failed at request A4251_A4284 section", Toast.LENGTH_SHORT).show();
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
