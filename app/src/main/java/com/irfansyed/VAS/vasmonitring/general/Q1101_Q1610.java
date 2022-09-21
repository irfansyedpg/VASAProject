package com.irfansyed.vas.vasmonitring.general;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.vas.vasmonitring.R;
import com.irfansyed.vas.vasmonitring.adult.A4001_A4014;
import com.irfansyed.vas.vasmonitring.rep.w204_w222;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;
import utils.InputFilterMinMax;
import utils.MyPreferences;

import static java.lang.Integer.parseInt;

public class Q1101_Q1610 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, TextWatcher, AdapterView.OnItemSelectedListener {

    private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
    Button btn_next, btn_Q1502;
    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_Q1201,
            ll_Q1201_1,
            ll_Q1201_2,
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

    //region Declaration
    RadioButton
            rb_Q1203_1,
            rb_Q1203_2,
            rb_Q1207_1,
            rb_Q1207_2,
            rb_Q1207_DK,
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
    CheckBox cb_Q1607_conflict;
    EditText
            ed_study_id,
            ed_Q1201_3,
            ed_Q1201_4,
            ed_Q1201_5,
            ed_Q1201_6,
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
    Spinner sp_Q1201_1,
            sp_Q1201_2;
    String
            study_id,
            Q1201_1,
            Q1201_2,
            Q1201_3,
            Q1201_4,
            Q1201_5,
            Q1201_6,
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
            STATUS;
    int
            interviewType,
            currentSection;
    String[] dataDistricts = null;
    List<String> lst_q1503 = new ArrayList();

    //endregion
    List<String> lst_other = new ArrayList();
    private Pattern pattern;
    private Matcher matcher;

