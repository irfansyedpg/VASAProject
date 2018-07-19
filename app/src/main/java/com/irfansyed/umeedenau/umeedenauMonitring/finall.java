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

import data.LocalDataManager;
import data.col_A;
import utils.LocationHelper;

import static data.LocalDataManager.database;


public  class finall extends AppCompatActivity implements View.OnClickListener {









    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;
    int put_extra=0;


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



    RadioButton


            rb_PN8_yes,
            rb_PN9_yes,
            rb_PN10_yes,
            rb_PN11_yes,
            rb_PN12_yes,
            rb_PN13_yes,
            rb_PN14_yes,
            rb_PN15_yes,
            rb_PN16_yes,
            rb_PN17_yes,
            rb_PN18_yes,
            rb_PN19_yes,
            rb_PN20_yes,
            rb_PN21_yes,


            rb_PN8_no,
            rb_PN9_no,
            rb_PN10_no,
            rb_PN11_no,
            rb_PN12_no,
            rb_PN13_no,
            rb_PN14_no,
            rb_PN15_no,
            rb_PN16_no,
            rb_PN17_no,
            rb_PN18_no,
            rb_PN19_no,
            rb_PN20_no,
            rb_PN21_no;

    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finall);
        fun_intia_view();
        put_extra = getIntent().getExtras().getInt("put_extra");



        btn_next.setOnClickListener(this);






    }




    boolean yesok=true;

    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.btn_Next_Pn)
        {

            if(yes_we_are_ok()==true)
            {
                this.fun_asignment();
                insertdata();
                this.next_step();
                this.finish();



                Intent intent;
                if (put_extra == 1) {
                    intent = new Intent(this, preg_txt.class);
                    startActivity(intent);
                    this.finish();



                } else if (put_extra == 2) {
                    intent = new Intent(this, deliv_textbox.class);
                    startActivity(intent);
                    this.finish();


                } else if (put_extra == 3) {
                    intent = new Intent(this, pnc_txt.class);
                    startActivity(intent);
                    this.finish();


                } else if (put_extra == 4) {
                    intent = new Intent(this, newborn_txt.class);
                    startActivity(intent);
                    this.finish();


                } else if (put_extra == 5) {
                    intent = new Intent(this, imm_txt.class);
                    startActivity(intent);
                    this.finish();

                } else if (put_extra == 6) {
                    intent = new Intent(this, pneuonia_txt.class);
                    startActivity(intent);
                    this.finish();

                } else {
                    intent = new Intent(this, diarhea_txt.class);
                    startActivity(intent);
                    this.finish();

                }

            }

            else
            {
                Toast.makeText(this,"Some thing is missing! please Review your form.",Toast.LENGTH_LONG);
            }

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



        rb_PN8_yes=(RadioButton)findViewById(R.id.rb_PN8_yes);
        rb_PN9_yes=(RadioButton)findViewById(R.id.rb_PN9_yes);
        rb_PN10_yes=(RadioButton)findViewById(R.id.rb_PN10_yes);
        rb_PN11_yes=(RadioButton)findViewById(R.id.rb_PN11_yes);
        rb_PN12_yes=(RadioButton)findViewById(R.id.rb_PN12_yes);
        rb_PN13_yes=(RadioButton)findViewById(R.id.rb_PN13_yes);
        rb_PN14_yes=(RadioButton)findViewById(R.id.rb_PN14_yes);
        rb_PN15_yes=(RadioButton)findViewById(R.id.rb_PN15_yes);
        rb_PN16_yes=(RadioButton)findViewById(R.id.rb_PN16_yes);
        rb_PN17_yes=(RadioButton)findViewById(R.id.rb_PN17_yes);
        rb_PN18_yes=(RadioButton)findViewById(R.id.rb_PN18_yes);
        rb_PN19_yes=(RadioButton)findViewById(R.id.rb_PN19_yes);
        rb_PN20_yes=(RadioButton)findViewById(R.id.rb_PN20_yes);
        rb_PN21_yes=(RadioButton)findViewById(R.id.rb_PN21_yes);


        rb_PN8_no=(RadioButton)findViewById(R.id.rb_PN8_no);
        rb_PN9_no=(RadioButton)findViewById(R.id.rb_PN9_no);
        rb_PN10_no=(RadioButton)findViewById(R.id.rb_PN10_no);
        rb_PN11_no=(RadioButton)findViewById(R.id.rb_PN11_no);
        rb_PN12_no=(RadioButton)findViewById(R.id.rb_PN12_no);
        rb_PN13_no=(RadioButton)findViewById(R.id.rb_PN13_no);
        rb_PN14_no=(RadioButton)findViewById(R.id.rb_PN14_no);
        rb_PN15_no=(RadioButton)findViewById(R.id.rb_PN15_no);
        rb_PN16_no=(RadioButton)findViewById(R.id.rb_PN16_no);
        rb_PN17_no=(RadioButton)findViewById(R.id.rb_PN17_no);
        rb_PN18_no=(RadioButton)findViewById(R.id.rb_PN18_no);
        rb_PN19_no=(RadioButton)findViewById(R.id.rb_PN19_no);
        rb_PN20_no=(RadioButton)findViewById(R.id.rb_PN20_no);
        rb_PN21_no=(RadioButton)findViewById(R.id.rb_PN21_no);


        btn_next=(Button)findViewById(R.id.btn_Next_Pn);



    }


    public  boolean yes_we_are_ok()
    {


        if( fun_avioid_empty_text(Lv_PN8)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN9)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN10)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN11)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN12)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN13)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_PN14)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_PN15)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_PN16)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN17)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN18)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN19)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_PN20)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_PN21)==false)
        {
            return  false;
        }


        return  true;
    }

    // switcher counter



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




        if(rb_PN8_yes.isChecked())
        {
            PN8="1";
        }
        if(rb_PN9_yes.isChecked())
        {
            PN9="1";
        }

        if(rb_PN10_yes.isChecked())
        {
            PN10="1";
        }
        if(rb_PN11_yes.isChecked())
        {
            PN11="1";
        }
        if(rb_PN12_yes.isChecked())
        {
            PN12="1";
        }
        if(rb_PN13_yes.isChecked())
        {
            PN13="1";
        }



        if(rb_PN14_yes.isChecked())
        {
            PN14="1";
        }
        if(rb_PN15_yes.isChecked())
        {
            PN15="1";
        }

        if(rb_PN16_yes.isChecked())
        {
            PN16="1";
        }

        if(rb_PN17_yes.isChecked())
        {
            PN17="1";
        }
        if(rb_PN18_yes.isChecked())
        {
            PN18="1";
        }
        if(rb_PN19_yes.isChecked())
        {
            PN19="1";
        }
        if(rb_PN20_yes.isChecked())
        {
            PN20="1";
        }
        if(rb_PN21_yes.isChecked())
        {
            PN21="1";
        }





    }



    public void insertdata() {









        String query = "Update  " +
                "ttable set "+


                "PN8='"+PN8+"',"+
                "PN9='"+PN9+"',"+
                "PN10='"+PN10+"',"+
                "PN11='"+PN11+"',"+
                "PN12='"+PN12+"',"+
                "PN13='"+PN13+"',"+
                "PN14='"+PN14+"',"+
                "PN15='"+PN15+"',"+
                "PN16='"+PN16+"',"+
                "PN17='"+PN17+"',"+
                "PN18='"+PN18+"',"+
                "PN19='"+PN19+"',"+
                "PN20='"+PN20+"',"+
                "PN21='"+PN21+"'"+


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
                finall.super.onBackPressed();


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
               globale. PN8= PN8;
               globale. PN9= PN9;
               globale. PN10= PN10;
               globale. PN11= PN11;
               globale. PN12= PN12;
               globale. PN13= PN13;
               globale. PN14= PN14;
               globale. PN15= PN15;
               globale. PN16= PN16;
               globale. PN17= PN17;
               globale. PN18= PN18;
               globale. PN19= PN19;
               globale. PN20= PN20;
               globale. PN21= PN21;
    }

}
