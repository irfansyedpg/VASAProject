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


public  class diarhea_txt extends AppCompatActivity implements View.OnClickListener {









    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;

    String

            DI1	,
            DI2	,
            DI3	,
            DI4	,
            DI5	,
            DI6	,
            DI7	,
            DI8	,
            DI9	,
            DI10	,
            DI11	;


    LinearLayout

           Lv_DI1,
           Lv_DI2,
           Lv_DI3,
           Lv_DI4,
           Lv_DI5,
           Lv_DI6,
           Lv_DI7,
           Lv_DI8,
           Lv_DI9,
           Lv_DI10,
           Lv_DI11;


  EditText

          txt_DI1	,
          txt_DI2	,
          txt_DI3	,
          txt_DI4	,
          txt_DI5	,
          txt_DI6	,
          txt_DI7	,
          txt_DI8	,
          txt_DI9	,
          txt_DI10	,
          txt_DI11	;




    Button btn_next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diarrhea_txt);
        fun_DIntia_view();

        set_visiblity();




        btn_next.setOnClickListener(this);





    }




    boolean yesok=true;

    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.btn_next_DI)
        {

                this.fun_asignment();
                insertdata();

                Intent itt=new Intent(this,finall.class);
                startActivity(itt);
                this.finish();



        }


    }








    public void fun_DIntia_view()
    {
       Lv_DI1=(LinearLayout) findViewById(R.id.Lv_DI1);
       Lv_DI2=(LinearLayout) findViewById(R.id.Lv_DI2);
       Lv_DI3=(LinearLayout) findViewById(R.id.Lv_DI3);
       Lv_DI4=(LinearLayout) findViewById(R.id.Lv_DI4);
       Lv_DI5=(LinearLayout) findViewById(R.id.Lv_DI5);
       Lv_DI6=(LinearLayout) findViewById(R.id.Lv_DI6);
       Lv_DI7=(LinearLayout) findViewById(R.id.Lv_DI7);
       Lv_DI8=(LinearLayout) findViewById(R.id.Lv_DI8);
       Lv_DI9=(LinearLayout) findViewById(R.id.Lv_DI9);
       Lv_DI10=(LinearLayout) findViewById(R.id.Lv_DI10);
       Lv_DI11=(LinearLayout) findViewById(R.id.Lv_DI11);


        txt_DI1=(EditText)findViewById(R.id.txt_DI1);
                txt_DI2=(EditText)findViewById(R.id.txt_DI2);
        txt_DI3=(EditText)findViewById(R.id.txt_DI3);
                txt_DI4=(EditText)findViewById(R.id.txt_DI4);
        txt_DI5=(EditText)findViewById(R.id.txt_DI5);
                txt_DI6=(EditText)findViewById(R.id.txt_DI6);
        txt_DI7=(EditText)findViewById(R.id.txt_DI7);
                txt_DI8=(EditText)findViewById(R.id.txt_DI8);
        txt_DI9=(EditText)findViewById(R.id.txt_DI9);
                txt_DI10=(EditText)findViewById(R.id.txt_DI10);
        txt_DI11=(EditText)findViewById(R.id.txt_DI11);

        btn_next=(Button)findViewById(R.id.btn_next_DI);



    }








    public  void fun_asignment()
    {

        DI1="0";
        DI2="0";
        DI3="0";
        DI4="0";
        DI5="0";
        DI6="0";
        DI7="0";
        DI8="0";
        DI9="0";
        DI10="0";
        DI11="0";



        if(txt_DI1.getText().toString().length()>0)
        {
            DI1=txt_DI1.getText().toString();
        }
        if(txt_DI2.getText().toString().length()>0)
        {
            DI2=txt_DI2.getText().toString();
        }
        if(txt_DI3.getText().toString().length()>0)
        {
            DI3=txt_DI3.getText().toString();
        }
        if(txt_DI4.getText().toString().length()>0)
        {
            DI4=txt_DI4.getText().toString();
        }
        if(txt_DI5.getText().toString().length()>0)
        {
            DI5=txt_DI5.getText().toString();
        }
        if(txt_DI6.getText().toString().length()>0)
        {
            DI6=txt_DI6.getText().toString();
        }
        if(txt_DI7.getText().toString().length()>0)
        {
            DI7=txt_DI7.getText().toString();
        }
        if(txt_DI8.getText().toString().length()>0)
        {
            DI8=txt_DI8.getText().toString();
        }
        if(txt_DI9.getText().toString().length()>0)
        {
            DI9=txt_DI9.getText().toString();
        }
        if(txt_DI10.getText().toString().length()>0)
        {
            DI10=txt_DI10.getText().toString();
        }
        if(txt_DI11.getText().toString().length()>0)
        {
            DI11=txt_DI11.getText().toString();
        }


    }




    public void insertdata() {









        String query = "Update  " +
                "ttable set "+

                "txt_DI1='"+DI1+"',"+
                "txt_DI2='"+DI2+"',"+
                "txt_DI3='"+DI3+"',"+
                "txt_DI4='"+DI4+"',"+
                "txt_DI5='"+DI5+"',"+
                "txt_DI6='"+DI6+"',"+
                "txt_DI7='"+DI7+"',"+
                "txt_DI8='"+DI8+"',"+
                "txt_DI9='"+DI9+"',"+
                "txt_DI10='"+DI10+"',"+
                "txt_DI11='"+DI11+"'"+




                " where id="+globale.db_pk;




        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(this);

        database.execSQL(query);

        Toast.makeText(this, "Data Saved  successfully", Toast.LENGTH_SHORT).show();


    }



    public void  set_visiblity()
    {


        if(globale.DI1.equals("0"))
        {
            Lv_DI1.setVisibility(View.GONE);
        }
        if(globale.DI2.equals("0"))
        {
            Lv_DI2.setVisibility(View.GONE);
        }
        if(globale.DI3.equals("0"))
        {
            Lv_DI3.setVisibility(View.GONE);
        }

        if(globale.DI4.equals("0"))
        {
            Lv_DI4.setVisibility(View.GONE);
        }
        if(globale.DI5.equals("0"))
        {
            Lv_DI5.setVisibility(View.GONE);
        }
        if(globale.DI6.equals("0"))
        {
            Lv_DI6.setVisibility(View.GONE);
        }
        if(globale.DI7.equals("0"))
        {
            Lv_DI7.setVisibility(View.GONE);
        }
        if(globale.DI8.equals("0"))
        {
            Lv_DI8.setVisibility(View.GONE);
        }
        if(globale.DI9.equals("0"))
        {
            Lv_DI9.setVisibility(View.GONE);
        }
        if(globale.DI10.equals("0"))
        {
            Lv_DI10.setVisibility(View.GONE);
        }
        if(globale.DI11.equals("0"))
        {
            Lv_DI11.setVisibility(View.GONE);
        }




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
                diarhea_txt.super.onBackPressed();


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



}
