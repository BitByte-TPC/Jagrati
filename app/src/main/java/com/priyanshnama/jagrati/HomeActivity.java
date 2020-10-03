package com.priyanshnama.jagrati;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.priyanshnama.jagrati.ui.notification.NotificationActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        NavController bottomNavController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, bottomNavController);

    }

    public void open_notification(View view) {
        startActivity(new Intent(this, NotificationActivity.class));
    }

    public void open_profile(View view) {
        startActivity(new Intent(this, ProfileActivity.class));
    }
}