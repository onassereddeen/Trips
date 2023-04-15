package com.zybooks.trips;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FindTrips extends AppCompatActivity {
    Button request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_trips);

//         inflate the layout first to get the reference of the buttons
//        request = findViewById(R.id.request);

        // Set the setOnClickListener on the request button
//        request.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(FindTrips.this, "Trip Requested", Toast.LENGTH_LONG).show();
//            }
//        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Trip> items = new ArrayList<Trip>();
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        items.add(new Trip("Universal", "Marcia", "2/4 seats filled", "9:00 AM", "2.5 hours"));
        recyclerView.setLayoutManager(new LinearLayoutManager(FindTrips.this));
        recyclerView.setAdapter(new TripAdapter(getApplicationContext(), items));

        // Set the title of the activity to "Find Trips"
        setTitle("Find Trips");
        // For the back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // Overrides method, if the home button is clicked, the user is returned to the original page
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
