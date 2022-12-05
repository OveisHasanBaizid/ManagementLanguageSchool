package com.example.managementlanguageschool.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.managementlanguageschool.R;

public class ActivityManageStudents extends AppCompatActivity {
    RecyclerView recyclerView_manage_student;
    Spinner spinner_choice_term, spinner_choice_course;
    EditText editText_search;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_manage_students);
        init();

    }
    //This method connects the widgets inside the activity to the graphic layer
    public void init() {
        recyclerView_manage_student = findViewById(R.id.recyclerView_manage_student);
        spinner_choice_term = findViewById(R.id.spinner_manage_student_choice_term);
        spinner_choice_course = findViewById(R.id.spinner_manage_student_choice_course);
        editText_search = findViewById(R.id.editText_search_student);
        title = findViewById(R.id.editText_search_student);
    }

    /*When the return button is clicked on the student management page,
   this method is called and the program returns to the previous page.
    */
    public void back_ManageStudents(View view) {
        onBackPressed();
    }

    //This spinner method values the terms and also determines how the spinner will react if the selected value changes.
    public void initialization_spinner_term() {

    }

    //This spinner method values the courses and also determines how the spinner will react if the selected value changes.
    public void initialization_spinner_course() {

    }

    //This method is selected according to the semester and course. Shows the list of students of that course in the list view
    public void initialization_recyclerView() {

    }

    //When the Add Student button is clicked. This method is called and the program is redirected to the add student page
    public void addStudent(View view) {

    }
}