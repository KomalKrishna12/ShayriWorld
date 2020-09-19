package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SadShyriHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad_shyri_hindi);

        recyclerView = findViewById(R.id.recycleView14);
        mys = getResources().getStringArray(R.array.sad_shayri_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mys));
    }
}
