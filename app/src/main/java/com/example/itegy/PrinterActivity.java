package com.example.itegy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class PrinterActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PrinterAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printer);
        ImageView leftIcon=findViewById(R.id.left_icon);
        recyclerView=findViewById(R.id.products_recyclerview);
        ArrayList<Products> items=new ArrayList<>();
        items.add(new Products(R.drawable.printer,"Printer1","4050 EPG"));
        items.add(new Products(R.drawable.printer2,"Printer2","3888 EPG"));
        items.add(new Products(R.drawable.printer5,"Printer3","2596 EPG"));
        items.add(new Products(R.drawable.printer7,"Printer4","4000EPG"));
        items.add(new Products(R.drawable.printer4,"Printer5","5000 EPG"));
        items.add(new Products(R.drawable.printer6,"Printer6","4563 EPG"));
        adapter=new PrinterAdapter(this,items);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(PrinterActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}