package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FrndShayri extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frnd_shayri);

        recyclerView = findViewById(R.id.recycleView5);
        my = getResources().getStringArray(R.array.frnd_shayri);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(my));
    }
}
