package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AttitudeShayri extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] myShari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attitude_shayri);

        recyclerView=findViewById(R.id.recycleView);
        myShari=getResources().getStringArray(R.array.attitude);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(myShari));


    }
}
