package com.example.firebase;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class PinCode extends AppCompatActivity {

    private ImageButton backspace;
    private Button[] numbers = new Button[10];
    private int[] button_ids = {R.id.b0, R.id.b1, R.id.b2,
            R.id.b3,R.id.b4,R.id.b5,
            R.id.b6,R.id.b7,R.id.b8,
            R.id.b9};
    private TextView pinCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_pincode);
        backspace = findViewById(R.id.backspace);
        pinCode = findViewById(R.id.pincode);

        for (int i = 0;i < button_ids.length;i++) {
            numbers[i] = findViewById(button_ids[i]);
            int finalI = i;
            numbers[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String changer = pinCode.getText().toString() +
                            finalI;
                    pinCode.setText(changer);
                }
            });
        }

        backspace.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String current = pinCode.getText().toString();
                if (current.length() > 0) {
                    String changer = current.substring(0, current.length() - 1);
                    pinCode.setText(changer);
                }
            }

        });

    }
}