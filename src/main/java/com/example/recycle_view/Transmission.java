package com.example.recycle_view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Transmission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back_item);

        Intent intent = getIntent();
        String memTitle = intent.getStringExtra("name");
        String memDescription = intent.getStringExtra("character");
        int memImage = intent.getIntExtra("image", R.drawable.crazydog);

        TextView nameTextView = findViewById(R.id.mem_title);
        TextView characterTextView = findViewById(R.id.mem_description);
        ImageView imageView = findViewById(R.id.mem_image);
        Button backButton = findViewById(R.id.back_button);

        nameTextView.setText(memTitle);
        characterTextView.setText(memDescription);
        imageView.setImageResource(memImage);

        backButton.setOnClickListener(v -> finish());
    }

}