package data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import data.C.C3001_C3011;
import data.C.C3012_C3022;
import data.C.C3051_C3099;
import data.C.C3101_C3112;
import data.C.C3121_C3228;
import data.C.C3301_C3314;
import data.C.C3351_C3364;
import data.C.C3401_C3457;
import data.C.C3471_C3472;

/**
 * Created by Umeed-e-Nau on 12/21/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "vasa.db";
    private static final int VERSION = 1;

    Context mContext;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.beginTransaction();

        db.execSQL(Q1101_Q1610.getCreateQuery()); // Q1101_Q1610 created here
        db.execSQL(C3001_C3011.getCreateQuery()); // C3001_C3011 created here
        db.execSQL(C3012_C3022.getCreateQuery()); // C3012_C3022 created here
        db.execSQL(C3051_C3099.getCreateQuery()); // C3051_C3099 created here
        db.execSQL(C3101_C3112.getCreateQuery()); // C3101_C3112 created here
        db.execSQL(C3121_C3228.getCreateQuery()); // C3121_C3228 created here
        db.execSQL(C3301_C3314.getCreateQuery()); // C3301_C3314 created here
        db.execSQL(C3351_C3364.getCreateQuery()); // C3301_C3314 created here
        db.execSQL(C3401_C3457.getCreateQuery()); // C3401_C3457 created here
        db.execSQL(C3471_C3472.getCreateQuery()); // C3471_C3472 created here

        db.setTransactionSuccessful();
        db.endTransaction();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        String query;
        //db.beginTransaction();
        //query = "DROP TABLE IF EXISTS " + oTable.TABLE_NAME;
        //db.execSQL(query);

        //db.setTransactionSuccessful();
        //db.endTransaction();
    }

    public Cursor execRAW(String query) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(query, null);
        } catch (SQLiteException e) {
            e.printStackTrace();
            Log.d(DBHelper.class.getName(), " Exception while executing Query");
        }
        return cursor;
    }


    public Cursor getData() {

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor res = db.rawQuery("select * from Q1101_Q1610 order by id DESC LIMIT 1", null);
        return res;
    }
}