    private static boolean isValid(String s) {

        if (!s.trim().equals("")) {

            String[] date_sep = s.split("/");

            int dd = Integer.valueOf(date_sep[0]);
            int mm = Integer.valueOf(date_sep[1]);
            int yy = Integer.valueOf(date_sep[2]);

            return dd != 99 || mm != 99 || yy != 9999;
        }

        return false;
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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        change_langua();
        setContentView(R.layout.q1101_q1610);

        Initialization();

        //ed_Q1202.setEnabled(false);
        //rb_Q1203_1.setEnabled(false);
        //rb_Q1203_2.setEnabled(false);
        //ed_Q1204.setEnabled(false);
        //ed_Q1205.setEnabled(false);
        ed_Q1206_d.setEnabled(false);
        ed_Q1206_m.setEnabled(false);
        ed_Q1206_y.setEnabled(false);
        ed_Q1607_1.setEnabled(false);
        ed_Q1607_2.setEnabled(false);
        ed_Q1607_3.setEnabled(false);

        ll_Q1403_OT.setVisibility(View.GONE);
        ll_Q1416_OT.setVisibility(View.GONE);
        ll_Q1417_OT.setVisibility(View.GONE);
        ll_Q1418_OT.setVisibility(View.GONE);
        ll_Q1419_OT.setVisibility(View.GONE);
        ll_Q1420_OT.setVisibility(View.GONE);
        ll_Q1421_OT.setVisibility(View.GONE);

        ll_Q1604_OT.setVisibility(View.GONE);

        ll_Q1608.setVisibility(View.GONE);

        //rb_Q1207_1.setEnabled(false);
        //rb_Q1207_2.setEnabled(false);
        //rb_Q1207_DK.setEnabled(false);
        //ed_Q1208.setEnabled(false);
        //ed_Q1209.setEnabled(false);
        //ed_Q1301.setEnabled(false);
        //ed_Q1302.setEnabled(false);

        //ed_Q1312.setEnabled(false);
        //ed_Q1313.setEnabled(false);

        events_call();

        btn_next.setOnClickListener(this);
        btn_Q1502.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_next) {

            String[] provided_list = new String[]{"5463-1",
                    "5466-1",
                    "5467-1",
                    "5468-1",
                    "5469-1",
                    "5480-1",
                    "5512-1",
                    "5514-1",
                    "5495-1",
                    "5493-1",
                    "5502-1",
                    "5504-1",
                    "5505-1",
                    "5532-1",
                    "5531-1",
                    "5538-1",
                    "5550-1",
                    "5451-1",
                    "5454-1",
                    "5460-1",
                    "5643-1",
                    "5645-1",
                    "5647-1",
                    "5650-1",
                    "5651-1",
                    "5652-1",
                    "5653-1",
                    "5657-1",
                    "5658-1",
                    "5663-1",
                    "5667-1",
                    "5669-1",
                    "5670-1",
                    "5670-2",
                    "5671-1",
                    "5676-1",
                    "5680-1",
                    "5687-1",
                    "5699-1",
                    "5701-1",
                    "5706-1",
                    "5708-1",
                    "5710-1",
                    "5724-1",
                    "5730-1",
                    "5736-1",
                    "5743-1",
                    "5751-1",
                    "5757-1",
                    "5761-1",
                    "5772-1",
                    "5446-1",
                    "5569-1",
                    "5573-1",
                    "5590-1",
                    "5606-1",
                    "5631-1",
                    "5423-1",
                    "5424-1",
                    "5424-2",
                    "5425-1",
                    "5428-1",
                    "5432-1",
                    "5436-1",
                    "5438-1",
                    "5439-2",
                    "5441-1",
                    "5443-1",
                    "5551-1",
                    "5553-1",
                    "5555-2",
                    "5558-1",
                    "5564-2",
                    "5565-2",
                    "5568-1",
                    "5575-1",
                    "5576-1",
                    "5578-1",
                    "5584-1",
                    "5585-1",
                    "5588-1",
                    "5598-1",
                    "5599-1",
                    "5599-2",
                    "5601-1",
                    "5602-1",
                    "5607-1",
                    "5611-1",
                    "5611-2",
                    "5612-1",
                    "5619-1",
                    "5620-2",
                    "5626-1",
                    "5629-1",
                    "5633-1"
            };


            if (Arrays.asList(provided_list).contains(ed_study_id.getText().toString().trim())) {

                Toast.makeText(this, "Either wrong study ID or not among the provided list", Toast.LENGTH_LONG).show();
                return;
            }

            if (ed_study_id.getText().toString().length() < 6) {

                Toast.makeText(this, "Minimum Study ID length should be 7 digits", Toast.LENGTH_LONG).show();
                return;
            }


            if (validateField() == false) {
                Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
                return;
            }


            if (ed_Q1502.getText().toString().trim().length() > 0) {
                int total = Integer.parseInt(ed_Q1502.getText().toString().trim());

                if (total < lst_q1503.size()) {

                    Toast.makeText(this, "Please Enter All Relative Q1503", Toast.LENGTH_LONG).show();
                    return;
                }
            }


            pattern = Pattern.compile(DATE_PATTERN);

            if (ll_Q1204.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1204.getText().toString().trim())) {

                    ed_Q1204.setError("Kindly enter a valid Date of Birth for Q1204");
                    ed_Q1204.requestFocus();
                    return;
                }
            }


            if (ll_Q1205.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1205.getText().toString().trim())) {

                    ed_Q1205.setError("Kindly enter a valid Date of Death for Q1205");
                    ed_Q1205.requestFocus();
                    return;
                }
            }

            if (ll_Q1603.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1603.getText().toString().trim())) {

                    ed_Q1603.setError("Kindly enter a valid Date of Birth");
                    ed_Q1603.requestFocus();
                    return;
                }
            }

            if (ll_Q1603.getVisibility() == View.VISIBLE && ll_Q1606.getVisibility() == View.VISIBLE) {

                if (!validate(ed_Q1606.getText().toString().trim())) {

                    ed_Q1606.setError("Kindly enter a valid Date of Death");
                    ed_Q1606.requestFocus();
                    return;

                } else {

                    String dob = ed_Q1603.getText().toString().trim();
                    String dod = ed_Q1606.getText().toString().trim();

                    String[] dob_sep = dob.split("/");
                    String[] dod_sep = dod.split("/");

                    if (!Integer.valueOf(dob_sep[2]).equals(9999)
                            && !Integer.valueOf(dod_sep[2]).equals(9999)
                            && Integer.valueOf(dob_sep[2]) > Integer.valueOf(dod_sep[2])) {

                        ed_Q1603.setError("Date of Birth Year cannot be greater than Date of Death Year");
                        ed_Q1603.requestFocus();
                        return;

                    } else if (Integer.valueOf(dob_sep[2]).equals(Integer.valueOf(dod_sep[2]))
                            && !Integer.valueOf(dob_sep[1]).equals(99)
                            && !Integer.valueOf(dod_sep[1]).equals(99)
                            && Integer.valueOf(dob_sep[1]) > Integer.valueOf(dod_sep[1])) {

                        ed_Q1603.setError("Date of Birth Month cannot be greater than Date of Death Month");
                        ed_Q1603.requestFocus();
                        return;

                    } else if (Integer.valueOf(dob_sep[2]).equals(Integer.valueOf(dod_sep[2]))
                            && Integer.valueOf(dob_sep[1]).equals(Integer.valueOf(dod_sep[1]))
                            && !Integer.valueOf(dob_sep[0]).equals(99)
                            && !Integer.valueOf(dod_sep[0]).equals(99)
                            && Integer.valueOf(dob_sep[0]) > Integer.valueOf(dod_sep[0])) {

                        ed_Q1603.setError("Date of Birth Day cannot be greater than Date of Death Day");
                        ed_Q1603.requestFocus();
                        return;
                    }
                }
            }

            value_assignment();

            if (if_study_id_exsist() == true) {

                Toast.makeText(this, "Study ID Already Exist", Toast.LENGTH_LONG).show();

                ed_study_id.requestFocus();
                ed_study_id.setError("This ID Already Exist");
                return;
            }


            if (ll_Q1607.getVisibility() == View.VISIBLE) {

                if (!ed_Q1607_1.getText().toString().isEmpty()
                        && !ed_Q1607_2.getText().toString().isEmpty()
                        && !ed_Q1607_3.getText().toString().isEmpty()

                        && Integer.valueOf(ed_Q1607_1.getText().toString()).equals(0)
                        && Integer.valueOf(ed_Q1607_2.getText().toString()).equals(0)
                        && Integer.valueOf(ed_Q1607_3.getText().toString()).equals(0)) {


                    if (ll_Q1608.getVisibility() == View.VISIBLE) {

                        if (!ed_Q1608_1.getText().toString().isEmpty()
                                && !ed_Q1608_2.getText().toString().isEmpty()
                                && !ed_Q1608_3.getText().toString().isEmpty()

                                && Integer.valueOf(ed_Q1608_1.getText().toString()).equals(0)
                                && Integer.valueOf(ed_Q1608_2.getText().toString()).equals(0)
                                && Integer.valueOf(ed_Q1608_3.getText().toString()).equals(0)
                                && !rb_Q1609_1.isChecked()) {

                            Toast.makeText(this, "Neonatal death or still birth as per given Age", Toast.LENGTH_LONG).show();
                            return;

                        } else {

                            if (Integer.valueOf(ed_Q1608_1.getText().toString()) > 0 && !rb_Q1609_1.isChecked()) {

                                Toast.makeText(this, "Neonatal death or still birth as per given Age", Toast.LENGTH_LONG).show();
                                return;

                            } else if (Integer.valueOf(ed_Q1608_2.getText().toString()) > 0 && Integer.valueOf(ed_Q1608_2.getText().toString()) <= 11 && !rb_Q1609_2.isChecked()) {

                                Toast.makeText(this, "1-11 months old child death as per given Age", Toast.LENGTH_LONG).show();
                                return;

                            } else if (Integer.valueOf(ed_Q1608_2.getText().toString()) > 11 && !rb_Q1609_3.isChecked()) {

                                Toast.makeText(this, "12 months-4 years old child death as per given Age", Toast.LENGTH_LONG).show();
                                return;

                            } else if (Integer.valueOf(ed_Q1608_3.getText().toString()) == 1) {

                                Toast.makeText(this, "Kindly provide age in months if child is less than 2 years", Toast.LENGTH_LONG).show();
                                return;

                            } else if (Integer.valueOf(ed_Q1608_3.getText().toString()) != 0 && Integer.valueOf(ed_Q1608_3.getText().toString()) > 1 && Integer.valueOf(ed_Q1608_3.getText().toString()) <= 4 && !rb_Q1609_3.isChecked()) {

                                Toast.makeText(this, "12 months-4 years old child as per given Age", Toast.LENGTH_LONG).show();
                                return;

                            } else if (Integer.valueOf(ed_Q1608_3.getText().toString()) > 4 && Integer.valueOf(ed_Q1608_3.getText().toString()) <= 11 && !rb_Q1609_4.isChecked()) {

                                Toast.makeText(this, "5-11 years old child death as per given Age", Toast.LENGTH_LONG).show();
                                return;

                            } else if (Integer.valueOf(ed_Q1608_3.getText().toString()) > 11 && !rb_Q1609_5.isChecked()) {

                                Toast.makeText(this, "Adult death as per given Age", Toast.LENGTH_LONG).show();
                                return;
                            }
                        }

                    } else {

                        Toast.makeText(this, "Neonatal death or still birth as per given Age", Toast.LENGTH_LONG).show();
                        return;
                    }


                } else {

                    if (Integer.valueOf(ed_Q1607_1.getText().toString()) > 0 && !rb_Q1609_1.isChecked()) {

                        Toast.makeText(this, "Neonatal death or still birth as per given Age", Toast.LENGTH_LONG).show();
                        return;

                    } else if (Integer.valueOf(ed_Q1607_2.getText().toString()) > 0 && Integer.valueOf(ed_Q1607_2.getText().toString()) <= 11 && !rb_Q1609_2.isChecked()) {

                        Toast.makeText(this, "1-11 months old child death as per given Age", Toast.LENGTH_LONG).show();
                        return;

                    } else if (Integer.valueOf(ed_Q1607_2.getText().toString()) > 11 && !rb_Q1609_3.isChecked()) {

                        Toast.makeText(this, "12 months-4 years old child death as per given Age", Toast.LENGTH_LONG).show();
                        return;

                    } else if (Integer.valueOf(ed_Q1607_3.getText().toString()) > 0 && Integer.valueOf(ed_Q1607_3.getText().toString()) <= 4 && !rb_Q1609_3.isChecked()) {

                        Toast.makeText(this, "12 months-4 years old child as per given Age", Toast.LENGTH_LONG).show();
                        return;

                    } else if (Integer.valueOf(ed_Q1607_3.getText().toString()) > 4 && Integer.valueOf(ed_Q1607_3.getText().toString()) <= 11 && !rb_Q1609_4.isChecked()) {

                        Toast.makeText(this, "5-11 years old child death as per given Age", Toast.LENGTH_LONG).show();
                        return;

                    } else if (Integer.valueOf(ed_Q1607_3.getText().toString()) > 11 && !rb_Q1609_5.isChecked()) {

                        Toast.makeText(this, "Adult death as per given Age", Toast.LENGTH_LONG).show();
                        return;
                    }
                }

            }


            insert_data();

            DBHelper db = new DBHelper(this);
            Cursor res = db.getData("Q1101_Q1610", study_id);

            if (res.getCount() > 0) {
                res.moveToFirst();

                if (Integer.valueOf(res.getString(res.getColumnIndex("Q1405"))).equals(2)) {

                    Intent c = new Intent(this, InterviewEnd.class);
                    c.putExtra("study_id", study_id);
                    c.putExtra("currentSection", currentSection);
                    startActivity(c);

                } else {

                    if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(5)) {

                        Intent c = new Intent(this, A4001_A4014.class);
                        c.putExtra("study_id", study_id);
                        startActivity(c);

                    } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(2)) {

                        Intent c = new Intent(this, w204_w222.class);
                        c.putExtra("study_id", study_id);
                        //c.putExtra("section", "C3001_C3011");
                        startActivity(c);

                    } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(3) || Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(4)) {

                        Intent c = new Intent(this, w204_w222.class);
                        c.putExtra("study_id", study_id);
                        //c.putExtra("section", "C3012_C3022");
                        startActivity(c);

                    } else if (Integer.valueOf(res.getString(res.getColumnIndex("Q1609"))).equals(1)) {

                        Intent c = new Intent(this, w204_w222.class);
                        c.putExtra("study_id", study_id);
                        //c.putExtra("section", "N2001_N2011");
                        startActivity(c);

                    }
                }
            }

        } else if (view.getId() == R.id.btn_Q1502) {

            if (ed_Q1502.getText().toString().trim().length() > 0) {
                int total = Integer.parseInt(ed_Q1502.getText().toString().trim());

                if (total > lst_q1503.size()) {
                    show_dailuge_Q1503();
                } else {
                    Toast.makeText(this, "you have reached Maximaum Number", Toast.LENGTH_LONG).show();
                    return;
                }

                int sixx = lst_q1503.size() + 1;
                btn_Q1502.setText("Add Persion No( " + sixx + ")");
            }
        }

    }

    void show_dailuge_Q1503() {


        final AlertDialog b = new AlertDialog.Builder(this).create();

        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialog_q1503, null);
        b.setCancelable(false);
        b.setView(v);
        b.show();

        final LinearLayout ll_Q1503,
                ll_Q1503_OT;

        final EditText

                ed_Q1503_OT;
        final TextView txt_Q1503_header;

        final RadioButton
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
                rb_Q1503_14;


        rb_Q1503_1 = v.findViewById(R.id.rb_Q1503_1);
        rb_Q1503_2 = v.findViewById(R.id.rb_Q1503_2);
        rb_Q1503_3 = v.findViewById(R.id.rb_Q1503_3);
        rb_Q1503_4 = v.findViewById(R.id.rb_Q1503_4);
        rb_Q1503_5 = v.findViewById(R.id.rb_Q1503_5);
        rb_Q1503_6 = v.findViewById(R.id.rb_Q1503_6);
        rb_Q1503_7 = v.findViewById(R.id.rb_Q1503_7);
        rb_Q1503_8 = v.findViewById(R.id.rb_Q1503_8);
        rb_Q1503_9 = v.findViewById(R.id.rb_Q1503_9);
        rb_Q1503_10 = v.findViewById(R.id.rb_Q1503_10);
        rb_Q1503_11 = v.findViewById(R.id.rb_Q1503_11);
        rb_Q1503_12 = v.findViewById(R.id.rb_Q1503_12);
        rb_Q1503_13 = v.findViewById(R.id.rb_Q1503_13);
        rb_Q1503_14 = v.findViewById(R.id.rb_Q1503_14);


        ed_Q1503_OT = v.findViewById(R.id.ed_Q1503_OT);

        ll_Q1503 = v.findViewById(R.id.ll_Q1503);
        ll_Q1503_OT = v.findViewById(R.id.ll_Q1503_OT);
        txt_Q1503_header = v.findViewById(R.id.txt_Q1503_header);


        ll_Q1503_OT.setVisibility(View.GONE);


        Button btn_add = v.findViewById(R.id.btn_add);

        int db = lst_q1503.size() + 1;

        txt_Q1503_header.setText("Please Enter Relationship for Person No: " + db);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!Gothrough.IamHiden(ll_Q1503) && !Gothrough.IamHiden(ll_Q1503_OT)) {
                    Toast.makeText(Q1101_Q1610.this, "Select Mendatory Field", Toast.LENGTH_LONG).show();
                    return;
                }


                if (rb_Q1503_1.isChecked()) {
                    lst_q1503.add("1");
                } else if (rb_Q1503_2.isChecked()) {
                    lst_q1503.add("2");
                } else if (rb_Q1503_3.isChecked()) {
                    lst_q1503.add("3");
                } else if (rb_Q1503_4.isChecked()) {
                    lst_q1503.add("4");
                } else if (rb_Q1503_5.isChecked()) {
                    lst_q1503.add("5");
                } else if (rb_Q1503_6.isChecked()) {
                    lst_q1503.add("6");
                } else if (rb_Q1503_7.isChecked()) {
                    lst_q1503.add("7");
                } else if (rb_Q1503_8.isChecked()) {
                    lst_q1503.add("8");
                } else if (rb_Q1503_9.isChecked()) {
                    lst_q1503.add("9");
                } else if (rb_Q1503_10.isChecked()) {
                    lst_q1503.add("10");
                } else if (rb_Q1503_11.isChecked()) {
                    lst_q1503.add("11");
                } else if (rb_Q1503_12.isChecked()) {
                    lst_q1503.add("12");
                    lst_other.add(ed_Q1503_OT.getText().toString().trim());
                } else if (rb_Q1503_13.isChecked()) {
                    lst_q1503.add("13");
                    lst_other.add(ed_Q1503_OT.getText().toString().trim());
                } else if (rb_Q1503_14.isChecked()) {
                    lst_q1503.add("14");
                    lst_other.add(ed_Q1503_OT.getText().toString().trim());
                }


                b.cancel();


            }


        });


        rb_Q1503_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });


        rb_Q1503_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });


        rb_Q1503_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });
        rb_Q1503_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });

        rb_Q1503_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });
        rb_Q1503_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                // Check which radiobutton was pressed
                if (checked) {

                    ClearAllcontrol.ClearAll(ll_Q1503_OT);
                    ll_Q1503_OT.setVisibility(View.GONE);

                    if (rb_Q1503_12.isChecked() || rb_Q1503_13.isChecked() || rb_Q1503_14.isChecked()) {

                        ll_Q1503_OT.setVisibility(View.VISIBLE);

                    } else {

                        ClearAllcontrol.ClearAll(ll_Q1503_OT);
                        ll_Q1503_OT.setVisibility(View.GONE);
                    }
                }
            }
        });


    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);
        btn_Q1502 = findViewById(R.id.btn_Q1502);

        // Layouts

        ll_study_id = findViewById(R.id.ll_study_id);
        ll_Q1201 = findViewById(R.id.ll_Q1201);
        ll_Q1202 = findViewById(R.id.ll_Q1202);

        ll_Q1201_1 = findViewById(R.id.ll_Q1201_1);
        ll_Q1201_2 = findViewById(R.id.ll_Q1201_2);

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
        //ll_Q1312 = findViewById(R.id.ll_Q1312);
        //ll_Q1313 = findViewById(R.id.ll_Q1313);
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
        ed_Q1502 = findViewById(R.id.ed_Q1502);

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

        rb_Q1203_1 = findViewById(R.id.rb_Q1203_1);
        rb_Q1203_2 = findViewById(R.id.rb_Q1203_2);
        rb_Q1207_1 = findViewById(R.id.rb_Q1207_1);
        rb_Q1207_2 = findViewById(R.id.rb_Q1207_2);
        rb_Q1207_DK = findViewById(R.id.rb_Q1207_3);
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


        cb_Q1607_conflict = findViewById(R.id.cb_Q1607_conflict);


        ed_study_id = findViewById(R.id.ed_study_id);

        sp_Q1201_1 = findViewById(R.id.sp_province);
        sp_Q1201_2 = findViewById(R.id.sp_district);

        ed_Q1201_3 = findViewById(R.id.ed_Q1201_3);
        ed_Q1201_4 = findViewById(R.id.ed_Q1201_4);
        ed_Q1201_5 = findViewById(R.id.ed_Q1201_5);
        ed_Q1201_6 = findViewById(R.id.ed_Q1201_6);
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
        //ed_Q1312 = findViewById(R.id.ed_Q1312);
        //ed_Q1313 = findViewById(R.id.ed_Q1313);
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

        cb_Q1607_conflict.setOnCheckedChangeListener(this);

        rb_Q1609_1.setOnCheckedChangeListener(this);
        rb_Q1609_2.setOnCheckedChangeListener(this);
        rb_Q1609_3.setOnCheckedChangeListener(this);
        rb_Q1609_4.setOnCheckedChangeListener(this);
        rb_Q1609_5.setOnCheckedChangeListener(this);

        ed_Q1204.addTextChangedListener(this);
        ed_Q1205.addTextChangedListener(this);
        ed_Q1603.addTextChangedListener(this);
        ed_Q1606.addTextChangedListener(this);

        //ed_Q1206_d.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1206_m.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1206_y.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        //ed_Q1409.setFilters(new InputFilter[]{new InputFilterMinMax(0, 18, 99, 99)});

        //ed_Q1607_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1607_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1607_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        //ed_Q1608_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1608_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1608_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        //ed_Q1610_1.setFilters(new InputFilter[]{new InputFilterMinMax(0, 27, 27, 27)});
        //ed_Q1610_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 23, 23)});
        //ed_Q1610_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 70, 70, 70)});

        TextWatcher txtWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


                if (ed_Q1204.getText().toString().length() == 10 && ed_Q1205.getText().toString().length() == 10) {

                    if (!ed_Q1206_d.getText().toString().isEmpty()
                            || !ed_Q1206_m.getText().toString().isEmpty()
                            || !ed_Q1206_y.getText().toString().isEmpty()) {

                        if (!ed_Q1206_y.getText().toString().isEmpty()
                                && Integer.valueOf(ed_Q1206_y.getText().toString().trim()) >= 12) {

                            ClearAllcontrol.ClearAll(ll_Q1207);
                            ClearAllcontrol.ClearAll(ll_Q1208);

                            ll_Q1207.setVisibility(View.GONE);
                            ll_Q1208.setVisibility(View.GONE);

                        } else if ((!ed_Q1206_y.getText().toString().isEmpty()
                                && Integer.valueOf(ed_Q1206_y.getText().toString().trim()) > 0
                                && Integer.valueOf(ed_Q1206_y.getText().toString().trim()) < 12)
                                || ((!ed_Q1206_d.getText().toString().isEmpty()
                                && parseInt(ed_Q1206_d.getText().toString().trim()) > 0)
                                || (!ed_Q1206_m.getText().toString().isEmpty()
                                && parseInt(ed_Q1206_m.getText().toString().trim()) > 0))) {

                            ClearAllcontrol.ClearAll(ll_Q1207);
                            ll_Q1207.setVisibility(View.GONE);

                            ll_Q1208.setVisibility(View.VISIBLE);

                        } else {

                            ll_Q1207.setVisibility(View.VISIBLE);
                            ll_Q1208.setVisibility(View.VISIBLE);
                        }

                    } else {

                        ll_Q1207.setVisibility(View.VISIBLE);
                        ll_Q1208.setVisibility(View.VISIBLE);
                    }
                }


                if (!ed_Q1409.getText().toString().isEmpty()) {

                    if (Integer.valueOf(ed_Q1409.getText().toString()) > 6) {

                        ClearAllcontrol.ClearAll(ll_Q1410);
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

        ed_Q1206_d.addTextChangedListener(txtWatcher);
        ed_Q1206_m.addTextChangedListener(txtWatcher);
        ed_Q1206_y.addTextChangedListener(txtWatcher);

        sp_Q1201_1.setOnItemSelectedListener(this);

        ed_Q1206_d.setFilters(new InputFilter[]{new InputFilterMinMax(1, 27, 0, 0)});
        ed_Q1206_m.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 0, 0)});
        ed_Q1206_y.setFilters(new InputFilter[]{new InputFilterMinMax(2, 80, 0, 1)});

        ed_Q1608_1.setFilters(new InputFilter[]{new InputFilterMinMax(1, 27, 0, 0)});
        ed_Q1608_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 0, 0)});
        ed_Q1608_3.setFilters(new InputFilter[]{new InputFilterMinMax(2, 80, 0, 1)});

        ed_Q1610_1.setFilters(new InputFilter[]{new InputFilterMinMax(1, 27, 0, 0)});
        ed_Q1610_2.setFilters(new InputFilter[]{new InputFilterMinMax(1, 23, 0, 0)});
        ed_Q1610_3.setFilters(new InputFilter[]{new InputFilterMinMax(1, 59, 0, 0)});
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

            if (rb_Q1405_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_Q1401);
                ClearAllcontrol.ClearAll(ll_Q1402);
                ClearAllcontrol.ClearAll(ll_Q1403);
                ClearAllcontrol.ClearAll(ll_Q1403_OT);
                ClearAllcontrol.ClearAll(ll_Q1404);
                ClearAllcontrol.ClearAll(ll_Q1406);
                ClearAllcontrol.ClearAll(ll_Q1407);
                ClearAllcontrol.ClearAll(ll_Q1408);
                ClearAllcontrol.ClearAll(ll_Q1409);
                ClearAllcontrol.ClearAll(ll_Q1410);
                ClearAllcontrol.ClearAll(ll_Q1411);
                ClearAllcontrol.ClearAll(ll_Q1412);
                ClearAllcontrol.ClearAll(ll_Q1413);
                ClearAllcontrol.ClearAll(ll_Q1414_1);
                ClearAllcontrol.ClearAll(ll_Q1414_2);
                ClearAllcontrol.ClearAll(ll_Q1414_3);
                ClearAllcontrol.ClearAll(ll_Q1414_4);
                ClearAllcontrol.ClearAll(ll_Q1414_5);
                ClearAllcontrol.ClearAll(ll_Q1414_6);
                ClearAllcontrol.ClearAll(ll_Q1414_7);
                ClearAllcontrol.ClearAll(ll_Q1414_8);
                ClearAllcontrol.ClearAll(ll_Q1414_9);
                ClearAllcontrol.ClearAll(ll_Q1414_10);
                ClearAllcontrol.ClearAll(ll_Q1415);
                ClearAllcontrol.ClearAll(ll_Q1416);
                ClearAllcontrol.ClearAll(ll_Q1416_OT);
                ClearAllcontrol.ClearAll(ll_Q1417);
                ClearAllcontrol.ClearAll(ll_Q1417_OT);
                ClearAllcontrol.ClearAll(ll_Q1418);
                ClearAllcontrol.ClearAll(ll_Q1418_OT);
                ClearAllcontrol.ClearAll(ll_Q1419);
                ClearAllcontrol.ClearAll(ll_Q1419_OT);
                ClearAllcontrol.ClearAll(ll_Q1420);
                ClearAllcontrol.ClearAll(ll_Q1420_OT);
                ClearAllcontrol.ClearAll(ll_Q1421);
                ClearAllcontrol.ClearAll(ll_Q1421_OT);
                ClearAllcontrol.ClearAll(ll_Q1501);
                ClearAllcontrol.ClearAll(ll_Q1502);
                ClearAllcontrol.ClearAll(ll_Q1601);
                ClearAllcontrol.ClearAll(ll_Q1602);
                ClearAllcontrol.ClearAll(ll_Q1603);
                ClearAllcontrol.ClearAll(ll_Q1604);
                ClearAllcontrol.ClearAll(ll_Q1604_OT);
                ClearAllcontrol.ClearAll(ll_Q1605);
                ClearAllcontrol.ClearAll(ll_Q1606);
                ClearAllcontrol.ClearAll(ll_Q1607);
                ClearAllcontrol.ClearAll(ll_Q1608);
                ClearAllcontrol.ClearAll(ll_Q1609);
                ClearAllcontrol.ClearAll(ll_Q1610);

                ll_Q1401.setVisibility(View.GONE);
                ll_Q1402.setVisibility(View.GONE);
                ll_Q1403.setVisibility(View.GONE);
                ll_Q1403_OT.setVisibility(View.GONE);
                ll_Q1404.setVisibility(View.GONE);
                ll_Q1406.setVisibility(View.GONE);
                ll_Q1407.setVisibility(View.GONE);
                ll_Q1408.setVisibility(View.GONE);
                ll_Q1409.setVisibility(View.GONE);
                ll_Q1410.setVisibility(View.GONE);
                ll_Q1411.setVisibility(View.GONE);
                ll_Q1412.setVisibility(View.GONE);
                ll_Q1413.setVisibility(View.GONE);
                ll_Q1414_1.setVisibility(View.GONE);
                ll_Q1414_2.setVisibility(View.GONE);
                ll_Q1414_3.setVisibility(View.GONE);
                ll_Q1414_4.setVisibility(View.GONE);
                ll_Q1414_5.setVisibility(View.GONE);
                ll_Q1414_6.setVisibility(View.GONE);
                ll_Q1414_7.setVisibility(View.GONE);
                ll_Q1414_8.setVisibility(View.GONE);
                ll_Q1414_9.setVisibility(View.GONE);
                ll_Q1414_10.setVisibility(View.GONE);
                ll_Q1415.setVisibility(View.GONE);
                ll_Q1416.setVisibility(View.GONE);
                ll_Q1416_OT.setVisibility(View.GONE);
                ll_Q1417.setVisibility(View.GONE);
                ll_Q1417_OT.setVisibility(View.GONE);
                ll_Q1418.setVisibility(View.GONE);
                ll_Q1418_OT.setVisibility(View.GONE);
                ll_Q1419.setVisibility(View.GONE);
                ll_Q1419_OT.setVisibility(View.GONE);
                ll_Q1420.setVisibility(View.GONE);
                ll_Q1420_OT.setVisibility(View.GONE);
                ll_Q1421.setVisibility(View.GONE);
                ll_Q1421_OT.setVisibility(View.GONE);
                ll_Q1501.setVisibility(View.GONE);
                ll_Q1502.setVisibility(View.GONE);
                ll_Q1601.setVisibility(View.GONE);
                ll_Q1602.setVisibility(View.GONE);
                ll_Q1603.setVisibility(View.GONE);
                ll_Q1604.setVisibility(View.GONE);
                ll_Q1604_OT.setVisibility(View.GONE);
                ll_Q1605.setVisibility(View.GONE);
                ll_Q1606.setVisibility(View.GONE);
                ll_Q1607.setVisibility(View.GONE);
                ll_Q1608.setVisibility(View.GONE);
                ll_Q1609.setVisibility(View.GONE);
                ll_Q1610.setVisibility(View.GONE);

            } else {

                ll_Q1401.setVisibility(View.VISIBLE);
                ll_Q1402.setVisibility(View.VISIBLE);
                ll_Q1403.setVisibility(View.VISIBLE);
                ll_Q1404.setVisibility(View.VISIBLE);
                ll_Q1406.setVisibility(View.VISIBLE);
                ll_Q1407.setVisibility(View.VISIBLE);
                ll_Q1408.setVisibility(View.VISIBLE);
                ll_Q1409.setVisibility(View.VISIBLE);
                ll_Q1410.setVisibility(View.VISIBLE);
                ll_Q1411.setVisibility(View.VISIBLE);
                ll_Q1412.setVisibility(View.VISIBLE);
                ll_Q1413.setVisibility(View.VISIBLE);
                ll_Q1414_1.setVisibility(View.VISIBLE);
                ll_Q1414_2.setVisibility(View.VISIBLE);
                ll_Q1414_3.setVisibility(View.VISIBLE);
                ll_Q1414_4.setVisibility(View.VISIBLE);
                ll_Q1414_5.setVisibility(View.VISIBLE);
                ll_Q1414_6.setVisibility(View.VISIBLE);
                ll_Q1414_7.setVisibility(View.VISIBLE);
                ll_Q1414_8.setVisibility(View.VISIBLE);
                ll_Q1414_9.setVisibility(View.VISIBLE);
                ll_Q1414_10.setVisibility(View.VISIBLE);
                ll_Q1415.setVisibility(View.VISIBLE);
                ll_Q1416.setVisibility(View.VISIBLE);
                ll_Q1417.setVisibility(View.VISIBLE);
                ll_Q1418.setVisibility(View.VISIBLE);
                ll_Q1419.setVisibility(View.VISIBLE);
                ll_Q1420.setVisibility(View.VISIBLE);
                ll_Q1421.setVisibility(View.VISIBLE);
                ll_Q1501.setVisibility(View.VISIBLE);
                ll_Q1502.setVisibility(View.VISIBLE);
                ll_Q1601.setVisibility(View.VISIBLE);
                ll_Q1602.setVisibility(View.VISIBLE);
                ll_Q1603.setVisibility(View.VISIBLE);
                ll_Q1604.setVisibility(View.VISIBLE);
                ll_Q1605.setVisibility(View.VISIBLE);
                ll_Q1606.setVisibility(View.VISIBLE);
                ll_Q1607.setVisibility(View.VISIBLE);
                ll_Q1608.setVisibility(View.VISIBLE);
                ll_Q1609.setVisibility(View.VISIBLE);
                ll_Q1610.setVisibility(View.VISIBLE);
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


            ll_Q1502.setVisibility(View.GONE);


            if (rb_Q1501_1.isChecked()) {

                ll_Q1502.setVisibility(View.VISIBLE);


            } else {

                ClearAllcontrol.ClearAll(ll_Q1502);


                ll_Q1502.setVisibility(View.GONE);

            }
        }


        if (compoundButton.getId() == R.id.rb_Q1602_1
                || compoundButton.getId() == R.id.rb_Q1602_2
                || compoundButton.getId() == R.id.rb_Q1602_DK) {

            if (rb_Q1602_2.isChecked() || rb_Q1602_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_Q1603);
                ll_Q1603.setVisibility(View.GONE);

                cb_Q1607_conflict.setChecked(true);
                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");

            } else {

                ll_Q1603.setVisibility(View.VISIBLE);

                cb_Q1607_conflict.setChecked(false);
                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");
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

            if (rb_Q1605_2.isChecked()) {

                ClearAllcontrol.ClearAll(ll_Q1606);
                ll_Q1606.setVisibility(View.GONE);

                cb_Q1607_conflict.setChecked(true);
                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");

            } else {

                ll_Q1606.setVisibility(View.VISIBLE);
                cb_Q1607_conflict.setChecked(false);
                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");
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


        if (compoundButton.getId() == R.id.cb_Q1607_conflict) {

            if (cb_Q1607_conflict.isChecked()) {

                ll_Q1608.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_Q1608);
                ll_Q1608.setVisibility(View.GONE);
            }
        }
    }

    void value_assignment() {

        Q1201_1 = "-1";
        Q1201_2 = "-1";
        Q1201_3 = "-1";
        Q1201_4 = "-1";
        Q1201_5 = "-1";
        Q1201_6 = "-1";
        Q1202 = "-1";
        Q1203 = "-1";
        Q1204 = "-1";
        Q1205 = "-1";
        Q1206_d = "-1";
        Q1206_m = "-1";
        Q1206_y = "-1";
        Q1207 = "-1";
        Q1208 = "-1";
        Q1209 = "-1";
        Q1301 = "-1";
        Q1302 = "-1";
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
        Q1607_1 = "-1";
        Q1607_2 = "-1";
        Q1607_3 = "-1";
        Q1608_1 = "-1";
        Q1608_2 = "-1";
        Q1608_3 = "-1";
        Q1609 = "-1";
        Q1610_1 = "-1";
        Q1610_2 = "-1";
        Q1610_3 = "-1";
        STATUS = "0";
        interviewType = -1;
        currentSection = 1;


        for (int i = 0; i < lst_q1503.size(); i++) {

            if (i == 0) {

                Q1503 = lst_q1503.get(i) + ",";

            } else {

                if (i == lst_q1503.size() - 1) {

                    Q1503 = Q1503 + lst_q1503.get(i);

                } else {

                    Q1503 = Q1503 + lst_q1503.get(i) + ",";
                }
            }
        }


        for (int j = 0; j < lst_other.size(); j++) {

            if (j == 0) {

                Q1503_OT = lst_other.get(j) + ",";

            } else {

                if (j == lst_other.size() - 1) {

                    Q1503_OT = Q1503_OT + lst_other.get(j);

                } else {

                    Q1503_OT = Q1503_OT + lst_other.get(j) + ",";
                }
            }
        }


        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }


        Q1201_1 = sp_Q1201_1.getSelectedItem().toString();
        Q1201_2 = sp_Q1201_2.getSelectedItem().toString();


        if (ed_Q1201_3.getText().toString().trim().length() > 0) {
            Q1201_3 = ed_Q1201_3.getText().toString().trim();
        }

        if (ed_Q1201_4.getText().toString().trim().length() > 0) {
            Q1201_4 = ed_Q1201_4.getText().toString().trim();
        }

        if (ed_Q1201_5.getText().toString().trim().length() > 0) {
            Q1201_5 = ed_Q1201_5.getText().toString().trim();
        }

        if (ed_Q1201_6.getText().toString().trim().length() > 0) {
            Q1201_6 = ed_Q1201_6.getText().toString().trim();
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


        Calendar cdt = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dt.format(cdt.getTime());
        String[] dtf = formattedDate.split(" ");

        if (dtf[0].length() > 0) {

            Q1307 = dtf[0].trim();
        }

        if (dtf[1].length() > 0) {

            Q1308 = dtf[1].trim();
        }

        /*if (ed_Q1312.getText().toString().trim().length() > 0) {
            Q1312 = ed_Q1312.getText().toString().trim();
        }

        if (ed_Q1313.getText().toString().trim().length() > 0) {
            Q1313 = ed_Q1313.getText().toString().trim();
        }*/

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
            currentSection = 99;
            interviewType = 4;
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
            Q1415 = "4";
        } else if (rb_Q1415_5.isChecked()) {
            Q1415 = "5";
        } else if (rb_Q1415_6.isChecked()) {
            Q1415 = "6";
        } else if (rb_Q1415_7.isChecked()) {
            Q1415 = "7";
        } else if (rb_Q1415_8.isChecked()) {
            Q1415 = "8";
        } else if (rb_Q1415_9.isChecked()) {
            Q1415 = "9";
        } else if (rb_Q1415_10.isChecked()) {
            Q1415 = "10";
        } else if (rb_Q1415_11.isChecked()) {
            Q1415 = "11";
        } else if (rb_Q1415_12.isChecked()) {
            Q1415 = "12";
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
            interviewType = 1;
        } else if (rb_Q1609_2.isChecked()) {
            Q1609 = "2";
            interviewType = 2;
        } else if (rb_Q1609_3.isChecked()) {
            Q1609 = "3";
            interviewType = 2;
        } else if (rb_Q1609_4.isChecked()) {
            Q1609 = "4";
            interviewType = 2;
        } else if (rb_Q1609_5.isChecked()) {
            Q1609 = "5";
            interviewType = 3;
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

        String query = "insert into Q1101_Q1610("
                + Global.GS.Q1101_Q1610.study_id + ","
                + Global.GS.Q1101_Q1610.Q1201_1 + ","
                + Global.GS.Q1101_Q1610.Q1201_2 + ","
                + Global.GS.Q1101_Q1610.Q1201_3 + ","
                + Global.GS.Q1101_Q1610.Q1201_4 + ","
                + Global.GS.Q1101_Q1610.Q1201_5 + ","
                + Global.GS.Q1101_Q1610.Q1201_6 + ","
                + Global.GS.Q1101_Q1610.Q1202 + ","
                + Global.GS.Q1101_Q1610.Q1203 + ","
                + Global.GS.Q1101_Q1610.Q1204 + ","
                + Global.GS.Q1101_Q1610.Q1205 + ","
                + Global.GS.Q1101_Q1610.Q1206_d + ","
                + Global.GS.Q1101_Q1610.Q1206_m + ","
                + Global.GS.Q1101_Q1610.Q1206_y + ","
                + Global.GS.Q1101_Q1610.Q1207 + ","
                + Global.GS.Q1101_Q1610.Q1208 + ","
                + Global.GS.Q1101_Q1610.Q1209 + ","
                + Global.GS.Q1101_Q1610.Q1301 + ","
                + Global.GS.Q1101_Q1610.Q1302 + ","
                + Global.GS.Q1101_Q1610.Q1307 + ","
                + Global.GS.Q1101_Q1610.Q1308 + ","
                + Global.GS.Q1101_Q1610.Q1309 + ","
                + Global.GS.Q1101_Q1610.Q1310 + ","
                + Global.GS.Q1101_Q1610.Q1311 + ","
                + Global.GS.Q1101_Q1610.Q1312 + ","
                + Global.GS.Q1101_Q1610.Q1313 + ","
                + Global.GS.Q1101_Q1610.Q1401 + ","
                + Global.GS.Q1101_Q1610.Q1402 + ","
                + Global.GS.Q1101_Q1610.Q1403 + ","
                + Global.GS.Q1101_Q1610.Q1403_OT + ","
                + Global.GS.Q1101_Q1610.Q1404 + ","
                + Global.GS.Q1101_Q1610.Q1405 + ","
                + Global.GS.Q1101_Q1610.Q1406 + ","
                + Global.GS.Q1101_Q1610.Q1407 + ","
                + Global.GS.Q1101_Q1610.Q1408 + ","
                + Global.GS.Q1101_Q1610.Q1409 + ","
                + Global.GS.Q1101_Q1610.Q1410 + ","
                + Global.GS.Q1101_Q1610.Q1411 + ","
                + Global.GS.Q1101_Q1610.Q1412 + ","
                + Global.GS.Q1101_Q1610.Q1413 + ","
                + Global.GS.Q1101_Q1610.Q1414_1 + ","
                + Global.GS.Q1101_Q1610.Q1414_2 + ","
                + Global.GS.Q1101_Q1610.Q1414_3 + ","
                + Global.GS.Q1101_Q1610.Q1414_4 + ","
                + Global.GS.Q1101_Q1610.Q1414_5 + ","
                + Global.GS.Q1101_Q1610.Q1414_6 + ","
                + Global.GS.Q1101_Q1610.Q1414_7 + ","
                + Global.GS.Q1101_Q1610.Q1414_8 + ","
                + Global.GS.Q1101_Q1610.Q1414_9 + ","
                + Global.GS.Q1101_Q1610.Q1414_10 + ","
                + Global.GS.Q1101_Q1610.Q1415 + ","
                + Global.GS.Q1101_Q1610.Q1416 + ","
                + Global.GS.Q1101_Q1610.Q1416_OT + ","
                + Global.GS.Q1101_Q1610.Q1417 + ","
                + Global.GS.Q1101_Q1610.Q1417_OT + ","
                + Global.GS.Q1101_Q1610.Q1418 + ","
                + Global.GS.Q1101_Q1610.Q1418_OT + ","
                + Global.GS.Q1101_Q1610.Q1419 + ","
                + Global.GS.Q1101_Q1610.Q1419_OT + ","
                + Global.GS.Q1101_Q1610.Q1420 + ","
                + Global.GS.Q1101_Q1610.Q1420_OT + ","
                + Global.GS.Q1101_Q1610.Q1421 + ","
                + Global.GS.Q1101_Q1610.Q1421_OT + ","
                + Global.GS.Q1101_Q1610.Q1501 + ","
                + Global.GS.Q1101_Q1610.Q1502 + ","
                + Global.GS.Q1101_Q1610.Q1503 + ","
                + Global.GS.Q1101_Q1610.Q1503_OT + ","
                + Global.GS.Q1101_Q1610.Q1601 + ","
                + Global.GS.Q1101_Q1610.Q1602 + ","
                + Global.GS.Q1101_Q1610.Q1603 + ","
                + Global.GS.Q1101_Q1610.Q1604 + ","
                + Global.GS.Q1101_Q1610.Q1604_OT + ","
                + Global.GS.Q1101_Q1610.Q1605 + ","
                + Global.GS.Q1101_Q1610.Q1606 + ","
                + Global.GS.Q1101_Q1610.Q1607_1 + ","
                + Global.GS.Q1101_Q1610.Q1607_2 + ","
                + Global.GS.Q1101_Q1610.Q1607_3 + ","
                + Global.GS.Q1101_Q1610.Q1608_1 + ","
                + Global.GS.Q1101_Q1610.Q1608_2 + ","
                + Global.GS.Q1101_Q1610.Q1608_3 + ","
                + Global.GS.Q1101_Q1610.Q1609 + ","
                + Global.GS.Q1101_Q1610.Q1610_1 + ","
                + Global.GS.Q1101_Q1610.Q1610_2 + ","
                + Global.GS.Q1101_Q1610.Q1610_3 + ","
                + Global.GS.Q1101_Q1610.interviewType + ","
                + Global.GS.Q1101_Q1610.currentSection + ","
                + Global.GS.Q1101_Q1610.STATUS + ") values ('" +

                study_id + "','" +
                Q1201_1 + "','" +
                Q1201_2 + "','" +
                Q1201_3 + "','" +
                Q1201_4 + "','" +
                Q1201_5 + "','" +
                Q1201_6 + "','" +
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
                interviewType + "','" +
                currentSection + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "General Section inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
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

        return Gothrough.IamHiden(ll_Q1610) != false;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

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

        int mYearDiff, mMonDiff, mDayDiff;

        if (parseInt(dob_year) == 9999 || parseInt(dod_year) == 9999) {

            mYearDiff = 0;

        } else {

            mYearDiff = parseInt(dod_year) - parseInt(dob_year);
        }

        if (parseInt(dob_month) == 99 || parseInt(dod_month) == 99) {

            mMonDiff = 0;

        } else {

            mMonDiff = parseInt(dod_month) - parseInt(dob_month);

            if (mMonDiff < 0) {
                mYearDiff = mYearDiff - 1;
                mMonDiff = mMonDiff + 12;
            }
        }

        if (parseInt(dob_day) == 99 || parseInt(dod_day) == 99) {

            mDayDiff = 0;

        } else {

            mDayDiff = parseInt(dod_day) - parseInt(dob_day);
        }

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

    @Override
    public void afterTextChanged(Editable s) {
    }

    /*private static boolean isValid(String s) {

        return !s.trim().equals("") && !s.trim().equals("99/99/9999");
    }*/

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

                // Force assigning values from here start
                if (years >= 2) {

                    ed_Q1206_d.setText("0");
                    ed_Q1206_m.setText("0");
                    ed_Q1206_y.setText(String.valueOf(years));

                } else {

                    months = (years * 12) + months;

                    if (months > 0 && months <= 24) {

                        ed_Q1206_d.setText("0");
                        ed_Q1206_m.setText(String.valueOf(months));
                        ed_Q1206_y.setText("0");

                    } else if (months == 0) {

                        if (days < 28) {

                            ed_Q1206_d.setText(String.valueOf(days));
                            ed_Q1206_m.setText("0");
                            ed_Q1206_y.setText("0");

                        } else {

                            ed_Q1206_d.setText("0");
                            ed_Q1206_m.setText("1");
                            ed_Q1206_y.setText("0");
                        }
                    }
                }
                // Force assigning values end

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

        } else {

            ed_Q1206_d.setText(null);
            ed_Q1206_m.setText(null);
            ed_Q1206_y.setText(null);

            ed_Q1206_d.setEnabled(false);
            ed_Q1206_m.setEnabled(false);
            ed_Q1206_y.setEnabled(false);

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

                // Force assigning values from here start
                if (years >= 2) {

                    ed_Q1607_1.setText("0");
                    ed_Q1607_2.setText("0");
                    ed_Q1607_3.setText(String.valueOf(years));

                } else {

                    months = (years * 12) + months;

                    if (months > 0 && months <= 24) {

                        ed_Q1607_1.setText("0");
                        ed_Q1607_2.setText(String.valueOf(months));
                        ed_Q1607_3.setText("0");

                    } else if (months == 0) {

                        if (days < 28) {

                            ed_Q1607_1.setText(String.valueOf(days));
                            ed_Q1607_2.setText("0");
                            ed_Q1607_3.setText("0");

                        } else {

                            ed_Q1607_1.setText("0");
                            ed_Q1607_2.setText("1");
                            ed_Q1607_3.setText("0");
                        }
                    }

                    cb_Q1607_conflict.setChecked(false);
                }
                // Force assigning values end

            } else {

                ed_Q1607_1.setText("0");
                ed_Q1607_2.setText("0");
                ed_Q1607_3.setText("0");

                //cb_Q1607_conflict.setChecked(true);
            }

        } else {

            ed_Q1607_1.setText("0");
            ed_Q1607_2.setText("0");
            ed_Q1607_3.setText("0");

            //cb_Q1607_conflict.setChecked(true);
        }
    }

    public boolean validate(final String date) {

        matcher = pattern.matcher(date);

        String[] date_sep = date.split("/");

        if (!date.equals("") && (date_sep[0].equals("99") || date_sep[1].equals("99") || date_sep[2].equals("9999"))) {

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
                        return !day.equals("30") && !day.equals("31");
                    } else {
                        return !day.equals("29") && !day.equals("30") && !day.equals("31");
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

    boolean if_study_id_exsist() {
        DBHelper db = new DBHelper(this);
        Cursor res = db.getData("Q1101_Q1610", study_id);

        return res.getCount() > 0;

    }

    void change_langua() {

        final MyPreferences preferences = new MyPreferences(this);

        String lang = preferences.getlanguage();

//create a string for country
        String country = preferences.getcountry();
//use constructor with country


        if (lang == null) {
            lang = "ur";
            country = "PK";

        }
        Locale locale = new Locale(lang, country);


        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        this.getResources().updateConfiguration(config,
                this.getResources().getDisplayMetrics());

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (i == 0) {

            dataDistricts = new String[]{"Quetta", "Pishin", "Killa Abdullah", "Chagai", "Nushki",
                    "Loralai", "Barkhan", "Musakhel", "Killa Saifullah", "Zhob", "Sherani",
                    "Sibi", "Harnai", "Ziarat", "Kohlu", "Dera Bugti", "Lehri",
                    "Kech", "Gawadar", "Panjgur",
                    "Kalat", "Mastung", "Khuzdar", "Awaran", "Kharan", "Washuk", "Lasbela",
                    "Kachhi", "Jaffarabad", "Nasirabad", "Jhal Magsi", "Sohbatpur"};


        }

        if (i == 1) {

            dataDistricts = new String[]{"Islamabad", "Attock", "Rawalpindi", "Jhelum", "Chakwal",
                    "Sargodha", "Bhakkar", "Khushab", "Mianwali",
                    "Faisalabad", "Chiniot", "Jhang", "Toba Tek Singh",
                    "Gujranwala", "Hafizabad", "Gujrat", "Mandi Bahauddin", "Sialkot", "Narowal",
                    "Lahore", "Kasur", "Sheikhupura", "Nankana Sahib",
                    "Okara", "Sahiwal", "Pakpattan",
                    "Vehari", "Multan", "Lodhran", "Khanewal",
                    "Dera Ghazi Khan", "Rajanpur", "Layyah", "Muzaffargarh",
                    "Bahawalpur", "Bahawalnagar", "Rahim Yar Khan"};
        }

        if (i == 2) {

            dataDistricts = new String[]{"Karachi West", "Malir", "Karachi South", "Karachi East", "Karachi Central", "Korangi",
                    "Sukkur", "Ghotki", "Khairpur",
                    "Naushahro Feroze", "Shaheed Benazirabad", "Sanghar",
                    "Mirpur Khas", "Umer Kot", "Tharparkar",
                    "Jacobabad", "Kashmor", "Shikarpur", "Larkana", "Kambar Shahdad Kot",
                    "Dadu", "Jamshoro", "Hyderabad", "Tando Allahyar", "Tando Muhammad Khan", "Matiari", "Badin", "Thatta", "Sujawal"};
        }

        if (i == 3) {

            dataDistricts = new String[]{"Chitral", "Upper Dir", "Lower Dir", "Swat", "Shangla", "Buner", "Malakand Protected Area",
                    "Kohistan", "Mansehra", "Batagram", "Abbotabad", "Haripur", "Torghar",
                    "Mardan", "Swabi",
                    "Charsadda", "Peshawar", "Nowshera",
                    "Kohat", "Hangu", "Karak",
                    "Bannu", "Lakki Marwat",
                    "Dera Ismail Khan", "Tank"};
        }

        if (i == 4) {

            dataDistricts = new String[]{"Bajaur Agency", "Mohmand Agency", "Khyber Agency", "Kurram Agency", "Orakzai Agency",
                    "North Waziristan", "South Waziristan", "FR Bannu", "FR D.I Khan", "FR Kohat", "FR Lakki Marwat", "FR Peshawar", "FR Tank"};
        }

        if (i == 5) {

            dataDistricts = new String[]{"Gilgit", "Skardu", "Ghizer", "Hunza", "Nagar", "Shigar", "Ghanche", "Baltistan", "Kharmang", "Diamir", "Astore"};
        }

        if (i == 6) {

            dataDistricts = new String[]{"Muzaffarabad", "Neelum", "Hattian Bala", "Bagh", "Sudhnoti", "Poonch", "Haveli", "Bhimber", "Mirpur", "Kotli"};
        }

        ArrayAdapter<String> aas = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataDistricts);
        sp_Q1201_2.setAdapter(aas);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}