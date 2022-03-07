package com.cst2335.lab4;

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
import android.widget.Button;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;

import com.cst2335.lab2.R;


public class ProfileActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    public static final String TAG = "PROFILE_ACTIVITY";

    EditText t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new);


        ImageButton button = findViewById(R.id.imageButton);
        ImageView imgView = findViewById(R.id.imageView);

        Button button2 = findViewById(R.id.newpagebutton);

        t1 = findViewById(R.id.t3);


        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("userPref", Context.MODE_PRIVATE);

        String email = sharedPreferences.getString("plain", "");

        t1.setText(email);






}


protected void onCreate() {
        onCreate();
        Log.e(TAG, "in function onCreate()");
}

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.e(TAG, "In function onStart():");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.e(TAG, "In function onResume():");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.e(TAG, "In function onPause():");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.e(TAG, "In function onStop():");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.e(TAG, "In function onDestroy():");
    }


    }
















