package com.example.and103_thanghtph31577_assignment.retrofit;

import com.google.gson.JsonObject;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitProduct {
    @GET("products/")
    Call<JsonObject> getAllProduct();

    @GET("products/{id}")
    Call<JsonObject> getProduct(@Path("id") String id);

    @DELETE("products/del/{id}")
    Call<Void> deleteProduct(@Path("id") String carId);

    @PUT("car/edit/{id}")
    Call<Void> updateProduct(@Path("id") String carId, @Body RequestBody requestBody);

    @POST("products/add")
    Call<Void> postProduct(@Body RequestBody requestBody);

}



