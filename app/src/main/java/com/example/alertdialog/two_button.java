package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class two_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_button);

        AlertDialog.Builder delDialog = new AlertDialog.Builder(two_button.this);
        delDialog.setIcon(R.drawable.baseline_auto_delete_24);
        delDialog.setMessage("Are you sure want to delete");
        delDialog.setTitle("Important");

        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(two_button.this,"Successful Executed", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(two_button.this,"Successful Aborted", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.show();

    }
}