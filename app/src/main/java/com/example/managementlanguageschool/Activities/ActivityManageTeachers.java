package com.example.managementlanguageschool.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.managementlanguageschool.R;

public class ActivityManageTeachers extends AppCompatActivity {
    RecyclerView recyclerView;
    Bundle bundle;
    EditText editText_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_manage_teachers);

        init();


    }

    //This method initialize the widget
    public void init() {
        editText_search = findViewById(R.id.editText_search_teacher);
        recyclerView = findViewById(R.id.recyclerView_manage_teachers);
    }
    //executing while clicking on back button
    public void back_ManageTeachers(View view) {
        onBackPressed();
    }
    //this methode initialize Teacher lists
    public void initialization_recyclerView(String text) {

    }

    //This method is called when the Add Course button is clicked
    public void addTeacher(View view) {

    }
}