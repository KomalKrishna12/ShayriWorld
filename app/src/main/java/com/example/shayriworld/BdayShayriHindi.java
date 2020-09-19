package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BdayShayriHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mysharyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bday_shayri_hindi);

        recyclerView=findViewById(R.id.recycleView4);
        mysharyi=getResources().getStringArray(R.array.bday_shayri_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mysharyi));
    }
}
