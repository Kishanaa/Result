package com.example.result;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class StudentMarksActivity extends AppCompatActivity {
    public static final String EXTRA_STUDENTID="marksId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_marks);

        TextView markBeee=(TextView) findViewById(R.id.mark_beee);
        TextView markCp=(TextView) findViewById(R.id.mark_cp);
        TextView markIot=(TextView) findViewById(R.id.mark_iot);
        TextView markLinear=(TextView) findViewById(R.id.mark_linear);
        TextView markDld=(TextView) findViewById(R.id.mark_dld);

//      Setting -1 as a default value is a common practice when using getIntExtra in Android.
//      It serves as a fallback value in case the extra with the specified key (EXTRA_STUDENTID in this case)
//      is not found or if it cannot be converted to an integer.
        int studentIndex = getIntent().getIntExtra(EXTRA_STUDENTID, -1);

            markBeee.setText(String.valueOf(Marks.marks[studentIndex][0].getMark()));
            markCp.setText(String.valueOf(Marks.marks[studentIndex][1].getMark()));
            markDld.setText(String.valueOf(Marks.marks[studentIndex][2].getMark()));
            markIot.setText(String.valueOf(Marks.marks[studentIndex][3].getMark()));
            markLinear.setText(String.valueOf(Marks.marks[studentIndex][4].getMark()));
    }
}