package com.example.mahmoud.home__fix;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);  new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              gooo();          }


        }, 4000);
    }

    private void gooo() {
     Intent   intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
