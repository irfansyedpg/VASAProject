package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import data.DBHelper;
import data.LocalDataManager;
import utils.ClearAllcontrol;
import utils.Gothrough;


public class C3101_C3112 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener, View.OnFocusChangeListener {


    // Region Declaration

    private static final int CONTENT_REQUEST = 1337;
    Button btn_next, btn_imgCapture;
    TextView txt_cap_count;

    RadioButton
            rb_C3101_1,
            rb_C3101_2,
            rb_C3101_3,
            rb_C3101_DK,
            rb_C3102_1,
            rb_C3102_2,
            rb_C3102_3,
            rb_C3102_DK,
            rb_C3103_1,
            rb_C3103_2,
            rb_C3103_DK,
            rb_C3103_RA,
            rb_C3104_1,
            rb_C3104_2,
            rb_C3104_DK,
            rb_C3104_RA,
            rb_C3105_1,
            rb_C3105_2,
            rb_C3105_3,
            rb_C3105_4,
            rb_C3105_DK,
            rb_C3106_1,
            rb_C3106_2,
            rb_C3106_DK,
            rb_C3107_1_1,
            rb_C3107_1_2,
            rb_C3107_1_DK,
            rb_C3107_2_1,
            rb_C3107_2_2,
            rb_C3107_2_DK,
            rb_C3107_3_1,
            rb_C3107_3_2,
            rb_C3107_3_DK,
            rb_C3107_4_1,
            rb_C3107_4_2,
            rb_C3107_4_DK,
            rb_C3107_5_1,
            rb_C3107_5_2,
            rb_C3107_5_DK,
            rb_C3107_6_1,
            rb_C3107_6_2,
            rb_C3107_6_DK,
            rb_C3107_7_1,
            rb_C3107_7_2,
            rb_C3107_7_DK,
            rb_C3107_8_1,
            rb_C3107_8_2,
            rb_C3107_8_DK,
            rb_C3107_9_1,
            rb_C3107_9_2,
            rb_C3107_9_DK,
            rb_C3107_10_1,
            rb_C3107_10_2,
            rb_C3107_10_DK,
            rb_C3107_11_1,
            rb_C3107_11_2,
            rb_C3107_11_DK,
            rb_C3107_12_1,
            rb_C3107_12_2,
            rb_C3107_12_DK,
            rb_C3107_13_1,
            rb_C3107_13_2,
            rb_C3107_13_DK,
            rb_C3107_14_1,
            rb_C3107_14_2,
            rb_C3107_14_DK,
            rb_C3107_15_1,
            rb_C3107_15_2,
            rb_C3107_15_DK,
            rb_C3107_16_1,
            rb_C3107_16_2,
            rb_C3107_16_DK,
            rb_C3107_17_1,
            rb_C3107_17_2,
            rb_C3107_17_DK,
            rb_C3107_18_1,
            rb_C3107_18_2,
            rb_C3107_18_DK,
            rb_C3107_19_1,
            rb_C3107_19_2,
            rb_C3107_19_DK,
            rb_C3107_20_1,
            rb_C3107_20_2,
            rb_C3107_20_DK,
            rb_C3107_21_1,
            rb_C3107_21_2,
            rb_C3107_21_DK,
            rb_C3108_1,
            rb_C3108_2,
            rb_C3108_3,
            rb_C3109_1_1,
            rb_C3109_1_2,
            rb_C3109_1_DK,
            rb_C3109_1_NR,
            rb_C3109_2_1,
            rb_C3109_2_2,
            rb_C3109_2_DK,
            rb_C3109_2_NR,
            rb_C3109_3_1,
            rb_C3109_3_2,
            rb_C3109_3_DK,
            rb_C3109_3_NR,
            rb_C3109_4_1,
            rb_C3109_4_2,
            rb_C3109_4_DK,
            rb_C3109_4_NR,
            rb_C3109_5_1,
            rb_C3109_5_2,
            rb_C3109_5_DK,
            rb_C3109_5_NR,
            rb_C3109_6_1,
            rb_C3109_6_2,
            rb_C3109_6_DK,
            rb_C3109_6_NR,
            rb_C3109_7_1,
            rb_C3109_7_2,
            rb_C3109_7_DK,
            rb_C3109_7_NR,
            rb_C3109_8_1,
            rb_C3109_8_2,
            rb_C3109_8_DK,
            rb_C3109_8_NR,
            rb_C3109_9_1,
            rb_C3109_9_2,
            rb_C3109_9_DK,
            rb_C3109_9_NR,
            rb_C3109_10_1,
            rb_C3109_10_2,
            rb_C3109_10_DK,
            rb_C3109_10_NR,
            rb_C3109_11_1,
            rb_C3109_11_2,
            rb_C3109_11_DK,
            rb_C3109_11_NR,
            rb_C3109_12_1,
            rb_C3109_12_2,
            rb_C3109_12_DK,
            rb_C3109_12_NR,
            rb_C3109_13_1,
            rb_C3109_13_2,
            rb_C3109_13_DK,
            rb_C3109_13_NR,
            rb_C3109_14_1,
            rb_C3109_14_2,
            rb_C3109_14_DK,
            rb_C3109_14_NR,
            rb_C3110_1,
            rb_C3110_2,
            rb_C3110_DK,
            rb_C3111_1,
            rb_C3111_2,
            rb_C3111_DK,
            rb_C3111_1_1,
            rb_C3111_1_2,
            rb_C3111_1_DK,
            rb_C3111_3_1,
            rb_C3111_3_2,
            rb_C3111_3_DK,
            rb_C3111_5_1,
            rb_C3111_5_2,
            rb_C3111_5_DK,
            rb_C3111_7_1,
            rb_C3111_7_2,
            rb_C3111_7_DK,
            rb_C3111_8_1,
            rb_C3111_8_2,
            rb_C3111_8_DK,
            rb_C3112_1,
            rb_C3112_2,
            rb_C3112_DK;


    EditText
            ed_study_id,
            ed_C3105_OT,
            ed_C3107_6_OT,
            ed_C3107_21_OT,
            ed_C3111_2,
            ed_C3111_4,
            ed_C3111_6,
            ed_C3111_9;


    String
            C3101,
            C3102,
            C3103,
            C3104,
            C3105,
            C3105_OT,
            C3106,
            C3107_1,
            C3107_2,
            C3107_3,
            C3107_4,
            C3107_5,
            C3107_6,
            C3107_6_OT,
            C3107_7,
            C3107_8,
            C3107_9,
            C3107_10,
            C3107_11,
            C3107_12,
            C3107_13,
            C3107_14,
            C3107_15,
            C3107_16,
            C3107_17,
            C3107_18,
            C3107_19,
            C3107_20,
            C3107_21,
            C3107_21_OT,
            C3108,
            C3109_1,
            C3109_2,
            C3109_3,
            C3109_4,
            C3109_5,
            C3109_6,
            C3109_7,
            C3109_8,
            C3109_9,
            C3109_10,
            C3109_11,
            C3109_12,
            C3109_13,
            C3109_14,
            C3110,
            C3111,
            C3111_1,
            C3111_2,
            C3111_3,
            C3111_4,
            C3111_5,
            C3111_6,
            C3111_7,
            C3111_8,
            C3111_9,
            C3112,
            STATUS,
            study_id;

    int Q1102, ageInDays, currentSection;

    //endregion
    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_C3101,
            ll_C3102,
            ll_C3103,
            ll_C3104,
            ll_C3105,
            ll_C3105_OT,
            ll_C3106,
            ll_C3107_1,
            ll_C3107_2,
            ll_C3107_3,
            ll_C3107_4,
            ll_C3107_5,
            ll_C3107_6,
            ll_C3107_6_OT,
            ll_C3107_7,
            ll_C3107_8,
            ll_C3107_9,
            ll_C3107_10,
            ll_C3107_11,
            ll_C3107_12,
            ll_C3107_13,
            ll_C3107_14,
            ll_C3107_15,
            ll_C3107_16,
            ll_C3107_17,
            ll_C3107_18,
            ll_C3107_19,
            ll_C3107_20,
            ll_C3107_21,
            ll_C3107_21_OT,
            ll_C3108,
            ll_C3108_A,
            ll_C3109_1,
            ll_C3109_2,
            ll_C3109_3,
            ll_C3109_4,
            ll_C3109_5,
            ll_C3109_6,
            ll_C3109_7,
            ll_C3109_8,
            ll_C3109_9,
            ll_C3109_10,
            ll_C3109_11,
            ll_C3109_12,
            ll_C3109_13,
            ll_C3109_14,
            ll_C3110,
            ll_C3111,
            ll_C3111_1,
            ll_C3111_2,
            ll_C3111_3,
            ll_C3111_4,
            ll_C3111_5,
            ll_C3111_6,
            ll_C3111_7,
            ll_C3111_8,
            ll_C3111_9,
            ll_C3112;

