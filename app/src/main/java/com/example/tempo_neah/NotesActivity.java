package com.example.tempo_neah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class NotesActivity extends AppCompatActivity {

    SpaceNavigationView bNav; //bot nav bar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


        //bot nav bar
        bNav = findViewById(R.id.bottMenu);
        bNav.initWithSaveInstanceState(savedInstanceState);
        bNav.showIconOnly();
        bNav.addSpaceItem(new SpaceItem("calendar", R.drawable.cal));
        bNav.addSpaceItem(new SpaceItem("notes", R.drawable.notes));
        bNav.addSpaceItem(new SpaceItem("expenses", R.drawable.exp));
        bNav.addSpaceItem(new SpaceItem("pomodoro", R.drawable.alarm));

        bNav.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(NotesActivity.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                bNav.setCentreButtonSelectable(true);
            }
            @Override
            public void onItemClick(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onItemReselected(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " FUCKING " + itemName, Toast.LENGTH_SHORT).show();
            }
        });
        //bot nav bar
    }
}