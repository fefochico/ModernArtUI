package com.lab.gabriel.modernartui;


import android.app.AlertDialog;
import android.app.Dialog;
//import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by fefochico on 03/10/2015.
 */
public class AlertDialogFragment extends DialogFragment {

    //@Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return new AlertDialog.Builder(getActivity())
                .setMessage("Inspired by the works of artists such as Piett Mondrian and Ben Nicholson \n Click below to learn more!")
                .setCancelable(true)
                .setNegativeButton("NOT NOW",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                //((AlertDialogFragment) getActivity()).continueShutdown(false);
                                dismiss();
                            }
                        })
                .setPositiveButton("VISIT MOMA",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //((AlertDialogFragment) getActivity()).continueShutdown(true);
                                String url="http://www.moma.org";
                                Intent intent= new Intent(Intent.ACTION_VIEW);
                                intent.setData(Uri.parse(url));
                                startActivity(intent);
                            }
                        }).create();
    }

}
