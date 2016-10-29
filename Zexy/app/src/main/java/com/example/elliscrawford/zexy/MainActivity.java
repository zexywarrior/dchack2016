package com.example.elliscrawford.zexy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        // ActivityOne.java
            Intent i = new Intent(MainActivity.this, login.class);
            startActivity(i); // brings up the second activity

    }
}
