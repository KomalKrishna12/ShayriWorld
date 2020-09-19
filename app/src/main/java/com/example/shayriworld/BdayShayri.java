package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BdayShayri extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] myshari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bday_shayri);

        recyclerView=findViewById(R.id.recycleView3);
        myshari=getResources().getStringArray(R.array.bday_shayri);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(myshari));
    }
}
