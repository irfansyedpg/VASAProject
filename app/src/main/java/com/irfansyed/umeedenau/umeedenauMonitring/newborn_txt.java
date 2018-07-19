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


public  class newborn_txt extends AppCompatActivity implements View.OnClickListener {









    col_A obj_tbl;

    LocationHelper.LocationResult locationResult;
    LocationHelper locationHelper;
    ProgressDialog progressBar;


    LinearLayout

            Lv_N1,
            Lv_N2,
            Lv_N3,
            Lv_N4,
            Lv_N5,
            Lv_N6,
            Lv_N7,
            Lv_N8,
            Lv_N9,
            Lv_N10,
            Lv_N11,
            Lv_N12,
            Lv_N13,
            Lv_N14,
            Lv_N15,
            Lv_N16,
            Lv_N17,
            Lv_N18,
            Lv_N19,
            Lv_N20,
            Lv_N21,
            Lv_N22,
            Lv_N23,
            Lv_N24;





    EditText
            txt_N1	,
            txt_N2	,
            txt_N3	,
            txt_N4	,
            txt_N5	,
            txt_N6	,
            txt_N7	,
            txt_N8	,
            txt_N9	,
            txt_N10	,
            txt_N11	,
            txt_N12	,
            txt_N13	,
            txt_N14	,
            txt_N15	,
            txt_N16	,
            txt_N17	,
            txt_N18	,
            txt_N19	,
            txt_N20	,
            txt_N21	,
            txt_N22	,
            txt_N23	,
            txt_N24	;




    Button btn_next;


