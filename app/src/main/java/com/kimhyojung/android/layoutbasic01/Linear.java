package com.kimhyojung.android.layoutbasic01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Linear extends AppCompatActivity {

    TextView text9;
    TextView text11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_linear);
        TextView textview9 = (TextView) findViewById(R.id.textView9);
        TextView textview11 = (TextView) findViewById(R.id.textView11);
    }

    public void goWeather(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=top_tsi&where=nexearch&query=%EC%98%A4%EB%8A%98+%EB%82%A0%EC%94%A8"));
        startActivity(intent);
    }

    public void weekWeather(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://weather.naver.com/period/weeklyFcast.nhn"));
        startActivity(intent);
    }
}
