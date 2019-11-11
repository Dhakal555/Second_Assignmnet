package com.aryan.spinnerwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailInfo extends AppCompatActivity {

    TextView name, age, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        name = findViewById(R.id.tvName);
        age = findViewById(R.id.tvAge);
        gender = findViewById(R.id.tvGender);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            String n, a, g;
            n = bundle.getString("name");
            a = bundle.getString("age");
            g = bundle.getString("gender");

            name.setText(n);
            age.setText(a);
            gender.setText(g);

        }
    }
}
