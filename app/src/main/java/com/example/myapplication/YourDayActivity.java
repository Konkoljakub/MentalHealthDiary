package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class YourDayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_day);

        TextView textViewMFOP = findViewById(R.id.textViewMFOP);
        SeekBar seekBarMFOP = findViewById(R.id.seekBarMFOP);

        TextView textViewMIP = findViewById(R.id.textViewMIP);
        SeekBar seekBarMIP = findViewById(R.id.seekBarMIP);

        TextView textViewOFM = findViewById(R.id.textViewOFM);
        SeekBar seekBarOFM = findViewById(R.id.seekBarOFM);
        seekBarOFM.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBarOFM, int i, boolean b) {
                textViewOFM.setText("" + i + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBarOFM){
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBarOFM) {
                int value = seekBarMFOP.getProgress();
            }
        });
        seekBarMFOP.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

          @Override
          public void onProgressChanged(SeekBar seekBarMFOP, int i, boolean b) {
              textViewMFOP.setText("" + i + "%");
          }

          @Override
          public void onStartTrackingTouch(SeekBar seekBarMFOP){
          }

          @Override
          public void onStopTrackingTouch(SeekBar seekBarMFOP) {
              int value = seekBarMFOP.getProgress();
              }
          });
        seekBarMIP.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBarMIP, int i, boolean b) {
                textViewMIP.setText("" + i + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBarMIP){
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBarMIP) {
                int value = seekBarMIP.getProgress();
            }
        });

    }
}