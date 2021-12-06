package com.example.cogent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpecialAdpater extends RecyclerView.Adapter<SpecialAdpater.viewholder> {
    ArrayList<SpecialModel> list;
    Context context;

    public SpecialAdpater(ArrayList<SpecialModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public SpecialAdpater.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_special_events,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialAdpater.viewholder holder, int position) {
        SpecialModel specialModel = list.get(position);
        holder.game_icon.setImageResource(specialModel.getGame_icon());
        holder.winningamount.setText(specialModel.getWinningamount());
        holder.entryamount.setText(specialModel.getEntryamount());
        holder.matchdetails.setText(specialModel.getMatchdetails());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView game_icon;
          TextView winningamount,entryamount,matchdetails;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            game_icon = itemView.findViewById(R.id.game_icon);
            winningamount = itemView.findViewById(R.id.winningamount);
            entryamount = itemView.findViewById(R.id.entryfee);
            matchdetails = itemView.findViewById(R.id.matchdetails);

        }
    }
}
