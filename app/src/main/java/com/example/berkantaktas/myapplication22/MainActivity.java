package com.example.berkantaktas.myapplication22;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private ListView noteList;
    private CrazyAdapter listViewAdapter;
    public Context mContext;
    static ArrayList<Note> noteArray = new ArrayList<>( );

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mContext = this;
     //this.noteArray.add(new Note("sa","as","asd" ));


    addButton = findViewById(R.id.activtiy_main_button);
    noteList = findViewById(R.id.activtiy_main_listview);

    addButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            launchActivity();
        }
    });




    listViewAdapter = new CrazyAdapter(mContext,noteArray);


        noteList.setAdapter(listViewAdapter);


    Bundle extras    = getIntent().getExtras();
        if (extras != null) {
           String temp1 = extras.getString("1");
            String temp2 = extras.getString("2");
            String temp3 = extras.getString("3");
            //The key argument here must match that used in the other activity
            this.noteArray.add(new Note(temp1,temp2,temp3 ));
        }


        //TODO ADAP


    listViewAdapter.notifyDataSetChanged();


    }


    private void launchActivity()
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}
