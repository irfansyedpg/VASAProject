package com.irfansyed.VAS.VASMonitring.N;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.GS.InterviewEnd;
import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;
import com.irfansyed.VAS.VASMonitring.databinding.N2321N2322Binding;

import java.io.File;

import Global.N.N2012_N2016;
import data.DBHelper;
import utils.ClearAllcontrol;
import utils.Gothrough;

public class N2321_N2322 extends AppCompatActivity {

    N2321N2322Binding bi;
    boolean flag_n2016 = true;

    private static final int CONTENT_REQUEST = 1337;
    int count = 1;
    private File output = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.n2321__n2322);
        bi.setCallback(this);

        this.setTitle(getString(R.string.h_n_sec_15));

        GetDataFromDB();
        SetContentUI();


    }

    private void GetDataFromDB() {

        bi.edStudyId.setText(getIntent().getExtras().getString("study_id"));
        bi.edStudyId.setEnabled(false);
        bi.btnContinue.setEnabled(false);

        DBHelper db = new DBHelper(this);

        String n2016 = db.getSpecificData(data.N.N2012_N2016.TABLE_NAME, bi.edStudyId.getText().toString(), N2012_N2016.sub_N2012_N2016.N2016);
        if (n2016 != null) {
            if (Integer.valueOf(n2016) == 1) {
                flag_n2016 = false;
            }
        }
    }

    public void SetContentUI() {

        CheckBox.OnCheckedChangeListener check = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (bi.cbN2322DK.isChecked() || bi.cbN23226.isChecked()) {
                    bi.cbN23221.setChecked(false);
                    bi.cbN23222.setChecked(false);
                    bi.cbN23223.setChecked(false);
                    bi.cbN23224.setChecked(false);
                    bi.cbN23225.setChecked(false);

                    bi.cbN23221.setEnabled(false);
                    bi.cbN23222.setEnabled(false);
                    bi.cbN23223.setEnabled(false);
                    bi.cbN23224.setEnabled(false);
                    bi.cbN23225.setEnabled(false);

                    if (!bi.cbN23226.isChecked()) {
                        bi.cbN23226.setChecked(false);
                        bi.cbN23226.setEnabled(false);
                    } else {
                        bi.cbN2322DK.setChecked(false);
                        bi.cbN2322DK.setEnabled(false);
                    }

                } else {
                    bi.cbN23221.setEnabled(true);
                    bi.cbN23222.setEnabled(true);
                    bi.cbN23223.setEnabled(true);
                    bi.cbN23224.setEnabled(true);
                    bi.cbN23225.setEnabled(true);
                    bi.cbN23226.setEnabled(true);
                    bi.cbN2322DK.setEnabled(true);
                }

                if (bi.cbN23221.isChecked() || bi.cbN23222.isChecked() || bi.cbN23223.isChecked() || bi.cbN23224.isChecked() || bi.cbN23225.isChecked()) {

                    bi.cbN23226.setChecked(false);
                    bi.cbN23226.setEnabled(false);

                    bi.cbN2322DK.setChecked(false);
                    bi.cbN2322DK.setEnabled(false);
                }

            }
        };

        bi.cbN23221.setOnCheckedChangeListener(check);
        bi.cbN23222.setOnCheckedChangeListener(check);
        bi.cbN23223.setOnCheckedChangeListener(check);
        bi.cbN23224.setOnCheckedChangeListener(check);
        bi.cbN23225.setOnCheckedChangeListener(check);
        bi.cbN23226.setOnCheckedChangeListener(check);
        bi.cbN2322DK.setOnCheckedChangeListener(check);

        //Conditions
        if (!flag_n2016) {
            ClearAllcontrol.ClearAll(bi.llN2322); //ll_N2322
            bi.llN2322.setVisibility(View.GONE);
        }

    }

    public void BtnContinue() {
        if (validateField()) {
            if (SaveData()) {
                finish();
                startActivity(new Intent(this, InterviewEnd.class)
                        .putExtra("study_id", bi.edStudyId.getText().toString()));
            } else {
                Toast.makeText(this, "Can't add data!!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Required fields are missing", Toast.LENGTH_SHORT).show();
        }
    }

    public void BtnCapture() {

        String RootDir = Environment.getExternalStorageDirectory()
                + File.separator + "VASA";
        File RootFile = new File(RootDir);
        boolean success = true;
        if (!RootFile.exists()) {
            success = RootFile.mkdir();
        }
        if (success) {

            RootDir = RootDir + File.separator + bi.edStudyId.getText().toString();
            RootFile = new File(RootDir);
            success = true;
            if (!RootFile.exists()) {
                success = RootFile.mkdir();
            }

            if (success) {

                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                output = new File(RootDir, "N2321_" + count + ".jpeg");

                i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(output));
                startActivityForResult(i, CONTENT_REQUEST);
            } else {
                Toast.makeText(this, "Can't create folder!!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Can't create folder!!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CONTENT_REQUEST) {
            if (resultCode == RESULT_OK) {

                bi.txtCapCount.setText("Pictures Attached: " + String.valueOf(count));

                Toast.makeText(this, "Image capture done!!", Toast.LENGTH_SHORT).show();
                bi.btnContinue.setEnabled(true);

                count++;
            }
        }
    }

    public boolean SaveData() {

        Global.N.N2321_N2322 n2321 = new Global.N.N2321_N2322();

        n2321.setN2321(bi.edN2321.getText().toString().trim().length() > 0 ? bi.edN2321.getText().toString() : "-1");
        /*n2321.setN2322(bi.rbN23221.isChecked() ? "1" : bi.rbN23222.isChecked() ? "2" : bi.rbN23223.isChecked() ? "3"
                : bi.rbN23224.isChecked() ? "4" : bi.rbN23225.isChecked() ? "5" : bi.rbN23226.isChecked() ? "6"
                : bi.rbN2322DK.isChecked() ? "9" : "-1");*/

        n2321.setN23221(bi.cbN23221.isChecked() ? "1" : "-1");
        n2321.setN23222(bi.cbN23222.isChecked() ? "2" : "-1");
        n2321.setN23223(bi.cbN23223.isChecked() ? "3" : "-1");
        n2321.setN23224(bi.cbN23224.isChecked() ? "4" : "-1");
        n2321.setN23225(bi.cbN23225.isChecked() ? "5" : "-1");
        n2321.setN23226(bi.cbN23226.isChecked() ? "6" : "-1");
        n2321.setN2322DK(bi.cbN2322DK.isChecked() ? "9" : "-1");


        n2321.setSTUDYID(bi.edStudyId.getText().toString());
        DBHelper db = new DBHelper(this);
        Long row = db.add_N2321(n2321);

        return row != 0;
    }

    public Boolean validateField() {

        //ll_N2321
        if (!Gothrough.IamHiden(bi.llN2321)) {
            return false;
        }

        if (flag_n2016) {
            //ll_N2322
            return Gothrough.IamHiden(bi.llN2322);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, bi.edStudyId.getText().toString(), 18);
    }
}
