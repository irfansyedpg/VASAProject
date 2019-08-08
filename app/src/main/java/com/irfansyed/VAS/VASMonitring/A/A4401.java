package com.irfansyed.VAS.VASMonitring.A;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.irfansyed.VAS.VASMonitring.R;

import java.io.File;

import data.LocalDataManager;
import utils.Gothrough;

import static utils.ClearAllcontrol.ClearAll;
import static utils.ClearAllcontrol.ClearAllC;

public class A4401 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener, View.OnClickListener {

    private static final int CONTENT_REQUEST = 1337;

    //  Region_Declaration

    Button
            btn_next14,
            btn_imgCapture;

    LinearLayout
            llA4401,
            ll51_52_53;

    CardView
            cvstudy_id, cvA4401, cvA4402, cvA4403, cvA4404, cvA4405, cvA44511, cvA44512,
            cvA44513, cvA44514, cvA44515, cvA44516, cvA44517, cvA44518, cvA44519, cvA445110, cvA445111,
            cvA445112, cvA445113, cvA44521, cvA44522, cvA44523, cvA44524, cvA44525, cvA44526, cvA44527,
            cvA44528, cvA44529, cvA44531, cvA44532, cvA44533, cvA44534, cvA44535, cvA44536, cvA44537,
            cvA44538, cvA44539, cvA445310, cvA445311, cvA445312, cvA4454, cvA4455, cvA4456, cvA4457,
            cvA4471, cvA4472, cvA4473;

    RadioGroup
            A4401, A4402,
            A44511, A44512, A44513, A44514, A44515, A44516, A44517, A44518, A44519, A445110, A445111, A445112, A445113,
            A44521, A44522, A44523, A44524, A44525, A44526, A44527, A44528, A44529,
            A44531, A44532, A44533, A44534, A44535, A44536, A44537, A44538, A44539, A445310, A445311, A445312,
            A4454, A4455, A4456, A4457;
            

    RadioButton
            A4401a, A4401b, A440198,
            A4402a, A4402b, A4402c, A4402d, A440296, A440298,
            A44511a, A44511b, A4451198,
            A44512a, A44512b, A4451298,
            A44513a, A44513b, A4451398,
            A44514a, A44514b, A4451498,
            A44515a, A44515b, A4451598,
            A44516a, A44516b, A4451698,
            A44517a, A44517b, A4451798,
            A44518a, A44518b, A4451898,
            A44519a, A44519b, A4451998,
            A445110a, A445110b, A44511098,
            A445111a, A445111b, A44511198,
            A445112a, A445112b, A44511298,
            A445113a, A445113b, A44511398,
            A44521a, A44521b, A4452198,
            A44522a, A44522b, A4452298,
            A44523a, A44523b, A4452398,
            A44524a, A44524b, A4452498,
            A44525a, A44525b, A4452598,
            A44526a, A44526b, A4452698,
            A44527a, A44527b, A4452798,
            A44528a, A44528b, A4452898,
            A44529a, A44529b, A4452998,
            A44531a, A44531b, A4453198,
            A44532a, A44532b, A4453298,
            A44533a, A44533b, A4453398,
            A44534a, A44534b, A4453498,
            A44535a, A44535b, A4453598,
            A44536a, A44536b, A4453698,
            A44537a, A44537b, A4453798,
            A44538a, A44538b, A4453898,
            A44539a, A44539b, A4453998,
            A445310a, A445310b, A44531098,
            A445311a, A445311b, A44531198,
            A445312a, A445312b, A44531298,
            A4454a, A4454b, A445498, A445499,
            A4455a, A4455b, A445598, A445599,
            A4456a, A4456b, A445698, A445699,
            A4457a, A4457b, A445798, A445799;

    EditText
            ed_study_id,
            A440296x,
            A4403a,
            A4403b,
            A4404,
            A4405a,
            A4405b,
            A445113ax,
            A44529ax,
            A445312ax,
            A4471,
            A4473;

    CheckBox
            A4472a,
            A4472b,
            A4472c,
            A4472d,
            A4472e,
            A4472f,
            A4472g,
            A4472h,
            A4472i,
            A4472j,
            A4472k,
            A4472l,
            A447298;

    String
            study_id,
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

        llA4401 = findViewById(R.id.llA4401);
        ll51_52_53 = findViewById(R.id.ll51_52_53);

