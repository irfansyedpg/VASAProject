package com.irfansyed.umeedenau.umeedenauMonitring;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import data.LocalDataManager;
import data.col_A;
import utils.GpsTracker;
import utils.LocationHelper;

import static data.LocalDataManager.database;


public  class preg extends AppCompatActivity implements View.OnClickListener {








//region  Intialization
    col_A obj_tbl;
    LinearLayout
            Lv_P1,
            Lv_P2,
            Lv_P3,
            Lv_P4,
            Lv_P5,
            Lv_P6,
            Lv_P7,
            Lv_P8,
            Lv_P9,
            Lv_P10,
            Lv_P11,
            Lv_P12,
            Lv_P13,
            Lv_P14,
            Lv_P15,
            Lv_P16,
            Lv_P17,
            Lv_P18,
            Lv_P19,
            Lv_P20,
            Lv_P21,
            Lv_P22,
            Lv_P23,
            Lv_P24,
            Lv_P25,
            Lv_P26,
            Lv_P27;
    
    
    RadioButton

    rb_P1_yes,
    rb_P2_yes,
    rb_P3_yes,
    rb_P4_yes,
    rb_P5_yes,
    rb_P6_yes,
    rb_P7_yes,
    rb_P8_yes,
    rb_P9_yes,
    rb_P10_yes,
    rb_P11_yes,
    rb_P12_yes,
    rb_P13_yes,
    rb_P14_yes,
    rb_P15_yes,
    rb_P16_yes,
    rb_P17_yes,
    rb_P18_yes,
    rb_P19_yes,
    rb_P20_yes,
    rb_P21_yes,
    rb_P22_yes,
    rb_P23_yes,
    rb_P24_yes,
    rb_P25_yes,
    rb_P26_yes,
    rb_P27_yes,
    rb_P1_no,
    rb_P2_no,
    rb_P3_no,
    rb_P4_no,
    rb_P5_no,
    rb_P6_no,
    rb_P7_no,
    rb_P8_no,
    rb_P9_no,
    rb_P10_no,
    rb_P11_no,
    rb_P12_no,
    rb_P13_no,
    rb_P14_no,
    rb_P15_no,
    rb_P16_no,
    rb_P17_no,
    rb_P18_no,
    rb_P19_no,
    rb_P20_no,
    rb_P21_no,
    rb_P22_no,
    rb_P23_no,
    rb_P24_no,
    rb_P25_no,
    rb_P26_no,
    rb_P27_no;



    Button btn_next;

    String
            P1,
            P2,
            P3,
            P4,
            P5,
            P6,
            P7,
            P8,
            P9,
            P10,
            P11,
            P12,
            P13,
            P14,
            P15,
            P16,
            P17,
            P18,
            P19,
            P20,
            P21,
            P22,
            P23,
            P24,
            P25,
            P26,
            P27;


