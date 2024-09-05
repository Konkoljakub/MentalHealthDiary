package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        TextView textYourday = findViewById(R.id.textYourday);
        TextView textDiary = findViewById(R.id.textDiary);

        textYourday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (DayActivity.this, YourDayActivity.class);
                startActivity(intent);
            }
        });
        textDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DayActivity.this, DiaryActivity.class);
                startActivity(intent);
            }
        });

    }
}