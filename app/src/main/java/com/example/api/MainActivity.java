package com.example.api;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
 ApiInterface apiInterface;
 RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyID);

        apiInterface =RetrofitInstance.getRetrofit().create(ApiInterface.class);//Initialize
        apiInterface.getposts().enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response)
            {
                if(response.body().size() >0 )
                {
                    List<PostPojo> postPojos = response.body();
             //       Adaptor adaptor = new Adaptor(MainActivity.this,postPojos);
                    Adopt adaptor = new Adopt(MainActivity.this,postPojos);

                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                     recyclerView.setLayoutManager(linearLayoutManager);
                     recyclerView.setAdapter(adaptor);
                    Toast.makeText(MainActivity.this, "Not Empty", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<List<PostPojo>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });   
    }
}