    //endregion


    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preg);
        fun_intia_view();






        btn_next.setOnClickListener(this);





    }






    @Override
    public void onClick(View view)
    {


        if(view.getId()==R.id.btn_preg_next)
        {

            if(yes_we_are_ok()==true)
            {
                this.fun_asignment();
                insertdata();
                fun_next_step();

                Intent intt=new Intent(this,finall.class);
                intt.putExtra("put_extra",1);
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

    public void fun_intia_view()
    {
        Lv_P1=(LinearLayout) findViewById(R.id.Lv_P1);
        Lv_P2=(LinearLayout) findViewById(R.id.Lv_P2);
        Lv_P3=(LinearLayout) findViewById(R.id.Lv_P3);
        Lv_P4=(LinearLayout) findViewById(R.id.Lv_P4);
        Lv_P5=(LinearLayout) findViewById(R.id.Lv_P5);
        Lv_P6=(LinearLayout) findViewById(R.id.Lv_P6);
        Lv_P7=(LinearLayout) findViewById(R.id.Lv_P7);
        Lv_P8=(LinearLayout) findViewById(R.id.Lv_P8);
        Lv_P9=(LinearLayout) findViewById(R.id.Lv_P9);
        Lv_P10=(LinearLayout) findViewById(R.id.Lv_P10);
        Lv_P11=(LinearLayout) findViewById(R.id.Lv_P11);
        Lv_P12=(LinearLayout) findViewById(R.id.Lv_P12);
        Lv_P13=(LinearLayout) findViewById(R.id.Lv_P13);
        Lv_P14=(LinearLayout) findViewById(R.id.Lv_P14);
        Lv_P15=(LinearLayout) findViewById(R.id.Lv_P15);
        Lv_P16=(LinearLayout) findViewById(R.id.Lv_P16);
        Lv_P17=(LinearLayout) findViewById(R.id.Lv_P17);
        Lv_P18=(LinearLayout) findViewById(R.id.Lv_P18);
        Lv_P19=(LinearLayout) findViewById(R.id.Lv_P19);
        Lv_P20=(LinearLayout) findViewById(R.id.Lv_P20);
        Lv_P21=(LinearLayout) findViewById(R.id.Lv_P21);
        Lv_P22=(LinearLayout) findViewById(R.id.Lv_P22);
        Lv_P23=(LinearLayout) findViewById(R.id.Lv_P23);
        Lv_P24=(LinearLayout) findViewById(R.id.Lv_P24);
        Lv_P25=(LinearLayout) findViewById(R.id.Lv_P25);
        Lv_P26=(LinearLayout) findViewById(R.id.Lv_P26);
        Lv_P27=(LinearLayout) findViewById(R.id.Lv_P27);

        rb_P1_yes=(RadioButton)findViewById(R.id.rb_P1_yes);
        rb_P2_yes=(RadioButton)findViewById(R.id.rb_P2_yes);
        rb_P3_yes=(RadioButton)findViewById(R.id.rb_P3_yes);
        rb_P4_yes=(RadioButton)findViewById(R.id.rb_P4_yes);
        rb_P5_yes=(RadioButton)findViewById(R.id.rb_P5_yes);
        rb_P6_yes=(RadioButton)findViewById(R.id.rb_P6_yes);
        rb_P7_yes=(RadioButton)findViewById(R.id.rb_P7_yes);
        rb_P8_yes=(RadioButton)findViewById(R.id.rb_P8_yes);
        rb_P9_yes=(RadioButton)findViewById(R.id.rb_P9_yes);
        rb_P10_yes=(RadioButton)findViewById(R.id.rb_P10_yes);
        rb_P11_yes=(RadioButton)findViewById(R.id.rb_P11_yes);
        rb_P12_yes=(RadioButton)findViewById(R.id.rb_P12_yes);
        rb_P13_yes=(RadioButton)findViewById(R.id.rb_P13_yes);
        rb_P14_yes=(RadioButton)findViewById(R.id.rb_P14_yes);
        rb_P15_yes=(RadioButton)findViewById(R.id.rb_P15_yes);
        rb_P16_yes=(RadioButton)findViewById(R.id.rb_P16_yes);
        rb_P17_yes=(RadioButton)findViewById(R.id.rb_P17_yes);
        rb_P18_yes=(RadioButton)findViewById(R.id.rb_P18_yes);
        rb_P19_yes=(RadioButton)findViewById(R.id.rb_P19_yes);
        rb_P20_yes=(RadioButton)findViewById(R.id.rb_P20_yes);
        rb_P21_yes=(RadioButton)findViewById(R.id.rb_P21_yes);
        rb_P22_yes=(RadioButton)findViewById(R.id.rb_P22_yes);
        rb_P23_yes=(RadioButton)findViewById(R.id.rb_P23_yes);
        rb_P24_yes=(RadioButton)findViewById(R.id.rb_P24_yes);
        rb_P25_yes=(RadioButton)findViewById(R.id.rb_P25_yes);
        rb_P26_yes=(RadioButton)findViewById(R.id.rb_P26_yes);
        rb_P27_yes=(RadioButton)findViewById(R.id.rb_P27_yes);
        rb_P1_no=(RadioButton)findViewById(R.id.rb_P1_no);
        rb_P2_no=(RadioButton)findViewById(R.id.rb_P2_no);
        rb_P3_no=(RadioButton)findViewById(R.id.rb_P3_no);
        rb_P4_no=(RadioButton)findViewById(R.id.rb_P4_no);
        rb_P5_no=(RadioButton)findViewById(R.id.rb_P5_no);
        rb_P6_no=(RadioButton)findViewById(R.id.rb_P6_no);
        rb_P7_no=(RadioButton)findViewById(R.id.rb_P7_no);
        rb_P8_no=(RadioButton)findViewById(R.id.rb_P8_no);
        rb_P9_no=(RadioButton)findViewById(R.id.rb_P9_no);
        rb_P10_no=(RadioButton)findViewById(R.id.rb_P10_no);
        rb_P11_no=(RadioButton)findViewById(R.id.rb_P11_no);
        rb_P12_no=(RadioButton)findViewById(R.id.rb_P12_no);
        rb_P13_no=(RadioButton)findViewById(R.id.rb_P13_no);
        rb_P14_no=(RadioButton)findViewById(R.id.rb_P14_no);
        rb_P15_no=(RadioButton)findViewById(R.id.rb_P15_no);
        rb_P16_no=(RadioButton)findViewById(R.id.rb_P16_no);
        rb_P17_no=(RadioButton)findViewById(R.id.rb_P17_no);
        rb_P18_no=(RadioButton)findViewById(R.id.rb_P18_no);
        rb_P19_no=(RadioButton)findViewById(R.id.rb_P19_no);
        rb_P20_no=(RadioButton)findViewById(R.id.rb_P20_no);
        rb_P21_no=(RadioButton)findViewById(R.id.rb_P21_no);
        rb_P22_no=(RadioButton)findViewById(R.id.rb_P22_no);
        rb_P23_no=(RadioButton)findViewById(R.id.rb_P23_no);
        rb_P24_no=(RadioButton)findViewById(R.id.rb_P24_no);
        rb_P25_no=(RadioButton)findViewById(R.id.rb_P25_no);
        rb_P26_no=(RadioButton)findViewById(R.id.rb_P26_no);
        rb_P27_no=(RadioButton)findViewById(R.id.rb_P27_no);

        btn_next=(Button)findViewById(R.id.btn_preg_next);



    }


    public  boolean yes_we_are_ok()
    {

       if( fun_avioid_empty_text(Lv_P1)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_P2)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P3)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P4)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P5)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P6)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P7)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P8)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P9)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P10)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P11)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P12)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P13)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_P14)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_P15)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_P16)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P17)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P18)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P19)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P20)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_P21)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P22)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P23)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P24)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P25)==false)
        {
            return  false;
        }
        if( fun_avioid_empty_text(Lv_P26)==false)
        {
            return  false;
        }

        if( fun_avioid_empty_text(Lv_P27)==false)
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

        P1="0";
        P2="0";
        P3="0";
        P4="0";
        P5="0";
        P6="0";
        P7="0";
        P8="0";
        P9="0";
        P10="0";
        P11="0";
        P12="0";
        P13="0";
        P14="0";
        P15="0";
        P16="0";
        P17="0";
        P18="0";
        P19="0";
        P20="0";
        P21="0";
        P22="0";
        P23="0";
        P24="0";
        P25="0";
        P26="0";
        P27="0";


        if(rb_P1_yes.isChecked())
        {
            P1="1";
        }
        if(rb_P2_yes.isChecked())
        {
            P2="1";
        }
        if(rb_P3_yes.isChecked())
        {
            P3="1";
        }
        if(rb_P4_yes.isChecked())
        {
            P4="1";
        }
        if(rb_P5_yes.isChecked())
        {
            P5="1";
        }
        if(rb_P6_yes.isChecked())
        {
            P6="1";
        }
        if(rb_P7_yes.isChecked())
        {
            P7="1";
        }
        if(rb_P8_yes.isChecked())
        {
            P8="1";
        }
        if(rb_P9_yes.isChecked())
        {
            P9="1";
        }

        if(rb_P10_yes.isChecked())
        {
            P10="1";
        }
        if(rb_P11_yes.isChecked())
        {
            P11="1";
        }
        if(rb_P12_yes.isChecked())
        {
            P12="1";
        }
        if(rb_P13_yes.isChecked())
        {
            P1="1";
        }

        if(rb_P13_yes.isChecked())
        {
            P1="1";
        }

        if(rb_P14_yes.isChecked())
        {
            P14="1";
        }
        if(rb_P15_yes.isChecked())
        {
            P15="1";
        }

        if(rb_P16_yes.isChecked())
        {
            P1="1";
        }
        if(rb_P16_yes.isChecked())
        {
            P1="1";
        }
        if(rb_P17_yes.isChecked())
        {
            P17="1";
        }
        if(rb_P18_yes.isChecked())
        {
            P18="1";
        }
        if(rb_P19_yes.isChecked())
        {
            P19="1";
        }
        if(rb_P20_yes.isChecked())
        {
            P20="1";
        }
        if(rb_P21_yes.isChecked())
        {
            P21="1";
        }
        if(rb_P22_yes.isChecked())
        {
            P22="1";
        }
        if(rb_P23_yes.isChecked())
        {
            P23="1";
        }
        if(rb_P24_yes.isChecked())
        {
            P24="1";
        }
        if(rb_P25_yes.isChecked())
        {
            P25="1";
        }
        if(rb_P26_yes.isChecked())
        {
            P26="1";
        }
        if(rb_P27_yes.isChecked())
        {
            P27="1";
        }









    }



    public void insertdata() {









        String query = "Update  " +
                "ttable set "+
             
        "P1='"+P1+"',"+ 
                "P2='"+P2+"',"+
        "P3='"+P3+"',"+
        "P4='"+P4+"',"+
        "P5='"+P5+"',"+
        "P6='"+P6+"',"+
        "P7='"+P7+"',"+
        "P8='"+P8+"',"+
        "P9='"+P9+"',"+
        "P10='"+P10+"',"+
        "P11='"+P11+"',"+
        "P12='"+P12+"',"+
        "P13='"+P13+"',"+
        "P14='"+P14+"',"+
        "P15='"+P15+"',"+
        "P16='"+P16+"',"+
        "P17='"+P17+"',"+
        "P18='"+P18+"',"+
        "P19='"+P19+"',"+
        "P20='"+P20+"',"+
        "P21='"+P21+"',"+
        "P22='"+P22+"',"+
        "P23='"+P23+"',"+
        "P24='"+P24+"',"+
        "P25='"+P25+"',"+
        "P26='"+P26+"',"+
        "P27='"+P27+"'"+

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
                preg.super.onBackPressed();


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


    public void  fun_next_step()
    {

                globale.P1=P1;
                globale.P2=P2;
                globale.P3=P3;
                globale.P4=P4;
                globale.P5=P5;
                globale.P6=P6;
                globale.P7=P7;
                globale.P8=P8;
                globale.P9=P9;
                globale.P10=P10;
                globale.P11=P11;
                globale.P12=P12;
                globale.P13=P13;
                globale.P14=P14;
                globale.P15=P15;
                globale.P16=P16;
                globale.P17=P17;
                globale.P18=P18;
                globale.P19=P19;
                globale.P20=P20;
                globale.P21=P21;
                globale.P22=P22;
                globale.P23=P23;
                globale.P24=P24;
                globale.P25=P25;
                globale.P26=P26;
                globale.P27=P27;

    }


}
