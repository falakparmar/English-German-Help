package com.example.android.germanhelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category

        TextView numbers = (TextView) findViewById(R.id.numbers);



        // Set a click listener on that View

        numbers.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.

            @Override

            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}

                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);



                // Start the new activity

                startActivity(numbersIntent);

            }

        });



        // Find the View that shows the family category

        TextView family = (TextView) findViewById(R.id.family);



        // Set a click listener on that View

        family.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the family category is clicked on.

            @Override

            public void onClick(View view) {

                // Create a new intent to open the {@link FamilyActivity}

                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);



                // Start the new activity

                startActivity(familyIntent);

            }

        });
    }


}