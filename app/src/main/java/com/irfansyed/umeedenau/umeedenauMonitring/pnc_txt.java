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


public  class pnc_txt extends AppCompatActivity implements View.OnClickListener {









    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;


    LinearLayout
            Lv_PNC1,
            Lv_PNC2,
            Lv_PNC3,
            Lv_PNC4,
            Lv_PNC5,
            Lv_PNC6,
            Lv_PNC7,
            Lv_PNC8,
            Lv_PNC9,
            Lv_PNC10,
            Lv_PNC11,
            Lv_PNC12;






    Button btn_next;

    String
            PNC1,
            PNC2,
            PNC3,
            PNC4,
            PNC5,
            PNC6,
            PNC7,
            PNC8,
            PNC9,
            PNC10,
            PNC11,
            PNC12;


    EditText
            txt_PNC1,
            txt_PNC2,
            txt_PNC3,
            txt_PNC4,
            txt_PNC5,
            txt_PNC6,
            txt_PNC7,
            txt_PNC8,
            txt_PNC9,
            txt_PNC10,
            txt_PNC11,
            txt_PNC12;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pnc_txt);
        fun_intia_view();






        fun_intia_view();

        set_visiblity();


        btn_next.setOnClickListener(this);




    }






    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.btn_next_PNC)
        {


                this.fun_asignment();
                insertdata();

                Intent itt=new Intent(this,finall.class);
                startActivity(itt);
            this.finish();





        }


    }









    // initilalzie VIews

    public void fun_intia_view()
    {
        Lv_PNC1=(LinearLayout) findViewById(R.id.Lv_PNC1);
        Lv_PNC2=(LinearLayout) findViewById(R.id.Lv_PNC2);
        Lv_PNC3=(LinearLayout) findViewById(R.id.Lv_PNC3);
        Lv_PNC4=(LinearLayout) findViewById(R.id.Lv_PNC4);
        Lv_PNC5=(LinearLayout) findViewById(R.id.Lv_PNC5);
        Lv_PNC6=(LinearLayout) findViewById(R.id.Lv_PNC6);
        Lv_PNC7=(LinearLayout) findViewById(R.id.Lv_PNC7);
        Lv_PNC8=(LinearLayout) findViewById(R.id.Lv_PNC8);
        Lv_PNC9=(LinearLayout) findViewById(R.id.Lv_PNC9);
        Lv_PNC10=(LinearLayout) findViewById(R.id.Lv_PNC10);
        Lv_PNC11=(LinearLayout) findViewById(R.id.Lv_PNC11);
        Lv_PNC12=(LinearLayout) findViewById(R.id.Lv_PNC12);



                txt_PNC1=(EditText)findViewById(R.id. txt_PNC1);
                txt_PNC2=(EditText)findViewById(R.id. txt_PNC2);
                txt_PNC3=(EditText)findViewById(R.id. txt_PNC3);
                txt_PNC4=(EditText)findViewById(R.id. txt_PNC4);
                txt_PNC5=(EditText)findViewById(R.id. txt_PNC5);
                txt_PNC6=(EditText)findViewById(R.id. txt_PNC6);
                txt_PNC7=(EditText)findViewById(R.id. txt_PNC7);
                txt_PNC8=(EditText)findViewById(R.id. txt_PNC8);
                txt_PNC9=(EditText)findViewById(R.id. txt_PNC9);
                txt_PNC10=(EditText)findViewById(R.id. txt_PNC10);
                txt_PNC11=(EditText)findViewById(R.id. txt_PNC11);
                txt_PNC12=(EditText)findViewById(R.id. txt_PNC12);


        btn_next=(Button)findViewById(R.id.btn_next_PNC);



    }







    public  void fun_asignment()
    {

       PNC1="0";
       PNC2="0";
       PNC3="0";
       PNC4="0";
       PNC5="0";
       PNC6="0";
       PNC7="0";
       PNC8="0";
       PNC9="0";
       PNC10="0";
       PNC11="0";
       PNC12="0";


       if(txt_PNC1.getText().toString().length()>0)
       {
           PNC1=txt_PNC1.getText().toString();
       }
        if(txt_PNC2.getText().toString().length()>0)
        {
            PNC2=txt_PNC2.getText().toString();
        }
        if(txt_PNC3.getText().toString().length()>0)
        {
            PNC3=txt_PNC3.getText().toString();
        }
        if(txt_PNC4.getText().toString().length()>0)
        {
            PNC4=txt_PNC4.getText().toString();
        }
        if(txt_PNC5.getText().toString().length()>0)
        {
            PNC5=txt_PNC5.getText().toString();
        }
        if(txt_PNC6.getText().toString().length()>0)
        {
            PNC6=txt_PNC6.getText().toString();
        }
        if(txt_PNC7.getText().toString().length()>0)
        {
            PNC7=txt_PNC7.getText().toString();
        }
        if(txt_PNC8.getText().toString().length()>0)
        {
            PNC8=txt_PNC8.getText().toString();
        }
        if(txt_PNC9.getText().toString().length()>0)
        {
            PNC9=txt_PNC9.getText().toString();
        }
        if(txt_PNC10.getText().toString().length()>0)
        {
            PNC10=txt_PNC10.getText().toString();
        }
        if(txt_PNC11.getText().toString().length()>0)
        {
            PNC11=txt_PNC11.getText().toString();
        }
        if(txt_PNC12.getText().toString().length()>0)
        {
            PNC12=txt_PNC12.getText().toString();
        }







    }






    public void insertdata() {









        String query = "Update  " +
                "ttable set "+

                "PNC1='"+PNC1+"',"+
                "PNC2='"+PNC2+"',"+
                "PNC3='"+PNC3+"',"+
                "PNC4='"+PNC4+"',"+
                "PNC5='"+PNC5+"',"+
                "PNC6='"+PNC6+"',"+
                "PNC7='"+PNC7+"',"+
                "PNC8='"+PNC8+"',"+
                "PNC9='"+PNC9+"',"+
                "PNC10='"+PNC10+"',"+
                "PNC11='"+PNC11+"',"+
                "PNC12='"+PNC12+"'"+


                " where id="+globale.db_pk;




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
            public void onClick(View view)
            {
                pnc_txt.super.onBackPressed();


                b.cancel();
            }
        });

        btnPending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                b.cancel();

            }
        });




        //show dialog
        b.show();

    }


    void set_visiblity()
    {
        if(globale.PNC1.equals("0"))
        {
            Lv_PNC1.setVisibility(View.GONE);
        }
        if(globale.PNC2.equals("0"))
        {
            Lv_PNC2.setVisibility(View.GONE);
        }

        if(globale.PNC3.equals("0"))
        {
            Lv_PNC3.setVisibility(View.GONE);
        }

        if(globale.PNC4.equals("0"))
        {
            Lv_PNC4.setVisibility(View.GONE);
        }

        if(globale.PNC5.equals("0"))
        {
            Lv_PNC5.setVisibility(View.GONE);
        }

        if(globale.PNC6.equals("0"))
        {
            Lv_PNC6.setVisibility(View.GONE);
        }

        if(globale.PNC7.equals("0"))
        {
            Lv_PNC7.setVisibility(View.GONE);
        }

        if(globale.PNC8.equals("0"))
        {
            Lv_PNC8.setVisibility(View.GONE);
        }

        if(globale.PNC9.equals("0"))
        {
            Lv_PNC9.setVisibility(View.GONE);
        }

        if(globale.PNC10.equals("0"))
        {
            Lv_PNC10.setVisibility(View.GONE);
        }

        if(globale.PNC11.equals("0"))
        {
            Lv_PNC11.setVisibility(View.GONE);
        }

        if(globale.PNC12.equals("0"))
        {
            Lv_PNC12.setVisibility(View.GONE);
        }

    }

}
