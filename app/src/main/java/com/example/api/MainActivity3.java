package com.example.api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity3 extends AppCompatActivity {
ApiInterface apiInterface;
RecyclerView recyclerView2;
public static final String TAG2="Response";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        apiInterface=RetrofitInstance.getRetrofit().create(ApiInterface.class);
         recyclerView2=findViewById(R.id.recyID3);

        apiInterface.getCountry().enqueue(new Callback<List<Pojo3>>() {
            @Override
            public void onResponse(Call<List<Pojo3>> call, Response<List<Pojo3>> response) {
                if (response.body().size() > 0)
                {
                    List<Pojo3> pojo3s = response.body();
                    //List<Translations> pojo4s = response.body();

                    Adaptor3 adaptor = new Adaptor3(pojo3s,MainActivity3.this);

                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity3.this);
                    recyclerView2.setLayoutManager(linearLayoutManager);
                    recyclerView2.setAdapter(adaptor);

                    Toast.makeText(MainActivity3.this, "" + response.body().toString(), Toast.LENGTH_LONG).show();
                  Log.e(TAG2, "Response2" + response.body().toString());
            }
            }

            @Override
            public void onFailure(Call<List<Pojo3>> call, Throwable t) {

            }
        });


    }
}