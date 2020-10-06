package com.priyanshnama.jagrati.ui.material;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.priyanshnama.jagrati.R;

public class SecondActivity extends AppCompatActivity {

    TextView titleTextView;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        titleTextView=(TextView)findViewById(R.id.titleTextView);
        Intent intent = getIntent();
        String title = intent.getStringExtra("iClassNo");
        titleTextView.setText(title);

    }
}