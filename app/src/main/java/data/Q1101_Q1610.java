package data;

public class Q1101_Q1610 {

    public static String study_id = "study_id";
    public static String Q1101    = "Q1101";
    public static String Q1102    = "Q1102";
    public static String Q1103    = "Q1103";
    public static String Q1202    = "Q1202";
    public static String Q1203    = "Q1203";
    public static String Q1204    = "Q1204";
    public static String Q1205    = "Q1205";
    public static String Q1206_d  = "Q1206_d";
    public static String Q1206_m  = "Q1206_m";
    public static String Q1206_y  = "Q1206_y";
    public static String Q1207    = "Q1207";
    public static String Q1208    = "Q1208";
    public static String Q1209    = "Q1209";
    public static String Q1301    = "Q1301";
    public static String Q1302    = "Q1302";
    public static String Q1307    = "Q1307";
    public static String Q1308    = "Q1308";
    public static String Q1309    = "Q1309";
    public static String Q1310    = "Q1310";
    public static String Q1311    = "Q1311";
    public static String Q1312    = "Q1312";
    public static String Q1313    = "Q1313";
    public static String Q1401    = "Q1401";
    public static String Q1402    = "Q1402";
    public static String Q1403    = "Q1403";
    public static String Q1403_OT = "Q1403_OT";
    public static String Q1404    = "Q1404";
    public static String Q1405    = "Q1405";
    public static String Q1406    = "Q1406";
    public static String Q1407    = "Q1407";
    public static String Q1408    = "Q1408";
    public static String Q1409    = "Q1409";
    public static String Q1410    = "Q1410";
    public static String Q1411    = "Q1411";
    public static String Q1412    = "Q1412";
    public static String Q1413    = "Q1413";
    public static String Q1414_1  = "Q1414_1";
    public static String Q1414_2  = "Q1414_2";
    public static String Q1414_3  = "Q1414_3";
    public static String Q1414_4  = "Q1414_4";
    public static String Q1414_5  = "Q1414_5";
    public static String Q1414_6  = "Q1414_6";
    public static String Q1414_7  = "Q1414_7";
    public static String Q1414_8  = "Q1414_8";
    public static String Q1414_9  = "Q1414_9";
    public static String Q1414_10 = "Q1414_10";
    public static String Q1415    = "Q1415";
    public static String Q1416    = "Q1416";
    public static String Q1416_OT = "Q1416_OT";
    public static String Q1417    = "Q1417";
    public static String Q1417_OT = "Q1417_OT";
    public static String Q1418    = "Q1418";
    public static String Q1418_OT = "Q1418_OT";
    public static String Q1419    = "Q1419";
    public static String Q1419_OT = "Q1419_OT";
    public static String Q1420    = "Q1420";
    public static String Q1420_OT = "Q1420_OT";
    public static String Q1421    = "Q1421";
    public static String Q1421_OT = "Q1421_OT";
    public static String Q1501    = "Q1501";
    public static String Q1502    = "Q1502";
    public static String Q1503    = "Q1503";
    public static String Q1503_OT = "Q1503_OT";
    public static String Q1601    = "Q1601";
    public static String Q1602    = "Q1602";
    public static String Q1603    = "Q1603";
    public static String Q1604    = "Q1604";
    public static String Q1604_OT = "Q1604_OT";
    public static String Q1605    = "Q1605";
    public static String Q1606    = "Q1606";
    public static String Q1607_1  = "Q1607_1";
    public static String Q1607_2  = "Q1607_2";
    public static String Q1607_3  = "Q1607_3";
    public static String Q1608_1  = "Q1608_1";
    public static String Q1608_2  = "Q1608_2";
    public static String Q1608_3  = "Q1608_3";
    public static String Q1609    = "Q1609";
    public static String Q1610_1  = "Q1610_1";
    public static String Q1610_2  = "Q1610_2";
    public static String Q1610_3  = "Q1610_3";
    public static String STATUS   = "STATUS";

    public static String TABLE_NAME = "Q1101_Q1610";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' INTEGER,   " +