    private File output = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3101_c3112);

        this.setTitle(getString(R.string.h_c_sec_7));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();

        ll_C3101.setVisibility(View.GONE);
        ll_C3105_OT.setVisibility(View.GONE);
        ll_C3107_6_OT.setVisibility(View.GONE);
        ll_C3107_21_OT.setVisibility(View.GONE);

        ll_C3108_A.setVisibility(View.GONE);


        DBHelper db = new DBHelper(this);
        Cursor Q1101_Q1610 = db.getData("Q1101_Q1610", study_id);

        if (Q1101_Q1610.getCount() > 0) {

            Q1101_Q1610.moveToFirst();

            //Q1102 = Integer.parseInt(Q1101_Q1610.getString(3));

            /*Q1102 = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1102")));
            if (Q1102 == 1) {

                ll_C3101.setVisibility(View.VISIBLE);

            } else {

                ll_C3101.setVisibility(View.GONE);
            }*/

            /*String dob = Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1603"));
            String dod = Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1606"));
            ageInDays = numOfDays(dob, dod);*/

            if (Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_1"))) > 0
                    || Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_2"))) > 0
                    || Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_3"))) > 0) {

                if (Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_3"))) > 0) {

                    ageInDays = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_3"))) * 12 * 30;

                } else if (Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_2"))) > 0) {

                    ageInDays = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_2"))) * 30;
                } else {

                    ageInDays = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1607_1")));
                }

            } else {

                if (Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1608_3"))) > 0) {

                    ageInDays = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1608_3"))) * 12 * 30;

                } else if (Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1608_2"))) > 0) {

                    ageInDays = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1608_2"))) * 30;
                } else {

                    ageInDays = Integer.valueOf(Q1101_Q1610.getString(Q1101_Q1610.getColumnIndex("Q1608_1")));
                }
            }

            if (ageInDays > 1440) {

                ll_C3102.setVisibility(View.GONE);
                ll_C3103.setVisibility(View.GONE);
                ll_C3104.setVisibility(View.GONE);
                ll_C3105.setVisibility(View.GONE);
                ll_C3106.setVisibility(View.GONE);

            } else {

                ll_C3102.setVisibility(View.VISIBLE);
                ll_C3103.setVisibility(View.VISIBLE);
                ll_C3104.setVisibility(View.VISIBLE);
                ll_C3105.setVisibility(View.VISIBLE);
                ll_C3106.setVisibility(View.VISIBLE);
            }
        }

        events_call();

        btn_next.setOnClickListener(this);
        btn_imgCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String RootDir = Environment.getExternalStorageDirectory()
                        + File.separator + "VASA";
                File RootFile = new File(RootDir);
                boolean success = true;
                if (!RootFile.exists()) {
                    success = RootFile.mkdir();
                }
                if (success) {

                    RootDir = RootDir + File.separator + ed_study_id.getText().toString();
                    RootFile = new File(RootDir);
                    success = true;
                    if (!RootFile.exists()) {
                        success = RootFile.mkdir();
                    }

                    if (success) {
                        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        output = new File(RootDir, "C3108.jpeg");

                        i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(output));
                        startActivityForResult(i, CONTENT_REQUEST);
                    } else {
                        Toast.makeText(getApplicationContext(), "Can't create folder!!", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Can't create folder!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CONTENT_REQUEST) {
            if (resultCode == RESULT_OK) {

                txt_cap_count.setText("Picture Attached");
                txt_cap_count.setTextColor(getResources().getColor(R.color.orange));

                Toast.makeText(this, "Image capture done!!", Toast.LENGTH_SHORT).show();
                btn_next.setEnabled(true);
            }
        }
    }

    @Override
    public void onClick(View view) {

        if (validateField() == false) {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_LONG).show();
            return;
        }

        value_assignment();
        insert_data();

        Intent c = new Intent(this, C3121_C3228.class);
        c.putExtra("study_id", study_id);
        startActivity(c);
    }

    public int numOfDays(String dob, String dod) {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd/mm/yyyy");

        int numOfDays = 0;

        try {
            Date date1 = myFormat.parse(dob);
            Date date2 = myFormat.parse(dod);
            long diff = date2.getTime() - date1.getTime();

            numOfDays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return numOfDays;
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);
        btn_imgCapture = findViewById(R.id.btn_imgCapture);
        txt_cap_count = findViewById(R.id.txt_cap_count);

        // Layouts
        ll_C3101 = findViewById(R.id.ll_C3101);
        ll_C3102 = findViewById(R.id.ll_C3102);
        ll_C3103 = findViewById(R.id.ll_C3103);
        ll_C3104 = findViewById(R.id.ll_C3104);
        ll_C3105 = findViewById(R.id.ll_C3105);
        ll_C3105_OT = findViewById(R.id.ll_C3105_OT);
        ll_C3106 = findViewById(R.id.ll_C3106);
        ll_C3107_1 = findViewById(R.id.ll_C3107_1);
        ll_C3107_2 = findViewById(R.id.ll_C3107_2);
        ll_C3107_3 = findViewById(R.id.ll_C3107_3);
        ll_C3107_4 = findViewById(R.id.ll_C3107_4);
        ll_C3107_5 = findViewById(R.id.ll_C3107_5);
        ll_C3107_6 = findViewById(R.id.ll_C3107_6);
        ll_C3107_6_OT = findViewById(R.id.ll_C3107_6_OT);
        ll_C3107_7 = findViewById(R.id.ll_C3107_7);
        ll_C3107_8 = findViewById(R.id.ll_C3107_8);
        ll_C3107_9 = findViewById(R.id.ll_C3107_9);
        ll_C3107_10 = findViewById(R.id.ll_C3107_10);
        ll_C3107_11 = findViewById(R.id.ll_C3107_11);
        ll_C3107_12 = findViewById(R.id.ll_C3107_12);
        ll_C3107_13 = findViewById(R.id.ll_C3107_13);
        ll_C3107_14 = findViewById(R.id.ll_C3107_14);
        ll_C3107_15 = findViewById(R.id.ll_C3107_15);
        ll_C3107_16 = findViewById(R.id.ll_C3107_16);
        ll_C3107_17 = findViewById(R.id.ll_C3107_17);
        ll_C3107_18 = findViewById(R.id.ll_C3107_18);
        ll_C3107_19 = findViewById(R.id.ll_C3107_19);
        ll_C3107_20 = findViewById(R.id.ll_C3107_20);
        ll_C3107_21 = findViewById(R.id.ll_C3107_21);
        ll_C3107_21_OT = findViewById(R.id.ll_C3107_21_OT);
        ll_C3108 = findViewById(R.id.ll_C3108);
        ll_C3108_A = findViewById(R.id.ll_C3108_A);
        ll_C3109_1 = findViewById(R.id.ll_C3109_1);
        ll_C3109_2 = findViewById(R.id.ll_C3109_2);
        ll_C3109_3 = findViewById(R.id.ll_C3109_3);
        ll_C3109_4 = findViewById(R.id.ll_C3109_4);
        ll_C3109_5 = findViewById(R.id.ll_C3109_5);
        ll_C3109_6 = findViewById(R.id.ll_C3109_6);
        ll_C3109_7 = findViewById(R.id.ll_C3109_7);
        ll_C3109_8 = findViewById(R.id.ll_C3109_8);
        ll_C3109_9 = findViewById(R.id.ll_C3109_9);
        ll_C3109_10 = findViewById(R.id.ll_C3109_10);
        ll_C3109_11 = findViewById(R.id.ll_C3109_11);
        ll_C3109_12 = findViewById(R.id.ll_C3109_12);
        ll_C3109_13 = findViewById(R.id.ll_C3109_13);
        ll_C3109_14 = findViewById(R.id.ll_C3109_14);
        ll_C3110 = findViewById(R.id.ll_C3110);
        ll_C3111 = findViewById(R.id.ll_C3111);
        ll_C3111_1 = findViewById(R.id.ll_C3111_1);
        ll_C3111_2 = findViewById(R.id.ll_C3111_2);
        ll_C3111_3 = findViewById(R.id.ll_C3111_3);
        ll_C3111_4 = findViewById(R.id.ll_C3111_4);
        ll_C3111_5 = findViewById(R.id.ll_C3111_5);
        ll_C3111_6 = findViewById(R.id.ll_C3111_6);
        ll_C3111_7 = findViewById(R.id.ll_C3111_7);
        ll_C3111_8 = findViewById(R.id.ll_C3111_8);
        ll_C3111_9 = findViewById(R.id.ll_C3111_9);
        ll_C3112 = findViewById(R.id.ll_C3112);


        // Radio Buttons
        rb_C3101_1 = findViewById(R.id.rb_C3101_1);
        rb_C3101_2 = findViewById(R.id.rb_C3101_2);
        rb_C3101_3 = findViewById(R.id.rb_C3101_3);
        rb_C3101_DK = findViewById(R.id.rb_C3101_DK);


        rb_C3102_1 = findViewById(R.id.rb_C3102_1);
        rb_C3102_2 = findViewById(R.id.rb_C3102_2);
        rb_C3102_3 = findViewById(R.id.rb_C3102_3);
        rb_C3102_DK = findViewById(R.id.rb_C3102_DK);


        rb_C3103_1 = findViewById(R.id.rb_C3103_1);
        rb_C3103_2 = findViewById(R.id.rb_C3103_2);
        rb_C3103_DK = findViewById(R.id.rb_C3103_DK);
        rb_C3103_RA = findViewById(R.id.rb_C3103_RA);


        rb_C3104_1 = findViewById(R.id.rb_C3104_1);
        rb_C3104_2 = findViewById(R.id.rb_C3104_2);
        rb_C3104_DK = findViewById(R.id.rb_C3104_DK);
        rb_C3104_RA = findViewById(R.id.rb_C3104_RA);


        rb_C3105_1 = findViewById(R.id.rb_C3105_1);
        rb_C3105_2 = findViewById(R.id.rb_C3105_2);
        rb_C3105_3 = findViewById(R.id.rb_C3105_3);
        rb_C3105_4 = findViewById(R.id.rb_C3105_4);
        rb_C3105_DK = findViewById(R.id.rb_C3105_DK);


        rb_C3106_1 = findViewById(R.id.rb_C3106_1);
        rb_C3106_2 = findViewById(R.id.rb_C3106_2);
        rb_C3106_DK = findViewById(R.id.rb_C3106_DK);


        rb_C3107_1_1 = findViewById(R.id.rb_C3107_1_1);
        rb_C3107_1_2 = findViewById(R.id.rb_C3107_1_2);
        rb_C3107_1_DK = findViewById(R.id.rb_C3107_1_DK);

        rb_C3107_2_1 = findViewById(R.id.rb_C3107_2_1);
        rb_C3107_2_2 = findViewById(R.id.rb_C3107_2_2);
        rb_C3107_2_DK = findViewById(R.id.rb_C3107_2_DK);

        rb_C3107_3_1 = findViewById(R.id.rb_C3107_3_1);
        rb_C3107_3_2 = findViewById(R.id.rb_C3107_3_2);
        rb_C3107_3_DK = findViewById(R.id.rb_C3107_3_DK);

        rb_C3107_4_1 = findViewById(R.id.rb_C3107_4_1);
        rb_C3107_4_2 = findViewById(R.id.rb_C3107_4_2);
        rb_C3107_4_DK = findViewById(R.id.rb_C3107_4_DK);

        rb_C3107_5_1 = findViewById(R.id.rb_C3107_5_1);
        rb_C3107_5_2 = findViewById(R.id.rb_C3107_5_2);
        rb_C3107_5_DK = findViewById(R.id.rb_C3107_5_DK);

        rb_C3107_6_1 = findViewById(R.id.rb_C3107_6_1);
        rb_C3107_6_2 = findViewById(R.id.rb_C3107_6_2);
        rb_C3107_6_DK = findViewById(R.id.rb_C3107_6_DK);

        rb_C3107_7_1 = findViewById(R.id.rb_C3107_7_1);
        rb_C3107_7_2 = findViewById(R.id.rb_C3107_7_2);
        rb_C3107_7_DK = findViewById(R.id.rb_C3107_7_DK);

        rb_C3107_8_1 = findViewById(R.id.rb_C3107_8_1);
        rb_C3107_8_2 = findViewById(R.id.rb_C3107_8_2);
        rb_C3107_8_DK = findViewById(R.id.rb_C3107_8_DK);

        rb_C3107_9_1 = findViewById(R.id.rb_C3107_9_1);
        rb_C3107_9_2 = findViewById(R.id.rb_C3107_9_2);
        rb_C3107_9_DK = findViewById(R.id.rb_C3107_9_DK);

        rb_C3107_10_1 = findViewById(R.id.rb_C3107_10_1);
        rb_C3107_10_2 = findViewById(R.id.rb_C3107_10_2);
        rb_C3107_10_DK = findViewById(R.id.rb_C3107_10_DK);

        rb_C3107_11_1 = findViewById(R.id.rb_C3107_11_1);
        rb_C3107_11_2 = findViewById(R.id.rb_C3107_11_2);
        rb_C3107_11_DK = findViewById(R.id.rb_C3107_11_DK);

        rb_C3107_12_1 = findViewById(R.id.rb_C3107_12_1);
        rb_C3107_12_2 = findViewById(R.id.rb_C3107_12_2);
        rb_C3107_12_DK = findViewById(R.id.rb_C3107_12_DK);

        rb_C3107_13_1 = findViewById(R.id.rb_C3107_13_1);
        rb_C3107_13_2 = findViewById(R.id.rb_C3107_13_2);
        rb_C3107_13_DK = findViewById(R.id.rb_C3107_13_DK);

        rb_C3107_14_1 = findViewById(R.id.rb_C3107_14_1);
        rb_C3107_14_2 = findViewById(R.id.rb_C3107_14_2);
        rb_C3107_14_DK = findViewById(R.id.rb_C3107_14_DK);

        rb_C3107_15_1 = findViewById(R.id.rb_C3107_15_1);
        rb_C3107_15_2 = findViewById(R.id.rb_C3107_15_2);
        rb_C3107_15_DK = findViewById(R.id.rb_C3107_15_DK);

        rb_C3107_16_1 = findViewById(R.id.rb_C3107_16_1);
        rb_C3107_16_2 = findViewById(R.id.rb_C3107_16_2);
        rb_C3107_16_DK = findViewById(R.id.rb_C3107_16_DK);

        rb_C3107_17_1 = findViewById(R.id.rb_C3107_17_1);
        rb_C3107_17_2 = findViewById(R.id.rb_C3107_17_2);
        rb_C3107_17_DK = findViewById(R.id.rb_C3107_17_DK);

        rb_C3107_18_1 = findViewById(R.id.rb_C3107_18_1);
        rb_C3107_18_2 = findViewById(R.id.rb_C3107_18_2);
        rb_C3107_18_DK = findViewById(R.id.rb_C3107_18_DK);

        rb_C3107_19_1 = findViewById(R.id.rb_C3107_19_1);
        rb_C3107_19_2 = findViewById(R.id.rb_C3107_19_2);
        rb_C3107_19_DK = findViewById(R.id.rb_C3107_19_DK);

        rb_C3107_20_1 = findViewById(R.id.rb_C3107_20_1);
        rb_C3107_20_2 = findViewById(R.id.rb_C3107_20_2);
        rb_C3107_20_DK = findViewById(R.id.rb_C3107_20_DK);

        rb_C3107_21_1 = findViewById(R.id.rb_C3107_21_1);
        rb_C3107_21_2 = findViewById(R.id.rb_C3107_21_2);
        rb_C3107_21_DK = findViewById(R.id.rb_C3107_21_DK);


        rb_C3108_1 = findViewById(R.id.rb_C3108_1);
        rb_C3108_2 = findViewById(R.id.rb_C3108_2);
        rb_C3108_3 = findViewById(R.id.rb_C3108_3);


        rb_C3109_1_1 = findViewById(R.id.rb_C3109_1_1);
        rb_C3109_1_2 = findViewById(R.id.rb_C3109_1_2);
        rb_C3109_1_DK = findViewById(R.id.rb_C3109_1_DK);
        rb_C3109_1_NR = findViewById(R.id.rb_C3109_1_NR);

        rb_C3109_2_1 = findViewById(R.id.rb_C3109_2_1);
        rb_C3109_2_2 = findViewById(R.id.rb_C3109_2_2);
        rb_C3109_2_DK = findViewById(R.id.rb_C3109_2_DK);
        rb_C3109_2_NR = findViewById(R.id.rb_C3109_2_NR);

        rb_C3109_3_1 = findViewById(R.id.rb_C3109_3_1);
        rb_C3109_3_2 = findViewById(R.id.rb_C3109_3_2);
        rb_C3109_3_DK = findViewById(R.id.rb_C3109_3_DK);
        rb_C3109_3_NR = findViewById(R.id.rb_C3109_3_NR);

        rb_C3109_4_1 = findViewById(R.id.rb_C3109_4_1);
        rb_C3109_4_2 = findViewById(R.id.rb_C3109_4_2);
        rb_C3109_4_DK = findViewById(R.id.rb_C3109_4_DK);
        rb_C3109_4_NR = findViewById(R.id.rb_C3109_4_NR);

        rb_C3109_5_1 = findViewById(R.id.rb_C3109_5_1);
        rb_C3109_5_2 = findViewById(R.id.rb_C3109_5_2);
        rb_C3109_5_DK = findViewById(R.id.rb_C3109_5_DK);
        rb_C3109_5_NR = findViewById(R.id.rb_C3109_5_NR);

        rb_C3109_6_1 = findViewById(R.id.rb_C3109_6_1);
        rb_C3109_6_2 = findViewById(R.id.rb_C3109_6_2);
        rb_C3109_6_DK = findViewById(R.id.rb_C3109_6_DK);
        rb_C3109_6_NR = findViewById(R.id.rb_C3109_6_NR);

        rb_C3109_7_1 = findViewById(R.id.rb_C3109_7_1);
        rb_C3109_7_2 = findViewById(R.id.rb_C3109_7_2);
        rb_C3109_7_DK = findViewById(R.id.rb_C3109_7_DK);
        rb_C3109_7_NR = findViewById(R.id.rb_C3109_7_NR);

        rb_C3109_8_1 = findViewById(R.id.rb_C3109_8_1);
        rb_C3109_8_2 = findViewById(R.id.rb_C3109_8_2);
        rb_C3109_8_DK = findViewById(R.id.rb_C3109_8_DK);
        rb_C3109_8_NR = findViewById(R.id.rb_C3109_8_NR);

        rb_C3109_9_1 = findViewById(R.id.rb_C3109_9_1);
        rb_C3109_9_2 = findViewById(R.id.rb_C3109_9_2);
        rb_C3109_9_DK = findViewById(R.id.rb_C3109_9_DK);
        rb_C3109_9_NR = findViewById(R.id.rb_C3109_9_NR);

        rb_C3109_10_1 = findViewById(R.id.rb_C3109_10_1);
        rb_C3109_10_2 = findViewById(R.id.rb_C3109_10_2);
        rb_C3109_10_DK = findViewById(R.id.rb_C3109_10_DK);
        rb_C3109_10_NR = findViewById(R.id.rb_C3109_10_NR);

        rb_C3109_11_1 = findViewById(R.id.rb_C3109_11_1);
        rb_C3109_11_2 = findViewById(R.id.rb_C3109_11_2);
        rb_C3109_11_DK = findViewById(R.id.rb_C3109_11_DK);
        rb_C3109_11_NR = findViewById(R.id.rb_C3109_11_NR);

        rb_C3109_12_1 = findViewById(R.id.rb_C3109_12_1);
        rb_C3109_12_2 = findViewById(R.id.rb_C3109_12_2);
        rb_C3109_12_DK = findViewById(R.id.rb_C3109_12_DK);
        rb_C3109_12_NR = findViewById(R.id.rb_C3109_12_NR);

        rb_C3109_13_1 = findViewById(R.id.rb_C3109_13_1);
        rb_C3109_13_2 = findViewById(R.id.rb_C3109_13_2);
        rb_C3109_13_DK = findViewById(R.id.rb_C3109_13_DK);
        rb_C3109_13_NR = findViewById(R.id.rb_C3109_13_NR);

        rb_C3109_14_1 = findViewById(R.id.rb_C3109_14_1);
        rb_C3109_14_2 = findViewById(R.id.rb_C3109_14_2);
        rb_C3109_14_DK = findViewById(R.id.rb_C3109_14_DK);
        rb_C3109_14_NR = findViewById(R.id.rb_C3109_14_NR);


        rb_C3110_1 = findViewById(R.id.rb_C3110_1);
        rb_C3110_2 = findViewById(R.id.rb_C3110_2);
        rb_C3110_DK = findViewById(R.id.rb_C3110_DK);


        rb_C3111_1 = findViewById(R.id.rb_C3111_1);
        rb_C3111_2 = findViewById(R.id.rb_C3111_2);
        rb_C3111_DK = findViewById(R.id.rb_C3111_DK);

        rb_C3111_1_1 = findViewById(R.id.rb_C3111_1_1);
        rb_C3111_1_2 = findViewById(R.id.rb_C3111_1_2);
        rb_C3111_1_DK = findViewById(R.id.rb_C3111_1_DK);

        rb_C3111_3_1 = findViewById(R.id.rb_C3111_3_1);
        rb_C3111_3_2 = findViewById(R.id.rb_C3111_3_2);
        rb_C3111_3_DK = findViewById(R.id.rb_C3111_3_DK);

        rb_C3111_5_1 = findViewById(R.id.rb_C3111_5_1);
        rb_C3111_5_2 = findViewById(R.id.rb_C3111_5_2);
        rb_C3111_5_DK = findViewById(R.id.rb_C3111_5_DK);

        rb_C3111_7_1 = findViewById(R.id.rb_C3111_7_1);
        rb_C3111_7_2 = findViewById(R.id.rb_C3111_7_2);
        rb_C3111_7_DK = findViewById(R.id.rb_C3111_7_DK);

        rb_C3111_8_1 = findViewById(R.id.rb_C3111_8_1);
        rb_C3111_8_2 = findViewById(R.id.rb_C3111_8_2);
        rb_C3111_8_DK = findViewById(R.id.rb_C3111_8_DK);

        rb_C3112_1 = findViewById(R.id.rb_C3112_1);
        rb_C3112_2 = findViewById(R.id.rb_C3112_2);
        rb_C3112_DK = findViewById(R.id.rb_C3112_DK);

        //EditText

        //ed_study_id     = (EditText) findViewById(R.id.eb_study_id);
        ed_C3105_OT = findViewById(R.id.ed_C3105_OT);
        ed_C3107_6_OT = findViewById(R.id.ed_C3107_6_OT);
        ed_C3107_21_OT = findViewById(R.id.ed_C3107_21_OT);
        ed_C3111_2 = findViewById(R.id.ed_C3111_2);
        ed_C3111_4 = findViewById(R.id.ed_C3111_4);
        ed_C3111_6 = findViewById(R.id.ed_C3111_6);
        ed_C3111_9 = findViewById(R.id.ed_C3111_9);
    }

    void events_call() {

        rb_C3104_1.setOnCheckedChangeListener(this);
        rb_C3104_2.setOnCheckedChangeListener(this);
        rb_C3104_DK.setOnCheckedChangeListener(this);

        rb_C3105_1.setOnCheckedChangeListener(this);
        rb_C3105_2.setOnCheckedChangeListener(this);
        rb_C3105_3.setOnCheckedChangeListener(this);
        rb_C3105_4.setOnCheckedChangeListener(this);
        rb_C3105_DK.setOnCheckedChangeListener(this);

        rb_C3107_6_1.setOnCheckedChangeListener(this);
        rb_C3107_6_2.setOnCheckedChangeListener(this);
        rb_C3107_6_DK.setOnCheckedChangeListener(this);

        rb_C3107_21_1.setOnCheckedChangeListener(this);
        rb_C3107_21_2.setOnCheckedChangeListener(this);
        rb_C3107_21_DK.setOnCheckedChangeListener(this);

        rb_C3108_1.setOnCheckedChangeListener(this);
        rb_C3108_2.setOnCheckedChangeListener(this);
        rb_C3108_3.setOnCheckedChangeListener(this);

        rb_C3111_1.setOnCheckedChangeListener(this);
        rb_C3111_2.setOnCheckedChangeListener(this);
        rb_C3111_DK.setOnCheckedChangeListener(this);

        rb_C3111_1_1.setOnCheckedChangeListener(this);
        rb_C3111_1_2.setOnCheckedChangeListener(this);
        rb_C3111_1_DK.setOnCheckedChangeListener(this);

        rb_C3111_3_1.setOnCheckedChangeListener(this);
        rb_C3111_3_2.setOnCheckedChangeListener(this);
        rb_C3111_3_DK.setOnCheckedChangeListener(this);

        rb_C3111_5_1.setOnCheckedChangeListener(this);
        rb_C3111_5_2.setOnCheckedChangeListener(this);
        rb_C3111_5_DK.setOnCheckedChangeListener(this);

        rb_C3111_8_1.setOnCheckedChangeListener(this);
        rb_C3111_8_2.setOnCheckedChangeListener(this);
        rb_C3111_8_DK.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.rb_C3104_1
                || compoundButton.getId() == R.id.rb_C3104_2
                || compoundButton.getId() == R.id.rb_C3104_DK
                || compoundButton.getId() == R.id.rb_C3104_RA) {

            if (rb_C3104_1.isChecked() && ageInDays > 330){

                ClearAllcontrol.ClearAll(ll_C3105);
                ll_C3105.setVisibility(View.GONE);

                ll_C3106.setVisibility(View.VISIBLE);

            } else if (rb_C3104_1.isChecked() && ageInDays < 330){

                ll_C3105.setVisibility(View.VISIBLE);
                ll_C3106.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3105);
                ClearAllcontrol.ClearAll(ll_C3106);

                ll_C3105.setVisibility(View.GONE);
                ll_C3106.setVisibility(View.GONE);
            }
        }



        if (compoundButton.getId() == R.id.rb_C3105_1
                || compoundButton.getId() == R.id.rb_C3105_2
                || compoundButton.getId() == R.id.rb_C3105_3
                || compoundButton.getId() == R.id.rb_C3105_4
                || compoundButton.getId() == R.id.rb_C3105_DK) {

            if (rb_C3105_3.isChecked() || rb_C3105_4.isChecked()) {

                ll_C3105_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3105_OT);
                ll_C3105_OT.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3107_6_1
                || compoundButton.getId() == R.id.rb_C3107_6_2
                || compoundButton.getId() == R.id.rb_C3107_6_DK) {

            if (rb_C3107_6_1.isChecked()) {

                ll_C3107_6_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3107_6_OT);
                ll_C3107_6_OT.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3107_21_1
                || compoundButton.getId() == R.id.rb_C3107_21_2
                || compoundButton.getId() == R.id.rb_C3107_21_DK) {

            if (rb_C3107_21_1.isChecked()) {

                ll_C3107_21_OT.setVisibility(View.VISIBLE);

            } else {

                ClearAllcontrol.ClearAll(ll_C3107_21_OT);
                ll_C3107_21_OT.setVisibility(View.GONE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3108_1
                || compoundButton.getId() == R.id.rb_C3108_2
                || compoundButton.getId() == R.id.rb_C3108_3) {

            if (rb_C3108_2.isChecked() || rb_C3108_3.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3109_1);
                ClearAllcontrol.ClearAll(ll_C3109_2);
                ClearAllcontrol.ClearAll(ll_C3109_3);
                ClearAllcontrol.ClearAll(ll_C3109_4);
                ClearAllcontrol.ClearAll(ll_C3109_5);
                ClearAllcontrol.ClearAll(ll_C3109_6);
                ClearAllcontrol.ClearAll(ll_C3109_7);
                ClearAllcontrol.ClearAll(ll_C3109_8);
                ClearAllcontrol.ClearAll(ll_C3109_9);
                ClearAllcontrol.ClearAll(ll_C3109_10);
                ClearAllcontrol.ClearAll(ll_C3109_11);
                ClearAllcontrol.ClearAll(ll_C3109_12);
                ClearAllcontrol.ClearAll(ll_C3109_13);
                ClearAllcontrol.ClearAll(ll_C3109_14);
                ClearAllcontrol.ClearAll(ll_C3110);

                ll_C3109_1.setVisibility(View.GONE);
                ll_C3109_2.setVisibility(View.GONE);
                ll_C3109_3.setVisibility(View.GONE);
                ll_C3109_4.setVisibility(View.GONE);
                ll_C3109_5.setVisibility(View.GONE);
                ll_C3109_6.setVisibility(View.GONE);
                ll_C3109_7.setVisibility(View.GONE);
                ll_C3109_8.setVisibility(View.GONE);
                ll_C3109_9.setVisibility(View.GONE);
                ll_C3109_10.setVisibility(View.GONE);
                ll_C3109_11.setVisibility(View.GONE);
                ll_C3109_12.setVisibility(View.GONE);
                ll_C3109_13.setVisibility(View.GONE);
                ll_C3109_14.setVisibility(View.GONE);
                ll_C3110.setVisibility(View.GONE);

                ll_C3108_A.setVisibility(View.GONE);
                btn_next.setEnabled(true);

            } else {

                ll_C3109_1.setVisibility(View.VISIBLE);
                ll_C3109_2.setVisibility(View.VISIBLE);
                ll_C3109_3.setVisibility(View.VISIBLE);
                ll_C3109_4.setVisibility(View.VISIBLE);
                ll_C3109_5.setVisibility(View.VISIBLE);
                ll_C3109_6.setVisibility(View.VISIBLE);
                ll_C3109_7.setVisibility(View.VISIBLE);
                ll_C3109_8.setVisibility(View.VISIBLE);
                ll_C3109_9.setVisibility(View.VISIBLE);
                ll_C3109_10.setVisibility(View.VISIBLE);
                ll_C3109_11.setVisibility(View.VISIBLE);
                ll_C3109_12.setVisibility(View.VISIBLE);
                ll_C3109_13.setVisibility(View.VISIBLE);
                ll_C3109_14.setVisibility(View.VISIBLE);
                ll_C3110.setVisibility(View.VISIBLE);

                ll_C3108_A.setVisibility(View.VISIBLE);
                txt_cap_count.setText("Picture not Attached");
                txt_cap_count.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                btn_next.setEnabled(false);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_1
                || compoundButton.getId() == R.id.rb_C3111_2
                || compoundButton.getId() == R.id.rb_C3111_DK) {

            if (rb_C3111_2.isChecked() || rb_C3111_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_1);
                ClearAllcontrol.ClearAll(ll_C3111_2);
                ClearAllcontrol.ClearAll(ll_C3111_3);
                ClearAllcontrol.ClearAll(ll_C3111_4);
                ClearAllcontrol.ClearAll(ll_C3111_5);
                ClearAllcontrol.ClearAll(ll_C3111_6);
                ClearAllcontrol.ClearAll(ll_C3111_7);
                ClearAllcontrol.ClearAll(ll_C3111_8);
                ClearAllcontrol.ClearAll(ll_C3111_9);

                ll_C3111_1.setVisibility(View.GONE);
                ll_C3111_2.setVisibility(View.GONE);
                ll_C3111_3.setVisibility(View.GONE);
                ll_C3111_4.setVisibility(View.GONE);
                ll_C3111_5.setVisibility(View.GONE);
                ll_C3111_6.setVisibility(View.GONE);
                ll_C3111_7.setVisibility(View.GONE);
                ll_C3111_8.setVisibility(View.GONE);
                ll_C3111_9.setVisibility(View.GONE);

            } else {

                ll_C3111_1.setVisibility(View.VISIBLE);
                ll_C3111_2.setVisibility(View.VISIBLE);
                ll_C3111_3.setVisibility(View.VISIBLE);
                ll_C3111_4.setVisibility(View.VISIBLE);
                ll_C3111_5.setVisibility(View.VISIBLE);
                ll_C3111_6.setVisibility(View.VISIBLE);
                ll_C3111_7.setVisibility(View.VISIBLE);
                ll_C3111_8.setVisibility(View.VISIBLE);
                ll_C3111_9.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_1_1
                || compoundButton.getId() == R.id.rb_C3111_1_2
                || compoundButton.getId() == R.id.rb_C3111_1_DK) {

            if (rb_C3111_1_2.isChecked() || rb_C3111_1_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_2);
                ll_C3111_2.setVisibility(View.GONE);

            } else {

                ll_C3111_2.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_3_1
                || compoundButton.getId() == R.id.rb_C3111_3_2
                || compoundButton.getId() == R.id.rb_C3111_3_DK) {

            if (rb_C3111_3_2.isChecked() || rb_C3111_3_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_4);
                ll_C3111_4.setVisibility(View.GONE);

            } else {

                ll_C3111_4.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_5_1
                || compoundButton.getId() == R.id.rb_C3111_5_2
                || compoundButton.getId() == R.id.rb_C3111_5_DK) {

            if (rb_C3111_5_2.isChecked() || rb_C3111_5_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_6);
                ll_C3111_6.setVisibility(View.GONE);

            } else {

                ll_C3111_6.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.rb_C3111_8_1
                || compoundButton.getId() == R.id.rb_C3111_8_2
                || compoundButton.getId() == R.id.rb_C3111_8_DK) {

            if (rb_C3111_8_2.isChecked() || rb_C3111_8_DK.isChecked()) {

                ClearAllcontrol.ClearAll(ll_C3111_9);
                ll_C3111_9.setVisibility(View.GONE);

            } else {

                ll_C3111_9.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        // No Such Other
    }

    void value_assignment() {

        C3101 = "-1";
        C3102 = "-1";
        C3103 = "-1";
        C3104 = "-1";
        C3105 = "-1";
        C3105_OT = "-1";
        C3106 = "-1";
        C3107_1 = "-1";
        C3107_2 = "-1";
        C3107_3 = "-1";
        C3107_4 = "-1";
        C3107_5 = "-1";
        C3107_6 = "-1";
        C3107_6_OT = "-1";
        C3107_7 = "-1";
        C3107_8 = "-1";
        C3107_9 = "-1";
        C3107_10 = "-1";
        C3107_11 = "-1";
        C3107_12 = "-1";
        C3107_13 = "-1";
        C3107_14 = "-1";
        C3107_15 = "-1";
        C3107_16 = "-1";
        C3107_17 = "-1";
        C3107_18 = "-1";
        C3107_19 = "-1";
        C3107_20 = "-1";
        C3107_21 = "-1";
        C3107_21_OT = "-1";
        C3108 = "-1";
        C3109_1 = "-1";
        C3109_2 = "-1";
        C3109_3 = "-1";
        C3109_4 = "-1";
        C3109_5 = "-1";
        C3109_6 = "-1";
        C3109_7 = "-1";
        C3109_8 = "-1";
        C3109_9 = "-1";
        C3109_10 = "-1";
        C3109_11 = "-1";
        C3109_12 = "-1";
        C3109_13 = "-1";
        C3109_14 = "-1";
        C3110 = "-1";
        C3111 = "-1";
        C3111_1 = "-1";
        C3111_2 = "-1";
        C3111_3 = "-1";
        C3111_4 = "-1";
        C3111_5 = "-1";
        C3111_6 = "-1";
        C3111_7 = "-1";
        C3111_8 = "-1";
        C3111_9 = "-1";
        C3112 = "-1";
        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        if (rb_C3101_1.isChecked()) {
            C3101 = "1";
        } else if (rb_C3101_2.isChecked()) {
            C3101 = "2";
        } else if (rb_C3101_3.isChecked()) {
            C3101 = "3";
        } else if (rb_C3101_DK.isChecked()) {
            C3101 = "9";
        }


        if (rb_C3102_1.isChecked()) {
            C3102 = "1";
        } else if (rb_C3102_2.isChecked()) {
            C3102 = "2";
        } else if (rb_C3102_3.isChecked()) {
            C3102 = "3";
        } else if (rb_C3102_DK.isChecked()) {
            C3102 = "9";
        }


        if (rb_C3103_1.isChecked()) {
            C3103 = "1";
        } else if (rb_C3103_2.isChecked()) {
            C3103 = "2";
        } else if (rb_C3103_DK.isChecked()) {
            C3103 = "9";
        }else if (rb_C3103_RA.isChecked()) {
            C3103 = "8";
        }


        if (rb_C3104_1.isChecked()) {
            C3104 = "1";
        } else if (rb_C3104_2.isChecked()) {
            C3104 = "2";
        } else if (rb_C3104_DK.isChecked()) {
            C3104 = "9";
        }else if (rb_C3104_RA.isChecked()) {
            C3104 = "8";
        }


        if (rb_C3105_1.isChecked()) {
            C3105 = "1";
        } else if (rb_C3105_2.isChecked()) {
            C3105 = "2";
        } else if (rb_C3105_3.isChecked()) {
            C3105 = "3";
            C3105_OT = ed_C3105_OT.getText().toString().trim();
        } else if (rb_C3105_4.isChecked()) {
            C3105 = "4";
            C3105_OT = ed_C3105_OT.getText().toString().trim();
        } else if (rb_C3105_DK.isChecked()) {
            C3105 = "9";
        }

        if (rb_C3106_1.isChecked() && ed_C3107_6_OT.getText().toString().trim().length() > 0) {
            C3106 = "1";
            C3107_6_OT = ed_C3107_21_OT.getText().toString().trim();
        } else if (rb_C3106_2.isChecked()) {
            C3106 = "2";
        } else if (rb_C3106_DK.isChecked()) {
            C3106 = "9";
        }

        if (rb_C3107_1_1.isChecked()) {
            C3107_1 = "1";
        } else if (rb_C3107_1_2.isChecked()) {
            C3107_1 = "2";
        } else if (rb_C3107_1_DK.isChecked()) {
            C3107_1 = "9";
        }

        if (rb_C3107_2_1.isChecked()) {
            C3107_2 = "1";
        } else if (rb_C3107_2_2.isChecked()) {
            C3107_2 = "2";
        } else if (rb_C3107_2_DK.isChecked()) {
            C3107_2 = "9";
        }

        if (rb_C3107_3_1.isChecked()) {
            C3107_3 = "1";
        } else if (rb_C3107_3_2.isChecked()) {
            C3107_3 = "2";
        } else if (rb_C3107_3_DK.isChecked()) {
            C3107_3 = "9";
        }

        if (rb_C3107_4_1.isChecked()) {
            C3107_4 = "1";
        } else if (rb_C3107_4_2.isChecked()) {
            C3107_4 = "2";
        } else if (rb_C3107_4_DK.isChecked()) {
            C3107_4 = "9";
        }

        if (rb_C3107_5_1.isChecked()) {
            C3107_5 = "1";
        } else if (rb_C3107_5_2.isChecked()) {
            C3107_5 = "2";
        } else if (rb_C3107_5_DK.isChecked()) {
            C3107_5 = "9";
        }

        if (rb_C3107_6_1.isChecked()) {
            C3107_6 = "1";
        } else if (rb_C3107_6_2.isChecked()) {
            C3107_6 = "2";
        } else if (rb_C3107_6_DK.isChecked()) {
            C3107_6 = "9";
        }

        if (rb_C3107_7_1.isChecked()) {
            C3107_7 = "1";
        } else if (rb_C3107_7_2.isChecked()) {
            C3107_7 = "2";
        } else if (rb_C3107_7_DK.isChecked()) {
            C3107_7 = "9";
        }

        if (rb_C3107_8_1.isChecked()) {
            C3107_8 = "1";
        } else if (rb_C3107_8_2.isChecked()) {
            C3107_8 = "2";
        } else if (rb_C3107_8_DK.isChecked()) {
            C3107_8 = "9";
        }

        if (rb_C3107_9_1.isChecked()) {
            C3107_9 = "1";
        } else if (rb_C3107_9_2.isChecked()) {
            C3107_9 = "2";
        } else if (rb_C3107_9_DK.isChecked()) {
            C3107_9 = "9";
        }

        if (rb_C3107_10_1.isChecked()) {
            C3107_10 = "1";
        } else if (rb_C3107_10_2.isChecked()) {
            C3107_10 = "2";
        } else if (rb_C3107_10_DK.isChecked()) {
            C3107_10 = "9";
        }

        if (rb_C3107_11_1.isChecked()) {
            C3107_11 = "1";
        } else if (rb_C3107_11_2.isChecked()) {
            C3107_11 = "2";
        } else if (rb_C3107_11_DK.isChecked()) {
            C3107_11 = "9";
        }

        if (rb_C3107_12_1.isChecked()) {
            C3107_12 = "1";
        } else if (rb_C3107_12_2.isChecked()) {
            C3107_12 = "2";
        } else if (rb_C3107_12_DK.isChecked()) {
            C3107_12 = "9";
        }

        if (rb_C3107_13_1.isChecked()) {
            C3107_13 = "1";
        } else if (rb_C3107_13_2.isChecked()) {
            C3107_13 = "2";
        } else if (rb_C3107_13_DK.isChecked()) {
            C3107_13 = "9";
        }

        if (rb_C3107_14_1.isChecked()) {
            C3107_14 = "1";
        } else if (rb_C3107_14_2.isChecked()) {
            C3107_14 = "2";
        } else if (rb_C3107_14_DK.isChecked()) {
            C3107_14 = "9";
        }

        if (rb_C3107_15_1.isChecked()) {
            C3107_15 = "1";
        } else if (rb_C3107_15_2.isChecked()) {
            C3107_15 = "2";
        } else if (rb_C3107_15_DK.isChecked()) {
            C3107_15 = "9";
        }

        if (rb_C3107_16_1.isChecked()) {
            C3107_16 = "1";
        } else if (rb_C3107_16_2.isChecked()) {
            C3107_16 = "2";
        } else if (rb_C3107_16_DK.isChecked()) {
            C3107_16 = "9";
        }

        if (rb_C3107_17_1.isChecked()) {
            C3107_17 = "1";
        } else if (rb_C3107_17_2.isChecked()) {
            C3107_17 = "2";
        } else if (rb_C3107_17_DK.isChecked()) {
            C3107_17 = "9";
        }

        if (rb_C3107_18_1.isChecked()) {
            C3107_18 = "1";
        } else if (rb_C3107_18_2.isChecked()) {
            C3107_18 = "2";
        } else if (rb_C3107_18_DK.isChecked()) {
            C3107_18 = "9";
        }

        if (rb_C3107_19_1.isChecked()) {
            C3107_19 = "1";
        } else if (rb_C3107_19_2.isChecked()) {
            C3107_19 = "2";
        } else if (rb_C3107_19_DK.isChecked()) {
            C3107_19 = "9";
        }

        if (rb_C3107_20_1.isChecked()) {
            C3107_20 = "1";
        } else if (rb_C3107_20_2.isChecked()) {
            C3107_20 = "2";
        } else if (rb_C3107_20_DK.isChecked()) {
            C3107_20 = "9";
        }

        if (rb_C3107_21_1.isChecked() && ed_C3107_21_OT.getText().toString().trim().length() > 0) {
            C3107_21 = "1";
            C3107_21_OT = ed_C3107_21_OT.getText().toString().trim();
        } else if (rb_C3107_21_2.isChecked()) {
            C3107_21 = "2";
        } else if (rb_C3107_21_DK.isChecked()) {
            C3107_21 = "9";
        }


        if (rb_C3108_1.isChecked()) {
            C3108 = "1";
        } else if (rb_C3108_2.isChecked()) {
            C3108 = "2";
        } else if (rb_C3108_3.isChecked()) {
            C3108 = "3";
        }


        if (rb_C3109_1_1.isChecked()) {
            C3109_1 = "1";
        } else if (rb_C3109_1_2.isChecked()) {
            C3109_1 = "2";
        } else if (rb_C3109_1_NR.isChecked()) {
            C3109_1 = "3";
        } else if (rb_C3109_1_DK.isChecked()) {
            C3109_1 = "9";
        }

        if (rb_C3109_2_1.isChecked()) {
            C3109_2 = "1";
        } else if (rb_C3109_2_2.isChecked()) {
            C3109_2 = "2";
        } else if (rb_C3109_2_NR.isChecked()) {
            C3109_2 = "3";
        } else if (rb_C3109_2_DK.isChecked()) {
            C3109_2 = "9";
        }

        if (rb_C3109_3_1.isChecked()) {
            C3109_3 = "1";
        } else if (rb_C3109_3_2.isChecked()) {
            C3109_3 = "2";
        } else if (rb_C3109_3_NR.isChecked()) {
            C3109_3 = "3";
        } else if (rb_C3109_3_DK.isChecked()) {
            C3109_3 = "9";
        }

        if (rb_C3109_4_1.isChecked()) {
            C3109_4 = "1";
        } else if (rb_C3109_4_2.isChecked()) {
            C3109_4 = "2";
        } else if (rb_C3109_4_NR.isChecked()) {
            C3109_4 = "3";
        } else if (rb_C3109_4_DK.isChecked()) {
            C3109_4 = "9";
        }

        if (rb_C3109_5_1.isChecked()) {
            C3109_5 = "1";
        } else if (rb_C3109_5_2.isChecked()) {
            C3109_5 = "2";
        } else if (rb_C3109_5_NR.isChecked()) {
            C3109_5 = "3";
        } else if (rb_C3109_5_DK.isChecked()) {
            C3109_5 = "9";
        }

        if (rb_C3109_6_1.isChecked()) {
            C3109_6 = "1";
        } else if (rb_C3109_6_2.isChecked()) {
            C3109_6 = "2";
        } else if (rb_C3109_6_NR.isChecked()) {
            C3109_6 = "3";
        } else if (rb_C3109_6_DK.isChecked()) {
            C3109_6 = "9";
        }

        if (rb_C3109_7_1.isChecked()) {
            C3109_7 = "1";
        } else if (rb_C3109_7_2.isChecked()) {
            C3109_7 = "2";
        } else if (rb_C3109_7_NR.isChecked()) {
            C3109_7 = "3";
        } else if (rb_C3109_7_DK.isChecked()) {
            C3109_7 = "9";
        }

        if (rb_C3109_8_1.isChecked()) {
            C3109_8 = "1";
        } else if (rb_C3109_8_2.isChecked()) {
            C3109_8 = "2";
        } else if (rb_C3109_8_NR.isChecked()) {
            C3109_8 = "3";
        } else if (rb_C3109_8_DK.isChecked()) {
            C3109_8 = "9";
        }

        if (rb_C3109_9_1.isChecked()) {
            C3109_9 = "1";
        } else if (rb_C3109_9_2.isChecked()) {
            C3109_9 = "2";
        } else if (rb_C3109_9_NR.isChecked()) {
            C3109_9 = "3";
        } else if (rb_C3109_9_DK.isChecked()) {
            C3109_9 = "9";
        }

        if (rb_C3109_10_1.isChecked()) {
            C3109_10 = "1";
        } else if (rb_C3109_10_2.isChecked()) {
            C3109_10 = "2";
        } else if (rb_C3109_10_NR.isChecked()) {
            C3109_10 = "3";
        } else if (rb_C3109_10_DK.isChecked()) {
            C3109_10 = "9";
        }

        if (rb_C3109_11_1.isChecked()) {
            C3109_11 = "1";
        } else if (rb_C3109_11_2.isChecked()) {
            C3109_11 = "2";
        } else if (rb_C3109_11_NR.isChecked()) {
            C3109_11 = "3";
        } else if (rb_C3109_11_DK.isChecked()) {
            C3109_11 = "9";
        }

        if (rb_C3109_12_1.isChecked()) {
            C3109_12 = "1";
        } else if (rb_C3109_12_2.isChecked()) {
            C3109_12 = "2";
        } else if (rb_C3109_12_NR.isChecked()) {
            C3109_12 = "3";
        } else if (rb_C3109_12_DK.isChecked()) {
            C3109_12 = "9";
        }

        if (rb_C3109_13_1.isChecked()) {
            C3109_13 = "1";
        } else if (rb_C3109_13_2.isChecked()) {
            C3109_13 = "2";
        } else if (rb_C3109_13_NR.isChecked()) {
            C3109_13 = "3";
        } else if (rb_C3109_13_DK.isChecked()) {
            C3109_13 = "9";
        }

        if (rb_C3109_14_1.isChecked()) {
            C3109_14 = "1";
        } else if (rb_C3109_14_2.isChecked()) {
            C3109_14 = "2";
        } else if (rb_C3109_14_NR.isChecked()) {
            C3109_14 = "3";
        } else if (rb_C3109_14_DK.isChecked()) {
            C3109_14 = "9";
        }


        if (rb_C3110_1.isChecked()) {
            C3110 = "1";
        } else if (rb_C3110_2.isChecked()) {
            C3110 = "2";
        } else if (rb_C3110_DK.isChecked()) {
            C3110 = "9";
        }


        if (rb_C3111_1.isChecked()) {
            C3111 = "1";
        } else if (rb_C3111_2.isChecked()) {
            C3111 = "2";
        } else if (rb_C3111_DK.isChecked()) {
            C3111 = "9";
        }


        if (rb_C3111_1_1.isChecked()) {
            C3111_1 = "1";
        } else if (rb_C3111_1_2.isChecked()) {
            C3111_1 = "2";
        } else if (rb_C3111_1_DK.isChecked()) {
            C3111_1 = "9";
        }

        if (ed_C3111_2.getText().toString().trim().length() > 0) {
            C3111_2 = ed_C3111_2.getText().toString().trim();
        }

        if (rb_C3111_3_1.isChecked()) {
            C3111_3 = "1";
        } else if (rb_C3111_3_2.isChecked()) {
            C3111_3 = "2";
        } else if (rb_C3111_3_DK.isChecked()) {
            C3111_3 = "9";
        }

        if (ed_C3111_4.getText().toString().trim().length() > 0) {
            C3111_4 = ed_C3111_4.getText().toString().trim();
        }

        if (rb_C3111_5_1.isChecked()) {
            C3111_5 = "1";
        } else if (rb_C3111_5_2.isChecked()) {
            C3111_5 = "2";
        } else if (rb_C3111_5_DK.isChecked()) {
            C3111_5 = "9";
        }

        if (ed_C3111_6.getText().toString().trim().length() > 0) {
            C3111_6 = ed_C3111_6.getText().toString().trim();
        }

        if (rb_C3111_7_1.isChecked()) {
            C3111_7 = "1";
        } else if (rb_C3111_7_2.isChecked()) {
            C3111_7 = "2";
        } else if (rb_C3111_7_DK.isChecked()) {
            C3111_7 = "9";
        }

        if (rb_C3111_8_1.isChecked()) {
            C3111_8 = "1";
        } else if (rb_C3111_8_2.isChecked()) {
            C3111_8 = "2";
        } else if (rb_C3111_8_DK.isChecked()) {
            C3111_8 = "9";
        }

        if (ed_C3111_9.getText().toString().trim().length() > 0) {
            C3111_9 = ed_C3111_9.getText().toString().trim();
        }


        if (rb_C3112_1.isChecked()) {
            C3112 = "1";
        } else if (rb_C3112_2.isChecked()) {
            C3112 = "2";
        } else if (rb_C3112_DK.isChecked()) {
            C3112 = "9";
        }
    }

    void insert_data() {
        String query = "insert into C3101_C3112("
                + Global.C.C3101_C3112.study_id + ","
                + Global.C.C3101_C3112.C3101 + ","
                + Global.C.C3101_C3112.C3102 + ","
                + Global.C.C3101_C3112.C3103 + ","
                + Global.C.C3101_C3112.C3104 + ","
                + Global.C.C3101_C3112.C3105 + ","
                + Global.C.C3101_C3112.C3105_OT + ","
                + Global.C.C3101_C3112.C3106 + ","
                + Global.C.C3101_C3112.C3107_1 + ","
                + Global.C.C3101_C3112.C3107_2 + ","
                + Global.C.C3101_C3112.C3107_3 + ","
                + Global.C.C3101_C3112.C3107_4 + ","
                + Global.C.C3101_C3112.C3107_5 + ","
                + Global.C.C3101_C3112.C3107_6 + ","
                + Global.C.C3101_C3112.C3107_6_OT + ","
                + Global.C.C3101_C3112.C3107_7 + ","
                + Global.C.C3101_C3112.C3107_8 + ","
                + Global.C.C3101_C3112.C3107_9 + ","
                + Global.C.C3101_C3112.C3107_10 + ","
                + Global.C.C3101_C3112.C3107_11 + ","
                + Global.C.C3101_C3112.C3107_12 + ","
                + Global.C.C3101_C3112.C3107_13 + ","
                + Global.C.C3101_C3112.C3107_14 + ","
                + Global.C.C3101_C3112.C3107_15 + ","
                + Global.C.C3101_C3112.C3107_16 + ","
                + Global.C.C3101_C3112.C3107_17 + ","
                + Global.C.C3101_C3112.C3107_18 + ","
                + Global.C.C3101_C3112.C3107_19 + ","
                + Global.C.C3101_C3112.C3107_20 + ","
                + Global.C.C3101_C3112.C3107_21 + ","
                + Global.C.C3101_C3112.C3107_21_OT + ","
                + Global.C.C3101_C3112.C3108 + ","
                + Global.C.C3101_C3112.C3109_1 + ","
                + Global.C.C3101_C3112.C3109_2 + ","
                + Global.C.C3101_C3112.C3109_3 + ","
                + Global.C.C3101_C3112.C3109_4 + ","
                + Global.C.C3101_C3112.C3109_5 + ","
                + Global.C.C3101_C3112.C3109_6 + ","
                + Global.C.C3101_C3112.C3109_7 + ","
                + Global.C.C3101_C3112.C3109_8 + ","
                + Global.C.C3101_C3112.C3109_9 + ","
                + Global.C.C3101_C3112.C3109_10 + ","
                + Global.C.C3101_C3112.C3109_11 + ","
                + Global.C.C3101_C3112.C3109_12 + ","
                + Global.C.C3101_C3112.C3109_13 + ","
                + Global.C.C3101_C3112.C3109_14 + ","
                + Global.C.C3101_C3112.C3110 + ","
                + Global.C.C3101_C3112.C3111 + ","
                + Global.C.C3101_C3112.C3111_1 + ","
                + Global.C.C3101_C3112.C3111_2 + ","
                + Global.C.C3101_C3112.C3111_3 + ","
                + Global.C.C3101_C3112.C3111_4 + ","
                + Global.C.C3101_C3112.C3111_5 + ","
                + Global.C.C3101_C3112.C3111_6 + ","
                + Global.C.C3101_C3112.C3111_7 + ","
                + Global.C.C3101_C3112.C3111_8 + ","
                + Global.C.C3101_C3112.C3111_9 + ","
                + Global.C.C3101_C3112.C3112 + ","
                + Global.C.C3101_C3112.STATUS + ") values ('" +
                study_id + "','" +
                C3101 + "','" +
                C3102 + "','" +
                C3103 + "','" +
                C3104 + "','" +
                C3105 + "','" +
                C3105_OT + "','" +
                C3106 + "','" +
                C3107_1 + "','" +
                C3107_2 + "','" +
                C3107_3 + "','" +
                C3107_4 + "','" +
                C3107_5 + "','" +
                C3107_6 + "','" +
                C3107_6_OT + "','" +
                C3107_7 + "','" +
                C3107_8 + "','" +
                C3107_9 + "','" +
                C3107_10 + "','" +
                C3107_11 + "','" +
                C3107_12 + "','" +
                C3107_13 + "','" +
                C3107_14 + "','" +
                C3107_15 + "','" +
                C3107_16 + "','" +
                C3107_17 + "','" +
                C3107_18 + "','" +
                C3107_19 + "','" +
                C3107_20 + "','" +
                C3107_21 + "','" +
                C3107_21_OT + "','" +
                C3108 + "','" +
                C3109_1 + "','" +
                C3109_2 + "','" +
                C3109_3 + "','" +
                C3109_4 + "','" +
                C3109_5 + "','" +
                C3109_6 + "','" +
                C3109_7 + "','" +
                C3109_8 + "','" +
                C3109_9 + "','" +
                C3109_10 + "','" +
                C3109_11 + "','" +
                C3109_12 + "','" +
                C3109_13 + "','" +
                C3109_14 + "','" +
                C3110 + "','" +
                C3111 + "','" +
                C3111_1 + "','" +
                C3111_2 + "','" +
                C3111_3 + "','" +
                C3111_4 + "','" +
                C3111_5 + "','" +
                C3111_6 + "','" +
                C3111_7 + "','" +
                C3111_8 + "','" +
                C3111_9 + "','" +
                C3112 + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 7: Preventive care of children", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3101) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3102) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3103) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3104) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_1) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_2) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_3) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_4) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_5) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_6) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_7) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_8) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_9) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_10) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_11) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_12) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_13) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_14) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_15) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_16) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_17) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_18) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_19) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_20) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3107_21) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3108) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3111) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_C3112) != false;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 5);
    }

}
