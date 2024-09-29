package com.example.autoauto;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the layout file for this activity

            // Find the SearchViews
            SearchView currentLocationSearchView = findViewById(R.id.current_location_search);
            SearchView droppingLocationSearchView = findViewById(R.id.dropping_location_search);

            // Set default queries
            currentLocationSearchView.setQuery("Current Location", true);
            droppingLocationSearchView.setQuery("Dropping Location", false);
        }
    }
