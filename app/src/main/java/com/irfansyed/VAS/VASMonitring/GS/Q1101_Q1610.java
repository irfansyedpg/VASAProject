package com.irfansyed.VAS.VASMonitring.GS;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.C.C3001_C3011;
import com.irfansyed.VAS.VASMonitring.C.C3012_C3022;
import com.irfansyed.VAS.VASMonitring.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;

import static java.lang.Integer.parseInt;

public class Q1101_Q1610 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, TextWatcher {

    private Pattern pattern;
    private Matcher matcher;
    private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";

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
            ed_Q1610_3,
            ed_dob;

    String
            Q1101,
            Q1102,
            Q1103,
            Q1202,
            Q1203,
            Q1204,
            Q1205,
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
            Q1608_1,
            Q1608_2,
            Q1608_3,
            Q1609,
            Q1610_1,
            Q1610_2,
            Q1610_3,
            STATUS,
            study_id;

    int
            Q1206_d,
            Q1206_m,
            Q1206_y,
            Q1607_1,
            Q1607_2,
            Q1607_3;

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

        pattern = Pattern.compile(DATE_PATTERN);

        if (!validate(ed_Q1204.getText().toString().trim())) {

            ed_Q1204.setError("Kindly enter a valid date");
            ed_Q1204.requestFocus();
            return;
        }

        if (!validate(ed_Q1205.getText().toString().trim())) {

            ed_Q1205.setError("Kindly enter a valid date");
            ed_Q1205.requestFocus();
            return;
        }

        if (!validate(ed_Q1307.getText().toString().trim())) {

            ed_Q1307.setError("Kindly enter a valid date");
            ed_Q1307.requestFocus();
            return;
        }

        if (!validate(ed_Q1309.getText().toString().trim())) {

            ed_Q1309.setError("Kindly enter a valid date");
            ed_Q1309.requestFocus();
            return;
        }

        if (!validate(ed_Q1312.getText().toString().trim())) {

            ed_Q1312.setError("Kindly enter a valid date");
            ed_Q1312.requestFocus();
            return;
        }

        if (!validate(ed_Q1313.getText().toString().trim())) {

            ed_Q1313.setError("Kindly enter a valid date");
            ed_Q1313.requestFocus();
            return;
        }

        if (!validate(ed_Q1603.getText().toString().trim())) {

            ed_Q1603.setError("Kindly enter a valid date");
            ed_Q1603.requestFocus();
            return;
        }

        if (!validate(ed_Q1606.getText().toString().trim())) {

            ed_Q1606.setError("Kindly enter a valid date");
            ed_Q1606.requestFocus();
            return;
        }

        value_assignment();
        insert_data();

        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("Q1101_Q1610");

