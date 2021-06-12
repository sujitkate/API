package com.example.api.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.api.ApiInterface;
import com.example.api.Pojo3;
import com.example.api.R;
import com.example.api.RetrofitInstance;
import com.example.api.room.InternshipTask.Show_Data;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import androidx.room.Room;
import androidx.room.RoomDatabase;


public class Internship_Api extends AppCompatActivity {
public static Roomdatabase_class2 mydatabase2;

ApiInterface apiInterface;
public static final String TAG="run";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship__api);
        apiInterface= RetrofitInstance.getRetrofit().create(ApiInterface.class);
        mydatabase2= Room.databaseBuilder(getApplicationContext(),
                Roomdatabase_class2.class,"DBName2")
                .allowMainThreadQueries().build();
    }

    public void IntershipRecyclerClass(View view)
    {
//        startActivity(new Intent(getApplicationContext(), Show_Data.class));
    }

    public void ADDDATA(View view)
    {
        apiInterface.getCountry2().enqueue(new Callback<List<Entity_class2>>() {
            @Override
            public void onResponse(Call<List<Entity_class2>> call, Response<List<Entity_class2>> response)
            {
              if(response.body().size() > 0)
              {
                  List<Entity_class2> list = response.body();
                //  Entity_class2 list2 =new Entity_class2();
                //  list2.setName(response.headers())
                  String a;;// = null;
                  for(int i=0;i<response.body().size();i++)
                  {
                       Entity_class2 entity_class2 = new Entity_class2();
                       entity_class2.setName(list.get(i).getName());
                      entity_class2.setCapital(list.get(i).getCapital());
                      entity_class2.setRegion(list.get(i).getRegion());
                      entity_class2.setSubregion(list.get(i).getSubregion());
                      entity_class2.setPopulation(list.get(i).getPopulation());
                      entity_class2.setArea(list.get(i).getArea());
                      entity_class2.setNumericCode(list.get(i).getNumericCode());

                      mydatabase2.todoDao2().insert2(entity_class2);
                      Toast.makeText(Internship_Api.this, "Data Added", Toast.LENGTH_SHORT).show();

                      Toast.makeText(Internship_Api.this, "Res10"+entity_class2.toString(),
                              Toast.LENGTH_SHORT).show();
                      Log.e(TAG,"run"+list.get(i).getName());
                      Log.e(TAG,"run"+list.get(i).getCapital());

                      Log.e(TAG,"run"+list.get(i).getRegion());

                      Log.e(TAG,"run"+list.get(i).getSubregion());
                      Log.e(TAG,"run"+list.get(i).getPopulation());
                      Log.e(TAG,"run"+list.get(i).getArea());
                      Log.e(TAG,"run"+list.get(i).getNumericCode());
      }
    }

              }

            @Override
            public void onFailure(Call<List<Entity_class2>> call, Throwable t)
            {
                Toast.makeText(Internship_Api.this, "No-Response"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
           }
        });

    }
}