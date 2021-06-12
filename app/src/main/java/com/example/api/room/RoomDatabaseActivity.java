package com.example.api.room;
/*
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.api.R;

import java.util.List;

public class RoomDatabaseActivity extends AppCompatActivity {

    public static Roomdatabase_class mydatabase;

    public static final String TAG ="run";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_database);
        mydatabase= Room.databaseBuilder(getApplicationContext(),
                Roomdatabase_class.class,"DB_NAME")
        .allowMainThreadQueries()
                .build();
    }

    public void insertData(View view)
    {
        startActivity(new Intent(getApplicationContext(),AddData.class));
//        Entity_class single = new Entity_class();
    //    InsertAsyncTask asyncTask =new InsertAsyncTask();
  //      asyncTask.execute(single);
    }

    public void getAllTodos(View view)
    {
      Thread thread =new Thread(new Runnable() {
          @Override
          public void run() {
             List<Entity_class> todoList =Roomdatabase_class.getInstance(getApplicationContext())
              .todoDao()
              .getAllTodos();
              Log.d(TAG,"run"+todoList.toString());
          }
      })  ;
      thread.start();
    }

    public void RecyclerMethod(View view)
    {
        //Toast.makeText(this, "lll", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), Show.class));
    }

    class InsertAsyncTask extends AsyncTask<Entity_class,Void,Void>
    {

        @Override
        protected Void doInBackground(Entity_class... entity_classes)
        {
            Roomdatabase_class.getInstance(getApplicationContext())
                    .todoDao()
                    .insert(entity_classes[0]);
            return null;
        }
    }
}



 */