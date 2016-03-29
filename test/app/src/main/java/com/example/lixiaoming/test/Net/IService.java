package com.example.lixiaoming.test.Net;

import com.example.lixiaoming.test.module.Response;
import com.example.lixiaoming.test.module.ResponseList;
import com.example.lixiaoming.test.module.User;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by lixiaoming on 16/3/29.
 */
public interface IService {
    @POST("login")
    Call<Response> loadUsers(@Body User user);

    @GET("detaileventlist")
    Call<ResponseList> getList(
            @Query("city") String city,
            @Query("v") String v);

}
