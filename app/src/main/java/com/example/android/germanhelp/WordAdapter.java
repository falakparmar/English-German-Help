package com.example.android.germanhelp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter  extends ArrayAdapter<Word> {
    /**

     * Create a new {@link WordAdapter} object.

     *

     * @param context is the current context (i.e. Activity) that the adapter is being created in.

     * @param words is the list of {@link Word}s to be displayed.

     */

    public WordAdapter(Context context, ArrayList<Word> words) {

        super(context, 0, words);

    }



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.list_item, parent, false);

        }



        // Get the {@link Word} object located at this position in the list

        Word currentWord = getItem(position);



        // Find the TextView in the list_item.xml layout with the ID german_text_view.

        TextView germanTextView = (TextView) listItemView.findViewById(R.id.german_text_view);

        // Get the German translation from the currentWord object and set this text on

        // the German TextView.

        germanTextView.setText(currentWord.getGermanTranslation());



        // Find the TextView in the list_item.xml layout with the ID default_text_view.

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // Get the default translation from the currentWord object and set this text on

        // the default TextView.

        defaultTextView.setText(currentWord.getDefaultTranslation());



        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in

        // the ListView.

        return listItemView;

    }
}