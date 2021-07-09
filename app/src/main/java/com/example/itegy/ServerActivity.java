package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ServerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ServersAdapter serversAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        ImageView leftIcon=findViewById(R.id.left_icon);
        recyclerView=findViewById(R.id.products_recyclerview);
        ArrayList<Products> items=new ArrayList<>();
        items.add(new Products(R.drawable.server,"Server1","900 EPG"));
        items.add(new Products(R.drawable.server2,"Server2","3562 EPG"));
        items.add(new Products(R.drawable.server5,"server3","2056 EPG"));
        items.add(new Products(R.drawable.serverssss,"server4","3659 EPG"));
        items.add(new Products(R.drawable.server1,"server5","3659 EPG"));
        serversAdapter=new ServersAdapter(this, items);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(serversAdapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ServerActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}