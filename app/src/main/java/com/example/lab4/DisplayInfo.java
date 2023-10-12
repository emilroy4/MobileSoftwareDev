package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        // Access the TextView elements by their IDs
        TextView displayCountry = findViewById(R.id.display_country);
        TextView displayCity = findViewById(R.id.display_city);
        TextView displayPopulation = findViewById(R.id.display_population);
        TextView displayMetropolitan = findViewById(R.id.display_metropolitan);

        // Set text for each TextView
        displayCountry.setText("Country: United States");
        displayCity.setText("City: New York");
        displayPopulation.setText("Population: 8.4 million");
        displayMetropolitan.setText("Metropolitan Area: Yes");
    }
}
