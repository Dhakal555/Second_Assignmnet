package com.example.leaderprofile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailProfile extends AppCompatActivity {

    CircleImageView imgImage;
    TextView txtName, txtDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile);

        imgImage = findViewById(R.id.imgImage);
        txtName = findViewById(R.id.txtName);
        txtDetails = findViewById(R.id.txtPdetail);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            int img =bundle.getInt("img");
            String name = bundle.getString("name");
            String details = bundle.getString("details");

            imgImage.setImageResource(img);
            txtName.setText(name);
            txtDetails.setText(details);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle(bundle.getString("name"));
        }
        else {
            Toast.makeText(this, "Cant get this item", Toast.LENGTH_LONG).show();
        }
    }
}
