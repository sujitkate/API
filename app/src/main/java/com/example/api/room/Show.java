package com.example.api.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import com.example.api.R;

import java.util.List;

public class Show extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);



   recyclerView=findViewById(R.id.recyclerID);
            recyclerView.setHasFixedSize(true);
             recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Toast.makeText(this, "getData1", Toast.LENGTH_SHORT).show();
        getData();

    }

    private void getData()
    {
        //Async : UI get frozen due to long time running of threads while
        //performing Database operation, upload image to internet etc
        //So we use AsyncTask
        /*
        class GetData extends AsyncTask<Void,Void, List<Entity_class>>
        {
            @Override
            protected List<Entity_class> doInBackground(Void... voids) {
                List<Entity_class> mydatalist =RoomDatabaseActivity
                        .mydatabase.todoDao()
                        .getAllTodos();//
                return mydatalist;
            }

            @Override
            protected void onPostExecute(List<Entity_class> entity_classes) {
                Adaptor_room adaptor_room = new Adaptor_room(Show.this,entity_classes);
                recyclerView.setAdapter(adaptor_room);
                super.onPostExecute(entity_classes);
            }
        }
        GetData gd = new GetData();
        gd.execute();
         */
    }

}
