package com.example.api.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api.R;

import java.util.List;
/*
public class Adaptor_room  extends RecyclerView.Adapter<Adaptor_room.hold> {
    Context context;
    List<Entity_class> list;

    public Adaptor_room(Context context, List<Entity_class> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public hold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.singlerow_room,parent,false);
        return new hold(v);
    }

    @Override
    public void onBindViewHolder(@NonNull hold holder, int position) {

        Entity_class listObject = list.get(position);

   holder.uid.setText("UID: "+listObject.getUid());
     holder.prn.setText("PRN: "+listObject.getPrn());
        holder.name.setText("Name: "+listObject.getName());
        holder.dept.setText("Dept: "+listObject.getDept());
    }

   @Override
    public int getItemCount()
    {
        return list.size();
    }


    public class hold extends RecyclerView.ViewHolder
    {
       TextView uid,prn,name,dept;
        public hold(@NonNull View itemView)
        {
            super(itemView);
            uid=itemView.findViewById(R.id.uidID);
            prn=itemView.findViewById(R.id.prnID);
            name=itemView.findViewById(R.id.NameID);
            dept=itemView.findViewById(R.id.deptID);
        }
    }
}


 */