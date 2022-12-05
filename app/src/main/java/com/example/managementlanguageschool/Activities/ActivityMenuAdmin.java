package com.example.managementlanguageschool.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.managementlanguageschool.R;

public class ActivityMenuAdmin extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu_admin);

        init();

        name.setText("Admin Admin");

    }


    //This method connects the widgets inside the activity to the graphic layer
    public void init() {
        name = findViewById(R.id.textView_Admin_Name);
    }

    /*When the course management button is clicked,
     this method is executed and the program is directed to the course management page
     */
    public void btn_manage_courses(View view) {
        Intent i = new Intent(this, ActivityManageCourses.class);
        startActivity(i);
    }

    /*When the student management button is clicked,
     this method is executed and the program is directed to the student management page
     */
    public void btn_manage_students(View view) {
        Intent i = new Intent(this, ActivityManageStudents.class);
        startActivity(i);
    }

    /*When the teacher management button is clicked,
    this method is executed and the program is directed to the teacher management page
    */
    public void btn_manage_teachers(View view) {
        Intent i = new Intent(this, ActivityManageTeachers.class);
        startActivity(i);
    }
}