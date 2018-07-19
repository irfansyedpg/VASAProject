package com.irfansyed.umeedenau.umeedenauMonitring;

import android.app.ProgressDialog;
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


public  class finall_txt extends AppCompatActivity implements View.OnClickListener {









    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;



    String

            PN8	,
            PN9	,
            PN10	,
            PN11	,
            PN12	,
            PN13	,
            PN14	,
            PN15	,
            PN16	,
            PN17	,
            PN18	,
            PN19	,
            PN20	,
            PN21	;



    LinearLayout

            Lv_PN8,
            Lv_PN9,
            Lv_PN10,
            Lv_PN11,
            Lv_PN12,
            Lv_PN13,
            Lv_PN14,
            Lv_PN15,
            Lv_PN16,
            Lv_PN17,
            Lv_PN18,
            Lv_PN19,
            Lv_PN20,
            Lv_PN21;



   EditText
           txt_PN8	,
           txt_PN9	,
           txt_PN10	,
           txt_PN11	,
           txt_PN12	,
           txt_PN13	,
           txt_PN14	,
           txt_PN15	,
           txt_PN16	,
           txt_PN17	,
           txt_PN18	,
           txt_PN19	,
           txt_PN20	,
           txt_PN21	;


    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finall_txt);
        fun_intia_view();

        next_step();



        btn_next.setOnClickListener(this);






    }




    boolean yesok=true;

    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.btn_Next_Pn)
        {


                this.fun_asignment();
                insertdata();
                this.next_step();

                Toast.makeText(this,"Your Data Saved Succefuly",Toast.LENGTH_LONG).show();
                this.finish();



        }



    }












    // initilalzie VIews

    public void fun_intia_view()
    {

        Lv_PN8=(LinearLayout) findViewById(R.id.Lv_PN8);
        Lv_PN9=(LinearLayout) findViewById(R.id.Lv_PN9);
        Lv_PN10=(LinearLayout) findViewById(R.id.Lv_PN10);
        Lv_PN11=(LinearLayout) findViewById(R.id.Lv_PN11);
        Lv_PN12=(LinearLayout) findViewById(R.id.Lv_PN12);
        Lv_PN13=(LinearLayout) findViewById(R.id.Lv_PN13);
        Lv_PN14=(LinearLayout) findViewById(R.id.Lv_PN14);
        Lv_PN15=(LinearLayout) findViewById(R.id.Lv_PN15);
        Lv_PN16=(LinearLayout) findViewById(R.id.Lv_PN16);
        Lv_PN17=(LinearLayout) findViewById(R.id.Lv_PN17);
        Lv_PN18=(LinearLayout) findViewById(R.id.Lv_PN18);
        Lv_PN19=(LinearLayout) findViewById(R.id.Lv_PN19);
        Lv_PN20=(LinearLayout) findViewById(R.id.Lv_PN20);
        Lv_PN21=(LinearLayout) findViewById(R.id.Lv_PN21);




                txt_PN8	=(EditText)findViewById(R.id.txt_PN8	);
                txt_PN9	=(EditText)findViewById(R.id.txt_PN9	);
                txt_PN10=(EditText)findViewById(R.id.txt_PN10);
                txt_PN11=(EditText)findViewById(R.id.txt_PN11);
                txt_PN12=(EditText)findViewById(R.id.txt_PN12);
                txt_PN13=(EditText)findViewById(R.id.txt_PN13);
                txt_PN14=(EditText)findViewById(R.id.txt_PN14);
                txt_PN15=(EditText)findViewById(R.id.txt_PN15);
                txt_PN16=(EditText)findViewById(R.id.txt_PN16);
                txt_PN17=(EditText)findViewById(R.id.txt_PN17);
                txt_PN18=(EditText)findViewById(R.id.txt_PN18);
                txt_PN19=(EditText)findViewById(R.id.txt_PN19);
                txt_PN20=(EditText)findViewById(R.id.txt_PN20);
                txt_PN21=(EditText)findViewById(R.id.txt_PN21);

        btn_next=(Button)findViewById(R.id.btn_Next_Pn);



    }



    // switcher counter








    public  void fun_asignment()
    {


       PN8="0";
       PN9="0";
       PN10="0";
       PN11="0";
       PN12="0";
       PN13="0";
       PN14="0";
       PN15="0";
       PN16="0";
       PN17="0";
       PN18="0";
       PN19="0";
       PN20="0";
       PN21="0";




       if(txt_PN8.getText().toString().length()>0)
       {
           PN8=txt_PN8.getText().toString();
       }
        if(txt_PN9.getText().toString().length()>0)
        {
            PN9=txt_PN9.getText().toString();
        }
        if(txt_PN10.getText().toString().length()>0)
        {
            PN10=txt_PN10.getText().toString();
        }
        if(txt_PN11.getText().toString().length()>0)
        {
            PN11=txt_PN11.getText().toString();
        }
        if(txt_PN12.getText().toString().length()>0)
        {
            PN12=txt_PN12.getText().toString();
        }
        if(txt_PN13.getText().toString().length()>0)
        {
            PN13=txt_PN13.getText().toString();
        }
        if(txt_PN14.getText().toString().length()>0)
        {
            PN14=txt_PN14.getText().toString();
        }
        if(txt_PN15.getText().toString().length()>0)
        {
            PN15=txt_PN15.getText().toString();
        }
        if(txt_PN16.getText().toString().length()>0)
        {
            PN16=txt_PN16.getText().toString();
        }
        if(txt_PN17.getText().toString().length()>0)
        {
            PN17=txt_PN17.getText().toString();
        }
        if(txt_PN18.getText().toString().length()>0)
        {
            PN18=txt_PN18.getText().toString();
        }
        if(txt_PN19.getText().toString().length()>0)
        {
            PN19=txt_PN19.getText().toString();
        }
        if(txt_PN20.getText().toString().length()>0)
        {
            PN20=txt_PN20.getText().toString();
        }
        if(txt_PN21.getText().toString().length()>0)
        {
            PN21=txt_PN21.getText().toString();
        }





    }



    public void insertdata() {









        String query = "Update  " +
                "ttable set "+


                "txt_PN8='"+PN8+"',"+
                "txt_PN9='"+PN9+"',"+
                "txt_PN10='"+PN10+"',"+
                "txt_PN11='"+PN11+"',"+
                "txt_PN12='"+PN12+"',"+
                "txt_PN13='"+PN13+"',"+
                "txt_PN14='"+PN14+"',"+
                "txt_PN15='"+PN15+"',"+
                "txt_PN16='"+PN16+"',"+
                "txt_PN17='"+PN17+"',"+
                "txt_PN18='"+PN18+"',"+
                "txt_PN19='"+PN19+"',"+
                "txt_PN20='"+PN20+"',"+
                "txt_PN21='"+PN21+"'"+


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
                finall_txt.super.onBackPressed();


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


    void next_step()
    {
               if(globale.PN8.equals("0"))
               {
                   Lv_PN8.setVisibility(View.GONE);
               }
        if(globale.PN9.equals("0"))
        {
            Lv_PN9.setVisibility(View.GONE);
        }
        if(globale.PN10.equals("0"))
        {
            Lv_PN10.setVisibility(View.GONE);
        }
        if(globale.PN11.equals("0"))
        {
            Lv_PN11.setVisibility(View.GONE);
        }
        if(globale.PN12.equals("0"))
        {
            Lv_PN12.setVisibility(View.GONE);
        }
        if(globale.PN13.equals("0"))
        {
            Lv_PN13.setVisibility(View.GONE);
        }
        if(globale.PN14.equals("0"))
        {
            Lv_PN14.setVisibility(View.GONE);
        }
        if(globale.PN15.equals("0"))
        {
            Lv_PN15.setVisibility(View.GONE);
        }
        if(globale.PN16.equals("0"))
        {
            Lv_PN16.setVisibility(View.GONE);
        }
        if(globale.PN17.equals("0"))
        {
            Lv_PN17.setVisibility(View.GONE);
        }
        if(globale.PN18.equals("0"))
        {
            Lv_PN18.setVisibility(View.GONE);
        }
        if(globale.PN19.equals("0"))
        {
            Lv_PN19.setVisibility(View.GONE);
        }
        if(globale.PN20.equals("0"))
        {
            Lv_PN20.setVisibility(View.GONE);
        }
        if(globale.PN21.equals("0"))
        {
            Lv_PN21.setVisibility(View.GONE);
        }
    }

}
