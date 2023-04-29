package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.firebase.testviewmodel.TestViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Test extends AppCompatActivity {

    FloatingActionButton fab;
    FloatingActionButton fab2;
    FloatingActionButton fab3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        fab = findViewById(R.id.floatingActionButton);
        fab2 = findViewById(R.id.floatingActionButton2);
        fab3 = findViewById(R.id.floatingActionButton3);

        textView = findViewById(R.id.counter);


        TestViewModel testViewModel = new ViewModelProvider(this).get(TestViewModel.class);
        testViewModel.getLiveData().observe(this, integer -> textView.setText(String.valueOf(integer)));

        fab.setOnClickListener(v -> {
            testViewModel.addValue();
        });

        fab2.setOnClickListener(v -> {
            testViewModel.decreaseValue();
        });

        fab3.setOnClickListener(v -> {
            testViewModel.zeroValue();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Destroy", "Destroy method called");
    }
}