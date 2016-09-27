package com.kimhyojung.android.layoutbasic01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;

public class DynamicGrid extends AppCompatActivity {

    GridLayout grid;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_grid);

        Button button = (Button) findViewById(R.id.makeButton);
        grid = (GridLayout) findViewById(R.id.gridView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Button newButton = new Button(DynamicGrid.this);
                newButton.setText(""+ ++i);
                grid.addView(newButton);

                newButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        grid.removeView(v);
                    }
                });

            }
        });


    }
}
