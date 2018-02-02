package com.example.lab5.ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
    }
    public void calculadoraActivity(View view) {
        startActivity(new Intent(this, GridLayout.class));
        //finish();
    }
    public void formularioActivity(View view) {
        startActivity(new Intent(this, LinearLayout.class));
        //finish();
    }
}
