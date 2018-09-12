package com.irfansyed.VAS.VASMonitring.Other;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.irfansyed.VAS.VASMonitring.GS.InterviewEnd;

/**
 * Created by irfansyed on 12/20/2017.
 */

public class globale {


    public static String db_pk = "";

// hi globale

    // hey
// aduld jaidsadd
// abdu sjadd
    // abdu sajid

    // sajid changes yaha hai a

    // sajid made changes here
    // irfan commit
    // sajid made changes here

    public static void interviewExit(final Context context, final Activity activity) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder
                .setMessage("Do you want to:")
                .setCancelable(false)
                .setPositiveButton("Pending",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                activity.finish();
                                Intent end_intent = new Intent(context, InterviewEnd.class);
                                end_intent.putExtra("complete", false);
                                context.startActivity(end_intent);
                            }
                        });
        alertDialogBuilder.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }
}
