package com.example.mobileandroidnative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Thanks extends AppCompatActivity {

    AppCompatButton btnNext ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        btnNext = findViewById(R.id.btn_start);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thanks.this, ChildDashboard.class);
                startActivity(intent);
            }
        });
    }
}
