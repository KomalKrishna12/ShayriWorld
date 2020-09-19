package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MotiSharyi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mysharyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moti_sharyi);

        recyclerView = findViewById(R.id.recycleView11);
        mysharyi = getResources().getStringArray(R.array.moti_shayri);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mysharyi));
    }
}
