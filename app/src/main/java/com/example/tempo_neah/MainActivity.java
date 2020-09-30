package com.example.tempo_neah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnnotes, btnpom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnotes = (Button) findViewById(R.id.btn1);
        btnnotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNotes();
            }
        });
        btnpom = (Button) findViewById(R.id.btn2);
        btnpom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPom();
            }
        });

    }

    public void openNotes(){
        Intent int_notes = new Intent(this, NotesActivity.class);
        startActivity(int_notes);
    }
    public void openPom(){
        Intent int_pom = new Intent(this, PomodoroActivity.class);
        startActivity(int_pom);
    }
}