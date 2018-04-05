package com.iteso.is699367.halp_exclamation_mark;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    EditText name, pwd;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.activity_login_email);
        pwd = findViewById(R.id.activity_login_password);
        login = findViewById(R.id.activity_login_log_in);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUser();
                Intent intent = new Intent(ActivityLogin.this, ActivityMain.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void saveUser() {
        SharedPreferences sharedPreferences = getSharedPreferences(
                "com.iteso.USER_PREFERENCES", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("NAME", name.getText().toString());
        editor.putString("PWD", pwd.getText().toString());
        editor.putBoolean("LOGGED", true);
        editor.apply();
    }
}