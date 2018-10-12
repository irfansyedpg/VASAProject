package com.irfansyed.VAS.VASMonitring.C;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.GS.InterviewEnd;
import com.irfansyed.VAS.VASMonitring.Other.globale;
import com.irfansyed.VAS.VASMonitring.R;

import java.io.File;

import data.LocalDataManager;
import utils.Gothrough;

public class C3471_C3472 extends AppCompatActivity implements View.OnClickListener {


    //region Declaration

    private static final int CONTENT_REQUEST = 1337;

    // LinerLayouts
    LinearLayout
            ll_study_id,
            ll_C3471,
            ll_C3472;

    CheckBox
            cb_C3472_1,
            cb_C3472_2,
            cb_C3472_3,
            cb_C3472_4,
            cb_C3472_5,
            cb_C3472_6,
            cb_C3472_7,
            cb_C3472_8,
            cb_C3472_9,
            cb_C3472_10,
            cb_C3472_11,
            cb_C3472_DK;

    EditText
            ed_study_id,
            ed_C3471;
    Button btn_next, btn_imgCapture;

    String
            study_id,
            C3471,
            C3472_1,
            C3472_2,
            C3472_3,
            C3472_4,
            C3472_5,
            C3472_6,
            C3472_7,
            C3472_8,
            C3472_9,
            C3472_10,
            C3472_11,
            C3472_DK,
            STATUS;

    int currentSection;
    TextView
            txt_cap_count;
    int count = 1;
    private File output = null;

    //endregion

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c3471_c3472);

        this.setTitle(getString(R.string.h_c_sec_14));

        ll_study_id = findViewById(R.id.ll_study_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();

        btn_next.setOnClickListener(this);

        btn_next.setEnabled(false);
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
                        output = new File(RootDir, "C3471_" + count + ".jpeg");

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

                txt_cap_count.setText("Pictures Attached: " + String.valueOf(count));

                Toast.makeText(this, "Image capture done!!", Toast.LENGTH_SHORT).show();
                btn_next.setEnabled(true);

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

        Intent c = new Intent(this, InterviewEnd.class);
        c.putExtra("study_id", study_id);
        startActivity(c);

        Toast.makeText(this, "Interview Completted...", Toast.LENGTH_LONG).show();
    }

    void Initialization() {

        // Button Next
        btn_next = findViewById(R.id.btn_next);
        btn_imgCapture = findViewById(R.id.btn_imgCapture);
        txt_cap_count = findViewById(R.id.txt_cap_count);

        // Layouts
        ll_C3471 = findViewById(R.id.ll_C3471);
        ll_C3472 = findViewById(R.id.ll_C3472);

        // Radio Buttons

        cb_C3472_1 = findViewById(R.id.cb_C3472_1);
        cb_C3472_2 = findViewById(R.id.cb_C3472_2);
        cb_C3472_3 = findViewById(R.id.cb_C3472_3);
        cb_C3472_4 = findViewById(R.id.cb_C3472_4);
        cb_C3472_5 = findViewById(R.id.cb_C3472_5);
        cb_C3472_6 = findViewById(R.id.cb_C3472_6);
        cb_C3472_7 = findViewById(R.id.cb_C3472_7);
        cb_C3472_8 = findViewById(R.id.cb_C3472_8);
        cb_C3472_9 = findViewById(R.id.cb_C3472_9);
        cb_C3472_10 = findViewById(R.id.cb_C3472_10);
        cb_C3472_11 = findViewById(R.id.cb_C3472_11);
        cb_C3472_DK = findViewById(R.id.cb_C3472_DK);


        ed_C3471 = findViewById(R.id.ed_C3471);

    }

    void value_assignment() {

        C3471   = "-1";
        C3472_1 = "-1";
        C3472_2 = "-1";
        C3472_3 = "-1";
        C3472_4 = "-1";
        C3472_5 = "-1";
        C3472_6 = "-1";
        C3472_7 = "-1";
        C3472_8 = "-1";
        C3472_9 = "-1";
        C3472_10 = "-1";
        C3472_11 = "-1";
        C3472_DK = "-1";

        STATUS = "0";

        if (ed_study_id.getText().toString().length() > 0) {

            study_id = ed_study_id.getText().toString().trim();
        }

        if (ed_C3471.getText().toString().trim().length() > 0) {
            C3471 = ed_C3471.getText().toString().trim();
        }

        if (cb_C3472_1.isChecked()) {
            C3472_1 = "1";
        }

        if (cb_C3472_2.isChecked()) {
            C3472_2 = "1";
        }

        if (cb_C3472_3.isChecked()) {
            C3472_3 = "1";
        }

        if (cb_C3472_4.isChecked()) {
            C3472_4 = "1";
        }

        if (cb_C3472_5.isChecked()) {
            C3472_5 = "1";
        }

        if (cb_C3472_6.isChecked()) {
            C3472_6 = "1";
        }

        if (cb_C3472_7.isChecked()) {
            C3472_7 = "1";
        }

        if (cb_C3472_8.isChecked()) {
            C3472_8 = "1";
        }

        if (cb_C3472_9.isChecked()) {
            C3472_9 = "1";
        }

        if (cb_C3472_10.isChecked()) {
            C3472_10 = "1";
        }

        if (cb_C3472_11.isChecked()) {
            C3472_11 = "1";
        }

        if (cb_C3472_DK.isChecked()) {
            C3472_DK = "1";
        }
    }

    void insert_data() {
        String query = "insert into   C3471_C3472("
                + Global.C.C3471_C3472.study_id + ","
                + Global.C.C3471_C3472.C3471 + ","
                + Global.C.C3471_C3472.C3472_1 + ","
                + Global.C.C3471_C3472.C3472_2 + ","
                + Global.C.C3471_C3472.C3472_3 + ","
                + Global.C.C3471_C3472.C3472_4 + ","
                + Global.C.C3471_C3472.C3472_5 + ","
                + Global.C.C3471_C3472.C3472_6 + ","
                + Global.C.C3471_C3472.C3472_7 + ","
                + Global.C.C3471_C3472.C3472_8 + ","
                + Global.C.C3471_C3472.C3472_9 + ","
                + Global.C.C3471_C3472.C3472_10 + ","
                + Global.C.C3471_C3472.C3472_11 + ","
                + Global.C.C3471_C3472.C3472_DK + ","
                + Global.C.C3471_C3472.STATUS + ") values ('" +

                study_id + "','" +
                C3471 + "','" +
                C3472_1 + "','" +
                C3472_2 + "','" +
                C3472_3 + "','" +
                C3472_4 + "','" +
                C3472_5 + "','" +
                C3472_6 + "','" +
                C3472_7 + "','" +
                C3472_8 + "','" +
                C3472_9 + "','" +
                C3472_10 + "','" +
                C3472_11 + "','" +
                C3472_DK + "','" +
                STATUS + "')";


        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "Section 15: Open ended response & interviewer comments/observations inserted successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(ll_study_id) == false) {
            return false;
        }

        if (Gothrough.IamHiden(ll_C3471) == false) {
            return false;
        }

        return Gothrough.IamHiden(ll_C3472) != false;
    }

    @Override
    public void onBackPressed() {
        globale.interviewExit(this, this, study_id, currentSection = 13);
    }
}