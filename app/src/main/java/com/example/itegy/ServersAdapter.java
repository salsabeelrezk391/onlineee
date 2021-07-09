package com.example.itegy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ServersAdapter extends RecyclerView.Adapter<ServersAdapter.ServerViewHolder>{
    private LayoutInflater layoutInflater;
    ArrayList<Products> data;

            public ServersAdapter(ServerActivity serverActivity, ArrayList<Products> data) {
        this.layoutInflater = layoutInflater;
        this.data = data;
    }
    @NonNull
    @Override
    public ServerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.from(parent.getContext()).inflate(R.layout.custom_product_view,null,
                false);
       ServerViewHolder viewHolder=new ServerViewHolder(view);

        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ServerViewHolder holder, int position) {
        Products p=data.get(position);
        holder.product_image.setImageResource(p.getProduct_img());
        holder.product_price.setText(p.getProduct_price());
        holder.product_name.setText(p.getProduct_name());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ServerViewHolder extends RecyclerView.ViewHolder {
        TextView product_name,product_price;
        ImageView product_image;
        Button add;

        public ServerViewHolder(@NonNull View itemView) {
            super(itemView);
            product_name=itemView.findViewById(R.id.product_name);
            product_price=itemView.findViewById(R.id.product_price);
            product_image=itemView.findViewById(R.id.product_image);
            add=itemView.findViewById(R.id.add_btn);
        }
    }
}
