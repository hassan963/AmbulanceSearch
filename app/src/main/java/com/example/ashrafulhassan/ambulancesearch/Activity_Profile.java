package com.example.ashrafulhassan.ambulancesearch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ashraful Hassan on 8/19/2017.
 */

public class Activity_Profile extends AppCompatActivity {

    TextView userName;
    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sharedPreferences = getSharedPreferences("jesan.collegeproject01.SIGNUP", MODE_PRIVATE);

        String name = sharedPreferences.getString("NAME", "");

        userName = (TextView) findViewById(R.id.userName);
        userName.setText(name);
    }

    public void payment(View view){
        Toast.makeText(this, "PAYMENT", Toast.LENGTH_SHORT).show();
    }

    public void help(View view){
        Toast.makeText(this, "HELP", Toast.LENGTH_SHORT).show();
    }

    public void settings(View view){
        Toast.makeText(this, "SETTINGS", Toast.LENGTH_SHORT).show();
    }

    public void search(View view){
        Toast.makeText(this, "HELP", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), Activity_Search.class);
        startActivity(intent);
    }

}