        cvA4401 = findViewById(R.id.cvA4401);
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

        A4401 = findViewById(R.id.A4401);
        A4402 = findViewById(R.id.A4402);
        A44511 = findViewById(R.id.A44511);
        A44512 = findViewById(R.id.A44512);
        A44513 = findViewById(R.id.A44513);
        A44514 = findViewById(R.id.A44514);
        A44515 = findViewById(R.id.A44515);
        A44516 = findViewById(R.id.A44516);
        A44517 = findViewById(R.id.A44517);
        A44518 = findViewById(R.id.A44518);
        A44519 = findViewById(R.id.A44519);
        A445110 = findViewById(R.id.A445110);
        A445111 = findViewById(R.id.A445111);
        A445112 = findViewById(R.id.A445112);
        A445113 = findViewById(R.id.A445113);
        A44521 = findViewById(R.id.A44521);
        A44522 = findViewById(R.id.A44522);
        A44523 = findViewById(R.id.A44523);
        A44524 = findViewById(R.id.A44524);
        A44525 = findViewById(R.id.A44525);
        A44526 = findViewById(R.id.A44526);
        A44527 = findViewById(R.id.A44527);
        A44528 = findViewById(R.id.A44528);
        A44529 = findViewById(R.id.A44529);
        A44531 = findViewById(R.id.A44531);
        A44532 = findViewById(R.id.A44532);
        A44533 = findViewById(R.id.A44533);
        A44534 = findViewById(R.id.A44534);
        A44535 = findViewById(R.id.A44535);
        A44536 = findViewById(R.id.A44536);
        A44537 = findViewById(R.id.A44537);
        A44538 = findViewById(R.id.A44538);
        A44539 = findViewById(R.id.A44539);
        A445310 = findViewById(R.id.A445310);
        A445311 = findViewById(R.id.A445311);
        A445312 = findViewById(R.id.A445312);
        A4454 = findViewById(R.id.A4454);
        A4455 = findViewById(R.id.A4455);
        A4456 = findViewById(R.id.A4456);
        A4457 = findViewById(R.id.A4457);

        A4401a = findViewById(R.id.A4401a);
        A4401b = findViewById(R.id.A4401b);
        A440198 = findViewById(R.id.A440198);

        A4402a = findViewById(R.id.A4402a);
        A4402b = findViewById(R.id.A4402b);
        A4402c = findViewById(R.id.A4402c);
        A4402d = findViewById(R.id.A4402d);
        A440296 = findViewById(R.id.A440296);
        A440298 = findViewById(R.id.A440298);

        A44511a = findViewById(R.id.A44511a);
        A44511b = findViewById(R.id.A44511b);
        A4451198 = findViewById(R.id.A4451198);

        A44512a = findViewById(R.id.A44512a);
        A44512b = findViewById(R.id.A44512b);
        A4451298 = findViewById(R.id.A4451298);

        A44513a = findViewById(R.id.A44513a);
        A44513b = findViewById(R.id.A44513b);
        A4451398 = findViewById(R.id.A4451398);

        A44514a = findViewById(R.id.A44514a);
        A44514b = findViewById(R.id.A44514b);
        A4451498 = findViewById(R.id.A4451498);

        A44515a = findViewById(R.id.A44515a);
        A44515b = findViewById(R.id.A44515b);
        A4451598 = findViewById(R.id.A4451598);

        A44516a = findViewById(R.id.A44516a);
        A44516b = findViewById(R.id.A44516b);
        A4451698 = findViewById(R.id.A4451698);

        A44517a = findViewById(R.id.A44517a);
        A44517b = findViewById(R.id.A44517b);
        A4451798 = findViewById(R.id.A4451798);

        A44518a = findViewById(R.id.A44518a);
        A44518b = findViewById(R.id.A44518b);
        A4451898 = findViewById(R.id.A4451898);

        A44519a = findViewById(R.id.A44519a);
        A44519b = findViewById(R.id.A44519b);
        A4451998 = findViewById(R.id.A4451998);

        A445110a = findViewById(R.id.A445110a);
        A445110b = findViewById(R.id.A445110b);
        A44511098 = findViewById(R.id.A44511098);

        A445111a = findViewById(R.id.A445111a);
        A445111b = findViewById(R.id.A445111b);
        A44511198 = findViewById(R.id.A44511198);

