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

    public void print(View view) {
        final TextView text = findViewById(R.id.textView_test);
        text.setText("Hi");
        System.out.println("Hi");
    }
}
