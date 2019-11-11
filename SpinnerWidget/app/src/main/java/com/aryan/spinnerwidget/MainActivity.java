package com.aryan.spinnerwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText name, Age;
    Spinner spinner;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.fullName);
        Age = findViewById(R.id.txtAge);
        spinner = findViewById(R.id.spinState);

        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailInfo.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("age", Age.getText().toString());
                intent.putExtra("gender", spinner.getSelectedItem().toString());

                startActivity(intent);
            }
        });
    }
}
