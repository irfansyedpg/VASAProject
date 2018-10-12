package data.RP;

public class w204_w215 {

    public static String TABLE_NAME = "w204_w215";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.RP.w204_w215.W201_d   + " TEXT," +
                Global.RP.w204_w215.W201_m   + " TEXT," +
                Global.RP.w204_w215.W201_y   + " TEXT," +
                Global.RP.w204_w215.W202   + " TEXT," +
                Global.RP.w204_w215.W203   + " TEXT," +
                Global.RP.w204_w215.W204   + " TEXT," +
                Global.RP.w204_w215.W205   + " TEXT," +
                Global.RP.w204_w215.W206   + " TEXT," +
                Global.RP.w204_w215.W207   + " TEXT," +
                Global.RP.w204_w215.W208   + " TEXT," +
                Global.RP.w204_w215.W209   + " TEXT," +
                Global.RP.w204_w215.W210_1 + " TEXT," +
                Global.RP.w204_w215.W210_2 + " TEXT," +
                Global.RP.w204_w215.W210_3 + " TEXT," +
                Global.RP.w204_w215.W210_4 + " TEXT," +
                Global.RP.w204_w215.W210_5 + " TEXT," +
                Global.RP.w204_w215.W211   + " TEXT," +
                Global.RP.w204_w215.W212   + " TEXT," +
                Global.RP.w204_w215.W213   + " TEXT," +
                Global.RP.w204_w215.W214   + " TEXT," +
                Global.RP.w204_w215.W215   + " TEXT" +


                ')';

        return query;
    }
}
