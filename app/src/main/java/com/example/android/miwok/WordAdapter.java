package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by marka on 9/12/2017. This custom adapter is created to take a Word object and create a
 * listItemView container as defiend in list_item.xml
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    /**
     * This provides a view for the AdapterView to use
     *
     * @param position    The AdapterView position that needs a view
     * @param convertView The recycled view to use
     * @param parent      The parent ViewGroup used to perform the inflation
     * @return The View to be used in the AdapterView position
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if view is being reused
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the word at the current location in the arraylist as passed in the arguments
        Word word = getItem(position);

        //Find the TextView in the list_item_xml layout with id for the default translation word
        TextView defaultTranslation = (TextView) listItemView.findViewById(
                R.id.default_translation_text_view);
        //Set the text in the view to the data stored in the Word default translation
        defaultTranslation.setText(word.getDefaultTranslation());

        //Find the TextView in the list_item_xml layout with id for the Miwok word
        TextView miwokTranslation = (TextView) listItemView.findViewById(
                R.id.miwok_text_view);
        //Set the text in the view to the data stored in the Word default translation
        miwokTranslation.setText(word.getMiworkTranslation());

        return listItemView;
    }
}
