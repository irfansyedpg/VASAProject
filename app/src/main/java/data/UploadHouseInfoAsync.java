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

import Global.C.C3001_C3011;
import Global.C.C3012_C3022;
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
        String query = "select * from C3001_C3011 where study_id = '%s'  order by id  desc LIMIT 1";

        query = String.format(query, Global.C.C3001_C3011.study_id);

        LocalDataManager Lm = new LocalDataManager(mContext);

        Cursor c = LocalDataManager.database.rawQuery(query, null);

        if (c != null) {
            if (c.moveToFirst()) {

                param.put("tableName", "c3001_c3011");
                param.put("id", c.getString(0));
                param.put("study_id", c.getString(1));
               // param.put(C3001_C3011.C3001, c.getString(2));
               // param.put(C3001_C3011.C3002, c.getString(3));
               // param.put(C3001_C3011.C3003, c.getString(4));
               // param.put(C3001_C3011.C3004, c.getString(5));
               // param.put(C3001_C3011.C3005u, c.getString(6));
               // param.put(C3001_C3011.C3005d, c.getString(7));
               // param.put(C3001_C3011.C3005w, c.getString(8));
               // param.put(C3001_C3011.C3005m, c.getString(9));
               // param.put(C3001_C3011.C3006, c.getString(10));
               // param.put(C3001_C3011.C3006_OT, c.getString(11));
               // param.put(C3001_C3011.C3008, c.getString(12));
               // param.put(C3001_C3011.C3008_OT, c.getString(13));
               // param.put(C3001_C3011.C3009_1, c.getString(14));
               // param.put(C3001_C3011.C3009_2, c.getString(15));
               // param.put(C3001_C3011.C3009_3, c.getString(16));
               // param.put(C3001_C3011.C3009_4, c.getString(17));
               // param.put(C3001_C3011.C3010, c.getString(18));
               // param.put(C3001_C3011.C3011, c.getString(19));
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
