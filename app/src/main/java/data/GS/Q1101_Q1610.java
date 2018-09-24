package data.GS;

public class Q1101_Q1610 {

    public static String TABLE_NAME = "Q1101_Q1610";

    public static String getCreateQuery() {

        String query;

        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.GS.Q1101_Q1610.Q1201_1          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1201_2          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1201_3          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1201_4          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1201_5          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1201_6          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1202            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1203            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1204            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1205            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1206_d          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1206_m          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1206_y          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1207            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1208            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1209            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1301            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1302            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1307            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1308            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1309            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1310            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1311            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1312            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1313            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1401            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1402            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1403            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1403_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1404            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1405            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1406            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1407            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1408            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1409            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1410            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1411            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1412            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1413            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_1          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_2          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_3          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_4          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_5          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_6          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_7          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_8          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_9          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1414_10         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1415            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1416            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1416_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1417            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1417_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1418            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1418_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1419            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1419_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1420            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1420_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1421            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1421_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1501            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1502            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1503            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1503_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1601            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1602            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1603            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1604            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1604_OT         + " TEXT," +
                Global.GS.Q1101_Q1610.Q1605            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1606            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1607_1          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1607_2          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1607_3          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1608_1          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1608_2          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1608_3          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1609            + " TEXT," +
                Global.GS.Q1101_Q1610.Q1610_1          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1610_2          + " TEXT," +
                Global.GS.Q1101_Q1610.Q1610_3          + " TEXT," +
                Global.GS.Q1101_Q1610.interviewType    + " INTEGER," +
                Global.GS.Q1101_Q1610.currentSection   + " INTEGER," +
                Global.GS.Q1101_Q1610.STATUS + " TEXT" +
                ')';

        return query;
    }
}
