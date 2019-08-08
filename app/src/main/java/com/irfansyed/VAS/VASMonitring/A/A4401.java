package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import java.io.File;

import data.LocalDataManager;
import utils.Gothrough;

import static utils.ClearAllcontrol.ClearAll;

public class A4401 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    private static final int CONTENT_REQUEST = 1337;

    //  Region_Declaration

    Button
            btn_next14,
            btn_imgCapture;

    LinearLayout
            cvstudy_id,
            cvA4401,
            cvA4402,
            cvA4403,
            cvA4404,
            cvA4405,
            cv51_52_53,
            cvA44511,
            cvA44512,
            cvA44513,
            cvA44514,
            cvA44515,
            cvA44516,
            cvA44517,
            cvA44518,
            cvA44519,
            cvA445110,
            cvA445111,
            cvA445112,
            cvA445113,
            cvA44521,
            cvA44522,
            cvA44523,
            cvA44524,
            cvA44525,
            cvA44526,
            cvA44527,
            cvA44528,
            cvA44529,
            cvA44531,
            cvA44532,
            cvA44533,
            cvA44534,
            cvA44535,
            cvA44536,
            cvA44537,
            cvA44538,
            cvA44539,
            cvA445310,
            cvA445311,
            cvA445312,
            cvA4454,
            cvA4455,
            cvA4456,
            cvA4457,
            cvA4471,
            cvA4472,
            cvA4473;

    RadioButton
            A4401_1,
            A4401_2,
            A440198,
            A4402_1,
            A4402_2,
            A4402_3,
            A4402_4,
            A4402_5,
            A440298,
            A44511_1,
            A44511_2,
            A4451198,
            A44512_1,
            A44512_2,
            A4451298,
            A44513_1,
            A44513_2,
            A4451398,
            A44514_1,
            A44514_2,
            A4451498,
            A44515_1,
            A44515_2,
            A4451598,
            A44516_1,
            A44516_2,
            A4451698,
            A44517_1,
            A44517_2,
            A4451798,
            A44518_1,
            A44518_2,
            A4451898,
            A44519_1,
            A44519_2,
            A4451998,
            A445110_1,
            A445110_2,
            A44511098,
            A445111_1,
            A445111_2,
            A44511198,

    A445112_1,
            A445112_2,
            A44511298,

    A445113_1,
            A445113_2,
            A44511398,

    A44521_1,
            A44521_2,
            A4452198,

    A44522_1,
            A44522_2,
            A4452298,

    A44523_1,
            A44523_2,
            A4452398,

    A44524_1,
            A44524_2,
            A4452498,

    A44525_1,
            A44525_2,
            A4452598,

    A44526_1,
            A44526_2,
            A4452698,

    A44527_1,
            A44527_2,
            A4452798,

    A44528_1,
            A44528_2,
            A4452898,

    A44529_1,
            A44529_2,
            A4452998,

    A44531_1,
            A44531_2,
            A4453198,

    A44532_1,
            A44532_2,
            A4453298,

    A44533_1,
            A44533_2,
            A4453398,

    A44534_1,
            A44534_2,
            A4453498,

    A44535_1,
            A44535_2,
            A4453598,

    A44536_1,
            A44536_2,
            A4453698,

    A44537_1,
            A44537_2,
            A4453798,

    A44538_1,
            A44538_2,
            A4453898,

    A44539_1,
            A44539_2,
            A4453998,

    A445310_1,
            A445310_2,
            A44531098,

    A445311_1,
            A445311_2,
            A44531198,

    A445312_1,
            A445312_2,
            A44531298,

    A4454_1,
            A4454_2,
            A445498,
            A445499,

    A4455_1,
            A4455_2,
            A445598,
            A445599,

    A4456_1,
            A4456_2,
            A445698,
            A445699,

    A4457_1,
            A4457_2,
            A445798,
            A445799;

    EditText
            study_id,
            A4402_5,
            A4403_province,
            A4403_district,
            A4404_years,
            A4405_hours,
            A4405_minutes,
            A445113,
            A44529,
            A445312,
            A4471,
            A4473;

    CheckBox
            A4472_1,
            A4472_2,
            A4472_3,
            A4472_4,
            A4472_5,
            A4472_6,
            A4472_7,
            A4472_8,
            A4472_9,
            A4472_10,
            A4472_11,
            A4472_12,
            A447298;

    String
            study_id,
            A4401,
            A4402,
            A4403,
            A4402_5_OT,
            A4403_province,
            A4403_district,
            A4404_years,
            A4405_hours,
            A4405_minutes,
            A44511,
            A44512,
            A44513,
            A44514,
            A44515,
            A44516,
            A44517,
            A44518,
            A44519,
            A445110,
            A445111,
            A445112,
            A445113,
            A445113_OT,
            A4451code,
            A44521,
            A44522,
            A44523,
            A44524,
            A44525,
            A44526,
            A44527,
            A44528,
            A44529,
            A44529_OT,
            A4452code,
            A44531,
            A44532,
            A44533,
            A44534,
            A44535,
            A44536,
            A44537,
            A44538,
            A44539,
            A445310,
            A445311,
            A445312,
            A445312_OT,
            A4453code,
            A4454,
            A4455,
            A4456,
            A4457,
            A4471,
            A4472_1,
            A4472_2,
            A4472_3,
            A4472_4,
            A4472_5,
            A4472_6,
            A4472_7,
            A4472_8,
            A4472_9,
            A4472_10,
            A4472_11,
            A4472_12,
            A447298,
            A4473,
            STATUS;

    // End Region_Declaration
    TextView
            txt_cap_count;
    int count = 1;
    private File output = null;

    void Initialization() {

        btn_next14 = findViewById(R.id.btn_next14);
        btn_imgCapture = findViewById(R.id.btn_imgCapture);
        txt_cap_count = findViewById(R.id.txt_cap_count);

        cvA4401 = findViewById(R.id.cvA4401);
        cv51_52_53 = findViewById(R.id.cv51_52_53);
        cvA4402 = findViewById(R.id.cvA4402);
        cvA4403 = findViewById(R.id.cvA4403);
        cvA4404 = findViewById(R.id.cvA4404);
        cvA4405 = findViewById(R.id.cvA4405);
        cvA44511 = findViewById(R.id.cvA44511);
        cvA44512 = findViewById(R.id.cvA44512);
        cvA44513 = findViewById(R.id.cvA44513);
        cvA44514 = findViewById(R.id.cvA44514);
        cvA44515 = findViewById(R.id.cvA44515);
        cvA44516 = findViewById(R.id.cvA44516);
        cvA44517 = findViewById(R.id.cvA44517);
        cvA44518 = findViewById(R.id.cvA44518);
        cvA44519 = findViewById(R.id.cvA44519);
        cvA445110 = findViewById(R.id.cvA445110);
        cvA445111 = findViewById(R.id.cvA445111);
        cvA445112 = findViewById(R.id.cvA445112);
        cvA445113 = findViewById(R.id.cvA445113);
        cvA44521 = findViewById(R.id.cvA44521);
        cvA44522 = findViewById(R.id.cvA44522);
        cvA44523 = findViewById(R.id.cvA44523);
        cvA44524 = findViewById(R.id.cvA44524);
        cvA44525 = findViewById(R.id.cvA44525);
        cvA44526 = findViewById(R.id.cvA44526);
        cvA44527 = findViewById(R.id.cvA44527);
        cvA44528 = findViewById(R.id.cvA44528);
        cvA44529 = findViewById(R.id.cvA44529);
        cvA44531 = findViewById(R.id.cvA44531);
        cvA44532 = findViewById(R.id.cvA44532);
        cvA44533 = findViewById(R.id.cvA44533);
        cvA44534 = findViewById(R.id.cvA44534);
        cvA44535 = findViewById(R.id.cvA44535);
        cvA44536 = findViewById(R.id.cvA44536);
        cvA44537 = findViewById(R.id.cvA44537);
        cvA44538 = findViewById(R.id.cvA44538);
        cvA44539 = findViewById(R.id.cvA44539);
        cvA445310 = findViewById(R.id.cvA445310);
        cvA445311 = findViewById(R.id.cvA445311);
        cvA445312 = findViewById(R.id.cvA445312);
        cvA4454 = findViewById(R.id.cvA4454);
        cvA4455 = findViewById(R.id.cvA4455);
        cvA4456 = findViewById(R.id.cvA4456);
        cvA4457 = findViewById(R.id.cvA4457);
        cvA4471 = findViewById(R.id.cvA4471);
        cvA4472 = findViewById(R.id.cvA4472);
        cvA4473 = findViewById(R.id.cvA4473);

        A4401_1 = findViewById(R.id.A4401_1);
        A4401_2 = findViewById(R.id.A4401_2);
        A440198 = findViewById(R.id.A440198);

        A4402_1 = findViewById(R.id.A4402_1);
        A4402_2 = findViewById(R.id.A4402_2);
        A4402_3 = findViewById(R.id.A4402_3);
        A4402_4 = findViewById(R.id.A4402_4);
        A4402_5 = findViewById(R.id.A4402_5);
        A440298 = findViewById(R.id.A440298);

        A44511_1 = findViewById(R.id.A44511_1);
        A44511_2 = findViewById(R.id.A44511_2);
        A4451198 = findViewById(R.id.A4451198);

        A44512_1 = findViewById(R.id.A44512_1);
        A44512_2 = findViewById(R.id.A44512_2);
        A4451298 = findViewById(R.id.A4451298);

        A44513_1 = findViewById(R.id.A44513_1);
        A44513_2 = findViewById(R.id.A44513_2);
        A4451398 = findViewById(R.id.A4451398);

        A44514_1 = findViewById(R.id.A44514_1);
        A44514_2 = findViewById(R.id.A44514_2);
        A4451498 = findViewById(R.id.A4451498);

        A44515_1 = findViewById(R.id.A44515_1);
        A44515_2 = findViewById(R.id.A44515_2);
        A4451598 = findViewById(R.id.A4451598);

        A44516_1 = findViewById(R.id.A44516_1);
        A44516_2 = findViewById(R.id.A44516_2);
        A4451698 = findViewById(R.id.A4451698);

        A44517_1 = findViewById(R.id.A44517_1);
        A44517_2 = findViewById(R.id.A44517_2);
        A4451798 = findViewById(R.id.A4451798);

        A44518_1 = findViewById(R.id.A44518_1);
        A44518_2 = findViewById(R.id.A44518_2);
        A4451898 = findViewById(R.id.A4451898);

        A44519_1 = findViewById(R.id.A44519_1);
        A44519_2 = findViewById(R.id.A44519_2);
        A4451998 = findViewById(R.id.A4451998);

        A445110_1 = findViewById(R.id.A445110_1);
        A445110_2 = findViewById(R.id.A445110_2);
        A44511098 = findViewById(R.id.A44511098);

        A445111_1 = findViewById(R.id.A445111_1);
        A445111_2 = findViewById(R.id.A445111_2);
        A44511198 = findViewById(R.id.A44511198);

        A445112_1 = findViewById(R.id.A445112_1);
        A445112_2 = findViewById(R.id.A445112_2);
        A44511298 = findViewById(R.id.A44511298);

        A445113_1 = findViewById(R.id.A445113_1);
        A445113_2 = findViewById(R.id.A445113_2);
        A44511398 = findViewById(R.id.A44511398);

        A44521_1 = findViewById(R.id.A44521_1);
        A44521_2 = findViewById(R.id.A44521_2);
        A4452198 = findViewById(R.id.A4452198);

        A44522_1 = findViewById(R.id.A44522_1);
        A44522_2 = findViewById(R.id.A44522_2);
        A4452298 = findViewById(R.id.A4452298);

        A44523_1 = findViewById(R.id.A44523_1);
        A44523_2 = findViewById(R.id.A44523_2);
        A4452398 = findViewById(R.id.A4452398);

        A44524_1 = findViewById(R.id.A44524_1);
        A44524_2 = findViewById(R.id.A44524_2);
        A4452498 = findViewById(R.id.A4452498);

        A44525_1 = findViewById(R.id.A44525_1);
        A44525_2 = findViewById(R.id.A44525_2);
        A4452598 = findViewById(R.id.A4452598);

        A44526_1 = findViewById(R.id.A44526_1);
        A44526_2 = findViewById(R.id.A44526_2);
        A4452698 = findViewById(R.id.A4452698);

        A44527_1 = findViewById(R.id.A44527_1);
        A44527_2 = findViewById(R.id.A44527_2);
        A4452798 = findViewById(R.id.A4452798);

        A44528_1 = findViewById(R.id.A44528_1);
        A44528_2 = findViewById(R.id.A44528_2);
        A4452898 = findViewById(R.id.A4452898);

        A44529_1 = findViewById(R.id.A44529_1);
        A44529_2 = findViewById(R.id.A44529_2);
        A4452998 = findViewById(R.id.A4452998);

        A44531_1 = findViewById(R.id.A44531_1);
        A44531_2 = findViewById(R.id.A44531_2);
        A4453198 = findViewById(R.id.A4453198);

        A44532_1 = findViewById(R.id.A44532_1);
        A44532_2 = findViewById(R.id.A44532_2);
        A4453298 = findViewById(R.id.A4453298);

        A44533_1 = findViewById(R.id.A44533_1);
        A44533_2 = findViewById(R.id.A44533_2);
        A4453398 = findViewById(R.id.A4453398);

        A44534_1 = findViewById(R.id.A44534_1);
        A44534_2 = findViewById(R.id.A44534_2);
        A4453498 = findViewById(R.id.A4453498);

        A44535_1 = findViewById(R.id.A44535_1);
        A44535_2 = findViewById(R.id.A44535_2);
        A4453598 = findViewById(R.id.A4453598);

        A44536_1 = findViewById(R.id.A44536_1);
        A44536_2 = findViewById(R.id.A44536_2);
        A4453698 = findViewById(R.id.A4453698);

        A44537_1 = findViewById(R.id.A44537_1);
        A44537_2 = findViewById(R.id.A44537_2);
        A4453798 = findViewById(R.id.A4453798);

        A44538_1 = findViewById(R.id.A44538_1);
        A44538_2 = findViewById(R.id.A44538_2);
        A4453898 = findViewById(R.id.A4453898);

        A44539_1 = findViewById(R.id.A44539_1);
        A44539_2 = findViewById(R.id.A44539_2);
        A4453998 = findViewById(R.id.A4453998);

        A445310_1 = findViewById(R.id.A445310_1);
        A445310_2 = findViewById(R.id.A445310_2);
        A44531098 = findViewById(R.id.A44531098);

        A445311_1 = findViewById(R.id.A445311_1);
        A445311_2 = findViewById(R.id.A445311_2);
        A44531198 = findViewById(R.id.A44531198);

        A445312_1 = findViewById(R.id.A445312_1);
        A445312_2 = findViewById(R.id.A445312_2);
        A44531298 = findViewById(R.id.A44531298);

        A4454_1 = findViewById(R.id.A4454_1);
        A4454_2 = findViewById(R.id.A4454_2);
        A445498 = findViewById(R.id.A445498);
        A445499 = findViewById(R.id.A445499);

        A4455_1 = findViewById(R.id.A4455_1);
        A4455_2 = findViewById(R.id.A4455_2);
        A445598 = findViewById(R.id.A445598);
        A445599 = findViewById(R.id.A445599);

        A4456_1 = findViewById(R.id.A4456_1);
        A4456_2 = findViewById(R.id.A4456_2);
        A445698 = findViewById(R.id.A445698);
        A445699 = findViewById(R.id.A445699);

        A4457_1 = findViewById(R.id.A4457_1);
        A4457_2 = findViewById(R.id.A4457_2);
        A445798 = findViewById(R.id.A445798);
        A445799 = findViewById(R.id.A445799);

        A4402_5 = findViewById(R.id.A4402_5);
        A4403_province = findViewById(R.id.A4403_province);
        A4403_district = findViewById(R.id.A4403_district);
        A4404_years = findViewById(R.id.A4404_years);
        A4405_hours = findViewById(R.id.A4405_hours);
        A4405_minutes = findViewById(R.id.A4405_minutes);
        A445113 = findViewById(R.id.A445113);
        A44529 = findViewById(R.id.A44529);
        A445312 = findViewById(R.id.A445312);
        A4471 = findViewById(R.id.A4471);
        A4473 = findViewById(R.id.A4473);

        A4472_1 = findViewById(R.id.A4472_1);
        A4472_2 = findViewById(R.id.A4472_2);
        A4472_3 = findViewById(R.id.A4472_3);
        A4472_4 = findViewById(R.id.A4472_4);
        A4472_5 = findViewById(R.id.A4472_5);
        A4472_6 = findViewById(R.id.A4472_6);
        A4472_7 = findViewById(R.id.A4472_7);
        A4472_8 = findViewById(R.id.A4472_8);
        A4472_9 = findViewById(R.id.A4472_9);
        A4472_10 = findViewById(R.id.A4472_10);
        A4472_11 = findViewById(R.id.A4472_11);
        A4472_12 = findViewById(R.id.A4472_12);
        A447298 = findViewById(R.id.A447298);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4401);

        this.setTitle(getString(R.string.h_a_sec_13));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        study_id = findViewById(R.id.study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        study_id.setText(study_id);
        study_id.setEnabled(false);

        Initialization();
        events_call();

        btn_next14.setEnabled(false);
        btn_imgCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String RootDir = Environment.getExternalStorageDirectory().getAbsolutePath()
                        + File.separator + "VASA" + File.separator + study_id.getText().toString();
                File RootFile = new File(RootDir);
                boolean success = true;
                if (!RootFile.exists()) {
                    success = RootFile.mkdir();
                }
                if (success) {
                    Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    output = new File(RootDir, "A4471_" + count + ".jpeg");

                    i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(output));
                    startActivityForResult(i, CONTENT_REQUEST);
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

                txt_cap_count.setText("Pictures Attached: " + count);

                Toast.makeText(this, "Image capture done!!", Toast.LENGTH_SHORT).show();
                btn_next14.setEnabled(true);

                count++;
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

        Intent c = new Intent(A4401.this, A4001.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton.getId() == R.id.A4401_1) {
            if (A4401_1.isChecked()) {
                ClearAll(cvA4402);
                ClearAll(cvA4403);

                cvA4402.setVisibility(View.GONE);
                cvA4403.setVisibility(View.GONE);
            } else {

                cvA4402.setVisibility(View.VISIBLE);
                cvA4403.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A440198) {
            if (A440198.isChecked()) {
                ClearAll(cvA4402);
                ClearAll(cvA4403);
                ClearAll(cvA4404);
                ClearAll(cvA4405);
                ClearAll(cv51_52_53);

                cvA4402.setVisibility(View.GONE);
                cvA4403.setVisibility(View.GONE);
                cvA4404.setVisibility(View.GONE);
                cvA4405.setVisibility(View.GONE);
                cv51_52_53.setVisibility(View.GONE);
            } else {

                cvA4402.setVisibility(View.VISIBLE);
                cvA4403.setVisibility(View.VISIBLE);
                cvA4404.setVisibility(View.VISIBLE);
                cvA4405.setVisibility(View.VISIBLE);
                cv51_52_53.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.A4402_5) {
            if (A4402_5.isChecked()) {

                A4402_5.setVisibility(View.VISIBLE);
            } else {
                ClearAll(cvA4402);
                A4402_5.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A440298) {
            if (A440298.isChecked()) {

                ClearAll(cvA4403);
                ClearAll(cvA4404);
                ClearAll(cvA4405);
                ClearAll(cv51_52_53);

                cvA4403.setVisibility(View.GONE);
                cvA4404.setVisibility(View.GONE);
                cvA4405.setVisibility(View.GONE);
                cv51_52_53.setVisibility(View.GONE);
            } else {

                cvA4403.setVisibility(View.VISIBLE);
                cvA4404.setVisibility(View.VISIBLE);
                cvA4405.setVisibility(View.VISIBLE);
                cv51_52_53.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A445113_1
                || compoundButton.getId() == R.id.A445113_2
                || compoundButton.getId() == R.id.A44511398) {
            if (A445113_1.isChecked()) {

                A445113.setVisibility(View.VISIBLE);
            } else {
                ClearAll(cvA445113);
                A445113.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A44529_1
                || compoundButton.getId() == R.id.A44529_2
                || compoundButton.getId() == R.id.A4452998) {
            if (A44529_1.isChecked()) {

                A44529.setVisibility(View.VISIBLE);
            } else {
                ClearAll(cvA44529);
                A44529.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A445312_1
                || compoundButton.getId() == R.id.A445312_2
                || compoundButton.getId() == R.id.A44531298) {
            if (A445312_1.isChecked()) {

                A445312.setVisibility(View.VISIBLE);
            } else {
                ClearAll(cvA445312);
                A445312.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A447298) {
            if (A447298.isChecked()) {
                A4472_1.setChecked(false);
                A4472_2.setChecked(false);
                A4472_3.setChecked(false);
                A4472_4.setChecked(false);
                A4472_5.setChecked(false);
                A4472_6.setChecked(false);
                A4472_7.setChecked(false);
                A4472_8.setChecked(false);
                A4472_9.setChecked(false);
                A4472_10.setChecked(false);
                A4472_11.setChecked(false);
                A4472_12.setChecked(false);
            } else {
                A447298.setChecked(false);
            }
        } else {

            A447298.setChecked(false);
        }

        if (compoundButton.getId() == R.id.A4472_12) {
            if (A4472_12.isChecked()) {
                A4472_1.setChecked(false);
                A4472_2.setChecked(false);
                A4472_3.setChecked(false);
                A4472_4.setChecked(false);
                A4472_5.setChecked(false);
                A4472_6.setChecked(false);
                A4472_7.setChecked(false);
                A4472_8.setChecked(false);
                A4472_9.setChecked(false);
                A4472_10.setChecked(false);
                A4472_11.setChecked(false);
                A447298.setChecked(false);
            } else {
                A4472_12.setChecked(false);
            }
        } else {

            A4472_12.setChecked(false);
        }
    }

    void events_call() {

        btn_next14.setOnClickListener(this);

        A4401_1.setOnCheckedChangeListener(this);
        A4401_2.setOnCheckedChangeListener(this);
        A440198.setOnCheckedChangeListener(this);

        A4402_1.setOnCheckedChangeListener(this);
        A4402_2.setOnCheckedChangeListener(this);
        A4402_3.setOnCheckedChangeListener(this);
        A4402_4.setOnCheckedChangeListener(this);
        A4402_5.setOnCheckedChangeListener(this);
        A440298.setOnCheckedChangeListener(this);

        A445113_1.setOnCheckedChangeListener(this);
        A445113_2.setOnCheckedChangeListener(this);
        A44511398.setOnCheckedChangeListener(this);

        A44529_1.setOnCheckedChangeListener(this);
        A44529_2.setOnCheckedChangeListener(this);
        A4452998.setOnCheckedChangeListener(this);

        A445312_1.setOnCheckedChangeListener(this);
        A445312_2.setOnCheckedChangeListener(this);
        A44531298.setOnCheckedChangeListener(this);

        // A4472_1.setOnCheckedChangeListener(this);
        // A4472_2.setOnCheckedChangeListener(this);
        // A4472_3.setOnCheckedChangeListener(this);
        // A4472_4.setOnCheckedChangeListener(this);
        // A4472_5.setOnCheckedChangeListener(this);
        // A4472_6.setOnCheckedChangeListener(this);
        // A4472_7.setOnCheckedChangeListener(this);
        // A4472_8.setOnCheckedChangeListener(this);
        // A4472_9.setOnCheckedChangeListener(this);
        // A4472_10.setOnCheckedChangeListener(this);
        // A4472_11.setOnCheckedChangeListener(this);
        // A4472_12.setOnCheckedChangeListener(this);
        // A447298.setOnCheckedChangeListener(this);
        smart(cvA4472);

    }

    void value_assignment() {

        study_id = "0";
        A4401 = "-1";
        A4402 = "-1";
        A4402_5_OT = "-1";
        A4403_province = "-1";
        A4403_district = "-1";
        A4404_years = "-1";
        A4405_hours = "-1";
        A4405_minutes = "-1";
        A44511 = "-1";
        A44512 = "-1";
        A44513 = "-1";
        A44514 = "-1";
        A44515 = "-1";
        A44516 = "-1";
        A44517 = "-1";
        A44518 = "-1";
        A44519 = "-1";
        A445110 = "-1";
        A445111 = "-1";
        A445112 = "-1";
        A445113 = "-1";
        A445113_OT = "-1";
        A4451code = "-1";
        A44521 = "-1";
        A44522 = "-1";
        A44523 = "-1";
        A44524 = "-1";
        A44525 = "-1";
        A44526 = "-1";
        A44527 = "-1";
        A44528 = "-1";
        A44529 = "-1";
        A44529_OT = "-1";
        A4452code = "-1";
        A44531 = "-1";
        A44532 = "-1";
        A44533 = "-1";
        A44534 = "-1";
        A44535 = "-1";
        A44536 = "-1";
        A44537 = "-1";
        A44538 = "-1";
        A44539 = "-1";
        A445310 = "-1";
        A445311 = "-1";
        A445312 = "-1";
        A445312_OT = "-1";
        A4453code = "-1";
        A4454 = "-1";
        A4455 = "-1";
        A4456 = "-1";
        A4457 = "-1";
        A4471 = "-1";
        A4472_1 = "-1";
        A4472_2 = "-1";
        A4472_3 = "-1";
        A4472_4 = "-1";
        A4472_5 = "-1";
        A4472_6 = "-1";
        A4472_7 = "-1";
        A4472_8 = "-1";
        A4472_9 = "-1";
        A4472_10 = "-1";
        A4472_11 = "-1";
        A4472_12 = "-1";
        A447298 = "-1";
        A4473 = "-1";
        STATUS = "0";


        if (study_id.getText().toString().length() > 0) {

            study_id = study_id.getText().toString().trim();
        }

        //A4401
        if (A4401_1.isChecked()) {
            A4401 = "1";
        }
        if (A4401_2.isChecked()) {
            A4401 = "2";
        }
        if (A440198.isChecked()) {
            A4401 = "9";
        }

        //A4402
        if (A4402_1.isChecked()) {
            A4402 = "1";
        }
        if (A4402_2.isChecked()) {
            A4402 = "2";
        }
        if (A4402_3.isChecked()) {
            A4402 = "3";
        }
        if (A4402_4.isChecked()) {
            A4402 = "4";
        }
        if (A4402_5.isChecked()) {
            A4402 = "5";
        }
        if (A440298.isChecked()) {
            A4402 = "9";
        }
        if (A4402_5.getText().toString().trim().length() > 0) {
            A4402_5_OT = A4402_5.getText().toString().trim();
        }

        //A4403
        if (A4403_province.getText().toString().trim().length() > 0) {
            A4403_province = A4403_province.getText().toString().trim();
        }
        if (A4403_district.getText().toString().trim().length() > 0) {
            A4403 = A4403_district.getText().toString().trim();
        }

        //A4404_years
        if (A4404_years.getText().toString().trim().length() > 0) {
            A4404_years = A4404_years.getText().toString().trim();
        }

        //A4405
        if (A4405_hours.getText().toString().trim().length() > 0) {
            A4405_hours = A4405_hours.getText().toString().trim();
        }
        if (A4405_minutes.getText().toString().trim().length() > 0) {
            A4405_minutes = A4405_minutes.getText().toString().trim();
        }

        //A44511
        if (A44511_1.isChecked()) {
            A44511 = "1";
        }
        if (A44511_2.isChecked()) {
            A44511 = "2";
        }
        if (A4451198.isChecked()) {
            A44511 = "9";
        }

        //A44512
        if (A44512_1.isChecked()) {
            A44512 = "1";
        }
        if (A44512_2.isChecked()) {
            A44512 = "2";
        }
        if (A4451298.isChecked()) {
            A44512 = "9";
        }

        //A44513
        if (A44513_1.isChecked()) {
            A44513 = "1";
        }
        if (A44513_2.isChecked()) {
            A44513 = "2";
        }
        if (A4451398.isChecked()) {
            A44513 = "9";
        }

        //A44514
        if (A44514_1.isChecked()) {
            A44514 = "1";
        }
        if (A44514_2.isChecked()) {
            A44514 = "2";
        }
        if (A4451498.isChecked()) {
            A44514 = "9";
        }

        //A44515
        if (A44515_1.isChecked()) {
            A44515 = "1";
        }
        if (A44515_2.isChecked()) {
            A44515 = "2";
        }
        if (A4451598.isChecked()) {
            A44515 = "9";
        }

        //A44516
        if (A44516_1.isChecked()) {
            A44516 = "1";
        }
        if (A44516_2.isChecked()) {
            A44516 = "2";
        }
        if (A4451698.isChecked()) {
            A44516 = "9";
        }

        //A44517
        if (A44517_1.isChecked()) {
            A44517 = "1";
        }
        if (A44517_2.isChecked()) {
            A44517 = "2";
        }
        if (A4451798.isChecked()) {
            A44517 = "9";
        }

        //A44518
        if (A44518_1.isChecked()) {
            A44518 = "1";
        }
        if (A44518_2.isChecked()) {
            A44518 = "2";
        }
        if (A4451898.isChecked()) {
            A44518 = "9";
        }

        //A44519
        if (A44519_1.isChecked()) {
            A44519 = "1";
        }
        if (A44519_2.isChecked()) {
            A44519 = "2";
        }
        if (A4451998.isChecked()) {
            A44519 = "9";
        }

        //A445110
        if (A445110_1.isChecked()) {
            A445110 = "1";
        }
        if (A445110_2.isChecked()) {
            A445110 = "2";
        }
        if (A44511098.isChecked()) {
            A445110 = "9";
        }

        //A445111
        if (A445111_1.isChecked()) {
            A445111 = "1";
        }
        if (A445111_2.isChecked()) {
            A445111 = "2";
        }
        if (A44511198.isChecked()) {
            A445111 = "9";
        }

        //A445112
        if (A445112_1.isChecked()) {
            A445112 = "1";
        }
        if (A445112_2.isChecked()) {
            A445112 = "2";
        }
        if (A44511298.isChecked()) {
            A445112 = "9";
        }

        //A445113
        if (A445113_1.isChecked()) {
            A445113 = "1";
        }
        if (A445113_2.isChecked()) {
            A445113 = "2";
        }
        if (A44511398.isChecked()) {
            A445113 = "9";
        }
        if (A445113.getText().toString().trim().length() > 0) {
            A445113_OT = A445113.getText().toString().trim();
        }

        //A44521
        if (A44521_1.isChecked()) {
            A44521 = "1";
        }
        if (A44521_2.isChecked()) {
            A44521 = "2";
        }
        if (A4452198.isChecked()) {
            A44521 = "9";
        }

        //A44522
        if (A44522_1.isChecked()) {
            A44522 = "1";
        }
        if (A44522_2.isChecked()) {
            A44522 = "2";
        }
        if (A4452298.isChecked()) {
            A44522 = "9";
        }

        //A44523
        if (A44523_1.isChecked()) {
            A44523 = "1";
        }
        if (A44523_2.isChecked()) {
            A44523 = "2";
        }
        if (A4452398.isChecked()) {
            A44523 = "9";
        }

        //A44524
        if (A44524_1.isChecked()) {
            A44524 = "1";
        }
        if (A44524_2.isChecked()) {
            A44524 = "2";
        }
        if (A4452498.isChecked()) {
            A44524 = "9";
        }

        //A44525
        if (A44525_1.isChecked()) {
            A44525 = "1";
        }
        if (A44525_2.isChecked()) {
            A44525 = "2";
        }
        if (A4452598.isChecked()) {
            A44525 = "9";
        }

        //A44526
        if (A44526_1.isChecked()) {
            A44526 = "1";
        }
        if (A44526_2.isChecked()) {
            A44526 = "2";
        }
        if (A4452698.isChecked()) {
            A44526 = "9";
        }

        //A44527
        if (A44527_1.isChecked()) {
            A44527 = "1";
        }
        if (A44527_2.isChecked()) {
            A44527 = "2";
        }
        if (A4452798.isChecked()) {
            A44527 = "9";
        }

        //A44528
        if (A44528_1.isChecked()) {
            A44528 = "1";
        }
        if (A44528_2.isChecked()) {
            A44528 = "2";
        }
        if (A4452898.isChecked()) {
            A44528 = "9";
        }

        //A44529
        if (A44529_1.isChecked()) {
            A44529 = "1";
        }
        if (A44529_2.isChecked()) {
            A44529 = "2";
        }
        if (A4452998.isChecked()) {
            A44529 = "9";
        }
        if (A44529.getText().toString().trim().length() > 0) {
            A44529_OT = A44529.getText().toString().trim();
        }

        //A44531
        if (A44531_1.isChecked()) {
            A44531 = "1";
        }
        if (A44531_2.isChecked()) {
            A44531 = "2";
        }
        if (A4453198.isChecked()) {
            A44531 = "9";
        }

        //A44532
        if (A44532_1.isChecked()) {
            A44532 = "1";
        }
        if (A44532_2.isChecked()) {
            A44532 = "2";
        }
        if (A4453298.isChecked()) {
            A44532 = "9";
        }

        //A44533
        if (A44533_1.isChecked()) {
            A44533 = "1";
        }
        if (A44533_2.isChecked()) {
            A44533 = "2";
        }
        if (A4453398.isChecked()) {
            A44533 = "9";
        }

        //A44534
        if (A44534_1.isChecked()) {
            A44534 = "1";
        }
        if (A44534_2.isChecked()) {
            A44534 = "2";
        }
        if (A4453498.isChecked()) {
            A44534 = "9";
        }

        //A44535
        if (A44535_1.isChecked()) {
            A44535 = "1";
        }
        if (A44535_2.isChecked()) {
            A44535 = "2";
        }
        if (A4453598.isChecked()) {
            A44535 = "9";
        }

        //A44536
        if (A44536_1.isChecked()) {
            A44536 = "1";
        }
        if (A44536_2.isChecked()) {
            A44536 = "2";
        }
        if (A4453698.isChecked()) {
            A44536 = "9";
        }

        //A44537
        if (A44537_1.isChecked()) {
            A44537 = "1";
        }
        if (A44537_2.isChecked()) {
            A44537 = "2";
        }
        if (A4453798.isChecked()) {
            A44537 = "9";
        }

        //A44538
        if (A44538_1.isChecked()) {
            A44538 = "1";
        }
        if (A44538_2.isChecked()) {
            A44538 = "2";
        }
        if (A4453898.isChecked()) {
            A44538 = "9";
        }

        //A44539
        if (A44539_1.isChecked()) {
            A44539 = "1";
        }
        if (A44539_2.isChecked()) {
            A44539 = "2";
        }
        if (A4453998.isChecked()) {
            A44539 = "9";
        }

        //A445310
        if (A445310_1.isChecked()) {
            A445310 = "1";
        }
        if (A445310_2.isChecked()) {
            A445310 = "2";
        }
        if (A44531098.isChecked()) {
            A445310 = "9";
        }

        //A445311
        if (A445311_1.isChecked()) {
            A445311 = "1";
        }
        if (A445311_2.isChecked()) {
            A445311 = "2";
        }
        if (A44531198.isChecked()) {
            A445311 = "9";
        }

        //A445312
        if (A445312_1.isChecked()) {
            A445312 = "1";
        }
        if (A445312_2.isChecked()) {
            A445312 = "2";
        }
        if (A44531298.isChecked()) {
            A445312 = "9";
        }
        if (A445312.getText().toString().trim().length() > 0) {
            A445312_OT = A445312.getText().toString().trim();
        }

        //A4454
        if (A4454_1.isChecked()) {
            A4454 = "1";
        }
        if (A4454_2.isChecked()) {
            A4454 = "2";
        }
        if (A445498.isChecked()) {
            A4454 = "9";
        }
        if (A445499.isChecked()) {
            A4454 = "8";
        }

        //A4455
        if (A4455_1.isChecked()) {
            A4455 = "1";
        }
        if (A4455_2.isChecked()) {
            A4455 = "2";
        }
        if (A445598.isChecked()) {
            A4455 = "9";
        }
        if (A445599.isChecked()) {
            A4455 = "8";
        }

        //A4456
        if (A4456_1.isChecked()) {
            A4456 = "1";
        }
        if (A4456_2.isChecked()) {
            A4456 = "2";
        }
        if (A445698.isChecked()) {
            A4456 = "9";
        }
        if (A445699.isChecked()) {
            A4456 = "8";
        }

        //A4457
        if (A4457_1.isChecked()) {
            A4457 = "1";
        }
        if (A4457_2.isChecked()) {
            A4457 = "2";
        }
        if (A445798.isChecked()) {
            A4457 = "9";
        }
        if (A445799.isChecked()) {
            A4457 = "8";
        }

        //A4471
        if (A4471.getText().toString().trim().length() > 0) {
            A4471 = A4471.getText().toString().trim();
        }

        //A4472 CheckBox
        if (A4472_1.isChecked()) {
            A4472_1 = "1";
        }
        if (A4472_2.isChecked()) {
            A4472_2 = "2";
        }
        if (A4472_3.isChecked()) {
            A4472_3 = "3";
        }
        if (A4472_4.isChecked()) {
            A4472_4 = "4";
        }
        if (A4472_5.isChecked()) {
            A4472_5 = "5";
        }
        if (A4472_6.isChecked()) {
            A4472_6 = "6";
        }
        if (A4472_7.isChecked()) {
            A4472_7 = "7";
        }
        if (A4472_8.isChecked()) {
            A4472_8 = "8";
        }
        if (A4472_9.isChecked()) {
            A4472_9 = "9";
        }
        if (A4472_10.isChecked()) {
            A4472_10 = "10";
        }
        if (A4472_11.isChecked()) {
            A4472_11 = "11";
        }
        if (A4472_12.isChecked()) {
            A4472_12 = "12";
        }
        if (A447298.isChecked()) {
            A447298 = "99";
        }

        //A4473
        if (A4473.getText().toString().trim().length() > 0) {
            A4473 = A4473.getText().toString().trim();
        }
    }

    void insert_data() {

        String query = "insert into A4401_A4473("

                + Global.A.A4401_A4473.study_id + ","
                + Global.A.A4401_A4473.A4401 + ","
                + Global.A.A4401_A4473.A4402 + ","
                + Global.A.A4401_A4473.A4402_5_OT + ","
                + Global.A.A4401_A4473.A4403_province + ","
                + Global.A.A4401_A4473.A4403_district + ","
                + Global.A.A4401_A4473.A4404_years + ","
                + Global.A.A4401_A4473.A4405_hours + ","
                + Global.A.A4401_A4473.A4405_minutes + ","
                + Global.A.A4401_A4473.A44511 + ","
                + Global.A.A4401_A4473.A44512 + ","
                + Global.A.A4401_A4473.A44513 + ","
                + Global.A.A4401_A4473.A44514 + ","
                + Global.A.A4401_A4473.A44515 + ","
                + Global.A.A4401_A4473.A44516 + ","
                + Global.A.A4401_A4473.A44517 + ","
                + Global.A.A4401_A4473.A44518 + ","
                + Global.A.A4401_A4473.A44519 + ","
                + Global.A.A4401_A4473.A445110 + ","
                + Global.A.A4401_A4473.A445111 + ","
                + Global.A.A4401_A4473.A445112 + ","
                + Global.A.A4401_A4473.A445113 + ","
                + Global.A.A4401_A4473.A445113_OT + ","
                + Global.A.A4401_A4473.A4451code + ","
                + Global.A.A4401_A4473.A44521 + ","
                + Global.A.A4401_A4473.A44522 + ","
                + Global.A.A4401_A4473.A44523 + ","
                + Global.A.A4401_A4473.A44524 + ","
                + Global.A.A4401_A4473.A44525 + ","
                + Global.A.A4401_A4473.A44526 + ","
                + Global.A.A4401_A4473.A44527 + ","
                + Global.A.A4401_A4473.A44528 + ","
                + Global.A.A4401_A4473.A44529 + ","
                + Global.A.A4401_A4473.A44529_OT + ","
                + Global.A.A4401_A4473.A4452code + ","
                + Global.A.A4401_A4473.A44531 + ","
                + Global.A.A4401_A4473.A44532 + ","
                + Global.A.A4401_A4473.A44533 + ","
                + Global.A.A4401_A4473.A44534 + ","
                + Global.A.A4401_A4473.A44535 + ","
                + Global.A.A4401_A4473.A44536 + ","
                + Global.A.A4401_A4473.A44537 + ","
                + Global.A.A4401_A4473.A44538 + ","
                + Global.A.A4401_A4473.A44539 + ","
                + Global.A.A4401_A4473.A445310 + ","
                + Global.A.A4401_A4473.A445311 + ","
                + Global.A.A4401_A4473.A445312 + ","
                + Global.A.A4401_A4473.A445312_OT + ","
                + Global.A.A4401_A4473.A4453code + ","
                + Global.A.A4401_A4473.A4454 + ","
                + Global.A.A4401_A4473.A4455 + ","
                + Global.A.A4401_A4473.A4456 + ","
                + Global.A.A4401_A4473.A4457 + ","
                + Global.A.A4401_A4473.A4471 + ","
                + Global.A.A4401_A4473.A4472_1 + ","
                + Global.A.A4401_A4473.A4472_2 + ","
                + Global.A.A4401_A4473.A4472_3 + ","
                + Global.A.A4401_A4473.A4472_4 + ","
                + Global.A.A4401_A4473.A4472_5 + ","
                + Global.A.A4401_A4473.A4472_6 + ","
                + Global.A.A4401_A4473.A4472_7 + ","
                + Global.A.A4401_A4473.A4472_8 + ","
                + Global.A.A4401_A4473.A4472_9 + ","
                + Global.A.A4401_A4473.A4472_10 + ","
                + Global.A.A4401_A4473.A4472_11 + ","
                + Global.A.A4401_A4473.A4472_12 + ","
                + Global.A.A4401_A4473.A447298 + ","
                + Global.A.A4401_A4473.A4473 + ","
                + Global.A.A4401_A4473.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4401 + "','" +
                A4402 + "','" +
                A4402_5_OT + "','" +
                A4403_province + "','" +
                A4403_district + "','" +
                A4404_years + "','" +
                A4405_hours + "','" +
                A4405_minutes + "','" +
                A44511 + "','" +
                A44512 + "','" +
                A44513 + "','" +
                A44514 + "','" +
                A44515 + "','" +
                A44516 + "','" +
                A44517 + "','" +
                A44518 + "','" +
                A44519 + "','" +
                A445110 + "','" +
                A445111 + "','" +
                A445112 + "','" +
                A445113 + "','" +
                A445113_OT + "','" +
                A4451code + "','" +
                A44521 + "','" +
                A44522 + "','" +
                A44523 + "','" +
                A44524 + "','" +
                A44525 + "','" +
                A44526 + "','" +
                A44527 + "','" +
                A44528 + "','" +
                A44529 + "','" +
                A44529_OT + "','" +
                A4452code + "','" +
                A44531 + "','" +
                A44532 + "','" +
                A44533 + "','" +
                A44534 + "','" +
                A44535 + "','" +
                A44536 + "','" +
                A44537 + "','" +
                A44538 + "','" +
                A44539 + "','" +
                A445310 + "','" +
                A445311 + "','" +
                A445312 + "','" +
                A445312_OT + "','" +
                A4453code + "','" +
                A4454 + "','" +
                A4455 + "','" +
                A4456 + "','" +
                A4457 + "','" +
                A4471 + "','" +
                A4472_1 + "','" +
                A4472_2 + "','" +
                A4472_3 + "','" +
                A4472_4 + "','" +
                A4472_5 + "','" +
                A4472_6 + "','" +
                A4472_7 + "','" +
                A4472_8 + "','" +
                A4472_9 + "','" +
                A4472_10 + "','" +
                A4472_11 + "','" +
                A4472_12 + "','" +
                A447298 + "','" +
                A4473 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "14th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(cvstudy_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvstudy_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4401) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4402) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4403) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4404) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4405) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44511) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44512) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44513) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44514) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44515) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44516) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44517) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44518) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44519) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445110) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445111) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445112) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445113) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44521) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44522) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44523) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44524) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44525) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44526) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44527) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44528) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44529) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44531) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44532) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44533) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44534) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44535) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44536) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44537) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44538) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA44539) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445310) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445311) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA445312) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4454) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4455) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4456) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4457) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4471) == false) {
            return false;
        }

        if (Gothrough.IamHiden(cvA4472) == false) {
            return false;
        }

        return Gothrough.IamHiden(cvA4473) != false;
    }


    void smart(LinearLayout lv) {
        for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
            View view = lv.getChildAt(i);
            if (view instanceof CheckBox) {
                ((CheckBox) view).setOnCheckedChangeListener(this);
            }

        }
    }
}