        A445112a = findViewById(R.id.A445112a);
        A445112b = findViewById(R.id.A445112b);
        A44511298 = findViewById(R.id.A44511298);

        A445113a = findViewById(R.id.A445113a);
        A445113b = findViewById(R.id.A445113b);
        A44511398 = findViewById(R.id.A44511398);

        A44521a = findViewById(R.id.A44521a);
        A44521b = findViewById(R.id.A44521b);
        A4452198 = findViewById(R.id.A4452198);

        A44522a = findViewById(R.id.A44522a);
        A44522b = findViewById(R.id.A44522b);
        A4452298 = findViewById(R.id.A4452298);

        A44523a = findViewById(R.id.A44523a);
        A44523b = findViewById(R.id.A44523b);
        A4452398 = findViewById(R.id.A4452398);

        A44524a = findViewById(R.id.A44524a);
        A44524b = findViewById(R.id.A44524b);
        A4452498 = findViewById(R.id.A4452498);

        A44525a = findViewById(R.id.A44525a);
        A44525b = findViewById(R.id.A44525b);
        A4452598 = findViewById(R.id.A4452598);

        A44526a = findViewById(R.id.A44526a);
        A44526b = findViewById(R.id.A44526b);
        A4452698 = findViewById(R.id.A4452698);

        A44527a = findViewById(R.id.A44527a);
        A44527b = findViewById(R.id.A44527b);
        A4452798 = findViewById(R.id.A4452798);

        A44528a = findViewById(R.id.A44528a);
        A44528b = findViewById(R.id.A44528b);
        A4452898 = findViewById(R.id.A4452898);

        A44529a = findViewById(R.id.A44529a);
        A44529b = findViewById(R.id.A44529b);
        A4452998 = findViewById(R.id.A4452998);

        A44531a = findViewById(R.id.A44531a);
        A44531b = findViewById(R.id.A44531b);
        A4453198 = findViewById(R.id.A4453198);

        A44532a = findViewById(R.id.A44532a);
        A44532b = findViewById(R.id.A44532b);
        A4453298 = findViewById(R.id.A4453298);

        A44533a = findViewById(R.id.A44533a);
        A44533b = findViewById(R.id.A44533b);
        A4453398 = findViewById(R.id.A4453398);

        A44534a = findViewById(R.id.A44534a);
        A44534b = findViewById(R.id.A44534b);
        A4453498 = findViewById(R.id.A4453498);

        A44535a = findViewById(R.id.A44535a);
        A44535b = findViewById(R.id.A44535b);
        A4453598 = findViewById(R.id.A4453598);

        A44536a = findViewById(R.id.A44536a);
        A44536b = findViewById(R.id.A44536b);
        A4453698 = findViewById(R.id.A4453698);

        A44537a = findViewById(R.id.A44537a);
        A44537b = findViewById(R.id.A44537b);
        A4453798 = findViewById(R.id.A4453798);

        A44538a = findViewById(R.id.A44538a);
        A44538b = findViewById(R.id.A44538b);
        A4453898 = findViewById(R.id.A4453898);

        A44539a = findViewById(R.id.A44539a);
        A44539b = findViewById(R.id.A44539b);
        A4453998 = findViewById(R.id.A4453998);

        A445310a = findViewById(R.id.A445310a);
        A445310b = findViewById(R.id.A445310b);
        A44531098 = findViewById(R.id.A44531098);

        A445311a = findViewById(R.id.A445311a);
        A445311b = findViewById(R.id.A445311b);
        A44531198 = findViewById(R.id.A44531198);

        A445312a = findViewById(R.id.A445312a);
        A445312b = findViewById(R.id.A445312b);
        A44531298 = findViewById(R.id.A44531298);

        A4454a = findViewById(R.id.A4454a);
        A4454b = findViewById(R.id.A4454b);
        A445498 = findViewById(R.id.A445498);
        A445499 = findViewById(R.id.A445499);

        A4455a = findViewById(R.id.A4455a);
        A4455b = findViewById(R.id.A4455b);
        A445598 = findViewById(R.id.A445598);
        A445599 = findViewById(R.id.A445599);

        A4456a = findViewById(R.id.A4456a);
        A4456b = findViewById(R.id.A4456b);
        A445698 = findViewById(R.id.A445698);
        A445699 = findViewById(R.id.A445699);

