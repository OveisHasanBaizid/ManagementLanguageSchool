package com.example.managementlanguageschool.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.managementlanguageschool.R;

public class ActivityMenuManager extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu_manager);

        init();

        name.setText("Manager Manager");

    }

    //This method connects the widgets inside the activity to the graphic layer
    public void init() {
        name = findViewById(R.id.textView_Manager_Name);
    }

    /*When the teachers pay button is clicked,
     this method is executed and the program is directed to the teachers pay page
  */
    public void btn_teachers_pay(View view) {

    }

    /* When the term management button is clicked,
    this method is executed and the program is directed to the term management page
    */
    public void btn_manage_terms(View view) {

    }
    /* When the admins management button is clicked,
    this method is executed and the program is directed to the admins management page
    */
    public void btn_manage_admins(View view) {

    }
    /*When the turnover button is clicked,
    this method is executed and the page related to turnover and transactions opens
     */
    public void btn_turnover(View view) {

    }
}