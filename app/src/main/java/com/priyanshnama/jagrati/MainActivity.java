package com.priyanshnama.jagrati;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        open_login();
    }

    private void open_login() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    private void open_home() {
        //startActivity(new Intent(this, HomeActivity.class));
        //finish();
    }
}