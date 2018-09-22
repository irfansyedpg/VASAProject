package data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3012_C3022 {
    public static String TABLE_NAME = "C3012_C3022";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.C.C3012_C3022.C3012 + " TEXT," +
                Global.C.C3012_C3022.C3013 + " TEXT," +
                Global.C.C3012_C3022.C3015 + " TEXT," +
                Global.C.C3012_C3022.C3016 + " TEXT," +
                Global.C.C3012_C3022.C3017 + " TEXT," +
                Global.C.C3012_C3022.C3018 + " TEXT," +
                Global.C.C3012_C3022.C3018_1 + " TEXT," +
                Global.C.C3012_C3022.C3019_u + " TEXT," +
                Global.C.C3012_C3022.C3019_a + " TEXT," +
                Global.C.C3012_C3022.C3019_b + " TEXT," +
                Global.C.C3012_C3022.C3019_c + " TEXT," +
                Global.C.C3012_C3022.C3020 + " TEXT," +
                Global.C.C3012_C3022.C3021u + " TEXT," +
                Global.C.C3012_C3022.C3021d + " TEXT," +
                Global.C.C3012_C3022.C3021m + " TEXT," +
                Global.C.C3012_C3022.C3021y + " TEXT," +
                Global.C.C3012_C3022.C3022 + " TEXT," +
                Global.C.C3012_C3022.STATUS + " TEXT" +
                ')';

        return query;
    }
}

