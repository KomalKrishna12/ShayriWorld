package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LoveShayri extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mysharyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_shayri);

        recyclerView = findViewById(R.id.recycleView9);
        mysharyi = getResources().getStringArray(R.array.love_shayri);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mysharyi));
    }
}
