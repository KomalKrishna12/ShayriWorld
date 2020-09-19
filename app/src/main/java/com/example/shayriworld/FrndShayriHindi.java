package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FrndShayriHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mysharyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frnd_shayri_hindi);

        recyclerView=findViewById(R.id.recycleView6);
        mysharyi=getResources().getStringArray(R.array.frnd_shayri_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mysharyi));
    }
}
