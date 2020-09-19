package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MotiShayriHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moti_shayri_hindi);

        recyclerView = findViewById(R.id.recycleView12);
        mys = getResources().getStringArray(R.array.moti_shayri_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mys));
    }
}
