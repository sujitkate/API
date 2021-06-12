package com.example.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance
{
    private static Retrofit retrofit;
    //private static final String BASEURL="https://jsonplaceholder.typicode.com/";
    private static final String BASEURL1="https://restcountries.eu/";

    public static Retrofit getRetrofit() {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASEURL1)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
