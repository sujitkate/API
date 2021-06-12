package com.example.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Adaptor3 extends RecyclerView.Adapter<Adaptor3.hold> {
    List<Pojo3> list3;
    List<Translations> list4;

    Context context;

    public Adaptor3(List<Pojo3> list3, Context context) {
        this.list3 = list3;
//        this.list4 = list4;
        this.context = context;
    }

    @NonNull
    @Override
    public hold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.singlerow3,parent,false);
       return new hold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull hold holder, int position) {
         holder.name.setText("Country Name: "+list3.get(position).getName());
        holder.capital.setText("Capital: "+list3.get(position).getCapital());
        holder.region.setText("Region: "+list3.get(position).getRegion());
        holder.subregion.setText("Sub-Region: "+list3.get(position).getSubregion());
        holder.population.setText("Population: "+list3.get(position).getPopulation());
        holder.area.setText("Area: "+list3.get(position).getArea());
        holder.numericcode.setText("Numeric Code: "+list3.get(position).getNumericCode());

        Utils.fetchSvg(context,list3.get(position).getFlag(),holder.img);
    }

    @Override
    public int getItemCount() {
        return list3.size();
    }


    public class hold extends RecyclerView.ViewHolder{
TextView name,alph1,alph2,capital,region,subregion,population,area,gini,nativaname,numericcode,cios;
TextView lan1,lan2,lan3,lan4,lan5,lan6,lan7,lan8,lan9,lan10;
EditText flag1;
  ImageView img;
        public hold(@NonNull View itemView) {
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
