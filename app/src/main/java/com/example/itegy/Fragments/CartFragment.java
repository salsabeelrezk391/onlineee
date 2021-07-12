package com.example.itegy.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.itegy.ConfirmOrderActivity;
import com.example.itegy.R;


public class CartFragment extends Fragment {
    View view;
    Intent intent;
    Button confirm_button;
    public ElegantNumberButton btn_1;
    public ElegantNumberButton btn_2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_cart, container, false);

        confirm_button = root.findViewById(R.id.conf_button);
        confirm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), ConfirmOrderActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }

}
