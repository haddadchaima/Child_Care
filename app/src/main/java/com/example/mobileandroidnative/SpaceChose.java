package com.example.mobileandroidnative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SpaceChose extends AppCompatActivity {

    ImageView btnParents ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_chose);

        btnParents = findViewById(R.id.img_btn_parents);

        btnParents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SpaceChose.this, Bienvenu.class);
                startActivity(intent);
            }
        });
    }
}
