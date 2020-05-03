package com.vital.android_pyatnitskiy_121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView login;
    private TextView password;
    private TextView log_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
      }

    private void init() {
        login = findViewById(R.id.userEmail);
        password = findViewById(R.id.userPassword);
        log_message = findViewById(R.id.log_message);
    }

    public void registration(View view) {

        if(isEmailValid(login.getText()) && password.getText().length() > 0) {
            log_message.setText(getString(R.string.create_user_msg, login.getText(), password.getText()));
        } else {
            log_message.setText(R.string.error_create_user_msg);
        }

    }

    public void clearForm(View view) {
        login.setText("");
        password.setText("");
        log_message.setText("");

    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
