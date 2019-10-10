package com.codingblocks.hydroponics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class table_recycler extends RecyclerView.Adapter<table_recycler.viewHolder> {
    private List<table_pojo> list;
    Context context;

    public table_recycler(List<table_pojo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public  table_recycler (List<table_pojo> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public table_recycler.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_table_row,viewGroup,false);
        context = viewGroup.getContext() ;

        return new table_recycler.viewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull table_recycler.viewHolder holder, int position) {
        String plants=list.get(position).getPlants();
        String ph=list.get(position).getPh();
        String ec=list.get(position).getEc();
        String ppm=list.get(position).getPpm();


        holder.setData(plants,ph,ec,ppm);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        public TextView plants1,ph1,ec1,ppm1;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            plants1 = itemView.findViewById(R.id.plants);
            ph1 = itemView.findViewById(R.id.ph);
            ec1=itemView.findViewById(R.id.ec);
            ppm1=itemView.findViewById(R.id.ppm);



        }


        public void setData(String mplants, String mph, String mec, String mppm) {
            plants1.setText(mplants);
            ph1.setText(mph);
            ec1.setText(mec);
            ppm1.setText(mppm);


        }
    }
}
