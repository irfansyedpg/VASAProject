package data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Umeed-e-Nau on 12/23/2016.
 */
public class LocalDataManager {
    Context mContext;
    public static SQLiteDatabase database;



    public LocalDataManager(Context context) {

            this.mContext = context;
            database = new DBHelper(context).getWritableDatabase();
    }


    public List<String> getLogList() {

        ArrayList<String> list = new ArrayList<>();

        try {

            String query = "select study_id, interviewType, currentSection, STATUS from Q1101_Q1610 where currentSection = 111 OR currentSection = 99 ORDER BY id DESC";
            query = String.format(query);

            database.beginTransaction();
            Cursor c = database.rawQuery(query, null);
            if (c != null) {
                if (c.moveToFirst()) {
                    do {

                        list.add(c.getString(0) + "/" + c.getString(1) + "/" + c.getString(2) + "/" + c.getString(3));

                    } while (c.moveToNext());
                }
            }
        } finally {
            database.setTransactionSuccessful();
            database.endTransaction();
            database.close();
        }
        return list;
    }


    public List<String> getLogListPending(String status) {

        ArrayList<String> list = new ArrayList<>();

        try {

            String query = "select study_id, currentSection, interviewType from Q1101_Q1610 where currentSection != 111 and currentSection != 99 order by id ASC";
            query = String.format(query, status);

            database.beginTransaction();
            Cursor c = database.rawQuery(query, null);
            if (c != null) {
                if (c.moveToFirst()) {
                    do {

                        list.add(c.getString(0) + "/" + c.getString(1) + "/" + c.getString(2));
                    } while (c.moveToNext());
                }
            }
        } finally {
            database.setTransactionSuccessful();
            database.endTransaction();
            database.close();
        }
        return list;
    }
}