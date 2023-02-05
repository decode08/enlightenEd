package com.example.enlightened;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class subjects extends AppCompatActivity {
CardView mat1s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        mat1s=findViewById(R.id.mat1s);
        Intent intent =new Intent(subjects.this, maths1s.class);
        startActivity(intent);
    }
}