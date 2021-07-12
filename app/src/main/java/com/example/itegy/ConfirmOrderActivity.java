package com.example.itegy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.itegy.Fragments.CartFragment;

public class ConfirmOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        CartFragment fragment = new CartFragment();
        FragmentManager manager= getSupportFragmentManager();
        manager.beginTransaction().add(R.id.conflayout,fragment).commit();


        Button placed = findViewById(R.id.placed_order);
        placed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(ConfirmOrderActivity.this, order_placed.class);
                startActivity(intent);
           }


        });
    }

}