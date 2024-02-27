package com.example.result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;

public class StudentNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_name);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,View itemView,int position,long id){
                Intent intent =new Intent(StudentNameActivity.this,StudentMarksActivity.class);
                intent.putExtra(StudentMarksActivity.EXTRA_STUDENTID,(int) id);
                startActivity(intent);
            }
        };
        ListView listView =(ListView) findViewById(R.id.student_list);
        listView.setOnItemClickListener(itemClickListener);

    }

}