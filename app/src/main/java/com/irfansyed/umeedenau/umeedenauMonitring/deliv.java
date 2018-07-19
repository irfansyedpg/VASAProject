package com.irfansyed.umeedenau.umeedenauMonitring;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import data.LocalDataManager;
import data.col_A;
import utils.LocationHelper;

import static data.LocalDataManager.database;


public  class deliv extends AppCompatActivity implements View.OnClickListener {







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

    RadioButton

            rb_D1_yes,
            rb_D2_yes,
            rb_D3_yes,
            rb_D4_yes,
            rb_D5_yes,
            rb_D6_yes,
            rb_D7_yes,
            rb_D8_yes,
            rb_D9_yes,
            rb_D10_yes,
            rb_D11_yes,
            rb_D12_yes,
            rb_D13_yes,
            rb_D14_yes,
            rb_D15_yes,
            rb_D16_yes,
            rb_D17_yes,
            rb_D18_yes,
            rb_D19_yes,
            rb_D20_yes,
            rb_D21_yes,
            rb_D22_yes,
            rb_D23_yes,


            rb_D1_no,
            rb_D2_no,
            rb_D3_no,
            rb_D4_no,
            rb_D5_no,
            rb_D6_no,
            rb_D7_no,
            rb_D8_no,
            rb_D9_no,
            rb_D10_no,
            rb_D11_no,
            rb_D12_no,
            rb_D13_no,
            rb_D14_no,
            rb_D15_no,
            rb_D16_no,
            rb_D17_no,
            rb_D18_no,
            rb_D19_no,
            rb_D20_no,
            rb_D21_no,
    rb_D22_no,
    rb_D23_no;
    
    Button btn_next;
String D1	,
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
        setContentView(R.layout.delivery);
        fun_intia_view();








