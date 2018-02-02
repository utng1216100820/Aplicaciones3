package com.example.lab5.ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearLayout extends AppCompatActivity {

    private EditText edtName, edtAge, edtPhone;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);


        edtName = (EditText)findViewById(R.id.edt_name);
        edtAge = (EditText)findViewById(R.id.edt_age1);
        edtPhone = (EditText)findViewById(R.id.edt_phone);
        btnSubmit = (Button)findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearLayout.this, DataActivity.class);

                Bundle b = new Bundle();
                b.putString("Name", edtName.getText().toString());
                b.putString("Age", edtAge.getText().toString());
                b.putString("Phone", edtPhone.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }
}
