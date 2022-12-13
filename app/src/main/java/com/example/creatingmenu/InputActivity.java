package com.example.creatingmenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    private EditText etWeight, etManualCurrent;

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate (R.menu.menu, menu);

        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.input_main);
        etWeight = findViewById(R.id.txtFdgram);
        etManualCurrent = findViewById(R.id.txtFdRM);

        findViewById(R.id.btnClr).setOnClickListener(view -> {
            etWeight.setText("");
            etManualCurrent.setText("");
        });
        findViewById(R.id.btnKeep).setOnClickListener(view -> {
//            Toast.makeText(this, String.format("%s , %s", etWeight.getText().toString(), etManualCurrent.getText().toString()),Toast.LENGTH_LONG).show();
            calculate(true);
        });
        findViewById(R.id.btnWear).setOnClickListener(view -> {
            calculate(false);
        });
    }
    private void calculate (boolean keep) {
        float sub = 200;
        float weight = 0, currentGold = 0;
        try{
             weight = Float.parseFloat(etWeight.getText().toString());
             currentGold = Float.parseFloat(etManualCurrent.getText().toString());
        } catch (Exception e){
            return;
        }


        if (keep) {
            sub = 85;
        }
        float amount = weight - sub;
        if (amount < 0)amount=0;
        float zakatPayable = amount * currentGold;
        float zakat = zakatPayable * 0.025f;
        Intent intent = new Intent(this, OutputActivity.class);
        intent.putExtra("TotalGoldValue",String.format("%.2f",weight*currentGold) );
        intent.putExtra("ZakatPayable", String.format("%.2f",zakatPayable));
        intent.putExtra("Zakat", String.format("%.2f", zakat));

        startActivity(intent);

    }
    }









