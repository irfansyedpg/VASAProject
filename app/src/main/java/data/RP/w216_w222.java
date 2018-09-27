package data.RP;

public class w216_w222 {

    public static String TABLE_NAME = "w216_w222";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.RP.w216_w222.w17           + " TEXT," +
                Global.RP.w216_w222.w18           + " TEXT," +
                Global.RP.w216_w222.w19           + " TEXT," +
                Global.RP.w216_w222.w21           + " TEXT," +
                Global.RP.w216_w222.w22           + " TEXT " +




                ')';

        return query;
    }
}