        if (res.getCount() > 0) {

            res.moveToFirst();

            //if (parseInt(res.getString(78)) == 5) {

            //  Intent c = new Intent(this, A4001_A4014.class);
            //startActivity(c);

            //} else if (parseInt(res.getString(78)) == 1) {

            //  Intent c = new Intent(this, N2001_N2011.class);
            //startActivity(c);

            //}

            if (parseInt(res.getString(78)) == 2) {

                Intent c = new Intent(this, C3001_C3011.class);
                startActivity(c);

            } else {

                //C3001_C3011.value_assignment();

                Intent c = new Intent(this, C3012_C3022.class);
                startActivity(c);
            }
        }
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);

        // Layouts

        ll_Q1101 = findViewById(R.id.ll_Q1101);
        ll_Q1102 = findViewById(R.id.ll_Q1102);
        ll_Q1103 = findViewById(R.id.ll_Q1103);
        ll_Q1202 = findViewById(R.id.ll_Q1202);
        ll_Q1203 = findViewById(R.id.ll_Q1203);
        ll_Q1204 = findViewById(R.id.ll_Q1204);
        ll_Q1205 = findViewById(R.id.ll_Q1205);
        ll_Q1206_d = findViewById(R.id.ll_Q1206_d);
        ll_Q1206_m = findViewById(R.id.ll_Q1206_m);
        ll_Q1206_y = findViewById(R.id.ll_Q1206_y);
        ll_Q1207 = findViewById(R.id.ll_Q1207);
        ll_Q1208 = findViewById(R.id.ll_Q1208);
        ll_Q1209 = findViewById(R.id.ll_Q1209);
        ll_Q1301 = findViewById(R.id.ll_Q1301);
        ll_Q1302 = findViewById(R.id.ll_Q1302);
        ll_Q1307 = findViewById(R.id.ll_Q1307);
        ll_Q1308 = findViewById(R.id.ll_Q1308);
        ll_Q1309 = findViewById(R.id.ll_Q1309);
        ll_Q1310 = findViewById(R.id.ll_Q1310);
        ll_Q1311 = findViewById(R.id.ll_Q1311);
        ll_Q1312 = findViewById(R.id.ll_Q1312);
        ll_Q1313 = findViewById(R.id.ll_Q1313);
        ll_Q1401 = findViewById(R.id.ll_Q1401);
        ll_Q1402 = findViewById(R.id.ll_Q1402);
        ll_Q1403 = findViewById(R.id.ll_Q1403);
        ll_Q1403_OT = findViewById(R.id.ll_Q1403_OT);
        ll_Q1404 = findViewById(R.id.ll_Q1404);
        ll_Q1405 = findViewById(R.id.ll_Q1405);
        ll_Q1406 = findViewById(R.id.ll_Q1406);
        ll_Q1407 = findViewById(R.id.ll_Q1407);
        ll_Q1408 = findViewById(R.id.ll_Q1408);
        ll_Q1409 = findViewById(R.id.ll_Q1409);
        ll_Q1410 = findViewById(R.id.ll_Q1410);
        ll_Q1411 = findViewById(R.id.ll_Q1411);
        ll_Q1412 = findViewById(R.id.ll_Q1412);
        ll_Q1413 = findViewById(R.id.ll_Q1413);

        ll_Q1414_1 = findViewById(R.id.ll_Q1414_1);
        ll_Q1414_2 = findViewById(R.id.ll_Q1414_2);
        ll_Q1414_3 = findViewById(R.id.ll_Q1414_3);
        ll_Q1414_4 = findViewById(R.id.ll_Q1414_4);
        ll_Q1414_5 = findViewById(R.id.ll_Q1414_5);
        ll_Q1414_6 = findViewById(R.id.ll_Q1414_6);
        ll_Q1414_7 = findViewById(R.id.ll_Q1414_7);
        ll_Q1414_8 = findViewById(R.id.ll_Q1414_8);
        ll_Q1414_9 = findViewById(R.id.ll_Q1414_9);
        ll_Q1414_10 = findViewById(R.id.ll_Q1414_10);
        ll_Q1415 = findViewById(R.id.ll_Q1415);


        ll_Q1416 = findViewById(R.id.ll_Q1416);
        ll_Q1416_OT = findViewById(R.id.ll_Q1416_OT);
        ll_Q1417 = findViewById(R.id.ll_Q1417);
        ll_Q1417_OT = findViewById(R.id.ll_Q1417_OT);
        ll_Q1418 = findViewById(R.id.ll_Q1418);
        ll_Q1418_OT = findViewById(R.id.ll_Q1418_OT);
        ll_Q1419 = findViewById(R.id.ll_Q1419);
        ll_Q1419_OT = findViewById(R.id.ll_Q1419_OT);
        ll_Q1420 = findViewById(R.id.ll_Q1420);
        ll_Q1420_OT = findViewById(R.id.ll_Q1420_OT);
        ll_Q1421 = findViewById(R.id.ll_Q1421);
        ll_Q1421_OT = findViewById(R.id.ll_Q1421_OT);
        ll_Q1501 = findViewById(R.id.ll_Q1501);
        ll_Q1502 = findViewById(R.id.ll_Q1502);
        ll_Q1503 = findViewById(R.id.ll_Q1503);
        ll_Q1503_OT = findViewById(R.id.ll_Q1503_OT);
        ll_Q1601 = findViewById(R.id.ll_Q1601);
        ll_Q1602 = findViewById(R.id.ll_Q1602);
        ll_Q1603 = findViewById(R.id.ll_Q1603);
        ll_Q1604 = findViewById(R.id.ll_Q1604);
        ll_Q1604_OT = findViewById(R.id.ll_Q1604_OT);
        ll_Q1605 = findViewById(R.id.ll_Q1605);
        ll_Q1606 = findViewById(R.id.ll_Q1606);
        ll_Q1607 = findViewById(R.id.ll_Q1607);
        ll_Q1608 = findViewById(R.id.ll_Q1608);
        ll_Q1609 = findViewById(R.id.ll_Q1609);
        ll_Q1610 = findViewById(R.id.ll_Q1610);

        // Radio Buttons

        rb_Q1101_1 = findViewById(R.id.rb_Q1101_1);
        rb_Q1101_2 = findViewById(R.id.rb_Q1101_2);
        rb_Q1101_3 = findViewById(R.id.rb_Q1101_3);
        rb_Q1102_1 = findViewById(R.id.rb_Q1102_1);
        rb_Q1102_2 = findViewById(R.id.rb_Q1102_2);
        rb_Q1102_3 = findViewById(R.id.rb_Q1102_3);
        rb_Q1103_1 = findViewById(R.id.rb_Q1103_1);
        rb_Q1103_2 = findViewById(R.id.rb_Q1103_2);
        rb_Q1103_DK = findViewById(R.id.rb_Q1103_DK);
        rb_Q1203_1 = findViewById(R.id.rb_Q1203_1);
        rb_Q1203_2 = findViewById(R.id.rb_Q1203_2);
        rb_Q1207_1 = findViewById(R.id.rb_Q1207_1);
        rb_Q1207_2 = findViewById(R.id.rb_Q1207_2);
        rb_Q1207_DK = findViewById(R.id.rb_Q1207_DK);
        rb_Q1311_1 = findViewById(R.id.rb_Q1311_1);
        rb_Q1311_2 = findViewById(R.id.rb_Q1311_2);
        rb_Q1311_3 = findViewById(R.id.rb_Q1311_3);
        rb_Q1311_4 = findViewById(R.id.rb_Q1311_4);
        rb_Q1311_5 = findViewById(R.id.rb_Q1311_5);
        rb_Q1311_6 = findViewById(R.id.rb_Q1311_6);
        rb_Q1311_7 = findViewById(R.id.rb_Q1311_7);
        rb_Q1311_8 = findViewById(R.id.rb_Q1311_8);
        rb_Q1311_9 = findViewById(R.id.rb_Q1311_9);
        rb_Q1311_10 = findViewById(R.id.rb_Q1311_10);
        rb_Q1311_11 = findViewById(R.id.rb_Q1311_11);
        rb_Q1311_12 = findViewById(R.id.rb_Q1311_12);
        rb_Q1402_1 = findViewById(R.id.rb_Q1402_1);
        rb_Q1402_2 = findViewById(R.id.rb_Q1402_2);
        rb_Q1402_DK = findViewById(R.id.rb_Q1402_DK);
        rb_Q1403_1 = findViewById(R.id.rb_Q1403_1);
        rb_Q1403_2 = findViewById(R.id.rb_Q1403_2);
        rb_Q1403_3 = findViewById(R.id.rb_Q1403_3);
        rb_Q1403_4 = findViewById(R.id.rb_Q1403_4);
        rb_Q1403_5 = findViewById(R.id.rb_Q1403_5);
        rb_Q1403_6 = findViewById(R.id.rb_Q1403_6);
        rb_Q1403_7 = findViewById(R.id.rb_Q1403_7);
        rb_Q1403_8 = findViewById(R.id.rb_Q1403_8);
        rb_Q1403_9 = findViewById(R.id.rb_Q1403_9);
        rb_Q1403_10 = findViewById(R.id.rb_Q1403_10);
        rb_Q1403_11 = findViewById(R.id.rb_Q1403_11);
        rb_Q1403_12 = findViewById(R.id.rb_Q1403_12);
        rb_Q1403_13 = findViewById(R.id.rb_Q1403_13);
        rb_Q1403_14 = findViewById(R.id.rb_Q1403_14);
        rb_Q1404_1 = findViewById(R.id.rb_Q1404_1);
        rb_Q1404_2 = findViewById(R.id.rb_Q1404_2);
        rb_Q1404_DK = findViewById(R.id.rb_Q1404_DK);
        rb_Q1405_1 = findViewById(R.id.rb_Q1405_1);
        rb_Q1405_2 = findViewById(R.id.rb_Q1405_2);
        rb_Q1407_1 = findViewById(R.id.rb_Q1407_1);
        rb_Q1407_2 = findViewById(R.id.rb_Q1407_2);
        rb_Q1407_DK = findViewById(R.id.rb_Q1407_DK);
        rb_Q1408_1 = findViewById(R.id.rb_Q1408_1);
        rb_Q1408_2 = findViewById(R.id.rb_Q1408_2);
        rb_Q1408_3 = findViewById(R.id.rb_Q1408_3);
        rb_Q1408_DK = findViewById(R.id.rb_Q1408_DK);
        rb_Q1410_1 = findViewById(R.id.rb_Q1410_1);
        rb_Q1410_2 = findViewById(R.id.rb_Q1410_2);
        rb_Q1410_3 = findViewById(R.id.rb_Q1410_3);
        rb_Q1410_4 = findViewById(R.id.rb_Q1410_4);
        rb_Q1410_5 = findViewById(R.id.rb_Q1410_5);
        rb_Q1413_1 = findViewById(R.id.rb_Q1413_1);
        rb_Q1413_2 = findViewById(R.id.rb_Q1413_2);
        rb_Q1413_DK = findViewById(R.id.rb_Q1413_DK);
        rb_Q1414_1_1 = findViewById(R.id.rb_Q1414_1_1);
        rb_Q1414_1_2 = findViewById(R.id.rb_Q1414_1_2);
        rb_Q1414_1_DK = findViewById(R.id.rb_Q1414_1_DK);
        rb_Q1414_2_1 = findViewById(R.id.rb_Q1414_2_1);
        rb_Q1414_2_2 = findViewById(R.id.rb_Q1414_2_2);
        rb_Q1414_2_DK = findViewById(R.id.rb_Q1414_2_DK);
        rb_Q1414_3_1 = findViewById(R.id.rb_Q1414_3_1);
        rb_Q1414_3_2 = findViewById(R.id.rb_Q1414_3_2);
        rb_Q1414_3_DK = findViewById(R.id.rb_Q1414_3_DK);
        rb_Q1414_4_1 = findViewById(R.id.rb_Q1414_4_1);
        rb_Q1414_4_2 = findViewById(R.id.rb_Q1414_4_2);
        rb_Q1414_4_DK = findViewById(R.id.rb_Q1414_4_DK);
        rb_Q1414_5_1 = findViewById(R.id.rb_Q1414_5_1);
        rb_Q1414_5_2 = findViewById(R.id.rb_Q1414_5_2);
        rb_Q1414_5_DK = findViewById(R.id.rb_Q1414_5_DK);
        rb_Q1414_6_1 = findViewById(R.id.rb_Q1414_6_1);
        rb_Q1414_6_2 = findViewById(R.id.rb_Q1414_6_2);
        rb_Q1414_6_DK = findViewById(R.id.rb_Q1414_6_DK);
        rb_Q1414_7_1 = findViewById(R.id.rb_Q1414_7_1);
        rb_Q1414_7_2 = findViewById(R.id.rb_Q1414_7_2);
        rb_Q1414_7_DK = findViewById(R.id.rb_Q1414_7_DK);
        rb_Q1414_8_1 = findViewById(R.id.rb_Q1414_8_1);
        rb_Q1414_8_2 = findViewById(R.id.rb_Q1414_8_2);
        rb_Q1414_8_DK = findViewById(R.id.rb_Q1414_8_DK);
        rb_Q1414_9_1 = findViewById(R.id.rb_Q1414_9_1);
        rb_Q1414_9_2 = findViewById(R.id.rb_Q1414_9_2);
        rb_Q1414_9_DK = findViewById(R.id.rb_Q1414_9_DK);
        rb_Q1414_10_1 = findViewById(R.id.rb_Q1414_10_1);
        rb_Q1414_10_2 = findViewById(R.id.rb_Q1414_10_2);
        rb_Q1414_10_DK = findViewById(R.id.rb_Q1414_10_DK);
        rb_Q1415_1 = findViewById(R.id.rb_Q1415_1);
        rb_Q1415_2 = findViewById(R.id.rb_Q1415_2);
        rb_Q1415_3 = findViewById(R.id.rb_Q1415_3);
        rb_Q1415_4 = findViewById(R.id.rb_Q1415_4);
        rb_Q1415_5 = findViewById(R.id.rb_Q1415_5);
        rb_Q1415_6 = findViewById(R.id.rb_Q1415_6);
        rb_Q1415_7 = findViewById(R.id.rb_Q1415_7);
        rb_Q1415_8 = findViewById(R.id.rb_Q1415_8);
        rb_Q1415_9 = findViewById(R.id.rb_Q1415_9);
        rb_Q1415_10 = findViewById(R.id.rb_Q1415_10);
        rb_Q1415_11 = findViewById(R.id.rb_Q1415_11);
        rb_Q1415_12 = findViewById(R.id.rb_Q1415_12);
        rb_Q1415_DK = findViewById(R.id.rb_Q1415_DK);
        rb_Q1416_1 = findViewById(R.id.rb_Q1416_1);
        rb_Q1416_2 = findViewById(R.id.rb_Q1416_2);
        rb_Q1416_3 = findViewById(R.id.rb_Q1416_3);
        rb_Q1416_4 = findViewById(R.id.rb_Q1416_4);
        rb_Q1416_5 = findViewById(R.id.rb_Q1416_5);
        rb_Q1416_6 = findViewById(R.id.rb_Q1416_6);
        rb_Q1416_7 = findViewById(R.id.rb_Q1416_7);
        rb_Q1416_8 = findViewById(R.id.rb_Q1416_8);
        rb_Q1416_DK = findViewById(R.id.rb_Q1416_DK);
        rb_Q1417_1 = findViewById(R.id.rb_Q1417_1);
        rb_Q1417_2 = findViewById(R.id.rb_Q1417_2);
        rb_Q1417_3 = findViewById(R.id.rb_Q1417_3);
        rb_Q1417_4 = findViewById(R.id.rb_Q1417_4);
        rb_Q1417_5 = findViewById(R.id.rb_Q1417_5);
        rb_Q1417_6 = findViewById(R.id.rb_Q1417_6);
        rb_Q1417_7 = findViewById(R.id.rb_Q1417_7);
        rb_Q1417_8 = findViewById(R.id.rb_Q1417_8);
        rb_Q1417_9 = findViewById(R.id.rb_Q1417_9);
        rb_Q1417_DK = findViewById(R.id.rb_Q1417_DK);
        rb_Q1418_1 = findViewById(R.id.rb_Q1418_1);
        rb_Q1418_2 = findViewById(R.id.rb_Q1418_2);
        rb_Q1418_3 = findViewById(R.id.rb_Q1418_3);
        rb_Q1418_4 = findViewById(R.id.rb_Q1418_4);
        rb_Q1418_5 = findViewById(R.id.rb_Q1418_5);
        rb_Q1418_6 = findViewById(R.id.rb_Q1418_6);
        rb_Q1418_7 = findViewById(R.id.rb_Q1418_7);
        rb_Q1418_8 = findViewById(R.id.rb_Q1418_8);
        rb_Q1418_9 = findViewById(R.id.rb_Q1418_9);
        rb_Q1418_DK = findViewById(R.id.rb_Q1418_DK);
        rb_Q1419_1 = findViewById(R.id.rb_Q1419_1);
        rb_Q1419_2 = findViewById(R.id.rb_Q1419_2);
        rb_Q1419_3 = findViewById(R.id.rb_Q1419_3);
        rb_Q1419_4 = findViewById(R.id.rb_Q1419_4);
        rb_Q1419_5 = findViewById(R.id.rb_Q1419_5);
        rb_Q1419_6 = findViewById(R.id.rb_Q1419_6);
        rb_Q1419_7 = findViewById(R.id.rb_Q1419_7);
        rb_Q1419_8 = findViewById(R.id.rb_Q1419_8);
        rb_Q1419_DK = findViewById(R.id.rb_Q1419_DK);
        rb_Q1420_1 = findViewById(R.id.rb_Q1420_1);
        rb_Q1420_2 = findViewById(R.id.rb_Q1420_2);
        rb_Q1420_3 = findViewById(R.id.rb_Q1420_3);
        rb_Q1420_4 = findViewById(R.id.rb_Q1420_4);
        rb_Q1420_5 = findViewById(R.id.rb_Q1420_5);
        rb_Q1420_6 = findViewById(R.id.rb_Q1420_6);
        rb_Q1420_7 = findViewById(R.id.rb_Q1420_7);
        rb_Q1420_DK = findViewById(R.id.rb_Q1420_DK);

        rb_Q1421_1 = findViewById(R.id.rb_Q1421_1);
        rb_Q1421_2 = findViewById(R.id.rb_Q1421_2);
        rb_Q1421_3 = findViewById(R.id.rb_Q1421_3);
        rb_Q1421_4 = findViewById(R.id.rb_Q1421_4);
        rb_Q1421_5 = findViewById(R.id.rb_Q1421_5);
        rb_Q1421_6 = findViewById(R.id.rb_Q1421_6);
        rb_Q1421_7 = findViewById(R.id.rb_Q1421_7);
        rb_Q1421_8 = findViewById(R.id.rb_Q1421_8);
        rb_Q1421_9 = findViewById(R.id.rb_Q1421_9);
        rb_Q1421_10 = findViewById(R.id.rb_Q1421_10);
        rb_Q1421_DK = findViewById(R.id.rb_Q1421_DK);
        rb_Q1501_1 = findViewById(R.id.rb_Q1501_1);
        rb_Q1501_2 = findViewById(R.id.rb_Q1501_2);
        rb_Q1503_1 = findViewById(R.id.rb_Q1503_1);
        rb_Q1503_2 = findViewById(R.id.rb_Q1503_2);
        rb_Q1503_3 = findViewById(R.id.rb_Q1503_3);
        rb_Q1503_4 = findViewById(R.id.rb_Q1503_4);
        rb_Q1503_5 = findViewById(R.id.rb_Q1503_5);
        rb_Q1503_6 = findViewById(R.id.rb_Q1503_6);
        rb_Q1503_7 = findViewById(R.id.rb_Q1503_7);
        rb_Q1503_8 = findViewById(R.id.rb_Q1503_8);
        rb_Q1503_9 = findViewById(R.id.rb_Q1503_9);
        rb_Q1503_10 = findViewById(R.id.rb_Q1503_10);
        rb_Q1503_11 = findViewById(R.id.rb_Q1503_11);
        rb_Q1503_12 = findViewById(R.id.rb_Q1503_12);
        rb_Q1503_13 = findViewById(R.id.rb_Q1503_13);
        rb_Q1503_14 = findViewById(R.id.rb_Q1503_14);
        rb_Q1601_1 = findViewById(R.id.rb_Q1601_1);
        rb_Q1601_2 = findViewById(R.id.rb_Q1601_2);
        rb_Q1601_DK = findViewById(R.id.rb_Q1601_DK);
        rb_Q1602_1 = findViewById(R.id.rb_Q1602_1);
        rb_Q1602_2 = findViewById(R.id.rb_Q1602_2);
        rb_Q1602_DK = findViewById(R.id.rb_Q1602_DK);
        rb_Q1604_1 = findViewById(R.id.rb_Q1604_1);
        rb_Q1604_2 = findViewById(R.id.rb_Q1604_2);
        rb_Q1604_3 = findViewById(R.id.rb_Q1604_3);
        rb_Q1604_4 = findViewById(R.id.rb_Q1604_4);
        rb_Q1604_5 = findViewById(R.id.rb_Q1604_5);
        rb_Q1604_DK = findViewById(R.id.rb_Q1604_DK);
        rb_Q1605_1 = findViewById(R.id.rb_Q1605_1);
        rb_Q1605_2 = findViewById(R.id.rb_Q1605_2);
        rb_Q1609_1 = findViewById(R.id.rb_Q1609_1);
        rb_Q1609_2 = findViewById(R.id.rb_Q1609_2);
        rb_Q1609_3 = findViewById(R.id.rb_Q1609_3);
        rb_Q1609_4 = findViewById(R.id.rb_Q1609_4);
        rb_Q1609_5 = findViewById(R.id.rb_Q1609_5);


        ed_Q1202 = findViewById(R.id.ed_Q1202);
        ed_Q1204 = findViewById(R.id.ed_Q1204);
        ed_Q1205 = findViewById(R.id.ed_Q1205);
        ed_Q1206_d = findViewById(R.id.ed_Q1206_d);
        ed_Q1206_m = findViewById(R.id.ed_Q1206_m);
        ed_Q1206_y = findViewById(R.id.ed_Q1206_y);
        ed_Q1208 = findViewById(R.id.ed_Q1208);
        ed_Q1209 = findViewById(R.id.ed_Q1209);
        ed_Q1301 = findViewById(R.id.ed_Q1301);
        ed_Q1302 = findViewById(R.id.ed_Q1302);
        ed_Q1307 = findViewById(R.id.ed_Q1307);
        ed_Q1308 = findViewById(R.id.ed_Q1308);
        ed_Q1309 = findViewById(R.id.ed_Q1309);
        ed_Q1310 = findViewById(R.id.ed_Q1310);
        ed_Q1312 = findViewById(R.id.ed_Q1312);
        ed_Q1313 = findViewById(R.id.ed_Q1313);
        ed_Q1401 = findViewById(R.id.ed_Q1401);
        ed_Q1403_OT = findViewById(R.id.ed_Q1403_OT);
        ed_Q1406 = findViewById(R.id.ed_Q1406);
        ed_Q1409 = findViewById(R.id.ed_Q1409);
        ed_Q1411 = findViewById(R.id.ed_Q1411);
        ed_Q1412 = findViewById(R.id.ed_Q1412);
        ed_Q1416_OT = findViewById(R.id.ed_Q1416_OT);
        ed_Q1417_OT = findViewById(R.id.ed_Q1417_OT);
        ed_Q1418_OT = findViewById(R.id.ed_Q1418_OT);
        ed_Q1419_OT = findViewById(R.id.ed_Q1419_OT);
        ed_Q1420_OT = findViewById(R.id.ed_Q1420_OT);
        ed_Q1421_OT = findViewById(R.id.ed_Q1421_OT);
        ed_Q1502 = findViewById(R.id.ed_Q1502);
        ed_Q1503_OT = findViewById(R.id.ed_Q1503_OT);
        ed_Q1603 = findViewById(R.id.ed_Q1603);
        ed_Q1604_OT = findViewById(R.id.ed_Q1604_OT);
        ed_Q1606 = findViewById(R.id.ed_Q1606);
        ed_Q1607_1 = findViewById(R.id.ed_Q1607_1);
        ed_Q1607_2 = findViewById(R.id.ed_Q1607_2);
        ed_Q1607_3 = findViewById(R.id.ed_Q1607_3);
        ed_Q1608_1 = findViewById(R.id.ed_Q1608_1);
        ed_Q1608_2 = findViewById(R.id.ed_Q1608_2);
        ed_Q1608_3 = findViewById(R.id.ed_Q1608_3);
        ed_Q1610_1 = findViewById(R.id.ed_Q1610_1);
        ed_Q1610_2 = findViewById(R.id.ed_Q1610_2);
        ed_Q1610_3 = findViewById(R.id.ed_Q1610_3);


        //ed_Q1206_d.setFilters(new InputFilter[]{ new MinMaxFilter("1", "99")});
    }

    private static boolean isValid(String s) {

        return !s.trim().equals("") && !s.trim().equals("99/99/9999");
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

        ed_Q1204.addTextChangedListener(this);
        ed_Q1205.addTextChangedListener(this);

        ed_Q1603.addTextChangedListener(this);
        ed_Q1606.addTextChangedListener(this);


        TextWatcher txtWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!ed_Q1206_d.getText().toString().isEmpty()
                        && !ed_Q1206_m.getText().toString().isEmpty()
                        && !ed_Q1206_y.getText().toString().isEmpty()) {

                    if (Integer.valueOf(ed_Q1206_y.getText().toString()) > 12 ||
                            (Integer.valueOf(ed_Q1206_y.getText().toString()) == 12 &&
                                    (Integer.valueOf(ed_Q1206_d.getText().toString()) > 0 || Integer.valueOf(ed_Q1206_m.getText().toString()) > 0))) {

                        ClearAllcontrol.ClearAll(ll_Q1207);
                        ClearAllcontrol.ClearAll(ll_Q1208);

                        ll_Q1207.setVisibility(View.GONE);
                        ll_Q1208.setVisibility(View.GONE);

                    } else if ((Integer.valueOf(ed_Q1206_y.getText().toString()) > 0 &&
                            Integer.valueOf(ed_Q1206_y.getText().toString()) < 12) ||
                            Integer.valueOf(ed_Q1206_m.getText().toString()) > 0 ||
                            Integer.valueOf(ed_Q1206_d.getText().toString()) > 0) {

                        ClearAllcontrol.ClearAll(ll_Q1207);
                        ll_Q1207.setVisibility(View.GONE);

                        ll_Q1208.setVisibility(View.VISIBLE);

                    } else if ((Integer.valueOf(ed_Q1206_d.getText().toString().trim()) == 0 &&
                            Integer.valueOf(ed_Q1206_m.getText().toString().trim()) == 0 &&
                            Integer.valueOf(ed_Q1206_y.getText().toString().trim()) == 0) ||
                            (Integer.valueOf(ed_Q1206_y.getText().toString().trim()) == 99 ||
                                    Integer.valueOf(ed_Q1206_y.getText().toString().trim()) == 99 ||
                                    Integer.valueOf(ed_Q1206_y.getText().toString().trim()) == 9999)) {

                        ll_Q1207.setVisibility(View.VISIBLE);
                        ll_Q1208.setVisibility(View.VISIBLE);
                    }
                }

                if (!ed_Q1409.getText().toString().isEmpty()) {

                    if (Integer.valueOf(ed_Q1409.getText().toString()) > 6) {

                        ll_Q1410.setVisibility(View.GONE);
                    } else {

                        ll_Q1410.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        ed_Q1206_d.addTextChangedListener(txtWatcher);
        ed_Q1206_m.addTextChangedListener(txtWatcher);
        ed_Q1206_y.addTextChangedListener(txtWatcher);

        ed_Q1409.addTextChangedListener(txtWatcher);
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
        Q1101 = "-1";
        Q1102 = "-1";
        Q1103 = "-1";
        Q1202 = "-1";
        Q1203 = "-1";
        Q1204 = "-1";
        Q1205 = "-1";
        Q1206_d = -1;
        Q1206_m = -1;
        Q1206_y = -1;
        Q1207 = "-1";
        Q1208 = "-1";
        Q1209 = "-1";
        Q1301 = "-1";
        Q1302 = "-1";
        Q1307 = "-1";
        Q1308 = "-1";
        Q1309 = "-1";
        Q1310 = "-1";
        Q1311 = "-1";
        Q1312 = "-1";
        Q1313 = "-1";
        Q1401 = "-1";
        Q1402 = "-1";
        Q1403 = "-1";
        Q1403_OT = "-1";
        Q1404 = "-1";
        Q1405 = "-1";
        Q1406 = "-1";
        Q1407 = "-1";
        Q1408 = "-1";
        Q1409 = "-1";
        Q1410 = "-1";
        Q1411 = "-1";
        Q1412 = "-1";
        Q1413 = "-1";
        Q1414_1 = "-1";
        Q1414_2 = "-1";
        Q1414_3 = "-1";
        Q1414_4 = "-1";
        Q1414_5 = "-1";
        Q1414_6 = "-1";
        Q1414_7 = "-1";
        Q1414_8 = "-1";
        Q1414_9 = "-1";
        Q1414_10 = "-1";
        Q1415 = "-1";
        Q1416 = "-1";
        Q1416_OT = "-1";
        Q1417 = "-1";
        Q1417_OT = "-1";
        Q1418 = "-1";
        Q1418_OT = "-1";
        Q1419 = "-1";
        Q1419_OT = "-1";
        Q1420 = "-1";
        Q1420_OT = "-1";
        Q1421 = "-1";
        Q1421_OT = "-1";
        Q1501 = "-1";
        Q1502 = "-1";
        Q1503 = "-1";
        Q1503_OT = "-1";
        Q1601 = "-1";
        Q1602 = "-1";
        Q1603 = "-1";
        Q1604 = "-1";
        Q1604_OT = "-1";
        Q1605 = "-1";
        Q1606 = "-1";
        Q1607_1 = -1;
        Q1607_2 = -1;
        Q1607_3 = -1;
        Q1608_1 = "-1";
        Q1608_2 = "-1";
        Q1608_3 = "-1";
        Q1609 = "-1";
        Q1610_1 = "-1";
        Q1610_2 = "-1";
        Q1610_3 = "-1";
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
            Q1206_d = parseInt(ed_Q1206_d.getText().toString().trim());
        }
        if (ed_Q1206_m.getText().toString().trim().length() > 0) {
            Q1206_m = parseInt(ed_Q1206_m.getText().toString().trim());
        }
        if (ed_Q1206_y.getText().toString().trim().length() > 0) {
            Q1206_y = parseInt(ed_Q1206_y.getText().toString().trim());
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

        if (ed_Q1603.getText().toString().trim().length() > 0) {
            Q1603 = ed_Q1603.getText().toString().trim();
        }

        if (ed_Q1606.getText().toString().trim().length() > 0) {
            Q1606 = ed_Q1606.getText().toString().trim();
        }

        if (ed_Q1607_1.getText().toString().trim().length() > 0) {
            Q1607_1 = parseInt(ed_Q1607_1.getText().toString().trim());
        }
        if (ed_Q1607_2.getText().toString().trim().length() > 0) {
            Q1607_2 = parseInt(ed_Q1607_2.getText().toString().trim());
        }
        if (ed_Q1607_3.getText().toString().trim().length() > 0) {
            Q1607_3 = parseInt(ed_Q1607_3.getText().toString().trim());
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
                + data.GS.Q1101_Q1610.study_id + ","
                + data.GS.Q1101_Q1610.Q1101 + ","
                + data.GS.Q1101_Q1610.Q1102 + ","
                + data.GS.Q1101_Q1610.Q1103 + ","
                + data.GS.Q1101_Q1610.Q1202 + ","
                + data.GS.Q1101_Q1610.Q1203 + ","
                + data.GS.Q1101_Q1610.Q1204 + ","
                + data.GS.Q1101_Q1610.Q1205 + ","
                + data.GS.Q1101_Q1610.Q1206_d + ","
                + data.GS.Q1101_Q1610.Q1206_m + ","
                + data.GS.Q1101_Q1610.Q1206_y + ","
                + data.GS.Q1101_Q1610.Q1207 + ","
                + data.GS.Q1101_Q1610.Q1208 + ","
                + data.GS.Q1101_Q1610.Q1209 + ","
                + data.GS.Q1101_Q1610.Q1301 + ","
                + data.GS.Q1101_Q1610.Q1302 + ","
                + data.GS.Q1101_Q1610.Q1307 + ","
                + data.GS.Q1101_Q1610.Q1308 + ","
                + data.GS.Q1101_Q1610.Q1309 + ","
                + data.GS.Q1101_Q1610.Q1310 + ","
                + data.GS.Q1101_Q1610.Q1311 + ","
                + data.GS.Q1101_Q1610.Q1312 + ","
                + data.GS.Q1101_Q1610.Q1313 + ","
                + data.GS.Q1101_Q1610.Q1401 + ","
                + data.GS.Q1101_Q1610.Q1402 + ","
                + data.GS.Q1101_Q1610.Q1403 + ","
                + data.GS.Q1101_Q1610.Q1403_OT + ","
                + data.GS.Q1101_Q1610.Q1404 + ","
                + data.GS.Q1101_Q1610.Q1405 + ","
                + data.GS.Q1101_Q1610.Q1406 + ","
                + data.GS.Q1101_Q1610.Q1407 + ","
                + data.GS.Q1101_Q1610.Q1408 + ","
                + data.GS.Q1101_Q1610.Q1409 + ","
                + data.GS.Q1101_Q1610.Q1410 + ","
                + data.GS.Q1101_Q1610.Q1411 + ","
                + data.GS.Q1101_Q1610.Q1412 + ","
                + data.GS.Q1101_Q1610.Q1413 + ","
                + data.GS.Q1101_Q1610.Q1414_1 + ","
                + data.GS.Q1101_Q1610.Q1414_2 + ","
                + data.GS.Q1101_Q1610.Q1414_3 + ","
                + data.GS.Q1101_Q1610.Q1414_4 + ","
                + data.GS.Q1101_Q1610.Q1414_5 + ","
                + data.GS.Q1101_Q1610.Q1414_6 + ","
                + data.GS.Q1101_Q1610.Q1414_7 + ","
                + data.GS.Q1101_Q1610.Q1414_8 + ","
                + data.GS.Q1101_Q1610.Q1414_9 + ","
                + data.GS.Q1101_Q1610.Q1414_10 + ","
                + data.GS.Q1101_Q1610.Q1415 + ","
                + data.GS.Q1101_Q1610.Q1416 + ","
                + data.GS.Q1101_Q1610.Q1416_OT + ","
                + data.GS.Q1101_Q1610.Q1417 + ","
                + data.GS.Q1101_Q1610.Q1417_OT + ","
                + data.GS.Q1101_Q1610.Q1418 + ","
                + data.GS.Q1101_Q1610.Q1418_OT + ","
                + data.GS.Q1101_Q1610.Q1419 + ","
                + data.GS.Q1101_Q1610.Q1419_OT + ","
                + data.GS.Q1101_Q1610.Q1420 + ","
                + data.GS.Q1101_Q1610.Q1420_OT + ","
                + data.GS.Q1101_Q1610.Q1421 + ","
                + data.GS.Q1101_Q1610.Q1421_OT + ","
                + data.GS.Q1101_Q1610.Q1501 + ","
                + data.GS.Q1101_Q1610.Q1502 + ","
                + data.GS.Q1101_Q1610.Q1503 + ","
                + data.GS.Q1101_Q1610.Q1503_OT + ","
                + data.GS.Q1101_Q1610.Q1601 + ","
                + data.GS.Q1101_Q1610.Q1602 + ","
                + data.GS.Q1101_Q1610.Q1603 + ","
                + data.GS.Q1101_Q1610.Q1604 + ","
                + data.GS.Q1101_Q1610.Q1604_OT + ","
                + data.GS.Q1101_Q1610.Q1605 + ","
                + data.GS.Q1101_Q1610.Q1606 + ","
                + data.GS.Q1101_Q1610.Q1607_1 + ","
                + data.GS.Q1101_Q1610.Q1607_2 + ","
                + data.GS.Q1101_Q1610.Q1607_3 + ","
                + data.GS.Q1101_Q1610.Q1608_1 + ","
                + data.GS.Q1101_Q1610.Q1608_2 + ","
                + data.GS.Q1101_Q1610.Q1608_3 + ","
                + data.GS.Q1101_Q1610.Q1609 + ","
                + data.GS.Q1101_Q1610.Q1610_1 + ","
                + data.GS.Q1101_Q1610.Q1610_2 + ","
                + data.GS.Q1101_Q1610.Q1610_3 + ","
                + data.GS.Q1101_Q1610.STATUS + ") values ('" +

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

    public int[] calculateAge(String dob, String dod) {

        String[] dob_sep = dob.split("/");
        String[] dod_sep = dod.split("/");

        String dob_day = dob_sep[0];
        String dob_month = dob_sep[1];
        String dob_year = dob_sep[2];

        String dod_day = dod_sep[0];
        String dod_month = dod_sep[1];
        String dod_year = dod_sep[2];


        int mYearDiff = parseInt(dod_year) - parseInt(dob_year);
        int mMonDiff = parseInt(dod_month) - parseInt(dob_month);

        if (mMonDiff < 0) {
            mYearDiff = mYearDiff - 1;
            mMonDiff = mMonDiff + 12;
        }

        int mDayDiff = parseInt(dod_day) - parseInt(dob_day);

        if (mDayDiff < 0) {
            if (mMonDiff > 0) {
                mMonDiff = mMonDiff - 1;
                mDayDiff = mDayDiff + MonthsToDays(parseInt(dod_month) - 1, parseInt(dod_year));
            } else {
                mYearDiff = mYearDiff - 1;
                mMonDiff = 11;
                mDayDiff = mDayDiff + MonthsToDays(parseInt(dod_month) - 1, parseInt(dod_year));
            }

        }

        int[] Age = new int[]{mDayDiff, mMonDiff, mYearDiff};

        return Age;
    }

    public static int MonthsToDays(int tMonth, int tYear) {
        if (tMonth == 1 || tMonth == 3 || tMonth == 5 || tMonth == 7
                || tMonth == 8 || tMonth == 10 || tMonth == 12) {
            return 31;
        } else if (tMonth == 2) {
            if (tYear % 4 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
    }

    boolean validateField() {

        /*if (Gothrough.IamHiden(ll_Q1101) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1102) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1103) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1202) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1203) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1204) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1205) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1206_d) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1206_m) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1206_y) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1207) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1208) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1209) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1301) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1302) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1307) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1308) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1309) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1310) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1311) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1312) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1313) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1401) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1402) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1403) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1403_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1404) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1405) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1406) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1407) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1408) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1409) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1410) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1411) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1412) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1413) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1414_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1415) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1416) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1416_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1417) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1417_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1418) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1418_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1419) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1419_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1420) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1420_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1421) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1421_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1501) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1502) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1503) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1503_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1601) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1602) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1603) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1604) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1604_OT) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1605) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1606) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1607) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1608) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1609) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_Q1610) == false) {
            return false;
        }*/

        return true;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        ed_Q1206_d.setEnabled(false);
        ed_Q1206_m.setEnabled(false);
        ed_Q1206_y.setEnabled(false);

        ed_Q1607_1.setEnabled(false);
        ed_Q1607_2.setEnabled(false);
        ed_Q1607_3.setEnabled(false);

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        if (ed_Q1204.getText().toString().length() == 10 && ed_Q1205.getText().toString().length() == 10) {

            if (isValid(ed_Q1204.getText().toString()) && isValid(ed_Q1205.getText().toString())) {

                String dob, dod;

                dob = ed_Q1204.getText().toString().trim();
                dod = ed_Q1205.getText().toString().trim();

                int[] Age = calculateAge(dob, dod);

                int days = Age[0];
                int months = Age[1];
                int years = Age[2];

                ed_Q1206_d.setText(String.valueOf(days));
                ed_Q1206_m.setText(String.valueOf(months));
                ed_Q1206_y.setText(String.valueOf(years));

                ed_Q1206_d.setEnabled(false);
                ed_Q1206_m.setEnabled(false);
                ed_Q1206_y.setEnabled(false);


            } else {

                ed_Q1206_d.setText(null);
                ed_Q1206_m.setText(null);
                ed_Q1206_y.setText(null);

                ed_Q1206_d.setEnabled(true);
                ed_Q1206_m.setEnabled(true);
                ed_Q1206_y.setEnabled(true);
            }
        }

        if (ed_Q1603.getText().toString().length() == 10 && ed_Q1606.getText().toString().length() == 10) {

            if (isValid(ed_Q1603.getText().toString()) && isValid(ed_Q1606.getText().toString())) {

                String dob, dod;

                dob = ed_Q1603.getText().toString().trim();
                dod = ed_Q1606.getText().toString().trim();

                int[] Age = calculateAge(dob, dod);

                int days = Age[0];
                int months = Age[1];
                int years = Age[2];

                ed_Q1607_1.setText(String.valueOf(days));
                ed_Q1607_2.setText(String.valueOf(months));
                ed_Q1607_3.setText(String.valueOf(years));

                ed_Q1607_1.setEnabled(false);
                ed_Q1607_2.setEnabled(false);
                ed_Q1607_3.setEnabled(false);

            } else {

                ed_Q1607_1.setText(null);
                ed_Q1607_2.setText(null);
                ed_Q1607_3.setText(null);

                ed_Q1607_1.setEnabled(true);
                ed_Q1607_2.setEnabled(true);
                ed_Q1607_3.setEnabled(true);

            }
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
    }


    public boolean validate(final String date) {

        matcher = pattern.matcher(date);

        if (date.equals("99/99/9999")) {

            return true;

        } else if (matcher.matches()) {

            matcher.reset();

            if (matcher.find()) {

                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));

                if (day.equals("31") &&
                        (month.equals("4") || month.equals("6") || month.equals("9") ||
                                month.equals("11") || month.equals("04") || month.equals("06") ||
                                month.equals("09"))) {
                    return false; // only 1,3,5,7,8,10,12 has 31 days
                } else if (month.equals("2") || month.equals("02")) {
                    //leap year
                    if (year % 4 == 0) {
                        if (day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        if (day.equals("29") || day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}


/*
class MinMaxFilter implements InputFilter {

    private int mIntMin, mIntMax;

    public MinMaxFilter(int minValue, int maxValue) {
        this.mIntMin = minValue;
        this.mIntMax = maxValue;
    }

    public MinMaxFilter(String minValue, String maxValue) {
        this.mIntMin = Integer.parseInt(minValue);
        this.mIntMax = Integer.parseInt(maxValue);
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            int input = Integer.parseInt(dest.toString() + source.toString());
            if (isInRange(mIntMin, mIntMax, input))
                return null;
        } catch (NumberFormatException nfe) { }
        return "";
    }

    private boolean isInRange(int a, int b, int c) {
        return b > a ? c >= a && c <= b : c >= b && c <= a;
    }
}*/
