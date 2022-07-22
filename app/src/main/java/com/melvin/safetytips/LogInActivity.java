package com.melvin.safetytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class LogInActivity extends AppCompatActivity {
    public TextView tv_signIn, tv_signUp, tv_orSignWith;
    public EditText et_emailAddress, et_password;
    public MaterialButton mb_loggIn;
    public ImageView iv_google, iv_facebook, iv_twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        tv_signIn = findViewById(R.id.tv_sign_in);
        tv_signUp = findViewById(R.id.tv_signup);
        tv_orSignWith = findViewById(R.id.tv_other);
        et_emailAddress = findViewById(R.id._et_email);
        et_password = findViewById(R.id.et_password);
        mb_loggIn = findViewById(R.id.btn_login);
        iv_facebook = findViewById(R.id.fb);
        iv_twitter = findViewById(R.id.twitter);
        iv_google = findViewById(R.id.google);

        mb_loggIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(LogInActivity.this, ChatActivity.class));
                startActivity(intent);
            }

        });
        tv_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(LogInActivity.this, MainActivity.class));
                startActivity(intent);
            }

        });
    }
}