package com.example.recycle_view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mems> mems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);

        MemsAdapter memsAdapter = new MemsAdapter(this, mems);

        recyclerView.setAdapter(memsAdapter);
    }
    private void setInitialData(){
        mems.add(new Mems("Dog", "Crazy", R.drawable.crazydog));
        mems.add(new Mems("Monkey", "Funny", R.drawable.monkey));
        mems.add(new Mems("Cat", "Cutty", R.drawable.cat));
    }
}