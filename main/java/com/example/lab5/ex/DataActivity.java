package com.example.lab5.ex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {
    private EditText edtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        edtData = (EditText) findViewById(R.id.edt_data);

        Bundle bundle = this.getIntent().getExtras();

        edtData.setText(bundle.getString("Name")+", "+bundle.getString("Age")+", "+bundle.getString("Phone"));
    }
}
