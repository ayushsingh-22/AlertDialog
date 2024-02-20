package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class three_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_button);

        AlertDialog.Builder delDialog = new AlertDialog.Builder(three_button.this);
        delDialog.setIcon(R.drawable.danger_svgrepo_com);
        delDialog.setMessage("Might hack your mobile. Continue??");
        delDialog.setTitle("Important");

        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(three_button.this,"Successfully Executed", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(three_button.this,"Successfully Aborted ", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.setNeutralButton("Leave", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(three_button.this,MainActivity.class);
                startActivity(intent);

            }
        });

        delDialog.show();

    }
}