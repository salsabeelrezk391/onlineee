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

public class HardDiskAdapter extends RecyclerView.Adapter<HardDiskAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    ArrayList<Products> data;

    public HardDiskAdapter(HarddiskActivity harddiskActivity, ArrayList<Products> data) {
        this.layoutInflater = layoutInflater;
        this.data = data;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.from(parent.getContext()).inflate(R.layout.custom_product_view,null,
                false);
        ViewHolder viewHolder=new ViewHolder(view);

        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Products p=data.get(position);
        holder.product_image.setImageResource(p.getProduct_img());
        holder.product_price.setText(p.getProduct_price());
        holder.product_name.setText(p.getProduct_name());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView product_name,product_price;
        ImageView product_image;
        Button add;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            product_name=itemView.findViewById(R.id.product_name);
            product_price=itemView.findViewById(R.id.product_price);
            product_image=itemView.findViewById(R.id.product_image);
            add=itemView.findViewById(R.id.add_btn);
        }
    }
}