        A4457a = findViewById(R.id.A4457a);
        A4457b = findViewById(R.id.A4457b);
        A445798 = findViewById(R.id.A445798);
        A445799 = findViewById(R.id.A445799);

        A440296x = findViewById(R.id.A440296x);
        A4403a = findViewById(R.id.A4403a);
        A4403b = findViewById(R.id.A4403b);
        A4404 = findViewById(R.id.A4404);
        A4405a = findViewById(R.id.A4405a);
        A4405b = findViewById(R.id.A4405b);
        A445113ax = findViewById(R.id.A445113ax);
        A44529ax = findViewById(R.id.A44529ax);
        A445312ax = findViewById(R.id.A445312ax);
        A4471 = findViewById(R.id.A4471);
        A4473 = findViewById(R.id.A4473);

        A4472a = findViewById(R.id.A4472a);
        A4472b = findViewById(R.id.A4472b);
        A4472c = findViewById(R.id.A4472c);
        A4472d = findViewById(R.id.A4472d);
        A4472e = findViewById(R.id.A4472e);
        A4472f = findViewById(R.id.A4472f);
        A4472g = findViewById(R.id.A4472g);
        A4472h = findViewById(R.id.A4472h);
        A4472i = findViewById(R.id.A4472i);
        A4472j = findViewById(R.id.A4472j);
        A4472k = findViewById(R.id.A4472k);
        A4472l = findViewById(R.id.A4472l);
        A447298 = findViewById(R.id.A447298);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4401);

        this.setTitle(getString(R.string.h_a_sec_13));

        cvstudy_id = findViewById(R.id.cvstudy_id);
        ed_study_id = findViewById(R.id.ed_study_id);
        Intent getStudyId = getIntent();
        study_id = getStudyId.getExtras().getString("study_id");
        ed_study_id.setText(study_id);
        ed_study_id.setEnabled(false);

        Initialization();
        events_call();

        btn_next14.setEnabled(false);
        btn_imgCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String RootDir = Environment.getExternalStorageDirectory().getAbsolutePath()
                        + File.separator + "VASA" + File.separator + ed_study_id.getText().toString();
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

        if (compoundButton.getId() == R.id.A4401a) {
            if (A4401a.isChecked()) {
                ClearAllC(cvA4402);
                ClearAllC(cvA4403);

                cvA4402.setVisibility(View.GONE);
                cvA4403.setVisibility(View.GONE);
            } else {

                cvA4402.setVisibility(View.VISIBLE);
                cvA4403.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A440198) {
            if (A440198.isChecked()) {
                ClearAllC(cvA4402);
                ClearAllC(cvA4403);
                ClearAllC(cvA4404);
                ClearAllC(cvA4405);
                ClearAll(ll51_52_53);

                cvA4402.setVisibility(View.GONE);
                cvA4403.setVisibility(View.GONE);
                cvA4404.setVisibility(View.GONE);
                cvA4405.setVisibility(View.GONE);
                ll51_52_53.setVisibility(View.GONE);
            } else {

                cvA4402.setVisibility(View.VISIBLE);
                cvA4403.setVisibility(View.VISIBLE);
                cvA4404.setVisibility(View.VISIBLE);
                cvA4405.setVisibility(View.VISIBLE);
                ll51_52_53.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.A440296) {
            if (A440296.isChecked()) {

                A440296.setVisibility(View.VISIBLE);
            } else {
                ClearAllC(cvA4402);
                A440296.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A440298) {
            if (A440298.isChecked()) {

                ClearAllC(cvA4403);
                ClearAllC(cvA4404);
                ClearAllC(cvA4405);
                ClearAll(ll51_52_53);

                cvA4403.setVisibility(View.GONE);
                cvA4404.setVisibility(View.GONE);
                cvA4405.setVisibility(View.GONE);
                ll51_52_53.setVisibility(View.GONE);
            } else {

                cvA4403.setVisibility(View.VISIBLE);
                cvA4404.setVisibility(View.VISIBLE);
                cvA4405.setVisibility(View.VISIBLE);
                ll51_52_53.setVisibility(View.VISIBLE);
            }
        }

        if (compoundButton.getId() == R.id.A445113a
                || compoundButton.getId() == R.id.A445113b
                || compoundButton.getId() == R.id.A44511398) {
            if (A445113a.isChecked()) {

                A445113.setVisibility(View.VISIBLE);
            } else {
                ClearAllC(cvA445113);
                A445113.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A44529a
                || compoundButton.getId() == R.id.A44529b
                || compoundButton.getId() == R.id.A4452998) {
            if (A44529a.isChecked()) {

                A44529.setVisibility(View.VISIBLE);
            } else {
                ClearAllC(cvA44529);
                A44529.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A445312a
                || compoundButton.getId() == R.id.A445312b
                || compoundButton.getId() == R.id.A44531298) {
            if (A445312a.isChecked()) {

                A445312.setVisibility(View.VISIBLE);
            } else {
                ClearAllC(cvA445312);
                A445312.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.A447298) {
            if (A447298.isChecked()) {
                A4472a.setChecked(false);
                A4472b.setChecked(false);
                A4472c.setChecked(false);
                A4472d.setChecked(false);
                A4472e.setChecked(false);
                A4472f.setChecked(false);
                A4472g.setChecked(false);
                A4472h.setChecked(false);
                A4472i.setChecked(false);
                A4472j.setChecked(false);
                A4472k.setChecked(false);
                A4472l.setChecked(false);
            } else {
                A447298.setChecked(false);
            }
        } else {

            A447298.setChecked(false);
        }

        if (compoundButton.getId() == R.id.A4472l) {
            if (A4472l.isChecked()) {
                A4472a.setChecked(false);
                A4472b.setChecked(false);
                A4472c.setChecked(false);
                A4472d.setChecked(false);
                A4472e.setChecked(false);
                A4472f.setChecked(false);
                A4472g.setChecked(false);
                A4472h.setChecked(false);
                A4472i.setChecked(false);
                A4472j.setChecked(false);
                A4472k.setChecked(false);
                A447298.setChecked(false);
            } else {
                A4472l.setChecked(false);
            }
        } else {

            A4472l.setChecked(false);
        }
    }

    void events_call() {

        btn_next14.setOnClickListener(this);

        A4401a.setOnCheckedChangeListener(this);
        A4401b.setOnCheckedChangeListener(this);
        A440198.setOnCheckedChangeListener(this);

        A4402a.setOnCheckedChangeListener(this);
        A4402b.setOnCheckedChangeListener(this);
        A4402c.setOnCheckedChangeListener(this);
        A4402d.setOnCheckedChangeListener(this);
        A440296.setOnCheckedChangeListener(this);
        A440298.setOnCheckedChangeListener(this);

        A445113a.setOnCheckedChangeListener(this);
        A445113b.setOnCheckedChangeListener(this);
        A44511398.setOnCheckedChangeListener(this);

        A44529a.setOnCheckedChangeListener(this);
        A44529b.setOnCheckedChangeListener(this);
        A4452998.setOnCheckedChangeListener(this);

        A445312a.setOnCheckedChangeListener(this);
        A445312b.setOnCheckedChangeListener(this);
        A44531298.setOnCheckedChangeListener(this);

        // A4472a.setOnCheckedChangeListener(this);
        // A4472b.setOnCheckedChangeListener(this);
        // A4472c.setOnCheckedChangeListener(this);
        // A4472d.setOnCheckedChangeListener(this);
        // A4472e.setOnCheckedChangeListener(this);
        // A4472f.setOnCheckedChangeListener(this);
        // A4472g.setOnCheckedChangeListener(this);
        // A4472h.setOnCheckedChangeListener(this);
        // A4472i.setOnCheckedChangeListener(this);
        // A4472j.setOnCheckedChangeListener(this);
        // A4472k.setOnCheckedChangeListener(this);
        // A4472l.setOnCheckedChangeListener(this);
        // A447298.setOnCheckedChangeListener(this);
        smart(cvA4472);

    }

    void value_assignment() {

        study_id = "0";
        A4401 = "-1";
        A4402 = "-1";
        A4402e_OT = "-1";
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
        A4472a = "-1";
        A4472b = "-1";
        A4472c = "-1";
        A4472d = "-1";
        A4472e = "-1";
        A4472f = "-1";
        A4472g = "-1";
        A4472h = "-1";
        A4472i = "-1";
        A4472j = "-1";
        A4472k = "-1";
        A4472l = "-1";
        A447298 = "-1";
        A4473 = "-1";
        STATUS = "0";


        if (study_id.getText().toString().length() > 0) {

            study_id = study_id.getText().toString().trim();
        }

        //A4401
        if (A4401a.isChecked()) {
            A4401 = "1";
        }
        if (A4401b.isChecked()) {
            A4401 = "2";
        }
        if (A440198.isChecked()) {
            A4401 = "9";
        }

        //A4402
        if (A4402a.isChecked()) {
            A4402 = "1";
        }
        if (A4402b.isChecked()) {
            A4402 = "2";
        }
        if (A4402c.isChecked()) {
            A4402 = "3";
        }
        if (A4402d.isChecked()) {
            A4402 = "4";
        }
        if (A4402e.isChecked()) {
            A4402 = "5";
        }
        if (A440298.isChecked()) {
            A4402 = "9";
        }
        if (A4402e.getText().toString().trim().length() > 0) {
            A4402e_OT = A4402e.getText().toString().trim();
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
        if (A44511a.isChecked()) {
            A44511 = "1";
        }
        if (A44511b.isChecked()) {
            A44511 = "2";
        }
        if (A4451198.isChecked()) {
            A44511 = "9";
        }

        //A44512
        if (A44512a.isChecked()) {
            A44512 = "1";
        }
        if (A44512b.isChecked()) {
            A44512 = "2";
        }
        if (A4451298.isChecked()) {
            A44512 = "9";
        }

        //A44513
        if (A44513a.isChecked()) {
            A44513 = "1";
        }
        if (A44513b.isChecked()) {
            A44513 = "2";
        }
        if (A4451398.isChecked()) {
            A44513 = "9";
        }

        //A44514
        if (A44514a.isChecked()) {
            A44514 = "1";
        }
        if (A44514b.isChecked()) {
            A44514 = "2";
        }
        if (A4451498.isChecked()) {
            A44514 = "9";
        }

        //A44515
        if (A44515a.isChecked()) {
            A44515 = "1";
        }
        if (A44515b.isChecked()) {
            A44515 = "2";
        }
        if (A4451598.isChecked()) {
            A44515 = "9";
        }

        //A44516
        if (A44516a.isChecked()) {
            A44516 = "1";
        }
        if (A44516b.isChecked()) {
            A44516 = "2";
        }
        if (A4451698.isChecked()) {
            A44516 = "9";
        }

        //A44517
        if (A44517a.isChecked()) {
            A44517 = "1";
        }
        if (A44517b.isChecked()) {
            A44517 = "2";
        }
        if (A4451798.isChecked()) {
            A44517 = "9";
        }

        //A44518
        if (A44518a.isChecked()) {
            A44518 = "1";
        }
        if (A44518b.isChecked()) {
            A44518 = "2";
        }
        if (A4451898.isChecked()) {
            A44518 = "9";
        }

        //A44519
        if (A44519a.isChecked()) {
            A44519 = "1";
        }
        if (A44519b.isChecked()) {
            A44519 = "2";
        }
        if (A4451998.isChecked()) {
            A44519 = "9";
        }

        //A445110
        if (A445110a.isChecked()) {
            A445110 = "1";
        }
        if (A445110b.isChecked()) {
            A445110 = "2";
        }
        if (A44511098.isChecked()) {
            A445110 = "9";
        }

        //A445111
        if (A445111a.isChecked()) {
            A445111 = "1";
        }
        if (A445111b.isChecked()) {
            A445111 = "2";
        }
        if (A44511198.isChecked()) {
            A445111 = "9";
        }

        //A445112
        if (A445112a.isChecked()) {
            A445112 = "1";
        }
        if (A445112b.isChecked()) {
            A445112 = "2";
        }
        if (A44511298.isChecked()) {
            A445112 = "9";
        }

        //A445113
        if (A445113a.isChecked()) {
            A445113 = "1";
        }
        if (A445113b.isChecked()) {
            A445113 = "2";
        }
        if (A44511398.isChecked()) {
            A445113 = "9";
        }
        if (A445113.getText().toString().trim().length() > 0) {
            A445113_OT = A445113.getText().toString().trim();
        }

        //A44521
        if (A44521a.isChecked()) {
            A44521 = "1";
        }
        if (A44521b.isChecked()) {
            A44521 = "2";
        }
        if (A4452198.isChecked()) {
            A44521 = "9";
        }

        //A44522
        if (A44522a.isChecked()) {
            A44522 = "1";
        }
        if (A44522b.isChecked()) {
            A44522 = "2";
        }
        if (A4452298.isChecked()) {
            A44522 = "9";
        }

        //A44523
        if (A44523a.isChecked()) {
            A44523 = "1";
        }
        if (A44523b.isChecked()) {
            A44523 = "2";
        }
        if (A4452398.isChecked()) {
            A44523 = "9";
        }

        //A44524
        if (A44524a.isChecked()) {
            A44524 = "1";
        }
        if (A44524b.isChecked()) {
            A44524 = "2";
        }
        if (A4452498.isChecked()) {
            A44524 = "9";
        }

        //A44525
        if (A44525a.isChecked()) {
            A44525 = "1";
        }
        if (A44525b.isChecked()) {
            A44525 = "2";
        }
        if (A4452598.isChecked()) {
            A44525 = "9";
        }

        //A44526
        if (A44526a.isChecked()) {
            A44526 = "1";
        }
        if (A44526b.isChecked()) {
            A44526 = "2";
        }
        if (A4452698.isChecked()) {
            A44526 = "9";
        }

        //A44527
        if (A44527a.isChecked()) {
            A44527 = "1";
        }
        if (A44527b.isChecked()) {
            A44527 = "2";
        }
        if (A4452798.isChecked()) {
            A44527 = "9";
        }

        //A44528
        if (A44528a.isChecked()) {
            A44528 = "1";
        }
        if (A44528b.isChecked()) {
            A44528 = "2";
        }
        if (A4452898.isChecked()) {
            A44528 = "9";
        }

        //A44529
        if (A44529a.isChecked()) {
            A44529 = "1";
        }
        if (A44529b.isChecked()) {
            A44529 = "2";
        }
        if (A4452998.isChecked()) {
            A44529 = "9";
        }
        if (A44529.getText().toString().trim().length() > 0) {
            A44529_OT = A44529.getText().toString().trim();
        }

        //A44531
        if (A44531a.isChecked()) {
            A44531 = "1";
        }
        if (A44531b.isChecked()) {
            A44531 = "2";
        }
        if (A4453198.isChecked()) {
            A44531 = "9";
        }

        //A44532
        if (A44532a.isChecked()) {
            A44532 = "1";
        }
        if (A44532b.isChecked()) {
            A44532 = "2";
        }
        if (A4453298.isChecked()) {
            A44532 = "9";
        }

        //A44533
        if (A44533a.isChecked()) {
            A44533 = "1";
        }
        if (A44533b.isChecked()) {
            A44533 = "2";
        }
        if (A4453398.isChecked()) {
            A44533 = "9";
        }

        //A44534
        if (A44534a.isChecked()) {
            A44534 = "1";
        }
        if (A44534b.isChecked()) {
            A44534 = "2";
        }
        if (A4453498.isChecked()) {
            A44534 = "9";
        }

        //A44535
        if (A44535a.isChecked()) {
            A44535 = "1";
        }
        if (A44535b.isChecked()) {
            A44535 = "2";
        }
        if (A4453598.isChecked()) {
            A44535 = "9";
        }

        //A44536
        if (A44536a.isChecked()) {
            A44536 = "1";
        }
        if (A44536b.isChecked()) {
            A44536 = "2";
        }
        if (A4453698.isChecked()) {
            A44536 = "9";
        }

        //A44537
        if (A44537a.isChecked()) {
            A44537 = "1";
        }
        if (A44537b.isChecked()) {
            A44537 = "2";
        }
        if (A4453798.isChecked()) {
            A44537 = "9";
        }

        //A44538
        if (A44538a.isChecked()) {
            A44538 = "1";
        }
        if (A44538b.isChecked()) {
            A44538 = "2";
        }
        if (A4453898.isChecked()) {
            A44538 = "9";
        }

        //A44539
        if (A44539a.isChecked()) {
            A44539 = "1";
        }
        if (A44539b.isChecked()) {
            A44539 = "2";
        }
        if (A4453998.isChecked()) {
            A44539 = "9";
        }

        //A445310
        if (A445310a.isChecked()) {
            A445310 = "1";
        }
        if (A445310b.isChecked()) {
            A445310 = "2";
        }
        if (A44531098.isChecked()) {
            A445310 = "9";
        }

        //A445311
        if (A445311a.isChecked()) {
            A445311 = "1";
        }
        if (A445311b.isChecked()) {
            A445311 = "2";
        }
        if (A44531198.isChecked()) {
            A445311 = "9";
        }

        //A445312
        if (A445312a.isChecked()) {
            A445312 = "1";
        }
        if (A445312b.isChecked()) {
            A445312 = "2";
        }
        if (A44531298.isChecked()) {
            A445312 = "9";
        }
        if (A445312.getText().toString().trim().length() > 0) {
            A445312_OT = A445312.getText().toString().trim();
        }

        //A4454
        if (A4454a.isChecked()) {
            A4454 = "1";
        }
        if (A4454b.isChecked()) {
            A4454 = "2";
        }
        if (A445498.isChecked()) {
            A4454 = "9";
        }
        if (A445499.isChecked()) {
            A4454 = "8";
        }

        //A4455
        if (A4455a.isChecked()) {
            A4455 = "1";
        }
        if (A4455b.isChecked()) {
            A4455 = "2";
        }
        if (A445598.isChecked()) {
            A4455 = "9";
        }
        if (A445599.isChecked()) {
            A4455 = "8";
        }

        //A4456
        if (A4456a.isChecked()) {
            A4456 = "1";
        }
        if (A4456b.isChecked()) {
            A4456 = "2";
        }
        if (A445698.isChecked()) {
            A4456 = "9";
        }
        if (A445699.isChecked()) {
            A4456 = "8";
        }

        //A4457
        if (A4457a.isChecked()) {
            A4457 = "1";
        }
        if (A4457b.isChecked()) {
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
        if (A4472a.isChecked()) {
            A4472a = "1";
        }
        if (A4472b.isChecked()) {
            A4472b = "2";
        }
        if (A4472c.isChecked()) {
            A4472c = "3";
        }
        if (A4472d.isChecked()) {
            A4472d = "4";
        }
        if (A4472e.isChecked()) {
            A4472e = "5";
        }
        if (A4472f.isChecked()) {
            A4472f = "6";
        }
        if (A4472g.isChecked()) {
            A4472g = "7";
        }
        if (A4472h.isChecked()) {
            A4472h = "8";
        }
        if (A4472i.isChecked()) {
            A4472i = "9";
        }
        if (A4472j.isChecked()) {
            A4472j = "10";
        }
        if (A4472k.isChecked()) {
            A4472k = "11";
        }
        if (A4472l.isChecked()) {
            A4472l = "12";
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
                + Global.A.A4401_A4473.A4402e_OT + ","
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
                + Global.A.A4401_A4473.A4472a + ","
                + Global.A.A4401_A4473.A4472b + ","
                + Global.A.A4401_A4473.A4472c + ","
                + Global.A.A4401_A4473.A4472d + ","
                + Global.A.A4401_A4473.A4472e + ","
                + Global.A.A4401_A4473.A4472f + ","
                + Global.A.A4401_A4473.A4472g + ","
                + Global.A.A4401_A4473.A4472h + ","
                + Global.A.A4401_A4473.A4472i + ","
                + Global.A.A4401_A4473.A4472j + ","
                + Global.A.A4401_A4473.A4472k + ","
                + Global.A.A4401_A4473.A4472l + ","
                + Global.A.A4401_A4473.A447298 + ","
                + Global.A.A4401_A4473.A4473 + ","
                + Global.A.A4401_A4473.STATUS + ")" +

                " values ('" +

                study_id + "','" +
                A4401 + "','" +
                A4402 + "','" +
                A4402e_OT + "','" +
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
                A4472a + "','" +
                A4472b + "','" +
                A4472c + "','" +
                A4472d + "','" +
                A4472e + "','" +
                A4472f + "','" +
                A4472g + "','" +
                A4472h + "','" +
                A4472i + "','" +
                A4472j + "','" +
                A4472k + "','" +
                A4472l + "','" +
                A447298 + "','" +
                A4473 + "','" +
                STATUS + "')";

        query = String.format(query);

        LocalDataManager Lm = new LocalDataManager(this);

        LocalDataManager.database.execSQL(query);

        Toast.makeText(this, "14th TABLE SAVED Successfully", Toast.LENGTH_SHORT).show();
    }

    boolean validateField() {

        if (Gothrough.IamHiden(llA4401) == false) {
            return false;
        }

        return Gothrough.IamHiden(llA4401) != false;
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
