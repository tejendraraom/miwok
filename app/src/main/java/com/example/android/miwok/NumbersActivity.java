package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ArrayList<Word> words = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        words.add(new Word("one","lutti"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(itemsAdapter);
    }
}