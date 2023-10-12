package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;  // Added import for View
import android.widget.AdapterView;  // Added import for AdapterView
import android.widget.AdapterView.OnItemClickListener; // Added import for OnItemClickListener
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView country_list;
    TextView displayCountry, displayCity, displayPopulation, displayMetropolitan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info); // Set the content view to display_info.xml

        // Initialize your TextView references
        displayCountry = findViewById(R.id.display_country);
        displayCity = findViewById(R.id.display_city);
        displayPopulation = findViewById(R.id.display_population);
        displayMetropolitan = findViewById(R.id.display_metropolitan);

        // Create an ArrayList of cities
        ArrayList<String> city_array = new ArrayList<>();
        city_array.add("Shanghai");
        city_array.add("New York");
        city_array.add("Paris");

        // Create an ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, city_array);

        // Set the adapter for the ListView
        country_list = findViewById(R.id.country_list); // Initialize country_list
        country_list.setAdapter(adapter);

        // Set an item click listener to update the TextViews
        country_list.setOnItemClickListener(new OnItemClickListener() { // Use the correct import for OnItemClickListener
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Handle item click
                String cityName = city_array.get(position);
                displayCountry.setText("Country: " + cityName);
                displayCity.setText("City: " + cityName);
                displayPopulation.setText("City Pop: N/A");
                displayMetropolitan.setText("Metro. pop: N/A");
            }
        });
    }
}
