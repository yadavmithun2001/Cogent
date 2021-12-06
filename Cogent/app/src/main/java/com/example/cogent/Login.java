package com.example.cogent;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edit_phone;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edit_phone = findViewById(R.id.edit_phone);
        login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_phone.getText().toString().length()!=10){
                    Toast.makeText(Login.this, "Please Enter Valid Phone Number", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }
}