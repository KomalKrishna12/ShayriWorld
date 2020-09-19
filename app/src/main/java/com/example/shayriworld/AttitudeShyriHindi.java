package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AttitudeShyriHindi extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] mySharyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attitude_shyri_hindi);

        recyclerView=findViewById(R.id.recycleView2);
        mySharyi=getResources().getStringArray(R.array.attitude_hindi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(mySharyi));
    }
}
