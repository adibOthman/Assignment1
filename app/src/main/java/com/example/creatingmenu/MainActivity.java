package com.example.creatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.imageView3);
        logo.setAnimation(anim= new ScaleAnimation(
                0.5f,1,
                0.5f,1,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f

        ));
        anim.setDuration(1500);
        findViewById(R.id.btnZakat).setOnClickListener(view -> {
            Intent intent = new Intent(this, InputActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.btnAbout).setOnClickListener(view ->{
            Intent intent = new Intent(this,AboutActivity.class );
            startActivity(intent);

        });
    }


}