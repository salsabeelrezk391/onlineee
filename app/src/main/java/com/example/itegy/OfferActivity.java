package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OfferActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    OffersAdapter adapter;
    EditText searchview;
    CharSequence Search="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
        ImageView leftIcon=findViewById(R.id.left_icon);
        recyclerView=findViewById(R.id.products_recyclerview);

        searchview= findViewById(R.id.search);

        ArrayList<Products> items=new ArrayList<>();
        items.add(new Products(R.drawable.printer2,"Printer1","4050 EPG"));
        items.add(new Products(R.drawable.server,"Server1","900 EPG"));
        items.add(new Products(R.drawable.laptop1,"Laptop1","4566 EPG"));
        items.add(new Products(R.drawable.printer5,"Printer4","900 EPG"));
        items.add(new Products(R.drawable.cd,"CD","50 EPG"));
        items.add(new Products(R.drawable.server2,"Server2","3562 EPG"));
        items.add(new Products(R.drawable.laptop3,"Laptop1","8529 EPG"));
        items.add(new Products(R.drawable.laptop4,"Laptop2","9000 EPG"));
        items.add(new Products(R.drawable.laptop5,"Laptop3","5666 EPG"));
        items.add(new Products(R.drawable.printer7,"printer7","1300 EPG"));
        items.add(new Products(R.drawable.server5,"server3","2056 EPG"));
        items.add(new Products(R.drawable.serverssss,"server4","3659 EPG"));
        adapter=new OffersAdapter(this, items);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // by click on arrow
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(OfferActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();

            }
        });
searchview.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
adapter.getFilter().filter(s);
Search= s;

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
});
    }
}