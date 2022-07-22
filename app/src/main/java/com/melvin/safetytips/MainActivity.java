package com.melvin.safetytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tv_registration;
    public EditText et_firstName, et_secondName, et_userName, et_phoneNumber,et_address, et_password;
    public Button btn_register, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_registration = findViewById(R.id.tv_registration_id);
        et_firstName = findViewById(R.id.et_first_name_id);
        et_secondName = findViewById(R.id.et_second_name_id);
        et_userName = findViewById(R.id.et_User_name_id);
        et_phoneNumber = findViewById(R.id.et_phone_number_id);
        et_address = findViewById(R.id.et_email_address_id);
        btn_register = findViewById(R.id.btn_register_id);
        et_password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login1);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, LogInActivity.class));
                startActivity(intent);
            }

        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = (new Intent(MainActivity.this, LogInActivity.class));
            startActivity(intent);
        }


        });

    }
}