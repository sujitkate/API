package com.example.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adaptor2 extends RecyclerView.Adapter<Adaptor2.viewHolder>
{
    Context context;
    List<PostPojo> list;

    public Adaptor2(Context context, List<PostPojo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View vi = LayoutInflater.from(context).inflate(R.layout.singlerow2,parent,false);
       return new viewHolder(vi);


    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

         holder.id.setText((int) list.get(position).getId());
         holder.album.setText((list.get(position).getTitle()));
         //holder.title.setText(list.get(position).getTitle());
     //   Picasso.get().load(list.get(position).getUrl1()).fit().centerCrop().into(holder.img1);
       // Picasso.get().load(list.get(position).getUrl2()).fit().centerCrop().into(holder.img2);



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView album,title,id;
        ImageView img1,img2;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

    //        album=itemView.findViewById(R.id.albumID);
  //          title=itemView.findViewById(R.id.TitleID);
//            id=itemView.findViewById(R.id.id);

            img1=itemView.findViewById(R.id.img1ID);
            img2=itemView.findViewById(R.id.img2ID);
        }
    }
}
