package com.example.result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

    }
    public void studentStart(View view){
        Intent intent=new Intent(this,StudentNameActivity.class);
        startActivity(intent);
    }
}