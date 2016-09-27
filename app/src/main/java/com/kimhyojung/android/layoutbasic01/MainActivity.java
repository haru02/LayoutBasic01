package com.kimhyojung.android.layoutbasic01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button7);
        btn2 = (Button) findViewById(R.id.button12);
        btn3 = (Button) findViewById(R.id.button19);
        btn4 = (Button) findViewById(R.id.button20);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LayoutCode.class);
                startActivity(intent);
            }
        });
    }

    public void startDynamicGrid(View v){
        Intent intent = new Intent(this, DynamicGrid.class);
        startActivity(intent);
    }

    public void startLinear(View v){
        Intent intent = new Intent(this, Linear.class);
        startActivity(intent);
    }

    public void startGrid(View v){
        Intent intent = new Intent(this, Grid.class);
        startActivity(intent);
    }
}