    String  N1	,
            N2	,
            N3	,
            N4	,
            N5	,
            N6	,
            N7	,
            N8	,
            N9	,
            N10	,
            N11	,
            N12	,
            N13	,
            N14	,
            N15	,
            N16	,
            N17	,
            N18	,
            N19	,
            N20	,
            N21	,
            N22	,
            N23	,
            N24	;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newborn_txt);
        fun_intia_view();



        set_visibility();





        btn_next.setOnClickListener(this);










    }




    boolean yesok=true;

    @Override
    public void onClick(View view)
    {

        if(view.getId()==R.id.btn_next_new)
        {


                this.fun_asignment();
                insertdata();

                Intent itnn=new Intent(this,finall.class);
                startActivity(itnn);
            this.finish();




        }



    }









    public void fun_intia_view()
    {
        Lv_N1=(LinearLayout) findViewById(R.id.Lv_N1);
        Lv_N2=(LinearLayout) findViewById(R.id.Lv_N2);
        Lv_N3=(LinearLayout) findViewById(R.id.Lv_N3);
        Lv_N4=(LinearLayout) findViewById(R.id.Lv_N4);
        Lv_N5=(LinearLayout) findViewById(R.id.Lv_N5);
        Lv_N6=(LinearLayout) findViewById(R.id.Lv_N6);
        Lv_N7=(LinearLayout) findViewById(R.id.Lv_N7);
        Lv_N8=(LinearLayout) findViewById(R.id.Lv_N8);
        Lv_N9=(LinearLayout) findViewById(R.id.Lv_N9);
        Lv_N10=(LinearLayout) findViewById(R.id.Lv_N10);
        Lv_N11=(LinearLayout) findViewById(R.id.Lv_N11);
        Lv_N12=(LinearLayout) findViewById(R.id.Lv_N12);
        Lv_N13=(LinearLayout) findViewById(R.id.Lv_N13);
        Lv_N14=(LinearLayout) findViewById(R.id.Lv_N14);
        Lv_N15=(LinearLayout) findViewById(R.id.Lv_N15);
        Lv_N16=(LinearLayout) findViewById(R.id.Lv_N16);
        Lv_N17=(LinearLayout) findViewById(R.id.Lv_N17);
        Lv_N18=(LinearLayout) findViewById(R.id.Lv_N18);
        Lv_N19=(LinearLayout) findViewById(R.id.Lv_N19);
        Lv_N20=(LinearLayout) findViewById(R.id.Lv_N20);
        Lv_N21=(LinearLayout) findViewById(R.id.Lv_N21);
        Lv_N22=(LinearLayout) findViewById(R.id.Lv_N22);
        Lv_N23=(LinearLayout) findViewById(R.id.Lv_N23);
        Lv_N23=(LinearLayout) findViewById(R.id.Lv_N23);
        Lv_N24=(LinearLayout) findViewById(R.id.Lv_N24);



        txt_N1	=(EditText)findViewById(R.id.txt_N1	);
        txt_N2	=(EditText)findViewById(R.id.txt_N2	);
        txt_N3	=(EditText)findViewById(R.id.txt_N3	);
        txt_N4	=(EditText)findViewById(R.id.txt_N4	);
        txt_N5	=(EditText)findViewById(R.id.txt_N5	);
        txt_N6	=(EditText)findViewById(R.id.txt_N6	);
        txt_N7	=(EditText)findViewById(R.id.txt_N7	);
        txt_N8	=(EditText)findViewById(R.id.txt_N8	);
        txt_N9	=(EditText)findViewById(R.id.txt_N9	);
        txt_N10=(EditText)findViewById(R.id.txt_N10);
        txt_N11=(EditText)findViewById(R.id.txt_N11);
        txt_N12=(EditText)findViewById(R.id.txt_N12);
        txt_N13=(EditText)findViewById(R.id.txt_N13);
        txt_N14=(EditText)findViewById(R.id.txt_N14);
        txt_N15=(EditText)findViewById(R.id.txt_N15);
        txt_N16=(EditText)findViewById(R.id.txt_N16);
        txt_N17=(EditText)findViewById(R.id.txt_N17);
        txt_N18=(EditText)findViewById(R.id.txt_N18);
        txt_N19=(EditText)findViewById(R.id.txt_N19);
        txt_N20=(EditText)findViewById(R.id.txt_N20);
        txt_N21=(EditText)findViewById(R.id.txt_N21);
        txt_N22=(EditText)findViewById(R.id.txt_N22);
        txt_N23=(EditText)findViewById(R.id.txt_N23);
        txt_N24=(EditText)findViewById(R.id.txt_N24);
































        btn_next=(Button)findViewById(R.id.btn_next_new);



    }










    public  void fun_asignment()
    {

        N1="0";
        N2="0";
        N3="0";
        N4="0";
        N5="0";
        N6="0";
        N7="0";
        N8="0";
        N9="0";
        N10="0";
        N11="0";
        N12="0";
        N13="0";
        N14	 ="0";
        N15	="0";
        N16	="0";
        N17	="0";
        N18	="0";
        N19	="0";
        N20	="0";
        N21	="0";
        N22	="0";
        N23	="0";
        N24	="0";




        if(txt_N1.getText().toString().length()>0)
        {
            N1=txt_N1.getText().toString();
        }
        if(txt_N2.getText().toString().length()>0)
        {
            N2=txt_N2.getText().toString();
        }
        if(txt_N3.getText().toString().length()>0)
        {
            N3=txt_N3.getText().toString();
        }
        if(txt_N4.getText().toString().length()>0)
        {
            N4=txt_N4.getText().toString();
        }
        if(txt_N5.getText().toString().length()>0)
        {
            N5=txt_N5.getText().toString();
        }
        if(txt_N6.getText().toString().length()>0)
        {
            N6=txt_N6.getText().toString();
        }
        if(txt_N7.getText().toString().length()>0)
        {
            N7=txt_N7.getText().toString();
        }
        if(txt_N8.getText().toString().length()>0)
        {
            N8=txt_N8.getText().toString();
        }
        if(txt_N9.getText().toString().length()>0)
        {
            N9=txt_N9.getText().toString();
        }
        if(txt_N10.getText().toString().length()>0)
        {
            N10=txt_N10.getText().toString();
        }
        if(txt_N11.getText().toString().length()>0)
        {
            N11=txt_N11.getText().toString();
        }
        if(txt_N12.getText().toString().length()>0)
        {
            N12=txt_N12.getText().toString();
        }
        if(txt_N13.getText().toString().length()>0)
        {
            N13=txt_N13.getText().toString();
        }
        if(txt_N14.getText().toString().length()>0)
        {
            N14=txt_N14.getText().toString();
        }
        if(txt_N15.getText().toString().length()>0)
        {
            N15=txt_N15.getText().toString();
        }
        if(txt_N16.getText().toString().length()>0)
        {
            N16=txt_N16.getText().toString();
        }
        if(txt_N17.getText().toString().length()>0)
        {
            N17=txt_N17.getText().toString();
        }
        if(txt_N18.getText().toString().length()>0)
        {
            N18=txt_N18.getText().toString();
        }
        if(txt_N19.getText().toString().length()>0)
        {
            N19=txt_N19.getText().toString();
        }
        if(txt_N20.getText().toString().length()>0)
        {
            N20=txt_N20.getText().toString();
        }
        if(txt_N21.getText().toString().length()>0)
        {
            N21=txt_N21.getText().toString();
        }
        if(txt_N22.getText().toString().length()>0)
        {
            N22=txt_N22.getText().toString();
        }
        if(txt_N23.getText().toString().length()>0)
        {
            N23=txt_N23.getText().toString();
        }
        if(txt_N24.getText().toString().length()>0)
        {
            N24=txt_N24.getText().toString();
        }


    }


    public void insertdata() {









        String query = "Update  " +
                "ttable set "+

                "txt_N1='"+N1+"',"+
                "txt_N2='"+N2+"',"+
                "txt_N3='"+N3+"',"+
                "txt_N4='"+N4+"',"+
                "txt_N5='"+N5+"',"+
                "txt_N6='"+N6+"',"+
                "txt_N7='"+N7+"',"+
                "txt_N8='"+N8+"',"+
                "txt_N9='"+N9+"',"+
                "txt_N10='"+N10+"',"+
                "txt_N11='"+N11+"',"+
                "txt_N12='"+N12+"',"+
                "txt_N13='"+N13+"',"+
                "txt_N14='"+N14+"',"+
                "txt_N15='"+N15+"',"+
                "txt_N16='"+N16+"',"+
                "txt_N17='"+N17+"',"+
                "txt_N18='"+N18+"',"+
                "txt_N19='"+N19+"',"+
                "txt_N20='"+N20+"',"+
                "txt_N21='"+N21+"',"+
                "txt_N22='"+N22+"',"+
                "txt_N23='"+N23+"',"+
                "txt_N24='"+N24+"'"+




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
                newborn_txt.super.onBackPressed();


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



    void set_visibility()
    {
        if(globale.N1.equals("0"))
        {
            Lv_N1.setVisibility(View.GONE);
        }

        if(globale.N2.equals("0"))
        {
            Lv_N2.setVisibility(View.GONE);
        }

        if(globale.N3.equals("0"))
        {
            Lv_N3.setVisibility(View.GONE);
        }

        if(globale.N4.equals("0"))
        {
            Lv_N4.setVisibility(View.GONE);
        }


        if(globale.N5.equals("0"))
        {
            Lv_N5.setVisibility(View.GONE);
        }

        if(globale.N6.equals("0"))
        {
            Lv_N6.setVisibility(View.GONE);
        }

        if(globale.N7.equals("0"))
        {
            Lv_N7.setVisibility(View.GONE);
        }

        if(globale.N8.equals("0"))
        {
            Lv_N8.setVisibility(View.GONE);
        }

        if(globale.N9.equals("0"))
        {
            Lv_N9.setVisibility(View.GONE);
        }

        if(globale.N10.equals("0"))
        {
            Lv_N10.setVisibility(View.GONE);
        }

        if(globale.N11.equals("0"))
        {
            Lv_N11.setVisibility(View.GONE);
        }


        if(globale.N12.equals("0"))
        {
            Lv_N12.setVisibility(View.GONE);
        }

        if(globale.N13.equals("0"))
        {
            Lv_N13.setVisibility(View.GONE);
        }

        if(globale.N14.equals("0"))
        {
            Lv_N14.setVisibility(View.GONE);
        }
        if(globale.N15.equals("0"))
        {
            Lv_N15.setVisibility(View.GONE);
        }
        if(globale.N16.equals("0"))
        {
            Lv_N16.setVisibility(View.GONE);
        }

        if(globale.N17.equals("0"))
        {
            Lv_N17.setVisibility(View.GONE);
        }

        if(globale.N18.equals("0"))
        {
            Lv_N18.setVisibility(View.GONE);
        }

        if(globale.N19.equals("0"))
        {
            Lv_N19.setVisibility(View.GONE);
        }
        if(globale.N20.equals("0"))
        {
            Lv_N20.setVisibility(View.GONE);
        }
        if(globale.N21.equals("0"))
        {
            Lv_N21.setVisibility(View.GONE);
        }
        if(globale.N22.equals("0"))
        {
            Lv_N22.setVisibility(View.GONE);
        }
        if(globale.N23.equals("0"))
        {
            Lv_N23.setVisibility(View.GONE);
        }

        if(globale.N24.equals("0"))
        {
            Lv_N24.setVisibility(View.GONE);
        }





    }

}
