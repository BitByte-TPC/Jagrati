package com.priyanshnama.jagrati.ui.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.priyanshnama.jagrati.R;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private ArrayList<Notification> list = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        progressBar = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.recycler);
        new notifications().execute();
    }

    private void fetchNotifications() {
        Notification notification = new Notification("E","Event : Event Name","Today, 9:00 AM");
        Notification notification2 = new Notification("C","Course Update : Social Science, 6th Class","Today, 7:30 AM");
        Notification notification3 = new Notification("D","Departmental Update : Change the time table","Today, 6:00 AM");

        list.add(notification);
        list.add(notification2);
        list.add(notification3);
    }

    private void showNotification() {
        recyclerView.setAdapter(new NotificationAdapter(this,list));
        recyclerView.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
    }

    private class notifications extends AsyncTask<Void, Void, Void>
    {
        @Override
        protected Void doInBackground(Void... params) {
            fetchNotifications();
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            showNotification();
        }
    }

    public void back(View view){
        finish();
    }
}