package com.example.ashrafulhassan.ambulancesearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.Toast;

/**
 * Created by Ashraful Hassan on 8/19/2017.
 */

public class Activity_Register extends AppCompatActivity {

    EditText nameET, rollET, phnnumET;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        nameET = (EditText) findViewById(R.id.nameET);
        rollET = (EditText) findViewById(R.id.rollET);
        phnnumET = (EditText) findViewById(R.id.phnnumET);
    }

    public void addContact(View view){

        SavePreferences("NAME",nameET.getText().toString());
        SavePreferences("EMAIL", rollET.getText().toString());
        SavePreferences("PASSWORD", phnnumET.getText().toString());
        Toast.makeText(getApplicationContext(), "SignUP successfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();

    }

    private void SavePreferences(String key, String value){
        SharedPreferences sharedPreferences = getSharedPreferences("jesan.collegeproject01.SIGNUP",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.commit();
    }
}
