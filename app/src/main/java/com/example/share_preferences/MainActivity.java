package com.example.share_preferences;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSaveUserName = findViewById(R.id.btnSaveData);
        EditText edtUserName = findViewById(R.id.edtUserName);

        // check app xem có phải lần đầu tiên install
        if (!DataLocalManager.getFirstInstalled()) {
            Toast.makeText(this, "First install app", Toast.LENGTH_SHORT).show();
            DataLocalManager.setFirstInstalled(true);
        }

        // save data username vào SharedPreferences và intent sang activity 2 để show data.
        btnSaveUserName.setOnClickListener(v -> {
            if(edtUserName.getText().length() > 0){
                DataLocalManager.setNameUser(edtUserName.getText().toString().trim());
                Toast.makeText(this, "save username success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "username null!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}











