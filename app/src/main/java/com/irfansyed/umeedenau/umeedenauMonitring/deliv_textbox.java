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


public  class deliv_textbox extends AppCompatActivity implements View.OnClickListener {







//region Initialization

    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;



    LinearLayout

    Lv_D1,
    Lv_D2,
    Lv_D3,
    Lv_D4,
    Lv_D5,
    Lv_D6,
    Lv_D7,
    Lv_D8,
    Lv_D9,
    Lv_D10,
    Lv_D11,
    Lv_D12,
    Lv_D13,
    Lv_D14,
    Lv_D15,
    Lv_D16,
    Lv_D17,
    Lv_D18,
    Lv_D19,
    Lv_D20,
    Lv_D21,
            Lv_D22,
    Lv_D23;

EditText

        txt_D1	,
        txt_D2	,
        txt_D3	,
        txt_D4	,
        txt_D5	,
        txt_D6	,
        txt_D7	,
        txt_D8	,
        txt_D9	,
        txt_D10	,
        txt_D11	,
        txt_D12	,
        txt_D13	,
        txt_D14	,
        txt_D15	,
        txt_D16	,
        txt_D17	,
        txt_D18	,
        txt_D19	,
        txt_D20	,
        txt_D21	,
        txt_D22,
        txt_D23;

    
    Button btn_next;
String  D1	,
        D2	,
        D3	,
        D4	,
        D5	,
        D6	,
        D7	,
        D8	,
        D9	,
        D10	,
        D11	,
        D12	,
        D13	,
        D14	,
        D15	,
        D16	,
        D17	,
        D18	,
        D19	,
        D20	,
        D21	,
        D22,
        D23;






    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_textbox);
        fun_intia_view();


        fun_check_visibilty();


        btn_next.setOnClickListener(this);


    }




    boolean yesok=true;

    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.Button_Next_D)
        {



                this.fun_asignment();
                insertdata();


            Intent itt=new Intent(this,finall_txt.class);
            startActivity(itt);
            this.finish();




        }


    }









    // initilalzie VIews

    // initilalzie VIews

    public void fun_intia_view()
    {
        Lv_D1=(LinearLayout) findViewById(R.id.Lv_D1);
        Lv_D2=(LinearLayout) findViewById(R.id.Lv_D2);
        Lv_D3=(LinearLayout) findViewById(R.id.Lv_D3);
        Lv_D4=(LinearLayout) findViewById(R.id.Lv_D4);
        Lv_D5=(LinearLayout) findViewById(R.id.Lv_D5);
        Lv_D6=(LinearLayout) findViewById(R.id.Lv_D6);
        Lv_D7=(LinearLayout) findViewById(R.id.Lv_D7);
        Lv_D8=(LinearLayout) findViewById(R.id.Lv_D8);
        Lv_D9=(LinearLayout) findViewById(R.id.Lv_D9);
        Lv_D10=(LinearLayout) findViewById(R.id.Lv_D10);
        Lv_D11=(LinearLayout) findViewById(R.id.Lv_D11);
        Lv_D12=(LinearLayout) findViewById(R.id.Lv_D12);
        Lv_D13=(LinearLayout) findViewById(R.id.Lv_D13);
        Lv_D14=(LinearLayout) findViewById(R.id.Lv_D14);
        Lv_D15=(LinearLayout) findViewById(R.id.Lv_D15);
        Lv_D16=(LinearLayout) findViewById(R.id.Lv_D16);
        Lv_D17=(LinearLayout) findViewById(R.id.Lv_D17);
        Lv_D18=(LinearLayout) findViewById(R.id.Lv_D18);
        Lv_D19=(LinearLayout) findViewById(R.id.Lv_D19);
        Lv_D20=(LinearLayout) findViewById(R.id.Lv_D20);
        Lv_D21=(LinearLayout) findViewById(R.id.Lv_D21);
        Lv_D22=(LinearLayout) findViewById(R.id.Lv_D22);
        Lv_D23=(LinearLayout) findViewById(R.id.Lv_D23);


         txt_D1	=(EditText)findViewById(R.id.txt_D1	);
         txt_D2	=(EditText)findViewById(R.id.txt_D2	);
         txt_D3	=(EditText)findViewById(R.id.txt_D3	);
         txt_D4	=(EditText)findViewById(R.id.txt_D4	);
         txt_D5	=(EditText)findViewById(R.id.txt_D5	);
         txt_D6	=(EditText)findViewById(R.id.txt_D6	);
         txt_D7	=(EditText)findViewById(R.id.txt_D7	);
         txt_D8	=(EditText)findViewById(R.id.txt_D8	);
         txt_D9	=(EditText)findViewById(R.id.txt_D9	);
         txt_D10=(EditText)findViewById(R.id.txt_D10);
         txt_D11=(EditText)findViewById(R.id.txt_D11);
         txt_D12=(EditText)findViewById(R.id.txt_D12);
         txt_D13=(EditText)findViewById(R.id.txt_D13);
         txt_D14=(EditText)findViewById(R.id.txt_D14);
         txt_D15=(EditText)findViewById(R.id.txt_D15);
         txt_D16=(EditText)findViewById(R.id.txt_D16);
         txt_D17=(EditText)findViewById(R.id.txt_D17);
         txt_D18=(EditText)findViewById(R.id.txt_D18);
         txt_D19=(EditText)findViewById(R.id.txt_D19);
         txt_D20=(EditText)findViewById(R.id.txt_D20);
         txt_D21=(EditText)findViewById(R.id.txt_D21);
         txt_D22=(EditText)findViewById(R.id.txt_D22);
         txt_D23=(EditText)findViewById(R.id.txt_D23);






























    }












    public  void fun_asignment()
    {

        D1="0";
        D2="0";
        D3="0";
        D4="0";
        D5="0";
        D6="0";
        D7="0";
        D8="0";
        D9="0";
        D10="0";
        D11="0";
        D12="0";
        D13="0";
        D14="0";
        D15="0";
        D16="0";
        D17="0";
        D18="0";
        D19="0";
        D20="0";
        D21="0";
        D22="0";
        D23="0";
     


        if(txt_D1.getText().toString().length()>0)
        {
            D1=txt_D1.getText().toString();
        }
        if(txt_D2.getText().toString().length()>0)
        {
            D2=txt_D2.getText().toString();
        }
        if(txt_D3.getText().toString().length()>0)
        {
            D3=txt_D3.getText().toString();
        }
        if(txt_D4.getText().toString().length()>0)
        {
            D4=txt_D4.getText().toString();
        }
        if(txt_D5.getText().toString().length()>0)
        {
            D5=txt_D5.getText().toString();
        }
        if(txt_D6.getText().toString().length()>0)
        {
            D6=txt_D6.getText().toString();
        }
        if(txt_D7.getText().toString().length()>0)
        {
            D7=txt_D7.getText().toString();
        }
        if(txt_D8.getText().toString().length()>0)
        {
            D8=txt_D8.getText().toString();
        }
        if(txt_D9.getText().toString().length()>0)
        {
            D9=txt_D9.getText().toString();
        }
        if(txt_D10.getText().toString().length()>0)
        {
            D10=txt_D10.getText().toString();
        }
        if(txt_D11.getText().toString().length()>0)
        {
            D11=txt_D11.getText().toString();
        }
        if(txt_D12.getText().toString().length()>0)
        {
            D12=txt_D12.getText().toString();
        }
        if(txt_D13.getText().toString().length()>0)
        {
            D13=txt_D13.getText().toString();
        }
        if(txt_D14.getText().toString().length()>0)
        {
            D14=txt_D14.getText().toString();
        }
        if(txt_D15.getText().toString().length()>0)
        {
            D15=txt_D15.getText().toString();
        }
        if(txt_D16.getText().toString().length()>0)
        {
            D16=txt_D16.getText().toString();
        }
        if(txt_D17.getText().toString().length()>0)
        {
            D17=txt_D17.getText().toString();
        }
        if(txt_D18.getText().toString().length()>0)
        {
            D18=txt_D18.getText().toString();
        }
        if(txt_D19.getText().toString().length()>0)
        {
            D19=txt_D19.getText().toString();
        }
        if(txt_D20.getText().toString().length()>0)
        {
            D20=txt_D20.getText().toString();
        }
        if(txt_D21.getText().toString().length()>0)
        {
            D21=txt_D21.getText().toString();
        }
        if(txt_D22.getText().toString().length()>0)
        {
            D22=txt_D22.getText().toString();
        }
        if(txt_D23.getText().toString().length()>0)
        {
            D23=txt_D23.getText().toString();
        }










    }





    public void insertdata() {









        String query = "Update  " +
                "ttable set "+

                "D1='"+D1+"',"+
                "D2='"+D2+"',"+
                "D3='"+D3+"',"+
                "D4='"+D4+"',"+
                "D5='"+D5+"',"+
                "D6='"+D6+"',"+
                "D7='"+D7+"',"+
                "D8='"+D8+"',"+
                "D9='"+D9+"',"+
                "D10='"+D10+"',"+
                "D11='"+D11+"',"+
                "D12='"+D12+"',"+
                "D13='"+D13+"',"+
                "D14='"+D14+"',"+
                "D15='"+D15+"',"+
                "D16='"+D16+"',"+
                "D17='"+D17+"',"+
                "D18='"+D18+"',"+
                "D19='"+D19+"',"+
                "D20='"+D20+"',"+
                "D21='"+D21+"',"+
                "D22='"+D22+"',"+
                "D23='"+D23+"'"+



                " where id="+globale.db_pk;




        query = String.format(query);


        LocalDataManager Lm = new LocalDataManager(this);

        database.execSQL(query);

        Toast.makeText(this, "Data Saved  successfully", Toast.LENGTH_SHORT).show();


    }



    public void  fun_check_visibilty()
    {



       if(globale.f_D1.equals("0"))
    {

        Lv_D1.setVisibility(View.GONE);
    }

        if(globale.f_D2.equals("0"))
        {

            Lv_D2.setVisibility(View.GONE);
        }

        if(globale.f_D3.equals("0"))
        {

            Lv_D3.setVisibility(View.GONE);
        }

        if(globale.f_D4.equals("0"))
        {

            Lv_D4.setVisibility(View.GONE);
        }

        if(globale.f_D5.equals("0"))
        {

            Lv_D5.setVisibility(View.GONE);
        }

        if(globale.f_D6.equals("0"))
        {

            Lv_D6.setVisibility(View.GONE);
        }

        if(globale.f_D7.equals("0"))
        {

            Lv_D7.setVisibility(View.GONE);
        }

        if(globale.f_D8.equals("0"))
        {

            Lv_D8.setVisibility(View.GONE);
        }

        if(globale.f_D9.equals("0"))
        {

            Lv_D9.setVisibility(View.GONE);
        }

        if(globale.f_D10.equals("0"))
        {

            Lv_D10.setVisibility(View.GONE);
        }

        if(globale.f_D11.equals("0"))
        {

            Lv_D11.setVisibility(View.GONE);
        }

        if(globale.f_D12.equals("0"))
        {

            Lv_D12.setVisibility(View.GONE);
        }

        if(globale.f_D13.equals("0"))
        {

            Lv_D13.setVisibility(View.GONE);
        }
        if(globale.f_D14.equals("0"))
        {

            Lv_D14.setVisibility(View.GONE);
        }

        if(globale.f_D15.equals("0"))
        {

            Lv_D15.setVisibility(View.GONE);
        }

        if(globale.f_D16.equals("0"))
        {

            Lv_D16.setVisibility(View.GONE);
        }

        if(globale.f_D17.equals("0"))
        {

            Lv_D17.setVisibility(View.GONE);
        }

        if(globale.f_D18.equals("0"))
        {

            Lv_D18.setVisibility(View.GONE);
        }
        if(globale.f_D19.equals("0"))
        {

            Lv_D19.setVisibility(View.GONE);
        }

        if(globale.f_D20.equals("0"))
        {

            Lv_D20.setVisibility(View.GONE);
        }

        if(globale.f_D21.equals("0"))
        {

            Lv_D21.setVisibility(View.GONE);
        }

        if(globale.f_D22.equals("0"))
        {

            Lv_D22.setVisibility(View.GONE);
        }

        if(globale.f_D23.equals("0"))
        {

            Lv_D23.setVisibility(View.GONE);
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
                deliv_textbox.super.onBackPressed();


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
