package com.codingblocks.hydroponics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class popuprecycler extends RecyclerView.Adapter<popuprecycler.viewHolder> {
 private List<nutrient_frag_pojo> list;
 Context context;

    public popuprecycler(List<nutrient_frag_pojo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public popuprecycler(List<nutrient_frag_pojo> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public popuprecycler.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.popuprecycler,viewGroup,false);
        context = viewGroup.getContext() ;

        return new viewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull popuprecycler.viewHolder holder, int position) {
        String compound=list.get(position).getCompound1();
        String weight=list.get(position).getWeight1();

       holder.setData(compound,weight);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
       public TextView compound, weight, cost;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            compound = itemView.findViewById(R.id.compound);
            weight = itemView.findViewById(R.id.weight);


        }


        public  void setData(String mcompound, String mweight) {
            compound.setText(mcompound);
            weight.setText(mweight);


        }
    }
}
