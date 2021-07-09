package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CdActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CdAdapter cdAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cd);
        ImageView leftIcon=findViewById(R.id.left_icon);
        recyclerView=findViewById(R.id.products_recyclerview);
        ArrayList<Products> items=new ArrayList<>();
        items.add(new Products(R.drawable.cd1,"CD1","100 EPG"));
        items.add(new Products(R.drawable.cd2,"CD2","70 EPG"));
        items.add(new Products(R.drawable.cd3,"CD3","200 EPG"));
        items.add(new Products(R.drawable.cd4,"CD4","150 EPG"));
        items.add(new Products(R.drawable.cd5,"CD5","300 EPG"));
        items.add(new Products(R.drawable.cd6,"CD6","250 EPG"));
        items.add(new Products(R.drawable.cd7,"CD7","500 EPG"));
        cdAdapter=new CdAdapter(this, items);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(cdAdapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(CdActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}