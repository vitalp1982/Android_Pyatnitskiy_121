package com.vital.android_pyatnitskiy_121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        метод привязки по id и установки слушателя событий
        //        Button button = findViewById(R.id.button_test);
        //        button.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                System.out.println("Hi");
        //            }
        //        });
    }

    public void registration(View view) {
        final TextView login = findViewById(R.id.userEmail);
        final TextView password = findViewById(R.id.userPassword);
        final TextView log_message = findViewById(R.id.log_message);
        if(isEmailValid(login.getText()) && password.getText().length() > 0) {
            log_message.setText("Учетная запись создана" +
                    "\nлогин пользователя: " + login.getText() +
                    "\nустановлен пароль: " + password.getText());
        } else {
            log_message.setText("Пожалуйста укажите корректный адрес электронной почты и пароль");
        }

    }

    public void clearForm(View view) {
        final TextView login = findViewById(R.id.userEmail);
        final TextView password = findViewById(R.id.userPassword);
        final TextView log_message = findViewById(R.id.log_message);
        login.setText("");
        password.setText("");
        log_message.setText("");

    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
