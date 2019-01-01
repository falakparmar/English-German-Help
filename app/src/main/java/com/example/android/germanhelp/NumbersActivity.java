package com.example.android.germanhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create a list of words for the numbers

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One".toString(), "Eins".toString()));
        words.add(new Word("Two".toString(), "Zwie".toString()));
        words.add(new Word("Three".toString(), "Drei".toString()));
        words.add(new Word("Four".toString(), "Vier".toString()));
        words.add(new Word("Five".toString(), "Fünf".toString()));
        words.add(new Word("Six".toString(), "Sechs".toString()));
        words.add(new Word("Seven".toString(), "Sieben".toString()));
        words.add(new Word("Eight".toString(), "Acht".toString()));
        words.add(new Word("Nine".toString(), "Neun".toString()));
        words.add(new Word("Ten".toString(), "Zehn".toString()));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
