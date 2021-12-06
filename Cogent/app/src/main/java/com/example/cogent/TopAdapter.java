package com.example.cogent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.viewholder> {
    int[] images;
    Context context;

    public TopAdapter(int[] images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_top,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        int image = images[position];
        holder.imageView.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.top_images);
        }
    }
}
