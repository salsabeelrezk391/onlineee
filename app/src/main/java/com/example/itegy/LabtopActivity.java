package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LabtopActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LaptopsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labtop);
        ImageView leftIcon = findViewById(R.id.left_icon);
        recyclerView = findViewById(R.id.products_recyclerview);
        ArrayList<Products> items = new ArrayList<>();
        items.add(new Products(R.drawable.laptop2, "Laptop1", "4050 EPG"));
        items.add(new Products(R.drawable.laptop1, "Laptop2", "4566 EPG"));
        items.add(new Products(R.drawable.laptop6, "Laptop3", "9000 EPG"));
        items.add(new Products(R.drawable.laptop3, "Laptop4", "8529 EPG"));
        items.add(new Products(R.drawable.laptop4, "Laptop5", "9000 EPG"));
        items.add(new Products(R.drawable.laptop5, "Laptop6", "5666 EPG"));
        adapter = new LaptopsAdapter( this,items);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent =new Intent(LabtopActivity.this,HomeActivity.class);
                    startActivity(intent);
                    finish();




            }
        });
    }
}