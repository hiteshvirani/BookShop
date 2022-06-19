package com.gallery.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class BookbuyActivity extends AppCompatActivity {

    Button b1,b11,b111,b2,b22,b222,b3,b33,b333,b4,b44,b444,b5,b55,b555;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookbuy);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        b1=findViewById(R.id.button1);
        b11=findViewById(R.id.button11);
        b111=findViewById(R.id.button111);
        b2=findViewById(R.id.button2);
        b22=findViewById(R.id.button22);
        b222=findViewById(R.id.button222);
        b3=findViewById(R.id.button3);
        b33=findViewById(R.id.button33);
        b333=findViewById(R.id.button333);
        b4=findViewById(R.id.button4);
        b44=findViewById(R.id.button44);
        b444=findViewById(R.id.button444);
        b5=findViewById(R.id.button5);
        b55=findViewById(R.id.button55);
        b555=findViewById(R.id.button555);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
        b555.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookbuyActivity.this, BuyActivity.class);
                startActivity(i);
            }
        });
    }
}