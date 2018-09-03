package com.irfansyed.VAS.VASMonitring;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;

public class Q1101_Q1610 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {


    //region Declaration

    Button btn_next;

    // LinerLayouts
    LinearLayout
            ll_Q1101,
            ll_Q1102,
            ll_Q1103,
            ll_Q1202,
            ll_Q1203,
            ll_Q1204,
            ll_Q1205,
            ll_Q1206_d,
            ll_Q1206_m,
            ll_Q1206_y,
            ll_Q1207,
            ll_Q1208,
            ll_Q1209,
            ll_Q1301,
            ll_Q1302,
            ll_Q1307,
            ll_Q1308,
            ll_Q1309,
            ll_Q1310,
            ll_Q1311,
            ll_Q1312,
            ll_Q1313,
            ll_Q1401,
            ll_Q1402,
            ll_Q1403,
            ll_Q1403_OT,
            ll_Q1404,
            ll_Q1405,
            ll_Q1406,
            ll_Q1407,
            ll_Q1408,
            ll_Q1409,
            ll_Q1410,
            ll_Q1411,
            ll_Q1412,
            ll_Q1413,
            ll_Q1414_1,
            ll_Q1414_2,
            ll_Q1414_3,
            ll_Q1414_4,
            ll_Q1414_5,
            ll_Q1414_6,
            ll_Q1414_7,
            ll_Q1414_8,
            ll_Q1414_9,
            ll_Q1414_10,
            ll_Q1415,
            ll_Q1416,
            ll_Q1416_OT,
            ll_Q1417,
            ll_Q1417_OT,
            ll_Q1418,
            ll_Q1418_OT,
            ll_Q1419,
            ll_Q1419_OT,
            ll_Q1420,
            ll_Q1420_OT,
            ll_Q1421,
            ll_Q1421_OT,
            ll_Q1501,
            ll_Q1502,
            ll_Q1503,
            ll_Q1503_OT,
            ll_Q1601,
            ll_Q1602,
            ll_Q1603,
            ll_Q1604,
            ll_Q1604_OT,
            ll_Q1605,
            ll_Q1606,
            ll_Q1607,
            ll_Q1608,
            ll_Q1609,
            ll_Q1610;

    RadioButton
            rb_Q1101_1,
            rb_Q1101_2,
            rb_Q1101_3,
            rb_Q1102_1,
            rb_Q1102_2,
            rb_Q1102_3,
            rb_Q1103_1,
            rb_Q1103_2,
            rb_Q1103_DK,
            rb_Q1203_1,
            rb_Q1203_2,
            rb_Q1207_1,
            rb_Q1207_2,
            rb_Q1207_DK,
            rb_Q1311_1,
            rb_Q1311_2,
            rb_Q1311_3,
            rb_Q1311_4,
            rb_Q1311_5,
            rb_Q1311_6,
            rb_Q1311_7,
            rb_Q1311_8,
            rb_Q1311_9,
            rb_Q1311_10,
            rb_Q1311_11,
            rb_Q1311_12,
            rb_Q1402_1,
            rb_Q1402_2,
            rb_Q1402_DK,
            rb_Q1403_1,
            rb_Q1403_2,
            rb_Q1403_3,
            rb_Q1403_4,
            rb_Q1403_5,
            rb_Q1403_6,
            rb_Q1403_7,
            rb_Q1403_8,
            rb_Q1403_9,
            rb_Q1403_10,
            rb_Q1403_11,
            rb_Q1403_12,
            rb_Q1403_13,
            rb_Q1403_14,
            rb_Q1404_1,
            rb_Q1404_2,
            rb_Q1404_DK,
            rb_Q1405_1,
            rb_Q1405_2,
            rb_Q1407_1,
            rb_Q1407_2,
            rb_Q1407_DK,
            rb_Q1408_1,
            rb_Q1408_2,
            rb_Q1408_3,
            rb_Q1408_DK,
            rb_Q1410_1,
            rb_Q1410_2,
            rb_Q1410_3,
            rb_Q1410_4,
            rb_Q1410_5,
            rb_Q1413_1,
            rb_Q1413_2,
            rb_Q1413_DK,
            rb_Q1414_1_1,
            rb_Q1414_1_2,
            rb_Q1414_1_DK,
            rb_Q1414_2_1,
            rb_Q1414_2_2,
            rb_Q1414_2_DK,
            rb_Q1414_3_1,
            rb_Q1414_3_2,
            rb_Q1414_3_DK,
            rb_Q1414_4_1,
            rb_Q1414_4_2,
            rb_Q1414_4_DK,
            rb_Q1414_5_1,
            rb_Q1414_5_2,
            rb_Q1414_5_DK,
            rb_Q1414_6_1,
            rb_Q1414_6_2,
            rb_Q1414_6_DK,
            rb_Q1414_7_1,
            rb_Q1414_7_2,
            rb_Q1414_7_DK,
            rb_Q1414_8_1,
            rb_Q1414_8_2,
            rb_Q1414_8_DK,
            rb_Q1414_9_1,
            rb_Q1414_9_2,
            rb_Q1414_9_DK,
            rb_Q1414_10_1,
            rb_Q1414_10_2,
            rb_Q1414_10_DK,
            rb_Q1415_1,
            rb_Q1415_2,
            rb_Q1415_3,
            rb_Q1415_4,
            rb_Q1415_5,
            rb_Q1415_6,
            rb_Q1415_7,
            rb_Q1415_8,
            rb_Q1415_9,
            rb_Q1415_10,
            rb_Q1415_11,
            rb_Q1415_12,
            rb_Q1415_DK,
            rb_Q1416_1,
            rb_Q1416_2,
            rb_Q1416_3,
            rb_Q1416_4,
            rb_Q1416_5,
            rb_Q1416_6,
            rb_Q1416_7,
            rb_Q1416_8,
            rb_Q1416_DK,
            rb_Q1417_1,
            rb_Q1417_2,
            rb_Q1417_3,
            rb_Q1417_4,
            rb_Q1417_5,
            rb_Q1417_6,
            rb_Q1417_7,
            rb_Q1417_8,
            rb_Q1417_9,
            rb_Q1417_DK,
            rb_Q1418_1,
            rb_Q1418_2,
            rb_Q1418_3,
            rb_Q1418_4,
            rb_Q1418_5,
            rb_Q1418_6,
            rb_Q1418_7,
            rb_Q1418_8,
            rb_Q1418_9,
            rb_Q1418_DK,
            rb_Q1419_1,
            rb_Q1419_2,
            rb_Q1419_3,
            rb_Q1419_4,
            rb_Q1419_5,
            rb_Q1419_6,
            rb_Q1419_7,
            rb_Q1419_8,
            rb_Q1419_DK,
            rb_Q1420_1,
            rb_Q1420_2,
            rb_Q1420_3,
            rb_Q1420_4,
            rb_Q1420_5,
            rb_Q1420_6,
            rb_Q1420_7,
            rb_Q1420_DK,
            rb_Q1421_1,
            rb_Q1421_2,
            rb_Q1421_3,
            rb_Q1421_4,
            rb_Q1421_5,
            rb_Q1421_6,
            rb_Q1421_7,
            rb_Q1421_8,
            rb_Q1421_9,
            rb_Q1421_10,
            rb_Q1421_DK,
            rb_Q1501_1,
            rb_Q1501_2,
            rb_Q1503_1,
            rb_Q1503_2,
            rb_Q1503_3,
            rb_Q1503_4,
            rb_Q1503_5,
            rb_Q1503_6,
            rb_Q1503_7,
            rb_Q1503_8,
            rb_Q1503_9,
            rb_Q1503_10,
            rb_Q1503_11,
            rb_Q1503_12,
            rb_Q1503_13,
            rb_Q1503_14,
            rb_Q1601_1,
            rb_Q1601_2,
            rb_Q1601_DK,
            rb_Q1602_1,
            rb_Q1602_2,
            rb_Q1602_DK,
            rb_Q1604_1,
            rb_Q1604_2,
            rb_Q1604_3,
            rb_Q1604_4,
            rb_Q1604_5,
            rb_Q1604_DK,
            rb_Q1605_1,
            rb_Q1605_2,
            rb_Q1609_1,
            rb_Q1609_2,
            rb_Q1609_3,
            rb_Q1609_4,
            rb_Q1609_5;

    EditText
            ed_study_id,
            ed_Q1202,
            ed_Q1204,
            ed_Q1205,
            ed_Q1206_d,
            ed_Q1206_m,
            ed_Q1206_y,
            ed_Q1208,
            ed_Q1209,
            ed_Q1301,
            ed_Q1302,
            ed_Q1307,
            ed_Q1308,
            ed_Q1309,
            ed_Q1310,
            ed_Q1312,
            ed_Q1313,
            ed_Q1401,
            ed_Q1403_OT,
            ed_Q1406,
            ed_Q1409,
            ed_Q1411,
            ed_Q1412,
            ed_Q1416_OT,
            ed_Q1417_OT,
            ed_Q1418_OT,
            ed_Q1419_OT,
            ed_Q1420_OT,
            ed_Q1421_OT,
            ed_Q1502,
            ed_Q1503_OT,
            ed_Q1603,
            ed_Q1604_OT,
            ed_Q1606,
            ed_Q1607_1,
            ed_Q1607_2,
            ed_Q1607_3,
            ed_Q1608_1,
            ed_Q1608_2,
            ed_Q1608_3,
            ed_Q1610_1,
            ed_Q1610_2,
            ed_Q1610_3;

