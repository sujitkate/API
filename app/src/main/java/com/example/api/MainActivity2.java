package com.example.api;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
//import com.example.api.room.RoomDatabaseActivity;
import com.example.api.room.Internship_Api;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
ImageView imageView;
  ApiInterface apiInterface;
  private static final String TAG="Tag";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        apiInterface=RetrofitInstance.getRetrofit().create(ApiInterface.class);
 imageView=findViewById(R.id.img3ID);

         String url = "https://restcountries.eu/data/afg.svg";

        Utils.fetchSvg(this, url, imageView);
   }

    public void SeeAll(View view)
    {
        apiInterface.getposts().enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response) {
                if(response.body().size() >0)
                {
                //    Toast.makeText(MainActivity2.this, "S", Toast.LENGTH_SHORT).show();
                    List<PostPojo> postPojos = response.body();
                    Toast.makeText(MainActivity2.this," "+response.body() , Toast.LENGTH_SHORT).show();
              Log.e(TAG,"OnResponse"+response.body());
                }
            }

            @Override
            public void onFailure(Call<List<PostPojo>> call, Throwable t) {
                Toast.makeText(MainActivity2.this, "fail"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Route(View view)
    {
        Call<PostPojo> to = apiInterface.getTodo(3);
        to.enqueue(new Callback<PostPojo>() {
            @Override
            public void onResponse(Call<PostPojo> call, Response<PostPojo> response1) {
               // Toast.makeText(MainActivity2.this, "S", Toast.LENGTH_SHORT).show();
               // List<PostPojo> postPojos1 = response1.body();
                Toast.makeText(MainActivity2.this," "+response1.body() , Toast.LENGTH_SHORT).show();
            Log.e(TAG,"OnResponse"+response1.body());
            }

            @Override
            public void onFailure(Call<PostPojo> call, Throwable t) {
                Toast.makeText(MainActivity2.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void MainAct(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    public void Query(View view)
    {
        Call<List<PostPojo>> qury = apiInterface.query(2,false);

        qury.enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(Call<List<PostPojo>> call, Response<List<PostPojo>> response)
            {
                Toast.makeText(MainActivity2.this, " "+response.body(), Toast.LENGTH_SHORT).show();
             Log.e(TAG,"OnResponse"+response.body());
            }

            @Override
            public void onFailure(Call<List<PostPojo>> call, Throwable t) {

            }
        });
    }

    public void Post(View view)
    {
        PostPojo postPojo = new PostPojo(3,"Get me maggi",false);
        Call<PostPojo> postCall = apiInterface.postTodo(postPojo);
        postCall.enqueue(new Callback<PostPojo>() {
            @Override
            public void onResponse(Call<PostPojo> call, Response<PostPojo> response) {
                Toast.makeText(MainActivity2.this, ""+response.body(), Toast.LENGTH_SHORT).show();
                Log.e(TAG,"OnResponse"+response.body());
            }

            @Override
            public void onFailure(Call<PostPojo> call, Throwable t) {
                Log.e(TAG,"OnResponse"+t.getLocalizedMessage());

            }
        });
    }

    public void nextApi(View view)
    {
        startActivity(new Intent(getApplicationContext(),API2.class));
    }

    public void inter(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity3.class));

    }

    public void RoomCall(View view) {
//        startActivity(new Intent(getApplicationContext(), RoomDatabaseActivity.class));
    }

    public void apiCallIntership(View view) {

    }

    public void apiQCallIntership(View view) {
         startActivity(new Intent(getApplicationContext(), Internship_Api.class));

    }
}






////////////////////////////////////////
