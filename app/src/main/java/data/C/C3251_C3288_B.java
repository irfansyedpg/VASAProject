package data.C;

public class C3251_C3288_B {

    public static String TABLE_NAME = "C3251_C3288_B";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +

                Global.C.C3251_C3288_B.sub_C3251_C3288_B.STUDYID + " TEXT," +
                Global.C.C3251_C3288_B.sub_C3251_C3288_B.ACT_ID_FK + " TEXT," +
                Global.C.C3251_C3288_B.sub_C3251_C3288_B.ACT_COUNT + " TEXT," +
                Global.C.C3251_C3288_B.sub_C3251_C3288_B.C3253 + " TEXT," +
                Global.C.C3251_C3288_B.sub_C3251_C3288_B.C3253_1 + " TEXT," +
                Global.C.C3251_C3288_B.sub_C3251_C3288_B.C3253_2A + " TEXT," +
                Global.C.C3251_C3288_B.sub_C3251_C3288_B.C3253_4 + " TEXT" +

                ')';

        return query;
    }
}
