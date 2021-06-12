package com.example.api.room.InternshipTask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api.R;
import com.example.api.Utils;
import com.example.api.room.Entity_class2;

import java.util.List;

public class Adaptor4 extends RecyclerView.Adapter<Adaptor4.hold2> {

    List<Entity_class2> list2;
    Context context;

    public Adaptor4(List<Entity_class2> list2, Context context) {
        this.list2 = list2;
        this.context = context;
    }

    @NonNull
    @Override
    public hold2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(context).inflate(R.layout.singlerow3,parent,true);
    return new hold2(v);
    }

    @Override
    public void onBindViewHolder(@NonNull hold2 holder, int position)
    {
        Entity_class2 entity_class2 = list2.get(position);

        holder.name.setText("Country Name: "+list2.get(position).getName());
        holder.capital.setText("Capital: "+list2.get(position).getCapital());
        holder.region.setText("Region: "+list2.get(position).getRegion());
        holder.subregion.setText("Sub-Region: "+list2.get(position).getSubregion());
        holder.population.setText("Population: "+list2.get(position).getPopulation());
        holder.area.setText("Area: "+list2.get(position).getArea());
        holder.numericcode.setText("Numeric Code: "+list2.get(position).getNumericCode());
//
        Utils.fetchSvg(context,list2.get(position).getFlag(),holder.img);
}

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public class hold2 extends RecyclerView.ViewHolder{
        TextView name,alph1,alph2,capital,region,subregion,population,area,gini,nativaname,numericcode,cios;
        TextView lan1,lan2,lan3,lan4,lan5,lan6,lan7,lan8,lan9,lan10;
        EditText flag1;
        ImageView img;
        public hold2(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.countrynameID);
            img =itemView.findViewById(R.id.flagIDimg);
            alph2=itemView.findViewById(R.id.alpha2ID);
            capital=itemView.findViewById(R.id.capitalID);
            region=itemView.findViewById(R.id.regionID);
            subregion=itemView.findViewById(R.id.subregionID);
            population=itemView.findViewById(R.id.demonyID);
            area=itemView.findViewById(R.id.areaID);
            nativaname=itemView.findViewById(R.id.nativenameID);
            numericcode=itemView.findViewById(R.id.numericID);

        }
    }
}