                data.Q1101_Q1610.Q1101 + " TEXT," +
                data.Q1101_Q1610.Q1102 + " TEXT," +
                data.Q1101_Q1610.Q1103 + " TEXT," +
                data.Q1101_Q1610.Q1202 + " TEXT," +
                data.Q1101_Q1610.Q1203 + " TEXT," +
                data.Q1101_Q1610.Q1204 + " TEXT," +
                data.Q1101_Q1610.Q1205 + " TEXT," +
                data.Q1101_Q1610.Q1206_d + " INTEGER," +
                data.Q1101_Q1610.Q1206_m + " INTEGER," +
                data.Q1101_Q1610.Q1206_y + " INTEGER," +
                data.Q1101_Q1610.Q1207 + " TEXT," +
                data.Q1101_Q1610.Q1208 + " TEXT," +
                data.Q1101_Q1610.Q1209 + " TEXT," +
                data.Q1101_Q1610.Q1301 + " TEXT," +
                data.Q1101_Q1610.Q1302 + " TEXT," +
                data.Q1101_Q1610.Q1307 + " TEXT," +
                data.Q1101_Q1610.Q1308 + " TEXT," +
                data.Q1101_Q1610.Q1309 + " TEXT," +
                data.Q1101_Q1610.Q1310 + " TEXT," +
                data.Q1101_Q1610.Q1311 + " TEXT," +
                data.Q1101_Q1610.Q1312 + " TEXT," +
                data.Q1101_Q1610.Q1313 + " TEXT," +
                data.Q1101_Q1610.Q1401 + " TEXT," +
                data.Q1101_Q1610.Q1402 + " TEXT," +
                data.Q1101_Q1610.Q1403 + " TEXT," +
                data.Q1101_Q1610.Q1403_OT + " TEXT," +
                data.Q1101_Q1610.Q1404 + " TEXT," +
                data.Q1101_Q1610.Q1405 + " TEXT," +
                data.Q1101_Q1610.Q1406 + " TEXT," +
                data.Q1101_Q1610.Q1407 + " TEXT," +
                data.Q1101_Q1610.Q1408 + " TEXT," +
                data.Q1101_Q1610.Q1409 + " TEXT," +
                data.Q1101_Q1610.Q1410 + " TEXT," +
                data.Q1101_Q1610.Q1411 + " TEXT," +
                data.Q1101_Q1610.Q1412 + " TEXT," +
                data.Q1101_Q1610.Q1413 + " TEXT," +
                data.Q1101_Q1610.Q1414_1 + " TEXT," +
                data.Q1101_Q1610.Q1414_2 + " TEXT," +
                data.Q1101_Q1610.Q1414_3 + " TEXT," +
                data.Q1101_Q1610.Q1414_4 + " TEXT," +
                data.Q1101_Q1610.Q1414_5 + " TEXT," +
                data.Q1101_Q1610.Q1414_6 + " TEXT," +
                data.Q1101_Q1610.Q1414_7 + " TEXT," +
                data.Q1101_Q1610.Q1414_8 + " TEXT," +
                data.Q1101_Q1610.Q1414_9 + " TEXT," +
                data.Q1101_Q1610.Q1414_10 + " TEXT," +
                data.Q1101_Q1610.Q1415 + " TEXT," +
                data.Q1101_Q1610.Q1416 + " TEXT," +
                data.Q1101_Q1610.Q1416_OT + " TEXT," +
                data.Q1101_Q1610.Q1417 + " TEXT," +
                data.Q1101_Q1610.Q1417_OT + " TEXT," +
                data.Q1101_Q1610.Q1418 + " TEXT," +
                data.Q1101_Q1610.Q1418_OT + " TEXT," +
                data.Q1101_Q1610.Q1419 + " TEXT," +
                data.Q1101_Q1610.Q1419_OT + " TEXT," +
                data.Q1101_Q1610.Q1420 + " TEXT," +
                data.Q1101_Q1610.Q1420_OT + " TEXT," +
                data.Q1101_Q1610.Q1421 + " TEXT," +
                data.Q1101_Q1610.Q1421_OT + " TEXT," +
                data.Q1101_Q1610.Q1501 + " TEXT," +
                data.Q1101_Q1610.Q1502 + " TEXT," +
                data.Q1101_Q1610.Q1503 + " TEXT," +
                data.Q1101_Q1610.Q1503_OT + " TEXT," +
                data.Q1101_Q1610.Q1601 + " TEXT," +
                data.Q1101_Q1610.Q1602 + " TEXT," +
                data.Q1101_Q1610.Q1603 + " TEXT," +
                data.Q1101_Q1610.Q1604 + " TEXT," +
                data.Q1101_Q1610.Q1604_OT + " TEXT," +
                data.Q1101_Q1610.Q1605 + " TEXT," +
                data.Q1101_Q1610.Q1606 + " TEXT," +
                data.Q1101_Q1610.Q1607_1 + " TEXT," +
                data.Q1101_Q1610.Q1607_2 + " TEXT," +
                data.Q1101_Q1610.Q1607_3 + " TEXT," +
                data.Q1101_Q1610.Q1608_1 + " TEXT," +
                data.Q1101_Q1610.Q1608_2 + " TEXT," +
                data.Q1101_Q1610.Q1608_3 + " TEXT," +
                data.Q1101_Q1610.Q1609 + " TEXT," +
                data.Q1101_Q1610.Q1610_1 + " TEXT," +
                data.Q1101_Q1610.Q1610_2 + " TEXT," +
                data.Q1101_Q1610.Q1610_3 + " TEXT," +
                data.Q1101_Q1610.STATUS + " TEXT" +
                ')';

        return query;
    }
}
