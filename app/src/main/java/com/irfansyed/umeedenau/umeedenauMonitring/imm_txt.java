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


public  class imm_txt extends AppCompatActivity implements View.OnClickListener {









    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;


    String
        I1	,
        I2	,
        I3	,
        I4	,
        I5	,
        I6	,
        I7	,
        I8	,
        I9	,
        I10	,
        I11	;



    LinearLayout

            Lv_I1,
            Lv_I2,
            Lv_I3,
            Lv_I4,
            Lv_I5,
            Lv_I6,
            Lv_I7,
            Lv_I8,
            Lv_I9,
            Lv_I10,
            Lv_I11;



    EditText

            txt_I1	,
            txt_I2	,
            txt_I3	,
            txt_I4	,
            txt_I5	,
            txt_I6	,
            txt_I7	,
            txt_I8	,
            txt_I9	,
            txt_I10	,
            txt_I11	;


    Button btn_next;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.immun_txt);
        fun_intia_view();

        set_visibilty();

        btn_next.setOnClickListener(this);









    }






    @Override
    public void onClick(View view)
    {



        if(view.getId()==R.id.btn_next_I)
        {


                this.fun_asignment();
                insertdata();

                Intent itt=new Intent(this,finall.class);
                startActivity(itt);
            this.finish();



        }

    }









    public void fun_intia_view()
    {
        Lv_I1=(LinearLayout) findViewById(R.id.Lv_I1);
        Lv_I2=(LinearLayout) findViewById(R.id.Lv_I2);
        Lv_I3=(LinearLayout) findViewById(R.id.Lv_I3);
        Lv_I4=(LinearLayout) findViewById(R.id.Lv_I4);
        Lv_I5=(LinearLayout) findViewById(R.id.Lv_I5);
        Lv_I6=(LinearLayout) findViewById(R.id.Lv_I6);
        Lv_I7=(LinearLayout) findViewById(R.id.Lv_I7);
        Lv_I8=(LinearLayout) findViewById(R.id.Lv_I8);
        Lv_I9=(LinearLayout) findViewById(R.id.Lv_I9);
        Lv_I10=(LinearLayout) findViewById(R.id.Lv_I10);
        Lv_I11=(LinearLayout) findViewById(R.id.Lv_I11);



                txt_I1=(EditText)findViewById(R.id. txt_I1);
                txt_I2=(EditText)findViewById(R.id. txt_I2);
                txt_I3=(EditText)findViewById(R.id. txt_I3);
                txt_I4=(EditText)findViewById(R.id. txt_I4);
                txt_I5=(EditText)findViewById(R.id. txt_I5);
                txt_I6=(EditText)findViewById(R.id. txt_I6);
                txt_I7=(EditText)findViewById(R.id. txt_I7);
                txt_I8=(EditText)findViewById(R.id. txt_I8);
                txt_I9=(EditText)findViewById(R.id. txt_I9);
                txt_I10=(EditText)findViewById(R.id.txt_I10);
                txt_I11=(EditText)findViewById(R.id.txt_I11);


        btn_next=(Button)findViewById(R.id.btn_next_I);



    }

    // switcher counter










    public  void fun_asignment()
    {

        I1="0";
        I2="0";
        I3="0";
        I4="0";
        I5="0";
        I6="0";
        I7="0";
        I8="0";
        I9="0";
        I10="0";
        I11="0";






      if(txt_I1.getText().toString().length()>0)
      {
          I1=txt_I1.getText().toString();
      }
        if(txt_I2.getText().toString().length()>0)
        {
            I2=txt_I2.getText().toString();
        }
        if(txt_I3.getText().toString().length()>0)
        {
            I3=txt_I3.getText().toString();
        }
        if(txt_I1.getText().toString().length()>0)
        {
            I4=txt_I4.getText().toString();
        }
        if(txt_I5.getText().toString().length()>0)
        {
            I5=txt_I5.getText().toString();
        }
        if(txt_I6.getText().toString().length()>0)
        {
            I6=txt_I6.getText().toString();
        }
        if(txt_I7.getText().toString().length()>0)
        {
            I7=txt_I7.getText().toString();
        }
        if(txt_I8.getText().toString().length()>0)
        {
            I8=txt_I8.getText().toString();
        }
        if(txt_I9.getText().toString().length()>0)
        {
            I9=txt_I9.getText().toString();
        }
        if(txt_I10.getText().toString().length()>0)
        {
            I10=txt_I10.getText().toString();
        }
        if(txt_I11.getText().toString().length()>0)
        {
            I11=txt_I11.getText().toString();
        }






    }




    public void insertdata() {









        String query = "Update  " +
                "ttable set "+

                "txt_I1='"+I1+"',"+
                "txt_I2='"+I2+"',"+
                "txt_I3='"+I3+"',"+
                "txt_I4='"+I4+"',"+
                "txt_I5='"+I5+"',"+
                "txt_I6='"+I6+"',"+
                "txt_I7='"+I7+"',"+
                "txt_I8='"+I8+"',"+
                "txt_I9='"+I9+"',"+
                "txt_I10='"+I10+"',"+
                "txt_I11='"+I11+"'"+




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
                imm_txt.super.onBackPressed();


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



    void set_visibilty()
    {
        if(globale.I1.equals("0"))
        {
            Lv_I1.setVisibility(View.GONE);
        }
        if(globale.I2.equals("0"))
        {
            Lv_I2.setVisibility(View.GONE);
        }
        if(globale.I3.equals("0"))
        {
            Lv_I3.setVisibility(View.GONE);
        }

        if(globale.I4.equals("0"))
        {
            Lv_I4.setVisibility(View.GONE);
        }

        if(globale.I5.equals("0"))
        {
            Lv_I5.setVisibility(View.GONE);
        }

        if(globale.I6.equals("0"))
        {
            Lv_I6.setVisibility(View.GONE);
        }
        if(globale.I7.equals("0"))
        {
            Lv_I7.setVisibility(View.GONE);
        }
        if(globale.I8.equals("0"))
        {
            Lv_I8.setVisibility(View.GONE);
        }
        if(globale.I9.equals("0"))
        {
            Lv_I9.setVisibility(View.GONE);
        }

        if(globale.I10.equals("0"))
        {
            Lv_I10.setVisibility(View.GONE);
        }
        if(globale.I11.equals("0"))
        {
            Lv_I11.setVisibility(View.GONE);
        }









    }
}
