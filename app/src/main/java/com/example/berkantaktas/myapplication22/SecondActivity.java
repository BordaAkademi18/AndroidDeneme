package com.example.berkantaktas.myapplication22;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class SecondActivity extends AppCompatActivity{

    private EditText edittextViewSubject;

    private EditText edittextViewContent;

    private EditText edittextViewDueDate;

    private Button saveButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_second);

        edittextViewSubject = findViewById(R.id.activity_second_subject_edittext);
       edittextViewContent = findViewById(R.id.activity_second_content_edittext);
        edittextViewDueDate = findViewById(R.id.activity_second_date);
        saveButton = findViewById(R.id.activity_second_button);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Note myNote = new Note(
                        edittextViewSubject.getText().toString(),
                        edittextViewContent.getText().toString(),
                        edittextViewDueDate.getText().toString()

                );*/
            Intent intent = new Intent(getBaseContext(),MainActivity.class);
            intent.putExtra("1", edittextViewSubject.getText().toString());
                intent.putExtra("2", edittextViewContent.getText().toString());
                intent.putExtra("3", edittextViewDueDate.getText().toString());
                startActivity(intent);


            }
        });


    }
}