    String
            Q1101,
            Q1102,
            Q1103,
            Q1202,
            Q1203,
            Q1204,
            Q1205,
            Q1206_d,
            Q1206_m,
            Q1206_y,
            Q1207,
            Q1208,
            Q1209,
            Q1301,
            Q1302,
            Q1307,
            Q1308,
            Q1309,
            Q1310,
            Q1311,
            Q1312,
            Q1313,
            Q1401,
            Q1402,
            Q1403,
            Q1403_OT,
            Q1404,
            Q1405,
            Q1406,
            Q1407,
            Q1408,
            Q1409,
            Q1410,
            Q1411,
            Q1412,
            Q1413,
            Q1414_1,
            Q1414_2,
            Q1414_3,
            Q1414_4,
            Q1414_5,
            Q1414_6,
            Q1414_7,
            Q1414_8,
            Q1414_9,
            Q1414_10,
            Q1415,
            Q1416,
            Q1416_OT,
            Q1417,
            Q1417_OT,
            Q1418,
            Q1418_OT,
            Q1419,
            Q1419_OT,
            Q1420,
            Q1420_OT,
            Q1421,
            Q1421_OT,
            Q1501,
            Q1502,
            Q1503,
            Q1503_OT,
            Q1601,
            Q1602,
            Q1603,
            Q1604,
            Q1604_OT,
            Q1605,
            Q1606,
            Q1607_1,
            Q1607_2,
            Q1607_3,
            Q1608_1,
            Q1608_2,
            Q1608_3,
            Q1609,
            Q1610_1,
            Q1610_2,
            Q1610_3,
            STATUS,
            study_id;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q1101_q1610);

        Initialization();
        events_call();

        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        DBHelper db = new DBHelper(this);

        Cursor res = db.getData();

        if (res.getCount() > 0) {

            if (res.moveToFirst()) {
                Toast.makeText(this, "" + res.getString(0), Toast.LENGTH_LONG).show();
            }

        }

        //if(res.getCount() == 0) {

        //  Toast.makeText(this, "No Data", Toast.LENGTH_LONG).show();
        //} else {

        //  Toast.makeText(this, res.getString(0), Toast.LENGTH_LONG).show();
        //}

        //Intent c = new Intent(this, C3012_C3022.class);

        //startActivity(c);
    }

    void Initialization() {

        // Button Next
        btn_next = (Button) findViewById(R.id.btn_next);

        // Layouts

        ll_Q1101 = (LinearLayout) findViewById(R.id.ll_Q1101);
        ll_Q1102 = (LinearLayout) findViewById(R.id.ll_Q1102);
        ll_Q1103 = (LinearLayout) findViewById(R.id.ll_Q1103);
        ll_Q1202 = (LinearLayout) findViewById(R.id.ll_Q1202);
        ll_Q1203 = (LinearLayout) findViewById(R.id.ll_Q1203);
        ll_Q1204 = (LinearLayout) findViewById(R.id.ll_Q1204);
        ll_Q1205 = (LinearLayout) findViewById(R.id.ll_Q1205);
        ll_Q1206_d = (LinearLayout) findViewById(R.id.ll_Q1206_d);
        ll_Q1206_m = (LinearLayout) findViewById(R.id.ll_Q1206_m);
        ll_Q1206_y = (LinearLayout) findViewById(R.id.ll_Q1206_y);
        ll_Q1207 = (LinearLayout) findViewById(R.id.ll_Q1207);
        ll_Q1208 = (LinearLayout) findViewById(R.id.ll_Q1208);
        ll_Q1209 = (LinearLayout) findViewById(R.id.ll_Q1209);
        ll_Q1301 = (LinearLayout) findViewById(R.id.ll_Q1301);
        ll_Q1302 = (LinearLayout) findViewById(R.id.ll_Q1302);
        ll_Q1307 = (LinearLayout) findViewById(R.id.ll_Q1307);
        ll_Q1308 = (LinearLayout) findViewById(R.id.ll_Q1308);
        ll_Q1309 = (LinearLayout) findViewById(R.id.ll_Q1309);
        ll_Q1310 = (LinearLayout) findViewById(R.id.ll_Q1310);
        ll_Q1311 = (LinearLayout) findViewById(R.id.ll_Q1311);
        ll_Q1312 = (LinearLayout) findViewById(R.id.ll_Q1312);
        ll_Q1313 = (LinearLayout) findViewById(R.id.ll_Q1313);
        ll_Q1401 = (LinearLayout) findViewById(R.id.ll_Q1401);
        ll_Q1402 = (LinearLayout) findViewById(R.id.ll_Q1402);
        ll_Q1403 = (LinearLayout) findViewById(R.id.ll_Q1403);
        ll_Q1403_OT = (LinearLayout) findViewById(R.id.ll_Q1403_OT);
        ll_Q1404 = (LinearLayout) findViewById(R.id.ll_Q1404);
        ll_Q1405 = (LinearLayout) findViewById(R.id.ll_Q1405);
        ll_Q1406 = (LinearLayout) findViewById(R.id.ll_Q1406);
        ll_Q1407 = (LinearLayout) findViewById(R.id.ll_Q1407);
        ll_Q1408 = (LinearLayout) findViewById(R.id.ll_Q1408);
        ll_Q1409 = (LinearLayout) findViewById(R.id.ll_Q1409);
        ll_Q1410 = (LinearLayout) findViewById(R.id.ll_Q1410);
        ll_Q1411 = (LinearLayout) findViewById(R.id.ll_Q1411);
        ll_Q1412 = (LinearLayout) findViewById(R.id.ll_Q1412);
        ll_Q1413 = (LinearLayout) findViewById(R.id.ll_Q1413);

        ll_Q1414_1 = (LinearLayout) findViewById(R.id.ll_Q1414_1);
        ll_Q1414_2 = (LinearLayout) findViewById(R.id.ll_Q1414_2);
        ll_Q1414_3 = (LinearLayout) findViewById(R.id.ll_Q1414_3);
        ll_Q1414_4 = (LinearLayout) findViewById(R.id.ll_Q1414_4);
        ll_Q1414_5 = (LinearLayout) findViewById(R.id.ll_Q1414_5);
        ll_Q1414_6 = (LinearLayout) findViewById(R.id.ll_Q1414_6);
        ll_Q1414_7 = (LinearLayout) findViewById(R.id.ll_Q1414_7);
        ll_Q1414_8 = (LinearLayout) findViewById(R.id.ll_Q1414_8);
        ll_Q1414_9 = (LinearLayout) findViewById(R.id.ll_Q1414_9);
        ll_Q1414_10 = (LinearLayout) findViewById(R.id.ll_Q1414_10);
        ll_Q1415 = (LinearLayout) findViewById(R.id.ll_Q1415);


        ll_Q1416 = (LinearLayout) findViewById(R.id.ll_Q1416);
        ll_Q1416_OT = (LinearLayout) findViewById(R.id.ll_Q1416_OT);
        ll_Q1417 = (LinearLayout) findViewById(R.id.ll_Q1417);
        ll_Q1417_OT = (LinearLayout) findViewById(R.id.ll_Q1417_OT);
        ll_Q1418 = (LinearLayout) findViewById(R.id.ll_Q1418);
        ll_Q1418_OT = (LinearLayout) findViewById(R.id.ll_Q1418_OT);
        ll_Q1419 = (LinearLayout) findViewById(R.id.ll_Q1419);
        ll_Q1419_OT = (LinearLayout) findViewById(R.id.ll_Q1419_OT);
        ll_Q1420 = (LinearLayout) findViewById(R.id.ll_Q1420);
        ll_Q1420_OT = (LinearLayout) findViewById(R.id.ll_Q1420_OT);
        ll_Q1421 = (LinearLayout) findViewById(R.id.ll_Q1421);
        ll_Q1421_OT = (LinearLayout) findViewById(R.id.ll_Q1421_OT);
        ll_Q1501 = (LinearLayout) findViewById(R.id.ll_Q1501);
        ll_Q1502 = (LinearLayout) findViewById(R.id.ll_Q1502);
        ll_Q1503 = (LinearLayout) findViewById(R.id.ll_Q1503);
        ll_Q1503_OT = (LinearLayout) findViewById(R.id.ll_Q1503_OT);
        ll_Q1601 = (LinearLayout) findViewById(R.id.ll_Q1601);
        ll_Q1602 = (LinearLayout) findViewById(R.id.ll_Q1602);
        ll_Q1603 = (LinearLayout) findViewById(R.id.ll_Q1603);
        ll_Q1604 = (LinearLayout) findViewById(R.id.ll_Q1604);
        ll_Q1604_OT = (LinearLayout) findViewById(R.id.ll_Q1604_OT);
        ll_Q1605 = (LinearLayout) findViewById(R.id.ll_Q1605);
        ll_Q1606 = (LinearLayout) findViewById(R.id.ll_Q1606);
        ll_Q1607 = (LinearLayout) findViewById(R.id.ll_Q1607);
        ll_Q1608 = (LinearLayout) findViewById(R.id.ll_Q1608);
        ll_Q1609 = (LinearLayout) findViewById(R.id.ll_Q1609);
        ll_Q1610 = (LinearLayout) findViewById(R.id.ll_Q1610);

        // Radio Buttons

        rb_Q1101_1 = (RadioButton) findViewById(R.id.rb_Q1101_1);
        rb_Q1101_2 = (RadioButton) findViewById(R.id.rb_Q1101_2);
        rb_Q1101_3 = (RadioButton) findViewById(R.id.rb_Q1101_3);
        rb_Q1102_1 = (RadioButton) findViewById(R.id.rb_Q1102_1);
        rb_Q1102_2 = (RadioButton) findViewById(R.id.rb_Q1102_2);
        rb_Q1102_3 = (RadioButton) findViewById(R.id.rb_Q1102_3);
        rb_Q1103_1 = (RadioButton) findViewById(R.id.rb_Q1103_1);
        rb_Q1103_2 = (RadioButton) findViewById(R.id.rb_Q1103_2);
        rb_Q1103_DK = (RadioButton) findViewById(R.id.rb_Q1103_DK);
        rb_Q1203_1 = (RadioButton) findViewById(R.id.rb_Q1203_1);
        rb_Q1203_2 = (RadioButton) findViewById(R.id.rb_Q1203_2);
        rb_Q1207_1 = (RadioButton) findViewById(R.id.rb_Q1207_1);
        rb_Q1207_2 = (RadioButton) findViewById(R.id.rb_Q1207_2);
        rb_Q1207_DK = (RadioButton) findViewById(R.id.rb_Q1207_DK);
        rb_Q1311_1 = (RadioButton) findViewById(R.id.rb_Q1311_1);
        rb_Q1311_2 = (RadioButton) findViewById(R.id.rb_Q1311_2);
        rb_Q1311_3 = (RadioButton) findViewById(R.id.rb_Q1311_3);
        rb_Q1311_4 = (RadioButton) findViewById(R.id.rb_Q1311_4);
        rb_Q1311_5 = (RadioButton) findViewById(R.id.rb_Q1311_5);
        rb_Q1311_6 = (RadioButton) findViewById(R.id.rb_Q1311_6);
        rb_Q1311_7 = (RadioButton) findViewById(R.id.rb_Q1311_7);
        rb_Q1311_8 = (RadioButton) findViewById(R.id.rb_Q1311_8);
        rb_Q1311_9 = (RadioButton) findViewById(R.id.rb_Q1311_9);
        rb_Q1311_10 = (RadioButton) findViewById(R.id.rb_Q1311_10);
        rb_Q1311_11 = (RadioButton) findViewById(R.id.rb_Q1311_11);
        rb_Q1311_12 = (RadioButton) findViewById(R.id.rb_Q1311_12);
        rb_Q1402_1 = (RadioButton) findViewById(R.id.rb_Q1402_1);
        rb_Q1402_2 = (RadioButton) findViewById(R.id.rb_Q1402_2);
        rb_Q1402_DK = (RadioButton) findViewById(R.id.rb_Q1402_DK);
        rb_Q1403_1 = (RadioButton) findViewById(R.id.rb_Q1403_1);
        rb_Q1403_2 = (RadioButton) findViewById(R.id.rb_Q1403_2);
        rb_Q1403_3 = (RadioButton) findViewById(R.id.rb_Q1403_3);
        rb_Q1403_4 = (RadioButton) findViewById(R.id.rb_Q1403_4);
        rb_Q1403_5 = (RadioButton) findViewById(R.id.rb_Q1403_5);
        rb_Q1403_6 = (RadioButton) findViewById(R.id.rb_Q1403_6);
        rb_Q1403_7 = (RadioButton) findViewById(R.id.rb_Q1403_7);
        rb_Q1403_8 = (RadioButton) findViewById(R.id.rb_Q1403_8);
        rb_Q1403_9 = (RadioButton) findViewById(R.id.rb_Q1403_9);
        rb_Q1403_10 = (RadioButton) findViewById(R.id.rb_Q1403_10);
        rb_Q1403_11 = (RadioButton) findViewById(R.id.rb_Q1403_11);
        rb_Q1403_12 = (RadioButton) findViewById(R.id.rb_Q1403_12);
        rb_Q1403_13 = (RadioButton) findViewById(R.id.rb_Q1403_13);
        rb_Q1403_14 = (RadioButton) findViewById(R.id.rb_Q1403_14);
        rb_Q1404_1 = (RadioButton) findViewById(R.id.rb_Q1404_1);
        rb_Q1404_2 = (RadioButton) findViewById(R.id.rb_Q1404_2);
        rb_Q1404_DK = (RadioButton) findViewById(R.id.rb_Q1404_DK);
        rb_Q1405_1 = (RadioButton) findViewById(R.id.rb_Q1405_1);
        rb_Q1405_2 = (RadioButton) findViewById(R.id.rb_Q1405_2);
        rb_Q1407_1 = (RadioButton) findViewById(R.id.rb_Q1407_1);
        rb_Q1407_2 = (RadioButton) findViewById(R.id.rb_Q1407_2);
        rb_Q1407_DK = (RadioButton) findViewById(R.id.rb_Q1407_DK);
        rb_Q1408_1 = (RadioButton) findViewById(R.id.rb_Q1408_1);
        rb_Q1408_2 = (RadioButton) findViewById(R.id.rb_Q1408_2);
        rb_Q1408_3 = (RadioButton) findViewById(R.id.rb_Q1408_3);
        rb_Q1408_DK = (RadioButton) findViewById(R.id.rb_Q1408_DK);
        rb_Q1410_1 = (RadioButton) findViewById(R.id.rb_Q1410_1);
        rb_Q1410_2 = (RadioButton) findViewById(R.id.rb_Q1410_2);
        rb_Q1410_3 = (RadioButton) findViewById(R.id.rb_Q1410_3);
        rb_Q1410_4 = (RadioButton) findViewById(R.id.rb_Q1410_4);
        rb_Q1410_5 = (RadioButton) findViewById(R.id.rb_Q1410_5);
        rb_Q1413_1 = (RadioButton) findViewById(R.id.rb_Q1413_1);
        rb_Q1413_2 = (RadioButton) findViewById(R.id.rb_Q1413_2);
        rb_Q1413_DK = (RadioButton) findViewById(R.id.rb_Q1413_DK);
        rb_Q1414_1_1 = (RadioButton) findViewById(R.id.rb_Q1414_1_1);
        rb_Q1414_1_2 = (RadioButton) findViewById(R.id.rb_Q1414_1_2);
        rb_Q1414_1_DK = (RadioButton) findViewById(R.id.rb_Q1414_1_DK);
        rb_Q1414_2_1 = (RadioButton) findViewById(R.id.rb_Q1414_2_1);
        rb_Q1414_2_2 = (RadioButton) findViewById(R.id.rb_Q1414_2_2);
        rb_Q1414_2_DK = (RadioButton) findViewById(R.id.rb_Q1414_2_DK);
        rb_Q1414_3_1 = (RadioButton) findViewById(R.id.rb_Q1414_3_1);
        rb_Q1414_3_2 = (RadioButton) findViewById(R.id.rb_Q1414_3_2);
        rb_Q1414_3_DK = (RadioButton) findViewById(R.id.rb_Q1414_3_DK);
        rb_Q1414_4_1 = (RadioButton) findViewById(R.id.rb_Q1414_4_1);
        rb_Q1414_4_2 = (RadioButton) findViewById(R.id.rb_Q1414_4_2);
        rb_Q1414_4_DK = (RadioButton) findViewById(R.id.rb_Q1414_4_DK);
        rb_Q1414_5_1 = (RadioButton) findViewById(R.id.rb_Q1414_5_1);
        rb_Q1414_5_2 = (RadioButton) findViewById(R.id.rb_Q1414_5_2);
        rb_Q1414_5_DK = (RadioButton) findViewById(R.id.rb_Q1414_5_DK);
        rb_Q1414_6_1 = (RadioButton) findViewById(R.id.rb_Q1414_6_1);
        rb_Q1414_6_2 = (RadioButton) findViewById(R.id.rb_Q1414_6_2);
        rb_Q1414_6_DK = (RadioButton) findViewById(R.id.rb_Q1414_6_DK);
        rb_Q1414_7_1 = (RadioButton) findViewById(R.id.rb_Q1414_7_1);
        rb_Q1414_7_2 = (RadioButton) findViewById(R.id.rb_Q1414_7_2);
        rb_Q1414_7_DK = (RadioButton) findViewById(R.id.rb_Q1414_7_DK);
        rb_Q1414_8_1 = (RadioButton) findViewById(R.id.rb_Q1414_8_1);
        rb_Q1414_8_2 = (RadioButton) findViewById(R.id.rb_Q1414_8_2);
        rb_Q1414_8_DK = (RadioButton) findViewById(R.id.rb_Q1414_8_DK);
        rb_Q1414_9_1 = (RadioButton) findViewById(R.id.rb_Q1414_9_1);
        rb_Q1414_9_2 = (RadioButton) findViewById(R.id.rb_Q1414_9_2);
        rb_Q1414_9_DK = (RadioButton) findViewById(R.id.rb_Q1414_9_DK);
        rb_Q1414_10_1 = (RadioButton) findViewById(R.id.rb_Q1414_10_1);
        rb_Q1414_10_2 = (RadioButton) findViewById(R.id.rb_Q1414_10_2);
        rb_Q1414_10_DK = (RadioButton) findViewById(R.id.rb_Q1414_10_DK);
        rb_Q1415_1 = (RadioButton) findViewById(R.id.rb_Q1415_1);
        rb_Q1415_2 = (RadioButton) findViewById(R.id.rb_Q1415_2);
        rb_Q1415_3 = (RadioButton) findViewById(R.id.rb_Q1415_3);
        rb_Q1415_4 = (RadioButton) findViewById(R.id.rb_Q1415_4);
        rb_Q1415_5 = (RadioButton) findViewById(R.id.rb_Q1415_5);
        rb_Q1415_6 = (RadioButton) findViewById(R.id.rb_Q1415_6);
        rb_Q1415_7 = (RadioButton) findViewById(R.id.rb_Q1415_7);
        rb_Q1415_8 = (RadioButton) findViewById(R.id.rb_Q1415_8);
        rb_Q1415_9 = (RadioButton) findViewById(R.id.rb_Q1415_9);
        rb_Q1415_10 = (RadioButton) findViewById(R.id.rb_Q1415_10);
        rb_Q1415_11 = (RadioButton) findViewById(R.id.rb_Q1415_11);
        rb_Q1415_12 = (RadioButton) findViewById(R.id.rb_Q1415_12);
        rb_Q1415_DK = (RadioButton) findViewById(R.id.rb_Q1415_DK);
        rb_Q1416_1 = (RadioButton) findViewById(R.id.rb_Q1416_1);
        rb_Q1416_2 = (RadioButton) findViewById(R.id.rb_Q1416_2);
        rb_Q1416_3 = (RadioButton) findViewById(R.id.rb_Q1416_3);
        rb_Q1416_4 = (RadioButton) findViewById(R.id.rb_Q1416_4);
        rb_Q1416_5 = (RadioButton) findViewById(R.id.rb_Q1416_5);
        rb_Q1416_6 = (RadioButton) findViewById(R.id.rb_Q1416_6);
        rb_Q1416_7 = (RadioButton) findViewById(R.id.rb_Q1416_7);
        rb_Q1416_8 = (RadioButton) findViewById(R.id.rb_Q1416_8);
        rb_Q1416_DK = (RadioButton) findViewById(R.id.rb_Q1416_DK);
        rb_Q1417_1 = (RadioButton) findViewById(R.id.rb_Q1417_1);
        rb_Q1417_2 = (RadioButton) findViewById(R.id.rb_Q1417_2);
        rb_Q1417_3 = (RadioButton) findViewById(R.id.rb_Q1417_3);
        rb_Q1417_4 = (RadioButton) findViewById(R.id.rb_Q1417_4);
        rb_Q1417_5 = (RadioButton) findViewById(R.id.rb_Q1417_5);
        rb_Q1417_6 = (RadioButton) findViewById(R.id.rb_Q1417_6);
        rb_Q1417_7 = (RadioButton) findViewById(R.id.rb_Q1417_7);
        rb_Q1417_8 = (RadioButton) findViewById(R.id.rb_Q1417_8);
        rb_Q1417_9 = (RadioButton) findViewById(R.id.rb_Q1417_9);
        rb_Q1417_DK = (RadioButton) findViewById(R.id.rb_Q1417_DK);
        rb_Q1418_1 = (RadioButton) findViewById(R.id.rb_Q1418_1);
        rb_Q1418_2 = (RadioButton) findViewById(R.id.rb_Q1418_2);
        rb_Q1418_3 = (RadioButton) findViewById(R.id.rb_Q1418_3);
        rb_Q1418_4 = (RadioButton) findViewById(R.id.rb_Q1418_4);
        rb_Q1418_5 = (RadioButton) findViewById(R.id.rb_Q1418_5);
        rb_Q1418_6 = (RadioButton) findViewById(R.id.rb_Q1418_6);
        rb_Q1418_7 = (RadioButton) findViewById(R.id.rb_Q1418_7);
        rb_Q1418_8 = (RadioButton) findViewById(R.id.rb_Q1418_8);
        rb_Q1418_9 = (RadioButton) findViewById(R.id.rb_Q1418_9);
        rb_Q1418_DK = (RadioButton) findViewById(R.id.rb_Q1418_DK);
        rb_Q1419_1 = (RadioButton) findViewById(R.id.rb_Q1419_1);
        rb_Q1419_2 = (RadioButton) findViewById(R.id.rb_Q1419_2);
        rb_Q1419_3 = (RadioButton) findViewById(R.id.rb_Q1419_3);
        rb_Q1419_4 = (RadioButton) findViewById(R.id.rb_Q1419_4);
        rb_Q1419_5 = (RadioButton) findViewById(R.id.rb_Q1419_5);
        rb_Q1419_6 = (RadioButton) findViewById(R.id.rb_Q1419_6);
        rb_Q1419_7 = (RadioButton) findViewById(R.id.rb_Q1419_7);
        rb_Q1419_8 = (RadioButton) findViewById(R.id.rb_Q1419_8);
        rb_Q1419_DK = (RadioButton) findViewById(R.id.rb_Q1419_DK);
        rb_Q1420_1 = (RadioButton) findViewById(R.id.rb_Q1420_1);
        rb_Q1420_2 = (RadioButton) findViewById(R.id.rb_Q1420_2);
        rb_Q1420_3 = (RadioButton) findViewById(R.id.rb_Q1420_3);
        rb_Q1420_4 = (RadioButton) findViewById(R.id.rb_Q1420_4);
        rb_Q1420_5 = (RadioButton) findViewById(R.id.rb_Q1420_5);
        rb_Q1420_6 = (RadioButton) findViewById(R.id.rb_Q1420_6);
        rb_Q1420_7 = (RadioButton) findViewById(R.id.rb_Q1420_7);
        rb_Q1420_DK = (RadioButton) findViewById(R.id.rb_Q1420_DK);

        rb_Q1421_1 = (RadioButton) findViewById(R.id.rb_Q1421_1);
        rb_Q1421_2 = (RadioButton) findViewById(R.id.rb_Q1421_2);
        rb_Q1421_3 = (RadioButton) findViewById(R.id.rb_Q1421_3);
        rb_Q1421_4 = (RadioButton) findViewById(R.id.rb_Q1421_4);
        rb_Q1421_5 = (RadioButton) findViewById(R.id.rb_Q1421_5);
        rb_Q1421_6 = (RadioButton) findViewById(R.id.rb_Q1421_6);
        rb_Q1421_7 = (RadioButton) findViewById(R.id.rb_Q1421_7);
        rb_Q1421_8 = (RadioButton) findViewById(R.id.rb_Q1421_8);
        rb_Q1421_9 = (RadioButton) findViewById(R.id.rb_Q1421_9);
        rb_Q1421_10 = (RadioButton) findViewById(R.id.rb_Q1421_10);
        rb_Q1421_DK = (RadioButton) findViewById(R.id.rb_Q1421_DK);
        rb_Q1501_1 = (RadioButton) findViewById(R.id.rb_Q1501_1);
        rb_Q1501_2 = (RadioButton) findViewById(R.id.rb_Q1501_2);
        rb_Q1503_1 = (RadioButton) findViewById(R.id.rb_Q1503_1);
        rb_Q1503_2 = (RadioButton) findViewById(R.id.rb_Q1503_2);
        rb_Q1503_3 = (RadioButton) findViewById(R.id.rb_Q1503_3);
        rb_Q1503_4 = (RadioButton) findViewById(R.id.rb_Q1503_4);
        rb_Q1503_5 = (RadioButton) findViewById(R.id.rb_Q1503_5);
        rb_Q1503_6 = (RadioButton) findViewById(R.id.rb_Q1503_6);
        rb_Q1503_7 = (RadioButton) findViewById(R.id.rb_Q1503_7);
        rb_Q1503_8 = (RadioButton) findViewById(R.id.rb_Q1503_8);
        rb_Q1503_9 = (RadioButton) findViewById(R.id.rb_Q1503_9);
        rb_Q1503_10 = (RadioButton) findViewById(R.id.rb_Q1503_10);
        rb_Q1503_11 = (RadioButton) findViewById(R.id.rb_Q1503_11);
        rb_Q1503_12 = (RadioButton) findViewById(R.id.rb_Q1503_12);
        rb_Q1503_13 = (RadioButton) findViewById(R.id.rb_Q1503_13);
        rb_Q1503_14 = (RadioButton) findViewById(R.id.rb_Q1503_14);
        rb_Q1601_1 = (RadioButton) findViewById(R.id.rb_Q1601_1);
        rb_Q1601_2 = (RadioButton) findViewById(R.id.rb_Q1601_2);
        rb_Q1601_DK = (RadioButton) findViewById(R.id.rb_Q1601_DK);
        rb_Q1602_1 = (RadioButton) findViewById(R.id.rb_Q1602_1);
        rb_Q1602_2 = (RadioButton) findViewById(R.id.rb_Q1602_2);
        rb_Q1602_DK = (RadioButton) findViewById(R.id.rb_Q1602_DK);
        rb_Q1604_1 = (RadioButton) findViewById(R.id.rb_Q1604_1);
        rb_Q1604_2 = (RadioButton) findViewById(R.id.rb_Q1604_2);
        rb_Q1604_3 = (RadioButton) findViewById(R.id.rb_Q1604_3);
        rb_Q1604_4 = (RadioButton) findViewById(R.id.rb_Q1604_4);
        rb_Q1604_5 = (RadioButton) findViewById(R.id.rb_Q1604_5);
        rb_Q1604_DK = (RadioButton) findViewById(R.id.rb_Q1604_DK);
        rb_Q1605_1 = (RadioButton) findViewById(R.id.rb_Q1605_1);
        rb_Q1605_2 = (RadioButton) findViewById(R.id.rb_Q1605_2);
        rb_Q1609_1 = (RadioButton) findViewById(R.id.rb_Q1609_1);
        rb_Q1609_2 = (RadioButton) findViewById(R.id.rb_Q1609_2);
        rb_Q1609_3 = (RadioButton) findViewById(R.id.rb_Q1609_3);
        rb_Q1609_4 = (RadioButton) findViewById(R.id.rb_Q1609_4);
        rb_Q1609_5 = (RadioButton) findViewById(R.id.rb_Q1609_5);


        ed_Q1202 = (EditText) findViewById(R.id.ed_Q1202);
        ed_Q1204 = (EditText) findViewById(R.id.ed_Q1204);
        ed_Q1205 = (EditText) findViewById(R.id.ed_Q1205);
        ed_Q1206_d = (EditText) findViewById(R.id.ed_Q1206_d);
        ed_Q1206_m = (EditText) findViewById(R.id.ed_Q1206_m);
        ed_Q1206_y = (EditText) findViewById(R.id.ed_Q1206_y);
        ed_Q1208 = (EditText) findViewById(R.id.ed_Q1208);
        ed_Q1209 = (EditText) findViewById(R.id.ed_Q1209);
        ed_Q1301 = (EditText) findViewById(R.id.ed_Q1301);
        ed_Q1302 = (EditText) findViewById(R.id.ed_Q1302);
        ed_Q1307 = (EditText) findViewById(R.id.ed_Q1307);
        ed_Q1308 = (EditText) findViewById(R.id.ed_Q1308);
        ed_Q1309 = (EditText) findViewById(R.id.ed_Q1309);
        ed_Q1310 = (EditText) findViewById(R.id.ed_Q1310);
        ed_Q1312 = (EditText) findViewById(R.id.ed_Q1312);
        ed_Q1313 = (EditText) findViewById(R.id.ed_Q1313);
        ed_Q1401 = (EditText) findViewById(R.id.ed_Q1401);
        ed_Q1403_OT = (EditText) findViewById(R.id.ed_Q1403_OT);
        ed_Q1406 = (EditText) findViewById(R.id.ed_Q1406);
        ed_Q1409 = (EditText) findViewById(R.id.ed_Q1409);
        ed_Q1411 = (EditText) findViewById(R.id.ed_Q1411);
        ed_Q1412 = (EditText) findViewById(R.id.ed_Q1412);
        ed_Q1416_OT = (EditText) findViewById(R.id.ed_Q1416_OT);
        ed_Q1417_OT = (EditText) findViewById(R.id.ed_Q1417_OT);
        ed_Q1418_OT = (EditText) findViewById(R.id.ed_Q1418_OT);
        ed_Q1419_OT = (EditText) findViewById(R.id.ed_Q1419_OT);
        ed_Q1420_OT = (EditText) findViewById(R.id.ed_Q1420_OT);
        ed_Q1421_OT = (EditText) findViewById(R.id.ed_Q1421_OT);
        ed_Q1502 = (EditText) findViewById(R.id.ed_Q1502);
        ed_Q1503_OT = (EditText) findViewById(R.id.ed_Q1503_OT);
        ed_Q1603 = (EditText) findViewById(R.id.ed_Q1603);
        ed_Q1604_OT = (EditText) findViewById(R.id.ed_Q1604_OT);
        ed_Q1606 = (EditText) findViewById(R.id.ed_Q1606);
        ed_Q1607_1 = (EditText) findViewById(R.id.ed_Q1607_1);
        ed_Q1607_2 = (EditText) findViewById(R.id.ed_Q1607_2);
        ed_Q1607_3 = (EditText) findViewById(R.id.ed_Q1607_3);
        ed_Q1608_1 = (EditText) findViewById(R.id.ed_Q1608_1);
        ed_Q1608_2 = (EditText) findViewById(R.id.ed_Q1608_2);
        ed_Q1608_3 = (EditText) findViewById(R.id.ed_Q1608_3);
        ed_Q1610_1 = (EditText) findViewById(R.id.ed_Q1610_1);
        ed_Q1610_2 = (EditText) findViewById(R.id.ed_Q1610_2);
        ed_Q1610_3 = (EditText) findViewById(R.id.ed_Q1610_3);
    }

    void events_call() {

        rb_Q1403_1.setOnCheckedChangeListener(this);
        rb_Q1403_2.setOnCheckedChangeListener(this);
        rb_Q1403_3.setOnCheckedChangeListener(this);
        rb_Q1403_4.setOnCheckedChangeListener(this);
        rb_Q1403_5.setOnCheckedChangeListener(this);
        rb_Q1403_6.setOnCheckedChangeListener(this);
        rb_Q1403_7.setOnCheckedChangeListener(this);
        rb_Q1403_8.setOnCheckedChangeListener(this);
        rb_Q1403_9.setOnCheckedChangeListener(this);
        rb_Q1403_10.setOnCheckedChangeListener(this);
        rb_Q1403_11.setOnCheckedChangeListener(this);
        rb_Q1403_12.setOnCheckedChangeListener(this);
        rb_Q1403_13.setOnCheckedChangeListener(this);
        rb_Q1403_14.setOnCheckedChangeListener(this);

        rb_Q1416_1.setOnCheckedChangeListener(this);
        rb_Q1416_2.setOnCheckedChangeListener(this);
        rb_Q1416_3.setOnCheckedChangeListener(this);
        rb_Q1416_4.setOnCheckedChangeListener(this);
        rb_Q1416_5.setOnCheckedChangeListener(this);
        rb_Q1416_6.setOnCheckedChangeListener(this);
        rb_Q1416_7.setOnCheckedChangeListener(this);
        rb_Q1416_8.setOnCheckedChangeListener(this);
        rb_Q1416_DK.setOnCheckedChangeListener(this);

        rb_Q1417_1.setOnCheckedChangeListener(this);
        rb_Q1417_2.setOnCheckedChangeListener(this);
        rb_Q1417_3.setOnCheckedChangeListener(this);
        rb_Q1417_4.setOnCheckedChangeListener(this);
        rb_Q1417_5.setOnCheckedChangeListener(this);
        rb_Q1417_6.setOnCheckedChangeListener(this);
        rb_Q1417_7.setOnCheckedChangeListener(this);
        rb_Q1417_8.setOnCheckedChangeListener(this);
        rb_Q1417_9.setOnCheckedChangeListener(this);
        rb_Q1417_DK.setOnCheckedChangeListener(this);

        rb_Q1418_1.setOnCheckedChangeListener(this);
        rb_Q1418_2.setOnCheckedChangeListener(this);
        rb_Q1418_3.setOnCheckedChangeListener(this);
        rb_Q1418_4.setOnCheckedChangeListener(this);
        rb_Q1418_5.setOnCheckedChangeListener(this);
        rb_Q1418_6.setOnCheckedChangeListener(this);
        rb_Q1418_7.setOnCheckedChangeListener(this);
        rb_Q1418_8.setOnCheckedChangeListener(this);
        rb_Q1418_9.setOnCheckedChangeListener(this);
        rb_Q1418_DK.setOnCheckedChangeListener(this);

        rb_Q1419_1.setOnCheckedChangeListener(this);
        rb_Q1419_2.setOnCheckedChangeListener(this);
        rb_Q1419_3.setOnCheckedChangeListener(this);
        rb_Q1419_4.setOnCheckedChangeListener(this);
        rb_Q1419_5.setOnCheckedChangeListener(this);
        rb_Q1419_6.setOnCheckedChangeListener(this);
        rb_Q1419_7.setOnCheckedChangeListener(this);
        rb_Q1419_8.setOnCheckedChangeListener(this);
        rb_Q1419_DK.setOnCheckedChangeListener(this);

        rb_Q1420_1.setOnCheckedChangeListener(this);
        rb_Q1420_2.setOnCheckedChangeListener(this);
        rb_Q1420_3.setOnCheckedChangeListener(this);
        rb_Q1420_4.setOnCheckedChangeListener(this);
        rb_Q1420_5.setOnCheckedChangeListener(this);
        rb_Q1420_6.setOnCheckedChangeListener(this);
        rb_Q1420_7.setOnCheckedChangeListener(this);
        rb_Q1420_DK.setOnCheckedChangeListener(this);

        rb_Q1421_1.setOnCheckedChangeListener(this);
        rb_Q1421_2.setOnCheckedChangeListener(this);
        rb_Q1421_3.setOnCheckedChangeListener(this);
        rb_Q1421_4.setOnCheckedChangeListener(this);
        rb_Q1421_5.setOnCheckedChangeListener(this);
        rb_Q1421_6.setOnCheckedChangeListener(this);
        rb_Q1421_7.setOnCheckedChangeListener(this);
        rb_Q1421_8.setOnCheckedChangeListener(this);
        rb_Q1421_9.setOnCheckedChangeListener(this);
        rb_Q1421_10.setOnCheckedChangeListener(this);
        rb_Q1421_DK.setOnCheckedChangeListener(this);

        rb_Q1503_1.setOnCheckedChangeListener(this);
        rb_Q1503_2.setOnCheckedChangeListener(this);
        rb_Q1503_3.setOnCheckedChangeListener(this);
        rb_Q1503_4.setOnCheckedChangeListener(this);
        rb_Q1503_5.setOnCheckedChangeListener(this);
        rb_Q1503_6.setOnCheckedChangeListener(this);
        rb_Q1503_7.setOnCheckedChangeListener(this);
        rb_Q1503_8.setOnCheckedChangeListener(this);
        rb_Q1503_9.setOnCheckedChangeListener(this);
        rb_Q1503_10.setOnCheckedChangeListener(this);
        rb_Q1503_11.setOnCheckedChangeListener(this);
        rb_Q1503_12.setOnCheckedChangeListener(this);
        rb_Q1503_13.setOnCheckedChangeListener(this);
        rb_Q1503_14.setOnCheckedChangeListener(this);

        rb_Q1604_1.setOnCheckedChangeListener(this);
        rb_Q1604_2.setOnCheckedChangeListener(this);
        rb_Q1604_3.setOnCheckedChangeListener(this);
        rb_Q1604_4.setOnCheckedChangeListener(this);
        rb_Q1604_5.setOnCheckedChangeListener(this);
        rb_Q1604_DK.setOnCheckedChangeListener(this);

        rb_Q1405_1.setOnCheckedChangeListener(this);
        rb_Q1405_2.setOnCheckedChangeListener(this);
        rb_Q1407_1.setOnCheckedChangeListener(this);
        rb_Q1407_2.setOnCheckedChangeListener(this);
        rb_Q1407_DK.setOnCheckedChangeListener(this);
        rb_Q1501_1.setOnCheckedChangeListener(this);
        rb_Q1501_2.setOnCheckedChangeListener(this);
        rb_Q1602_1.setOnCheckedChangeListener(this);
        rb_Q1602_2.setOnCheckedChangeListener(this);
        rb_Q1602_DK.setOnCheckedChangeListener(this);
        rb_Q1605_1.setOnCheckedChangeListener(this);
        rb_Q1605_2.setOnCheckedChangeListener(this);
        rb_Q1609_1.setOnCheckedChangeListener(this);
        rb_Q1609_2.setOnCheckedChangeListener(this);
        rb_Q1609_3.setOnCheckedChangeListener(this);
        rb_Q1609_4.setOnCheckedChangeListener(this);
        rb_Q1609_5.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        if (compoundButton.getId() == R.id.rb_Q1403_1
                || compoundButton.getId() == R.id.rb_Q1403_2
                || compoundButton.getId() == R.id.rb_Q1403_3
                || compoundButton.getId() == R.id.rb_Q1403_4
                || compoundButton.getId() == R.id.rb_Q1403_5
                || compoundButton.getId() == R.id.rb_Q1403_6
                || compoundButton.getId() == R.id.rb_Q1403_7
                || compoundButton.getId() == R.id.rb_Q1403_8
                || compoundButton.getId() == R.id.rb_Q1403_9
                || compoundButton.getId() == R.id.rb_Q1403_10
                || compoundButton.getId() == R.id.rb_Q1403_11
                || compoundButton.getId() == R.id.rb_Q1403_12
                || compoundButton.getId() == R.id.rb_Q1403_13
                || compoundButton.getId() == R.id.rb_Q1403_14) {

            ClearAllcontrol.ClearAll(ll_Q1403_OT);
            ll_Q1403_OT.setVisibility(View.GONE);

            if (rb_Q1403_12.isChecked() || rb_Q1403_13.isChecked() || rb_Q1403_14.isChecked()) {

                ll_Q1403_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1403_OT);
                ll_Q1403_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1405_1
                || compoundButton.getId() == R.id.rb_Q1405_2) {

            ClearAllcontrol.ClearAll(ll_Q1406);
            ll_Q1406.setVisibility(View.GONE);

            if (rb_Q1405_1.isChecked()) {

                ll_Q1406.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1406);
                ll_Q1406.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1407_1
                || compoundButton.getId() == R.id.rb_Q1407_2
                || compoundButton.getId() == R.id.rb_Q1407_DK) {

            ClearAllcontrol.ClearAll(ll_Q1408);
            ClearAllcontrol.ClearAll(ll_Q1409);

            ll_Q1408.setVisibility(View.GONE);
            ll_Q1409.setVisibility(View.GONE);

            if (rb_Q1407_1.isChecked()) {

                ll_Q1408.setVisibility(View.VISIBLE);
                ll_Q1409.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1408);
                ClearAllcontrol.ClearAll(ll_Q1409);

                ll_Q1408.setVisibility(View.GONE);
                ll_Q1409.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1416_1
                || compoundButton.getId() == R.id.rb_Q1416_2
                || compoundButton.getId() == R.id.rb_Q1416_3
                || compoundButton.getId() == R.id.rb_Q1416_4
                || compoundButton.getId() == R.id.rb_Q1416_5
                || compoundButton.getId() == R.id.rb_Q1416_6
                || compoundButton.getId() == R.id.rb_Q1416_7
                || compoundButton.getId() == R.id.rb_Q1416_8
                || compoundButton.getId() == R.id.rb_Q1416_DK) {

            ClearAllcontrol.ClearAll(ll_Q1416_OT);
            ll_Q1416_OT.setVisibility(View.GONE);

            if (rb_Q1416_8.isChecked()) {

                ll_Q1416_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1416_OT);
                ll_Q1416_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1417_1
                || compoundButton.getId() == R.id.rb_Q1417_2
                || compoundButton.getId() == R.id.rb_Q1417_3
                || compoundButton.getId() == R.id.rb_Q1417_4
                || compoundButton.getId() == R.id.rb_Q1417_5
                || compoundButton.getId() == R.id.rb_Q1417_6
                || compoundButton.getId() == R.id.rb_Q1417_7
                || compoundButton.getId() == R.id.rb_Q1417_8
                || compoundButton.getId() == R.id.rb_Q1417_9
                || compoundButton.getId() == R.id.rb_Q1417_DK) {

            ClearAllcontrol.ClearAll(ll_Q1417_OT);
            ll_Q1417_OT.setVisibility(View.GONE);

            if (rb_Q1417_9.isChecked()) {

                ll_Q1417_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1417_OT);
                ll_Q1417_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1418_1
                || compoundButton.getId() == R.id.rb_Q1418_2
                || compoundButton.getId() == R.id.rb_Q1418_3
                || compoundButton.getId() == R.id.rb_Q1418_4
                || compoundButton.getId() == R.id.rb_Q1418_5
                || compoundButton.getId() == R.id.rb_Q1418_6
                || compoundButton.getId() == R.id.rb_Q1418_7
                || compoundButton.getId() == R.id.rb_Q1418_8
                || compoundButton.getId() == R.id.rb_Q1418_9
                || compoundButton.getId() == R.id.rb_Q1418_DK) {

            ClearAllcontrol.ClearAll(ll_Q1418_OT);
            ll_Q1418_OT.setVisibility(View.GONE);

            if (rb_Q1418_9.isChecked()) {

                ll_Q1418_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1418_OT);
                ll_Q1418_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1419_1
                || compoundButton.getId() == R.id.rb_Q1419_2
                || compoundButton.getId() == R.id.rb_Q1419_3
                || compoundButton.getId() == R.id.rb_Q1419_4
                || compoundButton.getId() == R.id.rb_Q1419_5
                || compoundButton.getId() == R.id.rb_Q1419_6
                || compoundButton.getId() == R.id.rb_Q1419_7
                || compoundButton.getId() == R.id.rb_Q1419_8
                || compoundButton.getId() == R.id.rb_Q1419_DK) {

            ClearAllcontrol.ClearAll(ll_Q1419_OT);
            ll_Q1419_OT.setVisibility(View.GONE);

            if (rb_Q1419_8.isChecked()) {

                ll_Q1419_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1419_OT);
                ll_Q1419_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1420_1
                || compoundButton.getId() == R.id.rb_Q1420_2
                || compoundButton.getId() == R.id.rb_Q1420_3
                || compoundButton.getId() == R.id.rb_Q1420_4
                || compoundButton.getId() == R.id.rb_Q1420_5
                || compoundButton.getId() == R.id.rb_Q1420_6
                || compoundButton.getId() == R.id.rb_Q1420_7
                || compoundButton.getId() == R.id.rb_Q1420_DK) {

            ClearAllcontrol.ClearAll(ll_Q1420_OT);
            ll_Q1420_OT.setVisibility(View.GONE);

            if (rb_Q1420_7.isChecked()) {

                ll_Q1420_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1420_OT);
                ll_Q1420_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1421_1
                || compoundButton.getId() == R.id.rb_Q1421_2
                || compoundButton.getId() == R.id.rb_Q1421_3
                || compoundButton.getId() == R.id.rb_Q1421_4
                || compoundButton.getId() == R.id.rb_Q1421_5
                || compoundButton.getId() == R.id.rb_Q1421_6
                || compoundButton.getId() == R.id.rb_Q1421_7
                || compoundButton.getId() == R.id.rb_Q1421_8
                || compoundButton.getId() == R.id.rb_Q1421_9
                || compoundButton.getId() == R.id.rb_Q1421_10
                || compoundButton.getId() == R.id.rb_Q1421_DK) {

            ClearAllcontrol.ClearAll(ll_Q1421_OT);
            ll_Q1421_OT.setVisibility(View.GONE);

            if (rb_Q1421_10.isChecked()) {

                ll_Q1421_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1421_OT);
                ll_Q1421_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1501_1
                || compoundButton.getId() == R.id.rb_Q1501_2) {

            ClearAllcontrol.ClearAll(ll_Q1502);
            ClearAllcontrol.ClearAll(ll_Q1503);

            ll_Q1502.setVisibility(View.GONE);
            ll_Q1503.setVisibility(View.GONE);

            if (rb_Q1501_1.isChecked()) {

                ll_Q1502.setVisibility(View.VISIBLE);
                ll_Q1503.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1502);
                ClearAllcontrol.ClearAll(ll_Q1503);

                ll_Q1502.setVisibility(View.GONE);
                ll_Q1503.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1503_1
                || compoundButton.getId() == R.id.rb_Q1503_2
                || compoundButton.getId() == R.id.rb_Q1503_3
                || compoundButton.getId() == R.id.rb_Q1503_4
                || compoundButton.getId() == R.id.rb_Q1503_5
                || compoundButton.getId() == R.id.rb_Q1503_6
                || compoundButton.getId() == R.id.rb_Q1503_7
                || compoundButton.getId() == R.id.rb_Q1503_8
                || compoundButton.getId() == R.id.rb_Q1503_9
                || compoundButton.getId() == R.id.rb_Q1503_10
                || compoundButton.getId() == R.id.rb_Q1503_11
                || compoundButton.getId() == R.id.rb_Q1503_12
                || compoundButton.getId() == R.id.rb_Q1503_13
                || compoundButton.getId() == R.id.rb_Q1503_14) {

            ClearAllcontrol.ClearAll(ll_Q1503_OT);
            ll_Q1503_OT.setVisibility(View.GONE);

            if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                ll_Q1503_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1503_OT);
                ll_Q1503_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1602_1
                || compoundButton.getId() == R.id.rb_Q1602_2
                || compoundButton.getId() == R.id.rb_Q1602_DK) {

            ClearAllcontrol.ClearAll(ll_Q1603);
            ll_Q1603.setVisibility(View.GONE);

            if (rb_Q1602_1.isChecked() || rb_Q1602_DK.isChecked()) {

                ll_Q1603.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1603);
                ll_Q1603.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1604_1
                || compoundButton.getId() == R.id.rb_Q1604_2
                || compoundButton.getId() == R.id.rb_Q1604_3
                || compoundButton.getId() == R.id.rb_Q1604_4
                || compoundButton.getId() == R.id.rb_Q1604_5
                || compoundButton.getId() == R.id.rb_Q1604_DK) {

            ClearAllcontrol.ClearAll(ll_Q1604_OT);
            ll_Q1604_OT.setVisibility(View.GONE);

            if (rb_Q1604_5.isChecked()) {

                ll_Q1604_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1604_OT);
                ll_Q1604_OT.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1605_1
                || compoundButton.getId() == R.id.rb_Q1605_2) {

            ClearAllcontrol.ClearAll(ll_Q1606);
            ll_Q1606.setVisibility(View.GONE);

            if (rb_Q1605_1.isChecked()) {

                ll_Q1606.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1606);
                ll_Q1606.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.rb_Q1609_1
                || compoundButton.getId() == R.id.rb_Q1609_2
                || compoundButton.getId() == R.id.rb_Q1609_3
                || compoundButton.getId() == R.id.rb_Q1609_4
                || compoundButton.getId() == R.id.rb_Q1609_5) {

            ClearAllcontrol.ClearAll(ll_Q1610);
            ll_Q1610.setVisibility(View.GONE);

            if (rb_Q1609_1.isChecked()) {

                ll_Q1610.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1610);
                ll_Q1610.setVisibility(View.GONE);
            }
        }
    }

    void value_assignment() {

        study_id = "0";
        Q1101 = "000";
        Q1102 = "000";
        Q1103 = "000";
        Q1202 = "000";
        Q1203 = "000";
        Q1204 = "000";
        Q1205 = "000";
        Q1206_d = "000";
        Q1206_m = "000";
        Q1206_y = "000";
        Q1207 = "000";
        Q1208 = "000";
        Q1209 = "000";
        Q1301 = "000";
        Q1302 = "000";
        Q1307 = "000";
        Q1308 = "000";
        Q1309 = "000";
        Q1310 = "000";
        Q1311 = "000";
        Q1312 = "000";
        Q1313 = "000";
        Q1401 = "000";
        Q1402 = "000";
        Q1403 = "000";
        Q1404 = "000";
        Q1405 = "000";
        Q1406 = "000";
        Q1407 = "000";
        Q1408 = "000";
        Q1409 = "000";
        Q1410 = "000";
        Q1411 = "000";
        Q1412 = "000";
        Q1413 = "000";
        Q1414_1 = "000";
        Q1414_2 = "000";
        Q1414_3 = "000";
        Q1414_4 = "000";
        Q1414_5 = "000";
        Q1414_6 = "000";
        Q1414_7 = "000";
        Q1414_8 = "000";
        Q1414_9 = "000";
        Q1414_10 = "000";
        Q1415 = "000";
        Q1416 = "000";
        Q1417 = "000";
        Q1418 = "000";
        Q1419 = "000";
        Q1420 = "000";
        Q1421 = "000";
        Q1501 = "000";
        Q1502 = "000";
        Q1503 = "000";
        Q1601 = "000";
        Q1602 = "000";
        Q1603 = "000";
        Q1604 = "000";
        Q1605 = "000";
        Q1606 = "000";
        Q1607_1 = "000";
        Q1607_2 = "000";
        Q1607_3 = "000";
        Q1608_1 = "000";
        Q1608_2 = "000";
        Q1608_3 = "000";
        Q1609 = "000";
        Q1610_1 = "000";
        Q1610_2 = "000";
        Q1610_3 = "000";
        STATUS = "0";

        if (rb_Q1101_1.isChecked()) {
            Q1101 = "1";
        } else if (rb_Q1101_2.isChecked()) {
            Q1101 = "2";
        } else if (rb_Q1101_3.isChecked()) {
            Q1101 = "3";
        }

        if (rb_Q1102_1.isChecked()) {
            Q1102 = "1";
        } else if (rb_Q1102_2.isChecked()) {
            Q1102 = "2";
        } else if (rb_Q1102_3.isChecked()) {
            Q1102 = "3";
        }

        if (rb_Q1103_1.isChecked()) {
            Q1103 = "1";
        } else if (rb_Q1103_2.isChecked()) {
            Q1103 = "2";
        } else if (rb_Q1103_DK.isChecked()) {
            Q1103 = "9";
        }

        if (ed_Q1202.getText().toString().trim().length() > 0) {
            Q1202 = ed_Q1202.getText().toString().trim();
        }

        if (rb_Q1203_1.isChecked()) {
            Q1203 = "1";
        } else if (rb_Q1203_2.isChecked()) {
            Q1203 = "2";
        }

        if (ed_Q1204.getText().toString().trim().length() > 0) {
            Q1204 = ed_Q1204.getText().toString().trim();
        }

        if (ed_Q1205.getText().toString().trim().length() > 0) {
            Q1205 = ed_Q1205.getText().toString().trim();
        }

        if (ed_Q1206_d.getText().toString().trim().length() > 0) {
            Q1206_d = ed_Q1206_d.getText().toString().trim();
        }

        if (ed_Q1206_m.getText().toString().trim().length() > 0) {
            Q1206_m = ed_Q1206_m.getText().toString().trim();
        }

        if (ed_Q1206_y.getText().toString().trim().length() > 0) {
            Q1206_y = ed_Q1206_y.getText().toString().trim();
        }

        if (rb_Q1207_1.isChecked()) {
            Q1207 = "1";
        } else if (rb_Q1207_2.isChecked()) {
            Q1207 = "2";
        } else if (rb_Q1207_DK.isChecked()) {
            Q1207 = "9";
        }

        if (ed_Q1208.getText().toString().trim().length() > 0) {
            Q1208 = ed_Q1208.getText().toString().trim();
        }

        if (ed_Q1209.getText().toString().trim().length() > 0) {
            Q1209 = ed_Q1209.getText().toString().trim();
        }

        if (ed_Q1301.getText().toString().trim().length() > 0) {
            Q1301 = ed_Q1301.getText().toString().trim();
        }

        if (ed_Q1302.getText().toString().trim().length() > 0) {
            Q1302 = ed_Q1302.getText().toString().trim();
        }

        if (ed_Q1307.getText().toString().trim().length() > 0) {
            Q1307 = ed_Q1307.getText().toString().trim();
        }

        if (ed_Q1308.getText().toString().trim().length() > 0) {
            Q1308 = ed_Q1308.getText().toString().trim();
        }

        if (ed_Q1309.getText().toString().trim().length() > 0) {
            Q1309 = ed_Q1309.getText().toString().trim();
        }

        if (ed_Q1310.getText().toString().trim().length() > 0) {
            Q1310 = ed_Q1310.getText().toString().trim();
        }

        if (rb_Q1311_1.isChecked()) {
            Q1311 = "1";
        } else if (rb_Q1311_2.isChecked()) {
            Q1311 = "2";
        } else if (rb_Q1311_3.isChecked()) {
            Q1311 = "3";
        } else if (rb_Q1311_4.isChecked()) {
            Q1311 = "4";
        } else if (rb_Q1311_5.isChecked()) {
            Q1311 = "5";
        } else if (rb_Q1311_6.isChecked()) {
            Q1311 = "6";
        } else if (rb_Q1311_7.isChecked()) {
            Q1311 = "7";
        } else if (rb_Q1311_8.isChecked()) {
            Q1311 = "8";
        } else if (rb_Q1311_9.isChecked()) {
            Q1311 = "9";
        } else if (rb_Q1311_10.isChecked()) {
            Q1311 = "10";
        } else if (rb_Q1311_11.isChecked()) {
            Q1311 = "11";
        } else if (rb_Q1311_12.isChecked()) {
            Q1311 = "12";
        }

        if (ed_Q1312.getText().toString().trim().length() > 0) {
            Q1312 = ed_Q1312.getText().toString().trim();
        }

        if (ed_Q1313.getText().toString().trim().length() > 0) {
            Q1313 = ed_Q1313.getText().toString().trim();
        }

        if (ed_Q1401.getText().toString().trim().length() > 0) {
            Q1401 = ed_Q1401.getText().toString().trim();
        }

        if (rb_Q1402_1.isChecked()) {
            Q1402 = "1";
        } else if (rb_Q1402_2.isChecked()) {
            Q1402 = "2";
        } else if (rb_Q1402_DK.isChecked()) {
            Q1402 = "9";
        }

        if (rb_Q1403_1.isChecked()) {
            Q1403 = "1";
        } else if (rb_Q1403_2.isChecked()) {
            Q1403 = "2";
        } else if (rb_Q1403_3.isChecked()) {
            Q1403 = "3";
        } else if (rb_Q1403_4.isChecked()) {
            Q1403 = "4";
        } else if (rb_Q1403_5.isChecked()) {
            Q1403 = "5";
        } else if (rb_Q1403_6.isChecked()) {
            Q1403 = "6";
        } else if (rb_Q1403_7.isChecked()) {
            Q1403 = "7";
        } else if (rb_Q1403_8.isChecked()) {
            Q1403 = "8";
        } else if (rb_Q1403_9.isChecked()) {
            Q1403 = "9";
        } else if (rb_Q1403_10.isChecked()) {
            Q1403 = "10";
        } else if (rb_Q1403_11.isChecked()) {
            Q1403 = "11";
        } else if (rb_Q1403_12.isChecked()) {
            Q1403 = "12";
            Q1403_OT = ed_Q1403_OT.getText().toString().trim();
        } else if (rb_Q1403_13.isChecked()) {
            Q1403 = "13";
            Q1403_OT = ed_Q1403_OT.getText().toString().trim();
        } else if (rb_Q1403_14.isChecked()) {
            Q1403 = "14";
            Q1403_OT = ed_Q1403_OT.getText().toString().trim();
        }

        if (rb_Q1404_1.isChecked()) {
            Q1404 = "1";
        } else if (rb_Q1404_2.isChecked()) {
            Q1404 = "2";
        } else if (rb_Q1404_DK.isChecked()) {
            Q1404 = "9";
        }

        if (rb_Q1405_1.isChecked()) {
            Q1405 = "1";
        } else if (rb_Q1405_2.isChecked()) {
            Q1405 = "2";
        }

        if (ed_Q1406.getText().toString().trim().length() > 0) {
            Q1406 = ed_Q1406.getText().toString().trim();
        }

        if (rb_Q1407_1.isChecked()) {
            Q1407 = "1";
        } else if (rb_Q1407_2.isChecked()) {
            Q1407 = "2";
        } else if (rb_Q1407_DK.isChecked()) {
            Q1407 = "9";
        }

        if (rb_Q1408_1.isChecked()) {
            Q1408 = "1";
        } else if (rb_Q1408_2.isChecked()) {
            Q1408 = "2";
        } else if (rb_Q1408_3.isChecked()) {
            Q1408 = "3";
        } else if (rb_Q1408_DK.isChecked()) {
            Q1408 = "9";
        }

        if (ed_Q1409.getText().toString().trim().length() > 0) {
            Q1409 = ed_Q1409.getText().toString().trim();
        }

        if (rb_Q1410_1.isChecked()) {
            Q1410 = "1";
        } else if (rb_Q1410_2.isChecked()) {
            Q1410 = "2";
        } else if (rb_Q1410_3.isChecked()) {
            Q1410 = "3";
        } else if (rb_Q1410_4.isChecked()) {
            Q1410 = "4";
        } else if (rb_Q1410_5.isChecked()) {
            Q1410 = "5";
        }

        if (ed_Q1411.getText().toString().trim().length() > 0) {
            Q1411 = ed_Q1411.getText().toString().trim();
        }

        if (ed_Q1412.getText().toString().trim().length() > 0) {
            Q1412 = ed_Q1412.getText().toString().trim();
        }

        if (rb_Q1413_1.isChecked()) {
            Q1413 = "1";
        } else if (rb_Q1413_2.isChecked()) {
            Q1413 = "2";
        } else if (rb_Q1413_DK.isChecked()) {
            Q1413 = "9";
        }

        if (rb_Q1414_1_1.isChecked()) {
            Q1414_1 = "1";
        } else if (rb_Q1414_1_2.isChecked()) {
            Q1414_1 = "2";
        } else if (rb_Q1414_1_DK.isChecked()) {
            Q1414_1 = "9";
        }

        if (rb_Q1414_2_1.isChecked()) {
            Q1414_2 = "1";
        } else if (rb_Q1414_2_2.isChecked()) {
            Q1414_2 = "2";
        } else if (rb_Q1414_2_DK.isChecked()) {
            Q1414_2 = "9";
        }

        if (rb_Q1414_3_1.isChecked()) {
            Q1414_3 = "1";
        } else if (rb_Q1414_3_2.isChecked()) {
            Q1414_3 = "2";
        } else if (rb_Q1414_3_DK.isChecked()) {
            Q1414_3 = "9";
        }

        if (rb_Q1414_4_1.isChecked()) {
            Q1414_4 = "1";
        } else if (rb_Q1414_4_2.isChecked()) {
            Q1414_4 = "2";
        } else if (rb_Q1414_4_DK.isChecked()) {
            Q1414_4 = "9";
        }

        if (rb_Q1414_5_1.isChecked()) {
            Q1414_5 = "1";
        } else if (rb_Q1414_5_2.isChecked()) {
            Q1414_5 = "2";
        } else if (rb_Q1414_5_DK.isChecked()) {
            Q1414_5 = "9";
        }

        if (rb_Q1414_6_1.isChecked()) {
            Q1414_6 = "1";
        } else if (rb_Q1414_6_2.isChecked()) {
            Q1414_6 = "2";
        } else if (rb_Q1414_6_DK.isChecked()) {
            Q1414_6 = "9";
        }

        if (rb_Q1414_7_1.isChecked()) {
            Q1414_7 = "1";
        } else if (rb_Q1414_7_2.isChecked()) {
            Q1414_7 = "2";
        } else if (rb_Q1414_7_DK.isChecked()) {
            Q1414_7 = "9";
        }

        if (rb_Q1414_8_1.isChecked()) {
            Q1414_8 = "1";
        } else if (rb_Q1414_8_2.isChecked()) {
            Q1414_8 = "2";
        } else if (rb_Q1414_8_DK.isChecked()) {
            Q1414_8 = "9";
        }

        if (rb_Q1414_9_1.isChecked()) {
            Q1414_9 = "1";
        } else if (rb_Q1414_9_2.isChecked()) {
            Q1414_9 = "2";
        } else if (rb_Q1414_9_DK.isChecked()) {
            Q1414_9 = "9";
        }

        if (rb_Q1414_10_1.isChecked()) {
            Q1414_10 = "1";
        } else if (rb_Q1414_10_2.isChecked()) {
            Q1414_10 = "2";
        } else if (rb_Q1414_10_DK.isChecked()) {
            Q1414_10 = "9";
        }

        if (rb_Q1415_1.isChecked()) {
            Q1415 = "1";
        } else if (rb_Q1415_2.isChecked()) {
            Q1415 = "2";
        } else if (rb_Q1415_3.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_4.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_5.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_6.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_7.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_8.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_9.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_10.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_11.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_12.isChecked()) {
            Q1415 = "3";
        } else if (rb_Q1415_DK.isChecked()) {
            Q1415 = "99";
        }

        if (rb_Q1416_1.isChecked()) {
            Q1416 = "1";
        } else if (rb_Q1416_2.isChecked()) {
            Q1416 = "2";
        } else if (rb_Q1416_3.isChecked()) {
            Q1416 = "3";
        } else if (rb_Q1416_4.isChecked()) {
            Q1416 = "4";
        } else if (rb_Q1416_5.isChecked()) {
            Q1416 = "5";
        } else if (rb_Q1416_6.isChecked()) {
            Q1416 = "6";
        } else if (rb_Q1416_7.isChecked()) {
            Q1416 = "7";
        } else if (rb_Q1416_8.isChecked()) {
            Q1416 = "8";
            Q1416_OT = ed_Q1416_OT.getText().toString().trim();
        } else if (rb_Q1416_DK.isChecked()) {
            Q1416 = "9";
        }

        if (rb_Q1417_1.isChecked()) {
            Q1417 = "1";
        } else if (rb_Q1417_2.isChecked()) {
            Q1417 = "2";
        } else if (rb_Q1417_3.isChecked()) {
            Q1417 = "3";
        } else if (rb_Q1417_4.isChecked()) {
            Q1417 = "4";
        } else if (rb_Q1417_5.isChecked()) {
            Q1417 = "5";
        } else if (rb_Q1417_6.isChecked()) {
            Q1417 = "6";
        } else if (rb_Q1417_7.isChecked()) {
            Q1417 = "7";
        } else if (rb_Q1417_8.isChecked()) {
            Q1417 = "8";
        } else if (rb_Q1417_9.isChecked()) {
            Q1417 = "9";
            Q1417_OT = ed_Q1417_OT.getText().toString().trim();
        } else if (rb_Q1417_DK.isChecked()) {
            Q1417 = "99";
        }

        if (rb_Q1418_1.isChecked()) {
            Q1418 = "1";
        } else if (rb_Q1418_2.isChecked()) {
            Q1418 = "2";
        } else if (rb_Q1418_3.isChecked()) {
            Q1418 = "3";
        } else if (rb_Q1418_4.isChecked()) {
            Q1418 = "4";
        } else if (rb_Q1418_5.isChecked()) {
            Q1418 = "5";
        } else if (rb_Q1418_6.isChecked()) {
            Q1418 = "6";
        } else if (rb_Q1418_7.isChecked()) {
            Q1418 = "7";
        } else if (rb_Q1418_8.isChecked()) {
            Q1418 = "8";
        } else if (rb_Q1418_9.isChecked()) {
            Q1418 = "9";
            Q1418_OT = ed_Q1418_OT.getText().toString().trim();
        } else if (rb_Q1418_DK.isChecked()) {
            Q1418 = "99";
        }

        if (rb_Q1419_1.isChecked()) {
            Q1419 = "1";
        } else if (rb_Q1419_2.isChecked()) {
            Q1419 = "2";
        } else if (rb_Q1419_3.isChecked()) {
            Q1419 = "3";
        } else if (rb_Q1419_4.isChecked()) {
            Q1419 = "4";
        } else if (rb_Q1419_5.isChecked()) {
            Q1419 = "5";
        } else if (rb_Q1419_6.isChecked()) {
            Q1419 = "6";
        } else if (rb_Q1419_7.isChecked()) {
            Q1419 = "7";
        } else if (rb_Q1419_8.isChecked()) {
            Q1419 = "8";
            Q1419_OT = ed_Q1419_OT.getText().toString().trim();
        } else if (rb_Q1419_DK.isChecked()) {
            Q1419 = "9";
        }

        if (rb_Q1420_1.isChecked()) {
            Q1420 = "1";
        } else if (rb_Q1420_2.isChecked()) {
            Q1420 = "2";
        } else if (rb_Q1420_3.isChecked()) {
            Q1420 = "3";
        } else if (rb_Q1420_4.isChecked()) {
            Q1420 = "4";
        } else if (rb_Q1420_5.isChecked()) {
            Q1420 = "5";
        } else if (rb_Q1420_6.isChecked()) {
            Q1420 = "6";
        } else if (rb_Q1420_7.isChecked()) {
            Q1420 = "7";
            Q1420_OT = ed_Q1420_OT.getText().toString().trim();
        } else if (rb_Q1420_DK.isChecked()) {
            Q1420 = "9";
        }

        if (rb_Q1421_1.isChecked()) {
            Q1421 = "1";
        } else if (rb_Q1421_2.isChecked()) {
            Q1421 = "2";
        } else if (rb_Q1421_3.isChecked()) {
            Q1421 = "3";
        } else if (rb_Q1421_4.isChecked()) {
            Q1421 = "4";
        } else if (rb_Q1421_5.isChecked()) {
            Q1421 = "5";
        } else if (rb_Q1421_6.isChecked()) {
            Q1421 = "6";
        } else if (rb_Q1421_7.isChecked()) {
            Q1421 = "7";
        } else if (rb_Q1421_8.isChecked()) {
            Q1421 = "8";
        } else if (rb_Q1421_9.isChecked()) {
            Q1421 = "9";
        } else if (rb_Q1421_10.isChecked()) {
            Q1421 = "10";
            Q1421_OT = ed_Q1421_OT.getText().toString().trim();
        } else if (rb_Q1421_DK.isChecked()) {
            Q1421 = "99";
        }

        if (rb_Q1501_1.isChecked()) {
            Q1501 = "1";
        } else if (rb_Q1501_2.isChecked()) {
            Q1501 = "2";
        }

        if (ed_Q1502.getText().toString().trim().length() > 0) {
            Q1502 = ed_Q1502.getText().toString().trim();
        }

        if (rb_Q1503_1.isChecked()) {
            Q1503 = "1";
        } else if (rb_Q1503_2.isChecked()) {
            Q1503 = "2";
        } else if (rb_Q1503_3.isChecked()) {
            Q1503 = "3";
        } else if (rb_Q1503_4.isChecked()) {
            Q1503 = "4";
        } else if (rb_Q1503_5.isChecked()) {
            Q1503 = "5";
        } else if (rb_Q1503_6.isChecked()) {
            Q1503 = "6";
        } else if (rb_Q1503_7.isChecked()) {
            Q1503 = "7";
        } else if (rb_Q1503_8.isChecked()) {
            Q1503 = "8";
        } else if (rb_Q1503_9.isChecked()) {
            Q1503 = "9";
        } else if (rb_Q1503_10.isChecked()) {
            Q1503 = "10";
        } else if (rb_Q1503_11.isChecked()) {
            Q1503 = "11";
        } else if (rb_Q1503_12.isChecked()) {
            Q1503 = "12";
            Q1503_OT = ed_Q1503_OT.getText().toString().trim();
        } else if (rb_Q1503_13.isChecked()) {
            Q1503 = "13";
            Q1503_OT = ed_Q1503_OT.getText().toString().trim();
        } else if (rb_Q1503_14.isChecked()) {
            Q1503 = "14";
            Q1503_OT = ed_Q1503_OT.getText().toString().trim();
        }

        if (rb_Q1601_1.isChecked()) {
            Q1601 = "1";
        } else if (rb_Q1601_2.isChecked()) {
            Q1601 = "2";
        } else if (rb_Q1601_DK.isChecked()) {
            Q1601 = "9";
        }

        if (rb_Q1602_1.isChecked()) {
            Q1602 = "1";
        } else if (rb_Q1602_2.isChecked()) {
            Q1602 = "2";
        } else if (rb_Q1602_DK.isChecked()) {
            Q1602 = "9";
        }

        if (ed_Q1603.getText().toString().trim().length() > 0) {
            Q1603 = ed_Q1603.getText().toString().trim();
        }

        if (rb_Q1604_1.isChecked()) {
            Q1604 = "1";
        } else if (rb_Q1604_2.isChecked()) {
            Q1604 = "2";
        } else if (rb_Q1604_3.isChecked()) {
            Q1604 = "3";
        } else if (rb_Q1604_4.isChecked()) {
            Q1604 = "4";
        } else if (rb_Q1604_5.isChecked()) {
            Q1604 = "5";
            Q1604_OT = ed_Q1604_OT.getText().toString().trim();
        } else if (rb_Q1604_DK.isChecked()) {
            Q1604 = "9";
        }

        if (rb_Q1605_1.isChecked()) {
            Q1605 = "1";
        } else if (rb_Q1605_2.isChecked()) {
            Q1605 = "2";
        }

        if (ed_Q1606.getText().toString().trim().length() > 0) {
            Q1606 = ed_Q1606.getText().toString().trim();
        }

        if (ed_Q1607_1.getText().toString().trim().length() > 0) {
            Q1607_1 = ed_Q1607_1.getText().toString().trim();
        }

        if (ed_Q1607_2.getText().toString().trim().length() > 0) {
            Q1607_2 = ed_Q1607_2.getText().toString().trim();
        }

        if (ed_Q1607_3.getText().toString().trim().length() > 0) {
            Q1607_3 = ed_Q1607_3.getText().toString().trim();
        }

        if (ed_Q1608_1.getText().toString().trim().length() > 0) {
            Q1608_1 = ed_Q1608_1.getText().toString().trim();
        }

        if (ed_Q1608_2.getText().toString().trim().length() > 0) {
            Q1608_2 = ed_Q1608_2.getText().toString().trim();
        }

        if (ed_Q1608_3.getText().toString().trim().length() > 0) {
            Q1608_3 = ed_Q1608_3.getText().toString().trim();
        }

        if (rb_Q1609_1.isChecked()) {
            Q1609 = "1";
        } else if (rb_Q1609_2.isChecked()) {
            Q1609 = "2";
        } else if (rb_Q1609_3.isChecked()) {
            Q1609 = "3";
        } else if (rb_Q1609_4.isChecked()) {
            Q1609 = "4";
        } else if (rb_Q1609_5.isChecked()) {
            Q1609 = "5";
        }

        if (ed_Q1610_1.getText().toString().trim().length() > 0) {
            Q1610_1 = ed_Q1610_1.getText().toString().trim();
        }

        if (ed_Q1610_2.getText().toString().trim().length() > 0) {
            Q1610_2 = ed_Q1610_2.getText().toString().trim();
        }

        if (ed_Q1610_3.getText().toString().trim().length() > 0) {
            Q1610_3 = ed_Q1610_3.getText().toString().trim();
        }

    }

    void insert_data() {

        String query = "insert into   Q1101_Q1610("
                + data.Q1101_Q1610.study_id + ","
                + data.Q1101_Q1610.Q1101 + ","
                + data.Q1101_Q1610.Q1102 + ","
                + data.Q1101_Q1610.Q1103 + ","
                + data.Q1101_Q1610.Q1202 + ","
                + data.Q1101_Q1610.Q1203 + ","
                + data.Q1101_Q1610.Q1204 + ","
                + data.Q1101_Q1610.Q1205 + ","
                + data.Q1101_Q1610.Q1206_d + ","
                + data.Q1101_Q1610.Q1206_m + ","
                + data.Q1101_Q1610.Q1206_y + ","
                + data.Q1101_Q1610.Q1207 + ","
                + data.Q1101_Q1610.Q1208 + ","
                + data.Q1101_Q1610.Q1209 + ","
                + data.Q1101_Q1610.Q1301 + ","
                + data.Q1101_Q1610.Q1302 + ","
                + data.Q1101_Q1610.Q1307 + ","
                + data.Q1101_Q1610.Q1308 + ","
                + data.Q1101_Q1610.Q1309 + ","
                + data.Q1101_Q1610.Q1310 + ","
                + data.Q1101_Q1610.Q1311 + ","
                + data.Q1101_Q1610.Q1312 + ","
                + data.Q1101_Q1610.Q1313 + ","
                + data.Q1101_Q1610.Q1401 + ","
                + data.Q1101_Q1610.Q1402 + ","
                + data.Q1101_Q1610.Q1403 + ","
                + data.Q1101_Q1610.Q1403_OT + ","
                + data.Q1101_Q1610.Q1404 + ","
                + data.Q1101_Q1610.Q1405 + ","
                + data.Q1101_Q1610.Q1406 + ","
                + data.Q1101_Q1610.Q1407 + ","
                + data.Q1101_Q1610.Q1408 + ","
                + data.Q1101_Q1610.Q1409 + ","
                + data.Q1101_Q1610.Q1410 + ","
                + data.Q1101_Q1610.Q1411 + ","
                + data.Q1101_Q1610.Q1412 + ","
                + data.Q1101_Q1610.Q1413 + ","
                + data.Q1101_Q1610.Q1414_1 + ","
                + data.Q1101_Q1610.Q1414_2 + ","
                + data.Q1101_Q1610.Q1414_3 + ","
                + data.Q1101_Q1610.Q1414_4 + ","
                + data.Q1101_Q1610.Q1414_5 + ","
                + data.Q1101_Q1610.Q1414_6 + ","
                + data.Q1101_Q1610.Q1414_7 + ","
                + data.Q1101_Q1610.Q1414_8 + ","
                + data.Q1101_Q1610.Q1414_9 + ","
                + data.Q1101_Q1610.Q1414_10 + ","
                + data.Q1101_Q1610.Q1415 + ","
                + data.Q1101_Q1610.Q1416 + ","
                + data.Q1101_Q1610.Q1416_OT + ","
                + data.Q1101_Q1610.Q1417 + ","
                + data.Q1101_Q1610.Q1417_OT + ","
                + data.Q1101_Q1610.Q1418 + ","
                + data.Q1101_Q1610.Q1418_OT + ","
                + data.Q1101_Q1610.Q1419 + ","
                + data.Q1101_Q1610.Q1419_OT + ","
                + data.Q1101_Q1610.Q1420 + ","
                + data.Q1101_Q1610.Q1420_OT + ","
                + data.Q1101_Q1610.Q1421 + ","
                + data.Q1101_Q1610.Q1421_OT + ","
                + data.Q1101_Q1610.Q1501 + ","
                + data.Q1101_Q1610.Q1502 + ","
                + data.Q1101_Q1610.Q1503 + ","
                + data.Q1101_Q1610.Q1503_OT + ","
                + data.Q1101_Q1610.Q1601 + ","
                + data.Q1101_Q1610.Q1602 + ","
                + data.Q1101_Q1610.Q1603 + ","
                + data.Q1101_Q1610.Q1604 + ","
                + data.Q1101_Q1610.Q1604_OT + ","
                + data.Q1101_Q1610.Q1605 + ","
                + data.Q1101_Q1610.Q1606 + ","
                + data.Q1101_Q1610.Q1607_1 + ","
                + data.Q1101_Q1610.Q1607_2 + ","
                + data.Q1101_Q1610.Q1607_3 + ","
                + data.Q1101_Q1610.Q1608_1 + ","
                + data.Q1101_Q1610.Q1608_2 + ","
                + data.Q1101_Q1610.Q1608_3 + ","
                + data.Q1101_Q1610.Q1609 + ","
                + data.Q1101_Q1610.Q1610_1 + ","
                + data.Q1101_Q1610.Q1610_2 + ","
                + data.Q1101_Q1610.Q1610_3 + ","
                + data.Q1101_Q1610.STATUS + ") values ('" +

                study_id + "','" +
                Q1101 + "','" +
                Q1102 + "','" +
                Q1103 + "','" +
                Q1202 + "','" +
                Q1203 + "','" +
                Q1204 + "','" +
                Q1205 + "','" +
                Q1206_d + "','" +
                Q1206_m + "','" +
                Q1206_y + "','" +
                Q1207 + "','" +
                Q1208 + "','" +
                Q1209 + "','" +
                Q1301 + "','" +
                Q1302 + "','" +
                Q1307 + "','" +
                Q1308 + "','" +
                Q1309 + "','" +
                Q1310 + "','" +
                Q1311 + "','" +
                Q1312 + "','" +
                Q1313 + "','" +
                Q1401 + "','" +
                Q1402 + "','" +
                Q1403 + "','" +
                Q1403_OT + "','" +
                Q1404 + "','" +
                Q1405 + "','" +
                Q1406 + "','" +
                Q1407 + "','" +
                Q1408 + "','" +
                Q1409 + "','" +
                Q1410 + "','" +
                Q1411 + "','" +
                Q1412 + "','" +
                Q1413 + "','" +
                Q1414_1 + "','" +
                Q1414_2 + "','" +
                Q1414_3 + "','" +
                Q1414_4 + "','" +
                Q1414_5 + "','" +
                Q1414_6 + "','" +
                Q1414_7 + "','" +
                Q1414_8 + "','" +
                Q1414_9 + "','" +
                Q1414_10 + "','" +
                Q1415 + "','" +
                Q1416 + "','" +
                Q1416_OT + "','" +
                Q1417 + "','" +
                Q1417_OT + "','" +
                Q1418 + "','" +
                Q1418_OT + "','" +
                Q1419 + "','" +
                Q1419_OT + "','" +
                Q1420 + "','" +
                Q1420_OT + "','" +
                Q1421 + "','" +
                Q1421_OT + "','" +
                Q1501 + "','" +
                Q1502 + "','" +
                Q1503 + "','" +
                Q1503_OT + "','" +
                Q1601 + "','" +
                Q1602 + "','" +
                Q1603 + "','" +
                Q1604 + "','" +
                Q1604_OT + "','" +
                Q1605 + "','" +
                Q1606 + "','" +
                Q1607_1 + "','" +
                Q1607_2 + "','" +
                Q1607_3 + "','" +
                Q1608_1 + "','" +
                Q1608_2 + "','" +
                Q1608_3 + "','" +
                Q1609 + "','" +
                Q1610_1 + "','" +
                Q1610_2 + "','" +
                Q1610_3 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "General Section", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        //if (Gothrough.IamHiden(ll_Q1101) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1102) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1103) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1202) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1203) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1204) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1205) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1206_d) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1206_m) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1206_y) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1207) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1208) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1209) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1301) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1302) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1307) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1308) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1309) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1310) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1311) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1312) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1313) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1401) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1402) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1403) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1403_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1404) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1405) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1406) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1407) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1408) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1409) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1410) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1411) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1412) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1413) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_1) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_2) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_3) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_4) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_5) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_6) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_7) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_8) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_9) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1414_10) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1415) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1416) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1416_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1417) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1417_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1418) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1418_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1419) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1419_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1420) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1420_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1421) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1421_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1501) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1502) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1503) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1503_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1601) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1602) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1603) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1604) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1604_OT) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1605) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1606) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1607) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1608) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1609) == false){
        //    return false;
        //}
//
        //if (Gothrough.IamHiden(ll_Q1610) == false){
        //    return false;
        //}

        return true;
    }

}