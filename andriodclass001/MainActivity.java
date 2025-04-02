package com.example.andriodclass001;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
    }

    private void initButton(){
        Button button = findViewById(R.id.button_id);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);

        });


    }


}