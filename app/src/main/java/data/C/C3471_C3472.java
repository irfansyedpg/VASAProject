package data.C;

import Global.C.C3001_C3011;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3471_C3472 {
    public static String TABLE_NAME = "C3471_C3472";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.C.C3471_C3472.C3471 + " TEXT," +
                Global.C.C3471_C3472.C3472_1 + " TEXT," +
                Global.C.C3471_C3472.C3472_2 + " TEXT," +
                Global.C.C3471_C3472.C3472_3 + " TEXT," +
                Global.C.C3471_C3472.C3472_4 + " TEXT," +
                Global.C.C3471_C3472.C3472_5 + " TEXT," +
                Global.C.C3471_C3472.C3472_6 + " TEXT," +
                Global.C.C3471_C3472.C3472_7 + " TEXT," +
                Global.C.C3471_C3472.C3472_8 + " TEXT," +
                Global.C.C3471_C3472.C3472_9 + " TEXT," +
                Global.C.C3471_C3472.C3472_10 + " TEXT," +
                Global.C.C3471_C3472.C3472_11 + " TEXT," +
                Global.C.C3471_C3472.C3472_DK + " TEXT," +
                Global.C.C3471_C3472.C3473 + " TEXT," +
                C3001_C3011.STATUS + " TEXT" +
                ')';

        return query;
    }
}

