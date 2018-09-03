package data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3471_C3472 {
    public static String TABLE_NAME = "C3471_C3472";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                global.C.C.C3471_C3472.C3471 + " TEXT," +
                global.C.C.C3471_C3472.C3472 + " TEXT," +

                global.C.C.C3001_C3011.STATUS + " TEXT" +
                ')';

        return query;
    }
}

