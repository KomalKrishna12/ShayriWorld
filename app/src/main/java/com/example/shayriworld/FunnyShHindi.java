package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FunnyShHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mysh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny_sh_hindi);

        recyclerView = findViewById(R.id.recycleView7);
        mysh = getResources().getStringArray(R.array.funny_shayri_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mysh));
    }
}
