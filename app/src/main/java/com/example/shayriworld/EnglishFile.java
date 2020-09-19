package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishFile extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_file);

        b1=findViewById(R.id.atitude_sha);
        b2=findViewById(R.id.bday_sha);
        b3=findViewById(R.id.frnd_sha);
        b4=findViewById(R.id.funny_sha);
        b5=findViewById(R.id.love_sha);
        b6=findViewById(R.id.motivational_sha);
        b7=findViewById(R.id.sad_sha);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,AttitudeShayri.class);
                startActivity(i);

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,AttitudeShayri.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,BdayShayri.class);
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,FrndShayri.class);
                startActivity(i);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,FunnyShayri.class);
                startActivity(i);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,LoveShayri.class);
                startActivity(i);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,MotiSharyi.class);
                startActivity(i);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(EnglishFile.this,SaadShayri.class);
                startActivity(i);

            }
        });
    }
}
