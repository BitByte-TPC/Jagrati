package com.priyanshnama.jagrati.ui.material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.priyanshnama.jagrati.R;

public class ClassMater extends AppCompatActivity {
    TextView titleTextView;
    String title;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classmater);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        titleTextView=(TextView)findViewById(R.id.titleTextView);
        Intent intent = getIntent();
        String title = intent.getStringExtra("iClassNo");
        titleTextView.setText(title);



    }


    

    public void back(View view)
    {
        onBackPressed();
    }
}