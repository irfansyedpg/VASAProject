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


public  class imm extends AppCompatActivity implements View.OnClickListener {









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





    RadioButton

            rb_I1_yes,
            rb_I2_yes,
            rb_I3_yes,
            rb_I4_yes,
            rb_I5_yes,
            rb_I6_yes,
            rb_I7_yes,
            rb_I8_yes,
            rb_I9_yes,
            rb_I10_yes,
            rb_I11_yes,
            rb_I1_no,
            rb_I2_no,
            rb_I3_no,
            rb_I4_no,
            rb_I5_no,
            rb_I6_no,
            rb_I7_no,
            rb_I8_no,
            rb_I9_no,
            rb_I10_no,
            rb_I11_no;

    Button btn_next;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.immun);
        fun_intia_view();

        btn_next.setOnClickListener(this);









    }






    @Override
    public void onClick(View view)
    {



        if(view.getId()==R.id.btn_next_I)
        {

            if(yes_we_are_ok()==true)
            {
                this.fun_asignment();
                insertdata();
                next_step();
                Intent itt=new Intent(this,finall.class);
                itt.putExtra("put_extra",5);
                startActivity(itt);
                this.finish();


            }

            else
            {
                Toast.makeText(this,"Some thing is missing! please Review your form.",Toast.LENGTH_LONG);
            }

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
 


        rb_I1_yes=(RadioButton)findViewById(R.id.rb_I1_yes);
        rb_I2_yes=(RadioButton)findViewById(R.id.rb_I2_yes);
        rb_I3_yes=(RadioButton)findViewById(R.id.rb_I3_yes);
        rb_I4_yes=(RadioButton)findViewById(R.id.rb_I4_yes);
        rb_I5_yes=(RadioButton)findViewById(R.id.rb_I5_yes);
        rb_I6_yes=(RadioButton)findViewById(R.id.rb_I6_yes);
        rb_I7_yes=(RadioButton)findViewById(R.id.rb_I7_yes);
        rb_I8_yes=(RadioButton)findViewById(R.id.rb_I8_yes);
        rb_I9_yes=(RadioButton)findViewById(R.id.rb_I9_yes);
        rb_I10_yes=(RadioButton)findViewById(R.id.rb_I10_yes);
        rb_I11_yes=(RadioButton)findViewById(R.id.rb_I11_yes);


        rb_I1_no=(RadioButton)findViewById(R.id.rb_I1_no);
        rb_I2_no=(RadioButton)findViewById(R.id.rb_I2_no);
        rb_I3_no=(RadioButton)findViewById(R.id.rb_I3_no);
        rb_I4_no=(RadioButton)findViewById(R.id.rb_I4_no);
        rb_I5_no=(RadioButton)findViewById(R.id.rb_I5_no);
        rb_I6_no=(RadioButton)findViewById(R.id.rb_I6_no);
        rb_I7_no=(RadioButton)findViewById(R.id.rb_I7_no);
        rb_I8_no=(RadioButton)findViewById(R.id.rb_I8_no);
        rb_I9_no=(RadioButton)findViewById(R.id.rb_I9_no);
        rb_I10_no=(RadioButton)findViewById(R.id.rb_I10_no);
        rb_I11_no=(RadioButton)findViewById(R.id.rb_I11_no);


        btn_next=(Button)findViewById(R.id.btn_next_I);



    }

    // switcher counter



    public  boolean yes_we_are_ok()
    {

        if( fun_avioid_empty_text(Lv_I1)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_I2)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I3)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I4)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I5)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I6)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I7)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I8)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I9)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I10)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_I11)==false)
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




        if(rb_I1_yes.isChecked())
        {
            I1="1";
        }
        if(rb_I2_yes.isChecked())
        {
            I2="1";
        }
        if(rb_I3_yes.isChecked())
        {
            I3="1";
        }
        if(rb_I4_yes.isChecked())
        {
            I4="1";
        }
        if(rb_I5_yes.isChecked())
        {
            I5="1";
        }
        if(rb_I6_yes.isChecked())
        {
            I6="1";
        }
        if(rb_I7_yes.isChecked())
        {
            I7="1";
        }
        if(rb_I8_yes.isChecked())
        {
            I8="1";
        }
        if(rb_I9_yes.isChecked())
        {
            I9="1";
        }

        if(rb_I10_yes.isChecked())
        {
            I10="1";
        }
        if(rb_I11_yes.isChecked())
        {
            I11="1";
        }










    }




    public void insertdata() {









        String query = "Update  " +
                "ttable set "+

                "I1='"+I1+"',"+
                "I2='"+I2+"',"+
                "I3='"+I3+"',"+
                "I4='"+I4+"',"+
                "I5='"+I5+"',"+
                "I6='"+I6+"',"+
                "I7='"+I7+"',"+
                "I8='"+I8+"',"+
                "I9='"+I9+"',"+
                "I10='"+I10+"',"+
                "I11='"+I11+"'"+




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
                imm.super.onBackPressed();


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
               globale. I1=I1;
               globale. I2=I2;
               globale. I3=I3;
               globale. I4=I4;
               globale. I5=I5;
               globale. I6=I6;
               globale. I7=I7;
               globale. I8=I8;
               globale. I9=I9;
                globale.I10=I10;
                globale.I11=I11;
    }
}
