package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionCheckBox extends AppCompatActivity {
    RadioGroup radioGroup;
    CheckBox checkBox1, checkBox2;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_check_box);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);

        button = findViewById(R.id.button);


        button.setOnClickListener(v -> {
            if(checkBox1.isChecked() && checkBox2.isChecked())
                Toast.makeText(QuestionCheckBox.this, "дурыс", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(QuestionCheckBox.this, "дурыс емес   ", Toast.LENGTH_LONG).show();
        });


    }
}