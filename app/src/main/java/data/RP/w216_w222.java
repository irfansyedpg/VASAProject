package data.RP;

public class w216_w222 {

    public static String TABLE_NAME = "w216_w222";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.RP.w216_w222.W17           + " TEXT," +
                Global.RP.w216_w222.W18           + " TEXT," +
                Global.RP.w216_w222.W19           + " TEXT," +
                Global.RP.w216_w222.W21           + " TEXT," +
                Global.RP.w216_w222.W22           + " TEXT " +
                ')';

        return query;
    }
}
