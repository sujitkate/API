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

import java.util.List;

public class Adaptor extends RecyclerView.Adapter<Adaptor.viewholder>
{
    Context context;
    List<Pojo2> datalist;

    public Adaptor(Context context, List<Pojo2> datalist)
    {
        this.context = context;
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singlerow2,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.t1.setText("ID:"+datalist.get(position).getId());
        holder.t2.setText("AlbumID:"+datalist.get(position).getAlbumId());
        holder.t3.setText("Title:"+datalist.get(position).getTitle());

        Picasso.get().load(datalist.get(position).getUrl()).fit().centerCrop().into(holder.img1);
            Picasso.get().load(datalist.get(position).getThumbnailUrl()).fit().centerCrop().into(holder.img2);
    }


    @Override
    public int getItemCount() {
       return datalist.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;

        TextView album,title,id;
        ImageView img1,img2;
        EditText editText;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.textView);
            t2=itemView.findViewById(R.id.textView2);
            t3=itemView.findViewById(R.id.textView3);

            //editText=itemView.findViewById(R.id.editID);
            img1=itemView.findViewById(R.id.img1ID);
            img2=itemView.findViewById(R.id.img2ID);

        }
    }
}
