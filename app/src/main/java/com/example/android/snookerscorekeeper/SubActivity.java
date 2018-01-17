package com.example.android.snookerscorekeeper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void sendMessageback (View view)
    {
        Intent intent = new Intent(SubActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
