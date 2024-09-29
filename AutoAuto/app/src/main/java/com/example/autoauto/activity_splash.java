package com.example.autoauto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class activity_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Handler to delay for 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Move to LoginActivity after 3 seconds
                Intent intent = new Intent(activity_splash.this, activity_login.class);
                startActivity(intent);
                finish(); // close the splash screen activity
            }
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}