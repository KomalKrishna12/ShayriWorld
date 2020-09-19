package com.example.shayriworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HindiFile extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_file);

        b1=findViewById(R.id.atitude_sha2);
        b2=findViewById(R.id.bday_sha2);
        b3=findViewById(R.id.frnd_sha2);
        b4=findViewById(R.id.funny_sha2);
        b5=findViewById(R.id.love_sha2);
        b6=findViewById(R.id.moti_sha2);
        b7=findViewById(R.id.sad_sha2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,AttitudeShyriHindi.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,BdayShayriHindi.class);
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,FrndShayriHindi.class);
                startActivity(i);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,FunnyShHindi.class);
                startActivity(i);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,LoveShyriHindi.class);
                startActivity(i);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,MotiShayriHindi.class);
                startActivity(i);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(HindiFile.this,SadShyriHindi.class);
                startActivity(i);

            }
        });

    }
}
