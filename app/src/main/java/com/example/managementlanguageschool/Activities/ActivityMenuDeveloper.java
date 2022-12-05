package com.example.managementlanguageschool.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.managementlanguageschool.R;

public class ActivityMenuDeveloper extends AppCompatActivity {
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu_developer);
        init();

        name.setText("Developer");
    }
    //This method connects the widgets inside the activity to the graphic layer

    public void init() {
        name = findViewById(R.id.textView_Developer_Name);
    }
    //When the profile button is clicked, this method is executed and executes the profile activity program
    public void btn_profile(View view) {

    }
    //executing while clicking on back button in developer layout
    public void back_editManger(View view) {

    }
}