        btn_next.setOnClickListener(this);


    }




    boolean yesok=true;

    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.Button_Next_D)
        {

            if(yes_we_are_ok()==true)
            {
                this.fun_asignment();
                insertdata();
                fun_next_step();
                Intent intt=new Intent(this,finall.class);
                intt.putExtra("put_extra",2);
                startActivity(intt);
                this.finish();

            }

            else
            {
                Toast.makeText(this,"Some thing is missing! please Review your form.",Toast.LENGTH_LONG);
            }

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


        rb_D1_yes=(RadioButton)findViewById(R.id.rb_D1_yes);
        rb_D2_yes=(RadioButton)findViewById(R.id.rb_D2_yes);
        rb_D3_yes=(RadioButton)findViewById(R.id.rb_D3_yes);
        rb_D4_yes=(RadioButton)findViewById(R.id.rb_D4_yes);
        rb_D5_yes=(RadioButton)findViewById(R.id.rb_D5_yes);
        rb_D6_yes=(RadioButton)findViewById(R.id.rb_D6_yes);
        rb_D7_yes=(RadioButton)findViewById(R.id.rb_D7_yes);
        rb_D8_yes=(RadioButton)findViewById(R.id.rb_D8_yes);
        rb_D9_yes=(RadioButton)findViewById(R.id.rb_D9_yes);
        rb_D10_yes=(RadioButton)findViewById(R.id.rb_D10_yes);
        rb_D11_yes=(RadioButton)findViewById(R.id.rb_D11_yes);
        rb_D12_yes=(RadioButton)findViewById(R.id.rb_D12_yes);
        rb_D13_yes=(RadioButton)findViewById(R.id.rb_D13_yes);
        rb_D14_yes=(RadioButton)findViewById(R.id.rb_D14_yes);
        rb_D15_yes=(RadioButton)findViewById(R.id.rb_D15_yes);
        rb_D16_yes=(RadioButton)findViewById(R.id.rb_D16_yes);
        rb_D17_yes=(RadioButton)findViewById(R.id.rb_D17_yes);
        rb_D18_yes=(RadioButton)findViewById(R.id.rb_D18_yes);
        rb_D19_yes=(RadioButton)findViewById(R.id.rb_D19_yes);
        rb_D20_yes=(RadioButton)findViewById(R.id.rb_D20_yes);
        rb_D21_yes=(RadioButton)findViewById(R.id.rb_D21_yes);
        rb_D22_yes=(RadioButton)findViewById(R.id.rb_D22_yes);
        rb_D23_yes=(RadioButton)findViewById(R.id.rb_D23_yes);

        rb_D1_no=(RadioButton)findViewById(R.id.rb_D1_no);
        rb_D2_no=(RadioButton)findViewById(R.id.rb_D2_no);
        rb_D3_no=(RadioButton)findViewById(R.id.rb_D3_no);
        rb_D4_no=(RadioButton)findViewById(R.id.rb_D4_no);
        rb_D5_no=(RadioButton)findViewById(R.id.rb_D5_no);
        rb_D6_no=(RadioButton)findViewById(R.id.rb_D6_no);
        rb_D7_no=(RadioButton)findViewById(R.id.rb_D7_no);
        rb_D8_no=(RadioButton)findViewById(R.id.rb_D8_no);
        rb_D9_no=(RadioButton)findViewById(R.id.rb_D9_no);
        rb_D10_no=(RadioButton)findViewById(R.id.rb_D10_no);
        rb_D11_no=(RadioButton)findViewById(R.id.rb_D11_no);
        rb_D12_no=(RadioButton)findViewById(R.id.rb_D12_no);
        rb_D13_no=(RadioButton)findViewById(R.id.rb_D13_no);
        rb_D14_no=(RadioButton)findViewById(R.id.rb_D14_no);
        rb_D15_no=(RadioButton)findViewById(R.id.rb_D15_no);
        rb_D16_no=(RadioButton)findViewById(R.id.rb_D16_no);
        rb_D17_no=(RadioButton)findViewById(R.id.rb_D17_no);
        rb_D18_no=(RadioButton)findViewById(R.id.rb_D18_no);
        rb_D19_no=(RadioButton)findViewById(R.id.rb_D19_no);
        rb_D20_no=(RadioButton)findViewById(R.id.rb_D20_no);
        rb_D21_no=(RadioButton)findViewById(R.id.rb_D21_no);
        rb_D22_no=(RadioButton)findViewById(R.id.rb_D22_no);
        rb_D23_no=(RadioButton)findViewById(R.id.rb_D23_no);


        btn_next=(Button)findViewById(R.id.Button_Next_D);



    }





    public  boolean yes_we_are_ok()
    {

        if( fun_avioid_empty_text(Lv_D1)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_D2)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D3)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D4)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D5)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D6)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D7)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D8)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D9)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D10)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D11)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D12)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D13)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_D14)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_D15)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_D16)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D17)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D18)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D19)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D20)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_D21)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D22)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_D23)==false)
        {
            return  false;
        }
      

        return  true;
    }



    public  boolean fun_avioid_empty_text(LinearLayout lv)
    {
        Boolean Yes_iam_good=true;
        Yes_iam_good=Gothrough.IamHiden(lv);
        if(Yes_iam_good==false)
        {
            return  false;
        }

        return true;
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
     


        if(rb_D1_yes.isChecked())
        {
            D1="1";
        }
        if(rb_D2_yes.isChecked())
        {
            D2="1";
        }
        if(rb_D3_yes.isChecked())
        {
            D3="1";
        }
        if(rb_D4_yes.isChecked())
        {
            D4="1";
        }
        if(rb_D5_yes.isChecked())
        {
            D5="1";
        }
        if(rb_D6_yes.isChecked())
        {
            D6="1";
        }
        if(rb_D7_yes.isChecked())
        {
            D7="1";
        }
        if(rb_D8_yes.isChecked())
        {
            D8="1";
        }
        if(rb_D9_yes.isChecked())
        {
            D9="1";
        }

        if(rb_D10_yes.isChecked())
        {
            D10="1";
        }
        if(rb_D11_yes.isChecked())
        {
            D11="1";
        }
        if(rb_D12_yes.isChecked())
        {
            D12="1";
        }
        if(rb_D13_yes.isChecked())
        {
            D1="1";
        }

        if(rb_D13_yes.isChecked())
        {
            D1="1";
        }

        if(rb_D14_yes.isChecked())
        {
            D14="1";
        }
        if(rb_D15_yes.isChecked())
        {
            D15="1";
        }

        if(rb_D16_yes.isChecked())
        {
            D1="1";
        }
        if(rb_D16_yes.isChecked())
        {
            D1="1";
        }
        if(rb_D17_yes.isChecked())
        {
            D17="1";
        }
        if(rb_D18_yes.isChecked())
        {
            D18="1";
        }
        if(rb_D19_yes.isChecked())
        {
            D19="1";
        }
        if(rb_D20_yes.isChecked())
        {
            D20="1";
        }
        if(rb_D21_yes.isChecked())
        {
            D21="1";
        }
        if(rb_D22_yes.isChecked())
        {
            D22="1";
        }
        if(rb_D23_yes.isChecked())
        {
            D23="1";
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



    public void  fun_next_step()
    {


       globale.f_D1=D1;
       globale.f_D2=D2;
       globale.f_D3=D3;
       globale.f_D4=D4;
       globale.f_D5=D5;
       globale.f_D6=D6;
       globale.f_D7=D7;
       globale.f_D8=D8;
       globale.f_D9=D9;
       globale.f_D10=D10;
       globale.f_D11=D11;
       globale.f_D12=D12;
       globale.f_D13=D13;
       globale.f_D14=D14;
       globale.f_D15=D15;
       globale.f_D16=D16;
       globale.f_D17=D17;
       globale.f_D18=D18;
       globale.f_D19=D19;
       globale.f_D20=D20;
       globale.f_D21=D21;
        globale.f_D22=D22;
        globale.f_D23=D23;
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
                deliv.super.onBackPressed();


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
