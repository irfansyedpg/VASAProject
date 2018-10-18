package data.A;

import Global.A.A4251_A4284;

/**
 * Created by SAJID on 16/Aug/2018.
 */

public class A4252_atributes {
    public static String TABLE_NAME = "A4252_atributes";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                A4251_A4284.A4252_1 + " TEXT," +
                A4251_A4284.A4252_2 + " TEXT," +
                A4251_A4284.A4252_3 + " TEXT," +
                A4251_A4284.A4252_4 + " TEXT" +


                ')';

        return query;
    }
}