package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    String kod="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1=findViewById(R.id.number1);
        b2=findViewById(R.id.number2);
        b3=findViewById(R.id.number3);
        b4=findViewById(R.id.number4);
        b5=findViewById(R.id.number5);
        b6=findViewById(R.id.number6);
        b7=findViewById(R.id.number7);
        b8=findViewById(R.id.n8);
        b9=findViewById(R.id.number9);
        b0=findViewById(R.id.number0);
        i5=findViewById(R.id.imageView11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                kod=kod+"1";
                i1=findViewById(R.id.imageView13);
                i1.setImageResource(R.drawable.el);
                }
                 else if(kod.length()==1){
                    kod=kod+"1";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"1";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"1";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"2";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"2";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"2";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"2";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"3";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"3";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"3";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"3";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"4";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"4";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"4";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"4";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"5";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"5";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"5";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"5";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"6";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"6";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"6";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"6";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"7";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"7";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"7";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"7";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"8";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"8";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"8";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"8";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"9";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"9";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"9";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"9";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"0";
                    i1=findViewById(R.id.imageView13);
                    i1.setImageResource(R.drawable.el);
                }
                else if (kod.length()==1){
                    kod=kod+"0";
                    i2=findViewById(R.id.imageView6);
                    i2.setImageResource(R.drawable.el);
                }
                else if (kod.length()==2){
                    kod=kod+"0";
                    i3=findViewById(R.id.imageView7);
                    i3.setImageResource(R.drawable.el);
                }
                else if (kod.length()==3){
                    kod=kod+"0";
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.el);
                }
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                }
                else if (kod.length()==1){
                    kod="";
                    i2=findViewById(R.id.imageView13);
                    i2.setImageResource(R.drawable.ellipse);
                }
                else if (kod.length()==2){
                    kod=kod.substring(0, kod.length()-1);
                    i3=findViewById(R.id.imageView6);
                    i3.setImageResource(R.drawable.ellipse);
                }
                else if (kod.length()==3){
                    kod=kod.substring(0, kod.length()-1);
                    i4=findViewById(R.id.imageView7);
                    i4.setImageResource(R.drawable.ellipse);
                }
                else if (kod.length()==4){
                    kod=kod.substring(0, kod.length()-1);
                    i4=findViewById(R.id.imageView8);
                    i4.setImageResource(R.drawable.ellipse);
                }
                Toast.makeText(MainActivity6.this, kod, Toast.LENGTH_SHORT).show();
            }
        });




    }
}