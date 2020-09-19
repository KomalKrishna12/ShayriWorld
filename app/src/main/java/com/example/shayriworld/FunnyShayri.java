package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FunnyShayri extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] myShari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny_shayri);

        recyclerView = findViewById(R.id.recycleView8);
        myShari = getResources().getStringArray(R.array.funny_shayri);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(myShari));
    }
}
