package com.example.creatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity<view> extends AppCompatActivity {

    ImageView linkedin, facebook, insta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        findViewById(R.id.btnHome).setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });   
        linkedin = findViewById(R.id.btnLinkedin);
        facebook = findViewById(R.id.btnFB);
        insta = findViewById(R.id.btnInsta);

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                gotoUrl("https://www.linkedin.com/in/adib-rahimi-310857af");}
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/muhammad.mi.92?mibextid=LQQJ4d");
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/adib_othman._/?hl=ms");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}