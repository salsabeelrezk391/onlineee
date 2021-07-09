package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HarddiskActivity extends AppCompatActivity {
RecyclerView recyclerView;
HardDiskAdapter hardDiskAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harddisk);
        ImageView leftIcon = findViewById(R.id.left_icon);
        recyclerView = findViewById(R.id.products_recyclerview);
        ArrayList<Products> items = new ArrayList<>();
        items.add(new Products(R.drawable.hard1, "Hard Disk1", "1000 EPG"));
        items.add(new Products(R.drawable.hard2, "Hard Disk2", "1050 EPG"));
        items.add(new Products(R.drawable.hard3, "Hard Disk3", "900 EPG"));
        items.add(new Products(R.drawable.hard4, "Hard Disk4", "1100 EPG"));
        items.add(new Products(R.drawable.hard5, "Hard Disk5", "1500 EPG"));
        items.add(new Products(R.drawable.hard6, "Hard Disk6", "1200 EPG"));
        hardDiskAdapter = new HardDiskAdapter( this,items);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(hardDiskAdapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(HarddiskActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();


            }
        });
    }
}