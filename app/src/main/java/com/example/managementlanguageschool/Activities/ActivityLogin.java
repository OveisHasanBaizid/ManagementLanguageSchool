package com.example.managementlanguageschool.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.managementlanguageschool.R;

public class ActivityLogin extends AppCompatActivity {
    Spinner spinner;
    Button btn_login;
    EditText editText_username, editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        init();

        /*This code is executed when the program is first installed
        and adds a number of values to the database for initial testing
         */
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (!prefs.getBoolean("firstTime", false)) {


            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime", true);
            editor.apply();
        }

    }

    //Initialize for Spinner Select the login type on the login page
    public void initializeSpinnerTypeLogin() {
        String[] type_login = {"منشی", "مدیر", "توسعه دهنده"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_spinner, type_login);
        spinner.setAdapter(adapter);
        btn_login.setOnClickListener(e -> {
            if (check_editTexts()) {
                if (spinner.getSelectedItemPosition() == 0)
                    login_Admin();
                else if (spinner.getSelectedItemPosition() == 1)
                    login_Manager();
                else
                    login_Developer();
            }
        });
    }

    //This method connects the widgets inside the activity to the graphic layer
    public void init() {
        spinner = findViewById(R.id.spinner);
        btn_login = findViewById(R.id.btn_login);
        editText_username = findViewById(R.id.editText_username);
        editText_password = findViewById(R.id.editText_password);
        initializeSpinnerTypeLogin();
    }

    //This method checks the username and password editTexts for emptiness and returns a boolean value.
    public boolean check_editTexts() {
        if (editText_username.getText().toString().isEmpty()) {
            Toast.makeText(this, "نام کاربری وارد نشده است", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (editText_password.getText().toString().isEmpty()) {
            Toast.makeText(this, "رمز عبور وارد نشده است", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    /*  When the admin login type is selected in the spinner,
    this method is called and performs the validation work and if the
    information is correct, go to the main menu.
    */
    public void login_Admin() {
        String uname = "Admin", pass = "Admin";
        if (editText_username.getText().toString().equals(uname) && editText_password.getText().toString().equals(pass)){
            Toast.makeText(this, "منشی با موفقیت وارد شد.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ActivityMenuAdmin.class);
            startActivity(i);
        }
    }

    /*  When the Manager login type is selected in the spinner,
   this method is called and performs the validation work and if the
   information is correct, go to the main menu.
   */
    public void login_Manager() {
        String uname = "Manager", pass = "Manager";
        if (editText_username.getText().toString().equals(uname) && editText_password.getText().toString().equals(pass)){
            Toast.makeText(this, "مدیر با موفقیت وارد شد.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ActivityMenuManager.class);
            startActivity(i);
        }
    }

    /*  When the Developer login type is selected in the spinner,
          this method is called and performs the validation work and if the
          information is correct, go to the main menu.
          */
    public void login_Developer() {
        String uname = "Developer", pass = "Developer";
        if (editText_username.getText().toString().equals(uname) && editText_password.getText().toString().equals(pass)){
            Toast.makeText(this, "توسعه دهنده با موفقیت وارد شد.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ActivityMenuDeveloper.class);
            startActivity(i);
        }
    }

    //This code is for showing and hiding the password
    public void password_eye(View view) {
        editText_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            editText_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }).start();
    }

}