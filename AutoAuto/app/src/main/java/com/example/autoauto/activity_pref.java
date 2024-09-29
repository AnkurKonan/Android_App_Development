package com.example.autoauto;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class activity_pref extends AppCompatActivity {

    private Switch themeSwitch;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pref);

        themeSwitch = findViewById(R.id.theme_switch);
        sharedPreferences = getSharedPreferences("AppSettings", MODE_PRIVATE);

        // Load the saved theme preference
        boolean isDarkMode = sharedPreferences.getBoolean("DARK_MODE", false);
        themeSwitch.setChecked(isDarkMode);
        AppCompatDelegate.setDefaultNightMode(isDarkMode ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);

        themeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Save the theme preference
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("DARK_MODE", isChecked);
            editor.apply();

            // Apply the selected theme
            AppCompatDelegate.setDefaultNightMode(isChecked ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
        });

    }
}