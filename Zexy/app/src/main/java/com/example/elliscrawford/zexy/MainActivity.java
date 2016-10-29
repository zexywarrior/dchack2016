package com.example.elliscrawford.zexy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Screen1(View view) {
        Intent i = new Intent(MainActivity.this, LaunchActivity.class);
        startActivity(i);
    }
}
