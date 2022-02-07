package com.cst2335.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox checkedBox = findViewById(R.id.checkBox);
        checkedBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkedBox.setChecked(isChecked);
                if (checkedBox.isChecked()){
                    Snackbar.make(checkedBox, "The switch is now On" , BaseTransientBottomBar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            checkedBox.setChecked(!isChecked);
                        }
                    }).show();
                }else {
                    Snackbar.make(checkedBox, "The switch is now Off" , BaseTransientBottomBar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            checkedBox.setChecked(!isChecked);
                        }
                    }).show();
                }

            }
        });


        Button mButton = findViewById(R.id.button);
    mButton.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String toast_message = MainActivity.this.getResources().getString(R.string.toast_message);
       Toast.makeText(getApplicationContext(), "Here is more information", Toast.LENGTH_LONG).show();
        }
    });


    }
}