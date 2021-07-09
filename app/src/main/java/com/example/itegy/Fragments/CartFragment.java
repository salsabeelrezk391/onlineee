package com.example.itegy.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.itegy.ConfirmOrderActivity;
import com.example.itegy.HomeActivity;
import com.example.itegy.MainActivity;
import com.example.itegy.OfferActivity;
import com.example.itegy.R;

import static com.example.itegy.R.id.confirm_button;

public abstract class CartFragment extends Fragment implements View.OnClickListener {

    View view;
    Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_cart, container, false);



        Button confirm_button = (Button)root.findViewById(R.id.conf_button);
        confirm_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        intent = new Intent(getActivity(), ConfirmOrderActivity.class);
        startActivity(intent);
    }
});
        return root;
    }}