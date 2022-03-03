package com.example.share_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tvShowData = findViewById(R.id.tvShowData);

        // show data vừa lưu ở activity 1
        tvShowData.setText(DataLocalManager.getNameUser());
    }
}