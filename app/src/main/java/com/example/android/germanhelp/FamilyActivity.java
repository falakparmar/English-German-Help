package com.example.android.germanhelp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words which tells the Family Members names
        ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("Father".toString(), "Vater".toString()));
            words.add(new Word("Mother".toString(), "Mutter".toString()));
            words.add(new Word("Son".toString(), "Son".toString()));
            words.add(new Word("Daughter".toString(), "Tochter".toString()));
            words.add(new Word("Brother".toString(), "Bruder".toString()));
            words.add(new Word("Sister".toString(), "Schwester".toString()));
            words.add(new Word("Grandmother ".toString(), "Großmutter".toString()));
            words.add(new Word("Grandfather".toString(), "Großvater".toString()));
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
