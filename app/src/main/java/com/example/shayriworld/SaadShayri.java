package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SaadShayri extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saad_shayri);

        recyclerView = findViewById(R.id.recycleView13);
        mys = getResources().getStringArray(R.array.sad_shayri);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mys));
    }
}
