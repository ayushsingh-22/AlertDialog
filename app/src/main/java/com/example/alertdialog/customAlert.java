package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class customAlert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert);

        Dialog dialog = new Dialog(customAlert.this);
        dialog.setContentView(R.layout.custom_alert);
        dialog.setCancelable(true);
        dialog.show();

        Button custBtn = dialog.findViewById(R.id.btnDone);
        custBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(customAlert.this,"Dialog box exit successfully. ",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


    }
}