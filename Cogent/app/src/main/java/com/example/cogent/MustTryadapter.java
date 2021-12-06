package com.example.cogent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MustTryadapter extends RecyclerView.Adapter<MustTryadapter.viewholder> {
    ArrayList<SpecialModel> list;
    Context context;

    public MustTryadapter(ArrayList<SpecialModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_must_try,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        SpecialModel specialModel = list.get(position);
        holder.image.setImageResource(specialModel.getGame_icon());
        holder.game_name.setText(specialModel.getMatchdetails());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView game_name;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.game_image);
            game_name = itemView.findViewById(R.id.game_mame);
        }
    }
}
