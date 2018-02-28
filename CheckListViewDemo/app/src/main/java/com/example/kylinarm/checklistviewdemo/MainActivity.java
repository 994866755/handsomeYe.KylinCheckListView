package com.example.kylinarm.checklistviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kylinarm.checklistviewdemo.demo.MultiselectActivity;
import com.example.kylinarm.checklistviewdemo.demo.RadioActivity;

public class MainActivity extends AppCompatActivity {

    Button btnRadio;
    Button btnMult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRadio = (Button) findViewById(R.id.btn_radio);
        btnMult = (Button) findViewById(R.id.btn_mult);
        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(intent);
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MultiselectActivity.class);
                startActivity(intent);
            }
        });
    }

}
