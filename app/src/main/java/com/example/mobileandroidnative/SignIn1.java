package com.example.mobileandroidnative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignIn1 extends AppCompatActivity {

    LinearLayout linearBtnEmail ;
    TextView txtViewSignUp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_1);
        linearBtnEmail = findViewById(R.id.linear_button_email);
        txtViewSignUp = findViewById(R.id.btn_sign_up);

        linearBtnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn1.this, SignIn2.class);
                startActivity(intent);
            }
        });

        txtViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUp = new Intent(SignIn1.this, SignUp.class);
                startActivity(intentSignUp);
            }
        });
    }
}
