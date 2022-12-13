package com.example.creatingmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class OutputActivity extends AppCompatActivity {
    private EditText etTotalGold, etZakatPayable, etZakat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        setContentView(R.layout.activity_output);

        etTotalGold = findViewById(R.id.txtOutputW);
        etTotalGold.setText(intent.getStringExtra("TotalGoldValue"));
        etZakatPayable = findViewById(R.id.txtOutputTGV);
        etZakatPayable.setText(intent.getStringExtra("ZakatPayable"));
        etZakat = findViewById(R.id.txtOutputTZ);
        etZakat.setText(intent.getStringExtra("Zakat"));
        findViewById(R.id.btnBack).setOnClickListener(view ->{
            finish();
        });

    }
}
