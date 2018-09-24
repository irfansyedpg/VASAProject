package data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3001_C3011 {

    public static String TABLE_NAME = "C3001_C3011";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.C.C3001_C3011.C3001 + " TEXT," +
                Global.C.C3001_C3011.C3002 + " TEXT," +
                Global.C.C3001_C3011.C3003 + " TEXT," +
                Global.C.C3001_C3011.C3004 + " TEXT," +
                Global.C.C3001_C3011.C3005u + " TEXT," +
                Global.C.C3001_C3011.C3005d + " TEXT," +
                Global.C.C3001_C3011.C3005w + " TEXT," +
                Global.C.C3001_C3011.C3005m + " TEXT," +
                Global.C.C3001_C3011.C3006 + " TEXT," +
                Global.C.C3001_C3011.C3006_OT + " TEXT," +
                Global.C.C3001_C3011.C3008 + " TEXT," +
                Global.C.C3001_C3011.C3008_OT + " TEXT," +
                Global.C.C3001_C3011.C3009_1 + " TEXT," +
                Global.C.C3001_C3011.C3009_2 + " TEXT," +
                Global.C.C3001_C3011.C3009_3 + " TEXT," +
                Global.C.C3001_C3011.C3009_4 + " TEXT," +
                Global.C.C3001_C3011.C3010 + " TEXT," +
                Global.C.C3001_C3011.C3011 + " TEXT," +
                Global.C.C3001_C3011.STATUS + " TEXT" +
                ')';

        return query;
    }
}

