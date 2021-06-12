package com.example.api;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class API2 extends AppCompatActivity {
    RecyclerView recyclerView;
//    List<Pojo2> pojo2s;
private static final String TAG="Tag";

    ApiInterface apiInterface;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_p_i2);

        recyclerView=findViewById(R.id.recyID2);
        //Toast.makeText(this, "out", Toast.LENGTH_SHORT).show();
        apiInterface=RetrofitInstance.getRetrofit().create(ApiInterface.class);

/*
        apiInterface.getposts().enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response) {
                if(response.body().size() >0)
                {
                    //    Toast.makeText(MainActivity2.this, "S", Toast.LENGTH_SHORT).show();
                    List<PostPojo> postPojos = response.body();
                    Toast.makeText(API2.this," "+response.body() , Toast.LENGTH_SHORT).show();
                    Log.e(TAG,"OnResponse"+response.body());
                }
            }

            @Override
            public void onFailure(Call<List<PostPojo>> call, Throwable t) {
                Toast.makeText(API2.this, "fail"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

 */

         Call<List<Pojo2>> qury = apiInterface.photosTODO();
        qury.enqueue(new Callback<List<Pojo2>>() {
            @Override
            public void onResponse(Call<List<Pojo2>> call, Response<List<Pojo2>> response) {
                Toast.makeText(API2.this, "call"+response.body(), Toast.LENGTH_SHORT).show();
                Log.e(TAG,"onRes1"+response.body());

                List<Pojo2> postPojos = response.body();
                //Adopt adaptor = new Adopt(API2.this,postPojos);
                Adaptor adaptor = new Adaptor(API2.this,postPojos);

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(API2.this);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(adaptor);
                Toast.makeText(API2.this, "Not Empty", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<List<Pojo2>> call, Throwable t) {
                Toast.makeText(API2.this, "call"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });



    }
}
