package com.cst2335.lab2;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.content.Intent;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class ProfileActivity extends AppCompatActivity {

    EditText t1;

    public static final String TAG = "PROFILE_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "in function:" /*onStart()*/);
        Log.e(TAG, "in function:" /*onCreate()*/);
        super.onCreate(savedInstanceState);
        Log.e(TAG, "in function:" /*onPause()*/);
        setContentView(R.layout.activity_new);


        ImageButton button = findViewById(R.id.imageButton);
        ImageView imgView = findViewById(R.id.imageView);

        t1 = findViewById(R.id.t3);


        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("userPref", Context.MODE_PRIVATE);
        Log.e(TAG, "in function:" /*onStop()*/);
        Log.e(TAG, "in function:" /*onDestroy()*/);
        String email = sharedPreferences.getString("plain", "");
        Log.e(TAG, "in function:" /*onActivityResults()*/);
        t1.setText(email);






    }

        }














