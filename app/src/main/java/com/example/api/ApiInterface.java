package com.example.api;

import com.example.api.room.Entity_class2;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("posts")
    Call<List<PostPojo>> getposts();

    @GET("photos")
    Call<List<Pojo2>> photosTODO();

    @GET("/todos")
    Call<List<PostPojo>> gettodos();

@GET("/todos/{id}")
    Call<PostPojo> getTodo(@Path("id") int id);

@GET("/todos")
Call<List<PostPojo>> query(@Query("userId") int userId,@Query("completed") boolean completed);


@POST("/todos")
    Call<PostPojo> postTodo(@Body PostPojo todo);

@GET("https://restcountries.eu/rest/v2/region/asia")
    Call<List<Pojo3>> getCountry();

    @GET("https://restcountries.eu/rest/v2/region/asia")
    Call<List<Entity_class2>> getCountry2();


    @GET("https://restcountries.eu/rest/v2/region/asia")
    Call<List<Pojo3>> queryy(@Query("select da from translations") String alltranslations);


}
