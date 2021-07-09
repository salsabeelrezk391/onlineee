package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DesktopActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    DesktopAdapter desktopAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desktop);
        ImageView leftIcon = findViewById(R.id.left_icon);
        recyclerView = findViewById(R.id.products_recyclerview);
        ArrayList<Products> items = new ArrayList<>();
        items.add(new Products(R.drawable.desktop1, "Desktop1", "3000 EPG"));
        items.add(new Products(R.drawable.desktop2, "Desktop2", "4566 EPG"));
        items.add(new Products(R.drawable.desktop3, "Desktop3", "1896 EPG"));
        items.add(new Products(R.drawable.desktop4, "Desktop4", "4265 EPG"));
        items.add(new Products(R.drawable.desktop5, "Desktop5", "2563 EPG"));
        items.add(new Products(R.drawable.desktop, "Desktop6", "2000 EPG"));
        desktopAdapter = new DesktopAdapter( this,items);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(desktopAdapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(DesktopActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}