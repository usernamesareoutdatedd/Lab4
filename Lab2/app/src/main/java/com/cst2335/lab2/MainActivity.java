package com.cst2335.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     TextView email;
     EditText plain;
     TextView password;
     EditText info;
     Button button, button2;
    String plainStr, passStr;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email =  findViewById(R.id.email);
        plain =  findViewById(R.id.plain);
        password =  findViewById(R.id.password);
        info =  findViewById(R.id.info);
        button = findViewById(R.id.button);




       sharedPreferences = getSharedPreferences("userPref", Context.MODE_PRIVATE);




      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              plainStr = plain.getText().toString();
              passStr = info.getText().toString();

              SharedPreferences.Editor editor = sharedPreferences.edit();

              editor.putString("plain", plainStr);
              editor.putString("info", passStr);
              editor.commit();

              Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_LONG).show();
              Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
              startActivity(intent);
          }
      });



    }
}