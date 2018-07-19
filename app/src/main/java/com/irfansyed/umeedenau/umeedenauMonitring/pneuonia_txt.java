package com.irfansyed.umeedenau.umeedenauMonitring;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import data.LocalDataManager;
import data.col_A;
import utils.LocationHelper;

import static data.LocalDataManager.database;


public class pneuonia_txt extends AppCompatActivity implements View.OnClickListener {


    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;


    String
            PN1,
            PN2,
            PN3,
            PN4,
            PN5,
            PN6,
            PN7;


    LinearLayout
            Lv_PN1,
            Lv_PN2,
            Lv_PN3,
            Lv_PN4,
            Lv_PN5,
            Lv_PN6,
            Lv_PN7;


    EditText
            txt_PN1,
            txt_PN2,
            txt_PN3,
            txt_PN4,
            txt_PN5,
            txt_PN6,
            txt_PN7;

    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pneumonia);
        fun_intia_view();
        next_step();


        btn_next.setOnClickListener(this);


    }


    boolean yesok = true;

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.btn_Next_Pn) {


                this.fun_asignment();
                insertdata();
               next_step();
            Intent itt=new Intent(this,finall_txt.class);
            startActivity(itt);
            this.finish();




        }


    }


    // initilalzie VIews

    public void fun_intia_view() {
        Lv_PN1 = (LinearLayout) findViewById(R.id.Lv_PN1);
        Lv_PN2 = (LinearLayout) findViewById(R.id.Lv_PN2);
        Lv_PN3 = (LinearLayout) findViewById(R.id.Lv_PN3);
        Lv_PN4 = (LinearLayout) findViewById(R.id.Lv_PN4);
        Lv_PN5 = (LinearLayout) findViewById(R.id.Lv_PN5);
        Lv_PN6 = (LinearLayout) findViewById(R.id.Lv_PN6);
        Lv_PN7 = (LinearLayout) findViewById(R.id.Lv_PN7);

                txt_PN1=(EditText)findViewById(R.id.txt_PN1);
                txt_PN2=(EditText)findViewById(R.id.txt_PN2);
                txt_PN3=(EditText)findViewById(R.id.txt_PN3);
                txt_PN4=(EditText)findViewById(R.id.txt_PN4);
                txt_PN5=(EditText)findViewById(R.id.txt_PN5);
                txt_PN6=(EditText)findViewById(R.id.txt_PN6);
                txt_PN7=(EditText)findViewById(R.id.txt_PN7);


        btn_next = (Button) findViewById(R.id.btn_Next_Pn);


    }




    public void fun_asignment() {

        PN1 = "0";
        PN2 = "0";
        PN3 = "0";
        PN4 = "0";
        PN5 = "0";
        PN6 = "0";
        PN7 = "0";



        if(txt_PN1.getText().toString().length()>0)
        {
            PN1=txt_PN1.getText().toString();
        }
        if(txt_PN2.getText().toString().length()>0)
        {
            PN2=txt_PN2.getText().toString();
        }
        if(txt_PN3.getText().toString().length()>0)
        {
            PN3=txt_PN3.getText().toString();
        }
        if(txt_PN4.getText().toString().length()>0)
        {
            PN4=txt_PN4.getText().toString();
        }
        if(txt_PN5.getText().toString().length()>0)
        {
            PN5=txt_PN5.getText().toString();
        }
        if(txt_PN6.getText().toString().length()>0)
        {
            PN6=txt_PN6.getText().toString();
        }
        if(txt_PN7.getText().toString().length()>0)
        {
            PN7=txt_PN7.getText().toString();
        }


    }


    public void insertdata() {


        String query = "Update  " +
                "ttable set " +

                "txt_PN1='" + PN1 + "'," +
                "txt_PN2='" + PN2 + "'," +
                "txt_PN3='" + PN3 + "'," +
                "txt_PN4='" + PN4 + "'," +
                "txt_PN5='" + PN5 + "'," +
                "txt_PN6='" + PN6 + "'," +
                "txt_PN7='" + PN7 + "'," +


                " where id=" + globale.db_pk;


        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(this);

        database.execSQL(query);

        Toast.makeText(this, "Data Saved  successfully", Toast.LENGTH_SHORT).show();


    }


    @Override
    public void onBackPressed() {

        final AlertDialog b = new AlertDialog.Builder(this).create();

        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialog_back, null);
        b.setView(v);


        Button btnPending = (Button) v.findViewById(R.id.btn_dialog_back_pending);
        Button btnCancel = (Button) v.findViewById(R.id.btn_dialog_back_cancel);


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pneuonia_txt.super.onBackPressed();


                b.cancel();
            }
        });

        btnPending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b.cancel();

            }
        });


        //show dialog
        b.show();

    }

    void next_step() {


        if(globale.PN1.equals("0"))
        {
         Lv_PN1.setVisibility(View.GONE);
        }
        if(globale.PN2.equals("0"))
        {
            Lv_PN2.setVisibility(View.GONE);
        }
        if(globale.PN3.equals("0"))
        {
            Lv_PN3.setVisibility(View.GONE);
        }
        if(globale.PN4.equals("0"))
        {
            Lv_PN4.setVisibility(View.GONE);
        }
        if(globale.PN5.equals("0"))
        {
            Lv_PN5.setVisibility(View.GONE);
        }
        if(globale.PN6.equals("0"))
        {
            Lv_PN6.setVisibility(View.GONE);
        }
        if(globale.PN7.equals("0"))
        {
            Lv_PN7.setVisibility(View.GONE);
        }
    }

}
