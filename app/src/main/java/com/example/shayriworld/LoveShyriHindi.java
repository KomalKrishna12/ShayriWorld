package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LoveShyriHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_shyri_hindi);

        recyclerView = findViewById(R.id.recycleView10);
        mys = getResources().getStringArray(R.array.love_shayri_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mys));
    }
}
